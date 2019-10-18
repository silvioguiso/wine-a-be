package com.example.wineabe.Model;

import java.util.ArrayList;
import java.util.List;

public class Winery {

    private List<Membership> mMemberships;
    private List<Wine> mWines;

    private String mName;
    private double mLatitude;
    private double mLongitude;
    private int mAnnualReleases;
    private double mMembershipFee;
    private String mFreeTastings;
    private String mAbout;

    public Winery(String name, double lat, double lon, int annualReleases, double membershipFee, String freeTastings, String about){
        mName = name;
        mLatitude = lat;
        mLongitude = lon;
        mAnnualReleases = annualReleases;
        mMembershipFee = membershipFee;
        mFreeTastings = freeTastings;
        mAbout = about;
    }

    public void setWineries(List<Wine> wines){
        mWines = new ArrayList<>(wines);
    }

    public void setMemberships(List<Membership> memberships){
        mMemberships = new ArrayList<>(memberships);
    }

    public ArrayList<Membership> getMemberships(){
        return (ArrayList)mMemberships;
    }

    public ArrayList<Wine> getWines(){
        return (ArrayList)mWines;
    }
}
