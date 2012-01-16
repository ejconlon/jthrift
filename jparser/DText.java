package jthrift;

public class DText {
    private String value;

    public DText(String value) {
        this.value = value;
    }

    public static DText fromString(String value) {
	return new DText(value);
    }

    public String toString() {
        return value;
    }
}