package com.example.firstaid;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

public class Woundss extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_woundss);
        getSupportActionBar().hide();
        //Button bleednose = findViewById(R.id.bleednose);
        RelativeLayout brises = findViewById(R.id.bruises);
        //RelativeLayout woandsi = findViewById(R.id.woundsss);

        brises.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentt = new Intent(Woundss.this, MainActivity2.class);
                startActivity(intentt);
            }
        });



    }
}