package com.abmtech.medicalmanagement.Welcome;

import static java.lang.Thread.sleep;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;

import com.abmtech.medicalmanagement.R;

@SuppressLint("CustomSplashScreen")
public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Thread thread = new Thread(() -> {
            try {
                sleep(2000);
                startActivity( new Intent(SplashActivity.this, LoginActivity.class));
                finish();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        thread.start();

    }
}