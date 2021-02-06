package com.example.amazonclone.PreferenceClass;

import android.content.Context;
import android.content.SharedPreferences;

public class PreferenceHelper {
    private static final String PREFERENCE_NAME = "users";
    private static SharedPreferences sharedPreferences;

    public static SharedPreferences getSharedPreferences(Context context) {
        if (sharedPreferences == null) {
            sharedPreferences = context.getSharedPreferences(PREFERENCE_NAME, Context.MODE_PRIVATE);

        }
        return sharedPreferences;
    }

    public static void writeBooleanToPreference(String key, boolean value) {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putBoolean(key, value);
        editor.apply();
    }

    public static void writeIntToPreference(String key, int value) {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putInt(key, value);
        editor.apply();
    }

    public static void writeStringToPreference(String key, String value) {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(key, value);
        editor.apply();
    }
    public static void clear(){
        SharedPreferences.Editor editor=sharedPreferences.edit();
        editor.clear();
        editor.apply();
    }

    public static int getIntFromPreference(String key) {
        return sharedPreferences.getInt(key, 0);
    }

    public static String getStringFromPreference(String key) {
        return sharedPreferences.getString(key, "");
    }

    public static boolean getBooleanFromPreference(String key) {
        return sharedPreferences.getBoolean(key, false);
    }
}
