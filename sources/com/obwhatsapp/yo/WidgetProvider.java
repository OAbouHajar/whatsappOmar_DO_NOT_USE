package com.obwhatsapp.yo;

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.os.Bundle;
import android.widget.RemoteViews;
import com.obwhatsapp.youbasha.others;
import java.io.File;

public class WidgetProvider extends AppWidgetProvider {

    /* renamed from: a  reason: collision with root package name */
    public static int f604a;

    public static int a(AppWidgetManager appWidgetManager, int i2) {
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = "ۜ۠۠ۦۡۘۘۛۦۥۡۘۘۘ۠ۗۨۧۡۘ";
        while (true) {
            switch ((str4.hashCode() ^ 281) ^ 880445111) {
                case -2138136729:
                    str4 = "ۜۧ۟ۗۛۘۛۤۜۘ۫ۨۥۧۦۡۖۥۨۧ۬ۥ۠ۛ۬ۙ۬";
                    str3 = str2;
                    break;
                case -1918061920:
                    str4 = "۠ۗ۠ۧۥۘۥۚۥۧۧ۫ۖۚۧۡۢ";
                    i6 = i5;
                    break;
                case -1915201013:
                    String str5 = "ۡۙۗۤ۟ۜۘۛ۬ۧ۠ۡۦۖ۬ۨۢۦۦۘ";
                    while (true) {
                        switch (str5.hashCode() ^ -1263824853) {
                            case -816402082:
                                str4 = "ۧۜۗۘۜۘۖۨۥ۠ۥۖۢۡۖۘ";
                                continue;
                            case 516745087:
                                str4 = "۟ۡۖۘۙۚۛ۫۟ۥۘۚۙۜۡۢۖۜۘ";
                                continue;
                            case 1320523176:
                                if (i6 - 1 <= 1) {
                                    str5 = "ۜۚۡ۠ۧۡ۬۫ۨۛۛ۠ۘۡۡۘۛ۠ۘۘۗۧۖۘ۟ۘۡۘ";
                                    break;
                                } else {
                                    str5 = "ۤۛۧۖۙۚۛ۟ۦۘۡۗۤۡۧۥ۟ۧ۫ۢۖۛۦۚۘۘ";
                                    break;
                                }
                            case 1406027661:
                                str5 = "ۡۙ۠۠ۦۦۘۛۘۚۢۚۛۦۚ۟۬ۡۜۧۙۢۨۥۨۘۤۛۖۘ";
                                break;
                        }
                    }
                    break;
                case -1617536528:
                    return yo.getID(str3, "layout");
                case -1517880826:
                    String str6 = "ۥۧۥۖۢۦۘۖۨۥۘۜ۫ۤۨۘۨۢۛۡۧۡۦ";
                    while (true) {
                        switch (str6.hashCode() ^ 1455244404) {
                            case -2108621121:
                                str6 = "ۦۥۦۚۜۤۜۘ۫۫ۧۡۘۡۘۧۘۖ۠ۨۘ۟۫۟";
                                break;
                            case -1616863682:
                                str4 = "۬ۜۗ۫ۛۨ۠ۚ۟ۖۛۥۥۢۜۦ۟ۤ";
                                continue;
                            case -545986119:
                                if (!z4) {
                                    str6 = "۫۬ۡۗۛ۬۬۟ۗۛۜۦۘۖۛۜۘ۬ۖۘ۬ۛۡۗۤۥۘۧۨ۟";
                                    break;
                                } else {
                                    str6 = "ۚۧۦۧۜۨۘۤ۟ۨۘ۠ۖۦۘۘۥ۬ۖۤۧ";
                                    break;
                                }
                            case 533807390:
                                str4 = "ۚ۠۬ۘۢۖۘۘۢۚۛۗۨۘ۟ۧۖۘۥۘ";
                                continue;
                        }
                    }
                    break;
                case -366957331:
                    str4 = "ۡۨۡۡۨۖۢۧۜۘ۬ۚۖۘۘۖ۟۫۬۫ۡۚ";
                    break;
                case -217200929:
                    str4 = "۫۠ۨۘۨۦۦ۬ۜۛ۠ۘۧۘۖۚۖۘۚ۠۫ۤۥۡۘ";
                    i6 = i4;
                    break;
                case -194291585:
                    str4 = "ۙۖۙۖۨ۫ۥۜۛۨۢۦۘۖۦۘۘۦ۫ۘ۟ۛۨۘ۠ۨۧ";
                    z4 = z2;
                    break;
                case -136099861:
                    str4 = "۠ۤۜۘۤۛۦۘۖۥۦۛۜۘۘۧ۠ۥۘ";
                    str3 = str;
                    break;
                case 97411894:
                    str2 = "yowidget_small_layout";
                    str4 = "ۨۛۥۘ۫ۦۧۘۧۗۨۘ۟ۜۡۦ۫ۘۢ۠ۨ";
                    break;
                case 233646197:
                    i5 = i6 + 1;
                    str4 = "۠ۚ۟۫ۢۘۢۘۚۗۥۢۗ۫ۢۙۨۥۘ۟۫ۢۧۡۖۘ";
                    break;
                case 265453023:
                    z3 = false;
                    str4 = "ۤۤۦۢ۫ۢۛۜ۠ۛۖۦۦ۬ۜۘۘۖ۬";
                    break;
                case 297006710:
                    str4 = "۫۠ۨۘۨۦۦ۬ۜۛ۠ۘۧۘۖۚۖۘۚ۠۫ۤۥۡۘ";
                    break;
                case 308288040:
                    String str7 = "۠ۤۥۘۢ۬۟ۜۗۡۗ۫ۧۨۡۘۛۚۨۛۘۢ۫ۤۨۘ";
                    while (true) {
                        switch (str7.hashCode() ^ 1132968765) {
                            case -1458445372:
                                if ((i6 * 70) - 30 >= i3) {
                                    str7 = "ۖۧ۫ۢۘ۬ۙ۟ۨۘ۠ۧ۬ۜۜۚ۠ۥۦۗۙ۟۠ۘۘۗۢۙ";
                                    break;
                                } else {
                                    str7 = "ۜۨ۫ۡۗۦۘۦۨۧۘ۠ۦۚۗۤۧۥۚۨ";
                                    break;
                                }
                            case -1179375730:
                                str7 = "ۘۛۘۦ۬ۢۨۨۦۙۗۥۤۗۥۡۘۥۘۦۦۥۘۖۧ";
                                break;
                            case -696322107:
                                str4 = "ۤ۬ۗۡۖۥۘۦۢۢۚ۟ۦ۫ۡ۫ۤۤۘۖ۟ۖۘۧۛ۬ۖۧۦۘ";
                                continue;
                            case -82195028:
                                str4 = "ۗ۠۫۠ۘۖۘۢۗۥۘۗۤۛۤۜۧۙۖۜۘۗۙۧۖ۠ۨ";
                                continue;
                        }
                    }
                    break;
                case 629111561:
                    str = "yowidget_layout";
                    str4 = "۟ۡۨۘۨۘۜۘۥۛ۠ۧ۠ۚۦۧ۫ۨۥۗ";
                    break;
                case 803121468:
                    i3 = appWidgetManager.getAppWidgetOptions(i2).getInt("appWidgetMinWidth");
                    str4 = "ۧۖۦۘۤۨۜۜۜۡۖۧۙ۠ۚۨۡۧۘۗۡۨۘ۟۬ۦۥۘ";
                    break;
                case 833689449:
                    str4 = "ۜۢۨۖۨۛۗ۠۬ۢۙۛ۠۫ۦۘ";
                    break;
                case 946712185:
                    z2 = true;
                    str4 = "ۗۦۤ۫ۡۚۥۜ۫ۢۧ۫۬۫ۡۘۥۙۜۜۜۖۘۘۗۗ";
                    break;
                case 1046008213:
                    str4 = "ۜۧ۟ۗۛۘۛۤۜۘ۫ۨۥۧۦۡۖۥۨۧ۬ۥ۠ۛ۬ۙ۬";
                    break;
                case 1348772643:
                    str4 = "ۡۨۡۡۨۖۢۧۜۘ۬ۚۖۘۘۖ۟۫۬۫ۡۚ";
                    z4 = z3;
                    break;
                case 1449120395:
                    str4 = "ۜۚۖۘۜۗۦۜۨ۬۠۠ۗ۠ۙۡۘ";
                    break;
                case 1683187486:
                    i4 = 2;
                    str4 = "۫ۥۢ۠ۙۢ۟ۙۧۥۛۙۤ۟ۨۖۥۥۦۗۢ";
                    break;
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x012d A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x01a3 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x0116 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x011f  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0128  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void b(int r9) {
        /*
            r2 = 1
            r1 = 0
            java.lang.String r0 = android.os.Build.MANUFACTURER
            java.lang.String r3 = r0.toUpperCase()
            r4 = 1936749078(0x73707216, float:1.9050067E31)
            java.lang.String r0 = "ۡۡۤ۫۬ۖۙۘۡۘۤۘۨ۟ۧۨۤۗۘۘۚۜۤ۠ۚۥ"
        L_0x000d:
            int r5 = r0.hashCode()
            r5 = r5 ^ r4
            switch(r5) {
                case -1383234330: goto L_0x0016;
                case -1163910567: goto L_0x001c;
                case -215454445: goto L_0x00eb;
                case 848283902: goto L_0x0027;
                default: goto L_0x0015;
            }
        L_0x0015:
            goto L_0x000d
        L_0x0016:
            java.lang.String r0 = "ۗ۫ۡۘۙۦ۠ۦ۫ۡۧۜۨ۬ۡۗۨۨۡۡۨۚۧۙ۠۬ۢۗ"
            goto L_0x000d
        L_0x0019:
            java.lang.String r0 = "ۦۦۙۚۢۘۘ۬ۡۛۛ۟ۢۛۤۨۘۜۙۥۘۘ۫ۨۘ"
            goto L_0x000d
        L_0x001c:
            java.lang.String r0 = "SONY"
            boolean r0 = r3.contains(r0)
            if (r0 != 0) goto L_0x0019
            java.lang.String r0 = "ۗۤۡۗۚ۫ۡۚ۫۟ۙ۠۠ۖۤ۠ۜ۬ۘ۬ۦۘۗۜۡۢۤۖۘ"
            goto L_0x000d
        L_0x0027:
            r4 = 250494037(0xeee3c55, float:5.8729627E-30)
            java.lang.String r0 = "ۘۛۛ۬ۤۦۘۜۧ۬ۥۙ۬۬ۡۡ۟ۥۘۨۢۜۘ"
        L_0x002c:
            int r5 = r0.hashCode()
            r5 = r5 ^ r4
            switch(r5) {
                case -1719712928: goto L_0x003b;
                case -315779817: goto L_0x00eb;
                case -60675556: goto L_0x0035;
                case 1029796205: goto L_0x0046;
                default: goto L_0x0034;
            }
        L_0x0034:
            goto L_0x002c
        L_0x0035:
            java.lang.String r0 = "ۧۨۖۘۜ۫۠۟ۥۡ۬۬ۜۚۛۨ"
            goto L_0x002c
        L_0x0038:
            java.lang.String r0 = "ۛۧۙۗ۬ۡۨۙ۟ۧۦ۬ۜۤۨ"
            goto L_0x002c
        L_0x003b:
            java.lang.String r0 = "SAMSUNG"
            boolean r0 = r3.contains(r0)
            if (r0 != 0) goto L_0x0038
            java.lang.String r0 = "ۦۖۘۘۢۥۘۖۦۜۘۦۥۗۜ۫ۘۘۗۘۜۥ۫ۤۜۡۧ"
            goto L_0x002c
        L_0x0046:
            r4 = -1636060900(0xffffffff9e7bb11c, float:-1.3324455E-20)
            java.lang.String r0 = "۠ۦۥۚۛۧۤ۟ۘۖۖ۟۬ۗۜۘۨۚۖۘۡ۠ۦۨۡۡ۠"
        L_0x004b:
            int r5 = r0.hashCode()
            r5 = r5 ^ r4
            switch(r5) {
                case -1983086384: goto L_0x0054;
                case -1741236793: goto L_0x005a;
                case 416495393: goto L_0x0065;
                case 1733025925: goto L_0x008a;
                default: goto L_0x0053;
            }
        L_0x0053:
            goto L_0x004b
        L_0x0054:
            java.lang.String r0 = "ۙۘۦۘ۫۟ۦۘۘۨ۫ۨۗۨۖۨۖ۬ۛۤۗۗۡۘ"
            goto L_0x004b
        L_0x0057:
            java.lang.String r0 = "ۙۗ۫ۡۥۧۦۘۨ۫ۡۘۘۙۜۨۘۥۡۥۚ۬ۥۘۗ۟ۦ"
            goto L_0x004b
        L_0x005a:
            java.lang.String r0 = "LG"
            boolean r0 = r3.contains(r0)
            if (r0 == 0) goto L_0x0057
            java.lang.String r0 = "ۜ۬ۤۚۢۙ۟ۨۧ۫ۥۗ۫ۦۡۘۚۤۦۖۤۨۘ"
            goto L_0x004b
        L_0x0065:
            r3 = -99047751(0xfffffffffa18a6b9, float:-1.9815266E35)
            java.lang.String r0 = "ۖۚۖۘۖۢۘۙۗۙ۟ۗۧۜۙۡۖ۟ۡ"
        L_0x006a:
            int r4 = r0.hashCode()
            r4 = r4 ^ r3
            switch(r4) {
                case -1976573673: goto L_0x0079;
                case -1876398066: goto L_0x00eb;
                case -1068598114: goto L_0x0073;
                case -248163344: goto L_0x008a;
                default: goto L_0x0072;
            }
        L_0x0072:
            goto L_0x006a
        L_0x0073:
            java.lang.String r0 = "۫ۥۙۥۨۖۘۥۘۧۘۘۘۘ۫ۤۖۨۡۙۚۖۦ"
            goto L_0x006a
        L_0x0076:
            java.lang.String r0 = "ۨۚۥۖۢۖۘۧۜۚۙ۠۬ۥۥۘۨ۠ۘ"
            goto L_0x006a
        L_0x0079:
            java.lang.String r0 = android.os.Build.MODEL
            java.lang.String r0 = r0.toUpperCase()
            java.lang.String r4 = "NEXUS"
            boolean r0 = r0.contains(r4)
            if (r0 != 0) goto L_0x0076
            java.lang.String r0 = "ۢۚ۟۬۫ۤۨ۟ۥۘۧۡۛۘۦۥۙۦۜۘ"
            goto L_0x006a
        L_0x008a:
            r0 = r1
        L_0x008b:
            r4 = -1695361407(0xffffffff9af2d681, float:-1.00435404E-22)
            java.lang.String r3 = "ۥۘۧۘ۟۠ۚۜۨ۟۬ۖۡۘۤۨۖ۠۫ۛۚ۬ۤ"
        L_0x0090:
            int r5 = r3.hashCode()
            r5 = r5 ^ r4
            switch(r5) {
                case -2124704711: goto L_0x0099;
                case 655538847: goto L_0x00f5;
                case 1036499750: goto L_0x01a3;
                case 1467081108: goto L_0x00f0;
                default: goto L_0x0098;
            }
        L_0x0098:
            goto L_0x0090
        L_0x0099:
            android.content.Context r5 = com.obwhatsapp.yo.yo.getCtx()
            android.content.pm.PackageManager r0 = r5.getPackageManager()
            android.content.Intent r3 = new android.content.Intent
            java.lang.String r4 = "android.intent.action.MAIN"
            r3.<init>(r4)
            java.lang.String r4 = "android.intent.category.LAUNCHER"
            r3.addCategory(r4)
            r4 = 0
            java.util.List r0 = r0.queryIntentActivities(r3, r4)     // Catch:{ Exception -> 0x0122 }
            java.util.Iterator r4 = r0.iterator()     // Catch:{ Exception -> 0x0122 }
        L_0x00b6:
            r3 = -1738598787(0xffffffff985f167d, float:-2.8833428E-24)
            java.lang.String r0 = "۫ۚۤۘۥۗۜ۟ۦۖۚۥۗ۟ۜۧۘۢۢۚۛ"
        L_0x00bb:
            int r6 = r0.hashCode()     // Catch:{ Exception -> 0x0122 }
            r6 = r6 ^ r3
            switch(r6) {
                case -1942579486: goto L_0x00c4;
                case -1661617769: goto L_0x0123;
                case -1390526098: goto L_0x00fb;
                case -1137680082: goto L_0x0104;
                default: goto L_0x00c3;
            }     // Catch:{ Exception -> 0x0122 }
        L_0x00c3:
            goto L_0x00bb
        L_0x00c4:
            java.lang.Object r0 = r4.next()     // Catch:{ Exception -> 0x0122 }
            android.content.pm.ResolveInfo r0 = (android.content.pm.ResolveInfo) r0     // Catch:{ Exception -> 0x0122 }
            r6 = 1240647871(0x49f2c8bf, float:1988887.9)
            java.lang.String r3 = "ۜۖۜ۬ۖۘۦۨ۠ۡۚۧۧ۠ۦۨۚۥۧۡۖۡ۠"
        L_0x00cf:
            int r7 = r3.hashCode()     // Catch:{ Exception -> 0x0122 }
            r7 = r7 ^ r6
            switch(r7) {
                case -2093018567: goto L_0x010a;
                case -848332122: goto L_0x00d8;
                case -337652863: goto L_0x010d;
                case 1759693247: goto L_0x00b6;
                default: goto L_0x00d7;
            }     // Catch:{ Exception -> 0x0122 }
        L_0x00d7:
            goto L_0x00cf
        L_0x00d8:
            android.content.pm.ActivityInfo r3 = r0.activityInfo     // Catch:{ Exception -> 0x0122 }
            android.content.pm.ApplicationInfo r3 = r3.applicationInfo     // Catch:{ Exception -> 0x0122 }
            java.lang.String r3 = r3.packageName     // Catch:{ Exception -> 0x0122 }
            java.lang.String r7 = r5.getPackageName()     // Catch:{ Exception -> 0x0122 }
            boolean r3 = r3.equalsIgnoreCase(r7)     // Catch:{ Exception -> 0x0122 }
            if (r3 == 0) goto L_0x0107
            java.lang.String r3 = "ۢ۠ۥۘۢۖ۠ۦۙۢۡۢۜۘۗۖۧۘۖۙۥۚۦ۠ۖۤۨۘۤۗۖۘ"
            goto L_0x00cf
        L_0x00eb:
            r0 = r2
            goto L_0x008b
        L_0x00ed:
            java.lang.String r3 = "ۦۗۘ۬۬ۡۧ۬۠ۚۨ۫ۘۖۡۘۦ۠۬ۚ۫ۨۨ۬ۡ"
            goto L_0x0090
        L_0x00f0:
            if (r0 == 0) goto L_0x00ed
            java.lang.String r3 = "ۖۛۥۖۛۡۘۙۥۡ۠ۢ۫ۨۖ"
            goto L_0x0090
        L_0x00f5:
            java.lang.String r3 = "ۙۚۘۛۧ۟ۨۜۗۡۡۦۘۦۖ۬ۨ۬ۤ۫ۚۜۨۦۥ۠ۨۗ"
            goto L_0x0090
        L_0x00f8:
            java.lang.String r0 = "ۧۧۨۛۡۖۘۜۨۙ۟ۙۡ۫۫"
            goto L_0x00bb
        L_0x00fb:
            boolean r0 = r4.hasNext()     // Catch:{ Exception -> 0x0122 }
            if (r0 == 0) goto L_0x00f8
            java.lang.String r0 = "۫۫ۤۘۤۖ۫۬ۥ۬ۛۖۘۢۦۗۚ۫ۜۨۚۦۘۤ۬ۦ"
            goto L_0x00bb
        L_0x0104:
            java.lang.String r0 = "ۤ۫ۖۘ۟۫ۖۘۡ۬ۥ۟ۖۗۘۧۛۜۦۘ"
            goto L_0x00bb
        L_0x0107:
            java.lang.String r3 = "ۢ۫ۥ۟ۛ۬ۤۘۘۧۖۦۜۗۘۘۜۜۨ۬ۦ"
            goto L_0x00cf
        L_0x010a:
            java.lang.String r3 = "ۧۚ۠ۙۥۛۡۚۙۗۢۚ۠ۙۦۤۜۥۘۖ۬ۥۘۜۚۜۘۛۙۦ"
            goto L_0x00cf
        L_0x010d:
            android.content.pm.ActivityInfo r0 = r0.activityInfo     // Catch:{ Exception -> 0x0122 }
            java.lang.String r0 = r0.name     // Catch:{ Exception -> 0x0122 }
        L_0x0111:
            r4 = 1826089608(0x6cd7ea88, float:2.0882127E27)
            java.lang.String r3 = "ۙۙۜ۬ۡۢۚ۬ۚ۫ۚ۠ۥۘۛۤ۫"
        L_0x0116:
            int r6 = r3.hashCode()
            r6 = r6 ^ r4
            switch(r6) {
                case -1956471482: goto L_0x012d;
                case -477231555: goto L_0x0128;
                case -161548238: goto L_0x01a3;
                case 1558510259: goto L_0x011f;
                default: goto L_0x011e;
            }
        L_0x011e:
            goto L_0x0116
        L_0x011f:
            java.lang.String r3 = "ۢ۟ۦۘۡۢۦۢۥۦۘۘۚۢ۬۫ۜ۠۠۫ۥۥۧ۬ۦ۬"
            goto L_0x0116
        L_0x0122:
            r0 = move-exception
        L_0x0123:
            r0 = 0
            goto L_0x0111
        L_0x0125:
            java.lang.String r3 = "۬ۙۛ۫ۗۢۧۙۙ۠ۗۙۨ۠ۛۨۖۚ۟ۡۨ"
            goto L_0x0116
        L_0x0128:
            if (r0 == 0) goto L_0x0125
            java.lang.String r3 = "۫ۚۘۘ۫ۢۜۢ۟ۡ۟ۛۜۨۚ۟"
            goto L_0x0116
        L_0x012d:
            java.lang.String r3 = android.os.Build.MANUFACTURER
            java.lang.String r4 = r3.toUpperCase()
            java.lang.String r3 = android.os.Build.MODEL
            java.lang.String r6 = r3.toUpperCase()
            r7 = 293996801(0x11860901, float:2.1147021E-28)
            java.lang.String r3 = "ۧۧۗۧ۠ۖۘۨ۫ۗۧۜۨۘۘ۫ۦۘ"
        L_0x013e:
            int r8 = r3.hashCode()
            r8 = r8 ^ r7
            switch(r8) {
                case -887907757: goto L_0x0158;
                case -613050202: goto L_0x0185;
                case 353312045: goto L_0x014d;
                case 2124844464: goto L_0x0147;
                default: goto L_0x0146;
            }
        L_0x0146:
            goto L_0x013e
        L_0x0147:
            java.lang.String r3 = "۟ۗۦۙۡۘ۠ۚۗ۬ۙۥۘ۬ۖۡۦۚ۬ۙۖۛۘۨۤ"
            goto L_0x013e
        L_0x014a:
            java.lang.String r3 = "ۖۛۚ۠ۨۡۘ۠ۥ۫۬ۜۙ۠ۛۖۧۖۧۘۙ۠ۥۘۥ۠۠"
            goto L_0x013e
        L_0x014d:
            java.lang.String r3 = "SAMSUNG"
            boolean r3 = r4.contains(r3)
            if (r3 != 0) goto L_0x014a
            java.lang.String r3 = "ۙۨۜۜ۟ۛۗۨۨۘۦۥۥۘۦ۠ۛۗۗۡۛۙۗۥۙ۟ۘۙ"
            goto L_0x013e
        L_0x0158:
            r7 = 2130349285(0x7efa8ce5, float:1.6651928E38)
            java.lang.String r3 = "ۖۗۘۤۢ۠۟۟ۨۘۚۦۚۗۥۧۗۗۡۘ"
        L_0x015d:
            int r8 = r3.hashCode()
            r8 = r8 ^ r7
            switch(r8) {
                case -1097815144: goto L_0x0166;
                case -815195180: goto L_0x0174;
                case 1352898956: goto L_0x0177;
                case 1358505924: goto L_0x01b5;
                default: goto L_0x0165;
            }
        L_0x0165:
            goto L_0x015d
        L_0x0166:
            java.lang.String r3 = "LG"
            boolean r3 = r4.contains(r3)
            if (r3 == 0) goto L_0x0171
            java.lang.String r3 = "ۗۥۙۚۤۖۘۛۜۖۚۦۦۘۗۢۚۙۢۦۘۖۜۡۚۘ۟ۚۗۢ"
            goto L_0x015d
        L_0x0171:
            java.lang.String r3 = "۟ۘۜۢۖۚ۟ۘۢۗۘۧۘۜۖۨۙۜۙۙۦۦۨۜ۠ۦۚۨ"
            goto L_0x015d
        L_0x0174:
            java.lang.String r3 = "ۨۗۦۗ۬۬۫ۛ۫ۤۥۜۘۦۚ۫۟ۙۨۘۖۥۧۘ"
            goto L_0x015d
        L_0x0177:
            r7 = 1830576125(0x6d1c5ffd, float:3.0247315E27)
            java.lang.String r3 = "ۖۜۢۢۧۜۦۧ۟ۖۚۗ۬ۚۡۘۤ۫ۗ"
        L_0x017c:
            int r8 = r3.hashCode()
            r8 = r8 ^ r7
            switch(r8) {
                case -799185383: goto L_0x01b5;
                case -207217370: goto L_0x01a7;
                case 147928858: goto L_0x01b2;
                case 947038919: goto L_0x0185;
                default: goto L_0x0184;
            }
        L_0x0184:
            goto L_0x017c
        L_0x0185:
            android.content.Intent r1 = new android.content.Intent
            java.lang.String r2 = "android.intent.action.BADGE_COUNT_UPDATE"
            r1.<init>(r2)
            java.lang.String r2 = "badge_count"
            r1.putExtra(r2, r9)
            java.lang.String r2 = "badge_count_package_name"
            java.lang.String r3 = r5.getPackageName()
            r1.putExtra(r2, r3)
            java.lang.String r2 = "badge_count_class_name"
            r4 = r0
        L_0x019d:
            r1.putExtra(r2, r4)
            r5.sendBroadcast(r1)
        L_0x01a3:
            return
        L_0x01a4:
            java.lang.String r3 = "۬ۨۦۡ۬ۗۘۡۘۨۘ۟ۧۨۘۨ۫ۡۘۚ۟۠۟ۚۜۘۢۡۦ"
            goto L_0x017c
        L_0x01a7:
            java.lang.String r3 = "NEXUS"
            boolean r3 = r6.contains(r3)
            if (r3 != 0) goto L_0x01a4
            java.lang.String r3 = "ۤۧۨۛۢۥۘۗۛۧ۟ۘۘۨ۟ۙ"
            goto L_0x017c
        L_0x01b2:
            java.lang.String r3 = "ۡۚۘۘۘ۠ۙۚۖۗۥۥۘۖۥ۠ۧۖۥ"
            goto L_0x017c
        L_0x01b5:
            r6 = 682113169(0x28a83891, float:1.8676279E-14)
            java.lang.String r3 = "ۘۦۜۘ۠ۡۜۘۜۗۜۘۖۨۨۚۘۘۦ۠۠۫ۛ۟ۜۜۛ۬ۛۥۘ"
        L_0x01ba:
            int r7 = r3.hashCode()
            r7 = r7 ^ r6
            switch(r7) {
                case -903196029: goto L_0x01c3;
                case -618264078: goto L_0x01d4;
                case 1294747669: goto L_0x01a3;
                case 1955000563: goto L_0x01d1;
                default: goto L_0x01c2;
            }
        L_0x01c2:
            goto L_0x01ba
        L_0x01c3:
            java.lang.String r3 = "SONY"
            boolean r3 = r4.contains(r3)
            if (r3 == 0) goto L_0x01ce
            java.lang.String r3 = "ۗۥ۬ۗۦۘۛۛۤۤۨ۟۠۟ۡۢۘۘۙۜۖۘۛۖۜۢ۟ۙ"
            goto L_0x01ba
        L_0x01ce:
            java.lang.String r3 = "ۚۛۛ۫ۘۙۛۘۨۘۡۦۖۧۙۘۦۢۨۘۨۘ۟ۡۘۨ۫۫ۖۘ"
            goto L_0x01ba
        L_0x01d1:
            java.lang.String r3 = "ۗۜۜۥۨ۠ۧۗۖ۬ۚۦۥۡۙۨۤۖۘ"
            goto L_0x01ba
        L_0x01d4:
            android.content.Intent r3 = new android.content.Intent
            r3.<init>()
            java.lang.String r4 = "com.sonyericsson.home.action.UPDATE_BADGE"
            r3.setAction(r4)
            java.lang.String r4 = "com.sonyericsson.home.intent.extra.badge.ACTIVITY_NAME"
            r3.putExtra(r4, r0)
            r4 = 1986814008(0x766c6038, float:1.198568E33)
            java.lang.String r0 = "۬۫۟ۧ۠ۢ۠ۡۨۧ۫ۡۥۥۘۡۜۢۙۛ۬ۙۦۘ"
        L_0x01e8:
            int r6 = r0.hashCode()
            r6 = r6 ^ r4
            switch(r6) {
                case -1611330236: goto L_0x0207;
                case -515672233: goto L_0x0202;
                case -453844846: goto L_0x01f1;
                case 1178576023: goto L_0x020a;
                default: goto L_0x01f0;
            }
        L_0x01f0:
            goto L_0x01e8
        L_0x01f1:
            java.lang.String r0 = "com.sonyericsson.home.intent.extra.badge.SHOW_MESSAGE"
            r3.putExtra(r0, r1)
        L_0x01f6:
            java.lang.String r0 = "com.sonyericsson.home.intent.extra.badge.PACKAGE_NAME"
            java.lang.String r4 = r5.getPackageName()
            r1 = r3
            r2 = r0
            goto L_0x019d
        L_0x01ff:
            java.lang.String r0 = "۬ۡۖۢۖۘۘۢۤۚۥۢۢ۟۠ۨۙۡۜ"
            goto L_0x01e8
        L_0x0202:
            if (r9 != 0) goto L_0x01ff
            java.lang.String r0 = "ۤۜ۬ۙ۬ۘۘۖۖۥۙۗ۬ۖ۠ۛۨۤۜۚۥۤۖۘ"
            goto L_0x01e8
        L_0x0207:
            java.lang.String r0 = "۬ۡۧۘۥۜۘۡۡۦۛۤۥۛۤۗ۟ۙ۠ۨ۟ۡۘۡۥۥ"
            goto L_0x01e8
        L_0x020a:
            java.lang.String r0 = "com.sonyericsson.home.intent.extra.badge.SHOW_MESSAGE"
            r3.putExtra(r0, r2)
            java.lang.String r0 = "com.sonyericsson.home.intent.extra.badge.MESSAGE"
            java.lang.String r1 = java.lang.String.valueOf(r9)
            r3.putExtra(r0, r1)
            goto L_0x01f6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.yo.WidgetProvider.b(int):void");
    }

    public static void c(Context context, RemoteViews remoteViews, int i2, Class cls, int i3) {
        String str = "ۛۙ۠ۥۗۦۙۙۘۘۚۥۥۢۗۧۗۨۥۘۡۗ۫ۘۦۜ";
        int i4 = 0;
        Intent intent = null;
        int i5 = 0;
        Intent intent2 = null;
        int i6 = 0;
        Intent intent3 = null;
        while (true) {
            switch ((str.hashCode() ^ 142) ^ 455860687) {
                case -1926924533:
                    intent3 = new Intent(context, cls);
                    str = "ۖ۟۫ۗۡۜۘۚۢ۠ۘۧۗۡۚۢۙ۫ۘۘۧۤۡۨۗۖۧۛ۬";
                    break;
                case -1803235764:
                    return;
                case -1692290976:
                    str = "ۨۦۥۦۘۜۙۜۖۘۦۙۧۦۛ۫ۙۖۧۘ۫ۥۡۘۛۨۖ";
                    break;
                case -1530910449:
                    remoteViews.setOnClickPendingIntent(i3, PendingIntent.getActivity(context, i2, intent2, i5));
                    str = "ۛۨۚ۬ۤۨ۬۫ۜۘۜۛۢ۫۬ۨۘۢۤۦۛ۬۠ۡ۫ۦۛۛۨ";
                    break;
                case -1299183758:
                    str = "۟۠۟ۨۜۢۡۙۢۡۘۜ۠ۥۢ۟ۡۨ";
                    i5 = i6;
                    break;
                case -1102195555:
                    str = "ۛۗ۟ۖۧۖۘ۟ۛۤۖۜۨۘۥۡۡۘۧۦۘۘ۟۬ۥۘ۬ۧۙ۠ۦۘ";
                    intent2 = intent;
                    break;
                case -963137187:
                    str = "۟ۗۡۧۗۥۜۖۛ۫ۚۘۢۚۤۜۥ";
                    break;
                case -569541108:
                    i4 = 268435456;
                    str = "۬ۛۧۖۜۚۛۧۖۘۜۖۨۘۧۛۡۘۥۘ۠ۢۖۜۘ";
                    break;
                case -186222529:
                    str = "ۧۙۡ۟۬ۨۨۨۧۘ۟۫ۦۙ۫ۦ۫ۙۡۙ۟ۤۛۗۨۙۘۥ";
                    i5 = i4;
                    break;
                case -158096831:
                    str = "ۗ۬۫ۥۜۨۘ۟۠ۨۘۤۗۨۘۨۨۥۘۡۧۦۢ۠ۧۚۧۢ";
                    break;
                case -26588975:
                    str = "ۙۚۧۘۦۥۛۜۜۘۡۗۥۧ۬ۙ";
                    intent2 = intent3;
                    break;
                case 895259174:
                    str = "ۥۨۨۖۗۨۘ۫ۦۙۙ۫ۡۙۢۡۡۗۚۤۗۢ";
                    break;
                case 1027202889:
                    str = "ۙ۠ۦۘۦۤۗۦۙۗۙۢۚۧۦۘۘ۬ۡۘ۫ۗ۟ۜۚۖ";
                    break;
                case 1260508371:
                    i6 = 301989888;
                    str = "ۦۢۡۘ۠ۤۦۗۛۢۛۢۙۧ۟ۡۜۦۗۦۥۘ۬۟ۤ۫ۧ۫";
                    break;
                case 1309978581:
                    str = "ۛۗ۟ۖۧۖۘ۟ۛۤۖۜۨۘۥۡۡۘۧۦۘۘ۟۬ۥۘ۬ۧۙ۠ۦۘ";
                    break;
                case 1534723229:
                    String str2 = "۫۠ۧۜۙۜۘۜۡ۠ۗۘۙۙۛۨۘۖۧۡۙۛ";
                    while (true) {
                        switch (str2.hashCode() ^ -455555214) {
                            case -1743596610:
                                str2 = "ۦ۫ۤۧۛۥ۬ۖۘ۟۬۟ۙۙۦۘۨ۬ۜ۠۠ۘۧۖۢۗۖ۟";
                                break;
                            case -373385611:
                                str = "ۙۡ۟ۧۗ۠ۦ۫ۨۘۧ۫ۧ۬ۥۖۤۥۨۘۨۢۢ";
                                continue;
                            case -212836601:
                                str = "ۨۡۧۘۢۗۡ۫ۢۥۡ۫ۢۘۢۙۘۗۗ۠ۡۚۘۖۨۘ۬ۧۗ";
                                continue;
                            case 365267562:
                                if (Build.VERSION.SDK_INT < 31) {
                                    str2 = "ۤۦ۬ۨۖۗۡ۟ۛۥۨۖۘۥۚ۟";
                                    break;
                                } else {
                                    str2 = "۫ۜۚۡ۟ۦۘۘۖۢ۟ۘۤۖ۠ۖۘ";
                                    break;
                                }
                        }
                    }
                    break;
                case 2065561998:
                    str = "ۤۡۥۘۖۖۥ۬ۦۙۦۥۗۤۛۡۘۡۜۤ";
                    intent = new Intent(context, cls);
                    break;
            }
        }
    }

    public static void d(Context context, RemoteViews remoteViews, Class cls, int i2, String str) {
        String str2 = "ۥۖۨۘۛۚۡ۬ۡۡۘۥۙۗۨۦۦ";
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        Intent intent = null;
        int[] iArr = null;
        while (true) {
            switch ((str2.hashCode() ^ 235) ^ -1246409590) {
                case -1846328441:
                    return;
                case -1548411054:
                    i5 = 167772160;
                    str2 = "۫ۡۡۙۘ۟ۢۖۨۡ۟ۖۘ۠ۡۧ";
                    break;
                case -1411220749:
                    str2 = "ۡۘ۬ۛۜۜ۫ۨۘۙۨۘۖۡۤۗۗۨۛۚۧ";
                    break;
                case -1396839209:
                    str2 = "ۜۧۡۘ۫ۧۧۢۧۘۗۖۘ۠ۨۘۘۗۙ۟ۚۨ۟";
                    break;
                case -1395212701:
                    str2 = "ۗ۠ۖۘۢۨۥۘۚۦۙۙ۟ۘۘۚۙۥۚۖۗۦۜۜۘ";
                    break;
                case -1379997168:
                    intent.putExtra("appWidgetIds", iArr);
                    str2 = "ۛ۫۫ۚۛ۬۟۠ۗۡ۟۠ۗ۫ۙۡۢۥۘ۬۬ۢ";
                    break;
                case -685924296:
                    intent = new Intent(context, cls);
                    str2 = "ۨۛۙ۬ۢۖۙۨۚۡۛۜۘۦۢ۬ۚۗۙ";
                    break;
                case -449041881:
                    str2 = "ۘۦۛۖۦۢۚۦۥۘۚ۫۫ۥۤۗۦۙۨۘ۟ۡۨۘ۠ۖ۫";
                    i4 = i3;
                    break;
                case -118517646:
                    intent.setAction("android.appwidget.action.APPWIDGET_UPDATE");
                    str2 = "ۖ۟۬ۗۥۖۘۛ۟ۚۦ۠ۙۤۤۤۡۦۧۘ۠ۛۖۥۙۧۚۚۧ";
                    break;
                case 360650054:
                    str2 = "ۥۦ۫۫ۡۡۘۤۥۖۛۙ۫ۘۡ۠ۦ۠۫ۧۧۥۘ۠ۘۖۨۘ";
                    i4 = i5;
                    break;
                case 360852169:
                    i3 = 134217728;
                    str2 = "ۗۤۙ۠ۨۦۗۢۘۘۡۜۤ۟ۖۙۘۜ۠";
                    break;
                case 423073247:
                    remoteViews.setOnClickPendingIntent(i2, PendingIntent.getBroadcast(context, 0, intent, i4));
                    str2 = "ۧ۬ۙۥۜۦۚۨۜۘۗۥۡۘۘ۠ۥۥۡۡۘ";
                    break;
                case 480687690:
                    str2 = "ۤۘۛ۟ۚۢۚۨۖۘۤۖۨۘۚۜۜۙ۠۟ۖۜۦۘۖ۠ۥۘ۠ۘۖ";
                    iArr = AppWidgetManager.getInstance(context).getAppWidgetIds(new ComponentName(context.getPackageName(), cls.getName()));
                    break;
                case 620651492:
                    intent.setAction(str);
                    str2 = "ۛۢۦۛۘۡۖۛۨۘ۬ۥ۫ۜۧۖۘ";
                    break;
                case 861673306:
                    String str3 = "ۚۚۡۘۖۜ۫ۗۢۘۘ۬ۛ۟۟ۨۦۢ۠ۢۘ۟ۛ";
                    while (true) {
                        switch (str3.hashCode() ^ 266048485) {
                            case -1737198701:
                                str2 = "ۜۜۦۘۧۥۡۘ۟ۡۦۦۚۨۗۙۛۥ۫";
                                continue;
                            case -533698846:
                                str2 = "ۗۨۨۘۤۗ۫۫ۙۚۜۥۧۖۘۗۛۛۡ۟ۧۦۗۡۘۘۙ۟۬";
                                continue;
                            case 1529460031:
                                str3 = "ۤۙۘۘۙۡۡۥۥۛۨ۬ۜۖۜۡ۠۠ۡ";
                                break;
                            case 1870868051:
                                if (Build.VERSION.SDK_INT < 31) {
                                    str3 = "۫ۡ۫۠۟ۥۘ۠ۡۨۘۨۚۘۗۚ۟ۢۚۨۘ";
                                    break;
                                } else {
                                    str3 = "۬ۦ۫ۢ۠ۜۘ۬ۤۜۘۨۘ۟۬۫ۛۘۧۦۘۜۗۡۘۨۥۥۘۤ۠ۥ";
                                    break;
                                }
                        }
                    }
                    break;
                case 998585245:
                    str2 = "۬ۢ۠ۥۥۜۘۨۘ۟۬ۡۗۤۚ۟ۜۚۨۘۖۚۖۖۘۨۦۨۖ";
                    break;
                case 1277801380:
                    str2 = "ۤۘۜۘۢۜۡۘ۟ۖۢۙۢۨۜۦۘۗ۬۬ۘۘۨۘۙۦۘۜۢ۟";
                    break;
                case 1293964627:
                    str2 = "ۘۦۛۖۦۢۚۦۥۘۚ۫۫ۥۤۗۦۙۨۘ۟ۡۨۘ۠ۖ۫";
                    break;
                case 1682570212:
                    intent.putExtra("WIDGET_ID", 0);
                    str2 = "ۗۥۦۧۢۘۤۤۚۨۘۥۖۛۘۘ۠ۘۨۗۧ";
                    break;
            }
        }
    }

    public static void e(Context context, RemoteViews remoteViews, int i2) {
        Bitmap bitmap;
        File file = new File(context.getFilesDir().getAbsolutePath() + "/Avatars", "me.j");
        String str = "۬ۗۦۙۨۦۧ۠۫ۜۦۡ۬ۡۘ۬۠ۚۢۗۨۘ";
        while (true) {
            switch (str.hashCode() ^ -345604276) {
                case -720157570:
                    Bitmap decodeFile = BitmapFactory.decodeFile(file.getAbsolutePath());
                    try {
                        bitmap = Bitmap.createBitmap(decodeFile.getWidth(), decodeFile.getHeight(), Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(bitmap);
                        Paint paint = new Paint();
                        Rect rect = new Rect(0, 0, decodeFile.getWidth(), decodeFile.getHeight());
                        RectF rectF = new RectF(rect);
                        paint.setAntiAlias(true);
                        canvas.drawARGB(0, 0, 0, 0);
                        canvas.drawRoundRect(rectF, 5.0f, 5.0f, paint);
                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
                        canvas.drawBitmap(decodeFile, rect, rect, paint);
                    } catch (NullPointerException e2) {
                        bitmap = decodeFile;
                    }
                    remoteViews.setImageViewBitmap(i2, bitmap);
                    return;
                case -567950491:
                    if (!file.exists()) {
                        str = "ۢۖۦۘۢۡۢ۫۠ۡۡۘۦۘۤۜۤۜۡۗ";
                        break;
                    } else {
                        str = "ۧۡۧۛۤۡۘۖۗۗۛۙ۟ۖ۟ۚۖۜ۟ۨۗۙۧۘۗ۬ۦ";
                        break;
                    }
                case 373939066:
                    str = "ۢۙۚۤۡۙۥۗۦۘۥۨۧۘۘۥۨۨۚۙ۫۟ۗۥۡ۠۬۠";
                    break;
                case 2125990386:
                    return;
            }
        }
    }

    public static void refreshBtn(Context context, RemoteViews remoteViews) {
        String str = "ۧ۠ۨۜۨۨۘۗۛۥۘۗ۬ۗ۬ۤۜۚۧۜۚ۠ۖۘ۟ۜۡۢۖۥ";
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            switch ((str.hashCode() ^ 653) ^ -1475220246) {
                case -2024738552:
                    i4 = yo.getID("wdg_mod", "id");
                    str = "ۖۥۡۢۥۨۘۜ۫ۡۖۡۥۥۖ۟ۖۚۖۤۛۦ";
                    break;
                case -1799243422:
                    remoteViews.setTextColor(i4, i2);
                    str = "ۦۤۨۘۛۨۨۦۙۖۖۨۦۘ۠ۧۦۘۜۛۘۡۤۙ";
                    break;
                case -1485739945:
                    return;
                case -999534374:
                    str = "ۦۤۨۘۛۨۨۦۙۖۖۨۦۘ۠ۧۦۘۜۛۘۡۤۙ";
                    break;
                case -945604522:
                    remoteViews.setViewVisibility(i4, 4);
                    str = "ۙۘۧۤ۫ۖۘ۠۟۬ۦۥ۠ۡۤۥۘ";
                    break;
                case -544464067:
                    str = "ۡۙۡۙۗۗۡۤۘۘ۫ۤ۠ۥۡۘۤۡۘ";
                    break;
                case -510541649:
                    remoteViews.setTextColor(i3, i2);
                    str = "ۛۚۦۘۗۥۖۨ۠ۚۜۡۥۖۘ۟ۖ۫";
                    break;
                case 109259784:
                    remoteViews.setViewVisibility(i4, 0);
                    str = "ۤ۠ۧ۫ۚۦۘۖۙۡۗۖ۫ۤۧۨۘۦۗ۬ۥۥ۬";
                    break;
                case 120734324:
                    String str2 = "ۤۢ۟ۜۡۡۘۥۘ۬ۘۤۨۜۖ۬ۧ۬ۤۧۦۨۖۖۙ";
                    while (true) {
                        switch (str2.hashCode() ^ -773772991) {
                            case -1999263043:
                                str = "ۢۧۥ۫۟ۦۗۤۡۛۛۖۘۙۚۖۘۛۜۥۘۛۨ۫";
                                continue;
                            case -1615804420:
                                if (yo.getCtx() != null) {
                                    str2 = "ۘۜۦۡۜۡۚۨۡۥۚ۟ۛۙ۬۠ۢۡۘۗۨۘۘ۟ۡۧ۟ۘۢ";
                                    break;
                                } else {
                                    str2 = "ۜۘ۟ۤ۬ۜۘۦۙۦۘۛۢۧۨۜۡۘ";
                                    break;
                                }
                            case -659004642:
                                str2 = "ۚۘ۟۟ۛۜۘ۠ۜۨ۬۟ۡ۫ۘۗۘۢۖۜۛ";
                                break;
                            case 2057336128:
                                str = "۬۟ۚۦ۟ۡۘۘ۫ۜۗۤۡۘ۫۬ۨۘۨۨۘۜۖۗۖ۟ۤ";
                                continue;
                        }
                    }
                    break;
                case 185521052:
                    remoteViews.setViewVisibility(i3, 0);
                    str = "ۧۧۖۘۚ۟ۤ۠ۥۢۙ۬ۤۘۥۦ";
                    break;
                case 262654116:
                    yo.f125q = context;
                    str = "۬۟ۚۦ۟ۡۘۘ۫ۜۗۤۡۘ۫۬ۨۘۨۨۘۜۖۗۖ۟ۤ";
                    break;
                case 523282804:
                    String str3 = "ۢۧۡۘۨ۠۫ۥۢ۟۠ۥۘۘۥ۟";
                    while (true) {
                        switch (str3.hashCode() ^ 606449207) {
                            case -260056273:
                                str = "ۨۛۡۘۡۡۤۚۘۖۘۛ۬ۤۧۛۡۤۛۚ";
                                continue;
                            case 573543324:
                                str = "ۜۚۘۘ۟ۧۢۢۡۖۘۖ۠ۧۥۜ۠ۧۚۜۘ۠ۙۘۘ";
                                continue;
                            case 1896786947:
                                str3 = "ۖۛۥۘۦۛۘۜۡۚۖ۟ۖۘ۬ۚۜۤ";
                                break;
                            case 2071179581:
                                if (!yo.yoHideSeen()) {
                                    str3 = "ۘۖۙ۟ۙۖۘۡۥۦۘ۫ۨ۬ۖۙۥۘ";
                                    break;
                                } else {
                                    str3 = "ۢۗۥۢ۟ۥ۬ۧۙۨۗۨۘۧۚۢۧۗۤۘۚۥۘۤۖۧۘۘۛۙ";
                                    break;
                                }
                        }
                    }
                    break;
                case 925496182:
                    i2 = others.getColor("ModWdgStatusColor", -1);
                    str = "ۧ۠ۨۘۨۨۡۜۢۦۘۛۚۡ۟ۜۦۦۖۘ۟ۜ۠ۢۥۖ۠ۧۛ";
                    break;
                case 1345396793:
                    remoteViews.setViewVisibility(i3, 4);
                    str = "ۚۧۛۘۡۡۘۥۜۜۘۨۗۢۥۜۖ۫ۡ۟ۖ۬ۥۘ";
                    break;
                case 1353640999:
                    str = "۫ۨۚ۫ۙ۬ۧۖ۬ۗۜۗۛۖۥۗۥۖۘۤ۬ۦ";
                    break;
                case 1468452153:
                    i3 = yo.getID("wdg_mod_off", "id");
                    str = "ۦۨۘۦۜۧۘۤۗۘۘۘۢۥۘۨ۠ۖ";
                    break;
            }
        }
    }

    public static void setMOD(Context context, RemoteViews remoteViews, Class cls) {
        int i2 = 0;
        String str = "ۙۚۡۘ۫ۚ۫ۚۜۤۦ۫ۜۘۦ۬ۤ";
        while (true) {
            switch ((str.hashCode() ^ 840) ^ 1906250855) {
                case -1453906454:
                    str = "ۡۗ۟۟ۜۨ۠ۡۛۤۜۧۦۘۧۘ۠۟ۦۘۥۘۥۘ";
                    break;
                case -1236015644:
                    d(context, remoteViews, cls, yo.getID("wdg_mod_off", "id"), "hsoff");
                    str = "ۙ۬ۚۗۛۡۘۖۨۗۛۤۨۜۧ۫۟۠ۧ۬ۜ۟ۚۡۧۡ۟ۥ";
                    break;
                case 60993787:
                    d(context, remoteViews, cls, i2, "hs");
                    str = "ۡۡ۠ۗۢۨۘۗ۫ۗۥۧۘۛۙۜ۫ۥۨۘ";
                    break;
                case 177325141:
                    return;
                case 448259229:
                    str = "ۢ۫ۤۛۚۨۙ۫۟ۜۖ۬ۧۙۘۘ";
                    break;
                case 911012030:
                    i2 = yo.getID("wdg_mod", "id");
                    str = "ۡ۫ۡۘۨۦۧۘۡۡۖۘ۠ۛۦۘ۟ۛۦ";
                    break;
                case 1165310384:
                    str = "ۛۖۙۛۖۥۥۖۦۨۘۨۖۥۨۘۢۖۤۖۤۘۘۢۧۧ";
                    break;
            }
        }
    }

    public static void setNC(int i2) {
        String str = "۠ۙ۬ۥ۫۠ۡۜۦ۫ۦ۬ۖۗۧ۫ۡۦۘ";
        while (true) {
            switch ((str.hashCode() ^ 655) ^ 291084071) {
                case -672927652:
                    f604a = i2;
                    str = "ۛۨ۟ۖۖۜۘۜۜ۟ۗۦۧۥۡ۫ۜۗۨ";
                    break;
                case 175850025:
                    str = "ۗۚۡۘۡ۟ۥۜۥۡۘۚۜۚۜۧۡۧۢۨۘۗۙ۬";
                    break;
                case 672500461:
                    return;
            }
        }
    }

    public static void updateYoWAWidget(Context context) {
        Intent intent = null;
        String str = "ۤۛۘۘۧۛۜۖۜۡۘۚۜ۬ۖۗۥۘ۫۫ۜۘۚۘۥۡۦۙۖۗۤ";
        while (true) {
            switch ((str.hashCode() ^ 828) ^ -1696252335) {
                case -291958029:
                    intent.putExtra("appWidgetIds", AppWidgetManager.getInstance(context).getAppWidgetIds(new ComponentName(context, WidgetProvider.class)));
                    str = "ۗۨۥۘۢۥۡۨ۫ۥۜۘۗۦۢۚۜۨ";
                    break;
                case 774171962:
                    intent = new Intent(context, WidgetProvider.class);
                    str = "ۛۡۜۘۤۧۨ۠ۗۙۗۦۘۚۛۜۛۡۘۡۗۦ";
                    break;
                case 1291836186:
                    context.sendBroadcast(intent);
                    str = "۠ۜۨۘۛۜ۫ۛۧۖۘ۬۟ۡۗۨۦۘۖۥۚۡۡۤۤ۫ۘۘۙ۟ۜ";
                    break;
                case 1360687938:
                    intent.setAction("android.appwidget.action.APPWIDGET_UPDATE");
                    str = "ۜۥۖۜۘۥۘۚ۟ۥۢۥۧۘ۠ۦۘۘ";
                    break;
                case 1481595943:
                    str = "۠۬۠۠ۜۘۙۧۜۘۛۤ۠ۛۘۦۤ۟ۨۘۙۛۜۘ۟ۖۖۥۨ۬";
                    break;
                case 1608828796:
                    return;
            }
        }
    }

    public void onAppWidgetOptionsChanged(Context context, AppWidgetManager appWidgetManager, int i2, Bundle bundle) {
        String str = "ۥۜۤۚۗ۠ۨ۫ۗۨ۟ۖۘ۫ۜۛۨۗۖۘ";
        while (true) {
            switch ((str.hashCode() ^ 651) ^ -1091650171) {
                case -2130000465:
                    super.onAppWidgetOptionsChanged(context, appWidgetManager, i2, bundle);
                    str = "ۤ۫ۡۙ۫ۜۤۖ۠ۙۥۜۘ۟ۙۖۡۡۖۘ";
                    break;
                case -1731741643:
                    str = "۠ۨۧۘۢۗۜۘ۫ۤۦۘۜۙ۟ۦۘ۫";
                    break;
                case -1449373190:
                    str = "ۦۤۦۘۢۢۦۘۢ۠۫۟ۘۢۘۥ۬ۗۖۖۘۢۧۡۘۥۘ";
                    break;
                case -586115254:
                    str = "۟ۨۤ۬ۤۥۘۛۛۜۘۗۡۧۛ۠ۗ۟۠ۖۘۜۤۖۘ";
                    break;
                case -144903562:
                    return;
                case 85909482:
                    str = "۠۟ۥ۟ۤۜۤۖۦۘۖۤ۬ۗ۫ۘ";
                    break;
                case 868633695:
                    appWidgetManager.updateAppWidget(i2, new RemoteViews(context.getPackageName(), a(appWidgetManager, i2)));
                    str = "ۡ۟ۦۧۥۗۙۗۧۙ۠ۥۘۗۤ۠";
                    break;
                case 975585538:
                    str = "۬ۧۖ۫۬ۧ۠ۖۨۘۛۚۡۘۥۦۚۜ۫ۘۘۥۜ۬";
                    break;
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onReceive(android.content.Context r9, android.content.Intent r10) {
        /*
            r8 = this;
            r1 = 0
            r2 = -185612865(0xfffffffff4efc5bf, float:-1.5197384E32)
            java.lang.String r0 = "۟ۗۜۘۙۢۗ۬ۖۙ۟ۥۥۗۜۥۘۦۤۘۗۡ۟ۦ۬ۖ"
        L_0x0006:
            int r3 = r0.hashCode()
            r3 = r3 ^ r2
            switch(r3) {
                case -1403819623: goto L_0x0017;
                case -212718836: goto L_0x000f;
                case 1391549972: goto L_0x002c;
                case 1643931876: goto L_0x001a;
                default: goto L_0x000e;
            }
        L_0x000e:
            goto L_0x0006
        L_0x000f:
            if (r9 == 0) goto L_0x0014
            java.lang.String r0 = "ۙ۟ۥۘ۟ۤۦۘۘۥۗ۬ۙۖۘۗۘ۬ۡۘۜۘ۫ۥۗۧۤۦۧۦۦ"
            goto L_0x0006
        L_0x0014:
            java.lang.String r0 = "۟ۨۥ۫ۖۥۘۜۚۢ۟ۘۨۨۘۨۘۚ۠"
            goto L_0x0006
        L_0x0017:
            java.lang.String r0 = "ۘۙۧۧۗ۬ۥۖۥۨۡۗۜۛۚ"
            goto L_0x0006
        L_0x001a:
            android.appwidget.AppWidgetManager r2 = android.appwidget.AppWidgetManager.getInstance(r9)     // Catch:{ NullPointerException -> 0x00af }
            r3 = -1892871325(0xffffffff8f2d1363, float:-8.533292E-30)
            java.lang.String r0 = "۬ۖۡۘۡۡۢۛۜۜۘۜۙ۬ۙۙ۟ۦۖۖ۟۠ۤۚۜۧۙ"
        L_0x0023:
            int r4 = r0.hashCode()     // Catch:{ NullPointerException -> 0x00af }
            r4 = r4 ^ r3
            switch(r4) {
                case -1496540176: goto L_0x0035;
                case -576360004: goto L_0x0030;
                case -434180021: goto L_0x0038;
                case 771863314: goto L_0x002c;
                default: goto L_0x002b;
            }     // Catch:{ NullPointerException -> 0x00af }
        L_0x002b:
            goto L_0x0023
        L_0x002c:
            return
        L_0x002d:
            java.lang.String r0 = "ۡۜۜۘۗ۫ۥۗۤۜۘ۠ۥۚۛ۫۫۫ۤۙۛ۫ۚ۫۠ۙۜۜ"
            goto L_0x0023
        L_0x0030:
            if (r2 == 0) goto L_0x002d
            java.lang.String r0 = "ۨۨۥۘۨۙۚۤۤ۬۠۠ۦۧۜۘ"
            goto L_0x0023
        L_0x0035:
            java.lang.String r0 = "ۚۙ۟ۚ۫ۢۗۥۖۘۦۘۢۖ۟۬ۙۤۧۜۗ۫"
            goto L_0x0023
        L_0x0038:
            android.content.ComponentName r0 = new android.content.ComponentName     // Catch:{ NullPointerException -> 0x00af }
            java.lang.String r3 = r9.getPackageName()     // Catch:{ NullPointerException -> 0x00af }
            java.lang.Class<com.obwhatsapp.yo.WidgetProvider> r4 = com.obwhatsapp.yo.WidgetProvider.class
            java.lang.String r4 = r4.getName()     // Catch:{ NullPointerException -> 0x00af }
            r0.<init>(r3, r4)     // Catch:{ NullPointerException -> 0x00af }
            int[] r3 = r2.getAppWidgetIds(r0)     // Catch:{ NullPointerException -> 0x00af }
            r4 = 1136654015(0x43bff6bf, float:383.9277)
            java.lang.String r0 = "ۜۚۙۗۜۖۘۢۥۤۦۧۧۜۖۧۘۖۖ۟ۚۖ۟"
        L_0x0050:
            int r5 = r0.hashCode()     // Catch:{ NullPointerException -> 0x00af }
            r5 = r5 ^ r4
            switch(r5) {
                case -1047574453: goto L_0x0059;
                case -510367447: goto L_0x005f;
                case 1163628887: goto L_0x0068;
                case 1432654298: goto L_0x00aa;
                default: goto L_0x0058;
            }     // Catch:{ NullPointerException -> 0x00af }
        L_0x0058:
            goto L_0x0050
        L_0x0059:
            java.lang.String r0 = "ۜ۟ۛ۬۫۟ۗۖۡۘۖۨۧۘ۫ۢۖۤۦۧۜ۠ۜۖۨ۬ۧۦ"
            goto L_0x0050
        L_0x005c:
            java.lang.String r0 = "ۥۙۡۘۡۦۥۘ۟ۙۖ۟۫ۢۦۙۗۘۜۚۛ۫ۤ"
            goto L_0x0050
        L_0x005f:
            android.os.Bundle r0 = r10.getExtras()     // Catch:{ NullPointerException -> 0x00af }
            if (r0 == 0) goto L_0x005c
            java.lang.String r0 = "ۡۨ۟ۚۦ۫ۗۛۙۘۤۥۥ۫ۦۘ۠ۨۦۘ۠ۖۧ"
            goto L_0x0050
        L_0x0068:
            android.os.Bundle r0 = r10.getExtras()     // Catch:{ NullPointerException -> 0x00af }
            java.lang.String r4 = "WIDGET_ID"
            r5 = 0
            int r4 = r0.getInt(r4, r5)     // Catch:{ NullPointerException -> 0x00af }
            java.lang.String r5 = r10.getAction()     // Catch:{ NullPointerException -> 0x00af }
            r6 = -1284648848(0xffffffffb36dd070, float:-5.5370435E-8)
            java.lang.String r0 = "ۛۚ۬ۙۤۧۨۦۙۚۡ۠۠۬ۗۨۘۥۘۘۡۛ۬"
        L_0x007c:
            int r7 = r0.hashCode()     // Catch:{ NullPointerException -> 0x00af }
            r7 = r7 ^ r6
            switch(r7) {
                case -772730982: goto L_0x00c0;
                case 809352043: goto L_0x00b5;
                case 824595056: goto L_0x00c3;
                case 1819881522: goto L_0x0085;
                default: goto L_0x0084;
            }     // Catch:{ NullPointerException -> 0x00af }
        L_0x0084:
            goto L_0x007c
        L_0x0085:
            android.widget.RemoteViews r5 = new android.widget.RemoteViews     // Catch:{ NullPointerException -> 0x00af }
            java.lang.String r0 = r9.getPackageName()     // Catch:{ NullPointerException -> 0x00af }
            int r4 = a(r2, r4)     // Catch:{ NullPointerException -> 0x00af }
            r5.<init>(r0, r4)     // Catch:{ NullPointerException -> 0x00af }
            r4 = -346138146(0xffffffffeb5e59de, float:-2.6880592E26)
            java.lang.String r0 = "ۧۜۧۤۤۖۘۙ۠ۛۙۧ۫ۛۛ۟۫ۚۜۡۗۨۛۖۧ"
        L_0x0097:
            int r6 = r0.hashCode()     // Catch:{ NullPointerException -> 0x00af }
            r6 = r6 ^ r4
            switch(r6) {
                case -1761774683: goto L_0x00f1;
                case -373085190: goto L_0x00a0;
                case 1409188064: goto L_0x00ee;
                case 2020145115: goto L_0x00e5;
                default: goto L_0x009f;
            }     // Catch:{ NullPointerException -> 0x00af }
        L_0x009f:
            goto L_0x0097
        L_0x00a0:
            r0 = r1
        L_0x00a1:
            com.obwhatsapp.yo.yo.setHideSeen(r0)     // Catch:{ NullPointerException -> 0x00af }
            refreshBtn(r9, r5)     // Catch:{ NullPointerException -> 0x00af }
        L_0x00a7:
            r8.onUpdate(r9, r2, r3)     // Catch:{ NullPointerException -> 0x00af }
        L_0x00aa:
            super.onReceive(r9, r10)     // Catch:{ NullPointerException -> 0x00af }
            goto L_0x002c
        L_0x00af:
            r0 = move-exception
            goto L_0x002c
        L_0x00b2:
            java.lang.String r0 = "ۧۘ۫ۤۘۦۘۢۧۖۧ۟ۥۨۤۚ"
            goto L_0x007c
        L_0x00b5:
            java.lang.String r0 = "hs"
            boolean r0 = r5.equals(r0)     // Catch:{ NullPointerException -> 0x00af }
            if (r0 != 0) goto L_0x00b2
            java.lang.String r0 = "۫ۤۤۥۢۥۘۨ۟ۗۡۘۧ۫ۡۖۘۛۡۚۙۡۧۘ"
            goto L_0x007c
        L_0x00c0:
            java.lang.String r0 = "۬ۘ۟ۚۜۖۘ۠۬ۨۘ۟ۤۘۘۧ۠ۘۧۚۦۗۗ۬"
            goto L_0x007c
        L_0x00c3:
            r6 = -2039587243(0xffffffff866e5e55, float:-4.483213E-35)
            java.lang.String r0 = "۠ۛۘ۠ۙۙۧۧۚۢۧ۫۬ۘۦ۬ۜۗ"
        L_0x00c8:
            int r7 = r0.hashCode()     // Catch:{ NullPointerException -> 0x00af }
            r7 = r7 ^ r6
            switch(r7) {
                case -2003129542: goto L_0x0085;
                case -1964695543: goto L_0x00d1;
                case 91265647: goto L_0x00a7;
                case 500270329: goto L_0x00df;
                default: goto L_0x00d0;
            }     // Catch:{ NullPointerException -> 0x00af }
        L_0x00d0:
            goto L_0x00c8
        L_0x00d1:
            java.lang.String r0 = "hsoff"
            boolean r0 = r5.equals(r0)     // Catch:{ NullPointerException -> 0x00af }
            if (r0 == 0) goto L_0x00dc
            java.lang.String r0 = "ۙۖۙۚۡۖۘۧۛۢۘ۠ۚۧ۬ۥۘۧ۟ۦۛ۠ۘۘۛۥۚۖۥۙ"
            goto L_0x00c8
        L_0x00dc:
            java.lang.String r0 = "۬ۢۧۖۧۘۘۥۡۨۗ۟ۖ۟ۥۥۘۦۦۛۢ۫ۥۘ"
            goto L_0x00c8
        L_0x00df:
            java.lang.String r0 = "ۤۤۨۘۧۡۧۖۡۡۜۜۘۛۨۖۘۧۚۡۘۜۛۦ"
            goto L_0x00c8
        L_0x00e2:
            java.lang.String r0 = "۫ۚۨۥۛۜۤۤۨۘۜۘۚۚ۫ۖ"
            goto L_0x0097
        L_0x00e5:
            boolean r0 = com.obwhatsapp.yo.yo.yoHideSeen()     // Catch:{ NullPointerException -> 0x00af }
            if (r0 != 0) goto L_0x00e2
            java.lang.String r0 = "ۨ۬ۦۘۚۙ۫۟ۖ۬۟ۙۧۧۨ۟ۖۜۡۘۘ۬ۡۘۖۤۤ"
            goto L_0x0097
        L_0x00ee:
            java.lang.String r0 = "ۢۥۖۘۡۡۧ۟ۛۨۘ۠ۥۨۘۗۡۘۗ۠ۖۜۥۦ"
            goto L_0x0097
        L_0x00f1:
            r0 = 1
            goto L_0x00a1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.yo.WidgetProvider.onReceive(android.content.Context, android.content.Intent):void");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x00f1 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x014a A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x00e8 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x016b A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x019b A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0118 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x01a8 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x01e8 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x018f A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0121  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x013e  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0147  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0164 A[Catch:{ all -> 0x0139 }] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0198  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x01a1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onUpdate(android.content.Context r17, android.appwidget.AppWidgetManager r18, int[] r19) {
        /*
            r16 = this;
            r2 = 2131546650(0x7f0cd21a, float:1.8718283E38)
            java.lang.String r1 = "۟۠۟ۗۗۙۙۖۜۘۤۢۗۧ۠ۜۘۤۛۥۘۥۜۥۘ"
        L_0x0005:
            int r3 = r1.hashCode()
            r3 = r3 ^ r2
            switch(r3) {
                case -2137737996: goto L_0x000e;
                case -1087915892: goto L_0x001d;
                case 1237453184: goto L_0x0022;
                case 1775751112: goto L_0x001a;
                default: goto L_0x000d;
            }
        L_0x000d:
            goto L_0x0005
        L_0x000e:
            android.content.Context r1 = com.obwhatsapp.yo.yo.getCtx()
            if (r1 != 0) goto L_0x0017
            java.lang.String r1 = "ۨۢۦ۫ۘۥۜۙۘۤۦۤۤ۬۬ۗۘ"
            goto L_0x0005
        L_0x0017:
            java.lang.String r1 = "ۢۤۦۘۙ۫ۨۘۚۡ۠ۡۚۗ۬ۖۜۛ۬ۡۜۡۘ"
            goto L_0x0005
        L_0x001a:
            java.lang.String r1 = "ۡۛۖۙۧۘۥۤۚ۠ۗۗ۫ۜۥۜۘۘۘۜۗۧۜۡۖۘ"
            goto L_0x0005
        L_0x001d:
            com.obwhatsapp.yo.yo.f125q = r17
            com.obwhatsapp.yo.shp.init(r17)
        L_0x0022:
            java.lang.String r1 = "wdg_layout"
            java.lang.String r2 = "id"
            int r4 = com.obwhatsapp.yo.yo.getID(r1, r2)
            java.lang.String r1 = "wdg_title"
            java.lang.String r2 = "id"
            int r5 = com.obwhatsapp.yo.yo.getID(r1, r2)
            java.lang.String r1 = "wdg_status"
            java.lang.String r2 = "id"
            int r6 = com.obwhatsapp.yo.yo.getID(r1, r2)
            java.lang.String r1 = "wdg_logo"
            java.lang.String r2 = "id"
            int r7 = com.obwhatsapp.yo.yo.getID(r1, r2)
            java.lang.String r1 = "wdg_utils"
            java.lang.String r2 = "id"
            int r8 = com.obwhatsapp.yo.yo.getID(r1, r2)
            r0 = r19
            int r9 = r0.length     // Catch:{ all -> 0x0139 }
            r1 = 0
        L_0x004e:
            r3 = -323583288(0xffffffffecb682c8, float:-1.7651368E27)
            java.lang.String r2 = "۠ۧۛۢۗۨۘۧۜۢ۠۠ۢۙۨ"
        L_0x0053:
            int r10 = r2.hashCode()
            r10 = r10 ^ r3
            switch(r10) {
                case -1900010637: goto L_0x013a;
                case -549989421: goto L_0x0064;
                case -52527275: goto L_0x005c;
                case 554375652: goto L_0x0067;
                default: goto L_0x005b;
            }
        L_0x005b:
            goto L_0x0053
        L_0x005c:
            if (r1 >= r9) goto L_0x0061
            java.lang.String r2 = "ۤۦۘۧۧ۫ۥۤ۬ۙ۠ۛۛۚ۟ۤۡۘۘۤۧۚ۟ۢۖۘ"
            goto L_0x0053
        L_0x0061:
            java.lang.String r2 = "۫ۜۛۦۡۙۜۚۥۘ۫ۛۡۚۦۙۛ۫ۡۜۧ۟ۨۤۛ"
            goto L_0x0053
        L_0x0064:
            java.lang.String r2 = "ۜۤۚۚۥۤ۫۟ۗۛ۬ۦۚۥۨۘۗ۫ۨۘۡۢ۟ۦ۬ۢۢۤۤ"
            goto L_0x0053
        L_0x0067:
            r10 = r19[r1]
            android.widget.RemoteViews r11 = new android.widget.RemoteViews     // Catch:{ all -> 0x0139 }
            java.lang.String r2 = r17.getPackageName()     // Catch:{ all -> 0x0139 }
            r0 = r18
            int r3 = a(r0, r10)     // Catch:{ all -> 0x0139 }
            r11.<init>(r2, r3)     // Catch:{ all -> 0x0139 }
            java.lang.String r2 = "setBackgroundColor"
            java.lang.String r3 = "ModWdgBKColor"
            java.lang.String r12 = "#66282828"
            int r12 = android.graphics.Color.parseColor(r12)     // Catch:{ all -> 0x0139 }
            int r3 = com.obwhatsapp.youbasha.others.getColor(r3, r12)     // Catch:{ all -> 0x0139 }
            r11.setInt(r4, r2, r3)     // Catch:{ all -> 0x0139 }
            java.lang.String r2 = "ModWdgTitleColor"
            r3 = -1
            int r2 = com.obwhatsapp.youbasha.others.getColor(r2, r3)     // Catch:{ all -> 0x0139 }
            r11.setTextColor(r5, r2)     // Catch:{ all -> 0x0139 }
            java.lang.String r2 = "ModWdgStatusColor"
            r3 = -1
            int r2 = com.obwhatsapp.youbasha.others.getColor(r2, r3)     // Catch:{ all -> 0x0139 }
            r11.setTextColor(r6, r2)     // Catch:{ all -> 0x0139 }
            r11.setTextColor(r8, r2)     // Catch:{ all -> 0x0139 }
            java.lang.String r2 = com.obwhatsapp.yo.dep.getMyName()     // Catch:{ all -> 0x0139 }
            r11.setTextViewText(r5, r2)     // Catch:{ all -> 0x0139 }
            int r3 = f604a     // Catch:{ all -> 0x0139 }
            r12 = -2142113467(0xffffffff8051f145, float:-7.525226E-39)
            java.lang.String r2 = "ۧۖۡۘۡۡ۟۠ۜ۬ۤۗۘۘۚۘۨۘ"
        L_0x00ae:
            int r13 = r2.hashCode()     // Catch:{ all -> 0x0139 }
            r13 = r13 ^ r12
            switch(r13) {
                case -478389347: goto L_0x0127;
                case 267785030: goto L_0x012c;
                case 676064756: goto L_0x012f;
                case 1759588185: goto L_0x00b7;
                default: goto L_0x00b6;
            }     // Catch:{ all -> 0x0139 }
        L_0x00b6:
            goto L_0x00ae
        L_0x00b7:
            java.lang.String r2 = "unread_message_count"
            java.lang.String r3 = "plurals"
            int r2 = com.obwhatsapp.yo.yo.getID(r2, r3)     // Catch:{ all -> 0x0139 }
            android.content.res.Resources r3 = r17.getResources()     // Catch:{ all -> 0x0139 }
            int r12 = f604a     // Catch:{ all -> 0x0139 }
            r13 = 1
            java.lang.Object[] r13 = new java.lang.Object[r13]     // Catch:{ all -> 0x0139 }
            r14 = 0
            java.lang.Integer r15 = java.lang.Integer.valueOf(r12)     // Catch:{ all -> 0x0139 }
            r13[r14] = r15     // Catch:{ all -> 0x0139 }
            java.lang.String r2 = r3.getQuantityString(r2, r12, r13)     // Catch:{ all -> 0x0139 }
            r11.setTextViewText(r6, r2)     // Catch:{ all -> 0x0139 }
        L_0x00d6:
            r0 = r18
            android.os.Bundle r2 = r0.getAppWidgetOptions(r10)     // Catch:{ all -> 0x0139 }
            java.lang.String r3 = "appWidgetMinWidth"
            int r12 = r2.getInt(r3)     // Catch:{ all -> 0x0139 }
            r2 = 2
        L_0x00e3:
            r13 = -1768699339(0xffffffff9693ca35, float:-2.3876741E-25)
            java.lang.String r3 = "ۗۡۨۢۧۘۘۤ۠ۙ۫ۖۡۘ۟ۜۙۥ۫ۘۘۧۙۦۘۢۙۜ"
        L_0x00e8:
            int r14 = r3.hashCode()
            r14 = r14 ^ r13
            switch(r14) {
                case -1141269581: goto L_0x00f1;
                case -570145433: goto L_0x014a;
                case -255982994: goto L_0x013e;
                case -180396109: goto L_0x0147;
                default: goto L_0x00f0;
            }
        L_0x00f0:
            goto L_0x00e8
        L_0x00f1:
            r12 = -1060232081(0xffffffffc0ce246f, float:-6.4419475)
            java.lang.String r3 = "ۗۜۦۘۘۢۡۗۧۖۗۘ۠ۡۘۖۗۘۘۥ۫ۥۡۧۘۤۗۢ"
        L_0x00f6:
            int r13 = r3.hashCode()
            r13 = r13 ^ r12
            switch(r13) {
                case -402441308: goto L_0x0150;
                case -362992383: goto L_0x0158;
                case -255747710: goto L_0x015b;
                case 184373074: goto L_0x00ff;
                default: goto L_0x00fe;
            }
        L_0x00fe:
            goto L_0x00f6
        L_0x00ff:
            r0 = r17
            e(r0, r11, r7)     // Catch:{ all -> 0x0139 }
            android.content.Intent r2 = new android.content.Intent     // Catch:{ all -> 0x0139 }
            java.lang.Class<com.obwhatsapp.profile.ProfileInfoActivity> r3 = com.obwhatsapp.profile.ProfileInfoActivity.class
            r0 = r17
            r2.<init>(r0, r3)     // Catch:{ all -> 0x0139 }
            android.content.Intent r3 = com.obwhatsapp.yo.yo.notifIn(r2)     // Catch:{ all -> 0x0139 }
            int r12 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0139 }
            r13 = 1235021227(0x499cedab, float:1285557.4)
            java.lang.String r2 = "ۢ۫ۥۘۙۡۚۜ۟ۖۖۚۤۤۥۘۗ۟ۘۨۜۘۖۛۨ"
        L_0x0118:
            int r14 = r2.hashCode()     // Catch:{ all -> 0x0139 }
            r14 = r14 ^ r13
            switch(r14) {
                case -2074282932: goto L_0x019b;
                case -929089424: goto L_0x0164;
                case -629916511: goto L_0x016b;
                case 1378770746: goto L_0x0121;
                default: goto L_0x0120;
            }
        L_0x0120:
            goto L_0x0118
        L_0x0121:
            java.lang.String r2 = "۟ۛۦۥۧ۫ۛ۬ۚۜۜۨۛۨۥۘۜ۬ۘ"
            goto L_0x0118
        L_0x0124:
            java.lang.String r2 = "ۗۥۡۘۤ۫ۨ۠ۘۛۦۗ۫ۡ۠ۜۛ۠۠ۥۦۡۘۜۥۥۥۗۡ"
            goto L_0x00ae
        L_0x0127:
            if (r3 > 0) goto L_0x0124
            java.lang.String r2 = "ۜ۟ۨۘ۬ۙۖۘۚۖۧۘۢۖ۬ۚۚۘۘۥۤۨۡۚۙ۬۟ۖ"
            goto L_0x00ae
        L_0x012c:
            java.lang.String r2 = "ۛۥۛ۬۟۠ۜۥۖۥۨۚۦۙۥۘۧۡۗ"
            goto L_0x00ae
        L_0x012f:
            java.lang.String r2 = ""
            java.lang.String r2 = com.obwhatsapp.yo.yo.getMyStatus(r2)     // Catch:{ all -> 0x0139 }
            r11.setTextViewText(r6, r2)     // Catch:{ all -> 0x0139 }
            goto L_0x00d6
        L_0x0139:
            r1 = move-exception
        L_0x013a:
            return
        L_0x013b:
            java.lang.String r3 = "۟ۘۗۜۢۦۘۖۘۙۙ۠ۜۘ۠ۤۡۥۥۖۘۧۗۥۘۤ۬"
            goto L_0x00e8
        L_0x013e:
            int r3 = r2 * 70
            int r3 = r3 + -30
            if (r3 >= r12) goto L_0x013b
            java.lang.String r3 = "ۜۗۨ۠۟ۜۘۗۘۧۚۢۛ۬ۗۛۥۗۡۘۘ۫ۥۘ۠۠ۢۘۦ۬"
            goto L_0x00e8
        L_0x0147:
            java.lang.String r3 = "ۡۜۦۘۖۢۥۘۧ۫ۨۥۛۖۘۥۥۢ"
            goto L_0x00e8
        L_0x014a:
            int r2 = r2 + 1
            goto L_0x00e3
        L_0x014d:
            java.lang.String r3 = "ۦۗ۠ۥۡۙ۬ۛۘۜۡ۟ۡۛۚ۟ۚۥ۠ۖۜ"
            goto L_0x00f6
        L_0x0150:
            int r3 = r2 + -1
            r13 = 3
            if (r3 >= r13) goto L_0x014d
            java.lang.String r3 = "۠ۧۘ۟۫۠ۗۛۦۘ۟۬ۤۙۨۥۖۦ۬ۡ۫ۜ"
            goto L_0x00f6
        L_0x0158:
            java.lang.String r3 = "۫ۨۦ۠ۢۖۘۢۗۥ۠ۛۦۦۖۡۨۚۢ۬۟ۧ"
            goto L_0x00f6
        L_0x015b:
            java.lang.String r2 = ""
            r11.setTextViewText(r5, r2)     // Catch:{ all -> 0x0139 }
            goto L_0x00ff
        L_0x0161:
            java.lang.String r2 = "ۘۛۜۗۡۖۧۤۨۚۖۗ۟ۚۥ"
            goto L_0x0118
        L_0x0164:
            r2 = 31
            if (r12 < r2) goto L_0x0161
            java.lang.String r2 = "ۡۨۜۘ۟۟ۖۘ۫۬۠ۤۖۢۡۦ۟۬ۖ۟"
            goto L_0x0118
        L_0x016b:
            r2 = 167772160(0xa000000, float:6.162976E-33)
        L_0x016d:
            r0 = r17
            android.app.PendingIntent r2 = android.app.PendingIntent.getActivity(r0, r10, r3, r2)     // Catch:{ all -> 0x0139 }
            r11.setOnClickPendingIntent(r5, r2)     // Catch:{ all -> 0x0139 }
            android.content.Intent r2 = new android.content.Intent     // Catch:{ all -> 0x0139 }
            java.lang.Class<com.obwhatsapp.youbasha.ui.YoSettings.AllSettings> r3 = com.obwhatsapp.youbasha.ui.YoSettings.AllSettings.class
            r0 = r17
            r2.<init>(r0, r3)     // Catch:{ all -> 0x0139 }
            java.lang.String r3 = "lockOnBack"
            r13 = 1
            android.content.Intent r2 = r2.putExtra(r3, r13)     // Catch:{ all -> 0x0139 }
            android.content.Intent r3 = com.obwhatsapp.yo.yo.notifIn(r2)     // Catch:{ all -> 0x0139 }
            r13 = -1398145536(0xffffffffaca9fe00, float:-4.8314686E-12)
            java.lang.String r2 = "ۚۙۗۤۜۨۗۡ۠۟ۖۧۘۖۜۥۘ۟ۘۤۖۜۘ"
        L_0x018f:
            int r14 = r2.hashCode()     // Catch:{ all -> 0x0139 }
            r14 = r14 ^ r13
            switch(r14) {
                case -2020752356: goto L_0x01a8;
                case -1474661498: goto L_0x01a1;
                case -190037696: goto L_0x01e8;
                case 1488497374: goto L_0x0198;
                default: goto L_0x0197;
            }
        L_0x0197:
            goto L_0x018f
        L_0x0198:
            java.lang.String r2 = "ۦ۠ۦۢۗۢۦۧۢۛۛۤۛۧۘۤۥۨۘۢۦۙ"
            goto L_0x018f
        L_0x019b:
            r2 = 134217728(0x8000000, float:3.85186E-34)
            goto L_0x016d
        L_0x019e:
            java.lang.String r2 = "ۚۙۚ۠ۢۤۥۨۚ۟ۚۙۚۚۚ۟ۛۙۢۤۨۨ۠ۥۘ"
            goto L_0x018f
        L_0x01a1:
            r2 = 31
            if (r12 < r2) goto L_0x019e
            java.lang.String r2 = "ۛ۠ۨۢۗ۫ۦۨۛۦ۫ۛ۫ۘۨۜۦۤۤۡۜۢۙۡۘ"
            goto L_0x018f
        L_0x01a8:
            r2 = 167772160(0xa000000, float:6.162976E-33)
        L_0x01aa:
            r0 = r17
            android.app.PendingIntent r2 = android.app.PendingIntent.getActivity(r0, r10, r3, r2)     // Catch:{ all -> 0x0139 }
            r11.setOnClickPendingIntent(r8, r2)     // Catch:{ all -> 0x0139 }
            java.lang.Class r2 = com.obwhatsapp.yo.yo.a()     // Catch:{ all -> 0x0139 }
            r0 = r17
            c(r0, r11, r10, r2, r7)     // Catch:{ all -> 0x0139 }
            java.lang.Class r2 = com.obwhatsapp.yo.yo.a()     // Catch:{ all -> 0x0139 }
            r0 = r17
            c(r0, r11, r10, r2, r6)     // Catch:{ all -> 0x0139 }
            r0 = r17
            refreshBtn(r0, r11)     // Catch:{ all -> 0x0139 }
            java.lang.Class<com.obwhatsapp.yo.WidgetProvider> r2 = com.obwhatsapp.yo.WidgetProvider.class
            r0 = r17
            setMOD(r0, r11, r2)     // Catch:{ all -> 0x0139 }
            android.content.ComponentName r2 = new android.content.ComponentName     // Catch:{ all -> 0x0139 }
            java.lang.Class<com.obwhatsapp.yo.WidgetProvider> r3 = com.obwhatsapp.yo.WidgetProvider.class
            r0 = r17
            r2.<init>(r0, r3)     // Catch:{ all -> 0x0139 }
            r0 = r18
            r0.updateAppWidget(r2, r11)     // Catch:{ all -> 0x0139 }
            int r2 = f604a     // Catch:{ all -> 0x0139 }
            b(r2)     // Catch:{ all -> 0x0139 }
            int r1 = r1 + 1
            goto L_0x004e
        L_0x01e8:
            r2 = 134217728(0x8000000, float:3.85186E-34)
            goto L_0x01aa
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.yo.WidgetProvider.onUpdate(android.content.Context, android.appwidget.AppWidgetManager, int[]):void");
    }
}
