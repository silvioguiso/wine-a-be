package com.example.wineabe.MembershipActivity;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.wineabe.Data.MembershipData;
import com.example.wineabe.Model.Membership;
import com.example.wineabe.R;


public class MembershipCardRecyclerViewAdapter extends RecyclerView.Adapter<MembershipCardHolder>{

    @NonNull
    @Override
    public MembershipCardHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.membership_card, parent, false);

        return new MembershipCardHolder(layoutView);
    }

    @Override
    public void onBindViewHolder(@NonNull MembershipCardHolder holder, int position) {
        Membership membership = MembershipData.getMembershipByPosition(position);

        if (membership != null) {
            holder.text_wineryName.setText(membership.getWineryNameAndMembershipLevel());
            holder.text_discount.setText(membership.getDiscount());
            holder.text_annualReleases.setText(membership.getAnnualReleases());
            holder.text_bottlesPerYear.setText(membership.getNumberOfBottles());
            holder.text_averagePrice.setText(membership.getAveragePrice());
        }
    }

    @Override
    public int getItemCount() {
        return MembershipData.getMembershipCount();
    }
}
