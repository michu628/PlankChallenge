package pl.michu628.plankchallenge;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

public class ChallengeListActivity extends ActionBarActivity {

    private ListView mDaysList;
    private DaysListAdapter mDaysListAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_challenge_list_actvity);

        initializeList();
    }

    private void initializeList(){

        mDaysList = (ListView) findViewById(R.id.daysList);

        mDaysListAdapter = new DaysListAdapter(this);

        mDaysList.setAdapter(mDaysListAdapter);

        mDaysList.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                displayChallenge();
            }
        });

    }

    private void displayChallenge(){
        Intent i = new Intent(getApplicationContext(), ChallengeActivity.class);
        startActivity(i);
    }
}
