package com.example.wineabe.Tools;

import android.content.res.Resources;
import android.util.Log;

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.util.List;

public class JSONSerializer {


    public static List<?> parseEntries(Resources resources, Class typeObj, Type objectType, int resourceID){

        InputStream inputStream = resources.openRawResource(resourceID);

        Writer writer = new StringWriter();

        char[] buffer = new char[1024];

        try {
            Reader reader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
            int pointer;

            while ((pointer = reader.read(buffer)) != -1) {
                writer.write(buffer, 0, pointer);
            }

            writer.close();
            reader.close();

        } catch (IOException exception) {
            Log.e(typeObj.getClass().getSimpleName(), "Error writing/reading from the JSON file.", exception);
        } finally {
            try {
                inputStream.close();
            } catch (IOException exception) {
                Log.e(typeObj.getClass().getSimpleName(), "Error closing the input stream.", exception);
            }

        }

        String jsonAsString = writer.toString();
        Gson gson = new Gson();

        return gson.fromJson(jsonAsString, objectType);
    }
}
