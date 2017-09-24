package com.example.leon_chen.sciiquiz;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

/**
 * Created by Leon_Chen on 9/23/17.
 */

public class Activity_2 extends Activity {


    ImageButton t_type;
    ImageButton z_type;
    ImageButton p_type;
    ImageButton r_type;
    Button t;
    Button z;
    Button p;
    Button r;



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        t_type = (ImageButton) findViewById(R.id.imbtn_1);
        t_type.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(Activity_2.this, Activity_t1.class);
                startActivity(intent);

            }
        });

        z_type = (ImageButton) findViewById(R.id.imbtn_2);
        z_type.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(Activity_2.this, Activity_z1.class);
                startActivity(intent);

            }
        });
        p_type = (ImageButton) findViewById(R.id.imbtn_3);
        p_type.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(Activity_2.this, Activity_p1.class);
                startActivity(intent);

            }
        });
        r_type = (ImageButton) findViewById(R.id.imbtn_4);
        r_type.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(Activity_2.this, Activity_r1.class);
                startActivity(intent);

            }
        });

        t = (Button) findViewById(R.id.btn_t);
        t.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(Activity_2.this, Activity_t1.class);
                startActivity(intent);

            }
        });
        z = (Button) findViewById(R.id.btn_z);
        z.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(Activity_2.this, Activity_z1.class);
                startActivity(intent);

            }
        });
        p = (Button) findViewById(R.id.btn_p);
        p.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(Activity_2.this, Activity_p1.class);
                startActivity(intent);

            }
        });
        r = (Button) findViewById(R.id.btn_r);
        r.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(Activity_2.this, Activity_r1.class);
                startActivity(intent);

            }
        });



    }


}
