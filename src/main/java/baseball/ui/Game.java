package baseball.ui;

import baseball.Ball;
import baseball.Balls;

import java.util.*;

public class Game {
    public static void main(String args[]) {

    }

    // Main 메소드 안에 있음으로 해당 메소드를 사용하기 위해서는 정적 메소드로 선언해야한다.
    public static List<Integer> askNumbers(){
        System.out.print("숫자를 입력해 주세요");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();

        List<Integer> numbers = new ArrayList<>();

        for(String number : input.split("")){
            numbers.add(Integer.valueOf(number));
        }

        return numbers;
    }
}
