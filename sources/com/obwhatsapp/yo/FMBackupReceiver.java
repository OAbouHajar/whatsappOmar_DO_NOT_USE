package com.obwhatsapp.yo;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.obwhatsapp.youbasha.backuprestore.Controller;
import java.util.Calendar;

public class FMBackupReceiver extends BroadcastReceiver {
    protected static final int REQUEST_CODE = 30583;

    public static void a(Context context) {
        String str = "۟۬ۦۘۜۧ۠۬ۜۢۗ۫ۖۦ۠ۡۘۡۢۢۦۨ";
        Calendar calendar = null;
        while (true) {
            switch ((str.hashCode() ^ 882) ^ -2086209924) {
                case -1701706127:
                    return;
                case -933372094:
                    str = "ۥۢ۟۬ۚۙۗۢۡۜ۟ۡۘۡۦ۫ۧۢۗ";
                    break;
                case -555994018:
                    calendar.set(11, 2);
                    str = "ۨۥ۠ۢۨۜۘ۬ۧۨۘۨۛۨۦۤۤۘۜۛۜ۠ۖۘۙۤۡ";
                    break;
                case 326997235:
                    str = "ۚۨ۬ۗۡۘۢۖ۫ۥ۠۠ۘ۬ۥۤۢۖۘۙۘۘۘۛۛ۬ۙۦۗ";
                    calendar = Calendar.getInstance();
                    break;
                case 1363170420:
                    ((AlarmManager) context.getSystemService("alarm")).setInexactRepeating(0, calendar.getTimeInMillis(), 86400000, PendingIntent.getBroadcast(context, REQUEST_CODE, new Intent(context, FMBackupReceiver.class), 134217728));
                    str = "ۙۦ۟ۚۤۚۛۧۗ۟ۧ۟ۤۦ۫";
                    break;
            }
        }
    }

    public void onReceive(Context context, Intent intent) {
        boolean z2;
        String str = "ۥۛۡۘۢۜ۠۬ۤ۬۫ۖ۫ۛ۟ۤ۟ۨۢ۠ۙۢۚ۬ۧ";
        while (true) {
            switch (str.hashCode() ^ 1627927170) {
                case -1943236286:
                    a(context);
                    break;
                case 342129181:
                    break;
                case 438277480:
                    if ("android.intent.action.BOOT_COMPLETED".equals(intent.getAction())) {
                        str = "۟ۢۛ۠ۧۨۘۚ۟ۜۘۘۖۙۨۧۜۚۦۘ۟۫ۘۘ";
                        break;
                    } else {
                        str = "ۛۚ۫۠ۖۤۚۖۙۥۤۤۙۚۢ۫ۜۦۖ۟ۗۚۖ۫";
                        continue;
                    }
                case 948185956:
                    str = "۠ۥۢ۫ۧۨۘۙۦۡۘۦۡ۠ۖۡۘۘۖۘۛۡۢۢۧۢۥۤۤ۟";
                    continue;
            }
        }
        Calendar instance = Calendar.getInstance();
        int i2 = instance.get(6);
        String str2 = "last_fmbackup" + instance.get(1);
        String str3 = "ۜ۫۫ۦۤۖۘۙ۟ۘۘۘۤۙ۫۟۬";
        while (true) {
            switch (str3.hashCode() ^ -1119873452) {
                case -1894167975:
                    if (i2 - shp.getIntPriv(str2) > 0) {
                        str3 = "۬۠۫ۖۡۨۜۖۚۜ۬ۧۡ۬ۘۨۖۜۚۗ۟ۖۙۘ";
                        break;
                    } else {
                        str3 = "ۜ۠ۡۘۖۧۚۧۗ۠ۧۗۤۤۡۥ";
                        continue;
                    }
                case 379698373:
                    str3 = "ۡۨۖۘۛۛۘۘ۟ۛۖۜۖۜۘۚۘۖۘۢۨۖۘۙۤ۠";
                    continue;
                case 1552033218:
                    z2 = false;
                    break;
                case 1722537138:
                    z2 = true;
                    break;
            }
        }
        String str4 = "۫۬ۖۘۖۗۥۨ۠ۖۦۘ۠ۦۢۤۘۧۖۚۗۢۢۘۗ۟ۧۘۘ";
        while (true) {
            switch (str4.hashCode() ^ -526955466) {
                case -1270775678:
                    str4 = "ۜۢۤ۫ۜ۫ۧۡۜۤۘۘ۠۫ۡۘۜۘۜۖۘۥۡۨۘ۟۫ۥۘ";
                    break;
                case -1240444613:
                    try {
                        Controller.makeBackup(context, true);
                        shp.setIntPriv(str2, i2);
                        a(context);
                        return;
                    } catch (Exception e2) {
                        return;
                    }
                case 512473985:
                    return;
                case 1044917378:
                    if (!z2) {
                        str4 = "ۘۛۜۘۜۛۤۥۙۖۗۙۡۘۚۧۘ۟ۘۦ";
                        break;
                    } else {
                        str4 = "ۥ۬ۛۜۜۡۡ۟ۖ۬۟ۖۘۨۘۜۘۛ۫ۗۙۥۧ۟ۗۜۘ";
                        break;
                    }
            }
        }
    }
}
