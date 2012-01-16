package jthrift;

public class TBaseType extends TType {
    public static enum Type {
	VOID,
        STRING,
        BOOL,
        BYTE,
        I16,
        I32,
        I64,
        DOUBLE
    };

    public TBaseType(TBaseType type) {}
    public TBaseType(Id value, Type type) {}

    public void addStringEnumVal(Id value) {}
    public void setStringEnum(boolean isEnum) {}
}