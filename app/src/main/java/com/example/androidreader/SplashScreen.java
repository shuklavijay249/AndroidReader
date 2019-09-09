package com.example.androidreader;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.example.androidreader.MainActivity;
import com.example.androidreader.R;

public class SplashScreen extends AppCompatActivity {

    public static int splashTimeOut=5000;
    public ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
/*
        imageView=findViewById(R.id.SplashScreenImg);
*/


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent splashscreen;
                splashscreen = new Intent(SplashScreen.this, MainActivity.class);
                startActivity(splashscreen);
                finish();

            }
        },splashTimeOut);


    }


}
