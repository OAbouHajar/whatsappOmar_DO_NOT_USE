package com.obwhatsapp.youbasha.task;

import android.content.Intent;
import android.os.AsyncTask;
import com.obwhatsapp.HomeActivity;
import com.obwhatsapp.yo.yo;
import com.obwhatsapp.youbasha.app;
import com.obwhatsapp.youbasha.others;
import com.obwhatsapp.youbasha.ui.YoSettings.Themes;
import java.io.File;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okio.BufferedSink;
import okio.Okio;

public class ThemeDownloadAsync extends AsyncTask<Void, Void, Void> {

    /* renamed from: a  reason: collision with root package name */
    public final String f1085a;

    /* renamed from: b  reason: collision with root package name */
    public final String f1086b;

    /* renamed from: c  reason: collision with root package name */
    public final String f1087c;

    /* renamed from: d  reason: collision with root package name */
    public final String f1088d;

    /* renamed from: e  reason: collision with root package name */
    public final OkHttpClient f1089e = new OkHttpClient.Builder().addInterceptor(new app.AddHeaderInterceptor()).build();

    public ThemeDownloadAsync(String str, String str2, String str3, String str4) {
        this.f1088d = str;
        this.f1085a = str2;
        this.f1086b = str3;
        this.f1087c = str4;
    }

    public /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        String str = "ۛۙۙۛۛۢۙۗۦۘ۬ۘۥۦۘۤۖۛۨۘ۬ۛۘۘ";
        while (true) {
            switch ((str.hashCode() ^ 781) ^ 756033776) {
                case -146641271:
                    str = "ۜۘۡۚۥۘ۬ۜۖۘ۬ۜۖۘۥۥۥۘ";
                    break;
                case 1482976543:
                    return doInBackground((Void[]) objArr);
                case 1564798338:
                    str = "ۢۗۙ۠ۨۜۘۨۥۚ۟ۘۦۘۖۚۦۘۜۦۢ";
                    break;
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x009c, code lost:
        r2 = "۠ۗ۫ۘۘۦۥۡۗۛۨۢ۬ۛۢۛ۠۟ۤۦۨ";
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Void doInBackground(java.lang.Void... r22) {
        /*
            r21 = this;
            r17 = 0
            r16 = 0
            r15 = 0
            r14 = 0
            r13 = 0
            r12 = 0
            r10 = 0
            r11 = 0
            r9 = 0
            r8 = 0
            r7 = 0
            r6 = 0
            r5 = 0
            r4 = 0
            r3 = 0
            java.lang.String r2 = "۬ۜۥۖ۫ۨۘ۟ۧۖۘ۠ۚۘۘۚۦۖۘۦۛۙۜۥۡ۠ۜۥۘ۟۠ۘ"
        L_0x0013:
            int r18 = r2.hashCode()
            r19 = 281(0x119, float:3.94E-43)
            r20 = 710083059(0x2a5301f3, float:1.8741241E-13)
            r18 = r18 ^ r19
            r18 = r18 ^ r20
            switch(r18) {
                case -1899172725: goto L_0x0174;
                case -1668840550: goto L_0x015b;
                case -1637795581: goto L_0x01c1;
                case -1623312729: goto L_0x018e;
                case -1587905414: goto L_0x00ff;
                case -1515710382: goto L_0x008d;
                case -1507698827: goto L_0x00cd;
                case -1441922894: goto L_0x002f;
                case -1425670398: goto L_0x00be;
                case -1270559062: goto L_0x007f;
                case -970853181: goto L_0x0027;
                case -663914843: goto L_0x0128;
                case -453668213: goto L_0x01c3;
                case -326462246: goto L_0x01a7;
                case -320842311: goto L_0x00c8;
                case -266575187: goto L_0x01b4;
                case 101220465: goto L_0x002a;
                case 251031448: goto L_0x0164;
                case 281827577: goto L_0x0077;
                case 326437706: goto L_0x0141;
                case 479289237: goto L_0x0138;
                case 684370949: goto L_0x0131;
                case 746766689: goto L_0x0085;
                case 869965712: goto L_0x0121;
                case 883681513: goto L_0x019e;
                case 1073501221: goto L_0x014e;
                case 1194346762: goto L_0x00d2;
                case 1496212733: goto L_0x00c3;
                case 1648484771: goto L_0x0181;
                case 1684767138: goto L_0x0024;
                case 1703346308: goto L_0x003e;
                case 1743484718: goto L_0x0072;
                case 1774389769: goto L_0x00f4;
                case 1836108350: goto L_0x0037;
                case 1973482821: goto L_0x016b;
                case 2098563199: goto L_0x0197;
                default: goto L_0x0023;
            }
        L_0x0023:
            goto L_0x0013
        L_0x0024:
            java.lang.String r2 = "ۖۚۡۘۜۗۨۘۤۗۥ۬ۚۜۢ۠۟ۙۧۜۘ"
            goto L_0x0013
        L_0x0027:
            java.lang.String r2 = "ۚ۟ۘۘۧۘۧۨۘ۬ۖۘۧ۟۠"
            goto L_0x0013
        L_0x002a:
            java.lang.String r17 = com.obwhatsapp.youbasha.ui.YoSettings.Themes.newFMThemes_folder
            java.lang.String r2 = "ۜۨۨۘۦۢۦۥۨۖۘۛۖۧۘۥۤۨ۠ۥ۠ۨۦۧ"
            goto L_0x0013
        L_0x002f:
            java.lang.StringBuilder r16 = new java.lang.StringBuilder
            r16.<init>()
            java.lang.String r2 = "ۗۙۧۘۖۨۘۥۚ۬۫۟ۡۜۖۡۥۖۧۙۢۥۘ"
            goto L_0x0013
        L_0x0037:
            r0 = r21
            java.lang.String r15 = r0.f1088d
            java.lang.String r2 = "۠۫ۘۘ۬۫ۘۡۗۤۤۖۖۢۘۧۘۗۥۖۘ۬ۜۙ"
            goto L_0x0013
        L_0x003e:
            r18 = -178846866(0xfffffffff557036e, float:-2.7256186E32)
            java.lang.String r2 = "ۜۜ۫۫ۛۨۘ۫ۖۖۙ۠ۘۚۜۘۘۡۧۢۤ۟ۡۡۖۜ۫ۨ"
        L_0x0043:
            int r19 = r2.hashCode()
            r19 = r19 ^ r18
            switch(r19) {
                case -1874967611: goto L_0x009c;
                case 239490362: goto L_0x006c;
                case 256403145: goto L_0x004d;
                case 442864374: goto L_0x006f;
                default: goto L_0x004c;
            }
        L_0x004c:
            goto L_0x0043
        L_0x004d:
            java.io.File r2 = new java.io.File
            java.lang.String r19 = ".xml"
            r0 = r16
            r1 = r19
            java.lang.String r19 = a.a.f(r0, r15, r1)
            r0 = r17
            r1 = r19
            r2.<init>(r0, r1)
            boolean r2 = r2.exists()
            if (r2 == 0) goto L_0x0069
            java.lang.String r2 = "۬۟ۖۧۛ۠ۦۥۜۚۛۜۘۚۜۧ"
            goto L_0x0043
        L_0x0069:
            java.lang.String r2 = "۠ۛۜۘۘۡ۟ۚۡۧۘۨ۫۠ۦۘ۫ۜۜ۟ۦۥ"
            goto L_0x0043
        L_0x006c:
            java.lang.String r2 = "ۡۥۛۗ۫ۡۦ۫ۖۘ۫ۗ۬ۛ۬ۜ۠ۜۜ"
            goto L_0x0043
        L_0x006f:
            java.lang.String r2 = "ۦ۠ۙۙۖ۬ۛۙۜۚۛۜۜۛۦۡۨۡۙۚۦ۠ۢ۫"
            goto L_0x0013
        L_0x0072:
            java.lang.String r14 = com.obwhatsapp.youbasha.ui.YoSettings.Themes.newFMThemes_folder
            java.lang.String r2 = "ۚۥۛۘۗۥۥۜۜۛۥۡۦۛۧۖ۫ۗ۠ۡۧۘۥۗۘۘۜۦۙ"
            goto L_0x0013
        L_0x0077:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r2 = "۬۫ۘۗۢۧۜ۠۫ۖۙ۬ۡۢۦ"
            goto L_0x0013
        L_0x007f:
            r13.append(r15)
            java.lang.String r2 = "ۥۗۙۘۗ۫ۥۤۗۗۗۦۚ۫ۤۙۦۘ"
            goto L_0x0013
        L_0x0085:
            java.lang.String r2 = "_w.jpg"
            r13.append(r2)
            java.lang.String r2 = "ۙۧۖۘ۫ۙۡ۟ۧۙۥ۬ۧۨۚۜ"
            goto L_0x0013
        L_0x008d:
            r18 = 95917300(0x5b794f4, float:1.7263954E-35)
            java.lang.String r2 = "ۜ۟ۚۚ۫ۛ۬ۚۖۖۢۦۘ۠ۥۧۢۧۨۘۜۙۖ"
        L_0x0092:
            int r19 = r2.hashCode()
            r19 = r19 ^ r18
            switch(r19) {
                case -1000153119: goto L_0x00a3;
                case -281275376: goto L_0x00ba;
                case 491150373: goto L_0x009c;
                case 553509707: goto L_0x00b7;
                default: goto L_0x009b;
            }
        L_0x009b:
            goto L_0x0092
        L_0x009c:
            java.lang.String r2 = "۠ۗ۫ۘۘۦۥۡۗۛۨۢ۬ۛۢۛ۠۟ۤۦۨ"
            goto L_0x0013
        L_0x00a0:
            java.lang.String r2 = "ۤۚۖۘۥۤ۟ۛ۬ۧۖۤۘۘۥۨۚۘۤۘ"
            goto L_0x0092
        L_0x00a3:
            java.io.File r2 = new java.io.File
            java.lang.String r19 = r13.toString()
            r0 = r19
            r2.<init>(r14, r0)
            boolean r2 = r2.exists()
            if (r2 == 0) goto L_0x00a0
            java.lang.String r2 = "ۤۜۨۘۚۨ۠ۘ۫ۖۖۜۢۛ۫ۘۛۙۨۘ۫ۘۥ۬ۚۘۘۚۦ"
            goto L_0x0092
        L_0x00b7:
            java.lang.String r2 = "ۨۚۖۘۦۦۢ۫ۧۦۧ۟ۙۜ۠ۦۘۜۦۘۘ۠ۨۦۘۜۤ۫"
            goto L_0x0092
        L_0x00ba:
            java.lang.String r2 = "ۛۨۡۡۛۘۘۢۦۛۦۡۘۤۦۤۜۦ۠"
            goto L_0x0013
        L_0x00be:
            r12 = 1
            java.lang.String r2 = "ۗۙۦۘۢ۟ۘۘۥۧۨۘۢ۬ۦۘۛۚۚۨۡۦۘۛۙۜ"
            goto L_0x0013
        L_0x00c3:
            java.lang.String r2 = "ۥۗۖۘۘۡۡۘۖ۠ۨۤۥۖۛۗۘۘۘۚ۠ۙۘۗ"
            r11 = r12
            goto L_0x0013
        L_0x00c8:
            r10 = 0
            java.lang.String r2 = "ۗۛۥۘۜ۠ۛ۟ۦۦۘۢ۬ۜۘۦ۠ۨۤۛۘۘ۟۠ۦۘۙۥۗۧۚۤ"
            goto L_0x0013
        L_0x00cd:
            java.lang.String r2 = "ۥ۟ۧ۬ۤۗۜۖۢ۫ۤ۬ۡ۟ۡۘ۫ۦۙۨۥ۟ۖۡۡ"
            r11 = r10
            goto L_0x0013
        L_0x00d2:
            r18 = 536023382(0x1ff31156, float:1.0294318E-19)
            java.lang.String r2 = "ۗۛۛۧۡۚۘۛۨۙۦۨۘۥ۬ۨۨۜۘ۟ۗۨۘۥۛ۬"
        L_0x00d7:
            int r19 = r2.hashCode()
            r19 = r19 ^ r18
            switch(r19) {
                case -664524755: goto L_0x00e1;
                case -65094115: goto L_0x00f0;
                case 1160378500: goto L_0x00e8;
                case 1625446752: goto L_0x00ed;
                default: goto L_0x00e0;
            }
        L_0x00e0:
            goto L_0x00d7
        L_0x00e1:
            java.lang.String r2 = "ۙۨ۟ۜۚۗۖ۬ۗۥ۟ۙ۬ۦۥۢۘۙۢۛۡ"
            goto L_0x0013
        L_0x00e5:
            java.lang.String r2 = "ۙ۟ۡ۟ۧۜۘۜۛۢ۟ۙۘۘۢ۠ۘۘۢۛۥۘۖۚۧ"
            goto L_0x00d7
        L_0x00e8:
            if (r11 != 0) goto L_0x00e5
            java.lang.String r2 = "۬ۡ۬۠۫ۜۤۜ۟ۧۥۘۘ۬۫ۜۘۘۖ۟۟۠ۖۥۡ۬"
            goto L_0x00d7
        L_0x00ed:
            java.lang.String r2 = "۫ۛۡۨ۟۟۟۬ۤ۟ۦۧۡۗۡ"
            goto L_0x00d7
        L_0x00f0:
            java.lang.String r2 = "ۙ۬ۧ۬ۘۜۘ۫ۡۦۡ۠ۧۡۢۛۖۤۨۘ۟ۤ۬"
            goto L_0x0013
        L_0x00f4:
            java.io.File r9 = new java.io.File
            java.lang.String r2 = com.obwhatsapp.youbasha.ui.YoSettings.Themes.newFMThemes_folder
            r9.<init>(r2)
            java.lang.String r2 = "ۖۛۤ۫ۜۜۛۨ۬ۤۤۨۡۤۨ"
            goto L_0x0013
        L_0x00ff:
            r18 = -316660616(0xffffffffed202478, float:-3.0976056E27)
            java.lang.String r2 = "ۢۨ۫ۗۛۘۘۛۤۥۘۛۗ۠۫۬ۤ۟ۢ۬ۤۢۜۗ۫ۙ۫ۙ"
        L_0x0104:
            int r19 = r2.hashCode()
            r19 = r19 ^ r18
            switch(r19) {
                case -323830985: goto L_0x010e;
                case 27002601: goto L_0x01c7;
                case 440404670: goto L_0x011e;
                case 1051868130: goto L_0x0115;
                default: goto L_0x010d;
            }
        L_0x010d:
            goto L_0x0104
        L_0x010e:
            java.lang.String r2 = "ۢ۠ۢۗۘۤۢ۟ۘۙۤۡۡ۫ۗۦۧۙۙۙۦۧ۟ۨۖۡ"
            goto L_0x0013
        L_0x0112:
            java.lang.String r2 = "ۜ۟ۥۢۤ۟ۜۦۘۚ۫ۙۦۚۚ"
            goto L_0x0104
        L_0x0115:
            boolean r2 = r9.exists()
            if (r2 != 0) goto L_0x0112
            java.lang.String r2 = "ۜۡۦۨۘۦۘۙۥۤۦ۠ۜۘۢۖۜۚۘ۫۫ۡ"
            goto L_0x0104
        L_0x011e:
            java.lang.String r2 = "۬ۜ۟۟۬ۢۖۖۘۙۜۦۘ۠ۧۗۨ۠ۢۚ۠ۢ۬ۨۜۘۡۙۚ"
            goto L_0x0104
        L_0x0121:
            r9.mkdirs()
            java.lang.String r2 = "ۖۤ۫ۜۘۡۡۥۜۢۢۨۘ۫ۗۡۜۢۜۨۥۧۗۨۖ۫ۜۜ"
            goto L_0x0013
        L_0x0128:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r2 = "ۨۥۧۘ۫ۦۦۘۘۜۥۘۥۖۤۙۗۗ۬ۥ۠"
            goto L_0x0013
        L_0x0131:
            r8.append(r15)
            java.lang.String r2 = "ۡ۠ۧ۟ۡ۠ۨۡۢۗۚۜۘۢۚۖۗۤۘ"
            goto L_0x0013
        L_0x0138:
            java.lang.String r2 = ".xml"
            r8.append(r2)
            java.lang.String r2 = "۠ۥ۠ۦ۫ۦۘ۠ۥۙ۫ۜۥۘ۠ۜۤۘۥۧۘ"
            goto L_0x0013
        L_0x0141:
            java.io.File r7 = new java.io.File
            java.lang.String r2 = r8.toString()
            r7.<init>(r9, r2)
            java.lang.String r2 = "۬ۨ۟۠ۥۦۡۖۧۘۤۧۜ۫ۖۨۗ"
            goto L_0x0013
        L_0x014e:
            r0 = r21
            java.lang.String r2 = r0.f1085a
            r0 = r21
            r0.downloadFile(r2, r7)
            java.lang.String r2 = "ۙۦۖۨ۬ۛۗۢۤۘۗۖۤۖۘۡ۬۠ۨۦۤۦ۫"
            goto L_0x0013
        L_0x015b:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r2 = "ۡۥۨ۫ۙۘۘۘ۫۠ۢۨۘۖۘۧۗۜۥ"
            goto L_0x0013
        L_0x0164:
            r6.append(r15)
            java.lang.String r2 = "ۨ۟ۡۘۡ۫ۦۘ۫ۘۨۘۗۤۥۘۨ۫۟ۙۨۦۘۥۨۚۘۖۨۘ"
            goto L_0x0013
        L_0x016b:
            java.lang.String r2 = "_w.jpg"
            r6.append(r2)
            java.lang.String r2 = "ۥۥۖۥ۠ۡۘۧۜۜ۟ۨۘۗ۬۫۬ۛۜۘۘۨ"
            goto L_0x0013
        L_0x0174:
            java.io.File r5 = new java.io.File
            java.lang.String r2 = r6.toString()
            r5.<init>(r9, r2)
            java.lang.String r2 = "ۖ۟ۤۚۗۜۘۘۜۧۘۚۛۤۗۘۡۘۨۧۦۘۖۚۡۘۥۜ۟۬۫"
            goto L_0x0013
        L_0x0181:
            r0 = r21
            java.lang.String r2 = r0.f1086b
            r0 = r21
            r0.downloadFile(r2, r5)
            java.lang.String r2 = "ۤ۫ۗۢۦۖۨ۟ۥۥۤۛۦۨۤۘۡۨ"
            goto L_0x0013
        L_0x018e:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r2 = "ۗۜۨۘۡ۟ۡۥۛۥ۠ۜۦۛۛۜ۫ۤۧۦۘۢۤۤ"
            goto L_0x0013
        L_0x0197:
            r4.append(r15)
            java.lang.String r2 = "ۖ۟ۖۡ۫ۛ۫۫ۥۙۖۡۖۢۡۘۙۦۢۘ۫ۜۜۥ"
            goto L_0x0013
        L_0x019e:
            java.lang.String r2 = "_homeW.jpg"
            r4.append(r2)
            java.lang.String r2 = "ۦۚ۠ۖ۫ۢ۟ۨۙۧۙۖۨۛۘ"
            goto L_0x0013
        L_0x01a7:
            java.io.File r3 = new java.io.File
            java.lang.String r2 = r4.toString()
            r3.<init>(r9, r2)
            java.lang.String r2 = "ۦۖۨ۫ۙۨۘۜ۫ۚۗ۬ۜۘ۠ۜۦۘۖۘۖۖۨۙ"
            goto L_0x0013
        L_0x01b4:
            r0 = r21
            java.lang.String r2 = r0.f1087c
            r0 = r21
            r0.downloadFile(r2, r3)
            java.lang.String r2 = "ۙۨ۟ۜۚۗۖ۬ۗۥ۟ۙ۬ۦۥۢۘۙۢۛۡ"
            goto L_0x0013
        L_0x01c1:
            r2 = 0
            return r2
        L_0x01c3:
            java.lang.String r2 = "ۥ۟ۧ۬ۤۗۜۖۢ۫ۤ۬ۡ۟ۡۘ۫ۦۙۨۥ۟ۖۡۡ"
            goto L_0x0013
        L_0x01c7:
            java.lang.String r2 = "ۖۤ۫ۜۘۡۡۥۜۢۢۨۘ۫ۗۡۜۢۜۨۥۧۗۨۖ۫ۜۜ"
            goto L_0x0013
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.youbasha.task.ThemeDownloadAsync.doInBackground(java.lang.Void[]):java.lang.Void");
    }

    public void downloadFile(String str, File file) {
        try {
            Response execute = this.f1089e.newCall(new Request.Builder().url(str).build()).execute();
            BufferedSink buffer = Okio.buffer(Okio.sink(file));
            buffer.writeAll(execute.body().source());
            buffer.close();
        } catch (Exception e2) {
        }
    }

    public /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        String str = "ۥۨۤۙۢۥۧ۬ۘۘ۟ۥۘۘۨۧۢۖۚ۟";
        while (true) {
            switch ((str.hashCode() ^ 911) ^ -1247054488) {
                case -820425716:
                    return;
                case 919046268:
                    str = "ۘ۟ۙ۠ۜۦۘ۟ۨۢ۬ۧۡۗۜۛۙۖۤۜۚۧ";
                    break;
                case 984400716:
                    onPostExecute((Void) obj);
                    str = "ۘۘۛۥۙۡۖ۠ۨ۬ۧ۬۬۠ۦۘ";
                    break;
                case 1918740089:
                    str = "۟ۦۙۧۧۢۥۛۛۙۨۢۢۨ۬ۧ۫ۜۢۥ۠ۖۙ۫";
                    break;
            }
        }
    }

    public void onPostExecute(Void voidR) {
        String str = this.f1088d;
        try {
            File file = new File(Themes.newFMThemes_folder);
            File shpXML = utils.getShpXML();
            utils.copyFile(file + File.separator + str + ".xml", shpXML.getPath());
            StringBuilder sb = new StringBuilder();
            sb.append(yo.datafolder);
            sb.append("files/wallpaper.jpg");
            File file2 = new File(sb.toString());
            File file3 = new File(others.homeBK_path);
            File file4 = new File(Themes.newFMThemes_folder + str + "_w.jpg");
            String str2 = "ۙۗۡۙ۠ۤۙۖۨۘۛ۟ۚۛ۬ۘ";
            while (true) {
                switch (str2.hashCode() ^ -675408515) {
                    case -1458279201:
                        break;
                    case -756967317:
                        str2 = "ۖۙۜۥۧۡۘۥۤۜۘۥ۟۠ۗ۬ۜۘۚۢ۬ۖ۟ۜۙۖۖ";
                        continue;
                    case -505888803:
                        String str3 = "ۦۨۡۤۖۨۚۥۗۦ۟ۨۘۙۤۘۘ۬ۘۢ";
                        while (true) {
                            switch (str3.hashCode() ^ 1042202822) {
                                case 317206540:
                                    break;
                                case 507674130:
                                    file2.delete();
                                    utils.copyFile(file4.getPath(), file2.getPath());
                                    utils.e(file2);
                                    break;
                                case 1660249515:
                                    if (file2.exists()) {
                                        str3 = "۬ۧۤ۟ۛۙۢۜۙۦۖۦ۠ۙۛ";
                                        break;
                                    } else {
                                        str3 = "۬ۚۦۘۥۧ۠ۚ۟ۥۘ۟ۗۦۘۘۘۡۘ۠ۛۜ";
                                        continue;
                                    }
                                case 1863159505:
                                    str3 = "۬ۤۦۗۘۙۨ۫ۘۘۚۥۤۨۡۙ";
                                    continue;
                                default:
                                    continue;
                            }
                        }
                    case 960786405:
                        if (file4.exists()) {
                            str2 = "ۧۜۖۚ۟ۥۥۤۥ۫ۧۖۘۧۖۦۘۥ۟ۖ";
                            break;
                        } else {
                            str2 = "ۦ۟ۘۘۦۥۥۦۗۦۘۘۦۨۨۖۤۡۢۦۛۙۙ";
                            continue;
                        }
                    default:
                        continue;
                }
            }
            File file5 = new File(Themes.newFMThemes_folder + str + "_homeW.jpg");
            String str4 = "ۦ۫ۜۘ۬ۜۜ۠۠ۥۘۦۤۥۢ۬ۖۘ";
            while (true) {
                switch (str4.hashCode() ^ -1045390620) {
                    case -878013270:
                        break;
                    case -636503933:
                        String str5 = "ۨۛۨۘۜ۬۬ۢۨۡۘ۟ۖ۫ۥۘ۟۫ۡۘ";
                        while (true) {
                            switch (str5.hashCode() ^ -487388796) {
                                case -1584395488:
                                    str5 = "ۛ۠ۤ۠ۚ۫ۤۦۥۘ۠۬۟۬ۡۧۡۜۛ۟۬ۤ";
                                    continue;
                                case -527186797:
                                    break;
                                case 1534354832:
                                    if (!file3.exists()) {
                                        str5 = "۠ۜۥۘ۫۟ۤۚۖۥۧۜ۫ۙۤۦۖۨۖ";
                                        break;
                                    } else {
                                        str5 = "ۖ۠۠ۨۧۢۨۙۨۘۙۢۨۗۗۧ۟ۛۖ";
                                        continue;
                                    }
                                case 2033922393:
                                    file3.delete();
                                    utils.copyFile(file5.getPath(), file3.getPath());
                                    break;
                                default:
                                    continue;
                            }
                        }
                    case 481311665:
                        if (!file5.exists()) {
                            str4 = "۠ۘۦ۠ۤۥ۠۬ۚۥۙ۟۬ۙۛۗۢۢۥۦۡۛۛۘۘۛ۠ۖۘ";
                            break;
                        } else {
                            str4 = "ۡۙۜ۟ۜۡۡ۬۫ۥۖۜ۫ۥۨ۠ۖ";
                            continue;
                        }
                    case 1277755293:
                        str4 = "۟۠ۦۘۧۙ۬ۥۧۚۤۙۜۢۙۖۘۡۢ۫ۚۧۗ۬ۚۤ";
                        continue;
                    default:
                        continue;
                }
            }
            Intent intent = new Intent(yo.getCtx(), HomeActivity.class);
            intent.addFlags(335577088);
            yo.getCtx().startActivity(intent);
            System.exit(0);
        } catch (Exception e2) {
        }
    }
}
