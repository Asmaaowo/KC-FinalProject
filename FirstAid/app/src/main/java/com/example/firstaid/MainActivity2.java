package com.example.firstaid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {
    ArrayList<Hmm> stepArrayList = new ArrayList<Hmm>();
    int currentstep = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        getSupportActionBar().hide();

        Button button = findViewById(R.id.button3);
        TextView steps = findViewById(R.id.stepsword);
        ImageView image = findViewById(R.id.imageViewhehe);
        TextView numbe = findViewById(R.id.textView8);

        Intent intent = new Intent();
        Hmm stepwoundsonee = new Hmm("قم بالجلوس في وضع قائم و قم بإحناء الرأس قليلاً للأمام حتى لا تقم ببلع الدم",1,R.drawable.step1);
        Hmm stepwoundstwo= new Hmm("قم بالضغط على طرف أنفك اللين بأصبعي السبابة و الإبهام لمدة 5 دقائق متواصلة و قم بالتنفس من الفم وإذا لم يقف النزيف ، فعليك أن تبقى لمدة 10 دقائق حتى يقف النزيف",2,R.drawable.twow);
        Hmm stepwoundsthree = new Hmm("حاول أن لا تقم بالتمخط أو تنظيف الأنف لمدة 12 ساعة بعد إيقاف النزف حتى لا يعود النزيف مرة ثانية.",3,R.drawable.three);
        Hmm stepwoundsfour = new Hmm(" قم بوضع كمادات باردة أو قطعة من الثلج على أعلى أنفك و ذلك لأن الماء البارد يعمل على تضييق الأوعية الدموية و إيقاف النزف",4,R.drawable.ice);
        Hmm stepwoundsfive = new Hmm("تجنب التدخين والجلوس في  أماكن المخصصة للتدخين", 5,R.drawable.twow);

        stepArrayList.add(stepwoundsonee);
        stepArrayList.add(stepwoundstwo);
        stepArrayList.add(stepwoundsthree);
        stepArrayList.add(stepwoundsfour);
        stepArrayList.add(stepwoundsfive);

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