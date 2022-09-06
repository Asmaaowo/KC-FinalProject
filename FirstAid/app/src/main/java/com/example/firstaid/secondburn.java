package com.example.firstaid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class secondburn extends AppCompatActivity {
    ArrayList<Hmm> stepArrayList = new ArrayList<Hmm>();
    int currentstep = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondburn);
        getSupportActionBar().hide();

        Button button = findViewById(R.id.button3);
        TextView steps = findViewById(R.id.stepsword);
        ImageView image = findViewById(R.id.imageViewhehe);
        TextView numbe = findViewById(R.id.textView8);
        ImageView imageView = findViewById(R.id.imageView);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentt = new Intent(secondburn.this, Home.class);
                startActivity(intentt);
            }
        });

        Intent intent = new Intent();
        Hmm stepwoundsonee = new Hmm("يجب استخدام الباراسيتامول ومسكنات الألم الأخرى فقط إذا كان الصداع ناتجًا عن أسباب بسيطة مثل التعب أو الإجهاد.",1,R.drawable.medicines);
        Hmm stepwoundstwo= new Hmm("قد تؤدي الأضواء الساطعة (على سبيل المثال ، من شاشة الهاتف أو المكتب) إلى تفاقم الصداع أو الصداع النصفي." ,2,R.drawable.nophone);
        Hmm stepwoundsthreee = new Hmm("إذا كان الشخص المصاب بأي من الحالتين حساسًا للضوء ، فيجب عليه الجلوس أو الاستلقاء في غرفة مظلمة أو مضاءة بشكل خافت لزيادة الراحة وتقليل الألم." , 3,R.drawable.bed);
        Hmm stepwoundsthree = new Hmm("يجب أن يحصل الأشخاص المصابون بالصداع على هواء نقي ونوم كافٍ وشرب الماء بانتظام.  " ,4,R.drawable.rest);
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