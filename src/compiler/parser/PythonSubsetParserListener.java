// Generated from C:/Users/dell/IdeaProjects/TemplateCompiler2/src/compiler/grammar/PythonSubsetParser.g4 by ANTLR 4.13.2

    package compiler.parser;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PythonSubsetParser}.
 */
public interface PythonSubsetParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PythonSubsetParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(PythonSubsetParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonSubsetParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(PythonSubsetParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by the {@code simple}
	 * labeled alternative in {@link PythonSubsetParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterSimple(PythonSubsetParser.SimpleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code simple}
	 * labeled alternative in {@link PythonSubsetParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitSimple(PythonSubsetParser.SimpleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code compound}
	 * labeled alternative in {@link PythonSubsetParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterCompound(PythonSubsetParser.CompoundContext ctx);
	/**
	 * Exit a parse tree produced by the {@code compound}
	 * labeled alternative in {@link PythonSubsetParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitCompound(PythonSubsetParser.CompoundContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprStmt}
	 * labeled alternative in {@link PythonSubsetParser#simpleStmt}.
	 * @param ctx the parse tree
	 */
	void enterExprStmt(PythonSubsetParser.ExprStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprStmt}
	 * labeled alternative in {@link PythonSubsetParser#simpleStmt}.
	 * @param ctx the parse tree
	 */
	void exitExprStmt(PythonSubsetParser.ExprStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assign}
	 * labeled alternative in {@link PythonSubsetParser#simpleStmt}.
	 * @param ctx the parse tree
	 */
	void enterAssign(PythonSubsetParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assign}
	 * labeled alternative in {@link PythonSubsetParser#simpleStmt}.
	 * @param ctx the parse tree
	 */
	void exitAssign(PythonSubsetParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifRule}
	 * labeled alternative in {@link PythonSubsetParser#compoundStmt}.
	 * @param ctx the parse tree
	 */
	void enterIfRule(PythonSubsetParser.IfRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifRule}
	 * labeled alternative in {@link PythonSubsetParser#compoundStmt}.
	 * @param ctx the parse tree
	 */
	void exitIfRule(PythonSubsetParser.IfRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code forRule}
	 * labeled alternative in {@link PythonSubsetParser#compoundStmt}.
	 * @param ctx the parse tree
	 */
	void enterForRule(PythonSubsetParser.ForRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code forRule}
	 * labeled alternative in {@link PythonSubsetParser#compoundStmt}.
	 * @param ctx the parse tree
	 */
	void exitForRule(PythonSubsetParser.ForRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonSubsetParser#ifStmt}.
	 * @param ctx the parse tree
	 */
	void enterIfStmt(PythonSubsetParser.IfStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonSubsetParser#ifStmt}.
	 * @param ctx the parse tree
	 */
	void exitIfStmt(PythonSubsetParser.IfStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonSubsetParser#forStmt}.
	 * @param ctx the parse tree
	 */
	void enterForStmt(PythonSubsetParser.ForStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonSubsetParser#forStmt}.
	 * @param ctx the parse tree
	 */
	void exitForStmt(PythonSubsetParser.ForStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonSubsetParser#suite}.
	 * @param ctx the parse tree
	 */
	void enterSuite(PythonSubsetParser.SuiteContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonSubsetParser#suite}.
	 * @param ctx the parse tree
	 */
	void exitSuite(PythonSubsetParser.SuiteContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonSubsetParser#test}.
	 * @param ctx the parse tree
	 */
	void enterTest(PythonSubsetParser.TestContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonSubsetParser#test}.
	 * @param ctx the parse tree
	 */
	void exitTest(PythonSubsetParser.TestContext ctx);
	/**
	 * Enter a parse tree produced by the {@code comparison}
	 * labeled alternative in {@link PythonSubsetParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterComparison(PythonSubsetParser.ComparisonContext ctx);
	/**
	 * Exit a parse tree produced by the {@code comparison}
	 * labeled alternative in {@link PythonSubsetParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitComparison(PythonSubsetParser.ComparisonContext ctx);
	/**
	 * Enter a parse tree produced by the {@code atomExpr}
	 * labeled alternative in {@link PythonSubsetParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAtomExpr(PythonSubsetParser.AtomExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code atomExpr}
	 * labeled alternative in {@link PythonSubsetParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAtomExpr(PythonSubsetParser.AtomExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addSub}
	 * labeled alternative in {@link PythonSubsetParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAddSub(PythonSubsetParser.AddSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addSub}
	 * labeled alternative in {@link PythonSubsetParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAddSub(PythonSubsetParser.AddSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mulDiv}
	 * labeled alternative in {@link PythonSubsetParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMulDiv(PythonSubsetParser.MulDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mulDiv}
	 * labeled alternative in {@link PythonSubsetParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMulDiv(PythonSubsetParser.MulDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code call}
	 * labeled alternative in {@link PythonSubsetParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterCall(PythonSubsetParser.CallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code call}
	 * labeled alternative in {@link PythonSubsetParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitCall(PythonSubsetParser.CallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code number}
	 * labeled alternative in {@link PythonSubsetParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterNumber(PythonSubsetParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code number}
	 * labeled alternative in {@link PythonSubsetParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitNumber(PythonSubsetParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code trueLit}
	 * labeled alternative in {@link PythonSubsetParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterTrueLit(PythonSubsetParser.TrueLitContext ctx);
	/**
	 * Exit a parse tree produced by the {@code trueLit}
	 * labeled alternative in {@link PythonSubsetParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitTrueLit(PythonSubsetParser.TrueLitContext ctx);
	/**
	 * Enter a parse tree produced by the {@code paren}
	 * labeled alternative in {@link PythonSubsetParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterParen(PythonSubsetParser.ParenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code paren}
	 * labeled alternative in {@link PythonSubsetParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitParen(PythonSubsetParser.ParenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code string}
	 * labeled alternative in {@link PythonSubsetParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterString(PythonSubsetParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code string}
	 * labeled alternative in {@link PythonSubsetParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitString(PythonSubsetParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code attrAccess}
	 * labeled alternative in {@link PythonSubsetParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAttrAccess(PythonSubsetParser.AttrAccessContext ctx);
	/**
	 * Exit a parse tree produced by the {@code attrAccess}
	 * labeled alternative in {@link PythonSubsetParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAttrAccess(PythonSubsetParser.AttrAccessContext ctx);
	/**
	 * Enter a parse tree produced by the {@code subscript}
	 * labeled alternative in {@link PythonSubsetParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterSubscript(PythonSubsetParser.SubscriptContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subscript}
	 * labeled alternative in {@link PythonSubsetParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitSubscript(PythonSubsetParser.SubscriptContext ctx);
	/**
	 * Enter a parse tree produced by the {@code falseLit}
	 * labeled alternative in {@link PythonSubsetParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterFalseLit(PythonSubsetParser.FalseLitContext ctx);
	/**
	 * Exit a parse tree produced by the {@code falseLit}
	 * labeled alternative in {@link PythonSubsetParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitFalseLit(PythonSubsetParser.FalseLitContext ctx);
	/**
	 * Enter a parse tree produced by the {@code name}
	 * labeled alternative in {@link PythonSubsetParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterName(PythonSubsetParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code name}
	 * labeled alternative in {@link PythonSubsetParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitName(PythonSubsetParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code list}
	 * labeled alternative in {@link PythonSubsetParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterList(PythonSubsetParser.ListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code list}
	 * labeled alternative in {@link PythonSubsetParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitList(PythonSubsetParser.ListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonSubsetParser#listLiteral}.
	 * @param ctx the parse tree
	 */
	void enterListLiteral(PythonSubsetParser.ListLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonSubsetParser#listLiteral}.
	 * @param ctx the parse tree
	 */
	void exitListLiteral(PythonSubsetParser.ListLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonSubsetParser#arglist}.
	 * @param ctx the parse tree
	 */
	void enterArglist(PythonSubsetParser.ArglistContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonSubsetParser#arglist}.
	 * @param ctx the parse tree
	 */
	void exitArglist(PythonSubsetParser.ArglistContext ctx);
}