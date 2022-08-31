package com.example.firstaid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import java.net.URI;

import kotlin.LateinitKt;

public class home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        getSupportActionBar().hide();

        Button button = findViewById(R.id.button2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:112"));
                startActivity(intent);
            }
        });

        LinearLayout wounds = findViewById(R.id.layoutgoal);
        LinearLayout burn = findViewById(R.id.layoutio);
        LinearLayout choking = findViewById(R.id.layoutnom);
        LinearLayout poison = findViewById(R.id.layoutum);
        LinearLayout forcaa = findViewById(R.id.layoufour);
        LinearLayout broken = findViewById(R.id.layoutom);

        wounds.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(home.this, woundss.class);
                startActivity(intent);
            }
        });

        burn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(home.this, burns.class);
                startActivity(intent);
            }
        });

        broken.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(home.this, brokenbones.class);
                startActivity(intent);
            }
        });

        choking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(home.this, choking.class);
                startActivity(intent);
            }
        });

        poison.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(home.this, poisoningcases.class);
                startActivity(intent);
            }
        });

        forcaa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(home.this, forcardiopulmonaryresuscitation.class);
                startActivity(intent);
            }
        });


    }
}