package jthrift;

public class TTypedef extends TType {
    private TType type;
    private Id symbolic;

    public TTypedef(TProgram prog, TType type, Id symbolic) {
        super(prog);
        this.type = type;
        this.symbolic = symbolic;
    }

    @Override
    public VirtualType getVirtualType() { return VirtualType.TYPEDEF; }
}

