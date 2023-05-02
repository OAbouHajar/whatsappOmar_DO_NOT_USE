package com.obwhatsapp.youbasha.task;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.ContentResolver;
import android.os.AsyncTask;
import com.obwhatsapp.yo.r1;
import com.obwhatsapp.yo.yo;
import java.io.File;

public class UpdateMediaStore extends AsyncTask<Void, Integer, Void> {

    /* renamed from: j  reason: collision with root package name */
    public static final int f1090j = 0;

    /* renamed from: a  reason: collision with root package name */
    public final ProgressDialog f1091a;

    /* renamed from: b  reason: collision with root package name */
    public int f1092b = 0;

    /* renamed from: c  reason: collision with root package name */
    public final int f1093c;

    /* renamed from: d  reason: collision with root package name */
    public final File f1094d;

    /* renamed from: e  reason: collision with root package name */
    public final String f1095e;

    /* renamed from: f  reason: collision with root package name */
    public final File[] f1096f;

    /* renamed from: g  reason: collision with root package name */
    public final ContentResolver f1097g = yo.getCtx().getContentResolver();

    /* renamed from: h  reason: collision with root package name */
    public final boolean f1098h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f1099i;

    public UpdateMediaStore(Activity activity, int i2, String str, File file, boolean z2, boolean z3) {
        this.f1098h = z2;
        this.f1091a = new ProgressDialog(activity);
        this.f1095e = str;
        this.f1094d = file;
        this.f1093c = i2;
        this.f1096f = new File(str).listFiles(new r1(6));
        this.f1099i = z3;
    }

    public final void a() {
        try {
            File[] listFiles = new File(this.f1095e).listFiles(new r1(5));
            int length = listFiles.length;
            int i2 = 0;
            while (true) {
                String str = "ۧۢۦۥۦۚۜۤۦۘۖۚۙ۬ۜۥۘۤۥۙۘ۫۟ۨۤۦ";
                while (true) {
                    switch (str.hashCode() ^ -974352430) {
                        case 302537525:
                            str = "ۧۙۚۘۡۥۢ۫۬ۡۘۘۤۖۥۨۡ۬";
                            break;
                        case 1294335156:
                            if (i2 >= length) {
                                str = "ۖ۫ۨ۬۟ۖۘۘۤۤۙۙۜۖۚۙۢ۠ۢۙ";
                                break;
                            } else {
                                str = "ۘۚۜۘۡ۬۫ۡۜۡۨۛۡۥۧۘۦۡۚۥ۫۠ۗۡ۠ۙۤۡ";
                                break;
                            }
                        case 1750221996:
                            return;
                        case 1952973408:
                            File file = listFiles[i2];
                            try {
                                file.renameTo(new File(file.getAbsolutePath().replace("_nomedia", "")));
                            } catch (Exception e2) {
                            }
                            i2++;
                    }
                }
            }
        } catch (Exception e3) {
        }
    }

    public /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        String str = "ۧۧۢۦۗ۟۟ۡۜ۟ۚۘۡۙ۟ۚ۫ۖ";
        while (true) {
            switch ((str.hashCode() ^ 353) ^ -1943038080) {
                case -1855512372:
                    str = "ۢۛۥۘۦۛۗۖۙۦۘۧۜ۟ۗۘۧۧۚۢ";
                    break;
                case -1733271735:
                    str = "ۦ۬ۦۙۤۤۚ۟ۜۖۥۖ۟ۦۡۦ۬";
                    break;
                case -476171498:
                    return doInBackground((Void[]) objArr);
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Void doInBackground(java.lang.Void... r14) {
        /*
            r13 = this;
            r12 = 0
            r1 = 0
            boolean r2 = r13.f1098h
            java.io.File r3 = r13.f1094d
            r4 = 391775236(0x175a0404, float:7.0444667E-25)
            java.lang.String r0 = "ۖۙۜۘۤۥۖۘۥۢۖ۟ۡۘۤ۬۫ۙۢۘ۬ۗ۬ۙۧۜۨۚۚ"
        L_0x000b:
            int r5 = r0.hashCode()
            r5 = r5 ^ r4
            switch(r5) {
                case -1815175462: goto L_0x0014;
                case -1538323212: goto L_0x0076;
                case -1333688727: goto L_0x007b;
                case -56041299: goto L_0x007e;
                default: goto L_0x0013;
            }
        L_0x0013:
            goto L_0x000b
        L_0x0014:
            java.io.File r0 = new java.io.File     // Catch:{ Exception -> 0x01eb }
            java.lang.String r2 = r13.f1095e     // Catch:{ Exception -> 0x01eb }
            r0.<init>(r2)     // Catch:{ Exception -> 0x01eb }
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ Exception -> 0x01eb }
            r4.<init>()     // Catch:{ Exception -> 0x01eb }
            com.obwhatsapp.yo.r1 r2 = new com.obwhatsapp.yo.r1     // Catch:{ Exception -> 0x01eb }
            r5 = 7
            r2.<init>(r5)     // Catch:{ Exception -> 0x01eb }
            java.io.File[] r5 = r0.listFiles(r2)     // Catch:{ Exception -> 0x01eb }
            int r6 = r5.length     // Catch:{ Exception -> 0x01eb }
            r0 = r1
            r2 = r1
        L_0x002d:
            r7 = -788328710(0xffffffffd1030efa, float:-3.5180749E10)
            java.lang.String r1 = "ۛۡۧۙۦ۫ۡۤۥۘۨ۠ۡۘۚۦ۟ۧۡۡۡۗۥۡ۫ۚ"
        L_0x0032:
            int r8 = r1.hashCode()
            r8 = r8 ^ r7
            switch(r8) {
                case -1556973779: goto L_0x0198;
                case -1153830138: goto L_0x01a2;
                case -266585815: goto L_0x019e;
                case 69638245: goto L_0x003b;
                default: goto L_0x003a;
            }
        L_0x003a:
            goto L_0x0032
        L_0x003b:
            r0 = 0
            java.lang.String[] r0 = new java.lang.String[r0]     // Catch:{ Exception -> 0x01eb }
            java.lang.Object[] r0 = r4.toArray(r0)     // Catch:{ Exception -> 0x01eb }
            java.lang.String[] r0 = (java.lang.String[]) r0     // Catch:{ Exception -> 0x01eb }
            android.content.Context r1 = com.obwhatsapp.yo.yo.getCtx()     // Catch:{ Exception -> 0x01eb }
            l.a r2 = new l.a     // Catch:{ Exception -> 0x01eb }
            r2.<init>()     // Catch:{ Exception -> 0x01eb }
            r4 = 0
            android.media.MediaScannerConnection.scanFile(r1, r0, r4, r2)     // Catch:{ Exception -> 0x01eb }
        L_0x0051:
            r1 = -435350417(0xffffffffe60d146f, float:-1.6655765E23)
            java.lang.String r0 = "۫ۢۥۘۦ۫ۨۘ۫ۖۥۘۦۧ۠ۤۡۧۘ۬ۘۘۘ"
        L_0x0056:
            int r2 = r0.hashCode()
            r2 = r2 ^ r1
            switch(r2) {
                case -688539929: goto L_0x005f;
                case 20219955: goto L_0x01c3;
                case 989390629: goto L_0x01cd;
                case 1145138240: goto L_0x0062;
                default: goto L_0x005e;
            }
        L_0x005e:
            goto L_0x0056
        L_0x005f:
            r3.delete()
        L_0x0062:
            r1 = -1759918749(0xffffffff9719c563, float:-4.9686103E-25)
            java.lang.String r0 = "۟ۢۘ۫ۜۖ۬ۘۨۘۙ۫۫ۤۥۧۖۧ"
        L_0x0067:
            int r2 = r0.hashCode()
            r2 = r2 ^ r1
            switch(r2) {
                case -2010761563: goto L_0x01e0;
                case 355511401: goto L_0x01d5;
                case 764677068: goto L_0x0070;
                case 1850247168: goto L_0x01dd;
                default: goto L_0x006f;
            }
        L_0x006f:
            goto L_0x0067
        L_0x0070:
            java.lang.String r0 = "ۜۙ۟ۢۨۙ۟ۛۛ۬ۛۨ۠ۘ۠ۢۖۘۢۖۘۘۙۚ۬ۜۡۘ"
            goto L_0x0067
        L_0x0073:
            java.lang.String r0 = "ۡۜۨۘۙ۫ۢۢۖۧ۫ۨۜۘ۫ۚۡۘ۬ۦۥۘۚۦۘۤ۟۫"
            goto L_0x000b
        L_0x0076:
            if (r2 == 0) goto L_0x0073
            java.lang.String r0 = "ۗۙۘۙۢ۟ۛ۬ۤۙۜۥ۬ۛ۫"
            goto L_0x000b
        L_0x007b:
            java.lang.String r0 = "ۨۢ۠ۚۤۛۘ۫ۖۘ۬ۢۤۢۙۚۤۦۨۡۗۧۙۢ"
            goto L_0x000b
        L_0x007e:
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ Exception -> 0x01e9 }
            r4.<init>()     // Catch:{ Exception -> 0x01e9 }
            r2 = 38371437(0x249806d, float:1.4804004E-37)
            java.lang.String r0 = "۫ۡۖۘۜۡۥۙۘۘۘۛۤۖۥۗۡ۟ۨۘ"
        L_0x0088:
            int r5 = r0.hashCode()     // Catch:{ Exception -> 0x01e9 }
            r5 = r5 ^ r2
            switch(r5) {
                case -1950700727: goto L_0x00bf;
                case -640967991: goto L_0x0091;
                case -618019982: goto L_0x00bc;
                case 1366321003: goto L_0x00b3;
                default: goto L_0x0090;
            }     // Catch:{ Exception -> 0x01e9 }
        L_0x0090:
            goto L_0x0088
        L_0x0091:
            android.net.Uri r0 = android.provider.MediaStore.Video.Media.EXTERNAL_CONTENT_URI     // Catch:{ Exception -> 0x01e9 }
            r2 = r0
        L_0x0094:
            r0 = 1
            java.lang.String[] r5 = new java.lang.String[r0]     // Catch:{ Exception -> 0x01e9 }
            java.io.File[] r6 = r13.f1096f     // Catch:{ Exception -> 0x01e9 }
            int r7 = r6.length     // Catch:{ Exception -> 0x01e9 }
            r0 = r1
        L_0x009b:
            android.content.ContentResolver r8 = r13.f1097g
            r9 = 203033056(0xc1a09e0, float:1.18667E-31)
            java.lang.String r1 = "۫ۖۙۡ۠ۡۘۥۙۚۙ۬ۡ۠ۗۥۢۥ۫ۥۘۖۘ"
        L_0x00a2:
            int r10 = r1.hashCode()
            r10 = r10 ^ r9
            switch(r10) {
                case -1459864842: goto L_0x013c;
                case 626811413: goto L_0x00c9;
                case 1107161483: goto L_0x00c6;
                case 1942238235: goto L_0x00ab;
                default: goto L_0x00aa;
            }
        L_0x00aa:
            goto L_0x00a2
        L_0x00ab:
            if (r0 >= r7) goto L_0x00c3
            java.lang.String r1 = "ۖ۫۬ۛ۫ۛۖۦۘۡۗ۬۠ۦۨۘۤۘۗۚۤ۠"
            goto L_0x00a2
        L_0x00b0:
            java.lang.String r0 = "ۢۖۥۘۧۜۙۙۦۧۘۜ۬ۗۨ۠ۜۛ۟ۖۘ۫ۡۘ"
            goto L_0x0088
        L_0x00b3:
            int r0 = r13.f1093c     // Catch:{ Exception -> 0x01e9 }
            r5 = 222(0xde, float:3.11E-43)
            if (r0 != r5) goto L_0x00b0
            java.lang.String r0 = "ۢۙۨۧۘۛ۬ۜۛۖۛ۠ۚۥۛۨ۠ۨ۟ۨ۠ۛۡۜۤۙۜ"
            goto L_0x0088
        L_0x00bc:
            java.lang.String r0 = "ۢۘۨۨ۫ۗۨۨۗۦۥۥۘۧۚۚۚۚۨ۫ۖۗ"
            goto L_0x0088
        L_0x00bf:
            android.net.Uri r0 = android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI     // Catch:{ Exception -> 0x01e9 }
            r2 = r0
            goto L_0x0094
        L_0x00c3:
            java.lang.String r1 = "۫ۨۜ۬ۙۥ۬ۗۚۛ۫ۛ۟ۜۖۘۡ۬۠ۥۦۘ"
            goto L_0x00a2
        L_0x00c6:
            java.lang.String r1 = "ۚۢۧ۟ۗۜ۫ۨۖۥۤۘۡۡۘۖۙۡۘۧۢۨۛۥ۟"
            goto L_0x00a2
        L_0x00c9:
            r1 = r6[r0]
            r9 = 0
            java.lang.String r10 = r1.getAbsolutePath()     // Catch:{ Exception -> 0x01e9 }
            r5[r9] = r10     // Catch:{ Exception -> 0x01e9 }
            android.content.ContentProviderOperation$Builder r9 = android.content.ContentProviderOperation.newDelete(r2)     // Catch:{ Exception -> 0x01e9 }
            java.lang.String r10 = "_data=?"
            android.content.ContentProviderOperation$Builder r9 = r9.withSelection(r10, r5)     // Catch:{ Exception -> 0x01e9 }
            android.content.ContentProviderOperation r9 = r9.build()     // Catch:{ Exception -> 0x01e9 }
            r4.add(r9)     // Catch:{ Exception -> 0x01e9 }
            java.io.File r9 = new java.io.File     // Catch:{ Exception -> 0x01e9 }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01e9 }
            r10.<init>()     // Catch:{ Exception -> 0x01e9 }
            java.lang.String r11 = r1.getAbsolutePath()     // Catch:{ Exception -> 0x01e9 }
            r10.append(r11)     // Catch:{ Exception -> 0x01e9 }
            java.lang.String r11 = "_nomedia"
            r10.append(r11)     // Catch:{ Exception -> 0x01e9 }
            java.lang.String r10 = r10.toString()     // Catch:{ Exception -> 0x01e9 }
            r9.<init>(r10)     // Catch:{ Exception -> 0x01e9 }
            r1.renameTo(r9)     // Catch:{ Exception -> 0x01e6 }
        L_0x0100:
            r9 = -572093899(0xffffffffdde68a35, float:-2.07651856E18)
            java.lang.String r1 = "ۘۦۡۘ۫ۢۥۘۘ۟ۙ۟ۙۜۘۦ۫ۨۘۘۢۨۙ۫ۘ"
        L_0x0105:
            int r10 = r1.hashCode()     // Catch:{ Exception -> 0x01e6 }
            r10 = r10 ^ r9
            switch(r10) {
                case -1404363805: goto L_0x0114;
                case -698336540: goto L_0x0138;
                case 215655998: goto L_0x011f;
                case 1835566263: goto L_0x010e;
                default: goto L_0x010d;
            }
        L_0x010d:
            goto L_0x0105
        L_0x010e:
            java.lang.String r1 = "ۙۜۜۤۤۘۘۖۖۜۦۜ۬ۛۨۦۘۘ۟ۦۘ"
            goto L_0x0105
        L_0x0111:
            java.lang.String r1 = "ۘۥۖۛ۠۟ۥ۟ۘ۫ۥۘۦ۬ۢۖ۠ۨۗ۫ۧۚ۫"
            goto L_0x0105
        L_0x0114:
            int r1 = r4.size()     // Catch:{ Exception -> 0x01e6 }
            r10 = 750(0x2ee, float:1.051E-42)
            if (r1 <= r10) goto L_0x0111
            java.lang.String r1 = "ۧۚۦ۟ۦۡۘۥ۠ۘۦۜۘ۠ۗ۟ۡۥۘ"
            goto L_0x0105
        L_0x011f:
            r1 = 1
            java.lang.Integer[] r1 = new java.lang.Integer[r1]     // Catch:{ Exception -> 0x01e9 }
            r9 = 0
            int r10 = r4.size()     // Catch:{ Exception -> 0x01e9 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ Exception -> 0x01e9 }
            r1[r9] = r10     // Catch:{ Exception -> 0x01e9 }
            r13.publishProgress(r1)     // Catch:{ Exception -> 0x01e9 }
            java.lang.String r1 = "media"
            r8.applyBatch(r1, r4)     // Catch:{ Exception -> 0x01e3 }
        L_0x0135:
            r4.clear()     // Catch:{ Exception -> 0x01e9 }
        L_0x0138:
            int r0 = r0 + 1
            goto L_0x009b
        L_0x013c:
            r1 = -500555889(0xffffffffe22a1f8f, float:-7.845551E20)
            java.lang.String r0 = "ۦۥۥۘۤۦ۟ۢۦۛ۬ۜۢۘۖۨۘۛۘۦۨۛۜ"
        L_0x0141:
            int r2 = r0.hashCode()     // Catch:{ Exception -> 0x01e9 }
            r2 = r2 ^ r1
            switch(r2) {
                case -1704115078: goto L_0x014a;
                case -1506295175: goto L_0x016f;
                case -1422016972: goto L_0x0159;
                case -33338117: goto L_0x0150;
                default: goto L_0x0149;
            }     // Catch:{ Exception -> 0x01e9 }
        L_0x0149:
            goto L_0x0141
        L_0x014a:
            java.lang.String r0 = "۟ۙۨۜۥۘۘ۠ۗۡۙۤ۠ۧ۠"
            goto L_0x0141
        L_0x014d:
            java.lang.String r0 = "ۛۜۜۦۤۦۛۗۖ۫ۥ۬ۚۡۘۨ۟ۡۜۥۘۢۖۧۘ"
            goto L_0x0141
        L_0x0150:
            int r0 = r4.size()     // Catch:{ Exception -> 0x01e9 }
            if (r0 <= 0) goto L_0x014d
            java.lang.String r0 = "۫ۛۥۘۡۖۖۢۖۚۡۚۨۧۥۨۘ"
            goto L_0x0141
        L_0x0159:
            r0 = 1
            java.lang.Integer[] r0 = new java.lang.Integer[r0]     // Catch:{ Exception -> 0x01e9 }
            r1 = 0
            int r2 = r4.size()     // Catch:{ Exception -> 0x01e9 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ Exception -> 0x01e9 }
            r0[r1] = r2     // Catch:{ Exception -> 0x01e9 }
            r13.publishProgress(r0)     // Catch:{ Exception -> 0x01e9 }
            java.lang.String r0 = "media"
            r8.applyBatch(r0, r4)     // Catch:{ Exception -> 0x01e9 }
        L_0x016f:
            r1 = 223102772(0xd4c4734, float:6.294806E-31)
            java.lang.String r0 = "۠ۦۧۜۗۖۘ۬ۦۨۘۢۦۚ۬۠ۨ"
        L_0x0174:
            int r2 = r0.hashCode()     // Catch:{ Exception -> 0x01e9 }
            r2 = r2 ^ r1
            switch(r2) {
                case -969800002: goto L_0x0180;
                case 69881008: goto L_0x017d;
                case 953936322: goto L_0x0191;
                case 2042019218: goto L_0x0188;
                default: goto L_0x017c;
            }
        L_0x017c:
            goto L_0x0174
        L_0x017d:
            r3.createNewFile()     // Catch:{ Exception -> 0x01e1 }
        L_0x0180:
            r13.a()
            goto L_0x0062
        L_0x0185:
            java.lang.String r0 = "۠ۨۥۘۥۘۜۥۖۜۡۜۡۘ۠۟۠ۖۗۡۘ"
            goto L_0x0174
        L_0x0188:
            boolean r0 = r3.exists()     // Catch:{ Exception -> 0x01e9 }
            if (r0 != 0) goto L_0x0185
            java.lang.String r0 = "ۙۧۜۘۖۙ۬ۤۚۜۘۖۢۜۘۖۙۜۤۛۜۚۨۦۘ۬۬ۛ"
            goto L_0x0174
        L_0x0191:
            java.lang.String r0 = "ۥۨۚ۬ۨۜۘۙۨۥۘۜۨۥ۟ۛ"
            goto L_0x0174
        L_0x0194:
            java.lang.String r1 = "ۘ۫ۧۦۥۚۙۧ۫ۨۥۡۥ۠۫۠ۗ۬ۖۢ"
            goto L_0x0032
        L_0x0198:
            if (r0 >= r6) goto L_0x0194
            java.lang.String r1 = "۬ۙۦۘۤ۠ۛۧۨۥۧۚ۫ۜۤۥۜۤۜۜ۬۬ۙۖ۬ۦۛ"
            goto L_0x0032
        L_0x019e:
            java.lang.String r1 = "۠ۡۘۗ۠ۜۢۘۨۘ۬ۡۗۨ۫ۖۘۛۜۘۚ۠ۨۧ۟ۤ"
            goto L_0x0032
        L_0x01a2:
            r1 = r5[r0]
            int r2 = r2 + 1
            java.lang.String r1 = r1.getAbsolutePath()     // Catch:{ Exception -> 0x01eb }
            r4.add(r1)     // Catch:{ Exception -> 0x01eb }
            r1 = 1
            java.lang.Integer[] r1 = new java.lang.Integer[r1]     // Catch:{ Exception -> 0x01eb }
            r7 = 0
            java.lang.Integer r8 = java.lang.Integer.valueOf(r2)     // Catch:{ Exception -> 0x01eb }
            r1[r7] = r8     // Catch:{ Exception -> 0x01eb }
            r13.publishProgress(r1)     // Catch:{ Exception -> 0x01eb }
            int r1 = r0 + 1
            r0 = r1
            goto L_0x002d
        L_0x01bf:
            java.lang.String r0 = "ۥ۠۟ۛۥۧۘۘۨۥۘ۫ۡۥۡۤۦۘۨۥ۬ۖۙ۟"
            goto L_0x0056
        L_0x01c3:
            boolean r0 = r3.exists()
            if (r0 == 0) goto L_0x01bf
            java.lang.String r0 = "۬ۜۘ۬ۡۘۘۥ۫ۨۙ۠۟ۙۧۗۥ۫ۚۢۜۙۢ۫"
            goto L_0x0056
        L_0x01cd:
            java.lang.String r0 = "ۨۙۜۘ۠ۘۧۘۛ۠ۦۘۥۘ۟ۖ۬ۨۘۡۛۛ۬۠ۘ"
            goto L_0x0056
        L_0x01d1:
            java.lang.String r0 = "ۖۥۡ۟ۦۦۘۢۦۖۘۦۥۤۥۦۚ۠ۖۤۢ۟"
            goto L_0x0067
        L_0x01d5:
            boolean r0 = r13.f1099i
            if (r0 == 0) goto L_0x01d1
            java.lang.String r0 = "۟ۖۨۧۧۡۘۚ۬ۜۢۜۥۙۤ۠۟ۦۥۘۧ۠ۦۦۘۢۙۚۙ"
            goto L_0x0067
        L_0x01dd:
            r13.a()
        L_0x01e0:
            return r12
        L_0x01e1:
            r0 = move-exception
            goto L_0x0180
        L_0x01e3:
            r1 = move-exception
            goto L_0x0135
        L_0x01e6:
            r1 = move-exception
            goto L_0x0100
        L_0x01e9:
            r0 = move-exception
            goto L_0x016f
        L_0x01eb:
            r0 = move-exception
            goto L_0x0051
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.youbasha.task.UpdateMediaStore.doInBackground(java.lang.Void[]):java.lang.Void");
    }

    public /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        String str = "ۛۧۖۘۘۥۦۘۘۙ۟ۨ۬ۛۢۡۖ";
        while (true) {
            switch ((str.hashCode() ^ 940) ^ 1944433157) {
                case -1942658664:
                    str = "ۨۗۨۨۘۜۛۘۚۦ۬۟ۢۘ";
                    break;
                case -1580895252:
                    str = "ۢۧۗۜۘۤ۠۟ۦۘۢۜۖۘۧۗۦۥ۟ۖۘ۟ۚۥۜ۟ۡ";
                    break;
                case -835256150:
                    onPostExecute((Void) obj);
                    str = "۟ۤۗۗۢۤۥۛۦ۟ۛۖ۫۟ۦۨ۟ۤۦۥۗۛۦۘ";
                    break;
                case 1965739496:
                    return;
            }
        }
    }

    public void onPostExecute(Void voidR) {
        ProgressDialog progressDialog = null;
        String str = "ۗۖۜۖۙۛ۟۬ۡۨۥۘۘۡۙ۠ۦۦۘ";
        while (true) {
            switch ((str.hashCode() ^ 693) ^ 1742905800) {
                case -2032160026:
                    String str2 = "ۖۧ۠ۛۤۖۢۨۦۧۚ۟ۖۨۡ۠۬ۖۘۛۧۖۛ۠ۥۘ";
                    while (true) {
                        switch (str2.hashCode() ^ 1881008140) {
                            case -2024226060:
                                str = "ۢۗ۠ۤ۠ۦۦ۬۠ۜۤۜ۬ۚۨۥۧۧۙۖۦۘ";
                                continue;
                            case -618717597:
                                if (!progressDialog.isShowing()) {
                                    str2 = "ۨۗۘۡۜۧۧ۬ۛ۬ۢۥۘۚۢ۬";
                                    break;
                                } else {
                                    str2 = "ۨۨۧۥۨ۠۟ۤۢۛۢۨۘۧۡ۫ۥۘۢ۬ۚ";
                                    break;
                                }
                            case 962826566:
                                str2 = "ۗۜۢ۫ۧۡۚۨۨۢۤۢۘۖۦۘۙۛۘۧۛ۫ۛۢۦۘ";
                                break;
                            case 997151268:
                                str = "ۡۦ۫۬ۤۨۘۜۡۧۥۛۤۡۛۗۛ۠۠";
                                continue;
                        }
                    }
                    break;
                case -1928936722:
                    progressDialog.dismiss();
                    str = "ۡۦ۫۬ۤۨۘۜۡۧۥۛۤۡۛۗۛ۠۠";
                    break;
                case -786861339:
                    return;
                case 505708496:
                    progressDialog = this.f1091a;
                    str = "ۡۦۤۛۧۜۘ۟ۦ۫ۨ۟ۜۘۧۦۦۡ۠ۖۘۡۤ۬ۙ۠ۦۘۥ۫۫";
                    break;
                case 1063841787:
                    str = "ۥۨۥ۠۫ۖۘۗۨ۠ۙۦۥۥۚۨۘۢۘ۠";
                    break;
                case 1368921403:
                    str = "۠ۥۥۜۖۜۖۚۙۡ۫ۧۢۚۨ";
                    break;
            }
        }
    }

    public void onPreExecute() {
        ProgressDialog progressDialog = null;
        String str = "ۖۤ۫ۛۦۥۛۜ۫ۥۘۡۨ";
        while (true) {
            switch ((str.hashCode() ^ 111) ^ -606255988) {
                case -1014904890:
                    progressDialog = this.f1091a;
                    str = "ۙۗۘۘۗۥۖۘۢۘۚ۫ۨۘ۬۟ۛۥ۬ۤۤۤۨۘ۫ۜ۫ۨ۫ۖ";
                    break;
                case -848411267:
                    progressDialog.setCancelable(false);
                    str = "ۧۘۜۘ۠۠ۘۘۗ۟ۤۡۨۡۛۘۜۖۤۦۘ";
                    break;
                case -727054682:
                    return;
                case -615266144:
                    progressDialog.setMessage(yo.getString("settings_backup_db_now_message"));
                    str = "ۚ۠ۖۘۤۡۢ۬ۖۡۗۗ۫ۡ۟۫ۢۤۦۘۤۥۘ";
                    break;
                case -366399049:
                    progressDialog.setProgressStyle(1);
                    str = "۟ۖۥۧ۬ۘۧۛۦۛۖ۟ۤۙۚ";
                    break;
                case 593330884:
                    str = "ۗۜۧ۠ۘۙۚ۟ۤۡۧۖۘۘۢۘۛۨۡۦۨۥۖۘۜ";
                    break;
                case 760607373:
                    progressDialog.show();
                    str = "ۧۘۡ۬ۜۧۘۦۨۚۙۨۘ۟ۧۤۨۤۡۘۚۨ۠";
                    break;
                case 1560052004:
                    progressDialog.setIndeterminate(false);
                    str = "ۜ۫۟۟ۚۖۘۙۥۛۖۤۡۤ۟ۚۘۜۚۢۖۨ۫";
                    break;
                case 1683257308:
                    progressDialog.setMax(this.f1096f.length);
                    str = "ۧ۟ۤۚۡۥۢۛ۟۠ۚ۫ۢ۬ۥ";
                    break;
            }
        }
    }

    public void onProgressUpdate(Integer... numArr) {
        String str = "ۘۙۥۘۖۙۨ۠ۘۗۗۙ۠ۗ۠ۜۨ";
        int i2 = 0;
        int i3 = 0;
        while (true) {
            switch ((str.hashCode() ^ 509) ^ 212898189) {
                case -2141600966:
                    i2 = numArr[0].intValue() + i3;
                    str = "ۘۡ۟ۛۙ۬۟۠ۦۜ۬ۛۢۜۜۜۥ";
                    break;
                case -2130774931:
                    super.onProgressUpdate(numArr);
                    str = "ۛۨ۬ۡۡۦۧۚۨۡۧۖۙۛۡۘۙۙۘۤ۠ۤۖۤۦۘ";
                    break;
                case -1914877317:
                    i3 = this.f1092b;
                    str = "ۛۖۦۘۘۥۤۙ۫ۙ۠ۛۨۘۖۚۖ";
                    break;
                case -242809259:
                    str = "ۜۢۤ۠ۨۘۧۥۧۨۤۥۘۥۧۚۙۨۜۘۙۚۜۘۦۥ۬ۗۜ";
                    break;
                case 1070123901:
                    this.f1092b = i2;
                    str = "ۤ۫ۘۘ۠ۤ۬ۙ۟ۙۦۛۧ۬۠ۦۤۥۖۚۦۜۜۢۨۘ";
                    break;
                case 1230189075:
                    this.f1091a.setProgress(i2);
                    str = "۬ۦۧۘ۠ۥۦۦۡ۠ۖۧۦۤ۬ۛۖۘۨۥۖۜۘۦۥۡۘۘ";
                    break;
                case 1232716904:
                    str = "۟ۚۦۘۡ۠۠ۜۖۙ۠ۢۦۙۨۥ";
                    break;
                case 1250664236:
                    return;
            }
        }
    }

    public /* bridge */ /* synthetic */ void onProgressUpdate(Object[] objArr) {
        String str = "۫ۗۧ۠ۤۗۘۡۘۘ۬ۡۥۢۢۡۘۚۢۡۘۘ۠ۨۖۧۘۤۢۨۘ";
        while (true) {
            switch ((str.hashCode() ^ 986) ^ -848562057) {
                case -876070136:
                    return;
                case 142448728:
                    onProgressUpdate((Integer[]) objArr);
                    str = "۫ۚۖۘۘ۠ۡۘۗۛۜۘۦۤۜۘ۟ۧۗ";
                    break;
                case 741189296:
                    str = "ۖ۫ۡۘۜۦۘۢ۠ۥ۫ۙۜۘۡۤۜۘ۠ۚۜۘ۫۬ۨۘ";
                    break;
                case 854155607:
                    str = "ۖۨۛۖۙۖۤۨۘۘ۬ۙۦۘۢۦۢ۬۟ۡ";
                    break;
            }
        }
    }
}
