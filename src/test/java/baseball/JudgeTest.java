package baseball;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class JudgeTest {


    @Test
    @DisplayName("스트라이크 판별")
    public void isStrike(){
        Ball ball1 = new Ball(0,1);
        Ball ball2 = new Ball(0,1);

        Judge judge = new Judge(ball1,ball2);

        String result = judge.discriminate();

        assertThat(result).isEqualTo("STRIKE");
    }

    @Test
    @DisplayName("볼 판별")
    public void isBall(){
        Ball ball1 = new Ball(0,1);
        Ball ball2 = new Ball(1,1);

        Judge judge = new Judge(ball1,ball2);

        String result = judge.discriminate();

        assertThat(result).isEqualTo("BALL");
    }

    @Test
    @DisplayName("낫씽 판별")
    public void isNothing(){
        Ball ball1 = new Ball(0,1);
        Ball ball2 = new Ball(1,2);

        Judge judge = new Judge(ball1,ball2);

        String result = judge.discriminate();

        assertThat(result).isEqualTo("NOTHING");
    }

}
