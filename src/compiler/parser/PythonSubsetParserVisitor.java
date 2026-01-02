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
	 * Visit a parse tree produced by {@link PythonSubsetParser#file_input}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile_input(PythonSubsetParser.File_inputContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SimpleStatement}
	 * labeled alternative in {@link PythonSubsetParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleStatement(PythonSubsetParser.SimpleStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CompoundStatement}
	 * labeled alternative in {@link PythonSubsetParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompoundStatement(PythonSubsetParser.CompoundStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonSubsetParser#simple_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_stmt(PythonSubsetParser.Simple_stmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssignSmallStmt}
	 * labeled alternative in {@link PythonSubsetParser#small_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignSmallStmt(PythonSubsetParser.AssignSmallStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ReturnSmallStmt}
	 * labeled alternative in {@link PythonSubsetParser#small_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnSmallStmt(PythonSubsetParser.ReturnSmallStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GlobalSmallStmt}
	 * labeled alternative in {@link PythonSubsetParser#small_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobalSmallStmt(PythonSubsetParser.GlobalSmallStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ImportSmallStmt}
	 * labeled alternative in {@link PythonSubsetParser#small_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportSmallStmt(PythonSubsetParser.ImportSmallStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FromImportSmallStmt}
	 * labeled alternative in {@link PythonSubsetParser#small_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFromImportSmallStmt(PythonSubsetParser.FromImportSmallStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprSmallStmt}
	 * labeled alternative in {@link PythonSubsetParser#small_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprSmallStmt(PythonSubsetParser.ExprSmallStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionDefStmt}
	 * labeled alternative in {@link PythonSubsetParser#compound_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDefStmt(PythonSubsetParser.FunctionDefStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IfCompoundStmt}
	 * labeled alternative in {@link PythonSubsetParser#compound_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfCompoundStmt(PythonSubsetParser.IfCompoundStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ForCompoundStmt}
	 * labeled alternative in {@link PythonSubsetParser#compound_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForCompoundStmt(PythonSubsetParser.ForCompoundStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonSubsetParser#import_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_stmt(PythonSubsetParser.Import_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonSubsetParser#from_import_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrom_import_stmt(PythonSubsetParser.From_import_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonSubsetParser#import_as_names}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_as_names(PythonSubsetParser.Import_as_namesContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonSubsetParser#import_as_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_as_name(PythonSubsetParser.Import_as_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonSubsetParser#dotted_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDotted_name(PythonSubsetParser.Dotted_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonSubsetParser#function_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_def(PythonSubsetParser.Function_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonSubsetParser#decorator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecorator(PythonSubsetParser.DecoratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonSubsetParser#parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameters(PythonSubsetParser.ParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonSubsetParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(PythonSubsetParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by the {@code InlineSuite}
	 * labeled alternative in {@link PythonSubsetParser#suite}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInlineSuite(PythonSubsetParser.InlineSuiteContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BlockSuite}
	 * labeled alternative in {@link PythonSubsetParser#suite}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockSuite(PythonSubsetParser.BlockSuiteContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonSubsetParser#if_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_stmt(PythonSubsetParser.If_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonSubsetParser#for_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_stmt(PythonSubsetParser.For_stmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SimpleAssign}
	 * labeled alternative in {@link PythonSubsetParser#assign_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleAssign(PythonSubsetParser.SimpleAssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PlusAssign}
	 * labeled alternative in {@link PythonSubsetParser#assign_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlusAssign(PythonSubsetParser.PlusAssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MinusAssign}
	 * labeled alternative in {@link PythonSubsetParser#assign_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinusAssign(PythonSubsetParser.MinusAssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonSubsetParser#global_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobal_stmt(PythonSubsetParser.Global_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonSubsetParser#return_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_stmt(PythonSubsetParser.Return_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonSubsetParser#expr_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_stmt(PythonSubsetParser.Expr_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonSubsetParser#test}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTest(PythonSubsetParser.TestContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonSubsetParser#or_test}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOr_test(PythonSubsetParser.Or_testContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonSubsetParser#and_test}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd_test(PythonSubsetParser.And_testContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NotExpr}
	 * labeled alternative in {@link PythonSubsetParser#not_test}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotExpr(PythonSubsetParser.NotExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ComparisonExpr}
	 * labeled alternative in {@link PythonSubsetParser#not_test}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonExpr(PythonSubsetParser.ComparisonExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonSubsetParser#comparison}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparison(PythonSubsetParser.ComparisonContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LessOp}
	 * labeled alternative in {@link PythonSubsetParser#comp_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLessOp(PythonSubsetParser.LessOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GreaterOp}
	 * labeled alternative in {@link PythonSubsetParser#comp_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreaterOp(PythonSubsetParser.GreaterOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EqualOp}
	 * labeled alternative in {@link PythonSubsetParser#comp_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualOp(PythonSubsetParser.EqualOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GreaterEqualOp}
	 * labeled alternative in {@link PythonSubsetParser#comp_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreaterEqualOp(PythonSubsetParser.GreaterEqualOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LessEqualOp}
	 * labeled alternative in {@link PythonSubsetParser#comp_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLessEqualOp(PythonSubsetParser.LessEqualOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NotEqualOp}
	 * labeled alternative in {@link PythonSubsetParser#comp_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotEqualOp(PythonSubsetParser.NotEqualOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code InOp}
	 * labeled alternative in {@link PythonSubsetParser#comp_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInOp(PythonSubsetParser.InOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonSubsetParser#arith_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArith_expr(PythonSubsetParser.Arith_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonSubsetParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(PythonSubsetParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UnaryFactor}
	 * labeled alternative in {@link PythonSubsetParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryFactor(PythonSubsetParser.UnaryFactorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PowerFactor}
	 * labeled alternative in {@link PythonSubsetParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPowerFactor(PythonSubsetParser.PowerFactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonSubsetParser#power}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPower(PythonSubsetParser.PowerContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonSubsetParser#atom_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom_expr(PythonSubsetParser.Atom_exprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CallTrailer}
	 * labeled alternative in {@link PythonSubsetParser#trailer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallTrailer(PythonSubsetParser.CallTrailerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GenExprTrailer}
	 * labeled alternative in {@link PythonSubsetParser#trailer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenExprTrailer(PythonSubsetParser.GenExprTrailerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IndexTrailer}
	 * labeled alternative in {@link PythonSubsetParser#trailer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexTrailer(PythonSubsetParser.IndexTrailerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AttrTrailer}
	 * labeled alternative in {@link PythonSubsetParser#trailer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttrTrailer(PythonSubsetParser.AttrTrailerContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonSubsetParser#subscript}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubscript(PythonSubsetParser.SubscriptContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParenAtom}
	 * labeled alternative in {@link PythonSubsetParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenAtom(PythonSubsetParser.ParenAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ListAtom}
	 * labeled alternative in {@link PythonSubsetParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListAtom(PythonSubsetParser.ListAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DictAtom}
	 * labeled alternative in {@link PythonSubsetParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDictAtom(PythonSubsetParser.DictAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NameAtom}
	 * labeled alternative in {@link PythonSubsetParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNameAtom(PythonSubsetParser.NameAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NumberAtom}
	 * labeled alternative in {@link PythonSubsetParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberAtom(PythonSubsetParser.NumberAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StringAtom}
	 * labeled alternative in {@link PythonSubsetParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringAtom(PythonSubsetParser.StringAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TrueAtom}
	 * labeled alternative in {@link PythonSubsetParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrueAtom(PythonSubsetParser.TrueAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FalseAtom}
	 * labeled alternative in {@link PythonSubsetParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFalseAtom(PythonSubsetParser.FalseAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NoneAtom}
	 * labeled alternative in {@link PythonSubsetParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNoneAtom(PythonSubsetParser.NoneAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ComprehensionTestList}
	 * labeled alternative in {@link PythonSubsetParser#testlist_comp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComprehensionTestList(PythonSubsetParser.ComprehensionTestListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TupleTestList}
	 * labeled alternative in {@link PythonSubsetParser#testlist_comp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTupleTestList(PythonSubsetParser.TupleTestListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonSubsetParser#genexpr_inner}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenexpr_inner(PythonSubsetParser.Genexpr_innerContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonSubsetParser#comp_for}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComp_for(PythonSubsetParser.Comp_forContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DictMaker}
	 * labeled alternative in {@link PythonSubsetParser#dictorsetmaker}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDictMaker(PythonSubsetParser.DictMakerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SetMaker}
	 * labeled alternative in {@link PythonSubsetParser#dictorsetmaker}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetMaker(PythonSubsetParser.SetMakerContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonSubsetParser#dict_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDict_item(PythonSubsetParser.Dict_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonSubsetParser#arglist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArglist(PythonSubsetParser.ArglistContext ctx);
	/**
	 * Visit a parse tree produced by the {@code KeywordArgument}
	 * labeled alternative in {@link PythonSubsetParser#argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeywordArgument(PythonSubsetParser.KeywordArgumentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PositionalArgument}
	 * labeled alternative in {@link PythonSubsetParser#argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPositionalArgument(PythonSubsetParser.PositionalArgumentContext ctx);
}