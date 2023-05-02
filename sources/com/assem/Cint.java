package com.assem;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/* renamed from: com.assem.int  reason: invalid class name */
public class Cint {
    public static boolean Isarab = false;
    public static SharedPreferences arabpref;
    public static Context ctx;
    public static String datafolder;
    protected static final char[] hexArray = "0123456789ABCDEF".toCharArray();
    public static SQLiteOpenHelper sql;

    public static int HideAutoText_a() {
        return getBoolean("HideAutoText") ? getResID("conversation", "layout") : getResID("conversation_n", "layout");
    }

    public static int HideAutoText_b() {
        return getBoolean("HideAutoText") ? getResID("wamod_theme_hangouts_conversation", "layout") : getResID("wamod_theme_hangouts_conversation_n", "layout");
    }

    public static int HideAutoText_c() {
        return getBoolean("HideAutoText") ? getResID("wamod_theme_wamod_conversation", "layout") : getResID("wamod_theme_wamod_conversation_n", "layout");
    }

    public static int HideConversationInfo() {
        return getResID("conversation_actionbarh", "layout");
    }

    /* renamed from: HideConversationInfo  reason: collision with other method in class */
    public static boolean m7HideConversationInfo() {
        return getBoolean("HideConversationInfo");
    }

    public static int Nasseroldui() {
        return getBoolean("Nasseroldui") ? getResID("homeo", "layout") : getResID("home", "layout");
    }

    public static int Newold() {
        return getBoolean("enable_old") ? getResID("homeo", "layout") : getResID("home", "layout");
    }

    public static boolean OLDUI() {
        return getBoolean("enable_old");
    }

    public static boolean getBoolean(String str) {
        return ctx.getSharedPreferences("com.obwhatsapp_gb", 0).getBoolean(str, false);
    }

    public static int getResID(String str, String str2) {
        return ctx.getResources().getIdentifier(str, str2, ctx.getPackageName());
    }

    public static String getString(String str) {
        return ctx.getString(ctx.getResources().getIdentifier(str, "string", ctx.getPackageName()));
    }

    public static void init(Context context) {
        if (context instanceof Activity) {
            ctx = context.getApplicationContext();
        } else {
            ctx = context;
        }
        if (ctx != null) {
            Log.d("mods", "Context var initialized to NULL!!!");
        }
    }
}
