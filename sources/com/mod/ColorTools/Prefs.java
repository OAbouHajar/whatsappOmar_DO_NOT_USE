package com.mod.ColorTools;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Prefs {
    public static void checkForNullKey(String str) {
        if (str == null) {
            throw null;
        }
    }

    public static void clear() {
        getEditor().clear().commit();
    }

    public static void clearPriv() {
        getEditorPriv().clear().commit();
    }

    public static boolean getBoolean(String str) {
        return getPreferences().getBoolean(str, false);
    }

    public static boolean getBoolean(String str, boolean z2) {
        return getPreferences().getBoolean(str, z2);
    }

    public static boolean getBooleanPriv(String str) {
        return getPreferencesPriv().getBoolean(str, false);
    }

    public static boolean getBooleanPriv(String str, boolean z2) {
        return getPreferencesPriv().getBoolean(str, z2);
    }

    public static int getDefaultInt(Context context, String str, int i2) {
        return context.getSharedPreferences(Tools.getDefaultPrefName(false), 0).getInt(str, i2);
    }

    public static SharedPreferences.Editor getEditor() {
        return getPreferences().edit();
    }

    public static SharedPreferences.Editor getEditorPriv() {
        return getPreferencesPriv().edit();
    }

    public static float getFloat(String str, float f2) {
        return getPreferences().getFloat(str, f2);
    }

    public static float getFloatPriv(String str, float f2) {
        return getPreferencesPriv().getFloat(str, f2);
    }

    public static int getInt(String str, int i2) {
        return getPreferences().getInt(str, i2);
    }

    public static int getIntPriv(String str, int i2) {
        return getPreferencesPriv().getInt(str, i2);
    }

    public static ArrayList<Integer> getListInt(String str) {
        ArrayList arrayList = new ArrayList(Arrays.asList(TextUtils.split(getPreferences().getString(str, ""), "‚‗‚")));
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(Integer.valueOf(Integer.parseInt((String) it.next())));
        }
        return arrayList2;
    }

    public static ArrayList<String> getListString(String str) {
        return new ArrayList<>(Arrays.asList(TextUtils.split(getPreferences().getString(str, ""), "‚‗‚")));
    }

    public static SharedPreferences getPreferences() {
        return Tools.getContext().getSharedPreferences(Tools.getPrefName(false), 0);
    }

    public static SharedPreferences getPreferencesPriv() {
        return Tools.getContext().getSharedPreferences(SharedPrefs.getPrefName(true), 0);
    }

    public static String getString(String str, String str2) {
        return getPreferences().getString(str, str2);
    }

    public static String getStringPriv(String str) {
        return getPreferencesPriv().getString(str, "");
    }

    public static String getStringPriv(String str, String str2) {
        return getPreferencesPriv().getString(str, str2);
    }

    public static void putBoolean(String str, boolean z2) {
        getEditor().putBoolean(str, z2).apply();
    }

    public static void putBooleanPriv(String str, boolean z2) {
        getEditorPriv().putBoolean(str, z2).apply();
    }

    public static void putInt(String str, int i2) {
        getEditor().putInt(str, i2).apply();
    }

    public static void putIntPriv(String str, int i2) {
        getEditorPriv().putInt(str, i2).apply();
    }

    public static void putListInt(String str, ArrayList<Integer> arrayList) {
        checkForNullKey(str);
        getPreferences().edit().putString(str, TextUtils.join("‚‗‚", (Integer[]) arrayList.toArray(new Integer[arrayList.size()]))).apply();
    }

    public static void putListString(String str, ArrayList<String> arrayList) {
        checkForNullKey(str);
        getPreferences().edit().putString(str, TextUtils.join("‚‗‚", (String[]) arrayList.toArray(new String[arrayList.size()]))).apply();
    }

    public static void putString(String str, String str2) {
        getEditor().putString(str, str2).apply();
    }

    public static void putStringPriv(String str, String str2) {
        getEditorPriv().putString(str, str2).apply();
    }

    public static void remove(String str) {
        getEditor().remove(str).apply();
    }

    public static void removePriv(String str) {
        getEditorPriv().remove(str).apply();
    }

    public static void resetPrefs(String str, String str2) {
        SharedPreferences.Editor edit = Tools.getContext().getSharedPreferences(str, 0).edit();
        edit.remove(str2);
        edit.apply();
    }
}
