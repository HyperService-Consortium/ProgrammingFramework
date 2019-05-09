// Generated from /Users/Jian/Downloads/Hyper-Service-Language/antlr/Golang.g4 by ANTLR 4.7

package edu.cwru.rise.golang.parser;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GolangLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		T__52=53, T__53=54, T__54=55, T__55=56, T__56=57, T__57=58, T__58=59, 
		T__59=60, T__60=61, T__61=62, IDENTIFIER=63, KEYWORD=64, BINARY_OP=65, 
		INT_LIT=66, FLOAT_LIT=67, IMAGINARY_LIT=68, RUNE_LIT=69, LITTLE_U_VALUE=70, 
		BIG_U_VALUE=71, STRING_LIT=72, WS=73, COMMENT=74, TERMINATOR=75, LINE_COMMENT=76;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
			"T__25", "T__26", "T__27", "T__28", "T__29", "T__30", "T__31", "T__32", 
			"T__33", "T__34", "T__35", "T__36", "T__37", "T__38", "T__39", "T__40", 
			"T__41", "T__42", "T__43", "T__44", "T__45", "T__46", "T__47", "T__48", 
			"T__49", "T__50", "T__51", "T__52", "T__53", "T__54", "T__55", "T__56", 
			"T__57", "T__58", "T__59", "T__60", "T__61", "IDENTIFIER", "KEYWORD", 
			"BINARY_OP", "REL_OP", "ADD_OP", "MUL_OP", "UNARY_OP", "INT_LIT", "DECIMAL_LIT", 
			"OCTAL_LIT", "HEX_LIT", "FLOAT_LIT", "DECIMALS", "EXPONENT", "IMAGINARY_LIT", 
			"RUNE_LIT", "UNICODE_VALUE", "BYTE_VALUE", "OCTAL_BYTE_VALUE", "HEX_BYTE_VALUE", 
			"LITTLE_U_VALUE", "BIG_U_VALUE", "ESCAPED_CHAR", "STRING_LIT", "RAW_STRING_LIT", 
			"INTERPRETED_STRING_LIT", "LETTER", "DECIMAL_DIGIT", "OCTAL_DIGIT", "HEX_DIGIT", 
			"NEWLINE", "UNICODE_CHAR", "UNICODE_DIGIT", "UNICODE_LETTER", "WS", "COMMENT", 
			"TERMINATOR", "LINE_COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'package'", "'import'", "'('", "')'", "'.'", "'const'", "'='", 
			"','", "'type'", "'func'", "'var'", "'{'", "'}'", "'<-'", "'++'", "'--'", 
			"'+'", "'-'", "'|'", "'^'", "'*'", "'/'", "'%'", "'<<'", "'>>'", "'&'", 
			"'&^'", "':='", "';'", "':'", "'return'", "'break'", "'continue'", "'goto'", 
			"'fallthrough'", "'defer'", "'if'", "'else'", "'switch'", "'case'", "'default'", 
			"'select'", "'for'", "'range'", "'go'", "'['", "']'", "'interface'", 
			"'map'", "'chan'", "'...'", "'struct'", "'nil'", "'||'", "'&&'", "'=='", 
			"'!='", "'<'", "'<='", "'>'", "'>='", "'!'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "IDENTIFIER", "KEYWORD", "BINARY_OP", "INT_LIT", "FLOAT_LIT", 
			"IMAGINARY_LIT", "RUNE_LIT", "LITTLE_U_VALUE", "BIG_U_VALUE", "STRING_LIT", 
			"WS", "COMMENT", "TERMINATOR", "LINE_COMMENT"
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


	    // The most recently produced token.
	    private Token lastToken = null;
	    /**
	     * Return the next token from the character stream and records this last
	     * token in case it resides on the default channel. This recorded token
	     * is used to determine when the lexer could possibly match a regex
	     * literal.
	     *
	     * @return the next token from the character stream.
	     */
	    @Override
	    public Token nextToken() {
	        // Get the next token.
	        Token next = super.nextToken();
	        if (next.getChannel() == Token.DEFAULT_CHANNEL) {
	            // Keep track of the last token on the default channel.
	            this.lastToken = next;
	        }

	        return next;
	    }


	public GolangLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Golang.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2N\u0336\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3"+
		"\f\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3"+
		"\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3"+
		"\30\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3"+
		"\35\3\36\3\36\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3\"\3\""+
		"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3$\3"+
		"$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3("+
		"\3(\3(\3(\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3+\3+"+
		"\3,\3,\3,\3,\3-\3-\3-\3-\3-\3-\3.\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\61"+
		"\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\63\3\63\3\63"+
		"\3\63\3\63\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\66"+
		"\3\66\3\66\3\66\3\67\3\67\3\67\38\38\38\39\39\39\3:\3:\3:\3;\3;\3<\3<"+
		"\3<\3=\3=\3>\3>\3>\3?\3?\3@\3@\3@\7@\u01c4\n@\f@\16@\u01c7\13@\3A\3A\3"+
		"A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3"+
		"A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3"+
		"A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3"+
		"A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3"+
		"A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3"+
		"A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\5A\u024a\nA\3B\3B\3B\3B\3B\3B\3B\5"+
		"B\u0253\nB\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\5C\u025f\nC\3D\3D\3E\3E\3E\3"+
		"E\3E\3E\3E\3E\5E\u026b\nE\3F\3F\3F\5F\u0270\nF\3G\3G\3G\5G\u0275\nG\3"+
		"H\3H\7H\u0279\nH\fH\16H\u027c\13H\3I\3I\7I\u0280\nI\fI\16I\u0283\13I\3"+
		"J\3J\3J\6J\u0288\nJ\rJ\16J\u0289\3K\3K\3K\5K\u028f\nK\3K\5K\u0292\nK\3"+
		"K\3K\3K\3K\3K\3K\5K\u029a\nK\5K\u029c\nK\3L\6L\u029f\nL\rL\16L\u02a0\3"+
		"M\3M\5M\u02a5\nM\3M\3M\3N\3N\5N\u02ab\nN\3N\3N\3O\3O\3O\5O\u02b2\nO\3"+
		"O\3O\3P\3P\3P\3P\5P\u02ba\nP\3Q\3Q\5Q\u02be\nQ\3R\3R\3R\3R\3R\3S\3S\3"+
		"S\3S\3S\3T\3T\3T\3T\3T\3T\3T\3T\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3"+
		"V\3V\3V\3W\3W\5W\u02e3\nW\3X\3X\3X\3X\7X\u02e9\nX\fX\16X\u02ec\13X\3X"+
		"\3X\3Y\3Y\3Y\3Y\3Y\7Y\u02f5\nY\fY\16Y\u02f8\13Y\3Y\3Y\3Z\3Z\5Z\u02fe\n"+
		"Z\3[\3[\3\\\3\\\3]\3]\3^\3^\3_\3_\3`\5`\u030b\n`\3a\5a\u030e\na\3b\6b"+
		"\u0311\nb\rb\16b\u0312\3b\3b\3c\3c\3c\3c\7c\u031b\nc\fc\16c\u031e\13c"+
		"\3c\3c\3c\3c\3c\3d\6d\u0326\nd\rd\16d\u0327\3d\3d\3e\3e\3e\3e\7e\u0330"+
		"\ne\fe\16e\u0333\13e\3e\3e\5\u02ea\u02f6\u031c\2f\3\3\5\4\7\5\t\6\13\7"+
		"\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25"+
		")\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O"+
		")Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u<w=y>{?}@\177A\u0081"+
		"B\u0083C\u0085\2\u0087\2\u0089\2\u008b\2\u008dD\u008f\2\u0091\2\u0093"+
		"\2\u0095E\u0097\2\u0099\2\u009bF\u009dG\u009f\2\u00a1\2\u00a3\2\u00a5"+
		"\2\u00a7H\u00a9I\u00ab\2\u00adJ\u00af\2\u00b1\2\u00b3\2\u00b5\2\u00b7"+
		"\2\u00b9\2\u00bb\2\u00bd\2\u00bf\2\u00c1\2\u00c3K\u00c5L\u00c7M\u00c9"+
		"N\3\2\23\6\2--//``~~\5\2\'\',,\61\61\7\2##((,-//``\3\2\63;\4\2ZZzz\4\2"+
		"GGgg\4\2--//\13\2$$))^^cdhhppttvvxx\4\2bb\u0080\u0080\3\2\62;\3\2\629"+
		"\5\2\62;CHch\3\2\f\f\26\2\62;\u0662\u066b\u06f2\u06fb\u0968\u0971\u09e8"+
		"\u09f1\u0a68\u0a71\u0ae8\u0af1\u0b68\u0b71\u0be9\u0bf1\u0c68\u0c71\u0ce8"+
		"\u0cf1\u0d68\u0d71\u0e52\u0e5b\u0ed2\u0edb\u0f22\u0f2b\u1042\u104b\u136b"+
		"\u1373\u17e2\u17eb\u1812\u181b\uff12\uff1b\u0104\2C\\c|\u00ac\u00ac\u00b7"+
		"\u00b7\u00bc\u00bc\u00c2\u00d8\u00da\u00f8\u00fa\u0221\u0224\u0235\u0252"+
		"\u02af\u02b2\u02ba\u02bd\u02c3\u02d2\u02d3\u02e2\u02e6\u02f0\u02f0\u037c"+
		"\u037c\u0388\u0388\u038a\u038c\u038e\u038e\u0390\u03a3\u03a5\u03d0\u03d2"+
		"\u03d9\u03dc\u03f5\u0402\u0483\u048e\u04c6\u04c9\u04ca\u04cd\u04ce\u04d2"+
		"\u04f7\u04fa\u04fb\u0533\u0558\u055b\u055b\u0563\u0589\u05d2\u05ec\u05f2"+
		"\u05f4\u0623\u063c\u0642\u064c\u0673\u06d5\u06d7\u06d7\u06e7\u06e8\u06fc"+
		"\u06fe\u0712\u0712\u0714\u072e\u0782\u07a7\u0907\u093b\u093f\u093f\u0952"+
		"\u0952\u095a\u0963\u0987\u098e\u0991\u0992\u0995\u09aa\u09ac\u09b2\u09b4"+
		"\u09b4\u09b8\u09bb\u09de\u09df\u09e1\u09e3\u09f2\u09f3\u0a07\u0a0c\u0a11"+
		"\u0a12\u0a15\u0a2a\u0a2c\u0a32\u0a34\u0a35\u0a37\u0a38\u0a3a\u0a3b\u0a5b"+
		"\u0a5e\u0a60\u0a60\u0a74\u0a76\u0a87\u0a8d\u0a8f\u0a8f\u0a91\u0a93\u0a95"+
		"\u0aaa\u0aac\u0ab2\u0ab4\u0ab5\u0ab7\u0abb\u0abf\u0abf\u0ad2\u0ad2\u0ae2"+
		"\u0ae2\u0b07\u0b0e\u0b11\u0b12\u0b15\u0b2a\u0b2c\u0b32\u0b34\u0b35\u0b38"+
		"\u0b3b\u0b3f\u0b3f\u0b5e\u0b5f\u0b61\u0b63\u0b87\u0b8c\u0b90\u0b92\u0b94"+
		"\u0b97\u0b9b\u0b9c\u0b9e\u0b9e\u0ba0\u0ba1\u0ba5\u0ba6\u0baa\u0bac\u0bb0"+
		"\u0bb7\u0bb9\u0bbb\u0c07\u0c0e\u0c10\u0c12\u0c14\u0c2a\u0c2c\u0c35\u0c37"+
		"\u0c3b\u0c62\u0c63\u0c87\u0c8e\u0c90\u0c92\u0c94\u0caa\u0cac\u0cb5\u0cb7"+
		"\u0cbb\u0ce0\u0ce0\u0ce2\u0ce3\u0d07\u0d0e\u0d10\u0d12\u0d14\u0d2a\u0d2c"+
		"\u0d3b\u0d62\u0d63\u0d87\u0d98\u0d9c\u0db3\u0db5\u0dbd\u0dbf\u0dbf\u0dc2"+
		"\u0dc8\u0e03\u0e32\u0e34\u0e35\u0e42\u0e48\u0e83\u0e84\u0e86\u0e86\u0e89"+
		"\u0e8a\u0e8c\u0e8c\u0e8f\u0e8f\u0e96\u0e99\u0e9b\u0ea1\u0ea3\u0ea5\u0ea7"+
		"\u0ea7\u0ea9\u0ea9\u0eac\u0ead\u0eaf\u0eb2\u0eb4\u0eb5\u0ebf\u0ec6\u0ec8"+
		"\u0ec8\u0ede\u0edf\u0f02\u0f02\u0f42\u0f6c\u0f8a\u0f8d\u1002\u1023\u1025"+
		"\u1029\u102b\u102c\u1052\u1057\u10a2\u10c7\u10d2\u10f8\u1102\u115b\u1161"+
		"\u11a4\u11aa\u11fb\u1202\u1208\u120a\u1248\u124a\u124a\u124c\u124f\u1252"+
		"\u1258\u125a\u125a\u125c\u125f\u1262\u1288\u128a\u128a\u128c\u128f\u1292"+
		"\u12b0\u12b2\u12b2\u12b4\u12b7\u12ba\u12c0\u12c2\u12c2\u12c4\u12c7\u12ca"+
		"\u12d0\u12d2\u12d8\u12da\u12f0\u12f2\u1310\u1312\u1312\u1314\u1317\u131a"+
		"\u1320\u1322\u1348\u134a\u135c\u13a2\u13f6\u1403\u1678\u1683\u169c\u16a2"+
		"\u16ec\u1782\u17b5\u1822\u1879\u1882\u18aa\u1e02\u1e9d\u1ea2\u1efb\u1f02"+
		"\u1f17\u1f1a\u1f1f\u1f22\u1f47\u1f4a\u1f4f\u1f52\u1f59\u1f5b\u1f5b\u1f5d"+
		"\u1f5d\u1f5f\u1f5f\u1f61\u1f7f\u1f82\u1fb6\u1fb8\u1fbe\u1fc0\u1fc0\u1fc4"+
		"\u1fc6\u1fc8\u1fce\u1fd2\u1fd5\u1fd8\u1fdd\u1fe2\u1fee\u1ff4\u1ff6\u1ff8"+
		"\u1ffe\u2081\u2081\u2104\u2104\u2109\u2109\u210c\u2115\u2117\u2117\u211b"+
		"\u211f\u2126\u2126\u2128\u2128\u212a\u212a\u212c\u212f\u2131\u2133\u2135"+
		"\u213b\u2162\u2185\u3007\u3009\u3023\u302b\u3033\u3037\u303a\u303c\u3043"+
		"\u3096\u309f\u30a0\u30a3\u30fc\u30fe\u3100\u3107\u312e\u3133\u3190\u31a2"+
		"\u31b9\u3402\u3402\u4db7\u4db7\u4e02\u4e02\u9fa7\u9fa7\ua002\ua48e\uac02"+
		"\uac02\ud7a5\ud7a5\uf902\ufa2f\ufb02\ufb08\ufb15\ufb19\ufb1f\ufb1f\ufb21"+
		"\ufb2a\ufb2c\ufb38\ufb3a\ufb3e\ufb40\ufb40\ufb42\ufb43\ufb45\ufb46\ufb48"+
		"\ufbb3\ufbd5\ufd3f\ufd52\ufd91\ufd94\ufdc9\ufdf2\ufdfd\ufe72\ufe74\ufe76"+
		"\ufe76\ufe78\ufefe\uff23\uff3c\uff43\uff5c\uff68\uffc0\uffc4\uffc9\uffcc"+
		"\uffd1\uffd4\uffd9\uffdc\uffde\4\2\13\13\"\"\4\2\f\f\17\17\2\u0363\2\3"+
		"\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2"+
		"\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31"+
		"\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2"+
		"\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2"+
		"\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2"+
		"\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2"+
		"I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3"+
		"\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2"+
		"\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2"+
		"o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3"+
		"\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u008d"+
		"\3\2\2\2\2\u0095\3\2\2\2\2\u009b\3\2\2\2\2\u009d\3\2\2\2\2\u00a7\3\2\2"+
		"\2\2\u00a9\3\2\2\2\2\u00ad\3\2\2\2\2\u00c3\3\2\2\2\2\u00c5\3\2\2\2\2\u00c7"+
		"\3\2\2\2\2\u00c9\3\2\2\2\3\u00cb\3\2\2\2\5\u00d3\3\2\2\2\7\u00da\3\2\2"+
		"\2\t\u00dc\3\2\2\2\13\u00de\3\2\2\2\r\u00e0\3\2\2\2\17\u00e6\3\2\2\2\21"+
		"\u00e8\3\2\2\2\23\u00ea\3\2\2\2\25\u00ef\3\2\2\2\27\u00f4\3\2\2\2\31\u00f8"+
		"\3\2\2\2\33\u00fa\3\2\2\2\35\u00fc\3\2\2\2\37\u00ff\3\2\2\2!\u0102\3\2"+
		"\2\2#\u0105\3\2\2\2%\u0107\3\2\2\2\'\u0109\3\2\2\2)\u010b\3\2\2\2+\u010d"+
		"\3\2\2\2-\u010f\3\2\2\2/\u0111\3\2\2\2\61\u0113\3\2\2\2\63\u0116\3\2\2"+
		"\2\65\u0119\3\2\2\2\67\u011b\3\2\2\29\u011e\3\2\2\2;\u0121\3\2\2\2=\u0123"+
		"\3\2\2\2?\u0125\3\2\2\2A\u012c\3\2\2\2C\u0132\3\2\2\2E\u013b\3\2\2\2G"+
		"\u0140\3\2\2\2I\u014c\3\2\2\2K\u0152\3\2\2\2M\u0155\3\2\2\2O\u015a\3\2"+
		"\2\2Q\u0161\3\2\2\2S\u0166\3\2\2\2U\u016e\3\2\2\2W\u0175\3\2\2\2Y\u0179"+
		"\3\2\2\2[\u017f\3\2\2\2]\u0182\3\2\2\2_\u0184\3\2\2\2a\u0186\3\2\2\2c"+
		"\u0190\3\2\2\2e\u0194\3\2\2\2g\u0199\3\2\2\2i\u019d\3\2\2\2k\u01a4\3\2"+
		"\2\2m\u01a8\3\2\2\2o\u01ab\3\2\2\2q\u01ae\3\2\2\2s\u01b1\3\2\2\2u\u01b4"+
		"\3\2\2\2w\u01b6\3\2\2\2y\u01b9\3\2\2\2{\u01bb\3\2\2\2}\u01be\3\2\2\2\177"+
		"\u01c0\3\2\2\2\u0081\u0249\3\2\2\2\u0083\u0252\3\2\2\2\u0085\u025e\3\2"+
		"\2\2\u0087\u0260\3\2\2\2\u0089\u026a\3\2\2\2\u008b\u026f\3\2\2\2\u008d"+
		"\u0274\3\2\2\2\u008f\u0276\3\2\2\2\u0091\u027d\3\2\2\2\u0093\u0284\3\2"+
		"\2\2\u0095\u029b\3\2\2\2\u0097\u029e\3\2\2\2\u0099\u02a2\3\2\2\2\u009b"+
		"\u02aa\3\2\2\2\u009d\u02ae\3\2\2\2\u009f\u02b9\3\2\2\2\u00a1\u02bd\3\2"+
		"\2\2\u00a3\u02bf\3\2\2\2\u00a5\u02c4\3\2\2\2\u00a7\u02c9\3\2\2\2\u00a9"+
		"\u02d1\3\2\2\2\u00ab\u02dd\3\2\2\2\u00ad\u02e2\3\2\2\2\u00af\u02e4\3\2"+
		"\2\2\u00b1\u02ef\3\2\2\2\u00b3\u02fd\3\2\2\2\u00b5\u02ff\3\2\2\2\u00b7"+
		"\u0301\3\2\2\2\u00b9\u0303\3\2\2\2\u00bb\u0305\3\2\2\2\u00bd\u0307\3\2"+
		"\2\2\u00bf\u030a\3\2\2\2\u00c1\u030d\3\2\2\2\u00c3\u0310\3\2\2\2\u00c5"+
		"\u0316\3\2\2\2\u00c7\u0325\3\2\2\2\u00c9\u032b\3\2\2\2\u00cb\u00cc\7r"+
		"\2\2\u00cc\u00cd\7c\2\2\u00cd\u00ce\7e\2\2\u00ce\u00cf\7m\2\2\u00cf\u00d0"+
		"\7c\2\2\u00d0\u00d1\7i\2\2\u00d1\u00d2\7g\2\2\u00d2\4\3\2\2\2\u00d3\u00d4"+
		"\7k\2\2\u00d4\u00d5\7o\2\2\u00d5\u00d6\7r\2\2\u00d6\u00d7\7q\2\2\u00d7"+
		"\u00d8\7t\2\2\u00d8\u00d9\7v\2\2\u00d9\6\3\2\2\2\u00da\u00db\7*\2\2\u00db"+
		"\b\3\2\2\2\u00dc\u00dd\7+\2\2\u00dd\n\3\2\2\2\u00de\u00df\7\60\2\2\u00df"+
		"\f\3\2\2\2\u00e0\u00e1\7e\2\2\u00e1\u00e2\7q\2\2\u00e2\u00e3\7p\2\2\u00e3"+
		"\u00e4\7u\2\2\u00e4\u00e5\7v\2\2\u00e5\16\3\2\2\2\u00e6\u00e7\7?\2\2\u00e7"+
		"\20\3\2\2\2\u00e8\u00e9\7.\2\2\u00e9\22\3\2\2\2\u00ea\u00eb\7v\2\2\u00eb"+
		"\u00ec\7{\2\2\u00ec\u00ed\7r\2\2\u00ed\u00ee\7g\2\2\u00ee\24\3\2\2\2\u00ef"+
		"\u00f0\7h\2\2\u00f0\u00f1\7w\2\2\u00f1\u00f2\7p\2\2\u00f2\u00f3\7e\2\2"+
		"\u00f3\26\3\2\2\2\u00f4\u00f5\7x\2\2\u00f5\u00f6\7c\2\2\u00f6\u00f7\7"+
		"t\2\2\u00f7\30\3\2\2\2\u00f8\u00f9\7}\2\2\u00f9\32\3\2\2\2\u00fa\u00fb"+
		"\7\177\2\2\u00fb\34\3\2\2\2\u00fc\u00fd\7>\2\2\u00fd\u00fe\7/\2\2\u00fe"+
		"\36\3\2\2\2\u00ff\u0100\7-\2\2\u0100\u0101\7-\2\2\u0101 \3\2\2\2\u0102"+
		"\u0103\7/\2\2\u0103\u0104\7/\2\2\u0104\"\3\2\2\2\u0105\u0106\7-\2\2\u0106"+
		"$\3\2\2\2\u0107\u0108\7/\2\2\u0108&\3\2\2\2\u0109\u010a\7~\2\2\u010a("+
		"\3\2\2\2\u010b\u010c\7`\2\2\u010c*\3\2\2\2\u010d\u010e\7,\2\2\u010e,\3"+
		"\2\2\2\u010f\u0110\7\61\2\2\u0110.\3\2\2\2\u0111\u0112\7\'\2\2\u0112\60"+
		"\3\2\2\2\u0113\u0114\7>\2\2\u0114\u0115\7>\2\2\u0115\62\3\2\2\2\u0116"+
		"\u0117\7@\2\2\u0117\u0118\7@\2\2\u0118\64\3\2\2\2\u0119\u011a\7(\2\2\u011a"+
		"\66\3\2\2\2\u011b\u011c\7(\2\2\u011c\u011d\7`\2\2\u011d8\3\2\2\2\u011e"+
		"\u011f\7<\2\2\u011f\u0120\7?\2\2\u0120:\3\2\2\2\u0121\u0122\7=\2\2\u0122"+
		"<\3\2\2\2\u0123\u0124\7<\2\2\u0124>\3\2\2\2\u0125\u0126\7t\2\2\u0126\u0127"+
		"\7g\2\2\u0127\u0128\7v\2\2\u0128\u0129\7w\2\2\u0129\u012a\7t\2\2\u012a"+
		"\u012b\7p\2\2\u012b@\3\2\2\2\u012c\u012d\7d\2\2\u012d\u012e\7t\2\2\u012e"+
		"\u012f\7g\2\2\u012f\u0130\7c\2\2\u0130\u0131\7m\2\2\u0131B\3\2\2\2\u0132"+
		"\u0133\7e\2\2\u0133\u0134\7q\2\2\u0134\u0135\7p\2\2\u0135\u0136\7v\2\2"+
		"\u0136\u0137\7k\2\2\u0137\u0138\7p\2\2\u0138\u0139\7w\2\2\u0139\u013a"+
		"\7g\2\2\u013aD\3\2\2\2\u013b\u013c\7i\2\2\u013c\u013d\7q\2\2\u013d\u013e"+
		"\7v\2\2\u013e\u013f\7q\2\2\u013fF\3\2\2\2\u0140\u0141\7h\2\2\u0141\u0142"+
		"\7c\2\2\u0142\u0143\7n\2\2\u0143\u0144\7n\2\2\u0144\u0145\7v\2\2\u0145"+
		"\u0146\7j\2\2\u0146\u0147\7t\2\2\u0147\u0148\7q\2\2\u0148\u0149\7w\2\2"+
		"\u0149\u014a\7i\2\2\u014a\u014b\7j\2\2\u014bH\3\2\2\2\u014c\u014d\7f\2"+
		"\2\u014d\u014e\7g\2\2\u014e\u014f\7h\2\2\u014f\u0150\7g\2\2\u0150\u0151"+
		"\7t\2\2\u0151J\3\2\2\2\u0152\u0153\7k\2\2\u0153\u0154\7h\2\2\u0154L\3"+
		"\2\2\2\u0155\u0156\7g\2\2\u0156\u0157\7n\2\2\u0157\u0158\7u\2\2\u0158"+
		"\u0159\7g\2\2\u0159N\3\2\2\2\u015a\u015b\7u\2\2\u015b\u015c\7y\2\2\u015c"+
		"\u015d\7k\2\2\u015d\u015e\7v\2\2\u015e\u015f\7e\2\2\u015f\u0160\7j\2\2"+
		"\u0160P\3\2\2\2\u0161\u0162\7e\2\2\u0162\u0163\7c\2\2\u0163\u0164\7u\2"+
		"\2\u0164\u0165\7g\2\2\u0165R\3\2\2\2\u0166\u0167\7f\2\2\u0167\u0168\7"+
		"g\2\2\u0168\u0169\7h\2\2\u0169\u016a\7c\2\2\u016a\u016b\7w\2\2\u016b\u016c"+
		"\7n\2\2\u016c\u016d\7v\2\2\u016dT\3\2\2\2\u016e\u016f\7u\2\2\u016f\u0170"+
		"\7g\2\2\u0170\u0171\7n\2\2\u0171\u0172\7g\2\2\u0172\u0173\7e\2\2\u0173"+
		"\u0174\7v\2\2\u0174V\3\2\2\2\u0175\u0176\7h\2\2\u0176\u0177\7q\2\2\u0177"+
		"\u0178\7t\2\2\u0178X\3\2\2\2\u0179\u017a\7t\2\2\u017a\u017b\7c\2\2\u017b"+
		"\u017c\7p\2\2\u017c\u017d\7i\2\2\u017d\u017e\7g\2\2\u017eZ\3\2\2\2\u017f"+
		"\u0180\7i\2\2\u0180\u0181\7q\2\2\u0181\\\3\2\2\2\u0182\u0183\7]\2\2\u0183"+
		"^\3\2\2\2\u0184\u0185\7_\2\2\u0185`\3\2\2\2\u0186\u0187\7k\2\2\u0187\u0188"+
		"\7p\2\2\u0188\u0189\7v\2\2\u0189\u018a\7g\2\2\u018a\u018b\7t\2\2\u018b"+
		"\u018c\7h\2\2\u018c\u018d\7c\2\2\u018d\u018e\7e\2\2\u018e\u018f\7g\2\2"+
		"\u018fb\3\2\2\2\u0190\u0191\7o\2\2\u0191\u0192\7c\2\2\u0192\u0193\7r\2"+
		"\2\u0193d\3\2\2\2\u0194\u0195\7e\2\2\u0195\u0196\7j\2\2\u0196\u0197\7"+
		"c\2\2\u0197\u0198\7p\2\2\u0198f\3\2\2\2\u0199\u019a\7\60\2\2\u019a\u019b"+
		"\7\60\2\2\u019b\u019c\7\60\2\2\u019ch\3\2\2\2\u019d\u019e\7u\2\2\u019e"+
		"\u019f\7v\2\2\u019f\u01a0\7t\2\2\u01a0\u01a1\7w\2\2\u01a1\u01a2\7e\2\2"+
		"\u01a2\u01a3\7v\2\2\u01a3j\3\2\2\2\u01a4\u01a5\7p\2\2\u01a5\u01a6\7k\2"+
		"\2\u01a6\u01a7\7n\2\2\u01a7l\3\2\2\2\u01a8\u01a9\7~\2\2\u01a9\u01aa\7"+
		"~\2\2\u01aan\3\2\2\2\u01ab\u01ac\7(\2\2\u01ac\u01ad\7(\2\2\u01adp\3\2"+
		"\2\2\u01ae\u01af\7?\2\2\u01af\u01b0\7?\2\2\u01b0r\3\2\2\2\u01b1\u01b2"+
		"\7#\2\2\u01b2\u01b3\7?\2\2\u01b3t\3\2\2\2\u01b4\u01b5\7>\2\2\u01b5v\3"+
		"\2\2\2\u01b6\u01b7\7>\2\2\u01b7\u01b8\7?\2\2\u01b8x\3\2\2\2\u01b9\u01ba"+
		"\7@\2\2\u01baz\3\2\2\2\u01bb\u01bc\7@\2\2\u01bc\u01bd\7?\2\2\u01bd|\3"+
		"\2\2\2\u01be\u01bf\7#\2\2\u01bf~\3\2\2\2\u01c0\u01c5\5\u00b3Z\2\u01c1"+
		"\u01c4\5\u00b3Z\2\u01c2\u01c4\5\u00bf`\2\u01c3\u01c1\3\2\2\2\u01c3\u01c2"+
		"\3\2\2\2\u01c4\u01c7\3\2\2\2\u01c5\u01c3\3\2\2\2\u01c5\u01c6\3\2\2\2\u01c6"+
		"\u0080\3\2\2\2\u01c7\u01c5\3\2\2\2\u01c8\u01c9\7d\2\2\u01c9\u01ca\7t\2"+
		"\2\u01ca\u01cb\7g\2\2\u01cb\u01cc\7c\2\2\u01cc\u024a\7m\2\2\u01cd\u01ce"+
		"\7f\2\2\u01ce\u01cf\7g\2\2\u01cf\u01d0\7h\2\2\u01d0\u01d1\7c\2\2\u01d1"+
		"\u01d2\7w\2\2\u01d2\u01d3\7n\2\2\u01d3\u024a\7v\2\2\u01d4\u01d5\7h\2\2"+
		"\u01d5\u01d6\7w\2\2\u01d6\u01d7\7p\2\2\u01d7\u024a\7e\2\2\u01d8\u01d9"+
		"\7k\2\2\u01d9\u01da\7p\2\2\u01da\u01db\7v\2\2\u01db\u01dc\7g\2\2\u01dc"+
		"\u01dd\7t\2\2\u01dd\u01de\7h\2\2\u01de\u01df\7c\2\2\u01df\u01e0\7e\2\2"+
		"\u01e0\u024a\7g\2\2\u01e1\u01e2\7u\2\2\u01e2\u01e3\7g\2\2\u01e3\u01e4"+
		"\7n\2\2\u01e4\u01e5\7g\2\2\u01e5\u01e6\7e\2\2\u01e6\u024a\7v\2\2\u01e7"+
		"\u01e8\7e\2\2\u01e8\u01e9\7c\2\2\u01e9\u01ea\7u\2\2\u01ea\u024a\7g\2\2"+
		"\u01eb\u01ec\7f\2\2\u01ec\u01ed\7g\2\2\u01ed\u01ee\7h\2\2\u01ee\u01ef"+
		"\7g\2\2\u01ef\u024a\7t\2\2\u01f0\u01f1\7i\2\2\u01f1\u024a\7q\2\2\u01f2"+
		"\u01f3\7o\2\2\u01f3\u01f4\7c\2\2\u01f4\u024a\7r\2\2\u01f5\u01f6\7u\2\2"+
		"\u01f6\u01f7\7v\2\2\u01f7\u01f8\7t\2\2\u01f8\u01f9\7w\2\2\u01f9\u01fa"+
		"\7e\2\2\u01fa\u024a\7v\2\2\u01fb\u01fc\7e\2\2\u01fc\u01fd\7j\2\2\u01fd"+
		"\u01fe\7c\2\2\u01fe\u024a\7p\2\2\u01ff\u0200\7g\2\2\u0200\u0201\7n\2\2"+
		"\u0201\u0202\7u\2\2\u0202\u024a\7g\2\2\u0203\u0204\7i\2\2\u0204\u0205"+
		"\7q\2\2\u0205\u0206\7v\2\2\u0206\u024a\7q\2\2\u0207\u0208\7r\2\2\u0208"+
		"\u0209\7c\2\2\u0209\u020a\7e\2\2\u020a\u020b\7m\2\2\u020b\u020c\7c\2\2"+
		"\u020c\u020d\7i\2\2\u020d\u024a\7g\2\2\u020e\u020f\7u\2\2\u020f\u0210"+
		"\7y\2\2\u0210\u0211\7k\2\2\u0211\u0212\7v\2\2\u0212\u0213\7e\2\2\u0213"+
		"\u024a\7j\2\2\u0214\u0215\7e\2\2\u0215\u0216\7q\2\2\u0216\u0217\7p\2\2"+
		"\u0217\u0218\7u\2\2\u0218\u024a\7v\2\2\u0219\u021a\7h\2\2\u021a\u021b"+
		"\7c\2\2\u021b\u021c\7n\2\2\u021c\u021d\7n\2\2\u021d\u021e\7v\2\2\u021e"+
		"\u021f\7j\2\2\u021f\u0220\7t\2\2\u0220\u0221\7q\2\2\u0221\u0222\7w\2\2"+
		"\u0222\u0223\7i\2\2\u0223\u024a\7j\2\2\u0224\u0225\7k\2\2\u0225\u024a"+
		"\7h\2\2\u0226\u0227\7t\2\2\u0227\u0228\7c\2\2\u0228\u0229\7p\2\2\u0229"+
		"\u022a\7i\2\2\u022a\u024a\7g\2\2\u022b\u022c\7v\2\2\u022c\u022d\7{\2\2"+
		"\u022d\u022e\7r\2\2\u022e\u024a\7g\2\2\u022f\u0230\7e\2\2\u0230\u0231"+
		"\7q\2\2\u0231\u0232\7p\2\2\u0232\u0233\7v\2\2\u0233\u0234\7k\2\2\u0234"+
		"\u0235\7p\2\2\u0235\u0236\7w\2\2\u0236\u024a\7g\2\2\u0237\u0238\7h\2\2"+
		"\u0238\u0239\7q\2\2\u0239\u024a\7t\2\2\u023a\u023b\7k\2\2\u023b\u023c"+
		"\7o\2\2\u023c\u023d\7r\2\2\u023d\u023e\7q\2\2\u023e\u023f\7t\2\2\u023f"+
		"\u024a\7v\2\2\u0240\u0241\7t\2\2\u0241\u0242\7g\2\2\u0242\u0243\7v\2\2"+
		"\u0243\u0244\7w\2\2\u0244\u0245\7t\2\2\u0245\u024a\7p\2\2\u0246\u0247"+
		"\7x\2\2\u0247\u0248\7c\2\2\u0248\u024a\7t\2\2\u0249\u01c8\3\2\2\2\u0249"+
		"\u01cd\3\2\2\2\u0249\u01d4\3\2\2\2\u0249\u01d8\3\2\2\2\u0249\u01e1\3\2"+
		"\2\2\u0249\u01e7\3\2\2\2\u0249\u01eb\3\2\2\2\u0249\u01f0\3\2\2\2\u0249"+
		"\u01f2\3\2\2\2\u0249\u01f5\3\2\2\2\u0249\u01fb\3\2\2\2\u0249\u01ff\3\2"+
		"\2\2\u0249\u0203\3\2\2\2\u0249\u0207\3\2\2\2\u0249\u020e\3\2\2\2\u0249"+
		"\u0214\3\2\2\2\u0249\u0219\3\2\2\2\u0249\u0224\3\2\2\2\u0249\u0226\3\2"+
		"\2\2\u0249\u022b\3\2\2\2\u0249\u022f\3\2\2\2\u0249\u0237\3\2\2\2\u0249"+
		"\u023a\3\2\2\2\u0249\u0240\3\2\2\2\u0249\u0246\3\2\2\2\u024a\u0082\3\2"+
		"\2\2\u024b\u024c\7~\2\2\u024c\u0253\7~\2\2\u024d\u024e\7(\2\2\u024e\u0253"+
		"\7(\2\2\u024f\u0253\5\u0085C\2\u0250\u0253\5\u0087D\2\u0251\u0253\5\u0089"+
		"E\2\u0252\u024b\3\2\2\2\u0252\u024d\3\2\2\2\u0252\u024f\3\2\2\2\u0252"+
		"\u0250\3\2\2\2\u0252\u0251\3\2\2\2\u0253\u0084\3\2\2\2\u0254\u0255\7?"+
		"\2\2\u0255\u025f\7?\2\2\u0256\u0257\7#\2\2\u0257\u025f\7?\2\2\u0258\u025f"+
		"\7>\2\2\u0259\u025a\7>\2\2\u025a\u025f\7?\2\2\u025b\u025f\7@\2\2\u025c"+
		"\u025d\7@\2\2\u025d\u025f\7?\2\2\u025e\u0254\3\2\2\2\u025e\u0256\3\2\2"+
		"\2\u025e\u0258\3\2\2\2\u025e\u0259\3\2\2\2\u025e\u025b\3\2\2\2\u025e\u025c"+
		"\3\2\2\2\u025f\u0086\3\2\2\2\u0260\u0261\t\2\2\2\u0261\u0088\3\2\2\2\u0262"+
		"\u026b\t\3\2\2\u0263\u0264\7>\2\2\u0264\u026b\7>\2\2\u0265\u0266\7@\2"+
		"\2\u0266\u026b\7@\2\2\u0267\u026b\7(\2\2\u0268\u0269\7(\2\2\u0269\u026b"+
		"\7`\2\2\u026a\u0262\3\2\2\2\u026a\u0263\3\2\2\2\u026a\u0265\3\2\2\2\u026a"+
		"\u0267\3\2\2\2\u026a\u0268\3\2\2\2\u026b\u008a\3\2\2\2\u026c\u0270\t\4"+
		"\2\2\u026d\u026e\7>\2\2\u026e\u0270\7/\2\2\u026f\u026c\3\2\2\2\u026f\u026d"+
		"\3\2\2\2\u0270\u008c\3\2\2\2\u0271\u0275\5\u008fH\2\u0272\u0275\5\u0091"+
		"I\2\u0273\u0275\5\u0093J\2\u0274\u0271\3\2\2\2\u0274\u0272\3\2\2\2\u0274"+
		"\u0273\3\2\2\2\u0275\u008e\3\2\2\2\u0276\u027a\t\5\2\2\u0277\u0279\5\u00b5"+
		"[\2\u0278\u0277\3\2\2\2\u0279\u027c\3\2\2\2\u027a\u0278\3\2\2\2\u027a"+
		"\u027b\3\2\2\2\u027b\u0090\3\2\2\2\u027c\u027a\3\2\2\2\u027d\u0281\7\62"+
		"\2\2\u027e\u0280\5\u00b7\\\2\u027f\u027e\3\2\2\2\u0280\u0283\3\2\2\2\u0281"+
		"\u027f\3\2\2\2\u0281\u0282\3\2\2\2\u0282\u0092\3\2\2\2\u0283\u0281\3\2"+
		"\2\2\u0284\u0285\7\62\2\2\u0285\u0287\t\6\2\2\u0286\u0288\5\u00b9]\2\u0287"+
		"\u0286\3\2\2\2\u0288\u0289\3\2\2\2\u0289\u0287\3\2\2\2\u0289\u028a\3\2"+
		"\2\2\u028a\u0094\3\2\2\2\u028b\u028c\5\u0097L\2\u028c\u028e\7\60\2\2\u028d"+
		"\u028f\5\u0097L\2\u028e\u028d\3\2\2\2\u028e\u028f\3\2\2\2\u028f\u0291"+
		"\3\2\2\2\u0290\u0292\5\u0099M\2\u0291\u0290\3\2\2\2\u0291\u0292\3\2\2"+
		"\2\u0292\u029c\3\2\2\2\u0293\u0294\5\u0097L\2\u0294\u0295\5\u0099M\2\u0295"+
		"\u029c\3\2\2\2\u0296\u0297\7\60\2\2\u0297\u0299\5\u0097L\2\u0298\u029a"+
		"\5\u0099M\2\u0299\u0298\3\2\2\2\u0299\u029a\3\2\2\2\u029a\u029c\3\2\2"+
		"\2\u029b\u028b\3\2\2\2\u029b\u0293\3\2\2\2\u029b\u0296\3\2\2\2\u029c\u0096"+
		"\3\2\2\2\u029d\u029f\5\u00b5[\2\u029e\u029d\3\2\2\2\u029f\u02a0\3\2\2"+
		"\2\u02a0\u029e\3\2\2\2\u02a0\u02a1\3\2\2\2\u02a1\u0098\3\2\2\2\u02a2\u02a4"+
		"\t\7\2\2\u02a3\u02a5\t\b\2\2\u02a4\u02a3\3\2\2\2\u02a4\u02a5\3\2\2\2\u02a5"+
		"\u02a6\3\2\2\2\u02a6\u02a7\5\u0097L\2\u02a7\u009a\3\2\2\2\u02a8\u02ab"+
		"\5\u0097L\2\u02a9\u02ab\5\u0095K\2\u02aa\u02a8\3\2\2\2\u02aa\u02a9\3\2"+
		"\2\2\u02ab\u02ac\3\2\2\2\u02ac\u02ad\7k\2\2\u02ad\u009c\3\2\2\2\u02ae"+
		"\u02b1\7)\2\2\u02af\u02b2\5\u009fP\2\u02b0\u02b2\5\u00a1Q\2\u02b1\u02af"+
		"\3\2\2\2\u02b1\u02b0\3\2\2\2\u02b2\u02b3\3\2\2\2\u02b3\u02b4\7)\2\2\u02b4"+
		"\u009e\3\2\2\2\u02b5\u02ba\5\u00bd_\2\u02b6\u02ba\5\u00a7T\2\u02b7\u02ba"+
		"\5\u00a9U\2\u02b8\u02ba\5\u00abV\2\u02b9\u02b5\3\2\2\2\u02b9\u02b6\3\2"+
		"\2\2\u02b9\u02b7\3\2\2\2\u02b9\u02b8\3\2\2\2\u02ba\u00a0\3\2\2\2\u02bb"+
		"\u02be\5\u00a3R\2\u02bc\u02be\5\u00a5S\2\u02bd\u02bb\3\2\2\2\u02bd\u02bc"+
		"\3\2\2\2\u02be\u00a2\3\2\2\2\u02bf\u02c0\7^\2\2\u02c0\u02c1\5\u00b7\\"+
		"\2\u02c1\u02c2\5\u00b7\\\2\u02c2\u02c3\5\u00b7\\\2\u02c3\u00a4\3\2\2\2"+
		"\u02c4\u02c5\7^\2\2\u02c5\u02c6\7z\2\2\u02c6\u02c7\5\u00b9]\2\u02c7\u02c8"+
		"\5\u00b9]\2\u02c8\u00a6\3\2\2\2\u02c9\u02ca\7^\2\2\u02ca\u02cb\7w\2\2"+
		"\u02cb\u02cc\3\2\2\2\u02cc\u02cd\5\u00b9]\2\u02cd\u02ce\5\u00b9]\2\u02ce"+
		"\u02cf\5\u00b9]\2\u02cf\u02d0\5\u00b9]\2\u02d0\u00a8\3\2\2\2\u02d1\u02d2"+
		"\7^\2\2\u02d2\u02d3\7W\2\2\u02d3\u02d4\3\2\2\2\u02d4\u02d5\5\u00b9]\2"+
		"\u02d5\u02d6\5\u00b9]\2\u02d6\u02d7\5\u00b9]\2\u02d7\u02d8\5\u00b9]\2"+
		"\u02d8\u02d9\5\u00b9]\2\u02d9\u02da\5\u00b9]\2\u02da\u02db\5\u00b9]\2"+
		"\u02db\u02dc\5\u00b9]\2\u02dc\u00aa\3\2\2\2\u02dd\u02de\7^\2\2\u02de\u02df"+
		"\t\t\2\2\u02df\u00ac\3\2\2\2\u02e0\u02e3\5\u00afX\2\u02e1\u02e3\5\u00b1"+
		"Y\2\u02e2\u02e0\3\2\2\2\u02e2\u02e1\3\2\2\2\u02e3\u00ae\3\2\2\2\u02e4"+
		"\u02ea\7b\2\2\u02e5\u02e9\5\u00bd_\2\u02e6\u02e9\5\u00bb^\2\u02e7\u02e9"+
		"\t\n\2\2\u02e8\u02e5\3\2\2\2\u02e8\u02e6\3\2\2\2\u02e8\u02e7\3\2\2\2\u02e9"+
		"\u02ec\3\2\2\2\u02ea\u02eb\3\2\2\2\u02ea\u02e8\3\2\2\2\u02eb\u02ed\3\2"+
		"\2\2\u02ec\u02ea\3\2\2\2\u02ed\u02ee\7b\2\2\u02ee\u00b0\3\2\2\2\u02ef"+
		"\u02f6\7$\2\2\u02f0\u02f1\7^\2\2\u02f1\u02f5\7$\2\2\u02f2\u02f5\5\u009f"+
		"P\2\u02f3\u02f5\5\u00a1Q\2\u02f4\u02f0\3\2\2\2\u02f4\u02f2\3\2\2\2\u02f4"+
		"\u02f3\3\2\2\2\u02f5\u02f8\3\2\2\2\u02f6\u02f7\3\2\2\2\u02f6\u02f4\3\2"+
		"\2\2\u02f7\u02f9\3\2\2\2\u02f8\u02f6\3\2\2\2\u02f9\u02fa\7$\2\2\u02fa"+
		"\u00b2\3\2\2\2\u02fb\u02fe\5\u00c1a\2\u02fc\u02fe\7a\2\2\u02fd\u02fb\3"+
		"\2\2\2\u02fd\u02fc\3\2\2\2\u02fe\u00b4\3\2\2\2\u02ff\u0300\t\13\2\2\u0300"+
		"\u00b6\3\2\2\2\u0301\u0302\t\f\2\2\u0302\u00b8\3\2\2\2\u0303\u0304\t\r"+
		"\2\2\u0304\u00ba\3\2\2\2\u0305\u0306\t\16\2\2\u0306\u00bc\3\2\2\2\u0307"+
		"\u0308\n\16\2\2\u0308\u00be\3\2\2\2\u0309\u030b\t\17\2\2\u030a\u0309\3"+
		"\2\2\2\u030b\u00c0\3\2\2\2\u030c\u030e\t\20\2\2\u030d\u030c\3\2\2\2\u030e"+
		"\u00c2\3\2\2\2\u030f\u0311\t\21\2\2\u0310\u030f\3\2\2\2\u0311\u0312\3"+
		"\2\2\2\u0312\u0310\3\2\2\2\u0312\u0313\3\2\2\2\u0313\u0314\3\2\2\2\u0314"+
		"\u0315\bb\2\2\u0315\u00c4\3\2\2\2\u0316\u0317\7\61\2\2\u0317\u0318\7,"+
		"\2\2\u0318\u031c\3\2\2\2\u0319\u031b\13\2\2\2\u031a\u0319\3\2\2\2\u031b"+
		"\u031e\3\2\2\2\u031c\u031d\3\2\2\2\u031c\u031a\3\2\2\2\u031d\u031f\3\2"+
		"\2\2\u031e\u031c\3\2\2\2\u031f\u0320\7,\2\2\u0320\u0321\7\61\2\2\u0321"+
		"\u0322\3\2\2\2\u0322\u0323\bc\2\2\u0323\u00c6\3\2\2\2\u0324\u0326\t\22"+
		"\2\2\u0325\u0324\3\2\2\2\u0326\u0327\3\2\2\2\u0327\u0325\3\2\2\2\u0327"+
		"\u0328\3\2\2\2\u0328\u0329\3\2\2\2\u0329\u032a\bd\2\2\u032a\u00c8\3\2"+
		"\2\2\u032b\u032c\7\61\2\2\u032c\u032d\7\61\2\2\u032d\u0331\3\2\2\2\u032e"+
		"\u0330\n\22\2\2\u032f\u032e\3\2\2\2\u0330\u0333\3\2\2\2\u0331\u032f\3"+
		"\2\2\2\u0331\u0332\3\2\2\2\u0332\u0334\3\2\2\2\u0333\u0331\3\2\2\2\u0334"+
		"\u0335\be\3\2\u0335\u00ca\3\2\2\2$\2\u01c3\u01c5\u0249\u0252\u025e\u026a"+
		"\u026f\u0274\u027a\u0281\u0289\u028e\u0291\u0299\u029b\u02a0\u02a4\u02aa"+
		"\u02b1\u02b9\u02bd\u02e2\u02e8\u02ea\u02f4\u02f6\u02fd\u030a\u030d\u0312"+
		"\u031c\u0327\u0331\4\2\3\2\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}