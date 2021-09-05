package baseball;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class BallsTest {

    private Balls balls;
    private List<Ball> computerBalls;

    @BeforeEach
    public void setUp() {
        computerBalls = new ArrayList<>();
        computerBalls.add(new Ball(0,1));
        computerBalls.add(new Ball(1,2));
        computerBalls.add(new Ball(2,2));

        balls = new Balls(computerBalls);
    }

    @Test
    @DisplayName("세자리수의 공 생성")
    public void createBalls() {
        int computerBallsSize = computerBalls.size();
        assertThat(computerBallsSize).isEqualTo(3);
    }

}
