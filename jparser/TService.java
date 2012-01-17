package jthrift;

import java.util.LinkedList;
import java.util.List;

public class TService extends TType {
    private TService parent;
    private List<TFunction> functions = new LinkedList<TFunction>();

    public TService(TProgram prog) { super(prog); }

    public void setExtends(TService parent) {
        this.parent = parent;
    }
    public void addFunction(TFunction function) {
        functions.add(function);
    }

    @Override
    public VirtualType getVirtualType() { return VirtualType.SERVICE; }
}