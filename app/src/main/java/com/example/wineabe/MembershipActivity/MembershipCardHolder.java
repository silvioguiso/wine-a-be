package com.example.wineabe.MembershipActivity;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.wineabe.R;
import com.google.android.material.card.MaterialCardView;

public class MembershipCardHolder extends RecyclerView.ViewHolder{

    public TextView text_wineryName;
    public TextView text_bottlesPerYear;
    public TextView text_averagePrice;
    public TextView text_discount;
    public TextView text_annualReleases;

    public MaterialCardView card;

    public MembershipCardHolder(@NonNull View itemView) {

        super(itemView);
        text_wineryName = itemView.findViewById(R.id.text_wineryName);
        text_bottlesPerYear = itemView.findViewById(R.id.text_bottles);
        text_averagePrice = itemView.findViewById(R.id.text_price);
        text_discount = itemView.findViewById(R.id.text_discount);
        text_annualReleases = itemView.findViewById(R.id.text_releases);

        card = itemView.findViewById(R.id.card);
    }
}
