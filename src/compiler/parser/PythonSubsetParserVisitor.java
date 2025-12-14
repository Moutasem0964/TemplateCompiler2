// Generated from C:/Users/dell/IdeaProjects/TemplateCompiler2/src/compiler/grammar/PythonSubsetParser.g4 by ANTLR 4.13.2

    package compiler.parser;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PythonSubsetParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PythonSubsetParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link PythonSubsetParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(PythonSubsetParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by the {@code simple}
	 * labeled alternative in {@link PythonSubsetParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple(PythonSubsetParser.SimpleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code compound}
	 * labeled alternative in {@link PythonSubsetParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompound(PythonSubsetParser.CompoundContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprStmt}
	 * labeled alternative in {@link PythonSubsetParser#simpleStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprStmt(PythonSubsetParser.ExprStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assign}
	 * labeled alternative in {@link PythonSubsetParser#simpleStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(PythonSubsetParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifRule}
	 * labeled alternative in {@link PythonSubsetParser#compoundStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfRule(PythonSubsetParser.IfRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code forRule}
	 * labeled alternative in {@link PythonSubsetParser#compoundStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForRule(PythonSubsetParser.ForRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonSubsetParser#ifStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStmt(PythonSubsetParser.IfStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonSubsetParser#forStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStmt(PythonSubsetParser.ForStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonSubsetParser#suite}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuite(PythonSubsetParser.SuiteContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonSubsetParser#test}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTest(PythonSubsetParser.TestContext ctx);
	/**
	 * Visit a parse tree produced by the {@code comparison}
	 * labeled alternative in {@link PythonSubsetParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparison(PythonSubsetParser.ComparisonContext ctx);
	/**
	 * Visit a parse tree produced by the {@code atomExpr}
	 * labeled alternative in {@link PythonSubsetParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomExpr(PythonSubsetParser.AtomExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code addSub}
	 * labeled alternative in {@link PythonSubsetParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSub(PythonSubsetParser.AddSubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mulDiv}
	 * labeled alternative in {@link PythonSubsetParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulDiv(PythonSubsetParser.MulDivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code call}
	 * labeled alternative in {@link PythonSubsetParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall(PythonSubsetParser.CallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code number}
	 * labeled alternative in {@link PythonSubsetParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(PythonSubsetParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code trueLit}
	 * labeled alternative in {@link PythonSubsetParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrueLit(PythonSubsetParser.TrueLitContext ctx);
	/**
	 * Visit a parse tree produced by the {@code paren}
	 * labeled alternative in {@link PythonSubsetParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParen(PythonSubsetParser.ParenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code string}
	 * labeled alternative in {@link PythonSubsetParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(PythonSubsetParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code attrAccess}
	 * labeled alternative in {@link PythonSubsetParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttrAccess(PythonSubsetParser.AttrAccessContext ctx);
	/**
	 * Visit a parse tree produced by the {@code subscript}
	 * labeled alternative in {@link PythonSubsetParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubscript(PythonSubsetParser.SubscriptContext ctx);
	/**
	 * Visit a parse tree produced by the {@code falseLit}
	 * labeled alternative in {@link PythonSubsetParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFalseLit(PythonSubsetParser.FalseLitContext ctx);
	/**
	 * Visit a parse tree produced by the {@code name}
	 * labeled alternative in {@link PythonSubsetParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(PythonSubsetParser.NameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code list}
	 * labeled alternative in {@link PythonSubsetParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList(PythonSubsetParser.ListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonSubsetParser#listLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListLiteral(PythonSubsetParser.ListLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonSubsetParser#arglist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArglist(PythonSubsetParser.ArglistContext ctx);
}