package com.example.firstaid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

public class woundss extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_woundss);
        getSupportActionBar().hide();
        RelativeLayout bleednose = findViewById(R.id.bleednose);
        RelativeLayout bru = findViewById(R.id.bruises);
        RelativeLayout woandsi = findViewById(R.id.woundsss);
        stepwoundsone stepwoundsone;

        bleednose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(woundss.this, firstwounds.class);
                startActivity(intent);
            }
        });



    }
}