package jthrift;

public class LexerShim implements YYParser.Lexer {

    public static LexerShim fromReader(java.io.Reader in) {
	YYLexer yylexer = new YYLexer(in);
	return new LexerShim(yylexer);
    }

    public static LexerShim fromInputStream(java.io.InputStream in) {
	YYLexer yylexer = new YYLexer(in);
	return new LexerShim(yylexer);
    }

    private final java_cup.runtime.Scanner scanner;
    private java_cup.runtime.Symbol curSym;

    public LexerShim(java_cup.runtime.Scanner scanner) {
	this.scanner = scanner;
    }

    /**
     * Method to retrieve the semantic value of the last scanned token.
     * @return the semantic value of the last scanned token.  */
    public Object getLVal () {
	java_cup.runtime.YYLVal lval = curSym.lval();
	if (lval == null) return null;
	return lval.getValue();
    }

    /**
     * Entry point for the scanner.  Returns the token identifier corresponding
     * to the next token and prepares to return the semantic value
     * of the token. 
     * @return the token identifier corresponding to the next token. */
    public int yylex () throws java.io.IOException {
	curSym = scanner.next_token();
	return curSym.sym_num();
    }

    /**
     * Entry point for error reporting.  Emits an error
     * in a user-defined way.
     *
     * 
     * @param s The string for the error message.  */
    public void yyerror (String s) {
	System.err.println(s);
	System.exit(1);
    }
}