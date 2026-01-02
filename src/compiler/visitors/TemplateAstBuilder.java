package compiler.visitors;

import compiler.ast.core.AstNode;
import compiler.ast.nodes.*;
import compiler.ast.nodes.html.HtmlElementNode;
import compiler.ast.nodes.jinja.JinjaExprNode;
import compiler.ast.nodes.jinja.JinjaStmtNode;
import compiler.ast.nodes.python.*;
import compiler.parser.TemplateParser.*;
import compiler.parser.TemplateParserBaseVisitor;

public class TemplateAstBuilder extends TemplateParserBaseVisitor<AstNode> {

    @Override
    public AstNode visitTemplate(TemplateContext ctx) {
        int line = ctx.getStart().getLine();
        TemplateNode templateNode = new TemplateNode(line);

        for (ContentContext content : ctx.content()) {
            AstNode contentNode = visit(content);
            if (contentNode != null) {
                templateNode.addChild(contentNode);
            }
        }

        return templateNode;
    }

    // ========== CONTENT ==========

    @Override
    public AstNode visitHtmlContent(HtmlContentContext ctx) {
        return visit(ctx.html_element());
    }

    @Override
    public AstNode visitTextContent(TextContentContext ctx) {
        return visit(ctx.text_content());
    }

    @Override
    public AstNode visitJinjaVariableContent(JinjaVariableContentContext ctx) {
        return visit(ctx.jinja_variable());
    }

    @Override
    public AstNode visitJinjaForContent(JinjaForContentContext ctx) {
        return visit(ctx.jinja_for());
    }

    @Override
    public AstNode visitJinjaIfContent(JinjaIfContentContext ctx) {
        return visit(ctx.jinja_if());
    }

    @Override
    public AstNode visitJinjaCommentContent(JinjaCommentContentContext ctx) {
        // You can skip comments or create a node for them
        int line = ctx.getStart().getLine();
        return new TextNode("<!-- comment -->", line);
    }

    @Override
    public AstNode visitDoctypeContent(DoctypeContentContext ctx) {
        int line = ctx.getStart().getLine();
        return new TextNode("<!DOCTYPE html>", line);
    }

    // ========== HTML ELEMENTS ==========

    @Override
    public AstNode visitNormalElement(NormalElementContext ctx) {
        int line = ctx.getStart().getLine();

        String openTag = ctx.HTML_OPEN().getText();
        String tagName = openTag.substring(1).trim(); // Remove '<'

        HtmlElementNode htmlNode = new HtmlElementNode(tagName, line);

        if (ctx.attribute() != null) {
            for (AttributeContext attr : ctx.attribute()) {
                addAttribute(htmlNode, attr);
            }
        }

        if (ctx.content() != null) {
            for (ContentContext content : ctx.content()) {
                AstNode child = visit(content);
                if (child != null) {
                    htmlNode.addChild(child);
                }
            }
        }

        return htmlNode;
    }

    @Override
    public AstNode visitSelfClosingElement(SelfClosingElementContext ctx) {
        int line = ctx.getStart().getLine();

        String openTag = ctx.HTML_OPEN().getText();
        String tagName = openTag.substring(1).trim(); // Remove '<'

        HtmlElementNode htmlNode = new HtmlElementNode(tagName, line);

        if (ctx.attribute() != null) {
            for (AttributeContext attr : ctx.attribute()) {
                addAttribute(htmlNode, attr);
            }
        }

        return htmlNode;
    }

    private void addAttribute(HtmlElementNode htmlNode, AttributeContext ctx) {
        if (ctx instanceof StaticAttributeContext) {
            StaticAttributeContext staticAttr = (StaticAttributeContext) ctx;
            String name = staticAttr.TAG_NAME().getText();
            String value = staticAttr.TAG_VALUE().getText();
            value = value.substring(1, value.length() - 1);
            htmlNode.addAttribute(name, value);
        } else if (ctx instanceof DynamicAttributeContext) {
            DynamicAttributeContext dynamicAttr = (DynamicAttributeContext) ctx;
            String name = dynamicAttr.TAG_NAME().getText();

            AstNode jinjaExpr = visit(dynamicAttr.jinja_expr());

            htmlNode.addAttribute(name, "{{ dynamic }}");

            if (jinjaExpr != null) {
                htmlNode.addChild(jinjaExpr);
            }
        }
    }

    // ========== TEXT ==========

    @Override
    public AstNode visitText_content(Text_contentContext ctx) {
        int line = ctx.getStart().getLine();
        String text = ctx.HTML_TEXT().getText();
        return new TextNode(text, line);
    }

    // ========== JINJA VARIABLE ==========

    @Override
    public AstNode visitJinja_variable(Jinja_variableContext ctx) {
        int line = ctx.getStart().getLine();
        JinjaExprNode jinjaExpr = new JinjaExprNode(line);

        AstNode expr = visit(ctx.jinja_expr());
        if (expr != null) {
            jinjaExpr.addChild(expr);
        }

        if (ctx.JINJA_NAME() != null) {
            for (int i = 0; i < ctx.JINJA_NAME().size(); i++) {
                String filterName = ctx.JINJA_NAME(i).getText();
                NameNode filterNode = new NameNode(filterName, line);
                jinjaExpr.addChild(filterNode);
            }
        }

        return jinjaExpr;
    }

    // ========== JINJA FOR LOOP ==========

    @Override
    public AstNode visitJinja_for(Jinja_forContext ctx) {
        int line = ctx.getStart().getLine();
        JinjaStmtNode forNode = new JinjaStmtNode(line);

        String varName = ctx.JINJA_NAME().getText();
        NameNode varNode = new NameNode(varName, line);
        forNode.addChild(varNode);

        AstNode iterable = visit(ctx.jinja_expr());
        if (iterable != null) {
            forNode.addChild(iterable);
        }

        if (ctx.content() != null) {
            for (ContentContext content : ctx.content()) {
                AstNode contentNode = visit(content);
                if (contentNode != null) {
                    forNode.addChild(contentNode);
                }
            }
        }

        return forNode;
    }

    // ========== JINJA IF STATEMENT ==========

    @Override
    public AstNode visitJinja_if(Jinja_ifContext ctx) {
        int line = ctx.getStart().getLine();
        JinjaStmtNode ifNode = new JinjaStmtNode(line);

        AstNode condition = visit(ctx.jinja_expr(0));
        if (condition != null) {
            ifNode.addChild(condition);
        }

        int contentIndex = 0;
        int exprIndex = 1;

        int mainIfContentCount = 0;
        for (int i = 0; i < ctx.content().size(); i++) {
            if (ctx.ELIF().isEmpty() && ctx.ELSE() == null) {
                mainIfContentCount = ctx.content().size();
                break;
            }
            if (!ctx.ELIF().isEmpty() && i < ctx.content().size() / (ctx.ELIF().size() + 1)) {
                mainIfContentCount++;
            } else {
                break;
            }
        }

        for (int i = 0; i < mainIfContentCount; i++) {
            AstNode contentNode = visit(ctx.content(contentIndex++));
            if (contentNode != null) {
                ifNode.addChild(contentNode);
            }
        }

        for (int i = 0; i < ctx.ELIF().size(); i++) {
            AstNode elifCondition = visit(ctx.jinja_expr(exprIndex++));
            if (elifCondition != null) {
                ifNode.addChild(elifCondition);
            }

            AstNode elifContent = visit(ctx.content(contentIndex++));
            if (elifContent != null) {
                ifNode.addChild(elifContent);
            }
        }

        if (ctx.ELSE() != null) {
            while (contentIndex < ctx.content().size()) {
                AstNode elseContent = visit(ctx.content(contentIndex++));
                if (elseContent != null) {
                    ifNode.addChild(elseContent);
                }
            }
        }

        return ifNode;
    }

    // ========== JINJA EXPRESSIONS ==========

    @Override
    public AstNode visitJinjaName(JinjaNameContext ctx) {
        int line = ctx.getStart().getLine();
        return new NameNode(ctx.JINJA_NAME().getText(), line);
    }

    @Override
    public AstNode visitJinjaString(JinjaStringContext ctx) {
        int line = ctx.getStart().getLine();
        String text = ctx.JINJA_STRING().getText();
        text = text.substring(1, text.length() - 1);
        return new StringNode(text, line);
    }

    @Override
    public AstNode visitJinjaNumber(JinjaNumberContext ctx) {
        int line = ctx.getStart().getLine();
        return new NumberNode(ctx.JINJA_NUMBER().getText(), line);
    }

    @Override
    public AstNode visitJinjaAttributeAccess(JinjaAttributeAccessContext ctx) {
        int line = ctx.getStart().getLine();
        AttrAccessNode attrNode = new AttrAccessNode(line);

        AstNode obj = visit(ctx.jinja_expr());
        if (obj != null) {
            attrNode.addChild(obj);
        }

        NameNode attr = new NameNode(ctx.JINJA_NAME().getText(), line);
        attrNode.addChild(attr);

        return attrNode;
    }

    @Override
    public AstNode visitJinjaSubscript(JinjaSubscriptContext ctx) {
        int line = ctx.getStart().getLine();
        AstNode subscriptNode = new AstNode("Subscript", line) {
            @Override
            public <R> R accept(compiler.ast.visitors.AstVisitor<R> visitor) {
                return null;
            }
        };

        AstNode obj = visit(ctx.jinja_expr(0));
        if (obj != null) {
            subscriptNode.addChild(obj);
        }

        AstNode index = visit(ctx.jinja_expr(1));
        if (index != null) {
            subscriptNode.addChild(index);
        }

        return subscriptNode;
    }

    @Override
    public AstNode visitJinjaFunctionCall(JinjaFunctionCallContext ctx) {
        int line = ctx.getStart().getLine();
        CallNode callNode = new CallNode(line);

        NameNode funcName = new NameNode(ctx.JINJA_NAME().getText(), line);
        callNode.addChild(funcName);

        if (ctx.jinja_args() != null) {
            for (Jinja_argContext arg : ctx.jinja_args().jinja_arg()) {
                if (arg instanceof JinjaPositionalArgContext) {
                    JinjaPositionalArgContext posArg = (JinjaPositionalArgContext) arg;
                    AstNode argNode = visit(posArg.jinja_expr());
                    if (argNode != null) {
                        callNode.addChild(argNode);
                    }
                } else if (arg instanceof JinjaKeywordArgContext) {
                    JinjaKeywordArgContext kwArg = (JinjaKeywordArgContext) arg;
                    AstNode kwNode = new AstNode("KeywordArg", line) {
                        @Override
                        public <R> R accept(compiler.ast.visitors.AstVisitor<R> visitor) {
                            return null;
                        }
                    };
                    kwNode.addChild(new NameNode(kwArg.JINJA_NAME().getText(), line));
                    AstNode value = visit(kwArg.jinja_expr());
                    if (value != null) {
                        kwNode.addChild(value);
                    }
                    callNode.addChild(kwNode);
                }
            }
        }

        return callNode;
    }

    @Override
    public AstNode visitJinjaParenExpr(JinjaParenExprContext ctx) {
        return visit(ctx.jinja_expr());
    }
}