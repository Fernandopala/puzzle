package com.example.puzzle;

import java.io.IOException;

import android.app.Activity;
import android.app.Service;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnPreparedListener;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.squareup.picasso.Picasso;

public class MainActivity_inicio extends AppCompatActivity {
    ImageButton imgInicio;
    MediaPlayer mp;

    protected void onCreate(Bundle savedInstanceState) {
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_inicio);

        imgInicio = (ImageButton) findViewById(R.id.imgInicio);
        String imageUriinicio = "https://i.imgur.com/kFXk6bw.png";
        Picasso.get().load(imageUriinicio).into(imgInicio);

        mp = MediaPlayer.create(this, R.raw.loop);

        imgInicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent Consonantes = new Intent(MainActivity_inicio.this, MainActivity_menu.class);
                startActivity(Consonantes);
                overridePendingTransition(R.anim.zoom_forward_in, R.anim.zoom_forward_in);

                if (mp.isPlaying()) {
                    mp.pause();
                    Toast.makeText(MainActivity_inicio.this, "Pausa", Toast.LENGTH_SHORT).show();
                } else {
                    mp.start();
                    mp.setLooping(true);
                    Toast.makeText(MainActivity_inicio.this, "Inicia", Toast.LENGTH_SHORT).show();
                }





            }


        });
    }
}