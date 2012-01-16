package jthrift;

public class Context {
    /**
     * This global variable is used for automatic numbering of field indices etc.
     * when parsing the members of a struct. Field values are automatically
     * assigned starting from -1 and working their way down.
     */
    public long y_field_val = -1;
    public int g_arglist = 0;
    public final int struct_is_struct = 0;
    public final int struct_is_union = 1;

    public static enum ParseMode {
        INCLUDES, PROGRAM
    };
    public ParseMode g_parse_mode = ParseMode.PROGRAM;

    public int g_doctest_lineno;
    public String g_doctext;

    public void clear_doctext() {
        if (g_doctext != null) {
            pwarning(2, "Uncaptured doctext: "+g_doctext);
        }
        g_doctext = null;
    }

    /**
     * The master program parse tree. This is accessed from within the parser code
     * to build up the program elements.
     */
    public TProgram g_program;

    /**
     * Global types for the parser to be able to reference
     */

    public TType g_type_void;
    public TType g_type_string;
    public TType g_type_binary;
    public TType g_type_slist;
    public TType g_type_bool;
    public TType g_type_byte;
    public TType g_type_i16;
    public TType g_type_i32;
    public TType g_type_i64;
    public TType g_type_double;

    public TScope g_scope;

    public TScope g_parent_scope;

    public String g_parent_prefix;

    public boolean g_allow_64bit_consts = true;
    public boolean g_allow_neg_field_keys = false;

    public int g_strict = 127;

    public void pdebug(String msg) {
        System.out.println("DEBUG: "+msg);
    }

    public void pwarning(int level, String msg) {
        System.out.println("WARN ("+level+"): "+msg);
    }

    public Id includeFile(Id path) {
        return path;
    }

    public void resolveConstValue(TConstValue value, TType type) {

    }

    public void validateConstType(TConst value) {}

    public boolean validateThrows(TStruct struct) { return false; }

    public void validateFieldValue(TField field, TConstValue value) {}

}
