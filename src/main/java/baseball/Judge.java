package baseball;

public class Judge {

    private Ball computerBall;
    private Ball userBall;

    public Judge(Ball computerBall, Ball userBall) {
        this.computerBall = computerBall;
        this.userBall = userBall;
    }

    public String discriminate(){

        if(computerBall.getBall() == userBall.getBall()){
            return strikeOrBall(computerBall.getPosition(),userBall.getPosition());
        }

        return "NOTHING";
    }

    private String strikeOrBall(int computerBallPosition, int userBallPosition){
        if(computerBallPosition == userBallPosition){
            return "STRIKE";
        }

        return "BALL";
    }


}
