package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
Button sazidBtn; TextView sazidDis;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout3);
        sazidBtn = findViewById(R.id.sazidBtn);
        sazidDis = findViewById(R.id.sazidDis);
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


    }
}