package jthrift;

import java.util.Map;

public class TAnnotation implements Map.Entry<Id, Id> {
    private Id key;
    private Id value;

    public Id getKey() { return key; }
    public Id getValue() { return value; }
    public void setKey(Id key) { this.key = key; }
    public Id setValue(Id value) {
        Id oldVal = value;
        this.value = value;
        return oldVal;
    }
}