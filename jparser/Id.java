package jthrift.jparser;

public class Id {
    private String value;

    public Id(String value) {
        this.value = value;
    }

    public String rawString() {
        return value;
    }

    public String toString() {
        return "Id<"+value+">";
    }
}