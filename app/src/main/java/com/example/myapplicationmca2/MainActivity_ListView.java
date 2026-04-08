package com.example.myapplicationmca2;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity_ListView extends AppCompatActivity {

    ListView list;
    Spinner sp1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_list_view);
        list=findViewById(R.id.l1);
        sp1=findViewById(R.id.sp1);
        String[] nm={"A","B","C","D"};
        String[] city={"Rajkot","Jamnagar","Gandhinagar","Ahmedabad","Pune","Hedrabad","Banglore"};
        ArrayAdapter<String> ad=new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,nm);
        ArrayAdapter<String> ad2=new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,city);
        list.setAdapter(ad);
        sp1.setAdapter(ad2);


        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String s=nm[i];
                Toast.makeText(MainActivity_ListView.this, s, Toast.LENGTH_SHORT).show();

            }
        });
        sp1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {


                String s=city[i];
                Toast.makeText(MainActivity_ListView.this, s, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

    }
}