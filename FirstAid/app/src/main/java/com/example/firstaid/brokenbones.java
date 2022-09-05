package com.example.firstaid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

public class Brokenbones extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_brokenbones);
        getSupportActionBar().hide();

        RelativeLayout firstbreak = findViewById(R.id.firstbreak);
        RelativeLayout second = findViewById(R.id.secondbreak);

        firstbreak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Brokenbones.this, MainActivity3.class);
                startActivity(intent);
            }
        });

        second.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Brokenbones.this, MainActivity4.class);
                startActivity(intent);
            }
        });
    }
}