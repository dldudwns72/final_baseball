package baseball.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class NumberGenerator {
    public List<Integer> createRandomNumber() {
        List<Integer> numbers = new ArrayList<>();

        while (numbers.size() < 3) {
            int number = new Random().nextInt(9) + 1;

            // 이미 존재하는 숫자라면 numbers에 담지 않는다.
            if (numbers.contains(number)) {
                continue;
            } else {
                numbers.add(number);
            }
        }


        return numbers;
    }
}
