package jthrift;

// hacked up wrapper for jflex <-> bison

public class java_cup {
    public static class runtime {
        public static class YYLVal {
	    public long l;
            public double d;
            public String s;
	    public boolean isL = false;
	    public boolean isD = false;
	    public boolean isS = false;

	    public YYLVal(long l) {
	        this.l = l;
		this.isL = true;
	    }		
	    public YYLVal(double d) {
	        this.d = d;
		this.isD = true;
	    }		
	    public YYLVal(String s) {
	        this.s = s;
		this.isS = true;
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
        }

	public static interface Scanner {
	    Symbol next_token() throws java.io.IOException;
        }
    }
}
