package jthrift;

// hacked up wrapper for jflex <-> bison

public class java_cup {
    public static class runtime {
        public static class YYLVal {
	    public Object val;

	    public YYLVal(long l) {
		this.val = new IConst(l);
	    }		
	    public YYLVal(double d) {
		this.val = new DConst(d);
	    }		
	    public YYLVal(String s) {
		this.val = new Id(s);
	    }		

	    public Object getValue() {
		return val;
	    }

	    public String toString() {
		return "" +val.toString()+">";
	    }

        }

        public static class Symbol {
            private final int dex;
	    private final YYLVal lv;
	    public Symbol(int dex, YYLVal lv) {
	        this.dex = dex;
		this.lv = lv;
	    }
            public Symbol(int dex) {
	        this(dex, null);
            }
  	    public int sym_num() { return dex; }
	    public YYLVal lval() { return lv; }
	    public String toString() {
		String name = TokLookup.lookup(dex);
		if (name == null) name = "" +(char)dex+">";
		return "" +name+","+lv+">";
	    }
        }

	public static interface Scanner {
	    Symbol next_token() throws java.io.IOException;
        }
    }
}
