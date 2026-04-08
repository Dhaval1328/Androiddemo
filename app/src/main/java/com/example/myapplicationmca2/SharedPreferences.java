package com.example.myapplicationmca2;

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

public class SharedPreferences extends AppCompatActivity {

    TextView TV1;
    EditText Ed1;
    Button btnsave,btnshow;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shared_preferences);
        TV1=findViewById(R.id.Tv1);
        Ed1=findViewById(R.id.Ed1);
        btnsave=findViewById(R.id.btnsave);
        btnshow=findViewById(R.id.btnshow);

        android.content.SharedPreferences sp=getSharedPreferences("mypref",MODE_PRIVATE);

        btnsave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name=Ed1.getText().toString().trim();
                android.content.SharedPreferences.Editor editor=sp.edit();
                editor.putString("un",name);
                editor.apply();
                Toast.makeText(SharedPreferences.this, "Saved!", Toast.LENGTH_SHORT).show();



            }
        });
        btnshow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String spname=sp.getString("un","No data found");
                TV1.setText(spname);
            }
        });


    }
}