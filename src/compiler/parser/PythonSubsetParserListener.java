// Generated from C:/Users/dell/IdeaProjects/TemplateCompiler2/src/compiler/grammar/PythonSubsetParser.g4 by ANTLR 4.13.2

    package compiler.parser;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PythonSubsetParser}.
 */
public interface PythonSubsetParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PythonSubsetParser#file_input}.
	 * @param ctx the parse tree
	 */
	void enterFile_input(PythonSubsetParser.File_inputContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonSubsetParser#file_input}.
	 * @param ctx the parse tree
	 */
	void exitFile_input(PythonSubsetParser.File_inputContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SimpleStatement}
	 * labeled alternative in {@link PythonSubsetParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterSimpleStatement(PythonSubsetParser.SimpleStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SimpleStatement}
	 * labeled alternative in {@link PythonSubsetParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitSimpleStatement(PythonSubsetParser.SimpleStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CompoundStatement}
	 * labeled alternative in {@link PythonSubsetParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterCompoundStatement(PythonSubsetParser.CompoundStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CompoundStatement}
	 * labeled alternative in {@link PythonSubsetParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitCompoundStatement(PythonSubsetParser.CompoundStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonSubsetParser#simple_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSimple_stmt(PythonSubsetParser.Simple_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonSubsetParser#simple_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSimple_stmt(PythonSubsetParser.Simple_stmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignSmallStmt}
	 * labeled alternative in {@link PythonSubsetParser#small_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAssignSmallStmt(PythonSubsetParser.AssignSmallStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignSmallStmt}
	 * labeled alternative in {@link PythonSubsetParser#small_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAssignSmallStmt(PythonSubsetParser.AssignSmallStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ReturnSmallStmt}
	 * labeled alternative in {@link PythonSubsetParser#small_stmt}.
	 * @param ctx the parse tree
	 */
	void enterReturnSmallStmt(PythonSubsetParser.ReturnSmallStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ReturnSmallStmt}
	 * labeled alternative in {@link PythonSubsetParser#small_stmt}.
	 * @param ctx the parse tree
	 */
	void exitReturnSmallStmt(PythonSubsetParser.ReturnSmallStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GlobalSmallStmt}
	 * labeled alternative in {@link PythonSubsetParser#small_stmt}.
	 * @param ctx the parse tree
	 */
	void enterGlobalSmallStmt(PythonSubsetParser.GlobalSmallStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GlobalSmallStmt}
	 * labeled alternative in {@link PythonSubsetParser#small_stmt}.
	 * @param ctx the parse tree
	 */
	void exitGlobalSmallStmt(PythonSubsetParser.GlobalSmallStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ImportSmallStmt}
	 * labeled alternative in {@link PythonSubsetParser#small_stmt}.
	 * @param ctx the parse tree
	 */
	void enterImportSmallStmt(PythonSubsetParser.ImportSmallStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ImportSmallStmt}
	 * labeled alternative in {@link PythonSubsetParser#small_stmt}.
	 * @param ctx the parse tree
	 */
	void exitImportSmallStmt(PythonSubsetParser.ImportSmallStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FromImportSmallStmt}
	 * labeled alternative in {@link PythonSubsetParser#small_stmt}.
	 * @param ctx the parse tree
	 */
	void enterFromImportSmallStmt(PythonSubsetParser.FromImportSmallStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FromImportSmallStmt}
	 * labeled alternative in {@link PythonSubsetParser#small_stmt}.
	 * @param ctx the parse tree
	 */
	void exitFromImportSmallStmt(PythonSubsetParser.FromImportSmallStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprSmallStmt}
	 * labeled alternative in {@link PythonSubsetParser#small_stmt}.
	 * @param ctx the parse tree
	 */
	void enterExprSmallStmt(PythonSubsetParser.ExprSmallStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprSmallStmt}
	 * labeled alternative in {@link PythonSubsetParser#small_stmt}.
	 * @param ctx the parse tree
	 */
	void exitExprSmallStmt(PythonSubsetParser.ExprSmallStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionDefStmt}
	 * labeled alternative in {@link PythonSubsetParser#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDefStmt(PythonSubsetParser.FunctionDefStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionDefStmt}
	 * labeled alternative in {@link PythonSubsetParser#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDefStmt(PythonSubsetParser.FunctionDefStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IfCompoundStmt}
	 * labeled alternative in {@link PythonSubsetParser#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void enterIfCompoundStmt(PythonSubsetParser.IfCompoundStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IfCompoundStmt}
	 * labeled alternative in {@link PythonSubsetParser#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void exitIfCompoundStmt(PythonSubsetParser.IfCompoundStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ForCompoundStmt}
	 * labeled alternative in {@link PythonSubsetParser#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void enterForCompoundStmt(PythonSubsetParser.ForCompoundStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForCompoundStmt}
	 * labeled alternative in {@link PythonSubsetParser#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void exitForCompoundStmt(PythonSubsetParser.ForCompoundStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonSubsetParser#import_stmt}.
	 * @param ctx the parse tree
	 */
	void enterImport_stmt(PythonSubsetParser.Import_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonSubsetParser#import_stmt}.
	 * @param ctx the parse tree
	 */
	void exitImport_stmt(PythonSubsetParser.Import_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonSubsetParser#from_import_stmt}.
	 * @param ctx the parse tree
	 */
	void enterFrom_import_stmt(PythonSubsetParser.From_import_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonSubsetParser#from_import_stmt}.
	 * @param ctx the parse tree
	 */
	void exitFrom_import_stmt(PythonSubsetParser.From_import_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonSubsetParser#import_as_names}.
	 * @param ctx the parse tree
	 */
	void enterImport_as_names(PythonSubsetParser.Import_as_namesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonSubsetParser#import_as_names}.
	 * @param ctx the parse tree
	 */
	void exitImport_as_names(PythonSubsetParser.Import_as_namesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonSubsetParser#import_as_name}.
	 * @param ctx the parse tree
	 */
	void enterImport_as_name(PythonSubsetParser.Import_as_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonSubsetParser#import_as_name}.
	 * @param ctx the parse tree
	 */
	void exitImport_as_name(PythonSubsetParser.Import_as_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonSubsetParser#dotted_name}.
	 * @param ctx the parse tree
	 */
	void enterDotted_name(PythonSubsetParser.Dotted_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonSubsetParser#dotted_name}.
	 * @param ctx the parse tree
	 */
	void exitDotted_name(PythonSubsetParser.Dotted_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonSubsetParser#function_def}.
	 * @param ctx the parse tree
	 */
	void enterFunction_def(PythonSubsetParser.Function_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonSubsetParser#function_def}.
	 * @param ctx the parse tree
	 */
	void exitFunction_def(PythonSubsetParser.Function_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonSubsetParser#decorator}.
	 * @param ctx the parse tree
	 */
	void enterDecorator(PythonSubsetParser.DecoratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonSubsetParser#decorator}.
	 * @param ctx the parse tree
	 */
	void exitDecorator(PythonSubsetParser.DecoratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonSubsetParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterParameters(PythonSubsetParser.ParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonSubsetParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitParameters(PythonSubsetParser.ParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonSubsetParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(PythonSubsetParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonSubsetParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(PythonSubsetParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code InlineSuite}
	 * labeled alternative in {@link PythonSubsetParser#suite}.
	 * @param ctx the parse tree
	 */
	void enterInlineSuite(PythonSubsetParser.InlineSuiteContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InlineSuite}
	 * labeled alternative in {@link PythonSubsetParser#suite}.
	 * @param ctx the parse tree
	 */
	void exitInlineSuite(PythonSubsetParser.InlineSuiteContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BlockSuite}
	 * labeled alternative in {@link PythonSubsetParser#suite}.
	 * @param ctx the parse tree
	 */
	void enterBlockSuite(PythonSubsetParser.BlockSuiteContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BlockSuite}
	 * labeled alternative in {@link PythonSubsetParser#suite}.
	 * @param ctx the parse tree
	 */
	void exitBlockSuite(PythonSubsetParser.BlockSuiteContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonSubsetParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void enterIf_stmt(PythonSubsetParser.If_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonSubsetParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void exitIf_stmt(PythonSubsetParser.If_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonSubsetParser#for_stmt}.
	 * @param ctx the parse tree
	 */
	void enterFor_stmt(PythonSubsetParser.For_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonSubsetParser#for_stmt}.
	 * @param ctx the parse tree
	 */
	void exitFor_stmt(PythonSubsetParser.For_stmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SimpleAssign}
	 * labeled alternative in {@link PythonSubsetParser#assign_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSimpleAssign(PythonSubsetParser.SimpleAssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SimpleAssign}
	 * labeled alternative in {@link PythonSubsetParser#assign_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSimpleAssign(PythonSubsetParser.SimpleAssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PlusAssign}
	 * labeled alternative in {@link PythonSubsetParser#assign_stmt}.
	 * @param ctx the parse tree
	 */
	void enterPlusAssign(PythonSubsetParser.PlusAssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PlusAssign}
	 * labeled alternative in {@link PythonSubsetParser#assign_stmt}.
	 * @param ctx the parse tree
	 */
	void exitPlusAssign(PythonSubsetParser.PlusAssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MinusAssign}
	 * labeled alternative in {@link PythonSubsetParser#assign_stmt}.
	 * @param ctx the parse tree
	 */
	void enterMinusAssign(PythonSubsetParser.MinusAssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MinusAssign}
	 * labeled alternative in {@link PythonSubsetParser#assign_stmt}.
	 * @param ctx the parse tree
	 */
	void exitMinusAssign(PythonSubsetParser.MinusAssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonSubsetParser#global_stmt}.
	 * @param ctx the parse tree
	 */
	void enterGlobal_stmt(PythonSubsetParser.Global_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonSubsetParser#global_stmt}.
	 * @param ctx the parse tree
	 */
	void exitGlobal_stmt(PythonSubsetParser.Global_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonSubsetParser#return_stmt}.
	 * @param ctx the parse tree
	 */
	void enterReturn_stmt(PythonSubsetParser.Return_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonSubsetParser#return_stmt}.
	 * @param ctx the parse tree
	 */
	void exitReturn_stmt(PythonSubsetParser.Return_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonSubsetParser#expr_stmt}.
	 * @param ctx the parse tree
	 */
	void enterExpr_stmt(PythonSubsetParser.Expr_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonSubsetParser#expr_stmt}.
	 * @param ctx the parse tree
	 */
	void exitExpr_stmt(PythonSubsetParser.Expr_stmtContext ctx);
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
	 * Enter a parse tree produced by {@link PythonSubsetParser#or_test}.
	 * @param ctx the parse tree
	 */
	void enterOr_test(PythonSubsetParser.Or_testContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonSubsetParser#or_test}.
	 * @param ctx the parse tree
	 */
	void exitOr_test(PythonSubsetParser.Or_testContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonSubsetParser#and_test}.
	 * @param ctx the parse tree
	 */
	void enterAnd_test(PythonSubsetParser.And_testContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonSubsetParser#and_test}.
	 * @param ctx the parse tree
	 */
	void exitAnd_test(PythonSubsetParser.And_testContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NotExpr}
	 * labeled alternative in {@link PythonSubsetParser#not_test}.
	 * @param ctx the parse tree
	 */
	void enterNotExpr(PythonSubsetParser.NotExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NotExpr}
	 * labeled alternative in {@link PythonSubsetParser#not_test}.
	 * @param ctx the parse tree
	 */
	void exitNotExpr(PythonSubsetParser.NotExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ComparisonExpr}
	 * labeled alternative in {@link PythonSubsetParser#not_test}.
	 * @param ctx the parse tree
	 */
	void enterComparisonExpr(PythonSubsetParser.ComparisonExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ComparisonExpr}
	 * labeled alternative in {@link PythonSubsetParser#not_test}.
	 * @param ctx the parse tree
	 */
	void exitComparisonExpr(PythonSubsetParser.ComparisonExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonSubsetParser#comparison}.
	 * @param ctx the parse tree
	 */
	void enterComparison(PythonSubsetParser.ComparisonContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonSubsetParser#comparison}.
	 * @param ctx the parse tree
	 */
	void exitComparison(PythonSubsetParser.ComparisonContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LessOp}
	 * labeled alternative in {@link PythonSubsetParser#comp_op}.
	 * @param ctx the parse tree
	 */
	void enterLessOp(PythonSubsetParser.LessOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LessOp}
	 * labeled alternative in {@link PythonSubsetParser#comp_op}.
	 * @param ctx the parse tree
	 */
	void exitLessOp(PythonSubsetParser.LessOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GreaterOp}
	 * labeled alternative in {@link PythonSubsetParser#comp_op}.
	 * @param ctx the parse tree
	 */
	void enterGreaterOp(PythonSubsetParser.GreaterOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GreaterOp}
	 * labeled alternative in {@link PythonSubsetParser#comp_op}.
	 * @param ctx the parse tree
	 */
	void exitGreaterOp(PythonSubsetParser.GreaterOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EqualOp}
	 * labeled alternative in {@link PythonSubsetParser#comp_op}.
	 * @param ctx the parse tree
	 */
	void enterEqualOp(PythonSubsetParser.EqualOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EqualOp}
	 * labeled alternative in {@link PythonSubsetParser#comp_op}.
	 * @param ctx the parse tree
	 */
	void exitEqualOp(PythonSubsetParser.EqualOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GreaterEqualOp}
	 * labeled alternative in {@link PythonSubsetParser#comp_op}.
	 * @param ctx the parse tree
	 */
	void enterGreaterEqualOp(PythonSubsetParser.GreaterEqualOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GreaterEqualOp}
	 * labeled alternative in {@link PythonSubsetParser#comp_op}.
	 * @param ctx the parse tree
	 */
	void exitGreaterEqualOp(PythonSubsetParser.GreaterEqualOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LessEqualOp}
	 * labeled alternative in {@link PythonSubsetParser#comp_op}.
	 * @param ctx the parse tree
	 */
	void enterLessEqualOp(PythonSubsetParser.LessEqualOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LessEqualOp}
	 * labeled alternative in {@link PythonSubsetParser#comp_op}.
	 * @param ctx the parse tree
	 */
	void exitLessEqualOp(PythonSubsetParser.LessEqualOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NotEqualOp}
	 * labeled alternative in {@link PythonSubsetParser#comp_op}.
	 * @param ctx the parse tree
	 */
	void enterNotEqualOp(PythonSubsetParser.NotEqualOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NotEqualOp}
	 * labeled alternative in {@link PythonSubsetParser#comp_op}.
	 * @param ctx the parse tree
	 */
	void exitNotEqualOp(PythonSubsetParser.NotEqualOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code InOp}
	 * labeled alternative in {@link PythonSubsetParser#comp_op}.
	 * @param ctx the parse tree
	 */
	void enterInOp(PythonSubsetParser.InOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InOp}
	 * labeled alternative in {@link PythonSubsetParser#comp_op}.
	 * @param ctx the parse tree
	 */
	void exitInOp(PythonSubsetParser.InOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonSubsetParser#arith_expr}.
	 * @param ctx the parse tree
	 */
	void enterArith_expr(PythonSubsetParser.Arith_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonSubsetParser#arith_expr}.
	 * @param ctx the parse tree
	 */
	void exitArith_expr(PythonSubsetParser.Arith_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonSubsetParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(PythonSubsetParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonSubsetParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(PythonSubsetParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UnaryFactor}
	 * labeled alternative in {@link PythonSubsetParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterUnaryFactor(PythonSubsetParser.UnaryFactorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UnaryFactor}
	 * labeled alternative in {@link PythonSubsetParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitUnaryFactor(PythonSubsetParser.UnaryFactorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PowerFactor}
	 * labeled alternative in {@link PythonSubsetParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterPowerFactor(PythonSubsetParser.PowerFactorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PowerFactor}
	 * labeled alternative in {@link PythonSubsetParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitPowerFactor(PythonSubsetParser.PowerFactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonSubsetParser#power}.
	 * @param ctx the parse tree
	 */
	void enterPower(PythonSubsetParser.PowerContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonSubsetParser#power}.
	 * @param ctx the parse tree
	 */
	void exitPower(PythonSubsetParser.PowerContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonSubsetParser#atom_expr}.
	 * @param ctx the parse tree
	 */
	void enterAtom_expr(PythonSubsetParser.Atom_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonSubsetParser#atom_expr}.
	 * @param ctx the parse tree
	 */
	void exitAtom_expr(PythonSubsetParser.Atom_exprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CallTrailer}
	 * labeled alternative in {@link PythonSubsetParser#trailer}.
	 * @param ctx the parse tree
	 */
	void enterCallTrailer(PythonSubsetParser.CallTrailerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CallTrailer}
	 * labeled alternative in {@link PythonSubsetParser#trailer}.
	 * @param ctx the parse tree
	 */
	void exitCallTrailer(PythonSubsetParser.CallTrailerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GenExprTrailer}
	 * labeled alternative in {@link PythonSubsetParser#trailer}.
	 * @param ctx the parse tree
	 */
	void enterGenExprTrailer(PythonSubsetParser.GenExprTrailerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GenExprTrailer}
	 * labeled alternative in {@link PythonSubsetParser#trailer}.
	 * @param ctx the parse tree
	 */
	void exitGenExprTrailer(PythonSubsetParser.GenExprTrailerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IndexTrailer}
	 * labeled alternative in {@link PythonSubsetParser#trailer}.
	 * @param ctx the parse tree
	 */
	void enterIndexTrailer(PythonSubsetParser.IndexTrailerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IndexTrailer}
	 * labeled alternative in {@link PythonSubsetParser#trailer}.
	 * @param ctx the parse tree
	 */
	void exitIndexTrailer(PythonSubsetParser.IndexTrailerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AttrTrailer}
	 * labeled alternative in {@link PythonSubsetParser#trailer}.
	 * @param ctx the parse tree
	 */
	void enterAttrTrailer(PythonSubsetParser.AttrTrailerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AttrTrailer}
	 * labeled alternative in {@link PythonSubsetParser#trailer}.
	 * @param ctx the parse tree
	 */
	void exitAttrTrailer(PythonSubsetParser.AttrTrailerContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonSubsetParser#subscript}.
	 * @param ctx the parse tree
	 */
	void enterSubscript(PythonSubsetParser.SubscriptContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonSubsetParser#subscript}.
	 * @param ctx the parse tree
	 */
	void exitSubscript(PythonSubsetParser.SubscriptContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParenAtom}
	 * labeled alternative in {@link PythonSubsetParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterParenAtom(PythonSubsetParser.ParenAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParenAtom}
	 * labeled alternative in {@link PythonSubsetParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitParenAtom(PythonSubsetParser.ParenAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ListAtom}
	 * labeled alternative in {@link PythonSubsetParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterListAtom(PythonSubsetParser.ListAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ListAtom}
	 * labeled alternative in {@link PythonSubsetParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitListAtom(PythonSubsetParser.ListAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DictAtom}
	 * labeled alternative in {@link PythonSubsetParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterDictAtom(PythonSubsetParser.DictAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DictAtom}
	 * labeled alternative in {@link PythonSubsetParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitDictAtom(PythonSubsetParser.DictAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NameAtom}
	 * labeled alternative in {@link PythonSubsetParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterNameAtom(PythonSubsetParser.NameAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NameAtom}
	 * labeled alternative in {@link PythonSubsetParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitNameAtom(PythonSubsetParser.NameAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NumberAtom}
	 * labeled alternative in {@link PythonSubsetParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterNumberAtom(PythonSubsetParser.NumberAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NumberAtom}
	 * labeled alternative in {@link PythonSubsetParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitNumberAtom(PythonSubsetParser.NumberAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StringAtom}
	 * labeled alternative in {@link PythonSubsetParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterStringAtom(PythonSubsetParser.StringAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StringAtom}
	 * labeled alternative in {@link PythonSubsetParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitStringAtom(PythonSubsetParser.StringAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TrueAtom}
	 * labeled alternative in {@link PythonSubsetParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterTrueAtom(PythonSubsetParser.TrueAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TrueAtom}
	 * labeled alternative in {@link PythonSubsetParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitTrueAtom(PythonSubsetParser.TrueAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FalseAtom}
	 * labeled alternative in {@link PythonSubsetParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterFalseAtom(PythonSubsetParser.FalseAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FalseAtom}
	 * labeled alternative in {@link PythonSubsetParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitFalseAtom(PythonSubsetParser.FalseAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NoneAtom}
	 * labeled alternative in {@link PythonSubsetParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterNoneAtom(PythonSubsetParser.NoneAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NoneAtom}
	 * labeled alternative in {@link PythonSubsetParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitNoneAtom(PythonSubsetParser.NoneAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ComprehensionTestList}
	 * labeled alternative in {@link PythonSubsetParser#testlist_comp}.
	 * @param ctx the parse tree
	 */
	void enterComprehensionTestList(PythonSubsetParser.ComprehensionTestListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ComprehensionTestList}
	 * labeled alternative in {@link PythonSubsetParser#testlist_comp}.
	 * @param ctx the parse tree
	 */
	void exitComprehensionTestList(PythonSubsetParser.ComprehensionTestListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TupleTestList}
	 * labeled alternative in {@link PythonSubsetParser#testlist_comp}.
	 * @param ctx the parse tree
	 */
	void enterTupleTestList(PythonSubsetParser.TupleTestListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TupleTestList}
	 * labeled alternative in {@link PythonSubsetParser#testlist_comp}.
	 * @param ctx the parse tree
	 */
	void exitTupleTestList(PythonSubsetParser.TupleTestListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonSubsetParser#genexpr_inner}.
	 * @param ctx the parse tree
	 */
	void enterGenexpr_inner(PythonSubsetParser.Genexpr_innerContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonSubsetParser#genexpr_inner}.
	 * @param ctx the parse tree
	 */
	void exitGenexpr_inner(PythonSubsetParser.Genexpr_innerContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonSubsetParser#comp_for}.
	 * @param ctx the parse tree
	 */
	void enterComp_for(PythonSubsetParser.Comp_forContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonSubsetParser#comp_for}.
	 * @param ctx the parse tree
	 */
	void exitComp_for(PythonSubsetParser.Comp_forContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DictMaker}
	 * labeled alternative in {@link PythonSubsetParser#dictorsetmaker}.
	 * @param ctx the parse tree
	 */
	void enterDictMaker(PythonSubsetParser.DictMakerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DictMaker}
	 * labeled alternative in {@link PythonSubsetParser#dictorsetmaker}.
	 * @param ctx the parse tree
	 */
	void exitDictMaker(PythonSubsetParser.DictMakerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SetMaker}
	 * labeled alternative in {@link PythonSubsetParser#dictorsetmaker}.
	 * @param ctx the parse tree
	 */
	void enterSetMaker(PythonSubsetParser.SetMakerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SetMaker}
	 * labeled alternative in {@link PythonSubsetParser#dictorsetmaker}.
	 * @param ctx the parse tree
	 */
	void exitSetMaker(PythonSubsetParser.SetMakerContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonSubsetParser#dict_item}.
	 * @param ctx the parse tree
	 */
	void enterDict_item(PythonSubsetParser.Dict_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonSubsetParser#dict_item}.
	 * @param ctx the parse tree
	 */
	void exitDict_item(PythonSubsetParser.Dict_itemContext ctx);
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
	/**
	 * Enter a parse tree produced by the {@code KeywordArgument}
	 * labeled alternative in {@link PythonSubsetParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterKeywordArgument(PythonSubsetParser.KeywordArgumentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code KeywordArgument}
	 * labeled alternative in {@link PythonSubsetParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitKeywordArgument(PythonSubsetParser.KeywordArgumentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PositionalArgument}
	 * labeled alternative in {@link PythonSubsetParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterPositionalArgument(PythonSubsetParser.PositionalArgumentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PositionalArgument}
	 * labeled alternative in {@link PythonSubsetParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitPositionalArgument(PythonSubsetParser.PositionalArgumentContext ctx);
}