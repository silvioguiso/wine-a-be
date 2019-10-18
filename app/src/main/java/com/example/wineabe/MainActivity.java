package com.example.wineabe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import java.time.Duration;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Thread timer= new Thread()
        {
            public void run()
            {
                try
                {
                    //Display for 2.5 seconds
                    sleep(2500);
                }
                catch (InterruptedException e)
                {
                    // TODO: handle exception
                    e.printStackTrace();
                }
                finally
                {
                    Intent openList = new Intent(getApplicationContext(), ListWineriesActivity.class);
                    startActivity(openList);
                }
            }
        };

        timer.start();
    }

    //We don't need this one anymore, so we destroy it as soon as it's out of sight.
    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }
}
