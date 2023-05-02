package com.mod.bomfab.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.mod.bomfab.application.Global;

public class Prefs {
    public static String PREF_NAME = "com.wa.c_ben";
    private static Context context;

    public Prefs(Context context2) {
        context = context2;
    }

    public static boolean GetSharedContains(Context context2, String str) {
        return PreferenceManager.getDefaultSharedPreferences(context2).contains(str);
    }

    public static void clear() {
        getEditor().clear().commit();
    }

    public static boolean getBoolean(String str, boolean z2) {
        return getPreferences().getBoolean(str, z2);
    }

    public static boolean getBooleanFromkey(String str, Context context2) {
        return PreferenceManager.getDefaultSharedPreferences(context2).getBoolean(str, true);
    }

    public static boolean getBooleanFromkeyy(String str) {
        return PreferenceManager.getDefaultSharedPreferences(context).getBoolean(str, true);
    }

    public static SharedPreferences.Editor getEditor() {
        return getPreferences().edit();
    }

    public static float getFloat(String str, float f2) {
        return getPreferences().getFloat(str, f2);
    }

    public static int getInt(String str, int i2) {
        return getPreferences().getInt(str, i2);
    }

    public static SharedPreferences getPreferences() {
        return PreferenceManager.getDefaultSharedPreferences(Global.getContext());
    }

    public static String getString(String str, String str2) {
        return getPreferences().getString(str, str2);
    }

    public static void putBoolean(String str, boolean z2) {
        getEditor().putBoolean(str, z2).apply();
    }

    public static void putInt(String str, int i2) {
        getEditor().putInt(str, i2).apply();
    }

    public static void putString(String str, String str2) {
        getEditor().putString(str, str2).apply();
    }

    public static void remove(String str) {
        getEditor().remove(str).apply();
    }

    public boolean GetSharedContains(String str) {
        return PreferenceManager.getDefaultSharedPreferences(context).contains(str);
    }
}
