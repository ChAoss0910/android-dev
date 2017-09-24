package com.example.leon_chen.sciiquiz;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by lysm on 9/23/17.
 */

public class Activity_final extends Activity {
    private int f_score=0;
    private Button btnRstrt;
    private ImageView l_arrow;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_f);
        TextView score = findViewById(R.id.score);
        score.setText(Integer.toString(f_score));
        if (new Activity_t1().updateScore() >0) {
            f_score = new Activity_t1().updateScore();
        }
        else if (new Activity_p1().updateScore() >0) {
            f_score = new Activity_p1().updateScore();
        }
        else if (new Activity_r1().updateScore() >0) {
            f_score = new Activity_r1().updateScore();
        }
        else if (new Activity_z1().updateScore() >0) {
            f_score = new Activity_z1().updateScore();
        }
        score.setText(Integer.toString(f_score));

        l_arrow = (ImageView) findViewById(R.id.left_arrow);
        l_arrow.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                f_score =0;
                TextView score = findViewById(R.id.score);
                score.setText(Integer.toString(f_score));
                Intent intent = new Intent();
                intent.setClass(Activity_final.this, Activity_2.class);
                startActivity(intent);
                View v = findViewById(R.id.t1_top);
                v.getBackground().setAlpha(150);
            }
        });

        btnRstrt = (Button)findViewById(R.id.rstrt_btn);
        btnRstrt.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                f_score =0;
                TextView score = findViewById(R.id.score);
                score.setText(Integer.toString(f_score));
                Intent intent = new Intent();
                intent.setClass(Activity_final.this, Activity_2.class);
                startActivity(intent);
                View v = findViewById(R.id.t1_top);
                v.getBackground().setAlpha(150);
            }
        });
    };
}