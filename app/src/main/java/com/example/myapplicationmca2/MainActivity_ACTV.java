package com.example.myapplicationmca2;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.MultiAutoCompleteTextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity_ACTV extends AppCompatActivity {

    AutoCompleteTextView AV1;
    MultiAutoCompleteTextView MACTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_actv);
        AV1=findViewById(R.id.ACTV1);
        MACTV=findViewById(R.id.MACTV);
        String[] city={"Rajkot","Jamnagar","Ahemdabad","Surat","Amreli","Bhavnagar","Gondal","Rajula","Kutch"};
        ArrayAdapter<String> ad=new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,city);
        AV1.setAdapter(ad);
        MACTV.setAdapter(ad);
        MACTV.setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer());



    }
}