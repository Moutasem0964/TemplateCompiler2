// Generated from C:/Users/dell/IdeaProjects/TemplateCompiler2/src/compiler/grammar/TemplateParser.g4 by ANTLR 4.13.2

    package compiler.parser;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TemplateParser}.
 */
public interface TemplateParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TemplateParser#template}.
	 * @param ctx the parse tree
	 */
	void enterTemplate(TemplateParser.TemplateContext ctx);
	/**
	 * Exit a parse tree produced by {@link TemplateParser#template}.
	 * @param ctx the parse tree
	 */
	void exitTemplate(TemplateParser.TemplateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code textPart}
	 * labeled alternative in {@link TemplateParser#part}.
	 * @param ctx the parse tree
	 */
	void enterTextPart(TemplateParser.TextPartContext ctx);
	/**
	 * Exit a parse tree produced by the {@code textPart}
	 * labeled alternative in {@link TemplateParser#part}.
	 * @param ctx the parse tree
	 */
	void exitTextPart(TemplateParser.TextPartContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprPart}
	 * labeled alternative in {@link TemplateParser#part}.
	 * @param ctx the parse tree
	 */
	void enterExprPart(TemplateParser.ExprPartContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprPart}
	 * labeled alternative in {@link TemplateParser#part}.
	 * @param ctx the parse tree
	 */
	void exitExprPart(TemplateParser.ExprPartContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stmtPart}
	 * labeled alternative in {@link TemplateParser#part}.
	 * @param ctx the parse tree
	 */
	void enterStmtPart(TemplateParser.StmtPartContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stmtPart}
	 * labeled alternative in {@link TemplateParser#part}.
	 * @param ctx the parse tree
	 */
	void exitStmtPart(TemplateParser.StmtPartContext ctx);
	/**
	 * Enter a parse tree produced by the {@code htmlPart}
	 * labeled alternative in {@link TemplateParser#part}.
	 * @param ctx the parse tree
	 */
	void enterHtmlPart(TemplateParser.HtmlPartContext ctx);
	/**
	 * Exit a parse tree produced by the {@code htmlPart}
	 * labeled alternative in {@link TemplateParser#part}.
	 * @param ctx the parse tree
	 */
	void exitHtmlPart(TemplateParser.HtmlPartContext ctx);
	/**
	 * Enter a parse tree produced by the {@code jinjaExpr}
	 * labeled alternative in {@link TemplateParser#jinjaExpression}.
	 * @param ctx the parse tree
	 */
	void enterJinjaExpr(TemplateParser.JinjaExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code jinjaExpr}
	 * labeled alternative in {@link TemplateParser#jinjaExpression}.
	 * @param ctx the parse tree
	 */
	void exitJinjaExpr(TemplateParser.JinjaExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code jinjaStmt}
	 * labeled alternative in {@link TemplateParser#jinjaStatement}.
	 * @param ctx the parse tree
	 */
	void enterJinjaStmt(TemplateParser.JinjaStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code jinjaStmt}
	 * labeled alternative in {@link TemplateParser#jinjaStatement}.
	 * @param ctx the parse tree
	 */
	void exitJinjaStmt(TemplateParser.JinjaStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code fullTag}
	 * labeled alternative in {@link TemplateParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterFullTag(TemplateParser.FullTagContext ctx);
	/**
	 * Exit a parse tree produced by the {@code fullTag}
	 * labeled alternative in {@link TemplateParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitFullTag(TemplateParser.FullTagContext ctx);
	/**
	 * Enter a parse tree produced by the {@code selfClosingTag}
	 * labeled alternative in {@link TemplateParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterSelfClosingTag(TemplateParser.SelfClosingTagContext ctx);
	/**
	 * Exit a parse tree produced by the {@code selfClosingTag}
	 * labeled alternative in {@link TemplateParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitSelfClosingTag(TemplateParser.SelfClosingTagContext ctx);
	/**
	 * Enter a parse tree produced by the {@code styleTag}
	 * labeled alternative in {@link TemplateParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterStyleTag(TemplateParser.StyleTagContext ctx);
	/**
	 * Exit a parse tree produced by the {@code styleTag}
	 * labeled alternative in {@link TemplateParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitStyleTag(TemplateParser.StyleTagContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cssRawContent}
	 * labeled alternative in {@link TemplateParser#styleContent}.
	 * @param ctx the parse tree
	 */
	void enterCssRawContent(TemplateParser.CssRawContentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cssRawContent}
	 * labeled alternative in {@link TemplateParser#styleContent}.
	 * @param ctx the parse tree
	 */
	void exitCssRawContent(TemplateParser.CssRawContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link TemplateParser#attributes}.
	 * @param ctx the parse tree
	 */
	void enterAttributes(TemplateParser.AttributesContext ctx);
	/**
	 * Exit a parse tree produced by {@link TemplateParser#attributes}.
	 * @param ctx the parse tree
	 */
	void exitAttributes(TemplateParser.AttributesContext ctx);
}