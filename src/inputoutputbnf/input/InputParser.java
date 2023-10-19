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
		RULE_variable_name = 9, RULE_special_char = 10, RULE_num = 11;
	private static String[] makeRuleNames() {
		return new String[] {
			"input_statement", "scanner_declaration", "input_expression", "solitary_input_expression", 
			"new_scanner", "package", "class_instance", "radix", "variable_declaration", 
			"variable_name", "special_char", "num"
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
			setState(28);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SCANNER_CLASS:
				enterOuterAlt(_localctx, 1);
				{
				setState(24);
				scanner_declaration();
				setState(25);
				input_expression();
				}
				break;
			case T__7:
			case T__8:
			case DATA_TYPE:
			case LETTER:
				enterOuterAlt(_localctx, 2);
				{
				setState(27);
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
			setState(30);
			match(SCANNER_CLASS);
			setState(31);
			variable_name();
			setState(32);
			match(T__0);
			setState(33);
			new_scanner();
			setState(34);
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
		public Variable_declarationContext variable_declaration() {
			return getRuleContext(Variable_declarationContext.class,0);
		}
		public Variable_nameContext variable_name() {
			return getRuleContext(Variable_nameContext.class,0);
		}
		public TerminalNode INPUT_METHOD() { return getToken(InputParser.INPUT_METHOD, 0); }
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
			setState(36);
			variable_declaration();
			setState(37);
			match(T__0);
			setState(38);
			variable_name();
			setState(39);
			match(T__2);
			setState(40);
			match(INPUT_METHOD);
			setState(41);
			match(T__3);
			setState(43);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2196224L) != 0)) {
				{
				setState(42);
				radix();
				}
			}

			setState(45);
			match(T__4);
			setState(46);
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
		public Variable_declarationContext variable_declaration() {
			return getRuleContext(Variable_declarationContext.class,0);
		}
		public New_scannerContext new_scanner() {
			return getRuleContext(New_scannerContext.class,0);
		}
		public TerminalNode INPUT_METHOD() { return getToken(InputParser.INPUT_METHOD, 0); }
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
			setState(48);
			variable_declaration();
			setState(49);
			match(T__0);
			setState(50);
			new_scanner();
			setState(51);
			match(T__2);
			setState(52);
			match(INPUT_METHOD);
			setState(53);
			match(T__3);
			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2196224L) != 0)) {
				{
				setState(54);
				radix();
				}
			}

			setState(57);
			match(T__4);
			setState(58);
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
			setState(60);
			match(T__5);
			setState(61);
			package_();
			setState(62);
			match(T__3);
			setState(65);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
			case T__8:
			case LETTER:
				{
				setState(63);
				variable_name();
				}
				break;
			case SYSTEM_IN:
				{
				setState(64);
				match(SYSTEM_IN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(67);
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
			setState(70);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(69);
				match(T__6);
				}
			}

			setState(72);
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
			setState(74);
			match(T__5);
			setState(75);
			match(CLASS);
			setState(76);
			match(T__3);
			setState(81);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				{
				setState(77);
				match(STRING);
				}
				break;
			case T__7:
			case T__8:
			case LETTER:
				{
				setState(78);
				variable_name();
				}
				break;
			case CLASS_INSTANCE:
				{
				setState(79);
				match(CLASS_INSTANCE);
				}
				break;
			case EPSILON:
				{
				setState(80);
				match(EPSILON);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(83);
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
			setState(88);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DIGIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(85);
				num();
				}
				break;
			case EPSILON:
				enterOuterAlt(_localctx, 2);
				{
				setState(86);
				match(EPSILON);
				}
				break;
			case T__7:
			case T__8:
			case LETTER:
				enterOuterAlt(_localctx, 3);
				{
				setState(87);
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
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DATA_TYPE) {
				{
				setState(90);
				match(DATA_TYPE);
				}
			}

			setState(93);
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
		public List<Special_charContext> special_char() {
			return getRuleContexts(Special_charContext.class);
		}
		public Special_charContext special_char(int i) {
			return getRuleContext(Special_charContext.class,i);
		}
		public List<TerminalNode> LETTER() { return getTokens(InputParser.LETTER); }
		public TerminalNode LETTER(int i) {
			return getToken(InputParser.LETTER, i);
		}
		public List<NumContext> num() {
			return getRuleContexts(NumContext.class);
		}
		public NumContext num(int i) {
			return getRuleContext(NumContext.class,i);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
			case T__8:
				{
				setState(95);
				special_char();
				}
				break;
			case LETTER:
				{
				setState(96);
				match(LETTER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 99072L) != 0)) {
				{
				setState(102);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case DIGIT:
					{
					setState(99);
					num();
					}
					break;
				case LETTER:
					{
					setState(100);
					match(LETTER);
					}
					break;
				case T__7:
				case T__8:
					{
					setState(101);
					special_char();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(106);
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
	public static class Special_charContext extends ParserRuleContext {
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
			setState(107);
			_la = _input.LA(1);
			if ( !(_la==T__7 || _la==T__8) ) {
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
		enterRule(_localctx, 22, RULE_num);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			match(DIGIT);
			setState(113);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(110);
					num();
					}
					} 
				}
				setState(115);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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
		"\u0004\u0001\u0015u\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0003\u0000\u001d\b\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0003\u0002,\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0003\u00038\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004B\b"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0003\u0005G\b\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0003\u0006R\b\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007Y\b\u0007\u0001"+
		"\b\u0003\b\\\b\b\u0001\b\u0001\b\u0001\t\u0001\t\u0003\tb\b\t\u0001\t"+
		"\u0001\t\u0001\t\u0005\tg\b\t\n\t\f\tj\t\t\u0001\n\u0001\n\u0001\u000b"+
		"\u0001\u000b\u0005\u000bp\b\u000b\n\u000b\f\u000bs\t\u000b\u0001\u000b"+
		"\u0000\u0000\f\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016"+
		"\u0000\u0001\u0001\u0000\b\tx\u0000\u001c\u0001\u0000\u0000\u0000\u0002"+
		"\u001e\u0001\u0000\u0000\u0000\u0004$\u0001\u0000\u0000\u0000\u00060\u0001"+
		"\u0000\u0000\u0000\b<\u0001\u0000\u0000\u0000\nF\u0001\u0000\u0000\u0000"+
		"\fJ\u0001\u0000\u0000\u0000\u000eX\u0001\u0000\u0000\u0000\u0010[\u0001"+
		"\u0000\u0000\u0000\u0012a\u0001\u0000\u0000\u0000\u0014k\u0001\u0000\u0000"+
		"\u0000\u0016m\u0001\u0000\u0000\u0000\u0018\u0019\u0003\u0002\u0001\u0000"+
		"\u0019\u001a\u0003\u0004\u0002\u0000\u001a\u001d\u0001\u0000\u0000\u0000"+
		"\u001b\u001d\u0003\u0006\u0003\u0000\u001c\u0018\u0001\u0000\u0000\u0000"+
		"\u001c\u001b\u0001\u0000\u0000\u0000\u001d\u0001\u0001\u0000\u0000\u0000"+
		"\u001e\u001f\u0005\u000b\u0000\u0000\u001f \u0003\u0012\t\u0000 !\u0005"+
		"\u0001\u0000\u0000!\"\u0003\b\u0004\u0000\"#\u0005\u0002\u0000\u0000#"+
		"\u0003\u0001\u0000\u0000\u0000$%\u0003\u0010\b\u0000%&\u0005\u0001\u0000"+
		"\u0000&\'\u0003\u0012\t\u0000\'(\u0005\u0003\u0000\u0000()\u0005\r\u0000"+
		"\u0000)+\u0005\u0004\u0000\u0000*,\u0003\u000e\u0007\u0000+*\u0001\u0000"+
		"\u0000\u0000+,\u0001\u0000\u0000\u0000,-\u0001\u0000\u0000\u0000-.\u0005"+
		"\u0005\u0000\u0000./\u0005\u0002\u0000\u0000/\u0005\u0001\u0000\u0000"+
		"\u000001\u0003\u0010\b\u000012\u0005\u0001\u0000\u000023\u0003\b\u0004"+
		"\u000034\u0005\u0003\u0000\u000045\u0005\r\u0000\u000057\u0005\u0004\u0000"+
		"\u000068\u0003\u000e\u0007\u000076\u0001\u0000\u0000\u000078\u0001\u0000"+
		"\u0000\u000089\u0001\u0000\u0000\u00009:\u0005\u0005\u0000\u0000:;\u0005"+
		"\u0002\u0000\u0000;\u0007\u0001\u0000\u0000\u0000<=\u0005\u0006\u0000"+
		"\u0000=>\u0003\n\u0005\u0000>A\u0005\u0004\u0000\u0000?B\u0003\u0012\t"+
		"\u0000@B\u0005\f\u0000\u0000A?\u0001\u0000\u0000\u0000A@\u0001\u0000\u0000"+
		"\u0000BC\u0001\u0000\u0000\u0000CD\u0005\u0005\u0000\u0000D\t\u0001\u0000"+
		"\u0000\u0000EG\u0005\u0007\u0000\u0000FE\u0001\u0000\u0000\u0000FG\u0001"+
		"\u0000\u0000\u0000GH\u0001\u0000\u0000\u0000HI\u0005\u000b\u0000\u0000"+
		"I\u000b\u0001\u0000\u0000\u0000JK\u0005\u0006\u0000\u0000KL\u0005\n\u0000"+
		"\u0000LQ\u0005\u0004\u0000\u0000MR\u0005\u0013\u0000\u0000NR\u0003\u0012"+
		"\t\u0000OR\u0005\u0014\u0000\u0000PR\u0005\u0015\u0000\u0000QM\u0001\u0000"+
		"\u0000\u0000QN\u0001\u0000\u0000\u0000QO\u0001\u0000\u0000\u0000QP\u0001"+
		"\u0000\u0000\u0000RS\u0001\u0000\u0000\u0000ST\u0005\u0005\u0000\u0000"+
		"T\r\u0001\u0000\u0000\u0000UY\u0003\u0016\u000b\u0000VY\u0005\u0015\u0000"+
		"\u0000WY\u0003\u0012\t\u0000XU\u0001\u0000\u0000\u0000XV\u0001\u0000\u0000"+
		"\u0000XW\u0001\u0000\u0000\u0000Y\u000f\u0001\u0000\u0000\u0000Z\\\u0005"+
		"\u000e\u0000\u0000[Z\u0001\u0000\u0000\u0000[\\\u0001\u0000\u0000\u0000"+
		"\\]\u0001\u0000\u0000\u0000]^\u0003\u0012\t\u0000^\u0011\u0001\u0000\u0000"+
		"\u0000_b\u0003\u0014\n\u0000`b\u0005\u0010\u0000\u0000a_\u0001\u0000\u0000"+
		"\u0000a`\u0001\u0000\u0000\u0000bh\u0001\u0000\u0000\u0000cg\u0003\u0016"+
		"\u000b\u0000dg\u0005\u0010\u0000\u0000eg\u0003\u0014\n\u0000fc\u0001\u0000"+
		"\u0000\u0000fd\u0001\u0000\u0000\u0000fe\u0001\u0000\u0000\u0000gj\u0001"+
		"\u0000\u0000\u0000hf\u0001\u0000\u0000\u0000hi\u0001\u0000\u0000\u0000"+
		"i\u0013\u0001\u0000\u0000\u0000jh\u0001\u0000\u0000\u0000kl\u0007\u0000"+
		"\u0000\u0000l\u0015\u0001\u0000\u0000\u0000mq\u0005\u000f\u0000\u0000"+
		"np\u0003\u0016\u000b\u0000on\u0001\u0000\u0000\u0000ps\u0001\u0000\u0000"+
		"\u0000qo\u0001\u0000\u0000\u0000qr\u0001\u0000\u0000\u0000r\u0017\u0001"+
		"\u0000\u0000\u0000sq\u0001\u0000\u0000\u0000\f\u001c+7AFQX[afhq";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}