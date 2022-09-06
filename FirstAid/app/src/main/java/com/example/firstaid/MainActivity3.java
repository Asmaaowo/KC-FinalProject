package com.example.firstaid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity3 extends AppCompatActivity {
    ArrayList<Hmm> stepArrayList = new ArrayList<Hmm>();
    int currentstep = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        getSupportActionBar().hide();

        Button button = findViewById(R.id.button3);
        TextView steps = findViewById(R.id.stepsword);
        ImageView image = findViewById(R.id.imageViewhehe);
        TextView numbe = findViewById(R.id.textView8);
        ImageView imageView = findViewById(R.id.imageView);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentt = new Intent(MainActivity3.this, Home.class);
                startActivity(intentt);
            }
        });

        Intent intent = new Intent();
        Hmm stepwoundsonee = new Hmm("اذا كان يوجد نزيف فقم بإيقاف النزيف عن طريق الضغط الخفيف على الجرح بضمادة معقمة أو قطعة قماش نظيفة، حتى يتوقف النزف.",1,R.drawable.bandage);
        Hmm stepwoundstwo= new Hmm("يمكن القيام بتثبيت المنطقة المصابة باستخدام الجبائر، أو حمالات الذراع، أو الألواح الخشبية إذا كان الشخص المُسعف مدربًا على ذلك.",2,R.drawable.bsdsd);
        Hmm stepwoundsthreee = new Hmm("أما في حال عدم أهلية الشخص لأداء هذا الإجراء فيجدر به عدم تحريك المصاب، وعدم المحاولة في إعادة تنظيم العظم أو دفع العظم البارز." , 3,R.drawable.donttouch);
        Hmm stepwoundsthree = new Hmm("يمكن أن يساعد تطبيق كمادات الثلج في تقليل التورم وتخفيف الألم." ,4,R.drawable.ice);
        Hmm stepwoundsfour = new Hmm("يمكن معالجة المصاب من الصدمة عن طريق طمأنته، ووضعه بوضعية مريحة، وتشجيعه على الهدوء والاسترخاء، وتغطيته ببطانية لتدفئته." ,5,R.drawable.friends);
        Hmm done = new Hmm("انتهى.",6,R.drawable.done);


        stepArrayList.add(stepwoundsonee);
        stepArrayList.add(stepwoundstwo);
        stepArrayList.add(stepwoundsthreee);
        stepArrayList.add(stepwoundsthree);
        stepArrayList.add(stepwoundsfour);
        stepArrayList.add(done);

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