package jthrift;

public class TScope {
    public void addType(Id name, TType type) {}
    public void addService(Id name, TService service) {}
    public void addConstant(Id name, TConstValue value) {}
    public void addConstant(Id name, TConst value) {}
    public void resolveConstValue(TConstValue value, TType type) {}

    public TType getType(Id name) { return null; }
    public TService getService(Id name) { return null; }
}