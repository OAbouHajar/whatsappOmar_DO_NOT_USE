package com.cat.ereza.customactivityoncrash;

import a.a;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Process;
import com.obwhatsapp.yo.yo;
import com.obwhatsapp.youbasha.task.utils;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.zip.ZipFile;

@SuppressLint({"NewApi"})
public final class CustomActivityOnCrash {

    /* renamed from: a  reason: collision with root package name */
    public static Application f209a;

    /* renamed from: b  reason: collision with root package name */
    public static WeakReference f210b = new WeakReference((Object) null);

    /* renamed from: c  reason: collision with root package name */
    public static boolean f211c = false;

    /* renamed from: d  reason: collision with root package name */
    public static boolean f212d = true;

    /* renamed from: e  reason: collision with root package name */
    public static boolean f213e = true;

    /* renamed from: f  reason: collision with root package name */
    public static boolean f214f = true;

    /* renamed from: g  reason: collision with root package name */
    public static int f215g = yo.getID("customactivityoncrash_error_image", "drawable");

    /* renamed from: h  reason: collision with root package name */
    public static Class f216h = null;

    /* renamed from: i  reason: collision with root package name */
    public static Class f217i = null;

    /* renamed from: j  reason: collision with root package name */
    public static EventListener f218j = null;

    public interface EventListener extends Serializable {
        void onCloseAppFromErrorActivity();

        void onLaunchErrorActivity();

        void onRestartAppFromErrorActivity();
    }

    static {
        String str = "۫ۛۥ۟۫ۘۡۚۦۡۧۖۙۜ";
        while (true) {
            switch ((str.hashCode() ^ 625) ^ -311115407) {
                case -1544727114:
                    str = "ۗ۫ۚۥۥۨۖۖۥۘۡۛۙ۫ۘۦۘ۟ۢۢ";
                    break;
                case 370361780:
                    str = "ۨۤۦۤۦۙۧۢۘۘۘۗۖۛۡۗ";
                    break;
                case 519570850:
                    return;
                case 593531562:
                    str = "ۛ۠۠ۨۨ۫ۚۖۧۧۧۥۥۤۧۖۧۖۘ۫ۗۙۗۚ۫ۡۙۥ";
                    break;
                case 1644209128:
                    str = "ۨ۬ۧ۫ۦۜۘۙ۟ۡۢۚۜۘۧۡۘۘۥۦ۟ۢ۠۟ۤۙ۟۟ۦۡۘ";
                    break;
                case 1650125974:
                    str = "ۥ۫ۜۤ۫ۘۘۨۦۛ۠ۙۦۙۥۙ۬ۤۢ";
                    break;
                case 1703259684:
                    str = "۠۠ۧۡ۟ۡۘۖ۠ۥۘۖ۟ۜۘۚۢۜۚ۟ۜۘۚۤ۫ۢۡۜۘۚۘۧۘ";
                    break;
                case 1785256065:
                    str = "ۨۗۜۥۦۖۢۡۦۘ۫ۤۨۘۛۘۥ";
                    break;
                case 1899607421:
                    str = "۬۬ۡۘۚۖۘۙۤۨ۬۠ۦۚۨ";
                    break;
                case 2020474054:
                    str = "ۗ۫ۡۦۛۨۨۡ۟ۦۡۢ۟۫ۨۚۖۖۘۨ۫ۜۧۨ۫";
                    break;
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String a(java.lang.String r7) {
        /*
            r3 = 0
            r1 = 0
            java.lang.String r0 = "ۢۡۛۖ۟ۧ۬۠ۧ۟ۛ۟ۧۛۧۘۛ۟۟ۖۖۘ"
            r2 = r3
        L_0x0005:
            int r4 = r0.hashCode()
            r5 = 197(0xc5, float:2.76E-43)
            r6 = 1641729105(0x61dacc51, float:5.045141E20)
            r4 = r4 ^ r5
            r4 = r4 ^ r6
            switch(r4) {
                case -922473656: goto L_0x0085;
                case -776734746: goto L_0x00a0;
                case -70965392: goto L_0x0017;
                case 753855247: goto L_0x00a1;
                case 879128203: goto L_0x0053;
                case 920366720: goto L_0x0014;
                case 1054949109: goto L_0x00a8;
                case 1485838715: goto L_0x0033;
                case 1579166408: goto L_0x009c;
                case 1944845304: goto L_0x005a;
                case 2013839014: goto L_0x0090;
                case 2126735886: goto L_0x007d;
                default: goto L_0x0013;
            }
        L_0x0013:
            goto L_0x0005
        L_0x0014:
            java.lang.String r0 = "ۡ۬ۘۘۙ۟ۧۖۘۥۥۦۖۘۙۦۖۥۤۡۧۛۖۘۤ۟ۛۦۡ۠"
            goto L_0x0005
        L_0x0017:
            r4 = 1743857980(0x67f1293c, float:2.2777019E24)
            java.lang.String r0 = "۠ۜۨۙۢۛۧۛۢۖۜۥۘۦۚۢ"
        L_0x001c:
            int r5 = r0.hashCode()
            r5 = r5 ^ r4
            switch(r5) {
                case -1993460733: goto L_0x00a8;
                case -1618551011: goto L_0x0030;
                case 570996337: goto L_0x0025;
                case 655065536: goto L_0x002d;
                default: goto L_0x0024;
            }
        L_0x0024:
            goto L_0x001c
        L_0x0025:
            if (r7 == 0) goto L_0x002a
            java.lang.String r0 = "ۡۚۚۡۥ۬۬ۗۧۛۘۘ۬ۖۨۨۙۡۘ۠ۖۨۘۥۘۛۧۡۘ"
            goto L_0x001c
        L_0x002a:
            java.lang.String r0 = "ۙۦ۟۫ۘ۫ۧۗۢۙۦۥ۫ۦۘۘ۬ۢۜۘ"
            goto L_0x001c
        L_0x002d:
            java.lang.String r0 = "۫ۥۛۖۛۚۦۗۚۢۥۙۥۜۙ"
            goto L_0x001c
        L_0x0030:
            java.lang.String r0 = "ۘۥۛۧ۬ۡۘۤۙۘۖ۠ۡۛۤۥۘۜۙۤۨۦۢۘۘۙۚۧۘۘ"
            goto L_0x0005
        L_0x0033:
            r4 = -512165679(0xffffffffe178f8d1, float:-2.870451E20)
            java.lang.String r0 = "۟۠ۛۤ۬ۜۘۤۚۚۦۖۘۖۨۘۘ۫ۦۦۥۙۡۘ۠ۦۧۘۜۦ۬"
        L_0x0038:
            int r5 = r0.hashCode()
            r5 = r5 ^ r4
            switch(r5) {
                case -416600022: goto L_0x00a4;
                case 433565022: goto L_0x0050;
                case 1054135640: goto L_0x0047;
                case 1170269920: goto L_0x0041;
                default: goto L_0x0040;
            }
        L_0x0040:
            goto L_0x0038
        L_0x0041:
            java.lang.String r0 = "۠۠ۖۗ۫ۜۘۙۡ۠ۥۘۤۢۗۨۘۜۖۗۜۛۡۧۥۖۤ۫ۗ"
            goto L_0x0005
        L_0x0044:
            java.lang.String r0 = "ۦۜۥۘۖۤۨ۟۬ۦۥۨۜۘۚ۫۬ۡۘۛۘۤۙۨۜۘۗۛۨۘ"
            goto L_0x0038
        L_0x0047:
            int r0 = r7.length()
            if (r0 != 0) goto L_0x0044
            java.lang.String r0 = "ۨۥۦۘۥۨۘۛۢۦۘ۟ۧۙ۬ۗۥ۬۫ۡ۫ۦۤ"
            goto L_0x0038
        L_0x0050:
            java.lang.String r0 = "ۗ۠ۡۘۨۡۛۤۡۚۨۨ۟ۧۗ۟ۛۖۦۘۤۢۥۘۢۧ۫ۢۖ"
            goto L_0x0038
        L_0x0053:
            char r2 = r7.charAt(r3)
            java.lang.String r0 = "۠ۦۥۙۖۧۘۡۘۤۙۜۙۙۜۖۨۤ۠ۗ۬ۜۡۦۦۙۤ"
            goto L_0x0005
        L_0x005a:
            r4 = 1203915339(0x47c24a4b, float:99476.586)
            java.lang.String r0 = "ۜۧۖ۫ۡۤۡۖ۟ۡ۫ۡۤ۬۟ۘۤ۟۟ۖۘۤ۬ۨ"
        L_0x005f:
            int r5 = r0.hashCode()
            r5 = r5 ^ r4
            switch(r5) {
                case -1546158738: goto L_0x0077;
                case 549716113: goto L_0x0068;
                case 1587989760: goto L_0x006e;
                case 1906305759: goto L_0x007a;
                default: goto L_0x0067;
            }
        L_0x0067:
            goto L_0x005f
        L_0x0068:
            java.lang.String r0 = "ۧۥۘۘۖۨۘۦۖۥۘۗ۫ۥۘۘۖۖۘۛۘۧۨۚۨۘ"
            goto L_0x0005
        L_0x006b:
            java.lang.String r0 = "۠ۡ۟۫ۛۗۘ۬ۤۥۖۜۘۗ۫ۦۘ"
            goto L_0x005f
        L_0x006e:
            boolean r0 = java.lang.Character.isUpperCase(r2)
            if (r0 == 0) goto L_0x006b
            java.lang.String r0 = "ۗۛۥۨ۠ۛ۬۠ۦۢۙ۫ۡۖۜ۠ۜۛۥ۬ۧۜۙۤۦۨ"
            goto L_0x005f
        L_0x0077:
            java.lang.String r0 = "ۡۖۧۘۚۖۢ۟ۤۡۘۧۛۢ۫ۦۙ۠ۢۗۢ۫ۦ"
            goto L_0x005f
        L_0x007a:
            java.lang.String r0 = "ۥ۟۬ۨ۬ۧۙۘۧۘ۫۫ۖۘ۫۠ۗۙۨۡۘ۬۠۫"
            goto L_0x0005
        L_0x007d:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "۠ۘۦۘۖۢۗۖۥۧ۫ۚ۠ۨۘۚ۫ۚۤۨ۟"
            goto L_0x0005
        L_0x0085:
            char r0 = java.lang.Character.toUpperCase(r2)
            r1.append(r0)
            java.lang.String r0 = "ۥۡۘۘۖۙۡ۬ۖۥ۫ۛۜۘ۟ۨۡۘۤ۟ۙ۬ۥ"
            goto L_0x0005
        L_0x0090:
            r0 = 1
            java.lang.String r0 = r7.substring(r0)
            r1.append(r0)
            java.lang.String r0 = "ۜۤۧۨ۟ۦۘ۬۫ۚۨۖۜۘۧۖۨۘ"
            goto L_0x0005
        L_0x009c:
            java.lang.String r7 = r1.toString()
        L_0x00a0:
            return r7
        L_0x00a1:
            java.lang.String r7 = ""
            goto L_0x00a0
        L_0x00a4:
            java.lang.String r0 = "۠۫ۨۘ۫ۡ۫ۚ۟ۚۨۦ۫۠ۜۧۘۛ۬ۡۘۗۖۤ۠ۧۦۘۖ۠۠"
            goto L_0x0005
        L_0x00a8:
            java.lang.String r0 = "ۤۢ۬ۥ۫ۢۖۡ۟ۗ۬ۚۡۦۡۘ"
            goto L_0x0005
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cat.ereza.customactivityoncrash.CustomActivityOnCrash.a(java.lang.String):java.lang.String");
    }

    @Deprecated
    public static void closeApplication(Activity activity) {
        String str = "ۗ۟۟۫ۦۥۘ۟ۙۥۥ۠ۘۘ۫ۨ";
        while (true) {
            switch ((str.hashCode() ^ 510) ^ -1011680484) {
                case 11199964:
                    return;
                case 897782320:
                    closeApplication(activity, (EventListener) null);
                    str = "ۚۜۧۙۙۢ۠ۦۧۚۘۥ۟ۨ۟ۤۙۥۛۜ";
                    break;
                case 1749290140:
                    str = "۬ۨۤۤ۟ۡۘۜۘ۠ۥۜ۫ۚۜ۟ۧ۠ۡ۟ۜۘۘ";
                    break;
            }
        }
    }

    public static void closeApplication(Activity activity, EventListener eventListener) {
        String str = "ۗ۫۟۫ۘۥۘۛ۟ۦۘۦۖۨۥۗ۠ۙۚۖۘ";
        while (true) {
            switch ((str.hashCode() ^ 846) ^ -825198537) {
                case -2094269897:
                    String str2 = "ۜۥۙ۬ۤۘۚۥۘۘۛۜۖۢۙۗۡۖۘ۠ۧۗ";
                    while (true) {
                        switch (str2.hashCode() ^ -1398239896) {
                            case -1563926437:
                                str = "۫ۡۦۘۦۢ۬ۧۗۘۢۘۥۘۗۙۙ";
                                continue;
                            case -116932476:
                                str = "ۥۙۧۨۥۘۘ۬۟ۚۨۧۘۘ۫ۚۗۘۥ";
                                continue;
                            case 173452851:
                                str2 = "ۖۤۘۘۛۗ۫ۚۙۧۖۚۘۙ۟";
                                break;
                            case 276422811:
                                if (eventListener == null) {
                                    str2 = "ۛ۠ۢۨۦۗ۟ۤ۫۬ۥۘۛۚۢۗۡۡۘۧ۬۠";
                                    break;
                                } else {
                                    str2 = "ۡۢ۫ۚ۬ۦۙۧۨۘۖۖۜۘۚۚۚۚۗۨۙۦۚ۠۬ۡۘ";
                                    break;
                                }
                        }
                    }
                    break;
                case -1510173575:
                    System.exit(10);
                    str = "ۡۤۚۙۖ۫ۧۧۡۘۥۢۡۘۧۛۢ";
                    break;
                case -1372926778:
                    activity.finish();
                    str = "ۦۥۢ۬ۘۨۘۜۨ۫ۛۚۨۘ۠ۢۖ";
                    break;
                case -1053507421:
                    str = "ۖۚۘۘ۠ۢۛۚ۟۬ۘۤۥۖۘۚ۬ۜۘ۬ۤۘۘ";
                    break;
                case -1045967114:
                    str = "ۛ۟ۨۥ۟ۗۚۡۛۨ۬۠۟۬";
                    break;
                case 929344764:
                    Process.killProcess(Process.myPid());
                    str = "ۥۚۖۨۧۡۥۙ۬ۢۧۨۘۚۗۡۜ۟ۗۗۦ۫";
                    break;
                case 1770309143:
                    eventListener.onCloseAppFromErrorActivity();
                    str = "ۥۙۧۨۥۘۘ۬۟ۚۨۧۘۘ۫ۚۗۘۥ";
                    break;
                case 1897577237:
                    return;
            }
        }
    }

    public static String getAllErrorDetailsFromIntent(Context context, Intent intent) {
        String str;
        String a2;
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US);
        try {
            ZipFile zipFile = new ZipFile(context.getPackageManager().getApplicationInfo(yo.mpack, 0).sourceDir);
            simpleDateFormat.format(new Date(zipFile.getEntry("classes.dex").getTime()));
            zipFile.close();
        } catch (Exception e2) {
        }
        try {
            str = context.getPackageManager().getPackageInfo(yo.mpack, 0).versionName;
        } catch (Exception e3) {
            str = "Unknown";
        }
        String str2 = Build.VERSION.RELEASE;
        String str3 = Build.VERSION.SDK_INT + " (" + str2 + ")";
        String str4 = (("Build version: " + str + " \n") + "OBVersion: " + ("" + utils.buildNo1 + "." + utils.buildNo2) + " \n") + "Current date: " + simpleDateFormat.format(date) + " \n";
        StringBuilder sb = new StringBuilder();
        sb.append(str4);
        sb.append("Device: ");
        String str5 = Build.MANUFACTURER;
        String str6 = Build.MODEL;
        String str7 = "ۨۘۡۙۜ۠ۤۛۙۨۛۡۥۧۨ۠ۜۖ۬۫ۛۥۢۜۘ";
        while (true) {
            switch (str7.hashCode() ^ 1594838719) {
                case 61746878:
                    a2 = a(str5) + " " + str6;
                    break;
                case 666493846:
                    if (str6.startsWith(str5)) {
                        str7 = "ۘۗۡۘۢۚ۫ۨۢۡۘۦ۠۬۫ۨۘۘۚۦۢۘۡۛ";
                        break;
                    } else {
                        str7 = "۟ۖۢ۠ۛۧ۫ۤۛۦ۟ۖۘۦۤۥۗۥۘ۠ۡۡ";
                        continue;
                    }
                case 1048774850:
                    str7 = "۫ۙۢۥۦۛۚۗۥۘۡۗۘۘۙۥۖۘ";
                    continue;
                case 1301190949:
                    a2 = a(str6);
                    break;
            }
        }
        StringBuilder g2 = a.g((a.f(sb, a2, " \n") + "Android SDK: " + str3 + " \n \n") + "Stack trace:  \n");
        g2.append(getStackTraceFromIntent(intent));
        return g2.toString();
    }

    /* JADX WARNING: Removed duplicated region for block: B:1:0x0002 A[LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int getDefaultErrorActivityDrawable() {
        /*
            java.lang.String r0 = "ۖۢۛ۬ۥۦۙۢ۟۫ۢۥۜۗۨۘۜۘۜۘۤۡۘۘ"
        L_0x0002:
            int r1 = r0.hashCode()
            r2 = 93
            r3 = -1645245339(0xffffffff9def8c65, float:-6.3407938E-21)
            r1 = r1 ^ r2
            r1 = r1 ^ r3
            switch(r1) {
                case -1655824402: goto L_0x0011;
                default: goto L_0x0010;
            }
        L_0x0010:
            goto L_0x0002
        L_0x0011:
            int r0 = f215g
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cat.ereza.customactivityoncrash.CustomActivityOnCrash.getDefaultErrorActivityDrawable():int");
    }

    public static int getDefaultErrorActivityDrawableIdFromIntent(Intent intent) {
        String str = "ۤۡۧۜۘۥۘۙۙۢۥۡ۠ۙۖۨۧ۬ۖۧۧ";
        while (true) {
            switch ((str.hashCode() ^ 636) ^ 1794560867) {
                case -991983795:
                    return intent.getIntExtra("com.cat.ereza.customactivityoncrash.EXTRA_IMAGE_DRAWABLE_ID", yo.getID("customactivityoncrash_error_image", "drawable"));
                case -204154658:
                    str = "ۜ۟ۦۘۥۛۢ۟۟ۤۙۡۘۧۛۥۘۨۖۡۘ۬ۛ۫ۛۜ۠";
                    break;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:1:0x0002 A[LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Class<? extends android.app.Activity> getErrorActivityClass() {
        /*
            java.lang.String r0 = "ۛ۬۟ۨ۟ۜۘۦۦۧۘۛۜۨۜۥۥۘۡۢ۬۟ۛ۠۫ۚۗ"
        L_0x0002:
            int r1 = r0.hashCode()
            r2 = 738(0x2e2, float:1.034E-42)
            r3 = -604856561(0xffffffffdbf29f0f, float:-1.36583662E17)
            r1 = r1 ^ r2
            r1 = r1 ^ r3
            switch(r1) {
                case 583194963: goto L_0x0011;
                default: goto L_0x0010;
            }
        L_0x0010:
            goto L_0x0002
        L_0x0011:
            java.lang.Class r0 = f216h
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cat.ereza.customactivityoncrash.CustomActivityOnCrash.getErrorActivityClass():java.lang.Class");
    }

    /* JADX WARNING: Removed duplicated region for block: B:1:0x0002 A[LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.cat.ereza.customactivityoncrash.CustomActivityOnCrash.EventListener getEventListener() {
        /*
            java.lang.String r0 = "ۨ۟ۨ۫۫ۜۢۘۡۘ۟ۥۜۥ۟۬۬ۧۥۘۤۖۘۘۡۦ"
        L_0x0002:
            int r1 = r0.hashCode()
            r2 = 435(0x1b3, float:6.1E-43)
            r3 = -966037603(0xffffffffc66b6f9d, float:-15067.903)
            r1 = r1 ^ r2
            r1 = r1 ^ r3
            switch(r1) {
                case -491377417: goto L_0x0011;
                default: goto L_0x0010;
            }
        L_0x0010:
            goto L_0x0002
        L_0x0011:
            com.cat.ereza.customactivityoncrash.CustomActivityOnCrash$EventListener r0 = f218j
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cat.ereza.customactivityoncrash.CustomActivityOnCrash.getEventListener():com.cat.ereza.customactivityoncrash.CustomActivityOnCrash$EventListener");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002d, code lost:
        r1 = "ۦۖۥ۟ۨ۫ۙۛ۬ۛۡۨۨۚۥ۠ۖۜ۠ۨۦۦۘۘ";
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.cat.ereza.customactivityoncrash.CustomActivityOnCrash.EventListener getEventListenerFromIntent(android.content.Intent r6) {
        /*
            r2 = 0
            java.lang.String r1 = "ۜ۠ۜۜ۬ۛۗ۫ۨۘۚۢۤ۫۬ۜ۫ۛۦۨۨۧ"
            r0 = r2
        L_0x0004:
            int r3 = r1.hashCode()
            r4 = 793(0x319, float:1.111E-42)
            r5 = -1801031668(0xffffffff94a6700c, float:-1.6805911E-26)
            r3 = r3 ^ r4
            r3 = r3 ^ r5
            switch(r3) {
                case -474452043: goto L_0x005f;
                case 21210407: goto L_0x005c;
                case 243933382: goto L_0x001f;
                case 1211353906: goto L_0x0013;
                case 1231158758: goto L_0x003e;
                case 1895955329: goto L_0x0016;
                default: goto L_0x0012;
            }
        L_0x0012:
            goto L_0x0004
        L_0x0013:
            java.lang.String r1 = "۫ۚۧۨ۠ۦۘۛ۫ۘۛ۠ۤ۠۫ۗ۠۠ۡۚ۟ۦ۟ۨۥۘۡۖۘ"
            goto L_0x0004
        L_0x0016:
            java.lang.String r0 = "com.cat.ereza.customactivityoncrash.EXTRA_EVENT_LISTENER"
            java.io.Serializable r0 = r6.getSerializableExtra(r0)
            java.lang.String r1 = "ۡۥۤۤۨۖۘ۫۟ۥۘۘۙۡۘۜۡۢۧۡۨۢۦۥۘۙۛۢ"
            goto L_0x0004
        L_0x001f:
            r3 = -1304717384(0xffffffffb23b97b8, float:-1.0919329E-8)
            java.lang.String r1 = "ۘ۬ۜۛ۟ۡۘۡۧۨ۟ۛ۟ۚۥۤۥۨۖۡۡۦ۠ۛۖۘۗۗۙ"
        L_0x0024:
            int r4 = r1.hashCode()
            r4 = r4 ^ r3
            switch(r4) {
                case -1642806654: goto L_0x003b;
                case 518299683: goto L_0x0038;
                case 978259372: goto L_0x0033;
                case 1783838200: goto L_0x002d;
                default: goto L_0x002c;
            }
        L_0x002c:
            goto L_0x0024
        L_0x002d:
            java.lang.String r1 = "ۦۖۥ۟ۨ۫ۙۛ۬ۛۡۨۨۚۥ۠ۖۜ۠ۨۦۦۘۘ"
            goto L_0x0004
        L_0x0030:
            java.lang.String r1 = "ۜۜۚ۫ۖۧۘۖۦ۬ۖۡۥۘۛۗ۠"
            goto L_0x0024
        L_0x0033:
            if (r0 == 0) goto L_0x0030
            java.lang.String r1 = "ۜۜۡۚۖۨۦۤ۫ۜۨ۟ۥۚۡ"
            goto L_0x0024
        L_0x0038:
            java.lang.String r1 = "ۘۡۡۦۖۜۘ۟ۖۘۦۚ۬ۚۢۡۘ"
            goto L_0x0024
        L_0x003b:
            java.lang.String r1 = "ۘۘۨۦ۠ۚۢ۫ۥۘۜۨۦۨ۫ۡۘ۫ۦۘۥۧۤ۠ۗۡۘ"
            goto L_0x0004
        L_0x003e:
            r3 = -1498308698(0xffffffffa6b19fa6, float:-1.2325115E-15)
            java.lang.String r1 = "۟۟ۘۘۛۗۘ۫۫ۤۖۚۜۥۚۛ"
        L_0x0043:
            int r4 = r1.hashCode()
            r4 = r4 ^ r3
            switch(r4) {
                case -229922902: goto L_0x002d;
                case -161384304: goto L_0x0052;
                case 1251145502: goto L_0x0059;
                case 1875344658: goto L_0x004c;
                default: goto L_0x004b;
            }
        L_0x004b:
            goto L_0x0043
        L_0x004c:
            java.lang.String r1 = "ۢۤۙۢ۫ۖۦۛۤۖۛۜۘۙۡۛۖۡۧۤۤ۟ۛۢ۬ۘۧ"
            goto L_0x0043
        L_0x004f:
            java.lang.String r1 = "۠ۘۡۚۡۜ۠ۘۧۘۦۦۗۛۖۥ۟ۘۡۚۢۡۘۗ۬۠"
            goto L_0x0043
        L_0x0052:
            boolean r1 = r0 instanceof com.cat.ereza.customactivityoncrash.CustomActivityOnCrash.EventListener
            if (r1 == 0) goto L_0x004f
            java.lang.String r1 = "ۜۘۘۘۧۙۖۘ۠ۥۨۘ۫۟ۜۜ۫۟ۗۖۚ۫۫ۢ"
            goto L_0x0043
        L_0x0059:
            java.lang.String r1 = "ۛۜۥ۠ۨۘۘۗۨۡۘۦۡۚۤۜۦۘ۟۟ۦۘ۟ۜۤۛۤۤ۟ۦۨۘ"
            goto L_0x0004
        L_0x005c:
            com.cat.ereza.customactivityoncrash.CustomActivityOnCrash$EventListener r0 = (com.cat.ereza.customactivityoncrash.CustomActivityOnCrash.EventListener) r0
        L_0x005e:
            return r0
        L_0x005f:
            r0 = r2
            goto L_0x005e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cat.ereza.customactivityoncrash.CustomActivityOnCrash.getEventListenerFromIntent(android.content.Intent):com.cat.ereza.customactivityoncrash.CustomActivityOnCrash$EventListener");
    }

    /* JADX WARNING: Removed duplicated region for block: B:1:0x0002 A[LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Class<? extends android.app.Activity> getRestartActivityClass() {
        /*
            java.lang.String r0 = "۟ۜ۟۫ۘۧۘۗۦۘۘۚۙ۬ۗۖۜۘۙۨۦۖۧۥ"
        L_0x0002:
            int r1 = r0.hashCode()
            r2 = 872(0x368, float:1.222E-42)
            r3 = 1606506151(0x5fc156a7, float:2.7863012E19)
            r1 = r1 ^ r2
            r1 = r1 ^ r3
            switch(r1) {
                case 2093501785: goto L_0x0011;
                default: goto L_0x0010;
            }
        L_0x0010:
            goto L_0x0002
        L_0x0011:
            java.lang.Class r0 = f217i
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cat.ereza.customactivityoncrash.CustomActivityOnCrash.getRestartActivityClass():java.lang.Class");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x005e, code lost:
        r1 = "ۨۚۥۜۢۙ۠۠۫۬ۥۘ۠۟ۖۜۜۜۘۦۢۢۛۡۘۦۛۖ";
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Class<? extends android.app.Activity> getRestartActivityClassFromIntent(android.content.Intent r6) {
        /*
            r2 = 0
            java.lang.String r1 = "ۘۤۖۘۖۜۗۥۖۛۡۦ۠ۛۤۡۖۡۤۜ۠ۢۖۡۦ"
            r0 = r2
        L_0x0004:
            int r3 = r1.hashCode()
            r4 = 214(0xd6, float:3.0E-43)
            r5 = -1127386358(0xffffffffbccd730a, float:-0.025079269)
            r3 = r3 ^ r4
            r3 = r3 ^ r5
            switch(r3) {
                case -1297615153: goto L_0x001f;
                case -426936720: goto L_0x0059;
                case 170892855: goto L_0x003b;
                case 726497390: goto L_0x0013;
                case 1580286959: goto L_0x0016;
                case 1875614602: goto L_0x005c;
                default: goto L_0x0012;
            }
        L_0x0012:
            goto L_0x0004
        L_0x0013:
            java.lang.String r1 = "ۚ۟ۦۘۤۛۡ۬ۙۧۖۗۡۘ۟ۥۦۧۖۘۘۢۥۦ"
            goto L_0x0004
        L_0x0016:
            java.lang.String r0 = "com.cat.ereza.customactivityoncrash.EXTRA_RESTART_ACTIVITY_CLASS"
            java.io.Serializable r0 = r6.getSerializableExtra(r0)
            java.lang.String r1 = "ۥۜۛۢۡۛۛ۫ۨۘ۟۫ۖ۬ۢۧۢۖۦۧۛۥۡۖۦ"
            goto L_0x0004
        L_0x001f:
            r3 = 70242231(0x42fcfb7, float:2.066653E-36)
            java.lang.String r1 = "ۧ۟ۜ۬ۥۡۘ۫ۛۡۘۘۚۥۘ۬ۦۤ"
        L_0x0024:
            int r4 = r1.hashCode()
            r4 = r4 ^ r3
            switch(r4) {
                case -1859051283: goto L_0x0033;
                case -688177869: goto L_0x002d;
                case -156616082: goto L_0x005e;
                case 448431204: goto L_0x0038;
                default: goto L_0x002c;
            }
        L_0x002c:
            goto L_0x0024
        L_0x002d:
            java.lang.String r1 = "ۨۛۤۗۚۨۘۡۥۘۘ۟ۢۤۙۦۨ۫ۢۥۙۘ"
            goto L_0x0004
        L_0x0030:
            java.lang.String r1 = "ۤۨۤۛۡۧۥۢۜ۫۠ۙۧۨ۠"
            goto L_0x0024
        L_0x0033:
            if (r0 == 0) goto L_0x0030
            java.lang.String r1 = "ۤۘۥۘۙۗۙۖۥۙۤ۫ۘۜۖۘ۠ۤۚ"
            goto L_0x0024
        L_0x0038:
            java.lang.String r1 = "۠ۜۢۦۚۡۘۡۧۜۤۢ۟ۗۢ۫"
            goto L_0x0024
        L_0x003b:
            r3 = 1279137274(0x4c3e15fa, float:4.9829864E7)
            java.lang.String r1 = "ۛ۠ۛۖۧ۟۫ۚ۬ۡۦ۟ۚۛۛۧۤۦۜۘ"
        L_0x0040:
            int r4 = r1.hashCode()
            r4 = r4 ^ r3
            switch(r4) {
                case -1459858310: goto L_0x0049;
                case -1267881111: goto L_0x005e;
                case 1307779650: goto L_0x0056;
                case 1478017604: goto L_0x0053;
                default: goto L_0x0048;
            }
        L_0x0048:
            goto L_0x0040
        L_0x0049:
            boolean r1 = r0 instanceof java.lang.Class
            if (r1 == 0) goto L_0x0050
            java.lang.String r1 = "ۜ۠ۨۘۡ۫ۡ۟ۜۘۗ۫ۨ۫ۛۦۘ"
            goto L_0x0040
        L_0x0050:
            java.lang.String r1 = "ۥۧ۟۟ۗۨۚ۫ۥۘۥۛۨۨۥ۫"
            goto L_0x0040
        L_0x0053:
            java.lang.String r1 = "ۛۡۚۚۙۡۘۘۨۦۘۚۘۤۜۙۘۤۖۜۥۘۜۘۙۥۜ"
            goto L_0x0040
        L_0x0056:
            java.lang.String r1 = "ۢ۠ۚۚۙۢۗۛۥۘۜۛۢ۟ۗۡۘ۫۬ۢ۫۠ۖ۬۠ۖۨۦۘۘ"
            goto L_0x0004
        L_0x0059:
            java.lang.Class r0 = (java.lang.Class) r0
        L_0x005b:
            return r0
        L_0x005c:
            r0 = r2
            goto L_0x005b
        L_0x005e:
            java.lang.String r1 = "ۨۚۥۜۢۙ۠۠۫۬ۥۘ۠۟ۖۜۜۜۘۦۢۢۛۡۘۦۛۖ"
            goto L_0x0004
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cat.ereza.customactivityoncrash.CustomActivityOnCrash.getRestartActivityClassFromIntent(android.content.Intent):java.lang.Class");
    }

    public static String getStackTraceFromIntent(Intent intent) {
        String str = "ۧۡ۠ۨۙۦۜۢۖۘ۟ۜۘۘۤۜ۫";
        while (true) {
            switch ((str.hashCode() ^ 274) ^ 1054657787) {
                case -371235386:
                    return intent.getStringExtra("com.cat.ereza.customactivityoncrash.EXTRA_STACK_TRACE");
                case 372461462:
                    str = "ۘ۫ۡۡ۫ۚ۫۫ۨۥۚۘۘۢۜۗۥۙۥ";
                    break;
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void install(android.content.Context r4) {
        /*
            r1 = 1639566536(0x61b9ccc8, float:4.2842546E20)
            java.lang.String r0 = "ۚۖۙ۬ۢۡۘۚۗۙۗۢۘۘۥۥۙۨۙۘۦۥ۟ۖۧۤ"
        L_0x0005:
            int r2 = r0.hashCode()
            r2 = r2 ^ r1
            switch(r2) {
                case -160912106: goto L_0x0012;
                case -108056779: goto L_0x0017;
                case 809703744: goto L_0x000e;
                case 1129344963: goto L_0x001a;
                default: goto L_0x000d;
            }
        L_0x000d:
            goto L_0x0005
        L_0x000e:
            return
        L_0x000f:
            java.lang.String r0 = "ۗ۬ۦۖۥ۟ۤۗۗۖۖۦۘۦۘۖۘ"
            goto L_0x0005
        L_0x0012:
            if (r4 != 0) goto L_0x000f
            java.lang.String r0 = "ۦۦۙۚۖۖۛۙۥۘۡ۬ۦۘۧۢۥۗۖۢۛ۬۟۠ۨ۫"
            goto L_0x0005
        L_0x0017:
            java.lang.String r0 = "ۚۛۘۘۦۧۘۘۡ۠۫ۥۘۦۧۛۛ۟ۛۘۘ۫ۢۜۜۛۖۚۥ۟"
            goto L_0x0005
        L_0x001a:
            java.lang.Thread$UncaughtExceptionHandler r1 = java.lang.Thread.getDefaultUncaughtExceptionHandler()     // Catch:{ all -> 0x0082 }
            r2 = 1421661803(0x54bcd66b, float:6.4884095E12)
            java.lang.String r0 = "ۖۚ۬ۥ۬ۨۘ۠۫ۨ۟ۖۡ۬ۘۨۚ۟"
        L_0x0023:
            int r3 = r0.hashCode()     // Catch:{ all -> 0x0082 }
            r3 = r3 ^ r2
            switch(r3) {
                case -1919217553: goto L_0x0045;
                case -443598178: goto L_0x002c;
                case 968316012: goto L_0x0034;
                case 1714119909: goto L_0x0037;
                default: goto L_0x002b;
            }     // Catch:{ all -> 0x0082 }
        L_0x002b:
            goto L_0x0023
        L_0x002c:
            if (r1 == 0) goto L_0x0031
            java.lang.String r0 = "ۜۨۤ۟ۖۘۘۢۙۡۘۛۗۧ۟۬ۨۦۨۜ۫ۗۧ۟ۘ"
            goto L_0x0023
        L_0x0031:
            java.lang.String r0 = "۬ۨۖۘ۬۠ۦۘۜۗۖۘۚۚۡۘۥۜۨۘۖ۠ۚۧۚۢۡۖۧۘ"
            goto L_0x0023
        L_0x0034:
            java.lang.String r0 = "ۛۦۡۘ۫۟ۦۘۥۤۡۘۗۚۖۘۖۘۢۥۘۙ۟۫ۦۘۦۢۢ۬ۤۥ"
            goto L_0x0023
        L_0x0037:
            r2 = 925453269(0x37294bd5, float:1.0090841E-5)
            java.lang.String r0 = "ۡۖۖۘۨ۠ۙۤ۠ۡۛۖ۟۬۠ۧۤۚۤ"
        L_0x003c:
            int r3 = r0.hashCode()     // Catch:{ all -> 0x0082 }
            r3 = r3 ^ r2
            switch(r3) {
                case -1908693440: goto L_0x000e;
                case -1445695695: goto L_0x0087;
                case -1199266241: goto L_0x009a;
                case 1626414913: goto L_0x0045;
                default: goto L_0x0044;
            }
        L_0x0044:
            goto L_0x003c
        L_0x0045:
            r2 = 1930185270(0x730c4a36, float:1.111491E31)
            java.lang.String r0 = "۠ۗ۫ۢ۬ۧۤۨۢۗۘۙ۫ۗۙ"
        L_0x004a:
            int r3 = r0.hashCode()
            r3 = r3 ^ r2
            switch(r3) {
                case -780862756: goto L_0x00a0;
                case 559470533: goto L_0x0053;
                case 1539657245: goto L_0x0060;
                case 1553011989: goto L_0x00a5;
                default: goto L_0x0052;
            }
        L_0x0052:
            goto L_0x004a
        L_0x0053:
            java.lang.Class r0 = r1.getClass()     // Catch:{ all -> 0x0082 }
            java.lang.String r0 = r0.getName()     // Catch:{ all -> 0x0082 }
            java.lang.String r2 = "com.android.internal.os"
            r0.startsWith(r2)     // Catch:{ all -> 0x0082 }
        L_0x0060:
            android.content.Context r0 = r4.getApplicationContext()     // Catch:{ all -> 0x0082 }
            android.app.Application r0 = (android.app.Application) r0     // Catch:{ all -> 0x0082 }
            f209a = r0     // Catch:{ all -> 0x0082 }
            b.a r0 = new b.a     // Catch:{ all -> 0x0082 }
            r0.<init>(r1)     // Catch:{ all -> 0x0082 }
            java.lang.Thread.setDefaultUncaughtExceptionHandler(r0)     // Catch:{ all -> 0x0082 }
            android.app.Application r0 = f209a     // Catch:{ all -> 0x0082 }
            b.b r1 = new b.b     // Catch:{ all -> 0x0082 }
            r1.<init>()     // Catch:{ all -> 0x0082 }
            r0.registerActivityLifecycleCallbacks(r1)     // Catch:{ all -> 0x0082 }
            java.lang.String r0 = "CustomActivityOnCrash"
            java.lang.String r1 = "CustomActivityOnCrash has been installed."
            android.util.Log.i(r0, r1)     // Catch:{ all -> 0x0082 }
            goto L_0x000e
        L_0x0082:
            r0 = move-exception
            goto L_0x000e
        L_0x0084:
            java.lang.String r0 = "۠ۢ۠ۛۥۜۖۙۗۤ۫ۧۨۚۧۜۘۥ۬ۤۜۙ۟ۢۧۢۛ"
            goto L_0x003c
        L_0x0087:
            java.lang.Class r0 = r1.getClass()     // Catch:{ all -> 0x0082 }
            java.lang.String r0 = r0.getName()     // Catch:{ all -> 0x0082 }
            java.lang.String r3 = "com.cat.ereza.customactivityoncrash"
            boolean r0 = r0.startsWith(r3)     // Catch:{ all -> 0x0082 }
            if (r0 == 0) goto L_0x0084
            java.lang.String r0 = "۠ۚۥۜ۠ۦۨۢۡۛۥ۠۫۬ۨۘۙۚۦۘ"
            goto L_0x003c
        L_0x009a:
            java.lang.String r0 = "ۙۖۢۦۚۘۘۤۜۘۙ۠ۜۥۖۧۚ۟ۢ"
            goto L_0x003c
        L_0x009d:
            java.lang.String r0 = "ۢ۟۫ۗ۬۫۬۫ۥۘۤ۟۬ۙ۬ۡۘۧۚۖۢۘ۫ۖ۟ۧ"
            goto L_0x004a
        L_0x00a0:
            if (r1 == 0) goto L_0x009d
            java.lang.String r0 = "ۧۨۨۛ۬ۥ۠ۜۛۚۨۨۘۚۦ۠ۙ۟ۨۘۗ۠"
            goto L_0x004a
        L_0x00a5:
            java.lang.String r0 = "۬۬ۜۘ۬ۦۘۘۛۦۧۘۡۢۜۥۖۚۛۡۙ۠ۚۥۤۦ۬۫ۜۨۘ"
            goto L_0x004a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cat.ereza.customactivityoncrash.CustomActivityOnCrash.install(android.content.Context):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:1:0x0002 A[LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean isEnableAppRestart() {
        /*
            java.lang.String r0 = "ۦ۟ۚ۟ۦۘۘ۠ۦۖۜۙۦۘۨۦۡۘۥۨۢ"
        L_0x0002:
            int r1 = r0.hashCode()
            r2 = 84
            r3 = 274547452(0x105d42fc, float:4.3636168E-29)
            r1 = r1 ^ r2
            r1 = r1 ^ r3
            switch(r1) {
                case -1720920613: goto L_0x0011;
                default: goto L_0x0010;
            }
        L_0x0010:
            goto L_0x0002
        L_0x0011:
            boolean r0 = f214f
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cat.ereza.customactivityoncrash.CustomActivityOnCrash.isEnableAppRestart():boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:1:0x0002 A[LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean isLaunchErrorActivityWhenInBackground() {
        /*
            java.lang.String r0 = "ۡۨۧۗۖۜۦ۟۫ۛ۟ۡۗۛۛۛۙۡۘ۬ۤۛ۬۬۫ۗۙۨ"
        L_0x0002:
            int r1 = r0.hashCode()
            r2 = 614(0x266, float:8.6E-43)
            r3 = -1414708585(0xffffffffabad4297, float:-1.2310872E-12)
            r1 = r1 ^ r2
            r1 = r1 ^ r3
            switch(r1) {
                case -561499797: goto L_0x0011;
                default: goto L_0x0010;
            }
        L_0x0010:
            goto L_0x0002
        L_0x0011:
            boolean r0 = f212d
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cat.ereza.customactivityoncrash.CustomActivityOnCrash.isLaunchErrorActivityWhenInBackground():boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:1:0x0002 A[LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean isShowErrorDetails() {
        /*
            java.lang.String r0 = "ۛ۠ۤۥۚۡۙۥۤ۠ۛۘۘ۟ۤۜۘ"
        L_0x0002:
            int r1 = r0.hashCode()
            r2 = 237(0xed, float:3.32E-43)
            r3 = 260525230(0xf874cae, float:1.3341564E-29)
            r1 = r1 ^ r2
            r1 = r1 ^ r3
            switch(r1) {
                case -1470780476: goto L_0x0011;
                default: goto L_0x0010;
            }
        L_0x0010:
            goto L_0x0002
        L_0x0011:
            boolean r0 = f213e
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cat.ereza.customactivityoncrash.CustomActivityOnCrash.isShowErrorDetails():boolean");
    }

    public static boolean isShowErrorDetailsFromIntent(Intent intent) {
        String str = "ۨۥ۫۬ۘۤ۠۟ۡۘ۟ۡۦ۟ۛ۠ۖۘۖۘ";
        while (true) {
            switch ((str.hashCode() ^ 269) ^ -849871803) {
                case -196677529:
                    return intent.getBooleanExtra("com.cat.ereza.customactivityoncrash.EXTRA_SHOW_ERROR_DETAILS", true);
                case 808845964:
                    str = "۠۟۟ۙ۟ۘۢۜۨۨۖۘ۟ۡۦۘۚۦۜۘ۫ۖۦۘۙۚۗ";
                    break;
            }
        }
    }

    @Deprecated
    public static void restartApplicationWithIntent(Activity activity, Intent intent) {
        String str = "ۢۘۜ۬۫ۦۗۧۢۖۧۡۘۘۛۡۘ";
        while (true) {
            switch ((str.hashCode() ^ 381) ^ -1514805603) {
                case -1722531885:
                    str = "۟ۢۨۚۙ۟۬۫ۜۢ۠ۦ۠ۤۨ";
                    break;
                case 741981882:
                    restartApplicationWithIntent(activity, intent, (EventListener) null);
                    str = "ۧۜۗ۟ۖۡۖۗۘۤ۫ۥۧۚۤۗ۟ۡ۬ۛۥۙۦۨ۟ۨ۟";
                    break;
                case 1372761150:
                    str = "۠۫ۜۜۥۨۘ۠ۚ۬ۘۨۥۘ۫ۤۥۘ۟ۙۜۘۧ";
                    break;
                case 1939983834:
                    return;
            }
        }
    }

    public static void restartApplicationWithIntent(Activity activity, Intent intent, EventListener eventListener) {
        String str = "ۧۛ۫ۧۚۛۥۙ۟ۦۡۥۗۗ۠ۦۗۡۘۗ۫ۘۘ۬۠ۚۦۜ";
        while (true) {
            switch ((str.hashCode() ^ 723) ^ -1699491268) {
                case -1881208170:
                    str = "۠ۘۦۘۥۙۚۨ۬ۛۨۚۗۜۡۦۘۡۤ۠۫ۙۨ";
                    break;
                case -1677170206:
                    return;
                case -1501184190:
                    eventListener.onRestartAppFromErrorActivity();
                    str = "ۜۤۦۘۘۤۘۘۤۤۨۘۦۖۛ۠ۖۜۘ۫ۢۗۧۥۚ";
                    break;
                case -1445716729:
                    System.exit(10);
                    str = "ۙ۫ۨۘ۬ۥ۠ۗۦۗۨۜۦۦۖۥۦۚۥۘۨۖۨ";
                    break;
                case -1362891937:
                    str = "ۡۘۗۤۦۥۘۗۨۖۜۘۡۘ۫ۛۙۜۡۙۥ۫ۦۖۧۜ";
                    break;
                case -607142070:
                    intent.addFlags(268468224);
                    str = "ۛۥۨۗۥۢۖۘۘۦۢۢ۠ۧۨۖ۫ۨۨۧۖۛۧۜۘۖۨۜ";
                    break;
                case -319765647:
                    str = "۫ۥۚۖ۠ۚۜ۫ۡۤۙ۬ۦۦۘۛۢۖۘۨۦۘۖ۫ۦۧۧۨ";
                    break;
                case -269670756:
                    activity.startActivity(intent);
                    str = "۠۬ۛۢۘۖۘۦۖ۠ۗۨۜۘۦۤۤۜ۫۫";
                    break;
                case -128541428:
                    String str2 = "ۘۖ۟ۢ۟۫ۨۢۦۥۘۜۨۖۢ";
                    while (true) {
                        switch (str2.hashCode() ^ -13246421) {
                            case -1154274956:
                                str = "ۜۤۦۘۘۤۘۘۤۤۨۘۦۖۛ۠ۖۜۘ۫ۢۗۧۥۚ";
                                continue;
                            case 128775353:
                                str = "ۡۥ۬ۨ۬ۡۢۡۙۖۙۦۨۗۜۘۧۗۦ";
                                continue;
                            case 760831489:
                                if (eventListener == null) {
                                    str2 = "۠ۜۧۘ۠ۦۧۘۖۚۢۛۙۘۘۢۦۜۧۦۛۤۡۘ";
                                    break;
                                } else {
                                    str2 = "ۚۚۦۢۨۦۘۖۢۢۖۢ۬ۜۘۨۘۚۚۙۘۤۧۖۥ";
                                    break;
                                }
                            case 1752020206:
                                str2 = "۠ۘ۟ۘ۫ۢۦۗۙۚۘۚۥۛ";
                                break;
                        }
                    }
                    break;
                case 660538796:
                    activity.finish();
                    str = "ۤ۠ۡۘۦۖ۬ۙۛۘۗۤۙۢ۫ۛ";
                    break;
                case 1448485795:
                    Process.killProcess(Process.myPid());
                    str = "ۡۥۢۚ۠ۘۘ۠ۗۙۙۦۥ۠۠ۨۘۘ۫ۥ۟ۥۜۥۙ۟ۙ۬ۘ";
                    break;
            }
        }
    }

    public static void setDefaultErrorActivityDrawable(int i2) {
        String str = "ۙ۟ۚۜۡۖ۫ۛۙ۬ۙۥ۫ۤ۟ۚۛۡۢۦۚۦۡ";
        while (true) {
            switch ((str.hashCode() ^ 376) ^ -1564273668) {
                case -1688210706:
                    f215g = i2;
                    str = "۠ۖۡۘۥۢۜۨ۬ۖۡ۫۫ۧۤۡ";
                    break;
                case -1279331569:
                    str = "ۘۡۤ۬ۢۖۘۢۥۘۡۡۜۡۡۡۥ۫ۗۗ۠ۡۘ";
                    break;
                case -94801817:
                    return;
            }
        }
    }

    public static void setEnableAppRestart(boolean z2) {
        String str = "ۤ۠۠۫ۦۨۘۢۖۧۛۜۨۘۛۥۨۘ";
        while (true) {
            switch ((str.hashCode() ^ 539) ^ -531993113) {
                case 469729183:
                    f214f = z2;
                    str = "ۢۘۘۡۖۧۤۢۘۚۛۛۜۚۡ۟ۧ۠ۨۗۖۡۙۤۨۛۤ";
                    break;
                case 641190707:
                    str = "ۙ۫۬۬ۡۦۘۘۥ۬۫ۛۥۘ۟۟ۘۘۗۧۦۘ";
                    break;
                case 1530942203:
                    return;
            }
        }
    }

    public static void setErrorActivityClass(Class<? extends Activity> cls) {
        String str = "ۢۤۘۜۙ۫۬۫ۡۘۛ۠ۡ۫ۙۜۖ۬۫ۡۨۦۘ";
        while (true) {
            switch ((str.hashCode() ^ 410) ^ -18973321) {
                case -1846010621:
                    str = "ۘۥۘۘ۟ۚۜۘۛ۫ۥۘۦۢۥۘۨۥۗۨۡۨۘۗۚۡۢ۬ۤ";
                    break;
                case -1435401545:
                    return;
                case 79989316:
                    f216h = cls;
                    str = "۬۠ۜ۠ۥۨۘۙ۠ۜۘۖۨ۬ۡ۬۟ۦۧۡۘۤۨۤۧۤۥ";
                    break;
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void setEventListener(com.cat.ereza.customactivityoncrash.CustomActivityOnCrash.EventListener r4) {
        /*
            java.lang.String r0 = "۫۟۫ۦۦۥۘۥۡۦۘۤۙۙۗۘۥ۫۟۟ۚۙ۟ۙۤۦ"
        L_0x0002:
            int r1 = r0.hashCode()
            r2 = 613(0x265, float:8.59E-43)
            r3 = 1016517227(0x3c96d26b, float:0.018410882)
            r1 = r1 ^ r2
            r1 = r1 ^ r3
            switch(r1) {
                case -1801567616: goto L_0x0011;
                case -1317959272: goto L_0x007f;
                case -773411119: goto L_0x0091;
                case 88613769: goto L_0x0030;
                case 470195058: goto L_0x0087;
                case 513210550: goto L_0x0014;
                case 1082126793: goto L_0x008d;
                case 1260534220: goto L_0x0054;
                default: goto L_0x0010;
            }
        L_0x0010:
            goto L_0x0002
        L_0x0011:
            java.lang.String r0 = "ۛۧۖۘ۬۫ۘ۬ۦۖۥۧۦۗۤۖۘۜۤۢ"
            goto L_0x0002
        L_0x0014:
            r1 = 1423027800(0x54d1ae58, float:7.2045853E12)
            java.lang.String r0 = "ۥۖۥۘۦۦۤۧۥۦۘۦ۠ۗۢ۫ۖۘۦۦ۠"
        L_0x0019:
            int r2 = r0.hashCode()
            r2 = r2 ^ r1
            switch(r2) {
                case 193461731: goto L_0x008d;
                case 783806589: goto L_0x002d;
                case 1166916624: goto L_0x0028;
                case 1338510171: goto L_0x0022;
                default: goto L_0x0021;
            }
        L_0x0021:
            goto L_0x0019
        L_0x0022:
            java.lang.String r0 = "ۘۥۗۢۨۜۦ۬ۖ۟۠ۗۧ۠۟ۛۧۧ"
            goto L_0x0002
        L_0x0025:
            java.lang.String r0 = "ۛۨۦ۠۬ۘۛۧۢ۬۬ۦۦۢۚ"
            goto L_0x0019
        L_0x0028:
            if (r4 == 0) goto L_0x0025
            java.lang.String r0 = "ۦۖۥۘ۠ۧ۫ۙ۟ۘۦ۠ۘۤۢ۟ۙۘ۬۟ۙ۠ۗۗۚۤۚۨ"
            goto L_0x0019
        L_0x002d:
            java.lang.String r0 = "ۙۢ۬ۛۜۨۘۗۜۖۧۢۧۤ۫ۤۤۘۥ"
            goto L_0x0019
        L_0x0030:
            r1 = -220537604(0xfffffffff2dadcfc, float:-8.6700654E30)
            java.lang.String r0 = "ۤۦۥۘۢۦۧۘۛۨۦ۠ۜۛۤۖۤ۟ۘ۬ۛۤۖۘۖۤۤ"
        L_0x0035:
            int r2 = r0.hashCode()
            r2 = r2 ^ r1
            switch(r2) {
                case -906967130: goto L_0x003e;
                case -10768086: goto L_0x004e;
                case 349557830: goto L_0x0051;
                case 1230069934: goto L_0x008d;
                default: goto L_0x003d;
            }
        L_0x003d:
            goto L_0x0035
        L_0x003e:
            java.lang.Class r0 = r4.getClass()
            java.lang.Class r0 = r0.getEnclosingClass()
            if (r0 == 0) goto L_0x004b
            java.lang.String r0 = "ۘۚ۟ۙۥۛۗۙۥۙۛۤۥ۠۠۬ۙۗ"
            goto L_0x0035
        L_0x004b:
            java.lang.String r0 = "۟ۛۙ۬ۢۦۘۙۤۛۚۤۘۘۨ۫ۦۘۚۘۦۘ۟ۧۨۘ"
            goto L_0x0035
        L_0x004e:
            java.lang.String r0 = "ۙۖۜۘ۬ۖ۫ۛۗۤۢۜۙۖ۬ۡۗۨۗ"
            goto L_0x0035
        L_0x0051:
            java.lang.String r0 = "ۢۜۤ۟ۗۘۘۤۖۜۘۢۘۨۖۥۘۡ۫ۢۢۘۘۛ۟ۗ"
            goto L_0x0002
        L_0x0054:
            r1 = 1798910674(0x6b3932d2, float:2.2389127E26)
            java.lang.String r0 = "ۜۘۦۗۡۚۨۡۘۘۘۤۙۚ۬ۙ۫ۨۛۨۦ"
        L_0x0059:
            int r2 = r0.hashCode()
            r2 = r2 ^ r1
            switch(r2) {
                case -159687400: goto L_0x007c;
                case 1469550762: goto L_0x0062;
                case 1905072561: goto L_0x0068;
                case 1952366722: goto L_0x0079;
                default: goto L_0x0061;
            }
        L_0x0061:
            goto L_0x0059
        L_0x0062:
            java.lang.String r0 = "ۨۤۡۘۡ۫ۥۘ۫ۦۡۖۢۡۘۤۖۖۗ۫ۡۘ"
            goto L_0x0002
        L_0x0065:
            java.lang.String r0 = "ۨۥ۠ۦ۬ۚۜۦۜۙۨۘۖۗ۬۟ۗۢ۬۟ۛ۫ۘۦ"
            goto L_0x0059
        L_0x0068:
            java.lang.Class r0 = r4.getClass()
            int r0 = r0.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isStatic(r0)
            if (r0 == 0) goto L_0x0065
            java.lang.String r0 = "۫ۨۡۘۢۥۦۢۙۜۘ۬ۤۦۘۤۡۡ۠ۘ۠"
            goto L_0x0059
        L_0x0079:
            java.lang.String r0 = "ۧۡۘۘۤ۫ۗۘۡۧۘۗۙ۫۫ۤۡ۟ۙۘۧ۠ۖۘ"
            goto L_0x0059
        L_0x007c:
            java.lang.String r0 = "۫۟ۤۧۙۡۛۦۦۗۚۡۘۙۛ۟"
            goto L_0x0002
        L_0x007f:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "The event listener cannot be an inner or anonymous class, because it will need to be serialized. Change it to a class of its own, or make it a static inner class."
            r0.<init>(r1)
            throw r0
        L_0x0087:
            f218j = r4
            java.lang.String r0 = "ۡۖۖ۬ۨۡۘ۠ۛۨۜۥۚ۫ۥۜ۬ۘۨۘۤۛۜ"
            goto L_0x0002
        L_0x008d:
            java.lang.String r0 = "ۦۡ۠۟ۧۛ۠ۦۘۢۛۘۘۥۢۧ۬ۛۘۘ"
            goto L_0x0002
        L_0x0091:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cat.ereza.customactivityoncrash.CustomActivityOnCrash.setEventListener(com.cat.ereza.customactivityoncrash.CustomActivityOnCrash$EventListener):void");
    }

    public static void setLaunchErrorActivityWhenInBackground(boolean z2) {
        String str = "۟ۛۥۨۨۙۦۤۙ۬ۥۦۘۚۢۜۘۦۢۡۘۜۨ۠ۚۧۢ۠ۡۜ";
        while (true) {
            switch ((str.hashCode() ^ 803) ^ -607981388) {
                case -1739590179:
                    return;
                case 615397498:
                    str = "ۖۘۛۥ۬ۦۘۦ۠ۥ۠ۖۦۘ۬ۧۤ";
                    break;
                case 1035590239:
                    f212d = z2;
                    str = "ۛۧ۬ۢۢۨۧۜۥۚ۫ۜۘۢۤۛۢۚ۫۠ۤۖۧ۟ۥ";
                    break;
            }
        }
    }

    public static void setRestartActivityClass(Class<? extends Activity> cls) {
        String str = "۠ۨۢۨۚۜۨ۠ۖۘ۬ۦۥۛۘۢۦۖۗ";
        while (true) {
            switch ((str.hashCode() ^ 844) ^ -756500084) {
                case 200614371:
                    f217i = cls;
                    str = "ۖۥ۠ۘۜۦۘۧۚۛۘ۟ۧۘۚۖۖ۬ۘ۠۬ۡۘ۬۫۫ۘۧۘ";
                    break;
                case 339463789:
                    return;
                case 801880067:
                    str = "ۡۢۥۛۙۖ۠ۘۨ۫ۨۨۤۚۤۨ۬ۡۛ۠";
                    break;
            }
        }
    }

    public static void setShowErrorDetails(boolean z2) {
        String str = "ۡۜۨۘۗۧۙۢۤۖ۫ۧۗۥۢ۟ۖۢ۫";
        while (true) {
            switch ((str.hashCode() ^ 696) ^ 1434002826) {
                case -1045440606:
                    f213e = z2;
                    str = "۟۟ۧۖۘۨۗۢ۠ۛۡۘۘۨۢۘۢۦۤۖۧۘ";
                    break;
                case 225870992:
                    str = "۫ۨۖۧۦۧۖۥ۠ۦۨۙۙۤۨۘ";
                    break;
                case 1330698619:
                    return;
            }
        }
    }
}
