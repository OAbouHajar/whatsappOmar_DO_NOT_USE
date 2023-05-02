package com.obwhatsapp.youbasha.ui.activity;

import android.content.Context;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import com.joom.paranoid.Deobfuscator$app$Custom;
import com.obwhatsapp.yo.dep;
import com.obwhatsapp.yo.shp;
import com.obwhatsapp.yo.yo;
import com.obwhatsapp.youbasha.task.utils;
import com.obwhatsapp.youbasha.ui.YoSettings.BaseSettingsActivity;
import java.util.Collections;
import java.util.HashSet;

public class CallsPrivacy extends BaseSettingsActivity {
    public static final int DECLINED = 10;
    public static final int ENDED = 11;
    public static final int NOINTERNET_CALLING = 77;
    public static final int UNABLE = 12;

    /* renamed from: b  reason: collision with root package name */
    public int f1229b;

    /* renamed from: c  reason: collision with root package name */
    public RadioButton f1230c;

    /* renamed from: d  reason: collision with root package name */
    public RadioButton f1231d;

    /* renamed from: e  reason: collision with root package name */
    public RadioButton f1232e;

    /* renamed from: f  reason: collision with root package name */
    public RadioButton f1233f;

    /* renamed from: g  reason: collision with root package name */
    public RadioButton f1234g;

    /* renamed from: h  reason: collision with root package name */
    public RadioGroup f1235h;

    /* renamed from: i  reason: collision with root package name */
    public int f1236i;

    /* renamed from: j  reason: collision with root package name */
    public RadioButton f1237j;

    /* renamed from: k  reason: collision with root package name */
    public RadioButton f1238k;

    /* renamed from: l  reason: collision with root package name */
    public RadioButton f1239l;

    /* renamed from: m  reason: collision with root package name */
    public RadioButton f1240m;

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x005a A[SYNTHETIC, Splitter:B:27:0x005a] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0044 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x003b A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.ArrayList c(int r8) {
        /*
            r1 = 0
            r2 = 1459773337(0x57025f99, float:1.433471E14)
            java.lang.String r0 = "ۢ۟ۥۚۦۨۧۡۢۢۖۘۘ۠۟ۦۙۡۢ۟۟ۨۤۗۘ"
        L_0x0006:
            int r3 = r0.hashCode()
            r3 = r3 ^ r2
            switch(r3) {
                case -1209521810: goto L_0x001b;
                case 259844935: goto L_0x004a;
                case 463592865: goto L_0x0015;
                case 2000820832: goto L_0x000f;
                default: goto L_0x000e;
            }
        L_0x000e:
            goto L_0x0006
        L_0x000f:
            java.lang.String r0 = "ۘۘ۟۠ۗ۟ۢۚۜۘۘۧۖۘ۠ۨ۠۠ۗۗۗۘ۫ۦۧۖۘ"
            goto L_0x0006
        L_0x0012:
            java.lang.String r0 = "۬ۘۦ۠ۚۗۘ۟ۘۘ۟ۢۥۘ۬ۚ۬"
            goto L_0x0006
        L_0x0015:
            r0 = 2
            if (r8 == r0) goto L_0x0012
            java.lang.String r0 = "ۙۛ۫ۗۛۜۘۡۨۜۧ۫ۡۘۜۗۦۚۦۘۗۢۗۘۨ۬ۤۚۧ"
            goto L_0x0006
        L_0x001b:
            r2 = -1997132238(0xffffffff88f62e32, float:-1.4816447E-33)
            java.lang.String r0 = "ۖۛۖۘۘۜۚۜ۟۟ۜۧۘۙۜۜۘۤ۬ۨۘ"
        L_0x0020:
            int r3 = r0.hashCode()
            r3 = r3 ^ r2
            switch(r3) {
                case -750079803: goto L_0x0035;
                case 668709509: goto L_0x002f;
                case 1341540066: goto L_0x0029;
                case 1884809926: goto L_0x0045;
                default: goto L_0x0028;
            }
        L_0x0028:
            goto L_0x0020
        L_0x0029:
            java.lang.String r0 = "ۛ۬ۛۨۘ۬ۚۤ۟ۨۥۡۥۚ۬ۢۖۨۚۘۨۥۙۡۘ"
            goto L_0x0020
        L_0x002c:
            java.lang.String r0 = "ۜۙۖۘۘۜۨۦۜۘۨۤۜۘۤ۟ۤ"
            goto L_0x0020
        L_0x002f:
            r0 = 3
            if (r8 == r0) goto L_0x002c
            java.lang.String r0 = "۫ۡۤۧۘۖۘۥ۬ۦۥۦۡۘۦۢۛ۟ۗۤۖۖ۟ۡ۫ۜ۠ۖۜ"
            goto L_0x0020
        L_0x0035:
            r0 = r1
        L_0x0036:
            r3 = 689921917(0x291f5f7d, float:3.5387915E-14)
            java.lang.String r2 = "ۤ۟ۡۗ۬ۨۘۛ۠ۚۖ۫ۨۘۘۨۙۦۨ"
        L_0x003b:
            int r4 = r2.hashCode()
            r4 = r4 ^ r3
            switch(r4) {
                case -1107198686: goto L_0x0044;
                case 466388798: goto L_0x005a;
                case 620176438: goto L_0x0057;
                case 1543926305: goto L_0x0052;
                default: goto L_0x0043;
            }
        L_0x0043:
            goto L_0x003b
        L_0x0044:
            return r1
        L_0x0045:
            java.lang.String r0 = getOnlyAllowedContacts()     // Catch:{ Exception -> 0x00a3 }
            goto L_0x0036
        L_0x004a:
            java.lang.String r0 = getNotAllowedContacts()     // Catch:{ Exception -> 0x00a3 }
            goto L_0x0036
        L_0x004f:
            java.lang.String r2 = "۠۠ۧۦۧۗ۠ۡ۟ۖۡۜۥۤۙۥۜۤ۟ۘۘ۫۬ۖۜۢۦۘ"
            goto L_0x003b
        L_0x0052:
            if (r0 != 0) goto L_0x004f
            java.lang.String r2 = "۟ۖۙۤ۠ۨ۠ۙۡۢۗۘۘۡ۠ۛۖ۫ۖۘۜ۫ۜۗۧۨ"
            goto L_0x003b
        L_0x0057:
            java.lang.String r2 = "ۢۤۢۚ۫۬۠ۛۦۡۜ۬ۨۧۘ۬ۚۡۦ۠ۖۜۧ۫"
            goto L_0x003b
        L_0x005a:
            java.util.HashSet r3 = new java.util.HashSet     // Catch:{ Exception -> 0x00a3 }
            r3.<init>()     // Catch:{ Exception -> 0x00a3 }
            java.lang.String[] r0 = com.obwhatsapp.youbasha.task.utils.StringToStringArray(r0)     // Catch:{ Exception -> 0x00a3 }
            java.util.Collections.addAll(r3, r0)     // Catch:{ Exception -> 0x00a3 }
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ Exception -> 0x00a3 }
            int r0 = r3.size()     // Catch:{ Exception -> 0x00a3 }
            r2.<init>(r0)     // Catch:{ Exception -> 0x00a3 }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ Exception -> 0x00a3 }
        L_0x0073:
            r4 = 1159592369(0x451df9b1, float:2527.6057)
            java.lang.String r0 = "۠ۤۚۤۡۚۦۦۨۘۙۧۜۘۨ۠ۨۘ۟ۘۘ"
        L_0x0078:
            int r5 = r0.hashCode()     // Catch:{ Exception -> 0x00a3 }
            r5 = r5 ^ r4
            switch(r5) {
                case -1939008782: goto L_0x00b4;
                case -1127232949: goto L_0x0081;
                case -1125919694: goto L_0x00b1;
                case -238679833: goto L_0x00a8;
                default: goto L_0x0080;
            }     // Catch:{ Exception -> 0x00a3 }
        L_0x0080:
            goto L_0x0078
        L_0x0081:
            java.lang.Object r0 = r3.next()     // Catch:{ Exception -> 0x00a3 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x00a3 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00a3 }
            r4.<init>()     // Catch:{ Exception -> 0x00a3 }
            r4.append(r0)     // Catch:{ Exception -> 0x00a3 }
            r6 = -23977148120513(0xffffea31629a823f, double:NaN)
            java.lang.String r0 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r6)     // Catch:{ Exception -> 0x00a3 }
            r4.append(r0)     // Catch:{ Exception -> 0x00a3 }
            java.lang.String r0 = r4.toString()     // Catch:{ Exception -> 0x00a3 }
            r2.add(r0)     // Catch:{ Exception -> 0x00a3 }
            goto L_0x0073
        L_0x00a3:
            r0 = move-exception
            goto L_0x0044
        L_0x00a5:
            java.lang.String r0 = "۟ۗ۬ۢۜۘۗۨۦۚۙ۬ۗۗ۟۠ۡ۬ۜۤۙ"
            goto L_0x0078
        L_0x00a8:
            boolean r0 = r3.hasNext()     // Catch:{ Exception -> 0x00a3 }
            if (r0 == 0) goto L_0x00a5
            java.lang.String r0 = "ۨۜ۫ۜ۫ۚۘ۬ۛۦۨۘۘۦۥۨۦۦۧۘۘۖۙۙۗۗ"
            goto L_0x0078
        L_0x00b1:
            java.lang.String r0 = "ۤۗ۟ۧۗۡۘۦۤۖ۬ۥۜ۫ۥۛۧۜۢۜ۬"
            goto L_0x0078
        L_0x00b4:
            r1 = r2
            goto L_0x0044
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.youbasha.ui.activity.CallsPrivacy.c(int):java.util.ArrayList");
    }

    public static String getActiveCallsList() {
        int i2 = 0;
        String str = "ۤۦ۬۠ۖۨۛۦ۠ۗۜۗۖ۠ۙۛۨ";
        while (true) {
            switch ((str.hashCode() ^ 51) ^ 699910845) {
                case -1690380842:
                    return null;
                case -1531326432:
                    return getNotAllowedContacts();
                case -1427058272:
                    return getOnlyAllowedContacts();
                case -692213224:
                    String str2 = "۬ۛۗۖۙ۫ۛۜۙ۠۟ۘۧۜ۫";
                    while (true) {
                        switch (str2.hashCode() ^ 146721770) {
                            case -686771370:
                                str = "ۦۤۖۘۛ۬ۥۘ۫۬ۙۥ۠ۤۗۢۘ";
                                continue;
                            case 64682882:
                                str = "ۦۧۦ۫ۛۥۘۥۨۘۡۙۙ۟ۢ۫ۨ۠ۧۢۥۨۘ";
                                continue;
                            case 1278899039:
                                if (i2 == 3) {
                                    str2 = "۫ۡۖ۬ۜۢۚۥۗۨۢۢۢۨۖۛ۫ۜۜۧۥۘ";
                                    break;
                                } else {
                                    str2 = "ۢۙ۠ۦ۫ۘۘۦ۬ۥۘۥۡۛۙۦۡۘ۬ۛۚ";
                                    break;
                                }
                            case 1410683429:
                                str2 = "ۨۤۡۘ۠ۖۡۘۦۖۜۘۘۥۘۘۜۤ۫ۛۡۘۛۦۘۚۙۦۛۥۨۘ";
                                break;
                        }
                    }
                    break;
                case 672100665:
                    i2 = getCallsControlLevel();
                    str = "ۨۗۤۛ۟ۜۢۥۡۘ۬ۜۜۘۦۗۡ۟ۢۨۛۤۥۘۤۛۨۘ";
                    break;
                case 1002714831:
                    String str3 = "۟ۦۛۛۢۛ۬۠ۤ۟ۥۚ۟ۛۜۘ";
                    while (true) {
                        switch (str3.hashCode() ^ -1366894655) {
                            case -2082146124:
                                str = "۟ۙۥۘۤ۫ۨۘۧۥۖۙ۠ۘۢۧ۬ۚۦۤ";
                                continue;
                            case 531038173:
                                if (i2 == 2) {
                                    str3 = "ۚۥۚۡۤۖۥۙۖۡۜۘۜۜۤۤۡۥۘ";
                                    break;
                                } else {
                                    str3 = "ۨۚ۬ۚۢۛۤۙۡۘۙ۫ۤۙۥۢ۬۠ۥۘ";
                                    break;
                                }
                            case 1117085809:
                                str3 = "۠ۢۥۨۨۥۧۖۜۘۗۤۡ۟ۜۜ";
                                break;
                            case 1851863545:
                                str = "ۦۖۤۨۘۖۤ۬۟ۤۨۜۘ۬ۢۛۡۥۚ";
                                continue;
                        }
                    }
                    break;
            }
        }
    }

    public static HashSet<String> getActiveList() {
        try {
            String activeCallsList = getActiveCallsList();
            String str = "۠ۚۜۘۙۜ۠۟ۚۘ۟ۥۧۘۧۢۥ۟ۧۥۘۧ۟ۜۘۖۥۙ";
            while (true) {
                switch (str.hashCode() ^ -2117373061) {
                    case -1176097563:
                        if (activeCallsList != null) {
                            str = "۬ۛۧۥۦ۫ۜ۬ۙۢۨۛۡۢۜۙۙۗۥۧۛ";
                            break;
                        } else {
                            str = "ۦۧ۟ۨ۠ۨۘۘۢۛۚۘ۫ۧۨۤۜۚۘۤ۟ۜۘۛۖۨۘ";
                            continue;
                        }
                    case 942690500:
                        str = "ۤۘۗۛ۫ۡ۫ۖۜۘۘۙۥۘ۫۬ۙۚۦۚۥۥ۫ۥۘ۠ۤۨۘ";
                        continue;
                    case 1482089416:
                        HashSet<String> hashSet = new HashSet<>();
                        Collections.addAll(hashSet, utils.StringToStringArray(activeCallsList));
                        return hashSet;
                    case 2109066560:
                        break;
                }
            }
        } catch (Exception e2) {
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:1:0x0002 A[LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int getCallsControlLevel() {
        /*
            java.lang.String r0 = "ۧۡۥۘۤۛۡۨۤۙۤۙ۟۬ۘ۟ۖۚۤ"
        L_0x0002:
            int r1 = r0.hashCode()
            r2 = 479(0x1df, float:6.71E-43)
            r3 = 1498385471(0x594f8c3f, float:3.65122015E15)
            r1 = r1 ^ r2
            r1 = r1 ^ r3
            switch(r1) {
                case 660732087: goto L_0x0011;
                default: goto L_0x0010;
            }
        L_0x0010:
            goto L_0x0002
        L_0x0011:
            r0 = -23624960802241(0xffffea83629a823f, double:NaN)
            java.lang.String r0 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r0)
            int r0 = com.obwhatsapp.yo.shp.getIntPriv(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.youbasha.ui.activity.CallsPrivacy.getCallsControlLevel():int");
    }

    public static String getCallsControlLevelString() {
        int i2 = 0;
        long j2 = 0;
        long j3 = 0;
        long j4 = 0;
        long j5 = 0;
        long j6 = 0;
        long j7 = 0;
        long j8 = 0;
        String str = "ۥ۫ۧۗ۠ۥۘۥۤۜۘۚۤۦۗۤۨۨۤۥۛۗ۟ۜۤۢ۫ۙ";
        while (true) {
            switch ((str.hashCode() ^ 499) ^ -551573481) {
                case -2092932301:
                case -504939564:
                case 193279827:
                case 1016888790:
                case 1412765594:
                    str = "ۙۘۖۘۗۚۙ۠ۡۥۗۚۡۗۖۖۚۙ۟ۢۘۧ۠ۤۖۚ۬";
                    break;
                case -1902226271:
                    str = "ۢۧۧۤۚۘۘۤۛۘ۠ۜ۬ۢۛۙ۠ۚۡ۟ۧۛۙ۫ۧۨۧ۟";
                    j8 = j6;
                    break;
                case -1832513995:
                    str = "ۦۦ۬ۨ۠ۚۦ۠ۤۛ۠ۘۡۦۛۧ۫ۜۦۧۨۜۜۘ";
                    j8 = j5;
                    break;
                case -1587136987:
                    j7 = -24045867597249L;
                    str = "ۧۛۨۘۗۙ۠ۘۗ۠ۖۡۢۤ۟۟ۘۥۖۜۙۘ";
                    break;
                case -1183742302:
                    String str2 = "ۛۤۥۘۦ۫۫ۛۢۥۖۗۢۗۡۥ۠ۜۘ";
                    while (true) {
                        switch (str2.hashCode() ^ 33172947) {
                            case -1638492287:
                                str2 = "۟۬ۜۛۢۨۙۡ۠ۨۢۧۖۜۦۙۥ۬ۢۖۢ۠ۚۖۤۚۚ";
                                break;
                            case -1445138322:
                                str = "۬۫ۙۧۦۧۧ۠ۘۘۗۥۡۨۛ۠۬۠ۥۚۤۦۚۨۚۦۖۤ";
                                continue;
                            case -1042038403:
                                if (i2 == 2) {
                                    str2 = "۠ۚۨۡۜ۟ۙۖۜ۟۟۫ۨۡۘ";
                                    break;
                                } else {
                                    str2 = "ۗۜۨۘ۟۟۬ۧۙۛۢۛ۟ۨۢۨ۟۠۠ۛۤ۠";
                                    break;
                                }
                            case -444140964:
                                str = "۬ۖ۫۠ۜۘۡ۬ۛۘۗۘۘۥۢۗ";
                                continue;
                        }
                    }
                    break;
                case -299269677:
                    String str3 = "ۦ۟ۜۘ۫ۖ۬ۜ۟۫ۙۥۤۛۢۖۘ";
                    while (true) {
                        switch (str3.hashCode() ^ 938327445) {
                            case 447255376:
                                if (i2 == 1) {
                                    str3 = "ۨۥۘۨۥۨۡۢۧۦۚۢۢ۫ۧۜ۠۬ۗ۬ۨۡۛۗ۠ۡۖ";
                                    break;
                                } else {
                                    str3 = "۫ۖۨۜۗ۠ۦۡۥۘۘ۟۫ۗۙۤۙۨۥ";
                                    break;
                                }
                            case 1300414199:
                                str3 = "ۖۖ۫ۚۥ۠ۛ۫ۖۨۜۦۘۛ۟۟ۗ۟ۥۘ۟ۛۨۥۚۛۗ۬ۗ";
                                break;
                            case 1444927617:
                                str = "ۥۥۧۘۢ۠ۦۢۛۥۘۗۥۢۚۜۥۘ";
                                continue;
                            case 2145451868:
                                str = "ۨۚۦۦۛ۠ۢۢۡۘۤۚۖۘۖۙۨۘ";
                                continue;
                        }
                    }
                    break;
                case -7286538:
                    j2 = -24479659294145L;
                    str = "۬۫ۛۜۜۘ۬ۦۙۢ۟ۡۘۡۨۘۘ";
                    break;
                case 221332368:
                    j5 = -24191896485313L;
                    str = "ۦۛ۫ۦ۬۠ۢ۠ۙۜ۬ۤ۬ۛۜۘۖ۟ۗۖۜۘۧ۬";
                    break;
                case 1170363192:
                    j3 = -24415234784705L;
                    str = "ۦۙۜۘۖۢۘۥۦ۬ۥۤۤۚ۟ۨۡ۟۟ۚۨۦ۫۠ۥۘۡۖۙ";
                    break;
                case 1366371266:
                    str = "ۤۡ۠۬ۤۘ۫ۜ۠ۙۖۘۛۙۖ۟ۚۜۘۜ۫۬";
                    j8 = j7;
                    break;
                case 1369980157:
                    str = "ۖۢۥۗۥۗۘۦۘۤۡۛۛۖۖ";
                    j8 = j3;
                    break;
                case 1373229693:
                    j6 = -24118882041281L;
                    str = "۬۟ۖۘ۬ۘ۟ۥ۬ۥ۬ۢۛۖۗۨۘۙ۬ۡۛۘۨۘ";
                    break;
                case 1488112154:
                    str = "ۙۘۖۘۗۚۙ۠ۡۥۗۚۡۗۖۖۚۙ۟ۢۘۧ۠ۤۖۚ۬";
                    j8 = j2;
                    break;
                case 1512213487:
                    return yo.getString(Deobfuscator$app$Custom.getString(j8));
                case 1774318646:
                    String str4 = "ۘۡۥۘۛۡ۫۟ۨۙ۬۫ۛۗ۠ۖۗ۟ۤۢۗۖ۠۬ۖۘ";
                    while (true) {
                        switch (str4.hashCode() ^ 547656628) {
                            case -1974818145:
                                if (i2 == 0) {
                                    str4 = "۬ۛ۫۫۟ۛۙ۫۫ۤ۟۬ۧۡ۫ۚۗ۟ۦۦۘ";
                                    break;
                                } else {
                                    str4 = "ۡۨۘۘ۬۬ۗۢۛ۟ۘۜۚۛۘۧۙۜۘۘ";
                                    break;
                                }
                            case 789749657:
                                str4 = "ۧۤۡۘۡۥۡۧۛۧ۫ۦۦۘ۠ۛۗۗۚۨۘ۟۬ۡۥۨ۟۫ۖۨۘ";
                                break;
                            case 1773517455:
                                str = "ۧۧۦۨۘ۬ۤۛۥۘۡۗۜۖۙۨۥۘۧۜۥۖۘۛۖۜۘ";
                                continue;
                            case 1837415632:
                                str = "ۧۨۚۜ۟۠ۦۗ۠ۛۤۘۗۘۦۙۜۘۢ۫ۤۨۖۖ";
                                continue;
                        }
                    }
                    break;
                case 1857414867:
                    i2 = getCallsControlLevel();
                    str = "ۙۖۧۘۥۙۛۚ۫ۖۙۥۤۙۦ۫";
                    break;
                case 1920733786:
                    str = "۬ۢۘۘۤۜۚۡۡۡۥۦۚۧ۬ۧ";
                    j8 = j4;
                    break;
                case 2066101890:
                    String str5 = "۠ۛۨۘۨۡۡۘ۫۫۫ۨۘ۬ۧ۟ۜۨ۫ۗ";
                    while (true) {
                        switch (str5.hashCode() ^ -91741910) {
                            case -1895399850:
                                if (i2 == 3) {
                                    str5 = "ۖۚۜۘ۠ۦۦ۟ۢۨ۫ۢۘۘۗۖۚۚۢۡ۠۫۫ۛۤۜۡۦۘ";
                                    break;
                                } else {
                                    str5 = "ۛۙۡۛۖۦۘ۟ۡۥۛۡۙۚۙ۟ۖ۫ۧ";
                                    break;
                                }
                            case -1087252148:
                                str = "ۘۨۥۛۙۦ۟ۤۚ۟ۜ۠۫ۨۜۧ۠ۘۧۚ";
                                continue;
                            case -19656083:
                                str = "۬ۦۥۘۚۜۜ۬ۘۡۘۨۧۤۦۖۘۨۜۤۤ۟ۘۘۚ۠ۦۗۗ";
                                continue;
                            case 1631375736:
                                str5 = "۬ۥۘۧۦۘ۟۬ۢ۬ۧۥۘۙۡۖ۟ۙۦ";
                                break;
                        }
                    }
                    break;
                case 2104946832:
                    j4 = -24346515307969L;
                    str = "ۤۙۦۚۧۥۘ۬ۙۨۘۨ۠ۘۢۦۧۘ۠۬ۜ۟ۗۖۘ۬ۗۨۘ";
                    break;
                case 2147418124:
                    String str6 = "ۦ۟۟ۜۗۜۘۛ۠۠۬ۘۘۘۜۨۨۛ۠ۡۘۡۖۨ";
                    while (true) {
                        switch (str6.hashCode() ^ 1070567283) {
                            case -1648755144:
                                str = "ۙۙ۟ۜۗۙۚۘۧ۟ۦۧۘۖ۬ۡۛۖۖ";
                                continue;
                            case -444372284:
                                str6 = "ۘ۟ۘۙۙۗ۫۬ۛۧۗۡۨۗۧۛ۬ۨۘۥۡۘۘۨۢۧ۬ۧۛ";
                                break;
                            case 107597844:
                                str = "ۢۤۢۢۧۦۘۥ۫ۚۘۥ۫ۧۥۘ۟۟ۦۘۙۚۚۨۛ۫ۚۙۥ";
                                continue;
                            case 861102262:
                                if (i2 == 4) {
                                    str6 = "ۚۜۜۡۘۙۨ۬ۘۘ۟ۤ۬ۜ۟ۨۜ۬ۙۙ۟۬";
                                    break;
                                } else {
                                    str6 = "۫ۘۖ۠ۤۧۛۗ۬ۨۦۧۘۛ۠ۨۨۘۥ";
                                    break;
                                }
                        }
                    }
                    break;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:1:0x0002 A[LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int getCallsRejectType() {
        /*
            java.lang.String r0 = "ۢۦۡۘۘ۠۟ۗۡۘ۬ۦ۟ۛۜۜۘۥ۟ۢ"
        L_0x0002:
            int r1 = r0.hashCode()
            r2 = 741(0x2e5, float:1.038E-42)
            r3 = -1092797360(0xffffffffbedd3c50, float:-0.43210077)
            r1 = r1 ^ r2
            r1 = r1 ^ r3
            switch(r1) {
                case -160439891: goto L_0x0011;
                default: goto L_0x0010;
            }
        L_0x0010:
            goto L_0x0002
        L_0x0011:
            r0 = -23689385311681(0xffffea74629a823f, double:NaN)
            java.lang.String r0 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r0)
            r1 = 12
            int r0 = com.obwhatsapp.yo.shp.getIntPriv(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.youbasha.ui.activity.CallsPrivacy.getCallsRejectType():int");
    }

    /* JADX WARNING: Removed duplicated region for block: B:1:0x0002 A[LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String getNotAllowedContacts() {
        /*
            java.lang.String r0 = "ۦ۬ۘۘ۫ۙۡ۬ۜۧۘۛۦۖۖۤۜۘ"
        L_0x0002:
            int r1 = r0.hashCode()
            r2 = 253(0xfd, float:3.55E-43)
            r3 = 1867490159(0x6f4fa36f, float:6.4260976E28)
            r1 = r1 ^ r2
            r1 = r1 ^ r3
            switch(r1) {
                case 1081323733: goto L_0x0011;
                default: goto L_0x0010;
            }
        L_0x0010:
            goto L_0x0002
        L_0x0011:
            r0 = -23848299101633(0xffffea4f629a823f, double:NaN)
            java.lang.String r0 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r0)
            java.lang.String r0 = com.obwhatsapp.yo.shp.getStringPriv(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.youbasha.ui.activity.CallsPrivacy.getNotAllowedContacts():java.lang.String");
    }

    /* JADX WARNING: Removed duplicated region for block: B:1:0x0002 A[LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String getOnlyAllowedContacts() {
        /*
            java.lang.String r0 = "۟۠ۨۚۚۡۗۢۦۥۗۘۘۤۜۧۘۚۛ۟"
        L_0x0002:
            int r1 = r0.hashCode()
            r2 = 36
            r3 = -1742127601(0xffffffff98293e0f, float:-2.187407E-24)
            r1 = r1 ^ r2
            r1 = r1 ^ r3
            switch(r1) {
                case 1015348169: goto L_0x0011;
                default: goto L_0x0010;
            }
        L_0x0010:
            goto L_0x0002
        L_0x0011:
            r0 = -23766694723009(0xffffea62629a823f, double:NaN)
            java.lang.String r0 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r0)
            java.lang.String r0 = com.obwhatsapp.yo.shp.getStringPriv(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.youbasha.ui.activity.CallsPrivacy.getOnlyAllowedContacts():java.lang.String");
    }

    public static boolean isContactCustomBlocked(String str) {
        StringBuilder sb = null;
        String str2 = "ۙۥۨۘ۫ۘۚۖۖۨۜۘۡۤۨۧۙ۟ۘۘ۬ۥۥۘۙۘۜۘۗ۟ۥۘ";
        while (true) {
            switch ((str2.hashCode() ^ 992) ^ -159756579) {
                case -481784584:
                    sb = new StringBuilder();
                    str2 = "ۖۚۧ۫ۨۨۡۜۡۘۗۢۙۥۛۦ۫ۜۨ۠۟ۖۘۛۚ۠ۜۗۨۘ";
                    break;
                case 292259808:
                    str2 = "ۜۧۥۘۦۢۥۘۥۥۥۘۙ۟ۢ۬ۗۗۘۘۜۚۦۘۨۨۡ۬ۜۖ";
                    break;
                case 1685783510:
                    return shp.getBooleanPriv(sb.toString(), false);
                case 1953344717:
                    sb.append(Deobfuscator$app$Custom.getString(-23925608512961L));
                    str2 = "ۛ۬ۜۘۗ۫۬ۧۜۡۗۨۧۘۥۖ۬ۡۘۦۘ۟ۤۧۤ۟ۜۘ";
                    break;
                case 2103798277:
                    sb.append(str);
                    str2 = "ۥۡۘ۫ۦۗۤ۫ۜۨۜۥۡۙۡۘ";
                    break;
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean saveSelectedList(android.app.Activity r8, java.util.ArrayList<java.lang.String> r9) {
        /*
            r1 = 1
            r2 = 0
            android.content.Intent r3 = r8.getIntent()     // Catch:{ Exception -> 0x00b6 }
            r4 = -237387403(0xfffffffff1d9c175, float:-2.1565479E30)
            java.lang.String r0 = "ۤ۟ۨۚۘۧۘۧۘۢ۟ۚۘۘ۫ۙۛۜۗ۠"
        L_0x000b:
            int r5 = r0.hashCode()     // Catch:{ Exception -> 0x00b6 }
            r5 = r5 ^ r4
            switch(r5) {
                case -1882568259: goto L_0x001a;
                case -1121618993: goto L_0x0014;
                case 1492657557: goto L_0x002c;
                case 1613445720: goto L_0x0063;
                default: goto L_0x0013;
            }     // Catch:{ Exception -> 0x00b6 }
        L_0x0013:
            goto L_0x000b
        L_0x0014:
            java.lang.String r0 = "ۢ۫۬ۙۙۨۘۛۤۚۗۧۨۘۨ۟ۖۗۨۥ۫ۙۜۥۥۘۗۜۢ"
            goto L_0x000b
        L_0x0017:
            java.lang.String r0 = "ۙۖۨ۠ۦۖ۫ۙ۟ۜۧۦۘۗۗۖۘۧۦ۬ۙۤ"
            goto L_0x000b
        L_0x001a:
            r6 = -23182579170753(0xffffeaea629a823f, double:NaN)
            java.lang.String r0 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r6)     // Catch:{ Exception -> 0x00b6 }
            boolean r0 = r3.hasExtra(r0)     // Catch:{ Exception -> 0x00b6 }
            if (r0 == 0) goto L_0x0017
            java.lang.String r0 = "۫ۥۡ۠۠ۖۘۛۜۡۘۢۤۘۘۢۢۤۢۛ"
            goto L_0x000b
        L_0x002c:
            r4 = -2030678055(0xffffffff86f64fd9, float:-9.265224E-35)
            java.lang.String r0 = "ۚۦۗۛۙۥۘۥۧۙۗۖۜۜۘۨۘۨۛۖۦۥ۠ۥ۬ۗۚۤۢ"
        L_0x0031:
            int r5 = r0.hashCode()     // Catch:{ Exception -> 0x00b6 }
            r5 = r5 ^ r4
            switch(r5) {
                case -329603709: goto L_0x0053;
                case 241311157: goto L_0x0063;
                case 913018256: goto L_0x0050;
                case 1346255693: goto L_0x003a;
                default: goto L_0x0039;
            }     // Catch:{ Exception -> 0x00b6 }
        L_0x0039:
            goto L_0x0031
        L_0x003a:
            r6 = -23195464072641(0xffffeae7629a823f, double:NaN)
            java.lang.String r0 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r6)     // Catch:{ Exception -> 0x00b6 }
            r5 = 0
            boolean r0 = r3.getBooleanExtra(r0, r5)     // Catch:{ Exception -> 0x00b6 }
            if (r0 == 0) goto L_0x004d
            java.lang.String r0 = "ۛۢۖۘۤۜۖۦ۬ۨۖ۫۫۟ۨۛ"
            goto L_0x0031
        L_0x004d:
            java.lang.String r0 = "ۡ۫۠ۘۢۥ۠ۡۖۘۨۥۙۡۦۜ۫ۧ۫"
            goto L_0x0031
        L_0x0050:
            java.lang.String r0 = "۟ۛۖۘۥۧۗۜۖۚۜ۫ۜۘۛۦۤۖۜۥ"
            goto L_0x0031
        L_0x0053:
            r0 = r1
        L_0x0054:
            r4 = -170375607(0xfffffffff5d84649, float:-5.4832113E32)
            java.lang.String r3 = "ۛۙۨۘۙ۫۬ۤ۠ۗۥۨۡۘۘۡ۠ۢۦۜۚ۟ۨۘ"
        L_0x0059:
            int r5 = r3.hashCode()
            r5 = r5 ^ r4
            switch(r5) {
                case -1521599474: goto L_0x0062;
                case -1292569578: goto L_0x0068;
                case 40281331: goto L_0x0070;
                case 1592960037: goto L_0x006d;
                default: goto L_0x0061;
            }
        L_0x0061:
            goto L_0x0059
        L_0x0062:
            return r2
        L_0x0063:
            r0 = r2
            goto L_0x0054
        L_0x0065:
            java.lang.String r3 = "۟ۦۥۘۥۢۦۜۥ۟ۦۗۜۘ۟ۥۚ۟ۨۘ۫ۤۦۘ"
            goto L_0x0059
        L_0x0068:
            if (r0 != 0) goto L_0x0065
            java.lang.String r3 = "ۚ۟۬ۗۛۨ۠ۚۦۖۡۜ۬ۗۖۘ۟ۗۥۘ۫ۨۥۛۚۘۚۛۘۘ"
            goto L_0x0059
        L_0x006d:
            java.lang.String r3 = "ۚۘۘ۠ۜۢ۫ۛۧ۫ۨۦۘۗۥۨۨۢۡ"
            goto L_0x0059
        L_0x0070:
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ Exception -> 0x00b6 }
            r2.<init>()     // Catch:{ Exception -> 0x00b6 }
            java.util.Iterator r3 = r9.iterator()     // Catch:{ Exception -> 0x00b6 }
        L_0x0079:
            r4 = 2035585446(0x795491a6, float:6.8982565E34)
            java.lang.String r0 = "ۙۘۨۘۧ۬ۗۨۘۧۘۗۙۡۘۤۛۗۦۘۡ"
        L_0x007e:
            int r5 = r0.hashCode()     // Catch:{ Exception -> 0x00b6 }
            r5 = r5 ^ r4
            switch(r5) {
                case -1784874956: goto L_0x0087;
                case -120869168: goto L_0x00b9;
                case 1611153097: goto L_0x0096;
                case 1679135658: goto L_0x008d;
                default: goto L_0x0086;
            }     // Catch:{ Exception -> 0x00b6 }
        L_0x0086:
            goto L_0x007e
        L_0x0087:
            java.lang.String r0 = "ۤۛۨۘۜۢ۟۠ۦۙۥۤۦۘۤۙۖ"
            goto L_0x007e
        L_0x008a:
            java.lang.String r0 = "۫ۗۨۘ۫ۥ۫ۖۙۛۗۙۥ۟ۖۧۖۘۥۧ۬ۦۥۦۥ"
            goto L_0x007e
        L_0x008d:
            boolean r0 = r3.hasNext()     // Catch:{ Exception -> 0x00b6 }
            if (r0 == 0) goto L_0x008a
            java.lang.String r0 = "ۖ۟ۗۡ۠ۤۗ۠ۡۢۨۡۘ۠ۧۗ"
            goto L_0x007e
        L_0x0096:
            java.lang.Object r0 = r3.next()     // Catch:{ Exception -> 0x00b6 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x00b6 }
            r4 = -23208348974529(0xffffeae4629a823f, double:NaN)
            java.lang.String r4 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r4)     // Catch:{ Exception -> 0x00b6 }
            r6 = -23277068451265(0xffffead4629a823f, double:NaN)
            java.lang.String r5 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r6)     // Catch:{ Exception -> 0x00b6 }
            java.lang.String r0 = r0.replace(r4, r5)     // Catch:{ Exception -> 0x00b6 }
            r2.add(r0)     // Catch:{ Exception -> 0x00b6 }
            goto L_0x0079
        L_0x00b6:
            r0 = move-exception
        L_0x00b7:
            r2 = r1
            goto L_0x0062
        L_0x00b9:
            android.content.Intent r0 = r8.getIntent()     // Catch:{ Exception -> 0x00b6 }
            r4 = -23281363418561(0xffffead3629a823f, double:NaN)
            java.lang.String r3 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r4)     // Catch:{ Exception -> 0x00b6 }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x00b6 }
            r0.putExtra(r3, r2)     // Catch:{ Exception -> 0x00b6 }
            r2 = -1
            r8.setResult(r2, r0)     // Catch:{ Exception -> 0x00b6 }
            r8.finish()     // Catch:{ Exception -> 0x00b6 }
            goto L_0x00b7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.youbasha.ui.activity.CallsPrivacy.saveSelectedList(android.app.Activity, java.util.ArrayList):boolean");
    }

    public void attachBaseContext(Context context) {
        String str = "ۢۛ۫ۧۗۦۘ۬ۘۨۘۗۗۦ۬ۚۡۘۦ۬ۤ۫ۛۘۘۘۗ۠";
        while (true) {
            switch ((str.hashCode() ^ 354) ^ -1903523886) {
                case -1449320738:
                    str = "ۘۗۥۘۧ۬ۙۛۖۜۘ۫ۤ۫ۙۛۛ";
                    break;
                case -1268922899:
                    super.attachBaseContext(yo.getCtx());
                    str = "ۧۧۖۘۡۖۡۘۢ۫ۡۚۜۦ۫۟ۘۛۘۛۨ۬ۦۘ";
                    break;
                case -1186402630:
                    return;
                case -665438896:
                    str = "ۙۚ۠ۦۨۥۦ۬۠ۚۜۜۜۜۨۦۜۗ";
                    break;
            }
        }
    }

    public final void b() {
        boolean z2 = false;
        String str = "ۜۜۧ۫ۘ۠ۤۨۦۘۖ۠۫۬ۜۘۢۤۦ";
        while (true) {
            switch ((str.hashCode() ^ 256) ^ 1721811232) {
                case -2095326395:
                    this.f1238k.setEnabled(z2);
                    str = "ۥۧۗۘۨۘۘۢۘۦۤ۠ۖۘۗ۬ۦۘۥۙۡۘ";
                    break;
                case -1321923306:
                    shp.setIntPriv(Deobfuscator$app$Custom.getString(-23560536292801L), this.f1229b);
                    str = "ۗۦۥۚۥۡۨۗۦۢۜۧۘۚۤۥ";
                    break;
                case -856982424:
                    return;
                case -368931200:
                    this.f1235h.setEnabled(z2);
                    str = "ۛ۟ۘۘ۟ۖۤ۟۠ۦۖۤۥۘۧۢۡۘۙۤ۠ۙۜۙ";
                    break;
                case -66480997:
                    str = "ۥۦۨۖۦۥۖۡۥۤ۠ۖۤ۬ۨۨۜۙ";
                    break;
                case 331888185:
                    dep.callsList = getActiveList();
                    str = "ۡۘۨۘۚۨۥۘۤۦۨۘۛۧۡۘۚۚۡۘۚ۬۫";
                    break;
                case 568303862:
                    this.f1240m.setEnabled(z2);
                    str = "ۜ۟ۜۨۥۘۦۨۖۘۦۨۥۘ۫۬ۡۘ۟ۖۡۡۢۖۘۨۙۖۘۢۨۛ";
                    break;
                case 1013924283:
                    this.f1239l.setEnabled(z2);
                    str = "ۦ۫ۡۘۘۜۥ۟ۧۥۘۦۗۥۘۘۡۘۘۛۛۜۘۤۙۘۘۚ۫ۥ";
                    break;
                case 1489908677:
                    z2 = !this.f1230c.isChecked();
                    str = "ۥۗۥۘۖ۠ۘۘ۬ۖۘۘۚۙ۫ۙۨۚۡۗۥۘۡ۠";
                    break;
                case 1647761491:
                    shp.setIntPriv(Deobfuscator$app$Custom.getString(-23483226881473L), this.f1236i);
                    str = "۟ۖۧۨۨۥۙ۟ۥ۠ۙ۫ۥۜۘۘۛۨۢۥۡۘۘۘ۟ۙۖ۬";
                    break;
                case 1671145872:
                    this.f1237j.setEnabled(z2);
                    str = "۠ۤۖۘۤۤۥۘ۫ۘۜۘ۫ۧۜۛۤۦۡۧ";
                    break;
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0038, code lost:
        r0 = "ۢۧۦ۫ۖ۫ۖ۠ۨۘ۬ۖ۬۫ۗۜۘۨۥۥۘ۬ۘۥۘۧۘۧۗۥۙ";
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onActivityResult(int r13, int r14, android.content.Intent r15) {
        /*
            r12 = this;
            r4 = 0
            r10 = 0
            r1 = 0
            java.lang.String r0 = "ۚۢ۟۠ۧۗ۟ۖۨۘۧۥۦۘۢ۫ۙۢۦ۟ۖۘۙ۠ۘ۟ۖ۫۬"
            r2 = r4
            r6 = r4
            r8 = r4
        L_0x0009:
            int r4 = r0.hashCode()
            r5 = 240(0xf0, float:3.36E-43)
            r11 = -577854921(0xffffffffdd8ea237, float:-1.28472972E18)
            r4 = r4 ^ r5
            r4 = r4 ^ r11
            switch(r4) {
                case -2007496826: goto L_0x009c;
                case -1745800252: goto L_0x0079;
                case -1725754097: goto L_0x001e;
                case -1634172853: goto L_0x0024;
                case -811616474: goto L_0x007e;
                case -595920471: goto L_0x00c7;
                case -586395853: goto L_0x0068;
                case -545046089: goto L_0x00cc;
                case -457303476: goto L_0x0021;
                case -222219259: goto L_0x00f4;
                case -143404968: goto L_0x004b;
                case 1245131693: goto L_0x00da;
                case 1289502968: goto L_0x00e5;
                case 1443018434: goto L_0x00be;
                case 1513966831: goto L_0x001b;
                case 1606316523: goto L_0x0018;
                case 1662106442: goto L_0x00d5;
                case 1669256018: goto L_0x00f8;
                case 1772650960: goto L_0x00f0;
                case 2102814649: goto L_0x002a;
                default: goto L_0x0017;
            }
        L_0x0017:
            goto L_0x0009
        L_0x0018:
            java.lang.String r0 = "۠ۘۛۨۘۜۘۜۧۘۨۦۦۘ۬ۧۦ۠۫"
            goto L_0x0009
        L_0x001b:
            java.lang.String r0 = "ۗۚۡۡۨۗۖۚۖۘ۟ۦۚۧۖۜۘۨۤۤۚ۫ۙۜۨۤۛۛۚ"
            goto L_0x0009
        L_0x001e:
            java.lang.String r0 = "ۡۧۖۘ۫ۗۥۘۡۧۜۘۤ۠ۖۜۛۜۘۘۡۤۡۦ۟"
            goto L_0x0009
        L_0x0021:
            java.lang.String r0 = "۫۠ۛۢۛۦۦۚ۟۬ۖۧۘ۟ۧۜۘۤۨۜۦۥ۟ۨۖۘۗۦۚ"
            goto L_0x0009
        L_0x0024:
            super.onActivityResult(r13, r14, r15)
            java.lang.String r0 = "ۛۘۜۦۨۥ۫ۦۛۨۦۥۥ۠ۧۚۗ۫۬ۚۙ"
            goto L_0x0009
        L_0x002a:
            r4 = 1457497098(0x56dfa40a, float:1.22947818E14)
            java.lang.String r0 = "۫ۦۦ۠ۗۛ۫ۧ۫ۢۧۤۖۚ۬ۥ۫ۦۘ۠ۢۘۘۦۢۨ۟ۢۚ"
        L_0x002f:
            int r5 = r0.hashCode()
            r5 = r5 ^ r4
            switch(r5) {
                case -1287903808: goto L_0x0038;
                case -748898098: goto L_0x003e;
                case 126240717: goto L_0x0048;
                case 658392839: goto L_0x0045;
                default: goto L_0x0037;
            }
        L_0x0037:
            goto L_0x002f
        L_0x0038:
            java.lang.String r0 = "ۢۧۦ۫ۖ۫ۖ۠ۨۘ۬ۖ۬۫ۗۜۘۨۥۥۘ۬ۘۥۘۧۘۧۗۥۙ"
            goto L_0x0009
        L_0x003b:
            java.lang.String r0 = "ۚۗۖۘۤ۠ۛۜ۬۠ۨۗ۠ۤۜۚ۫ۤ۫ۢۡۢۢۧ۬۟"
            goto L_0x002f
        L_0x003e:
            r0 = 1911(0x777, float:2.678E-42)
            if (r13 != r0) goto L_0x003b
            java.lang.String r0 = "ۤۙۢۖۚۘۛ۟۠ۥۛ۬۬۠ۡۘۗۢۤ"
            goto L_0x002f
        L_0x0045:
            java.lang.String r0 = "ۜۙۚۢۖۨۘۙۛ۠ۗۥ۟ۢۤۘۘۧۨۛ۬ۙۘ"
            goto L_0x002f
        L_0x0048:
            java.lang.String r0 = "ۧۨۜۘۖۨ۟ۨۚۨۘۙۘۧۜۧۥۘۥۙۚ۫ۙۗۥۙۡۘۧۨۢ"
            goto L_0x0009
        L_0x004b:
            r4 = -907311622(0xffffffffc9eb85fa, float:-1929407.2)
            java.lang.String r0 = "ۨ۟ۖۘۦۧۦۘ۬۟ۜۜۘۖۘۨۥۥ۠۟ۦۗۜۦۧۥۧ"
        L_0x0050:
            int r5 = r0.hashCode()
            r5 = r5 ^ r4
            switch(r5) {
                case -1502501480: goto L_0x0059;
                case -274489945: goto L_0x0062;
                case -245583093: goto L_0x0065;
                case 999212042: goto L_0x0038;
                default: goto L_0x0058;
            }
        L_0x0058:
            goto L_0x0050
        L_0x0059:
            r0 = -1
            if (r14 != r0) goto L_0x005f
            java.lang.String r0 = "ۤۛۦۖ۠ۥۘۚ۠ۜۘۙۧ۫ۚۨ"
            goto L_0x0050
        L_0x005f:
            java.lang.String r0 = "ۧۛۚۧ۟ۨۘۙۚۘۥۛۜۡۘۘۛۦۛۜ۠ۥۛ۟ۡۘ"
            goto L_0x0050
        L_0x0062:
            java.lang.String r0 = "ۤ۬۠۬ۘ۠ۤۜۚ۬ۜۘۨۙۦۘۘۘۖ"
            goto L_0x0050
        L_0x0065:
            java.lang.String r0 = "۬ۨۡ۟ۨۖۘ۫ۢۨ۟ۥ۫ۘۛ۫ۚۢۧ۠ۨۘۚۨۘۘ۫ۜ"
            goto L_0x0009
        L_0x0068:
            r4 = -23302838255041(0xffffeace629a823f, double:NaN)
            java.lang.String r0 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r4)
            java.lang.String r4 = r15.getStringExtra(r0)
            java.lang.String r0 = "ۨۖۙ۠ۘۧۘۢۗۘۘۛۜۛۨۘۙۗ۫۟ۗ۠۟"
            r10 = r4
            goto L_0x0009
        L_0x0079:
            int r1 = r12.f1229b
            java.lang.String r0 = "ۦۦۤ۫۟ۧۦ۟ۦۘۜ۬۬۠ۧ۟ۧۨۘ"
            goto L_0x0009
        L_0x007e:
            r4 = 600863381(0x23d07295, float:2.2599933E-17)
            java.lang.String r0 = "ۤۤۖۘۚۥۧۥۘۜۘۨ۠ۘۘۥ۟ۢۢ۫ۜۚۨۤ"
        L_0x0083:
            int r5 = r0.hashCode()
            r5 = r5 ^ r4
            switch(r5) {
                case -1500536385: goto L_0x008c;
                case -1392260029: goto L_0x0098;
                case -98534686: goto L_0x0095;
                case 1325643215: goto L_0x00ec;
                default: goto L_0x008b;
            }
        L_0x008b:
            goto L_0x0083
        L_0x008c:
            r0 = 2
            if (r1 == r0) goto L_0x0092
            java.lang.String r0 = "ۘۙۚۤۧۦۘۜ۠ۧۙۛ۠۫ۙ۫ۥۡۨۡۤۘۧۡ"
            goto L_0x0083
        L_0x0092:
            java.lang.String r0 = "ۙ۟ۚ۫۫۬۟ۛۥۘ۟ۖۖۘ۟ۗۜ۫ۘ۬۬ۗۘۘۨۛ۫ۜۤ"
            goto L_0x0083
        L_0x0095:
            java.lang.String r0 = "ۤۤۥ۠ۙۤۦۜۡۘۧۢۢ۠ۗۡۘۧۨۘۦ۠ۛ۟۫ۨۘۧ۠ۗ"
            goto L_0x0083
        L_0x0098:
            java.lang.String r0 = "۬ۜ۠ۚۗۥ۬ۤۛۥ۫ۛۧۦۜ۟ۤ۫ۦۚۖۨۨۦۘ"
            goto L_0x0009
        L_0x009c:
            r4 = 1269642653(0x4bad359d, float:2.2702906E7)
            java.lang.String r0 = "ۧ۫ۦۘۥۡۧۡۦۙۤ۟ۦۘۦۧۤۙۥۡۥۤۨ"
        L_0x00a1:
            int r5 = r0.hashCode()
            r5 = r5 ^ r4
            switch(r5) {
                case -458680968: goto L_0x00ba;
                case -262222794: goto L_0x00b1;
                case 1253058855: goto L_0x00b7;
                case 1682070965: goto L_0x00aa;
                default: goto L_0x00a9;
            }
        L_0x00a9:
            goto L_0x00a1
        L_0x00aa:
            java.lang.String r0 = "ۤۛ۬ۡۖۥۘۖۙۥۘۙۦۧ۬ۚۧۥۚۙۥۦۦۘ"
            goto L_0x0009
        L_0x00ae:
            java.lang.String r0 = "ۜۙۖ۬ۦۘۥۙۙۛۖۖۖۙۤ۫۬ۚۤۙ"
            goto L_0x00a1
        L_0x00b1:
            r0 = 3
            if (r1 == r0) goto L_0x00ae
            java.lang.String r0 = "ۡۨۘۤۥۨۥۜۘۜۢ۬ۘۜۥۘۡۗۚۤۡۘۙۡۧۘۜۤۨۘ"
            goto L_0x00a1
        L_0x00b7:
            java.lang.String r0 = "۬ۢۦۘۚ۫ۨۗۘۢۡۜۗۦۘ۬ۛ۠ۨۘ۫ۘۗ"
            goto L_0x00a1
        L_0x00ba:
            java.lang.String r0 = "۟ۗۘ۫۬ۡۤۗ۟ۘۘۢ۫ۗۥۛۚ"
            goto L_0x0009
        L_0x00be:
            r8 = -23401622502849(0xffffeab7629a823f, double:NaN)
            java.lang.String r0 = "۫ۧۨۡۛۜۡۨۙۧۦۖۨۦۙۙ۟ۢ۫ۨۥۘۖ۠ۥۦۥ"
            goto L_0x0009
        L_0x00c7:
            java.lang.String r0 = "ۛۖۧۗۦۘۢۛۛ۫۬ۚ۠ۙۥۛ۫۟"
            r6 = r8
            goto L_0x0009
        L_0x00cc:
            r2 = -23324313091521(0xffffeac9629a823f, double:NaN)
            java.lang.String r0 = "۠ۙۢۥۦ۠۫۫ۘۘۘۘۡۡۙۘۚۛۨۙۡۥۘ"
            goto L_0x0009
        L_0x00d5:
            java.lang.String r0 = "ۘۘۢ۟ۥۦۤۦۨۢۤۢۗ۟ۛۥۘۘ"
            r6 = r2
            goto L_0x0009
        L_0x00da:
            java.lang.String r0 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r6)
            com.obwhatsapp.yo.shp.setStringPriv(r0, r10)
            java.lang.String r0 = "ۨ۟۫ۧۢ۟۠ۘۥۘۜۚۥۘۨۦ۬۠ۙۚ"
            goto L_0x0009
        L_0x00e5:
            r12.b()
            java.lang.String r0 = "ۢۧۦ۫ۖ۫ۖ۠ۨۘ۬ۖ۬۫ۗۜۘۨۥۥۘ۬ۘۥۘۧۘۧۗۥۙ"
            goto L_0x0009
        L_0x00ec:
            java.lang.String r0 = "ۚ۠ۗۜۦۖۖۥۗۥ۫ۦۘ۫۬ۖۘۖۢۜۘ"
            goto L_0x0009
        L_0x00f0:
            java.lang.String r0 = "ۘۘۢ۟ۥۦۤۦۨۢۤۢۗ۟ۛۥۘۘ"
            goto L_0x0009
        L_0x00f4:
            java.lang.String r0 = "ۨ۟۫ۧۢ۟۠ۘۥۘۜۚۥۘۨۦ۬۠ۙۚ"
            goto L_0x0009
        L_0x00f8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.youbasha.ui.activity.CallsPrivacy.onActivityResult(int, int, android.content.Intent):void");
    }

    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r29) {
        /*
            r28 = this;
            r24 = 0
            r23 = 0
            r22 = 0
            r21 = 0
            r20 = 0
            r19 = 0
            r18 = 0
            r17 = 0
            r16 = 0
            r14 = 0
            r13 = 0
            r12 = 0
            r11 = 0
            r15 = 0
            r10 = 0
            r9 = 0
            r8 = 0
            r6 = 0
            r5 = 0
            r4 = 0
            r7 = 0
            java.lang.String r2 = "ۤۧ۫ۚ۠ۧۚ۟ۚۖۖۖۘ۟ۜۥ"
            r3 = r2
        L_0x0021:
            int r2 = r3.hashCode()
            r25 = 431(0x1af, float:6.04E-43)
            r26 = 918123994(0x36b975da, float:5.5271494E-6)
            r2 = r2 ^ r25
            r2 = r2 ^ r26
            switch(r2) {
                case -2070905978: goto L_0x0060;
                case -2062790127: goto L_0x011a;
                case -1910296580: goto L_0x04de;
                case -1806344624: goto L_0x0309;
                case -1796294074: goto L_0x0411;
                case -1787024508: goto L_0x0596;
                case -1735696088: goto L_0x00cc;
                case -1703346795: goto L_0x0510;
                case -1679696921: goto L_0x0168;
                case -1599068930: goto L_0x051f;
                case -1481107363: goto L_0x0298;
                case -1470373145: goto L_0x0141;
                case -1449848022: goto L_0x01ff;
                case -1359815771: goto L_0x044e;
                case -1328054970: goto L_0x048a;
                case -1327982137: goto L_0x0528;
                case -1318658465: goto L_0x045d;
                case -1296608300: goto L_0x0481;
                case -1280032589: goto L_0x0036;
                case -1259236499: goto L_0x0221;
                case -1186851781: goto L_0x04c9;
                case -1156941300: goto L_0x043e;
                case -1117603569: goto L_0x058c;
                case -1115260278: goto L_0x0573;
                case -1063698207: goto L_0x04d5;
                case -953334179: goto L_0x0378;
                case -934455280: goto L_0x04bd;
                case -896948383: goto L_0x0041;
                case -809739441: goto L_0x04a5;
                case -802296118: goto L_0x017f;
                case -772573279: goto L_0x056e;
                case -665650738: goto L_0x03ef;
                case -653472331: goto L_0x0454;
                case -562409381: goto L_0x03ab;
                case -532093736: goto L_0x058c;
                case -524316648: goto L_0x020a;
                case -480166064: goto L_0x056e;
                case -461629771: goto L_0x01db;
                case -359185962: goto L_0x00a5;
                case -269512184: goto L_0x0499;
                case -236692193: goto L_0x0032;
                case -215175994: goto L_0x0334;
                case -125483654: goto L_0x0463;
                case -41192134: goto L_0x0519;
                case 7478453: goto L_0x0472;
                case 68350923: goto L_0x003a;
                case 75043580: goto L_0x0277;
                case 84352688: goto L_0x022c;
                case 106861386: goto L_0x00f3;
                case 108446107: goto L_0x01ad;
                case 200693376: goto L_0x04b1;
                case 216784006: goto L_0x0196;
                case 228427682: goto L_0x033f;
                case 343940332: goto L_0x028a;
                case 365239449: goto L_0x024d;
                case 381900103: goto L_0x0260;
                case 464395487: goto L_0x02d3;
                case 633595829: goto L_0x0361;
                case 654347036: goto L_0x0445;
                case 681260291: goto L_0x02af;
                case 726500636: goto L_0x056e;
                case 812809420: goto L_0x0083;
                case 897167029: goto L_0x04e7;
                case 976080950: goto L_0x0546;
                case 1074489678: goto L_0x0508;
                case 1125964738: goto L_0x056e;
                case 1158903825: goto L_0x02c8;
                case 1172551944: goto L_0x0591;
                case 1174413927: goto L_0x0381;
                case 1301341101: goto L_0x054c;
                case 1302956814: goto L_0x053d;
                case 1466917079: goto L_0x046c;
                case 1595324737: goto L_0x052e;
                case 1618298580: goto L_0x02fe;
                case 1618514026: goto L_0x038c;
                case 1664593647: goto L_0x008e;
                case 1726245315: goto L_0x01c4;
                case 1818222757: goto L_0x02e5;
                case 1899977037: goto L_0x031b;
                case 1934993271: goto L_0x03cd;
                case 1942953509: goto L_0x0236;
                case 1946030699: goto L_0x058c;
                case 2017811962: goto L_0x0433;
                case 2030729540: goto L_0x0537;
                case 2138683505: goto L_0x047b;
                default: goto L_0x0031;
            }
        L_0x0031:
            goto L_0x0021
        L_0x0032:
            java.lang.String r2 = "ۖۢ۟ۚ۬ۦۤ۬ۧۗۚۧۘۘ"
            r3 = r2
            goto L_0x0021
        L_0x0036:
            java.lang.String r2 = "ۜۥۖۘۤۖۜۘ۬ۧۜۙۜۡۘ۫۬ۡ"
            r3 = r2
            goto L_0x0021
        L_0x003a:
            super.onCreate(r29)
            java.lang.String r2 = "ۙۘۜۘۗۛۦۨۢۢۘۘۘۡۤ۬ۜۖۘۘۤۚۖ"
            r3 = r2
            goto L_0x0021
        L_0x0041:
            r2 = -22087362510273(0xffffebe9629a823f, double:NaN)
            java.lang.String r2 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r2)
            r26 = -22194736692673(0xffffebd0629a823f, double:NaN)
            java.lang.String r3 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r26)
            int r2 = com.obwhatsapp.youbasha.others.getID(r2, r3)
            r0 = r28
            r0.setContentView(r2)
            java.lang.String r2 = "ۨۜۛۢۨۥۛۛۨ۫۠ۜۘ۬ۚ۫۬۫ۖۘۢۡۨۚۧ۬"
            r3 = r2
            goto L_0x0021
        L_0x0060:
            r2 = -22224801463745(0xffffebc9629a823f, double:NaN)
            java.lang.String r2 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r2)
            r24 = -22272046104001(0xffffebbe629a823f, double:NaN)
            java.lang.String r3 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r24)
            int r2 = com.obwhatsapp.youbasha.others.getID(r2, r3)
            r0 = r28
            android.view.View r2 = r0.findViewById(r2)
            androidx.appcompat.widget.Toolbar r2 = (androidx.appcompat.widget.Toolbar) r2
            java.lang.String r3 = "۠ۤۘۖۘ۠ۨۨۤۨۛۧۛۥۨۥ۠ۖۛۨۘ۫ۘۖۘ۟ۛۘ"
            r24 = r2
            goto L_0x0021
        L_0x0083:
            r0 = r24
            r1 = r28
            com.obwhatsapp.youbasha.ui.YoSettings.BaseSettingsActivity.configToolbar(r0, r1)
            java.lang.String r2 = "ۡۘۥۖۢ۬ۥۨۦۘۢ۠۫ۧۗۙ۫ۢ"
            r3 = r2
            goto L_0x0021
        L_0x008e:
            r2 = -22284931005889(0xffffebbb629a823f, double:NaN)
            java.lang.String r2 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r2)
            java.lang.String r2 = com.obwhatsapp.yo.yo.getString((java.lang.String) r2)
            r0 = r24
            r0.setTitle((java.lang.CharSequence) r2)
            java.lang.String r2 = "ۘ۬ۡۘۡۦۙۤ۫۟ۨ۟ۗۢۡۥۘ"
            r3 = r2
            goto L_0x0021
        L_0x00a5:
            r2 = -22357945449921(0xffffebaa629a823f, double:NaN)
            java.lang.String r2 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r2)
            r26 = -22388010220993(0xffffeba3629a823f, double:NaN)
            java.lang.String r3 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r26)
            int r2 = com.obwhatsapp.yo.yo.getID(r2, r3)
            r0 = r28
            android.view.View r2 = r0.findViewById(r2)
            android.widget.RadioButton r2 = (android.widget.RadioButton) r2
            r0 = r28
            r0.f1230c = r2
            java.lang.String r2 = "ۦۨۚ۟ۛۖۘۛۡ۟۠۠ۖۘۙۥۡۜۨۘۡۢۘۘۢۖ۟۬ۛۘۘ"
            r3 = r2
            goto L_0x0021
        L_0x00cc:
            r2 = -22400895122881(0xffffeba0629a823f, double:NaN)
            java.lang.String r2 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r2)
            r26 = -22469614599617(0xffffeb90629a823f, double:NaN)
            java.lang.String r3 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r26)
            int r2 = com.obwhatsapp.yo.yo.getID(r2, r3)
            r0 = r28
            android.view.View r2 = r0.findViewById(r2)
            android.widget.RadioButton r2 = (android.widget.RadioButton) r2
            r0 = r28
            r0.f1231d = r2
            java.lang.String r2 = "ۧ۟ۙ۟ۗۖۘۥۨۨۨۘۛۢۤۛۦۜۧۘ"
            r3 = r2
            goto L_0x0021
        L_0x00f3:
            r2 = -22482499501505(0xffffeb8d629a823f, double:NaN)
            java.lang.String r2 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r2)
            r26 = -22546924010945(0xffffeb7e629a823f, double:NaN)
            java.lang.String r3 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r26)
            int r2 = com.obwhatsapp.yo.yo.getID(r2, r3)
            r0 = r28
            android.view.View r2 = r0.findViewById(r2)
            android.widget.RadioButton r2 = (android.widget.RadioButton) r2
            r0 = r28
            r0.f1232e = r2
            java.lang.String r2 = "ۨۨۜۦۧۦۘ۬ۨۜۘۛۚۨۘۦۨۥۘۘ۟ۖ"
            r3 = r2
            goto L_0x0021
        L_0x011a:
            r2 = -22559808912833(0xffffeb7b629a823f, double:NaN)
            java.lang.String r2 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r2)
            r26 = -22624233422273(0xffffeb6c629a823f, double:NaN)
            java.lang.String r3 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r26)
            int r2 = com.obwhatsapp.yo.yo.getID(r2, r3)
            r0 = r28
            android.view.View r2 = r0.findViewById(r2)
            android.widget.RadioButton r2 = (android.widget.RadioButton) r2
            r0 = r28
            r0.f1233f = r2
            java.lang.String r2 = "۫ۖۨ۬ۚۥۘۥۡۘ۟ۖۨ۠ۘۘۘۘۢۧ"
            r3 = r2
            goto L_0x0021
        L_0x0141:
            r2 = -22637118324161(0xffffeb69629a823f, double:NaN)
            java.lang.String r2 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r2)
            r26 = -22658593160641(0xffffeb64629a823f, double:NaN)
            java.lang.String r3 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r26)
            int r2 = com.obwhatsapp.yo.yo.getID(r2, r3)
            r0 = r28
            android.view.View r2 = r0.findViewById(r2)
            android.widget.RadioButton r2 = (android.widget.RadioButton) r2
            r0 = r28
            r0.f1234g = r2
            java.lang.String r2 = "ۖۜۖ۫ۧۦۘ۫ۜۖۘۚۥۥ۬ۨۜۜۘۡۘ۟ۛۘ"
            r3 = r2
            goto L_0x0021
        L_0x0168:
            r0 = r28
            android.widget.RadioButton r2 = r0.f1230c
            n.a r3 = new n.a
            r25 = 0
            r0 = r28
            r1 = r25
            r3.<init>(r0, r1)
            r2.setOnClickListener(r3)
            java.lang.String r2 = "۫ۚۜۘۡۨۧۘۖ۬ۜۘۗۛۛ۬ۘۥۚۚۖ"
            r3 = r2
            goto L_0x0021
        L_0x017f:
            r0 = r28
            android.widget.RadioButton r2 = r0.f1231d
            n.a r3 = new n.a
            r25 = 1
            r0 = r28
            r1 = r25
            r3.<init>(r0, r1)
            r2.setOnClickListener(r3)
            java.lang.String r2 = "۟ۥۥۦۖۙ۠ۚۜۘ۟ۢۙۢۚۖۢۖۚۥۜۖۦۗۦۛۧۥۘ"
            r3 = r2
            goto L_0x0021
        L_0x0196:
            r0 = r28
            android.widget.RadioButton r2 = r0.f1234g
            n.a r3 = new n.a
            r25 = 2
            r0 = r28
            r1 = r25
            r3.<init>(r0, r1)
            r2.setOnClickListener(r3)
            java.lang.String r2 = "ۧ۬ۤۥۛ۠۬۟ۛۧ۟ۡۘۥۜ۠۬ۥۡۙ۬ۨۘ"
            r3 = r2
            goto L_0x0021
        L_0x01ad:
            r0 = r28
            android.widget.RadioButton r2 = r0.f1232e
            n.a r3 = new n.a
            r25 = 3
            r0 = r28
            r1 = r25
            r3.<init>(r0, r1)
            r2.setOnClickListener(r3)
            java.lang.String r2 = "ۡۛۘۚۦۙۥۚۢۖۨۦۘۚۨۥ۫ۙۥۘ"
            r3 = r2
            goto L_0x0021
        L_0x01c4:
            r0 = r28
            android.widget.RadioButton r2 = r0.f1233f
            n.a r3 = new n.a
            r25 = 4
            r0 = r28
            r1 = r25
            r3.<init>(r0, r1)
            r2.setOnClickListener(r3)
            java.lang.String r2 = "ۚۙۖ۠ۥۘ۟ۗۖۤۙۧۧ۟ۦ۠ۘۨۤۙۦۘۚۦۨۖۡۦۘ"
            r3 = r2
            goto L_0x0021
        L_0x01db:
            r2 = -22671478062529(0xffffeb61629a823f, double:NaN)
            java.lang.String r2 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r2)
            r26 = -22688657931713(0xffffeb5d629a823f, double:NaN)
            java.lang.String r3 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r26)
            int r2 = com.obwhatsapp.yo.yo.getID(r2, r3)
            r0 = r28
            android.view.View r2 = r0.findViewById(r2)
            android.widget.RadioGroup r2 = (android.widget.RadioGroup) r2
            java.lang.String r3 = "۫۠ۖۨۤۥ۟ۤۦۘ۬ۢۜۘۛ۟ۖۘۦۗۧ"
            r23 = r2
            goto L_0x0021
        L_0x01ff:
            r0 = r23
            r1 = r28
            r1.f1235h = r0
            java.lang.String r2 = "۟ۙۥۧ۫ۙۤ۬ۥۚۗۡۘ۫ۘۡ"
            r3 = r2
            goto L_0x0021
        L_0x020a:
            r2 = -22701542833601(0xffffeb5a629a823f, double:NaN)
            java.lang.String r2 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r2)
            r0 = r23
            android.view.View r2 = r0.findViewWithTag(r2)
            android.widget.RadioButton r2 = (android.widget.RadioButton) r2
            java.lang.String r3 = "ۦۖۜۘۖۥۦۘ۬۟ۚۤۥۥۘ۫ۙۦۡۖۗ"
            r22 = r2
            goto L_0x0021
        L_0x0221:
            r0 = r22
            r1 = r28
            r1.f1237j = r0
            java.lang.String r2 = "۠۟ۥ۫ۗۚۖۜ۫۫ۤ۫ۥۧۜ۠ۚۡۦۤۥ"
            r3 = r2
            goto L_0x0021
        L_0x022c:
            java.lang.StringBuilder r21 = new java.lang.StringBuilder
            r21.<init>()
            java.lang.String r2 = "ۖۡۜۛ۫ۜۘ۬ۥ۟ۜۡۦۘۙۜۙۜ۠ۡۘۖۧۖۘۡۗ۠ۜۦ۠"
            r3 = r2
            goto L_0x0021
        L_0x0236:
            r2 = -22770262310337(0xffffeb4a629a823f, double:NaN)
            java.lang.String r2 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r2)
            java.lang.String r2 = com.obwhatsapp.yo.yo.getString((java.lang.String) r2)
            r0 = r21
            r0.append(r2)
            java.lang.String r2 = "۫ۗۗۤۤۦۘ۬ۚۨۨۨ۬۫ۘۨۘ"
            r3 = r2
            goto L_0x0021
        L_0x024d:
            r2 = -22847571721665(0xffffeb38629a823f, double:NaN)
            java.lang.String r2 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r2)
            r0 = r21
            r0.append(r2)
            java.lang.String r2 = "ۨ۬ۧۚۥۨۘ۟ۨۧۡ۠ۦۡ۟ۗۨۨۛۢۗ۫ۗۛۛۜۛۛ"
            r3 = r2
            goto L_0x0021
        L_0x0260:
            r2 = -22864751590849(0xffffeb34629a823f, double:NaN)
            java.lang.String r2 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r2)
            java.lang.String r2 = com.obwhatsapp.yo.yo.getString((java.lang.String) r2)
            r0 = r21
            r0.append(r2)
            java.lang.String r2 = "ۛۦ۫ۖۘۖۘۜۡۘۙ۟ۘۡۡۦۗ۟ۖۘۚۤۦۘ"
            r3 = r2
            goto L_0x0021
        L_0x0277:
            r2 = -22946355969473(0xffffeb21629a823f, double:NaN)
            java.lang.String r2 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r2)
            r0 = r21
            r0.append(r2)
            java.lang.String r2 = "ۘۛۘ۟ۖۚۚۦۨۘۜۦۥۜۥۖ۠۫ۛۨ۟ۗۥ"
            r3 = r2
            goto L_0x0021
        L_0x028a:
            java.lang.String r2 = r21.toString()
            r0 = r22
            r0.setText(r2)
            java.lang.String r2 = "۬ۨۤۗۦۖۥۚ۟ۗۖۗۡۜ"
            r3 = r2
            goto L_0x0021
        L_0x0298:
            r0 = r28
            android.widget.RadioButton r2 = r0.f1237j
            n.a r3 = new n.a
            r25 = 5
            r0 = r28
            r1 = r25
            r3.<init>(r0, r1)
            r2.setOnClickListener(r3)
            java.lang.String r2 = "ۡ۫۬ۦۜۢۧ۠۫ۙۦۘۛۨۥۜۛۗۥۢۨۘۛۛۥ۟۠"
            r3 = r2
            goto L_0x0021
        L_0x02af:
            r0 = r28
            android.widget.RadioGroup r2 = r0.f1235h
            r26 = -22967830805953(0xffffeb1c629a823f, double:NaN)
            java.lang.String r3 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r26)
            android.view.View r2 = r2.findViewWithTag(r3)
            android.widget.RadioButton r2 = (android.widget.RadioButton) r2
            java.lang.String r3 = "ۛۘۥۗ۬ۢۜ۠ۖۡۙۘۘۤۗۙ۬ۢۨۘۡۛۦۘۜ۫ۦ"
            r20 = r2
            goto L_0x0021
        L_0x02c8:
            r0 = r20
            r1 = r28
            r1.f1238k = r0
            java.lang.String r2 = "ۡۤۚۙۧۥۤۤۢۨۜۜۨ۠۫ۚۧۤ"
            r3 = r2
            goto L_0x0021
        L_0x02d3:
            n.a r2 = new n.a
            r3 = 6
            r0 = r28
            r2.<init>(r0, r3)
            r0 = r20
            r0.setOnClickListener(r2)
            java.lang.String r2 = "ۥۖۗۙۥۡۙۚۙ۠۬ۚۜ۠ۡۗ۠ۚۥۛ۟"
            r3 = r2
            goto L_0x0021
        L_0x02e5:
            r0 = r28
            android.widget.RadioGroup r2 = r0.f1235h
            r26 = -23006485511617(0xffffeb13629a823f, double:NaN)
            java.lang.String r3 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r26)
            android.view.View r2 = r2.findViewWithTag(r3)
            android.widget.RadioButton r2 = (android.widget.RadioButton) r2
            java.lang.String r3 = "ۙۡۜۘۥۨۢۡۜۥۙۛۧۜۛۖ"
            r19 = r2
            goto L_0x0021
        L_0x02fe:
            r0 = r19
            r1 = r28
            r1.f1239l = r0
            java.lang.String r2 = "ۦۜۨ۟۟ۙۢۙ۬ۜ۠ۧۚۥ۫ۥۜۧ"
            r3 = r2
            goto L_0x0021
        L_0x0309:
            n.a r2 = new n.a
            r3 = 7
            r0 = r28
            r2.<init>(r0, r3)
            r0 = r19
            r0.setOnClickListener(r2)
            java.lang.String r2 = "۟ۜۧۘ۠ۖ۠ۙۢۡۘۖ۟ۖۘۖ۠ۦۢۥ"
            r3 = r2
            goto L_0x0021
        L_0x031b:
            r0 = r28
            android.widget.RadioGroup r2 = r0.f1235h
            r26 = -23032255315393(0xffffeb0d629a823f, double:NaN)
            java.lang.String r3 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r26)
            android.view.View r2 = r2.findViewWithTag(r3)
            android.widget.RadioButton r2 = (android.widget.RadioButton) r2
            java.lang.String r3 = "ۧۦۜۢۚۨ۟۫ۥۘۦ۠ۡۘۢۢۨۘۢۗۛ"
            r18 = r2
            goto L_0x0021
        L_0x0334:
            r0 = r18
            r1 = r28
            r1.f1240m = r0
            java.lang.String r2 = "ۜۨ۠ۧۛ۟۬ۨۘ۟ۜۙۖۡۙ"
            r3 = r2
            goto L_0x0021
        L_0x033f:
            r2 = -23083794922945(0xffffeb01629a823f, double:NaN)
            java.lang.String r2 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r2)
            r3 = 1
            java.lang.String[] r3 = new java.lang.String[r3]
            r25 = 0
            java.lang.String r26 = com.obwhatsapp.yo.dep.getMyName()
            r3[r25] = r26
            java.lang.String r2 = com.obwhatsapp.yo.yo.getString(r2, r3)
            r0 = r18
            r0.setText(r2)
            java.lang.String r2 = "ۚ۫ۦۘۖۥۖۜۨۤۚۚ۫ۗۤۜۘ"
            r3 = r2
            goto L_0x0021
        L_0x0361:
            r0 = r28
            android.widget.RadioButton r2 = r0.f1240m
            n.a r3 = new n.a
            r25 = 8
            r0 = r28
            r1 = r25
            r3.<init>(r0, r1)
            r2.setOnClickListener(r3)
            java.lang.String r2 = "ۤۘۜۘۥۡۘۦۘۥۘۤۤۜۘۡ۫ۗۘۦۗ۬ۦ۠۟ۨۖۘ"
            r3 = r2
            goto L_0x0021
        L_0x0378:
            int r17 = getCallsControlLevel()
            java.lang.String r2 = "ۨۢۦۥ۬ۨۘۨۨۥۘۖۤ۬ۤۘ۬ۡۘۦۘ۫ۢۜۢۨۤ"
            r3 = r2
            goto L_0x0021
        L_0x0381:
            r0 = r17
            r1 = r28
            r1.f1229b = r0
            java.lang.String r2 = "ۛ۬ۡۦۗۘۘۛۛۤۤۘۦۚۚۜۘۙۜۧۘ"
            r3 = r2
            goto L_0x0021
        L_0x038c:
            r3 = 1666475992(0x635467d8, float:3.9181925E21)
            java.lang.String r2 = "ۡۦۥۦۚۤ۫ۖۗ۟۬ۖۘۙ۬۟ۗۡ"
        L_0x0391:
            int r25 = r2.hashCode()
            r25 = r25 ^ r3
            switch(r25) {
                case -1800153075: goto L_0x039b;
                case -579432409: goto L_0x0569;
                case 1250028563: goto L_0x03a3;
                case 1367058108: goto L_0x03a8;
                default: goto L_0x039a;
            }
        L_0x039a:
            goto L_0x0391
        L_0x039b:
            java.lang.String r2 = "ۛ۟۬ۘ۟ۢۛۖۛۜۜۘۙۧۡۘ۠۬ۘۘۥۢۧ"
            r3 = r2
            goto L_0x0021
        L_0x03a0:
            java.lang.String r2 = "ۚ۟ۧ۠ۗۜۘۜۖۢۗۖۜۜ۬ۤۧۖۘ"
            goto L_0x0391
        L_0x03a3:
            if (r17 == 0) goto L_0x03a0
            java.lang.String r2 = "۟ۛۥۤۦ۟ۗ۠ۖۜۛۛۦۥۖۢۧۖۡۘۘ"
            goto L_0x0391
        L_0x03a8:
            java.lang.String r2 = "ۖۦۢ۬ۧۚۨۦۧۜۖۖۜۦۦۛۦۘۡ۬ۤۧ۬ۚۦۛۗ"
            goto L_0x0391
        L_0x03ab:
            r3 = 1830437830(0x6d1a43c6, float:2.983914E27)
            java.lang.String r2 = "۟۫۠ۗۡۦۘۖۙۡۘۗۜۦ۬ۨ۠ۗۗ۬۬ۗۡۤ۫ۥۘۜۗۧ"
        L_0x03b0:
            int r25 = r2.hashCode()
            r25 = r25 ^ r3
            switch(r25) {
                case -1219270851: goto L_0x03c0;
                case -1124910335: goto L_0x03ba;
                case 683141982: goto L_0x03c8;
                case 1130448512: goto L_0x0564;
                default: goto L_0x03b9;
            }
        L_0x03b9:
            goto L_0x03b0
        L_0x03ba:
            java.lang.String r2 = "ۖ۫ۨۖۜۘۘۛۛۨۘۢۧۘۧۡۘۧ۫ۘۘ"
            goto L_0x03b0
        L_0x03bd:
            java.lang.String r2 = "۫ۨ۟۟ۦ۟ۙۧۨۘ۬ۤۖۘ۠ۨۡ۬ۖ۬۬ۥۢۚۢ۠"
            goto L_0x03b0
        L_0x03c0:
            r2 = 1
            r0 = r17
            if (r0 == r2) goto L_0x03bd
            java.lang.String r2 = "ۜ۬ۡۚ۠ۧۧۚۚۚ۟۫ۜۢۨۢۤۦۘ"
            goto L_0x03b0
        L_0x03c8:
            java.lang.String r2 = "ۜۘۛ۬ۚۢۖۛۖۘ۫ۛۖۤۨۚۚۚۗۛۡۧۘ"
            r3 = r2
            goto L_0x0021
        L_0x03cd:
            r3 = -398168686(0xffffffffe8446d92, float:-3.7104202E24)
            java.lang.String r2 = "ۤ۟ۧۡ۠۠۬ۛۡۘۚۡۨۗ۠ۡ۠۠۠ۧۨۢۥۦ"
        L_0x03d2:
            int r25 = r2.hashCode()
            r25 = r25 ^ r3
            switch(r25) {
                case -1878154521: goto L_0x055f;
                case -1843081607: goto L_0x03e7;
                case -1835422072: goto L_0x03ea;
                case -1378888858: goto L_0x03dc;
                default: goto L_0x03db;
            }
        L_0x03db:
            goto L_0x03d2
        L_0x03dc:
            r2 = 2
            r0 = r17
            if (r0 == r2) goto L_0x03e4
            java.lang.String r2 = "ۖۚۤ۬۫ۚۚۗۜ۠ۦۦۘۗۡۜۘۨۡۘۘ۟۟ۨۘ"
            goto L_0x03d2
        L_0x03e4:
            java.lang.String r2 = "ۘۢۥۗۖۨ۠ۢۡۘۡ۟ۨ۠ۛۡۘ"
            goto L_0x03d2
        L_0x03e7:
            java.lang.String r2 = "۫ۚۜۘۥۥۚۥۜۨۧ۟ۢۧۥۤۨۛ۫"
            goto L_0x03d2
        L_0x03ea:
            java.lang.String r2 = "ۥۧۜۘۡۤۦۘۦۛۤۚ۬ۖۘۧۦۖۜۢۨ"
            r3 = r2
            goto L_0x0021
        L_0x03ef:
            r3 = -897236387(0xffffffffca85425d, float:-4366638.5)
            java.lang.String r2 = "۠۬۫۟ۤۙۗۘۘۢۨۤۡۛۜۦۖۧۘۨۦۛۘۚۧ"
        L_0x03f4:
            int r25 = r2.hashCode()
            r25 = r25 ^ r3
            switch(r25) {
                case 604299890: goto L_0x03fe;
                case 943319330: goto L_0x0409;
                case 1187523965: goto L_0x040c;
                case 1944898921: goto L_0x055a;
                default: goto L_0x03fd;
            }
        L_0x03fd:
            goto L_0x03f4
        L_0x03fe:
            r2 = 3
            r0 = r17
            if (r0 == r2) goto L_0x0406
            java.lang.String r2 = "ۙۙۛۡۡۖۘ۟ۚ۫۬ۙ۟ۤۦ۟ۛۢۨۘۡۧۚ"
            goto L_0x03f4
        L_0x0406:
            java.lang.String r2 = "۟ۛۙۗ۟۟ۥ۟ۨۛۚۘۘۗۧۚۚۖۦۘۧۘۡۧۚۤۚۘۘ"
            goto L_0x03f4
        L_0x0409:
            java.lang.String r2 = "ۖ۟ۨۜۡۧۙ۬۠۠۬ۖۙۦۙۜۨۧۛۙۨۘۖۧۥۘۜۡۦ"
            goto L_0x03f4
        L_0x040c:
            java.lang.String r2 = "ۢۥۥۖۜۤۤۘۜۘ۫ۧۡۘۡۗۡۚۙۗ۬ۘۧۘۡۥ۟ۡۛ۟"
            r3 = r2
            goto L_0x0021
        L_0x0411:
            r3 = 1944241807(0x73e2c68f, float:3.5934031E31)
            java.lang.String r2 = "ۡۛۛ۟ۚۖ۟۫ۖۘۤ۫۟ۨۡۘۜۜۥ"
        L_0x0416:
            int r25 = r2.hashCode()
            r25 = r25 ^ r3
            switch(r25) {
                case -1635509249: goto L_0x0555;
                case -501506471: goto L_0x0420;
                case -223435876: goto L_0x042b;
                case 2050759035: goto L_0x042e;
                default: goto L_0x041f;
            }
        L_0x041f:
            goto L_0x0416
        L_0x0420:
            r2 = 4
            r0 = r17
            if (r0 == r2) goto L_0x0428
            java.lang.String r2 = "ۡۥ۟ۛۡ۫ۛۨۤۤۨۢۚۜ"
            goto L_0x0416
        L_0x0428:
            java.lang.String r2 = "ۙۜ۟ۘۧۤ۠۠ۡۧۤۚ۬ۡۘۢۖۖۤ۠ۘۘ"
            goto L_0x0416
        L_0x042b:
            java.lang.String r2 = "ۛۖۢ۬ۢۨۗۚۥۘ۫ۧ۬ۙۦۚۢۨۘ"
            goto L_0x0416
        L_0x042e:
            java.lang.String r2 = "ۘۘۖ۟ۚ۬ۖۨۦۨۜۥۘۨۥ۠ۥۥ۫ۙ۟ۡۘ۟ۚ۟"
            r3 = r2
            goto L_0x0021
        L_0x0433:
            r0 = r28
            android.widget.RadioButton r0 = r0.f1234g
            r16 = r0
            java.lang.String r2 = "ۘۥۧۘۧۧۦۘۖۧۛۥۚۥ۫ۧۧۘ۫ۡ"
            r3 = r2
            goto L_0x0021
        L_0x043e:
            java.lang.String r2 = "ۖۨۧۘ۬ۦ۟ۥۚۨۘۧۡۖۘۛ۬ۙ"
            r3 = r2
            r15 = r16
            goto L_0x0021
        L_0x0445:
            r0 = r28
            android.widget.RadioButton r14 = r0.f1233f
            java.lang.String r2 = "۠ۜ۠ۦۖۖۚۜۧۘۥۦۨۘۜ۬ۧۗۚۤ"
            r3 = r2
            goto L_0x0021
        L_0x044e:
            java.lang.String r2 = "ۢۢۨۘۡۗۥۥۡۥۘۜۦۨۗ۬ۜ"
            r3 = r2
            r15 = r14
            goto L_0x0021
        L_0x0454:
            r0 = r28
            android.widget.RadioButton r13 = r0.f1232e
            java.lang.String r2 = "ۖ۬ۧۦۢۢۧۙۛ۬۫ۡۡۤۡ۬ۤۚۢۚۖۘۥۡۖۘ"
            r3 = r2
            goto L_0x0021
        L_0x045d:
            java.lang.String r2 = "۫ۜۧۘۨۘۙۜ۟ۘۘۗ۠ۚۚۗ۫ۛۨ"
            r3 = r2
            r15 = r13
            goto L_0x0021
        L_0x0463:
            r0 = r28
            android.widget.RadioButton r12 = r0.f1231d
            java.lang.String r2 = "ۚۙۜۗۙۧۦۢ۟ۚۡۜۘۖ۬ۡۘۘۗۖۢ۫۬ۚۘۗ"
            r3 = r2
            goto L_0x0021
        L_0x046c:
            java.lang.String r2 = "ۦ۟ۛۢۤۦۡۢۢۗ۬ۡۛ۫ۦ"
            r3 = r2
            r15 = r12
            goto L_0x0021
        L_0x0472:
            r0 = r28
            android.widget.RadioButton r11 = r0.f1230c
            java.lang.String r2 = "ۤۗۤۖۙۙۡۜۜۙۤۦۥۡۖۘ۫۫ۨۘۛ۫ۡ"
            r3 = r2
            goto L_0x0021
        L_0x047b:
            java.lang.String r2 = "ۢۨۧۦۧۙۧ۫ۘۘۦۦۗۚۨۖۢۗۢ"
            r3 = r2
            r15 = r11
            goto L_0x0021
        L_0x0481:
            r2 = 1
            r15.setChecked(r2)
            java.lang.String r2 = "ۘ۠ۜۘۛۜۨۘ۟۟ۦۛۜۘۙ۠۠"
            r3 = r2
            goto L_0x0021
        L_0x048a:
            r0 = r28
            android.widget.RadioButton r2 = r0.f1230c
            boolean r2 = r2.isChecked()
            r10 = r2 ^ 1
            java.lang.String r2 = "ۙ۬ۧۛۙۢۚۘۨۗۡۛۨ۫ۜۘۜ۬ۡۥۖۖۘۛۢ۬ۜۢۘۘ"
            r3 = r2
            goto L_0x0021
        L_0x0499:
            r0 = r28
            android.widget.RadioGroup r2 = r0.f1235h
            r2.setEnabled(r10)
            java.lang.String r2 = "ۤۨۦۚۢۨۘۧۧۡ۫ۥۥۖۤۘۘۧۡۥۘۨۤۡۘۡۖ۬ۧۜ"
            r3 = r2
            goto L_0x0021
        L_0x04a5:
            r0 = r28
            android.widget.RadioButton r2 = r0.f1237j
            r2.setEnabled(r10)
            java.lang.String r2 = "ۚۢ۬۠ۤۘۨۡۖۦ۫ۡۧۨۥ"
            r3 = r2
            goto L_0x0021
        L_0x04b1:
            r0 = r28
            android.widget.RadioButton r2 = r0.f1238k
            r2.setEnabled(r10)
            java.lang.String r2 = "ۘ۟ۥۘۢۘ۟ۛۚۘۥ۫ۙۜۥۥۘ"
            r3 = r2
            goto L_0x0021
        L_0x04bd:
            r0 = r28
            android.widget.RadioButton r2 = r0.f1239l
            r2.setEnabled(r10)
            java.lang.String r2 = "۫ۚۜۚۖۜۧۖۡۨ۟ۚ۟ۖۥۘۢ۬۬ۢۨۨ"
            r3 = r2
            goto L_0x0021
        L_0x04c9:
            r0 = r28
            android.widget.RadioButton r2 = r0.f1240m
            r2.setEnabled(r10)
            java.lang.String r2 = "۫ۤ۠ۥۢۘۚۥۗۛۙۖ۠ۤ۬۠ۢۖ۫ۜۘۨۛۢ"
            r3 = r2
            goto L_0x0021
        L_0x04d5:
            int r9 = getCallsRejectType()
            java.lang.String r2 = "ۤۗۘۘ۟ۨۨۘ۟ۡۘۘ۟۠ۚ۟ۤۙ"
            r3 = r2
            goto L_0x0021
        L_0x04de:
            r0 = r28
            r0.f1236i = r9
            java.lang.String r2 = "۬ۢۗ۬ۨۛۧۚۖۖۦۥۖۧۡ"
            r3 = r2
            goto L_0x0021
        L_0x04e7:
            r3 = -255936761(0xfffffffff0beb707, float:-4.7218735E29)
            java.lang.String r2 = "ۚۜۛ۫ۢۙ۫ۨۢۘۗۤۖۚۢۤۖۚۧۡۡۚۦ۟ۘۥ"
        L_0x04ec:
            int r25 = r2.hashCode()
            r25 = r25 ^ r3
            switch(r25) {
                case -1670724727: goto L_0x0503;
                case -987974485: goto L_0x04fc;
                case 60755611: goto L_0x04f6;
                case 1224548283: goto L_0x0587;
                default: goto L_0x04f5;
            }
        L_0x04f5:
            goto L_0x04ec
        L_0x04f6:
            java.lang.String r2 = "۟۫۫ۡۨۙۚۧۡۘ۫ۜۘۙۧ۬"
            goto L_0x04ec
        L_0x04f9:
            java.lang.String r2 = "ۡۗ۫ۜۥۡۘۨۛۗ۟ۨۙۨ۬۠ۗۦ۬ۜۖۚۚ۬ۦۙۧ۠"
            goto L_0x04ec
        L_0x04fc:
            r2 = 77
            if (r9 == r2) goto L_0x04f9
            java.lang.String r2 = "ۧۤۛ۫۠۫۟۬ۨۗ۠ۥۘۗ۫ۗۡۘۙۜۘۜ۟ۚۙ"
            goto L_0x04ec
        L_0x0503:
            java.lang.String r2 = "۬ۛ۟ۖۢۗۦ۬۟۫۫۟ۤۤۥۘۖۖۦۖ۟ۜۥۤۜۘ۫ۚۨۘ"
            r3 = r2
            goto L_0x0021
        L_0x0508:
            switch(r9) {
                case 10: goto L_0x0582;
                case 11: goto L_0x057d;
                case 12: goto L_0x0578;
                default: goto L_0x050b;
            }
        L_0x050b:
            java.lang.String r2 = "ۡۗۚۦۚۗۢۚ۬ۛۥۗۦۘۛۗۨ۫۬ۚ۠ۥۡۢ"
            r3 = r2
            goto L_0x0021
        L_0x0510:
            r0 = r28
            android.widget.RadioButton r8 = r0.f1240m
            java.lang.String r2 = "ۡۦ۫ۜۡۖۘۛۛۡۘ۟ۚۘۘۥۘۡۘۚ۠ۥۘۙۤۙۛ"
            r3 = r2
            goto L_0x0021
        L_0x0519:
            java.lang.String r2 = "ۢۡۛ۬ۤۡۘۚۤۖۤ۬ۥۨۨۖ"
            r3 = r2
            r7 = r8
            goto L_0x0021
        L_0x051f:
            r0 = r28
            android.widget.RadioButton r6 = r0.f1239l
            java.lang.String r2 = "ۥ۫ۥۙۧ۟ۡۧۦۦۢۚۜ۫ۧۚۙۦ۠ۨ۟ۨ۫۠ۗ"
            r3 = r2
            goto L_0x0021
        L_0x0528:
            java.lang.String r2 = "ۢ۬۠۫ۛۢۛۖۘۛۧ۟ۗۡۜۘ۬ۜۡۘ۬ۗۨ"
            r3 = r2
            r7 = r6
            goto L_0x0021
        L_0x052e:
            r0 = r28
            android.widget.RadioButton r5 = r0.f1238k
            java.lang.String r2 = "ۛ۫ۖۘۤۖ۠ۡۤۜۛۢۥ۟ۥۘ"
            r3 = r2
            goto L_0x0021
        L_0x0537:
            java.lang.String r2 = "ۚ۟۠۫۟ۛۦۢۜۘۥ۟ۥۘ۫ۥۧۛۜۛۧ۬ۢۗ۟ۚۚۥ۫"
            r3 = r2
            r7 = r5
            goto L_0x0021
        L_0x053d:
            r0 = r28
            android.widget.RadioButton r4 = r0.f1237j
            java.lang.String r2 = "ۢۘۜ۬ۡۥۘۥۗۘۘۤۖۢۖۦۘۘۧۘۡۧۘۖۘ"
            r3 = r2
            goto L_0x0021
        L_0x0546:
            java.lang.String r2 = "ۧۥۘ۬ۨۧۘۥۥ۬ۡۡۘۘۥۙۨۚۜۜۛۖۗۢۤۛۢۡۧۘ"
            r3 = r2
            r7 = r4
            goto L_0x0021
        L_0x054c:
            r2 = 1
            r7.setChecked(r2)
            java.lang.String r2 = "ۗۥۥۖ۫ۦۚۛۗۨۥۧۤۧۘۘ"
            r3 = r2
            goto L_0x0021
        L_0x0555:
            java.lang.String r2 = "۠ۙۙ۠ۢ۫ۥۜۦۖۤۖۘۢۥۡۘۙۚۥۘ۫ۡۦۘۤۢۙ"
            r3 = r2
            goto L_0x0021
        L_0x055a:
            java.lang.String r2 = "ۜۥۦۧۢ۬ۘۤ۠ۡ۬ۢ۬ۤ۠ۤۜۢۢۤ۫ۨۡ"
            r3 = r2
            goto L_0x0021
        L_0x055f:
            java.lang.String r2 = "ۧۤۘۘۧۤۡۘ۠۟۫۫ۢۥۥۥۖۖۛۨ"
            r3 = r2
            goto L_0x0021
        L_0x0564:
            java.lang.String r2 = "۬ۛ۟ۘ۫ۖۘۛۤۦۘۗۥۜۖۨۗۖۦۖ"
            r3 = r2
            goto L_0x0021
        L_0x0569:
            java.lang.String r2 = "ۜۙۚ۠ۨ۟ۥۥۜۘۙۤ۫ۙۗۨ"
            r3 = r2
            goto L_0x0021
        L_0x056e:
            java.lang.String r2 = "ۢۨۧۦۧۙۧ۫ۘۘۦۦۗۚۨۖۢۗۢ"
            r3 = r2
            goto L_0x0021
        L_0x0573:
            java.lang.String r2 = "ۘ۠ۜۘۛۜۨۘ۟۟ۦۛۜۘۙ۠۠"
            r3 = r2
            goto L_0x0021
        L_0x0578:
            java.lang.String r2 = "ۨ۬ۜۘ۫۬ۖۢ۠ۥۜ۠ۢ۫۠ۛۗۥۦۙ۫ۚۤۡۧ"
            r3 = r2
            goto L_0x0021
        L_0x057d:
            java.lang.String r2 = "۬۬ۖ۬۠ۦۧ۫ۥۖۨ۬ۢۤۘۨۧۜۘۢۖۢۛۤۦ"
            r3 = r2
            goto L_0x0021
        L_0x0582:
            java.lang.String r2 = "ۥۛۖۚۙ۬ۗۚۡۘۤۚۦۘۦۥۢ"
            r3 = r2
            goto L_0x0021
        L_0x0587:
            java.lang.String r2 = "ۜۦۜۘۘۨ۠۫ۙۘۦۨۚۧۛ۫ۤ۠"
            r3 = r2
            goto L_0x0021
        L_0x058c:
            java.lang.String r2 = "ۧۥۘ۬ۨۧۘۥۥ۬ۡۡۘۘۥۙۨۚۜۜۛۖۗۢۤۛۢۡۧۘ"
            r3 = r2
            goto L_0x0021
        L_0x0591:
            java.lang.String r2 = "ۗۥۥۖ۫ۦۚۛۗۨۥۧۤۧۘۘ"
            r3 = r2
            goto L_0x0021
        L_0x0596:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.youbasha.ui.activity.CallsPrivacy.onCreate(android.os.Bundle):void");
    }
}
