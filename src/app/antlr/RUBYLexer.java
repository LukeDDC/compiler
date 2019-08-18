package app.antlr;

// Generated from RUBY.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class RUBYLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, GREATER_THAN_OR_EQUALS=2, LESSER_THAN_OR_EQUALS=3, GREATER_THAN=4,
		LESSER_THAN=5, NOT_EQUALS=6, ASSIGN=7, EQUALS=8, AND=9, OR=10, ADD=11,
		SUB=12, MULT=13, DIV=14, LPAREN=15, RPAREN=16, LBRACE=17, RBRACE=18, LBRACK=19,
		RBRACK=20, SEMICOLON=21, COMMA=22, NEW_LINE=23, IF=24, ELSE=25, WHILE=26,
		DO=27, END=28, FOR=29, DEF=30, INT_T=31, FLOAT_T=32, STRING_T=33, BOOL_T=34,
		VOID_T=35, ID=36, INT=37, FLOAT=38, STRING=39, WS=40;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "GREATER_THAN_OR_EQUALS", "LESSER_THAN_OR_EQUALS", "GREATER_THAN",
		"LESSER_THAN", "NOT_EQUALS", "ASSIGN", "EQUALS", "AND", "OR", "ADD", "SUB",
		"MULT", "DIV", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK",
		"SEMICOLON", "COMMA", "NEW_LINE", "IF", "ELSE", "WHILE", "DO", "END",
		"FOR", "DEF", "INT_T", "FLOAT_T", "STRING_T", "BOOL_T", "VOID_T", "ID",
		"INT", "FLOAT", "STRING", "LETTER", "DIGIT", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "':'", "'>='", "'<='", "'>'", "'<'", "'!='", "'='", "'=='", "'&&'",
		"'||'", "'+'", "'-'", "'*'", "'/'", "'('", "')'", "'{'", "'}'", "'['",
		"']'", "';'", "','", null, "'if'", "'else'", "'while'", "'do'", "'end'",
		"'for'", "'def'", "'Integer'", "'Float'", "'String'", "'Bool'", "'Void'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, "GREATER_THAN_OR_EQUALS", "LESSER_THAN_OR_EQUALS", "GREATER_THAN",
		"LESSER_THAN", "NOT_EQUALS", "ASSIGN", "EQUALS", "AND", "OR", "ADD", "SUB",
		"MULT", "DIV", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK",
		"SEMICOLON", "COMMA", "NEW_LINE", "IF", "ELSE", "WHILE", "DO", "END",
		"FOR", "DEF", "INT_T", "FLOAT_T", "STRING_T", "BOOL_T", "VOID_T", "ID",
		"INT", "FLOAT", "STRING", "WS"
	};
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


	public RUBYLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "RUBY.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2*\u00f4\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\3"+
		"\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\t"+
		"\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17"+
		"\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26"+
		"\3\27\3\27\3\30\5\30\u008b\n\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32"+
		"\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\35"+
		"\3\35\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 "+
		"\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3$\3$\3"+
		"$\3$\3$\3%\6%\u00cc\n%\r%\16%\u00cd\3&\6&\u00d1\n&\r&\16&\u00d2\3\'\6"+
		"\'\u00d6\n\'\r\'\16\'\u00d7\3\'\3\'\6\'\u00dc\n\'\r\'\16\'\u00dd\3(\3"+
		"(\7(\u00e2\n(\f(\16(\u00e5\13(\3(\3(\3)\5)\u00ea\n)\3*\3*\3+\6+\u00ef"+
		"\n+\r+\16+\u00f0\3+\3+\3\u00e3\2,\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23"+
		"\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31"+
		"\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q\2S\2U*\3\2\5\5"+
		"\2C\\aac|\3\2\62;\4\2\13\13\"\"\2\u00f8\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3"+
		"\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2"+
		"\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35"+
		"\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)"+
		"\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2"+
		"\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2"+
		"A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3"+
		"\2\2\2\2O\3\2\2\2\2U\3\2\2\2\3W\3\2\2\2\5Y\3\2\2\2\7\\\3\2\2\2\t_\3\2"+
		"\2\2\13a\3\2\2\2\rc\3\2\2\2\17f\3\2\2\2\21h\3\2\2\2\23k\3\2\2\2\25n\3"+
		"\2\2\2\27q\3\2\2\2\31s\3\2\2\2\33u\3\2\2\2\35w\3\2\2\2\37y\3\2\2\2!{\3"+
		"\2\2\2#}\3\2\2\2%\177\3\2\2\2\'\u0081\3\2\2\2)\u0083\3\2\2\2+\u0085\3"+
		"\2\2\2-\u0087\3\2\2\2/\u008a\3\2\2\2\61\u008e\3\2\2\2\63\u0091\3\2\2\2"+
		"\65\u0096\3\2\2\2\67\u009c\3\2\2\29\u009f\3\2\2\2;\u00a3\3\2\2\2=\u00a7"+
		"\3\2\2\2?\u00ab\3\2\2\2A\u00b3\3\2\2\2C\u00b9\3\2\2\2E\u00c0\3\2\2\2G"+
		"\u00c5\3\2\2\2I\u00cb\3\2\2\2K\u00d0\3\2\2\2M\u00d5\3\2\2\2O\u00df\3\2"+
		"\2\2Q\u00e9\3\2\2\2S\u00eb\3\2\2\2U\u00ee\3\2\2\2WX\7<\2\2X\4\3\2\2\2"+
		"YZ\7@\2\2Z[\7?\2\2[\6\3\2\2\2\\]\7>\2\2]^\7?\2\2^\b\3\2\2\2_`\7@\2\2`"+
		"\n\3\2\2\2ab\7>\2\2b\f\3\2\2\2cd\7#\2\2de\7?\2\2e\16\3\2\2\2fg\7?\2\2"+
		"g\20\3\2\2\2hi\7?\2\2ij\7?\2\2j\22\3\2\2\2kl\7(\2\2lm\7(\2\2m\24\3\2\2"+
		"\2no\7~\2\2op\7~\2\2p\26\3\2\2\2qr\7-\2\2r\30\3\2\2\2st\7/\2\2t\32\3\2"+
		"\2\2uv\7,\2\2v\34\3\2\2\2wx\7\61\2\2x\36\3\2\2\2yz\7*\2\2z \3\2\2\2{|"+
		"\7+\2\2|\"\3\2\2\2}~\7}\2\2~$\3\2\2\2\177\u0080\7\177\2\2\u0080&\3\2\2"+
		"\2\u0081\u0082\7]\2\2\u0082(\3\2\2\2\u0083\u0084\7_\2\2\u0084*\3\2\2\2"+
		"\u0085\u0086\7=\2\2\u0086,\3\2\2\2\u0087\u0088\7.\2\2\u0088.\3\2\2\2\u0089"+
		"\u008b\7\17\2\2\u008a\u0089\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008c\3"+
		"\2\2\2\u008c\u008d\7\f\2\2\u008d\60\3\2\2\2\u008e\u008f\7k\2\2\u008f\u0090"+
		"\7h\2\2\u0090\62\3\2\2\2\u0091\u0092\7g\2\2\u0092\u0093\7n\2\2\u0093\u0094"+
		"\7u\2\2\u0094\u0095\7g\2\2\u0095\64\3\2\2\2\u0096\u0097\7y\2\2\u0097\u0098"+
		"\7j\2\2\u0098\u0099\7k\2\2\u0099\u009a\7n\2\2\u009a\u009b\7g\2\2\u009b"+
		"\66\3\2\2\2\u009c\u009d\7f\2\2\u009d\u009e\7q\2\2\u009e8\3\2\2\2\u009f"+
		"\u00a0\7g\2\2\u00a0\u00a1\7p\2\2\u00a1\u00a2\7f\2\2\u00a2:\3\2\2\2\u00a3"+
		"\u00a4\7h\2\2\u00a4\u00a5\7q\2\2\u00a5\u00a6\7t\2\2\u00a6<\3\2\2\2\u00a7"+
		"\u00a8\7f\2\2\u00a8\u00a9\7g\2\2\u00a9\u00aa\7h\2\2\u00aa>\3\2\2\2\u00ab"+
		"\u00ac\7K\2\2\u00ac\u00ad\7p\2\2\u00ad\u00ae\7v\2\2\u00ae\u00af\7g\2\2"+
		"\u00af\u00b0\7i\2\2\u00b0\u00b1\7g\2\2\u00b1\u00b2\7t\2\2\u00b2@\3\2\2"+
		"\2\u00b3\u00b4\7H\2\2\u00b4\u00b5\7n\2\2\u00b5\u00b6\7q\2\2\u00b6\u00b7"+
		"\7c\2\2\u00b7\u00b8\7v\2\2\u00b8B\3\2\2\2\u00b9\u00ba\7U\2\2\u00ba\u00bb"+
		"\7v\2\2\u00bb\u00bc\7t\2\2\u00bc\u00bd\7k\2\2\u00bd\u00be\7p\2\2\u00be"+
		"\u00bf\7i\2\2\u00bfD\3\2\2\2\u00c0\u00c1\7D\2\2\u00c1\u00c2\7q\2\2\u00c2"+
		"\u00c3\7q\2\2\u00c3\u00c4\7n\2\2\u00c4F\3\2\2\2\u00c5\u00c6\7X\2\2\u00c6"+
		"\u00c7\7q\2\2\u00c7\u00c8\7k\2\2\u00c8\u00c9\7f\2\2\u00c9H\3\2\2\2\u00ca"+
		"\u00cc\5Q)\2\u00cb\u00ca\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00cb\3\2\2"+
		"\2\u00cd\u00ce\3\2\2\2\u00ceJ\3\2\2\2\u00cf\u00d1\5S*\2\u00d0\u00cf\3"+
		"\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3"+
		"L\3\2\2\2\u00d4\u00d6\5S*\2\u00d5\u00d4\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7"+
		"\u00d5\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00db\7\60"+
		"\2\2\u00da\u00dc\5S*\2\u00db\u00da\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00db"+
		"\3\2\2\2\u00dd\u00de\3\2\2\2\u00deN\3\2\2\2\u00df\u00e3\7$\2\2\u00e0\u00e2"+
		"\13\2\2\2\u00e1\u00e0\3\2\2\2\u00e2\u00e5\3\2\2\2\u00e3\u00e4\3\2\2\2"+
		"\u00e3\u00e1\3\2\2\2\u00e4\u00e6\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e6\u00e7"+
		"\7$\2\2\u00e7P\3\2\2\2\u00e8\u00ea\t\2\2\2\u00e9\u00e8\3\2\2\2\u00eaR"+
		"\3\2\2\2\u00eb\u00ec\t\3\2\2\u00ecT\3\2\2\2\u00ed\u00ef\t\4\2\2\u00ee"+
		"\u00ed\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f0\u00f1\3\2"+
		"\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f3\b+\2\2\u00f3V\3\2\2\2\13\2\u008a"+
		"\u00cd\u00d2\u00d7\u00dd\u00e3\u00e9\u00f0\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}