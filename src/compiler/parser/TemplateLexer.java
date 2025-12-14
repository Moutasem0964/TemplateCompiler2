// Generated from C:/Users/dell/IdeaProjects/TemplateCompiler2/src/compiler/grammar/TemplateLexer.g4 by ANTLR 4.13.2

    package compiler.parser;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class TemplateLexer extends Lexer {
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
		PY_EXPR_MODE=1, PY_STMT_MODE=2, COMMENT_MODE=3, HTML_TAG_MODE=4;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE", "PY_EXPR_MODE", "PY_STMT_MODE", "COMMENT_MODE", "HTML_TAG_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"OPEN_EXPR", "OPEN_STMT", "OPEN_COMMENT", "TAG_START", "TEXT", "WS", 
			"CLOSE_EXPR", "PY_EXPR_CONTENT", "CLOSE_STMT", "PY_STMT_CONTENT", "CLOSE_COMMENT", 
			"COMMENT_CONTENT", "TAG_END", "TAG_SLASH_CLOSE", "SLASH", "EQUALS", "TAG_NAME", 
			"STYLE_TAG", "ATTR_VALUE", "TAG_WS"
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


	public TemplateLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "TemplateLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u0014\u00a6\u0006\uffff\uffff\u0006\uffff\uffff\u0006\uffff"+
		"\uffff\u0006\uffff\uffff\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0004\u0004"+
		"G\b\u0004\u000b\u0004\f\u0004H\u0001\u0005\u0004\u0005L\b\u0005\u000b"+
		"\u0005\f\u0005M\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0004"+
		"\u0007Z\b\u0007\u000b\u0007\f\u0007[\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\t\u0001\t\u0001\t\u0004\tf\b\t\u000b\t\f\tg\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\u000b\u0004\u000bp\b\u000b\u000b\u000b\f\u000b"+
		"q\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010"+
		"\u0005\u0010\u0083\b\u0010\n\u0010\f\u0010\u0086\t\u0010\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001"+
		"\u0012\u0005\u0012\u0090\b\u0012\n\u0012\f\u0012\u0093\t\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0005\u0012\u0098\b\u0012\n\u0012\f\u0012\u009b"+
		"\t\u0012\u0001\u0012\u0003\u0012\u009e\b\u0012\u0001\u0013\u0004\u0013"+
		"\u00a1\b\u0013\u000b\u0013\f\u0013\u00a2\u0001\u0013\u0001\u0013\u0001"+
		"q\u0000\u0014\u0005\u0001\u0007\u0002\t\u0003\u000b\u0004\r\u0005\u000f"+
		"\u0006\u0011\u0007\u0013\b\u0015\t\u0017\n\u0019\u000b\u001b\f\u001d\r"+
		"\u001f\u000e!\u000f#\u0010%\u0011\'\u0012)\u0013+\u0014\u0005\u0000\u0001"+
		"\u0002\u0003\u0004\u000f\u0002\u0000<<{{\u0003\u0000##%%{{\u0003\u0000"+
		"//AZaz\u0003\u0000\t\n\r\r  \u0001\u0000}}\u0001\u0000%%\u0002\u0000A"+
		"Zaz\u0004\u0000--0:AZaz\u0002\u0000SSss\u0002\u0000TTtt\u0002\u0000YY"+
		"yy\u0002\u0000LLll\u0002\u0000EEee\u0003\u0000\n\n\r\r\"\"\u0003\u0000"+
		"\n\n\r\r\'\'\u00af\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001"+
		"\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000"+
		"\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000"+
		"\u0000\u0001\u0011\u0001\u0000\u0000\u0000\u0001\u0013\u0001\u0000\u0000"+
		"\u0000\u0002\u0015\u0001\u0000\u0000\u0000\u0002\u0017\u0001\u0000\u0000"+
		"\u0000\u0003\u0019\u0001\u0000\u0000\u0000\u0003\u001b\u0001\u0000\u0000"+
		"\u0000\u0004\u001d\u0001\u0000\u0000\u0000\u0004\u001f\u0001\u0000\u0000"+
		"\u0000\u0004!\u0001\u0000\u0000\u0000\u0004#\u0001\u0000\u0000\u0000\u0004"+
		"%\u0001\u0000\u0000\u0000\u0004\'\u0001\u0000\u0000\u0000\u0004)\u0001"+
		"\u0000\u0000\u0000\u0004+\u0001\u0000\u0000\u0000\u0005-\u0001\u0000\u0000"+
		"\u0000\u00072\u0001\u0000\u0000\u0000\t7\u0001\u0000\u0000\u0000\u000b"+
		"=\u0001\u0000\u0000\u0000\rF\u0001\u0000\u0000\u0000\u000fK\u0001\u0000"+
		"\u0000\u0000\u0011Q\u0001\u0000\u0000\u0000\u0013Y\u0001\u0000\u0000\u0000"+
		"\u0015]\u0001\u0000\u0000\u0000\u0017e\u0001\u0000\u0000\u0000\u0019i"+
		"\u0001\u0000\u0000\u0000\u001bo\u0001\u0000\u0000\u0000\u001ds\u0001\u0000"+
		"\u0000\u0000\u001fw\u0001\u0000\u0000\u0000!|\u0001\u0000\u0000\u0000"+
		"#~\u0001\u0000\u0000\u0000%\u0080\u0001\u0000\u0000\u0000\'\u0087\u0001"+
		"\u0000\u0000\u0000)\u009d\u0001\u0000\u0000\u0000+\u00a0\u0001\u0000\u0000"+
		"\u0000-.\u0005{\u0000\u0000./\u0005{\u0000\u0000/0\u0001\u0000\u0000\u0000"+
		"01\u0006\u0000\u0000\u00001\u0006\u0001\u0000\u0000\u000023\u0005{\u0000"+
		"\u000034\u0005%\u0000\u000045\u0001\u0000\u0000\u000056\u0006\u0001\u0001"+
		"\u00006\b\u0001\u0000\u0000\u000078\u0005{\u0000\u000089\u0005#\u0000"+
		"\u00009:\u0001\u0000\u0000\u0000:;\u0006\u0002\u0002\u0000;<\u0006\u0002"+
		"\u0003\u0000<\n\u0001\u0000\u0000\u0000=>\u0005<\u0000\u0000>?\u0001\u0000"+
		"\u0000\u0000?@\u0006\u0003\u0004\u0000@\f\u0001\u0000\u0000\u0000AG\b"+
		"\u0000\u0000\u0000BC\u0005{\u0000\u0000CG\b\u0001\u0000\u0000DE\u0005"+
		"<\u0000\u0000EG\b\u0002\u0000\u0000FA\u0001\u0000\u0000\u0000FB\u0001"+
		"\u0000\u0000\u0000FD\u0001\u0000\u0000\u0000GH\u0001\u0000\u0000\u0000"+
		"HF\u0001\u0000\u0000\u0000HI\u0001\u0000\u0000\u0000I\u000e\u0001\u0000"+
		"\u0000\u0000JL\u0007\u0003\u0000\u0000KJ\u0001\u0000\u0000\u0000LM\u0001"+
		"\u0000\u0000\u0000MK\u0001\u0000\u0000\u0000MN\u0001\u0000\u0000\u0000"+
		"NO\u0001\u0000\u0000\u0000OP\u0006\u0005\u0005\u0000P\u0010\u0001\u0000"+
		"\u0000\u0000QR\u0005}\u0000\u0000RS\u0005}\u0000\u0000ST\u0001\u0000\u0000"+
		"\u0000TU\u0006\u0006\u0006\u0000U\u0012\u0001\u0000\u0000\u0000VZ\b\u0004"+
		"\u0000\u0000WX\u0005}\u0000\u0000XZ\b\u0004\u0000\u0000YV\u0001\u0000"+
		"\u0000\u0000YW\u0001\u0000\u0000\u0000Z[\u0001\u0000\u0000\u0000[Y\u0001"+
		"\u0000\u0000\u0000[\\\u0001\u0000\u0000\u0000\\\u0014\u0001\u0000\u0000"+
		"\u0000]^\u0005%\u0000\u0000^_\u0005}\u0000\u0000_`\u0001\u0000\u0000\u0000"+
		"`a\u0006\b\u0006\u0000a\u0016\u0001\u0000\u0000\u0000bf\b\u0005\u0000"+
		"\u0000cd\u0005%\u0000\u0000df\b\u0004\u0000\u0000eb\u0001\u0000\u0000"+
		"\u0000ec\u0001\u0000\u0000\u0000fg\u0001\u0000\u0000\u0000ge\u0001\u0000"+
		"\u0000\u0000gh\u0001\u0000\u0000\u0000h\u0018\u0001\u0000\u0000\u0000"+
		"ij\u0005#\u0000\u0000jk\u0005}\u0000\u0000kl\u0001\u0000\u0000\u0000l"+
		"m\u0006\n\u0006\u0000m\u001a\u0001\u0000\u0000\u0000np\t\u0000\u0000\u0000"+
		"on\u0001\u0000\u0000\u0000pq\u0001\u0000\u0000\u0000qr\u0001\u0000\u0000"+
		"\u0000qo\u0001\u0000\u0000\u0000r\u001c\u0001\u0000\u0000\u0000st\u0005"+
		">\u0000\u0000tu\u0001\u0000\u0000\u0000uv\u0006\f\u0006\u0000v\u001e\u0001"+
		"\u0000\u0000\u0000wx\u0005/\u0000\u0000xy\u0005>\u0000\u0000yz\u0001\u0000"+
		"\u0000\u0000z{\u0006\r\u0006\u0000{ \u0001\u0000\u0000\u0000|}\u0005/"+
		"\u0000\u0000}\"\u0001\u0000\u0000\u0000~\u007f\u0005=\u0000\u0000\u007f"+
		"$\u0001\u0000\u0000\u0000\u0080\u0084\u0007\u0006\u0000\u0000\u0081\u0083"+
		"\u0007\u0007\u0000\u0000\u0082\u0081\u0001\u0000\u0000\u0000\u0083\u0086"+
		"\u0001\u0000\u0000\u0000\u0084\u0082\u0001\u0000\u0000\u0000\u0084\u0085"+
		"\u0001\u0000\u0000\u0000\u0085&\u0001\u0000\u0000\u0000\u0086\u0084\u0001"+
		"\u0000\u0000\u0000\u0087\u0088\u0007\b\u0000\u0000\u0088\u0089\u0007\t"+
		"\u0000\u0000\u0089\u008a\u0007\n\u0000\u0000\u008a\u008b\u0007\u000b\u0000"+
		"\u0000\u008b\u008c\u0007\f\u0000\u0000\u008c(\u0001\u0000\u0000\u0000"+
		"\u008d\u0091\u0005\"\u0000\u0000\u008e\u0090\b\r\u0000\u0000\u008f\u008e"+
		"\u0001\u0000\u0000\u0000\u0090\u0093\u0001\u0000\u0000\u0000\u0091\u008f"+
		"\u0001\u0000\u0000\u0000\u0091\u0092\u0001\u0000\u0000\u0000\u0092\u0094"+
		"\u0001\u0000\u0000\u0000\u0093\u0091\u0001\u0000\u0000\u0000\u0094\u009e"+
		"\u0005\"\u0000\u0000\u0095\u0099\u0005\'\u0000\u0000\u0096\u0098\b\u000e"+
		"\u0000\u0000\u0097\u0096\u0001\u0000\u0000\u0000\u0098\u009b\u0001\u0000"+
		"\u0000\u0000\u0099\u0097\u0001\u0000\u0000\u0000\u0099\u009a\u0001\u0000"+
		"\u0000\u0000\u009a\u009c\u0001\u0000\u0000\u0000\u009b\u0099\u0001\u0000"+
		"\u0000\u0000\u009c\u009e\u0005\'\u0000\u0000\u009d\u008d\u0001\u0000\u0000"+
		"\u0000\u009d\u0095\u0001\u0000\u0000\u0000\u009e*\u0001\u0000\u0000\u0000"+
		"\u009f\u00a1\u0007\u0003\u0000\u0000\u00a0\u009f\u0001\u0000\u0000\u0000"+
		"\u00a1\u00a2\u0001\u0000\u0000\u0000\u00a2\u00a0\u0001\u0000\u0000\u0000"+
		"\u00a2\u00a3\u0001\u0000\u0000\u0000\u00a3\u00a4\u0001\u0000\u0000\u0000"+
		"\u00a4\u00a5\u0006\u0013\u0005\u0000\u00a5,\u0001\u0000\u0000\u0000\u0012"+
		"\u0000\u0001\u0002\u0003\u0004FHMY[egq\u0084\u0091\u0099\u009d\u00a2\u0007"+
		"\u0005\u0001\u0000\u0005\u0002\u0000\u0006\u0000\u0000\u0005\u0003\u0000"+
		"\u0005\u0004\u0000\u0000\u0001\u0000\u0004\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}