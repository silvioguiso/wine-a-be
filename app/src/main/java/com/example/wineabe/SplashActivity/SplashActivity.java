package com.example.wineabe.SplashActivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;

import com.example.wineabe.Data.WineryData;
import com.example.wineabe.MainActivity.MainActivity;
import com.example.wineabe.R;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Hide action bar with the title.
        this.getSupportActionBar().hide();

        setContentView(R.layout.activity_splash);

        //Load data during the splash screen.
        AsyncTask.execute(new Runnable() {
            @Override
            public void run() {
                WineryData.initWineEntryList(getResources());
            }
        });

        Handler handler = new Handler();

        handler.postDelayed(new Runnable() {

            public void run() {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }

        }, 2500);
    }

    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }
}
