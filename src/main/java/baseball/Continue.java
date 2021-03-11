package baseball;

public enum Continue {
    CONTINUE(1), TERMINATE(2);

    private final int value;

    Continue(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

}
