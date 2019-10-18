package com.example.wineabe;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class WelcomeFragment extends Fragment {

    final int SPLASH_TIME_OUT = 3000;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_welcome, container, false);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                getFragmentManager().popBackStack();
            }
        }, SPLASH_TIME_OUT);

        return view;
    }
}
