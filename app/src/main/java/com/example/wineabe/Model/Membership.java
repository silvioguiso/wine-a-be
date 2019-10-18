package com.example.wineabe.Model;

public class Membership {
    private String mLevel;
    private double mAveragePrice;
    private int mNumberOfBottles;
    private double mDiscount;

    public Membership(String level, double avgPrice, int numberOfBottles, double discount){
        mLevel = level;
        mAveragePrice = avgPrice;
        mNumberOfBottles = numberOfBottles;
        mDiscount = discount;
    }
}
