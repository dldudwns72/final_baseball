package baseball;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class JudgeTest {

    private Balls computerBalls;

    @BeforeEach
    public void setUp() {
        computerBalls = new Balls(
                Arrays.asList(
                        new Ball(0, 1),
                        new Ball(1, 2),
                        new Ball(2, 3)));
    }

    @Test
    @DisplayName("스트라이크 판별")
    public void isStrike() {
        Ball userBall = new Ball(0, 1);

        Judge judge = new Judge(computerBalls,userBall);

        String result = judge.discriminate();

        assertThat(result).isEqualTo("STRIKE");
    }

    @Test
    @DisplayName("볼 판별")
    public void isBall() {
        Ball userBall = new Ball(0, 3);

        Judge judge = new Judge(computerBalls, userBall);

        String result = judge.discriminate();

        assertThat(result).isEqualTo("BALL");
    }

    @Test
    @DisplayName("낫씽 판별")
    public void isNothing() {
        Ball userBall = new Ball(0, 5);

        Judge judge = new Judge(computerBalls, userBall);

        String result = judge.discriminate();

        assertThat(result).isEqualTo("NOTHING");
    }

}
