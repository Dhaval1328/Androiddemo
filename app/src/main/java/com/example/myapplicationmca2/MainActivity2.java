package com.example.myapplicationmca2;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    TextView t2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        t2=findViewById(R.id.t2);
        String str;
        str=getIntent().getStringExtra("nm");
        t2.setText(str);

    }
}