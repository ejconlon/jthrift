package jthrift;

public class JParse {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.err.println("Need filename");
            System.exit(-1);
        }
        String filename = args[0];
        //YYParser parser = new YYParser(lexer);
    }
}
