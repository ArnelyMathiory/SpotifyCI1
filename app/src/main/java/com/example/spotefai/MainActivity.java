package com.example.spotefai;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {
      ImageView coverImage;
      MediaPlayer player;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        coverImage= findViewById(R.id.imageView9);
       
        Glide.with(this).load("https://img.youtube.com/vi/<58hoktsqk_Q>/0.jpg").into(coverImage);
        player =  MediaPlayer.create(getApplicationContext(), R.raw.ladygaga);

        
    }
}
