package com.example.wineabe.MembershipActivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.wineabe.R;

public class MembershipActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle(R.string.my_memberships);
        setContentView(R.layout.activity_membership);


        MembershipCardRecyclerViewAdapter adapter = new MembershipCardRecyclerViewAdapter();
        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.recycler_memberships);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new GridLayoutManager(getApplicationContext(), 1, GridLayoutManager.VERTICAL, false ));

        recyclerView.setAdapter(adapter);
    }
}
