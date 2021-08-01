package baseball.domain;

import java.util.List;

public class Judgement {
    public int correctCount(List<Integer> computer, List<Integer> player){
        int result = 0;
        for (int i = 0; i < computer.size(); i++) {
            if(computer.contains(player.get(i))){
                result++;
            }
        }
        return result;
    }

    public boolean hasPlcae(List<Integer> computer,int place, int number){
        return  false;
    }
}
