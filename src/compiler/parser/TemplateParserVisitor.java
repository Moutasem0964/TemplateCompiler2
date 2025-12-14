// Generated from C:/Users/dell/IdeaProjects/TemplateCompiler2/src/compiler/grammar/TemplateParser.g4 by ANTLR 4.13.2

    package compiler.parser;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link TemplateParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface TemplateParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link TemplateParser#template}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplate(TemplateParser.TemplateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code textPart}
	 * labeled alternative in {@link TemplateParser#part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextPart(TemplateParser.TextPartContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprPart}
	 * labeled alternative in {@link TemplateParser#part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprPart(TemplateParser.ExprPartContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stmtPart}
	 * labeled alternative in {@link TemplateParser#part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtPart(TemplateParser.StmtPartContext ctx);
	/**
	 * Visit a parse tree produced by the {@code htmlPart}
	 * labeled alternative in {@link TemplateParser#part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlPart(TemplateParser.HtmlPartContext ctx);
	/**
	 * Visit a parse tree produced by the {@code jinjaExpr}
	 * labeled alternative in {@link TemplateParser#jinjaExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaExpr(TemplateParser.JinjaExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code jinjaStmt}
	 * labeled alternative in {@link TemplateParser#jinjaStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaStmt(TemplateParser.JinjaStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code fullTag}
	 * labeled alternative in {@link TemplateParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFullTag(TemplateParser.FullTagContext ctx);
	/**
	 * Visit a parse tree produced by the {@code selfClosingTag}
	 * labeled alternative in {@link TemplateParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelfClosingTag(TemplateParser.SelfClosingTagContext ctx);
	/**
	 * Visit a parse tree produced by the {@code styleTag}
	 * labeled alternative in {@link TemplateParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStyleTag(TemplateParser.StyleTagContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cssRawContent}
	 * labeled alternative in {@link TemplateParser#styleContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssRawContent(TemplateParser.CssRawContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link TemplateParser#attributes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributes(TemplateParser.AttributesContext ctx);
}