package baseball.dto;

public class BaseballScore {
    private int strikeCount;
    private int ballcount;
    private int nothing;

    public BaseballScore() {
        this.strikeCount = 0;
        this.ballcount = 0;
        this.nothing = 0;
    }

    public void plusStrikeCount() {
        strikeCount++;
    }

    public void plusBallCount() {
        ballcount++;
    }

    public void plusNothingCount() {
        nothing++;
    }

    public int getStrikeCount() {
        return strikeCount;
    }

    public int getBallCount() {
        return ballcount;
    }

    public int getNothingCount() {
        return nothing;
    }

    public boolean checkGameTry() {
        if (strikeCount == 3) {
            return false;
        } else {
            return true;
        }
    }
}
