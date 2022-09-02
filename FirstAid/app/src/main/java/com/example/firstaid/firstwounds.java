package com.example.firstaid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RelativeLayout;

public class firstwounds extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_woundss);
        getSupportActionBar().hide();
        RelativeLayout bleednose = findViewById(R.id.bleednose);
        RelativeLayout bru = findViewById(R.id.bruises);
        RelativeLayout woandsii = findViewById(R.id.woundsss);
        stepwoundsone stepwoundsonee = new stepwoundsone("قم بالجلوس في وضع قائم و قم بإحناء الرأس قليلاً للأمام حتى لا تقم ببلع الدم",1,R.drawable.step1);
        stepwoundsone stepwoundstwo= new stepwoundsone("قم بالضغط على طرف أنفك اللين بأصبعي السبابة و الإبهام لمدة 5 دقائق متواصلة و قم بالتنفس من الفم وإذا لم يقف النزيف ، فعليك أن تبقى لمدة 10 دقائق حتى يقف النزيف",2,R.drawable.twow);
        stepwoundsone stepwoundsthree = new stepwoundsone("حاول أن لا تقم بالتمخط أو تنظيف الأنف لمدة 12 ساعة بعد إيقاف النزف حتى لا يعود النزيف مرة ثانية.",3,R.drawable.three);
        stepwoundsone stepwoundsfour = new stepwoundsone(" قم بوضع كمادات باردة أو قطعة من الثلج على أعلى أنفك و ذلك لأن الماء البارد يعمل على تضييق الأوعية الدموية و إيقاف النزف",4,R.drawable.ice);
        stepwoundsone stepwoundsfive = new stepwoundsone("تجنب التدخين والجلوس في  أماكن المخصصة للتدخين", 5,R.drawable.twow);
    }
}