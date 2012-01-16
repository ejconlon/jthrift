package jthrift;

public class IConst {
    private Long llong;
    private boolean aa;

    public IConst(Long llong) {
	this.llong = llong;
	this.aa = false;
    }

    public IConst fromLong(Long llong) {
	return new IConst(llong);
    }

    public Long getLong() { return llong; }

    public void setLong(Long llong) {
	this.llong = llong;
    }

    public void setIsAutoAssigned(boolean aa) {
	this.aa = aa;
    }
}