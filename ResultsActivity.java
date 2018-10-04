package edu.sunyulster.meldiesestrella.roadquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by meldiesestrella on 10/4/18.
 */

public class ResultsActivity extends AppCompatActivity {
    TextView Grade, FinalScore;
    Button Retry;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);

        FinalScore = (TextView)findViewById(R.id.outOf);
        Retry = (Button)findViewById(R.id.retry);


        Bundle bundle = getIntent().getExtras();
        int score = bundle.getInt("finalScore");

        FinalScore.setText("You scored " + score + " out of " + QuizQuestions.Questions.length);

        Retry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ResultsActivity.this, MainActivity.class));
                ResultsActivity.this.finish();
            }
        });

    }
}


