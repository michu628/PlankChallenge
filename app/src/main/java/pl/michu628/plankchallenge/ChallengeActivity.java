package pl.michu628.plankchallenge;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class ChallengeActivity extends ActionBarActivity {

    private static final int TIME_INTERVAL = 1000;
    private static final int DELAY_TIME = 10000;

    int trainingTime = 11000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_challenge);

        final TextView time = (TextView) findViewById(R.id.clockwatch);

        Button start = (Button) findViewById(R.id.startButton);
        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                countTime(trainingTime,time);
            }
        });

        Button startWithDelay = (Button) findViewById(R.id.delayButton);
        startWithDelay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new CountDownTimer(DELAY_TIME,TIME_INTERVAL){
                    @Override
                    public void onTick(long millisUntilFinished) {
                        time.setText("Zaczynamy za: " + millisUntilFinished/1000);
                    }

                    @Override
                    public void onFinish() {
                        time.setText("Start!");
                        countTime(trainingTime,time);
                    }
                }.start();
            }
        });
    }

    private void countTime (final int trainingTime, final TextView time){
        new CountDownTimer(trainingTime,TIME_INTERVAL){
            @Override
            public void onTick(long millisUntilFinished) {
                time.setText("Czas: " + (trainingTime - millisUntilFinished)/1000);
            }

            @Override
            public void onFinish() {
                time.setText("GRATULACJE!");
            }
        }.start();
    }
}
