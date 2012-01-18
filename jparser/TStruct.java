package jthrift.jparser;

import java.util.List;

public class TStruct extends TType {
    private List<TField> fields;
    private TBool xsdAll;
    private TBool union;
    private TBool xception;
    private TService parent;

    public TStruct(TProgram prog) { super(prog); }
    public void setXsdAll(TBool xsdAll) {
        this.xsdAll = xsdAll;
    }
    public void setUnion(TBool union) {
        this.union = union;
    }
    public void setXception(TBool xception) {
        this.xception = xception;
    }
    public void setExtends(TService parent) {
        this.parent = parent;
    }
    public boolean append(TField field) {
        // TODO check field id
        fields.add(field);
        return true;
    }

    @Override
    public VirtualType getVirtualType() { return VirtualType.STRUCT; }
}