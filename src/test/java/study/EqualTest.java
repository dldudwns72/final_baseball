package study;

import baseball.Ball;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class EqualTest {

    @Test
    @DisplayName("Equal() 메소드 테스트")
    public void equalsTest() {
        Ball ball1 = new Ball(0, 1);
        Ball ball2 = new Ball(0, 1);

        boolean result = ball1.equals(ball2);

        assertThat(result).isTrue();
    }

    @Test
    @DisplayName("Equal() 메소드 실패 테스트")
    public void equalsFailTest() {
        Ball ball1 = new Ball(0, 1);
        Ball ball2 = new Ball(0, 2);

        boolean result = ball1.equals(ball2);

        assertThat(result).isFalse();
    }

}
