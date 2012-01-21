package jthrift;

public class DText {
    private String value;

    public DText(String value) {
        this.value = value;
    }

    public String rawString() {
        return value;
    }

    public String toString() {
        return "DText<" +value+">";
    }
}