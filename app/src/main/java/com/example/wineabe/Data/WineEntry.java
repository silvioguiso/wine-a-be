package com.example.wineabe.Data;

import android.content.res.Resources;
import android.net.Uri;
import android.util.Log;

import com.example.wineabe.R;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class WineEntry {

    private static final String TAG = WineEntry.class.getSimpleName();

    public final String name;
    public final String lat;
    public final String lon;
    public final String about;
    public final String membershipFee;
    public final String freeTasting;
    public final String annualReleases;


    public WineEntry(String name, String lat, String lon, String about, String membershipFee, String freeTasting, String annualReleases) {

        this.name = name;
        this.lat = lat;
        this.lon = lon;
        this.about = about;
        this.membershipFee = membershipFee;
        this.annualReleases = annualReleases;
        this.freeTasting = freeTasting;
    }

    public static List<WineEntry> initWineEntryList(Resources resources) {
        InputStream inputStream = resources.openRawResource(R.raw.wineries);

        Writer writer = new StringWriter();

        char[] buffer = new char[1024];

        try {
            Reader reader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
            int pointer;
            while ((pointer = reader.read(buffer)) != -1) {
                writer.write(buffer, 0, pointer);
            }
        } catch (IOException exception) {
            Log.e(TAG, "Error writing/reading from the JSON file.", exception);
        } finally {
            try {
                inputStream.close();
            } catch (IOException exception) {
                Log.e(TAG, "Error closing the input stream.", exception);
            }
        }

        String jsonWineriesString = writer.toString();
        Gson gson = new Gson();

        Type wineriesListType = new TypeToken<ArrayList<WineEntry>>() {

        }.getType();

        return gson.fromJson(jsonWineriesString, wineriesListType);
    }
}
