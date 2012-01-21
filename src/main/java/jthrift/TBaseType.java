package jthrift;

import java.util.LinkedList;
import java.util.List;

public class TBaseType extends TType {

    private ConcreteType concreteType;
    private boolean stringList = false;
    private boolean binary = false;
    private boolean stringEnum = false;
    private List<Id> stringEnumVals;

    public TBaseType(TBaseType src) {
        concreteType = src.concreteType;
        stringList = src.stringList;
        binary = src.binary;
        stringEnum = src.stringEnum;
        if (src.stringEnumVals != null)
            stringEnumVals = new LinkedList<Id>(src.stringEnumVals);
    }

    public TBaseType(Id value, TType.ConcreteType type) {
        super(value);
        concreteType = type;
    }


    public void addStringEnumVal(Id value) {
        if (stringEnumVals == null) stringEnumVals = new LinkedList<Id>();
        stringEnumVals.add(value);
    }
    public void setStringEnum(boolean isEnum) {
        stringEnum = isEnum;
    }

    @Override
    public VirtualType getVirtualType() { return VirtualType.BASE_TYPE; }
}