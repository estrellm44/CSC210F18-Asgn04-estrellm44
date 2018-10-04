package edu.sunyulster.meldiesestrella.roadquiz;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView ScoreView;
    private TextView QuestionView;
    private ImageView ImageView;
    private Button mTrueButton, mFalseButton;
    private Button ButtonChoice1;
    private Button ButtonChoice2;
    private Button ButtonChoice3;

    private String Answer;
    //private String mAnswer;
    private int Score = 0;
    private int QuestionNumber = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ScoreView = (TextView) findViewById(R.id.score);
        ImageView = (ImageView) findViewById(R.id.imageView);
        QuestionView = (TextView) findViewById(R.id.question);
        //mTrueButton = (Button)findViewById(R.id.trueButton);
        //mFalseButton = (Button)findViewById(R.id.falseButton);
        ButtonChoice1 = (Button) findViewById(R.id.choice1);
        ButtonChoice2 = (Button) findViewById(R.id.choice2);
        ButtonChoice3 = (Button) findViewById(R.id.choice3);

        updateQuestion();

        //Logic for true button
        ButtonChoice1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ButtonChoice1.getText() == Answer) {
                    Score++;
                    updateScore(Score);

                    //perform check before you update the question
                    if (QuestionNumber == QuizQuestions.Questions.length) {
                        Intent i = new Intent(MainActivity.this, ResultsActivity.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("finalScore", Score);
                        i.putExtras(bundle);
                        MainActivity.this.finish();
                        startActivity(i);
                    } else {
                        updateQuestion();
                    }
                } else {
                    if (QuestionNumber == QuizQuestions.Questions.length) {
                        Intent i = new Intent(MainActivity.this, ResultsActivity.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("finalScore", Score);
                        i.putExtras(bundle);
                        MainActivity.this.finish();
                        startActivity(i);
                    } else {
                        updateQuestion();
                    }
                }
            }
        });


        ButtonChoice2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ButtonChoice2.getText() == Answer) {
                    Score++;
                    updateScore(Score);

                    //perform check before you update the question
                    if (QuestionNumber == QuizQuestions.Questions.length) {
                        Intent i = new Intent(MainActivity.this, ResultsActivity.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("finalScore", Score);
                        i.putExtras(bundle);
                        MainActivity.this.finish();
                        startActivity(i);
                    } else {
                        updateQuestion();
                    }
                } else {
                    if (QuestionNumber == QuizQuestions.Questions.length) {
                        Intent i = new Intent(MainActivity.this, ResultsActivity.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("finalScore", Score);
                        i.putExtras(bundle);
                        MainActivity.this.finish();
                        startActivity(i);
                    } else {
                        updateQuestion();
                    }
                }
            }
        });


        ButtonChoice3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ButtonChoice3.getText() == Answer) {
                    Score++;
                    updateScore(Score);

                    //perform check before you update the question
                    if (QuestionNumber == QuizQuestions.Questions.length) {
                        Intent i = new Intent(MainActivity.this, ResultsActivity.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("finalScore", Score);
                        i.putExtras(bundle);
                        MainActivity.this.finish();
                        startActivity(i);
                    } else {
                        updateQuestion();
                    }
                } else {
                    if (QuestionNumber == QuizQuestions.Questions.length) {
                        Intent i = new Intent(MainActivity.this, ResultsActivity.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("finalScore", Score);
                        i.putExtras(bundle);
                        MainActivity.this.finish();
                        startActivity(i);
                    } else {
                        updateQuestion();
                    }
                }
            }
        });
    }

    private void updateQuestion() {

        ImageView.setImageResource(QuizQuestions.Images[QuestionNumber]);
        QuestionView.setText(QuizQuestions.Questions[QuestionNumber]);
        ButtonChoice1.setText(QuizQuestions.getChoice1(QuestionNumber));
        ButtonChoice2.setText(QuizQuestions.getChoice2(QuestionNumber));
        ButtonChoice3.setText(QuizQuestions.getChoice3(QuestionNumber));

        Answer = QuizQuestions.Answers[QuestionNumber];
        QuestionNumber++;
    }

    private void updateScore(int point) {ScoreView.setText("" + Score);
    }

    public void clickExit(View view) {
        askToClose();
    }

    @Override
    public void onBackPressed() {
        askToClose();
    }

    private void askToClose (){
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        builder.setMessage("Are you sure you want to quit?");
        builder.setCancelable(true);
        builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int id) {
                finish();
            }
        });
        builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int id) {
                dialog.cancel();

            }
        });
        AlertDialog alert = builder.create();
        alert.show();
    }
}
