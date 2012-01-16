package jthrift;

public class TBaseType extends TType {
    public TBaseType(TBaseType type) {}
    public TBaseType(Id value, TType.ConcreteType type) {}

    public void addStringEnumVal(Id value) {}
    public void setStringEnum(boolean isEnum) {}
}