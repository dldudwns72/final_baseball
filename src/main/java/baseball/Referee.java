package baseball;


import java.util.ArrayList;
import java.util.List;

public class Referee {

    private Balls computerBalls;
    private Balls userBalls;

    private List<String> strikeList = new ArrayList<>();
    private List<String> ballList= new ArrayList<>();

    public Referee(Balls computerBalls, Balls userBalls) {
        this.computerBalls = computerBalls;
        this.userBalls = userBalls;
    }

    public String gameResult() {
        List<String> resultList = new ArrayList<>();

        for (int i = 0; i < computerBalls.getBalls().size(); i++) {
            Ball userBall = userBalls.getBalls().get(i);
            Judge judge = new Judge(computerBalls, userBall);
            resultList.add(judge.discriminate());
        }

        return  getResult(resultList);
    }

    private String getResult(List<String> resultList) {

        for (int i = 0; i < resultList.size(); i++) {

            if (resultList.get(i).equals("STRIKE")) {
                strikeList.add("STRIKE");
            }

            if (resultList.get(i).equals("BALL")) {
                ballList.add("BALL");
            }

        }

        String strikeResult = "";
        String ballResult = "";

        if (strikeList.size() > 0) {
            strikeResult = strikeList.size() + "STRIKE";
        }

        if (ballList.size() > 0) {
            ballResult = ballList.size() + "BALL";
        }

        return strikeResult + ballResult;
    }


}
