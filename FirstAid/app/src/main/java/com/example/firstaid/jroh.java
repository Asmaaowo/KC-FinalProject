package com.example.firstaid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class jroh extends AppCompatActivity {
    ArrayList<Hmm> stepArrayList = new ArrayList<Hmm>();
    int currentstep = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jroh);
        getSupportActionBar().hide();

        Button button = findViewById(R.id.button3);
        TextView steps = findViewById(R.id.stepsword);
        ImageView image = findViewById(R.id.imageViewhehe);
        TextView numbe = findViewById(R.id.textView8);
        ImageView imageView = findViewById(R.id.imageView);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentt = new Intent(jroh.this, Home.class);
                startActivity(intentt);
            }
        });

        Intent intent = new Intent();
        Hmm stepwoundsonee = new Hmm("غسل اليدين جيدًا بالماء النظيف، والصابون قبل التعامل مع الجرح، مع تجنب لمسه بالأصابع في أثناء معالجته إن أمكن.",1,R.drawable.wash);
        Hmm stepwoundstwo= new Hmm("إزالة المجوهرات من الجزء المصاب بالجسم.",2,R.drawable.diamond);
        Hmm stepwoundsthreee = new Hmm("الضغط المباشر على الجرح؛ لوقف النزيف، مع تجنب ربط ما حول موضع الجرح؛ حيث يمكن أن يؤدي ذلك إلى حدوث تلف بالأنسجة." , 3,R.drawable.aaaaaaa);
        Hmm stepwoundsthree = new Hmm("تنظيف الجرح بعد توقف النزيف، وذلك باستخدام محلول ملحي إن أمكن، وإذا لم يكن متاحًا، فيمكن استخدام مياه الشرب المعبأة." ,4,R.drawable.ssssss);
        Hmm stepwoundstw2o= new Hmm("فحص الجرح، وإزالة أي تلوث، أو جسم غريب بداخله.",5,R.drawable.pppp);
        Hmm stepwoundstww2o= new Hmm("تغطية الجرح بضمادة نظيفة معقمة، أما إذا كان الجرح ملوثًا، أو كان بسبب العض، مثل عضة الكلب، أو كان بسبب إبرة ملوثة فيجب تركه مفتوحًا.",6,R.drawable.lll);
        Hmm stepwoundstw2= new Hmm("تناول المسكنات مثل: الإيبوبروفين؛ لتسكين الألم، وتغيير الضمادة كل 24 ساعة.",7,R.drawable.medicines);
        Hmm done = new Hmm("انتهى.",8,R.drawable.done);
        stepArrayList.add(done);

        stepArrayList.add(stepwoundsonee);
        stepArrayList.add(stepwoundstwo);
        stepArrayList.add(stepwoundsthreee);
        stepArrayList.add(stepwoundsthree);
        stepArrayList.add(stepwoundstw2o);
        stepArrayList.add(stepwoundstww2o);
        stepArrayList.add(stepwoundstw2);

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