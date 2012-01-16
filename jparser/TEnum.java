package jthrift;

import java.util.List;

public class TEnum extends TType {
    public TEnum(TProgram prog) { super(prog); }

    public void resolveValues() {}
    public List<TEnumValue> getConstants() { return null; }
    public void append(TEnumValue value) {}
}