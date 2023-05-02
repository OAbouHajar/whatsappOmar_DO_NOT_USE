package com.obwhatsapp.youbasha.task;

import X.AnonymousClass00T;
import a.a;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.support.v4.view.MotionEventCompat;
import android.support.v4.view.accessibility.AccessibilityEventCompat;
import android.text.TextUtils;
import android.util.Base64;
import android.util.TypedValue;
import android.view.Window;
import android.webkit.MimeTypeMap;
import android.widget.TextView;
import com.obwhatsapp.yo.d0;
import com.obwhatsapp.yo.shp;
import com.obwhatsapp.yo.yo;
import com.obwhatsapp.youbasha.others;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Locale;

public abstract class utils {

    /* renamed from: a  reason: collision with root package name */
    public static Resources f1110a = null;

    /* renamed from: b  reason: collision with root package name */
    public static final String f1111b;
    public static int buildNo1 = 47;
    public static int buildNo2 = 60;

    /* renamed from: c  reason: collision with root package name */
    public static final String f1112c;

    static {
        String str = "ۙۘۨۜۢۖۘۤۧۚۙ۫ۡ۬ۜۛ۠۠ۘۘۨۢۥۘ";
        StringBuilder sb = null;
        String str2 = null;
        StringBuilder sb2 = null;
        while (true) {
            switch ((str.hashCode() ^ 113) ^ 1504351547) {
                case -1823947767:
                    sb2.append(Environment.getExternalStorageDirectory());
                    str = "۫۟ۚۢۢۦۡۛۨۡۛ۠ۤۧۖۘۢ۟ۘۘۢۡ۬ۥۧ";
                    break;
                case -1815546133:
                    sb = new StringBuilder();
                    str = "ۘۚ۬ۥۛ۠ۧۙۗۧۢ۫۠ۘۗ۫ۧۘۘۡ۟ۥ";
                    break;
                case -1660893929:
                    sb.append(yo.mpack);
                    str = "۬ۧۖۘۗۡۥۘۚۥۢۢۜۜۘۤ۫۟۠۟ۘ";
                    break;
                case -1223916304:
                    sb.append(str2);
                    str = "ۙۘ۫ۙۘۜۘۛۧۥۘۥۛۖۗۜۗۚ۫ۢۗۡۧ";
                    break;
                case -851691845:
                    return;
                case -32757859:
                    sb.append(Environment.getExternalStorageDirectory());
                    str = "ۦۜۖۘۡ۫ۧۛۛۜۘۥۘۥۧۙ۠۠۟ۘۘۘۚۜۘ";
                    break;
                case 3295310:
                    sb.append("Android/media/");
                    str = "ۤۗۡۙۨۤۡۛۘۘ۟ۙۨۗۤۥۘۧۦ۬ۤ۠ۙ";
                    break;
                case 907371359:
                    str = "ۤۥۛ۬۟ۧ۠ۥۜۘ۟۟ۡۥۦۖۘۗۜۡۘ۬ۚ۬ۧۚۘۘ";
                    str2 = File.separator;
                    break;
                case 918441158:
                    sb2.append(str2);
                    str = "ۜۘۦۤ۠ۖۡۛۜ۟ۦۖۡۤ۬ۖ۟ۧ۫ۤۦۦ۟ۦۘۨۛۛ";
                    break;
                case 1422415614:
                    sb.append(str2);
                    str = "ۚۛۜۥۛۨۘۥۡۘۘ۠ۜۗۤۜۜۡۘۤۥۦۖ";
                    break;
                case 1598874245:
                    str = "ۢ۬ۤۡۥۖۧۥۖۘۗۙۚۖ۫ۥ۫ۚۥۘۡۦۚ";
                    sb2 = new StringBuilder();
                    break;
                case 1981508484:
                    f1112c = a.f(sb, yo.pname, str2);
                    str = "ۜۡۗۗ۬ۗۧۖ۠ۜ۬ۢ۬ۢ۬ۤۘۘۛ۬ۡ";
                    break;
                case 2001274664:
                    f1111b = a.f(sb2, yo.pname, str2);
                    str = "ۧ۫ۡۘ۫ۡۡۦۜۡۧۨۨۘۢۨۜۘۦۡۡۘ۠ۙۛۜۡۙ۠ۥۘ";
                    break;
            }
        }
    }

    public static HashSet<String> StringToHashSet(String str) {
        try {
            String[] StringToStringArray = StringToStringArray(str);
            HashSet<String> hashSet = new HashSet<>();
            String str2 = "ۦۖۨۘ۟ۥۧۘۘ۟ۤ۬۠ۖۘۙ۬۬ۧۤ";
            while (true) {
                switch (str2.hashCode() ^ -1571153475) {
                    case -1688353376:
                        Collections.addAll(hashSet, StringToStringArray);
                        return hashSet;
                    case -1047859412:
                        str2 = "۠۬۟ۥۙۥۘ۫۬ۥۘۢۘ۬ۘ۫ۖۘ";
                        break;
                    case -245535545:
                        if (StringToStringArray == null) {
                            str2 = "ۧۖۚۨ۠ۚ۠۬ۡۘۢ۟ۜۘۢۗ۫ۚۦۖۘۙۨۦۗۖۨۘ۟ۤۦۘ";
                            break;
                        } else {
                            str2 = "ۛۖۙۨۖۦۘۧۥۚۥۧۦ۬۫۫ۡۘ۠ۗۜۙ";
                            break;
                        }
                    case 1106982833:
                        Collections.addAll(hashSet, StringToStringArray(str));
                        return hashSet;
                }
            }
        } catch (Exception e2) {
            return null;
        }
    }

    public static String[] StringToStringArray(String str) {
        try {
            return str.substring(1, str.length() - 1).replaceAll("\\s", "").split(",");
        } catch (Exception e2) {
            return null;
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Bitmap a(java.lang.String r9) {
        /*
            r1 = 1
            android.content.Context r0 = com.obwhatsapp.yo.yo.getCtx()
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            int r2 = r0.widthPixels
            int r3 = r0.heightPixels
            android.graphics.BitmapFactory$Options r4 = new android.graphics.BitmapFactory$Options     // Catch:{ OutOfMemoryError -> 0x00a5, Exception -> 0x00ab }
            r4.<init>()     // Catch:{ OutOfMemoryError -> 0x00a5, Exception -> 0x00ab }
            r0 = 1
            r4.inJustDecodeBounds = r0     // Catch:{ OutOfMemoryError -> 0x00a5, Exception -> 0x00ab }
            android.graphics.BitmapFactory.decodeFile(r9, r4)     // Catch:{ OutOfMemoryError -> 0x00a5, Exception -> 0x00ab }
            int r5 = r4.outHeight     // Catch:{ OutOfMemoryError -> 0x00a5, Exception -> 0x00ab }
            int r6 = r4.outWidth     // Catch:{ OutOfMemoryError -> 0x00a5, Exception -> 0x00ab }
            r7 = 1623669532(0x60c73b1c, float:1.1484879E20)
            java.lang.String r0 = "۟ۦۨۘۙۖۧۡ۟ۘۧ۟ۨۘ۟"
        L_0x0025:
            int r8 = r0.hashCode()     // Catch:{ OutOfMemoryError -> 0x00a5, Exception -> 0x00ab }
            r8 = r8 ^ r7
            switch(r8) {
                case -1336571261: goto L_0x002e;
                case -758064413: goto L_0x0067;
                case 251737292: goto L_0x0034;
                case 1400622074: goto L_0x0039;
                default: goto L_0x002d;
            }
        L_0x002d:
            goto L_0x0025
        L_0x002e:
            java.lang.String r0 = "ۜ۟ۖۘۨ۟ۨۢۜۥۗۘۤۨ۫ۧۙۖۘۗۖۘۦۡ۟"
            goto L_0x0025
        L_0x0031:
            java.lang.String r0 = "ۧۡۧۜۥۗۨ۫۟ۨۘۖۚۨۘ"
            goto L_0x0025
        L_0x0034:
            if (r5 > r3) goto L_0x0031
            java.lang.String r0 = "ۧ۬ۘۦ۬ۡ۠ۢۜۤۦۚۘ۟ۦۘۗ۠ۨۖۛۤ"
            goto L_0x0025
        L_0x0039:
            r7 = 221091485(0xd2d969d, float:5.3491035E-31)
            java.lang.String r0 = "۬ۙۦۘۥ۬ۛۜۖۘۨۡۚۜ۬ۢ"
        L_0x003e:
            int r8 = r0.hashCode()
            r8 = r8 ^ r7
            switch(r8) {
                case -1549348992: goto L_0x0067;
                case -558522873: goto L_0x005f;
                case -312234574: goto L_0x0064;
                case 1037250373: goto L_0x0047;
                default: goto L_0x0046;
            }
        L_0x0046:
            goto L_0x003e
        L_0x0047:
            r0 = r1
        L_0x0048:
            r4.inSampleSize = r0     // Catch:{ OutOfMemoryError -> 0x00a5, Exception -> 0x00ab }
            r0 = 0
            r4.inJustDecodeBounds = r0     // Catch:{ OutOfMemoryError -> 0x00a5, Exception -> 0x00ab }
            r0 = 1
            r4.inScaled = r0     // Catch:{ OutOfMemoryError -> 0x00a5, Exception -> 0x00ab }
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.RGB_565     // Catch:{ OutOfMemoryError -> 0x00a5, Exception -> 0x00ab }
            r4.inPreferredConfig = r0     // Catch:{ OutOfMemoryError -> 0x00a5, Exception -> 0x00ab }
            r0 = 1
            r4.inDither = r0     // Catch:{ OutOfMemoryError -> 0x00a5, Exception -> 0x00ab }
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeFile(r9, r4)     // Catch:{ OutOfMemoryError -> 0x00a5, Exception -> 0x00ab }
        L_0x005b:
            return r0
        L_0x005c:
            java.lang.String r0 = "ۙۗۦۘۛۨ۬ۤۢۡۚ۫ۚ۠ۙۧۖۧۢ"
            goto L_0x003e
        L_0x005f:
            if (r6 <= r2) goto L_0x005c
            java.lang.String r0 = "۬ۨۜۥۧۚۖۖۡۢۨ۫ۙۚۤ۬ۘۧۘۛۤۜ"
            goto L_0x003e
        L_0x0064:
            java.lang.String r0 = "ۧۨۥ۟ۛۘۚۥۘۙۘۖ۟ۡۧۘۖۡۨۘۧۘۜۘ"
            goto L_0x003e
        L_0x0067:
            int r5 = r5 / 2
            int r6 = r6 / 2
            r0 = r1
        L_0x006c:
            r7 = -1196164662(0xffffffffb8b3f9ca, float:-8.581912E-5)
            java.lang.String r1 = "ۦۗۛۙ۟۠ۤۘ۟۬ۖ۫ۙۚۧ"
        L_0x0071:
            int r8 = r1.hashCode()     // Catch:{ OutOfMemoryError -> 0x00a5, Exception -> 0x00ab }
            r8 = r8 ^ r7
            switch(r8) {
                case -2142741849: goto L_0x007a;
                case -1289369437: goto L_0x0087;
                case -516344438: goto L_0x0080;
                case 1486112880: goto L_0x0048;
                default: goto L_0x0079;
            }     // Catch:{ OutOfMemoryError -> 0x00a5, Exception -> 0x00ab }
        L_0x0079:
            goto L_0x0071
        L_0x007a:
            java.lang.String r1 = "۟ۛۦۘۧۛۘۢۨ۬ۡ۫ۘۘۙۛ۬ۖ۟ۙۖۦۥ۠ۚۘ"
            goto L_0x0071
        L_0x007d:
            java.lang.String r1 = "ۡ۠۬ۧۧ۠۠ۖۦۖۤ۟ۛۙ۠ۡۦۜۨۛۖ"
            goto L_0x0071
        L_0x0080:
            int r1 = r5 / r0
            if (r1 < r3) goto L_0x007d
            java.lang.String r1 = "ۡۡۡۘۜۧۡۦ۬۟ۥ۟۬ۦۘۗ"
            goto L_0x0071
        L_0x0087:
            r7 = -494738863(0xffffffffe282e251, float:-1.2071923E21)
            java.lang.String r1 = "ۗۤ۬۟۠ۨۘۙ۫ۧۢۡۨۘۤۡۙۗۧۨۡ۟ۜ"
        L_0x008c:
            int r8 = r1.hashCode()     // Catch:{ OutOfMemoryError -> 0x00a5, Exception -> 0x00ab }
            r8 = r8 ^ r7
            switch(r8) {
                case -714095969: goto L_0x009b;
                case 1670375794: goto L_0x00a2;
                case 1709582212: goto L_0x0095;
                case 1956219815: goto L_0x0048;
                default: goto L_0x0094;
            }     // Catch:{ OutOfMemoryError -> 0x00a5, Exception -> 0x00ab }
        L_0x0094:
            goto L_0x008c
        L_0x0095:
            int r0 = r0 * 2
            goto L_0x006c
        L_0x0098:
            java.lang.String r1 = "ۨۡۢۗۗ۟ۙۢۨ۫ۜۧۥ۬ۦۢۦۗۨۢۗۦ۬ۘ"
            goto L_0x008c
        L_0x009b:
            int r1 = r6 / r0
            if (r1 < r2) goto L_0x0098
            java.lang.String r1 = "ۥ۬ۘۘۨۛ۬۠۬ۘۘۛۙۡۛۤ۬ۙۦۤ۠ۛۗ"
            goto L_0x008c
        L_0x00a2:
            java.lang.String r1 = "ۖۢۧۤۗۡ۬ۧۦ۠۠ۜۘۖۘ۫"
            goto L_0x008c
        L_0x00a5:
            r0 = move-exception
            r0.printStackTrace()
        L_0x00a9:
            r0 = 0
            goto L_0x005b
        L_0x00ab:
            r0 = move-exception
            goto L_0x00a9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.youbasha.task.utils.a(java.lang.String):android.graphics.Bitmap");
    }

    public static boolean b(String str) {
        String str2 = "ۧۜۙ۬ۙۖۘۛۨۙ۬ۥۨۧۤۤ";
        while (true) {
            try {
                switch (str2.hashCode() ^ 1888174839) {
                    case -1719179206:
                        break;
                    case -1436164297:
                        int A01 = AnonymousClass00T.A01(yo.getCtx(), str);
                        String str3 = "ۤۢ۫ۤۛۢۢۗۛۦ۫ۨۘۡۥۡ";
                        while (true) {
                            switch (str3.hashCode() ^ -1702258292) {
                                case -1190486868:
                                    if (A01 != 0) {
                                        str3 = "ۧۖۡۢۡۡۘۖۧۥۚ۟ۤۛۛۚۙ۬ۗۚ۠ۨۘۧ۫۬۬ۦۥ";
                                        break;
                                    } else {
                                        str3 = "ۦ۟ۨۘۗۢۛۥۘۧۤۥۧۘۧۡ۫ۛۥۡۦ۟ۖۘ";
                                        continue;
                                    }
                                case -321292180:
                                    str3 = "ۛۥۜۛ۬۬۠ۦۗۡۧ۬۠ۧۡۘۙۧۢۖ۟ۘۘۚۦۥ۫ۜۗ";
                                    continue;
                                case 1007672762:
                                    return false;
                                case 1326069122:
                                    break;
                                default:
                                    continue;
                            }
                        }
                    case -478723482:
                        if (Build.VERSION.SDK_INT >= 23) {
                            str2 = "۬۟ۨۘۘۥۧۘ۠ۢۢۧۡۨۜ۠ۧۛۦ۟ۦۚۦ۠ۢ۠ۦۖۦ";
                            break;
                        } else {
                            str2 = "ۙۙۤۥۥ۟ۘۤۦ۬ۗۦۢۢۥۘۛۚۜۘۦۛۘۙۥۦۘۢۚۜ";
                            continue;
                        }
                    case 14499965:
                        str2 = "ۙ۠۫ۗۦۡۤۡۘۤۨۥۥۨۨۢۤۚۛۤۡۤۘۜۘۛۘۖۘ";
                        continue;
                    default:
                        continue;
                }
            } catch (Exception e2) {
            }
        }
        return true;
    }

    public static String bsf(String str, int i2) {
        String str2 = "۫ۗۦۙۡۢۗۛۖۗۢۗۜ۠ۚۙ۟ۜۘۢۘۘ";
        while (true) {
            switch (str2.hashCode() ^ 496906422) {
                case -1920641041:
                    return str;
                case -1469217644:
                    str2 = "ۥۨۖۘۥۢۥۘ۫ۗۙۜۛۦۘ۬۫ۡ";
                    break;
                case -998557596:
                    try {
                        return bsf(Base64.encodeToString(str.getBytes(), 2), i2 - 1);
                    } catch (Exception e2) {
                        return "yousef";
                    }
                case 133276242:
                    if (i2 != 0) {
                        str2 = "ۧۡۧ۫ۡۨ۠ۛۙۨۡ۠ۙۥۡ۫۬ۜۘۗ۫ۘۘۜۗۘۥۦۘ";
                        break;
                    } else {
                        str2 = "ۥۧۦۘۦۛۥۘۗ۟۟۟۟ۦۘۛۢۨۢۖۖۗۧ۠";
                        break;
                    }
            }
        }
    }

    public static Drawable buffWallp(String str, Drawable drawable) {
        try {
            Bitmap a2 = a(str);
            String str2 = "ۛۥ۬ۤۛۥ۬ۦ۟۟ۡۘۘۜ۬ۙۚۡۖۨۗۚ";
            while (true) {
                switch (str2.hashCode() ^ 1325306389) {
                    case -1363926357:
                        str2 = "ۜۡۖۚۨۤۢۦۨۘ۟ۗۛۡۤۦۘۦۛۜۥۨۥۚۡۘۨۖۧ";
                        break;
                    case -1344058256:
                        return drawable;
                    case -1038036361:
                        return new BitmapDrawable(yo.getCtx().getResources(), a2);
                    case 554080831:
                        if (a2 == null) {
                            str2 = "ۗۜۥۗۨ۬ۤ۬ۢۤۛۦۘۚۛۜۘ";
                            break;
                        } else {
                            str2 = "۠ۖۥۘۤۧۡۙۚۛۡۜۖۨۡۖۨۛۤۦۥۧ";
                            break;
                        }
                }
            }
        } catch (Exception e2) {
            return drawable;
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.hardware.fingerprint.FingerprintManager c() {
        /*
            r10 = 23
            r3 = 0
            r6 = 0
            java.lang.String r1 = "ۗۚ۬ۚۨۖ۬ۢۡۘۤۥۜۚۖۨۘۙۖ۫ۥۘۙ"
            r2 = r3
            r0 = r3
            r4 = r3
            r5 = r3
        L_0x000a:
            int r7 = r1.hashCode()
            r8 = 154(0x9a, float:2.16E-43)
            r9 = -50334024(0xfffffffffcfff6b8, float:-1.0632318E37)
            r7 = r7 ^ r8
            r7 = r7 ^ r9
            switch(r7) {
                case -2145787916: goto L_0x00b1;
                case -2143300487: goto L_0x009e;
                case -1877272124: goto L_0x001e;
                case -1229866209: goto L_0x0025;
                case -220381454: goto L_0x006d;
                case 132672561: goto L_0x0019;
                case 215832655: goto L_0x0094;
                case 1224215119: goto L_0x0041;
                case 1452650587: goto L_0x004a;
                case 1596554567: goto L_0x0051;
                case 1770435454: goto L_0x00a3;
                case 1834129970: goto L_0x00a5;
                case 2064892478: goto L_0x004e;
                default: goto L_0x0018;
            }
        L_0x0018:
            goto L_0x000a
        L_0x0019:
            int r6 = android.os.Build.VERSION.SDK_INT
            java.lang.String r1 = "ۢۢۦۗۤۖۘۜۤۜۦۙۦۡۢۨۘۡۢ۬"
            goto L_0x000a
        L_0x001e:
            android.content.Context r5 = com.obwhatsapp.yo.yo.getCtx()
            java.lang.String r1 = "ۛۥۖۦۨۜۙۢۖۘۘۖۜۘۙۛ۫ۤۥۜۘۘۘ۫ۖۛ"
            goto L_0x000a
        L_0x0025:
            r7 = 1763930686(0x6923723e, float:1.234965E25)
            java.lang.String r1 = "ۧۜۤۛۢۢۗۜۗ۬۬ۛۚۦۢۥ۠ۜۨۗۥ۠ۡۧۖۧۨۘ"
        L_0x002a:
            int r8 = r1.hashCode()
            r8 = r8 ^ r7
            switch(r8) {
                case -477753660: goto L_0x0033;
                case 234933743: goto L_0x0039;
                case 536686174: goto L_0x00a9;
                case 1194370802: goto L_0x003e;
                default: goto L_0x0032;
            }
        L_0x0032:
            goto L_0x002a
        L_0x0033:
            java.lang.String r1 = "ۘ۬ۡۘ۬ۢۜۜۧۡ۫ۖ۫ۢۢۖۖۘۘۛۢۘۘ"
            goto L_0x002a
        L_0x0036:
            java.lang.String r1 = "ۧ۟ۥۦۚۙۚۨ۟ۖۛۛۡۢۚۤۘۜۘۙۨ۫ۛۗۦۘ۫ۖۡۘ"
            goto L_0x002a
        L_0x0039:
            if (r6 != r10) goto L_0x0036
            java.lang.String r1 = "۟ۡۜۚ۬ۙ۫ۘۥۖۧ۬ۗۛۨۘۥ۠ۖ۠۠ۖۜ۠۬ۛۚۢ"
            goto L_0x002a
        L_0x003e:
            java.lang.String r1 = "ۖ۬ۥۘۡۘۜۜۧۤۧۚۚۛۖۗ۬ۧ"
            goto L_0x000a
        L_0x0041:
            java.lang.Class<android.hardware.fingerprint.FingerprintManager> r1 = android.hardware.fingerprint.FingerprintManager.class
            java.lang.Object r4 = com.obwhatsapp.yo.i.b(r5, r1)
            java.lang.String r1 = "ۗۦۙۥ۠ۜۘۨۨۖ۫ۛۥۖۛۚۨۥۡۤ۟ۜۖ۬ۤۘ۫ۨ"
            goto L_0x000a
        L_0x004a:
            java.lang.String r1 = "ۧۥۘۢۨۡۗ۠ۘۘۛۙۦۘ۫۬ۦ۬ۥ۫ۙۢ۬"
            r0 = r4
            goto L_0x000a
        L_0x004e:
            android.hardware.fingerprint.FingerprintManager r0 = (android.hardware.fingerprint.FingerprintManager) r0
        L_0x0050:
            return r0
        L_0x0051:
            r7 = -1814431233(0xffffffff93d9f9ff, float:-5.5025016E-27)
            java.lang.String r1 = "ۜۤۖ۬ۡۘۚۡۥۜۥۙ۫ۗ۠ۚۥۡۘۥۚۥۘۡۤ۟ۜۤۢ"
        L_0x0056:
            int r8 = r1.hashCode()
            r8 = r8 ^ r7
            switch(r8) {
                case -833619888: goto L_0x0067;
                case -394359370: goto L_0x00b1;
                case 1445498794: goto L_0x005f;
                case 1782889977: goto L_0x006a;
                default: goto L_0x005e;
            }
        L_0x005e:
            goto L_0x0056
        L_0x005f:
            if (r6 <= r10) goto L_0x0064
            java.lang.String r1 = "۠ۨۥۘۜۚۦ۠ۘۢۗۨۖ۠ۖۥۜۙۙۗۗۡۘۛۖۚ۠۬ۨۘ"
            goto L_0x0056
        L_0x0064:
            java.lang.String r1 = "ۘ۬۬ۨۗۡۧۦۘۥۥۘۙۘۡ"
            goto L_0x0056
        L_0x0067:
            java.lang.String r1 = "ۨ۠ۜۘۜۦۡ۬۟ۙ۟ۨۖۘۨۖۘۘۚۨ۫۟۬ۨۘۘۦۤۥۧ۠"
            goto L_0x0056
        L_0x006a:
            java.lang.String r1 = "ۜۖ۟۬ۦۛۥۡۜۘۚۛۖۥۙۡۦۤ۟۟ۧ۫ۨۚۨۘ"
            goto L_0x000a
        L_0x006d:
            r7 = -1068763236(0xffffffffc04bf79c, float:-3.1869879)
            java.lang.String r1 = "ۜۥۦۜۚۗ۫ۦ۟ۗۡ۬ۜۨۥ۫ۦۡۥۚۘۘ۟ۖۘ"
        L_0x0072:
            int r8 = r1.hashCode()
            r8 = r8 ^ r7
            switch(r8) {
                case -1731154217: goto L_0x0090;
                case 725229888: goto L_0x008d;
                case 1363074399: goto L_0x00ad;
                case 2100671193: goto L_0x007b;
                default: goto L_0x007a;
            }
        L_0x007a:
            goto L_0x0072
        L_0x007b:
            android.content.pm.PackageManager r1 = r5.getPackageManager()
            java.lang.String r8 = "android.hardware.fingerprint"
            boolean r1 = r1.hasSystemFeature(r8)
            if (r1 != 0) goto L_0x008a
            java.lang.String r1 = "ۦۥۜۘۛۡۙ۬ۖۚۜۖۗ۠۟۠"
            goto L_0x0072
        L_0x008a:
            java.lang.String r1 = "۠ۛۦۘ۠ۛۦۘۨۘۥۘۙۥ۫ۧۙۗ"
            goto L_0x0072
        L_0x008d:
            java.lang.String r1 = "ۘۚۢ۠۟ۚۢۥۥۘۖ۠ۚ۠ۙۥۘ"
            goto L_0x0072
        L_0x0090:
            java.lang.String r1 = "ۢۨۧۤۦۡۨۘ۫۫ۤۜۘۘ۟۟ۘۢۨۘۗۘۗ"
            goto L_0x000a
        L_0x0094:
            java.lang.Class<android.hardware.fingerprint.FingerprintManager> r1 = android.hardware.fingerprint.FingerprintManager.class
            java.lang.Object r2 = com.obwhatsapp.yo.i.b(r5, r1)
            java.lang.String r1 = "ۛۖۜۖ۫ۘۘۨ۠ۥ۬ۛ۟ۚۢ۟ۙۜۤۛۢۥ"
            goto L_0x000a
        L_0x009e:
            java.lang.String r1 = "ۘۥۥۤۢۗۜ۬ۗۚۘۤۤۡ۟ۨ۫ۢۥۚ۫ۧۖۘ"
            r0 = r2
            goto L_0x000a
        L_0x00a3:
            r0 = r3
            goto L_0x0050
        L_0x00a5:
            java.lang.String r1 = "ۧۥۘۢۨۡۗ۠ۘۘۛۙۦۘ۫۬ۦ۬ۥ۫ۙۢ۬"
            goto L_0x000a
        L_0x00a9:
            java.lang.String r1 = "ۙ۠ۜۗۤۨۘۢ۟ۦ۬ۥ۟ۨ۠۫ۥ۠ۤ"
            goto L_0x000a
        L_0x00ad:
            java.lang.String r1 = "ۦۖۛۙۤ۠۫۠ۘۡۥۙ۠ۡۗۧ"
            goto L_0x000a
        L_0x00b1:
            java.lang.String r1 = "ۛۙۥۘۧۘۥۘ۠ۗۧ۬ۧۨ۫ۦۤۡۘۡۘۡۦۦۘ"
            goto L_0x000a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.youbasha.task.utils.c():android.hardware.fingerprint.FingerprintManager");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0090, code lost:
        r0 = "ۤۦۙۥۜۡۘۖ۫۫۠ۧۨۘۧۘ۬ۢۤ۬ۚ۠۠۬۟ۥۨۡ";
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void checkWhatsAppFolder() {
        /*
            r2 = 0
            r6 = 1
            java.lang.String r0 = "ۤۜۚۗ۠ۡۥۖ۬ۡۜ۟ۜۘ"
            r1 = r2
            r3 = r2
        L_0x0006:
            int r2 = r0.hashCode()
            r4 = 267(0x10b, float:3.74E-43)
            r5 = 1357451170(0x50e90fa2, float:3.12809267E10)
            r2 = r2 ^ r4
            r2 = r2 ^ r5
            switch(r2) {
                case -1457596364: goto L_0x007c;
                case -1078640174: goto L_0x0015;
                case -815387357: goto L_0x0028;
                case -641050613: goto L_0x0082;
                case 296240878: goto L_0x0089;
                case 1673391542: goto L_0x0030;
                case 1731669374: goto L_0x005c;
                case 1772499261: goto L_0x001e;
                case 1846011873: goto L_0x0094;
                case 2093704593: goto L_0x003c;
                default: goto L_0x0014;
            }
        L_0x0014:
            goto L_0x0006
        L_0x0015:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = "ۜ۠ۥۤۥۨۘۗۖۛۜۨ۟ۚۥ"
            r3 = r2
            goto L_0x0006
        L_0x001e:
            java.io.File r0 = android.os.Environment.getExternalStorageDirectory()
            r3.append(r0)
            java.lang.String r0 = "۠۟۠ۛۦۤۥۚۦۙۨۥۧۘۘ"
            goto L_0x0006
        L_0x0028:
            java.lang.String r0 = "/WhatsApp"
            r3.append(r0)
            java.lang.String r0 = "ۙۢۡۘ۟ۜۙۜۦۤۗۡۜۘ۫۟ۗ"
            goto L_0x0006
        L_0x0030:
            java.io.File r1 = new java.io.File
            java.lang.String r0 = r3.toString()
            r1.<init>(r0)
            java.lang.String r0 = "ۡۨۦۢۨۧۘۙۙۥ۠ۤۡۘۚۤۤۧۛۗۥۢۨ"
            goto L_0x0006
        L_0x003c:
            r2 = 1634700674(0x616f8d82, float:2.7618553E20)
            java.lang.String r0 = "ۙۦۢۡۨۨۘۧۘۨۡۤۚۜۢ"
        L_0x0041:
            int r4 = r0.hashCode()
            r4 = r4 ^ r2
            switch(r4) {
                case -424608055: goto L_0x004a;
                case 809314480: goto L_0x0050;
                case 823489469: goto L_0x0090;
                case 2132561727: goto L_0x0059;
                default: goto L_0x0049;
            }
        L_0x0049:
            goto L_0x0041
        L_0x004a:
            java.lang.String r0 = "ۦۗۛۤۨۡۘۡۧ۫۟۟۠ۧ۠ۖۢۥۘۤۘۧۘۤۛۛۜۚۦۘ"
            goto L_0x0006
        L_0x004d:
            java.lang.String r0 = "ۛۤۨۜ۫ۡۘۦۙۜۢ۫ۡۙ۠۠۬ۤۦۘۗۜۦۘۥۙۙ"
            goto L_0x0041
        L_0x0050:
            boolean r0 = r1.isDirectory()
            if (r0 != 0) goto L_0x004d
            java.lang.String r0 = "ۘۡۙۤۥۨۜۢۡ۬ۘ۠ۛۨ"
            goto L_0x0041
        L_0x0059:
            java.lang.String r0 = "ۥ۠ۡۚ۫ۦۘ۠ۚ۬۟ۦۚۦ۫ۖۤۢۤۡ۫ۖۘ"
            goto L_0x0041
        L_0x005c:
            r2 = -1916022304(0xffffffff8dcbd1e0, float:-1.25613665E-30)
            java.lang.String r0 = "۫ۥۦۘۢۜۦۘۘۙۥۘۥۨۨۤۧ۟۟ۥۘۘۡ۟ۘۘ۠۬ۥۘ"
        L_0x0061:
            int r4 = r0.hashCode()
            r4 = r4 ^ r2
            switch(r4) {
                case -1939766890: goto L_0x0079;
                case -1103837267: goto L_0x006a;
                case -1037837199: goto L_0x0090;
                case -317649786: goto L_0x0070;
                default: goto L_0x0069;
            }
        L_0x0069:
            goto L_0x0061
        L_0x006a:
            java.lang.String r0 = "ۦ۫ۖۘۤۧ۠ۨۖۘۜۡ۟ۡۡۧۘ۫ۢۤ"
            goto L_0x0061
        L_0x006d:
            java.lang.String r0 = "ۡۙۤۙۨ۫ۨۡۜۘ۬ۜۦۘۙ۫ۦۙۨۚۜۚۗۢ۟۟ۛۧۤ"
            goto L_0x0061
        L_0x0070:
            boolean r0 = r1.exists()
            if (r0 != 0) goto L_0x006d
            java.lang.String r0 = "ۥۨۙ۠ۧۜۘ۫ۗ۟ۢۖۦۤۙ"
            goto L_0x0061
        L_0x0079:
            java.lang.String r0 = "ۧ۟ۡۨۡۖۧۘۥۘۘ۫ۚۛۛ۫ۛۖۘۥ۬ۥ"
            goto L_0x0006
        L_0x007c:
            r1.mkdir()
            java.lang.String r0 = "ۗۜ۫۬۬ۥۚ۫ۤۨۢ۫ۧ۟ۘۡۘۦۘۜۨۜۘۖۙۨۘۙ۬ۜ"
            goto L_0x0006
        L_0x0082:
            r1.setReadable(r6)
            java.lang.String r0 = "ۡ۠ۙ۬ۚۤۡۢۜۨۘۥۘ۫ۥۗۜ۠۠ۡۛۘۘ۫۠ۡۘ"
            goto L_0x0006
        L_0x0089:
            r1.setWritable(r6)
            java.lang.String r0 = "ۤۦۙۥۜۡۘۖ۫۫۠ۧۨۘۧۘ۬ۢۤ۬ۚ۠۠۬۟ۥۨۡ"
            goto L_0x0006
        L_0x0090:
            java.lang.String r0 = "ۤۦۙۥۜۡۘۖ۫۫۠ۧۨۘۧۘ۬ۢۤ۬ۚ۠۠۬۟ۥۨۡ"
            goto L_0x0006
        L_0x0094:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.youbasha.task.utils.checkWhatsAppFolder():void");
    }

    public static void copyFile(String str, String str2) {
        try {
            File file = new File(str);
            File file2 = new File(str2);
            FileInputStream fileInputStream = new FileInputStream(file);
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            byte[] bArr = new byte[1024];
            while (true) {
                int read = fileInputStream.read(bArr);
                String str3 = "۫۬ۗ۟ۚۙۦۛۧۨۦۘ۠۠ۚۖۛۦ";
                while (true) {
                    switch (str3.hashCode() ^ -1010852517) {
                        case 586084386:
                            str3 = "ۨ۟ۛۤۤۖۥ۟۬ۙۛۨ۟ۧ۟ۙۦۛ۫ۡۛۢ۫ۘۘۨۧۡ";
                            break;
                        case 902995820:
                            if (read <= 0) {
                                str3 = "۫ۖۧۘۙۛۘۘۨۡۧۘۗۖۡۤۚ۠";
                                break;
                            } else {
                                str3 = "ۛۢۗۤۛۘۘۤ۠ۖۚۨۦۘۥۜۡۚۗۨۖۚۛ۬ۖۧۧۛۧ";
                                break;
                            }
                        case 988323178:
                            fileOutputStream.write(bArr, 0, read);
                        case 2024074955:
                            fileInputStream.close();
                            fileOutputStream.close();
                            return;
                    }
                }
            }
        } catch (Exception e2) {
        }
    }

    public static String d(Uri uri) {
        try {
            String scheme = uri.getScheme();
            String str = "ۢۨۡۧۡۜ۫ۖۜۡۜۜۘ۟ۡۙۤۢۦۘۙۖۗۗۨۗۢۘۢ";
            while (true) {
                switch (str.hashCode() ^ -2028178537) {
                    case -1734381968:
                        break;
                    case 140723145:
                        String str2 = "ۙ۟ۖ۠ۖۤۧۨۡۖ۟ۡۤۢۖۘۘ۬۬ۘۜۧۡۧۥۘۜۨۜۘ";
                        while (true) {
                            switch (str2.hashCode() ^ 1029043656) {
                                case -1780149502:
                                    break;
                                case 1073358501:
                                    return yo.getCtx().getContentResolver().getType(uri);
                                case 1645042986:
                                    if (scheme.equals("content")) {
                                        str2 = "ۤۗۨۡۛ۠ۛۘۤۢۗۦۥ۠ۚۨۦۘ۬ۚۢ";
                                        break;
                                    } else {
                                        str2 = "ۨ۟ۘۙۙۚۗ۟۫ۛ۬ۗۨ۫۫۠ۤۦۗۥۢۢ۠ۡۡۚۨ";
                                        continue;
                                    }
                                case 1794027318:
                                    str2 = "ۦۙ۟ۖۛۘۘ۬ۖۡۘۢۚ۫ۥ۫۟ۖۛۥۘۘۛۨۘۨۙۡ";
                                    continue;
                                default:
                                    continue;
                            }
                        }
                    case 504334541:
                        if (scheme != null) {
                            str = "ۚۛۡۘ۟ۛۖۘۦۢۧۚۖۨۢۘ۫ۥۥۘۜۙ";
                            break;
                        } else {
                            str = "ۜۢۦۧ۬ۘۘۢۗۖۖۤ۬ۥۛۦۧ۫ۙ";
                            continue;
                        }
                    case 545129376:
                        str = "ۖۖۖۥۚۧۢۦۥۘۜ۬ۨۘۥۡۥۘۦۨۧۥۜۡۘ۟ۧۗ";
                        continue;
                    default:
                        continue;
                }
            }
            return MimeTypeMap.getSingleton().getMimeTypeFromExtension(MimeTypeMap.getFileExtensionFromUrl(uri.toString()).toLowerCase());
        } catch (Exception e2) {
            return null;
        }
    }

    public static int darkerColor(int i2, float f2) {
        String str = "ۙۥۗۘ۬ۘۘۧۧ۫ۜۧۡۘۢۛۥۘ";
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            switch ((str.hashCode() ^ 296) ^ -1746560595) {
                case -2146598526:
                    return Color.argb(i6, Math.min(i5, MotionEventCompat.ACTION_MASK), Math.min(i4, MotionEventCompat.ACTION_MASK), Math.min(i3, MotionEventCompat.ACTION_MASK));
                case -1054074535:
                    str = "۟ۛ۠۠ۜۖۜۧ۠ۘۨۢۙۙۥۡۡۙ۬ۛ";
                    i6 = Color.alpha(i2);
                    break;
                case -748319106:
                    i3 = Math.round(((float) Color.blue(i2)) * f2);
                    str = "ۢ۫ۖۘۡۤ۠ۚۡۗۧۢ۫۟ۜۧۨۥۜ";
                    break;
                case 1321457129:
                    str = "۟ۚۡ۫ۙۜۘ۠ۘۡۘۢ۟ۘۗ۫۬";
                    break;
                case 1384574943:
                    str = "ۦۨۜۘۙ۠ۥۘۨ۬ۛۚۙۗۘۙۦۘ";
                    break;
                case 1489531027:
                    str = "ۙۙ۫ۦۗ۫ۜۛۙۧۛۢ۫ۥۧ۠ۙۜ";
                    i5 = Math.round(((float) Color.red(i2)) * f2);
                    break;
                case 1549369564:
                    str = "ۦ۬ۘ۫۫ۜۦۤۘۘۢۖۨۧۧۧۡۚۨ۟۬ۜ";
                    i4 = Math.round(((float) Color.green(i2)) * f2);
                    break;
            }
        }
    }

    public static String dbsf(String str, int i2) {
        String str2 = "ۤ۬ۛۤۨۛۦۦ۫ۜۙۦۙۧۙۚۨۢۙۖۘۢۘۦۘ";
        while (true) {
            switch (str2.hashCode() ^ 355003568) {
                case -2131297386:
                    try {
                        return dbsf(new String(Base64.decode(str, 2), StandardCharsets.UTF_8), i2 - 1);
                    } catch (Exception e2) {
                        return "yousef";
                    }
                case -210202646:
                    str2 = "ۗ۠ۤ۬ۨۨ۫ۗۦۘۡۧۘ۠۬ۥۢۤۥ";
                    break;
                case 978319112:
                    if (i2 != 0) {
                        str2 = "ۖۙۡۖۖۥۘۨۨۢۗۖۥ۫ۢۜۘۗۗۦۘۢۙۛ۬۠ۗۚۦ۫";
                        break;
                    } else {
                        str2 = "ۢۛ۫ۡۢۢ۬ۛ۠ۖۧۥۘ۬۫ۥ۬ۦۚۡۨۥۘ";
                        break;
                    }
                case 1747436285:
                    return str;
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0048 A[FALL_THROUGH, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean deleteFolder(java.io.File r8) {
        /*
            r1 = 0
            java.io.File[] r4 = r8.listFiles()     // Catch:{ Exception -> 0x009c }
            r2 = -1134664974(0xffffffffbc5e62f2, float:-0.013573395)
            java.lang.String r0 = "۠ۨۡۨۚ۬ۚۤ۬ۜ۟ۜۡۗۖۗ۫۫۬۬۠"
        L_0x000a:
            int r3 = r0.hashCode()     // Catch:{ Exception -> 0x009c }
            r3 = r3 ^ r2
            switch(r3) {
                case -586925923: goto L_0x001e;
                case -61821565: goto L_0x0019;
                case 1164589475: goto L_0x0048;
                case 1175055515: goto L_0x0013;
                default: goto L_0x0012;
            }
        L_0x0012:
            goto L_0x000a
        L_0x0013:
            java.lang.String r0 = "ۘۤۥۘۢۥۥۦۨۛۙۚ۬ۛ۫۫ۤۨۙ"
            goto L_0x000a
        L_0x0016:
            java.lang.String r0 = "ۜۡۨۘۢۡۦۙۛۖ۬ۤ۬۫ۧۘۘۤۨ۟ۛ۬ۥۘ"
            goto L_0x000a
        L_0x0019:
            if (r4 == 0) goto L_0x0016
            java.lang.String r0 = "ۜۨۘۧ۫ۚۨۦۤۥۙ۠ۗۗۖۖۦ۟"
            goto L_0x000a
        L_0x001e:
            r2 = -1375585023(0xffffffffae023d01, float:-2.961276E-11)
            java.lang.String r0 = "۟ۦۘۖۜۡۥۗۗ۠۫ۘۥۘۢۧۘۖۤۘۘۤ۬ۙ"
        L_0x0023:
            int r3 = r0.hashCode()     // Catch:{ Exception -> 0x009c }
            r3 = r3 ^ r2
            switch(r3) {
                case -2094781372: goto L_0x0038;
                case 489233396: goto L_0x002c;
                case 900841871: goto L_0x0048;
                case 1078795741: goto L_0x0035;
                default: goto L_0x002b;
            }     // Catch:{ Exception -> 0x009c }
        L_0x002b:
            goto L_0x0023
        L_0x002c:
            int r0 = r4.length     // Catch:{ Exception -> 0x009c }
            if (r0 <= 0) goto L_0x0032
            java.lang.String r0 = "ۡۨۗ۠ۨۡۘۨ۠۟ۡ۫ۛۘۛ"
            goto L_0x0023
        L_0x0032:
            java.lang.String r0 = "ۙۥۛۚۡۚۥۢۡۘۜ۫ۦۘ۟ۧۚۚۚ۟ۢۤۖ"
            goto L_0x0023
        L_0x0035:
            java.lang.String r0 = "۟ۜۚۢۦۚۛۤۘۨۨۥ۟ۡۖ"
            goto L_0x0023
        L_0x0038:
            int r5 = r4.length     // Catch:{ Exception -> 0x009c }
            r0 = r1
        L_0x003a:
            r3 = 665423618(0x27a98f02, float:4.7061972E-15)
            java.lang.String r2 = "ۘۨۤۥۙۜۘ۟۬ۢۡۨۖۘۘۜ۠ۡۘۨۘ۠ۚ۠"
        L_0x003f:
            int r6 = r2.hashCode()
            r6 = r6 ^ r3
            switch(r6) {
                case -2075910363: goto L_0x0048;
                case -1139477505: goto L_0x0050;
                case -146650891: goto L_0x0058;
                case 394199841: goto L_0x0055;
                default: goto L_0x0047;
            }
        L_0x0047:
            goto L_0x003f
        L_0x0048:
            boolean r1 = r8.delete()     // Catch:{ Exception -> 0x009c }
        L_0x004c:
            return r1
        L_0x004d:
            java.lang.String r2 = "ۚۧۥۙۖۖۦۦۤۨۘۚۜۚ۬"
            goto L_0x003f
        L_0x0050:
            if (r0 >= r5) goto L_0x004d
            java.lang.String r2 = "ۚۨۨۧ۫ۧ۬ۘۜۘۚۗۡۘۖۗۨۘۘ۟۠"
            goto L_0x003f
        L_0x0055:
            java.lang.String r2 = "۟۠ۘۗۤۦۘۘ۠ۛۨۜۤۧۗۧۖۗۘ۠ۤ"
            goto L_0x003f
        L_0x0058:
            r3 = r4[r0]
            r6 = -1056336245(0xffffffffc109968b, float:-8.599254)
            java.lang.String r2 = "ۚۥۨۘۥۙۨۘۢ۫ۡۘۖ۠ۘۘۖۤۧۚۡۘ۫ۨۦۦۛۖۘ"
        L_0x005f:
            int r7 = r2.hashCode()     // Catch:{ Exception -> 0x009c }
            r7 = r7 ^ r6
            switch(r7) {
                case -1091415812: goto L_0x008c;
                case -900966466: goto L_0x0068;
                case 803672340: goto L_0x0080;
                case 927339998: goto L_0x0089;
                default: goto L_0x0067;
            }     // Catch:{ Exception -> 0x009c }
        L_0x0067:
            goto L_0x005f
        L_0x0068:
            boolean r2 = r3.delete()     // Catch:{ Exception -> 0x009c }
        L_0x006c:
            r6 = -38169486(0xfffffffffdb99472, float:-3.0834744E37)
            java.lang.String r3 = "ۦۧ۠ۚۘۧۤۧۛ۠ۙۜۢۦۢۙۦۖۘۨۢۡۘۡۖۧ"
        L_0x0071:
            int r7 = r3.hashCode()
            r7 = r7 ^ r6
            switch(r7) {
                case -2046803132: goto L_0x0099;
                case -972114347: goto L_0x007a;
                case -216602917: goto L_0x0094;
                case -42498949: goto L_0x004c;
                default: goto L_0x0079;
            }
        L_0x0079:
            goto L_0x0071
        L_0x007a:
            int r0 = r0 + 1
            goto L_0x003a
        L_0x007d:
            java.lang.String r2 = "ۖۦۙ۟ۗۤ۟ۖۦۘۖۥ۟ۥۚۜۦۛۚۤۗ"
            goto L_0x005f
        L_0x0080:
            boolean r2 = r3.isDirectory()     // Catch:{ Exception -> 0x009c }
            if (r2 == 0) goto L_0x007d
            java.lang.String r2 = "ۨۢۤۥۥۥۘ۟ۤ۫ۛۦۘۦ۟ۨۘۡۢۨ۠۠ۜۘۦۜۡ"
            goto L_0x005f
        L_0x0089:
            java.lang.String r2 = "۟۟ۡ۫ۥۜۘۙ۬ۖۘ۬ۘۨۧۨ۫۬ۖۖۘۙۜ۠"
            goto L_0x005f
        L_0x008c:
            boolean r2 = deleteFolder(r3)     // Catch:{ Exception -> 0x009c }
            goto L_0x006c
        L_0x0091:
            java.lang.String r3 = "ۨۨۗۙۢۘ۬۬ۡۘۚۡ۫ۥۦ۬ۘ۫۬ۖۖۥۘ۫ۦۘ"
            goto L_0x0071
        L_0x0094:
            if (r2 != 0) goto L_0x0091
            java.lang.String r3 = "ۥ۫ۥۘ۟۟ۨ۬ۗۢۖۙ۬۟ۙۗۙ۟ۦۚ"
            goto L_0x0071
        L_0x0099:
            java.lang.String r3 = "ۛۢ۠ۚ۠ۡۘۧۛۥۜۙۢۧۛۘۜ۫ۘۘ"
            goto L_0x0071
        L_0x009c:
            r0 = move-exception
            goto L_0x004c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.youbasha.task.utils.deleteFolder(java.io.File):boolean");
    }

    public static void deleteTheme(String str) {
        String str2 = "۟ۢۜ۠ۖۜۦۥۘۨۜۖۤۢۡۘ۟ۗۨ۠ۤۤ";
        File file = null;
        StringBuilder sb = null;
        File file2 = null;
        StringBuilder sb2 = null;
        File file3 = null;
        StringBuilder sb3 = null;
        while (true) {
            switch ((str2.hashCode() ^ 829) ^ -919358968) {
                case -2123280060:
                    String str3 = "ۙ۟ۨۘۚۡۘۘۚۥۥۘۛ۬ۦۘ۟ۧۚ";
                    while (true) {
                        switch (str3.hashCode() ^ 2006399692) {
                            case -611805367:
                                str2 = "ۥۨۢۛۗ۫ۥۜۘ۠ۘۥۘۡۚۥۘۜۛۖۦۧۖ۟ۥۘ۬ۦۘ";
                                continue;
                            case -133279665:
                                str2 = "ۨۙۜۢۗۧۢۘۖ۬۠۟ۚۘۥۚۚۦ";
                                continue;
                            case -114827048:
                                if (!file2.exists()) {
                                    str3 = "ۡۛۧۚۦۗۨۡ۠۫ۖۘۘۨۜ۫";
                                    break;
                                } else {
                                    str3 = "۟ۘۦۜۨۖۘۗۥۤۨۛ۟";
                                    break;
                                }
                            case 49710941:
                                str3 = "۫ۧۥۥۦۤۙۗۥۘ۟۠ۘۢۙۥۘ۫۬ۜ";
                                break;
                        }
                    }
                    break;
                case -2067641825:
                    file.delete();
                    str2 = "ۥ۬ۨۘ۟ۙۗۢۧۥۘۖۥۜۨۨۦۘ";
                    break;
                case -1983769942:
                    String str4 = "ۙۚۚۦۥۙۦۘۤۦۥۡۘۛۖۖۦۢۡۘۤۧۚ";
                    while (true) {
                        switch (str4.hashCode() ^ -998653943) {
                            case -1562643433:
                                str2 = "ۗۢۚۘ۬ۦۘۢ۠ۛۚۙۜۘۖ۟ۡ";
                                continue;
                            case -390811380:
                                str2 = "ۥۘۖۥۛۡۘ۫۬ۧۡۖۗ۬۟ۥۙۤۨ";
                                continue;
                            case -61381127:
                                if (!file3.exists()) {
                                    str4 = "ۡۜۘۢۜۜۘ۬ۡۨۨۙۡۘۙ۫ۜۘۘۥۗ۟۫۫ۤۥۖۘ۫۟۠";
                                    break;
                                } else {
                                    str4 = "ۧ۟ۥۦۗۚۧۛۥۘۚ۟ۖ۫ۡۘ";
                                    break;
                                }
                            case 1840825021:
                                str4 = "ۚ۬ۧۦۘۘۘۗۢۦ۠ۖۖۘ۫ۢۖۘ";
                                break;
                        }
                    }
                    break;
                case -1649471641:
                    file2.delete();
                    str2 = "ۨۙۜۢۗۧۢۘۖ۬۠۟ۚۘۥۚۚۦ";
                    break;
                case -759112576:
                    str2 = "۬ۥ۟ۥۛۨ۬۠ۡ۠۠ۜۘۢ۬ۦۘ۠۫ۖ۠ۧۨ۟ۜۥۘۛۜۜ";
                    sb2 = new StringBuilder();
                    break;
                case -713473292:
                    return;
                case -541380069:
                    sb.append("_w.jpg");
                    str2 = "ۛۚۛۛۜۦۖۨۦۥۗۥۘ۬ۢۘۘ";
                    break;
                case -393943368:
                    sb3.append(str);
                    str2 = "ۘ۠ۙۘۢ۬ۨۘۡۢ۟ۗ۫ۤ۬ۨۢۦۡۢۡۘۢۚ۬";
                    break;
                case -297947782:
                    str2 = "ۨۚۥۘۧۦ۬۟ۢۜ۠ۢ۠ۜۜۦۘ";
                    file3 = new File(sb3.toString());
                    break;
                case -29769316:
                    sb3.append("_homeW.jpg");
                    str2 = "ۧ۟۬ۗۗ۠ۦۚۥۘۥۚۜ۠ۤۖۖۘ۠ۜۥۘ";
                    break;
                case 224263521:
                    sb.append(str);
                    str2 = "۠ۘۥۘۥۦۡۜۖۖ۠ۗۙۙۖۖۤۢۢۡۥۘۤ۠ۖۖۘ";
                    break;
                case 462445276:
                    sb2.append(".xml");
                    str2 = "۬۠ۚۥ۫ۨۗۥۚۤۤۘۡۧۘ۬ۚۦۨۡۘ";
                    break;
                case 968294660:
                    str2 = "ۛۢۨۘۤۘۛۨۦۖۘۡۚۜۘۜۦۘ۟ۧۥۘۜۛۖۘۥۘۥۖۚۘۘ";
                    file2 = new File(sb2.toString());
                    break;
                case 977045090:
                    file3.delete();
                    str2 = "ۗۢۚۘ۬ۦۘۢ۠ۛۚۙۜۘۖ۟ۡ";
                    break;
                case 1041103923:
                    file = new File(sb.toString());
                    str2 = "ۜۘ۟ۘۦ۠۠ۗۘۗۨۘۧۘۢۦ";
                    break;
                case 1267585554:
                    str2 = "ۙۗۤۛۦۘۗۚۛۚ۬ۗ۫ۧ۟ۛۤۦۘۗۧۧ";
                    sb3 = new StringBuilder();
                    break;
                case 1528444910:
                    str2 = "ۥ۟ۥۘۢۙۘۘۤ۬ۖۖۖۘۤۛۖۘ";
                    break;
                case 1903289033:
                    sb2.append(str);
                    str2 = "۬ۘۦۨۦۢۡۦ۬ۦۛۡۘۖۡۚۚۨۜۘۜۛۘ";
                    break;
                case 1915756223:
                    String str5 = "ۜۛۙ۠۠۟ۦ۫ۤۦۧۧ۫ۛ۠";
                    while (true) {
                        switch (str5.hashCode() ^ 525316259) {
                            case -1007799443:
                                str2 = "ۥ۬ۨۘ۟ۙۗۢۧۥۘۖۥۜۨۨۦۘ";
                                continue;
                            case 704675815:
                                if (!file.exists()) {
                                    str5 = "ۧۜۖۘۡ۬ۚ۬ۙۨۘ۟۬۠ۛۦۜۖ۫ۥۧۨۨۘ";
                                    break;
                                } else {
                                    str5 = "ۤۥۥۘۘۚۨۚۦۚۜۥۛۙ۟ۖۤۖۖۘۢۗۘ";
                                    break;
                                }
                            case 822548150:
                                str5 = "ۧۤۤۚۘ۟ۖۛۨۦ۫۬۟ۤۥۘۥۖۡۘ۫ۡۡۗۘۥۛۦۢ";
                                break;
                            case 1555398339:
                                str2 = "ۢۘۢۥۛۧۚۧ۠ۦۘۗۙۨۨۘۥۡ۟ۤۤۧۖۨ۫ۜۗۤ";
                                continue;
                        }
                    }
                    break;
                case 1929601316:
                    str2 = "ۨۖۖۘۦۖۦۜۢۤۧۤۜۘۜۖۧۡۤۢۘۡ۟ۢۗۜ";
                    sb = new StringBuilder();
                    break;
            }
        }
    }

    public static int dimenInDP(int i2) {
        String str = "ۘ۟ۨۙۙۗۙۛۡۘۚۘۥۚۧۜ۫ۨۘۘ۫ۦ۬ۢۘۦۖۨۚ";
        while (true) {
            switch ((str.hashCode() ^ 818) ^ -982912947) {
                case -1681621598:
                    return (int) TypedValue.applyDimension(1, (float) i2, f1110a.getDisplayMetrics());
                case -1417481634:
                    f1110a = yo.getCtx().getResources();
                    str = "ۤۡۥۘۖۛۦۗۜۥۙۗۜۘۗۘ۬ۗۛۡۘ";
                    break;
                case -574509878:
                    str = "ۡۜۖۗۙ۟ۜۤۜ۠ۧۦۘۥۗۥۘ۠۬۫ۡۜۦۤۚۘ";
                    break;
                case 34057017:
                    String str2 = "ۘ۬ۥۘۙ۬۟۠ۛۖ۟۠ۖۘ۬ۨ۠ۛۢۜۡۚۡۘۢ۫۫";
                    while (true) {
                        switch (str2.hashCode() ^ 1152531369) {
                            case -1051698367:
                                if (f1110a != null) {
                                    str2 = "ۤۨۦۘۘۢۨۡۤۢۤۛۢۤۛۧۧ۟ۦۘۤۖۧۘ۠۟ۥۘۚۤۖۘ";
                                    break;
                                } else {
                                    str2 = "ۢۤ۟ۖۖۘۘ۠ۤۚۛۦۡۛۢۗۙ۬ۧۘ۟ۦۘۥ۫ۚ";
                                    break;
                                }
                            case 729689646:
                                str = "ۤۡۥۘۖۛۦۗۜۥۙۗۜۘۗۘ۬ۗۛۡۘ";
                                continue;
                            case 1842520243:
                                str2 = "۫۠ۤ۟۬ۚۤۚۡۘۙۜ۬۠ۙۡۘۥۨ۫";
                                break;
                            case 1885825395:
                                str = "ۨۧۜۘۡ۠ۦۘۡ۟ۖۘۨ۫۠ۛۢۦۤ۟ۖۘۦۜ";
                                continue;
                        }
                    }
                    break;
            }
        }
    }

    public static int dpToPx(float f2) {
        String str = "ۖۙۦۘۢۚۘۨۙۡ۫ۜ۬ۚۢۜۥۙۜۘ";
        while (true) {
            switch ((str.hashCode() ^ 877) ^ -1285870128) {
                case -1613580585:
                    f1110a = yo.getCtx().getResources();
                    str = "ۘۤ۫ۤۙۛۘۜۖۘۙۥۨۘۥۜ۟ۧۢۛ۠ۨۤۚ۠۠ۚۦۥۘ";
                    break;
                case -958632573:
                    return Math.round(f1110a.getDisplayMetrics().density * f2);
                case -99919934:
                    String str2 = "ۛۗۖۨۦۗ۬۬ۖۘۘۚۗ۬۟ۖۤۙۢۧۨۥۘۢ۠۟ۚۦۘ";
                    while (true) {
                        switch (str2.hashCode() ^ -1165731295) {
                            case -1975712240:
                                str = "ۥۙۦۘۖۡ۟ۤۦۡۖۧۘۨ۫ۛۛۥۜۨۥۗ";
                                continue;
                            case -937679905:
                                str2 = "۟ۧۖۘۨۨۜۘ۫ۧۢۖۢۚۡۦ۟ۢۦۛ۟ۛۡۤ۬ۙ۬ۜۘ";
                                break;
                            case 1480669052:
                                str = "ۘۤ۫ۤۙۛۘۜۖۘۙۥۨۘۥۜ۟ۧۢۛ۠ۨۤۚ۠۠ۚۦۥۘ";
                                continue;
                            case 1573327964:
                                if (f1110a != null) {
                                    str2 = "ۥۚۥۘۨۚۖۘۛۛۦۜۨۙۙ۬ۢۦۛۥۡۨۨ";
                                    break;
                                } else {
                                    str2 = "ۢۨ۫ۛۖۢۗۛۦۙۖۨۘ۫ۖۧۘۧۘۘ";
                                    break;
                                }
                        }
                    }
                    break;
                case 948485651:
                    str = "ۖۦۘ۫ۙ۠۬ۛۖ۫ۥۖۘۜۚ۠ۨۦۦ۬ۚۦۘ";
                    break;
            }
        }
    }

    public static void e(File file) {
        String str;
        String str2 = "ۚ۠ۨۘ۬ۦۘۘۡ۫ۥۘۙۙۦۤۙۨۘۗۤۙۤ۬ۙۡۛۘۘ";
        while (true) {
            try {
                switch (str2.hashCode() ^ 86903607) {
                    case -1602077135:
                        str = "light";
                        break;
                    case -1234384336:
                        str2 = "ۨۥۘۡۤۡۘۛ۬ۦۘ۬۟ۙۤۙۘۨۥۧۘۡ۟ۨ";
                        continue;
                    case -1204023696:
                        str = "dark";
                        break;
                    case 2047352842:
                        if (yo.isNightModeActive()) {
                            str2 = "۟ۧۨۘۗۡۗۥۢۗۘۧۥۘۗ۠ۡۘ";
                            break;
                        } else {
                            str2 = "ۤۧ۬ۨۖ۠ۥۖ۫ۖ۠ۗۗۦۙۡۘۘۤ۟ۘۛۡ۬ۘۜۦ";
                            continue;
                        }
                    default:
                        continue;
                }
            } catch (Exception e2) {
                e2.printStackTrace();
                return;
            }
        }
        SQLiteDatabase writableDatabase = yo.GetwaSettingsDB().getWritableDatabase();
        writableDatabase.beginTransaction();
        writableDatabase.execSQL("UPDATE settings SET wallpaper_" + str + "_type = 'USER_PROVIDED', wallpaper_" + str + "_value = ? WHERE jid = 'individual_chat_defaults'", new String[]{String.valueOf(Uri.fromFile(file))});
        writableDatabase.setTransactionSuccessful();
        writableDatabase.endTransaction();
    }

    public static void forceScanMediaFile(File file) {
        Intent intent = null;
        String str = "ۜۡۚۦۦۜۚۘۗ۬ۙۘۘۡ۟ۥۘ۬ۦۢۜۨۙ";
        while (true) {
            switch ((str.hashCode() ^ 907) ^ 1414994469) {
                case -2062824973:
                    String str2 = "۠ۜۨۛۗۦۙۦۡۘ۠ۡۦۘۦۧۗۜۡۜۙۛۘۜۗۙ۬۬ۖ";
                    while (true) {
                        switch (str2.hashCode() ^ -1384503267) {
                            case -875698481:
                                str2 = "۠ۦۖ۬ۖ۠ۨۧۛۙۛۘۘۚۧۚۤ۠ۢ۫ۚۢ";
                                break;
                            case -667399088:
                                str = "ۥۜۡۢۘۡۘۡۖۦۘۗۡۨ۫۫ۘۘۤ۫ۥ";
                                continue;
                            case 394134053:
                                if (file == null) {
                                    str2 = "ۚۖۥۗۡۗ۬۠ۘۜۤۛ۟ۤۘۜۜۡۜۨ";
                                    break;
                                } else {
                                    str2 = "۟ۦۗۤ۟ۖۘۗۗۡۨۧۦۜۧۚۦ۟ۦۧ۠ۜ";
                                    break;
                                }
                            case 2016906463:
                                str = "ۜ۬ۛۥۜ۬ۗۢۥۢۙۚ۬ۡۖۘ";
                                continue;
                        }
                    }
                    break;
                case -1433778798:
                    yo.getCtx().sendBroadcast(intent);
                    str = "ۥۜۡۢۘۡۘۡۖۦۘۗۡۨ۫۫ۘۘۤ۫ۥ";
                    break;
                case -960383653:
                    str = "ۨ۬ۘۘۡۙ۬ۗۖۘۥۚۡۤ۫ۖ۠ۜۢ۬ۜ۟۟ۜۘۤۗۖ";
                    break;
                case -464141072:
                    return;
                case 1778552388:
                    intent = new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE", Uri.fromFile(file));
                    str = "۟ۚۘۘۛۢ۬ۢۧۗۦۙۜۘ۬ۧۖ۠ۜۥۘۤۡ۬";
                    break;
            }
        }
    }

    public static String getDateTimeFromMillis(long j2) {
        String str = "ۤۧۦۤۙۡ۠ۙۜۘۘۡۡۖ۟ۘۘ";
        while (true) {
            switch ((str.hashCode() ^ 788) ^ 1565355629) {
                case -408388646:
                    str = "ۤ۟ۨۘۡۧۜۘۛۧۨۘۦۗۤۜۧ۟ۖ۬ۥ";
                    break;
                case 339287772:
                    return new SimpleDateFormat("yyyy/MM/dd h:mm a", Locale.ENGLISH).format(new Date(j2));
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x004f, code lost:
        r2 = "ۛۘ۠ۘۚۚۗۘۥۖ۬ۡۘۛۡۡۘۧ۫ۨ۫ۗۢ۫";
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static long getFolderSize(java.io.File r27) {
        /*
            r21 = 0
            r16 = 0
            r20 = 0
            r19 = 0
            r18 = 0
            r22 = 0
            r12 = 0
            r10 = 0
            r6 = 0
            r8 = 0
            r4 = 0
            r3 = 0
            r14 = 0
            r13 = 0
            java.lang.String r2 = "۟ۦۚۖۨۥۘ۟۟۫ۦۜ۬ۗۛۥۘۛۚۢۥۨۘۜۦۤ"
        L_0x001b:
            int r24 = r2.hashCode()
            r25 = 373(0x175, float:5.23E-43)
            r26 = -264943148(0xfffffffff03549d4, float:-2.2442416E29)
            r24 = r24 ^ r25
            r24 = r24 ^ r26
            switch(r24) {
                case -2102427616: goto L_0x00fa;
                case -2041303182: goto L_0x00d7;
                case -1984984430: goto L_0x0074;
                case -1833125157: goto L_0x0079;
                case -1731875996: goto L_0x0103;
                case -1700506053: goto L_0x00a3;
                case -1119743949: goto L_0x00cf;
                case -1070477649: goto L_0x002c;
                case -1046057593: goto L_0x0083;
                case -905966082: goto L_0x006f;
                case -811540349: goto L_0x0036;
                case -622798055: goto L_0x0067;
                case -590725229: goto L_0x00dc;
                case -534821471: goto L_0x00e9;
                case 311809498: goto L_0x00f5;
                case 512407805: goto L_0x00e4;
                case 564139138: goto L_0x0060;
                case 903969833: goto L_0x003b;
                case 1214879105: goto L_0x0107;
                case 1347483607: goto L_0x002f;
                case 1516817603: goto L_0x0040;
                case 1597983009: goto L_0x007e;
                case 1892967405: goto L_0x00ef;
                case 1977071971: goto L_0x00ff;
                case 2137343486: goto L_0x00a9;
                default: goto L_0x002b;
            }
        L_0x002b:
            goto L_0x001b
        L_0x002c:
            java.lang.String r2 = "ۜۗۚۡۜۗۛۘۨۘۙ۫ۨۘۧۗۖۘۨۜۘۘۗ۟ۜۨ۠ۜۘ"
            goto L_0x001b
        L_0x002f:
            boolean r21 = r27.exists()
            java.lang.String r2 = "۬۠ۚۨۘۡۢۧۡۘۜ۟۟ۤۧۚ"
            goto L_0x001b
        L_0x0036:
            r16 = 0
            java.lang.String r2 = "ۚۧۨۘۦ۫ۡۜۙ۬۠ۧۡۘۨۗ۠ۖ۟ۙۖ۠۟"
            goto L_0x001b
        L_0x003b:
            java.lang.String r2 = "ۨۚۢ۬۠ۚ۫ۘۛ۠ۤۘۘۜۦۡۜ۠۠۬ۜۧۘ"
            r22 = r16
            goto L_0x001b
        L_0x0040:
            r24 = 659086185(0x2748db69, float:2.7874518E-15)
            java.lang.String r2 = "ۛ۠ۧۢۢۤۡ۠ۥۘ۫ۤ۬ۢۡ۬ۥۗ۬ۢۥۦۨۙۛۜۘ"
        L_0x0045:
            int r25 = r2.hashCode()
            r25 = r25 ^ r24
            switch(r25) {
                case -1309232260: goto L_0x005d;
                case -378957276: goto L_0x005a;
                case 638555110: goto L_0x0055;
                case 1783650713: goto L_0x004f;
                default: goto L_0x004e;
            }
        L_0x004e:
            goto L_0x0045
        L_0x004f:
            java.lang.String r2 = "ۛۘ۠ۘۚۚۗۘۥۖ۬ۡۘۛۡۡۘۧ۫ۨ۫ۗۢ۫"
            goto L_0x001b
        L_0x0052:
            java.lang.String r2 = "ۥ۠ۦۘۚۖۖۨۤۡ۟ۘۦۘ۫۟ۡۘۚۛ۟"
            goto L_0x0045
        L_0x0055:
            if (r21 == 0) goto L_0x0052
            java.lang.String r2 = "ۦ۫ۧۘۖۜۘ۬ۖ۟ۨۛۘۦۗ۠ۥ۠ۖۢۗ"
            goto L_0x0045
        L_0x005a:
            java.lang.String r2 = "ۗۥۗۘ۬ۜۢۧۤۗ۬۟ۖۜۦۘۙ۟ۛۢۤ"
            goto L_0x0045
        L_0x005d:
            java.lang.String r2 = "ۛۙۙۧۖۙۧۧ۟ۧۚ۬ۤۤۦۨۤۜ"
            goto L_0x001b
        L_0x0060:
            java.io.File[] r20 = r27.listFiles()
            java.lang.String r2 = "ۚۤ۫ۛۗۙ۠ۦۚ۬ۦۧۘۜۖ۫ۛۖۡ"
            goto L_0x001b
        L_0x0067:
            r0 = r20
            int r0 = r0.length
            r19 = r0
            java.lang.String r2 = "ۢۖۡۘۗۜۜ۠ۡۥۥ۬ۢۢ۟۟"
            goto L_0x001b
        L_0x006f:
            r18 = 0
            java.lang.String r2 = "ۘ۟۠ۙۛ۠ۖۘۨۘۚۨۜ۫ۨۙۗۘۧۚ۬ۘۘ"
            goto L_0x001b
        L_0x0074:
            java.lang.String r2 = "ۘۛۘۘۚۤۦۘ۠ۜۧۘۥۡۨۘۘۦ۠"
            r13 = r18
            goto L_0x001b
        L_0x0079:
            java.lang.String r2 = "ۛۖۘ۫ۘ۬ۗۨۘۘۦۜۘۨۘ۟"
            r14 = r16
            goto L_0x001b
        L_0x007e:
            java.lang.String r2 = "ۦۚۢۙ۟ۡۜۛ۫۟ۛۘۡۗۡۘۚۢۘ"
            r22 = r14
            goto L_0x001b
        L_0x0083:
            r24 = 1791355970(0x6ac5ec42, float:1.1963704E26)
            java.lang.String r2 = "۠ۘۨۚۥ۬ۘۚ۬۠ۜۜۙۢ۠ۦۖۡۘۘ۫ۜۘۨ۫ۜۘۛۛ۟"
        L_0x0088:
            int r25 = r2.hashCode()
            r25 = r25 ^ r24
            switch(r25) {
                case -652104363: goto L_0x009c;
                case 850618003: goto L_0x009f;
                case 1750862872: goto L_0x0092;
                case 1778055589: goto L_0x004f;
                default: goto L_0x0091;
            }
        L_0x0091:
            goto L_0x0088
        L_0x0092:
            r0 = r19
            if (r13 >= r0) goto L_0x0099
            java.lang.String r2 = "ۙۘ۫ۤۨۚۨۙۜۘ۫۠۠ۘۤۡۛۖ۬ۥ۬"
            goto L_0x0088
        L_0x0099:
            java.lang.String r2 = "ۜۖۦۘۜۨۤ۫۬ۛ۫ۙۖ۠ۢۗ۫ۧۥۢۤۨۖۛۖۘۖۨۘ"
            goto L_0x0088
        L_0x009c:
            java.lang.String r2 = "ۦۘۤۛ۬۫ۥۛۤۡۖ۫۫۟ۥ۬ۚۨۘ۬ۡۧۗ۬ۙ"
            goto L_0x0088
        L_0x009f:
            java.lang.String r2 = "ۗۛۘۖۨ۫ۧۜۨۘ۬ۚۨۘ۠۠ۛۢۘۧۘ"
            goto L_0x001b
        L_0x00a3:
            r12 = r20[r13]
            java.lang.String r2 = "ۜ۬ۜۘۢ۟ۧۚۨۦۘ۟ۛ۫۫ۡۧۘۡۨۜۘۖۤۨ"
            goto L_0x001b
        L_0x00a9:
            r24 = -1535250789(0xffffffffa47dee9b, float:-5.5062737E-17)
            java.lang.String r2 = "ۜۚ۟ۨ۬ۖۚۧۦۘۙ۬ۛۡ۟ۘۥۧۖۚۛۚۤۦۡۘۨۤۡۘ"
        L_0x00ae:
            int r25 = r2.hashCode()
            r25 = r25 ^ r24
            switch(r25) {
                case -869673233: goto L_0x00cb;
                case -404773417: goto L_0x00b8;
                case -134692952: goto L_0x00bf;
                case 723594591: goto L_0x00c8;
                default: goto L_0x00b7;
            }
        L_0x00b7:
            goto L_0x00ae
        L_0x00b8:
            java.lang.String r2 = "ۧۜۖۘۥۛۜۨۛ۬۠ۛ۠ۦۢۗ۠ۙۥۗۚۡ"
            goto L_0x001b
        L_0x00bc:
            java.lang.String r2 = "ۤ۫ۘۘ۠۬ۥۘۗ۫ۗۡۛۗ۫۬ۦۘۨۘۧۜۘ۬"
            goto L_0x00ae
        L_0x00bf:
            boolean r2 = r12.isDirectory()
            if (r2 == 0) goto L_0x00bc
            java.lang.String r2 = "۫۫ۡۘۤ۫ۨۨۗۧۦۜۧۘۜۡۛۙ۠۬۫۫"
            goto L_0x00ae
        L_0x00c8:
            java.lang.String r2 = "ۘۦۦۘۛۢۥۘۢۤۨۘۘۨۦۖۜۤ"
            goto L_0x00ae
        L_0x00cb:
            java.lang.String r2 = "ۦۛۦۖۖۨۜ۬ۘۘۡۚۡۘۧ۠ۘۘۦۨۘۘ"
            goto L_0x001b
        L_0x00cf:
            long r10 = getFolderSize(r12)
            java.lang.String r2 = "ۨۘۨۘۘۡۖۘۥ۟۟۬ۘۨ۫ۚۖۘ"
            goto L_0x001b
        L_0x00d7:
            java.lang.String r2 = "ۢۜۨۙۤۛۢۗۨۘۤۛ۟ۜۖۥۗ۫ۧۢۜۖۘ"
            r8 = r10
            goto L_0x001b
        L_0x00dc:
            long r6 = r12.length()
            java.lang.String r2 = "ۜۖۖۘۘۖۘ۫ۚۘۘۤۜۨۘۘ۫ۖۘۗۦۖۡۨ۠"
            goto L_0x001b
        L_0x00e4:
            java.lang.String r2 = "ۜۡ۫ۚۖۤۜۗۦۧ۬ۜۘۤ۫ۘۘۖۗۘۘۗۜۦۘۧۢۜۘ"
            r8 = r6
            goto L_0x001b
        L_0x00e9:
            long r4 = r8 + r14
            java.lang.String r2 = "۠ۖۨۘۨۗۥ۬ۙ۠ۘۛۖ۠۟ۧۘ۟ۦۧۡ۫۬۬ۖۘ"
            goto L_0x001b
        L_0x00ef:
            int r3 = r13 + 1
            java.lang.String r2 = "ۖۚۖ۟۬۠ۙۛۡۘۥۢۛۥۨۘۢۛۚۛۥۙۦ۠ۖۘ"
            goto L_0x001b
        L_0x00f5:
            java.lang.String r2 = "ۨۨۢ۬ۨۡۘۧۛ۠ۧۘۦۘۙ۫ۥۘۘۚۖ۬ۡۡۘ"
            r14 = r4
            goto L_0x001b
        L_0x00fa:
            java.lang.String r2 = "ۨۡۧۢۦۥۛۡۚۤ۠۟ۚۗۡ"
            r13 = r3
            goto L_0x001b
        L_0x00ff:
            java.lang.String r2 = "ۛۖۘ۫ۘ۬ۗۨۘۘۦۜۘۨۘ۟"
            goto L_0x001b
        L_0x0103:
            java.lang.String r2 = "ۜۡ۫ۚۖۤۜۗۦۧ۬ۜۘۤ۫ۘۘۖۗۘۘۗۜۦۘۧۢۜۘ"
            goto L_0x001b
        L_0x0107:
            return r22
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.youbasha.task.utils.getFolderSize(java.io.File):long");
    }

    public static File getShpPrivXML() {
        StringBuilder sb = null;
        String str = "ۦۖۧۜۘۨۘۨۦۘۧ۟ۚۦۗۗۗۘ";
        while (true) {
            switch ((str.hashCode() ^ 805) ^ 1894843735) {
                case -1326784423:
                    sb.append("shared_prefs/");
                    str = "ۚۖ۠ۦۘۘۤۛۨۘۗۖۦۘ۠ۦۖۖ۟ۦۢۗ";
                    break;
                case 19478228:
                    sb.append(yo.datafolder);
                    str = "ۙۖ۠ۖۜۨۦ۫ۡۧ۟ۛۚۨۨۘۗۥۨۘۥ۠ۨ";
                    break;
                case 383864110:
                    return new File(a.f(sb, shp.privprefsname, ".xml"));
                case 1591837966:
                    sb = new StringBuilder();
                    str = "۟۫ۥۘ۠ۧۘ۬ۗۖۨ۫ۗۥۛ۬۠ۨۘۢ۬ۘۧ۫ۥۨۜۢ";
                    break;
            }
        }
    }

    public static File getShpXML() {
        String str = "ۜۦۛۥۖۚۗۡۜۙۢۦۦۚۘۖۦ";
        File file = null;
        StringBuilder sb = null;
        String str2 = null;
        while (true) {
            switch ((str.hashCode() ^ 482) ^ 224391067) {
                case -1744660624:
                    sb.append(File.separator);
                    str = "ۨۘۙ۟ۖۦۘۖۦ۫ۦۖۡ۠ۘ۟ۥۚۖۘۛۚۦۘ۬ۚ۠";
                    break;
                case -1455032021:
                    file = new File(sb.toString());
                    str = "۠ۢۚۗۨۧۨۘۨۘ۬۟ۙۗ۫۫ۥۥۢ";
                    break;
                case -850999251:
                    sb.append("shared_prefs");
                    str = "ۚۤۥۨۗۡۘۧۧۛۡۜۜۤۘۛ۠ۙۘۤۡۥ";
                    break;
                case -844764270:
                    sb.append(str2);
                    str = "ۦ۟ۙۙۦۘۧۜۘۘۙۨۧۘۗۤ۬۠ۜۖۛۢۦۗۖۘ";
                    break;
                case -44859973:
                    str = "ۖ۬ۦ۠ۛۤ۬ۗۨۘۤۦ۫۫۬ۚ";
                    sb = new StringBuilder();
                    break;
                case 415409906:
                    file.delete();
                    str = "ۗ۠ۨۚۗۤۢۥۧ۫ۚۜۤ۬ۖۧ۫ۦۗۧ۠۟ۙۗ۟ۙۡ";
                    break;
                case 765752172:
                    return file;
                case 980117917:
                    sb.append(yo.datafolder);
                    str = "۟۟ۦۘۘ۠ۦۘۡۢۨۘۥ۟۬ۤۗۧ۫ۗ۟";
                    break;
                case 1298064328:
                    str = "ۜۦۥۘۡ۟ۛۧۥۘۤ۫ۦۘۖ۬ۘۦۢۡۘ";
                    str2 = yo.pname;
                    break;
                case 1850651882:
                    String str3 = "ۨ۟ۧۘۢۨ۫ۡۡۥۘ۠ۖۥۨۘۖۦۢ۟ۗۜۘ";
                    while (true) {
                        switch (str3.hashCode() ^ 898149791) {
                            case -1980043978:
                                str = "ۧۗۨۘ۠ۖۙۜۚۥۘۛۦۘۢۦۘۘۗۗۜۤۖۜ";
                                continue;
                            case -1648911088:
                                str3 = "۫۬ۨۤۚۘۦۥ۠ۢۛۖ۟ۧۖۚۧۤۧۖۘ";
                                break;
                            case 1014268584:
                                if (!file.isDirectory()) {
                                    str3 = "ۚ۬ۦۖۢۧ۠۬ۧ۠ۘۡۢ۬۠ۗۖۘۘ";
                                    break;
                                } else {
                                    str3 = "ۗ۬ۗۧۥۙۖۜۙ۫ۡۜۨۦۖ۠ۥۡۘۡۨۘۘ";
                                    break;
                                }
                            case 1130372671:
                                str = "ۗ۠ۨۚۗۤۢۥۧ۫ۚۜۤ۬ۖۧ۫ۦۗۧ۠۟ۙۗ۟ۙۡ";
                                continue;
                        }
                    }
                    break;
                case 2097532652:
                    sb.append(".xml");
                    str = "ۥۙۤۛۙۨۜ۬۠۠۫ۖۘۖۚۦۘۙۖۢۤۘۖۖ۟ۥۘ";
                    break;
            }
        }
    }

    public static String getWAFolderPath() {
        String str = "ۢۧۖۘۚۖۥۘ۠ۤۡۤۥۤۜۦۧۘۗ۫ۨۘۛۧ۠";
        while (true) {
            switch ((str.hashCode() ^ 426) ^ 506556639) {
                case -1462965684:
                    String str2 = "ۨ۬ۥۘ۬۠ۙۧۘۖ۠ۤۛۤۚۤۘۘۖۜۦۛۖۡۥ";
                    while (true) {
                        switch (str2.hashCode() ^ -288632266) {
                            case -1564793666:
                                str = "ۗۨۙۧۙ۠ۨۖۛۥۖۦۘ۬ۨۜۤۧۡ۠ۚۦۘ";
                                continue;
                            case -1547898489:
                                if (Build.VERSION.SDK_INT > 29) {
                                    str2 = "ۥۡۢۧ۬ۡۘۖۗۜۢ۟ۗۨۧۡۛۛۜ۠ۗ۬ۨۦۨۘ";
                                    break;
                                } else {
                                    str2 = "ۥ۟ۚۚ۠ۨۢۧۚۢۖۘۢ۟ۜ";
                                    break;
                                }
                            case -574161064:
                                str2 = "ۖۦۖۘۗۖۤ۟ۧۥۚۙۤۖ۬ۗۢۡۥۗۦۡۗۡۦۘۤ۫ۨ";
                                break;
                            case 1149232517:
                                str = "۟ۨۜۘۙ۟ۘۥ۟ۖۘۥۚۗۘۜ۫ۘۧۘۧۚۥ";
                                continue;
                        }
                    }
                    break;
                case -762538558:
                    return f1111b;
                case 1416849345:
                    return f1112c;
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0030, code lost:
        r0 = "ۢۚ۫۫۠۫ۥۛۜۘۗۧ۬ۡۧۡۨ۬ۜۗۢۡۘ";
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean hasFingerprintRegistered() {
        /*
            r2 = 0
            r3 = 0
            java.lang.String r0 = "ۜ۬۬ۘۧۨۜۙۛۛۢۘۡۤۥ"
            r1 = r2
            r4 = r2
            r5 = r2
        L_0x0007:
            int r6 = r0.hashCode()
            r7 = 242(0xf2, float:3.39E-43)
            r8 = -1903449111(0xffffffff8e8babe9, float:-3.443169E-30)
            r6 = r6 ^ r7
            r6 = r6 ^ r8
            switch(r6) {
                case -2093159344: goto L_0x001e;
                case -2089587819: goto L_0x0043;
                case -1739768966: goto L_0x006e;
                case -1684236631: goto L_0x004e;
                case -1132151231: goto L_0x0094;
                case -1024739223: goto L_0x0016;
                case -311081930: goto L_0x006a;
                case -269823419: goto L_0x001b;
                case -110196861: goto L_0x004a;
                case -13895107: goto L_0x0099;
                case 690294587: goto L_0x008f;
                case 1545940400: goto L_0x0022;
                default: goto L_0x0015;
            }
        L_0x0015:
            goto L_0x0007
        L_0x0016:
            int r5 = android.os.Build.VERSION.SDK_INT
            java.lang.String r0 = "ۛۙۜۧ۫ۜۤۡۗۤۡۡۡ۠ۗۢۖۦ"
            goto L_0x0007
        L_0x001b:
            java.lang.String r0 = "ۦۨۥۨ۟ۙۜ۟ۦۦۦۚۦ۫ۦ"
            goto L_0x0007
        L_0x001e:
            java.lang.String r0 = "ۤۧۘۘۖۦۖۘ۬ۧ۫ۙۚۢۗۨۙۢۜۙۤۨۘۧۡۡۙۖۘ"
            r4 = r2
            goto L_0x0007
        L_0x0022:
            r6 = 109873629(0x68c89dd, float:5.286472E-35)
            java.lang.String r0 = "ۜۨۡۘۜ۬ۡۘۧۚۥۢۙۦۘۨۗۤۧۤۙۡۧۘ۟۫ۘۘۤۘۦ"
        L_0x0027:
            int r7 = r0.hashCode()
            r7 = r7 ^ r6
            switch(r7) {
                case -1351997000: goto L_0x003d;
                case -1325039471: goto L_0x0036;
                case -213663795: goto L_0x0030;
                case 1990150822: goto L_0x0040;
                default: goto L_0x002f;
            }
        L_0x002f:
            goto L_0x0027
        L_0x0030:
            java.lang.String r0 = "ۢۚ۫۫۠۫ۥۛۜۘۗۧ۬ۡۧۡۨ۬ۜۗۢۡۘ"
            goto L_0x0007
        L_0x0033:
            java.lang.String r0 = "ۙۨۖۘۡۦۨۥۜۜۘ۟ۖۥۘۘۥ۬"
            goto L_0x0027
        L_0x0036:
            r0 = 23
            if (r5 < r0) goto L_0x0033
            java.lang.String r0 = "۟ۧۜۚۘۦۘۢۥۙۘۗۘۥۢۘۘ۟۟ۜۘۜۙۢ"
            goto L_0x0027
        L_0x003d:
            java.lang.String r0 = "ۤۢۦۧۗۨ۟ۧ۠ۛ۟ۜۘۡ۬ۨۘۜۨۧۘۜۘۙۤۤۘ"
            goto L_0x0027
        L_0x0040:
            java.lang.String r0 = "ۘۤۘۘۘۧۧۦۦۦۤۧۘ۠۠ۨۚ۟ۙ۬ۘۡ"
            goto L_0x0007
        L_0x0043:
            android.hardware.fingerprint.FingerprintManager r3 = c()
            java.lang.String r0 = "ۦۡ۠ۧۚۡۘۜۘۗ۫ۛۤۘ۬ۦۛۨ۠۫ۡۦۨۢۨۜۤۧ"
            goto L_0x0007
        L_0x004a:
            java.lang.String r0 = "۟ۖۗ۠ۚ۟ۨۦۦ۠ۤۗۨ۬ۡ۬ۢۡۚۖۨۚۧۡۘ"
            r4 = r2
            goto L_0x0007
        L_0x004e:
            r6 = 782747923(0x2ea7c913, float:7.629999E-11)
            java.lang.String r0 = "ۙ۟ۨۛۡۢ۟۫ۘۘۥۖۦۘۚ۟ۚۜۖ۬۬ۤۤ۠ۦ"
        L_0x0053:
            int r7 = r0.hashCode()
            r7 = r7 ^ r6
            switch(r7) {
                case -1490119361: goto L_0x0062;
                case -567243884: goto L_0x0030;
                case 1212549950: goto L_0x0067;
                case 2146136091: goto L_0x005c;
                default: goto L_0x005b;
            }
        L_0x005b:
            goto L_0x0053
        L_0x005c:
            java.lang.String r0 = "ۤۛۥۤۡۘۜ۟ۚۙۛۚۤۡۘ"
            goto L_0x0053
        L_0x005f:
            java.lang.String r0 = "۬۫ۚ۫ۨ۟ۛۡۖۘۧۗۨۘۨ۬ۚ"
            goto L_0x0053
        L_0x0062:
            if (r3 == 0) goto L_0x005f
            java.lang.String r0 = "ۗۜۤۥۖۘۡۗۛ۟ۙ۠ۥ۠۬"
            goto L_0x0053
        L_0x0067:
            java.lang.String r0 = "ۘۙ۬۟۠ۥۘۘۢۡۗ۫ۛۗۤۙۘۡۛۙۜۘ۫ۘ"
            goto L_0x0007
        L_0x006a:
            java.lang.String r0 = "۟ۤۨۘ۟ۙۜۘۘ۬ۧۛۧ۟ۗۨۨۘۡۙۙ۟ۘۥۘ"
            r4 = r2
            goto L_0x0007
        L_0x006e:
            r6 = 256942791(0xf50a2c7, float:1.02865415E-29)
            java.lang.String r0 = "ۖۚۥ۠۬ۧۤ۠ۘۡۘۥۘۖۛۖۘۗۨۘۘۙۥۙ"
        L_0x0073:
            int r7 = r0.hashCode()
            r7 = r7 ^ r6
            switch(r7) {
                case -973053731: goto L_0x007c;
                case -966994930: goto L_0x0082;
                case -473086602: goto L_0x008b;
                case 1471417298: goto L_0x0030;
                default: goto L_0x007b;
            }
        L_0x007b:
            goto L_0x0073
        L_0x007c:
            java.lang.String r0 = "۬ۘۖۡۘۦۘۜۧۥ۠ۙۧ۟۫۠ۤۤۙۦ۫"
            goto L_0x0073
        L_0x007f:
            java.lang.String r0 = "ۧۖ۟۟ۧۙۦۡۘۘۙۛۨ۠ۘۡۢۦۘ"
            goto L_0x0073
        L_0x0082:
            boolean r0 = com.obwhatsapp.yo.i.d(r3)
            if (r0 == 0) goto L_0x007f
            java.lang.String r0 = "ۢۚ۫ۖۨۡ۫ۙۛۚ۠ۢۢۨۧۧۤۗۡۗ"
            goto L_0x0073
        L_0x008b:
            java.lang.String r0 = "ۗ۫ۘۢۜۛۥۥۡۧ۬۬ۛۘۛۙۡۚۗۥۚۛۙ۬ۦۧۚ"
            goto L_0x0007
        L_0x008f:
            r1 = 1
            java.lang.String r0 = "ۤۧۤۨۗۢۦۦۧۘۤۨ۫ۜۙۘۘۗۥۚۛۗۥۤۥۙ"
            goto L_0x0007
        L_0x0094:
            java.lang.String r0 = "ۢۚ۫۫۠۫ۥۛۜۘۗۧ۬ۡۧۡۨ۬ۜۗۢۡۘ"
            r4 = r1
            goto L_0x0007
        L_0x0099:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.youbasha.task.utils.hasFingerprintRegistered():boolean");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean isArabic() {
        /*
            r4 = 1
            r2 = 0
            java.lang.String r0 = "ۥۤۨ۟ۦۚۨۜۨۘ۠ۧۦۘۡۘۘ۫ۚۛۢۙ۫ۥۧۨۨۘ"
            r1 = r2
            r3 = r2
            r5 = r2
        L_0x0007:
            int r6 = r0.hashCode()
            r7 = 578(0x242, float:8.1E-43)
            r8 = 1046567486(0x3e615a3e, float:0.22007081)
            r6 = r6 ^ r7
            r6 = r6 ^ r8
            switch(r6) {
                case -2063344206: goto L_0x0049;
                case -1484571669: goto L_0x0025;
                case -1445115474: goto L_0x0029;
                case -700163239: goto L_0x007a;
                case 238545661: goto L_0x0076;
                case 545297072: goto L_0x002d;
                case 801449847: goto L_0x0084;
                case 945453301: goto L_0x007d;
                case 1333078681: goto L_0x0081;
                case 1728147656: goto L_0x0016;
                default: goto L_0x0015;
            }
        L_0x0015:
            goto L_0x0007
        L_0x0016:
            java.lang.String r0 = "Language"
            java.lang.String r5 = "0"
            java.lang.String r0 = com.obwhatsapp.yo.shp.getStringPriv(r0, r5)
            int r5 = java.lang.Integer.parseInt(r0)
            java.lang.String r0 = "ۧۗ۠ۗۨۜۘ۫ۖۜ۟ۙۨۚ۠ۗ۠ۨۘۘ۫ۧۚۡۙ"
            goto L_0x0007
        L_0x0025:
            java.lang.String r0 = "ۛۚۘۘۧۧۗۗ۠ۘۘۗۛۥۘۙۚۧ۟۟ۖۘۨۧۨ۠ۦۥۥۘ۫"
            r3 = r4
            goto L_0x0007
        L_0x0029:
            java.lang.String r0 = "۟ۗۥ۬ۖۚۤۙۘۘۘۨۛۡ۟ۥۘۤۖۥۧۥۦۘ۬ۧۗ۬۟ۜ"
            r1 = r3
            goto L_0x0007
        L_0x002d:
            r6 = 1282203109(0x4c6cdde5, float:6.2093204E7)
            java.lang.String r0 = "۫ۤۘ۬۬ۡۗۦۘۚۨۥۘۗۚۚۦۢۤۤ۬۟"
        L_0x0032:
            int r7 = r0.hashCode()
            r7 = r7 ^ r6
            switch(r7) {
                case -1471750813: goto L_0x003b;
                case -1433968694: goto L_0x0046;
                case -1061361508: goto L_0x0081;
                case 1022364763: goto L_0x0041;
                default: goto L_0x003a;
            }
        L_0x003a:
            goto L_0x0032
        L_0x003b:
            java.lang.String r0 = "ۨۨۦۘ۟ۤ۟ۥ۠ۜۘۘۥۢۧ۬ۥۘۜ۫۬"
            goto L_0x0032
        L_0x003e:
            java.lang.String r0 = "ۖۦۨۘۨۚ۫۟ۘۘۦ۬ۢۜۦۥۘۥ۬ۘۨۖۥ"
            goto L_0x0032
        L_0x0041:
            if (r5 == r4) goto L_0x003e
            java.lang.String r0 = "ۡۢۜۘ۠ۜۧۤۜۧۘۥۘۜۘۛۗۙۛۜۘ۬ۡۧۙۤۡۘ۠ۦ۠"
            goto L_0x0032
        L_0x0046:
            java.lang.String r0 = "ۖ۟ۡۜۢۧۥۘۘۘۦ۟ۧۨۘۙۚ۫۠ۡۛ۠"
            goto L_0x0007
        L_0x0049:
            r6 = 2140974678(0x7f9cae56, float:NaN)
            java.lang.String r0 = "ۢۛۘۘۘۚۘۗۜۚۡۘۨۘۘ۠ۖۘۥۖۦۦۨۙۦۘ۫۬ۦ"
        L_0x004e:
            int r7 = r0.hashCode()
            r7 = r7 ^ r6
            switch(r7) {
                case -1565363362: goto L_0x005d;
                case -914821858: goto L_0x0070;
                case 57688810: goto L_0x0073;
                case 2131841196: goto L_0x0057;
                default: goto L_0x0056;
            }
        L_0x0056:
            goto L_0x004e
        L_0x0057:
            java.lang.String r0 = "ۙۡۚۚۖ۠ۤۖۖۘۧۖۦۘۤۙۘۘ۠۬ۖۘۗۤۜ"
            goto L_0x0007
        L_0x005a:
            java.lang.String r0 = "۠ۧۚۚۖۨ۟ۛ۫ۡۖۧ۫ۢ۫ۦۛۜ۫ۡۧ۫ۧۘ"
            goto L_0x004e
        L_0x005d:
            java.util.Locale r0 = java.util.Locale.getDefault()
            java.lang.String r0 = r0.getLanguage()
            java.lang.String r7 = "ar"
            boolean r0 = r0.startsWith(r7)
            if (r0 == 0) goto L_0x005a
            java.lang.String r0 = "ۚۗ۫۟۟ۧۤۤۗۧۖۚۗ۠ۦۘ"
            goto L_0x004e
        L_0x0070:
            java.lang.String r0 = "۬۬ۜۜ۟ۗۡۛۥۘ۟۠ۡۘ۬ۖ۫ۡ۬ۘۤ۠ۡۘۙۙ۟ۗۜۤ"
            goto L_0x004e
        L_0x0073:
            java.lang.String r0 = "ۧۜۜۘۛۘۗۗۥۜۘۤۗۧۧۡۜ"
            goto L_0x0007
        L_0x0076:
            java.lang.String r0 = "ۛۨۧۘۛۦ۬ۘۖۨ۬ۜۛۗۦۘ"
            r1 = r3
            goto L_0x0007
        L_0x007a:
            java.lang.String r0 = "۫ۥۨۘۨۨۡۨۥۜ۟ۚۜۘۚۖ۬ۚ۬ۙۗۗۥۘ۟ۜۥۨۛۛ"
            goto L_0x0007
        L_0x007d:
            java.lang.String r0 = "۟۬ۦۘۨۤۡۡ۠ۥۗۘۜ۬ۦۨ۫ۧ۟ۚۧۨ"
            r1 = r2
            goto L_0x0007
        L_0x0081:
            java.lang.String r0 = "۟۬ۦۘۨۤۡۡ۠ۥۗۘۜ۬ۦۨ۫ۧ۟ۚۧۨ"
            goto L_0x0007
        L_0x0084:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.youbasha.task.utils.isArabic():boolean");
    }

    public static boolean isColorBright(int i2, double d2) {
        double d3 = 0.0d;
        double d4 = 0.0d;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        String str = "ۜ۟ۦۘۨۙۘۘۧۨۨ۫۫ۙۤۚۘۡ۬ۥۘ۠ۥۜۘ۟ۛۘ۠ۙ۫";
        while (true) {
            switch ((str.hashCode() ^ 178) ^ 2125700288) {
                case -1870373841:
                    str = "۟ۙۙۜۢ۫ۨۖۡۤۥۖۘۚۙۤ۟۟ۚ۠ۨۘ";
                    break;
                case -1800147793:
                    z3 = false;
                    str = "۬ۡۤۧۡۙۧۧ۠ۗۢ۟۠ۛۦۘ";
                    break;
                case -1224830605:
                    d3 = (double) Color.red(i2);
                    str = "ۚ۠ۧ۬ۢۖۛۨ۫ۗ۟ۢ۟ۘ۬ۧۜۢ";
                    break;
                case -1145240851:
                    str = "ۤ۠ۖۖ۫ۚۛۨۦۘۥۡۘ۬ۖۖ";
                    break;
                case -21132101:
                    str = "ۡۛۜۤۗۛۗۘۥۘۙ۫ۦ۠ۥ۠ۧۚۤ۟ۖۤ";
                    z4 = z2;
                    break;
                case 101711143:
                    d4 = (double) Color.green(i2);
                    str = "۟ۘۦۗۜۥۘ۠۟ۦۥ۟ۚۧۡۡۥۧۖۘ۫ۜ۟";
                    break;
                case 500690344:
                    str = "ۖۤ۟ۘۗ۫ۗۦۜۘۧۜۖۘۥۚۨۜۧ";
                    break;
                case 807781987:
                    str = "۟ۙۙۜۢ۫ۨۖۡۤۥۖۘۚۙۤ۟۟ۚ۠ۨۘ";
                    z4 = z3;
                    break;
                case 905858215:
                    z2 = true;
                    str = "۟ۗۜۘ۠ۦۦ۬۠ۢۜۨۥ۠ۚۘۖۘ";
                    break;
                case 995173145:
                    return z4;
                case 2147373395:
                    String str2 = "۬ۦۤۢۢۥۘۤۨۖۘۦۡۘۚۛۨۙۘۚۗۦۤۦۧ۫ۗۚ";
                    while (true) {
                        switch (str2.hashCode() ^ -124715934) {
                            case -473870808:
                                str = "ۚۛۧۤۡۨۛۛۜ۠ۨۢ۫ۚۧۗ۬ۘ۟ۦۤ۠ۥۡۘۧۡۨۘ";
                                continue;
                            case 73155876:
                                if (1.0d - (((((double) Color.blue(i2)) * 0.114d) + ((0.587d * d4) + (0.299d * d3))) / 255.0d) >= d2) {
                                    str2 = "۬ۥ۬ۧۗ۬ۛۥۚۤۧۥ۠ۤۙ۠۟۠ۖ۫ۜۗ";
                                    break;
                                } else {
                                    str2 = "ۧ۟ۖۦۖۤۤۛۧۖۗۡۤۛۙۚۢ۬ۢۢۢ";
                                    break;
                                }
                            case 1689938165:
                                str = "ۚۖۜۘۛۚۜۘۖۤۨۘ۠ۖۦۘۜ۟ۙ";
                                continue;
                            case 1699544952:
                                str2 = "ۧۡۘۡ۟ۧۗ۟ۛۨۖۜۖۧۡ";
                                break;
                        }
                    }
                    break;
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0095, code lost:
        r0 = "ۤۜۜۜ۠ۡۗۥۦۥۡۢ۠ۨ۠ۘۗۖۚ۟ۙ";
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean isFingerprintAvailable() {
        /*
            r2 = 0
            r5 = 0
            java.lang.String r0 = "ۗۧۚۥۥۨ۫۟ۡۥ۟ۦۥ۟ۨ۟۬۠۫۬ۛۦۧۡ"
            r1 = r2
            r3 = r2
            r4 = r2
        L_0x0007:
            int r6 = r0.hashCode()
            r7 = 728(0x2d8, float:1.02E-42)
            r8 = -94040164(0xfffffffffa650f9c, float:-2.9733814E35)
            r6 = r6 ^ r7
            r6 = r6 ^ r8
            switch(r6) {
                case -1950011502: goto L_0x0047;
                case -1386032796: goto L_0x004b;
                case -1379459638: goto L_0x0099;
                case -1167112734: goto L_0x006b;
                case -915771175: goto L_0x001d;
                case -839234004: goto L_0x0016;
                case -387861083: goto L_0x0022;
                case 383267536: goto L_0x0029;
                case 443027445: goto L_0x0025;
                case 562184168: goto L_0x0090;
                case 846086092: goto L_0x0067;
                case 987082684: goto L_0x008b;
                default: goto L_0x0015;
            }
        L_0x0015:
            goto L_0x0007
        L_0x0016:
            android.hardware.fingerprint.FingerprintManager r5 = c()
            java.lang.String r0 = "ۨۗ۟۬ۖۦۘۤ۬ۨۢۗۤۘۜۡۘ۫ۥۡۘۤۨۦۘ"
            goto L_0x0007
        L_0x001d:
            int r4 = android.os.Build.VERSION.SDK_INT
            java.lang.String r0 = "ۘۚۘۡۤۥۘ۫ۜۦۘ۬۠۟ۨۙۚ۟ۥۘۧۥۤ"
            goto L_0x0007
        L_0x0022:
            java.lang.String r0 = "ۤ۠ۤۧۛۘۘۗۘۡۘۡۧۤۚۡۢ"
            goto L_0x0007
        L_0x0025:
            java.lang.String r0 = "ۙۤ۠ۧ۫۫ۨۗۡۧۘۘ۬ۛۥۘۘۚۡۚۘ"
            r3 = r2
            goto L_0x0007
        L_0x0029:
            r6 = 1323295259(0x4edfe21b, float:1.87806861E9)
            java.lang.String r0 = "ۧۚ۟ۨۙۦۛ۫ۤۢ۫ۡۘۨ۠۠"
        L_0x002e:
            int r7 = r0.hashCode()
            r7 = r7 ^ r6
            switch(r7) {
                case 1405317081: goto L_0x0095;
                case 1436991910: goto L_0x003d;
                case 1522922726: goto L_0x0044;
                case 1645104967: goto L_0x0037;
                default: goto L_0x0036;
            }
        L_0x0036:
            goto L_0x002e
        L_0x0037:
            java.lang.String r0 = "ۗۦۚۛۦۧۘۜ۫ۢۚ۟ۡ۬ۦۢۚۗۧۧۧ۫ۦۦۖ"
            goto L_0x002e
        L_0x003a:
            java.lang.String r0 = "ۦۤۜۘۥۜۡۘ۠ۙۜۚۛ۫ۥۡۡۘ"
            goto L_0x002e
        L_0x003d:
            r0 = 23
            if (r4 < r0) goto L_0x003a
            java.lang.String r0 = "۠ۨۛۗۨۨۘ۬ۧۙ۫ۧۦۜ۠۠"
            goto L_0x002e
        L_0x0044:
            java.lang.String r0 = "ۛۖۗ۟ۥۨۥۜۗۗۖ۟۫ۙۨۘ۬ۢۜۘ"
            goto L_0x0007
        L_0x0047:
            java.lang.String r0 = "ۗۛۖۘۧ۟ۥۘۢۨ۟ۨ۠۬ۘ۬ۡۘۘۢۥۘۡ۫ۛ۟ۧۦۘۛۤ"
            r3 = r2
            goto L_0x0007
        L_0x004b:
            r6 = 606682432(0x24293d40, float:3.6697914E-17)
            java.lang.String r0 = "ۗۢۥۥۘۚۨۖۘۤ۫ۜۘۘۧۥۛ۬ۚۖۖۘ"
        L_0x0050:
            int r7 = r0.hashCode()
            r7 = r7 ^ r6
            switch(r7) {
                case -882277752: goto L_0x0095;
                case -607069531: goto L_0x0059;
                case -476241986: goto L_0x0061;
                case 420365197: goto L_0x0064;
                default: goto L_0x0058;
            }
        L_0x0058:
            goto L_0x0050
        L_0x0059:
            if (r5 == 0) goto L_0x005e
            java.lang.String r0 = "ۖۨۧۘۢۛ۫ۦۙۜۘ۬۠ۥۘۥ۫ۥۘ"
            goto L_0x0050
        L_0x005e:
            java.lang.String r0 = "ۗۚۥۖۜۡ۠ۥ۬ۨۗۡ۬ۡۢۘۨۗۗۘۖۧۦۧۘ۠ۘۧ"
            goto L_0x0050
        L_0x0061:
            java.lang.String r0 = "ۖۥۘۘۤۙۡۘ۬ۧ۬ۡ۠ۛ۠ۢۖۧۡ۟ۢۖۘ"
            goto L_0x0050
        L_0x0064:
            java.lang.String r0 = "۬ۗۡۥ۬ۥۢۧۨۘ۠ۥ۟ۛ۬ۥۜۡۨۘ۟ۦ۠ۜ۟ۘ"
            goto L_0x0007
        L_0x0067:
            java.lang.String r0 = "ۙۖۗۡۛۨۗۜۘۘۧۢ۠ۨ۟ۡۖۙ۠ۥ"
            r3 = r2
            goto L_0x0007
        L_0x006b:
            r6 = 1012267509(0x3c55f9f5, float:0.013060083)
            java.lang.String r0 = "ۘۢۖۘۢۢۥۖ۬ۦۢۗ۟ۡ۠ۥۘۛۥۜ۟ۖۚ"
        L_0x0070:
            int r7 = r0.hashCode()
            r7 = r7 ^ r6
            switch(r7) {
                case -801530622: goto L_0x0095;
                case -324750199: goto L_0x0079;
                case -44336256: goto L_0x0088;
                case 410925251: goto L_0x007f;
                default: goto L_0x0078;
            }
        L_0x0078:
            goto L_0x0070
        L_0x0079:
            java.lang.String r0 = "۟۠ۤ۫ۦۥۘۛ۬ۡۘۧ۟ۘۘۨ۠ۖ۠۟ۗۖۛۗۜۦۖۥۘ"
            goto L_0x0007
        L_0x007c:
            java.lang.String r0 = "ۧۧۢۛۜۤۘۘ۫ۤۦۨۘۗ۟ۨۘۗ۫ۜ۠ۖۡ"
            goto L_0x0070
        L_0x007f:
            boolean r0 = com.obwhatsapp.yo.i.e(r5)
            if (r0 == 0) goto L_0x007c
            java.lang.String r0 = "ۤۧۥۘۛۘۛۛۤۖۘ۬ۢۚ۫ۤ۟ۚۥۦۘۤ۬ۛۡۧۗۙۘۤ"
            goto L_0x0070
        L_0x0088:
            java.lang.String r0 = "ۙ۬۟ۢۥ۟ۦۛۥۤۗۖ۠۬ۤۨۖ۟"
            goto L_0x0070
        L_0x008b:
            r1 = 1
            java.lang.String r0 = "۠ۚ۟ۤۨۛۚۜ۬ۡۦۛۘۖۨ"
            goto L_0x0007
        L_0x0090:
            java.lang.String r0 = "ۤۜۜۜ۠ۡۗۥۦۥۡۢ۠ۨ۠ۘۗۖۚ۟ۙ"
            r3 = r1
            goto L_0x0007
        L_0x0095:
            java.lang.String r0 = "ۤۜۜۜ۠ۡۗۥۦۥۡۢ۠ۨ۠ۘۗۖۚ۟ۙ"
            goto L_0x0007
        L_0x0099:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.youbasha.task.utils.isFingerprintAvailable():boolean");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0049, code lost:
        r0 = "ۢۥۛۚ۫۠ۘۦۛ۫ۦۦۘۥۛۥۖۜۡۘۗۗۦۘ";
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean isImageFile(android.net.Uri r8) {
        /*
            r2 = 0
            r4 = 0
            java.lang.String r0 = "ۖۖۧۘۡۛ۫۫ۘۡۘۧۦ۫ۢۗۧۡۨۡۛ۫"
            r1 = r2
            r3 = r2
        L_0x0006:
            int r5 = r0.hashCode()
            r6 = 396(0x18c, float:5.55E-43)
            r7 = 793421772(0x2f4aa7cc, float:1.8431406E-10)
            r5 = r5 ^ r6
            r5 = r5 ^ r7
            switch(r5) {
                case -691381224: goto L_0x0018;
                case -581956917: goto L_0x0060;
                case -395430175: goto L_0x006b;
                case 57077148: goto L_0x0064;
                case 468138161: goto L_0x003b;
                case 475846219: goto L_0x0072;
                case 634090656: goto L_0x0015;
                case 705732385: goto L_0x006f;
                case 1193303963: goto L_0x0068;
                case 2022706718: goto L_0x001f;
                default: goto L_0x0014;
            }
        L_0x0014:
            goto L_0x0006
        L_0x0015:
            java.lang.String r0 = "ۖ۟ۜۙۤۘۘۛۘۨۘۦۦۙۜۧۗۜۡۛ"
            goto L_0x0006
        L_0x0018:
            java.lang.String r4 = d(r8)
            java.lang.String r0 = "ۘ۬ۙۢۥۨۘۥۧۦۘ۬۬ۢۤۘۨ"
            goto L_0x0006
        L_0x001f:
            r5 = -899015856(0xffffffffca6a1b50, float:-3835604.0)
            java.lang.String r0 = "ۗۙۨۘ۬ۚۗۛۘۘۦۨۛۛۗ۫"
        L_0x0024:
            int r6 = r0.hashCode()
            r6 = r6 ^ r5
            switch(r6) {
                case -1531339799: goto L_0x0035;
                case -249626774: goto L_0x002d;
                case 897771337: goto L_0x0049;
                case 1667559720: goto L_0x0038;
                default: goto L_0x002c;
            }
        L_0x002c:
            goto L_0x0024
        L_0x002d:
            if (r4 == 0) goto L_0x0032
            java.lang.String r0 = "۫۬ۤۖۨ۬ۨۢۤۦۘۡۘۗ۟ۡۜ۟ۤ۬ۖۖۘۧۙۛ"
            goto L_0x0024
        L_0x0032:
            java.lang.String r0 = "ۤۖۗۛۖۧ۠۬ۖۧۨۙۖ۫ۜۘۨۦۛ۠۬ۜ"
            goto L_0x0024
        L_0x0035:
            java.lang.String r0 = "ۙ۬ۦۘۥۥۥ۬ۦ۠۠۠ۡ۫ۧۢۛۧۛۙۜ۫ۛۢۛۗۗۨ"
            goto L_0x0024
        L_0x0038:
            java.lang.String r0 = "ۖۙۘۘۖۖۛۧۧۧۡۦۦۘ۫۟ۡۘۤۢۘ۫ۢۜۘ۬ۚۛ"
            goto L_0x0006
        L_0x003b:
            r5 = 1975303834(0x75bcbe9a, float:4.7852425E32)
            java.lang.String r0 = "ۧۦۦۘۘۡۘۘ۫۠ۚ۫۬ۛۚ۟۫"
        L_0x0040:
            int r6 = r0.hashCode()
            r6 = r6 ^ r5
            switch(r6) {
                case -1855373738: goto L_0x005a;
                case -823386574: goto L_0x005d;
                case 618962713: goto L_0x0049;
                case 1623450221: goto L_0x004f;
                default: goto L_0x0048;
            }
        L_0x0048:
            goto L_0x0040
        L_0x0049:
            java.lang.String r0 = "ۢۥۛۚ۫۠ۘۦۛ۫ۦۦۘۥۛۥۖۜۡۘۗۗۦۘ"
            goto L_0x0006
        L_0x004c:
            java.lang.String r0 = "۟ۨۨۢۥۧۘۨۘ۠ۡ۫۠ۜۨۨ"
            goto L_0x0040
        L_0x004f:
            java.lang.String r0 = "image"
            boolean r0 = r4.startsWith(r0)
            if (r0 == 0) goto L_0x004c
            java.lang.String r0 = "ۤۜۦۘۘۛۡۘۤۥۖۛۢۡۘ۠ۤۦۦۡۦۘۧۚۢ۫ۦۖۘ"
            goto L_0x0040
        L_0x005a:
            java.lang.String r0 = "ۗۤۥۜۥۚ۫ۛ۫۬ۦۨۙ۠ۥۘۖۥۧۘۧۤ۬ۜۢۗ"
            goto L_0x0040
        L_0x005d:
            java.lang.String r0 = "ۗۧۡۘۙۗۜۘۥۥۦۚ۬ۨۗۗۜۘۦۡ۠ۖۘۥ"
            goto L_0x0006
        L_0x0060:
            r3 = 1
            java.lang.String r0 = "ۤۛۘۡۤۗۚۤۦۧ۬ۘۘۙۜۘ۟ۢۘۘۚ۠ۨۘۖۢۨ"
            goto L_0x0006
        L_0x0064:
            java.lang.String r0 = "ۤۙۥۧ۬۠ۤ۫ۘۨۜ۠ۤۘۖۛۚۡ۠ۛ۟۟ۛ۠۟ۗ۟"
            r1 = r3
            goto L_0x0006
        L_0x0068:
            java.lang.String r0 = "ۨۨۦۘۜۜۥۜۥۘۦۥۦۨۧۡۨۤۥۘ۠ۦۘۘۛۨۜۛۗ۠"
            goto L_0x0006
        L_0x006b:
            java.lang.String r0 = "ۡۚۖۘ۠ۤۥ۬ۘۦۘ۠ۤۚۢۙۖۘ"
            r1 = r2
            goto L_0x0006
        L_0x006f:
            java.lang.String r0 = "ۡۚۖۘ۠ۤۥ۬ۘۦۘ۠ۤۚۢۙۖۘ"
            goto L_0x0006
        L_0x0072:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.youbasha.task.utils.isImageFile(android.net.Uri):boolean");
    }

    public static boolean isPackageInstalled(Context context, String str) {
        String str2 = "۫ۛۥ۫ۢۜۘۥۥۖۘۥ۫ۗ۟ۧۨ";
        Intent intent = null;
        PackageManager packageManager = null;
        while (true) {
            switch ((str2.hashCode() ^ 189) ^ 904373725) {
                case -1816508903:
                    str2 = "۟ۤ۬ۧۘۧۘۤۨ۬ۥۙۚۢۥۨۥۤۡۤ۫ۨ";
                    break;
                case -1210318394:
                    str2 = "ۡۥۘۘۥۧۛۗۧۖۦۙۡۘۡۢۦۘ";
                    packageManager = context.getPackageManager();
                    break;
                case -18569678:
                    return !packageManager.queryIntentActivities(intent, AccessibilityEventCompat.TYPE_VIEW_ACCESSIBILITY_FOCUS_CLEARED).isEmpty();
                case 1285443543:
                    return false;
                case 1415951342:
                    intent = packageManager.getLaunchIntentForPackage(str);
                    str2 = "ۢۛۢۡۜۤۜۙۘۘ۫ۘۡۘۦۛ۟ۚ۟ۘۦۖۛۧۜۨۘۘۖۧۘ";
                    break;
                case 1777365333:
                    String str3 = "ۡۖۤۧۚۘۘۚۨۥ۟ۨ۠۠ۖ۠۬ۧۨۧۤۨۘ";
                    while (true) {
                        switch (str3.hashCode() ^ -1796739851) {
                            case -1990484794:
                                str3 = "ۧۧۧۢۢ۠ۨۜۢ۬ۤۜ۫۬ۛ";
                                break;
                            case -1205709610:
                                str2 = "ۚ۟ۧۢۖۖۢۗ۠ۘ۬ۜۖۙۜۘۡۢۘ۠ۜۦۥۨۤ";
                                continue;
                            case -291391321:
                                if (intent != null) {
                                    str3 = "ۡۤۡۘۤۖۘ۬ۛۘۘۢۚۚۜۧۘۤ۟ۘۜۚۤۡۧۘ";
                                    break;
                                } else {
                                    str3 = "ۚۦۘ۠۫۫۠ۛ۟۟۠ۤ۠ۖۖۘۢۤ۠";
                                    break;
                                }
                            case 129763710:
                                str2 = "ۛۗۚۨۦۧۘۘۤۤۚ۠۬ۗۡۜ";
                                continue;
                        }
                    }
                    break;
                case 1785372733:
                    str2 = "۠ۢۛ۟ۤۛۦ۫ۘۨۥۗۛۜۨۘۗۨۥۢۤۧ";
                    break;
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean isRTL() {
        /*
            r1 = 0
            r2 = 1
            java.util.Locale r0 = java.util.Locale.getDefault()     // Catch:{ Exception -> 0x00cf }
            java.lang.String r3 = r0.getLanguage()     // Catch:{ Exception -> 0x00cf }
            java.lang.String r0 = "ar"
            boolean r4 = r3.startsWith(r0)     // Catch:{ Exception -> 0x00cf }
            r5 = 404174771(0x181737b3, float:1.9544413E-24)
            java.lang.String r0 = "ۡۘۘ۟۫ۦۥۡۚۗ۫ۤۥ۬ۡۘۢۧۨۘ"
        L_0x0015:
            int r6 = r0.hashCode()     // Catch:{ Exception -> 0x00cf }
            r6 = r6 ^ r5
            switch(r6) {
                case -305622291: goto L_0x0024;
                case -228873372: goto L_0x00a7;
                case 123172525: goto L_0x001e;
                case 1749897766: goto L_0x0029;
                default: goto L_0x001d;
            }
        L_0x001d:
            goto L_0x0015
        L_0x001e:
            java.lang.String r0 = "ۜۜ۠ۨۙۨۚۤۤۜۗۜۘۗۡۦۥۖۖۘ"
            goto L_0x0015
        L_0x0021:
            java.lang.String r0 = "ۦۜۧۧۗ۫ۨۨۘ۫۬ۗ۫ۚۨۘۨۥۛۨۖۥۥۦۘ"
            goto L_0x0015
        L_0x0024:
            if (r4 != 0) goto L_0x0021
            java.lang.String r0 = "ۜۨ۬ۨۦۧ۟ۧۡۘۘ۟ۧۥۖۡ۬ۡ۫"
            goto L_0x0015
        L_0x0029:
            r4 = -524897707(0xffffffffe0b6b255, float:-1.05317425E20)
            java.lang.String r0 = "ۦۗۦۥۢۗۧ۫ۘۘۗۖ۟ۙۖۖ۫ۧۖۥ۫ۜۘ"
        L_0x002e:
            int r5 = r0.hashCode()     // Catch:{ Exception -> 0x00cf }
            r5 = r5 ^ r4
            switch(r5) {
                case -1639517297: goto L_0x0053;
                case -1149947507: goto L_0x0037;
                case 1905487973: goto L_0x005e;
                case 1935813091: goto L_0x00a7;
                default: goto L_0x0036;
            }     // Catch:{ Exception -> 0x00cf }
        L_0x0036:
            goto L_0x002e
        L_0x0037:
            r4 = -1282843385(0xffffffffb3895d07, float:-6.396481E-8)
            java.lang.String r0 = "ۦۢۢۙۜۧۘۥۨ۟ۢۤۧ۟ۖۦۚۨۡ"
        L_0x003c:
            int r5 = r0.hashCode()     // Catch:{ Exception -> 0x00cf }
            r5 = r5 ^ r4
            switch(r5) {
                case -1062354391: goto L_0x0064;
                case -402615824: goto L_0x0067;
                case 760530656: goto L_0x0045;
                case 846722467: goto L_0x00a7;
                default: goto L_0x0044;
            }     // Catch:{ Exception -> 0x00cf }
        L_0x0044:
            goto L_0x003c
        L_0x0045:
            java.lang.String r0 = "iw"
            boolean r0 = r3.startsWith(r0)     // Catch:{ Exception -> 0x00cf }
            if (r0 != 0) goto L_0x0061
            java.lang.String r0 = "ۡۖۡۦۨۤۥۧۦۘۖۦۦۙۨ۫ۘ۠ۜۜۘۘۡۗ"
            goto L_0x003c
        L_0x0050:
            java.lang.String r0 = "ۨۚۦۘۤ۟ۨۚۘۧۨۙۡۘۢۦۤۛۚۛ۠ۢۦۘ۠۫ۥۘ"
            goto L_0x002e
        L_0x0053:
            java.lang.String r0 = "ur"
            boolean r0 = r3.startsWith(r0)     // Catch:{ Exception -> 0x00cf }
            if (r0 != 0) goto L_0x0050
            java.lang.String r0 = "ۨۙۦۘۥ۬ۗ۟ۚۜۘۦۡۖۛۜۨ"
            goto L_0x002e
        L_0x005e:
            java.lang.String r0 = "ۜ۫ۧ۬ۦۦۧ۬ۘۘۢۖۗۦ۠ۡۧ۫ۜۘۛۥۧۘ"
            goto L_0x002e
        L_0x0061:
            java.lang.String r0 = "۬ۢ۫ۜۗۘۘۤۡۢ۬ۤۤۗۙۡۖۧ۬ۚ۫"
            goto L_0x003c
        L_0x0064:
            java.lang.String r0 = "ۧۤۨۘۛۘۦ۟ۡۡۥ۫ۥ۟ۜۖۘۜۛۦۘۙۖۡۘۙۡ۟ۛ۟ۜۘ"
            goto L_0x003c
        L_0x0067:
            r4 = -570804764(0xffffffffddfa35e4, float:-2.25369592E18)
            java.lang.String r0 = "۠ۛۨ۠ۥۥۗۧۜ۬ۡۘۜۦۖ۬ۚۦۘ"
        L_0x006c:
            int r5 = r0.hashCode()     // Catch:{ Exception -> 0x00cf }
            r5 = r5 ^ r4
            switch(r5) {
                case -535335009: goto L_0x0075;
                case 470808166: goto L_0x0099;
                case 716256066: goto L_0x00a4;
                case 1604084726: goto L_0x00a7;
                default: goto L_0x0074;
            }     // Catch:{ Exception -> 0x00cf }
        L_0x0074:
            goto L_0x006c
        L_0x0075:
            r3 = r1
        L_0x0076:
            android.content.Context r0 = com.obwhatsapp.yo.yo.getCtx()     // Catch:{ Exception -> 0x00cf }
            android.content.res.Resources r0 = r0.getResources()     // Catch:{ Exception -> 0x00cf }
            android.content.res.Configuration r0 = r0.getConfiguration()     // Catch:{ Exception -> 0x00cf }
            int r4 = r0.getLayoutDirection()     // Catch:{ Exception -> 0x00cf }
            r5 = -453324000(0xffffffffe4fad320, float:-3.7015193E22)
            java.lang.String r0 = "۫۫ۧۖ۟ۦۘۚۧۢۚۥۡۘۢۦۦۜۛ۬"
        L_0x008b:
            int r6 = r0.hashCode()     // Catch:{ Exception -> 0x00cf }
            r6 = r6 ^ r5
            switch(r6) {
                case -1647662737: goto L_0x00b1;
                case -807020809: goto L_0x00b4;
                case -354978067: goto L_0x0094;
                case 755599392: goto L_0x00ac;
                default: goto L_0x0093;
            }     // Catch:{ Exception -> 0x00cf }
        L_0x0093:
            goto L_0x008b
        L_0x0094:
            r0 = r2
        L_0x0095:
            return r0
        L_0x0096:
            java.lang.String r0 = "ۗۗ۬۠ۥۨۘۙۥۡۘ۬ۛۜۘۛۗۨۘ"
            goto L_0x006c
        L_0x0099:
            java.lang.String r0 = "fa"
            boolean r0 = r3.startsWith(r0)     // Catch:{ Exception -> 0x00cf }
            if (r0 == 0) goto L_0x0096
            java.lang.String r0 = "ۜ۬ۖۘ۬۬ۦۘ۫ۤۦۖۖۢۥۢۨۘ"
            goto L_0x006c
        L_0x00a4:
            java.lang.String r0 = "۠ۙ۬ۢۙۥۨ۬ۥۛ۠ۖۘ۬۟ۤۗۥۥۙۡۡۘ"
            goto L_0x006c
        L_0x00a7:
            r3 = r2
            goto L_0x0076
        L_0x00a9:
            java.lang.String r0 = "ۧ۠ۨۘۥ۬ۘ۠ۚۘۜۤۡۘۦۜ۠ۖۡۧۚۘۙ۠ۨۛۥۚۡ"
            goto L_0x008b
        L_0x00ac:
            if (r4 == r2) goto L_0x00a9
            java.lang.String r0 = "ۦۙۥ۟ۘۧۗۛۨۘۧۨۖۘ۫ۙۘۡۦۢۨ۫ۘ"
            goto L_0x008b
        L_0x00b1:
            java.lang.String r0 = "۬ۧۜۤۨۜۘۧۨۡۘۜۤۖ۠۫ۦۘ۟ۗۢۜۧۜۘۚۛۥۨۘ۬"
            goto L_0x008b
        L_0x00b4:
            r4 = -1504321719(0xffffffffa655df49, float:-7.420183E-16)
            java.lang.String r0 = "ۢۖۖ۠۬ۧۚۜ۠۟ۦۢۚۖۛۨۖۘۘۨ۠ۛۤۙ"
        L_0x00b9:
            int r5 = r0.hashCode()
            r5 = r5 ^ r4
            switch(r5) {
                case -1889572434: goto L_0x00cc;
                case -1251965249: goto L_0x0094;
                case -355272856: goto L_0x00c7;
                case 1625629251: goto L_0x00c2;
                default: goto L_0x00c1;
            }
        L_0x00c1:
            goto L_0x00b9
        L_0x00c2:
            r0 = r1
            goto L_0x0095
        L_0x00c4:
            java.lang.String r0 = "ۦۨۡۚۜۜۚ۫۫ۧ۬ۜۡۧۨ"
            goto L_0x00b9
        L_0x00c7:
            if (r3 == 0) goto L_0x00c4
            java.lang.String r0 = "ۙۛۧۙۢۛ۟ۖ۠۠۬ۥۧۥۜ۬ۤۥۚۜۖۘ۬ۛۦ"
            goto L_0x00b9
        L_0x00cc:
            java.lang.String r0 = "ۤ۬ۧۦۢ۫۟ۧۡۥ۟ۗۨۙۜۘۧۡ۬ۡۦۜۦۤۦۘ"
            goto L_0x00b9
        L_0x00cf:
            r0 = move-exception
            boolean r0 = isArabic()
            goto L_0x0095
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.youbasha.task.utils.isRTL():boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:1:0x0002 A[LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean isReadContactsGranted() {
        /*
            java.lang.String r0 = "ۤۛۧۧۨۜۧۡۥۘۡۢۖۘۗۧۥۘۜۛۦ۟۫ۚۗ۫ۡۜۤ"
        L_0x0002:
            int r1 = r0.hashCode()
            r2 = 481(0x1e1, float:6.74E-43)
            r3 = 1873586688(0x6facaa00, float:1.0687388E29)
            r1 = r1 ^ r2
            r1 = r1 ^ r3
            switch(r1) {
                case 1352734801: goto L_0x0011;
                default: goto L_0x0010;
            }
        L_0x0010:
            goto L_0x0002
        L_0x0011:
            java.lang.String r0 = "android.permission.READ_CONTACTS"
            boolean r0 = b(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.youbasha.task.utils.isReadContactsGranted():boolean");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0067, code lost:
        r0 = "ۖۖۨ۫ۡۖۘۤۦ۟۬ۦۢۚۦۜۘ۟ۜۦۘۥ۟ۧ";
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean isStorageGranted() {
        /*
            r2 = 0
            java.lang.String r0 = "ۗۚۦۥۡۗۛۢ۟ۛۡۧ۠ۦۜۘۗ۠ۚ۫ۦ۟۟ۛۗ"
            r1 = r2
            r3 = r2
        L_0x0005:
            int r4 = r0.hashCode()
            r5 = 267(0x10b, float:3.74E-43)
            r6 = -698509484(0xffffffffd65d9754, float:-6.0910505E13)
            r4 = r4 ^ r5
            r4 = r4 ^ r6
            switch(r4) {
                case -1055141088: goto L_0x0058;
                case -645675404: goto L_0x0036;
                case -511067858: goto L_0x006d;
                case 1183808212: goto L_0x0060;
                case 1344952950: goto L_0x0063;
                case 1485753449: goto L_0x006a;
                case 1863723322: goto L_0x005c;
                case 1926045114: goto L_0x0014;
                default: goto L_0x0013;
            }
        L_0x0013:
            goto L_0x0005
        L_0x0014:
            r4 = -90237072(0xfffffffffa9f1770, float:-4.130253E35)
            java.lang.String r0 = "ۘۦۘۘۤۗۘۘ۠ۡۖ۫۟ۦ۫۠ۨ"
        L_0x0019:
            int r5 = r0.hashCode()
            r5 = r5 ^ r4
            switch(r5) {
                case -1487141849: goto L_0x0022;
                case -877507276: goto L_0x0033;
                case 2104052174: goto L_0x0067;
                case 2113665925: goto L_0x0028;
                default: goto L_0x0021;
            }
        L_0x0021:
            goto L_0x0019
        L_0x0022:
            java.lang.String r0 = "ۢۤۚۨۧۨ۬ۡ۫۠ۙۜۘ۠ۜۖۘۘۘ۟ۙۖ"
            goto L_0x0019
        L_0x0025:
            java.lang.String r0 = "ۛۧۚۗۥۛۖۦ۫۟ۧ۠ۧۡۚۘۦۦۘۦ۬ۖۚۜۨۘ"
            goto L_0x0019
        L_0x0028:
            java.lang.String r0 = "android.permission.WRITE_EXTERNAL_STORAGE"
            boolean r0 = b(r0)
            if (r0 == 0) goto L_0x0025
            java.lang.String r0 = "ۘۚۛۥۦۧۘ۟ۚۨۗ۠ۚۚۖ۠ۗۧۜۘۙ۟ۜۖۡۡۗۚۥۘ"
            goto L_0x0019
        L_0x0033:
            java.lang.String r0 = "ۙۤۚۡ۟ۜ۫ۛۢۖۡۘۥ۫ۚۛۖۖۡۛ"
            goto L_0x0005
        L_0x0036:
            r4 = -1548152647(0xffffffffa3b910b9, float:-2.0064823E-17)
            java.lang.String r0 = "۫ۡۙ۬ۤۙۥۡۨۦ۟ۖۢۨۛ۟۬ۥۘ۬ۢۙۦۛ۟"
        L_0x003b:
            int r5 = r0.hashCode()
            r5 = r5 ^ r4
            switch(r5) {
                case -1062177463: goto L_0x0067;
                case 51745140: goto L_0x004a;
                case 270894074: goto L_0x0055;
                case 1783798262: goto L_0x0044;
                default: goto L_0x0043;
            }
        L_0x0043:
            goto L_0x003b
        L_0x0044:
            java.lang.String r0 = "ۘۡ۟ۢۤۚ۬۬ۨۜۘۙۗۗ۟ۦۛۖۘ۫ۡۧۘۥۜۖۘ"
            goto L_0x0005
        L_0x0047:
            java.lang.String r0 = "ۥۚۢۥۖ۫ۙۛ۫۟ۥۖۦۘ۠ۤ۠ۦۜ۬ۨۘ"
            goto L_0x003b
        L_0x004a:
            java.lang.String r0 = "android.permission.READ_EXTERNAL_STORAGE"
            boolean r0 = b(r0)
            if (r0 == 0) goto L_0x0047
            java.lang.String r0 = "ۚۦۜۙ۫ۜۡۖۧۚ۫ۖۘۚۙۨۡۗۗ"
            goto L_0x003b
        L_0x0055:
            java.lang.String r0 = "ۜۢۘۘۢ۟ۚۧۤۡۘۗ۠ۙۛۜۨۘۢۖ۫ۥۖۜ۬ۖۖۘ۠ۚ۟"
            goto L_0x003b
        L_0x0058:
            r3 = 1
            java.lang.String r0 = "ۗۜۢۚ۟۫۫ۛۥۘ۟ۨ۠۫۫ۜۚ۟ۨۗ"
            goto L_0x0005
        L_0x005c:
            java.lang.String r0 = "۠ۢ۠ۡۢۖۚۛۖ۟ۨۖۘۨ۬ۥۤۡۘۙۙۥۘ"
            r1 = r3
            goto L_0x0005
        L_0x0060:
            java.lang.String r0 = "ۤۗۚۢۦ۠۟ۗ۠ۛ۬۬۬ۙۖۤۗۘۘ۫ۨۚ"
            goto L_0x0005
        L_0x0063:
            java.lang.String r0 = "ۡ۟ۦۙۧ۠ۥۡۛۖۨۖۘۛ۬ۛۨۘ"
            r1 = r2
            goto L_0x0005
        L_0x0067:
            java.lang.String r0 = "ۖۖۨ۫ۡۖۘۤۦ۟۬ۦۢۚۦۜۘ۟ۜۦۘۥ۟ۧ"
            goto L_0x0005
        L_0x006a:
            java.lang.String r0 = "ۡ۟ۦۙۧ۠ۥۡۛۖۨۖۘۛ۬ۛۨۘ"
            goto L_0x0005
        L_0x006d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.youbasha.task.utils.isStorageGranted():boolean");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x006c, code lost:
        r0 = "ۦۙ۫۠۟ۡۘۤ۠۟ۦۤۡۦۧۘۧۙۤ۬ۤۤ";
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean isVideoFile(android.net.Uri r8) {
        /*
            r2 = 0
            r4 = 0
            java.lang.String r0 = "ۖۚۘۘ۫ۗۛۛۢۤۗۖ۬۠ۖۤۘۙۗ۬ۘۘۥۢۨۘ"
            r1 = r2
            r3 = r2
        L_0x0006:
            int r5 = r0.hashCode()
            r6 = 483(0x1e3, float:6.77E-43)
            r7 = 1224638501(0x48fe8025, float:521217.16)
            r5 = r5 ^ r6
            r5 = r5 ^ r7
            switch(r5) {
                case -1767724322: goto L_0x0072;
                case -1693095465: goto L_0x0061;
                case -1175865193: goto L_0x0068;
                case -1129567920: goto L_0x0015;
                case -1107881900: goto L_0x001f;
                case -959524276: goto L_0x0018;
                case -714043021: goto L_0x003b;
                case 555422548: goto L_0x006f;
                case 1953685957: goto L_0x0065;
                case 2058175226: goto L_0x005d;
                default: goto L_0x0014;
            }
        L_0x0014:
            goto L_0x0006
        L_0x0015:
            java.lang.String r0 = "ۥۗ۫ۧۙۙۡۜ۫۟ۥۖۚۛۖۘ۟ۤۥۙ"
            goto L_0x0006
        L_0x0018:
            java.lang.String r4 = d(r8)
            java.lang.String r0 = "ۤۗۛۥۡۧۛۦۖۘ۫۫ۖۛۡۘۤۤۖۥۨۧۘ۟ۧۘ"
            goto L_0x0006
        L_0x001f:
            r5 = 1624446104(0x60d31498, float:1.2167959E20)
            java.lang.String r0 = "ۗۡۥۥۘۥۘۧۜۛۜۦۗۗۤ۫۬ۖۢۖۙۙ۠۟۫۠"
        L_0x0024:
            int r6 = r0.hashCode()
            r6 = r6 ^ r5
            switch(r6) {
                case -1903706296: goto L_0x006c;
                case 1398462576: goto L_0x0033;
                case 1467196707: goto L_0x002d;
                case 1718329637: goto L_0x0038;
                default: goto L_0x002c;
            }
        L_0x002c:
            goto L_0x0024
        L_0x002d:
            java.lang.String r0 = "ۙۤۚۖۡ۫ۛۢۗۧ۠ۘۥۥۡۡۘ۫ۥ۟ۢ"
            goto L_0x0006
        L_0x0030:
            java.lang.String r0 = "ۢۦۜۨۦ۫ۡۢۡۘۗۤۨۘۗۙۨۙ۠ۥۘۖۚۨۘۖۘۡۘ۬ۧۦۘ"
            goto L_0x0024
        L_0x0033:
            if (r4 == 0) goto L_0x0030
            java.lang.String r0 = "ۥۦۖۘۙۜ۠۠ۧ۫ۖۦۤۧ"
            goto L_0x0024
        L_0x0038:
            java.lang.String r0 = "۟ۥۧۘ۟ۥۜۙۛ۬ۛ۬ۜۘ۬ۤۨۘۤ۫ۢ۫۫"
            goto L_0x0024
        L_0x003b:
            r5 = 323929501(0x134ec59d, float:2.6098286E-27)
            java.lang.String r0 = "۬ۖۨ۠ۙۢۚۜۚ۫ۘۖۘۥۚ۬"
        L_0x0040:
            int r6 = r0.hashCode()
            r6 = r6 ^ r5
            switch(r6) {
                case -557341614: goto L_0x005a;
                case -451840555: goto L_0x0049;
                case 1510265137: goto L_0x006c;
                case 1605493286: goto L_0x004f;
                default: goto L_0x0048;
            }
        L_0x0048:
            goto L_0x0040
        L_0x0049:
            java.lang.String r0 = "ۖۖۘۘۖ۬ۛۘۚ۬ۘۥۘۦۦۧۘ۫ۦۙۜ۠ۦ۬ۚۖۘۘۙۨۘ"
            goto L_0x0006
        L_0x004c:
            java.lang.String r0 = "ۗۧ۬ۚ۫ۦۘۦۡۨۜۢۖۘ۬ۖۦ۠ۘۘۨۦۨۘۡۧۚ"
            goto L_0x0040
        L_0x004f:
            java.lang.String r0 = "video"
            boolean r0 = r4.startsWith(r0)
            if (r0 == 0) goto L_0x004c
            java.lang.String r0 = "۠۠ۚۖۘ۟ۜۡۨۚ۬ۤۘۡۜۘۖ۠ۥۘۧۖۥۜۡۖ"
            goto L_0x0040
        L_0x005a:
            java.lang.String r0 = "ۖۛۗۗۖۖۢ۫ۚۨ۬ۡۤ۠ۗۦۤۘۘ"
            goto L_0x0040
        L_0x005d:
            r3 = 1
            java.lang.String r0 = "ۖ۫ۗۡ۫ۤۖ۫ۜ۠ۙۧۜۤ۠ۚۥۘۥۛۛ"
            goto L_0x0006
        L_0x0061:
            java.lang.String r0 = "۫ۛۘۦۦ۠۬ۛۨ۟ۘۜۘۖۨۡۘ۫ۖۚۖۘ"
            r1 = r3
            goto L_0x0006
        L_0x0065:
            java.lang.String r0 = "ۨۢۘۘۖ۟۠۫ۖ۟ۗۨۦۘۖۜۧۘ"
            goto L_0x0006
        L_0x0068:
            java.lang.String r0 = "۠۫ۨ۟۟ۚ۟ۧۗۙۜۘ۠ۦۡ"
            r1 = r2
            goto L_0x0006
        L_0x006c:
            java.lang.String r0 = "ۦۙ۫۠۟ۡۘۤ۠۟ۦۤۡۦۧۘۧۙۤ۬ۤۤ"
            goto L_0x0006
        L_0x006f:
            java.lang.String r0 = "۠۫ۨ۟۟ۚ۟ۧۗۙۜۘ۠ۦۡ"
            goto L_0x0006
        L_0x0072:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.youbasha.task.utils.isVideoFile(android.net.Uri):boolean");
    }

    public static void makeTextViewMarquee(TextView textView) {
        String str = "ۡۢۡۘ۠ۗ۬ۗ۫ۡۘۢۜۜۘۜ۫ۤۚۦۧ";
        while (true) {
            switch ((str.hashCode() ^ 389) ^ 1316810596) {
                case -999362512:
                    textView.setEllipsize(TextUtils.TruncateAt.MARQUEE);
                    str = "ۨۦۛۦۥۙۜۛۥۘۥۦۡۘ۟ۨۜۘ";
                    break;
                case -796687528:
                    return;
                case 197536261:
                    str = "ۢ۬ۚ۫ۦۙۚۦۜۨ۠ۨ۟ۢ";
                    break;
                case 918647117:
                    textView.setSelected(true);
                    str = "ۦ۫ۨۘ۠ۤۦۘ۟ۧ۫ۖۖۡۚ۫ۥۘۤۛۢ۫ۤ۬";
                    break;
                case 983953780:
                    textView.setSingleLine(true);
                    str = "ۖۚۗۗۜۗۛۙۦۤۨۘۘۤ۠ۨۘ";
                    break;
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String md5(java.lang.String r8) {
        /*
            r0 = 0
            java.lang.String r1 = "MD5"
            java.security.MessageDigest r1 = java.security.MessageDigest.getInstance(r1)     // Catch:{ NoSuchAlgorithmException -> 0x004b }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ NoSuchAlgorithmException -> 0x004b }
            r2.<init>()     // Catch:{ NoSuchAlgorithmException -> 0x004b }
            byte[] r3 = r8.getBytes()     // Catch:{ NoSuchAlgorithmException -> 0x004b }
            byte[] r3 = r1.digest(r3)     // Catch:{ NoSuchAlgorithmException -> 0x004b }
            int r4 = r3.length     // Catch:{ NoSuchAlgorithmException -> 0x004b }
        L_0x0015:
            r5 = 1953689931(0x7472f14b, float:7.6991568E31)
            java.lang.String r1 = "ۨۨۖۘۛۤۘۨۗۥۘۚۛۧۢۥۤۜ۟ۘۗ۫۠"
        L_0x001a:
            int r6 = r1.hashCode()
            r6 = r6 ^ r5
            switch(r6) {
                case -1640714279: goto L_0x0046;
                case -1145553093: goto L_0x0043;
                case 406785466: goto L_0x0023;
                case 1594351466: goto L_0x003e;
                default: goto L_0x0022;
            }
        L_0x0022:
            goto L_0x001a
        L_0x0023:
            java.lang.String r1 = "%02X"
            r5 = 1
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ NoSuchAlgorithmException -> 0x004b }
            r6 = 0
            byte r7 = r3[r0]     // Catch:{ NoSuchAlgorithmException -> 0x004b }
            java.lang.Byte r7 = java.lang.Byte.valueOf(r7)     // Catch:{ NoSuchAlgorithmException -> 0x004b }
            r5[r6] = r7     // Catch:{ NoSuchAlgorithmException -> 0x004b }
            java.lang.String r1 = java.lang.String.format(r1, r5)     // Catch:{ NoSuchAlgorithmException -> 0x004b }
            r2.append(r1)     // Catch:{ NoSuchAlgorithmException -> 0x004b }
            int r0 = r0 + 1
            goto L_0x0015
        L_0x003b:
            java.lang.String r1 = "ۤۖۙۧۛۨۘۚۗۚ۫۟۬ۤۡۘۘۙۜۘ"
            goto L_0x001a
        L_0x003e:
            if (r0 >= r4) goto L_0x003b
            java.lang.String r1 = "ۥۨۛۘۡۗۗۨۗ۠ۜۖۘ۬ۗۡۘ"
            goto L_0x001a
        L_0x0043:
            java.lang.String r1 = "ۖۛۡۘۘۤۨۢۗۜ۠ۗ۠ۙ۫ۨۘۢۖۜۖۙۘۘۥۛۗۥۜۢ"
            goto L_0x001a
        L_0x0046:
            java.lang.String r0 = r2.toString()     // Catch:{ NoSuchAlgorithmException -> 0x004b }
        L_0x004a:
            return r0
        L_0x004b:
            r0 = move-exception
            java.lang.String r0 = ""
            goto L_0x004a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.youbasha.task.utils.md5(java.lang.String):java.lang.String");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    @android.annotation.SuppressLint({"PrivateApi"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void modifyActivityForSwipeBack(android.app.Activity r8) {
        /*
            r1 = 0
            r0 = 0
            java.lang.Class<android.app.Activity> r2 = android.app.Activity.class
            java.lang.Class[] r4 = r2.getDeclaredClasses()     // Catch:{ Exception -> 0x0078 }
            int r5 = r4.length     // Catch:{ Exception -> 0x0078 }
            r2 = r0
        L_0x000a:
            r3 = 502058931(0x1deccfb3, float:6.2683436E-21)
            java.lang.String r0 = "۬ۗۤۢۙۥ۠ۥۥۛ۟ۘۖ۬ۥۥۦۚۗۧۡ۬ۦۧۘ"
        L_0x000f:
            int r6 = r0.hashCode()
            r6 = r6 ^ r3
            switch(r6) {
                case -303407989: goto L_0x004b;
                case 358105370: goto L_0x0046;
                case 975872918: goto L_0x004e;
                case 1045673522: goto L_0x0018;
                default: goto L_0x0017;
            }
        L_0x0017:
            goto L_0x000f
        L_0x0018:
            java.lang.Class<android.app.Activity> r0 = android.app.Activity.class
            r0.getDeclaredMethods()     // Catch:{ Exception -> 0x0078 }
            java.lang.Class<android.app.Activity> r0 = android.app.Activity.class
            java.lang.String r2 = "convertToTranslucent"
            r3 = 2
            java.lang.Class[] r3 = new java.lang.Class[r3]     // Catch:{ Exception -> 0x0078 }
            r4 = 0
            r3[r4] = r1     // Catch:{ Exception -> 0x0078 }
            r1 = 1
            java.lang.Class<android.app.ActivityOptions> r4 = android.app.ActivityOptions.class
            r3[r1] = r4     // Catch:{ Exception -> 0x0078 }
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r2, r3)     // Catch:{ Exception -> 0x0078 }
            r1 = 1
            r0.setAccessible(r1)     // Catch:{ Exception -> 0x0078 }
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x0078 }
            r2 = 0
            r3 = 0
            r1[r2] = r3     // Catch:{ Exception -> 0x0078 }
            r2 = 1
            r3 = 0
            r1[r2] = r3     // Catch:{ Exception -> 0x0078 }
            r0.invoke(r8, r1)     // Catch:{ Exception -> 0x0078 }
        L_0x0042:
            return
        L_0x0043:
            java.lang.String r0 = "ۧۨۘۘۖۤۡۘۘۚۖۛ۟۟ۜ۠ۘۘۡۨۙ"
            goto L_0x000f
        L_0x0046:
            if (r2 >= r5) goto L_0x0043
            java.lang.String r0 = "۬ۙۗۗۥۨۤۥۦ۠ۖۜۘۡ۟ۥۘ"
            goto L_0x000f
        L_0x004b:
            java.lang.String r0 = "۟۬ۘۘۖۢۧۘۘۦۘۧۨۘۚۨ"
            goto L_0x000f
        L_0x004e:
            r0 = r4[r2]
            r6 = 640847851(0x26328feb, float:6.19512E-16)
            java.lang.String r3 = "ۧۦۥۘ۫ۦۡۘ۬۫ۘۘ۠ۘۚۡ۬ۨۘۧ۬ۜ"
        L_0x0055:
            int r7 = r3.hashCode()     // Catch:{ Exception -> 0x0078 }
            r7 = r7 ^ r6
            switch(r7) {
                case -2070368617: goto L_0x0074;
                case -1064851307: goto L_0x005e;
                case -587498634: goto L_0x0064;
                case 2010615155: goto L_0x0073;
                default: goto L_0x005d;
            }     // Catch:{ Exception -> 0x0078 }
        L_0x005d:
            goto L_0x0055
        L_0x005e:
            java.lang.String r3 = "ۢ۟ۦۘۖۧ۫ۘۜ۟ۙۥۦۖۗۗۧۗۘ"
            goto L_0x0055
        L_0x0061:
            java.lang.String r3 = "ۤۨۛۗۤۘۖ۬ۖۧ۟ۜۘۘۢۨۘۘ۫ۘۖۨ۟ۘۢۤ"
            goto L_0x0055
        L_0x0064:
            java.lang.String r3 = r0.getSimpleName()     // Catch:{ Exception -> 0x0078 }
            java.lang.String r7 = "TranslucentConversionListener"
            boolean r3 = r3.contains(r7)     // Catch:{ Exception -> 0x0078 }
            if (r3 == 0) goto L_0x0061
            java.lang.String r3 = "۠۟ۥۚۖۨۘۖۢۡۘۨۙۖ۟ۨۡۘۤۦۢۚۘۨۘ"
            goto L_0x0055
        L_0x0073:
            r0 = r1
        L_0x0074:
            int r2 = r2 + 1
            r1 = r0
            goto L_0x000a
        L_0x0078:
            r0 = move-exception
            r0.printStackTrace()
            goto L_0x0042
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.youbasha.task.utils.modifyActivityForSwipeBack(android.app.Activity):void");
    }

    public static void openLink(Context context, String str) {
        String str2 = "ۤ۫ۜۢۧۦۢ۠ۖۨۙۢۧۖۜۘۧۛ۟۟ۨۧۡۙۨ";
        while (true) {
            switch ((str2.hashCode() ^ 720) ^ -1411568682) {
                case -1741759861:
                    str2 = "ۨۦۦۘۜۜۜۜۛۨۖۧۨۘۨۘۜۖۖۨ۬ۧۥۘ";
                    break;
                case -1320035538:
                    str2 = "ۨۙۜۤ۟ۙۙۚۥۘ۟ۖۥ۟ۢ";
                    break;
                case 458922786:
                    return;
                case 1500944364:
                    context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                    str2 = "۫ۜۧۘۢۥۨۧ۫ۥۘۧۚۥ۬ۙۜۘۖۡ۠ۥۛۙۡۙ۬۟ۗۡ";
                    break;
            }
        }
    }

    public static void resetMod() {
        shp.prefsEditor.clear().commit();
        shp.prefsEditor.putInt("text_size_pick", 16).putInt("square_photo_ratio_picker", 100).putInt("main_text", 17).putBoolean("Hide_div", false).putBoolean("my_name", false).putBoolean("PicProf", false).putBoolean("AttBt", false).putBoolean("multiChats", false).putBoolean("Conv_call_btn", false).putBoolean("log_show_name_check", true).putString("HomeEntry", "yousef").putBoolean("yo_hideinfo", false).commit();
        shp.setStringPriv("font", "Default");
        try {
            Bitmap decodeResource = BitmapFactory.decodeResource(yo.getCtx().getResources(), yo.getDrawableId("default_wallpaper"));
            FileOutputStream openFileOutput = yo.getCtx().openFileOutput("wallpaper.jpg", 0);
            decodeResource.compress(Bitmap.CompressFormat.JPEG, 70, openFileOutput);
            openFileOutput.flush();
            openFileOutput.close();
        } catch (Exception e2) {
        }
    }

    public static void restoreTheme(Context context, String str) {
        try {
            copyFile(str, getShpXML().getPath());
            File file = new File(str);
            String str2 = file.getParent() + File.separator;
            String replace = file.getName().replace(".xml", "");
            String str3 = str2 + replace + "_w.jpg";
            File file2 = new File(str3);
            String str4 = "ۥۥۚۥۧۛۥۦۨۘ۬ۗ۫ۨۚۡۡۡۜۛ۟ۡ۠ۚ۟ۦۛ";
            while (true) {
                switch (str4.hashCode() ^ 624730682) {
                    case -1093992809:
                        str4 = "ۦۥ۠ۦۦۘ۬ۙۥ۟ۦۡۚۚۘ";
                        continue;
                    case 280419214:
                        break;
                    case 715694528:
                        if (file2.exists()) {
                            str4 = "ۦۘۡۦ۫ۨۥۢۤۨۙۖۘ۫ۚۘۛۥۘۘ";
                            break;
                        } else {
                            str4 = "ۦۥۤۖۘۘۖۙۨۘۤۧۚۖ۫ۦۘۚۨۜ۠۠ۘۘ";
                            continue;
                        }
                    case 1198590405:
                        File file3 = new File(yo.datafolder + "files/wallpaper.jpg");
                        String str5 = "۠ۧۖ۟ۖۨۘۡۢۚۗۦ۫ۢ۠ۤۡۦ۫";
                        while (true) {
                            switch (str5.hashCode() ^ 1365585916) {
                                case -2136863542:
                                    str5 = "ۤۖۥۘ۫ۚۛۖ۠ۜۤ۟ۡۤۛۡۙۘ۬ۚۥۧۖۡ";
                                    continue;
                                case -2062757787:
                                    if (file3.exists()) {
                                        str5 = "۬ۡۗ۬ۥۜۡ۠ۥۘ۟ۙ۠ۜۨۧۗۙۤۥۖۡ";
                                        break;
                                    } else {
                                        str5 = "ۚۡۨۚۤۧۚۚۥۘۜۡۡ۫ۘۦۘۚ۫ۗۧۖۥ";
                                        continue;
                                    }
                                case -1785554656:
                                    break;
                                case 15355157:
                                    file3.delete();
                                    break;
                                default:
                                    continue;
                            }
                        }
                        copyFile(str3, file3.getPath());
                        e(file3);
                        break;
                    default:
                        continue;
                }
            }
            String str6 = str2 + replace + "_homeW.jpg";
            File file4 = new File(str6);
            String str7 = "ۤ۬ۙۥۚ۫ۜۖۜ۫۬ۡۖۡۡ";
            while (true) {
                switch (str7.hashCode() ^ 972753852) {
                    case -1631368861:
                        break;
                    case -1268621567:
                        File file5 = new File(others.homeBK_path);
                        String str8 = "۠ۥۡۘۛ۟۬۠ۖۨۘۨۛۥۢۧۖ۫۫ۢۚۡۡۖۖۜ۟ۢۧ";
                        while (true) {
                            switch (str8.hashCode() ^ -1936962679) {
                                case -232097608:
                                    if (file5.exists()) {
                                        str8 = "ۧۤۚۤ۫۫ۦ۫ۖۘۙۥۘۜۖۥۚۙۖۘۚۧۥۘ";
                                        break;
                                    } else {
                                        str8 = "۬ۡۦۘۖۤۦۥۤۘۘۢۧۡۘۜۗۡۘ";
                                        continue;
                                    }
                                case 292752295:
                                    str8 = "ۚ۫ۛ۠ۡۖۙۧۧۗۗۙ۬ۢۢ۠۫ۦۘ";
                                    continue;
                                case 399054487:
                                    file5.delete();
                                    break;
                                case 868589399:
                                    break;
                                default:
                                    continue;
                            }
                        }
                        copyFile(str6, file5.getPath());
                        break;
                    case 136097071:
                        if (file4.exists()) {
                            str7 = "ۗۜۖۙ۠ۤ۟ۧۘۘ۬۠ۖۙۥۚۦۨۥ";
                            break;
                        } else {
                            str7 = "ۗۤۗ۟ۤۡۨۥۤۙۘۛۤۡۨۧ۟ۛ";
                            continue;
                        }
                    case 513109439:
                        str7 = "ۘۦۜۥ۟ۙۘۛۘ۬ۚۖ۟ۗۗۜۦۙۨۦ۟۫ۛ";
                        continue;
                    default:
                        continue;
                }
            }
            yo.rebootYo();
        } catch (SecurityException e2) {
            a.i("permission_storage_need_write_access_request", context, 0);
        } catch (Exception e3) {
        }
    }

    public static void saveTheme(String str) {
        boolean z2 = false;
        File file = null;
        File file2 = null;
        File file3 = null;
        File file4 = null;
        File file5 = null;
        String str2 = null;
        StringBuilder sb = null;
        String str3 = null;
        StringBuilder sb2 = null;
        String str4 = null;
        StringBuilder sb3 = null;
        String str5 = "ۖۤۡۘۜۖۚۚۨۡۖۨۡۗۙۖ۠۫ۗۜۡۖ";
        while (true) {
            switch ((str5.hashCode() ^ 474) ^ -36467779) {
                case -2035796208:
                    String str6 = "ۦ۬ۨ۟ۚۡۖۦۡۨۡۜۘۙ۟ۜ";
                    while (true) {
                        switch (str6.hashCode() ^ -840701454) {
                            case -476005999:
                                str5 = "ۙۚۨۖۚ۫ۦ۟ۜ۬ۢ۟ۜۘ۬ۤ۠ۗۨۥ۫ۘۚۚ";
                                continue;
                            case 868823709:
                                str6 = "ۤۥۖۛۖۥۘ۫ۡۦۘۜ۫ۛۚۢۡۘۚۥ۫ۙۜۘۘ";
                                break;
                            case 1234424761:
                                str5 = "ۛ۠ۥۘۘۜۖۚۥۙۗۤۘ۠ۚۗۥ۬ۦۘ";
                                continue;
                            case 1334244294:
                                if (!z2) {
                                    str6 = "۟ۨۦۘۙۛۚۜۖ۫ۘۡۜ۫۟ۥۘ۬ۖ۠ۚۜۘۗ۟ۙ";
                                    break;
                                } else {
                                    str6 = "ۚۡۡۥ۟ۜۘۧۛۥۘ۟۬ۥۘ۠۬ۥۨۢۙۛۜۡۘ۟۫ۛۥۜ۠";
                                    break;
                                }
                        }
                    }
                    break;
                case -1904470852:
                    str4 = file3.getPath();
                    str5 = "۬ۧۢۡۛۥۚ۬ۗۡۗۥ۟ۤۛ۟۟۟ۥ۟۠ۜۙۧ";
                    break;
                case -1870694067:
                    sb.append(str);
                    str5 = "ۛ۟ۘۘۥۡۗۤۨ۠ۙۛۘۘۘۧ۫۬۫ۗۢۢۗۗۡۘۡۦۡ";
                    break;
                case -1711667072:
                    sb3.append("_homeW.jpg");
                    str5 = "ۘۚ۠ۢ۟۠ۙۤۡۙۤۘ۟۬۬۟ۡۢۙۜۨۘۧۖۛ";
                    break;
                case -1547416596:
                    sb2 = new StringBuilder();
                    str5 = "ۤۖۢ۫ۧۜۚۚۗۡۧۨۥۨۖۘ";
                    break;
                case -1468790728:
                    return;
                case -1345079291:
                    str5 = "ۜۚۨۘۦۥۢۚۡۖ۟ۥۧۦۡۖۥ۠ۤ";
                    break;
                case -1007347982:
                    z2 = shp.getBoolean("home_imgBK");
                    str5 = "ۜۖۜۘۖۡۡۘ۠۬ۗۧۧۖۧ۫ۜۥۦۥۗۜۡۢ۠ۙ";
                    break;
                case -481893428:
                    sb3.append(str);
                    str5 = "ۤۘۘۖۥۤۥۙ۫ۨ۟ۙۤۧۦ";
                    break;
                case -471776800:
                    sb2.append("_w.jpg");
                    str5 = "ۡۖۧۜۜۦۙۡ۫ۤ۟ۡۘۡۖۥۥۗۜۖ۫ۥۘۦۤۡ۫ۜۘۘ";
                    break;
                case -334185684:
                    str5 = "ۥ۫ۘۘۖۧۥۘۘۥ۠۬ۖۥۘۜ۫ۜۜۚ۠۫ۥۚ۬۠ۡ";
                    file3 = file;
                    break;
                case -281949092:
                    sb3 = new StringBuilder();
                    str5 = "ۗۦۘۘۜ۟ۦۘۙ۟ۧ۟ۤۥۦۘۘۨ۠ۘۚۘۥۖ۫ۘۦۘ";
                    break;
                case -242991527:
                    str2 = file4.getPath();
                    str5 = "ۥۘۦ۠ۛ۬ۖۡ۠ۥۤ۠ۘۡۨۘۘ۟ۥۘ۠ۗۘۗۖۘ";
                    break;
                case -188246117:
                    copyFile(str4, sb3.toString());
                    str5 = "ۛ۠ۥۘۘۜۖۚۥۙۗۤۘ۠ۚۗۥ۬ۦۘ";
                    break;
                case 16534684:
                    str3 = file5.getPath();
                    str5 = "۬ۜ۫ۢ۠ۙۘۢۦۘۖ۬ۙۢۦ";
                    break;
                case 298802865:
                    file = new File(others.homeBK_path);
                    str5 = "۬ۜۡۘ۬ۘ۠۠ۛۥ۠ۤۗۦۘ۠ۤ۠۟";
                    break;
                case 576080689:
                    copyFile(str2, sb.toString());
                    str5 = "۠ۙۦۘۜۢۘۖ۬۠ۥۢۨۘۙۢۜۗۙ۠";
                    break;
                case 685866582:
                    copyFile(str3, sb2.toString());
                    str5 = "ۧۚۖۘۤۥۘۥۡ۫ۦۘۡۘۨۥۥۖۛ۫۟۬ۘ";
                    break;
                case 755962053:
                    sb.append(".xml");
                    str5 = "ۗ۬ۛۡۜ۟ۙۥۖۜۙ۫۟ۗۜۘ";
                    break;
                case 809697392:
                    file2 = null;
                    str5 = "ۨۧۜۡۢۧ۠ۖۦۙ۟ۦ۟ۖۨۦۘۖۜۘۗۨۥۘ";
                    break;
                case 829993575:
                    sb2.append(str);
                    str5 = "ۖ۬۟ۤۙۚۡۡۜ۫ۧۥۦۙۦۘۙۚۨۘۚ۬ۨ۬۠ۜۘ";
                    break;
                case 1168090866:
                    sb = new StringBuilder();
                    str5 = "ۥ۟ۢ۠ۘۜۘ۠ۜۗۚ۫ۙۦ۟ۥۗ۬ۦۘۡۧۘۚۧ۟";
                    break;
                case 1242380623:
                    str5 = "۟ۥۧۘ۟ۗۚۖۢۦۘۤۥۗۧ۬ۜۖۤۡ";
                    break;
                case 1519605742:
                    file4 = getShpXML();
                    str5 = "ۗ۟۠ۥۛ۠ۜۡۜۘۢۨۘۢ۫ۘۘ";
                    break;
                case 1629541455:
                    file5 = new File(a.f(new StringBuilder(), yo.datafolder, "files/wallpaper.jpg"));
                    str5 = "ۜۜۥۘۨۗ۫ۘۢۖۘۖۥۨۥۡۜ۬ۨۖ";
                    break;
                case 1883630441:
                    String str7 = "ۖۚۥۘۙ۫ۖۗۨۖۛۡۡۦ۬ۨۛۙ";
                    while (true) {
                        switch (str7.hashCode() ^ 1837996546) {
                            case -104010292:
                                str7 = "۟ۖ۟ۢ۫ۤ۬ۗۛۥۗۘۛ۬ۘۧۤۘۜۤۘۘۦۚۡۥۖ";
                                break;
                            case 1000232011:
                                str5 = "ۛ۬ۦۘۘ۠ۦۘۡۜۙ۟ۘۦۘۡۜۦۘۜ۬۫ۡ۟ۦۘۘۖۧ";
                                continue;
                            case 1367910107:
                                str5 = "ۖ۫ۜۧۡۛۛ۬ۨۘۡ۫ۡۘۜۤۦۘ";
                                continue;
                            case 1655560991:
                                if (!z2) {
                                    str7 = "ۨۤۖۘۦۗۛۚۜۡۘۡۜۢۚۘ۫۟ۛۦۘۦۖ";
                                    break;
                                } else {
                                    str7 = "ۥ۠ۨۥۤۥ۫ۛۦۡ۟ۡۘۚۘۢۦۙۖ۬۬ۢۨ۫ۢ";
                                    break;
                                }
                        }
                    }
                    break;
                case 1884717451:
                    str5 = "۟ۥۧۘ۟ۗۚۖۢۦۘۤۥۗۧ۬ۜۖۤۡ";
                    file3 = file2;
                    break;
            }
        }
    }

    public static void setNavBarColor(Window window, int i2) {
        String str = "۟ۖۘۘۡۙۗۥ۬ۢۥۙۡۢۨۜ۫ۜ۬ۦۗۡۢۜۘۨ۟ۧ";
        while (true) {
            switch ((str.hashCode() ^ 686) ^ -851029852) {
                case 809354213:
                    str = "۟ۗۘۘ۫۬ۨۘۛ۠ۜۘۢۤ۠ۢۡۧۘۘۢۦ";
                    break;
                case 1823775410:
                    window.setNavigationBarColor(i2);
                    str = "ۥۜۤۦۖۘۙۛۨۘۧۤۡ۫۠ۤۥۧۘۘۡ۬ۚۨۨۡ";
                    break;
                case 1925381929:
                    str = "ۨۤۨۘۚۗۚۤۖۗۜۚۥۘۨ۠ۦۘ";
                    break;
                case 2126113094:
                    return;
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.view.Window setStatusNavColors(android.app.Activity r16, int r17, int r18) {
        /*
            r11 = 0
            r10 = 0
            r9 = 0
            r8 = 0
            r7 = 0
            r6 = 0
            r4 = 0
            r3 = 0
            r5 = 0
            java.lang.String r2 = "ۦۥۧۘۗۢۥۘۡ۠ۡۗۡۗۤۖۖۨۖ"
        L_0x000b:
            int r12 = r2.hashCode()
            r13 = 189(0xbd, float:2.65E-43)
            r14 = 994883327(0x3b4cb6ff, float:0.0031237004)
            r12 = r12 ^ r13
            r12 = r12 ^ r14
            switch(r12) {
                case -1984275366: goto L_0x00f3;
                case -1889378061: goto L_0x003f;
                case -1746415231: goto L_0x004a;
                case -1621608516: goto L_0x00bf;
                case -1489016712: goto L_0x002f;
                case -1334113591: goto L_0x0020;
                case -1196919153: goto L_0x0023;
                case -1175428787: goto L_0x0072;
                case -863024841: goto L_0x0094;
                case -770572645: goto L_0x001a;
                case -616573315: goto L_0x017c;
                case -103937774: goto L_0x00cf;
                case 91722536: goto L_0x00c4;
                case 212833059: goto L_0x00ca;
                case 312616678: goto L_0x0037;
                case 316043106: goto L_0x0127;
                case 347483605: goto L_0x00b9;
                case 435550776: goto L_0x00d4;
                case 517111198: goto L_0x012d;
                case 867976830: goto L_0x0167;
                case 984515326: goto L_0x001d;
                case 1037873255: goto L_0x004e;
                case 1077074046: goto L_0x006e;
                case 1132422412: goto L_0x013d;
                case 1375054339: goto L_0x0122;
                case 1443744838: goto L_0x002a;
                case 1489094759: goto L_0x0132;
                case 1517633607: goto L_0x0174;
                case 1935753919: goto L_0x015e;
                case 1977264802: goto L_0x0080;
                case 2125746459: goto L_0x011c;
                default: goto L_0x0019;
            }
        L_0x0019:
            goto L_0x000b
        L_0x001a:
            java.lang.String r2 = "ۡ۬ۗ۫۟ۚۘ۠ۢ۠ۚۘۙۦۤۧۖۤ"
            goto L_0x000b
        L_0x001d:
            java.lang.String r2 = "ۨۚۗ۟ۢۜۘۨۗۚۡۖۧۢ۫ۙۧۤۘۘۢۙۡ۠ۙۨۡۨۙ"
            goto L_0x000b
        L_0x0020:
            java.lang.String r2 = "ۛۡۘۜۚ۫ۥۜۜۘۨۦۛ۬ۗۖۘۜۧۚۙۛۜۘۧ۬ۡۘ"
            goto L_0x000b
        L_0x0023:
            android.view.Window r11 = r16.getWindow()
            java.lang.String r2 = "۬ۜ۫ۥۦۨ۠ۜۗۢۖۢ۠ۤۧ"
            goto L_0x000b
        L_0x002a:
            int r10 = android.os.Build.VERSION.SDK_INT
            java.lang.String r2 = "۟۬ۥۘۢۙ۬ۚ۬۫ۥۜۖۘۙۖ۫ۜۥۡۡ"
            goto L_0x000b
        L_0x002f:
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r11.addFlags(r2)
            java.lang.String r2 = "۫ۥۧۡۘۥۘ۬ۘۦۘۢۚۘۖۗۨۡۗۦۙۙ۫۫ۗۦۦۗۘ"
            goto L_0x000b
        L_0x0037:
            r2 = 134217728(0x8000000, float:3.85186E-34)
            r11.clearFlags(r2)
            java.lang.String r2 = "۟۬ۨۘۨۗۥۘ۬ۤۡۘۗۦۢۘۛۙ۫ۡۘ"
            goto L_0x000b
        L_0x003f:
            android.view.View r2 = r11.getDecorView()
            int r9 = r2.getSystemUiVisibility()
            java.lang.String r2 = "ۤۖۧۚۧۜۘ۬ۙۜۙ۠۠ۛ۬ۨۖۨۖۘ"
            goto L_0x000b
        L_0x004a:
            java.lang.String r2 = "۟۬ۙ۟ۥۙۜ۬ۡ۟۬ۖ۬ۗۦۘۧ۠ۙۡۙۜ۬ۗ۠ۚ"
            r6 = r9
            goto L_0x000b
        L_0x004e:
            r12 = 841419285(0x32270a15, float:9.722972E-9)
            java.lang.String r2 = "ۜۨۧۛۤ۟ۥ۬ۡۘ۬۬ۡۚۢۡ۟۬ۦۤۨۥۦۦۡۘۗۧۖۘ"
        L_0x0053:
            int r13 = r2.hashCode()
            r13 = r13 ^ r12
            switch(r13) {
                case -1917505210: goto L_0x0080;
                case 662905655: goto L_0x005c;
                case 832166813: goto L_0x006b;
                case 2021633585: goto L_0x0068;
                default: goto L_0x005b;
            }
        L_0x005b:
            goto L_0x0053
        L_0x005c:
            r2 = -11
            r0 = r17
            if (r0 == r2) goto L_0x0065
            java.lang.String r2 = "ۨۧۡ۠ۡۦۘۗۥۦۘ۟۠ۡۘ۬ۢۖۖۘۦ۬ۖۘۛۥۤۢ۠۟"
            goto L_0x0053
        L_0x0065:
            java.lang.String r2 = "ۦۦۧۘۧۥۙۥۚۡۘ۬۫ۜ۠ۘۡۧ۬ۚ"
            goto L_0x0053
        L_0x0068:
            java.lang.String r2 = "۠ۨۛ۫ۢۙ۫۬۟ۨۘۘۗۧۘۘۖۘۢۗۨ"
            goto L_0x0053
        L_0x006b:
            java.lang.String r2 = "ۙۘۖۦۢۙۗ۟ۨۢۨۗۛۚۛۖۥۤۤۤ۠۬ۡ۟ۧ۫ۚ"
            goto L_0x000b
        L_0x006e:
            java.lang.String r2 = "ۛۜۛۧۛۦۜ۫ۘۙۢۡۘۨ۟ۜۘ۫ۜۤ"
            r6 = r9
            goto L_0x000b
        L_0x0072:
            r12 = -1634526745(0xffffffff9e9319e7, float:-1.5574943E-20)
            java.lang.String r2 = "ۤۥۚۢۜۘۧۘۦۦۥۡۘۗۚۢۢۥۗۛۛ"
        L_0x0077:
            int r13 = r2.hashCode()
            r13 = r13 ^ r12
            switch(r13) {
                case -1160268452: goto L_0x0086;
                case -793772819: goto L_0x008d;
                case -419966789: goto L_0x0080;
                case 1853679586: goto L_0x0090;
                default: goto L_0x007f;
            }
        L_0x007f:
            goto L_0x0077
        L_0x0080:
            java.lang.String r2 = "۠ۘۡۘ۟۟ۗۚۗۤۘ۠ۦۘۜۡۥۘ۬۫۠"
            goto L_0x000b
        L_0x0083:
            java.lang.String r2 = "ۚۥۙۖۡۚۨۗۛۦۦۖۘۙ۫ۜۘۧ۠ۤ۟ۘۥۘ"
            goto L_0x0077
        L_0x0086:
            r2 = 23
            if (r10 < r2) goto L_0x0083
            java.lang.String r2 = "ۤۚۦۙ۠ۘۛۜ۟ۦۧۙۥۡۢۛۥۢۗ"
            goto L_0x0077
        L_0x008d:
            java.lang.String r2 = "ۥۢ۫ۗۗۨۘۜۥۡۨ۫ۡۘۛۛۜ۫ۨ"
            goto L_0x0077
        L_0x0090:
            java.lang.String r2 = "ۨۧۖۘ۠ۢۨۘۙ۫ۡۘۚۖۜۘۥۖۡۢۜ۫"
            goto L_0x000b
        L_0x0094:
            r12 = 617198213(0x24c9b285, float:8.747228E-17)
            java.lang.String r2 = "ۤۤۘۢ۠ۥۘۤ۠ۗ۟ۛۨۘۘۗۘ۫ۦۗۥۜۢ"
        L_0x0099:
            int r13 = r2.hashCode()
            r13 = r13 ^ r12
            switch(r13) {
                case -1512201079: goto L_0x0170;
                case 736171189: goto L_0x00b5;
                case 919620015: goto L_0x00a8;
                case 1117194386: goto L_0x00a2;
                default: goto L_0x00a1;
            }
        L_0x00a1:
            goto L_0x0099
        L_0x00a2:
            java.lang.String r2 = "۠ۨۘۘۗ۬ۨۘۘۤۜۘۡۜۚۦۨۘ۠ۘۥ۬ۨۘۨۖۙ"
            goto L_0x0099
        L_0x00a5:
            java.lang.String r2 = "۠۫ۢۢۡۚۚۥۜ۫ۙ۬۬۫ۗۙۨۥۘۗۨۡۘۛۗۨۙۚۨۘ"
            goto L_0x0099
        L_0x00a8:
            r14 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            r0 = r17
            boolean r2 = isColorBright(r0, r14)
            if (r2 == 0) goto L_0x00a5
            java.lang.String r2 = "۠۬ۡۘۚۜۖۘۜۥۙۘۢ۫ۘ۠ۥۘۛۨۖۛ۬ۧۡۡۡۘ"
            goto L_0x0099
        L_0x00b5:
            java.lang.String r2 = "ۖۚۥ۟ۙۘۥۛ۬ۤۨۤۚۗۛ"
            goto L_0x000b
        L_0x00b9:
            r8 = r9 | 8192(0x2000, float:1.14794E-41)
            java.lang.String r2 = "۟ۛۘۡۧۦ۬ۤۜۗۚ۠ۙۗۗۛۗۡۚۛۖۚۛۡۘ۠ۥۧ"
            goto L_0x000b
        L_0x00bf:
            java.lang.String r2 = "ۜۛ۟ۧۘۦ۟ۘۨۘۦۙۥۘ۠ۖۛۚۧۦۘ"
            r6 = r8
            goto L_0x000b
        L_0x00c4:
            r7 = r9 & -8193(0xffffffffffffdfff, float:NaN)
            java.lang.String r2 = "۟ۦ۟ۧۚ۬۟ۖۖۛۦۘۧۘۥۥۡۛۛۦۦ"
            goto L_0x000b
        L_0x00ca:
            java.lang.String r2 = "۠ۘۡۘ۟۟ۗۚۗۤۘ۠ۦۘۜۡۥۘ۬۫۠"
            r6 = r7
            goto L_0x000b
        L_0x00cf:
            java.lang.String r2 = "ۘۤۦۗۘۧ۫ۘۗۙۡ۬ۦۥۤ۠۫ۤ"
            r5 = r6
            goto L_0x000b
        L_0x00d4:
            r12 = 921001211(0x36e55cfb, float:6.835556E-6)
            java.lang.String r2 = "ۦ۠۬ۤۚۖۥۛ۬ۛۥۦۨۢۗۘۧۡ۫ۖۧۧۜۘ"
        L_0x00d9:
            int r13 = r2.hashCode()
            r13 = r13 ^ r12
            switch(r13) {
                case -481071721: goto L_0x00ec;
                case 1587989650: goto L_0x0174;
                case 1827614424: goto L_0x00ef;
                case 2089122123: goto L_0x00e2;
                default: goto L_0x00e1;
            }
        L_0x00e1:
            goto L_0x00d9
        L_0x00e2:
            r2 = 26
            if (r10 < r2) goto L_0x00e9
            java.lang.String r2 = "۠ۦۙۜۚۦ۬ۛۨۘۖۨۙۥ۟ۦۚ۟۬۠۬ۜۘۙۜۥۘ"
            goto L_0x00d9
        L_0x00e9:
            java.lang.String r2 = "ۢ۠ۖۖۛۥۘ۟ۛ۬۟۬ۤ۟ۘۥ۟ۨۦۘ۬ۥۘۘ"
            goto L_0x00d9
        L_0x00ec:
            java.lang.String r2 = "ۧ۫ۤۘۖۖۘۚۡۨۘۥ۠۫۟ۥ۟ۜۙۖۘۥۘۧۘ"
            goto L_0x00d9
        L_0x00ef:
            java.lang.String r2 = "ۖۤۘۘ۫ۥۦۘۨۤۛۚۜۖ۫ۘۘۘۗ۬ۥۛۨ۫ۧۛ۬ۧ۬۫"
            goto L_0x000b
        L_0x00f3:
            r12 = -34971366(0xfffffffffdea611a, float:-3.8942941E37)
            java.lang.String r2 = "۬۬ۨۘۢ۬ۚۦ۫ۦۘۤۦۦۘ۬ۤ۠ۚ۫ۦۘ"
        L_0x00f8:
            int r13 = r2.hashCode()
            r13 = r13 ^ r12
            switch(r13) {
                case -2015743523: goto L_0x0115;
                case -1740195795: goto L_0x0101;
                case -1156666328: goto L_0x0118;
                case -127478758: goto L_0x0108;
                default: goto L_0x0100;
            }
        L_0x0100:
            goto L_0x00f8
        L_0x0101:
            java.lang.String r2 = "ۖۨۦۘۚۨۡۘۦ۟ۛۢ۬ۚۥۢۜۘۢۢۜۘۢۘۙۘۘۗ"
            goto L_0x000b
        L_0x0105:
            java.lang.String r2 = "ۙۢۦۚۘۢ۬ۥۦۧۚۚ۟ۙۗۨ۟۠۟ۖۛ"
            goto L_0x00f8
        L_0x0108:
            r14 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            r0 = r18
            boolean r2 = isColorBright(r0, r14)
            if (r2 == 0) goto L_0x0105
            java.lang.String r2 = "ۗ۟ۢۨۘۤ۟ۨۦۘ۫ۦۤۜۜۧۘ۠ۛۚۨۚۜۙۨۦ"
            goto L_0x00f8
        L_0x0115:
            java.lang.String r2 = "۠۫ۘۘۙۥۘۜ۫ۡ۠ۛۨۦ۫ۛۢۥۥۘۘ۫ۧۢ۫۟"
            goto L_0x00f8
        L_0x0118:
            java.lang.String r2 = "۫ۦۨۙ۠ۖۙۖۙۢۨۤۚۜ۠ۢۨۨ۬ۧۡۘ۫ۢۤ۠ۛۧ"
            goto L_0x000b
        L_0x011c:
            r4 = r6 | 16
            java.lang.String r2 = "۠ۦۨۙۛ۫ۛ۠ۦ۟ۡۗۙۤۤۘ۫ۜ۠ۛۗۨۘۘۘ"
            goto L_0x000b
        L_0x0122:
            java.lang.String r2 = "۠ۤۦۘ۫ۘۦۘۢۧۖۘۗۙۡۘۚۨۨ"
            r5 = r4
            goto L_0x000b
        L_0x0127:
            r3 = r6 & -17
            java.lang.String r2 = "۠ۗۨۗۦۡۘ۬ۤۖۘۧۘۧۘۜۚۜۘۢۛ۠ۧۙۡۘۦ۟ۘۘ"
            goto L_0x000b
        L_0x012d:
            java.lang.String r2 = "۫ۙۖۦۢۡۘ۠ۨۘۦۚۗۙۢۙۤۘۢۤۘۥ"
            r5 = r3
            goto L_0x000b
        L_0x0132:
            android.view.View r2 = r11.getDecorView()
            r2.setSystemUiVisibility(r5)
            java.lang.String r2 = "۟ۚۦ۟ۖ۟ۨ۠ۨۚ۠۬ۙۢۡۘۛۘۨ۫۠ۘۖۜ۟"
            goto L_0x000b
        L_0x013d:
            r12 = -1966199954(0xffffffff8ace2b6e, float:-1.9853415E-32)
            java.lang.String r2 = "ۛۗ۟ۦۘۦۨۡۛۛۘۘۘۘۚۤۤۨۜۛۛ۠۬ۡۥۘ۠ۡۜ"
        L_0x0142:
            int r13 = r2.hashCode()
            r13 = r13 ^ r12
            switch(r13) {
                case -1765740120: goto L_0x0178;
                case -1044909447: goto L_0x014b;
                case -982103230: goto L_0x015a;
                case 1454975707: goto L_0x0157;
                default: goto L_0x014a;
            }
        L_0x014a:
            goto L_0x0142
        L_0x014b:
            r2 = -11
            r0 = r17
            if (r0 == r2) goto L_0x0154
            java.lang.String r2 = "ۤ۬۠ۢ۬ۡۘۤۨۛۜۚۢۥۨ۟ۙۚۥۘۦۥۘۘۧۖۘۘۢۖۡ"
            goto L_0x0142
        L_0x0154:
            java.lang.String r2 = "ۖۚۜۘ۠ۙۜۘۢۢۜۘ۫ۧۢۢۨۧۘۘۗ۠۫ۥۘۚۜۘۜۡۘ"
            goto L_0x0142
        L_0x0157:
            java.lang.String r2 = "ۘۤۛۦۢۗ۬ۤۜۨۢۗۢۘۧ"
            goto L_0x0142
        L_0x015a:
            java.lang.String r2 = "ۢ۟ۧۡۧۥۖ۬ۙۦۚ۫ۧۗۜۘۚۧ۟"
            goto L_0x000b
        L_0x015e:
            r0 = r17
            r11.setStatusBarColor(r0)
            java.lang.String r2 = "ۢۢۘۘۤۚۚۡۘۘۢۛۗۜۛۜ"
            goto L_0x000b
        L_0x0167:
            r0 = r18
            setNavBarColor(r11, r0)
            java.lang.String r2 = "ۢۛۡۘۡۗ۠ۨۢ۟۫۟ۘۘۜ۠ۢ"
            goto L_0x000b
        L_0x0170:
            java.lang.String r2 = "ۢ۬۟ۛ۠ۖۘ۫۟ۡۜۜ۬ۨ۟ۨ۬۠"
            goto L_0x000b
        L_0x0174:
            java.lang.String r2 = "۫ۙۖۦۢۡۘ۠ۨۘۦۚۗۙۢۙۤۘۢۤۘۥ"
            goto L_0x000b
        L_0x0178:
            java.lang.String r2 = "ۢۢۘۘۤۚۚۡۘۘۢۛۗۜۛۜ"
            goto L_0x000b
        L_0x017c:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.youbasha.task.utils.setStatusNavColors(android.app.Activity, int, int):android.view.Window");
    }

    public static void showNotification(Context context, String str, String str2, int i2, Intent intent) {
        Notification.Builder builder;
        try {
            PendingIntent activity = PendingIntent.getActivity(context, 0, intent, 67108864);
            NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
            String str3 = "۬۬ۥۘۤۢۨۥۜ۬ۧ۬ۢۦۥۘۘۡ۟ۤ۬ۗۦۘۧۧۧ";
            while (true) {
                switch (str3.hashCode() ^ -1739057136) {
                    case -2124477074:
                        str3 = "ۚۨۜۘ۬۫ۦۘۡۜۤۢۛۚ۫ۨۚ";
                        continue;
                    case -1899938158:
                        if (Build.VERSION.SDK_INT >= 26) {
                            str3 = "ۖۥۜۘۖۢ۠۟۬ۖ۟ۛۘ۫ۚ۬ۥۦۢۘۖ";
                            break;
                        } else {
                            str3 = "ۦ۫ۡۘۢۦ۟ۗ۫ۦۘ۠ۧۖ۠ۨ۫۫۠ۢۢۖۦۘۧ۬ۘۘ";
                            continue;
                        }
                    case -593544753:
                        builder = new Notification.Builder(context);
                        break;
                    case 2147043546:
                        builder = new Notification.Builder(context, "fm_channel");
                        notificationManager.createNotificationChannel(new NotificationChannel("fm_channel", "OBMods", 4));
                        break;
                    default:
                        continue;
                }
            }
            builder.setSmallIcon(i2).setContentTitle(str).setContentText(str2).setAutoCancel(true).setSound(RingtoneManager.getDefaultUri(2)).setContentIntent(activity);
            notificationManager.notify(1911, builder.build());
        } catch (Exception e2) {
        }
    }

    public static void updateDrawableColor(Drawable drawable, int i2) {
        String str = "۫۬ۡۢ۠ۦۤۡۨۥۚۙۨۢۚۛۛۥ";
        while (true) {
            switch ((str.hashCode() ^ 641) ^ -239247280) {
                case -1264498249:
                    str = "ۛۗ۠ۡۦ۠ۚ۠ۗۥۦۖۛۜۛۥۡۨۘ";
                    break;
                case -578287037:
                case 1589245647:
                    return;
                case 914706714:
                    str = "۫۠ۥۘۜۥۡۛۥۖۘۛۜ۫۫ۦۛ";
                    break;
                case 1369667171:
                    drawable.setTint(i2);
                    str = "۟ۜۧۘۙۗۜۘۡۤ۟۬۠۬ۚۗۜۚۛۡۘ۟ۨۖۘۚۗۙ";
                    break;
                case 1770149027:
                    String str2 = "ۦۘۡۘۡ۬۠۠ۢ۫ۚ۬ۨۘۗ۫ۦۘ";
                    while (true) {
                        switch (str2.hashCode() ^ 1530463670) {
                            case -1223474981:
                                str = "ۗۡ۫ۙۛۜ۫۠۠ۗ۫ۚۦ۫ۘۢۖۡۘۘۧۜۘ۫ۖۘۛ۫ۚ";
                                continue;
                            case 599189328:
                                str = "ۗۙۦۛۚۨۘۗۥۘۛۙۘۘۙ۟ۡۘ";
                                continue;
                            case 1208606633:
                                str2 = "ۦۜۜۘ۠ۗۥۚ۠ۨۘۦ۬ۦۘ۬ۤۤۨ۟۟";
                                break;
                            case 1260600659:
                                if (drawable != null) {
                                    str2 = "۬۬۬ۜۗۦۘۥ۠ۨۨۤۘۘۜۦۧ";
                                    break;
                                } else {
                                    str2 = "۫ۜ۫۬ۘۘۘۦۧۘۘ۫ۘۜۘ۬ۖ۠۠ۢ۟ۤ۬";
                                    break;
                                }
                        }
                    }
                    break;
            }
        }
    }

    public static int vs() {
        String str = "ۧۡۜۘ۟ۜۜ۠ۦ۬ۗۜۘ۠ۜۥ۫۟ۤۨ۠۫ۡۨ";
        int i2 = 0;
        int i3 = 0;
        String str2 = null;
        int i4 = 0;
        int i5 = 0;
        String str3 = null;
        String str4 = null;
        while (true) {
            switch ((str.hashCode() ^ 287) ^ -131121440) {
                case -1858160766:
                    str = "ۧۗۡۘۗ۫ۗۦ۬ۦۘ۠ۜۥۘۦۨۘۘ";
                    str4 = md5(bsf(yo.getString("jo_mods"), 1));
                    break;
                case -1018530249:
                    i4 = str3.length() + i5;
                    str = "ۗ۫ۦۗۥۥۨ۟ۤۧۛۦۘ۠ۙۘۘ";
                    break;
                case -82591590:
                    str = "ۗ۬۫ۘ۫ۡۘۘۤ۫ۜۚۚۛۤۤۡۥۦۘۥۥۖۘ۫ۨۥۘ";
                    str3 = dbsf("WVVoU01HTkViM1pNTTFaM1drZEdNRnBUTlhaaVYwWjVaREpvYUdSSVRYVlpXRUoz", 3);
                    break;
                case 389715706:
                    String str5 = "ۤۤۦۧۖۛ۬ۚۛۜ۠۬ۘۦۘ";
                    while (true) {
                        switch (str5.hashCode() ^ 112542005) {
                            case -1833286698:
                                str = "ۗۚۜۘۙۧۗۤۜۖۘۥ۫۟۠ۡۘ۬ۙ۟ۦۤ۫ۗ";
                                continue;
                            case -146742766:
                                str5 = "ۗۨۚۨ۠ۦۘۦ۟ۘۘ۬ۖۡۘۦۖۤۤۢۖۘ۬ۨ";
                                break;
                            case -92099747:
                                str = "ۖۨۘۥۚۥۘۥۘ۬ۨۗۖۘ۬۫ۦۘۥ۠ۜۜۨۖۘ۫ۧۜۢۛۙ";
                                continue;
                            case 1295482940:
                                if (!bsf(str2, 1).equals("WVVoU01HTkViM1pNTTFaM1drZEdNRnBUTlhaaVYwWjVaREpvYUdSSVRYVlpXRUoz")) {
                                    str5 = "ۘۧۘۘۘۦۨۘۘۡۥۘۤۧ۫ۜۥۨ۫۬۬ۗۦۢ۠۠";
                                    break;
                                } else {
                                    str5 = "ۧۙۛ۠۫ۖۗۧۨۘۨ۟ۧۡۨۧۘ۠ۖۧۧۧۜۘ";
                                    break;
                                }
                        }
                    }
                    break;
                case 969593841:
                    return i2;
                case 1027632268:
                    str = "ۚۢ۟۠ۢۥۘۛۧۚۖۧۡۘۨ۫ۛ";
                    i2 = i4;
                    break;
                case 1154778781:
                    yo.Homeac.runOnUiThread(new d0(8));
                    str = "ۖۥۤ۫ۚۡۘۙ۠ۘۘۦ۠۠ۙۜ۟ۛۜۦۘۧۦ۬ۡۛۡۘ";
                    break;
                case 1158212888:
                    str = "ۜ۫ۦۡۥۘ۫ۨۥۘۚۚۥۘۧۙۥۘ";
                    str2 = bsf(str3, 2);
                    break;
                case 1526299161:
                    str = "ۨۡۗۥۨۨ۠ۙ۬ۧۜۥۙۙۜۘۧ۬ۖۖ۫ۜ";
                    i2 = i3;
                    break;
                case 1658181513:
                    str = "ۚۢ۟۠ۢۥۘۛۧۚۖۧۡۘۨ۫ۛ";
                    break;
                case 1843043237:
                    i3 = i4 + str2.length();
                    str = "۟ۤ۠ۗۥۖۘ۬ۤۦۥۡۙۘۨ۬ۨۜۨۘۚۥۨ۟ۤۢ";
                    break;
                case 1985886713:
                    str = "ۧۥۧۘۨ۟ۥۘ۟ۛۡۘۥۢ۬۠ۛۗۖۗۢ";
                    i5 = str4.length();
                    break;
            }
        }
    }
}
