package jthrift;

import java.util.List;

public class TStruct extends TType {
    public TStruct(TProgram prog) { super(prog); }
    public void setXsdAll(TBool bool) {}
    public void setUnion(TBool bool) { }
    public void setName(Id name) {}
    public void setXception(TBool bool) {}
    public void setExtends(TService service) {}
    public boolean append(TField field) { return false; }
}