package com.example.puzzle;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Vibrator;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import com.example.puzzle.c.MainActivity;
import com.example.puzzle.b.MainActivity_b;
import com.example.puzzle.d.MainActivity_d;
import com.example.puzzle.f.MainActivity_f;
import com.example.puzzle.g.MainActivity_g;
import com.example.puzzle.h.MainActivity_h;
import com.example.puzzle.j.MainActivity_j;
import com.example.puzzle.k.MainActivity_k;
import com.example.puzzle.l.MainActivity_l;
import com.example.puzzle.m.MainActivity_m;
import com.example.puzzle.n.MainActivity_n;
import com.example.puzzle.p.MainActivity_p;
import com.example.puzzle.q.MainActivity_q;
import com.example.puzzle.r.MainActivity_r;
import com.example.puzzle.s.MainActivity_s;
import com.example.puzzle.t.MainActivity_t;
import com.example.puzzle.v.MainActivity_v;
import com.example.puzzle.w.MainActivity_w;
import com.example.puzzle.x.MainActivity_x;
import com.example.puzzle.y.MainActivity_y;
import com.example.puzzle.z.MainActivity_z;
import com.squareup.picasso.Picasso;

public class MainActivity_Consonantes extends AppCompatActivity {
    ImageButton Volver;
    ImageButton B, C, D, F, G, H, I, J, K, L, M, N, P, Q, RR, S, T, V, W, X, Y, Z;






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_consonantes);

        Animation animacion = AnimationUtils.loadAnimation(this, R.anim.trans);





        B = (ImageButton) findViewById(R.id.btnB);
        B.startAnimation(animacion);
        String imageUrib = "https://i.imgur.com/ECg4qrj.png";
        Picasso.get().load(imageUrib).into(B);

        B.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){


                Vibrator vibrator = (Vibrator)getApplicationContext().getSystemService(Context.VIBRATOR_SERVICE);
                vibrator.vibrate(200);

                Intent B = new Intent (MainActivity_Consonantes.this, MainActivity_b.class);
                startActivity(B);
                overridePendingTransition(R.anim.zoom_forward_in, R.anim.zoom_forward_in);

            }
        });

        /*---------------------------------------------------------------------------------------------------------------------------------------------*/
        C = (ImageButton) findViewById(R.id.btnC);
        C.startAnimation(animacion);
        String imageUric = "https://i.imgur.com/BGMXG5r.png";
        Picasso.get().load(imageUric).into(C);

        C.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                Vibrator vibrator = (Vibrator)getApplicationContext().getSystemService(Context.VIBRATOR_SERVICE);
                vibrator.vibrate(200);

                Intent C = new Intent (MainActivity_Consonantes.this, MainActivity.class);
                startActivity(C);
                overridePendingTransition(R.anim.zoom_forward_in, R.anim.zoom_forward_in);

            }
        });

        /*---------------------------------------------------------------------------------------------------------------------------------------------*/
        D = (ImageButton) findViewById(R.id.btnD);
        D.startAnimation(animacion);
        String imageUrid = "https://i.imgur.com/KqBIrsS.png";
        Picasso.get().load(imageUrid).into(D);

        D.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                Vibrator vibrator = (Vibrator)getApplicationContext().getSystemService(Context.VIBRATOR_SERVICE);
                vibrator.vibrate(200);

                Intent D = new Intent (MainActivity_Consonantes.this, MainActivity_d.class);
                startActivity(D);
                overridePendingTransition(R.anim.zoom_forward_in, R.anim.zoom_forward_in);

            }
        });

        /*---------------------------------------------------------------------------------------------------------------------------------------------*/
        F = (ImageButton) findViewById(R.id.btnF);
        F.startAnimation(animacion);
        String imageUrif = "https://i.imgur.com/gzODaUD.png";
        Picasso.get().load(imageUrif).into(F);

        F.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                Vibrator vibrator = (Vibrator)getApplicationContext().getSystemService(Context.VIBRATOR_SERVICE);
                vibrator.vibrate(200);

                Intent F = new Intent (MainActivity_Consonantes.this, MainActivity_f.class);
                startActivity(F);
                overridePendingTransition(R.anim.zoom_forward_in, R.anim.zoom_forward_in);

            }
        });

        /*---------------------------------------------------------------------------------------------------------------------------------------------*/
        G = (ImageButton) findViewById(R.id.btnG);
        G.startAnimation(animacion);
        String imageUrig = "https://i.imgur.com/O4LBbGp.png";
        Picasso.get().load(imageUrig).into(G);

        G.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                Vibrator vibrator = (Vibrator)getApplicationContext().getSystemService(Context.VIBRATOR_SERVICE);
                vibrator.vibrate(200);

                Intent G = new Intent (MainActivity_Consonantes.this, MainActivity_g.class);
                startActivity(G);
                overridePendingTransition(R.anim.zoom_forward_in, R.anim.zoom_forward_in);

            }
        });

        /*---------------------------------------------------------------------------------------------------------------------------------------------*/
        H = (ImageButton) findViewById(R.id.btnH);
        H.startAnimation(animacion);
        String imageUrih = "https://i.imgur.com/jJ3CnwV.png";
        Picasso.get().load(imageUrih).into(H);

        H.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                Vibrator vibrator = (Vibrator)getApplicationContext().getSystemService(Context.VIBRATOR_SERVICE);
                vibrator.vibrate(200);

                Intent H = new Intent (MainActivity_Consonantes.this, MainActivity_h.class);
                startActivity(H);
                overridePendingTransition(R.anim.zoom_forward_in, R.anim.zoom_forward_in);

            }
        });

        /*---------------------------------------------------------------------------------------------------------------------------------------------*/
        J = (ImageButton) findViewById(R.id.btnJ);
        J.startAnimation(animacion);
        String imageUrij = "https://i.imgur.com/2dZlIg0.png";
        Picasso.get().load(imageUrij).into(J);

        J.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                Vibrator vibrator = (Vibrator)getApplicationContext().getSystemService(Context.VIBRATOR_SERVICE);
                vibrator.vibrate(200);

                Intent J = new Intent (MainActivity_Consonantes.this, MainActivity_j.class);
                startActivity(J);
                overridePendingTransition(R.anim.zoom_forward_in, R.anim.zoom_forward_in);

            }
        });

        /*---------------------------------------------------------------------------------------------------------------------------------------------*/
        K = (ImageButton) findViewById(R.id.btnK);
        K.startAnimation(animacion);
        String imageUrik = "https://i.imgur.com/q3AOnOR.png";
        Picasso.get().load(imageUrik).into(K);

        K.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                Vibrator vibrator = (Vibrator)getApplicationContext().getSystemService(Context.VIBRATOR_SERVICE);
                vibrator.vibrate(200);

                Intent K = new Intent (MainActivity_Consonantes.this, MainActivity_k.class);
                startActivity(K);
                overridePendingTransition(R.anim.zoom_forward_in, R.anim.zoom_forward_in);

            }
        });

        /*---------------------------------------------------------------------------------------------------------------------------------------------*/
        L = (ImageButton) findViewById(R.id.btnL);
        L.startAnimation(animacion);
        String imageUril = "https://i.imgur.com/vd36Tig.png";
        Picasso.get().load(imageUril).into(L);

        L.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                Vibrator vibrator = (Vibrator)getApplicationContext().getSystemService(Context.VIBRATOR_SERVICE);
                vibrator.vibrate(200);

                Intent L = new Intent (MainActivity_Consonantes.this, MainActivity_l.class);
                startActivity(L);
                overridePendingTransition(R.anim.zoom_forward_in, R.anim.zoom_forward_in);

            }
        });

        /*---------------------------------------------------------------------------------------------------------------------------------------------*/
        M = (ImageButton) findViewById(R.id.btnM);
        M.startAnimation(animacion);
        String imageUrim = "https://i.imgur.com/vVF1m8N.png";
        Picasso.get().load(imageUrim).into(M);

        M.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                Vibrator vibrator = (Vibrator)getApplicationContext().getSystemService(Context.VIBRATOR_SERVICE);
                vibrator.vibrate(200);

                Intent M = new Intent (MainActivity_Consonantes.this, MainActivity_m.class);
                startActivity(M);
                overridePendingTransition(R.anim.zoom_forward_in, R.anim.zoom_forward_in);

            }
        });

        /*---------------------------------------------------------------------------------------------------------------------------------------------*/
        N = (ImageButton) findViewById(R.id.btnN);
        N.startAnimation(animacion);
        String imageUrin = "https://i.imgur.com/cxisZ1H.png";
        Picasso.get().load(imageUrin).into(N);

        N.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                Vibrator vibrator = (Vibrator)getApplicationContext().getSystemService(Context.VIBRATOR_SERVICE);
                vibrator.vibrate(200);

                Intent N = new Intent (MainActivity_Consonantes.this, MainActivity_n.class);
                startActivity(N);
                overridePendingTransition(R.anim.zoom_forward_in, R.anim.zoom_forward_in);

            }
        });

        /*---------------------------------------------------------------------------------------------------------------------------------------------*/
        P = (ImageButton) findViewById(R.id.btnP);
        P.startAnimation(animacion);
        String imageUrip = "https://i.imgur.com/u4uXY4O.png";
        Picasso.get().load(imageUrip).into(P);

        P.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                Vibrator vibrator = (Vibrator)getApplicationContext().getSystemService(Context.VIBRATOR_SERVICE);
                vibrator.vibrate(200);

                Intent P = new Intent (MainActivity_Consonantes.this, MainActivity_p.class);
                startActivity(P);
                overridePendingTransition(R.anim.zoom_forward_in, R.anim.zoom_forward_in);

            }
        });

        /*---------------------------------------------------------------------------------------------------------------------------------------------*/
        Q = (ImageButton) findViewById(R.id.btnQ);
        Q.startAnimation(animacion);
        String imageUriq = "https://i.imgur.com/vbirIlF.png";
        Picasso.get().load(imageUriq).into(Q);

        Q.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                Vibrator vibrator = (Vibrator)getApplicationContext().getSystemService(Context.VIBRATOR_SERVICE);
                vibrator.vibrate(200);

                Intent Q = new Intent (MainActivity_Consonantes.this, MainActivity_q.class);
                startActivity(Q);
                overridePendingTransition(R.anim.zoom_forward_in, R.anim.zoom_forward_in);

            }
        });

        /*---------------------------------------------------------------------------------------------------------------------------------------------*/
        RR= (ImageButton) findViewById(R.id.btnR);
        RR.startAnimation(animacion);
        String imageUrir = "https://i.imgur.com/yYQsGMi.png";
        Picasso.get().load(imageUrir).into(RR);

        RR.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                Vibrator vibrator = (Vibrator)getApplicationContext().getSystemService(Context.VIBRATOR_SERVICE);
                vibrator.vibrate(200);

                Intent RR = new Intent (MainActivity_Consonantes.this, MainActivity_r.class);
                startActivity(RR);
                overridePendingTransition(R.anim.zoom_forward_in, R.anim.zoom_forward_in);

            }
        });

        /*---------------------------------------------------------------------------------------------------------------------------------------------*/
        S= (ImageButton) findViewById(R.id.btnS);
        S.startAnimation(animacion);
        String imageUris = "https://i.imgur.com/kDUlijD.png";
        Picasso.get().load(imageUris).into(S);

        S.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                Vibrator vibrator = (Vibrator)getApplicationContext().getSystemService(Context.VIBRATOR_SERVICE);
                vibrator.vibrate(200);

                Intent S = new Intent (MainActivity_Consonantes.this, MainActivity_s.class);
                startActivity(S);
                overridePendingTransition(R.anim.zoom_forward_in, R.anim.zoom_forward_in);

            }
        });

        /*---------------------------------------------------------------------------------------------------------------------------------------------*/
        T= (ImageButton) findViewById(R.id.btnT);
        T.startAnimation(animacion);
        String imageUrit= "https://i.imgur.com/CgaZRgG.png";
        Picasso.get().load(imageUrit).into(T);

        T.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                Vibrator vibrator = (Vibrator)getApplicationContext().getSystemService(Context.VIBRATOR_SERVICE);
                vibrator.vibrate(200);

                Intent T = new Intent (MainActivity_Consonantes.this, MainActivity_t.class);
                startActivity(T);
                overridePendingTransition(R.anim.zoom_forward_in, R.anim.zoom_forward_in);

            }
        });

        /*---------------------------------------------------------------------------------------------------------------------------------------------*/
        V= (ImageButton) findViewById(R.id.btnV);
        V.startAnimation(animacion);
        String imageUriv= "https://i.imgur.com/WD2VKSg.png";
        Picasso.get().load(imageUriv).into(V);

        V.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                Vibrator vibrator = (Vibrator)getApplicationContext().getSystemService(Context.VIBRATOR_SERVICE);
                vibrator.vibrate(200);

                Intent V = new Intent (MainActivity_Consonantes.this, MainActivity_v.class);
                startActivity(V);
                overridePendingTransition(R.anim.zoom_forward_in, R.anim.zoom_forward_in);

            }
        });

        /*---------------------------------------------------------------------------------------------------------------------------------------------*/
        W= (ImageButton) findViewById(R.id.btnW);
        W.startAnimation(animacion);
        String imageUriw= "https://i.imgur.com/Rp7OLVF.png";
        Picasso.get().load(imageUriw).into(W);

        W.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                Vibrator vibrator = (Vibrator)getApplicationContext().getSystemService(Context.VIBRATOR_SERVICE);
                vibrator.vibrate(200);

                Intent W = new Intent (MainActivity_Consonantes.this, MainActivity_w.class);
                startActivity(W);
                overridePendingTransition(R.anim.zoom_forward_in, R.anim.zoom_forward_in);

            }
        });

        /*---------------------------------------------------------------------------------------------------------------------------------------------*/
        X= (ImageButton) findViewById(R.id.btnX);
        X.startAnimation(animacion);
        String imageUrix= "https://i.imgur.com/wmdv3LX.png";
        Picasso.get().load(imageUrix).into(X);

        X.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                Vibrator vibrator = (Vibrator)getApplicationContext().getSystemService(Context.VIBRATOR_SERVICE);
                vibrator.vibrate(200);

                Intent X = new Intent (MainActivity_Consonantes.this, MainActivity_x.class);
                startActivity(X);
                overridePendingTransition(R.anim.zoom_forward_in, R.anim.zoom_forward_in);

            }
        });

        /*---------------------------------------------------------------------------------------------------------------------------------------------*/
        Y= (ImageButton) findViewById(R.id.btnY);
        Y.startAnimation(animacion);
        String imageUriy= "https://i.imgur.com/mKwQPsQ.png";
        Picasso.get().load(imageUriy).into(Y);

        Y.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                Vibrator vibrator = (Vibrator)getApplicationContext().getSystemService(Context.VIBRATOR_SERVICE);
                vibrator.vibrate(200);

                Intent Y = new Intent (MainActivity_Consonantes.this, MainActivity_y.class);
                startActivity(Y);
                overridePendingTransition(R.anim.zoom_forward_in, R.anim.zoom_forward_in);

            }
        });

        /*---------------------------------------------------------------------------------------------------------------------------------------------*/
        Z= (ImageButton) findViewById(R.id.btnZ);
        Z.startAnimation(animacion);
        String imageUriz= "https://i.imgur.com/JI2Ff0O.png";
        Picasso.get().load(imageUriz).into(Z);

        Z.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                Vibrator vibrator = (Vibrator)getApplicationContext().getSystemService(Context.VIBRATOR_SERVICE);
                vibrator.vibrate(200);

                Intent Z = new Intent (MainActivity_Consonantes.this, MainActivity_z.class);
                startActivity(Z);
                overridePendingTransition(R.anim.zoom_forward_in, R.anim.zoom_forward_in);

            }
        });

        /*---------------------------------------------------------------------------------------------------------------------------------------------*/

        Volver = (ImageButton) findViewById(R.id.btnVolver);
        String imageUriVolver= "https://i.imgur.com/2HzAlbO.png";
        Picasso.get().load(imageUriVolver).into(Volver);

        Volver.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                Vibrator vibrator = (Vibrator)getApplicationContext().getSystemService(Context.VIBRATOR_SERVICE);
                vibrator.vibrate(200);

                Intent Volver = new Intent (MainActivity_Consonantes.this, MainActivity_menu.class);
                startActivity(Volver);
                overridePendingTransition(R.anim.zoom_forward_in, R.anim.zoom_forward_in);

            }
        });


    }



}
