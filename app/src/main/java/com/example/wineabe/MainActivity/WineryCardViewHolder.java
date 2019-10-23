package com.example.wineabe.MainActivity;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.example.wineabe.R;
import com.google.android.material.card.MaterialCardView;

public class WineryCardViewHolder extends RecyclerView.ViewHolder {

    public TextView wineryName;
    public TextView wineryMilesAway;
    public ImageView visited;
    public ImageView favorited;
    public MaterialCardView card;


    public WineryCardViewHolder(@NonNull View itemView) {
        super(itemView);
        wineryName = itemView.findViewById(R.id.text_wineryName);
        wineryMilesAway = itemView.findViewById(R.id.text_wineryMilesAway);
        visited = itemView.findViewById(R.id.image_visited);
        favorited = itemView.findViewById(R.id.image_favorite);
        card = itemView.findViewById(R.id.wineCard);
    }
}
