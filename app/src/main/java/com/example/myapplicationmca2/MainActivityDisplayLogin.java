package com.example.myapplicationmca2;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivityDisplayLogin extends AppCompatActivity {

    TextView Tvunm,Tvpass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_display_login);
        Tvunm=findViewById(R.id.Tvunm);
        Tvpass=findViewById(R.id.Tvpass);
        String un=getIntent().getStringExtra("unm");
        String pass=getIntent().getStringExtra("upass");
        Tvunm.setText(un);
        Tvpass.setText(pass);

    }
}