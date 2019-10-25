package com.example.wineabe.MainActivity;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.wineabe.R;

public class WineriesListFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_wineries_list, container, false);

        RecyclerView recyclerView = view.findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false));

        recyclerView.setAdapter(new WineryCardRecyclerViewAdapter());

        int largePadding = getResources().getDimensionPixelSize(R.dimen.list_big_padding);
        int smallPadding = getResources().getDimensionPixelSize(R.dimen.list_small_padding);

        recyclerView.addItemDecoration(new WineryGridDecoration(largePadding, smallPadding));

        return view;
    }
}
