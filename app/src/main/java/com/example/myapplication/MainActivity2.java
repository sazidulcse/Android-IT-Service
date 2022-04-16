package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
TextView  tvcount ; Button sum ,baking, minus, reset;
int count = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        // init  variable
        tvcount = findViewById(R.id.tvcount);
        sum = findViewById(R.id.sum);
        minus = findViewById( R.id.minus);
        reset = findViewById(R.id.reset);
        baking = findViewById(R.id.backing);

        sum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count = count +1;
                tvcount.setText(""+count);
            }
        });



        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count = count -1;
                tvcount.setText(""+count);
            }
        });




        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count = 0;
                tvcount.setText(""+count);
            }
        });
baking.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent myIntent = new Intent(MainActivity2.this,MainActivity.class);
        startActivity(myIntent);
    }
});



    }
}