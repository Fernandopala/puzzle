package com.example.puzzle;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.squareup.picasso.Picasso;

public class MainActivity_menu extends AppCompatActivity {
    ImageButton Consonantes;
    ImageButton Vocales;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        imageView = (ImageView) findViewById(R.id.imageView3);
        String imageUriopc = "https://i.imgur.com/0eIfS8m.png";
        Picasso.get().load(imageUriopc).into(imageView);





        Consonantes = (ImageButton) findViewById(R.id.btnConsonantes2);
        String imageUriCon = "https://i.imgur.com/kcCuccy.png";
        Picasso.get().load(imageUriCon).into(Consonantes);


        Consonantes.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                Vibrator vibrator = (Vibrator)getApplicationContext().getSystemService(Context.VIBRATOR_SERVICE);
                vibrator.vibrate(200);

                Intent Consonantes = new Intent (MainActivity_menu.this, MainActivity_Consonantes.class);
                startActivity(Consonantes);
                overridePendingTransition(R.anim.zoom_forward_in, R.anim.zoom_forward_in);

            }
        });

        Vocales = (ImageButton) findViewById(R.id.btnVocales);
        String imageUriVoc = "https://i.imgur.com/98RcCgY.png";
        Picasso.get().load(imageUriVoc).into(Vocales);

        Vocales.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                Vibrator vibrator = (Vibrator)getApplicationContext().getSystemService(Context.VIBRATOR_SERVICE);
                vibrator.vibrate(200);

                Intent Vocales = new Intent (MainActivity_menu.this, MainActivity_vocales.class);
                startActivity(Vocales);
                overridePendingTransition(R.anim.zoom_forward_in, R.anim.zoom_forward_in);

            }
        });











    }
}
