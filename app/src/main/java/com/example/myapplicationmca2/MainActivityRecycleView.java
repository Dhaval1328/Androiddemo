package com.example.myapplicationmca2;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivityRecycleView extends AppCompatActivity {
    String[] videoNames = {"Video1", "Video2", "Video3"};
    String[] videoUrls = {
            "https://commondatastorage.googleapis.com/gtv-videos-bucket/sample/ElephantsDream.mp4",
            "https://youtube.com/shorts/TODdgN_TfZw?si=B_UC7TeXvXiH_ESz",
            "https://youtube.com/shorts/43qm_8ZzYGw?si=m0SXF_7wCM0_kmlV"
    };

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_recycle_view);

        RecyclerView RV2 = findViewById(R.id.RV2);
        RV2.setLayoutManager(new LinearLayoutManager(this));
        RV2.setAdapter(new SimpleAdapter());
    }

    private class SimpleAdapter extends RecyclerView.Adapter<SimpleAdapter.ViewHolder> {

        @NonNull
        @Override
        public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(parent.getContext())
                    .inflate(android.R.layout.simple_list_item_1, parent, false);
            return new ViewHolder(view);
        }

        @Override
        public void onBindViewHolder(@NonNull ViewHolder holder, @SuppressLint("RecyclerView") int position) {
            holder.textView.setText(videoNames[position]);
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(MainActivityRecycleView.this, VideoPlayerActivity.class);
                    intent.putExtra("videoUrl", videoUrls[position]);
                    intent.putExtra("videoName", videoNames[position]);
                    startActivity(intent);
                }
            });
        }

        @Override
        public int getItemCount() {
            return videoNames.length;
        }

        class ViewHolder extends RecyclerView.ViewHolder {
            TextView textView;

            ViewHolder(View itemView) {
                super(itemView);
                textView = itemView.findViewById(android.R.id.text1);
            }
        }
    }
}
