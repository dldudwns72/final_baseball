package baseball;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class BallTest {

    @Test
    @DisplayName("숫자 1~9 사이의 공 밸리데이션")
    void isValidBall(){
        assertThatThrownBy(()->{
            Ball ball = new Ball(1,10);
        }).isInstanceOf(InvalidBallRangeException.class).hasMessage("공 숫자의 범위를 벗어났습니다.");
    }

    @Test
    @DisplayName("공 위치와 숫자가 일치하면 STRIKE")
    void strike(){
        Ball ball = new Ball(1,9);
        BallStatus status = ball.play(1, 9);
        assertThat(status).isEqualTo(BallStatus.STRIKE);
    }

    @Test
    @DisplayName("공 위치가 다르며 숫자가 일치하면 BALL")
    void ball(){
        Ball ball = new Ball(1,9);
        BallStatus status = ball.play(2,9);
        assertThat(status).isEqualTo(BallStatus.BALL);
    }

    @Test
    @DisplayName("공 위치가 다르며 숫자도 다를 경우 NOTHING")
    void nothing(){
        Ball ball = new Ball(1,9);
        BallStatus status = ball.play(2,3);
        assertThat(status).isEqualTo(BallStatus.NOTHING);
    }





}
