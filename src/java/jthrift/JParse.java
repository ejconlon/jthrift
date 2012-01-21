package jthrift;

public class JParse {

    public static YYParser makeParser(java.io.Reader reader) {
        C.c.program = new TProgram("FAKEPATH", "FAKENAME");
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
            System.err.println("Need op and filename");
            System.exit(-1);
        }
        String op = args[0];
        String filename = args[1];
        java.io.FileReader fileReader = new java.io.FileReader(filename);

        if (op.equals("lex")) {
            ScannerIterator scanit = makeLexer(fileReader);
            for (java_cup.runtime.Symbol sym : scanit) {
                System.out.println("SYMBOL: " +sym);
            }
        } else if (op.equals("parse")) {
            YYParser parser = makeParser(fileReader);
            boolean parsed = parser.parse();
            System.out.println("PARSED? " +parsed);
        } else {
            System.err.println("Bad op");
            System.exit(-1);
        }
    }
}
