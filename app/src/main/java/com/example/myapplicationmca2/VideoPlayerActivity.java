package com.example.myapplicationmca2;

import android.annotation.SuppressLint;
import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class VideoPlayerActivity extends AppCompatActivity {

    VideoView VV2;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_player);
        VV2=findViewById(R.id.VV2);

        String videoUrl = getIntent().getStringExtra("videoUrl");
        String videoName = getIntent().getStringExtra("videoName");

        Uri uri = Uri.parse(videoUrl);
        VV2.setVideoURI(uri);

        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(VV2);
        VV2.setMediaController(mediaController);

        VV2.start();
        setTitle(videoName);



    }
}