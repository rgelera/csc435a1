// Generated from Goo.g4 by ANTLR 4.5.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GooParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, BREAK=30, CASE=31, CHAN=32, 
		CONST=33, CONTINUE=34, DEFAULT=35, DEFER=36, ELSE=37, FALLTHROUGH=38, 
		FOR=39, FUNC=40, GO=41, GOTO=42, IF=43, IMPORT=44, INTERFACE=45, MAP=46, 
		PACKAGE=47, RANGE=48, RETURN=49, SELECT=50, STRUCT=51, SWITCH=52, TYPE=53, 
		VAR=54, PLUSPLUS=55, MINUSMINUS=56, RPAREN=57, RSQ=58, RBRACE=59, SEMI=60, 
		Identifier=61, ImaginaryLit=62, IntLit=63, FloatLit=64, StringLit=65, 
		RuneLit=66, Whitespace=67, LineComment=68, NL=69, BlockComment=70, BlockNLComment=71;
	public static final int
		RULE_type = 0, RULE_typeName = 1, RULE_typeLit = 2, RULE_arrayType = 3, 
		RULE_arrayLength = 4, RULE_elementType = 5, RULE_sliceType = 6, RULE_structType = 7, 
		RULE_fieldDeclList = 8, RULE_fieldDecl = 9, RULE_pointerType = 10, RULE_baseType = 11, 
		RULE_signature = 12, RULE_result = 13, RULE_parameters = 14, RULE_parameterList = 15, 
		RULE_parameterDecl = 16, RULE_methodName = 17, RULE_block = 18, RULE_statementList = 19, 
		RULE_declaration = 20, RULE_topLevelDeclList = 21, RULE_topLevelDecl = 22, 
		RULE_constDecl = 23, RULE_constSpecList = 24, RULE_constSpec = 25, RULE_identifierList = 26, 
		RULE_expressionList = 27, RULE_typeDecl = 28, RULE_typeSpecList = 29, 
		RULE_typeSpec = 30, RULE_varDecl = 31, RULE_varSpecList = 32, RULE_varSpec = 33, 
		RULE_varSpecRem = 34, RULE_shortVarDecl = 35, RULE_functionDecl = 36, 
		RULE_functionName = 37, RULE_function = 38, RULE_functionBody = 39, RULE_operand = 40, 
		RULE_literal = 41, RULE_basicLit = 42, RULE_operandName = 43, RULE_qualifiedIdent = 44, 
		RULE_compositeLit = 45, RULE_literalType = 46, RULE_literalValue = 47, 
		RULE_elementList = 48, RULE_element = 49, RULE_key = 50, RULE_fieldName = 51, 
		RULE_value = 52, RULE_primaryExpr = 53, RULE_selector = 54, RULE_index = 55, 
		RULE_slice = 56, RULE_typeAssertion = 57, RULE_arguments = 58, RULE_expression = 59, 
		RULE_unaryExpr = 60, RULE_rel_op = 61, RULE_add_op = 62, RULE_mul_op = 63, 
		RULE_unary_op = 64, RULE_conversion = 65, RULE_statement = 66, RULE_simpleStmt = 67, 
		RULE_emptyStmt = 68, RULE_labeledStmt = 69, RULE_label = 70, RULE_expressionStmt = 71, 
		RULE_incDecStmt = 72, RULE_assignment = 73, RULE_assign_op = 74, RULE_ifStmt = 75, 
		RULE_forStmt = 76, RULE_condition = 77, RULE_forClause = 78, RULE_initStmt = 79, 
		RULE_postStmt = 80, RULE_rangeClause = 81, RULE_goStmt = 82, RULE_returnStmt = 83, 
		RULE_breakStmt = 84, RULE_continueStmt = 85, RULE_gotoStmt = 86, RULE_sourceFile = 87, 
		RULE_packageClause = 88, RULE_packageName = 89, RULE_importDeclList = 90, 
		RULE_importDecl = 91, RULE_importSpecList = 92, RULE_importSpec = 93, 
		RULE_importPath = 94, RULE_anything = 95, RULE_anyToken = 96;
	public static final String[] ruleNames = {
		"type", "typeName", "typeLit", "arrayType", "arrayLength", "elementType", 
		"sliceType", "structType", "fieldDeclList", "fieldDecl", "pointerType", 
		"baseType", "signature", "result", "parameters", "parameterList", "parameterDecl", 
		"methodName", "block", "statementList", "declaration", "topLevelDeclList", 
		"topLevelDecl", "constDecl", "constSpecList", "constSpec", "identifierList", 
		"expressionList", "typeDecl", "typeSpecList", "typeSpec", "varDecl", "varSpecList", 
		"varSpec", "varSpecRem", "shortVarDecl", "functionDecl", "functionName", 
		"function", "functionBody", "operand", "literal", "basicLit", "operandName", 
		"qualifiedIdent", "compositeLit", "literalType", "literalValue", "elementList", 
		"element", "key", "fieldName", "value", "primaryExpr", "selector", "index", 
		"slice", "typeAssertion", "arguments", "expression", "unaryExpr", "rel_op", 
		"add_op", "mul_op", "unary_op", "conversion", "statement", "simpleStmt", 
		"emptyStmt", "labeledStmt", "label", "expressionStmt", "incDecStmt", "assignment", 
		"assign_op", "ifStmt", "forStmt", "condition", "forClause", "initStmt", 
		"postStmt", "rangeClause", "goStmt", "returnStmt", "breakStmt", "continueStmt", 
		"gotoStmt", "sourceFile", "packageClause", "packageName", "importDeclList", 
		"importDecl", "importSpecList", "importSpec", "importPath", "anything", 
		"anyToken"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "'['", "'{'", "'*'", "','", "'='", "':='", "'.'", "'...'", 
		"':'", "'&&'", "'||'", "'=='", "'!='", "'<'", "'<='", "'>'", "'>='", "'+'", 
		"'-'", "'|'", "'^'", "'/'", "'%'", "'<<'", "'>>'", "'&'", "'&^'", "'!'", 
		"'break'", "'case'", "'chan'", "'const'", "'continue'", "'default'", "'defer'", 
		"'else'", "'fallthrough'", "'for'", "'func'", "'go'", "'goto'", "'if'", 
		"'import'", "'interface'", "'map'", "'package'", "'range'", "'return'", 
		"'select'", "'struct'", "'switch'", "'type'", "'var'", "'++'", "'--'", 
		"')'", "']'", "'}'", "';'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, "BREAK", "CASE", "CHAN", "CONST", 
		"CONTINUE", "DEFAULT", "DEFER", "ELSE", "FALLTHROUGH", "FOR", "FUNC", 
		"GO", "GOTO", "IF", "IMPORT", "INTERFACE", "MAP", "PACKAGE", "RANGE", 
		"RETURN", "SELECT", "STRUCT", "SWITCH", "TYPE", "VAR", "PLUSPLUS", "MINUSMINUS", 
		"RPAREN", "RSQ", "RBRACE", "SEMI", "Identifier", "ImaginaryLit", "IntLit", 
		"FloatLit", "StringLit", "RuneLit", "Whitespace", "LineComment", "NL", 
		"BlockComment", "BlockNLComment"
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

	@Override
	public String getGrammarFileName() { return "Goo.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GooParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class TypeContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TypeLitContext typeLit() {
			return getRuleContext(TypeLitContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_type);
		try {
			setState(200);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(194);
				typeName();
				}
				break;
			case T__1:
			case T__3:
			case STRUCT:
				enterOuterAlt(_localctx, 2);
				{
				setState(195);
				typeLit();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 3);
				{
				setState(196);
				match(T__0);
				setState(197);
				type();
				setState(198);
				match(RPAREN);
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

	public static class TypeNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(GooParser.Identifier, 0); }
		public QualifiedIdentContext qualifiedIdent() {
			return getRuleContext(QualifiedIdentContext.class,0);
		}
		public TypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).enterTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).exitTypeName(this);
		}
	}

	public final TypeNameContext typeName() throws RecognitionException {
		TypeNameContext _localctx = new TypeNameContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_typeName);
		try {
			setState(204);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(202);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(203);
				qualifiedIdent();
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

	public static class TypeLitContext extends ParserRuleContext {
		public ArrayTypeContext arrayType() {
			return getRuleContext(ArrayTypeContext.class,0);
		}
		public StructTypeContext structType() {
			return getRuleContext(StructTypeContext.class,0);
		}
		public PointerTypeContext pointerType() {
			return getRuleContext(PointerTypeContext.class,0);
		}
		public SliceTypeContext sliceType() {
			return getRuleContext(SliceTypeContext.class,0);
		}
		public TypeLitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeLit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).enterTypeLit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).exitTypeLit(this);
		}
	}

	public final TypeLitContext typeLit() throws RecognitionException {
		TypeLitContext _localctx = new TypeLitContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_typeLit);
		try {
			setState(210);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(206);
				arrayType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(207);
				structType();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(208);
				pointerType();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(209);
				sliceType();
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

	public static class ArrayTypeContext extends ParserRuleContext {
		public ArrayLengthContext arrayLength() {
			return getRuleContext(ArrayLengthContext.class,0);
		}
		public ElementTypeContext elementType() {
			return getRuleContext(ElementTypeContext.class,0);
		}
		public ArrayTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).enterArrayType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).exitArrayType(this);
		}
	}

	public final ArrayTypeContext arrayType() throws RecognitionException {
		ArrayTypeContext _localctx = new ArrayTypeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_arrayType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			match(T__1);
			setState(213);
			arrayLength();
			setState(214);
			match(RSQ);
			setState(215);
			elementType();
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

	public static class ArrayLengthContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArrayLengthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayLength; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).enterArrayLength(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).exitArrayLength(this);
		}
	}

	public final ArrayLengthContext arrayLength() throws RecognitionException {
		ArrayLengthContext _localctx = new ArrayLengthContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_arrayLength);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			expression(0);
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

	public static class ElementTypeContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ElementTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).enterElementType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).exitElementType(this);
		}
	}

	public final ElementTypeContext elementType() throws RecognitionException {
		ElementTypeContext _localctx = new ElementTypeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_elementType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			type();
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

	public static class SliceTypeContext extends ParserRuleContext {
		public ElementTypeContext elementType() {
			return getRuleContext(ElementTypeContext.class,0);
		}
		public SliceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sliceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).enterSliceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).exitSliceType(this);
		}
	}

	public final SliceTypeContext sliceType() throws RecognitionException {
		SliceTypeContext _localctx = new SliceTypeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_sliceType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			match(T__1);
			setState(222);
			match(RSQ);
			setState(223);
			elementType();
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

	public static class StructTypeContext extends ParserRuleContext {
		public TerminalNode STRUCT() { return getToken(GooParser.STRUCT, 0); }
		public FieldDeclListContext fieldDeclList() {
			return getRuleContext(FieldDeclListContext.class,0);
		}
		public StructTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).enterStructType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).exitStructType(this);
		}
	}

	public final StructTypeContext structType() throws RecognitionException {
		StructTypeContext _localctx = new StructTypeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_structType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			match(STRUCT);
			setState(226);
			match(T__2);
			setState(227);
			fieldDeclList(0);
			setState(228);
			match(RBRACE);
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

	public static class FieldDeclListContext extends ParserRuleContext {
		public FieldDeclListContext fieldDeclList() {
			return getRuleContext(FieldDeclListContext.class,0);
		}
		public FieldDeclContext fieldDecl() {
			return getRuleContext(FieldDeclContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(GooParser.SEMI, 0); }
		public FieldDeclListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldDeclList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).enterFieldDeclList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).exitFieldDeclList(this);
		}
	}

	public final FieldDeclListContext fieldDeclList() throws RecognitionException {
		return fieldDeclList(0);
	}

	private FieldDeclListContext fieldDeclList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		FieldDeclListContext _localctx = new FieldDeclListContext(_ctx, _parentState);
		FieldDeclListContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_fieldDeclList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			}
			_ctx.stop = _input.LT(-1);
			setState(237);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new FieldDeclListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_fieldDeclList);
					setState(231);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(232);
					fieldDecl();
					setState(233);
					match(SEMI);
					}
					} 
				}
				setState(239);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
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

	public static class FieldDeclContext extends ParserRuleContext {
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public FieldDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).enterFieldDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).exitFieldDecl(this);
		}
	}

	public final FieldDeclContext fieldDecl() throws RecognitionException {
		FieldDeclContext _localctx = new FieldDeclContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_fieldDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			identifierList(0);
			setState(241);
			type();
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

	public static class PointerTypeContext extends ParserRuleContext {
		public BaseTypeContext baseType() {
			return getRuleContext(BaseTypeContext.class,0);
		}
		public PointerTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pointerType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).enterPointerType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).exitPointerType(this);
		}
	}

	public final PointerTypeContext pointerType() throws RecognitionException {
		PointerTypeContext _localctx = new PointerTypeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_pointerType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			match(T__3);
			setState(244);
			baseType();
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

	public static class BaseTypeContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public BaseTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_baseType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).enterBaseType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).exitBaseType(this);
		}
	}

	public final BaseTypeContext baseType() throws RecognitionException {
		BaseTypeContext _localctx = new BaseTypeContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_baseType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			type();
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

	public static class SignatureContext extends ParserRuleContext {
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public ResultContext result() {
			return getRuleContext(ResultContext.class,0);
		}
		public SignatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signature; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).enterSignature(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).exitSignature(this);
		}
	}

	public final SignatureContext signature() throws RecognitionException {
		SignatureContext _localctx = new SignatureContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_signature);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			parameters();
			setState(250);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__3) | (1L << STRUCT) | (1L << Identifier))) != 0)) {
				{
				setState(249);
				result();
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

	public static class ResultContext extends ParserRuleContext {
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ResultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_result; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).enterResult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).exitResult(this);
		}
	}

	public final ResultContext result() throws RecognitionException {
		ResultContext _localctx = new ResultContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_result);
		try {
			setState(254);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(252);
				parameters();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(253);
				type();
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

	public static class ParametersContext extends ParserRuleContext {
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).enterParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).exitParameters(this);
		}
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			match(T__0);
			setState(261);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__3) | (1L << STRUCT) | (1L << Identifier))) != 0)) {
				{
				setState(257);
				parameterList(0);
				setState(259);
				_la = _input.LA(1);
				if (_la==T__4) {
					{
					setState(258);
					match(T__4);
					}
				}

				}
			}

			setState(263);
			match(RPAREN);
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

	public static class ParameterListContext extends ParserRuleContext {
		public ParameterDeclContext parameterDecl() {
			return getRuleContext(ParameterDeclContext.class,0);
		}
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public ParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).enterParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).exitParameterList(this);
		}
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		return parameterList(0);
	}

	private ParameterListContext parameterList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ParameterListContext _localctx = new ParameterListContext(_ctx, _parentState);
		ParameterListContext _prevctx = _localctx;
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_parameterList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(266);
			parameterDecl();
			}
			_ctx.stop = _input.LT(-1);
			setState(273);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ParameterListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_parameterList);
					setState(268);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(269);
					match(T__4);
					setState(270);
					parameterDecl();
					}
					} 
				}
				setState(275);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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

	public static class ParameterDeclContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public ParameterDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).enterParameterDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).exitParameterDecl(this);
		}
	}

	public final ParameterDeclContext parameterDecl() throws RecognitionException {
		ParameterDeclContext _localctx = new ParameterDeclContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_parameterDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(276);
				identifierList(0);
				}
				break;
			}
			setState(279);
			type();
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

	public static class MethodNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(GooParser.Identifier, 0); }
		public MethodNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).enterMethodName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).exitMethodName(this);
		}
	}

	public final MethodNameContext methodName() throws RecognitionException {
		MethodNameContext _localctx = new MethodNameContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_methodName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			match(Identifier);
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

	public static class BlockContext extends ParserRuleContext {
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			match(T__2);
			setState(284);
			statementList(0);
			setState(285);
			match(RBRACE);
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

	public static class StatementListContext extends ParserRuleContext {
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public StatementListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).enterStatementList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).exitStatementList(this);
		}
	}

	public final StatementListContext statementList() throws RecognitionException {
		return statementList(0);
	}

	private StatementListContext statementList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		StatementListContext _localctx = new StatementListContext(_ctx, _parentState);
		StatementListContext _prevctx = _localctx;
		int _startState = 38;
		enterRecursionRule(_localctx, 38, RULE_statementList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			}
			_ctx.stop = _input.LT(-1);
			setState(294);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new StatementListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_statementList);
					setState(288);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(289);
					statement();
					setState(290);
					match(SEMI);
					}
					} 
				}
				setState(296);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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

	public static class DeclarationContext extends ParserRuleContext {
		public ConstDeclContext constDecl() {
			return getRuleContext(ConstDeclContext.class,0);
		}
		public TypeDeclContext typeDecl() {
			return getRuleContext(TypeDeclContext.class,0);
		}
		public VarDeclContext varDecl() {
			return getRuleContext(VarDeclContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).exitDeclaration(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_declaration);
		try {
			setState(300);
			switch (_input.LA(1)) {
			case CONST:
				enterOuterAlt(_localctx, 1);
				{
				setState(297);
				constDecl();
				}
				break;
			case TYPE:
				enterOuterAlt(_localctx, 2);
				{
				setState(298);
				typeDecl();
				}
				break;
			case VAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(299);
				varDecl();
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

	public static class TopLevelDeclListContext extends ParserRuleContext {
		public TopLevelDeclListContext topLevelDeclList() {
			return getRuleContext(TopLevelDeclListContext.class,0);
		}
		public TopLevelDeclContext topLevelDecl() {
			return getRuleContext(TopLevelDeclContext.class,0);
		}
		public TopLevelDeclListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_topLevelDeclList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).enterTopLevelDeclList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).exitTopLevelDeclList(this);
		}
	}

	public final TopLevelDeclListContext topLevelDeclList() throws RecognitionException {
		return topLevelDeclList(0);
	}

	private TopLevelDeclListContext topLevelDeclList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TopLevelDeclListContext _localctx = new TopLevelDeclListContext(_ctx, _parentState);
		TopLevelDeclListContext _prevctx = _localctx;
		int _startState = 42;
		enterRecursionRule(_localctx, 42, RULE_topLevelDeclList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			}
			_ctx.stop = _input.LT(-1);
			setState(309);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TopLevelDeclListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_topLevelDeclList);
					setState(303);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(304);
					topLevelDecl();
					setState(305);
					match(SEMI);
					}
					} 
				}
				setState(311);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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

	public static class TopLevelDeclContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public FunctionDeclContext functionDecl() {
			return getRuleContext(FunctionDeclContext.class,0);
		}
		public TopLevelDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_topLevelDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).enterTopLevelDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).exitTopLevelDecl(this);
		}
	}

	public final TopLevelDeclContext topLevelDecl() throws RecognitionException {
		TopLevelDeclContext _localctx = new TopLevelDeclContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_topLevelDecl);
		try {
			setState(314);
			switch (_input.LA(1)) {
			case CONST:
			case TYPE:
			case VAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(312);
				declaration();
				}
				break;
			case FUNC:
				enterOuterAlt(_localctx, 2);
				{
				setState(313);
				functionDecl();
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

	public static class ConstDeclContext extends ParserRuleContext {
		public TerminalNode CONST() { return getToken(GooParser.CONST, 0); }
		public ConstSpecContext constSpec() {
			return getRuleContext(ConstSpecContext.class,0);
		}
		public ConstSpecListContext constSpecList() {
			return getRuleContext(ConstSpecListContext.class,0);
		}
		public ConstDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).enterConstDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).exitConstDecl(this);
		}
	}

	public final ConstDeclContext constDecl() throws RecognitionException {
		ConstDeclContext _localctx = new ConstDeclContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_constDecl);
		try {
			setState(323);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(316);
				match(CONST);
				setState(317);
				constSpec();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(318);
				match(CONST);
				setState(319);
				match(T__0);
				setState(320);
				constSpecList(0);
				setState(321);
				match(RPAREN);
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

	public static class ConstSpecListContext extends ParserRuleContext {
		public ConstSpecListContext constSpecList() {
			return getRuleContext(ConstSpecListContext.class,0);
		}
		public ConstSpecContext constSpec() {
			return getRuleContext(ConstSpecContext.class,0);
		}
		public ConstSpecListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constSpecList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).enterConstSpecList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).exitConstSpecList(this);
		}
	}

	public final ConstSpecListContext constSpecList() throws RecognitionException {
		return constSpecList(0);
	}

	private ConstSpecListContext constSpecList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ConstSpecListContext _localctx = new ConstSpecListContext(_ctx, _parentState);
		ConstSpecListContext _prevctx = _localctx;
		int _startState = 48;
		enterRecursionRule(_localctx, 48, RULE_constSpecList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			}
			_ctx.stop = _input.LT(-1);
			setState(332);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ConstSpecListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_constSpecList);
					setState(326);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(327);
					constSpec();
					setState(328);
					match(SEMI);
					}
					} 
				}
				setState(334);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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

	public static class ConstSpecContext extends ParserRuleContext {
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ConstSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).enterConstSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).exitConstSpec(this);
		}
	}

	public final ConstSpecContext constSpec() throws RecognitionException {
		ConstSpecContext _localctx = new ConstSpecContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_constSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(335);
			identifierList(0);
			setState(341);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__3) | (1L << T__5) | (1L << STRUCT) | (1L << Identifier))) != 0)) {
				{
				setState(337);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__3) | (1L << STRUCT) | (1L << Identifier))) != 0)) {
					{
					setState(336);
					type();
					}
				}

				setState(339);
				match(T__5);
				setState(340);
				expressionList(0);
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

	public static class IdentifierListContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(GooParser.Identifier, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public IdentifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).enterIdentifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).exitIdentifierList(this);
		}
	}

	public final IdentifierListContext identifierList() throws RecognitionException {
		return identifierList(0);
	}

	private IdentifierListContext identifierList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		IdentifierListContext _localctx = new IdentifierListContext(_ctx, _parentState);
		IdentifierListContext _prevctx = _localctx;
		int _startState = 52;
		enterRecursionRule(_localctx, 52, RULE_identifierList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(344);
			match(Identifier);
			}
			_ctx.stop = _input.LT(-1);
			setState(351);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new IdentifierListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_identifierList);
					setState(346);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(347);
					match(T__4);
					setState(348);
					match(Identifier);
					}
					} 
				}
				setState(353);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
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

	public static class ExpressionListContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).enterExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).exitExpressionList(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		return expressionList(0);
	}

	private ExpressionListContext expressionList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, _parentState);
		ExpressionListContext _prevctx = _localctx;
		int _startState = 54;
		enterRecursionRule(_localctx, 54, RULE_expressionList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(355);
			expression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(362);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressionListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expressionList);
					setState(357);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(358);
					match(T__4);
					setState(359);
					expression(0);
					}
					} 
				}
				setState(364);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
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

	public static class TypeDeclContext extends ParserRuleContext {
		public TerminalNode TYPE() { return getToken(GooParser.TYPE, 0); }
		public TypeSpecContext typeSpec() {
			return getRuleContext(TypeSpecContext.class,0);
		}
		public TypeSpecListContext typeSpecList() {
			return getRuleContext(TypeSpecListContext.class,0);
		}
		public TypeDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).enterTypeDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).exitTypeDecl(this);
		}
	}

	public final TypeDeclContext typeDecl() throws RecognitionException {
		TypeDeclContext _localctx = new TypeDeclContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_typeDecl);
		try {
			setState(372);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(365);
				match(TYPE);
				setState(366);
				typeSpec();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(367);
				match(TYPE);
				setState(368);
				match(T__0);
				setState(369);
				typeSpecList(0);
				setState(370);
				match(RPAREN);
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

	public static class TypeSpecListContext extends ParserRuleContext {
		public TypeSpecListContext typeSpecList() {
			return getRuleContext(TypeSpecListContext.class,0);
		}
		public TypeSpecContext typeSpec() {
			return getRuleContext(TypeSpecContext.class,0);
		}
		public TypeSpecListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeSpecList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).enterTypeSpecList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).exitTypeSpecList(this);
		}
	}

	public final TypeSpecListContext typeSpecList() throws RecognitionException {
		return typeSpecList(0);
	}

	private TypeSpecListContext typeSpecList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TypeSpecListContext _localctx = new TypeSpecListContext(_ctx, _parentState);
		TypeSpecListContext _prevctx = _localctx;
		int _startState = 58;
		enterRecursionRule(_localctx, 58, RULE_typeSpecList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			}
			_ctx.stop = _input.LT(-1);
			setState(381);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TypeSpecListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_typeSpecList);
					setState(375);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(376);
					typeSpec();
					setState(377);
					match(SEMI);
					}
					} 
				}
				setState(383);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
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

	public static class TypeSpecContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(GooParser.Identifier, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TypeSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).enterTypeSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).exitTypeSpec(this);
		}
	}

	public final TypeSpecContext typeSpec() throws RecognitionException {
		TypeSpecContext _localctx = new TypeSpecContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_typeSpec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(384);
			match(Identifier);
			setState(385);
			type();
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

	public static class VarDeclContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(GooParser.VAR, 0); }
		public VarSpecContext varSpec() {
			return getRuleContext(VarSpecContext.class,0);
		}
		public VarSpecListContext varSpecList() {
			return getRuleContext(VarSpecListContext.class,0);
		}
		public VarDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).enterVarDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).exitVarDecl(this);
		}
	}

	public final VarDeclContext varDecl() throws RecognitionException {
		VarDeclContext _localctx = new VarDeclContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_varDecl);
		try {
			setState(394);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(387);
				match(VAR);
				setState(388);
				varSpec();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(389);
				match(VAR);
				setState(390);
				match(T__0);
				setState(391);
				varSpecList(0);
				setState(392);
				match(RPAREN);
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

	public static class VarSpecListContext extends ParserRuleContext {
		public VarSpecListContext varSpecList() {
			return getRuleContext(VarSpecListContext.class,0);
		}
		public VarSpecContext varSpec() {
			return getRuleContext(VarSpecContext.class,0);
		}
		public VarSpecListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varSpecList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).enterVarSpecList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).exitVarSpecList(this);
		}
	}

	public final VarSpecListContext varSpecList() throws RecognitionException {
		return varSpecList(0);
	}

	private VarSpecListContext varSpecList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		VarSpecListContext _localctx = new VarSpecListContext(_ctx, _parentState);
		VarSpecListContext _prevctx = _localctx;
		int _startState = 64;
		enterRecursionRule(_localctx, 64, RULE_varSpecList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			}
			_ctx.stop = _input.LT(-1);
			setState(403);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new VarSpecListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_varSpecList);
					setState(397);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(398);
					varSpec();
					setState(399);
					match(SEMI);
					}
					} 
				}
				setState(405);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
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

	public static class VarSpecContext extends ParserRuleContext {
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public VarSpecRemContext varSpecRem() {
			return getRuleContext(VarSpecRemContext.class,0);
		}
		public VarSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).enterVarSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).exitVarSpec(this);
		}
	}

	public final VarSpecContext varSpec() throws RecognitionException {
		VarSpecContext _localctx = new VarSpecContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_varSpec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(406);
			identifierList(0);
			setState(407);
			varSpecRem();
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

	public static class VarSpecRemContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public VarSpecRemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varSpecRem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).enterVarSpecRem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).exitVarSpecRem(this);
		}
	}

	public final VarSpecRemContext varSpecRem() throws RecognitionException {
		VarSpecRemContext _localctx = new VarSpecRemContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_varSpecRem);
		try {
			setState(416);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(409);
				type();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(410);
				type();
				setState(411);
				match(T__5);
				setState(412);
				expressionList(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(414);
				match(T__5);
				setState(415);
				expressionList(0);
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

	public static class ShortVarDeclContext extends ParserRuleContext {
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ShortVarDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shortVarDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).enterShortVarDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).exitShortVarDecl(this);
		}
	}

	public final ShortVarDeclContext shortVarDecl() throws RecognitionException {
		ShortVarDeclContext _localctx = new ShortVarDeclContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_shortVarDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(418);
			identifierList(0);
			setState(419);
			match(T__6);
			setState(420);
			expressionList(0);
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

	public static class FunctionDeclContext extends ParserRuleContext {
		public TerminalNode FUNC() { return getToken(GooParser.FUNC, 0); }
		public FunctionNameContext functionName() {
			return getRuleContext(FunctionNameContext.class,0);
		}
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public SignatureContext signature() {
			return getRuleContext(SignatureContext.class,0);
		}
		public FunctionDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).enterFunctionDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).exitFunctionDecl(this);
		}
	}

	public final FunctionDeclContext functionDecl() throws RecognitionException {
		FunctionDeclContext _localctx = new FunctionDeclContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_functionDecl);
		try {
			setState(430);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(422);
				match(FUNC);
				setState(423);
				functionName();
				setState(424);
				function();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(426);
				match(FUNC);
				setState(427);
				functionName();
				setState(428);
				signature();
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

	public static class FunctionNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(GooParser.Identifier, 0); }
		public FunctionNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).enterFunctionName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).exitFunctionName(this);
		}
	}

	public final FunctionNameContext functionName() throws RecognitionException {
		FunctionNameContext _localctx = new FunctionNameContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_functionName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(432);
			match(Identifier);
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

	public static class FunctionContext extends ParserRuleContext {
		public SignatureContext signature() {
			return getRuleContext(SignatureContext.class,0);
		}
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).exitFunction(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(434);
			signature();
			setState(435);
			functionBody();
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

	public static class FunctionBodyContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FunctionBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).enterFunctionBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).exitFunctionBody(this);
		}
	}

	public final FunctionBodyContext functionBody() throws RecognitionException {
		FunctionBodyContext _localctx = new FunctionBodyContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_functionBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(437);
			block();
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

	public static class OperandContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public OperandNameContext operandName() {
			return getRuleContext(OperandNameContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public OperandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).enterOperand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).exitOperand(this);
		}
	}

	public final OperandContext operand() throws RecognitionException {
		OperandContext _localctx = new OperandContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_operand);
		try {
			setState(445);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(439);
				literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(440);
				operandName();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(441);
				match(T__0);
				setState(442);
				expression(0);
				setState(443);
				match(RPAREN);
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

	public static class LiteralContext extends ParserRuleContext {
		public BasicLitContext basicLit() {
			return getRuleContext(BasicLitContext.class,0);
		}
		public CompositeLitContext compositeLit() {
			return getRuleContext(CompositeLitContext.class,0);
		}
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_literal);
		try {
			setState(449);
			switch (_input.LA(1)) {
			case IntLit:
			case FloatLit:
			case StringLit:
			case RuneLit:
				enterOuterAlt(_localctx, 1);
				{
				setState(447);
				basicLit();
				}
				break;
			case T__1:
			case STRUCT:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(448);
				compositeLit();
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

	public static class BasicLitContext extends ParserRuleContext {
		public TerminalNode IntLit() { return getToken(GooParser.IntLit, 0); }
		public TerminalNode FloatLit() { return getToken(GooParser.FloatLit, 0); }
		public TerminalNode RuneLit() { return getToken(GooParser.RuneLit, 0); }
		public TerminalNode StringLit() { return getToken(GooParser.StringLit, 0); }
		public BasicLitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basicLit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).enterBasicLit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).exitBasicLit(this);
		}
	}

	public final BasicLitContext basicLit() throws RecognitionException {
		BasicLitContext _localctx = new BasicLitContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_basicLit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(451);
			_la = _input.LA(1);
			if ( !(((((_la - 63)) & ~0x3f) == 0 && ((1L << (_la - 63)) & ((1L << (IntLit - 63)) | (1L << (FloatLit - 63)) | (1L << (StringLit - 63)) | (1L << (RuneLit - 63)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
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

	public static class OperandNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(GooParser.Identifier, 0); }
		public QualifiedIdentContext qualifiedIdent() {
			return getRuleContext(QualifiedIdentContext.class,0);
		}
		public OperandNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operandName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).enterOperandName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).exitOperandName(this);
		}
	}

	public final OperandNameContext operandName() throws RecognitionException {
		OperandNameContext _localctx = new OperandNameContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_operandName);
		try {
			setState(455);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(453);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(454);
				qualifiedIdent();
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

	public static class QualifiedIdentContext extends ParserRuleContext {
		public PackageNameContext packageName() {
			return getRuleContext(PackageNameContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(GooParser.Identifier, 0); }
		public QualifiedIdentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedIdent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).enterQualifiedIdent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).exitQualifiedIdent(this);
		}
	}

	public final QualifiedIdentContext qualifiedIdent() throws RecognitionException {
		QualifiedIdentContext _localctx = new QualifiedIdentContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_qualifiedIdent);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(457);
			packageName();
			setState(458);
			match(T__7);
			setState(459);
			match(Identifier);
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

	public static class CompositeLitContext extends ParserRuleContext {
		public LiteralTypeContext literalType() {
			return getRuleContext(LiteralTypeContext.class,0);
		}
		public LiteralValueContext literalValue() {
			return getRuleContext(LiteralValueContext.class,0);
		}
		public CompositeLitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compositeLit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).enterCompositeLit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).exitCompositeLit(this);
		}
	}

	public final CompositeLitContext compositeLit() throws RecognitionException {
		CompositeLitContext _localctx = new CompositeLitContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_compositeLit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(461);
			literalType();
			setState(462);
			literalValue();
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

	public static class LiteralTypeContext extends ParserRuleContext {
		public StructTypeContext structType() {
			return getRuleContext(StructTypeContext.class,0);
		}
		public ArrayTypeContext arrayType() {
			return getRuleContext(ArrayTypeContext.class,0);
		}
		public ElementTypeContext elementType() {
			return getRuleContext(ElementTypeContext.class,0);
		}
		public SliceTypeContext sliceType() {
			return getRuleContext(SliceTypeContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public LiteralTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literalType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).enterLiteralType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).exitLiteralType(this);
		}
	}

	public final LiteralTypeContext literalType() throws RecognitionException {
		LiteralTypeContext _localctx = new LiteralTypeContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_literalType);
		try {
			setState(472);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(464);
				structType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(465);
				arrayType();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(466);
				match(T__1);
				setState(467);
				match(T__8);
				setState(468);
				match(RSQ);
				setState(469);
				elementType();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(470);
				sliceType();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(471);
				typeName();
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

	public static class LiteralValueContext extends ParserRuleContext {
		public ElementListContext elementList() {
			return getRuleContext(ElementListContext.class,0);
		}
		public LiteralValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literalValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).enterLiteralValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).exitLiteralValue(this);
		}
	}

	public final LiteralValueContext literalValue() throws RecognitionException {
		LiteralValueContext _localctx = new LiteralValueContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_literalValue);
		int _la;
		try {
			setState(483);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(474);
				match(T__2);
				setState(475);
				match(RBRACE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(476);
				match(T__2);
				setState(477);
				elementList(0);
				setState(479);
				_la = _input.LA(1);
				if (_la==T__4) {
					{
					setState(478);
					match(T__4);
					}
				}

				setState(481);
				match(RBRACE);
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

	public static class ElementListContext extends ParserRuleContext {
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public ElementListContext elementList() {
			return getRuleContext(ElementListContext.class,0);
		}
		public ElementListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).enterElementList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).exitElementList(this);
		}
	}

	public final ElementListContext elementList() throws RecognitionException {
		return elementList(0);
	}

	private ElementListContext elementList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ElementListContext _localctx = new ElementListContext(_ctx, _parentState);
		ElementListContext _prevctx = _localctx;
		int _startState = 96;
		enterRecursionRule(_localctx, 96, RULE_elementList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(486);
			element();
			}
			_ctx.stop = _input.LT(-1);
			setState(493);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ElementListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_elementList);
					setState(488);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(489);
					match(T__4);
					setState(490);
					element();
					}
					} 
				}
				setState(495);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
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

	public static class ElementContext extends ParserRuleContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public KeyContext key() {
			return getRuleContext(KeyContext.class,0);
		}
		public ElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).enterElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).exitElement(this);
		}
	}

	public final ElementContext element() throws RecognitionException {
		ElementContext _localctx = new ElementContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_element);
		try {
			setState(501);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(496);
				value();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(497);
				key();
				setState(498);
				match(T__9);
				setState(499);
				value();
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

	public static class KeyContext extends ParserRuleContext {
		public FieldNameContext fieldName() {
			return getRuleContext(FieldNameContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public LiteralValueContext literalValue() {
			return getRuleContext(LiteralValueContext.class,0);
		}
		public KeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_key; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).enterKey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).exitKey(this);
		}
	}

	public final KeyContext key() throws RecognitionException {
		KeyContext _localctx = new KeyContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_key);
		try {
			setState(506);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(503);
				fieldName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(504);
				expression(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(505);
				literalValue();
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

	public static class FieldNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(GooParser.Identifier, 0); }
		public FieldNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).enterFieldName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).exitFieldName(this);
		}
	}

	public final FieldNameContext fieldName() throws RecognitionException {
		FieldNameContext _localctx = new FieldNameContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_fieldName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(508);
			match(Identifier);
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

	public static class ValueContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public LiteralValueContext literalValue() {
			return getRuleContext(LiteralValueContext.class,0);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).exitValue(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_value);
		try {
			setState(512);
			switch (_input.LA(1)) {
			case T__0:
			case T__1:
			case T__3:
			case T__18:
			case T__19:
			case T__21:
			case T__26:
			case T__28:
			case STRUCT:
			case Identifier:
			case IntLit:
			case FloatLit:
			case StringLit:
			case RuneLit:
				enterOuterAlt(_localctx, 1);
				{
				setState(510);
				expression(0);
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(511);
				literalValue();
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

	public static class PrimaryExprContext extends ParserRuleContext {
		public OperandContext operand() {
			return getRuleContext(OperandContext.class,0);
		}
		public ConversionContext conversion() {
			return getRuleContext(ConversionContext.class,0);
		}
		public PrimaryExprContext primaryExpr() {
			return getRuleContext(PrimaryExprContext.class,0);
		}
		public SelectorContext selector() {
			return getRuleContext(SelectorContext.class,0);
		}
		public IndexContext index() {
			return getRuleContext(IndexContext.class,0);
		}
		public SliceContext slice() {
			return getRuleContext(SliceContext.class,0);
		}
		public TypeAssertionContext typeAssertion() {
			return getRuleContext(TypeAssertionContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public PrimaryExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).enterPrimaryExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).exitPrimaryExpr(this);
		}
	}

	public final PrimaryExprContext primaryExpr() throws RecognitionException {
		return primaryExpr(0);
	}

	private PrimaryExprContext primaryExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PrimaryExprContext _localctx = new PrimaryExprContext(_ctx, _parentState);
		PrimaryExprContext _prevctx = _localctx;
		int _startState = 106;
		enterRecursionRule(_localctx, 106, RULE_primaryExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(517);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				{
				setState(515);
				operand();
				}
				break;
			case 2:
				{
				setState(516);
				conversion();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(531);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(529);
					switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
					case 1:
						{
						_localctx = new PrimaryExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_primaryExpr);
						setState(519);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(520);
						selector();
						}
						break;
					case 2:
						{
						_localctx = new PrimaryExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_primaryExpr);
						setState(521);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(522);
						index();
						}
						break;
					case 3:
						{
						_localctx = new PrimaryExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_primaryExpr);
						setState(523);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(524);
						slice();
						}
						break;
					case 4:
						{
						_localctx = new PrimaryExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_primaryExpr);
						setState(525);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(526);
						typeAssertion();
						}
						break;
					case 5:
						{
						_localctx = new PrimaryExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_primaryExpr);
						setState(527);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(528);
						arguments();
						}
						break;
					}
					} 
				}
				setState(533);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
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

	public static class SelectorContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(GooParser.Identifier, 0); }
		public SelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).enterSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).exitSelector(this);
		}
	}

	public final SelectorContext selector() throws RecognitionException {
		SelectorContext _localctx = new SelectorContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_selector);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(534);
			match(T__7);
			setState(535);
			match(Identifier);
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

	public static class IndexContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IndexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).enterIndex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).exitIndex(this);
		}
	}

	public final IndexContext index() throws RecognitionException {
		IndexContext _localctx = new IndexContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_index);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(537);
			match(T__1);
			setState(538);
			expression(0);
			setState(539);
			match(RSQ);
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

	public static class SliceContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public SliceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_slice; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).enterSlice(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).exitSlice(this);
		}
	}

	public final SliceContext slice() throws RecognitionException {
		SliceContext _localctx = new SliceContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_slice);
		int _la;
		try {
			setState(560);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(541);
				match(T__1);
				setState(543);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__3) | (1L << T__18) | (1L << T__19) | (1L << T__21) | (1L << T__26) | (1L << T__28) | (1L << STRUCT) | (1L << Identifier) | (1L << IntLit))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (FloatLit - 64)) | (1L << (StringLit - 64)) | (1L << (RuneLit - 64)))) != 0)) {
					{
					setState(542);
					expression(0);
					}
				}

				setState(545);
				match(T__9);
				setState(547);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__3) | (1L << T__18) | (1L << T__19) | (1L << T__21) | (1L << T__26) | (1L << T__28) | (1L << STRUCT) | (1L << Identifier) | (1L << IntLit))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (FloatLit - 64)) | (1L << (StringLit - 64)) | (1L << (RuneLit - 64)))) != 0)) {
					{
					setState(546);
					expression(0);
					}
				}

				setState(549);
				match(RSQ);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(550);
				match(T__1);
				setState(552);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__3) | (1L << T__18) | (1L << T__19) | (1L << T__21) | (1L << T__26) | (1L << T__28) | (1L << STRUCT) | (1L << Identifier) | (1L << IntLit))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (FloatLit - 64)) | (1L << (StringLit - 64)) | (1L << (RuneLit - 64)))) != 0)) {
					{
					setState(551);
					expression(0);
					}
				}

				setState(554);
				match(T__9);
				setState(555);
				expression(0);
				setState(556);
				match(T__9);
				setState(557);
				expression(0);
				setState(558);
				match(RSQ);
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

	public static class TypeAssertionContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TypeAssertionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeAssertion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).enterTypeAssertion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).exitTypeAssertion(this);
		}
	}

	public final TypeAssertionContext typeAssertion() throws RecognitionException {
		TypeAssertionContext _localctx = new TypeAssertionContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_typeAssertion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(562);
			match(T__7);
			setState(563);
			match(T__0);
			setState(564);
			type();
			setState(565);
			match(RPAREN);
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

	public static class ArgumentsContext extends ParserRuleContext {
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).exitArguments(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_arguments);
		int _la;
		try {
			setState(592);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(567);
				match(T__0);
				setState(568);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(569);
				match(T__0);
				setState(570);
				expressionList(0);
				setState(572);
				_la = _input.LA(1);
				if (_la==T__4) {
					{
					setState(571);
					match(T__4);
					}
				}

				setState(574);
				match(RPAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(576);
				match(T__0);
				setState(577);
				type();
				setState(579);
				_la = _input.LA(1);
				if (_la==T__4) {
					{
					setState(578);
					match(T__4);
					}
				}

				setState(581);
				match(RPAREN);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(583);
				match(T__0);
				setState(584);
				type();
				setState(585);
				match(T__4);
				setState(586);
				expressionList(0);
				setState(588);
				_la = _input.LA(1);
				if (_la==T__4) {
					{
					setState(587);
					match(T__4);
					}
				}

				setState(590);
				match(RPAREN);
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

	public static class ExpressionContext extends ParserRuleContext {
		public UnaryExprContext unaryExpr() {
			return getRuleContext(UnaryExprContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Mul_opContext mul_op() {
			return getRuleContext(Mul_opContext.class,0);
		}
		public Add_opContext add_op() {
			return getRuleContext(Add_opContext.class,0);
		}
		public Rel_opContext rel_op() {
			return getRuleContext(Rel_opContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 118;
		enterRecursionRule(_localctx, 118, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(595);
			unaryExpr();
			}
			_ctx.stop = _input.LT(-1);
			setState(617);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(615);
					switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(597);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(598);
						mul_op();
						setState(599);
						expression(6);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(601);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(602);
						add_op();
						setState(603);
						expression(5);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(605);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(606);
						rel_op();
						setState(607);
						expression(4);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(609);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(610);
						match(T__10);
						setState(611);
						expression(3);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(612);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(613);
						match(T__11);
						setState(614);
						expression(2);
						}
						break;
					}
					} 
				}
				setState(619);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
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

	public static class UnaryExprContext extends ParserRuleContext {
		public PrimaryExprContext primaryExpr() {
			return getRuleContext(PrimaryExprContext.class,0);
		}
		public Unary_opContext unary_op() {
			return getRuleContext(Unary_opContext.class,0);
		}
		public UnaryExprContext unaryExpr() {
			return getRuleContext(UnaryExprContext.class,0);
		}
		public UnaryExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).enterUnaryExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).exitUnaryExpr(this);
		}
	}

	public final UnaryExprContext unaryExpr() throws RecognitionException {
		UnaryExprContext _localctx = new UnaryExprContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_unaryExpr);
		try {
			setState(624);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(620);
				primaryExpr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(621);
				unary_op();
				setState(622);
				unaryExpr();
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

	public static class Rel_opContext extends ParserRuleContext {
		public Rel_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rel_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).enterRel_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).exitRel_op(this);
		}
	}

	public final Rel_opContext rel_op() throws RecognitionException {
		Rel_opContext _localctx = new Rel_opContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_rel_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(626);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
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

	public static class Add_opContext extends ParserRuleContext {
		public Add_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_add_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).enterAdd_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).exitAdd_op(this);
		}
	}

	public final Add_opContext add_op() throws RecognitionException {
		Add_opContext _localctx = new Add_opContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_add_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(628);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
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

	public static class Mul_opContext extends ParserRuleContext {
		public Mul_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mul_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).enterMul_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).exitMul_op(this);
		}
	}

	public final Mul_opContext mul_op() throws RecognitionException {
		Mul_opContext _localctx = new Mul_opContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_mul_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(630);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
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

	public static class Unary_opContext extends ParserRuleContext {
		public Unary_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).enterUnary_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).exitUnary_op(this);
		}
	}

	public final Unary_opContext unary_op() throws RecognitionException {
		Unary_opContext _localctx = new Unary_opContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_unary_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(632);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__18) | (1L << T__19) | (1L << T__21) | (1L << T__26) | (1L << T__28))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
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

	public static class ConversionContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ConversionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conversion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).enterConversion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).exitConversion(this);
		}
	}

	public final ConversionContext conversion() throws RecognitionException {
		ConversionContext _localctx = new ConversionContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_conversion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(634);
			type();
			setState(635);
			match(T__0);
			setState(636);
			expression(0);
			setState(638);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(637);
				match(T__4);
				}
			}

			setState(640);
			match(RPAREN);
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

	public static class StatementContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public LabeledStmtContext labeledStmt() {
			return getRuleContext(LabeledStmtContext.class,0);
		}
		public SimpleStmtContext simpleStmt() {
			return getRuleContext(SimpleStmtContext.class,0);
		}
		public GoStmtContext goStmt() {
			return getRuleContext(GoStmtContext.class,0);
		}
		public ReturnStmtContext returnStmt() {
			return getRuleContext(ReturnStmtContext.class,0);
		}
		public BreakStmtContext breakStmt() {
			return getRuleContext(BreakStmtContext.class,0);
		}
		public ContinueStmtContext continueStmt() {
			return getRuleContext(ContinueStmtContext.class,0);
		}
		public GotoStmtContext gotoStmt() {
			return getRuleContext(GotoStmtContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public IfStmtContext ifStmt() {
			return getRuleContext(IfStmtContext.class,0);
		}
		public ForStmtContext forStmt() {
			return getRuleContext(ForStmtContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_statement);
		try {
			setState(653);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(642);
				declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(643);
				labeledStmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(644);
				simpleStmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(645);
				goStmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(646);
				returnStmt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(647);
				breakStmt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(648);
				continueStmt();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(649);
				gotoStmt();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(650);
				block();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(651);
				ifStmt();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(652);
				forStmt();
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

	public static class SimpleStmtContext extends ParserRuleContext {
		public EmptyStmtContext emptyStmt() {
			return getRuleContext(EmptyStmtContext.class,0);
		}
		public ExpressionStmtContext expressionStmt() {
			return getRuleContext(ExpressionStmtContext.class,0);
		}
		public IncDecStmtContext incDecStmt() {
			return getRuleContext(IncDecStmtContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public ShortVarDeclContext shortVarDecl() {
			return getRuleContext(ShortVarDeclContext.class,0);
		}
		public SimpleStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).enterSimpleStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).exitSimpleStmt(this);
		}
	}

	public final SimpleStmtContext simpleStmt() throws RecognitionException {
		SimpleStmtContext _localctx = new SimpleStmtContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_simpleStmt);
		try {
			setState(660);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(655);
				emptyStmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(656);
				expressionStmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(657);
				incDecStmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(658);
				assignment();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(659);
				shortVarDecl();
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

	public static class EmptyStmtContext extends ParserRuleContext {
		public EmptyStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emptyStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).enterEmptyStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).exitEmptyStmt(this);
		}
	}

	public final EmptyStmtContext emptyStmt() throws RecognitionException {
		EmptyStmtContext _localctx = new EmptyStmtContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_emptyStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
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

	public static class LabeledStmtContext extends ParserRuleContext {
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public LabeledStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labeledStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).enterLabeledStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).exitLabeledStmt(this);
		}
	}

	public final LabeledStmtContext labeledStmt() throws RecognitionException {
		LabeledStmtContext _localctx = new LabeledStmtContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_labeledStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(664);
			label();
			setState(665);
			match(T__9);
			setState(666);
			statement();
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

	public static class LabelContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(GooParser.Identifier, 0); }
		public LabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_label; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).enterLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).exitLabel(this);
		}
	}

	public final LabelContext label() throws RecognitionException {
		LabelContext _localctx = new LabelContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_label);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(668);
			match(Identifier);
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

	public static class ExpressionStmtContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).enterExpressionStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).exitExpressionStmt(this);
		}
	}

	public final ExpressionStmtContext expressionStmt() throws RecognitionException {
		ExpressionStmtContext _localctx = new ExpressionStmtContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_expressionStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(670);
			expression(0);
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

	public static class IncDecStmtContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode PLUSPLUS() { return getToken(GooParser.PLUSPLUS, 0); }
		public TerminalNode MINUSMINUS() { return getToken(GooParser.MINUSMINUS, 0); }
		public IncDecStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_incDecStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).enterIncDecStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).exitIncDecStmt(this);
		}
	}

	public final IncDecStmtContext incDecStmt() throws RecognitionException {
		IncDecStmtContext _localctx = new IncDecStmtContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_incDecStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(672);
			expression(0);
			setState(673);
			_la = _input.LA(1);
			if ( !(_la==PLUSPLUS || _la==MINUSMINUS) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
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

	public static class AssignmentContext extends ParserRuleContext {
		public List<ExpressionListContext> expressionList() {
			return getRuleContexts(ExpressionListContext.class);
		}
		public ExpressionListContext expressionList(int i) {
			return getRuleContext(ExpressionListContext.class,i);
		}
		public Assign_opContext assign_op() {
			return getRuleContext(Assign_opContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).exitAssignment(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(675);
			expressionList(0);
			setState(676);
			assign_op();
			setState(677);
			expressionList(0);
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

	public static class Assign_opContext extends ParserRuleContext {
		public Add_opContext add_op() {
			return getRuleContext(Add_opContext.class,0);
		}
		public Mul_opContext mul_op() {
			return getRuleContext(Mul_opContext.class,0);
		}
		public Assign_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).enterAssign_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).exitAssign_op(this);
		}
	}

	public final Assign_opContext assign_op() throws RecognitionException {
		Assign_opContext _localctx = new Assign_opContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_assign_op);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(681);
			switch (_input.LA(1)) {
			case T__18:
			case T__19:
			case T__20:
			case T__21:
				{
				setState(679);
				add_op();
				}
				break;
			case T__3:
			case T__22:
			case T__23:
			case T__24:
			case T__25:
			case T__26:
			case T__27:
				{
				setState(680);
				mul_op();
				}
				break;
			case T__5:
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(683);
			match(T__5);
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

	public static class IfStmtContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(GooParser.IF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public SimpleStmtContext simpleStmt() {
			return getRuleContext(SimpleStmtContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(GooParser.SEMI, 0); }
		public TerminalNode ELSE() { return getToken(GooParser.ELSE, 0); }
		public IfStmtContext ifStmt() {
			return getRuleContext(IfStmtContext.class,0);
		}
		public IfStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).enterIfStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).exitIfStmt(this);
		}
	}

	public final IfStmtContext ifStmt() throws RecognitionException {
		IfStmtContext _localctx = new IfStmtContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_ifStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(685);
			match(IF);
			setState(689);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				{
				setState(686);
				simpleStmt();
				setState(687);
				match(SEMI);
				}
				break;
			}
			setState(691);
			expression(0);
			setState(692);
			block();
			setState(698);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(693);
				match(ELSE);
				setState(696);
				switch (_input.LA(1)) {
				case IF:
					{
					setState(694);
					ifStmt();
					}
					break;
				case T__2:
					{
					setState(695);
					block();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
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

	public static class ForStmtContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(GooParser.FOR, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ForClauseContext forClause() {
			return getRuleContext(ForClauseContext.class,0);
		}
		public RangeClauseContext rangeClause() {
			return getRuleContext(RangeClauseContext.class,0);
		}
		public ForStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).enterForStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).exitForStmt(this);
		}
	}

	public final ForStmtContext forStmt() throws RecognitionException {
		ForStmtContext _localctx = new ForStmtContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_forStmt);
		try {
			setState(712);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(700);
				match(FOR);
				setState(701);
				condition();
				setState(702);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(704);
				match(FOR);
				setState(705);
				forClause();
				setState(706);
				block();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(708);
				match(FOR);
				setState(709);
				rangeClause();
				setState(710);
				block();
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

	public static class ConditionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).exitCondition(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(714);
			expression(0);
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

	public static class ForClauseContext extends ParserRuleContext {
		public InitStmtContext initStmt() {
			return getRuleContext(InitStmtContext.class,0);
		}
		public PostStmtContext postStmt() {
			return getRuleContext(PostStmtContext.class,0);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public ForClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).enterForClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).exitForClause(this);
		}
	}

	public final ForClauseContext forClause() throws RecognitionException {
		ForClauseContext _localctx = new ForClauseContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_forClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(716);
			initStmt();
			setState(717);
			match(SEMI);
			setState(719);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__3) | (1L << T__18) | (1L << T__19) | (1L << T__21) | (1L << T__26) | (1L << T__28) | (1L << STRUCT) | (1L << Identifier) | (1L << IntLit))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (FloatLit - 64)) | (1L << (StringLit - 64)) | (1L << (RuneLit - 64)))) != 0)) {
				{
				setState(718);
				condition();
				}
			}

			setState(721);
			match(SEMI);
			setState(722);
			postStmt();
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

	public static class InitStmtContext extends ParserRuleContext {
		public SimpleStmtContext simpleStmt() {
			return getRuleContext(SimpleStmtContext.class,0);
		}
		public InitStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).enterInitStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).exitInitStmt(this);
		}
	}

	public final InitStmtContext initStmt() throws RecognitionException {
		InitStmtContext _localctx = new InitStmtContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_initStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(724);
			simpleStmt();
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

	public static class PostStmtContext extends ParserRuleContext {
		public SimpleStmtContext simpleStmt() {
			return getRuleContext(SimpleStmtContext.class,0);
		}
		public PostStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).enterPostStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).exitPostStmt(this);
		}
	}

	public final PostStmtContext postStmt() throws RecognitionException {
		PostStmtContext _localctx = new PostStmtContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_postStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(726);
			simpleStmt();
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

	public static class RangeClauseContext extends ParserRuleContext {
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TerminalNode RANGE() { return getToken(GooParser.RANGE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public RangeClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rangeClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).enterRangeClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).exitRangeClause(this);
		}
	}

	public final RangeClauseContext rangeClause() throws RecognitionException {
		RangeClauseContext _localctx = new RangeClauseContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_rangeClause);
		try {
			setState(738);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(728);
				expressionList(0);
				setState(729);
				match(T__5);
				setState(730);
				match(RANGE);
				setState(731);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(733);
				identifierList(0);
				setState(734);
				match(T__6);
				setState(735);
				match(RANGE);
				setState(736);
				expression(0);
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

	public static class GoStmtContext extends ParserRuleContext {
		public TerminalNode GO() { return getToken(GooParser.GO, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public GoStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_goStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).enterGoStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).exitGoStmt(this);
		}
	}

	public final GoStmtContext goStmt() throws RecognitionException {
		GoStmtContext _localctx = new GoStmtContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_goStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(740);
			match(GO);
			setState(741);
			expression(0);
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

	public static class ReturnStmtContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(GooParser.RETURN, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ReturnStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).enterReturnStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).exitReturnStmt(this);
		}
	}

	public final ReturnStmtContext returnStmt() throws RecognitionException {
		ReturnStmtContext _localctx = new ReturnStmtContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_returnStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(743);
			match(RETURN);
			setState(745);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__3) | (1L << T__18) | (1L << T__19) | (1L << T__21) | (1L << T__26) | (1L << T__28) | (1L << STRUCT) | (1L << Identifier) | (1L << IntLit))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (FloatLit - 64)) | (1L << (StringLit - 64)) | (1L << (RuneLit - 64)))) != 0)) {
				{
				setState(744);
				expressionList(0);
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

	public static class BreakStmtContext extends ParserRuleContext {
		public TerminalNode BREAK() { return getToken(GooParser.BREAK, 0); }
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public BreakStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_breakStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).enterBreakStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).exitBreakStmt(this);
		}
	}

	public final BreakStmtContext breakStmt() throws RecognitionException {
		BreakStmtContext _localctx = new BreakStmtContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_breakStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(747);
			match(BREAK);
			setState(749);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(748);
				label();
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

	public static class ContinueStmtContext extends ParserRuleContext {
		public TerminalNode CONTINUE() { return getToken(GooParser.CONTINUE, 0); }
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public ContinueStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continueStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).enterContinueStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).exitContinueStmt(this);
		}
	}

	public final ContinueStmtContext continueStmt() throws RecognitionException {
		ContinueStmtContext _localctx = new ContinueStmtContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_continueStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(751);
			match(CONTINUE);
			setState(753);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(752);
				label();
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

	public static class GotoStmtContext extends ParserRuleContext {
		public TerminalNode GOTO() { return getToken(GooParser.GOTO, 0); }
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public GotoStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gotoStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).enterGotoStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).exitGotoStmt(this);
		}
	}

	public final GotoStmtContext gotoStmt() throws RecognitionException {
		GotoStmtContext _localctx = new GotoStmtContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_gotoStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(755);
			match(GOTO);
			setState(756);
			label();
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

	public static class SourceFileContext extends ParserRuleContext {
		public PackageClauseContext packageClause() {
			return getRuleContext(PackageClauseContext.class,0);
		}
		public ImportDeclListContext importDeclList() {
			return getRuleContext(ImportDeclListContext.class,0);
		}
		public TopLevelDeclListContext topLevelDeclList() {
			return getRuleContext(TopLevelDeclListContext.class,0);
		}
		public SourceFileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sourceFile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).enterSourceFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).exitSourceFile(this);
		}
	}

	public final SourceFileContext sourceFile() throws RecognitionException {
		SourceFileContext _localctx = new SourceFileContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_sourceFile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(758);
			packageClause();
			setState(759);
			match(SEMI);
			setState(760);
			importDeclList(0);
			setState(761);
			topLevelDeclList(0);
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

	public static class PackageClauseContext extends ParserRuleContext {
		public TerminalNode PACKAGE() { return getToken(GooParser.PACKAGE, 0); }
		public PackageNameContext packageName() {
			return getRuleContext(PackageNameContext.class,0);
		}
		public PackageClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).enterPackageClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).exitPackageClause(this);
		}
	}

	public final PackageClauseContext packageClause() throws RecognitionException {
		PackageClauseContext _localctx = new PackageClauseContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_packageClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(763);
			match(PACKAGE);
			setState(764);
			packageName();
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

	public static class PackageNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(GooParser.Identifier, 0); }
		public PackageNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).enterPackageName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).exitPackageName(this);
		}
	}

	public final PackageNameContext packageName() throws RecognitionException {
		PackageNameContext _localctx = new PackageNameContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_packageName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(766);
			match(Identifier);
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

	public static class ImportDeclListContext extends ParserRuleContext {
		public ImportDeclListContext importDeclList() {
			return getRuleContext(ImportDeclListContext.class,0);
		}
		public ImportDeclContext importDecl() {
			return getRuleContext(ImportDeclContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(GooParser.SEMI, 0); }
		public ImportDeclListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importDeclList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).enterImportDeclList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).exitImportDeclList(this);
		}
	}

	public final ImportDeclListContext importDeclList() throws RecognitionException {
		return importDeclList(0);
	}

	private ImportDeclListContext importDeclList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ImportDeclListContext _localctx = new ImportDeclListContext(_ctx, _parentState);
		ImportDeclListContext _prevctx = _localctx;
		int _startState = 180;
		enterRecursionRule(_localctx, 180, RULE_importDeclList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			}
			_ctx.stop = _input.LT(-1);
			setState(775);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ImportDeclListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_importDeclList);
					setState(769);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(770);
					importDecl();
					setState(771);
					match(SEMI);
					}
					} 
				}
				setState(777);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
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

	public static class ImportDeclContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(GooParser.IMPORT, 0); }
		public ImportSpecContext importSpec() {
			return getRuleContext(ImportSpecContext.class,0);
		}
		public ImportSpecListContext importSpecList() {
			return getRuleContext(ImportSpecListContext.class,0);
		}
		public ImportDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).enterImportDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).exitImportDecl(this);
		}
	}

	public final ImportDeclContext importDecl() throws RecognitionException {
		ImportDeclContext _localctx = new ImportDeclContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_importDecl);
		try {
			setState(785);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(778);
				match(IMPORT);
				setState(779);
				importSpec();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(780);
				match(IMPORT);
				setState(781);
				match(T__0);
				setState(782);
				importSpecList(0);
				setState(783);
				match(RPAREN);
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

	public static class ImportSpecListContext extends ParserRuleContext {
		public ImportSpecListContext importSpecList() {
			return getRuleContext(ImportSpecListContext.class,0);
		}
		public ImportSpecContext importSpec() {
			return getRuleContext(ImportSpecContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(GooParser.SEMI, 0); }
		public ImportSpecListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importSpecList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).enterImportSpecList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).exitImportSpecList(this);
		}
	}

	public final ImportSpecListContext importSpecList() throws RecognitionException {
		return importSpecList(0);
	}

	private ImportSpecListContext importSpecList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ImportSpecListContext _localctx = new ImportSpecListContext(_ctx, _parentState);
		ImportSpecListContext _prevctx = _localctx;
		int _startState = 184;
		enterRecursionRule(_localctx, 184, RULE_importSpecList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			}
			_ctx.stop = _input.LT(-1);
			setState(794);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ImportSpecListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_importSpecList);
					setState(788);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(789);
					importSpec();
					setState(790);
					match(SEMI);
					}
					} 
				}
				setState(796);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
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

	public static class ImportSpecContext extends ParserRuleContext {
		public ImportPathContext importPath() {
			return getRuleContext(ImportPathContext.class,0);
		}
		public PackageNameContext packageName() {
			return getRuleContext(PackageNameContext.class,0);
		}
		public ImportSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).enterImportSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).exitImportSpec(this);
		}
	}

	public final ImportSpecContext importSpec() throws RecognitionException {
		ImportSpecContext _localctx = new ImportSpecContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_importSpec);
		try {
			setState(803);
			switch (_input.LA(1)) {
			case T__7:
				enterOuterAlt(_localctx, 1);
				{
				setState(797);
				match(T__7);
				setState(798);
				importPath();
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(799);
				packageName();
				setState(800);
				importPath();
				}
				break;
			case StringLit:
				enterOuterAlt(_localctx, 3);
				{
				setState(802);
				importPath();
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

	public static class ImportPathContext extends ParserRuleContext {
		public TerminalNode StringLit() { return getToken(GooParser.StringLit, 0); }
		public ImportPathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importPath; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).enterImportPath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).exitImportPath(this);
		}
	}

	public final ImportPathContext importPath() throws RecognitionException {
		ImportPathContext _localctx = new ImportPathContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_importPath);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(805);
			match(StringLit);
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

	public static class AnythingContext extends ParserRuleContext {
		public List<AnyTokenContext> anyToken() {
			return getRuleContexts(AnyTokenContext.class);
		}
		public AnyTokenContext anyToken(int i) {
			return getRuleContext(AnyTokenContext.class,i);
		}
		public AnythingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anything; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).enterAnything(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).exitAnything(this);
		}
	}

	public final AnythingContext anything() throws RecognitionException {
		AnythingContext _localctx = new AnythingContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_anything);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(810);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << BREAK) | (1L << CASE) | (1L << CHAN) | (1L << CONST) | (1L << CONTINUE) | (1L << DEFAULT) | (1L << DEFER) | (1L << ELSE) | (1L << FALLTHROUGH) | (1L << FOR) | (1L << FUNC) | (1L << GO) | (1L << GOTO) | (1L << IF) | (1L << IMPORT) | (1L << INTERFACE) | (1L << MAP) | (1L << PACKAGE) | (1L << RANGE) | (1L << RETURN) | (1L << SELECT) | (1L << STRUCT) | (1L << SWITCH) | (1L << TYPE) | (1L << VAR) | (1L << PLUSPLUS) | (1L << MINUSMINUS) | (1L << RPAREN) | (1L << RSQ) | (1L << RBRACE) | (1L << SEMI) | (1L << Identifier) | (1L << ImaginaryLit) | (1L << IntLit))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (FloatLit - 64)) | (1L << (StringLit - 64)) | (1L << (RuneLit - 64)) | (1L << (Whitespace - 64)) | (1L << (LineComment - 64)) | (1L << (NL - 64)) | (1L << (BlockComment - 64)) | (1L << (BlockNLComment - 64)))) != 0)) {
				{
				{
				setState(807);
				anyToken();
				}
				}
				setState(812);
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

	public static class AnyTokenContext extends ParserRuleContext {
		public TerminalNode BREAK() { return getToken(GooParser.BREAK, 0); }
		public TerminalNode CASE() { return getToken(GooParser.CASE, 0); }
		public TerminalNode CHAN() { return getToken(GooParser.CHAN, 0); }
		public TerminalNode CONST() { return getToken(GooParser.CONST, 0); }
		public TerminalNode CONTINUE() { return getToken(GooParser.CONTINUE, 0); }
		public TerminalNode DEFAULT() { return getToken(GooParser.DEFAULT, 0); }
		public TerminalNode DEFER() { return getToken(GooParser.DEFER, 0); }
		public TerminalNode ELSE() { return getToken(GooParser.ELSE, 0); }
		public TerminalNode FALLTHROUGH() { return getToken(GooParser.FALLTHROUGH, 0); }
		public TerminalNode FOR() { return getToken(GooParser.FOR, 0); }
		public TerminalNode FUNC() { return getToken(GooParser.FUNC, 0); }
		public TerminalNode GO() { return getToken(GooParser.GO, 0); }
		public TerminalNode GOTO() { return getToken(GooParser.GOTO, 0); }
		public TerminalNode IF() { return getToken(GooParser.IF, 0); }
		public TerminalNode IMPORT() { return getToken(GooParser.IMPORT, 0); }
		public TerminalNode INTERFACE() { return getToken(GooParser.INTERFACE, 0); }
		public TerminalNode MAP() { return getToken(GooParser.MAP, 0); }
		public TerminalNode PACKAGE() { return getToken(GooParser.PACKAGE, 0); }
		public TerminalNode RANGE() { return getToken(GooParser.RANGE, 0); }
		public TerminalNode RETURN() { return getToken(GooParser.RETURN, 0); }
		public TerminalNode SELECT() { return getToken(GooParser.SELECT, 0); }
		public TerminalNode STRUCT() { return getToken(GooParser.STRUCT, 0); }
		public TerminalNode SWITCH() { return getToken(GooParser.SWITCH, 0); }
		public TerminalNode TYPE() { return getToken(GooParser.TYPE, 0); }
		public TerminalNode VAR() { return getToken(GooParser.VAR, 0); }
		public TerminalNode PLUSPLUS() { return getToken(GooParser.PLUSPLUS, 0); }
		public TerminalNode MINUSMINUS() { return getToken(GooParser.MINUSMINUS, 0); }
		public TerminalNode RPAREN() { return getToken(GooParser.RPAREN, 0); }
		public TerminalNode RSQ() { return getToken(GooParser.RSQ, 0); }
		public TerminalNode RBRACE() { return getToken(GooParser.RBRACE, 0); }
		public TerminalNode SEMI() { return getToken(GooParser.SEMI, 0); }
		public TerminalNode Identifier() { return getToken(GooParser.Identifier, 0); }
		public TerminalNode ImaginaryLit() { return getToken(GooParser.ImaginaryLit, 0); }
		public TerminalNode IntLit() { return getToken(GooParser.IntLit, 0); }
		public TerminalNode FloatLit() { return getToken(GooParser.FloatLit, 0); }
		public TerminalNode StringLit() { return getToken(GooParser.StringLit, 0); }
		public TerminalNode RuneLit() { return getToken(GooParser.RuneLit, 0); }
		public TerminalNode Whitespace() { return getToken(GooParser.Whitespace, 0); }
		public TerminalNode LineComment() { return getToken(GooParser.LineComment, 0); }
		public TerminalNode NL() { return getToken(GooParser.NL, 0); }
		public TerminalNode BlockComment() { return getToken(GooParser.BlockComment, 0); }
		public TerminalNode BlockNLComment() { return getToken(GooParser.BlockNLComment, 0); }
		public AnyTokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anyToken; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).enterAnyToken(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).exitAnyToken(this);
		}
	}

	public final AnyTokenContext anyToken() throws RecognitionException {
		AnyTokenContext _localctx = new AnyTokenContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_anyToken);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(813);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << BREAK) | (1L << CASE) | (1L << CHAN) | (1L << CONST) | (1L << CONTINUE) | (1L << DEFAULT) | (1L << DEFER) | (1L << ELSE) | (1L << FALLTHROUGH) | (1L << FOR) | (1L << FUNC) | (1L << GO) | (1L << GOTO) | (1L << IF) | (1L << IMPORT) | (1L << INTERFACE) | (1L << MAP) | (1L << PACKAGE) | (1L << RANGE) | (1L << RETURN) | (1L << SELECT) | (1L << STRUCT) | (1L << SWITCH) | (1L << TYPE) | (1L << VAR) | (1L << PLUSPLUS) | (1L << MINUSMINUS) | (1L << RPAREN) | (1L << RSQ) | (1L << RBRACE) | (1L << SEMI) | (1L << Identifier) | (1L << ImaginaryLit) | (1L << IntLit))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (FloatLit - 64)) | (1L << (StringLit - 64)) | (1L << (RuneLit - 64)) | (1L << (Whitespace - 64)) | (1L << (LineComment - 64)) | (1L << (NL - 64)) | (1L << (BlockComment - 64)) | (1L << (BlockNLComment - 64)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
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
			return fieldDeclList_sempred((FieldDeclListContext)_localctx, predIndex);
		case 15:
			return parameterList_sempred((ParameterListContext)_localctx, predIndex);
		case 19:
			return statementList_sempred((StatementListContext)_localctx, predIndex);
		case 21:
			return topLevelDeclList_sempred((TopLevelDeclListContext)_localctx, predIndex);
		case 24:
			return constSpecList_sempred((ConstSpecListContext)_localctx, predIndex);
		case 26:
			return identifierList_sempred((IdentifierListContext)_localctx, predIndex);
		case 27:
			return expressionList_sempred((ExpressionListContext)_localctx, predIndex);
		case 29:
			return typeSpecList_sempred((TypeSpecListContext)_localctx, predIndex);
		case 32:
			return varSpecList_sempred((VarSpecListContext)_localctx, predIndex);
		case 48:
			return elementList_sempred((ElementListContext)_localctx, predIndex);
		case 53:
			return primaryExpr_sempred((PrimaryExprContext)_localctx, predIndex);
		case 59:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 90:
			return importDeclList_sempred((ImportDeclListContext)_localctx, predIndex);
		case 92:
			return importSpecList_sempred((ImportSpecListContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean fieldDeclList_sempred(FieldDeclListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean parameterList_sempred(ParameterListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean statementList_sempred(StatementListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean topLevelDeclList_sempred(TopLevelDeclListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean constSpecList_sempred(ConstSpecListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean identifierList_sempred(IdentifierListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean expressionList_sempred(ExpressionListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean typeSpecList_sempred(TypeSpecListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean varSpecList_sempred(VarSpecListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean elementList_sempred(ElementListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 9:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean primaryExpr_sempred(PrimaryExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 10:
			return precpred(_ctx, 5);
		case 11:
			return precpred(_ctx, 4);
		case 12:
			return precpred(_ctx, 3);
		case 13:
			return precpred(_ctx, 2);
		case 14:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 15:
			return precpred(_ctx, 5);
		case 16:
			return precpred(_ctx, 4);
		case 17:
			return precpred(_ctx, 3);
		case 18:
			return precpred(_ctx, 2);
		case 19:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean importDeclList_sempred(ImportDeclListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 20:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean importSpecList_sempred(ImportSpecListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 21:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3I\u0332\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\3\2\3\2\3\2\3\2\3\2\3\2\5\2\u00cb\n\2\3\3\3\3\5\3\u00cf"+
		"\n\3\3\4\3\4\3\4\3\4\5\4\u00d5\n\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\7\3\7"+
		"\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\7\n\u00ee\n\n"+
		"\f\n\16\n\u00f1\13\n\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\16\3\16\5\16"+
		"\u00fd\n\16\3\17\3\17\5\17\u0101\n\17\3\20\3\20\3\20\5\20\u0106\n\20\5"+
		"\20\u0108\n\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u0112\n\21"+
		"\f\21\16\21\u0115\13\21\3\22\5\22\u0118\n\22\3\22\3\22\3\23\3\23\3\24"+
		"\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\7\25\u0127\n\25\f\25\16\25\u012a"+
		"\13\25\3\26\3\26\3\26\5\26\u012f\n\26\3\27\3\27\3\27\3\27\3\27\7\27\u0136"+
		"\n\27\f\27\16\27\u0139\13\27\3\30\3\30\5\30\u013d\n\30\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\5\31\u0146\n\31\3\32\3\32\3\32\3\32\3\32\7\32\u014d"+
		"\n\32\f\32\16\32\u0150\13\32\3\33\3\33\5\33\u0154\n\33\3\33\3\33\5\33"+
		"\u0158\n\33\3\34\3\34\3\34\3\34\3\34\3\34\7\34\u0160\n\34\f\34\16\34\u0163"+
		"\13\34\3\35\3\35\3\35\3\35\3\35\3\35\7\35\u016b\n\35\f\35\16\35\u016e"+
		"\13\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u0177\n\36\3\37\3\37\3"+
		"\37\3\37\3\37\7\37\u017e\n\37\f\37\16\37\u0181\13\37\3 \3 \3 \3!\3!\3"+
		"!\3!\3!\3!\3!\5!\u018d\n!\3\"\3\"\3\"\3\"\3\"\7\"\u0194\n\"\f\"\16\"\u0197"+
		"\13\"\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\5$\u01a3\n$\3%\3%\3%\3%\3&\3&\3&\3"+
		"&\3&\3&\3&\3&\5&\u01b1\n&\3\'\3\'\3(\3(\3(\3)\3)\3*\3*\3*\3*\3*\3*\5*"+
		"\u01c0\n*\3+\3+\5+\u01c4\n+\3,\3,\3-\3-\5-\u01ca\n-\3.\3.\3.\3.\3/\3/"+
		"\3/\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\5\60\u01db\n\60\3\61\3\61"+
		"\3\61\3\61\3\61\5\61\u01e2\n\61\3\61\3\61\5\61\u01e6\n\61\3\62\3\62\3"+
		"\62\3\62\3\62\3\62\7\62\u01ee\n\62\f\62\16\62\u01f1\13\62\3\63\3\63\3"+
		"\63\3\63\3\63\5\63\u01f8\n\63\3\64\3\64\3\64\5\64\u01fd\n\64\3\65\3\65"+
		"\3\66\3\66\5\66\u0203\n\66\3\67\3\67\3\67\5\67\u0208\n\67\3\67\3\67\3"+
		"\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\7\67\u0214\n\67\f\67\16\67\u0217"+
		"\13\67\38\38\38\39\39\39\39\3:\3:\5:\u0222\n:\3:\3:\5:\u0226\n:\3:\3:"+
		"\3:\5:\u022b\n:\3:\3:\3:\3:\3:\3:\5:\u0233\n:\3;\3;\3;\3;\3;\3<\3<\3<"+
		"\3<\3<\5<\u023f\n<\3<\3<\3<\3<\3<\5<\u0246\n<\3<\3<\3<\3<\3<\3<\3<\5<"+
		"\u024f\n<\3<\3<\5<\u0253\n<\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3="+
		"\3=\3=\3=\3=\3=\3=\3=\7=\u026a\n=\f=\16=\u026d\13=\3>\3>\3>\3>\5>\u0273"+
		"\n>\3?\3?\3@\3@\3A\3A\3B\3B\3C\3C\3C\3C\5C\u0281\nC\3C\3C\3D\3D\3D\3D"+
		"\3D\3D\3D\3D\3D\3D\3D\5D\u0290\nD\3E\3E\3E\3E\3E\5E\u0297\nE\3F\3F\3G"+
		"\3G\3G\3G\3H\3H\3I\3I\3J\3J\3J\3K\3K\3K\3K\3L\3L\5L\u02ac\nL\3L\3L\3M"+
		"\3M\3M\3M\5M\u02b4\nM\3M\3M\3M\3M\3M\5M\u02bb\nM\5M\u02bd\nM\3N\3N\3N"+
		"\3N\3N\3N\3N\3N\3N\3N\3N\3N\5N\u02cb\nN\3O\3O\3P\3P\3P\5P\u02d2\nP\3P"+
		"\3P\3P\3Q\3Q\3R\3R\3S\3S\3S\3S\3S\3S\3S\3S\3S\3S\5S\u02e5\nS\3T\3T\3T"+
		"\3U\3U\5U\u02ec\nU\3V\3V\5V\u02f0\nV\3W\3W\5W\u02f4\nW\3X\3X\3X\3Y\3Y"+
		"\3Y\3Y\3Y\3Z\3Z\3Z\3[\3[\3\\\3\\\3\\\3\\\3\\\7\\\u0308\n\\\f\\\16\\\u030b"+
		"\13\\\3]\3]\3]\3]\3]\3]\3]\5]\u0314\n]\3^\3^\3^\3^\3^\7^\u031b\n^\f^\16"+
		"^\u031e\13^\3_\3_\3_\3_\3_\3_\5_\u0326\n_\3`\3`\3a\7a\u032b\na\fa\16a"+
		"\u032e\13a\3b\3b\3b\2\20\22 (,\62\668<Bblx\u00b6\u00bac\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bd"+
		"fhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092"+
		"\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa"+
		"\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2"+
		"\2\t\3\2AD\3\2\17\24\3\2\25\30\4\2\6\6\31\36\7\2\6\6\25\26\30\30\35\35"+
		"\37\37\3\29:\3\2\3I\u0335\2\u00ca\3\2\2\2\4\u00ce\3\2\2\2\6\u00d4\3\2"+
		"\2\2\b\u00d6\3\2\2\2\n\u00db\3\2\2\2\f\u00dd\3\2\2\2\16\u00df\3\2\2\2"+
		"\20\u00e3\3\2\2\2\22\u00e8\3\2\2\2\24\u00f2\3\2\2\2\26\u00f5\3\2\2\2\30"+
		"\u00f8\3\2\2\2\32\u00fa\3\2\2\2\34\u0100\3\2\2\2\36\u0102\3\2\2\2 \u010b"+
		"\3\2\2\2\"\u0117\3\2\2\2$\u011b\3\2\2\2&\u011d\3\2\2\2(\u0121\3\2\2\2"+
		"*\u012e\3\2\2\2,\u0130\3\2\2\2.\u013c\3\2\2\2\60\u0145\3\2\2\2\62\u0147"+
		"\3\2\2\2\64\u0151\3\2\2\2\66\u0159\3\2\2\28\u0164\3\2\2\2:\u0176\3\2\2"+
		"\2<\u0178\3\2\2\2>\u0182\3\2\2\2@\u018c\3\2\2\2B\u018e\3\2\2\2D\u0198"+
		"\3\2\2\2F\u01a2\3\2\2\2H\u01a4\3\2\2\2J\u01b0\3\2\2\2L\u01b2\3\2\2\2N"+
		"\u01b4\3\2\2\2P\u01b7\3\2\2\2R\u01bf\3\2\2\2T\u01c3\3\2\2\2V\u01c5\3\2"+
		"\2\2X\u01c9\3\2\2\2Z\u01cb\3\2\2\2\\\u01cf\3\2\2\2^\u01da\3\2\2\2`\u01e5"+
		"\3\2\2\2b\u01e7\3\2\2\2d\u01f7\3\2\2\2f\u01fc\3\2\2\2h\u01fe\3\2\2\2j"+
		"\u0202\3\2\2\2l\u0207\3\2\2\2n\u0218\3\2\2\2p\u021b\3\2\2\2r\u0232\3\2"+
		"\2\2t\u0234\3\2\2\2v\u0252\3\2\2\2x\u0254\3\2\2\2z\u0272\3\2\2\2|\u0274"+
		"\3\2\2\2~\u0276\3\2\2\2\u0080\u0278\3\2\2\2\u0082\u027a\3\2\2\2\u0084"+
		"\u027c\3\2\2\2\u0086\u028f\3\2\2\2\u0088\u0296\3\2\2\2\u008a\u0298\3\2"+
		"\2\2\u008c\u029a\3\2\2\2\u008e\u029e\3\2\2\2\u0090\u02a0\3\2\2\2\u0092"+
		"\u02a2\3\2\2\2\u0094\u02a5\3\2\2\2\u0096\u02ab\3\2\2\2\u0098\u02af\3\2"+
		"\2\2\u009a\u02ca\3\2\2\2\u009c\u02cc\3\2\2\2\u009e\u02ce\3\2\2\2\u00a0"+
		"\u02d6\3\2\2\2\u00a2\u02d8\3\2\2\2\u00a4\u02e4\3\2\2\2\u00a6\u02e6\3\2"+
		"\2\2\u00a8\u02e9\3\2\2\2\u00aa\u02ed\3\2\2\2\u00ac\u02f1\3\2\2\2\u00ae"+
		"\u02f5\3\2\2\2\u00b0\u02f8\3\2\2\2\u00b2\u02fd\3\2\2\2\u00b4\u0300\3\2"+
		"\2\2\u00b6\u0302\3\2\2\2\u00b8\u0313\3\2\2\2\u00ba\u0315\3\2\2\2\u00bc"+
		"\u0325\3\2\2\2\u00be\u0327\3\2\2\2\u00c0\u032c\3\2\2\2\u00c2\u032f\3\2"+
		"\2\2\u00c4\u00cb\5\4\3\2\u00c5\u00cb\5\6\4\2\u00c6\u00c7\7\3\2\2\u00c7"+
		"\u00c8\5\2\2\2\u00c8\u00c9\7;\2\2\u00c9\u00cb\3\2\2\2\u00ca\u00c4\3\2"+
		"\2\2\u00ca\u00c5\3\2\2\2\u00ca\u00c6\3\2\2\2\u00cb\3\3\2\2\2\u00cc\u00cf"+
		"\7?\2\2\u00cd\u00cf\5Z.\2\u00ce\u00cc\3\2\2\2\u00ce\u00cd\3\2\2\2\u00cf"+
		"\5\3\2\2\2\u00d0\u00d5\5\b\5\2\u00d1\u00d5\5\20\t\2\u00d2\u00d5\5\26\f"+
		"\2\u00d3\u00d5\5\16\b\2\u00d4\u00d0\3\2\2\2\u00d4\u00d1\3\2\2\2\u00d4"+
		"\u00d2\3\2\2\2\u00d4\u00d3\3\2\2\2\u00d5\7\3\2\2\2\u00d6\u00d7\7\4\2\2"+
		"\u00d7\u00d8\5\n\6\2\u00d8\u00d9\7<\2\2\u00d9\u00da\5\f\7\2\u00da\t\3"+
		"\2\2\2\u00db\u00dc\5x=\2\u00dc\13\3\2\2\2\u00dd\u00de\5\2\2\2\u00de\r"+
		"\3\2\2\2\u00df\u00e0\7\4\2\2\u00e0\u00e1\7<\2\2\u00e1\u00e2\5\f\7\2\u00e2"+
		"\17\3\2\2\2\u00e3\u00e4\7\65\2\2\u00e4\u00e5\7\5\2\2\u00e5\u00e6\5\22"+
		"\n\2\u00e6\u00e7\7=\2\2\u00e7\21\3\2\2\2\u00e8\u00ef\b\n\1\2\u00e9\u00ea"+
		"\f\3\2\2\u00ea\u00eb\5\24\13\2\u00eb\u00ec\7>\2\2\u00ec\u00ee\3\2\2\2"+
		"\u00ed\u00e9\3\2\2\2\u00ee\u00f1\3\2\2\2\u00ef\u00ed\3\2\2\2\u00ef\u00f0"+
		"\3\2\2\2\u00f0\23\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f2\u00f3\5\66\34\2\u00f3"+
		"\u00f4\5\2\2\2\u00f4\25\3\2\2\2\u00f5\u00f6\7\6\2\2\u00f6\u00f7\5\30\r"+
		"\2\u00f7\27\3\2\2\2\u00f8\u00f9\5\2\2\2\u00f9\31\3\2\2\2\u00fa\u00fc\5"+
		"\36\20\2\u00fb\u00fd\5\34\17\2\u00fc\u00fb\3\2\2\2\u00fc\u00fd\3\2\2\2"+
		"\u00fd\33\3\2\2\2\u00fe\u0101\5\36\20\2\u00ff\u0101\5\2\2\2\u0100\u00fe"+
		"\3\2\2\2\u0100\u00ff\3\2\2\2\u0101\35\3\2\2\2\u0102\u0107\7\3\2\2\u0103"+
		"\u0105\5 \21\2\u0104\u0106\7\7\2\2\u0105\u0104\3\2\2\2\u0105\u0106\3\2"+
		"\2\2\u0106\u0108\3\2\2\2\u0107\u0103\3\2\2\2\u0107\u0108\3\2\2\2\u0108"+
		"\u0109\3\2\2\2\u0109\u010a\7;\2\2\u010a\37\3\2\2\2\u010b\u010c\b\21\1"+
		"\2\u010c\u010d\5\"\22\2\u010d\u0113\3\2\2\2\u010e\u010f\f\3\2\2\u010f"+
		"\u0110\7\7\2\2\u0110\u0112\5\"\22\2\u0111\u010e\3\2\2\2\u0112\u0115\3"+
		"\2\2\2\u0113\u0111\3\2\2\2\u0113\u0114\3\2\2\2\u0114!\3\2\2\2\u0115\u0113"+
		"\3\2\2\2\u0116\u0118\5\66\34\2\u0117\u0116\3\2\2\2\u0117\u0118\3\2\2\2"+
		"\u0118\u0119\3\2\2\2\u0119\u011a\5\2\2\2\u011a#\3\2\2\2\u011b\u011c\7"+
		"?\2\2\u011c%\3\2\2\2\u011d\u011e\7\5\2\2\u011e\u011f\5(\25\2\u011f\u0120"+
		"\7=\2\2\u0120\'\3\2\2\2\u0121\u0128\b\25\1\2\u0122\u0123\f\3\2\2\u0123"+
		"\u0124\5\u0086D\2\u0124\u0125\7>\2\2\u0125\u0127\3\2\2\2\u0126\u0122\3"+
		"\2\2\2\u0127\u012a\3\2\2\2\u0128\u0126\3\2\2\2\u0128\u0129\3\2\2\2\u0129"+
		")\3\2\2\2\u012a\u0128\3\2\2\2\u012b\u012f\5\60\31\2\u012c\u012f\5:\36"+
		"\2\u012d\u012f\5@!\2\u012e\u012b\3\2\2\2\u012e\u012c\3\2\2\2\u012e\u012d"+
		"\3\2\2\2\u012f+\3\2\2\2\u0130\u0137\b\27\1\2\u0131\u0132\f\3\2\2\u0132"+
		"\u0133\5.\30\2\u0133\u0134\7>\2\2\u0134\u0136\3\2\2\2\u0135\u0131\3\2"+
		"\2\2\u0136\u0139\3\2\2\2\u0137\u0135\3\2\2\2\u0137\u0138\3\2\2\2\u0138"+
		"-\3\2\2\2\u0139\u0137\3\2\2\2\u013a\u013d\5*\26\2\u013b\u013d\5J&\2\u013c"+
		"\u013a\3\2\2\2\u013c\u013b\3\2\2\2\u013d/\3\2\2\2\u013e\u013f\7#\2\2\u013f"+
		"\u0146\5\64\33\2\u0140\u0141\7#\2\2\u0141\u0142\7\3\2\2\u0142\u0143\5"+
		"\62\32\2\u0143\u0144\7;\2\2\u0144\u0146\3\2\2\2\u0145\u013e\3\2\2\2\u0145"+
		"\u0140\3\2\2\2\u0146\61\3\2\2\2\u0147\u014e\b\32\1\2\u0148\u0149\f\3\2"+
		"\2\u0149\u014a\5\64\33\2\u014a\u014b\7>\2\2\u014b\u014d\3\2\2\2\u014c"+
		"\u0148\3\2\2\2\u014d\u0150\3\2\2\2\u014e\u014c\3\2\2\2\u014e\u014f\3\2"+
		"\2\2\u014f\63\3\2\2\2\u0150\u014e\3\2\2\2\u0151\u0157\5\66\34\2\u0152"+
		"\u0154\5\2\2\2\u0153\u0152\3\2\2\2\u0153\u0154\3\2\2\2\u0154\u0155\3\2"+
		"\2\2\u0155\u0156\7\b\2\2\u0156\u0158\58\35\2\u0157\u0153\3\2\2\2\u0157"+
		"\u0158\3\2\2\2\u0158\65\3\2\2\2\u0159\u015a\b\34\1\2\u015a\u015b\7?\2"+
		"\2\u015b\u0161\3\2\2\2\u015c\u015d\f\3\2\2\u015d\u015e\7\7\2\2\u015e\u0160"+
		"\7?\2\2\u015f\u015c\3\2\2\2\u0160\u0163\3\2\2\2\u0161\u015f\3\2\2\2\u0161"+
		"\u0162\3\2\2\2\u0162\67\3\2\2\2\u0163\u0161\3\2\2\2\u0164\u0165\b\35\1"+
		"\2\u0165\u0166\5x=\2\u0166\u016c\3\2\2\2\u0167\u0168\f\3\2\2\u0168\u0169"+
		"\7\7\2\2\u0169\u016b\5x=\2\u016a\u0167\3\2\2\2\u016b\u016e\3\2\2\2\u016c"+
		"\u016a\3\2\2\2\u016c\u016d\3\2\2\2\u016d9\3\2\2\2\u016e\u016c\3\2\2\2"+
		"\u016f\u0170\7\67\2\2\u0170\u0177\5> \2\u0171\u0172\7\67\2\2\u0172\u0173"+
		"\7\3\2\2\u0173\u0174\5<\37\2\u0174\u0175\7;\2\2\u0175\u0177\3\2\2\2\u0176"+
		"\u016f\3\2\2\2\u0176\u0171\3\2\2\2\u0177;\3\2\2\2\u0178\u017f\b\37\1\2"+
		"\u0179\u017a\f\3\2\2\u017a\u017b\5> \2\u017b\u017c\7>\2\2\u017c\u017e"+
		"\3\2\2\2\u017d\u0179\3\2\2\2\u017e\u0181\3\2\2\2\u017f\u017d\3\2\2\2\u017f"+
		"\u0180\3\2\2\2\u0180=\3\2\2\2\u0181\u017f\3\2\2\2\u0182\u0183\7?\2\2\u0183"+
		"\u0184\5\2\2\2\u0184?\3\2\2\2\u0185\u0186\78\2\2\u0186\u018d\5D#\2\u0187"+
		"\u0188\78\2\2\u0188\u0189\7\3\2\2\u0189\u018a\5B\"\2\u018a\u018b\7;\2"+
		"\2\u018b\u018d\3\2\2\2\u018c\u0185\3\2\2\2\u018c\u0187\3\2\2\2\u018dA"+
		"\3\2\2\2\u018e\u0195\b\"\1\2\u018f\u0190\f\3\2\2\u0190\u0191\5D#\2\u0191"+
		"\u0192\7>\2\2\u0192\u0194\3\2\2\2\u0193\u018f\3\2\2\2\u0194\u0197\3\2"+
		"\2\2\u0195\u0193\3\2\2\2\u0195\u0196\3\2\2\2\u0196C\3\2\2\2\u0197\u0195"+
		"\3\2\2\2\u0198\u0199\5\66\34\2\u0199\u019a\5F$\2\u019aE\3\2\2\2\u019b"+
		"\u01a3\5\2\2\2\u019c\u019d\5\2\2\2\u019d\u019e\7\b\2\2\u019e\u019f\58"+
		"\35\2\u019f\u01a3\3\2\2\2\u01a0\u01a1\7\b\2\2\u01a1\u01a3\58\35\2\u01a2"+
		"\u019b\3\2\2\2\u01a2\u019c\3\2\2\2\u01a2\u01a0\3\2\2\2\u01a3G\3\2\2\2"+
		"\u01a4\u01a5\5\66\34\2\u01a5\u01a6\7\t\2\2\u01a6\u01a7\58\35\2\u01a7I"+
		"\3\2\2\2\u01a8\u01a9\7*\2\2\u01a9\u01aa\5L\'\2\u01aa\u01ab\5N(\2\u01ab"+
		"\u01b1\3\2\2\2\u01ac\u01ad\7*\2\2\u01ad\u01ae\5L\'\2\u01ae\u01af\5\32"+
		"\16\2\u01af\u01b1\3\2\2\2\u01b0\u01a8\3\2\2\2\u01b0\u01ac\3\2\2\2\u01b1"+
		"K\3\2\2\2\u01b2\u01b3\7?\2\2\u01b3M\3\2\2\2\u01b4\u01b5\5\32\16\2\u01b5"+
		"\u01b6\5P)\2\u01b6O\3\2\2\2\u01b7\u01b8\5&\24\2\u01b8Q\3\2\2\2\u01b9\u01c0"+
		"\5T+\2\u01ba\u01c0\5X-\2\u01bb\u01bc\7\3\2\2\u01bc\u01bd\5x=\2\u01bd\u01be"+
		"\7;\2\2\u01be\u01c0\3\2\2\2\u01bf\u01b9\3\2\2\2\u01bf\u01ba\3\2\2\2\u01bf"+
		"\u01bb\3\2\2\2\u01c0S\3\2\2\2\u01c1\u01c4\5V,\2\u01c2\u01c4\5\\/\2\u01c3"+
		"\u01c1\3\2\2\2\u01c3\u01c2\3\2\2\2\u01c4U\3\2\2\2\u01c5\u01c6\t\2\2\2"+
		"\u01c6W\3\2\2\2\u01c7\u01ca\7?\2\2\u01c8\u01ca\5Z.\2\u01c9\u01c7\3\2\2"+
		"\2\u01c9\u01c8\3\2\2\2\u01caY\3\2\2\2\u01cb\u01cc\5\u00b4[\2\u01cc\u01cd"+
		"\7\n\2\2\u01cd\u01ce\7?\2\2\u01ce[\3\2\2\2\u01cf\u01d0\5^\60\2\u01d0\u01d1"+
		"\5`\61\2\u01d1]\3\2\2\2\u01d2\u01db\5\20\t\2\u01d3\u01db\5\b\5\2\u01d4"+
		"\u01d5\7\4\2\2\u01d5\u01d6\7\13\2\2\u01d6\u01d7\7<\2\2\u01d7\u01db\5\f"+
		"\7\2\u01d8\u01db\5\16\b\2\u01d9\u01db\5\4\3\2\u01da\u01d2\3\2\2\2\u01da"+
		"\u01d3\3\2\2\2\u01da\u01d4\3\2\2\2\u01da\u01d8\3\2\2\2\u01da\u01d9\3\2"+
		"\2\2\u01db_\3\2\2\2\u01dc\u01dd\7\5\2\2\u01dd\u01e6\7=\2\2\u01de\u01df"+
		"\7\5\2\2\u01df\u01e1\5b\62\2\u01e0\u01e2\7\7\2\2\u01e1\u01e0\3\2\2\2\u01e1"+
		"\u01e2\3\2\2\2\u01e2\u01e3\3\2\2\2\u01e3\u01e4\7=\2\2\u01e4\u01e6\3\2"+
		"\2\2\u01e5\u01dc\3\2\2\2\u01e5\u01de\3\2\2\2\u01e6a\3\2\2\2\u01e7\u01e8"+
		"\b\62\1\2\u01e8\u01e9\5d\63\2\u01e9\u01ef\3\2\2\2\u01ea\u01eb\f\3\2\2"+
		"\u01eb\u01ec\7\7\2\2\u01ec\u01ee\5d\63\2\u01ed\u01ea\3\2\2\2\u01ee\u01f1"+
		"\3\2\2\2\u01ef\u01ed\3\2\2\2\u01ef\u01f0\3\2\2\2\u01f0c\3\2\2\2\u01f1"+
		"\u01ef\3\2\2\2\u01f2\u01f8\5j\66\2\u01f3\u01f4\5f\64\2\u01f4\u01f5\7\f"+
		"\2\2\u01f5\u01f6\5j\66\2\u01f6\u01f8\3\2\2\2\u01f7\u01f2\3\2\2\2\u01f7"+
		"\u01f3\3\2\2\2\u01f8e\3\2\2\2\u01f9\u01fd\5h\65\2\u01fa\u01fd\5x=\2\u01fb"+
		"\u01fd\5`\61\2\u01fc\u01f9\3\2\2\2\u01fc\u01fa\3\2\2\2\u01fc\u01fb\3\2"+
		"\2\2\u01fdg\3\2\2\2\u01fe\u01ff\7?\2\2\u01ffi\3\2\2\2\u0200\u0203\5x="+
		"\2\u0201\u0203\5`\61\2\u0202\u0200\3\2\2\2\u0202\u0201\3\2\2\2\u0203k"+
		"\3\2\2\2\u0204\u0205\b\67\1\2\u0205\u0208\5R*\2\u0206\u0208\5\u0084C\2"+
		"\u0207\u0204\3\2\2\2\u0207\u0206\3\2\2\2\u0208\u0215\3\2\2\2\u0209\u020a"+
		"\f\7\2\2\u020a\u0214\5n8\2\u020b\u020c\f\6\2\2\u020c\u0214\5p9\2\u020d"+
		"\u020e\f\5\2\2\u020e\u0214\5r:\2\u020f\u0210\f\4\2\2\u0210\u0214\5t;\2"+
		"\u0211\u0212\f\3\2\2\u0212\u0214\5v<\2\u0213\u0209\3\2\2\2\u0213\u020b"+
		"\3\2\2\2\u0213\u020d\3\2\2\2\u0213\u020f\3\2\2\2\u0213\u0211\3\2\2\2\u0214"+
		"\u0217\3\2\2\2\u0215\u0213\3\2\2\2\u0215\u0216\3\2\2\2\u0216m\3\2\2\2"+
		"\u0217\u0215\3\2\2\2\u0218\u0219\7\n\2\2\u0219\u021a\7?\2\2\u021ao\3\2"+
		"\2\2\u021b\u021c\7\4\2\2\u021c\u021d\5x=\2\u021d\u021e\7<\2\2\u021eq\3"+
		"\2\2\2\u021f\u0221\7\4\2\2\u0220\u0222\5x=\2\u0221\u0220\3\2\2\2\u0221"+
		"\u0222\3\2\2\2\u0222\u0223\3\2\2\2\u0223\u0225\7\f\2\2\u0224\u0226\5x"+
		"=\2\u0225\u0224\3\2\2\2\u0225\u0226\3\2\2\2\u0226\u0227\3\2\2\2\u0227"+
		"\u0233\7<\2\2\u0228\u022a\7\4\2\2\u0229\u022b\5x=\2\u022a\u0229\3\2\2"+
		"\2\u022a\u022b\3\2\2\2\u022b\u022c\3\2\2\2\u022c\u022d\7\f\2\2\u022d\u022e"+
		"\5x=\2\u022e\u022f\7\f\2\2\u022f\u0230\5x=\2\u0230\u0231\7<\2\2\u0231"+
		"\u0233\3\2\2\2\u0232\u021f\3\2\2\2\u0232\u0228\3\2\2\2\u0233s\3\2\2\2"+
		"\u0234\u0235\7\n\2\2\u0235\u0236\7\3\2\2\u0236\u0237\5\2\2\2\u0237\u0238"+
		"\7;\2\2\u0238u\3\2\2\2\u0239\u023a\7\3\2\2\u023a\u0253\7;\2\2\u023b\u023c"+
		"\7\3\2\2\u023c\u023e\58\35\2\u023d\u023f\7\7\2\2\u023e\u023d\3\2\2\2\u023e"+
		"\u023f\3\2\2\2\u023f\u0240\3\2\2\2\u0240\u0241\7;\2\2\u0241\u0253\3\2"+
		"\2\2\u0242\u0243\7\3\2\2\u0243\u0245\5\2\2\2\u0244\u0246\7\7\2\2\u0245"+
		"\u0244\3\2\2\2\u0245\u0246\3\2\2\2\u0246\u0247\3\2\2\2\u0247\u0248\7;"+
		"\2\2\u0248\u0253\3\2\2\2\u0249\u024a\7\3\2\2\u024a\u024b\5\2\2\2\u024b"+
		"\u024c\7\7\2\2\u024c\u024e\58\35\2\u024d\u024f\7\7\2\2\u024e\u024d\3\2"+
		"\2\2\u024e\u024f\3\2\2\2\u024f\u0250\3\2\2\2\u0250\u0251\7;\2\2\u0251"+
		"\u0253\3\2\2\2\u0252\u0239\3\2\2\2\u0252\u023b\3\2\2\2\u0252\u0242\3\2"+
		"\2\2\u0252\u0249\3\2\2\2\u0253w\3\2\2\2\u0254\u0255\b=\1\2\u0255\u0256"+
		"\5z>\2\u0256\u026b\3\2\2\2\u0257\u0258\f\7\2\2\u0258\u0259\5\u0080A\2"+
		"\u0259\u025a\5x=\b\u025a\u026a\3\2\2\2\u025b\u025c\f\6\2\2\u025c\u025d"+
		"\5~@\2\u025d\u025e\5x=\7\u025e\u026a\3\2\2\2\u025f\u0260\f\5\2\2\u0260"+
		"\u0261\5|?\2\u0261\u0262\5x=\6\u0262\u026a\3\2\2\2\u0263\u0264\f\4\2\2"+
		"\u0264\u0265\7\r\2\2\u0265\u026a\5x=\5\u0266\u0267\f\3\2\2\u0267\u0268"+
		"\7\16\2\2\u0268\u026a\5x=\4\u0269\u0257\3\2\2\2\u0269\u025b\3\2\2\2\u0269"+
		"\u025f\3\2\2\2\u0269\u0263\3\2\2\2\u0269\u0266\3\2\2\2\u026a\u026d\3\2"+
		"\2\2\u026b\u0269\3\2\2\2\u026b\u026c\3\2\2\2\u026cy\3\2\2\2\u026d\u026b"+
		"\3\2\2\2\u026e\u0273\5l\67\2\u026f\u0270\5\u0082B\2\u0270\u0271\5z>\2"+
		"\u0271\u0273\3\2\2\2\u0272\u026e\3\2\2\2\u0272\u026f\3\2\2\2\u0273{\3"+
		"\2\2\2\u0274\u0275\t\3\2\2\u0275}\3\2\2\2\u0276\u0277\t\4\2\2\u0277\177"+
		"\3\2\2\2\u0278\u0279\t\5\2\2\u0279\u0081\3\2\2\2\u027a\u027b\t\6\2\2\u027b"+
		"\u0083\3\2\2\2\u027c\u027d\5\2\2\2\u027d\u027e\7\3\2\2\u027e\u0280\5x"+
		"=\2\u027f\u0281\7\7\2\2\u0280\u027f\3\2\2\2\u0280\u0281\3\2\2\2\u0281"+
		"\u0282\3\2\2\2\u0282\u0283\7;\2\2\u0283\u0085\3\2\2\2\u0284\u0290\5*\26"+
		"\2\u0285\u0290\5\u008cG\2\u0286\u0290\5\u0088E\2\u0287\u0290\5\u00a6T"+
		"\2\u0288\u0290\5\u00a8U\2\u0289\u0290\5\u00aaV\2\u028a\u0290\5\u00acW"+
		"\2\u028b\u0290\5\u00aeX\2\u028c\u0290\5&\24\2\u028d\u0290\5\u0098M\2\u028e"+
		"\u0290\5\u009aN\2\u028f\u0284\3\2\2\2\u028f\u0285\3\2\2\2\u028f\u0286"+
		"\3\2\2\2\u028f\u0287\3\2\2\2\u028f\u0288\3\2\2\2\u028f\u0289\3\2\2\2\u028f"+
		"\u028a\3\2\2\2\u028f\u028b\3\2\2\2\u028f\u028c\3\2\2\2\u028f\u028d\3\2"+
		"\2\2\u028f\u028e\3\2\2\2\u0290\u0087\3\2\2\2\u0291\u0297\5\u008aF\2\u0292"+
		"\u0297\5\u0090I\2\u0293\u0297\5\u0092J\2\u0294\u0297\5\u0094K\2\u0295"+
		"\u0297\5H%\2\u0296\u0291\3\2\2\2\u0296\u0292\3\2\2\2\u0296\u0293\3\2\2"+
		"\2\u0296\u0294\3\2\2\2\u0296\u0295\3\2\2\2\u0297\u0089\3\2\2\2\u0298\u0299"+
		"\3\2\2\2\u0299\u008b\3\2\2\2\u029a\u029b\5\u008eH\2\u029b\u029c\7\f\2"+
		"\2\u029c\u029d\5\u0086D\2\u029d\u008d\3\2\2\2\u029e\u029f\7?\2\2\u029f"+
		"\u008f\3\2\2\2\u02a0\u02a1\5x=\2\u02a1\u0091\3\2\2\2\u02a2\u02a3\5x=\2"+
		"\u02a3\u02a4\t\7\2\2\u02a4\u0093\3\2\2\2\u02a5\u02a6\58\35\2\u02a6\u02a7"+
		"\5\u0096L\2\u02a7\u02a8\58\35\2\u02a8\u0095\3\2\2\2\u02a9\u02ac\5~@\2"+
		"\u02aa\u02ac\5\u0080A\2\u02ab\u02a9\3\2\2\2\u02ab\u02aa\3\2\2\2\u02ab"+
		"\u02ac\3\2\2\2\u02ac\u02ad\3\2\2\2\u02ad\u02ae\7\b\2\2\u02ae\u0097\3\2"+
		"\2\2\u02af\u02b3\7-\2\2\u02b0\u02b1\5\u0088E\2\u02b1\u02b2\7>\2\2\u02b2"+
		"\u02b4\3\2\2\2\u02b3\u02b0\3\2\2\2\u02b3\u02b4\3\2\2\2\u02b4\u02b5\3\2"+
		"\2\2\u02b5\u02b6\5x=\2\u02b6\u02bc\5&\24\2\u02b7\u02ba\7\'\2\2\u02b8\u02bb"+
		"\5\u0098M\2\u02b9\u02bb\5&\24\2\u02ba\u02b8\3\2\2\2\u02ba\u02b9\3\2\2"+
		"\2\u02bb\u02bd\3\2\2\2\u02bc\u02b7\3\2\2\2\u02bc\u02bd\3\2\2\2\u02bd\u0099"+
		"\3\2\2\2\u02be\u02bf\7)\2\2\u02bf\u02c0\5\u009cO\2\u02c0\u02c1\5&\24\2"+
		"\u02c1\u02cb\3\2\2\2\u02c2\u02c3\7)\2\2\u02c3\u02c4\5\u009eP\2\u02c4\u02c5"+
		"\5&\24\2\u02c5\u02cb\3\2\2\2\u02c6\u02c7\7)\2\2\u02c7\u02c8\5\u00a4S\2"+
		"\u02c8\u02c9\5&\24\2\u02c9\u02cb\3\2\2\2\u02ca\u02be\3\2\2\2\u02ca\u02c2"+
		"\3\2\2\2\u02ca\u02c6\3\2\2\2\u02cb\u009b\3\2\2\2\u02cc\u02cd\5x=\2\u02cd"+
		"\u009d\3\2\2\2\u02ce\u02cf\5\u00a0Q\2\u02cf\u02d1\7>\2\2\u02d0\u02d2\5"+
		"\u009cO\2\u02d1\u02d0\3\2\2\2\u02d1\u02d2\3\2\2\2\u02d2\u02d3\3\2\2\2"+
		"\u02d3\u02d4\7>\2\2\u02d4\u02d5\5\u00a2R\2\u02d5\u009f\3\2\2\2\u02d6\u02d7"+
		"\5\u0088E\2\u02d7\u00a1\3\2\2\2\u02d8\u02d9\5\u0088E\2\u02d9\u00a3\3\2"+
		"\2\2\u02da\u02db\58\35\2\u02db\u02dc\7\b\2\2\u02dc\u02dd\7\62\2\2\u02dd"+
		"\u02de\5x=\2\u02de\u02e5\3\2\2\2\u02df\u02e0\5\66\34\2\u02e0\u02e1\7\t"+
		"\2\2\u02e1\u02e2\7\62\2\2\u02e2\u02e3\5x=\2\u02e3\u02e5\3\2\2\2\u02e4"+
		"\u02da\3\2\2\2\u02e4\u02df\3\2\2\2\u02e5\u00a5\3\2\2\2\u02e6\u02e7\7+"+
		"\2\2\u02e7\u02e8\5x=\2\u02e8\u00a7\3\2\2\2\u02e9\u02eb\7\63\2\2\u02ea"+
		"\u02ec\58\35\2\u02eb\u02ea\3\2\2\2\u02eb\u02ec\3\2\2\2\u02ec\u00a9\3\2"+
		"\2\2\u02ed\u02ef\7 \2\2\u02ee\u02f0\5\u008eH\2\u02ef\u02ee\3\2\2\2\u02ef"+
		"\u02f0\3\2\2\2\u02f0\u00ab\3\2\2\2\u02f1\u02f3\7$\2\2\u02f2\u02f4\5\u008e"+
		"H\2\u02f3\u02f2\3\2\2\2\u02f3\u02f4\3\2\2\2\u02f4\u00ad\3\2\2\2\u02f5"+
		"\u02f6\7,\2\2\u02f6\u02f7\5\u008eH\2\u02f7\u00af\3\2\2\2\u02f8\u02f9\5"+
		"\u00b2Z\2\u02f9\u02fa\7>\2\2\u02fa\u02fb\5\u00b6\\\2\u02fb\u02fc\5,\27"+
		"\2\u02fc\u00b1\3\2\2\2\u02fd\u02fe\7\61\2\2\u02fe\u02ff\5\u00b4[\2\u02ff"+
		"\u00b3\3\2\2\2\u0300\u0301\7?\2\2\u0301\u00b5\3\2\2\2\u0302\u0309\b\\"+
		"\1\2\u0303\u0304\f\3\2\2\u0304\u0305\5\u00b8]\2\u0305\u0306\7>\2\2\u0306"+
		"\u0308\3\2\2\2\u0307\u0303\3\2\2\2\u0308\u030b\3\2\2\2\u0309\u0307\3\2"+
		"\2\2\u0309\u030a\3\2\2\2\u030a\u00b7\3\2\2\2\u030b\u0309\3\2\2\2\u030c"+
		"\u030d\7.\2\2\u030d\u0314\5\u00bc_\2\u030e\u030f\7.\2\2\u030f\u0310\7"+
		"\3\2\2\u0310\u0311\5\u00ba^\2\u0311\u0312\7;\2\2\u0312\u0314\3\2\2\2\u0313"+
		"\u030c\3\2\2\2\u0313\u030e\3\2\2\2\u0314\u00b9\3\2\2\2\u0315\u031c\b^"+
		"\1\2\u0316\u0317\f\3\2\2\u0317\u0318\5\u00bc_\2\u0318\u0319\7>\2\2\u0319"+
		"\u031b\3\2\2\2\u031a\u0316\3\2\2\2\u031b\u031e\3\2\2\2\u031c\u031a\3\2"+
		"\2\2\u031c\u031d\3\2\2\2\u031d\u00bb\3\2\2\2\u031e\u031c\3\2\2\2\u031f"+
		"\u0320\7\n\2\2\u0320\u0326\5\u00be`\2\u0321\u0322\5\u00b4[\2\u0322\u0323"+
		"\5\u00be`\2\u0323\u0326\3\2\2\2\u0324\u0326\5\u00be`\2\u0325\u031f\3\2"+
		"\2\2\u0325\u0321\3\2\2\2\u0325\u0324\3\2\2\2\u0326\u00bd\3\2\2\2\u0327"+
		"\u0328\7C\2\2\u0328\u00bf\3\2\2\2\u0329\u032b\5\u00c2b\2\u032a\u0329\3"+
		"\2\2\2\u032b\u032e\3\2\2\2\u032c\u032a\3\2\2\2\u032c\u032d\3\2\2\2\u032d"+
		"\u00c1\3\2\2\2\u032e\u032c\3\2\2\2\u032f\u0330\t\b\2\2\u0330\u00c3\3\2"+
		"\2\2F\u00ca\u00ce\u00d4\u00ef\u00fc\u0100\u0105\u0107\u0113\u0117\u0128"+
		"\u012e\u0137\u013c\u0145\u014e\u0153\u0157\u0161\u016c\u0176\u017f\u018c"+
		"\u0195\u01a2\u01b0\u01bf\u01c3\u01c9\u01da\u01e1\u01e5\u01ef\u01f7\u01fc"+
		"\u0202\u0207\u0213\u0215\u0221\u0225\u022a\u0232\u023e\u0245\u024e\u0252"+
		"\u0269\u026b\u0272\u0280\u028f\u0296\u02ab\u02b3\u02ba\u02bc\u02ca\u02d1"+
		"\u02e4\u02eb\u02ef\u02f3\u0309\u0313\u031c\u0325\u032c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}