package baseball;

public enum BallStatus {
    NOTHING,
    BALL,
    STRIKE,
    ;

    // Nothing이 아닐 경우 true 아닐 경우 false
    public boolean isNotNothing() {
        return this != NOTHING;
    }
}
