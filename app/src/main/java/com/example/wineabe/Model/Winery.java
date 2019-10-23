package com.example.wineabe.Model;
import android.net.Uri;

import com.example.wineabe.R;

import java.util.List;

public class Winery {

    private List<Membership> mMemberships;
    private List<Wine> mWines;

    private String mName;
    private int mWinerySK;
    private double mLatitude;
    private double mLongitude;
    private int mAnnualReleases;
    private double mMembershipFee;
    private String mFreeTastings;
    private String mAbout;
    private double mMilesAway;
    private boolean mVisited;
    private boolean mFavorited;

    public String getName(){
        return mName;
    }

    public String getTastings(){
        return mFreeTastings;
    }

    public boolean isVisited(){
        return mVisited;
    }

    public boolean isFavorited(){
        return mFavorited;
    }

    public int getWinerySK(){
        return mWinerySK;
    }

    public String getMilesAway(){
        if (mMilesAway == 1 || mMilesAway == 0.1){
            return mMilesAway + " mile away";
        }
        else{
            return mMilesAway + " miles away";
        }
    }

    public String getDetails(){
        return mAbout;
    }

    public String getWineInformation(){
        StringBuilder sb = new StringBuilder();

        for(Wine w : mWines){
            sb.append(w.toString());
        }

        return sb.toString();
    }

    public String getMembershipInformation(){
        StringBuilder sb = new StringBuilder();

        for(Membership m : mMemberships){
            sb.append(m.toString());
        }

        return sb.toString();
    }

    public Uri getLocationUri(){
        return Uri.parse("geo:0,0?q=" + mLatitude + "," + mLongitude + "(" + mName + ")");
    }

    //I know, I know... this is unforgivable...
    public int getImageID(){
        switch(mWinerySK){
            case 1 /*Lobo*/:
                return R.drawable.cork;
            case 2 /*patterson*/:
                return R.drawable.grapes;
            case 3 /*damsel*/:
                return R.drawable.wine_orchard;
            case 4 /*page*/:
                return R.drawable.wine_pour;
            default:
                return 0;
        }
    }
}
