package com.example.myapplicationmca2;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivityRecive extends AppCompatActivity {

    TextView t1,t2,t3,t4,t5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_recive);
        t1=findViewById(R.id.t1);
        t2=findViewById(R.id.t2);
        t3=findViewById(R.id.t3);
        t4=findViewById(R.id.t4);
        t5=findViewById(R.id.t5);

        String s1,s2,s4,s5,n1;
        s1=getIntent().getStringExtra("nm");
        s2=getIntent().getStringExtra("ln");
        n1=getIntent().getStringExtra("no");
        s4=getIntent().getStringExtra("Ei");
        s5=getIntent().getStringExtra("pass");
        t1.setText(s1);
        t2.setText(s2);
        t3.setText(n1);
        t4.setText(s4);
        t5.setText(s5);

    }
}