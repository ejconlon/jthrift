package jthrift;

public class TBool {

    private boolean value;

    public TBool(boolean value) {
	this.value = value;
    }

    public boolean toBoolean() {
	return value;
    }
}