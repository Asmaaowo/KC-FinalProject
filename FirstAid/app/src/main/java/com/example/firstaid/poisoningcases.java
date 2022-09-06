package com.example.firstaid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class Poisoningcases extends AppCompatActivity {
    ArrayList<Hmm> stepArrayList = new ArrayList<Hmm>();
    int currentstep = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_poisoningcases);
        getSupportActionBar().hide();

        Button button = findViewById(R.id.button3);
        TextView steps = findViewById(R.id.stepsword);
        ImageView image = findViewById(R.id.imageViewhehe);
        TextView numbe = findViewById(R.id.textView8);
        ImageView imageView = findViewById(R.id.imageView);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentt = new Intent(Poisoningcases.this, Home.class);
                startActivity(intentt);
            }
        });

        Intent intent = new Intent();
        Hmm stepwoundsonee = new Hmm("تبدأ الإسعافات الأولية للتسمم الغذائي بإزالة الأطعمة الملوثة إن كانت ما زالت في فم الطفل أو المصاب", 1, R.drawable.mouth);
        Hmm stepwoundstwo = new Hmm("يجب الاستلقاء والراحة؛ لان التسمم الغذائي يسبب التعب والإعياء." , 2, R.drawable.sleeep);
        Hmm stepwoundsthreee = new Hmm("يجب شرب كمية قليلة من الماء في حال المعاناة من القيء، هذا يساعد على تعويض النقص في السوائل ومنع الجفاف.", 3, R.drawable.waterottle);
        Hmm stepwoundsthree = new Hmm("استخدام محلول الجفاف الفموي في بعض الحالات، مثل: الأطفال، وكبار السن وعند وجود أمراض تستدعي ذلك.", 4, R.drawable.syrup);
        Hmm stepwoundsfour = new Hmm("يجب تجنب الأطعمة الصلبة والتركيز على الطرية بعد أن يخف القيء، مثل: الموز، والأرز، والبسكويت، والخبز.", 5, R.drawable.iiiiiiiiiiiii);
        Hmm stepwoundso = new Hmm("الابتعاد كليًا في هذه الحالات عن المشروبات الغازية والكحول." , 6, R.drawable.decline);
        Hmm stepwoundsp = new Hmm("يجب اللجوء للطوارئ في حال زادت أعراض القيء والإسهال خصوصًا عند الأطفال وكبار السن." , 7, R.drawable.help);
        Hmm done = new Hmm("انتهى.",8,R.drawable.done);
        stepArrayList.add(done);

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