package baseball;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BallTest {

    @Test
    @DisplayName("공 생성")
    public void generateBall(){
        Ball ball = new Ball(1);
        assertThat(ball.getBall()).isEqualTo(1);
    }
}
