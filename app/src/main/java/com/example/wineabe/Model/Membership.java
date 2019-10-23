package com.example.wineabe.Model;

public class Membership {

    private String mName;
    private double mAveragePrice;
    private int mNumberOfBottles;
    private double mDiscount;

    private int mAnnualReleases;
    private int mMembershipSK;
    private String mWineryName;

    @Override
    public String toString(){
        return mName + "\nBottles: " + mNumberOfBottles + "\nDiscount: " + mDiscount + "\n\n";
    }

    public int getMembershipSK(){
        return mMembershipSK;
    }

    public String getWineryNameAndMembershipLevel(){
        return mWineryName + " - " + mName;
    }

    public String getAveragePrice(){
        return "~ " + mAveragePrice;
    }

    public String getNumberOfBottles(){
        return mNumberOfBottles + " / year";
    }

    public String getDiscount(){
        return "Discount: " + mDiscount + " %";
    }

    public String getAnnualReleases(){
        return "Annual Releases: " + mAnnualReleases;
    }
}
