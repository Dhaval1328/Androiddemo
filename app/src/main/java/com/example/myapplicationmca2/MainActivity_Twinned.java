package com.example.myapplicationmca2;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity_Twinned extends AppCompatActivity {

    TextView Tv1;
    Button alpha,rotate,Scale,translate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_twinned);
        Tv1=findViewById(R.id.textView);
        alpha=findViewById(R.id.alpha);
        rotate=findViewById(R.id.rotate);
        Scale=findViewById(R.id.scale);
        translate=findViewById(R.id.translate);

        alpha.setOnClickListener(v -> {
            Animation animation = AnimationUtils.loadAnimation(this, R.anim.alpha);
            Tv1.startAnimation(animation);
        });
        rotate.setOnClickListener(v -> {

                Animation animation= AnimationUtils.loadAnimation(this,R.anim.rotate);
                Tv1.setAnimation(animation);

        });
        Scale.setOnClickListener(v ->  {

                Animation animation= AnimationUtils.loadAnimation(this,R.anim.scale);
                Tv1.setAnimation(animation);

        });

        translate.setOnClickListener(v -> {

                Animation animation= AnimationUtils.loadAnimation(this,R.anim.translate);
                Tv1.setAnimation(animation);

        });


    }

}