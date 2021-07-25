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




}
