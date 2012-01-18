package jthrift.jparser;

public class TSet extends TContainer {
    private TType elemType;

    public TSet(TType elemType) {
        this.elemType = elemType;
    }

    @Override
    public VirtualType getVirtualType() { return VirtualType.SET; }
}