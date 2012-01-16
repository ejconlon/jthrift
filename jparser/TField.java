package jthrift;

import java.util.Map;

public class TField extends TDoc {
    public static enum Mods {
	REQUIRED,
	OPTIONAL,
	OPT_IN_REQ_OUT
    }

    public TField(TType type, Id name, IConst val) {}
    
    public void setMod(Mods mod) {}
    public Id getName() { return null; }
    public IConst getKey() { return null; }
    public void setValue(TConstValue value) {}
    public void setXsdOptional(TBool bool) {}
    public void setXsdNillable(TBool bool) {}
    public void setXsdAttrs(TStruct struct) {}
    public Map<Id, Id> getAnnotations() { return null; }
}