package com.example.wineabe.MainActivity;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.wineabe.Data.WineryData;
import com.example.wineabe.Model.Winery;
import com.example.wineabe.R;
import com.example.wineabe.WineryDetailsActivity.WineryDetailsActivity;

public class WineryCardRecyclerViewAdapter extends RecyclerView.Adapter<WineryCardViewHolder> {

    @NonNull
    @Override
    public WineryCardViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.wine_card, parent, false);

        return new WineryCardViewHolder(layoutView);
    }

    @Override
    public void onBindViewHolder(@NonNull WineryCardViewHolder holder, int position) {
        Winery winery = WineryData.getWineryByPosition(position);

        if (winery != null) {
            holder.wineryName.setText(winery.getName());
            holder.wineryMilesAway.setText(winery.getMilesAway());

            if(winery.isVisited()){
                holder.visited.setVisibility(View.VISIBLE);
            }

            if(winery.isFavorited()){
                holder.favorited.setVisibility(View.VISIBLE);
            }

            holder.card.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(holder.card.getContext(), WineryDetailsActivity.class);
                    intent.putExtra(WineryDetailsActivity.WINERYSK, winery.getWinerySK());
                    holder.card.getContext().startActivity(intent);
                }
            });
        }
    }

    @Override
    public int getItemCount() {
        return WineryData.getWineryCount();
    }

}
