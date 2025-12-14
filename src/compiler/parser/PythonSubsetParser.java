// Generated from C:/Users/dell/IdeaProjects/TemplateCompiler2/src/compiler/grammar/PythonSubsetParser.g4 by ANTLR 4.13.2

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
public class PythonSubsetParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NEWLINE=1, WS=2, DEF=3, IF=4, ELIF=5, ELSE=6, FOR=7, IN=8, RETURN=9, TRUE=10, 
		FALSE=11, EQ=12, EQEQ=13, LT=14, GT=15, LTEQ=16, GTEQ=17, PLUS=18, MINUS=19, 
		STAR=20, SLASH=21, LPAREN=22, RPAREN=23, LBRACK=24, RBRACK=25, COLON=26, 
		DOT=27, COMMA=28, NUMBER=29, STRING=30, NAME=31, COMMENT=32, INDENT=33, 
		DEDENT=34;
	public static final int
		RULE_program = 0, RULE_stmt = 1, RULE_simpleStmt = 2, RULE_compoundStmt = 3, 
		RULE_ifStmt = 4, RULE_forStmt = 5, RULE_suite = 6, RULE_test = 7, RULE_expr = 8, 
		RULE_atom = 9, RULE_listLiteral = 10, RULE_arglist = 11;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "stmt", "simpleStmt", "compoundStmt", "ifStmt", "forStmt", 
			"suite", "test", "expr", "atom", "listLiteral", "arglist"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'def'", "'if'", "'elif'", "'else'", "'for'", "'in'", 
			"'return'", "'true'", "'false'", "'='", "'=='", "'<'", "'>'", "'<='", 
			"'>='", "'+'", "'-'", "'*'", "'/'", "'('", "')'", "'['", "']'", "':'", 
			"'.'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "NEWLINE", "WS", "DEF", "IF", "ELIF", "ELSE", "FOR", "IN", "RETURN", 
			"TRUE", "FALSE", "EQ", "EQEQ", "LT", "GT", "LTEQ", "GTEQ", "PLUS", "MINUS", 
			"STAR", "SLASH", "LPAREN", "RPAREN", "LBRACK", "RBRACK", "COLON", "DOT", 
			"COMMA", "NUMBER", "STRING", "NAME", "COMMENT", "INDENT", "DEDENT"
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
	public String getGrammarFileName() { return "PythonSubsetParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PythonSubsetParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(PythonSubsetParser.EOF, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonSubsetParserListener ) ((PythonSubsetParserListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonSubsetParserListener ) ((PythonSubsetParserListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonSubsetParserVisitor ) return ((PythonSubsetParserVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(27);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3779071120L) != 0)) {
				{
				{
				setState(24);
				stmt();
				}
				}
				setState(29);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(30);
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
	public static class StmtContext extends ParserRuleContext {
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
	 
		public StmtContext() { }
		public void copyFrom(StmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SimpleContext extends StmtContext {
		public SimpleStmtContext simpleStmt() {
			return getRuleContext(SimpleStmtContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(PythonSubsetParser.NEWLINE, 0); }
		public SimpleContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonSubsetParserListener ) ((PythonSubsetParserListener)listener).enterSimple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonSubsetParserListener ) ((PythonSubsetParserListener)listener).exitSimple(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonSubsetParserVisitor ) return ((PythonSubsetParserVisitor<? extends T>)visitor).visitSimple(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CompoundContext extends StmtContext {
		public CompoundStmtContext compoundStmt() {
			return getRuleContext(CompoundStmtContext.class,0);
		}
		public CompoundContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonSubsetParserListener ) ((PythonSubsetParserListener)listener).enterCompound(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonSubsetParserListener ) ((PythonSubsetParserListener)listener).exitCompound(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonSubsetParserVisitor ) return ((PythonSubsetParserVisitor<? extends T>)visitor).visitCompound(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stmt);
		try {
			setState(36);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
			case FALSE:
			case LPAREN:
			case LBRACK:
			case NUMBER:
			case STRING:
			case NAME:
				_localctx = new SimpleContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(32);
				simpleStmt();
				setState(33);
				match(NEWLINE);
				}
				break;
			case IF:
			case FOR:
				_localctx = new CompoundContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(35);
				compoundStmt();
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
	public static class SimpleStmtContext extends ParserRuleContext {
		public SimpleStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleStmt; }
	 
		public SimpleStmtContext() { }
		public void copyFrom(SimpleStmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprStmtContext extends SimpleStmtContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprStmtContext(SimpleStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonSubsetParserListener ) ((PythonSubsetParserListener)listener).enterExprStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonSubsetParserListener ) ((PythonSubsetParserListener)listener).exitExprStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonSubsetParserVisitor ) return ((PythonSubsetParserVisitor<? extends T>)visitor).visitExprStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignContext extends SimpleStmtContext {
		public TerminalNode NAME() { return getToken(PythonSubsetParser.NAME, 0); }
		public TerminalNode EQ() { return getToken(PythonSubsetParser.EQ, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignContext(SimpleStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonSubsetParserListener ) ((PythonSubsetParserListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonSubsetParserListener ) ((PythonSubsetParserListener)listener).exitAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonSubsetParserVisitor ) return ((PythonSubsetParserVisitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleStmtContext simpleStmt() throws RecognitionException {
		SimpleStmtContext _localctx = new SimpleStmtContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_simpleStmt);
		try {
			setState(42);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				_localctx = new ExprStmtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(38);
				expr(0);
				}
				break;
			case 2:
				_localctx = new AssignContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(39);
				match(NAME);
				setState(40);
				match(EQ);
				setState(41);
				expr(0);
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
	public static class CompoundStmtContext extends ParserRuleContext {
		public CompoundStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compoundStmt; }
	 
		public CompoundStmtContext() { }
		public void copyFrom(CompoundStmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ForRuleContext extends CompoundStmtContext {
		public ForStmtContext forStmt() {
			return getRuleContext(ForStmtContext.class,0);
		}
		public ForRuleContext(CompoundStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonSubsetParserListener ) ((PythonSubsetParserListener)listener).enterForRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonSubsetParserListener ) ((PythonSubsetParserListener)listener).exitForRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonSubsetParserVisitor ) return ((PythonSubsetParserVisitor<? extends T>)visitor).visitForRule(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfRuleContext extends CompoundStmtContext {
		public IfStmtContext ifStmt() {
			return getRuleContext(IfStmtContext.class,0);
		}
		public IfRuleContext(CompoundStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonSubsetParserListener ) ((PythonSubsetParserListener)listener).enterIfRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonSubsetParserListener ) ((PythonSubsetParserListener)listener).exitIfRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonSubsetParserVisitor ) return ((PythonSubsetParserVisitor<? extends T>)visitor).visitIfRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompoundStmtContext compoundStmt() throws RecognitionException {
		CompoundStmtContext _localctx = new CompoundStmtContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_compoundStmt);
		try {
			setState(46);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				_localctx = new IfRuleContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(44);
				ifStmt();
				}
				break;
			case FOR:
				_localctx = new ForRuleContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(45);
				forStmt();
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
	public static class IfStmtContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(PythonSubsetParser.IF, 0); }
		public List<TestContext> test() {
			return getRuleContexts(TestContext.class);
		}
		public TestContext test(int i) {
			return getRuleContext(TestContext.class,i);
		}
		public List<TerminalNode> COLON() { return getTokens(PythonSubsetParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(PythonSubsetParser.COLON, i);
		}
		public List<SuiteContext> suite() {
			return getRuleContexts(SuiteContext.class);
		}
		public SuiteContext suite(int i) {
			return getRuleContext(SuiteContext.class,i);
		}
		public List<TerminalNode> ELIF() { return getTokens(PythonSubsetParser.ELIF); }
		public TerminalNode ELIF(int i) {
			return getToken(PythonSubsetParser.ELIF, i);
		}
		public TerminalNode ELSE() { return getToken(PythonSubsetParser.ELSE, 0); }
		public IfStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonSubsetParserListener ) ((PythonSubsetParserListener)listener).enterIfStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonSubsetParserListener ) ((PythonSubsetParserListener)listener).exitIfStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonSubsetParserVisitor ) return ((PythonSubsetParserVisitor<? extends T>)visitor).visitIfStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStmtContext ifStmt() throws RecognitionException {
		IfStmtContext _localctx = new IfStmtContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_ifStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			match(IF);
			setState(49);
			test();
			setState(50);
			match(COLON);
			setState(51);
			suite();
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELIF) {
				{
				{
				setState(52);
				match(ELIF);
				setState(53);
				test();
				setState(54);
				match(COLON);
				setState(55);
				suite();
				}
				}
				setState(61);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(62);
				match(ELSE);
				setState(63);
				match(COLON);
				setState(64);
				suite();
				}
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
	public static class ForStmtContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(PythonSubsetParser.FOR, 0); }
		public TerminalNode NAME() { return getToken(PythonSubsetParser.NAME, 0); }
		public TerminalNode IN() { return getToken(PythonSubsetParser.IN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode COLON() { return getToken(PythonSubsetParser.COLON, 0); }
		public SuiteContext suite() {
			return getRuleContext(SuiteContext.class,0);
		}
		public ForStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonSubsetParserListener ) ((PythonSubsetParserListener)listener).enterForStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonSubsetParserListener ) ((PythonSubsetParserListener)listener).exitForStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonSubsetParserVisitor ) return ((PythonSubsetParserVisitor<? extends T>)visitor).visitForStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStmtContext forStmt() throws RecognitionException {
		ForStmtContext _localctx = new ForStmtContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_forStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			match(FOR);
			setState(68);
			match(NAME);
			setState(69);
			match(IN);
			setState(70);
			expr(0);
			setState(71);
			match(COLON);
			setState(72);
			suite();
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
	public static class SuiteContext extends ParserRuleContext {
		public SimpleStmtContext simpleStmt() {
			return getRuleContext(SimpleStmtContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(PythonSubsetParser.NEWLINE, 0); }
		public TerminalNode INDENT() { return getToken(PythonSubsetParser.INDENT, 0); }
		public TerminalNode DEDENT() { return getToken(PythonSubsetParser.DEDENT, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public SuiteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_suite; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonSubsetParserListener ) ((PythonSubsetParserListener)listener).enterSuite(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonSubsetParserListener ) ((PythonSubsetParserListener)listener).exitSuite(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonSubsetParserVisitor ) return ((PythonSubsetParserVisitor<? extends T>)visitor).visitSuite(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SuiteContext suite() throws RecognitionException {
		SuiteContext _localctx = new SuiteContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_suite);
		int _la;
		try {
			setState(86);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
			case FALSE:
			case LPAREN:
			case LBRACK:
			case NUMBER:
			case STRING:
			case NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(74);
				simpleStmt();
				setState(75);
				match(NEWLINE);
				}
				break;
			case NEWLINE:
				enterOuterAlt(_localctx, 2);
				{
				setState(77);
				match(NEWLINE);
				setState(78);
				match(INDENT);
				setState(80); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(79);
					stmt();
					}
					}
					setState(82); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 3779071120L) != 0) );
				setState(84);
				match(DEDENT);
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
	public static class TestContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_test; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonSubsetParserListener ) ((PythonSubsetParserListener)listener).enterTest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonSubsetParserListener ) ((PythonSubsetParserListener)listener).exitTest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonSubsetParserVisitor ) return ((PythonSubsetParserVisitor<? extends T>)visitor).visitTest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TestContext test() throws RecognitionException {
		TestContext _localctx = new TestContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_test);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			expr(0);
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
	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ComparisonContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode LT() { return getToken(PythonSubsetParser.LT, 0); }
		public TerminalNode LTEQ() { return getToken(PythonSubsetParser.LTEQ, 0); }
		public TerminalNode GT() { return getToken(PythonSubsetParser.GT, 0); }
		public TerminalNode GTEQ() { return getToken(PythonSubsetParser.GTEQ, 0); }
		public TerminalNode EQEQ() { return getToken(PythonSubsetParser.EQEQ, 0); }
		public ComparisonContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonSubsetParserListener ) ((PythonSubsetParserListener)listener).enterComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonSubsetParserListener ) ((PythonSubsetParserListener)listener).exitComparison(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonSubsetParserVisitor ) return ((PythonSubsetParserVisitor<? extends T>)visitor).visitComparison(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AtomExprContext extends ExprContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public AtomExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonSubsetParserListener ) ((PythonSubsetParserListener)listener).enterAtomExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonSubsetParserListener ) ((PythonSubsetParserListener)listener).exitAtomExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonSubsetParserVisitor ) return ((PythonSubsetParserVisitor<? extends T>)visitor).visitAtomExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AddSubContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(PythonSubsetParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(PythonSubsetParser.MINUS, 0); }
		public AddSubContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonSubsetParserListener ) ((PythonSubsetParserListener)listener).enterAddSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonSubsetParserListener ) ((PythonSubsetParserListener)listener).exitAddSub(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonSubsetParserVisitor ) return ((PythonSubsetParserVisitor<? extends T>)visitor).visitAddSub(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MulDivContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode STAR() { return getToken(PythonSubsetParser.STAR, 0); }
		public TerminalNode SLASH() { return getToken(PythonSubsetParser.SLASH, 0); }
		public MulDivContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonSubsetParserListener ) ((PythonSubsetParserListener)listener).enterMulDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonSubsetParserListener ) ((PythonSubsetParserListener)listener).exitMulDiv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonSubsetParserVisitor ) return ((PythonSubsetParserVisitor<? extends T>)visitor).visitMulDiv(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new AtomExprContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(91);
			atom(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(104);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(102);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						_localctx = new MulDivContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(93);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(94);
						_la = _input.LA(1);
						if ( !(_la==STAR || _la==SLASH) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(95);
						expr(5);
						}
						break;
					case 2:
						{
						_localctx = new AddSubContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(96);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(97);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(98);
						expr(4);
						}
						break;
					case 3:
						{
						_localctx = new ComparisonContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(99);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(100);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 253952L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(101);
						expr(3);
						}
						break;
					}
					} 
				}
				setState(106);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AtomContext extends ParserRuleContext {
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
	 
		public AtomContext() { }
		public void copyFrom(AtomContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CallContext extends AtomContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(PythonSubsetParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(PythonSubsetParser.RPAREN, 0); }
		public ArglistContext arglist() {
			return getRuleContext(ArglistContext.class,0);
		}
		public CallContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonSubsetParserListener ) ((PythonSubsetParserListener)listener).enterCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonSubsetParserListener ) ((PythonSubsetParserListener)listener).exitCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonSubsetParserVisitor ) return ((PythonSubsetParserVisitor<? extends T>)visitor).visitCall(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NumberContext extends AtomContext {
		public TerminalNode NUMBER() { return getToken(PythonSubsetParser.NUMBER, 0); }
		public NumberContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonSubsetParserListener ) ((PythonSubsetParserListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonSubsetParserListener ) ((PythonSubsetParserListener)listener).exitNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonSubsetParserVisitor ) return ((PythonSubsetParserVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TrueLitContext extends AtomContext {
		public TerminalNode TRUE() { return getToken(PythonSubsetParser.TRUE, 0); }
		public TrueLitContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonSubsetParserListener ) ((PythonSubsetParserListener)listener).enterTrueLit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonSubsetParserListener ) ((PythonSubsetParserListener)listener).exitTrueLit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonSubsetParserVisitor ) return ((PythonSubsetParserVisitor<? extends T>)visitor).visitTrueLit(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParenContext extends AtomContext {
		public TerminalNode LPAREN() { return getToken(PythonSubsetParser.LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(PythonSubsetParser.RPAREN, 0); }
		public ParenContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonSubsetParserListener ) ((PythonSubsetParserListener)listener).enterParen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonSubsetParserListener ) ((PythonSubsetParserListener)listener).exitParen(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonSubsetParserVisitor ) return ((PythonSubsetParserVisitor<? extends T>)visitor).visitParen(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StringContext extends AtomContext {
		public TerminalNode STRING() { return getToken(PythonSubsetParser.STRING, 0); }
		public StringContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonSubsetParserListener ) ((PythonSubsetParserListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonSubsetParserListener ) ((PythonSubsetParserListener)listener).exitString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonSubsetParserVisitor ) return ((PythonSubsetParserVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AttrAccessContext extends AtomContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public TerminalNode DOT() { return getToken(PythonSubsetParser.DOT, 0); }
		public TerminalNode NAME() { return getToken(PythonSubsetParser.NAME, 0); }
		public AttrAccessContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonSubsetParserListener ) ((PythonSubsetParserListener)listener).enterAttrAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonSubsetParserListener ) ((PythonSubsetParserListener)listener).exitAttrAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonSubsetParserVisitor ) return ((PythonSubsetParserVisitor<? extends T>)visitor).visitAttrAccess(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SubscriptContext extends AtomContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public TerminalNode LBRACK() { return getToken(PythonSubsetParser.LBRACK, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RBRACK() { return getToken(PythonSubsetParser.RBRACK, 0); }
		public SubscriptContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonSubsetParserListener ) ((PythonSubsetParserListener)listener).enterSubscript(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonSubsetParserListener ) ((PythonSubsetParserListener)listener).exitSubscript(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonSubsetParserVisitor ) return ((PythonSubsetParserVisitor<? extends T>)visitor).visitSubscript(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FalseLitContext extends AtomContext {
		public TerminalNode FALSE() { return getToken(PythonSubsetParser.FALSE, 0); }
		public FalseLitContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonSubsetParserListener ) ((PythonSubsetParserListener)listener).enterFalseLit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonSubsetParserListener ) ((PythonSubsetParserListener)listener).exitFalseLit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonSubsetParserVisitor ) return ((PythonSubsetParserVisitor<? extends T>)visitor).visitFalseLit(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NameContext extends AtomContext {
		public TerminalNode NAME() { return getToken(PythonSubsetParser.NAME, 0); }
		public NameContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonSubsetParserListener ) ((PythonSubsetParserListener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonSubsetParserListener ) ((PythonSubsetParserListener)listener).exitName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonSubsetParserVisitor ) return ((PythonSubsetParserVisitor<? extends T>)visitor).visitName(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ListContext extends AtomContext {
		public ListLiteralContext listLiteral() {
			return getRuleContext(ListLiteralContext.class,0);
		}
		public ListContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonSubsetParserListener ) ((PythonSubsetParserListener)listener).enterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonSubsetParserListener ) ((PythonSubsetParserListener)listener).exitList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonSubsetParserVisitor ) return ((PythonSubsetParserVisitor<? extends T>)visitor).visitList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		return atom(0);
	}

	private AtomContext atom(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AtomContext _localctx = new AtomContext(_ctx, _parentState);
		AtomContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_atom, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME:
				{
				_localctx = new NameContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(108);
				match(NAME);
				}
				break;
			case NUMBER:
				{
				_localctx = new NumberContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(109);
				match(NUMBER);
				}
				break;
			case STRING:
				{
				_localctx = new StringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(110);
				match(STRING);
				}
				break;
			case TRUE:
				{
				_localctx = new TrueLitContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(111);
				match(TRUE);
				}
				break;
			case FALSE:
				{
				_localctx = new FalseLitContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(112);
				match(FALSE);
				}
				break;
			case LPAREN:
				{
				_localctx = new ParenContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(113);
				match(LPAREN);
				setState(114);
				expr(0);
				setState(115);
				match(RPAREN);
				}
				break;
			case LBRACK:
				{
				_localctx = new ListContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(117);
				listLiteral();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(136);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(134);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
					case 1:
						{
						_localctx = new AttrAccessContext(new AtomContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_atom);
						setState(120);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(121);
						match(DOT);
						setState(122);
						match(NAME);
						}
						break;
					case 2:
						{
						_localctx = new SubscriptContext(new AtomContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_atom);
						setState(123);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(124);
						match(LBRACK);
						setState(125);
						expr(0);
						setState(126);
						match(RBRACK);
						}
						break;
					case 3:
						{
						_localctx = new CallContext(new AtomContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_atom);
						setState(128);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(129);
						match(LPAREN);
						setState(131);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3779070976L) != 0)) {
							{
							setState(130);
							arglist();
							}
						}

						setState(133);
						match(RPAREN);
						}
						break;
					}
					} 
				}
				setState(138);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ListLiteralContext extends ParserRuleContext {
		public TerminalNode LBRACK() { return getToken(PythonSubsetParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(PythonSubsetParser.RBRACK, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PythonSubsetParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PythonSubsetParser.COMMA, i);
		}
		public ListLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonSubsetParserListener ) ((PythonSubsetParserListener)listener).enterListLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonSubsetParserListener ) ((PythonSubsetParserListener)listener).exitListLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonSubsetParserVisitor ) return ((PythonSubsetParserVisitor<? extends T>)visitor).visitListLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListLiteralContext listLiteral() throws RecognitionException {
		ListLiteralContext _localctx = new ListLiteralContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_listLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(LBRACK);
			setState(148);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3779070976L) != 0)) {
				{
				setState(140);
				expr(0);
				setState(145);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(141);
					match(COMMA);
					setState(142);
					expr(0);
					}
					}
					setState(147);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(150);
			match(RBRACK);
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
	public static class ArglistContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PythonSubsetParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PythonSubsetParser.COMMA, i);
		}
		public ArglistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arglist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonSubsetParserListener ) ((PythonSubsetParserListener)listener).enterArglist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonSubsetParserListener ) ((PythonSubsetParserListener)listener).exitArglist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonSubsetParserVisitor ) return ((PythonSubsetParserVisitor<? extends T>)visitor).visitArglist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArglistContext arglist() throws RecognitionException {
		ArglistContext _localctx = new ArglistContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_arglist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			expr(0);
			setState(157);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(153);
				match(COMMA);
				setState(154);
				expr(0);
				}
				}
				setState(159);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 8:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 9:
			return atom_sempred((AtomContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		case 1:
			return precpred(_ctx, 3);
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean atom_sempred(AtomContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 4);
		case 4:
			return precpred(_ctx, 3);
		case 5:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\"\u00a1\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0001"+
		"\u0000\u0005\u0000\u001a\b\u0000\n\u0000\f\u0000\u001d\t\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001"+
		"%\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002"+
		"+\b\u0002\u0001\u0003\u0001\u0003\u0003\u0003/\b\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0005\u0004:\b\u0004\n\u0004\f\u0004=\t\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0003\u0004B\b\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0004"+
		"\u0006Q\b\u0006\u000b\u0006\f\u0006R\u0001\u0006\u0001\u0006\u0003\u0006"+
		"W\b\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0005\bg\b"+
		"\b\n\b\f\bj\t\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\tw\b\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003"+
		"\t\u0084\b\t\u0001\t\u0005\t\u0087\b\t\n\t\f\t\u008a\t\t\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0005\n\u0090\b\n\n\n\f\n\u0093\t\n\u0003\n\u0095\b"+
		"\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u009c"+
		"\b\u000b\n\u000b\f\u000b\u009f\t\u000b\u0001\u000b\u0000\u0002\u0010\u0012"+
		"\f\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0000\u0003"+
		"\u0001\u0000\u0014\u0015\u0001\u0000\u0012\u0013\u0001\u0000\r\u0011\u00ac"+
		"\u0000\u001b\u0001\u0000\u0000\u0000\u0002$\u0001\u0000\u0000\u0000\u0004"+
		"*\u0001\u0000\u0000\u0000\u0006.\u0001\u0000\u0000\u0000\b0\u0001\u0000"+
		"\u0000\u0000\nC\u0001\u0000\u0000\u0000\fV\u0001\u0000\u0000\u0000\u000e"+
		"X\u0001\u0000\u0000\u0000\u0010Z\u0001\u0000\u0000\u0000\u0012v\u0001"+
		"\u0000\u0000\u0000\u0014\u008b\u0001\u0000\u0000\u0000\u0016\u0098\u0001"+
		"\u0000\u0000\u0000\u0018\u001a\u0003\u0002\u0001\u0000\u0019\u0018\u0001"+
		"\u0000\u0000\u0000\u001a\u001d\u0001\u0000\u0000\u0000\u001b\u0019\u0001"+
		"\u0000\u0000\u0000\u001b\u001c\u0001\u0000\u0000\u0000\u001c\u001e\u0001"+
		"\u0000\u0000\u0000\u001d\u001b\u0001\u0000\u0000\u0000\u001e\u001f\u0005"+
		"\u0000\u0000\u0001\u001f\u0001\u0001\u0000\u0000\u0000 !\u0003\u0004\u0002"+
		"\u0000!\"\u0005\u0001\u0000\u0000\"%\u0001\u0000\u0000\u0000#%\u0003\u0006"+
		"\u0003\u0000$ \u0001\u0000\u0000\u0000$#\u0001\u0000\u0000\u0000%\u0003"+
		"\u0001\u0000\u0000\u0000&+\u0003\u0010\b\u0000\'(\u0005\u001f\u0000\u0000"+
		"()\u0005\f\u0000\u0000)+\u0003\u0010\b\u0000*&\u0001\u0000\u0000\u0000"+
		"*\'\u0001\u0000\u0000\u0000+\u0005\u0001\u0000\u0000\u0000,/\u0003\b\u0004"+
		"\u0000-/\u0003\n\u0005\u0000.,\u0001\u0000\u0000\u0000.-\u0001\u0000\u0000"+
		"\u0000/\u0007\u0001\u0000\u0000\u000001\u0005\u0004\u0000\u000012\u0003"+
		"\u000e\u0007\u000023\u0005\u001a\u0000\u00003;\u0003\f\u0006\u000045\u0005"+
		"\u0005\u0000\u000056\u0003\u000e\u0007\u000067\u0005\u001a\u0000\u0000"+
		"78\u0003\f\u0006\u00008:\u0001\u0000\u0000\u000094\u0001\u0000\u0000\u0000"+
		":=\u0001\u0000\u0000\u0000;9\u0001\u0000\u0000\u0000;<\u0001\u0000\u0000"+
		"\u0000<A\u0001\u0000\u0000\u0000=;\u0001\u0000\u0000\u0000>?\u0005\u0006"+
		"\u0000\u0000?@\u0005\u001a\u0000\u0000@B\u0003\f\u0006\u0000A>\u0001\u0000"+
		"\u0000\u0000AB\u0001\u0000\u0000\u0000B\t\u0001\u0000\u0000\u0000CD\u0005"+
		"\u0007\u0000\u0000DE\u0005\u001f\u0000\u0000EF\u0005\b\u0000\u0000FG\u0003"+
		"\u0010\b\u0000GH\u0005\u001a\u0000\u0000HI\u0003\f\u0006\u0000I\u000b"+
		"\u0001\u0000\u0000\u0000JK\u0003\u0004\u0002\u0000KL\u0005\u0001\u0000"+
		"\u0000LW\u0001\u0000\u0000\u0000MN\u0005\u0001\u0000\u0000NP\u0005!\u0000"+
		"\u0000OQ\u0003\u0002\u0001\u0000PO\u0001\u0000\u0000\u0000QR\u0001\u0000"+
		"\u0000\u0000RP\u0001\u0000\u0000\u0000RS\u0001\u0000\u0000\u0000ST\u0001"+
		"\u0000\u0000\u0000TU\u0005\"\u0000\u0000UW\u0001\u0000\u0000\u0000VJ\u0001"+
		"\u0000\u0000\u0000VM\u0001\u0000\u0000\u0000W\r\u0001\u0000\u0000\u0000"+
		"XY\u0003\u0010\b\u0000Y\u000f\u0001\u0000\u0000\u0000Z[\u0006\b\uffff"+
		"\uffff\u0000[\\\u0003\u0012\t\u0000\\h\u0001\u0000\u0000\u0000]^\n\u0004"+
		"\u0000\u0000^_\u0007\u0000\u0000\u0000_g\u0003\u0010\b\u0005`a\n\u0003"+
		"\u0000\u0000ab\u0007\u0001\u0000\u0000bg\u0003\u0010\b\u0004cd\n\u0002"+
		"\u0000\u0000de\u0007\u0002\u0000\u0000eg\u0003\u0010\b\u0003f]\u0001\u0000"+
		"\u0000\u0000f`\u0001\u0000\u0000\u0000fc\u0001\u0000\u0000\u0000gj\u0001"+
		"\u0000\u0000\u0000hf\u0001\u0000\u0000\u0000hi\u0001\u0000\u0000\u0000"+
		"i\u0011\u0001\u0000\u0000\u0000jh\u0001\u0000\u0000\u0000kl\u0006\t\uffff"+
		"\uffff\u0000lw\u0005\u001f\u0000\u0000mw\u0005\u001d\u0000\u0000nw\u0005"+
		"\u001e\u0000\u0000ow\u0005\n\u0000\u0000pw\u0005\u000b\u0000\u0000qr\u0005"+
		"\u0016\u0000\u0000rs\u0003\u0010\b\u0000st\u0005\u0017\u0000\u0000tw\u0001"+
		"\u0000\u0000\u0000uw\u0003\u0014\n\u0000vk\u0001\u0000\u0000\u0000vm\u0001"+
		"\u0000\u0000\u0000vn\u0001\u0000\u0000\u0000vo\u0001\u0000\u0000\u0000"+
		"vp\u0001\u0000\u0000\u0000vq\u0001\u0000\u0000\u0000vu\u0001\u0000\u0000"+
		"\u0000w\u0088\u0001\u0000\u0000\u0000xy\n\u0004\u0000\u0000yz\u0005\u001b"+
		"\u0000\u0000z\u0087\u0005\u001f\u0000\u0000{|\n\u0003\u0000\u0000|}\u0005"+
		"\u0018\u0000\u0000}~\u0003\u0010\b\u0000~\u007f\u0005\u0019\u0000\u0000"+
		"\u007f\u0087\u0001\u0000\u0000\u0000\u0080\u0081\n\u0002\u0000\u0000\u0081"+
		"\u0083\u0005\u0016\u0000\u0000\u0082\u0084\u0003\u0016\u000b\u0000\u0083"+
		"\u0082\u0001\u0000\u0000\u0000\u0083\u0084\u0001\u0000\u0000\u0000\u0084"+
		"\u0085\u0001\u0000\u0000\u0000\u0085\u0087\u0005\u0017\u0000\u0000\u0086"+
		"x\u0001\u0000\u0000\u0000\u0086{\u0001\u0000\u0000\u0000\u0086\u0080\u0001"+
		"\u0000\u0000\u0000\u0087\u008a\u0001\u0000\u0000\u0000\u0088\u0086\u0001"+
		"\u0000\u0000\u0000\u0088\u0089\u0001\u0000\u0000\u0000\u0089\u0013\u0001"+
		"\u0000\u0000\u0000\u008a\u0088\u0001\u0000\u0000\u0000\u008b\u0094\u0005"+
		"\u0018\u0000\u0000\u008c\u0091\u0003\u0010\b\u0000\u008d\u008e\u0005\u001c"+
		"\u0000\u0000\u008e\u0090\u0003\u0010\b\u0000\u008f\u008d\u0001\u0000\u0000"+
		"\u0000\u0090\u0093\u0001\u0000\u0000\u0000\u0091\u008f\u0001\u0000\u0000"+
		"\u0000\u0091\u0092\u0001\u0000\u0000\u0000\u0092\u0095\u0001\u0000\u0000"+
		"\u0000\u0093\u0091\u0001\u0000\u0000\u0000\u0094\u008c\u0001\u0000\u0000"+
		"\u0000\u0094\u0095\u0001\u0000\u0000\u0000\u0095\u0096\u0001\u0000\u0000"+
		"\u0000\u0096\u0097\u0005\u0019\u0000\u0000\u0097\u0015\u0001\u0000\u0000"+
		"\u0000\u0098\u009d\u0003\u0010\b\u0000\u0099\u009a\u0005\u001c\u0000\u0000"+
		"\u009a\u009c\u0003\u0010\b\u0000\u009b\u0099\u0001\u0000\u0000\u0000\u009c"+
		"\u009f\u0001\u0000\u0000\u0000\u009d\u009b\u0001\u0000\u0000\u0000\u009d"+
		"\u009e\u0001\u0000\u0000\u0000\u009e\u0017\u0001\u0000\u0000\u0000\u009f"+
		"\u009d\u0001\u0000\u0000\u0000\u0011\u001b$*.;ARVfhv\u0083\u0086\u0088"+
		"\u0091\u0094\u009d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}