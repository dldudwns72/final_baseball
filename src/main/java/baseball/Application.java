package baseball;

import baseball.domain.Judgement;
import baseball.domain.NumberGenerator;

import java.util.Arrays;
import java.util.List;

public class Application {
    public static void main(String[] args){
        NumberGenerator generator = new NumberGenerator();
        List<Integer> numbers = generator.createRandomNumber();
        System.out.println(numbers);  // 이것은 왜 바로 [1,1,2] 형태로 바로 보이는가 ? integer이라?

        Judgement judgement = new Judgement();
        int count = judgement.correctCount(Arrays.asList(1,5,3),Arrays.asList(1,2,3));

        System.out.print("count" + count);
    }
}
