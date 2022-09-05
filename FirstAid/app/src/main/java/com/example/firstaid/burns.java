package com.example.firstaid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class Burns extends AppCompatActivity {
    ArrayList<Hmm> stepArrayList = new ArrayList<Hmm>();
    int currentstep = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_burns);
        getSupportActionBar().hide();

        Button button = findViewById(R.id.button3);
        TextView steps = findViewById(R.id.stepsword);
        ImageView image = findViewById(R.id.imageViewhehe);
        TextView numbe = findViewById(R.id.textView8);
        ImageView imageView = findViewById(R.id.imageView);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentt = new Intent(Burns.this, Home.class);
                startActivity(intentt);
            }
        });

        Intent intent = new Intent();
        Hmm stepwoundsonee = new Hmm("وضع الجزء المصاب تحت الماء البارد الجاري او تغطيسه في ماء بارد حوال 10 دقائق او اكثر حسب المنطقة المصابة.", 1, R.drawable.wash);
        Hmm stepwoundstwo = new Hmm("في حال عدم وجود ماء بارد، بالامكان استخدام اي سائل بارد او كمادة باردة نظيفة" , 2, R.drawable.wash);
        Hmm stepwoundsthreee = new Hmm("نزع الملابس الضيقة من المنطقة المصابة وكذلك الاحزمة والساعات والخواتم واية اكسسوارات اخرى.", 3, R.drawable.takeoff);
        Hmm stepwoundsthree = new Hmm(" تضميد المنطقة المصابة بالحروق بقماش نظيف ومعقم.", 4, R.drawable.bandage);
        Hmm stepwoundsfour = new Hmm("تخفيف الالم باعطاء مسكنات الالم", 5, R.drawable.medicines);
        Hmm stepwoundso = new Hmm("وفي حال كانت الحروق قوية او تمتد لمساحات واسعة، من الافضل طلب المساعدة الطبية فورا." , 6, R.drawable.help);
        Hmm stepwoundsp = new Hmm("لا ينصح باستخدام الثلج او المراهم على المنطقة المصابة بالحرق تجنبا لالتهاب الجرح او اصابته بالالتهاب." , 7, R.drawable.decline);

        stepArrayList.add(stepwoundsonee);
        stepArrayList.add(stepwoundstwo);
        stepArrayList.add(stepwoundsthreee);
        stepArrayList.add(stepwoundsthree);
        stepArrayList.add(stepwoundsfour);
        stepArrayList.add(stepwoundso);
        stepArrayList.add(stepwoundsp);


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