package com.example.wineabe.MainActivity;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.example.wineabe.R;

public class WineryCardViewHolder extends RecyclerView.ViewHolder {

    public TextView wineryName;
    public TextView wineryMilesAway;

    public WineryCardViewHolder(@NonNull View itemView) {
        super(itemView);
        wineryName = itemView.findViewById(R.id.text_wineryName);
        wineryMilesAway = itemView.findViewById(R.id.text_wineryMilesAway);
    }
}
