package com.example.firstaid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity4 extends AppCompatActivity {
    ArrayList<Hmm> stepArrayList = new ArrayList<Hmm>();
    int currentstep = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        getSupportActionBar().hide();

        Button button = findViewById(R.id.button3);
        TextView steps = findViewById(R.id.stepsword);
        ImageView image = findViewById(R.id.imageViewhehe);
        TextView numbe = findViewById(R.id.textView8);
        ImageView imageView = findViewById(R.id.imageView);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentt = new Intent(MainActivity4.this, Home.class);
                startActivity(intentt);
            }
        });

        Intent intent = new Intent();
        Hmm stepwoundsonee = new Hmm("قد يحتاج المريض إلى عملية جراحية لمعالجة إصابة الكسر، فإن تزويد المريض بالطعام أو الشراب عن طريق الفم قد يؤخر من إعطاء المريض المخدر العام؛ لذا تجنب ذلك.",1,R.drawable.no);
        Hmm stepwoundstwo= new Hmm(" يجب الحرص في التعامل مع الشخص الذي سقط، وعدم تحريك مختلف أعضاء الجسم.",2,R.drawable.donttouch);
        Hmm stepwoundsthreee = new Hmm("لا يجب القيام بدور الطبيب ومحاولة إعادة العظم لمكانها حتى لا تتفاقم المشكلة، فما عليك فعله هو تثبيت الأماكن التي يتألم منها الشخص وعدم تحريكه إلا خلال وجود الطبيب المختص." , 3,R.drawable.donttouch);
        Hmm stepwoundsthree = new Hmm("لا تقم باستعمال الجزء المكسور كالمشي عليه او ايا كان." ,4,R.drawable.walk);


        stepArrayList.add(stepwoundsonee);
        stepArrayList.add(stepwoundstwo);
        stepArrayList.add(stepwoundsthreee);
        stepArrayList.add(stepwoundsthree);

        image.setImageResource(stepArrayList.get(currentstep).getStepphoto());
        steps.setText(stepArrayList.get(currentstep).getSteps());
        numbe.setText(String.valueOf(stepArrayList.get(currentstep).getNumstep()));

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                currentstep++;
                image.setImageResource(stepArrayList.get(currentstep).getStepphoto());
                steps.setText(stepArrayList.get(currentstep).getSteps());
                numbe.setText(String.valueOf(stepArrayList.get(currentstep).getNumstep()));

            }
        });
    }


}