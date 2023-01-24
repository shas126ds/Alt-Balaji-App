package com.example.myapplication1;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    // private SoundPool soundPool;





    private MediaPlayer music;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      music = MediaPlayer.create(this, R.raw.sari);
    }

    public void Pause(View view){
        //Toast.makeText(this, "Sa ", Toast.Length}
        music.stop();
        music = MediaPlayer.create(this, R.raw.sari);


}

    public void Play(View view) {
        music.start();
    }
    }