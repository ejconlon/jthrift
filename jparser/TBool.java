package jthrift;

public class TBool {

    private boolean value;

    public TBool(boolean value) {
	this.value = value;
    }

    public static TBool fromBoolean(boolean value) {
	return new TBool(value);
    }

    public boolean toBoolean() {
	return value;
    }
}