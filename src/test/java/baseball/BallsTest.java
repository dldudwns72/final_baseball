package baseball;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;


public class BallsTest {

    Balls answers;

    @BeforeEach
    void setUp(){
        answers = new Balls(Arrays.asList(1,2,3));
    }

    @Test
    @DisplayName("다른 포지션 다른 숫자 = NOTHING")
    void nothing(){
        BallStatus status = answers.play(new Ball(1,9));
        assertThat(status).isEqualTo(BallStatus.NOTHING);
    }

    @Test
    @DisplayName("다른 포지션 다른 숫자 = NOTHING")
    void ball()
    {
        BallStatus status = answers.play(new Ball(1,2));
        assertThat(status).isEqualTo(BallStatus.BALL);
    }

    @Test
    @DisplayName("같은 포지션 같은 숫자 = STRIKE")
    void strike()
    {
        BallStatus status = answers.play(new Ball(1,1));
        assertThat(status).isEqualTo(BallStatus.STRIKE);
    }
}
