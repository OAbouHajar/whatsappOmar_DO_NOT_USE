package com.obwhatsapp.yo;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.AssetManager;
import com.obwhatsapp.youbasha.task.utils;
import java.util.HashMap;
import okhttp3.internal.http.StatusLine;

public abstract class shp {

    /* renamed from: a  reason: collision with root package name */
    public static SharedPreferences f874a;

    /* renamed from: b  reason: collision with root package name */
    public static SharedPreferences.Editor f875b;

    /* renamed from: c  reason: collision with root package name */
    public static SharedPreferences.Editor f876c;

    /* renamed from: d  reason: collision with root package name */
    public static AssetManager f877d;

    /* renamed from: e  reason: collision with root package name */
    public static String f878e;

    /* renamed from: f  reason: collision with root package name */
    public static final HashMap f879f = new HashMap();
    public static SharedPreferences prefs;
    public static SharedPreferences.Editor prefsEditor;
    public static String privprefsname;
    public static SharedPreferences.Editor stockLightPrefs;
    public static SharedPreferences stockPrefsLight;

    static {
        String str = "O۠ۘ۟ۡ۟۫ۘۖۨۜۜۨ";
        while (true) {
            switch ((str.hashCode() ^ 992) ^ -764184254) {
                case 747276854:
                    return;
                case 1677766321:
                    str = "ۛۡۥۘۢ۟ۘۖۡۘۘۧۜۨۘۜ۟ۡ۠۟ۨۘۖۜۘۘ۠ۚ۠ۦۥۘ";
                    break;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        r0.append(r1);
        r0 = android.graphics.Typeface.createFromAsset(r2, r0.toString());
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Typeface a(com.obwhatsapp.yo.l1 r6) {
        /*
            r3 = 0
            java.util.HashMap r4 = f879f
            r1 = -174127252(0xfffffffff59f076c, float:-4.031864E32)
            java.lang.String r0 = "ۥ۬۫ۙۛۘۨۜۜۤۛۜۜۛۡۘ"
        L_0x0008:
            int r2 = r0.hashCode()
            r2 = r2 ^ r1
            switch(r2) {
                case -1911870486: goto L_0x001d;
                case 232415849: goto L_0x0011;
                case 953580528: goto L_0x0027;
                case 1368382394: goto L_0x0020;
                default: goto L_0x0010;
            }
        L_0x0010:
            goto L_0x0008
        L_0x0011:
            boolean r0 = r4.containsKey(r6)
            if (r0 == 0) goto L_0x001a
            java.lang.String r0 = "ۛ۟ۢ۫ۚۜۘۨۛۘۘ۟ۢۤۢ۬ۡۘ"
            goto L_0x0008
        L_0x001a:
            java.lang.String r0 = "۟۫ۥۘۧۙ۫۠ۡۚۚ۟ۜ۬ۗۢۤۤۧۙۚۦۘ۟ۘۡۥۘۜ"
            goto L_0x0008
        L_0x001d:
            java.lang.String r0 = "ۙ۫ۧ۠ۙۡۨۚۗۡۛۘۘ۟ۘۨۘۡۖۢۘ۬ۥۚۥۚ"
            goto L_0x0008
        L_0x0020:
            java.lang.Object r0 = r4.get(r6)
            android.graphics.Typeface r0 = (android.graphics.Typeface) r0
        L_0x0026:
            return r0
        L_0x0027:
            r1 = 551275025(0x20dbca11, float:3.723376E-19)
            java.lang.String r0 = "ۧۥ۫ۢ۬ۛۡ۠ۘۛۢۦۘۖ۬ۥۘۜۤۘۛۧۘ"
        L_0x002c:
            int r2 = r0.hashCode()     // Catch:{ Exception -> 0x00dc }
            r2 = r2 ^ r1
            switch(r2) {
                case -1885025732: goto L_0x0035;
                case -1828903509: goto L_0x0067;
                case 1488756546: goto L_0x005a;
                case 1858594986: goto L_0x006a;
                default: goto L_0x0034;
            }     // Catch:{ Exception -> 0x00dc }
        L_0x0034:
            goto L_0x002c
        L_0x0035:
            java.io.File r0 = new java.io.File     // Catch:{ Exception -> 0x00dc }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00dc }
            r1.<init>()     // Catch:{ Exception -> 0x00dc }
            java.lang.String r2 = com.obwhatsapp.yo.yo.datafolder     // Catch:{ Exception -> 0x00dc }
            r1.append(r2)     // Catch:{ Exception -> 0x00dc }
            java.lang.String r2 = "files/customFont"
            r1.append(r2)     // Catch:{ Exception -> 0x00dc }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x00dc }
            r0.<init>(r1)     // Catch:{ Exception -> 0x00dc }
            android.graphics.Typeface r0 = android.graphics.Typeface.createFromFile(r0)     // Catch:{ Exception -> 0x00dc }
            r4.put(r6, r0)     // Catch:{ Exception -> 0x0055 }
            goto L_0x0026
        L_0x0055:
            r1 = move-exception
            goto L_0x0026
        L_0x0057:
            java.lang.String r0 = "ۤۢۖۘ۟۟ۧ۬ۤۜۖۧۘۧۡۡۘ۫ۜۘۜ۬ۗ"
            goto L_0x002c
        L_0x005a:
            java.lang.String r0 = f878e     // Catch:{ Exception -> 0x00dc }
            java.lang.String r2 = "Custom (Load font)"
            boolean r0 = r0.equals(r2)     // Catch:{ Exception -> 0x00dc }
            if (r0 == 0) goto L_0x0057
            java.lang.String r0 = "ۥۨ۫ۢ۟ۖۜ۬ۛۢۡۥۘۥۡۗ۟ۛۦۘۛۘۘۘ"
            goto L_0x002c
        L_0x0067:
            java.lang.String r0 = "۫ۗۢۖۗۦۛ۟ۥ۫۫ۖۘۢۡۖۚ۫ۡ"
            goto L_0x002c
        L_0x006a:
            com.obwhatsapp.yo.l1 r1 = com.obwhatsapp.yo.l1.f800a     // Catch:{ Exception -> 0x00dc }
            r2 = -921107225(0xffffffffc91904e7, float:-626766.44)
            java.lang.String r0 = "ۦۦۖۚۙۢۨۢۛ۬۟۫۟۬ۧۖۙۨۘ"
        L_0x0071:
            int r5 = r0.hashCode()     // Catch:{ Exception -> 0x00dc }
            r5 = r5 ^ r2
            switch(r5) {
                case -1786198854: goto L_0x00a9;
                case -1653507457: goto L_0x00a6;
                case 999317988: goto L_0x007a;
                case 1313596398: goto L_0x00a1;
                default: goto L_0x0079;
            }     // Catch:{ Exception -> 0x00dc }
        L_0x0079:
            goto L_0x0071
        L_0x007a:
            android.content.res.AssetManager r2 = f877d     // Catch:{ Exception -> 0x00dc }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00dc }
            java.lang.String r1 = "fonts"
            r0.<init>(r1)     // Catch:{ Exception -> 0x00dc }
            java.lang.String r1 = java.io.File.separator     // Catch:{ Exception -> 0x00dc }
            r0.append(r1)     // Catch:{ Exception -> 0x00dc }
            java.lang.String r1 = f878e     // Catch:{ Exception -> 0x00dc }
            r0.append(r1)     // Catch:{ Exception -> 0x00dc }
            java.lang.String r1 = ".ttf"
        L_0x008f:
            r0.append(r1)     // Catch:{ Exception -> 0x00dc }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x00dc }
            android.graphics.Typeface r0 = android.graphics.Typeface.createFromAsset(r2, r0)     // Catch:{ Exception -> 0x00dc }
        L_0x009a:
            r4.put(r6, r0)     // Catch:{ Exception -> 0x0055 }
            goto L_0x0026
        L_0x009e:
            java.lang.String r0 = "ۜۛۖ۬ۘۤۖۢ۟ۜۡۖ۫ۜۘۘۢۖۤ۠۠ۙ۠۬ۢ"
            goto L_0x0071
        L_0x00a1:
            if (r6 != r1) goto L_0x009e
            java.lang.String r0 = "۠۫ۨۘۖۡۦ۫ۚۖۘۖۦ۟ۥۦ۠ۡۡۡۘ"
            goto L_0x0071
        L_0x00a6:
            java.lang.String r0 = "ۘۖۤۘۦۤۜۢۜۘ۫ۜ۫ۦۧۗ۬۬۟ۗۙۨۘ"
            goto L_0x0071
        L_0x00a9:
            r1 = 842593591(0x3238f537, float:1.0765965E-8)
            java.lang.String r0 = "ۜ۟ۥۖۗۘ۫ۦ۠ۢۙۘۘۥۡۡ۫ۡۘۗ۟ۦۡۡۛ۫ۨۘ"
        L_0x00ae:
            int r2 = r0.hashCode()     // Catch:{ Exception -> 0x00dc }
            r2 = r2 ^ r1
            switch(r2) {
                case -1451770967: goto L_0x00c3;
                case -609139926: goto L_0x00c6;
                case 796782643: goto L_0x00b7;
                case 1010014829: goto L_0x00bc;
                default: goto L_0x00b6;
            }     // Catch:{ Exception -> 0x00dc }
        L_0x00b6:
            goto L_0x00ae
        L_0x00b7:
            r0 = r3
            goto L_0x009a
        L_0x00b9:
            java.lang.String r0 = "ۘۤۗ۟ۚۢۨۥ۫ۧ۟ۦۘۚۡۘۘۥۘۥۙۦ۠"
            goto L_0x00ae
        L_0x00bc:
            com.obwhatsapp.yo.l1 r0 = com.obwhatsapp.yo.l1.f801b     // Catch:{ Exception -> 0x00dc }
            if (r6 != r0) goto L_0x00b9
            java.lang.String r0 = "ۚۚۥۘۢۜ۠۫ۛۜۘ۠ۜۘۢۥۨۤۢۡۘۜۢۛۧۖۡۘ"
            goto L_0x00ae
        L_0x00c3:
            java.lang.String r0 = "ۖۧۘۖ۫ۘۚ۫ۙ۠ۦۧۚۨ۠"
            goto L_0x00ae
        L_0x00c6:
            android.content.res.AssetManager r2 = f877d     // Catch:{ Exception -> 0x00dc }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00dc }
            java.lang.String r1 = "fonts"
            r0.<init>(r1)     // Catch:{ Exception -> 0x00dc }
            java.lang.String r1 = java.io.File.separator     // Catch:{ Exception -> 0x00dc }
            r0.append(r1)     // Catch:{ Exception -> 0x00dc }
            java.lang.String r1 = f878e     // Catch:{ Exception -> 0x00dc }
            r0.append(r1)     // Catch:{ Exception -> 0x00dc }
            java.lang.String r1 = "-Bold.ttf"
            goto L_0x008f
        L_0x00dc:
            r0 = move-exception
            r0 = r3
            goto L_0x0026
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.yo.shp.a(com.obwhatsapp.yo.l1):android.graphics.Typeface");
    }

    /* JADX WARNING: Removed duplicated region for block: B:1:0x0002 A[LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.Map<java.lang.String, ?> getAllPriv() {
        /*
            java.lang.String r0 = "۬ۗۗۚۢۦۡۡ۬ۚۗ۠ۥ۫ۜۘۛۦۦ۬۫ۛ"
        L_0x0002:
            int r1 = r0.hashCode()
            r2 = 930(0x3a2, float:1.303E-42)
            r3 = 421454440(0x191ee268, float:8.214131E-24)
            r1 = r1 ^ r2
            r1 = r1 ^ r3
            switch(r1) {
                case 1833550822: goto L_0x0011;
                default: goto L_0x0010;
            }
        L_0x0010:
            goto L_0x0002
        L_0x0011:
            android.content.SharedPreferences r0 = f874a
            java.util.Map r0 = r0.getAll()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.yo.shp.getAllPriv():java.util.Map");
    }

    public static boolean getBoolean(String str) {
        String str2 = "ۛۚۖۜۙۜۘۨۖۘۘ۫ۥۡۘۚۜۢۢۛۧ";
        while (true) {
            switch ((str2.hashCode() ^ 686) ^ -169300089) {
                case -720099404:
                    str2 = "ۗۤۗۖۡۥۗۨۖۘۡۗۗ۠ۧۦۘۢۥۦۘ۫ۗۧۤۗ۠";
                    break;
                case 1997952471:
                    return prefs.getBoolean(str, false);
            }
        }
    }

    public static boolean getBoolean(String str, boolean z2) {
        String str2 = "ۗ۬ۡۨۙۚۖۡۜۘ۠ۛۘۘۤۘۜ";
        while (true) {
            switch ((str2.hashCode() ^ 780) ^ -546171452) {
                case -1607392160:
                    return prefs.getBoolean(str, z2);
                case -811853615:
                    str2 = "ۜ۟ۖۥۢۢۥۥ۫ۤۙ۬ۚۡۡۘۧۗۢ۫ۚۤۗ۠ۘۘ";
                    break;
                case -684312191:
                    str2 = "ۖۤۦۡ۟ۖۧۗۨۖۚۨۥۖۥۡ";
                    break;
            }
        }
    }

    public static boolean getBooleanPriv(String str) {
        String str2 = "ۘۢ۠۟۠۠۟۠ۜۦۤ۬۠ۙۛۥۧۤۤ۟";
        while (true) {
            switch ((str2.hashCode() ^ 203) ^ 1814597503) {
                case -618995325:
                    str2 = "ۛۜۢۖۜ۬ۙۧۚۡۤۤۘۗۖۘ";
                    break;
                case 1143445167:
                    return f874a.getBoolean(str, false);
            }
        }
    }

    public static boolean getBooleanPriv(String str, boolean z2) {
        String str2 = "ۡۧۡۘ۠۫ۛۜۖۘۡۢ۫ۚۢۨۘ";
        while (true) {
            switch ((str2.hashCode() ^ 770) ^ -1308997707) {
                case 83940698:
                    str2 = "ۛۘ۬ۖۦۥۘۢۗۡۘۡ۫ۘ۠ۡۖۘۥۨۘۧۘ۟۫۬";
                    break;
                case 756992224:
                    str2 = "۬ۘۙۛ۟ۡ۠ۜ۠۬ۜۥۛۢۘۘۡۦ۠ۢۧۡۘۙ۫۫ۡۤ";
                    break;
                case 1272836762:
                    return f874a.getBoolean(str, z2);
            }
        }
    }

    public static float getFloatPriv(String str) {
        String str2 = "ۘ۫ۚۛۚۥۚۙ۠ۨۜۚۘ۟ۥۧۗۤۥۘۚۗ۬";
        while (true) {
            switch ((str2.hashCode() ^ 856) ^ -2060680288) {
                case -49450918:
                    str2 = "ۖۙۡۚۚۜۘۧۦۛۚۡۥۘۘۦۦۘ";
                    break;
                case 1233598020:
                    return f874a.getFloat(str, 1.0f);
            }
        }
    }

    public static String getFontName() {
        try {
            return getStringPriv("font", getPrefString("font", "Default"));
        } catch (Exception e2) {
            return "Default";
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Object[] getGradientColor(java.lang.String r18) {
        /*
            r14 = 0
            r13 = 0
            r12 = 0
            r11 = 0
            r10 = 0
            r9 = 0
            r8 = 0
            r7 = 0
            r5 = 0
            r4 = 0
            r3 = 0
            r2 = 0
            r6 = 0
            java.lang.String r1 = "ۖۢ۠ۨ۟ۨۨۛۖۧۛۖۙۖۨۘۦۙۦۜۘۜۘ۫۬ۨۘ۫۫ۤ"
        L_0x000f:
            int r15 = r1.hashCode()
            r16 = 730(0x2da, float:1.023E-42)
            r17 = 1409226822(0x53ff1846, float:2.1912478E12)
            r15 = r15 ^ r16
            r15 = r15 ^ r17
            switch(r15) {
                case -2073638358: goto L_0x0140;
                case -2028495144: goto L_0x0067;
                case -1996914527: goto L_0x005f;
                case -1895059296: goto L_0x008c;
                case -1838618281: goto L_0x0023;
                case -1837677306: goto L_0x010b;
                case -1779693103: goto L_0x012f;
                case -1390638092: goto L_0x017c;
                case -1016813248: goto L_0x013a;
                case -875875676: goto L_0x00ec;
                case -749378142: goto L_0x0030;
                case -580324845: goto L_0x0145;
                case -551884946: goto L_0x017c;
                case -547312401: goto L_0x003d;
                case -496472549: goto L_0x0083;
                case -427942392: goto L_0x0088;
                case -118974946: goto L_0x0135;
                case -52058432: goto L_0x017c;
                case -45821533: goto L_0x00aa;
                case -15315717: goto L_0x014b;
                case 583476474: goto L_0x00c9;
                case 643317581: goto L_0x0020;
                case 743175490: goto L_0x0045;
                case 828676282: goto L_0x0150;
                case 1108360350: goto L_0x006f;
                case 1279467074: goto L_0x005a;
                case 1462174768: goto L_0x004d;
                case 1568177397: goto L_0x0035;
                case 1581020621: goto L_0x012a;
                case 1730471070: goto L_0x0077;
                case 1936005346: goto L_0x017c;
                case 2008833476: goto L_0x015b;
                case 2020548103: goto L_0x0156;
                default: goto L_0x001f;
            }
        L_0x001f:
            goto L_0x000f
        L_0x0020:
            java.lang.String r1 = "ۤ۫ۖۡ۟ۤۢۦۘۜۧۨۛۨۦۘۗۛۥۖۡۘ"
            goto L_0x000f
        L_0x0023:
            android.content.SharedPreferences r1 = prefs
            r14 = -11
            r0 = r18
            int r14 = r1.getInt(r0, r14)
            java.lang.String r1 = "ۙ۫ۧ۫۫ۥۧۥ۠۫ۖۘۘ۫ۖۘۘۘۗۡۘ"
            goto L_0x000f
        L_0x0030:
            android.content.SharedPreferences r13 = prefs
            java.lang.String r1 = "ۧ۠ۢ۟۬ۧ۬ۢۢۥ۟۬۟۫ۥۘۜ۠ۛۖۨ۠ۗۨۧ"
            goto L_0x000f
        L_0x0035:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r1 = "ۨ۫ۜ۟ۦ۬ۗ۟ۚۥۦۧۚ۟ۦۘ۫ۘۘۙۙۜۘۢۧۘۘۗۗۨ"
            goto L_0x000f
        L_0x003d:
            r0 = r18
            r12.append(r0)
            java.lang.String r1 = "ۨ۬ۘۘۜۧۘۘۛۜۧ۟۠ۖ۠۫ۢۙۨۢۚۤۢ"
            goto L_0x000f
        L_0x0045:
            java.lang.String r1 = "_GC"
            r12.append(r1)
            java.lang.String r1 = "ۨ۟ۘۛۜۙۘۛ۠۫ۛۦۘۜۥۡۘ۫ۛۗ۫ۢۜ۬۠ۦ"
            goto L_0x000f
        L_0x004d:
            java.lang.String r1 = r12.toString()
            r11 = -11
            int r11 = r13.getInt(r1, r11)
            java.lang.String r1 = "۟ۜۨۘ۠ۖۦ۫ۧۖۘۖۙۛۤۗۚۧۖۢۥۦ۠ۥۧۖۘۜۨۦۘ"
            goto L_0x000f
        L_0x005a:
            android.content.SharedPreferences r10 = prefs
            java.lang.String r1 = "ۧۖۖۘ۠ۚۤۨ۠ۗۛۧۛ۠ۗۡۤۜۨۘۤ۟ۘۘ۠ۦۨۚۗۖۘ"
            goto L_0x000f
        L_0x005f:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r1 = "۠ۛ۟ۧۧۙۜۗۙۗۨۜۘۚۖۖ"
            goto L_0x000f
        L_0x0067:
            r0 = r18
            r9.append(r0)
            java.lang.String r1 = "ۘۨ۠۠۠ۛۤ۟ۡ۬ۜۛۤۤۥۦۨۦۘۖۘۡۘ"
            goto L_0x000f
        L_0x006f:
            java.lang.String r1 = "_GCDir"
            r9.append(r1)
            java.lang.String r1 = "ۖۛۥۥ۫ۖۘ۬۬ۦۖۦۜۘۢۚۙۚۡۦۘ۠ۘۤۨۡۗۘۥۥۘ"
            goto L_0x000f
        L_0x0077:
            java.lang.String r1 = r9.toString()
            r8 = 0
            int r8 = r10.getInt(r1, r8)
            java.lang.String r1 = "ۨۖ۫ۡ۫ۧ۠ۧۤۛۨۦۘۖۗۧۨۥۦۘۧۙۜۘ"
            goto L_0x000f
        L_0x0083:
            android.graphics.drawable.GradientDrawable$Orientation r7 = android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM
            java.lang.String r1 = "ۨ۬ۜۘ۫ۜۖۨ۬ۥۘۤۥۦ۠۫"
            goto L_0x000f
        L_0x0088:
            java.lang.String r1 = "ۦۧۘۢۖ۫ۢ۠ۛۦۖۛۢۛ۫ۨۖۘۚۙ۠۬ۜۧ"
            r6 = r7
            goto L_0x000f
        L_0x008c:
            r15 = -1902825731(0xffffffff8e952efd, float:-3.6776584E-30)
            java.lang.String r1 = "ۙۦۘۘۥۢۛۙۦۨۢۢ۟ۚۜۤ"
        L_0x0091:
            int r16 = r1.hashCode()
            r16 = r16 ^ r15
            switch(r16) {
                case -2070706418: goto L_0x017c;
                case 134833589: goto L_0x00a6;
                case 247482288: goto L_0x00a1;
                case 1234117152: goto L_0x009b;
                default: goto L_0x009a;
            }
        L_0x009a:
            goto L_0x0091
        L_0x009b:
            java.lang.String r1 = "۟ۤۨۘۦۛۦۧۥۖۚۦۧۘۨ۬ۜۨۙۙۡۨ۫ۧۙۜ۬ۚۥ"
            goto L_0x0091
        L_0x009e:
            java.lang.String r1 = "ۤۨ۠ۤۦۡۛۙۥۘۤۧۘۤۧۥۘۢ۠ۨ۬ۥ۠ۦۨۦۘۜۧ"
            goto L_0x0091
        L_0x00a1:
            if (r8 == 0) goto L_0x009e
            java.lang.String r1 = "ۧ۫ۜ۫ۦۗ۠۬۫ۘۘۧۧۖۗۥ۠ۦۗ۬ۡ"
            goto L_0x0091
        L_0x00a6:
            java.lang.String r1 = "ۥ۟ۦۜۦۖۘ۬۫۫ۡۙ۟ۘ۟۫ۖۗ۬ۜ۟ۧۤۡۡ۬ۗۤ"
            goto L_0x000f
        L_0x00aa:
            r15 = 1512414457(0x5a259cf9, float:1.16539911E16)
            java.lang.String r1 = "ۥۢ۫ۥۢۦۦۛ۫ۙۡۜۜۖ۟ۥ۬ۦۧۙۨۘۚۖ۫"
        L_0x00af:
            int r16 = r1.hashCode()
            r16 = r16 ^ r15
            switch(r16) {
                case -1848132507: goto L_0x00c5;
                case -1551249196: goto L_0x00b9;
                case -385705373: goto L_0x00bf;
                case 470094767: goto L_0x0178;
                default: goto L_0x00b8;
            }
        L_0x00b8:
            goto L_0x00af
        L_0x00b9:
            java.lang.String r1 = "ۗ۬ۨۘۥ۬ۖۘۧۥۧۤۜۗۗۦۗۖ۫۬ۢۙۨۘۧۥ۟ۘۜۧ"
            goto L_0x00af
        L_0x00bc:
            java.lang.String r1 = "۠ۘۘۘۙ۬ۨۚۚۖۦۦۦۘۗۨۜۜۧۦ۟۫۠ۜۧۚ"
            goto L_0x00af
        L_0x00bf:
            r1 = 1
            if (r8 == r1) goto L_0x00bc
            java.lang.String r1 = "ۛۢۘۘۚ۟ۦۧۗۙۧۗۚۧۙ"
            goto L_0x00af
        L_0x00c5:
            java.lang.String r1 = "ۛ۬ۧۢۗۙ۬۟ۛۡۖۨۘۗۜۤۙۘۧۢ۬ۦۘ۟۟ۖۘ"
            goto L_0x000f
        L_0x00c9:
            r15 = -118646426(0xfffffffff8ed9966, float:-3.8552676E34)
            java.lang.String r1 = "ۡۥۧۘۨۚ۬ۙۤ۟ۨ۬ۤۨۛۤ"
        L_0x00ce:
            int r16 = r1.hashCode()
            r16 = r16 ^ r15
            switch(r16) {
                case -1910227738: goto L_0x00df;
                case -1267181184: goto L_0x00e8;
                case 916224852: goto L_0x00d8;
                case 1829621121: goto L_0x00e5;
                default: goto L_0x00d7;
            }
        L_0x00d7:
            goto L_0x00ce
        L_0x00d8:
            java.lang.String r1 = "ۧۡۤۢۨۥۘۙۡۘۘۢۡۥۗ۫"
            goto L_0x000f
        L_0x00dc:
            java.lang.String r1 = "ۤۥ۟ۢۘۛۢۘۛ۬ۘۘۙ۬۫ۡۛۖۧۗۜ۟ۥۦۘ"
            goto L_0x00ce
        L_0x00df:
            r1 = 2
            if (r8 == r1) goto L_0x00dc
            java.lang.String r1 = "ۥ۟۟ۨۨۨۢۦۡۨۗۧ۬ۙۡۘۢۥ۬"
            goto L_0x00ce
        L_0x00e5:
            java.lang.String r1 = "ۤۘۖۘ۫ۥۛۜۜ۟ۤۤۗۤۧ"
            goto L_0x00ce
        L_0x00e8:
            java.lang.String r1 = "ۢۙۥۘۘۜۧۥ۫ۥۘۦ۫ۡ۫ۙ۟۠ۥۤ"
            goto L_0x000f
        L_0x00ec:
            r15 = -312218986(0xffffffffed63ea96, float:-4.4085434E27)
            java.lang.String r1 = "۠ۨ۟ۨۚۖۘۘۡ۬ۥۜۗ۟ۡۨۘۦۤۘۘۡۤۖۘ۬ۧۦۘ"
        L_0x00f1:
            int r16 = r1.hashCode()
            r16 = r16 ^ r15
            switch(r16) {
                case -1006438760: goto L_0x0107;
                case 650904742: goto L_0x0174;
                case 1527307097: goto L_0x00fb;
                case 1714811324: goto L_0x0101;
                default: goto L_0x00fa;
            }
        L_0x00fa:
            goto L_0x00f1
        L_0x00fb:
            java.lang.String r1 = "ۛۡ۟ۢۥۦۘ۟ۥۧۤۤۙۨۖ۟ۡۥۢۨۨۡۘۨۧۗ"
            goto L_0x00f1
        L_0x00fe:
            java.lang.String r1 = "ۘۗۤ۟۟ۖۘ۫۫۠ۤۘۚۜۨۘۥۜۥۧۢ۟۫۠ۚ"
            goto L_0x00f1
        L_0x0101:
            r1 = 3
            if (r8 == r1) goto L_0x00fe
            java.lang.String r1 = "ۡ۟ۨ۬ۜۡۘۢۚ۟۫ۖۦۜ۟ۧۗۤۛ"
            goto L_0x00f1
        L_0x0107:
            java.lang.String r1 = "ۙۢۖۘۦۢ۟ۙۘۧۖ۫ۘۘ۬ۜۘۥۧۛۦۥ۠ۗۙۧ"
            goto L_0x000f
        L_0x010b:
            r15 = 1091768339(0x41131013, float:9.191424)
            java.lang.String r1 = "ۜ۠ۦۖۥۢ۬۫ۡۦۧۖۖۨ۫ۧۘ۠ۜۖۖۤ۬۬ۚۥ"
        L_0x0110:
            int r16 = r1.hashCode()
            r16 = r16 ^ r15
            switch(r16) {
                case -1829811554: goto L_0x011a;
                case -1735229846: goto L_0x0170;
                case 650316416: goto L_0x0123;
                case 874219103: goto L_0x0126;
                default: goto L_0x0119;
            }
        L_0x0119:
            goto L_0x0110
        L_0x011a:
            r1 = 4
            if (r8 == r1) goto L_0x0120
            java.lang.String r1 = "ۛ۫ۘۜ۫ۗۡۛۖۡۢۙ۫ۜۧۦ۟ۘۘۨ۬ۜۘ"
            goto L_0x0110
        L_0x0120:
            java.lang.String r1 = "۫۬ۖۘۢۢۨۘۨۤ۫ۡۗۡۘۦۛۗ"
            goto L_0x0110
        L_0x0123:
            java.lang.String r1 = "ۧۚ۠ۦۡۦ۫ۙۘۜ۬ۦۚۖۡۨۦۧ۟ۘ۬ۖۦۧۡۛ"
            goto L_0x0110
        L_0x0126:
            java.lang.String r1 = "ۚۨ۟ۛ۟ۦۦۦۦ۟ۦۢۗۜۢۚۨۖ"
            goto L_0x000f
        L_0x012a:
            java.lang.String r1 = "۫ۚۢ۠ۧۤۡ۫ۚۚۦۜۤ۬ۧۨ۟ۛۚ۫ۚۖۡۨۧۦ۠"
            r6 = r7
            goto L_0x000f
        L_0x012f:
            android.graphics.drawable.GradientDrawable$Orientation r5 = android.graphics.drawable.GradientDrawable.Orientation.RIGHT_LEFT
            java.lang.String r1 = "۠ۥۜۘ۟ۢۜۡ۟ۖۙۡۘۤ۟ۡۘ"
            goto L_0x000f
        L_0x0135:
            java.lang.String r1 = "ۗۛ۫۬ۖۡۘۨۚۗۗۜۨ۟۫ۨ۬ۡۧۘ"
            r6 = r5
            goto L_0x000f
        L_0x013a:
            android.graphics.drawable.GradientDrawable$Orientation r4 = android.graphics.drawable.GradientDrawable.Orientation.BOTTOM_TOP
            java.lang.String r1 = "ۘۨۡۛ۟ۡۘۙۙۦۘۨۖ۠ۛۡۜۘ"
            goto L_0x000f
        L_0x0140:
            java.lang.String r1 = "ۘۧۥۘۡۨۦۘۜۙۚۜۡ۬ۖ۟ۖ"
            r6 = r4
            goto L_0x000f
        L_0x0145:
            android.graphics.drawable.GradientDrawable$Orientation r3 = android.graphics.drawable.GradientDrawable.Orientation.TR_BL
            java.lang.String r1 = "۫ۜۙۤ۠۟ۨ۬ۙۦۦۢۖۜۙۜ۬ۥۦۤۤۦۨۡۖ۬۠"
            goto L_0x000f
        L_0x014b:
            java.lang.String r1 = "۠۟ۗۢۦۨۚۘۗ۟۫ۜۘۦ۬ۘۘۡ۫ۗ"
            r6 = r3
            goto L_0x000f
        L_0x0150:
            android.graphics.drawable.GradientDrawable$Orientation r2 = android.graphics.drawable.GradientDrawable.Orientation.LEFT_RIGHT
            java.lang.String r1 = "ۢۘ۬ۢۘ۫ۨۛۧۘۜۦۤ۠ۡۜۛ۟ۥۘ"
            goto L_0x000f
        L_0x0156:
            java.lang.String r1 = "۬ۛۦۘۥۚۛ۠ۡۨۧ۬ۛۜ۫ۛ"
            r6 = r2
            goto L_0x000f
        L_0x015b:
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r6
            r2 = 1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r14)
            r1[r2] = r3
            r2 = 2
            java.lang.Integer r3 = java.lang.Integer.valueOf(r11)
            r1[r2] = r3
            return r1
        L_0x0170:
            java.lang.String r1 = "۠ۘۚۗ۬ۨۘۦ۠ۡۨۥۨۨۧۖۙۘۘ"
            goto L_0x000f
        L_0x0174:
            java.lang.String r1 = "۬۬۠۫ۦۙۛۛۘۘۗۙۙۡۛۥۘۧۙۛ۠ۡ۠"
            goto L_0x000f
        L_0x0178:
            java.lang.String r1 = "۫ۨۘۧۘۥۡ۟ۡ۫۟ۛۢ۫"
            goto L_0x000f
        L_0x017c:
            java.lang.String r1 = "۬ۛۦۘۥۚۛ۠ۡۨۧ۬ۛۜ۫ۛ"
            goto L_0x000f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.yo.shp.getGradientColor(java.lang.String):java.lang.Object[]");
    }

    /* JADX WARNING: type inference failed for: r1v10, types: [java.lang.Object[]] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.drawable.GradientDrawable getGradientDrawable(java.lang.String r8) {
        /*
            r7 = 2
            r6 = 1
            r5 = 0
            r1 = 0
            java.lang.String r0 = "ۨ۠۫ۢۤۗۜۢۡۘۖۤۡۘ۟۬ۨۢۦۚ"
            r2 = r1
        L_0x0007:
            int r1 = r0.hashCode()
            r3 = 520(0x208, float:7.29E-43)
            r4 = -1348700524(0xffffffffaf9c7694, float:-2.846049E-10)
            r1 = r1 ^ r3
            r1 = r1 ^ r4
            switch(r1) {
                case -2120649134: goto L_0x0019;
                case 1655081731: goto L_0x0016;
                case 1803475690: goto L_0x0021;
                default: goto L_0x0015;
            }
        L_0x0015:
            goto L_0x0007
        L_0x0016:
            java.lang.String r0 = "ۜۗۡۨۥ۠۬ۖۖۘۥۡۡۘۙ۫ۘۘۗ۠ۡۘ"
            goto L_0x0007
        L_0x0019:
            java.lang.Object[] r1 = getGradientColor(r8)
            java.lang.String r0 = "ۙۚۦۘۥ۬ۗۙۧۛۨۥۗ۬ۨۜۘۘۜ۫۫ۨۜۘۙۡۜ"
            r2 = r1
            goto L_0x0007
        L_0x0021:
            android.graphics.drawable.GradientDrawable r3 = new android.graphics.drawable.GradientDrawable
            r0 = r2[r5]
            android.graphics.drawable.GradientDrawable$Orientation r0 = (android.graphics.drawable.GradientDrawable.Orientation) r0
            int[] r4 = new int[r7]
            r1 = r2[r6]
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r4[r5] = r1
            r1 = r2[r7]
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r4[r6] = r1
            r3.<init>(r0, r4)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.yo.shp.getGradientDrawable(java.lang.String):android.graphics.drawable.GradientDrawable");
    }

    public static int getIntPriv(String str) {
        String str2 = "ۨۜۛۤۖۛۧۜۦۘۨۨ۫ۗۖۘۘۚۜۦۘۧۢۖۘۤۥۜۙۧۖۘ";
        while (true) {
            switch ((str2.hashCode() ^ 234) ^ 703795033) {
                case 558468650:
                    str2 = "ۡۘۧۘۧۥ۫۬ۙۖۘ۠۬ۧ۫ۤۚ";
                    break;
                case 1368714441:
                    return f874a.getInt(str, 0);
            }
        }
    }

    public static int getIntPriv(String str, int i2) {
        String str2 = "ۢ۠ۘۘۨ۟۫ۨۥۜۜۛۖۘۗۦ۟ۙۚۙۡۖۗۢۘۧۘ۟ۦۨۘ";
        while (true) {
            switch ((str2.hashCode() ^ 950) ^ -920317475) {
                case -1008825057:
                    return f874a.getInt(str, i2);
                case 351968374:
                    str2 = "ۘۙۥۤ۠ۜۘ۫۠ۜۢۥۤ۟ۘ۬ۢۥۢۛۧۚ۠۬ۥۤۙۦۘ";
                    break;
                case 472409381:
                    str2 = "ۛ۫ۥۘ۬ۡۨۘۛۛۘۘ۬ۘۨۘۙۧۚۜ۬ۘۖۛۨۤۖۢۛۨۗ";
                    break;
            }
        }
    }

    public static boolean getIsGradiet(String str) {
        String str2 = "ۧ۟ۤۡۙ۟ۖ۠ۡۘۚۜۛۨۦۘۦۧ";
        StringBuilder sb = null;
        SharedPreferences sharedPreferences = null;
        while (true) {
            switch ((str2.hashCode() ^ 121) ^ 387662565) {
                case -1954706355:
                    sb.append("_Gactive");
                    str2 = "۬ۨۧۨۖۨ۫ۜۘۘۥ۠ۥۘ۫ۦ۫ۦۧۖ";
                    break;
                case -1718881742:
                    sb.append(str);
                    str2 = "ۡۡۤ۠ۤۦۡ۟ۙۦۤۢۖ۬۠ۡۦۢۡۜۧۚۤۨۗۚۖۘ";
                    break;
                case -85334959:
                    sb = new StringBuilder();
                    str2 = "ۡۛۥۥ۟ۢۥۜۘ۬ۜۥۧۙۥۙۨۨ۫ۧۡۘۗۦۗۢۡۧۘ";
                    break;
                case 305416482:
                    str2 = "ۥۨۙۧۘۧۘۛۨ۟ۛۜۦۘۜۙۤۗۘۚۦ۟ۙۤۡۧ";
                    break;
                case 1240282159:
                    return sharedPreferences.getBoolean(sb.toString(), false);
                case 1826599413:
                    str2 = "ۖۢ۫۠ۗۛۧ۟ۡۘۗ۠ۘۘۚۡۘۘ۠۫ۦۖۧۚۨۡۘ";
                    sharedPreferences = prefs;
                    break;
            }
        }
    }

    public static long getLongPriv(String str, long j2) {
        String str2 = "ۜۙۜۚۛۧ۠ۙۖۢۢۘۘ۟ۨۜۘ۬۠ۧ";
        while (true) {
            switch ((str2.hashCode() ^ 929) ^ -2003116680) {
                case -83597665:
                    return f874a.getLong(str, j2);
                case 658003180:
                    str2 = "ۦ۬ۡۛ۫ۖۤ۬۬ۘۡۜۘۨۛۦۘۧۘۦۦۚۤ۫ۢۤۛۡۧۘ";
                    break;
                case 2054503841:
                    str2 = "۬ۚ۠ۤۘۛۖۥۗۡۘ۫ۛۙۙۙۗۧۨۧۜ۟ۖۨۘ";
                    break;
            }
        }
    }

    public static int getPrefInt(String str) {
        String str2 = "۠ۚ۟۟۬ۥۨۜۖۘ۠ۗۡۘۨۘۚۙۨۚۡۦۛ۟ۛۡ";
        while (true) {
            switch ((str2.hashCode() ^ 355) ^ -1993647755) {
                case -1298336997:
                    return prefs.getInt(str, 0);
                case 434658545:
                    str2 = "۬۠ۥۘۦ۫ۖۘۡۨ۬ۖۜۨ۬ۛۧ";
                    break;
            }
        }
    }

    public static int getPrefInt(String str, int i2) {
        String str2 = "ۖ۬ۘۘۢۘۨۘۡ۟ۡۘ۟ۙۨۘۨۧۧ";
        while (true) {
            switch ((str2.hashCode() ^ 920) ^ -413472354) {
                case -1945889323:
                    str2 = "۬ۡۜۘۦۗۡۘۖ۫ۥۘۛۗۛۨۥۧۘۗ۬ۗۜۦۜۙۥ";
                    break;
                case 1129884046:
                    return prefs.getInt(str, i2);
                case 1881240683:
                    str2 = "۟ۤ۟ۡۥ۫ۛۚۧۡۥۛ۫ۢ۟ۨۛۘۘ۫۬ۥۘ";
                    break;
            }
        }
    }

    public static String getPrefString(String str) {
        String str2 = "ۦۦۖ۫ۤۧ۟۠ۜۧۥۡۘۨۘ";
        while (true) {
            switch ((str2.hashCode() ^ 69) ^ 185395945) {
                case -902545788:
                    str2 = "ۚۢۗۦۡۖۘۦ۟ۡۘ۫ۤۧ۟ۥ۬ۧۤۧۡۘۖۘ";
                    break;
                case -9192669:
                    return prefs.getString(str, "");
            }
        }
    }

    public static String getPrefString(String str, String str2) {
        String str3 = "ۨۡۤۢۡۦۘ۟ۚۜ۫ۚۢۜ۬ۘ۬۟ۦۤۧۥۘۖۦۗۙۧ";
        while (true) {
            switch ((str3.hashCode() ^ 644) ^ 528507022) {
                case -540468120:
                    return prefs.getString(str, str2);
                case 1784347340:
                    str3 = "ۘۤۖۘۛۙۜۙۙۙۗ۬ۨۘۦۛۥۗۦۛۥۜۦ";
                    break;
                case 1899981903:
                    str3 = "ۚۡۘۘۛ۠۬ۘۖۧۘۛۤۦۘۘ۟ۨۘۗۥۚ۠۬ۡۙۨۘ۠ۥۦ";
                    break;
            }
        }
    }

    public static String getStringPriv(String str) {
        String str2 = "ۦۥۛۢۗۗۨۡۥۜۧۢۨۙۤۚۨ۠ۘۜ۬ۨ۫";
        while (true) {
            switch ((str2.hashCode() ^ 249) ^ 1401231994) {
                case -1077366056:
                    str2 = "ۘۗۢۚۤۜۖۢۡۘۤۨۙۧۚۨۘۥۨۡۖۤۜۖۥۛ";
                    break;
                case -763087051:
                    return f874a.getString(str, "");
            }
        }
    }

    public static String getStringPriv(String str, String str2) {
        String str3 = "ۜۦۘۜۘۧ۠ۡ۠ۘۘۤۧۤۡ۫ۢۢۚ۫ۨۥۚۨۢۦۘ";
        while (true) {
            switch ((str3.hashCode() ^ 671) ^ 225554635) {
                case -1252806405:
                    str3 = "ۘ۫ۡۘۢۦۛۧۛۨۘ۬ۧۦ۬ۧۚۚۥۡ";
                    break;
                case -1133866363:
                    str3 = "ۗۥۡۖ۬۬ۗۘۘۢۛۘۗۡۤۤ۬ۨۘۥ۠۫۫ۙۡۘ";
                    break;
                case -166825222:
                    return f874a.getString(str, str2);
            }
        }
    }

    public static void init(Context context) {
        String str = "۠۬ۙۦۤ۟ۗۖۨۘۙۧ۬ۥۗۢۥۖۢ۟۠ۘۛۛۡ۫۫۫";
        SharedPreferences sharedPreferences = null;
        StringBuilder sb = null;
        SharedPreferences sharedPreferences2 = null;
        String str2 = null;
        StringBuilder sb2 = null;
        SharedPreferences sharedPreferences3 = null;
        Context context2 = null;
        Context context3 = null;
        Context context4 = null;
        while (true) {
            switch ((str.hashCode() ^ 10) ^ -1318460395) {
                case -1968114549:
                    str = "ۖۗۡۡۦۘ۬ۗۡۘ۟۟ۢۗ۟۬ۨۨ۠ۢۢۡۘ۟ۙ۠ۧ۫۟";
                    break;
                case -1910140165:
                    sharedPreferences = context3.getSharedPreferences(sb.toString(), 0);
                    str = "ۢۚۨۗۦۘۨ۫ۤۜۘۡۛۢۦۘۨۧۚۢ۟ۛ";
                    break;
                case -1886951932:
                    f876c = context3.getSharedPreferences("server_prop_preferences", 0).edit();
                    str = "ۢۨۨۘۗۧ۬۠ۚ۟ۦۛۗۦۧۨۘۘۦ۬ۧ۠";
                    break;
                case -1688113126:
                    str = "ۛۧۛۧۨ۠ۙ۫ۦۘۦ۫ۤۥۙ۬";
                    break;
                case -1584996979:
                    prefsEditor = sharedPreferences3.edit();
                    str = "ۦۢ۟ۚۘۧۢۘۦۨ۫۬۬۟ۘ۠ۢۜ۠ۤ۫ۡۙ۟۬۟";
                    break;
                case -1433453704:
                    prefs = sharedPreferences3;
                    str = "ۧۡۤۢۜۜۛۗۗۡۖۧۘۛۤ۠ۗۛ";
                    break;
                case -1363047905:
                    context3.getSharedPreferences(sb2.toString(), 0).edit();
                    str = "ۙۨۘۥۤۤۖۛ۠ۡۜۥۘۦۖۨ۬ۥۘ";
                    break;
                case -1136384025:
                    sb.append("_preferences_light");
                    str = "۬۟ۥۚۢ۠ۦۧۥۘۖۚۘۘۢۘۧۘۗۙۡۘ۟ۨۦۤۗۖ";
                    break;
                case -1078845157:
                    privprefsname = str2;
                    str = "ۡۙۢۦۚۗۘۗۙ۫ۘۛۡۥ";
                    break;
                case -1069903751:
                    String str3 = "ۛۦۙ۠ۚۜۘۖ۟۫ۛ۟ۢۙ۬ۖۨ";
                    while (true) {
                        switch (str3.hashCode() ^ -1636525160) {
                            case -1680960532:
                                str = "ۙۢ۬ۡ۬ۤۢۜۧۘۗۧۚۨۥۤۘ۠ۜ۠۠ۢۙۖ۟";
                                continue;
                            case -1546611939:
                                if (context4 != null) {
                                    str3 = "۟ۛۘۧۡۜۘ۫ۜۥۙۜۥۘۡۥۨۢۡۡۘۥ۫ۛۛ۠ۗۨۡ۬";
                                    break;
                                } else {
                                    str3 = "ۘ۫ۨ۬ۙۢۡۨۥۘۦۦ۟۟ۖۜ۫۠";
                                    break;
                                }
                            case -1477831827:
                                str3 = "ۢ۬ۘۜۚ۬ۜۗۦۘۧۗۡۗۖۙۨۡۨۤۦۥۘ۟ۤۖۘۥۥۛ";
                                break;
                            case -1401939106:
                                str = "ۛ۠ۨۘ۬ۖۥۘۜۡۘۜۚۙۖۛ";
                                continue;
                        }
                    }
                    break;
                case -943093178:
                    stockPrefsLight = sharedPreferences;
                    str = "ۜۚۨۘۙۘۘۨ۬ۧۚۖۜۢۢۙۛۖۡۧۙۗۗۜۢۗۖۜ";
                    break;
                case -935089709:
                    sb2.append("_preferences");
                    str = "ۗ۟ۤۥ۬ۢ۠ۧۨۗۘۗۧۥۧۘۖۧۡۘۢۗ۠";
                    break;
                case -696430350:
                    context4 = yo.getCtx();
                    str = "ۧ۬ۛۚۘۛۧ۟ۘۘ۠ۥۖ۫۬ۥۘ";
                    break;
                case -658613419:
                    return;
                case -417105621:
                    str = "ۨۗۜۘۤۨۗۖۡ۠۟ۖۘۡۧۖۘۢۡۙۤۧۥ";
                    str2 = utils.dbsf("V2hhdHNBcHByaXY=", 1);
                    break;
                case -313853681:
                    stockLightPrefs = sharedPreferences.edit();
                    str = "ۘۥۡ۬ۨۘۘۚۜۥ۫ۗۥۘۨۤۥۘۤۤۡۘۥۗۛۤۛۨۘۢۥۥ";
                    break;
                case -104416840:
                    str = "ۢۚۡۘۗۢۘ۫ۗۘۘۚۘ۠ۥۚۢۗۜۧۧۖۚۥۡۚ۠ۛۙ";
                    sb2 = new StringBuilder();
                    break;
                case 238523886:
                    str = "ۢۚۜۤۧۛ۫ۖۖۢۦۨۘۖۘۗ";
                    sharedPreferences2 = context3.getSharedPreferences(str2, 0);
                    break;
                case 252231669:
                    f874a = sharedPreferences2;
                    str = "ۦۚۥۖ۟۠۬ۗۦۡۨۥ۬ۜۖۧۦۜۦ۫ۦۘۥ۬ۤ";
                    break;
                case 252678945:
                    sb2.append(yo.mpack);
                    str = "ۚۧۗۥۦۡۘۨۙ۠۫۫ۘۘۖ۬ۨۢۙۨ";
                    break;
                case 843882585:
                    str = "ۖۗۡۡۦۘ۬ۗۡۘ۟۟ۢۗ۟۬ۨۨ۠ۢۢۡۘ۟ۙ۠ۧ۫۟";
                    context3 = context2;
                    break;
                case 1133360713:
                    str = "ۧۚۖۘ۫۬ۖ۠۟ۘۘۙۤۨۘۨۙ۟ۧ۟۠ۖۨ";
                    context2 = context4;
                    break;
                case 1144313194:
                    str = "ۗ۠ۚۨۗۜۘۤۗۧ۬۠ۧۘۘۧ۟ۗ۫";
                    sharedPreferences3 = context3.getSharedPreferences(yo.pname, 0);
                    break;
                case 1409700096:
                    str = "۬۫ۘۤۙۛۦۘۡ۟۟ۥۦۗ۬ۨۤۨ";
                    context3 = context;
                    break;
                case 1456384089:
                    f875b = sharedPreferences2.edit();
                    str = "ۢ۫۫ۢۘۦۘۖۧ۟ۖ۫ۘۘۚ۠۫۬ۖۜۘۧۥۧۘۙۗۖۛۢۙ";
                    break;
                case 1683003676:
                    str = "ۥۡۦۘۤۨۨۜۨ۟۠ۖ۬ۖۖۧۘۘ۠ۘۚۢۤۢۢۡۘۘۘۨ";
                    sb = new StringBuilder();
                    break;
                case 1722416292:
                    sb.append(yo.mpack);
                    str = "ۢۚ۬۫۬ۥۦۜ۬۟ۥۗۨۨۦۦ۬ۛۥۧۜۘ";
                    break;
            }
        }
    }

    public static void putBoolean(String str, Boolean bool) {
        String str2 = "ۡۛۙۢ۟۬۠ۖۙ۫ۧۗ۠ۨۡۙۨۖ۬۫";
        while (true) {
            switch ((str2.hashCode() ^ 956) ^ 179487103) {
                case -1759541869:
                    prefsEditor.putBoolean(str, bool.booleanValue()).commit();
                    str2 = "۬ۖۦۘۧۥۘۧۨ۬ۤۨۧۘۚۥۡۗ۬ۡۘۘ۬ۥ";
                    break;
                case -1347809870:
                    return;
                case 1372985270:
                    str2 = "ۥۢۖ۫ۙۨۘۤۛۜۤۘۛۙۗۦ";
                    break;
                case 1519316556:
                    str2 = "ۦۚۦۘ۫ۙۡۦ۟ۤ۠ۡۜۘۧۜ";
                    break;
            }
        }
    }

    public static void putColor(String str, int i2) {
        String str2 = "ۢۘۜۘۜۢۡۘ۟ۧ۠ۖۘ۫ۢۜ۟ۥۗۡۘۥۦۚ";
        while (true) {
            switch ((str2.hashCode() ^ 697) ^ -1206002732) {
                case -2025929031:
                    str2 = "۬ۤ۫ۖۥ۠ۢۚۢۡ۫ۢۢۚۡۛۦۨۖۚۖۘۤۚۘۢۨۜ";
                    break;
                case -1343045731:
                    return;
                case 610596311:
                    prefsEditor.putInt(str, i2).commit();
                    str2 = "۫ۧۚۙ۬ۥۥۨ۫ۡ۟ۥۛۦۗۦ۟ۢ";
                    break;
                case 1423251686:
                    str2 = "ۢۖۧۘۢۚۘۘۦۨ۟۬ۚۨۘ۠ۨۦۡۢۚۛۜ۫ۡۤ";
                    break;
            }
        }
    }

    public static void putGradientColor(String str, int i2, int i3, int i4) {
        String str2 = "ۙۛۖۢۦۖۘۛۖۜۘۖۥۧ۟ۡۨۤۙ۫ۚۨۡ۫۠ۙۡۡۘ";
        String str3 = null;
        StringBuilder sb = null;
        String str4 = null;
        StringBuilder sb2 = null;
        while (true) {
            switch ((str2.hashCode() ^ 319) ^ -1859804962) {
                case -1635400310:
                    setIsGradiet(str, true);
                    str2 = "ۢۦ۟ۤ۫ۨۥۤۜۦ۠ۤ۫ۗۖۘۧ۫ۨ";
                    break;
                case -1616208075:
                    sb.append(str);
                    str2 = "ۥۨۧۘۡ۬ۖ۟ۙۜۗۚ۠ۨۦۜ";
                    break;
                case -1408260301:
                    prefsEditor.putInt(str3, i4);
                    str2 = "ۥ۟ۖۘۡۜۧۘۗۤۡۧۚ۟ۚۡۖۦۙۘۘ";
                    break;
                case -1259217720:
                    str3 = sb.toString();
                    str2 = "ۛۤۚۢۜۨ۫ۚۦۘۚۢۡۘ۬ۗۡۖۙۡ۟ۖۧۘ۫ۚۘۘۨۜۦ";
                    break;
                case -572405433:
                    str2 = "ۗۚۨۘۧ۠ۜۙۖۢۦۛۥۘۛ۬۟ۙۛۥۧۡۜۘۘۡۗۙۦۜۘ";
                    break;
                case -522753417:
                    str2 = "ۚۙۚۙۖۨۘۛۤ۠ۢ۟ۤۙۥۧۛۡۘۥۨۘۨۘۢۙۤ۟";
                    sb2 = new StringBuilder();
                    break;
                case -419956599:
                    sb2.append(str);
                    str2 = "۫۬ۛ۬ۗۦۖ۫۬ۙۡۘ۠ۨۦۘ";
                    break;
                case -4957940:
                    str2 = "ۛۨۧۡۧۘۡۚ۬ۡۘ۬۫ۦۜۥۜۜۤۘۦۘۜۦۢ";
                    sb = new StringBuilder();
                    break;
                case 98594317:
                    sb.append("_GCDir");
                    str2 = "ۡۗۘ۠ۧۨ۟ۖ۠ۦۦۦۘۥ۠ۛۜۤ۫ۖۨۚ";
                    break;
                case 128617286:
                    str2 = "ۖۢ۬ۖ۠ۜۘ۫ۡۡۘۦۦ۟ۙۡۘۤۡۨ۫ۙۙ۬ۡۦ";
                    str4 = sb2.toString();
                    break;
                case 278077335:
                    prefsEditor.putInt(str, i2);
                    str2 = "ۚۖۡۤ۠ۙۥۘۛۖۥۡۘ۠ۖۚۚۙۥۨۦۧۢۦۘ";
                    break;
                case 306242833:
                    str2 = "ۥۘۨ۟۠۟ۤۜۦۘۛۗۛۘ۬ۙۤۘۦۘۤۘۘ۟ۘۨۘ";
                    break;
                case 733784931:
                    prefsEditor.commit();
                    str2 = "ۨۦۘۘ۫ۧۥۨۘۖۚۚۦۦ۠ۦۘ۬ۙۖۘۥۖۜۘ۠ۘ";
                    break;
                case 793810478:
                    str2 = "ۨۥۖۘۖ۫ۙۛ۫ۦۤۤۧۛۖۡۘۨۤۦۘ";
                    break;
                case 863212405:
                    sb2.append("_GC");
                    str2 = "ۨۘ۬۬ۦۨۘ۬ۜ۬ۗۘۧۘۡ۫ۙ";
                    break;
                case 1413198466:
                    return;
                case 1467945986:
                    prefsEditor.putInt(str4, i3);
                    str2 = "۠ۢۗۛۗ۠۟۟۠ۗ۟ۜۦۙۘۘۥۚۦۘۢۤۥۘ";
                    break;
                case 1550048943:
                    str2 = "ۖ۫ۥۘۨ۫ۦۖۚ۫ۤۢۧۨۨۧۘۡۗۖۘ";
                    break;
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void putGradientColor(java.lang.String r11, int r12, int r13, android.graphics.drawable.GradientDrawable.Orientation r14) {
        /*
            r7 = 0
            r6 = 0
            r4 = 0
            r3 = 0
            r2 = 0
            r1 = 0
            r5 = 0
            java.lang.String r0 = "۠ۡۧۘۚۘۜ۬۠ۨۘ۟ۡۜۖ۬۬ۚۧۧۛۡۡ۫ۜۛ"
        L_0x0009:
            int r8 = r0.hashCode()
            r9 = 875(0x36b, float:1.226E-42)
            r10 = -382413285(0xffffffffe934d61b, float:-1.3663608E25)
            r8 = r8 ^ r9
            r8 = r8 ^ r10
            switch(r8) {
                case -2035348042: goto L_0x0053;
                case -1896434143: goto L_0x001b;
                case -1760416693: goto L_0x0057;
                case -1470815958: goto L_0x0095;
                case -1463192264: goto L_0x0074;
                case -1349547410: goto L_0x00df;
                case -962865154: goto L_0x00da;
                case -831323542: goto L_0x00e9;
                case -756100169: goto L_0x009a;
                case -746930057: goto L_0x00e4;
                case -565892339: goto L_0x0018;
                case -481130279: goto L_0x0078;
                case -301959394: goto L_0x0107;
                case 356328476: goto L_0x0024;
                case 413456465: goto L_0x00bc;
                case 455270514: goto L_0x00f8;
                case 640076990: goto L_0x00f3;
                case 736453810: goto L_0x0021;
                case 1006353898: goto L_0x00a8;
                case 1262669592: goto L_0x001e;
                case 1302430205: goto L_0x00ee;
                case 1545145758: goto L_0x0033;
                case 1719464269: goto L_0x002f;
                case 1888026546: goto L_0x00a8;
                default: goto L_0x0017;
            }
        L_0x0017:
            goto L_0x0009
        L_0x0018:
            java.lang.String r0 = "۟ۘ۠ۙۦۖۘۘ۠ۖۘۧۖۖۘۗۗۜۘۢ۟ۛ"
            goto L_0x0009
        L_0x001b:
            java.lang.String r0 = "ۜ۫ۢ۟ۤۖۘ۫ۖۜ۠ۡۖ۫ۙ۠۠ۢۨۘۤۦۜۘۥۧۖۘ"
            goto L_0x0009
        L_0x001e:
            java.lang.String r0 = "۟ۡۦۘۡ۬ۙۤ۟ۤۚۥۡۘۖۦۦۜ۫ۚۜۘ"
            goto L_0x0009
        L_0x0021:
            java.lang.String r0 = "ۧۘ۫ۦۦ۠ۨۜۤ۟۬۟۟ۨۘۥۥۘۤۢۛ"
            goto L_0x0009
        L_0x0024:
            int[] r0 = com.obwhatsapp.yo.k1.f794a
            int r7 = r14.ordinal()
            r7 = r0[r7]
            java.lang.String r0 = "ۙۙۖۘۘۧۘۘۜۖۘۘۨۤۘۙۗۨۘۧۢۦۘ۠۟ۖۤۚ۠۬ۨۘ"
            goto L_0x0009
        L_0x002f:
            r6 = 1
            java.lang.String r0 = "ۘۖ۬ۧۖۛۖ۬ۧۤۘۦۖۘۦۘۢۨۘۘۗۨۨ۠ۘۤ"
            goto L_0x0009
        L_0x0033:
            r8 = -1916472759(0xffffffff8dc4f249, float:-1.2137761E-30)
            java.lang.String r0 = "ۘ۠ۙۤۨۛۖ۫ۗۥۥۥۦۧۦۘۛۖ۫"
        L_0x0038:
            int r9 = r0.hashCode()
            r9 = r9 ^ r8
            switch(r9) {
                case -1380022489: goto L_0x0050;
                case -95777219: goto L_0x0047;
                case 1050332014: goto L_0x004d;
                case 1441284342: goto L_0x0041;
                default: goto L_0x0040;
            }
        L_0x0040:
            goto L_0x0038
        L_0x0041:
            java.lang.String r0 = "ۡۖۡۘۨ۟ۧۡۦۚۡۖۧۛۗۡۘ۫ۘۘۢۧۜۘۢۜ۠"
            goto L_0x0009
        L_0x0044:
            java.lang.String r0 = "ۡۘ۬۫ۨۦۜۨۖۥۢۨۘۡ۟ۤۗ۟ۘۧۤۙۤۜۘۘۦۤۤ"
            goto L_0x0038
        L_0x0047:
            r0 = 1
            if (r7 == r0) goto L_0x0044
            java.lang.String r0 = "۠ۛۙۨ۬ۜۛۛۦۘ۫ۨۦۘۖۧۘۘ۟۫ۦۘۜۖۖۘۨ۟ۜۘۥۜۗ"
            goto L_0x0038
        L_0x004d:
            java.lang.String r0 = "ۘۡۖۘ۠ۗۚۥۚۜۘۤۥۤۨۜۜ"
            goto L_0x0038
        L_0x0050:
            java.lang.String r0 = "ۦ۟ۥۘ۫ۤ۫ۖۙ۫ۗۖۘۛۘۖۘۜۜۨۘ"
            goto L_0x0009
        L_0x0053:
            java.lang.String r0 = "ۛۚۜۘ۬ۦۧ۟ۤۦۤۗۢۥۧۥۢۙۨۘۘ۫ۘ"
            r5 = r6
            goto L_0x0009
        L_0x0057:
            r8 = -1218256726(0xffffffffb762e0aa, float:-1.3522958E-5)
            java.lang.String r0 = "ۡ۟ۧ۫۬ۚۧۚۡۘ۬ۢۗۧۦۨۖۦ"
        L_0x005c:
            int r9 = r0.hashCode()
            r9 = r9 ^ r8
            switch(r9) {
                case -2099672264: goto L_0x006b;
                case -1458430220: goto L_0x0071;
                case -587623646: goto L_0x0065;
                case -333255196: goto L_0x00a8;
                default: goto L_0x0064;
            }
        L_0x0064:
            goto L_0x005c
        L_0x0065:
            java.lang.String r0 = "۫۫ۖۘۚ۟ۗۙۛ۠۫۠ۤۛۙۜۘۗۤۘۘ"
            goto L_0x0009
        L_0x0068:
            java.lang.String r0 = "۟ۚۚۡۥۙۤۥۖۘۦۗۡۘۨۤۛۗۘۦۘۙ۟ۥ"
            goto L_0x005c
        L_0x006b:
            r0 = 2
            if (r7 == r0) goto L_0x0068
            java.lang.String r0 = "ۚۡ۟ۗۥۘۢۘ۬ۚۦۨۢۡۚ۟۠ۗۗ۟ۤۤ۟ۢ"
            goto L_0x005c
        L_0x0071:
            java.lang.String r0 = "ۥۦۜ۬ۗۘۗۨ۟ۙ۬ۨۥ۫ۘۡ۬۬"
            goto L_0x005c
        L_0x0074:
            r4 = 3
            java.lang.String r0 = "۬۟۟ۘ۫ۡۛۤۗۗۛۡۤۚۢۙ۫ۙۡۖ۬ۦ۠ۘۢۡۡۘ"
            goto L_0x0009
        L_0x0078:
            r8 = 1885660007(0x7064e367, float:2.8334998E29)
            java.lang.String r0 = "ۥ۫ۘۘۦ۬ۙ۫ۨۙ۟ۛ۬ۘۦۨۘۧۗۦۘۖۙ۫ۤۦۥ"
        L_0x007d:
            int r9 = r0.hashCode()
            r9 = r9 ^ r8
            switch(r9) {
                case -790806030: goto L_0x0086;
                case 828801676: goto L_0x0092;
                case 1049995553: goto L_0x0103;
                case 1171342363: goto L_0x008c;
                default: goto L_0x0085;
            }
        L_0x0085:
            goto L_0x007d
        L_0x0086:
            java.lang.String r0 = "۟ۥۚۖۧۧ۫ۖۗۗۜۜۘۘ۠ۨۘۢۨۧۘ"
            goto L_0x0009
        L_0x0089:
            java.lang.String r0 = "ۥۢ۬ۧۙۦۘۨۤ۠ۘ۬ۛۛۥۡۜ۫ۨۘ۟۠ۜۘۘ۟ۖۘ"
            goto L_0x007d
        L_0x008c:
            r0 = 3
            if (r7 == r0) goto L_0x0089
            java.lang.String r0 = "ۨۤۘ۠ۥۡۘ۫۬۬ۡ۠ۤۖۖۧۘۗۨ۠ۙۡ۟"
            goto L_0x007d
        L_0x0092:
            java.lang.String r0 = "ۡۡۚۘۘۜۘۖ۫ۜۡۦ۟ۢ۫ۙۜۗۖۥۡ۬۬ۡۦ"
            goto L_0x007d
        L_0x0095:
            java.lang.String r0 = "ۧۥۤۨۖۘ۠۠۫ۗۗۦۡ۬ۙۛۘۨ۫ۗۛ۟ۜ۬۫ۚۜۘ"
            r5 = r4
            goto L_0x0009
        L_0x009a:
            r8 = -4022345(0xffffffffffc29fb7, float:NaN)
            java.lang.String r0 = "ۙۦۡۘۖۗۨۘۨۘ۬ۙۤۚۡۘۙ"
        L_0x009f:
            int r9 = r0.hashCode()
            r9 = r9 ^ r8
            switch(r9) {
                case -1225713707: goto L_0x00b5;
                case -486278279: goto L_0x00a8;
                case 771769393: goto L_0x00b8;
                case 1404267757: goto L_0x00af;
                default: goto L_0x00a7;
            }
        L_0x00a7:
            goto L_0x009f
        L_0x00a8:
            java.lang.String r0 = "ۧۧۗ۟ۤۡۘۤۚۗۨۙۘۘۨۧۖۛۢ۫۬ۗ۟ۙۢۙ۠ۛۥ"
            goto L_0x0009
        L_0x00ac:
            java.lang.String r0 = "ۨ۠ۡۘۡۖۧۘۜۥۦ۬ۜۜۘۛۗ۬ۚ۬ۤۤۨۘ۬ۧۧ"
            goto L_0x009f
        L_0x00af:
            r0 = 4
            if (r7 == r0) goto L_0x00ac
            java.lang.String r0 = "ۦۧۜۨۧۤۧۚ۟۠ۤ۟ۛ"
            goto L_0x009f
        L_0x00b5:
            java.lang.String r0 = "ۛ۫ۘۘۢۨۗ۠۟ۡۘۡۨۙۚۥۘۘ"
            goto L_0x009f
        L_0x00b8:
            java.lang.String r0 = "۟۟ۥۘۦۥۛۖۨۦۘۚۦۙۛۙۢۛۜۜۘ"
            goto L_0x0009
        L_0x00bc:
            r8 = 14026205(0xd605dd, float:1.96549E-38)
            java.lang.String r0 = "ۤۚ۬ۖۚۧۦۤۜۗۢۗۥۘۛۢۨۘۨۡۥۘ۬ۦۧۘ"
        L_0x00c1:
            int r9 = r0.hashCode()
            r9 = r9 ^ r8
            switch(r9) {
                case -944467242: goto L_0x00d6;
                case -754568374: goto L_0x00ff;
                case 1281988545: goto L_0x00ca;
                case 2059799619: goto L_0x00d3;
                default: goto L_0x00c9;
            }
        L_0x00c9:
            goto L_0x00c1
        L_0x00ca:
            r0 = 5
            if (r7 == r0) goto L_0x00d0
            java.lang.String r0 = "ۤۥۥۘۥۦۜۘۖۥ۠ۙۡۡۗۢۜۦۖۦ"
            goto L_0x00c1
        L_0x00d0:
            java.lang.String r0 = "۬ۚۚۚ۫ۨۘۚۧۜۘۖۗۥۡۙ۬ۡۢۨۘ"
            goto L_0x00c1
        L_0x00d3:
            java.lang.String r0 = "۬ۥۥۘۙۘۨۘۤۦۤۢۡۛ۠ۖۖ"
            goto L_0x00c1
        L_0x00d6:
            java.lang.String r0 = "ۡۖۡۘۨ۟ۧۡۦۚۡۖۧۛۗۡۘ۫ۘۘۢۧۜۘۢۜ۠"
            goto L_0x0009
        L_0x00da:
            r3 = 0
            java.lang.String r0 = "ۗۢۖۖ۠ۡۢ۠ۤۧۢ۟ۘۢۙۙۨۡۚ۫"
            goto L_0x0009
        L_0x00df:
            java.lang.String r0 = "ۨ۫ۤۛۘۥ۬ۦۘۛۥ۬ۦۥ۬"
            r5 = r3
            goto L_0x0009
        L_0x00e4:
            r2 = 4
            java.lang.String r0 = "ۘ۠ۨۘۜۧۦۚۜۘۧۗۖۘۘ۬ۘۖۤ۬۬ۥۖۘ"
            goto L_0x0009
        L_0x00e9:
            java.lang.String r0 = "ۙۥۧۨۜۨ۟ۤۡۨ۠ۢۚۢۘۦۥۢ"
            r5 = r2
            goto L_0x0009
        L_0x00ee:
            r1 = 2
            java.lang.String r0 = "۟ۦۧۘۨۦ۬ۙۢۧ۟ۖۘۧۖۖ"
            goto L_0x0009
        L_0x00f3:
            java.lang.String r0 = "ۧۧۗ۟ۤۡۘۤۚۗۨۙۘۘۨۧۖۛۢ۫۬ۗ۟ۙۢۙ۠ۛۥ"
            r5 = r1
            goto L_0x0009
        L_0x00f8:
            putGradientColor((java.lang.String) r11, (int) r12, (int) r13, (int) r5)
            java.lang.String r0 = "ۧ۠ۥۘ۬ۚۛۗۤۛۨۛۨۧ۠۠ۡۜۘۚۜۜ۫۬۫"
            goto L_0x0009
        L_0x00ff:
            java.lang.String r0 = "ۦۦۡۘۤۨۦۘۦۙ۬ۘۥۖۖ۟ۜۦۘ۫۫۠ۡۘۛۜۡۘ"
            goto L_0x0009
        L_0x0103:
            java.lang.String r0 = "ۘ۫ۥۘۙۥ۟ۥۢۦۘۨ۠ۧۜۚۜۧۨۨۘۜۦۢۖۘۡۤۛۥۘ"
            goto L_0x0009
        L_0x0107:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.yo.shp.putGradientColor(java.lang.String, int, int, android.graphics.drawable.GradientDrawable$Orientation):void");
    }

    public static void putInt(String str, int i2) {
        String str2 = "۫ۗۙۥۘۜۥ۫ۥۘ۟۠ۛۚ۠ۥۘ";
        while (true) {
            switch ((str2.hashCode() ^ 217) ^ -821383086) {
                case -1426024585:
                    str2 = "ۢۖۖۖۖۥۘۥۦۜۗۛۧۚۗۨۙ۬ۨۘۢ۫ۥۘ۟ۧۨ";
                    break;
                case -468928738:
                    return;
                case 8218133:
                    str2 = "ۜۘۗۡۛۦۤۗۢ۬ۤۨۥ۬ۤ۟ۙۡۘ";
                    break;
                case 1211437240:
                    prefsEditor.putInt(str, i2).commit();
                    str2 = "ۢۛۤ۬ۧۘۛۦۨۘۧۜۜۘۙ۠ۚ";
                    break;
            }
        }
    }

    public static void putString(String str, String str2) {
        String str3 = "۟ۘۙۡ۟ۤۢۚۨۖۙۦۖۙۖ";
        while (true) {
            switch ((str3.hashCode() ^ 45) ^ 614820881) {
                case -2072394609:
                    str3 = "ۘۗۡۨۘۡۘۘ۬ۨۘۘۙ۬ۦۘۜۘۢۙۜۘ";
                    break;
                case -1521860861:
                    prefsEditor.putString(str, str2).commit();
                    str3 = "ۜ۟ۨۘۚۘۗۡۖۥۛۜ۫ۖۧۛ۟ۛ";
                    break;
                case 1467495738:
                    return;
                case 1923159334:
                    str3 = "۠ۨۖۡۡۨۘۢۨ۠ۤۤۙۨ۟ۚۘ۟۬۬ۦۛ۠۬ۥۘۙۙۦۘ";
                    break;
            }
        }
    }

    public static void removePrivKey(String str) {
        String str2 = "۫ۧۨ۠۫ۘۘۜۨۡۘۢ۟ۨۧۤۘۘۙۖۛۢۢۚۢۜۥ";
        while (true) {
            switch ((str2.hashCode() ^ StatusLine.HTTP_PERM_REDIRECT) ^ 730603083) {
                case -1418926722:
                    str2 = "ۤۚ۠ۗۡۧۘۦ۬ۚۘ۬۠ۧۢۥۘ";
                    break;
                case -1321432614:
                    return;
                case 389579700:
                    f875b.remove(str).commit();
                    str2 = "ۛ۬ۤ۫ۛۥۙۥۘۙۡۛ۠ۖ۠ۤۨۧۖۡۨۘۢۚۚ";
                    break;
            }
        }
    }

    public static void setBooleanPriv(String str, boolean z2) {
        String str2 = "ۦۤۡۚۜۗۧ۠ۜۘۜۖۡ۟ۥۖۘۛ۬ۡ";
        while (true) {
            switch ((str2.hashCode() ^ 891) ^ -2060371058) {
                case -323039005:
                    str2 = "۟ۜ۠۠۫ۨۖ۠ۦۘ۬ۜۛۧۚۤۛۚۘۘۖۘۜۖ۫ۥۢۡۙ";
                    break;
                case -62034436:
                    f875b.putBoolean(str, z2).commit();
                    str2 = "۫ۚۨۘۨۙۡ۫ۖۜۖۜۤۦ۠ۚۧۜۨ";
                    break;
                case 980308669:
                    str2 = "ۡ۠ۦ۫ۤ۠ۜ۟ۜ۬ۚۧۛۜۘۜ۬ۗۢۜ۠";
                    break;
                case 1369506148:
                    return;
            }
        }
    }

    public static void setFingerprintEnabled(boolean z2) {
        String str = "۟۬ۥۘۜۧۨۘۗۧۗۧ۠ۦۘ۠ۡۘ";
        while (true) {
            switch ((str.hashCode() ^ 515) ^ -1417831237) {
                case 65002242:
                    stockLightPrefs.putBoolean("privacy_fingerprint_enabled", z2).commit();
                    str = "ۨۡۨۘۛۖۥۜۢۡۘۤۧۡۜ۟ۡۖۖۤۖۡۦۘۨ۟ۤ۠ۛۦ";
                    break;
                case 884999673:
                    return;
                case 1100119032:
                    str = "ۦۧۗۖۙۜۙۚۛۥۚۧۜۢ۠ۨۢ۟ۗۜۙۚ۫ۙ";
                    break;
            }
        }
    }

    public static void setFloatPriv(String str, float f2) {
        String str2 = "ۥۖۘۘۘ۠ۤۖۖۛۛۨۘۡ۬ۜ۠ۚۤۖۚۦۘ";
        while (true) {
            switch ((str2.hashCode() ^ 644) ^ 546621046) {
                case -1868228238:
                    return;
                case -1572233360:
                    str2 = "ۘۢۚۘ۟ۜۘۤۙۗۦۗۜۚۖۜۡۦۖۘۢۜۚ۟ۡ";
                    break;
                case 596075013:
                    f875b.putFloat(str, f2).commit();
                    str2 = "۬ۗۥۘۙۚۤۤ۟ۚۜۤۤۥۨۤۖۡۢۗ۠ۧۧۡ۠";
                    break;
                case 1625742232:
                    str2 = "ۖۤ۟ۖۛۚۨۘۦ۬ۜۗۖۖۘۘۨۤۦۘ۟ۥ۫";
                    break;
            }
        }
    }

    public static void setIntPriv(String str, int i2) {
        String str2 = "ۖۚ۠ۨۘۡۘۚۙ۟ۜ۟ۡۥ۟ۡۥۡۦۘۛ۬ۢ";
        while (true) {
            switch ((str2.hashCode() ^ 500) ^ -200639670) {
                case -1217702973:
                    str2 = "ۜۦ۟ۘ۬ۦۚۤ۠ۡۨۜ۠۠ۨۖۚۜۧۘ";
                    break;
                case -803123317:
                    return;
                case 682096355:
                    str2 = "ۦۗ۬ۘ۠ۨ۟ۡۛۛ۠ۥۘ۟ۗۢۖۧۨۘۥۘۤۖۥۘۧۡۦۘ";
                    break;
                case 909250941:
                    f875b.putInt(str, i2).commit();
                    str2 = "۟ۜۖۘۤۘۧ۬۫ۛۜۚۖ۠ۚۜۘۛۚۘۘۥۜۗۥۘۛ۬ۡۥۘ";
                    break;
            }
        }
    }

    public static void setIsGradiet(String str, boolean z2) {
        String str2 = "۠۟۬۠۫ۘ۫ۙۢۘۦۛۤۙۚۡۦۧۨۢ۟";
        StringBuilder sb = null;
        SharedPreferences.Editor editor = null;
        while (true) {
            switch ((str2.hashCode() ^ 233) ^ 1323511234) {
                case -2105048599:
                    editor.putBoolean(sb.toString(), z2).commit();
                    str2 = "ۢ۬ۛۡ۠ۖۘۘۥۘۘۥ۠ۨۘۘ۠۟ۜۖۗ۫ۧۦ";
                    break;
                case -1510822204:
                    str2 = "ۡۗ۟ۚۤ۟ۛۤۜۧۚۤۜۘ۬";
                    break;
                case -1386771641:
                    sb.append("_Gactive");
                    str2 = "ۥ۠ۘۘۧۨۖۘۗۛۡۘۚۚۖ۟ۥ۟ۚ۠ۜۘ۬۫ۖۚۧۨ";
                    break;
                case -450386615:
                    str2 = "ۛۨۨ۟ۢۜ۫ۖ۠ۧ۬۠۫۫ۛ";
                    editor = prefsEditor;
                    break;
                case 28125997:
                    str2 = "۬ۚۜۥ۫ۦۖ۟ۥۘۚۨۢۗۛۡۙ";
                    break;
                case 880229809:
                    return;
                case 985743443:
                    sb.append(str);
                    str2 = "ۨ۫ۤۗۘۤۖۜۦۘۢۜۡۘۧۤ۠ۖۗۘ۟ۡۡۘۤ";
                    break;
                case 1849560252:
                    sb = new StringBuilder();
                    str2 = "۟۫ۨۜۖۢۧ۫ۡ۠۫ۗۛۤۖۤۧۢۥ";
                    break;
            }
        }
    }

    public static void setStringPriv(String str, String str2) {
        String str3 = "۬۫ۚۚۚۗۤۥ۟ۤۖۜۦۗۛۛۢۜۥ۫ۡ۠ۡۧۘۗۡۜ";
        while (true) {
            switch ((str3.hashCode() ^ 345) ^ 460342673) {
                case -1520438963:
                    return;
                case 2932370:
                    str3 = "ۡ۫۫ۙۖ۠۟ۧۘ۟ۜۢۥۦۘۢۨۦۘۢۢۡۢ۠ۨۦۦۡۘ";
                    break;
                case 410148144:
                    f875b.putString(str, str2).commit();
                    str3 = "ۘۗۙۛۖۛ۟۬ۨۗ۫ۚۤ۠ۢۜۙ۟ۘۚۡۢۛۛۙۜۦۘ";
                    break;
                case 1346125360:
                    str3 = "ۡۗۘۘۜۧ۠ۛ۬۠۠ۨ۬ۦۦۙ۠ۙۘ";
                    break;
            }
        }
    }
}
