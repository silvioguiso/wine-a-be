package com.example.wineabe.MainActivity;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.wineabe.Data.WineEntry;
import com.example.wineabe.R;

public class WineriesListFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_wineries_list, container, false);

        RecyclerView recyclerView = view.findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new GridLayoutManager(getContext(), 1, GridLayoutManager.VERTICAL, false));

        WineryCardRecyclerViewAdapter adapter = new WineryCardRecyclerViewAdapter(
                WineEntry.initWineEntryList(getResources()));

        recyclerView.setAdapter(adapter);

        int largePadding = getResources().getDimensionPixelSize(R.dimen.list_big_padding);
        int smallPadding = getResources().getDimensionPixelSize(R.dimen.list_small_padding);

        recyclerView.addItemDecoration(new WineryGridDecoration(largePadding, smallPadding));

        return view;
    }
}
