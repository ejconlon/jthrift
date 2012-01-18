package jthrift;

public class JParse {
    public static void main(String[] args) throws java.io.IOException{
        if (args.length != 1) {
            System.err.println("Need filename");
            System.exit(-1);
        }
        String filename = args[0];
	java.io.FileReader fileReader = new java.io.FileReader(filename);
	YYParser.Lexer lexer = LexerShim.fromReader(fileReader);
        YYParser parser = new YYParser(lexer);
	boolean parsed = parser.parse();
	System.out.println("PARSED? "+parsed);
    }
}
