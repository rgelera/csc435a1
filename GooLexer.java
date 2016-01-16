// Generated from Goo.g4 by ANTLR 4.5.1

import java.util.*;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GooLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, BREAK=35, CASE=36, CHAN=37, CONST=38, CONTINUE=39, 
		DEFAULT=40, DEFER=41, ELSE=42, FALLTHROUGH=43, FOR=44, FUNC=45, GO=46, 
		GOTO=47, IF=48, IMPORT=49, INTERFACE=50, MAP=51, PACKAGE=52, RANGE=53, 
		RETURN=54, SELECT=55, STRUCT=56, SWITCH=57, TYPE=58, VAR=59, PLUSPLUS=60, 
		MINUSMINUS=61, RPAREN=62, RSQ=63, RBRACE=64, SEMI=65, Identifier=66, ImaginaryLit=67, 
		IntLit=68, FloatLit=69, StringLit=70, RuneLit=71, Whitespace=72, LineComment=73, 
		NL=74, BlockComment=75, BlockNLComment=76;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
		"T__25", "T__26", "T__27", "T__28", "T__29", "T__30", "T__31", "T__32", 
		"T__33", "BREAK", "CASE", "CHAN", "CONST", "CONTINUE", "DEFAULT", "DEFER", 
		"ELSE", "FALLTHROUGH", "FOR", "FUNC", "GO", "GOTO", "IF", "IMPORT", "INTERFACE", 
		"MAP", "PACKAGE", "RANGE", "RETURN", "SELECT", "STRUCT", "SWITCH", "TYPE", 
		"VAR", "PLUSPLUS", "MINUSMINUS", "RPAREN", "RSQ", "RBRACE", "SEMI", "Identifier", 
		"Letter", "DecDigit", "ImaginaryLit", "Decimal", "IntLit", "DecimalLit", 
		"OctalLit", "OctalDigit", "HexLit", "HexDigit", "FloatLit", "Exponent", 
		"StringLit", "RawStringLit", "UnicodeChar", "SmallUnicodeChar", "BigUnicodeChar", 
		"InterpretedStringLit", "UnicodeValue", "EscapedChar", "ByteValue", "OctalByteVal", 
		"HexByteVal", "RuneLit", "Whitespace", "LineComment", "NL", "BlockComment", 
		"BlockNLComment"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "'['", "'{'", "'*'", "','", "'='", "':='", "'.'", "'...'", 
		"':'", "'EXPAND ME TO ONE OR MORE RULES 1'", "'EXPAND ME TO ONE OR MORE RULES 2'", 
		"'EXPAND ME TO ONE OR MORE RULES 3'", "'EXPAND ME TO ONE OR MORE RULES 4'", 
		"'EXPAND ME TO ONE OR MORE RULES 5'", "'&&'", "'||'", "'=='", "'!='", 
		"'<'", "'<='", "'>'", "'>='", "'+'", "'-'", "'|'", "'^'", "'/'", "'%'", 
		"'<<'", "'>>'", "'&'", "'&^'", "'!'", "'break'", "'case'", "'chan'", "'const'", 
		"'continue'", "'default'", "'defer'", "'else'", "'fallthrough'", "'for'", 
		"'func'", "'go'", "'goto'", "'if'", "'import'", "'interface'", "'map'", 
		"'package'", "'range'", "'return'", "'select'", "'struct'", "'switch'", 
		"'type'", "'var'", "'++'", "'--'", "')'", "']'", "'}'", "';'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, "BREAK", 
		"CASE", "CHAN", "CONST", "CONTINUE", "DEFAULT", "DEFER", "ELSE", "FALLTHROUGH", 
		"FOR", "FUNC", "GO", "GOTO", "IF", "IMPORT", "INTERFACE", "MAP", "PACKAGE", 
		"RANGE", "RETURN", "SELECT", "STRUCT", "SWITCH", "TYPE", "VAR", "PLUSPLUS", 
		"MINUSMINUS", "RPAREN", "RSQ", "RBRACE", "SEMI", "Identifier", "ImaginaryLit", 
		"IntLit", "FloatLit", "StringLit", "RuneLit", "Whitespace", "LineComment", 
		"NL", "BlockComment", "BlockNLComment"
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


	    protected int prevTokenType = Token.INVALID_TYPE;

	    // These are the token types such that if one appears as the last
	    // token on a line, a semicolon is inserted right afterwards.
	    protected HashSet<Integer> lastTokens = new HashSet<Integer>() {{
	        add(GooParser.Identifier);      add(GooParser.IntLit);
	        add(GooParser.FloatLit);        add(GooParser.RuneLit);
	        add(GooParser.StringLit);       add(GooParser.BREAK);
	        add(GooParser.CONTINUE);        add(GooParser.FALLTHROUGH);
	        add(GooParser.RETURN);          add(GooParser.PLUSPLUS);
	        add(GooParser.MINUSMINUS);      add(GooParser.RPAREN);
	        add(GooParser.RSQ);             add(GooParser.RBRACE);
	    }};

		@Override
		public Token emit() {
			if (_type == GooParser.NL) {
	            // we have a newline (NL) token
				if (lastTokens.contains(prevTokenType)) {
	                // convert that NL token into a semicolon token
					_type = GooParser.SEMI;
					_text = ";";
				    prevTokenType = Token.INVALID_TYPE;
	                //System.out.println(_tokenStartLine + ":" +
	                //    _tokenStartCharPositionInLine + ": inserted semicolon");
				} else {
	                // skip NL tokens
	                //int cnt = 0;
	                while(true) {
	                    _type = nextToken().getType();
	                //    cnt++;
	                    if (_type != GooParser.NL) break;
	                    super.emit();
	                }
	                prevTokenType = _type;
	                if (_type < 0)
	                    return emitEOF();
	                //System.out.println(_tokenStartLine + ":" + _tokenStartCharPositionInLine +
	                //    ": skipped " + cnt + "*NL" + ", next token = " + _SYMBOLIC_NAMES[_type]);
	            }
			} else {
	            // not a NL token, remember what kind it was
				prevTokenType = _type;
			}
			return super.emit();
		}

		@Override
		public Token nextToken() {
			if (_hitEOF && prevTokenType == GooParser.RBRACE) {
			    // insert a semicolon if last line ends with a right brace (i.e. NL is missing)
				_type = GooParser.SEMI;
				_text = ";";
				prevTokenType = Token.INVALID_TYPE;
				return super.emit();
			}
			return super.nextToken();
		}


	public GooLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Goo.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2N\u0320\b\1\4\2\t"+
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
		"`\t`\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\t\3"+
		"\t\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3"+
		"\24\3\24\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3"+
		"\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3\37\3 \3 "+
		"\3 \3!\3!\3\"\3\"\3\"\3#\3#\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3&\3&\3&"+
		"\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)"+
		"\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3,\3,\3,"+
		"\3,\3,\3,\3,\3-\3-\3-\3-\3.\3.\3.\3.\3.\3/\3/\3/\3\60\3\60\3\60\3\60\3"+
		"\60\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3"+
		"\63\3\63\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3"+
		"\65\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3\66\3\67\3\67\3\67\3"+
		"\67\3\67\3\67\3\67\38\38\38\38\38\38\38\39\39\39\39\39\39\39\3:\3:\3:"+
		"\3:\3:\3:\3:\3;\3;\3;\3;\3;\3<\3<\3<\3<\3=\3=\3=\3>\3>\3>\3?\3?\3@\3@"+
		"\3A\3A\3B\3B\3C\3C\3C\7C\u0258\nC\fC\16C\u025b\13C\3D\3D\3E\3E\3F\3F\3"+
		"F\3F\5F\u0265\nF\3G\6G\u0268\nG\rG\16G\u0269\3H\3H\3H\5H\u026f\nH\3I\3"+
		"I\7I\u0273\nI\fI\16I\u0276\13I\3J\3J\7J\u027a\nJ\fJ\16J\u027d\13J\3K\3"+
		"K\3L\3L\3L\6L\u0284\nL\rL\16L\u0285\3M\3M\3N\3N\3N\5N\u028d\nN\3N\5N\u0290"+
		"\nN\3N\3N\3N\3N\3N\3N\5N\u0298\nN\5N\u029a\nN\3O\3O\5O\u029e\nO\3O\3O"+
		"\3P\3P\5P\u02a4\nP\3Q\3Q\3Q\7Q\u02a9\nQ\fQ\16Q\u02ac\13Q\3Q\3Q\3R\3R\3"+
		"S\3S\3S\3S\3S\3S\3S\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T\3U\3U\3U\7U\u02c7"+
		"\nU\fU\16U\u02ca\13U\3U\3U\3V\3V\3V\3V\5V\u02d2\nV\3W\3W\3W\3X\3X\5X\u02d9"+
		"\nX\3Y\3Y\3Y\3Y\3Y\3Z\3Z\3Z\3Z\3Z\3Z\3[\3[\3[\5[\u02e9\n[\3[\3[\3\\\6"+
		"\\\u02ee\n\\\r\\\16\\\u02ef\3\\\3\\\3]\3]\3]\3]\7]\u02f8\n]\f]\16]\u02fb"+
		"\13]\3]\3]\3^\3^\5^\u0301\n^\3^\3^\5^\u0305\n^\3_\3_\3_\3_\7_\u030b\n"+
		"_\f_\16_\u030e\13_\3_\3_\3_\3_\3_\3`\3`\3`\3`\7`\u0319\n`\f`\16`\u031c"+
		"\13`\3`\3`\3`\3\u031a\2a\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f"+
		"\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63"+
		"\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62"+
		"c\63e\64g\65i\66k\67m8o9q:s;u<w=y>{?}@\177A\u0081B\u0083C\u0085D\u0087"+
		"\2\u0089\2\u008bE\u008d\2\u008fF\u0091\2\u0093\2\u0095\2\u0097\2\u0099"+
		"\2\u009bG\u009d\2\u009fH\u00a1\2\u00a3\2\u00a5\2\u00a7\2\u00a9\2\u00ab"+
		"\2\u00ad\2\u00af\2\u00b1\2\u00b3\2\u00b5I\u00b7J\u00b9K\u00bbL\u00bdM"+
		"\u00bfN\3\2\16\5\2C\\aac|\3\2\62;\3\2\63;\3\2\629\4\2ZZzz\5\2\62;CHch"+
		"\4\2GGgg\4\2--//\3\2\f\f\13\2$$))^^cdhhppttvvxx\5\2\13\13\16\16\"\"\4"+
		"\2\f\f\17\17\u032c\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3"+
		"\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2"+
		"\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E"+
		"\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2"+
		"\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2"+
		"\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k"+
		"\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2"+
		"\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2"+
		"\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u008b\3\2\2\2\2\u008f\3\2\2\2\2\u009b"+
		"\3\2\2\2\2\u009f\3\2\2\2\2\u00b5\3\2\2\2\2\u00b7\3\2\2\2\2\u00b9\3\2\2"+
		"\2\2\u00bb\3\2\2\2\2\u00bd\3\2\2\2\2\u00bf\3\2\2\2\3\u00c1\3\2\2\2\5\u00c3"+
		"\3\2\2\2\7\u00c5\3\2\2\2\t\u00c7\3\2\2\2\13\u00c9\3\2\2\2\r\u00cb\3\2"+
		"\2\2\17\u00cd\3\2\2\2\21\u00d0\3\2\2\2\23\u00d2\3\2\2\2\25\u00d6\3\2\2"+
		"\2\27\u00d8\3\2\2\2\31\u00f9\3\2\2\2\33\u011a\3\2\2\2\35\u013b\3\2\2\2"+
		"\37\u015c\3\2\2\2!\u017d\3\2\2\2#\u0180\3\2\2\2%\u0183\3\2\2\2\'\u0186"+
		"\3\2\2\2)\u0189\3\2\2\2+\u018b\3\2\2\2-\u018e\3\2\2\2/\u0190\3\2\2\2\61"+
		"\u0193\3\2\2\2\63\u0195\3\2\2\2\65\u0197\3\2\2\2\67\u0199\3\2\2\29\u019b"+
		"\3\2\2\2;\u019d\3\2\2\2=\u019f\3\2\2\2?\u01a2\3\2\2\2A\u01a5\3\2\2\2C"+
		"\u01a7\3\2\2\2E\u01aa\3\2\2\2G\u01ac\3\2\2\2I\u01b2\3\2\2\2K\u01b7\3\2"+
		"\2\2M\u01bc\3\2\2\2O\u01c2\3\2\2\2Q\u01cb\3\2\2\2S\u01d3\3\2\2\2U\u01d9"+
		"\3\2\2\2W\u01de\3\2\2\2Y\u01ea\3\2\2\2[\u01ee\3\2\2\2]\u01f3\3\2\2\2_"+
		"\u01f6\3\2\2\2a\u01fb\3\2\2\2c\u01fe\3\2\2\2e\u0205\3\2\2\2g\u020f\3\2"+
		"\2\2i\u0213\3\2\2\2k\u021b\3\2\2\2m\u0221\3\2\2\2o\u0228\3\2\2\2q\u022f"+
		"\3\2\2\2s\u0236\3\2\2\2u\u023d\3\2\2\2w\u0242\3\2\2\2y\u0246\3\2\2\2{"+
		"\u0249\3\2\2\2}\u024c\3\2\2\2\177\u024e\3\2\2\2\u0081\u0250\3\2\2\2\u0083"+
		"\u0252\3\2\2\2\u0085\u0254\3\2\2\2\u0087\u025c\3\2\2\2\u0089\u025e\3\2"+
		"\2\2\u008b\u0264\3\2\2\2\u008d\u0267\3\2\2\2\u008f\u026e\3\2\2\2\u0091"+
		"\u0270\3\2\2\2\u0093\u0277\3\2\2\2\u0095\u027e\3\2\2\2\u0097\u0280\3\2"+
		"\2\2\u0099\u0287\3\2\2\2\u009b\u0299\3\2\2\2\u009d\u029b\3\2\2\2\u009f"+
		"\u02a3\3\2\2\2\u00a1\u02a5\3\2\2\2\u00a3\u02af\3\2\2\2\u00a5\u02b1\3\2"+
		"\2\2\u00a7\u02b8\3\2\2\2\u00a9\u02c3\3\2\2\2\u00ab\u02d1\3\2\2\2\u00ad"+
		"\u02d3\3\2\2\2\u00af\u02d8\3\2\2\2\u00b1\u02da\3\2\2\2\u00b3\u02df\3\2"+
		"\2\2\u00b5\u02e5\3\2\2\2\u00b7\u02ed\3\2\2\2\u00b9\u02f3\3\2\2\2\u00bb"+
		"\u0304\3\2\2\2\u00bd\u0306\3\2\2\2\u00bf\u0314\3\2\2\2\u00c1\u00c2\7*"+
		"\2\2\u00c2\4\3\2\2\2\u00c3\u00c4\7]\2\2\u00c4\6\3\2\2\2\u00c5\u00c6\7"+
		"}\2\2\u00c6\b\3\2\2\2\u00c7\u00c8\7,\2\2\u00c8\n\3\2\2\2\u00c9\u00ca\7"+
		".\2\2\u00ca\f\3\2\2\2\u00cb\u00cc\7?\2\2\u00cc\16\3\2\2\2\u00cd\u00ce"+
		"\7<\2\2\u00ce\u00cf\7?\2\2\u00cf\20\3\2\2\2\u00d0\u00d1\7\60\2\2\u00d1"+
		"\22\3\2\2\2\u00d2\u00d3\7\60\2\2\u00d3\u00d4\7\60\2\2\u00d4\u00d5\7\60"+
		"\2\2\u00d5\24\3\2\2\2\u00d6\u00d7\7<\2\2\u00d7\26\3\2\2\2\u00d8\u00d9"+
		"\7G\2\2\u00d9\u00da\7Z\2\2\u00da\u00db\7R\2\2\u00db\u00dc\7C\2\2\u00dc"+
		"\u00dd\7P\2\2\u00dd\u00de\7F\2\2\u00de\u00df\7\"\2\2\u00df\u00e0\7O\2"+
		"\2\u00e0\u00e1\7G\2\2\u00e1\u00e2\7\"\2\2\u00e2\u00e3\7V\2\2\u00e3\u00e4"+
		"\7Q\2\2\u00e4\u00e5\7\"\2\2\u00e5\u00e6\7Q\2\2\u00e6\u00e7\7P\2\2\u00e7"+
		"\u00e8\7G\2\2\u00e8\u00e9\7\"\2\2\u00e9\u00ea\7Q\2\2\u00ea\u00eb\7T\2"+
		"\2\u00eb\u00ec\7\"\2\2\u00ec\u00ed\7O\2\2\u00ed\u00ee\7Q\2\2\u00ee\u00ef"+
		"\7T\2\2\u00ef\u00f0\7G\2\2\u00f0\u00f1\7\"\2\2\u00f1\u00f2\7T\2\2\u00f2"+
		"\u00f3\7W\2\2\u00f3\u00f4\7N\2\2\u00f4\u00f5\7G\2\2\u00f5\u00f6\7U\2\2"+
		"\u00f6\u00f7\7\"\2\2\u00f7\u00f8\7\63\2\2\u00f8\30\3\2\2\2\u00f9\u00fa"+
		"\7G\2\2\u00fa\u00fb\7Z\2\2\u00fb\u00fc\7R\2\2\u00fc\u00fd\7C\2\2\u00fd"+
		"\u00fe\7P\2\2\u00fe\u00ff\7F\2\2\u00ff\u0100\7\"\2\2\u0100\u0101\7O\2"+
		"\2\u0101\u0102\7G\2\2\u0102\u0103\7\"\2\2\u0103\u0104\7V\2\2\u0104\u0105"+
		"\7Q\2\2\u0105\u0106\7\"\2\2\u0106\u0107\7Q\2\2\u0107\u0108\7P\2\2\u0108"+
		"\u0109\7G\2\2\u0109\u010a\7\"\2\2\u010a\u010b\7Q\2\2\u010b\u010c\7T\2"+
		"\2\u010c\u010d\7\"\2\2\u010d\u010e\7O\2\2\u010e\u010f\7Q\2\2\u010f\u0110"+
		"\7T\2\2\u0110\u0111\7G\2\2\u0111\u0112\7\"\2\2\u0112\u0113\7T\2\2\u0113"+
		"\u0114\7W\2\2\u0114\u0115\7N\2\2\u0115\u0116\7G\2\2\u0116\u0117\7U\2\2"+
		"\u0117\u0118\7\"\2\2\u0118\u0119\7\64\2\2\u0119\32\3\2\2\2\u011a\u011b"+
		"\7G\2\2\u011b\u011c\7Z\2\2\u011c\u011d\7R\2\2\u011d\u011e\7C\2\2\u011e"+
		"\u011f\7P\2\2\u011f\u0120\7F\2\2\u0120\u0121\7\"\2\2\u0121\u0122\7O\2"+
		"\2\u0122\u0123\7G\2\2\u0123\u0124\7\"\2\2\u0124\u0125\7V\2\2\u0125\u0126"+
		"\7Q\2\2\u0126\u0127\7\"\2\2\u0127\u0128\7Q\2\2\u0128\u0129\7P\2\2\u0129"+
		"\u012a\7G\2\2\u012a\u012b\7\"\2\2\u012b\u012c\7Q\2\2\u012c\u012d\7T\2"+
		"\2\u012d\u012e\7\"\2\2\u012e\u012f\7O\2\2\u012f\u0130\7Q\2\2\u0130\u0131"+
		"\7T\2\2\u0131\u0132\7G\2\2\u0132\u0133\7\"\2\2\u0133\u0134\7T\2\2\u0134"+
		"\u0135\7W\2\2\u0135\u0136\7N\2\2\u0136\u0137\7G\2\2\u0137\u0138\7U\2\2"+
		"\u0138\u0139\7\"\2\2\u0139\u013a\7\65\2\2\u013a\34\3\2\2\2\u013b\u013c"+
		"\7G\2\2\u013c\u013d\7Z\2\2\u013d\u013e\7R\2\2\u013e\u013f\7C\2\2\u013f"+
		"\u0140\7P\2\2\u0140\u0141\7F\2\2\u0141\u0142\7\"\2\2\u0142\u0143\7O\2"+
		"\2\u0143\u0144\7G\2\2\u0144\u0145\7\"\2\2\u0145\u0146\7V\2\2\u0146\u0147"+
		"\7Q\2\2\u0147\u0148\7\"\2\2\u0148\u0149\7Q\2\2\u0149\u014a\7P\2\2\u014a"+
		"\u014b\7G\2\2\u014b\u014c\7\"\2\2\u014c\u014d\7Q\2\2\u014d\u014e\7T\2"+
		"\2\u014e\u014f\7\"\2\2\u014f\u0150\7O\2\2\u0150\u0151\7Q\2\2\u0151\u0152"+
		"\7T\2\2\u0152\u0153\7G\2\2\u0153\u0154\7\"\2\2\u0154\u0155\7T\2\2\u0155"+
		"\u0156\7W\2\2\u0156\u0157\7N\2\2\u0157\u0158\7G\2\2\u0158\u0159\7U\2\2"+
		"\u0159\u015a\7\"\2\2\u015a\u015b\7\66\2\2\u015b\36\3\2\2\2\u015c\u015d"+
		"\7G\2\2\u015d\u015e\7Z\2\2\u015e\u015f\7R\2\2\u015f\u0160\7C\2\2\u0160"+
		"\u0161\7P\2\2\u0161\u0162\7F\2\2\u0162\u0163\7\"\2\2\u0163\u0164\7O\2"+
		"\2\u0164\u0165\7G\2\2\u0165\u0166\7\"\2\2\u0166\u0167\7V\2\2\u0167\u0168"+
		"\7Q\2\2\u0168\u0169\7\"\2\2\u0169\u016a\7Q\2\2\u016a\u016b\7P\2\2\u016b"+
		"\u016c\7G\2\2\u016c\u016d\7\"\2\2\u016d\u016e\7Q\2\2\u016e\u016f\7T\2"+
		"\2\u016f\u0170\7\"\2\2\u0170\u0171\7O\2\2\u0171\u0172\7Q\2\2\u0172\u0173"+
		"\7T\2\2\u0173\u0174\7G\2\2\u0174\u0175\7\"\2\2\u0175\u0176\7T\2\2\u0176"+
		"\u0177\7W\2\2\u0177\u0178\7N\2\2\u0178\u0179\7G\2\2\u0179\u017a\7U\2\2"+
		"\u017a\u017b\7\"\2\2\u017b\u017c\7\67\2\2\u017c \3\2\2\2\u017d\u017e\7"+
		"(\2\2\u017e\u017f\7(\2\2\u017f\"\3\2\2\2\u0180\u0181\7~\2\2\u0181\u0182"+
		"\7~\2\2\u0182$\3\2\2\2\u0183\u0184\7?\2\2\u0184\u0185\7?\2\2\u0185&\3"+
		"\2\2\2\u0186\u0187\7#\2\2\u0187\u0188\7?\2\2\u0188(\3\2\2\2\u0189\u018a"+
		"\7>\2\2\u018a*\3\2\2\2\u018b\u018c\7>\2\2\u018c\u018d\7?\2\2\u018d,\3"+
		"\2\2\2\u018e\u018f\7@\2\2\u018f.\3\2\2\2\u0190\u0191\7@\2\2\u0191\u0192"+
		"\7?\2\2\u0192\60\3\2\2\2\u0193\u0194\7-\2\2\u0194\62\3\2\2\2\u0195\u0196"+
		"\7/\2\2\u0196\64\3\2\2\2\u0197\u0198\7~\2\2\u0198\66\3\2\2\2\u0199\u019a"+
		"\7`\2\2\u019a8\3\2\2\2\u019b\u019c\7\61\2\2\u019c:\3\2\2\2\u019d\u019e"+
		"\7\'\2\2\u019e<\3\2\2\2\u019f\u01a0\7>\2\2\u01a0\u01a1\7>\2\2\u01a1>\3"+
		"\2\2\2\u01a2\u01a3\7@\2\2\u01a3\u01a4\7@\2\2\u01a4@\3\2\2\2\u01a5\u01a6"+
		"\7(\2\2\u01a6B\3\2\2\2\u01a7\u01a8\7(\2\2\u01a8\u01a9\7`\2\2\u01a9D\3"+
		"\2\2\2\u01aa\u01ab\7#\2\2\u01abF\3\2\2\2\u01ac\u01ad\7d\2\2\u01ad\u01ae"+
		"\7t\2\2\u01ae\u01af\7g\2\2\u01af\u01b0\7c\2\2\u01b0\u01b1\7m\2\2\u01b1"+
		"H\3\2\2\2\u01b2\u01b3\7e\2\2\u01b3\u01b4\7c\2\2\u01b4\u01b5\7u\2\2\u01b5"+
		"\u01b6\7g\2\2\u01b6J\3\2\2\2\u01b7\u01b8\7e\2\2\u01b8\u01b9\7j\2\2\u01b9"+
		"\u01ba\7c\2\2\u01ba\u01bb\7p\2\2\u01bbL\3\2\2\2\u01bc\u01bd\7e\2\2\u01bd"+
		"\u01be\7q\2\2\u01be\u01bf\7p\2\2\u01bf\u01c0\7u\2\2\u01c0\u01c1\7v\2\2"+
		"\u01c1N\3\2\2\2\u01c2\u01c3\7e\2\2\u01c3\u01c4\7q\2\2\u01c4\u01c5\7p\2"+
		"\2\u01c5\u01c6\7v\2\2\u01c6\u01c7\7k\2\2\u01c7\u01c8\7p\2\2\u01c8\u01c9"+
		"\7w\2\2\u01c9\u01ca\7g\2\2\u01caP\3\2\2\2\u01cb\u01cc\7f\2\2\u01cc\u01cd"+
		"\7g\2\2\u01cd\u01ce\7h\2\2\u01ce\u01cf\7c\2\2\u01cf\u01d0\7w\2\2\u01d0"+
		"\u01d1\7n\2\2\u01d1\u01d2\7v\2\2\u01d2R\3\2\2\2\u01d3\u01d4\7f\2\2\u01d4"+
		"\u01d5\7g\2\2\u01d5\u01d6\7h\2\2\u01d6\u01d7\7g\2\2\u01d7\u01d8\7t\2\2"+
		"\u01d8T\3\2\2\2\u01d9\u01da\7g\2\2\u01da\u01db\7n\2\2\u01db\u01dc\7u\2"+
		"\2\u01dc\u01dd\7g\2\2\u01ddV\3\2\2\2\u01de\u01df\7h\2\2\u01df\u01e0\7"+
		"c\2\2\u01e0\u01e1\7n\2\2\u01e1\u01e2\7n\2\2\u01e2\u01e3\7v\2\2\u01e3\u01e4"+
		"\7j\2\2\u01e4\u01e5\7t\2\2\u01e5\u01e6\7q\2\2\u01e6\u01e7\7w\2\2\u01e7"+
		"\u01e8\7i\2\2\u01e8\u01e9\7j\2\2\u01e9X\3\2\2\2\u01ea\u01eb\7h\2\2\u01eb"+
		"\u01ec\7q\2\2\u01ec\u01ed\7t\2\2\u01edZ\3\2\2\2\u01ee\u01ef\7h\2\2\u01ef"+
		"\u01f0\7w\2\2\u01f0\u01f1\7p\2\2\u01f1\u01f2\7e\2\2\u01f2\\\3\2\2\2\u01f3"+
		"\u01f4\7i\2\2\u01f4\u01f5\7q\2\2\u01f5^\3\2\2\2\u01f6\u01f7\7i\2\2\u01f7"+
		"\u01f8\7q\2\2\u01f8\u01f9\7v\2\2\u01f9\u01fa\7q\2\2\u01fa`\3\2\2\2\u01fb"+
		"\u01fc\7k\2\2\u01fc\u01fd\7h\2\2\u01fdb\3\2\2\2\u01fe\u01ff\7k\2\2\u01ff"+
		"\u0200\7o\2\2\u0200\u0201\7r\2\2\u0201\u0202\7q\2\2\u0202\u0203\7t\2\2"+
		"\u0203\u0204\7v\2\2\u0204d\3\2\2\2\u0205\u0206\7k\2\2\u0206\u0207\7p\2"+
		"\2\u0207\u0208\7v\2\2\u0208\u0209\7g\2\2\u0209\u020a\7t\2\2\u020a\u020b"+
		"\7h\2\2\u020b\u020c\7c\2\2\u020c\u020d\7e\2\2\u020d\u020e\7g\2\2\u020e"+
		"f\3\2\2\2\u020f\u0210\7o\2\2\u0210\u0211\7c\2\2\u0211\u0212\7r\2\2\u0212"+
		"h\3\2\2\2\u0213\u0214\7r\2\2\u0214\u0215\7c\2\2\u0215\u0216\7e\2\2\u0216"+
		"\u0217\7m\2\2\u0217\u0218\7c\2\2\u0218\u0219\7i\2\2\u0219\u021a\7g\2\2"+
		"\u021aj\3\2\2\2\u021b\u021c\7t\2\2\u021c\u021d\7c\2\2\u021d\u021e\7p\2"+
		"\2\u021e\u021f\7i\2\2\u021f\u0220\7g\2\2\u0220l\3\2\2\2\u0221\u0222\7"+
		"t\2\2\u0222\u0223\7g\2\2\u0223\u0224\7v\2\2\u0224\u0225\7w\2\2\u0225\u0226"+
		"\7t\2\2\u0226\u0227\7p\2\2\u0227n\3\2\2\2\u0228\u0229\7u\2\2\u0229\u022a"+
		"\7g\2\2\u022a\u022b\7n\2\2\u022b\u022c\7g\2\2\u022c\u022d\7e\2\2\u022d"+
		"\u022e\7v\2\2\u022ep\3\2\2\2\u022f\u0230\7u\2\2\u0230\u0231\7v\2\2\u0231"+
		"\u0232\7t\2\2\u0232\u0233\7w\2\2\u0233\u0234\7e\2\2\u0234\u0235\7v\2\2"+
		"\u0235r\3\2\2\2\u0236\u0237\7u\2\2\u0237\u0238\7y\2\2\u0238\u0239\7k\2"+
		"\2\u0239\u023a\7v\2\2\u023a\u023b\7e\2\2\u023b\u023c\7j\2\2\u023ct\3\2"+
		"\2\2\u023d\u023e\7v\2\2\u023e\u023f\7{\2\2\u023f\u0240\7r\2\2\u0240\u0241"+
		"\7g\2\2\u0241v\3\2\2\2\u0242\u0243\7x\2\2\u0243\u0244\7c\2\2\u0244\u0245"+
		"\7t\2\2\u0245x\3\2\2\2\u0246\u0247\7-\2\2\u0247\u0248\7-\2\2\u0248z\3"+
		"\2\2\2\u0249\u024a\7/\2\2\u024a\u024b\7/\2\2\u024b|\3\2\2\2\u024c\u024d"+
		"\7+\2\2\u024d~\3\2\2\2\u024e\u024f\7_\2\2\u024f\u0080\3\2\2\2\u0250\u0251"+
		"\7\177\2\2\u0251\u0082\3\2\2\2\u0252\u0253\7=\2\2\u0253\u0084\3\2\2\2"+
		"\u0254\u0259\5\u0087D\2\u0255\u0258\5\u0087D\2\u0256\u0258\5\u0089E\2"+
		"\u0257\u0255\3\2\2\2\u0257\u0256\3\2\2\2\u0258\u025b\3\2\2\2\u0259\u0257"+
		"\3\2\2\2\u0259\u025a\3\2\2\2\u025a\u0086\3\2\2\2\u025b\u0259\3\2\2\2\u025c"+
		"\u025d\t\2\2\2\u025d\u0088\3\2\2\2\u025e\u025f\t\3\2\2\u025f\u008a\3\2"+
		"\2\2\u0260\u0265\5\u008dG\2\u0261\u0262\5\u009bN\2\u0262\u0263\7k\2\2"+
		"\u0263\u0265\3\2\2\2\u0264\u0260\3\2\2\2\u0264\u0261\3\2\2\2\u0265\u008c"+
		"\3\2\2\2\u0266\u0268\5\u0089E\2\u0267\u0266\3\2\2\2\u0268\u0269\3\2\2"+
		"\2\u0269\u0267\3\2\2\2\u0269\u026a\3\2\2\2\u026a\u008e\3\2\2\2\u026b\u026f"+
		"\5\u0091I\2\u026c\u026f\5\u0093J\2\u026d\u026f\5\u0097L\2\u026e\u026b"+
		"\3\2\2\2\u026e\u026c\3\2\2\2\u026e\u026d\3\2\2\2\u026f\u0090\3\2\2\2\u0270"+
		"\u0274\t\4\2\2\u0271\u0273\5\u0089E\2\u0272\u0271\3\2\2\2\u0273\u0276"+
		"\3\2\2\2\u0274\u0272\3\2\2\2\u0274\u0275\3\2\2\2\u0275\u0092\3\2\2\2\u0276"+
		"\u0274\3\2\2\2\u0277\u027b\7\62\2\2\u0278\u027a\5\u0095K\2\u0279\u0278"+
		"\3\2\2\2\u027a\u027d\3\2\2\2\u027b\u0279\3\2\2\2\u027b\u027c\3\2\2\2\u027c"+
		"\u0094\3\2\2\2\u027d\u027b\3\2\2\2\u027e\u027f\t\5\2\2\u027f\u0096\3\2"+
		"\2\2\u0280\u0281\7\62\2\2\u0281\u0283\t\6\2\2\u0282\u0284\5\u0099M\2\u0283"+
		"\u0282\3\2\2\2\u0284\u0285\3\2\2\2\u0285\u0283\3\2\2\2\u0285\u0286\3\2"+
		"\2\2\u0286\u0098\3\2\2\2\u0287\u0288\t\7\2\2\u0288\u009a\3\2\2\2\u0289"+
		"\u028a\5\u008dG\2\u028a\u028c\7\60\2\2\u028b\u028d\5\u008dG\2\u028c\u028b"+
		"\3\2\2\2\u028c\u028d\3\2\2\2\u028d\u028f\3\2\2\2\u028e\u0290\5\u009dO"+
		"\2\u028f\u028e\3\2\2\2\u028f\u0290\3\2\2\2\u0290\u029a\3\2\2\2\u0291\u0292"+
		"\5\u008dG\2\u0292\u0293\5\u009dO\2\u0293\u029a\3\2\2\2\u0294\u0295\7\60"+
		"\2\2\u0295\u0297\5\u008dG\2\u0296\u0298\5\u009dO\2\u0297\u0296\3\2\2\2"+
		"\u0297\u0298\3\2\2\2\u0298\u029a\3\2\2\2\u0299\u0289\3\2\2\2\u0299\u0291"+
		"\3\2\2\2\u0299\u0294\3\2\2\2\u029a\u009c\3\2\2\2\u029b\u029d\t\b\2\2\u029c"+
		"\u029e\t\t\2\2\u029d\u029c\3\2\2\2\u029d\u029e\3\2\2\2\u029e\u029f\3\2"+
		"\2\2\u029f\u02a0\5\u008dG\2\u02a0\u009e\3\2\2\2\u02a1\u02a4\5\u00a1Q\2"+
		"\u02a2\u02a4\5\u00a9U\2\u02a3\u02a1\3\2\2\2\u02a3\u02a2\3\2\2\2\u02a4"+
		"\u00a0\3\2\2\2\u02a5\u02aa\7b\2\2\u02a6\u02a9\5\u00a3R\2\u02a7\u02a9\5"+
		"\u00bb^\2\u02a8\u02a6\3\2\2\2\u02a8\u02a7\3\2\2\2\u02a9\u02ac\3\2\2\2"+
		"\u02aa\u02a8\3\2\2\2\u02aa\u02ab\3\2\2\2\u02ab\u02ad\3\2\2\2\u02ac\u02aa"+
		"\3\2\2\2\u02ad\u02ae\7b\2\2\u02ae\u00a2\3\2\2\2\u02af\u02b0\n\n\2\2\u02b0"+
		"\u00a4\3\2\2\2\u02b1\u02b2\7^\2\2\u02b2\u02b3\7w\2\2\u02b3\u02b4\5\u0099"+
		"M\2\u02b4\u02b5\5\u0099M\2\u02b5\u02b6\5\u0099M\2\u02b6\u02b7\5\u0099"+
		"M\2\u02b7\u00a6\3\2\2\2\u02b8\u02b9\7^\2\2\u02b9\u02ba\7W\2\2\u02ba\u02bb"+
		"\5\u0099M\2\u02bb\u02bc\5\u0099M\2\u02bc\u02bd\5\u0099M\2\u02bd\u02be"+
		"\5\u0099M\2\u02be\u02bf\5\u0099M\2\u02bf\u02c0\5\u0099M\2\u02c0\u02c1"+
		"\5\u0099M\2\u02c1\u02c2\5\u0099M\2\u02c2\u00a8\3\2\2\2\u02c3\u02c8\7$"+
		"\2\2\u02c4\u02c7\5\u00abV\2\u02c5\u02c7\5\u00afX\2\u02c6\u02c4\3\2\2\2"+
		"\u02c6\u02c5\3\2\2\2\u02c7\u02ca\3\2\2\2\u02c8\u02c6\3\2\2\2\u02c8\u02c9"+
		"\3\2\2\2\u02c9\u02cb\3\2\2\2\u02ca\u02c8\3\2\2\2\u02cb\u02cc\7$\2\2\u02cc"+
		"\u00aa\3\2\2\2\u02cd\u02d2\5\u00a3R\2\u02ce\u02d2\5\u00a5S\2\u02cf\u02d2"+
		"\5\u00a7T\2\u02d0\u02d2\5\u00adW\2\u02d1\u02cd\3\2\2\2\u02d1\u02ce\3\2"+
		"\2\2\u02d1\u02cf\3\2\2\2\u02d1\u02d0\3\2\2\2\u02d2\u00ac\3\2\2\2\u02d3"+
		"\u02d4\7^\2\2\u02d4\u02d5\t\13\2\2\u02d5\u00ae\3\2\2\2\u02d6\u02d9\5\u00b1"+
		"Y\2\u02d7\u02d9\5\u00b3Z\2\u02d8\u02d6\3\2\2\2\u02d8\u02d7\3\2\2\2\u02d9"+
		"\u00b0\3\2\2\2\u02da\u02db\7^\2\2\u02db\u02dc\5\u0095K\2\u02dc\u02dd\5"+
		"\u0095K\2\u02dd\u02de\5\u0095K\2\u02de\u00b2\3\2\2\2\u02df\u02e0\7^\2"+
		"\2\u02e0\u02e1\7z\2\2\u02e1\u02e2\3\2\2\2\u02e2\u02e3\5\u0099M\2\u02e3"+
		"\u02e4\5\u0099M\2\u02e4\u00b4\3\2\2\2\u02e5\u02e8\7)\2\2\u02e6\u02e9\5"+
		"\u00abV\2\u02e7\u02e9\5\u00afX\2\u02e8\u02e6\3\2\2\2\u02e8\u02e7\3\2\2"+
		"\2\u02e9\u02ea\3\2\2\2\u02ea\u02eb\7)\2\2\u02eb\u00b6\3\2\2\2\u02ec\u02ee"+
		"\t\f\2\2\u02ed\u02ec\3\2\2\2\u02ee\u02ef\3\2\2\2\u02ef\u02ed\3\2\2\2\u02ef"+
		"\u02f0\3\2\2\2\u02f0\u02f1\3\2\2\2\u02f1\u02f2\b\\\2\2\u02f2\u00b8\3\2"+
		"\2\2\u02f3\u02f4\7\61\2\2\u02f4\u02f5\7\61\2\2\u02f5\u02f9\3\2\2\2\u02f6"+
		"\u02f8\n\r\2\2\u02f7\u02f6\3\2\2\2\u02f8\u02fb\3\2\2\2\u02f9\u02f7\3\2"+
		"\2\2\u02f9\u02fa\3\2\2\2\u02fa\u02fc\3\2\2\2\u02fb\u02f9\3\2\2\2\u02fc"+
		"\u02fd\b]\2\2\u02fd\u00ba\3\2\2\2\u02fe\u0300\7\17\2\2\u02ff\u0301\7\f"+
		"\2\2\u0300\u02ff\3\2\2\2\u0300\u0301\3\2\2\2\u0301\u0305\3\2\2\2\u0302"+
		"\u0305\7\f\2\2\u0303\u0305\5\u00bf`\2\u0304\u02fe\3\2\2\2\u0304\u0302"+
		"\3\2\2\2\u0304\u0303\3\2\2\2\u0305\u00bc\3\2\2\2\u0306\u0307\7\61\2\2"+
		"\u0307\u0308\7,\2\2\u0308\u030c\3\2\2\2\u0309\u030b\n\r\2\2\u030a\u0309"+
		"\3\2\2\2\u030b\u030e\3\2\2\2\u030c\u030a\3\2\2\2\u030c\u030d\3\2\2\2\u030d"+
		"\u030f\3\2\2\2\u030e\u030c\3\2\2\2\u030f\u0310\7,\2\2\u0310\u0311\7\61"+
		"\2\2\u0311\u0312\3\2\2\2\u0312\u0313\b_\2\2\u0313\u00be\3\2\2\2\u0314"+
		"\u0315\7\61\2\2\u0315\u0316\7,\2\2\u0316\u031a\3\2\2\2\u0317\u0319\13"+
		"\2\2\2\u0318\u0317\3\2\2\2\u0319\u031c\3\2\2\2\u031a\u031b\3\2\2\2\u031a"+
		"\u0318\3\2\2\2\u031b\u031d\3\2\2\2\u031c\u031a\3\2\2\2\u031d\u031e\7,"+
		"\2\2\u031e\u031f\7\61\2\2\u031f\u00c0\3\2\2\2\36\2\u0257\u0259\u0264\u0269"+
		"\u026e\u0274\u027b\u0285\u028c\u028f\u0297\u0299\u029d\u02a3\u02a8\u02aa"+
		"\u02c6\u02c8\u02d1\u02d8\u02e8\u02ef\u02f9\u0300\u0304\u030c\u031a\3\b"+
		"\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}