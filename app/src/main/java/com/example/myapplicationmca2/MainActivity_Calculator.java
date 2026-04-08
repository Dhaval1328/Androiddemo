package com.example.myapplicationmca2;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity_Calculator extends AppCompatActivity {

    Button Add, Mul, Sub, Div;
    TextView t1;
    EditText e1, e2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_calculator);

        e1 = findViewById(R.id.e1);
        e2 = findViewById(R.id.e2);
        t1 = findViewById(R.id.t1);
        Add = findViewById(R.id.Add);
        Sub = findViewById(R.id.Sub);
        Mul = findViewById(R.id.mul);
        Div = findViewById(R.id.div);

        Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    int num1 = Integer.parseInt(e1.getText().toString().trim());
                    int num2 = Integer.parseInt(e2.getText().toString().trim());
                    t1.setText(String.valueOf(num1 + num2));
                } catch (NumberFormatException ex) {
                    t1.setText("Invalid input");
                }
            }
        });
        Sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    int num1 = Integer.parseInt(e1.getText().toString().trim());
                    int num2 = Integer.parseInt(e2.getText().toString().trim());
                    t1.setText(String.valueOf(num1 - num2));
                } catch (NumberFormatException ex) {
                    t1.setText("Invalid input");
                }
            }
        });

        Mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    int num1 = Integer.parseInt(e1.getText().toString().trim());
                    int num2 = Integer.parseInt(e2.getText().toString().trim());
                    t1.setText(String.valueOf(num1 * num2));
                } catch (NumberFormatException ex) {
                    t1.setText("Invalid input");
                }
            }
        });

        Div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    int num1 = Integer.parseInt(e1.getText().toString().trim());
                    int num2 = Integer.parseInt(e2.getText().toString().trim());
                    t1.setText(String.valueOf(num1 / num2));
                } catch (NumberFormatException ex) {
                    t1.setText("Invalid input");
                }
            }
        });
    }
}
