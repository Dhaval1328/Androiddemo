package com.example.myapplicationmca2;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity_WebView extends AppCompatActivity {

    EditText e1;
    Button btn1;
    WebView wv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_web_view);
        e1=findViewById(R.id.Ed1);
        btn1=findViewById(R.id.Btn1);
        wv=findViewById(R.id.wv);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String open="https://"+e1.getText().toString();

                WebSettings ws= wv.getSettings();
            ws.setJavaScriptEnabled(true);
            wv.setWebViewClient(new WebViewClient());
            wv.loadUrl(open);
            }
        });




    }
}