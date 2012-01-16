package jthrift;

import java.util.*;

public class TType extends TDoc {
    public static enum ConcreteType {
	VOID,
        STRING,
        BOOL,
        BYTE,
        I16,
        I32,
        I64,
        DOUBLE
    };

    public static enum VirtualType {
        VOID,
        BASE_TYPE,
        STRING,
        BOOL,
        TYPEDEF,
        ENUM,
        STRUCT,
        XCEPTION,
        CONTAINER,
        LIST,
        SET,
        MAP,
        SERVICE
    };

    private Id name;
    private TProgram prog;
    private VirtualType vtype;
    private Map<Id, Id> annos = new HashMap<Id, Id>();

    public TType() {}
    public TType(TProgram prog) { this.prog = prog; }
    public void setName(Id name) { this.name = name; }
    public Id getName() { return name; }
    public Map<Id, Id> getAnnotations() { return annos; }
    public TProgram getProgram() { return this.prog; }
    public void setVirtualType(VirtualType vtype) { this.vtype = vtype; }
    public VirtualType getVirtualType() { return this.vtype; }
}