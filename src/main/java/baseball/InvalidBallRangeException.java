package baseball;

public class InvalidBallRangeException extends IllegalArgumentException {

    public InvalidBallRangeException(String invalidBallRangeMessage) {
        super(invalidBallRangeMessage);
    }
}
