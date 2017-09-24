package com.example.leon_chen.sciiquiz;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

/**
 * Created by Leon_Chen on 9/23/17.
 */

public class Activity_final extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_f);

        View v = findViewById(R.id.t1_top);
        v.getBackground().setAlpha(150);
    }
}
