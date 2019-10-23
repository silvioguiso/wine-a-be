package com.example.wineabe.Model;

public class Membership {

    private String mName;
    private double mAveragePrice;
    private int mNumberOfBottles;
    private double mDiscount;

    public Membership(String name, double avgPrice, int numberOfBottles, double discount){
        mName = name;
        mAveragePrice = avgPrice;
        mNumberOfBottles = numberOfBottles;
        mDiscount = discount;
    }

    @Override
    public String toString(){
        return mName + "\nBottles: " + mNumberOfBottles + "\nDiscount: " + mDiscount + "\n\n";
    }
}
