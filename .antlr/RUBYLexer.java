// Generated from /home/lucas/Projects/ufabc/compilers/compiler/RUBY.g4 by ANTLR 4.7.1
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
		T__0=1, T__1=2, T__2=3, GREATER_THAN_OR_EQUALS=4, LESSER_THAN_OR_EQUALS=5, 
		GREATER_THAN=6, LESSER_THAN=7, NOT_EQUALS=8, ASSIGN=9, EQUALS=10, AND=11, 
		OR=12, ADD=13, SUB=14, MULT=15, DIV=16, LPAREN=17, RPAREN=18, LBRACE=19, 
		RBRACE=20, LBRACK=21, RBRACK=22, SEMICOLON=23, COMMA=24, NEW_LINE=25, 
		IF=26, ELSE=27, WHILE=28, DO=29, END=30, FOR=31, DEF=32, INT_T=33, FLOAT_T=34, 
		STRING_T=35, BOOL_T=36, VOID_T=37, ID=38, INT=39, FLOAT=40, STRING=41, 
		WS=42;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "GREATER_THAN_OR_EQUALS", "LESSER_THAN_OR_EQUALS", 
		"GREATER_THAN", "LESSER_THAN", "NOT_EQUALS", "ASSIGN", "EQUALS", "AND", 
		"OR", "ADD", "SUB", "MULT", "DIV", "LPAREN", "RPAREN", "LBRACE", "RBRACE", 
		"LBRACK", "RBRACK", "SEMICOLON", "COMMA", "NEW_LINE", "IF", "ELSE", "WHILE", 
		"DO", "END", "FOR", "DEF", "INT_T", "FLOAT_T", "STRING_T", "BOOL_T", "VOID_T", 
		"ID", "INT", "FLOAT", "STRING", "LETTER", "DIGIT", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "':'", "'main'", "'return'", "'>='", "'<='", "'>'", "'<'", "'!='", 
		"'='", "'=='", "'&&'", "'||'", "'+'", "'-'", "'*'", "'/'", "'('", "')'", 
		"'{'", "'}'", "'['", "']'", "';'", "','", null, "'if'", "'else'", "'while'", 
		"'do'", "'end'", "'for'", "'def'", "'Integer'", "'Float'", "'String'", 
		"'Bool'", "'Void'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, "GREATER_THAN_OR_EQUALS", "LESSER_THAN_OR_EQUALS", 
		"GREATER_THAN", "LESSER_THAN", "NOT_EQUALS", "ASSIGN", "EQUALS", "AND", 
		"OR", "ADD", "SUB", "MULT", "DIV", "LPAREN", "RPAREN", "LBRACE", "RBRACE", 
		"LBRACK", "RBRACK", "SEMICOLON", "COMMA", "NEW_LINE", "IF", "ELSE", "WHILE", 
		"DO", "END", "FOR", "DEF", "INT_T", "FLOAT_T", "STRING_T", "BOOL_T", "VOID_T", 
		"ID", "INT", "FLOAT", "STRING", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2,\u0104\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5"+
		"\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\13"+
		"\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22"+
		"\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31"+
		"\3\31\3\32\5\32\u009b\n\32\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\34\3\34"+
		"\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3\37"+
		"\3 \3 \3 \3 \3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3"+
		"#\3#\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3\'\6\'\u00dc"+
		"\n\'\r\'\16\'\u00dd\3(\6(\u00e1\n(\r(\16(\u00e2\3)\6)\u00e6\n)\r)\16)"+
		"\u00e7\3)\3)\6)\u00ec\n)\r)\16)\u00ed\3*\3*\7*\u00f2\n*\f*\16*\u00f5\13"+
		"*\3*\3*\3+\5+\u00fa\n+\3,\3,\3-\6-\u00ff\n-\r-\16-\u0100\3-\3-\3\u00f3"+
		"\2.\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36"+
		";\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U\2W\2Y,\3\2\5\5\2C\\aac|\3\2\62;\4\2\13"+
		"\13\"\"\2\u0108\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3"+
		"\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2"+
		"\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3"+
		"\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2"+
		"\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\2"+
		"9\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3"+
		"\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2"+
		"\2\2S\3\2\2\2\2Y\3\2\2\2\3[\3\2\2\2\5]\3\2\2\2\7b\3\2\2\2\ti\3\2\2\2\13"+
		"l\3\2\2\2\ro\3\2\2\2\17q\3\2\2\2\21s\3\2\2\2\23v\3\2\2\2\25x\3\2\2\2\27"+
		"{\3\2\2\2\31~\3\2\2\2\33\u0081\3\2\2\2\35\u0083\3\2\2\2\37\u0085\3\2\2"+
		"\2!\u0087\3\2\2\2#\u0089\3\2\2\2%\u008b\3\2\2\2\'\u008d\3\2\2\2)\u008f"+
		"\3\2\2\2+\u0091\3\2\2\2-\u0093\3\2\2\2/\u0095\3\2\2\2\61\u0097\3\2\2\2"+
		"\63\u009a\3\2\2\2\65\u009e\3\2\2\2\67\u00a1\3\2\2\29\u00a6\3\2\2\2;\u00ac"+
		"\3\2\2\2=\u00af\3\2\2\2?\u00b3\3\2\2\2A\u00b7\3\2\2\2C\u00bb\3\2\2\2E"+
		"\u00c3\3\2\2\2G\u00c9\3\2\2\2I\u00d0\3\2\2\2K\u00d5\3\2\2\2M\u00db\3\2"+
		"\2\2O\u00e0\3\2\2\2Q\u00e5\3\2\2\2S\u00ef\3\2\2\2U\u00f9\3\2\2\2W\u00fb"+
		"\3\2\2\2Y\u00fe\3\2\2\2[\\\7<\2\2\\\4\3\2\2\2]^\7o\2\2^_\7c\2\2_`\7k\2"+
		"\2`a\7p\2\2a\6\3\2\2\2bc\7t\2\2cd\7g\2\2de\7v\2\2ef\7w\2\2fg\7t\2\2gh"+
		"\7p\2\2h\b\3\2\2\2ij\7@\2\2jk\7?\2\2k\n\3\2\2\2lm\7>\2\2mn\7?\2\2n\f\3"+
		"\2\2\2op\7@\2\2p\16\3\2\2\2qr\7>\2\2r\20\3\2\2\2st\7#\2\2tu\7?\2\2u\22"+
		"\3\2\2\2vw\7?\2\2w\24\3\2\2\2xy\7?\2\2yz\7?\2\2z\26\3\2\2\2{|\7(\2\2|"+
		"}\7(\2\2}\30\3\2\2\2~\177\7~\2\2\177\u0080\7~\2\2\u0080\32\3\2\2\2\u0081"+
		"\u0082\7-\2\2\u0082\34\3\2\2\2\u0083\u0084\7/\2\2\u0084\36\3\2\2\2\u0085"+
		"\u0086\7,\2\2\u0086 \3\2\2\2\u0087\u0088\7\61\2\2\u0088\"\3\2\2\2\u0089"+
		"\u008a\7*\2\2\u008a$\3\2\2\2\u008b\u008c\7+\2\2\u008c&\3\2\2\2\u008d\u008e"+
		"\7}\2\2\u008e(\3\2\2\2\u008f\u0090\7\177\2\2\u0090*\3\2\2\2\u0091\u0092"+
		"\7]\2\2\u0092,\3\2\2\2\u0093\u0094\7_\2\2\u0094.\3\2\2\2\u0095\u0096\7"+
		"=\2\2\u0096\60\3\2\2\2\u0097\u0098\7.\2\2\u0098\62\3\2\2\2\u0099\u009b"+
		"\7\17\2\2\u009a\u0099\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u009c\3\2\2\2"+
		"\u009c\u009d\7\f\2\2\u009d\64\3\2\2\2\u009e\u009f\7k\2\2\u009f\u00a0\7"+
		"h\2\2\u00a0\66\3\2\2\2\u00a1\u00a2\7g\2\2\u00a2\u00a3\7n\2\2\u00a3\u00a4"+
		"\7u\2\2\u00a4\u00a5\7g\2\2\u00a58\3\2\2\2\u00a6\u00a7\7y\2\2\u00a7\u00a8"+
		"\7j\2\2\u00a8\u00a9\7k\2\2\u00a9\u00aa\7n\2\2\u00aa\u00ab\7g\2\2\u00ab"+
		":\3\2\2\2\u00ac\u00ad\7f\2\2\u00ad\u00ae\7q\2\2\u00ae<\3\2\2\2\u00af\u00b0"+
		"\7g\2\2\u00b0\u00b1\7p\2\2\u00b1\u00b2\7f\2\2\u00b2>\3\2\2\2\u00b3\u00b4"+
		"\7h\2\2\u00b4\u00b5\7q\2\2\u00b5\u00b6\7t\2\2\u00b6@\3\2\2\2\u00b7\u00b8"+
		"\7f\2\2\u00b8\u00b9\7g\2\2\u00b9\u00ba\7h\2\2\u00baB\3\2\2\2\u00bb\u00bc"+
		"\7K\2\2\u00bc\u00bd\7p\2\2\u00bd\u00be\7v\2\2\u00be\u00bf\7g\2\2\u00bf"+
		"\u00c0\7i\2\2\u00c0\u00c1\7g\2\2\u00c1\u00c2\7t\2\2\u00c2D\3\2\2\2\u00c3"+
		"\u00c4\7H\2\2\u00c4\u00c5\7n\2\2\u00c5\u00c6\7q\2\2\u00c6\u00c7\7c\2\2"+
		"\u00c7\u00c8\7v\2\2\u00c8F\3\2\2\2\u00c9\u00ca\7U\2\2\u00ca\u00cb\7v\2"+
		"\2\u00cb\u00cc\7t\2\2\u00cc\u00cd\7k\2\2\u00cd\u00ce\7p\2\2\u00ce\u00cf"+
		"\7i\2\2\u00cfH\3\2\2\2\u00d0\u00d1\7D\2\2\u00d1\u00d2\7q\2\2\u00d2\u00d3"+
		"\7q\2\2\u00d3\u00d4\7n\2\2\u00d4J\3\2\2\2\u00d5\u00d6\7X\2\2\u00d6\u00d7"+
		"\7q\2\2\u00d7\u00d8\7k\2\2\u00d8\u00d9\7f\2\2\u00d9L\3\2\2\2\u00da\u00dc"+
		"\5U+\2\u00db\u00da\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00db\3\2\2\2\u00dd"+
		"\u00de\3\2\2\2\u00deN\3\2\2\2\u00df\u00e1\5W,\2\u00e0\u00df\3\2\2\2\u00e1"+
		"\u00e2\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3P\3\2\2\2"+
		"\u00e4\u00e6\5W,\2\u00e5\u00e4\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00e5"+
		"\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00eb\7\60\2\2"+
		"\u00ea\u00ec\5W,\2\u00eb\u00ea\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00eb"+
		"\3\2\2\2\u00ed\u00ee\3\2\2\2\u00eeR\3\2\2\2\u00ef\u00f3\7$\2\2\u00f0\u00f2"+
		"\13\2\2\2\u00f1\u00f0\3\2\2\2\u00f2\u00f5\3\2\2\2\u00f3\u00f4\3\2\2\2"+
		"\u00f3\u00f1\3\2\2\2\u00f4\u00f6\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f6\u00f7"+
		"\7$\2\2\u00f7T\3\2\2\2\u00f8\u00fa\t\2\2\2\u00f9\u00f8\3\2\2\2\u00faV"+
		"\3\2\2\2\u00fb\u00fc\t\3\2\2\u00fcX\3\2\2\2\u00fd\u00ff\t\4\2\2\u00fe"+
		"\u00fd\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u00fe\3\2\2\2\u0100\u0101\3\2"+
		"\2\2\u0101\u0102\3\2\2\2\u0102\u0103\b-\2\2\u0103Z\3\2\2\2\13\2\u009a"+
		"\u00dd\u00e2\u00e7\u00ed\u00f3\u00f9\u0100\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}