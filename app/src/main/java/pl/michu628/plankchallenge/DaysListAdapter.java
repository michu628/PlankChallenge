package pl.michu628.plankchallenge;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

/**
 * Created by Michal on 2015-04-08.
 */
public class DaysListAdapter extends BaseAdapter {

    private Context mContext;
    private ChallengeListData mChallengeListData;

    public DaysListAdapter(Context context) {
        this.mContext = context;
        this.mChallengeListData = new ChallengeListData(context);
    }

    @Override
    public int getCount() {
        return mChallengeListData.getNumberOfChallengeDays();
    }

    @Override
    public ChallengeDay getItem(int position) {
        return mChallengeListData.getChallengeDay(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View challengeDayView;

        if (convertView == null) {
            challengeDayView = LayoutInflater.from(mContext).inflate(R.layout.challenge_day_row, parent, false);
        } else {
            challengeDayView = convertView;
        }

        return challengeDayView;
    }
}
