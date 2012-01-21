package jthrift;

import java.util.HashMap;
import java.util.Map;

public class TField extends TDoc {
    private Map<Id, Id> annos = new HashMap<Id, Id>();

    public static enum Mods {
	REQUIRED,
	OPTIONAL,
	OPT_IN_REQ_OUT
    }

    TType type;
    Id name;
    IConst key;
    Mods mod;
    TConstValue value;

    TBool xsdOptional;
    TBool xsdNillable;
    TStruct xsdAttrs;

    public TField(TType type, Id name, IConst key) {
        this.type = type;
        this.name = name;
        this.key = key;
    }
    
    public void setMod(Mods mod) {
        this.mod = mod;
    }
    public Id getName() { return name; }
    public IConst getKey() { return key; }
    public void setValue(TConstValue value) {
        this.value = value;
    }
    public void setXsdOptional(TBool bool) {
        xsdOptional = bool;
    }
    public void setXsdNillable(TBool bool) {
        xsdNillable = bool;
    }
    public void setXsdAttrs(TStruct struct) {
        xsdAttrs = struct;
    }
    public Map<Id, Id> getAnnotations() { return annos; }
}