package com.example.myapplicationmca2;

import android.graphics.Color;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity_Color_Menu extends AppCompatActivity {

    LinearLayout ML;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_color_menu);
        androidx.appcompat.widget.Toolbar toolbar=findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ML = findViewById(R.id.main);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater MI=getMenuInflater();
        MI.inflate(R.menu.color_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch(item.getItemId())
        {
            case R.id.yellow:
                Toast.makeText(this, "Setting", Toast.LENGTH_SHORT).show();
                ML.setBackgroundColor(getResources().getColor(R.color.yello));
                return true;
            case R.id.Blue:
                Toast.makeText(this, "help", Toast.LENGTH_SHORT).show();
                ML.setBackgroundColor(getResources().getColor(R.color.blue));
                return true;

        }
        return super.onOptionsItemSelected(item);
    }
}