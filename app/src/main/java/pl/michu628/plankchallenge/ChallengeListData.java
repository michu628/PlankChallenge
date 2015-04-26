package pl.michu628.plankchallenge;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Michal on 2015-04-08.
 */
public class ChallengeListData {

    public static final int NUMBER_OF_CHALLENGE_DAYS = 30;

    private Context mContext;

    private final List<ChallengeDay> challengeDaysList = new ArrayList<>();

    public ChallengeListData(Context context){
        for (int i=1;i<=NUMBER_OF_CHALLENGE_DAYS;i++) {
            challengeDaysList.add(new ChallengeDay(i, i * 10, false));
        }
    }

    public ChallengeDay getChallengeDay(int position){
        return challengeDaysList.get(position);
    }

    public int getNumberOfChallengeDays(){
        return challengeDaysList.size();
    }
}
