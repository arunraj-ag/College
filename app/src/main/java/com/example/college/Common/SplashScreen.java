package com.example.college.Common;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;

import androidx.appcompat.app.AppCompatActivity;

import com.example.college.R;

public class SplashScreen extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.splash_screen);


        int SPLASH_TIMER = 3000;
        new Handler().postDelayed(() -> {
            Intent intent = new Intent(SplashScreen.this, OnBoarding.class);
            startActivity(intent);
            finish();
        }, SPLASH_TIMER);
    }
}