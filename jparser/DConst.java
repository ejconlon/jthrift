package jthrift;

public class DConst {
    private Double ddouble;

    public DConst(Double ddouble) {
	this.ddouble = ddouble;
    }

    public DConst fromDouble(Double ddouble) {
	return new DConst(ddouble);
    }

    public Double getDouble() { return ddouble; }
}