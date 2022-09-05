package com.example.firstaid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class Choking extends AppCompatActivity {
    ArrayList<Hmm> stepArrayList = new ArrayList<Hmm>();
    int currentstep = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choking);
        getSupportActionBar().hide();

        Button button = findViewById(R.id.button3);
        TextView steps = findViewById(R.id.stepsword);
        ImageView image = findViewById(R.id.imageViewhehe);
        TextView numbe = findViewById(R.id.textView8);
        ImageView imageView = findViewById(R.id.imageView);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentt = new Intent(Choking.this, Home.class);
                startActivity(intentt);
            }
        });

        Intent intent = new Intent();
        Hmm stepwoundsonee = new Hmm("الوقوف خلف الشخص المصاب ووضع إحدى القدمين أمام الأخرى قليلاً لتحقيق التوازن." ,1,R.drawable.chokiing);
        Hmm stepwoundstwo= new Hmm("لف الذراعين حول خصر الشخص المصاب و" +
                "إمالة الشخص المصاب إلى الأمام قليلاً.",2,R.drawable.iiiiiiiiiiiii);
        Hmm stepwoundsthreee = new Hmm("عمل قبضة باليد الأُخرى ثم وضعها فوق منطقة السرة." , 3,R.drawable.iiiiiiiiiiiii);
        Hmm stepwoundsthree = new Hmm("مسك القبضة باليد الأُخرى ثم توجيه ضغطة بقوة على البطن بسرعة نحو الأعلى. ",4,R.drawable.iiiiiiiiiiiii);
        Hmm stepwoundsfour = new Hmm(" القيام بمعدل 6 إِلى 10 ضغطات بطنية حتى يزول الجسم العالق واذا كان الشخص مغمى عليه فقم بالانعاش الرئوي ",5,R.drawable.iiiiiiiiiiiii);

        stepArrayList.add(stepwoundsonee);
        stepArrayList.add(stepwoundstwo);
        stepArrayList.add(stepwoundsthreee);
        stepArrayList.add(stepwoundsthree);
        stepArrayList.add(stepwoundsfour);


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

                if(stepArrayList.size() == currentstep){
                    Intent i = new Intent(Choking.this, Home.class);
                    startActivity(i);
                }

            }
        });
    }

}