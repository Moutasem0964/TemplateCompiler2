package compiler.ast.visitors;

import compiler.ast.core.AstNode;
import compiler.ast.nodes.*;
import compiler.ast.nodes.css.*;
import compiler.ast.nodes.html.*;
import compiler.ast.nodes.jinja.*;
import compiler.ast.nodes.python.*;

public interface AstVisitor<R> {

    // ===== Python Nodes =====
    R visitPythonFile(PythonFileNode node);

    R visitDef(DefNode node);

    R visitIf(IfNode node);

    R visitFor(ForNode node);

    R visitAssign(AssignNode node);

    R visitReturn(ReturnNode node);

    R visitGlobal(GlobalNode node);

    R visitImport(ImportNode node);

    R visitFromImport(FromImportNode node);

    R visitSuite(SuiteNode node);

    R visitDecorator(DecoratorNode node);

    // Python Expressions
    R visitName(NameNode node);

    R visitNumber(NumberNode node);

    R visitString(StringNode node);

    R visitBinOp(BinOpNode node);

    R visitUnaryOp(UnaryOpNode node);

    R visitNot(NotNode node);

    R visitCall(CallNode node);

    R visitAttrAccess(AttrAccessNode node);

    R visitSubscript(SubscriptNode node);

    R visitList(ListNode node);

    R visitDict(DictNode node);

    R visitTuple(TupleNode node);

    R visitListComp(ListCompNode node);

    R visitGeneratorExpr(GeneratorExprNode node);

    R visitKeywordArg(KeywordArgNode node);

    // ===== Template/HTML Nodes =====
    R visitTemplate(TemplateNode node);

    R visitText(TextNode node);

    R visitHtmlElement(HtmlElementNode node);

    // ===== Jinja Nodes =====
    R visitJinjaExpr(JinjaExprNode node);

    R visitJinjaStmt(JinjaStmtNode node);

    // ===== CSS Nodes =====
    R visitCssStylesheet(CssStylesheetNode node);

    R visitCssRule(CssRuleNode node);

    R visitCssDeclaration(CssDeclarationNode node);
}