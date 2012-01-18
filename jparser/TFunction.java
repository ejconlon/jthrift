package jthrift.jparser;

public class TFunction extends TDoc {
    private TType returnType;
    private Id name;
    private TStruct arglist;
    private TStruct xceptions;
    private TBool oneway;

    public TFunction(TType returnType, Id name, TStruct arglist, TStruct xceptions, TBool oneway) {
        this.returnType = returnType;
        this.name = name;
        this.arglist = arglist;
        this.xceptions = xceptions;
        this.oneway = oneway;
    }
}