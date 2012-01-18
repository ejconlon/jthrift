package jthrift.jparser;

public class TEnumValue extends TDoc {
    private Id name;
    private IConst value;

    public TEnumValue(Id name, IConst value) {
        this.name = name;
        this.value = value;
    }
    public TEnumValue(Id name) { this(name, null); }
    public Id getName() { return name; }
    public IConst getValue() { return value; }
}