package com.example.leon_chen.sciiquiz;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Leon_Chen on 9/23/17.
 */

public class Activity_r1 extends Activity{
    private Quiz_library mQuestionLibrary = new Quiz_library();
    //private TextView mScoreView;
    private TextView mQuestionView;
    private Button mButtonChoice1;
    private Button mButtonChoice2;
    private Button mButtonChoice3;
    private Button mButtonChoice4;
    private ProgressBar progressBar;

    private String mAnswer;
    private static int mScore;
    private int mQuestionNumber = 0;

    ImageView l_arrow;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_r1);
        mScore = 0;
        View v = findViewById(R.id.t1_top);
        v.getBackground().setAlpha(200);

        progressBar = (ProgressBar) findViewById(R.id.progress);
        l_arrow = (ImageView) findViewById(R.id.left_arrow);
        l_arrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(progressBar.getProgress() == 25){
                    Intent intent = new Intent();
                    intent.setClass(Activity_r1.this, Activity_2.class);
                    startActivity(intent);

                }
                else{
                    progressBar.setProgress(progressBar.getProgress() - 25);
                    backQuestion();
                }

            }
        });
        View vt1 = findViewById(R.id.content_t1);
        vt1.getBackground().setAlpha(200);



        mQuestionView = (TextView) findViewById(R.id.question);
        mButtonChoice1 = (Button) findViewById(R.id.choice1);
        mButtonChoice2 = (Button) findViewById(R.id.choice2);
        mButtonChoice3 = (Button) findViewById(R.id.choice3);
        mButtonChoice4 = (Button) findViewById(R.id.choice4);

        showQuestion();
        //Start of Button Listener for Button1
        mButtonChoice1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //My logic for Button goes in here


                progressBar.setProgress(progressBar.getProgress() + 25);
                if (mButtonChoice1.getText() == mAnswer) {
                    mScore = mScore + 1;
                    //This line of code is optiona
                    Toast.makeText(Activity_r1.this, "correct", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(Activity_r1.this, "wrong", Toast.LENGTH_SHORT).show();
                }
                if(mQuestionNumber == 3){
                    Intent intent = new Intent();
                    intent.setClass(Activity_r1.this, Activity_final.class);
                    startActivity(intent);
                }
                else
                    updateQuestion();


            }
        });

        //End of Button Listener for Button1

        //Start of Button Listener for Button2
        mButtonChoice2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //My logic for Button goes in here

                progressBar.setProgress(progressBar.getProgress() + 25);
                if (mButtonChoice2.getText() == mAnswer) {
                    mScore = mScore + 1;
                    //This line of code is optiona
                    Toast.makeText(Activity_r1.this, "correct", Toast.LENGTH_SHORT).show();

                } else {
                    Toast.makeText(Activity_r1.this, "wrong", Toast.LENGTH_SHORT).show();

                }
                if (mQuestionNumber == 3) {
                    Intent intent = new Intent();
                    intent.setClass(Activity_r1.this, Activity_final.class);
                    startActivity(intent);
                } else
                    updateQuestion();


            }
        });

        //End of Button Listener for Button2


        //Start of Button Listener for Button3
        mButtonChoice3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //My logic for Button goes in here

                progressBar.setProgress(progressBar.getProgress() + 25);
                if (mButtonChoice3.getText() == mAnswer) {
                    mScore = mScore + 1;
                    //This line of code is optiona
                    Toast.makeText(Activity_r1.this, "correct", Toast.LENGTH_SHORT).show();

                } else {
                    Toast.makeText(Activity_r1.this, "wrong", Toast.LENGTH_SHORT).show();
                }
                if(mQuestionNumber == 3){
                    Intent intent = new Intent();
                    intent.setClass(Activity_r1.this, Activity_final.class);
                    startActivity(intent);
                }
                else
                    updateQuestion();


            }
        });

        //End of Button Listener for Button3

        //Start of Button Listener for Button4
        mButtonChoice4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //My logic for Button goes in here

                progressBar.setProgress(progressBar.getProgress() + 25);
                if (mButtonChoice4.getText() == mAnswer) {
                    mScore = mScore + 1;
                    //This line of code is optional
                    Toast.makeText(Activity_r1.this, "correct", Toast.LENGTH_SHORT).show();

                } else {
                    Toast.makeText(Activity_r1.this, "wrong", Toast.LENGTH_SHORT).show();
                }
                if(mQuestionNumber == 3){
                    Intent intent = new Intent();
                    intent.setClass(Activity_r1.this, Activity_final.class);
                    startActivity(intent);
                }
                else
                    updateQuestion();
            }

        });

        //End of Button Listener for Button4
    }
    private void showQuestion(){
        mQuestionView.setText(mQuestionLibrary.getQuestion(mQuestionNumber));
        mButtonChoice1.setText(mQuestionLibrary.getChoice1(mQuestionNumber));
        mButtonChoice2.setText(mQuestionLibrary.getChoice2(mQuestionNumber));
        mButtonChoice3.setText(mQuestionLibrary.getChoice3(mQuestionNumber));
        mButtonChoice4.setText(mQuestionLibrary.getChoice4(mQuestionNumber));

    }
    private void updateQuestion(){
        mQuestionNumber++;
        mQuestionView.setText(mQuestionLibrary.getQuestion(mQuestionNumber));
        mButtonChoice1.setText(mQuestionLibrary.getChoice1(mQuestionNumber));
        mButtonChoice2.setText(mQuestionLibrary.getChoice2(mQuestionNumber));
        mButtonChoice3.setText(mQuestionLibrary.getChoice3(mQuestionNumber));
        mButtonChoice4.setText(mQuestionLibrary.getChoice4(mQuestionNumber));

        mAnswer = mQuestionLibrary.getCorrectAnswer(mQuestionNumber);
    }

    private void backQuestion(){
        mQuestionNumber--;
        mQuestionView.setText(mQuestionLibrary.getQuestion(mQuestionNumber));
        mButtonChoice1.setText(mQuestionLibrary.getChoice1(mQuestionNumber));
        mButtonChoice2.setText(mQuestionLibrary.getChoice2(mQuestionNumber));
        mButtonChoice3.setText(mQuestionLibrary.getChoice3(mQuestionNumber));
        mButtonChoice4.setText(mQuestionLibrary.getChoice4(mQuestionNumber));

        mAnswer = mQuestionLibrary.getCorrectAnswer(mQuestionNumber);
    }

    public int updateScore() {
        return mScore;
    }
}
