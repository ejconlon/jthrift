package jthrift;

public class Id implements Node {
    private String value;

    public Id(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}