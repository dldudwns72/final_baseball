package baseball;

public class Judge {

    private Ball ball1;
    private Ball ball2;

    public Judge(Ball ball1, Ball ball2) {
        this.ball1 = ball1;
        this.ball2 = ball2;
    }

    public String discriminate(){
        if(ball1.getBall() == ball2.getBall()){
            return isStrike(ball1.getPosition(),ball2.getPosition());
        }
        return "NOTHING";
    }

    private String isStrike(int ballPosition1, int ballPosition2){
        if(ballPosition1 == ballPosition2){
            return "STRIKE";
        }

        if(ballPosition1 != ballPosition2){
            return "BALL";
        }

        return "NOTHING";
    }


}
