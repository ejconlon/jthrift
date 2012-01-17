package jthrift;

public class TFieldId {
    private boolean autoAssigned;
    private IConst value;

    public TFieldId(IConst value, boolean autoAssigned) {
        this.value = value;
        this.autoAssigned = autoAssigned;
    }

    public IConst getValue() { return value; }
    public boolean isAutoAssigned() { return autoAssigned; }
}