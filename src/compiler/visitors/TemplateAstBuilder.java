package compiler.visitors;

import compiler.ast.core.AstNode;
import compiler.ast.nodes.*;
import compiler.ast.nodes.css.*;
import compiler.ast.nodes.html.HtmlElementNode;
import compiler.ast.nodes.jinja.*;
import compiler.parser.*;
import org.antlr.v4.runtime.Token;

import java.util.ArrayList;
import java.util.List;

public class TemplateAstBuilder extends TemplateParserBaseVisitor<AstNode> {

    private final PythonAstBuilder pythonBuilder;

    public TemplateAstBuilder() {
        this.pythonBuilder = new PythonAstBuilder(1);
    }

    @Override
    public AstNode visitTemplate(TemplateParser.TemplateContext ctx) {
        TemplateNode root = new TemplateNode(ctx.start.getLine());
        List<AstNode> parts = new ArrayList<>();
        for (TemplateParser.PartContext partCtx : ctx.part()) {
            AstNode part = visit(partCtx);
            if (part != null) parts.add(part);
        }
        root.addChildren(parts);
        return root;
    }

    @Override
    public AstNode visitTextPart(TemplateParser.TextPartContext ctx) {
        String text = ctx.TEXT().getText();
        return new TextNode(text, ctx.start.getLine());
    }

    @Override
    public AstNode visitExprPart(TemplateParser.ExprPartContext ctx) {
        return visit(ctx.jinjaExpression());
    }

    @Override
    public AstNode visitStmtPart(TemplateParser.StmtPartContext ctx) {
        return visit(ctx.jinjaStatement());
    }

    @Override
    public AstNode visitHtmlPart(TemplateParser.HtmlPartContext ctx) {
        return visit(ctx.htmlElement());
    }

    @Override
    public AstNode visitJinjaExpr(TemplateParser.JinjaExprContext ctx) {
        String code = ctx.content.getText().trim();
        JinjaExprNode node = new JinjaExprNode(ctx.start.getLine());
        AstNode expr = pythonBuilder.parsePythonCode(code, ctx.start.getLine());
        if (expr != null) node.addChild(expr);
        return node;
    }

    @Override
    public AstNode visitJinjaStmt(TemplateParser.JinjaStmtContext ctx) {
        String code = ctx.content.getText().trim();
        JinjaStmtNode node = new JinjaStmtNode(ctx.start.getLine());
        AstNode stmt = pythonBuilder.parsePythonCode(code, ctx.start.getLine());
        if (stmt != null) node.addChild(stmt);
        return node;
    }

    @Override
    public AstNode visitFullTag(TemplateParser.FullTagContext ctx) {
        String tagName = ctx.name.getText();
        HtmlElementNode element = new HtmlElementNode(tagName, ctx.start.getLine());

        if (ctx.attributes() != null) {
            TemplateParser.AttributesContext attrs = ctx.attributes();
            for (int i = 0; i < attrs.TAG_NAME().size(); i++) {
                String attrName = attrs.TAG_NAME(i).getText();
                String attrValue = attrs.ATTR_VALUE(i).getText();
                attrValue = attrValue.substring(1, attrValue.length() - 1);
                element.addAttribute(attrName, attrValue);
            }
        }

        List<AstNode> content = new ArrayList<>();
        for (TemplateParser.PartContext part : ctx.part()) {
            AstNode child = visit(part);
            if (child != null) content.add(child);
        }
        element.addChildren(content);

        return element;
    }

    @Override
    public AstNode visitSelfClosingTag(TemplateParser.SelfClosingTagContext ctx) {
        String tagName = ctx.name.getText();
        HtmlElementNode element = new HtmlElementNode(tagName, ctx.start.getLine());

        if (ctx.attributes() != null) {
            TemplateParser.AttributesContext attrs = ctx.attributes();
            for (int i = 0; i < attrs.TAG_NAME().size(); i++) {
                String attrName = attrs.TAG_NAME(i).getText();
                String attrValue = attrs.ATTR_VALUE(i).getText();
                attrValue = attrValue.substring(1, attrValue.length() - 1);
                element.addAttribute(attrName, attrValue);
            }
        }

        return element;
    }

    @Override
    public AstNode visitStyleTag(TemplateParser.StyleTagContext ctx) {
        CssStylesheetNode stylesheet = new CssStylesheetNode(ctx.start.getLine());

        TemplateParser.StyleContentContext raw = ctx.cssContent;

        StringBuilder cssContent = new StringBuilder();

        if (raw != null) {
            cssContent.append(raw.getText());
        }

        String css = cssContent.toString().trim();
        if (!css.isEmpty()) {
            parseCssRules(css, ctx.start.getLine(), stylesheet);
        }

        return stylesheet;
    }

    private void parseCssRules(String css, int baseLine, CssStylesheetNode stylesheet) {
        String[] blocks = css.split("}");
        for (String block : blocks) {
            block = block.trim();
            if (block.isEmpty()) continue;

            int openBrace = block.indexOf('{');
            if (openBrace == -1) continue;

            String selector = block.substring(0, openBrace).trim();
            String body = block.substring(openBrace + 1).trim();

            CssRuleNode rule = new CssRuleNode(selector, baseLine);
            stylesheet.addChild(rule);

            for (String decl : body.split(";")) {
                decl = decl.trim();
                if (decl.isEmpty()) continue;
                int colon = decl.indexOf(':');
                if (colon == -1) continue;
                String property = decl.substring(0, colon).trim();
                String value = decl.substring(colon + 1).trim();
                CssDeclarationNode declaration = new CssDeclarationNode(property, value, baseLine);
                rule.addChild(declaration);
            }
        }
    }
}