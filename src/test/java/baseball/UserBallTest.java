package baseball;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class UserBallTest {

    @Test
    @DisplayName("사용자 입력값 숫자")
    public void isNumber(){
        Ball ball1 = new Ball(0,9);
        Ball ball2 = new Ball(0,9);
        Ball ball3 = new Ball(0,9);

        List<Ball> ballList = new ArrayList<>();

        ballList.add(ball1);
        ballList.add(ball2);
        ballList.add(ball3);

        Balls balls = new Balls(ballList);




    }
}
