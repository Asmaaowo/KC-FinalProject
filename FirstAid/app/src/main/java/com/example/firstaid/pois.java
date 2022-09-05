package com.example.firstaid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class pois extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pois);
        getSupportActionBar().hide();
    }
}