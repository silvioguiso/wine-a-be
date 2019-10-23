package com.example.wineabe.Data;

import android.content.res.Resources;

import com.example.wineabe.Model.Winery;
import com.example.wineabe.R;
import com.example.wineabe.Tools.JSONSerializer;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class WineryData{

    private static List<Winery> mWineries;

    public static void initWineEntryList(Resources resources) {

        Type type = new TypeToken<ArrayList<Winery>>(){

        }.getType();

        mWineries = (ArrayList<Winery>) JSONSerializer.parseEntries(resources, Winery.class, type, R.raw.wineries);
    }

    public static List<Winery> getWineries(){
        return mWineries;
    }

    public static List<Winery> getMyMembershipInfo(){

        if(mWineries == null){
            return null;
        }

        return mWineries.stream()
                .filter(c -> c.getName().equals("Lobo Hills") || c.getName().equals("Damsel Cellars"))
                .collect(Collectors.toList());
    }

    public static int getWineryCount(){
        return mWineries.size();
    }

    public static Winery getWineryBySK(int winerySK){
        return mWineries.stream().filter(c -> c.getWinerySK() == winerySK).findFirst().orElse(new Winery());
    }

    public static Winery getWineryByPosition(int position){
        return mWineries.get(position);
    }
}
