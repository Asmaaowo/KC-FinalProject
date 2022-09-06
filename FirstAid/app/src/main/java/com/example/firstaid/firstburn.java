package com.example.firstaid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class firstburn extends AppCompatActivity {
    ArrayList<Hmm> stepArrayList = new ArrayList<Hmm>();
    int currentstep = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_firstburn);
        getSupportActionBar().hide();

        Button button = findViewById(R.id.button3);
        TextView steps = findViewById(R.id.stepsword);
        ImageView image = findViewById(R.id.imageViewhehe);
        TextView numbe = findViewById(R.id.textView8);
        ImageView imageView = findViewById(R.id.imageView);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentt = new Intent(firstburn.this, Home.class);
                startActivity(intentt);
            }
        });

        Intent intent = new Intent();
        Hmm stepwoundsonee = new Hmm("يجب جلوس المريض أو مساعدته على الاستلقاء.",1,R.drawable.step1);
        Hmm stepwoundstwo= new Hmm("رفع قدمين المريض عن مستوى الجسم لإعادة تدفق الدم إلى الدماغ." ,2,R.drawable.sitt);
        Hmm stepwoundsthreee = new Hmm("تجنب تغير وضعية المريض بشكل فجائي." , 3,R.drawable.decline);
        Hmm stepwoundsthree = new Hmm("تجنب الضوء العالي بالقرب من المريض " ,4,R.drawable.photophobia);
        Hmm stepwoundsfour = new Hmm(" قم بوضع كمادات باردة أو قطعة من الثلج " ,5,R.drawable.ice);
        Hmm stepwoundsfive = new Hmm("في حال شعور المريض بالعطش يمكنك إعطاؤه الماء أو السوائل.", 6,R.drawable.waterottle);
        Hmm stepwoundssix = new Hmm("تجنب وقوف المريض بشكل مفاجئ وخاصة في حال الإصابة بالصداع مع الدوخة. ",7,R.drawable.headache);
        Hmm stepidk = new Hmm("اذا استمرت الحالة لأكثر من اسبوع قم بمراجعة طبيبك",8,R.drawable.medicalcheckup);

        stepArrayList.add(stepwoundsonee);
        stepArrayList.add(stepwoundstwo);
        stepArrayList.add(stepwoundsthreee);
        stepArrayList.add(stepwoundsthree);
        stepArrayList.add(stepwoundsfour);
        stepArrayList.add(stepwoundsfive);
        stepArrayList.add(stepwoundssix);
        stepArrayList.add(stepidk);

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