package com.example.leon_chen.numbergame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private int num1 = 0;
    private int num2 = 0;
    private int points =0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pickNumbers();

    }
    public void pickNumbers(){
        Button leftBtn =(Button)findViewById(R.id.leftButton);
        Button rightBtn =(Button)findViewById(R.id.rightButton);

        Random randy = new Random();

        while(true)
        {
            num1 = randy.nextInt(10);
            num2 = randy.nextInt(10);
            if(num1 != num2) break;
        }

        System.out.print("num1: "+num1+"num2: "+num2);
        leftBtn.setText("" + num1);
        rightBtn.setText("" + num2);


    }
    public void leftBtnClick(View view) {
        //Button btn= (Button) findViewById(R.id.leftButton);
        //Toast.makeText(this,"Left Button Clicked",Toast.LENGTH_SHORT).show();
        if(num1 > num2){
            Toast.makeText(this,"Correct",Toast.LENGTH_SHORT).show();
            points++;
        }else{
            Toast.makeText(this,"Wrong",Toast.LENGTH_SHORT).show();
            points--;
        }
        pickNumbers();
        TextView pointsView = (TextView) findViewById(R.id.pointTextView);
        pointsView.setText("Score： "+points);
    }

    public void rightBtnClick(View view) {
        //Button btn= (Button) findViewById(R.id.rightButton);
        //Toast.makeText(this,"Right Button Clicked",Toast.LENGTH_SHORT).show();
        if(num2 > num1){
            Toast.makeText(this,"Correct",Toast.LENGTH_SHORT).show();
            points++;
        }else {
            Toast.makeText(this, "Wrong", Toast.LENGTH_SHORT).show();
            points--;
        }
        pickNumbers();

        TextView pointsView = (TextView) findViewById(R.id.pointTextView);
        pointsView.setText("Score： "+points);
    }
}
