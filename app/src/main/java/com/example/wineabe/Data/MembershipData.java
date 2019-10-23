package com.example.wineabe.Data;

import android.content.res.Resources;

import com.example.wineabe.Model.Membership;
import com.example.wineabe.R;
import com.example.wineabe.Tools.JSONSerializer;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class MembershipData {

    private static List<Membership> mMemberships;

    public static void initMembershipInfo(Resources resources) {

        Type type = new TypeToken<ArrayList<Membership>>(){

        }.getType();

        mMemberships = (ArrayList<Membership>) JSONSerializer.parseEntries(resources, Membership.class, type, R.raw.memberships);
    }

    public static int getMembershipCount(){
        return mMemberships.size();
    }

    public static Membership getMembershipBySK(int membershipSK){
        return mMemberships.stream().filter(c -> c.getMembershipSK() == membershipSK).findFirst().orElse(new Membership());
    }

    public static Membership getMembershipByPosition(int position){
        return mMemberships.get(position);
    }
}
