package com.example.firstaid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class kdmat extends AppCompatActivity {
    ArrayList<Hmm> stepArrayList = new ArrayList<Hmm>();
    int currentstep = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kdmat);
        getSupportActionBar().hide();

        Button button = findViewById(R.id.button3);
        TextView steps = findViewById(R.id.stepsword);
        ImageView image = findViewById(R.id.imageViewhehe);
        TextView numbe = findViewById(R.id.textView8);
        ImageView imageView = findViewById(R.id.imageView);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentt = new Intent(kdmat.this, Home.class);
                startActivity(intentt);
            }
        });

        Intent intent = new Intent();
        Hmm stepwoundsonee = new Hmm("فك الملابس الضاغطة " +
                "حيث تعمل الملابس الضاغطة على عصر الأوعية الدموية فى موقع الإصابة, مما يشجع ظهور الكدمة.",1,R.drawable.takeoff);
        Hmm stepwoundstwo= new Hmm("قم بوضع كمادات الثلج على المنطقة المصابة حيث يعمل على انقباض الاوعية الدموية" ,2,R.drawable.ice);
        Hmm stepwoundsthreee = new Hmm("قم بإراحة العضو المصاب ورفعه عن مستوى القلب لتقليل تدفق الدم إلى موضعه فتقل فرصة حدوث الكدمات." , 3,R.drawable.sleep);
        Hmm done = new Hmm("انتهى.",4,R.drawable.done);
        stepArrayList.add(done);


        stepArrayList.add(stepwoundsonee);
        stepArrayList.add(stepwoundstwo);
        stepArrayList.add(stepwoundsthreee);


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