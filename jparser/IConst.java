package jthrift.jparser;

public class IConst {
    private Long llong;
    private boolean aa;

    public IConst(long llong) {
        this.llong = llong;
        this.aa = false;
    }

    public Long getLong() { return llong; }

    public void setLong(Long llong) {
        this.llong = llong;
    }

    public void setIsAutoAssigned(boolean aa) {
        this.aa = aa;
    }

    public boolean isAutoAssigned() {
	return aa;
    }

    public String toString() {
	return "IConst<"+llong+">";
    }
}