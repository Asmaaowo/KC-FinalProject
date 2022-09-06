package com.example.firstaid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class Forcardiopulmonaryresuscitation extends AppCompatActivity {
    ArrayList<Hmm> stepArrayList = new ArrayList<Hmm>();
    int currentstep = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forcardiopulmonaryresuscitation);
        getSupportActionBar().hide();

        Button button = findViewById(R.id.button3);
        TextView steps = findViewById(R.id.stepsword);
        ImageView image = findViewById(R.id.imageViewhehe);
        TextView numbe = findViewById(R.id.textView8);
        ImageView imageView = findViewById(R.id.imageView);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentt = new Intent(Forcardiopulmonaryresuscitation.this, Home.class);
                startActivity(intentt);
            }
        });

        Intent intent = new Intent();
        Hmm stepwoundsonee = new Hmm("تأكد من أن المريض والجميع في المنطقة بأمان، ولا تعرض نفسك أو الآخرين لخطر، كتيار كهربائي أو حريق.",1,R.drawable.family);
        Hmm stepwoundstwo= new Hmm("ابحث عن رد من المريض، اسأله بصوت عالٍ عن اسمه،" +
                "  واضغط على كتفه. ",2,R.drawable.woman);
        Hmm stepwoundsthreee = new Hmm("إذا لم يرد المريض، اطلب المساعدة واتصل بالطوارئ، أو أخبر شخصا آخر للاتصال بالطوارئ، " +
                "أو اتصل أنت، لكن لا تترك المريض وحده أبدا، ولا تؤخر الإنعاش القلبي الرئوي.", 3,R.drawable.help);
        Hmm stepwoundsthree = new Hmm("تحقق من المجاري التنفسية للشخص، ومن عدم وجود شيء في الفم والحلق. " +
                " قم بإزالة أي انسداد واضح في الفم أو الأنف، مثل القيء أو الدم أو الطعام",4,R.drawable.mouth);
        Hmm stepwoundsfour = new Hmm(" ثم قم بإمالة رأس الشخص برفق إلى الخلف، وارفع ذقنه. " ,5,R.drawable.secondfds);
        Hmm stepwoundsfive = new Hmm("تحقق مما إذا كان الشخص يتنفس بشكل غير طبيعي،أو لا يتنفس على الإطلاق بعد 10 ثوان من الخطوة السابقة. ", 6,R.drawable.soefd);
        Hmm steoe = new Hmm("إذا كان الشخص يتنفس بشكل طبيعي، ضعه في وضعية التعافي.",7,R.drawable.soefd);
        Hmm stepwoundssix = new Hmm("ذا كان لا يتنفس بتاتا، أو لا يتنفس بشكل طبيعي، فابدأ الإنعاش القلبي الرئوي. ",8,R.drawable.eme);
        Hmm stepeer = new Hmm("الضغط على الصدر هو أهم جزء في عملية الإنعاش القلبي الرئوي، لذلك ابدأ بالضغط على الصدر في أسرع وقت ممكن بعد طلب المساعدة.",9,R.drawable.eme);
        Hmm stepidk = new Hmm("بعدها ضع المريض على ظهره، وانحنِ بجانبه.",10,R.drawable.firsttt);
        Hmm ste = new Hmm("ضع أسفل باطن كفك (كعب يدك) على النصف السفلي من عظم القص في منتصف صدر الشخص، ثم ضع يدك الأخرى فوق اليد الأولى وشبك أصابعك",11,R.drawable.firsttt);
        Hmm dd = new Hmm("باستخدام وزن جسمك (وليس ذراعيك فقط)، ومع المحافظة على استقامة ذراعيك، اضغط على الصدر مباشرة لأسفل بمقدار ثلث عمق الصدر.",12, R.drawable.firsttt);
        Hmm d = new Hmm("أزل الضغط عن الصدر، واسمح للصدر بالعودة إلى وضعه الأصلي وانتظر الاسعاف حتى يأتي",13,R.drawable.firsttt);
        Hmm done = new Hmm("انتهى.",14,R.drawable.done);
        stepArrayList.add(done);
        stepArrayList.add(stepwoundsonee);
        stepArrayList.add(stepwoundstwo);
        stepArrayList.add(stepwoundsthreee);
        stepArrayList.add(stepwoundsthree);
        stepArrayList.add(stepwoundsfour);
        stepArrayList.add(stepwoundsfive);
        stepArrayList.add(steoe);
        stepArrayList.add(stepwoundssix);
        stepArrayList.add(stepeer);
        stepArrayList.add(stepidk);
        stepArrayList.add(ste);
        stepArrayList.add(dd);
        stepArrayList.add(d);


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