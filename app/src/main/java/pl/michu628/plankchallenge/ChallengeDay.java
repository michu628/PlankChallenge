package pl.michu628.plankchallenge;

/**
 * Created by Michal on 2015-04-08.
 */
public class ChallengeDay {

    private int dayNumber;
    private int time;
    private boolean isComplete;

    public ChallengeDay(int dayNumber, int time, boolean isComplete) {
        this.dayNumber = dayNumber;
        this.time = time;
        this.isComplete = isComplete;
    }

    public int getDayNumber() {
        return dayNumber;
    }

    public int getTime() {
        return time;
    }

    public boolean isComplete() {
        return isComplete;
    }
}
