package compiler.symbol;

import compiler.ast.visitors.AstVisitor;
import compiler.ast.nodes.python.ForNode;
import compiler.ast.core.*;

public class SymbolTableVisitor implements AstVisitor<Void> {

    private Scope currentScope = new Scope(null); // global scope

    public Scope getGlobalScope() {
        return currentScope;
    }

    private void enterScope() {
        currentScope = new Scope(currentScope);
    }

    private void exitScope() {
        currentScope = currentScope.getParent();
    }

    @Override
    public Void visitFor(ForNode node) {
        enterScope();
        currentScope.addSymbol(new Symbol(node.getVarName(), "loop_var"));
        // visit body
        for (AstNode child : node.getChildren()) {
            child.accept(this);
        }
        exitScope();
        return null;
    }

    // Add more as needed (e.g., assign for variables)

    // Default: visit children
    private Void defaultVisit(AstNode node) {
        for (AstNode child : node.getChildren()) {
            child.accept(this);
        }
        return null;
    }

    // Implement all other visit methods with defaultVisit
    @Override public Void visitTemplate(compiler.ast.nodes.TemplateNode node) { return defaultVisit(node); }
    @Override public Void visitText(compiler.ast.nodes.TextNode node) { return null; }
    @Override public Void visitJinjaExpr(compiler.ast.nodes.jinja.JinjaExprNode node) { return defaultVisit(node); }
    @Override public Void visitJinjaStmt(compiler.ast.nodes.jinja.JinjaStmtNode node) { return defaultVisit(node); }
    @Override public Void visitHtmlElement(compiler.ast.nodes.html.HtmlElementNode node) { return defaultVisit(node); }
    @Override public Void visitCssStylesheet(compiler.ast.nodes.css.CssStylesheetNode node) { return defaultVisit(node); }
    @Override public Void visitCssRule(compiler.ast.nodes.css.CssRuleNode node) { return defaultVisit(node); }
    @Override public Void visitCssDeclaration(compiler.ast.nodes.css.CssDeclarationNode node) { return null; }
    @Override public Void visitName(compiler.ast.nodes.python.NameNode node) { return null; }
    @Override public Void visitString(compiler.ast.nodes.python.StringNode node) { return null; }
    @Override public Void visitNumber(compiler.ast.nodes.python.NumberNode node) { return null; }
    @Override public Void visitAttrAccess(compiler.ast.nodes.python.AttrAccessNode node) { return defaultVisit(node); }
    @Override public Void visitCall(compiler.ast.nodes.python.CallNode node) { return defaultVisit(node); }
    @Override public Void visitBinOp(compiler.ast.nodes.python.BinOpNode node) { return defaultVisit(node); }
    @Override public Void visitAssign(compiler.ast.nodes.python.AssignNode node) { return defaultVisit(node); }
    @Override public Void visitIf(compiler.ast.nodes.python.IfNode node) { return defaultVisit(node); }
}