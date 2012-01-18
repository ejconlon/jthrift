package jthrift.jparser;

import java.util.List;

public class TStruct extends TType {
    private List<TField> fields;
    private boolean xsdAll;
    private boolean union;
    private boolean xception;
    private TService parent;

    public TStruct(TProgram prog) { super(prog); }
    public void setXsdAll(boolean xsdAll) {
        this.xsdAll = xsdAll;
    }
    public void setUnion(boolean union) {
        this.union = union;
    }
    public void setXception(boolean xception) {
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