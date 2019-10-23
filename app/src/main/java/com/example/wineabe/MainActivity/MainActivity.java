package com.example.wineabe.MainActivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.example.wineabe.MembershipActivity.MembershipActivity;
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

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        View item = (View)findViewById(R.id.menu_memberships);

        item.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MembershipActivity.class);
                startActivity(intent);
            }
        });

        return super.onCreateOptionsMenu(menu);
    }
}

