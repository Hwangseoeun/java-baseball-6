package baseball.model;

public enum JudgeResultMessage {
    BALL("볼"),
    STRIKE("스트라이크"),
    NOTHING("낫싱"),
    ;

    private final String message;

    JudgeResultMessage(final String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
