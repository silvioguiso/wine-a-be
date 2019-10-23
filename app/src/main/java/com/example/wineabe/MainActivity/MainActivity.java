package com.example.wineabe.MainActivity;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import com.example.wineabe.Data.WineryData;
import com.example.wineabe.R;

public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.footer, new FooterFragment())
                .add(R.id.container, new WineriesListFragment())
                .commit();
    }
}
