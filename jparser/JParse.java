package jthrift.jparser;

public class JParse {
    public static void main(String[] args) throws java.io.IOException{
	if (args.length != 2) {
            System.err.println("Need op and filename");
            System.exit(-1);
        }
	String op = args[0];
        String filename = args[1];
	java.io.FileReader fileReader = new java.io.FileReader(filename);

	if (op.equals("lex")) {
	    ScannerIterator scanit = ScannerIterator.fromReader(fileReader);
	    for (java_cup.runtime.Symbol sym : scanit) {
		System.out.println("SYMBOL: "+sym);
	    }
	} else if (op.equals("parse")) {
	    C.c.program = new TProgram("FAKEPATH", "FAKENAME");
	    C.c.scope = new TScope();
	    YYParser.Lexer lexer = LexerShim.fromReader(fileReader);
	    YYParser parser = new YYParser(lexer);
	    parser.errorVerbose = true;
	    boolean parsed = parser.parse();
	    System.out.println("PARSED? "+parsed);
	} else {
	    System.err.println("Bad op");
	    System.exit(-1);
	}
    }
}
