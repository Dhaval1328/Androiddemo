package com.example.myapplicationmca2;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText e1;
    Button btnpress,btnsubmit,data,sms,ListView1,ACTV,WV,cal,RV,OM,context,OC,Tween,login,vv,RV2,SP;
    TextView t1,t2;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1=findViewById(R.id.Ed1);
        t1=findViewById(R.id.t1);
        sms=findViewById(R.id.SMS);
        t2=findViewById(R.id.t2);
        data=findViewById(R.id.Data);
        btnpress=findViewById(R.id.btnpress);
        btnsubmit=findViewById(R.id.btnsubmit);
        WV=findViewById(R.id.WV);
        ListView1=findViewById(R.id.ListView1);
        ACTV=findViewById(R.id.ACTV);
        cal=findViewById(R.id.cal);
        RV=findViewById(R.id.RV);
        OM=findViewById(R.id.OM);
        context=findViewById(R.id.context);
        OC=findViewById(R.id.OC);
        Tween=findViewById(R.id.Tween);
        login=findViewById(R.id.Login);
        vv=findViewById(R.id.vv);
        RV2=findViewById(R.id.RV2);
        SP=findViewById(R.id.SP);
        btnpress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(MainActivity.this, MainActivity2.class);
                startActivity(i);
            }
        });
        btnsubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse("https://www.google.com/"));
                startActivity(i);
            }
        });
        data.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str;
                str=e1.getText().toString().trim();
                Toast.makeText(MainActivity.this, str, Toast.LENGTH_SHORT).show();
                Intent i=new Intent(MainActivity.this,MainActivity2.class);
                i.putExtra("nm",str);
                startActivity(i);

            }
        });
        sms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,MainActivitySend.class);
                startActivity(i);
            }
        });
        ListView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this, MainActivity_ListView.class);
                startActivity(i);
            }
        });
        ACTV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,MainActivity_ACTV.class);
                startActivity(i);

            }
        });

        WV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,MainActivity_WebView.class);
                startActivity(i);

            }
        });
        cal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,MainActivity_Calculator.class);
                startActivity(i);

            }
        });
        RV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,MainActivityRecycle.class);
                startActivity(i);

            }
        });
        OM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,MainActivity_Option_Menu.class);
                startActivity(i);

            }
        });
        context.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,MainActivityContext_menu.class);
                startActivity(i);

            }
        });
        OC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,MainActivity_Color_Menu.class);
                startActivity(i);

            }
        });
        Tween.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,MainActivity_Twinned.class);
                startActivity(i);

            }
        });

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,MainActivityLogin.class);
                startActivity(i);
            }
        });

        vv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,MainActivityVideoView.class);
                startActivity(i);
            }
        });
        RV2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this, MainActivityRecycleView.class);
                startActivity(i);
            }
        });
        SP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this, SharedPreferences.class);
                startActivity(i);
            }
        });




    }

}