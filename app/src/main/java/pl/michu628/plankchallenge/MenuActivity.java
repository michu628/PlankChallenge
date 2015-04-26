package pl.michu628.plankchallenge;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.GridView;
import android.widget.Toast;


public class MenuActivity extends ActionBarActivity {

    private GridView mGridView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        Button trainingButton = (Button) findViewById(R.id.trainingMenuButton);
        trainingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(getApplicationContext(),ChallengeListActivity.class);
                startActivity(i);
            }
        });


    }

    private void getChallengesNames()


}
