package com.example.myapplicationmca2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivitySend extends AppCompatActivity {

    EditText e1,e2,e3,e4,e5;
    Button  btnsubmit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main_send);
        e1=findViewById(R.id.Ed1);
        e2=findViewById(R.id.Ed2);
        e3=findViewById(R.id.Ed3);
        e4=findViewById(R.id.Ed4);
        e5=findViewById(R.id.Ed5);
        btnsubmit=findViewById(R.id.btnsubmit);

        btnsubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1,s2,s4,s5,n1;
                s1=e1.getText().toString().trim();
                s2=e2.getText().toString().trim();
                n1=e3.getText().toString().trim();
                s4=e4.getText().toString().trim();
                s5=e5.getText().toString().trim();
                Intent i1=new Intent(MainActivitySend.this,MainActivityRecive.class);
                i1.putExtra("nm",s1);
                i1.putExtra("ln",s2);
                i1.putExtra("no",n1);
                i1.putExtra("Ei",s4);
                i1.putExtra("pass",s5);
                startActivity(i1);

            }
        });


    }
}