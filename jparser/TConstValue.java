package jthrift;

public class TConstValue {
    public TConstValue() {}
    public TConstValue(Id name) {}
    public TConstValue(IConst iconst) {}
    public TConstValue(TType type, Id name, TConstValue value) {}
    public void setEnum(TEnum tenum) {}
    public void setInteger(IConst iconst) {}
    public void setDouble(DConst dconst) {}
    public void setIdentifier(Id id) {}
    public void addList(TConstValue value) {}
    public void setList() {}
    public void addMap(TConstValue key, TConstValue value) {}
    public void setMap() {}
}