package com.example.wineabe.MainActivity;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.example.wineabe.Data.WineEntry;
import com.example.wineabe.R;

import java.util.List;

public class WineryCardRecyclerViewAdapter extends RecyclerView.Adapter<WineryCardViewHolder> {

    private List<WineEntry> mWineryList;

    WineryCardRecyclerViewAdapter(List<WineEntry> wineryList) {
        this.mWineryList = wineryList;
    }

    @NonNull
    @Override
    public WineryCardViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.wine_card, parent, false);
        return new WineryCardViewHolder(layoutView);
    }

    @Override
    public void onBindViewHolder(@NonNull WineryCardViewHolder holder, int position) {
        if (mWineryList != null && position < mWineryList.size()) {
            WineEntry wineEntry = mWineryList.get(position);
            holder.wineryName.setText(wineEntry.name);
            holder.wineryMilesAway.setText(wineEntry.freeTasting);
        }
    }

    @Override
    public int getItemCount() {
        return mWineryList.size();
    }
}
