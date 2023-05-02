package com.mod.bomfab.utils;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.preference.PreferenceManager;
import android.support.v4.view.MotionEventCompat;
import android.view.View;
import android.widget.TextView;
import com.mod.bomfab.application.Global;

public class Tools {
    static Dialog dialog;
    private static boolean mView;
    static Context vv;

    Tools(Context context) {
        vv = context;
    }

    public static boolean Auto_restart() {
        return getBooleanFromkeyy("Auto_restart");
    }

    public static void SetBoldToolBarText(Context context, TextView textView) {
        if (!getBooleanFromkey(context, "back_normal")) {
            textView.setTypeface(textView.getTypeface(), 0);
        } else {
            textView.setTypeface(textView.getTypeface(), 1);
        }
    }

    public static int bgBar(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getInt("warna_bar", -16359850);
    }

    public static Drawable colorDrawable(int i2, int i3, PorterDuff.Mode mode) {
        Drawable drawable = Global.getContext().getResources().getDrawable(i2);
        drawable.setColorFilter(i3, mode);
        return drawable;
    }

    public static Drawable colorDrawable(String str, int i2, PorterDuff.Mode mode) {
        Drawable drawable = getDrawable(str);
        drawable.setColorFilter(i2, mode);
        return drawable;
    }

    public static int dpToPx(Context context, float f2) {
        return Math.round(context.getResources().getDisplayMetrics().density * f2);
    }

    public static int fabColorDisable(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getInt("warna_fab_disable", -16359850);
    }

    public static int fabColorNormal(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getInt("warna_fab_normal", -16359850);
    }

    public static int fabColorPressed(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getInt("warna_fab_pressed", -1);
    }

    public static int fabColorRipple(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getInt("warna_fab_ripple", -1);
    }

    public static int fabIconColor(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getInt("warna_fab_icon", -1);
    }

    public static int fabLabelColor(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getInt("warna_fab_label", -1);
    }

    public static boolean getBooleanFromkey(Context context, String str) {
        return PreferenceManager.getDefaultSharedPreferences(context).getBoolean(str, true);
    }

    public static boolean getBooleanFromkeyy(String str) {
        return PreferenceManager.getDefaultSharedPreferences(vv).getBoolean(str, true);
    }

    public static int getColor(String str) {
        return Global.getContext().getResources().getColor(intColor(str));
    }

    public static Drawable getDrawable(String str) {
        return Global.getResources().getDrawable(intDrawable(str));
    }

    public static int getID(String str, String str2) {
        return Global.getContext().getResources().getIdentifier(str, str2, Global.getContext().getPackageName());
    }

    public static int getIntFromkey(Context context, String str) {
        return PreferenceManager.getDefaultSharedPreferences(context).getInt(str, 0);
    }

    public static String getString(String str) {
        return Global.getContext().getString(Global.getResources().getIdentifier(str, "string", Global.getContext().getPackageName()));
    }

    public static int intAnim(String str) {
        return Global.getContext().getResources().getIdentifier(str, "anim", Global.getContext().getPackageName());
    }

    public static int intArrays(String str) {
        return Global.getContext().getResources().getIdentifier(str, "array", Global.getContext().getPackageName());
    }

    public static int intAttrs(String str) {
        return Global.getContext().getResources().getIdentifier(str, "attr", Global.getContext().getPackageName());
    }

    public static int intColor(String str) {
        return Global.getContext().getResources().getIdentifier(str, "color", Global.getContext().getPackageName());
    }

    public static int intDimen(String str) {
        return Global.getContext().getResources().getIdentifier(str, "dimen", Global.getContext().getPackageName());
    }

    public static int intDrawable(String str) {
        return Global.getContext().getResources().getIdentifier(str, "drawable", Global.getContext().getPackageName());
    }

    public static int intId(String str) {
        return Global.getContext().getResources().getIdentifier(str, "id", Global.getContext().getPackageName());
    }

    public static int intLayout(String str) {
        return Global.getContext().getResources().getIdentifier(str, "layout", Global.getContext().getPackageName());
    }

    public static int intMenu(String str) {
        return Global.getContext().getResources().getIdentifier(str, "menu", Global.getContext().getPackageName());
    }

    public static int intString(String str) {
        return Global.getContext().getResources().getIdentifier(str, "string", Global.getContext().getPackageName());
    }

    public static int intStyle(String str) {
        return Global.getContext().getResources().getIdentifier(str, "style", Global.getContext().getPackageName());
    }

    public static int intStyleable(String str) {
        return Global.getContext().getResources().getIdentifier(str, "styleable", Global.getContext().getPackageName());
    }

    public static int intXml(String str) {
        return Global.getContext().getResources().getIdentifier(str, "xml", Global.getContext().getPackageName());
    }

    public static boolean isDarken(int i2) {
        return ((double) 1) - ((((0.299d * ((double) Color.red(i2))) + (0.587d * ((double) Color.green(i2)))) + (0.114d * ((double) Color.blue(i2)))) / ((double) MotionEventCompat.ACTION_MASK)) >= 0.5d;
    }

    public static void pagerTabBk(View view) {
    }

    public static int setBorderColor(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getInt("warna_border", -5939653);
    }

    public static String setNameText(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getString("text_name", "OBWhatsApp");
    }

    public static void setRunningColorText(Context context, TextView textView) {
        if (!getBooleanFromkey(context, "normal_text")) {
            textView.setTextColor(getIntFromkey(context, "running_text_color"));
            textView.setTypeface(textView.getTypeface(), 1);
            return;
        }
        textView.setTextColor(-1);
        textView.setTypeface(textView.getTypeface(), 1);
    }

    public static String setStatusText(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getString("text_status", "Create Your Status");
    }

    public static int setTabIconColor(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getInt("warna_icon_tab", -1);
    }

    public static int setTabSpaceButton(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getInt("warna_button_space", -65536);
    }

    public static int setTabSpaceColor(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getInt("warna_tab_space", -16359850);
    }

    public static int setTabSpaceColor2(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getInt("warna_tab_space2", -5939653);
    }

    public static int setTabSpaceTextColor(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getInt("warna_text_space", -1);
    }

    public static int setWarnaFab() {
        return -16711936;
    }

    public static int setWarnaFabIcon() {
        return -65536;
    }

    public static void startActivity(Activity activity, Class cls) {
        activity.startActivity(new Intent(activity, cls));
    }

    public static void startService(Activity activity, Class cls) {
        activity.startService(new Intent(activity, cls));
    }
}
