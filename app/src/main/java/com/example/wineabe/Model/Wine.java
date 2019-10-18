package com.example.wineabe.Model;

public class Wine {

    private String mName;
    private int mYear;
    private String mGrape;
    private double mPrice;

    public Wine(String name, String grape, int year, double price){
        mName = name;
        mGrape = grape;
        mYear = year;
        mPrice = price;
    }
}
