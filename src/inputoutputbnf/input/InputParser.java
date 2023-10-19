// Generated from Input.g4 by ANTLR 4.13.1
package inputoutputbnf;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class InputParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		CLASS=10, SCANNER_CLASS=11, SYSTEM_IN=12, INPUT_METHOD=13, DATA_TYPE=14, 
		DIGIT=15, LETTER=16, SYMBOL=17, BOOLEAN=18, STRING=19, CLASS_INSTANCE=20, 
		EPSILON=21;
	public static final int
		RULE_input_statement = 0, RULE_scanner_declaration = 1, RULE_input_expression = 2, 
		RULE_solitary_input_expression = 3, RULE_new_scanner = 4, RULE_package = 5, 
		RULE_class_instance = 6, RULE_radix = 7, RULE_variable_declaration = 8, 
		RULE_variable_name = 9, RULE_special_char = 10, RULE_name = 11, RULE_string = 12, 
		RULE_num = 13;
	private static String[] makeRuleNames() {
		return new String[] {
			"input_statement", "scanner_declaration", "input_expression", "solitary_input_expression", 
			"new_scanner", "package", "class_instance", "radix", "variable_declaration", 
			"variable_name", "special_char", "name", "string", "num"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "';'", "'.'", "'('", "')'", "'new'", "'java.util.'", "'_'", 
			"'$'", null, "'Scanner'", "'System.in'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, "CLASS", 
			"SCANNER_CLASS", "SYSTEM_IN", "INPUT_METHOD", "DATA_TYPE", "DIGIT", "LETTER", 
			"SYMBOL", "BOOLEAN", "STRING", "CLASS_INSTANCE", "EPSILON"
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
	public String getGrammarFileName() { return "Input.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public InputParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Input_statementContext extends ParserRuleContext {
		public Scanner_declarationContext scanner_declaration() {
			return getRuleContext(Scanner_declarationContext.class,0);
		}
		public Input_expressionContext input_expression() {
			return getRuleContext(Input_expressionContext.class,0);
		}
		public Solitary_input_expressionContext solitary_input_expression() {
			return getRuleContext(Solitary_input_expressionContext.class,0);
		}
		public Input_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InputListener ) ((InputListener)listener).enterInput_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InputListener ) ((InputListener)listener).exitInput_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InputVisitor ) return ((InputVisitor<? extends T>)visitor).visitInput_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Input_statementContext input_statement() throws RecognitionException {
		Input_statementContext _localctx = new Input_statementContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_input_statement);
		try {
			setState(32);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SCANNER_CLASS:
				enterOuterAlt(_localctx, 1);
				{
				setState(28);
				scanner_declaration();
				setState(29);
				input_expression();
				}
				break;
			case T__7:
			case T__8:
			case DATA_TYPE:
			case LETTER:
				enterOuterAlt(_localctx, 2);
				{
				setState(31);
				solitary_input_expression();
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
	public static class Scanner_declarationContext extends ParserRuleContext {
		public TerminalNode SCANNER_CLASS() { return getToken(InputParser.SCANNER_CLASS, 0); }
		public Variable_nameContext variable_name() {
			return getRuleContext(Variable_nameContext.class,0);
		}
		public New_scannerContext new_scanner() {
			return getRuleContext(New_scannerContext.class,0);
		}
		public Scanner_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scanner_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InputListener ) ((InputListener)listener).enterScanner_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InputListener ) ((InputListener)listener).exitScanner_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InputVisitor ) return ((InputVisitor<? extends T>)visitor).visitScanner_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Scanner_declarationContext scanner_declaration() throws RecognitionException {
		Scanner_declarationContext _localctx = new Scanner_declarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_scanner_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			match(SCANNER_CLASS);
			setState(35);
			variable_name();
			setState(36);
			match(T__0);
			setState(37);
			new_scanner();
			setState(38);
			match(T__1);
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
	public static class Input_expressionContext extends ParserRuleContext {
		public List<Variable_nameContext> variable_name() {
			return getRuleContexts(Variable_nameContext.class);
		}
		public Variable_nameContext variable_name(int i) {
			return getRuleContext(Variable_nameContext.class,i);
		}
		public TerminalNode INPUT_METHOD() { return getToken(InputParser.INPUT_METHOD, 0); }
		public Variable_declarationContext variable_declaration() {
			return getRuleContext(Variable_declarationContext.class,0);
		}
		public RadixContext radix() {
			return getRuleContext(RadixContext.class,0);
		}
		public Input_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InputListener ) ((InputListener)listener).enterInput_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InputListener ) ((InputListener)listener).exitInput_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InputVisitor ) return ((InputVisitor<? extends T>)visitor).visitInput_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Input_expressionContext input_expression() throws RecognitionException {
		Input_expressionContext _localctx = new Input_expressionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_input_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(40);
				variable_declaration();
				}
				break;
			case 2:
				{
				setState(41);
				variable_name();
				}
				break;
			}
			setState(44);
			match(T__0);
			setState(45);
			variable_name();
			setState(46);
			match(T__2);
			setState(47);
			match(INPUT_METHOD);
			setState(48);
			match(T__3);
			setState(50);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2196224L) != 0)) {
				{
				setState(49);
				radix();
				}
			}

			setState(52);
			match(T__4);
			setState(53);
			match(T__1);
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
	public static class Solitary_input_expressionContext extends ParserRuleContext {
		public New_scannerContext new_scanner() {
			return getRuleContext(New_scannerContext.class,0);
		}
		public TerminalNode INPUT_METHOD() { return getToken(InputParser.INPUT_METHOD, 0); }
		public Variable_declarationContext variable_declaration() {
			return getRuleContext(Variable_declarationContext.class,0);
		}
		public Variable_nameContext variable_name() {
			return getRuleContext(Variable_nameContext.class,0);
		}
		public RadixContext radix() {
			return getRuleContext(RadixContext.class,0);
		}
		public Solitary_input_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_solitary_input_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InputListener ) ((InputListener)listener).enterSolitary_input_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InputListener ) ((InputListener)listener).exitSolitary_input_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InputVisitor ) return ((InputVisitor<? extends T>)visitor).visitSolitary_input_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Solitary_input_expressionContext solitary_input_expression() throws RecognitionException {
		Solitary_input_expressionContext _localctx = new Solitary_input_expressionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_solitary_input_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(55);
				variable_declaration();
				}
				break;
			case 2:
				{
				setState(56);
				variable_name();
				}
				break;
			}
			setState(59);
			match(T__0);
			setState(60);
			new_scanner();
			setState(61);
			match(T__2);
			setState(62);
			match(INPUT_METHOD);
			setState(63);
			match(T__3);
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2196224L) != 0)) {
				{
				setState(64);
				radix();
				}
			}

			setState(67);
			match(T__4);
			setState(68);
			match(T__1);
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
	public static class New_scannerContext extends ParserRuleContext {
		public PackageContext package_() {
			return getRuleContext(PackageContext.class,0);
		}
		public Variable_nameContext variable_name() {
			return getRuleContext(Variable_nameContext.class,0);
		}
		public TerminalNode SYSTEM_IN() { return getToken(InputParser.SYSTEM_IN, 0); }
		public New_scannerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_new_scanner; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InputListener ) ((InputListener)listener).enterNew_scanner(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InputListener ) ((InputListener)listener).exitNew_scanner(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InputVisitor ) return ((InputVisitor<? extends T>)visitor).visitNew_scanner(this);
			else return visitor.visitChildren(this);
		}
	}

	public final New_scannerContext new_scanner() throws RecognitionException {
		New_scannerContext _localctx = new New_scannerContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_new_scanner);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			match(T__5);
			setState(71);
			package_();
			setState(72);
			match(T__3);
			setState(75);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
			case T__8:
			case LETTER:
				{
				setState(73);
				variable_name();
				}
				break;
			case SYSTEM_IN:
				{
				setState(74);
				match(SYSTEM_IN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(77);
			match(T__4);
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
	public static class PackageContext extends ParserRuleContext {
		public TerminalNode SCANNER_CLASS() { return getToken(InputParser.SCANNER_CLASS, 0); }
		public PackageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_package; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InputListener ) ((InputListener)listener).enterPackage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InputListener ) ((InputListener)listener).exitPackage(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InputVisitor ) return ((InputVisitor<? extends T>)visitor).visitPackage(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PackageContext package_() throws RecognitionException {
		PackageContext _localctx = new PackageContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_package);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(79);
				match(T__6);
				}
			}

			setState(82);
			match(SCANNER_CLASS);
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
	public static class Class_instanceContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(InputParser.CLASS, 0); }
		public TerminalNode STRING() { return getToken(InputParser.STRING, 0); }
		public Variable_nameContext variable_name() {
			return getRuleContext(Variable_nameContext.class,0);
		}
		public TerminalNode CLASS_INSTANCE() { return getToken(InputParser.CLASS_INSTANCE, 0); }
		public TerminalNode EPSILON() { return getToken(InputParser.EPSILON, 0); }
		public Class_instanceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_instance; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InputListener ) ((InputListener)listener).enterClass_instance(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InputListener ) ((InputListener)listener).exitClass_instance(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InputVisitor ) return ((InputVisitor<? extends T>)visitor).visitClass_instance(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_instanceContext class_instance() throws RecognitionException {
		Class_instanceContext _localctx = new Class_instanceContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_class_instance);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			match(T__5);
			setState(85);
			match(CLASS);
			setState(86);
			match(T__3);
			setState(91);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				{
				setState(87);
				match(STRING);
				}
				break;
			case T__7:
			case T__8:
			case LETTER:
				{
				setState(88);
				variable_name();
				}
				break;
			case CLASS_INSTANCE:
				{
				setState(89);
				match(CLASS_INSTANCE);
				}
				break;
			case EPSILON:
				{
				setState(90);
				match(EPSILON);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(93);
			match(T__4);
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
	public static class RadixContext extends ParserRuleContext {
		public NumContext num() {
			return getRuleContext(NumContext.class,0);
		}
		public TerminalNode EPSILON() { return getToken(InputParser.EPSILON, 0); }
		public Variable_nameContext variable_name() {
			return getRuleContext(Variable_nameContext.class,0);
		}
		public RadixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_radix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InputListener ) ((InputListener)listener).enterRadix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InputListener ) ((InputListener)listener).exitRadix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InputVisitor ) return ((InputVisitor<? extends T>)visitor).visitRadix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RadixContext radix() throws RecognitionException {
		RadixContext _localctx = new RadixContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_radix);
		try {
			setState(98);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DIGIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(95);
				num();
				}
				break;
			case EPSILON:
				enterOuterAlt(_localctx, 2);
				{
				setState(96);
				match(EPSILON);
				}
				break;
			case T__7:
			case T__8:
			case LETTER:
				enterOuterAlt(_localctx, 3);
				{
				setState(97);
				variable_name();
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
	public static class Variable_declarationContext extends ParserRuleContext {
		public Variable_nameContext variable_name() {
			return getRuleContext(Variable_nameContext.class,0);
		}
		public TerminalNode DATA_TYPE() { return getToken(InputParser.DATA_TYPE, 0); }
		public Variable_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InputListener ) ((InputListener)listener).enterVariable_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InputListener ) ((InputListener)listener).exitVariable_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InputVisitor ) return ((InputVisitor<? extends T>)visitor).visitVariable_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Variable_declarationContext variable_declaration() throws RecognitionException {
		Variable_declarationContext _localctx = new Variable_declarationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_variable_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DATA_TYPE) {
				{
				setState(100);
				match(DATA_TYPE);
				}
			}

			setState(103);
			variable_name();
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
	public static class Variable_nameContext extends ParserRuleContext {
		public Special_charContext special_char() {
			return getRuleContext(Special_charContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Variable_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InputListener ) ((InputListener)listener).enterVariable_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InputListener ) ((InputListener)listener).exitVariable_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InputVisitor ) return ((InputVisitor<? extends T>)visitor).visitVariable_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Variable_nameContext variable_name() throws RecognitionException {
		Variable_nameContext _localctx = new Variable_nameContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_variable_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			special_char();
			setState(106);
			name();
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
	public static class Special_charContext extends ParserRuleContext {
		public TerminalNode LETTER() { return getToken(InputParser.LETTER, 0); }
		public Special_charContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_special_char; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InputListener ) ((InputListener)listener).enterSpecial_char(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InputListener ) ((InputListener)listener).exitSpecial_char(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InputVisitor ) return ((InputVisitor<? extends T>)visitor).visitSpecial_char(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Special_charContext special_char() throws RecognitionException {
		Special_charContext _localctx = new Special_charContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_special_char);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 66304L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class NameContext extends ParserRuleContext {
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InputListener ) ((InputListener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InputListener ) ((InputListener)listener).exitName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InputVisitor ) return ((InputVisitor<? extends T>)visitor).visitName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_name);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			string();
			setState(114);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(111);
					name();
					}
					} 
				}
				setState(116);
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
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StringContext extends ParserRuleContext {
		public NumContext num() {
			return getRuleContext(NumContext.class,0);
		}
		public TerminalNode LETTER() { return getToken(InputParser.LETTER, 0); }
		public TerminalNode SYMBOL() { return getToken(InputParser.SYMBOL, 0); }
		public List<StringContext> string() {
			return getRuleContexts(StringContext.class);
		}
		public StringContext string(int i) {
			return getRuleContext(StringContext.class,i);
		}
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InputListener ) ((InputListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InputListener ) ((InputListener)listener).exitString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InputVisitor ) return ((InputVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_string);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DIGIT:
				{
				setState(117);
				num();
				}
				break;
			case LETTER:
				{
				setState(118);
				match(LETTER);
				}
				break;
			case SYMBOL:
				{
				setState(119);
				match(SYMBOL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(125);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(122);
					string();
					}
					} 
				}
				setState(127);
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
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NumContext extends ParserRuleContext {
		public TerminalNode DIGIT() { return getToken(InputParser.DIGIT, 0); }
		public List<NumContext> num() {
			return getRuleContexts(NumContext.class);
		}
		public NumContext num(int i) {
			return getRuleContext(NumContext.class,i);
		}
		public NumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_num; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InputListener ) ((InputListener)listener).enterNum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InputListener ) ((InputListener)listener).exitNum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InputVisitor ) return ((InputVisitor<? extends T>)visitor).visitNum(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumContext num() throws RecognitionException {
		NumContext _localctx = new NumContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_num);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			match(DIGIT);
			setState(132);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(129);
					num();
					}
					} 
				}
				setState(134);
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
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0015\u0088\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0003\u0000!\b\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0003\u0002+\b"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0003\u00023\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0003\u0001\u0003\u0003\u0003:\b\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003B\b\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0003\u0004L\b\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0003\u0005Q\b\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003"+
		"\u0006\\\b\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0003\u0007c\b\u0007\u0001\b\u0003\bf\b\b\u0001\b\u0001\b\u0001"+
		"\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0005\u000b"+
		"q\b\u000b\n\u000b\f\u000bt\t\u000b\u0001\f\u0001\f\u0001\f\u0003\fy\b"+
		"\f\u0001\f\u0005\f|\b\f\n\f\f\f\u007f\t\f\u0001\r\u0001\r\u0005\r\u0083"+
		"\b\r\n\r\f\r\u0086\t\r\u0001\r\u0000\u0000\u000e\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u0000\u0001\u0002\u0000"+
		"\b\t\u0010\u0010\u008b\u0000 \u0001\u0000\u0000\u0000\u0002\"\u0001\u0000"+
		"\u0000\u0000\u0004*\u0001\u0000\u0000\u0000\u00069\u0001\u0000\u0000\u0000"+
		"\bF\u0001\u0000\u0000\u0000\nP\u0001\u0000\u0000\u0000\fT\u0001\u0000"+
		"\u0000\u0000\u000eb\u0001\u0000\u0000\u0000\u0010e\u0001\u0000\u0000\u0000"+
		"\u0012i\u0001\u0000\u0000\u0000\u0014l\u0001\u0000\u0000\u0000\u0016n"+
		"\u0001\u0000\u0000\u0000\u0018x\u0001\u0000\u0000\u0000\u001a\u0080\u0001"+
		"\u0000\u0000\u0000\u001c\u001d\u0003\u0002\u0001\u0000\u001d\u001e\u0003"+
		"\u0004\u0002\u0000\u001e!\u0001\u0000\u0000\u0000\u001f!\u0003\u0006\u0003"+
		"\u0000 \u001c\u0001\u0000\u0000\u0000 \u001f\u0001\u0000\u0000\u0000!"+
		"\u0001\u0001\u0000\u0000\u0000\"#\u0005\u000b\u0000\u0000#$\u0003\u0012"+
		"\t\u0000$%\u0005\u0001\u0000\u0000%&\u0003\b\u0004\u0000&\'\u0005\u0002"+
		"\u0000\u0000\'\u0003\u0001\u0000\u0000\u0000(+\u0003\u0010\b\u0000)+\u0003"+
		"\u0012\t\u0000*(\u0001\u0000\u0000\u0000*)\u0001\u0000\u0000\u0000+,\u0001"+
		"\u0000\u0000\u0000,-\u0005\u0001\u0000\u0000-.\u0003\u0012\t\u0000./\u0005"+
		"\u0003\u0000\u0000/0\u0005\r\u0000\u000002\u0005\u0004\u0000\u000013\u0003"+
		"\u000e\u0007\u000021\u0001\u0000\u0000\u000023\u0001\u0000\u0000\u0000"+
		"34\u0001\u0000\u0000\u000045\u0005\u0005\u0000\u000056\u0005\u0002\u0000"+
		"\u00006\u0005\u0001\u0000\u0000\u00007:\u0003\u0010\b\u00008:\u0003\u0012"+
		"\t\u000097\u0001\u0000\u0000\u000098\u0001\u0000\u0000\u0000:;\u0001\u0000"+
		"\u0000\u0000;<\u0005\u0001\u0000\u0000<=\u0003\b\u0004\u0000=>\u0005\u0003"+
		"\u0000\u0000>?\u0005\r\u0000\u0000?A\u0005\u0004\u0000\u0000@B\u0003\u000e"+
		"\u0007\u0000A@\u0001\u0000\u0000\u0000AB\u0001\u0000\u0000\u0000BC\u0001"+
		"\u0000\u0000\u0000CD\u0005\u0005\u0000\u0000DE\u0005\u0002\u0000\u0000"+
		"E\u0007\u0001\u0000\u0000\u0000FG\u0005\u0006\u0000\u0000GH\u0003\n\u0005"+
		"\u0000HK\u0005\u0004\u0000\u0000IL\u0003\u0012\t\u0000JL\u0005\f\u0000"+
		"\u0000KI\u0001\u0000\u0000\u0000KJ\u0001\u0000\u0000\u0000LM\u0001\u0000"+
		"\u0000\u0000MN\u0005\u0005\u0000\u0000N\t\u0001\u0000\u0000\u0000OQ\u0005"+
		"\u0007\u0000\u0000PO\u0001\u0000\u0000\u0000PQ\u0001\u0000\u0000\u0000"+
		"QR\u0001\u0000\u0000\u0000RS\u0005\u000b\u0000\u0000S\u000b\u0001\u0000"+
		"\u0000\u0000TU\u0005\u0006\u0000\u0000UV\u0005\n\u0000\u0000V[\u0005\u0004"+
		"\u0000\u0000W\\\u0005\u0013\u0000\u0000X\\\u0003\u0012\t\u0000Y\\\u0005"+
		"\u0014\u0000\u0000Z\\\u0005\u0015\u0000\u0000[W\u0001\u0000\u0000\u0000"+
		"[X\u0001\u0000\u0000\u0000[Y\u0001\u0000\u0000\u0000[Z\u0001\u0000\u0000"+
		"\u0000\\]\u0001\u0000\u0000\u0000]^\u0005\u0005\u0000\u0000^\r\u0001\u0000"+
		"\u0000\u0000_c\u0003\u001a\r\u0000`c\u0005\u0015\u0000\u0000ac\u0003\u0012"+
		"\t\u0000b_\u0001\u0000\u0000\u0000b`\u0001\u0000\u0000\u0000ba\u0001\u0000"+
		"\u0000\u0000c\u000f\u0001\u0000\u0000\u0000df\u0005\u000e\u0000\u0000"+
		"ed\u0001\u0000\u0000\u0000ef\u0001\u0000\u0000\u0000fg\u0001\u0000\u0000"+
		"\u0000gh\u0003\u0012\t\u0000h\u0011\u0001\u0000\u0000\u0000ij\u0003\u0014"+
		"\n\u0000jk\u0003\u0016\u000b\u0000k\u0013\u0001\u0000\u0000\u0000lm\u0007"+
		"\u0000\u0000\u0000m\u0015\u0001\u0000\u0000\u0000nr\u0003\u0018\f\u0000"+
		"oq\u0003\u0016\u000b\u0000po\u0001\u0000\u0000\u0000qt\u0001\u0000\u0000"+
		"\u0000rp\u0001\u0000\u0000\u0000rs\u0001\u0000\u0000\u0000s\u0017\u0001"+
		"\u0000\u0000\u0000tr\u0001\u0000\u0000\u0000uy\u0003\u001a\r\u0000vy\u0005"+
		"\u0010\u0000\u0000wy\u0005\u0011\u0000\u0000xu\u0001\u0000\u0000\u0000"+
		"xv\u0001\u0000\u0000\u0000xw\u0001\u0000\u0000\u0000y}\u0001\u0000\u0000"+
		"\u0000z|\u0003\u0018\f\u0000{z\u0001\u0000\u0000\u0000|\u007f\u0001\u0000"+
		"\u0000\u0000}{\u0001\u0000\u0000\u0000}~\u0001\u0000\u0000\u0000~\u0019"+
		"\u0001\u0000\u0000\u0000\u007f}\u0001\u0000\u0000\u0000\u0080\u0084\u0005"+
		"\u000f\u0000\u0000\u0081\u0083\u0003\u001a\r\u0000\u0082\u0081\u0001\u0000"+
		"\u0000\u0000\u0083\u0086\u0001\u0000\u0000\u0000\u0084\u0082\u0001\u0000"+
		"\u0000\u0000\u0084\u0085\u0001\u0000\u0000\u0000\u0085\u001b\u0001\u0000"+
		"\u0000\u0000\u0086\u0084\u0001\u0000\u0000\u0000\u000e *29AKP[berx}\u0084";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}