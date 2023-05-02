package com.mod.tools.utils;

import android.content.SharedPreferences;
import com.mod.tools.control.Global;

public class Prefs {
    public static String PREF_NAME = "OBWhatsApp";

    public static void clear() {
        getEditor().clear().commit();
    }

    public static boolean getBoolean(String str, boolean z2) {
        return getPreferences().getBoolean(str, z2);
    }

    public static boolean getBoolean2(String str) {
        return getPreferences().getBoolean(str, true);
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
        return Global.getContext().getSharedPreferences(PREF_NAME, 0);
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
}
