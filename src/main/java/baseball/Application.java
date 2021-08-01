package baseball;

import baseball.domain.NumberGenerator;

import java.util.List;

public class Application {
    public static void main(String[] args){
        NumberGenerator generator = new NumberGenerator();
        List<Integer> numbers = generator.createRandomNumber();
        System.out.print(numbers);  // 이것은 왜 바로 [1,1,2] 형태로 바로 보이는가 ? integer이라?

    }
}
