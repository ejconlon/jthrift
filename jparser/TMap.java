package jthrift.jparser;

public class TMap extends TContainer {
    private TType keyType;
    private TType valueType;

    public TMap(TType keyType, TType valueType) {
        this.keyType = keyType;
        this.valueType = valueType;
    }

    @Override
    public VirtualType getVirtualType() { return VirtualType.MAP; }
}