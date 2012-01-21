package jthrift;

public class TList extends TContainer {
    private TType elemType;

    public TList(TType elemType) {
        this.elemType = elemType;
    }

    @Override
    public VirtualType getVirtualType() { return VirtualType.LIST; }
}