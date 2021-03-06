package jthrift;

public class Context {

    private static final Context instance = new Context();
    private Context() {}
    public static Context getInstance() { return instance; }

    /**
     * This global variable is used for automatic numbering of field indices etc.
     * when parsing the members of a struct. Field values are automatically
     * assigned starting from -1 and working their way down.
     */
    public long fieldVal = -1;
    public int arglist = 0;
    public final int structIsStruct = 0;
    public final int structIsUnion = 1;

    public static enum ParseMode {
        INCLUDES, PROGRAM
    };
    public ParseMode parseMode = ParseMode.PROGRAM;

    public int doctextLineno;
    public DText doctext;

    public void clear_doctext() {
        if (doctext != null) {
            pwarning(2, "" +doctext);
        }
        doctext = null;
        doctextLineno = -1;
    }

    /**
     * The master program parse tree. This is accessed from within the parser code
     * to build up the program elements.
     */
    public TProgram program;

    /**
     * Global types for the parser to be able to reference
     */

    public TType typeVoid;
    public TType typeString;
    public TType typeBinary;
    public TType typeSlist;
    public TType typeBool;
    public TType typeByte;
    public TType typeI16;
    public TType typeI32;
    public TType typeI64;
    public TType typeDouble;

    public TScope scope;

    public TScope parentScope;

    public String parentPrefix;

    public boolean allow64bitConsts = true;
    public boolean allowNegFieldKeys = false;

    public int strict = 127;

    public void pdebug(String msg) {
        System.out.println("" +msg);
    }

    public void pwarning(int level, String msg) {
        System.out.println("" +level+"): "+msg);
    }

    public Id includeFile(Id path) {
        // TODO
        return path;
    }

    public void resolveConstValue(TConstValue value, TType type) {
        // TODO
    }

    public void validateConstType(TConst value) {
        // TODO
    }

    public boolean validateThrows(TStruct struct) {
        // TODO
        return true;
    }

    public void validateFieldValue(TField field, TConstValue value) {
        // TODO
    }


    void thriftReservedKeyword(String keyword) {
        System.err.println("Cannot use reserved language keyword: \""+keyword+ "\n");
        System.exit(1);
    }

    void integerOverflow(String text) {
        System.err.println("This integer is too big: \""+text+ "\n");
        System.exit(1);
    }

    void unexpectedToken(String text) {
        System.err.println("Unexpected token in input: \""+text+ "\n");
        System.exit(1);
    }

}
