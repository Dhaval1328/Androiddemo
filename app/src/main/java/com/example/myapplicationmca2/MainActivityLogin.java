package com.example.myapplicationmca2;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivityLogin extends AppCompatActivity {

    EditText EdUsername,EdPassword;
    TextView tunm,tpass;
    Button btnLogin;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_login);

        btnLogin=findViewById(R.id.BtnLogin);
        EdUsername=findViewById(R.id.EdUsername);
        EdPassword=findViewById(R.id.EdPassword);
        tunm=findViewById(R.id.TvUnm);
        tpass=findViewById(R.id.Tvpass);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String Ed1=EdUsername.getText().toString().trim();
                String Ed2=EdPassword.getText().toString().trim();
                if(Ed1.isEmpty() || Ed2.isEmpty()){

                    Toast.makeText(MainActivityLogin.this, "All Fields Required T be Fill", Toast.LENGTH_SHORT).show();

                }
                else if (Ed1.equals("Admin") && Ed2.equals("1234"))
                {
                    tunm.setText(Ed1);
                    tpass.setText(Ed2);
                    Intent i=new Intent(MainActivityLogin.this,MainActivityDisplayLogin.class);
                    i.putExtra("unm",Ed1);
                    i.putExtra("upass",Ed2);
                    startActivity(i);

                }
                else
                {
                    Toast.makeText(MainActivityLogin.this, "Login Not Successfully ", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}