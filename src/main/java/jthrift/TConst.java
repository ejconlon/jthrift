package jthrift;

public class TConst extends TDoc {
    private TType type;
    private Id name;
    private TConstValue value;

    public TConst(TType type, Id name, TConstValue value) {
        this.type = type;
        this.name = name;
        this.value = value;
    }
    public Id getName() { return name; }
}