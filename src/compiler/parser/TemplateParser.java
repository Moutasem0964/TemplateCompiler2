// Generated from C:/Users/dell/IdeaProjects/TemplateCompiler2/src/compiler/grammar/TemplateParser.g4 by ANTLR 4.13.2

    package compiler.parser;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class TemplateParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		OPEN_EXPR=1, OPEN_STMT=2, OPEN_COMMENT=3, TAG_START=4, TEXT=5, WS=6, CLOSE_EXPR=7, 
		PY_EXPR_CONTENT=8, CLOSE_STMT=9, PY_STMT_CONTENT=10, CLOSE_COMMENT=11, 
		COMMENT_CONTENT=12, TAG_END=13, TAG_SLASH_CLOSE=14, SLASH=15, EQUALS=16, 
		TAG_NAME=17, STYLE_TAG=18, ATTR_VALUE=19, TAG_WS=20;
	public static final int
		RULE_template = 0, RULE_part = 1, RULE_jinjaExpression = 2, RULE_jinjaStatement = 3, 
		RULE_htmlElement = 4, RULE_styleContent = 5, RULE_attributes = 6;
	private static String[] makeRuleNames() {
		return new String[] {
			"template", "part", "jinjaExpression", "jinjaStatement", "htmlElement", 
			"styleContent", "attributes"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{{'", "'{%'", "'{#'", "'<'", null, null, "'}}'", null, "'%}'", 
			null, "'#}'", null, "'>'", "'/>'", "'/'", "'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "OPEN_EXPR", "OPEN_STMT", "OPEN_COMMENT", "TAG_START", "TEXT", 
			"WS", "CLOSE_EXPR", "PY_EXPR_CONTENT", "CLOSE_STMT", "PY_STMT_CONTENT", 
			"CLOSE_COMMENT", "COMMENT_CONTENT", "TAG_END", "TAG_SLASH_CLOSE", "SLASH", 
			"EQUALS", "TAG_NAME", "STYLE_TAG", "ATTR_VALUE", "TAG_WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "TemplateParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public TemplateParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TemplateContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(TemplateParser.EOF, 0); }
		public List<PartContext> part() {
			return getRuleContexts(PartContext.class);
		}
		public PartContext part(int i) {
			return getRuleContext(PartContext.class,i);
		}
		public TemplateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_template; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).enterTemplate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).exitTemplate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateParserVisitor ) return ((TemplateParserVisitor<? extends T>)visitor).visitTemplate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TemplateContext template() throws RecognitionException {
		TemplateContext _localctx = new TemplateContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_template);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(17);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 54L) != 0)) {
				{
				{
				setState(14);
				part();
				}
				}
				setState(19);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(20);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PartContext extends ParserRuleContext {
		public PartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_part; }
	 
		public PartContext() { }
		public void copyFrom(PartContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprPartContext extends PartContext {
		public JinjaExpressionContext jinjaExpression() {
			return getRuleContext(JinjaExpressionContext.class,0);
		}
		public ExprPartContext(PartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).enterExprPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).exitExprPart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateParserVisitor ) return ((TemplateParserVisitor<? extends T>)visitor).visitExprPart(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StmtPartContext extends PartContext {
		public JinjaStatementContext jinjaStatement() {
			return getRuleContext(JinjaStatementContext.class,0);
		}
		public StmtPartContext(PartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).enterStmtPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).exitStmtPart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateParserVisitor ) return ((TemplateParserVisitor<? extends T>)visitor).visitStmtPart(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TextPartContext extends PartContext {
		public TerminalNode TEXT() { return getToken(TemplateParser.TEXT, 0); }
		public TextPartContext(PartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).enterTextPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).exitTextPart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateParserVisitor ) return ((TemplateParserVisitor<? extends T>)visitor).visitTextPart(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlPartContext extends PartContext {
		public HtmlElementContext htmlElement() {
			return getRuleContext(HtmlElementContext.class,0);
		}
		public HtmlPartContext(PartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).enterHtmlPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).exitHtmlPart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateParserVisitor ) return ((TemplateParserVisitor<? extends T>)visitor).visitHtmlPart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PartContext part() throws RecognitionException {
		PartContext _localctx = new PartContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_part);
		try {
			setState(26);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TEXT:
				_localctx = new TextPartContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(22);
				match(TEXT);
				}
				break;
			case OPEN_EXPR:
				_localctx = new ExprPartContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(23);
				jinjaExpression();
				}
				break;
			case OPEN_STMT:
				_localctx = new StmtPartContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(24);
				jinjaStatement();
				}
				break;
			case TAG_START:
				_localctx = new HtmlPartContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(25);
				htmlElement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class JinjaExpressionContext extends ParserRuleContext {
		public JinjaExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinjaExpression; }
	 
		public JinjaExpressionContext() { }
		public void copyFrom(JinjaExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JinjaExprContext extends JinjaExpressionContext {
		public Token content;
		public TerminalNode OPEN_EXPR() { return getToken(TemplateParser.OPEN_EXPR, 0); }
		public TerminalNode CLOSE_EXPR() { return getToken(TemplateParser.CLOSE_EXPR, 0); }
		public TerminalNode PY_EXPR_CONTENT() { return getToken(TemplateParser.PY_EXPR_CONTENT, 0); }
		public JinjaExprContext(JinjaExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).enterJinjaExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).exitJinjaExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateParserVisitor ) return ((TemplateParserVisitor<? extends T>)visitor).visitJinjaExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JinjaExpressionContext jinjaExpression() throws RecognitionException {
		JinjaExpressionContext _localctx = new JinjaExpressionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_jinjaExpression);
		try {
			_localctx = new JinjaExprContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			match(OPEN_EXPR);
			setState(29);
			((JinjaExprContext)_localctx).content = match(PY_EXPR_CONTENT);
			setState(30);
			match(CLOSE_EXPR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class JinjaStatementContext extends ParserRuleContext {
		public JinjaStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinjaStatement; }
	 
		public JinjaStatementContext() { }
		public void copyFrom(JinjaStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JinjaStmtContext extends JinjaStatementContext {
		public Token content;
		public TerminalNode OPEN_STMT() { return getToken(TemplateParser.OPEN_STMT, 0); }
		public TerminalNode CLOSE_STMT() { return getToken(TemplateParser.CLOSE_STMT, 0); }
		public TerminalNode PY_STMT_CONTENT() { return getToken(TemplateParser.PY_STMT_CONTENT, 0); }
		public JinjaStmtContext(JinjaStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).enterJinjaStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).exitJinjaStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateParserVisitor ) return ((TemplateParserVisitor<? extends T>)visitor).visitJinjaStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JinjaStatementContext jinjaStatement() throws RecognitionException {
		JinjaStatementContext _localctx = new JinjaStatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_jinjaStatement);
		try {
			_localctx = new JinjaStmtContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			match(OPEN_STMT);
			setState(33);
			((JinjaStmtContext)_localctx).content = match(PY_STMT_CONTENT);
			setState(34);
			match(CLOSE_STMT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlElementContext extends ParserRuleContext {
		public HtmlElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlElement; }
	 
		public HtmlElementContext() { }
		public void copyFrom(HtmlElementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SelfClosingTagContext extends HtmlElementContext {
		public Token name;
		public TerminalNode TAG_START() { return getToken(TemplateParser.TAG_START, 0); }
		public TerminalNode TAG_SLASH_CLOSE() { return getToken(TemplateParser.TAG_SLASH_CLOSE, 0); }
		public TerminalNode TAG_NAME() { return getToken(TemplateParser.TAG_NAME, 0); }
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public SelfClosingTagContext(HtmlElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).enterSelfClosingTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).exitSelfClosingTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateParserVisitor ) return ((TemplateParserVisitor<? extends T>)visitor).visitSelfClosingTag(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StyleTagContext extends HtmlElementContext {
		public StyleContentContext cssContent;
		public List<TerminalNode> TAG_START() { return getTokens(TemplateParser.TAG_START); }
		public TerminalNode TAG_START(int i) {
			return getToken(TemplateParser.TAG_START, i);
		}
		public List<TerminalNode> STYLE_TAG() { return getTokens(TemplateParser.STYLE_TAG); }
		public TerminalNode STYLE_TAG(int i) {
			return getToken(TemplateParser.STYLE_TAG, i);
		}
		public List<TerminalNode> TAG_END() { return getTokens(TemplateParser.TAG_END); }
		public TerminalNode TAG_END(int i) {
			return getToken(TemplateParser.TAG_END, i);
		}
		public TerminalNode SLASH() { return getToken(TemplateParser.SLASH, 0); }
		public StyleContentContext styleContent() {
			return getRuleContext(StyleContentContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public StyleTagContext(HtmlElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).enterStyleTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).exitStyleTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateParserVisitor ) return ((TemplateParserVisitor<? extends T>)visitor).visitStyleTag(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FullTagContext extends HtmlElementContext {
		public Token name;
		public PartContext content;
		public Token endName;
		public List<TerminalNode> TAG_START() { return getTokens(TemplateParser.TAG_START); }
		public TerminalNode TAG_START(int i) {
			return getToken(TemplateParser.TAG_START, i);
		}
		public List<TerminalNode> TAG_END() { return getTokens(TemplateParser.TAG_END); }
		public TerminalNode TAG_END(int i) {
			return getToken(TemplateParser.TAG_END, i);
		}
		public TerminalNode SLASH() { return getToken(TemplateParser.SLASH, 0); }
		public List<TerminalNode> TAG_NAME() { return getTokens(TemplateParser.TAG_NAME); }
		public TerminalNode TAG_NAME(int i) {
			return getToken(TemplateParser.TAG_NAME, i);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public List<PartContext> part() {
			return getRuleContexts(PartContext.class);
		}
		public PartContext part(int i) {
			return getRuleContext(PartContext.class,i);
		}
		public FullTagContext(HtmlElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).enterFullTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).exitFullTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateParserVisitor ) return ((TemplateParserVisitor<? extends T>)visitor).visitFullTag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlElementContext htmlElement() throws RecognitionException {
		HtmlElementContext _localctx = new HtmlElementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_htmlElement);
		int _la;
		try {
			int _alt;
			setState(70);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new FullTagContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(36);
				match(TAG_START);
				setState(37);
				((FullTagContext)_localctx).name = match(TAG_NAME);
				setState(39);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TAG_NAME) {
					{
					setState(38);
					attributes();
					}
				}

				setState(41);
				match(TAG_END);
				setState(45);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(42);
						((FullTagContext)_localctx).content = part();
						}
						} 
					}
					setState(47);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				}
				setState(48);
				match(TAG_START);
				setState(49);
				match(SLASH);
				setState(50);
				((FullTagContext)_localctx).endName = match(TAG_NAME);
				setState(51);
				match(TAG_END);
				}
				break;
			case 2:
				_localctx = new SelfClosingTagContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(52);
				match(TAG_START);
				setState(53);
				((SelfClosingTagContext)_localctx).name = match(TAG_NAME);
				setState(55);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TAG_NAME) {
					{
					setState(54);
					attributes();
					}
				}

				setState(57);
				match(TAG_SLASH_CLOSE);
				}
				break;
			case 3:
				_localctx = new StyleTagContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(58);
				match(TAG_START);
				setState(59);
				match(STYLE_TAG);
				setState(61);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TAG_NAME) {
					{
					setState(60);
					attributes();
					}
				}

				setState(63);
				match(TAG_END);
				setState(64);
				((StyleTagContext)_localctx).cssContent = styleContent();
				setState(65);
				match(TAG_START);
				setState(66);
				match(SLASH);
				setState(67);
				match(STYLE_TAG);
				setState(68);
				match(TAG_END);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StyleContentContext extends ParserRuleContext {
		public StyleContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_styleContent; }
	 
		public StyleContentContext() { }
		public void copyFrom(StyleContentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssRawContentContext extends StyleContentContext {
		public List<TerminalNode> TEXT() { return getTokens(TemplateParser.TEXT); }
		public TerminalNode TEXT(int i) {
			return getToken(TemplateParser.TEXT, i);
		}
		public List<JinjaExpressionContext> jinjaExpression() {
			return getRuleContexts(JinjaExpressionContext.class);
		}
		public JinjaExpressionContext jinjaExpression(int i) {
			return getRuleContext(JinjaExpressionContext.class,i);
		}
		public List<JinjaStatementContext> jinjaStatement() {
			return getRuleContexts(JinjaStatementContext.class);
		}
		public JinjaStatementContext jinjaStatement(int i) {
			return getRuleContext(JinjaStatementContext.class,i);
		}
		public CssRawContentContext(StyleContentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).enterCssRawContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).exitCssRawContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateParserVisitor ) return ((TemplateParserVisitor<? extends T>)visitor).visitCssRawContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StyleContentContext styleContent() throws RecognitionException {
		StyleContentContext _localctx = new StyleContentContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_styleContent);
		int _la;
		try {
			_localctx = new CssRawContentContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 38L) != 0)) {
				{
				setState(75);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TEXT:
					{
					setState(72);
					match(TEXT);
					}
					break;
				case OPEN_EXPR:
					{
					setState(73);
					jinjaExpression();
					}
					break;
				case OPEN_STMT:
					{
					setState(74);
					jinjaStatement();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(79);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AttributesContext extends ParserRuleContext {
		public List<TerminalNode> TAG_NAME() { return getTokens(TemplateParser.TAG_NAME); }
		public TerminalNode TAG_NAME(int i) {
			return getToken(TemplateParser.TAG_NAME, i);
		}
		public List<TerminalNode> EQUALS() { return getTokens(TemplateParser.EQUALS); }
		public TerminalNode EQUALS(int i) {
			return getToken(TemplateParser.EQUALS, i);
		}
		public List<TerminalNode> ATTR_VALUE() { return getTokens(TemplateParser.ATTR_VALUE); }
		public TerminalNode ATTR_VALUE(int i) {
			return getToken(TemplateParser.ATTR_VALUE, i);
		}
		public AttributesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).enterAttributes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).exitAttributes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateParserVisitor ) return ((TemplateParserVisitor<? extends T>)visitor).visitAttributes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributesContext attributes() throws RecognitionException {
		AttributesContext _localctx = new AttributesContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_attributes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(80);
				match(TAG_NAME);
				setState(81);
				match(EQUALS);
				setState(82);
				match(ATTR_VALUE);
				}
				}
				setState(85); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TAG_NAME );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0014X\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0001\u0000\u0005\u0000\u0010"+
		"\b\u0000\n\u0000\f\u0000\u0013\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u001b\b\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004(\b\u0004"+
		"\u0001\u0004\u0001\u0004\u0005\u0004,\b\u0004\n\u0004\f\u0004/\t\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0003\u00048\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0003\u0004>\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004G\b\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005L\b\u0005\n\u0005\f\u0005"+
		"O\t\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0004\u0006T\b\u0006\u000b"+
		"\u0006\f\u0006U\u0001\u0006\u0000\u0000\u0007\u0000\u0002\u0004\u0006"+
		"\b\n\f\u0000\u0000^\u0000\u0011\u0001\u0000\u0000\u0000\u0002\u001a\u0001"+
		"\u0000\u0000\u0000\u0004\u001c\u0001\u0000\u0000\u0000\u0006 \u0001\u0000"+
		"\u0000\u0000\bF\u0001\u0000\u0000\u0000\nM\u0001\u0000\u0000\u0000\fS"+
		"\u0001\u0000\u0000\u0000\u000e\u0010\u0003\u0002\u0001\u0000\u000f\u000e"+
		"\u0001\u0000\u0000\u0000\u0010\u0013\u0001\u0000\u0000\u0000\u0011\u000f"+
		"\u0001\u0000\u0000\u0000\u0011\u0012\u0001\u0000\u0000\u0000\u0012\u0014"+
		"\u0001\u0000\u0000\u0000\u0013\u0011\u0001\u0000\u0000\u0000\u0014\u0015"+
		"\u0005\u0000\u0000\u0001\u0015\u0001\u0001\u0000\u0000\u0000\u0016\u001b"+
		"\u0005\u0005\u0000\u0000\u0017\u001b\u0003\u0004\u0002\u0000\u0018\u001b"+
		"\u0003\u0006\u0003\u0000\u0019\u001b\u0003\b\u0004\u0000\u001a\u0016\u0001"+
		"\u0000\u0000\u0000\u001a\u0017\u0001\u0000\u0000\u0000\u001a\u0018\u0001"+
		"\u0000\u0000\u0000\u001a\u0019\u0001\u0000\u0000\u0000\u001b\u0003\u0001"+
		"\u0000\u0000\u0000\u001c\u001d\u0005\u0001\u0000\u0000\u001d\u001e\u0005"+
		"\b\u0000\u0000\u001e\u001f\u0005\u0007\u0000\u0000\u001f\u0005\u0001\u0000"+
		"\u0000\u0000 !\u0005\u0002\u0000\u0000!\"\u0005\n\u0000\u0000\"#\u0005"+
		"\t\u0000\u0000#\u0007\u0001\u0000\u0000\u0000$%\u0005\u0004\u0000\u0000"+
		"%\'\u0005\u0011\u0000\u0000&(\u0003\f\u0006\u0000\'&\u0001\u0000\u0000"+
		"\u0000\'(\u0001\u0000\u0000\u0000()\u0001\u0000\u0000\u0000)-\u0005\r"+
		"\u0000\u0000*,\u0003\u0002\u0001\u0000+*\u0001\u0000\u0000\u0000,/\u0001"+
		"\u0000\u0000\u0000-+\u0001\u0000\u0000\u0000-.\u0001\u0000\u0000\u0000"+
		".0\u0001\u0000\u0000\u0000/-\u0001\u0000\u0000\u000001\u0005\u0004\u0000"+
		"\u000012\u0005\u000f\u0000\u000023\u0005\u0011\u0000\u00003G\u0005\r\u0000"+
		"\u000045\u0005\u0004\u0000\u000057\u0005\u0011\u0000\u000068\u0003\f\u0006"+
		"\u000076\u0001\u0000\u0000\u000078\u0001\u0000\u0000\u000089\u0001\u0000"+
		"\u0000\u00009G\u0005\u000e\u0000\u0000:;\u0005\u0004\u0000\u0000;=\u0005"+
		"\u0012\u0000\u0000<>\u0003\f\u0006\u0000=<\u0001\u0000\u0000\u0000=>\u0001"+
		"\u0000\u0000\u0000>?\u0001\u0000\u0000\u0000?@\u0005\r\u0000\u0000@A\u0003"+
		"\n\u0005\u0000AB\u0005\u0004\u0000\u0000BC\u0005\u000f\u0000\u0000CD\u0005"+
		"\u0012\u0000\u0000DE\u0005\r\u0000\u0000EG\u0001\u0000\u0000\u0000F$\u0001"+
		"\u0000\u0000\u0000F4\u0001\u0000\u0000\u0000F:\u0001\u0000\u0000\u0000"+
		"G\t\u0001\u0000\u0000\u0000HL\u0005\u0005\u0000\u0000IL\u0003\u0004\u0002"+
		"\u0000JL\u0003\u0006\u0003\u0000KH\u0001\u0000\u0000\u0000KI\u0001\u0000"+
		"\u0000\u0000KJ\u0001\u0000\u0000\u0000LO\u0001\u0000\u0000\u0000MK\u0001"+
		"\u0000\u0000\u0000MN\u0001\u0000\u0000\u0000N\u000b\u0001\u0000\u0000"+
		"\u0000OM\u0001\u0000\u0000\u0000PQ\u0005\u0011\u0000\u0000QR\u0005\u0010"+
		"\u0000\u0000RT\u0005\u0013\u0000\u0000SP\u0001\u0000\u0000\u0000TU\u0001"+
		"\u0000\u0000\u0000US\u0001\u0000\u0000\u0000UV\u0001\u0000\u0000\u0000"+
		"V\r\u0001\u0000\u0000\u0000\n\u0011\u001a\'-7=FKMU";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}