package com.example.hotelmanagementsystem.Activity;

import android.content.Intent;
import android.os.Handler;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.hotelmanagementsystem.R;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        //Splash Screen Code to call new Activity after some time
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                //Calling new Activity
                Intent intent = new Intent(SplashScreen.this, LoginActivity.class);
                startActivity(intent);
                finish();
            }
        }, 3000);
    }
}