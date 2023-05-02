package com.B58works;

import android.app.Activity;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import com.B58works.IDGen;
import com.obwhatsapp.yo.yo;
import java.util.HashSet;

public class B58 {
    public static final String JID = "B58";

    /* renamed from: b  reason: collision with root package name */
    static HashSet<String> f84b = null;

    /* renamed from: c  reason: collision with root package name */
    static Activity f85c;
    static String contains;
    public static Context ctx;
    public static SharedPreferences pref;
    public static SharedPreferences.Editor prefedit;

    public static void init(Context context) {
        pref = context.getSharedPreferences("WhatsAppriv", 0);
        prefedit = pref.edit();
        ctx = context;
    }

    public static void masfollow(int i2, Context context) {
        if (i2 == IDGen.id.tb1) {
            context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://updateomar.com/obwh")));
        } else if (i2 == IDGen.id.tb2) {
            context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://t.me/whatsomar")));
        }
    }

    public static void masfollow(Menu menu) {
        SubMenu addSubMenu = menu.addSubMenu(1, 0, 0, yo.getString("masmods"));
        addSubMenu.add(2, IDGen.id.tb1, 0, yo.getString("assem_download_wap"));
        addSubMenu.add(2, IDGen.id.tb2, 0, yo.getString("assem_download_telegram"));
        int id = yo.getID("div2", "id");
    }

    public static void onOptionsItemSelected(MenuItem menuItem, Context context) {
        masfollow(menuItem.getItemId(), context);
    }

    public static void rebootApp(Context context) {
        ((AlarmManager) context.getSystemService("alarm")).set(1, System.currentTimeMillis() + 100, PendingIntent.getActivity(context, 123456, context.getPackageManager().getLaunchIntentForPackage(context.getPackageName()), 268435456));
        System.exit(0);
    }
}
