package com.example.lauron_ifthen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

@Override
protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textlore;
        Button buttondecision1, buttondecision2;

        textlore = findViewById(R.id.textlore);
        buttondecision1 = findViewById(R.id.buttondecision1);
        buttondecision2 = findViewById(R.id.buttondecision2);

        buttondecision1.setOnClickListener(this);
        buttondecision2.setOnClickListener(this);
        textlore = findViewById(R.id.textlore);
        textlore.setText("Are you a man?");
        }
@Override
public void onClick(View view){

        TextView textresult = findViewById(R.id.textresult);


        switch(view.getId()){
        case R.id.buttondecision1:
        textresult.setText("You are trash!!!!");
        break;
        }
        switch(view.getId()){
        case R.id.buttondecision2:
        textresult.setText("OMG ur so perfect!");
        break;
        }


        }
        }