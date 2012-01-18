package jthrift.jparser;

public class TContainer extends TType {
    private Id cppName;

    public Id getCppName() {
        return cppName;
    }

    public void setCppName(Id name) {
        cppName = name;
    }

    @Override
    public VirtualType getVirtualType() { return VirtualType.CONTAINER; }
}