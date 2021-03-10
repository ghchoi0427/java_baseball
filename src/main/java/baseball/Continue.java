package baseball;

public enum Continue {
    CONTINUE("1"), TERMINATE("2");

    private final String value;

    Continue(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

}
