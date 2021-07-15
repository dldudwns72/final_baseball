package baseball;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class BallTest {

    @Test
    @DisplayName("0~9 사이의 숫자 생성")
    void create() {
        Ball ball = new Ball(0,9);

        int result = ball.getBall();

        assertThat(result > 10).isEqualTo(false);
        assertThat(result < 0).isEqualTo(false);
        assertThat(0 < result && result < 10).isEqualTo(true);

    }

}
