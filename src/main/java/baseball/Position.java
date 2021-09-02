package baseball;

public class Position {
    private static final int MAX_POSITION = 2;
    private static final int MIN_POSITION = 0;
    private int position;

    public Position(int position) {
        rangeValidation(position);
        this.position = position;
    }

    public int getPosition() {
        return position;
    }

    private void rangeValidation(int position){
        if(position < MIN_POSITION || position > MAX_POSITION){
            throw new PositionException("공의 위치는 0이상 2하이여야 합니다.");
        }
    }
}
