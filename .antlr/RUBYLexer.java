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
		T__0=1, GREATER_THAN_OR_EQUALS=2, LESSER_THAN_OR_EQUALS=3, GREATER_THAN=4, 
		LESSER_THAN=5, NOT_EQUALS=6, ASSIGN=7, EQUALS=8, AND=9, OR=10, ADD=11, 
		SUB=12, MULT=13, DIV=14, LPAREN=15, RPAREN=16, LBRACE=17, RBRACE=18, LBRACK=19, 
		RBRACK=20, SEMICOLON=21, COMMA=22, NEW_LINE=23, IF=24, ELSE=25, WHILE=26, 
		DO=27, END=28, FOR=29, DEF=30, GETS=31, PUTS=32, INT_T=33, FLOAT_T=34, 
		STRING_T=35, BOOL_T=36, VOID_T=37, ID=38, INT=39, FLOAT=40, STRING=41, 
		WS=42;
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
		"FOR", "DEF", "GETS", "PUTS", "INT_T", "FLOAT_T", "STRING_T", "BOOL_T", 
		"VOID_T", "ID", "INT", "FLOAT", "STRING", "LETTER", "DIGIT", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "':'", "'>='", "'<='", "'>'", "'<'", "'!='", "'='", "'=='", "'&&'", 
		"'||'", "'+'", "'-'", "'*'", "'/'", "'('", "')'", "'{'", "'}'", "'['", 
		"']'", "';'", "','", null, "'if'", "'else'", "'while'", "'do'", "'end'", 
		"'for'", "'def'", "'gets'", "'puts'", "'Integer'", "'Float'", "'String'", 
		"'Bool'", "'Void'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, "GREATER_THAN_OR_EQUALS", "LESSER_THAN_OR_EQUALS", "GREATER_THAN", 
		"LESSER_THAN", "NOT_EQUALS", "ASSIGN", "EQUALS", "AND", "OR", "ADD", "SUB", 
		"MULT", "DIV", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", 
		"SEMICOLON", "COMMA", "NEW_LINE", "IF", "ELSE", "WHILE", "DO", "END", 
		"FOR", "DEF", "GETS", "PUTS", "INT_T", "FLOAT_T", "STRING_T", "BOOL_T", 
		"VOID_T", "ID", "INT", "FLOAT", "STRING", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2,\u0102\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7"+
		"\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3"+
		"\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3"+
		"\25\3\26\3\26\3\27\3\27\3\30\5\30\u008f\n\30\3\30\3\30\3\31\3\31\3\31"+
		"\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34"+
		"\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3 \3 \3 "+
		"\3 \3 \3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3"+
		"#\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3\'\6\'\u00da\n\'"+
		"\r\'\16\'\u00db\3(\6(\u00df\n(\r(\16(\u00e0\3)\6)\u00e4\n)\r)\16)\u00e5"+
		"\3)\3)\6)\u00ea\n)\r)\16)\u00eb\3*\3*\7*\u00f0\n*\f*\16*\u00f3\13*\3*"+
		"\3*\3+\5+\u00f8\n+\3,\3,\3-\6-\u00fd\n-\r-\16-\u00fe\3-\3-\3\u00f1\2."+
		"\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20"+
		"\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37"+
		"= ?!A\"C#E$G%I&K\'M(O)Q*S+U\2W\2Y,\3\2\5\5\2C\\aac|\3\2\62;\4\2\13\13"+
		"\"\"\2\u0106\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2"+
		"\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2"+
		"\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2"+
		"\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2"+
		"\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3"+
		"\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2"+
		"\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2"+
		"S\3\2\2\2\2Y\3\2\2\2\3[\3\2\2\2\5]\3\2\2\2\7`\3\2\2\2\tc\3\2\2\2\13e\3"+
		"\2\2\2\rg\3\2\2\2\17j\3\2\2\2\21l\3\2\2\2\23o\3\2\2\2\25r\3\2\2\2\27u"+
		"\3\2\2\2\31w\3\2\2\2\33y\3\2\2\2\35{\3\2\2\2\37}\3\2\2\2!\177\3\2\2\2"+
		"#\u0081\3\2\2\2%\u0083\3\2\2\2\'\u0085\3\2\2\2)\u0087\3\2\2\2+\u0089\3"+
		"\2\2\2-\u008b\3\2\2\2/\u008e\3\2\2\2\61\u0092\3\2\2\2\63\u0095\3\2\2\2"+
		"\65\u009a\3\2\2\2\67\u00a0\3\2\2\29\u00a3\3\2\2\2;\u00a7\3\2\2\2=\u00ab"+
		"\3\2\2\2?\u00af\3\2\2\2A\u00b4\3\2\2\2C\u00b9\3\2\2\2E\u00c1\3\2\2\2G"+
		"\u00c7\3\2\2\2I\u00ce\3\2\2\2K\u00d3\3\2\2\2M\u00d9\3\2\2\2O\u00de\3\2"+
		"\2\2Q\u00e3\3\2\2\2S\u00ed\3\2\2\2U\u00f7\3\2\2\2W\u00f9\3\2\2\2Y\u00fc"+
		"\3\2\2\2[\\\7<\2\2\\\4\3\2\2\2]^\7@\2\2^_\7?\2\2_\6\3\2\2\2`a\7>\2\2a"+
		"b\7?\2\2b\b\3\2\2\2cd\7@\2\2d\n\3\2\2\2ef\7>\2\2f\f\3\2\2\2gh\7#\2\2h"+
		"i\7?\2\2i\16\3\2\2\2jk\7?\2\2k\20\3\2\2\2lm\7?\2\2mn\7?\2\2n\22\3\2\2"+
		"\2op\7(\2\2pq\7(\2\2q\24\3\2\2\2rs\7~\2\2st\7~\2\2t\26\3\2\2\2uv\7-\2"+
		"\2v\30\3\2\2\2wx\7/\2\2x\32\3\2\2\2yz\7,\2\2z\34\3\2\2\2{|\7\61\2\2|\36"+
		"\3\2\2\2}~\7*\2\2~ \3\2\2\2\177\u0080\7+\2\2\u0080\"\3\2\2\2\u0081\u0082"+
		"\7}\2\2\u0082$\3\2\2\2\u0083\u0084\7\177\2\2\u0084&\3\2\2\2\u0085\u0086"+
		"\7]\2\2\u0086(\3\2\2\2\u0087\u0088\7_\2\2\u0088*\3\2\2\2\u0089\u008a\7"+
		"=\2\2\u008a,\3\2\2\2\u008b\u008c\7.\2\2\u008c.\3\2\2\2\u008d\u008f\7\17"+
		"\2\2\u008e\u008d\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0090\3\2\2\2\u0090"+
		"\u0091\7\f\2\2\u0091\60\3\2\2\2\u0092\u0093\7k\2\2\u0093\u0094\7h\2\2"+
		"\u0094\62\3\2\2\2\u0095\u0096\7g\2\2\u0096\u0097\7n\2\2\u0097\u0098\7"+
		"u\2\2\u0098\u0099\7g\2\2\u0099\64\3\2\2\2\u009a\u009b\7y\2\2\u009b\u009c"+
		"\7j\2\2\u009c\u009d\7k\2\2\u009d\u009e\7n\2\2\u009e\u009f\7g\2\2\u009f"+
		"\66\3\2\2\2\u00a0\u00a1\7f\2\2\u00a1\u00a2\7q\2\2\u00a28\3\2\2\2\u00a3"+
		"\u00a4\7g\2\2\u00a4\u00a5\7p\2\2\u00a5\u00a6\7f\2\2\u00a6:\3\2\2\2\u00a7"+
		"\u00a8\7h\2\2\u00a8\u00a9\7q\2\2\u00a9\u00aa\7t\2\2\u00aa<\3\2\2\2\u00ab"+
		"\u00ac\7f\2\2\u00ac\u00ad\7g\2\2\u00ad\u00ae\7h\2\2\u00ae>\3\2\2\2\u00af"+
		"\u00b0\7i\2\2\u00b0\u00b1\7g\2\2\u00b1\u00b2\7v\2\2\u00b2\u00b3\7u\2\2"+
		"\u00b3@\3\2\2\2\u00b4\u00b5\7r\2\2\u00b5\u00b6\7w\2\2\u00b6\u00b7\7v\2"+
		"\2\u00b7\u00b8\7u\2\2\u00b8B\3\2\2\2\u00b9\u00ba\7K\2\2\u00ba\u00bb\7"+
		"p\2\2\u00bb\u00bc\7v\2\2\u00bc\u00bd\7g\2\2\u00bd\u00be\7i\2\2\u00be\u00bf"+
		"\7g\2\2\u00bf\u00c0\7t\2\2\u00c0D\3\2\2\2\u00c1\u00c2\7H\2\2\u00c2\u00c3"+
		"\7n\2\2\u00c3\u00c4\7q\2\2\u00c4\u00c5\7c\2\2\u00c5\u00c6\7v\2\2\u00c6"+
		"F\3\2\2\2\u00c7\u00c8\7U\2\2\u00c8\u00c9\7v\2\2\u00c9\u00ca\7t\2\2\u00ca"+
		"\u00cb\7k\2\2\u00cb\u00cc\7p\2\2\u00cc\u00cd\7i\2\2\u00cdH\3\2\2\2\u00ce"+
		"\u00cf\7D\2\2\u00cf\u00d0\7q\2\2\u00d0\u00d1\7q\2\2\u00d1\u00d2\7n\2\2"+
		"\u00d2J\3\2\2\2\u00d3\u00d4\7X\2\2\u00d4\u00d5\7q\2\2\u00d5\u00d6\7k\2"+
		"\2\u00d6\u00d7\7f\2\2\u00d7L\3\2\2\2\u00d8\u00da\5U+\2\u00d9\u00d8\3\2"+
		"\2\2\u00da\u00db\3\2\2\2\u00db\u00d9\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc"+
		"N\3\2\2\2\u00dd\u00df\5W,\2\u00de\u00dd\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0"+
		"\u00de\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1P\3\2\2\2\u00e2\u00e4\5W,\2\u00e3"+
		"\u00e2\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e5\u00e6\3\2"+
		"\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00e9\7\60\2\2\u00e8\u00ea\5W,\2\u00e9"+
		"\u00e8\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00e9\3\2\2\2\u00eb\u00ec\3\2"+
		"\2\2\u00ecR\3\2\2\2\u00ed\u00f1\7$\2\2\u00ee\u00f0\13\2\2\2\u00ef\u00ee"+
		"\3\2\2\2\u00f0\u00f3\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f2"+
		"\u00f4\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f4\u00f5\7$\2\2\u00f5T\3\2\2\2\u00f6"+
		"\u00f8\t\2\2\2\u00f7\u00f6\3\2\2\2\u00f8V\3\2\2\2\u00f9\u00fa\t\3\2\2"+
		"\u00faX\3\2\2\2\u00fb\u00fd\t\4\2\2\u00fc\u00fb\3\2\2\2\u00fd\u00fe\3"+
		"\2\2\2\u00fe\u00fc\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\u0100\3\2\2\2\u0100"+
		"\u0101\b-\2\2\u0101Z\3\2\2\2\13\2\u008e\u00db\u00e0\u00e5\u00eb\u00f1"+
		"\u00f7\u00fe\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}