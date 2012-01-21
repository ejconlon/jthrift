package jthrift;

public class DConst {
    private Double ddouble;

    public DConst(Double ddouble) {
        this.ddouble = ddouble;
    }

    public Double getDouble() { return ddouble; }

    public String toString() {
        return "DConst<" +ddouble+">";
    }
}