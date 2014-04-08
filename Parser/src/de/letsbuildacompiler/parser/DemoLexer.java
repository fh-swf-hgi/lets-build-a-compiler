// Generated from Demo.g4 by ANTLR 4.2
package de.letsbuildacompiler.parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DemoLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__3=1, T__2=2, T__1=3, T__0=4, NUMBER=5, WHITESPACE=6;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"')'", "'println('", "'+'", "';'", "NUMBER", "WHITESPACE"
	};
	public static final String[] ruleNames = {
		"T__3", "T__2", "T__1", "T__0", "NUMBER", "WHITESPACE"
	};


	public DemoLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Demo.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\b*\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\6\6 \n\6\r\6\16\6!\3\7\6\7%\n\7\r\7\16"+
		"\7&\3\7\3\7\2\2\b\3\3\5\4\7\5\t\6\13\7\r\b\3\2\4\3\2\62;\5\2\13\f\17\17"+
		"\"\"+\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r"+
		"\3\2\2\2\3\17\3\2\2\2\5\21\3\2\2\2\7\32\3\2\2\2\t\34\3\2\2\2\13\37\3\2"+
		"\2\2\r$\3\2\2\2\17\20\7+\2\2\20\4\3\2\2\2\21\22\7r\2\2\22\23\7t\2\2\23"+
		"\24\7k\2\2\24\25\7p\2\2\25\26\7v\2\2\26\27\7n\2\2\27\30\7p\2\2\30\31\7"+
		"*\2\2\31\6\3\2\2\2\32\33\7-\2\2\33\b\3\2\2\2\34\35\7=\2\2\35\n\3\2\2\2"+
		"\36 \t\2\2\2\37\36\3\2\2\2 !\3\2\2\2!\37\3\2\2\2!\"\3\2\2\2\"\f\3\2\2"+
		"\2#%\t\3\2\2$#\3\2\2\2%&\3\2\2\2&$\3\2\2\2&\'\3\2\2\2\'(\3\2\2\2()\b\7"+
		"\2\2)\16\3\2\2\2\5\2!&\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}