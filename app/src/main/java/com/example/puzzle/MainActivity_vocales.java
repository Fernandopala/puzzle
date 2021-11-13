package com.example.puzzle;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.os.Build;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;
import android.view.WindowManager;

import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import com.squareup.picasso.Picasso;

public class MainActivity_vocales extends AppCompatActivity {
    ImageButton btna, btne, btni, btno, btnu;
    private int sonidoa, sonidoe, sonidoi, sonidoo, sonidou;

    private SoundPool soundPool;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_vocales);

        btna = (ImageButton) findViewById(R.id.btnA);


        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            soundPool = new SoundPool.Builder().setMaxStreams(5).build();
        } else{
            soundPool = new SoundPool(5, AudioManager.STREAM_MUSIC, 0);
        }



        sonidoa = soundPool.load(this, R.raw.doo,1);

        String imageUria = "https://i.imgur.com/G1H4OKu.png";
        Picasso.get().load(imageUria).into(btna);
        btna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                soundPool.play(sonidoa, 1, 1, 0,0,1);

            }
        });

        /*----------------------------------------------------------------------------------------------------------------*/

        sonidoe = soundPool.load(this, R.raw.re,1);

        btne = (ImageButton) findViewById(R.id.btnE);

        String imageUrie = "https://i.imgur.com/4b2O6zq.png";
        Picasso.get().load(imageUrie).into(btne);
        btne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                soundPool.play(sonidoe, 1, 1, 0,0,1);

            }
        });

        /*----------------------------------------------------------------------------------------------------------------*/

        sonidoi = soundPool.load(this, R.raw.mi,1);

        btni = (ImageButton) findViewById(R.id.btnI);

        String imageUrii = "https://i.imgur.com/6QDurL7.png";
        Picasso.get().load(imageUrii).into(btni);
        btni.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                soundPool.play(sonidoi, 1, 1, 0,0,1);

            }
        });

        /*----------------------------------------------------------------------------------------------------------------*/

        sonidoo = soundPool.load(this, R.raw.fa,1);

        btno = (ImageButton) findViewById(R.id.btnO);

        String imageUrio = "https://i.imgur.com/U4PrmzH.png";
        Picasso.get().load(imageUrio).into(btno);
        btno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                soundPool.play(sonidoo, 1, 1, 0,0,1);

            }
        });

        /*----------------------------------------------------------------------------------------------------------------*/

        sonidou = soundPool.load(this, R.raw.sol,1);

        btnu = (ImageButton) findViewById(R.id.btnU);

        String imageUriu = "https://i.imgur.com/USjYQw7.png";
        Picasso.get().load(imageUriu).into(btnu);
        btnu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                soundPool.play(sonidou, 1, 1, 0,0,1);

            }
        });






    }


}
