package jthrift;

public class Id {
    private String value;

    public Id(String value) {
        this.value = value;
    }

    public static Id fromString(String value) {
	return new Id(value);
    }

    public String toString() {
        return value;
    }
}