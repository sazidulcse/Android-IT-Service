package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
Button sazidBtn,nextpage,webpage; TextView sazidDis;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout3);
        sazidBtn = findViewById(R.id.sazidBtn);
        sazidDis = findViewById(R.id.sazidDis);
        nextpage = findViewById(R.id.nextpage);
        webpage = findViewById(R.id.webpage);
        sazidBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sazidDis.setText("Hi This is Properly Working");

            }
        });
sazidDis.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        sazidBtn.setText("buttan text change");
    }
});


nextpage.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent myintent= new Intent(MainActivity.this,MainActivity2.class);
        startActivity(myintent);
    }
});

webpage.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent myIntent = new Intent(MainActivity.this,WebActivity3.class);
        startActivity(myIntent);
    }
});


    }
}