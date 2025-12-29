package compiler.ast.visitors;

import compiler.ast.core.AstNode;
import compiler.ast.nodes.*;
import compiler.ast.nodes.css.*;
import compiler.ast.nodes.html.*;
import compiler.ast.nodes.jinja.*;
import compiler.ast.nodes.python.*;

public class PrintVisitor implements AstVisitor<Void> {
    private int indent = 0;

    public void printTree(AstNode root) {
        root.accept(this);
    }

    private void print(String text) {
        System.out.println("  ".repeat(indent) + text);
    }

    private void visitChildren(AstNode node) {
        indent++;
        for (AstNode child : node.getChildren()) {
            child.accept(this);
        }
        indent--;
    }

    // ===== Python Nodes =====

    @Override
    public Void visitPythonFile(PythonFileNode node) {
        print("PythonFile (line " + node.getLine() + ")");
        visitChildren(node);
        return null;
    }

    @Override
    public Void visitDef(DefNode node) {
        print("Def " + node.getName() + " params=" + node.getParams() + " (line " + node.getLine() + ")");
        visitChildren(node);
        return null;
    }

    @Override
    public Void visitIf(IfNode node) {
        print("If (line " + node.getLine() + ")");
        visitChildren(node);
        return null;
    }

    @Override
    public Void visitFor(ForNode node) {
        print("For " + node.getVarName() + " (line " + node.getLine() + ")");
        visitChildren(node);
        return null;
    }

    @Override
    public Void visitAssign(AssignNode node) {
        print("Assign (line " + node.getLine() + ")");
        visitChildren(node);
        return null;
    }

    @Override
    public Void visitReturn(ReturnNode node) {
        print("Return (line " + node.getLine() + ")");
        visitChildren(node);
        return null;
    }

    @Override
    public Void visitGlobal(GlobalNode node) {
        print("Global (line " + node.getLine() + ")");
        visitChildren(node);
        return null;
    }

    @Override
    public Void visitImport(ImportNode node) {
        print("Import (line " + node.getLine() + ")");
        visitChildren(node);
        return null;
    }

    @Override
    public Void visitFromImport(FromImportNode node) {
        print("FromImport (line " + node.getLine() + ")");
        visitChildren(node);
        return null;
    }

    @Override
    public Void visitSuite(SuiteNode node) {
        print("Suite (line " + node.getLine() + ")");
        visitChildren(node);
        return null;
    }

    @Override
    public Void visitDecorator(DecoratorNode node) {
        print("Decorator (line " + node.getLine() + ")");
        visitChildren(node);
        return null;
    }

    @Override
    public Void visitName(NameNode node) {
        print("Name \"" + node.getName() + "\" (line " + node.getLine() + ")");
        return null;
    }

    @Override
    public Void visitNumber(NumberNode node) {
        print("Number " + node.getValue() + " (line " + node.getLine() + ")");
        return null;
    }

    @Override
    public Void visitString(StringNode node) {
        print("String \"" + node.getValue() + "\" (line " + node.getLine() + ")");
        return null;
    }

    @Override
    public Void visitBinOp(BinOpNode node) {
        print("BinOp " + node.getOp() + " (line " + node.getLine() + ")");
        visitChildren(node);
        return null;
    }

    @Override
    public Void visitUnaryOp(UnaryOpNode node) {
        print("UnaryOp " + node.getOperator() + " (line " + node.getLine() + ")");
        visitChildren(node);
        return null;
    }

    @Override
    public Void visitNot(NotNode node) {
        print("Not (line " + node.getLine() + ")");
        visitChildren(node);
        return null;
    }

    @Override
    public Void visitCall(CallNode node) {
        print("Call (line " + node.getLine() + ")");
        visitChildren(node);
        return null;
    }

    @Override
    public Void visitAttrAccess(AttrAccessNode node) {
        print("AttrAccess (line " + node.getLine() + ")");
        visitChildren(node);
        return null;
    }

    @Override
    public Void visitSubscript(SubscriptNode node) {
        print("Subscript (line " + node.getLine() + ")");
        visitChildren(node);
        return null;
    }

    @Override
    public Void visitList(ListNode node) {
        print("List (line " + node.getLine() + ")");
        visitChildren(node);
        return null;
    }

    @Override
    public Void visitDict(DictNode node) {
        print("Dict (line " + node.getLine() + ")");
        visitChildren(node);
        return null;
    }

    @Override
    public Void visitTuple(TupleNode node) {
        print("Tuple (line " + node.getLine() + ")");
        visitChildren(node);
        return null;
    }

    @Override
    public Void visitListComp(ListCompNode node) {
        print("ListComp (line " + node.getLine() + ")");
        visitChildren(node);
        return null;
    }

    @Override
    public Void visitGeneratorExpr(GeneratorExprNode node) {
        print("GeneratorExpr (line " + node.getLine() + ")");
        visitChildren(node);
        return null;
    }

    @Override
    public Void visitKeywordArg(KeywordArgNode node) {
        print("KeywordArg (line " + node.getLine() + ")");
        visitChildren(node);
        return null;
    }

    // ===== Template/HTML Nodes =====

    @Override
    public Void visitTemplate(TemplateNode node) {
        print("Template (line " + node.getLine() + ")");
        visitChildren(node);
        return null;
    }

    @Override
    public Void visitText(TextNode node) {
        print("Text (line " + node.getLine() + ") \"" + node.getText() + "\"");
        return null;
    }

    @Override
    public Void visitHtmlElement(HtmlElementNode node) {
        print("HtmlElement <" + node.getTagName() + "> (line " + node.getLine() + ") attrs=" + node.getAttributes());
        visitChildren(node);
        return null;
    }

    // ===== Jinja Nodes =====

    @Override
    public Void visitJinjaExpr(JinjaExprNode node) {
        print("JinjaExpr (line " + node.getLine() + ")");
        visitChildren(node);
        return null;
    }

    @Override
    public Void visitJinjaStmt(JinjaStmtNode node) {
        print("JinjaStmt (line " + node.getLine() + ")");
        visitChildren(node);
        return null;
    }

    // ===== CSS Nodes =====

    @Override
    public Void visitCssStylesheet(CssStylesheetNode node) {
        print("CssStylesheet (line " + node.getLine() + ")");
        visitChildren(node);
        return null;
    }

    @Override
    public Void visitCssRule(CssRuleNode node) {
        print("CssRule selector=\"" + node.getSelector() + "\" (line " + node.getLine() + ")");
        visitChildren(node);
        return null;
    }

    @Override
    public Void visitCssDeclaration(CssDeclarationNode node) {
        print("CssDeclaration " + node.getProperty() + ": " + node.getValue() + " (line " + node.getLine() + ")");
        return null;
    }
}