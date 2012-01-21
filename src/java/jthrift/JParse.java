package jthrift;

public class JParse {

    public static YYParser makeParser(java.io.Reader reader) {
	C.c.program = new TProgram("", "FAKENAME");
	C.c.scope = new TScope();
	YYParser.Lexer lexer = LexerShim.fromReader(reader);
	YYParser parser = new YYParser(lexer);
	parser.errorVerbose = true;
	return parser;
    }

    public static ScannerIterator makeLexer(java.io.Reader reader) {
	return ScannerIterator.fromReader(reader);
    }

    public static void main(String[] args) throws java.io.IOException{
	if (args.length != 2) {
            System.err.println("");
            System.exit(-1);
        }
	String op = args[0];
        String filename = args[1];
	java.io.FileReader fileReader = new java.io.FileReader(filename);

	if (op.equals("")) {
	    ScannerIterator scanit = makeLexer(fileReader);
	    for (java_cup.runtime.Symbol sym : scanit) {
		System.out.println("" +sym);
	    }
	} else if (op.equals("")) {
	    YYParser parser = makeParser(fileReader);
	    boolean parsed = parser.parse();
	    System.out.println("" +parsed);
	} else {
	    System.err.println("");
	    System.exit(-1);
	}
    }
}