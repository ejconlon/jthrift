package jthrift;

import java.util.LinkedList;
import java.util.List;

public class TEnum extends TType {
    private List<TEnumValue> constants;

    public TEnum(TProgram prog) { super(prog); }

    public void resolveValues() {
        // TODO
    }
    public List<TEnumValue> getConstants() { return constants; }
    public void append(TEnumValue value) {
        if (constants == null) constants = new LinkedList<TEnumValue>();
        constants.add(value);
    }

    @Override
    public VirtualType getVirtualType() { return VirtualType.ENUM; }
}