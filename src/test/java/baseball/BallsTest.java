package baseball;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class BallsTest {


    @Test
    @DisplayName("세자리수의 공 생성")
    public void createBalls() {

        List<Ball> computerBalls = new ArrayList<>();
        computerBalls.add(new Ball(0, 1));
        computerBalls.add(new Ball(1, 2));
        computerBalls.add(new Ball(2, 3));

        int computerBallsSize = computerBalls.size();
        assertThat(computerBallsSize).isEqualTo(3);
    }

    @Test
    @DisplayName("중복된 공 생성 시 에러 발생")
    public void duplicatedBalls() {
        assertThatThrownBy(()->{
            List<Ball> computerBallList = new ArrayList<>();
            computerBallList.add(new Ball(0, 1));
            computerBallList.add(new Ball(1, 2));
            computerBallList.add(new Ball(2, 2));

            Balls computerBalls = new Balls(computerBallList);
        }).isInstanceOf(BallException.class);

    }


}
