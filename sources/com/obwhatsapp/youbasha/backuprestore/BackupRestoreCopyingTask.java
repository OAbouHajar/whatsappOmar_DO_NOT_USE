package com.obwhatsapp.youbasha.backuprestore;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.AsyncTask;
import com.obwhatsapp.youbasha.task.ZipManager;
import java.io.File;
import java.util.ArrayList;

public class BackupRestoreCopyingTask extends AsyncTask<File, Integer, Integer> {

    /* renamed from: a  reason: collision with root package name */
    public final Context f939a;

    /* renamed from: b  reason: collision with root package name */
    public final ProgressDialog f940b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f941c = false;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f942d;

    /* renamed from: e  reason: collision with root package name */
    public int f943e = 0;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f944f;

    /* renamed from: g  reason: collision with root package name */
    public int f945g;

    /* renamed from: h  reason: collision with root package name */
    public final String f946h;

    /* renamed from: i  reason: collision with root package name */
    public final File f947i;

    /* renamed from: j  reason: collision with root package name */
    public final File f948j;

    /* renamed from: k  reason: collision with root package name */
    public final String f949k;

    /* renamed from: l  reason: collision with root package name */
    public final String f950l;

    public BackupRestoreCopyingTask(Context context, boolean z2, boolean z3, String str, String str2) {
        String str3;
        this.f942d = z3;
        this.f945g = 0;
        this.f939a = context;
        this.f944f = z2;
        String str4 = "ۨۙۥۘ۠ۚ۠ۢۤ۟ۤۖۢۙۘۥۘۛ۫ۥۘ۟ۘۙۚۜ۟ۤۗ۬";
        while (true) {
            switch (str4.hashCode() ^ 362073734) {
                case -1794402459:
                    str3 = "Backup";
                    break;
                case -1487608604:
                    str4 = "ۦۨۖۗۡۡۘ۟۠ۚۗۦۤ۠ۢۘۘۙ۫ۨ";
                    continue;
                case 929524510:
                    str3 = "Restore";
                    break;
                case 1176331060:
                    if (!z2) {
                        str4 = "۟۟۟۬ۢ۟ۖ۠ۥۘۥۡۖ۠ۦۦۘۜۨۘۘۢ۟ۜۘۗۛۘۘۜۜ۬";
                        break;
                    } else {
                        str4 = "ۜ۠ۨۘۥۜۘۘ۟۟ۥۘ۠ۦ۬ۗۖۧۘ۬ۚۥۘۜۢۡ";
                        continue;
                    }
            }
        }
        this.f946h = str3;
        String str5 = "ۚۨۥ۬ۘۦۘۗۜۤۙ۠ۦۘۥ۬ۡۖۦۨۘۘۚۦۜۘۨۘ۠ۧۖۘ";
        while (true) {
            switch (str5.hashCode() ^ -286710787) {
                case -2039722391:
                    ProgressDialog progressDialog = new ProgressDialog(context);
                    this.f940b = progressDialog;
                    progressDialog.setProgressStyle(0);
                    progressDialog.setCancelable(false);
                    progressDialog.setIndeterminate(false);
                    progressDialog.setTitle(getString("yo" + this.f946h + "Title"));
                    progressDialog.setMessage(getString("yo" + this.f946h + "Msg"));
                    break;
                case -1448372321:
                    if (z3) {
                        str5 = "ۦۜۘۙ۠ۢۘۥۘۚۥۗۤۙۡۘۢ۫ۥۘ۫۟ۖۦ۫ۖ";
                        break;
                    } else {
                        str5 = "ۥۥۘ۠ۧۗۥۖۥ۫۫ۢۖ۟ۤۘۗۡۨۗۙ۫ۡۛۤ۟ۚ";
                        continue;
                    }
                case -920889622:
                    str5 = "ۥۚۗ۠۟ۥۘۚ۬ۖۘۛۦۧۘۗ۠۬۠ۛۖۘ۫ۢۧ";
                    continue;
                case 1344869068:
                    break;
            }
        }
        File file = new File(str);
        this.f947i = file;
        this.f949k = file.getAbsolutePath();
        File file2 = new File(str2);
        this.f948j = file2;
        this.f950l = file2.getAbsolutePath();
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0081, code lost:
        r0 = "ۥ۬ۘ۟ۜۙۚۥۡۢۗۖۘۧۦ";
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void b(java.io.File r9) {
        /*
            r2 = 0
            r5 = 0
            java.lang.String r0 = "ۢۚۦۘ۠ۗۡۧۡۨۧۗۛ۠ۛۙۦۜۚ۠ۨ۠"
            r1 = r2
            r3 = r2
            r4 = r2
        L_0x0007:
            int r6 = r0.hashCode()
            r7 = 857(0x359, float:1.201E-42)
            r8 = 1027198084(0x3d39cc84, float:0.045361057)
            r6 = r6 ^ r7
            r6 = r6 ^ r8
            switch(r6) {
                case -1911663128: goto L_0x0016;
                case -1752013690: goto L_0x004b;
                case -1383573742: goto L_0x0019;
                case -1334662437: goto L_0x0047;
                case -655433797: goto L_0x006f;
                case -389839077: goto L_0x0084;
                case 453026141: goto L_0x0040;
                case 987754435: goto L_0x0067;
                case 1238446113: goto L_0x0074;
                case 1443513540: goto L_0x0039;
                case 1635340923: goto L_0x007e;
                case 1819069468: goto L_0x0078;
                case 2064025437: goto L_0x0044;
                default: goto L_0x0015;
            }
        L_0x0015:
            goto L_0x0007
        L_0x0016:
            java.lang.String r0 = "ۚۡۙۢۢ۬۟ۚۡۘۥۤۛۘ۬ۢۘ۟ۧۢۖۥ"
            goto L_0x0007
        L_0x0019:
            r6 = -1061919121(0xffffffffc0b4666f, float:-5.637504)
            java.lang.String r0 = "ۨۢۡۘ۠ۘۢۜۡۢۙۗۥ۫۫ۖۘۙۧ۠ۦۖۜ"
        L_0x001e:
            int r7 = r0.hashCode()
            r7 = r7 ^ r6
            switch(r7) {
                case -1599298978: goto L_0x0081;
                case -1103788267: goto L_0x0027;
                case -214859091: goto L_0x0036;
                case 668499920: goto L_0x002d;
                default: goto L_0x0026;
            }
        L_0x0026:
            goto L_0x001e
        L_0x0027:
            java.lang.String r0 = "ۙۦ۬ۤ۟ۦۙۗۡۘ۫ۢ۬ۙۢۦۘۡ۫"
            goto L_0x0007
        L_0x002a:
            java.lang.String r0 = "ۖۙۛۤۗ۠ۧۛۜۡۗۦ۬۠ۙۡۥۙۡۚۢ۬ۡ"
            goto L_0x001e
        L_0x002d:
            boolean r0 = r9.isDirectory()
            if (r0 == 0) goto L_0x002a
            java.lang.String r0 = "ۗۚۦ۫ۢ۫ۢۦۡۛۤ۟ۢۛۨۘۗۜۥۘۧ۫ۙۖۖ۬"
            goto L_0x001e
        L_0x0036:
            java.lang.String r0 = "ۡۥۖۥ۫ۜۖۙۤۤ۫ۡۘۘۗۘۤۗۛ۬ۘۘۤۖۘۨۜۖۘ"
            goto L_0x001e
        L_0x0039:
            java.io.File[] r5 = r9.listFiles()
            java.lang.String r0 = "ۡۙۙ۠ۦۘۘ۫ۦۤ۬ۦ۬ۘۦۘۗۛۖۘ"
            goto L_0x0007
        L_0x0040:
            int r4 = r5.length
            java.lang.String r0 = "۠ۤ۠۟ۖۢ۫ۦۢۢۘۡۘۜۡۨۛۦۥۘۜۜۢۜۡۛ۫ۛۘۘ"
            goto L_0x0007
        L_0x0044:
            java.lang.String r0 = "ۛۘۗۧۢ۟ۡۗۛ۫۠ۡۘ۠ۥ۠۠ۡۡ۫ۥ۬"
            goto L_0x0007
        L_0x0047:
            java.lang.String r0 = "ۦۦ۟ۖۘۘۢۤۖۘۨۚۨۚۤۖ۬ۘۘۘۢۧۥۘۜۘ۬"
            r3 = r2
            goto L_0x0007
        L_0x004b:
            r6 = -778933312(0xffffffffd1926bc0, float:-7.8609121E10)
            java.lang.String r0 = "ۚۧۧ۫۟۟ۢ۟ۙۜ۠۬ۧۛۘۜ۫۫۠ۙۘ۟ۖۘ"
        L_0x0050:
            int r7 = r0.hashCode()
            r7 = r7 ^ r6
            switch(r7) {
                case -2122202117: goto L_0x0059;
                case -1207210597: goto L_0x0081;
                case -494510390: goto L_0x0064;
                case 1408265207: goto L_0x005f;
                default: goto L_0x0058;
            }
        L_0x0058:
            goto L_0x0050
        L_0x0059:
            java.lang.String r0 = "ۧۗۜ۟ۡۦۘۗۨۡۦ۠ۜۘۧ۫"
            goto L_0x0050
        L_0x005c:
            java.lang.String r0 = "ۙۛۙۘۘ۫۠۬۬ۧۙۖۜۨۡۛۙۦۘۧۖۗ"
            goto L_0x0050
        L_0x005f:
            if (r3 >= r4) goto L_0x005c
            java.lang.String r0 = "ۘ۫ۦۘ۬ۚ۟ۢۢۖۗۖۦۤۜۡۛۤۙۜ۠ۥۜۜۘ"
            goto L_0x0050
        L_0x0064:
            java.lang.String r0 = "ۦۗۡۚۧۖ۟ۚۗۚۨۜۘۖۥۚ"
            goto L_0x0007
        L_0x0067:
            r0 = r5[r3]
            b(r0)
            java.lang.String r0 = "ۖۘۢۘۚۧۖۜۥۗۤ۠ۤۡۥۚۧۢۡۚۥ"
            goto L_0x0007
        L_0x006f:
            int r1 = r3 + 1
            java.lang.String r0 = "ۛۡۙۥۦۚ۠ۨۙ۫ۛۡۘۨۨۡۘۦ۠۟"
            goto L_0x0007
        L_0x0074:
            java.lang.String r0 = "۠ۦۘۨۢۜۘۨۨۖۘۨۧۜ۟ۡ۠ۜۥۦۘ"
            r3 = r1
            goto L_0x0007
        L_0x0078:
            r9.delete()
            java.lang.String r0 = "ۜۚۦۘ۟ۜۜۘۛ۫ۡۤۥۦۢ۬ۖ۬۠۫ۦۨۢ۫ۥۘ"
            goto L_0x0007
        L_0x007e:
            java.lang.String r0 = "ۦۦ۟ۖۘۘۢۤۖۘۨۚۨۚۤۖ۬ۘۘۘۢۧۥۘۜۘ۬"
            goto L_0x0007
        L_0x0081:
            java.lang.String r0 = "ۥ۬ۘ۟ۜۙۚۥۡۢۗۖۘۧۦ"
            goto L_0x0007
        L_0x0084:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.youbasha.backuprestore.BackupRestoreCopyingTask.b(java.io.File):void");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002a, code lost:
        r0 = "ۦ۟ۢۜۡۘۧۙۨۘۜۢۖۦۗۖۘۤ۬ۦۘ";
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.io.File r10) {
        /*
            r9 = this;
            r2 = 0
            r5 = 0
            java.lang.String r0 = "ۢۨۡۘۙ۫ۖۘ۬ۦۚ۫ۛ۫ۢ۫ۤ۬۫ۛ۬ۡۨۚۗ۠"
            r1 = r2
            r3 = r2
            r4 = r2
        L_0x0007:
            int r6 = r0.hashCode()
            r7 = 790(0x316, float:1.107E-42)
            r8 = 1833557467(0x6d49dddb, float:3.9046684E27)
            r6 = r6 ^ r7
            r6 = r6 ^ r8
            switch(r6) {
                case -2045912592: goto L_0x0016;
                case -1206964562: goto L_0x004a;
                case -864324484: goto L_0x0051;
                case -728960438: goto L_0x008b;
                case -339078260: goto L_0x003f;
                case -282990779: goto L_0x001c;
                case -28507711: goto L_0x007a;
                case 393652732: goto L_0x007e;
                case 541978865: goto L_0x0087;
                case 853265502: goto L_0x0075;
                case 1126178951: goto L_0x0046;
                case 1379517465: goto L_0x006d;
                case 1420195614: goto L_0x0019;
                case 2129315737: goto L_0x004d;
                default: goto L_0x0015;
            }
        L_0x0015:
            goto L_0x0007
        L_0x0016:
            java.lang.String r0 = "۟ۜۦۘۤۖۥۥۦۖۘۘۡۛ۬ۘۜۘ"
            goto L_0x0007
        L_0x0019:
            java.lang.String r0 = "ۨۥۢۚۢۚۡۛۤۘۨۘۙ۫ۖۘۜۥۜۘ۠ۛۨۘۛ۟ۛ"
            goto L_0x0007
        L_0x001c:
            r6 = 432471872(0x19c6ff40, float:2.0575815E-23)
            java.lang.String r0 = "۠ۖۜۘۡۤۛۘۙۘۘۧ۬ۘۘۥۡ۬ۨۛ"
        L_0x0021:
            int r7 = r0.hashCode()
            r7 = r7 ^ r6
            switch(r7) {
                case -662384098: goto L_0x0039;
                case 205819322: goto L_0x003c;
                case 385556448: goto L_0x002a;
                case 2134267703: goto L_0x0030;
                default: goto L_0x0029;
            }
        L_0x0029:
            goto L_0x0021
        L_0x002a:
            java.lang.String r0 = "ۦ۟ۢۜۡۘۧۙۨۘۜۢۖۦۗۖۘۤ۬ۦۘ"
            goto L_0x0007
        L_0x002d:
            java.lang.String r0 = "ۦۨۡۘ۬ۜۜۦۖۚۗۨۗۖ۟۠ۙۙۢۙۘۙۘۘ"
            goto L_0x0021
        L_0x0030:
            boolean r0 = r10.isDirectory()
            if (r0 == 0) goto L_0x002d
            java.lang.String r0 = "۠ۦۧۘۗۨۡۗۤۛۡۨۘۘ۫ۗ۟ۦۘۘۙۨ"
            goto L_0x0021
        L_0x0039:
            java.lang.String r0 = "۫ۚۨۘۨ۬ۖۘۥۤۥۘۚ۟ۡۘ۫ۘۚ"
            goto L_0x0021
        L_0x003c:
            java.lang.String r0 = "ۥۨۦۘۙ۬۫ۛۖۘ۬۫ۛۧۢ۫ۜ۠ۤۗۦۢ"
            goto L_0x0007
        L_0x003f:
            java.io.File[] r5 = r10.listFiles()
            java.lang.String r0 = "ۨ۫ۧ۬۬ۤۤۡ۟ۢ۟ۦۙ۠ۨۦۛۥ۫ۖ۫"
            goto L_0x0007
        L_0x0046:
            int r4 = r5.length
            java.lang.String r0 = "ۗۦ۫ۡۡۛۘ۠۟ۜۛۦۛۜۗۚۚۙۗۡ۬ۥۘ"
            goto L_0x0007
        L_0x004a:
            java.lang.String r0 = "ۜ۫۬۬۬ۦۘۖ۫ۘۘۘۥۜ۬ۖۘۘ۫ۗۡۘۗۤۙ"
            goto L_0x0007
        L_0x004d:
            java.lang.String r0 = "ۙ۬۠۫۠ۥۚ۟ۨۘ۬ۦۙۨۜۡۘ۠ۧۜۘۖ۟ۙۙۢۘۛۘ"
            r3 = r2
            goto L_0x0007
        L_0x0051:
            r6 = 1417780702(0x54819dde, float:4.4535948E12)
            java.lang.String r0 = "ۦۨۨۢۖۜۗۥ۬ۖ۬ۖۛۤۘۘۛ۫ۦۘۤۤۡ"
        L_0x0056:
            int r7 = r0.hashCode()
            r7 = r7 ^ r6
            switch(r7) {
                case -1684905077: goto L_0x006a;
                case -279652428: goto L_0x002a;
                case 180624812: goto L_0x005f;
                case 947901995: goto L_0x0067;
                default: goto L_0x005e;
            }
        L_0x005e:
            goto L_0x0056
        L_0x005f:
            if (r3 >= r4) goto L_0x0064
            java.lang.String r0 = "ۨۖۗ۟ۘۨۗۥۘ۬ۛۨۦۤۙۤۚۡ۠۟ۘۙۘۖۨۨۘ"
            goto L_0x0056
        L_0x0064:
            java.lang.String r0 = "۟ۢۖۘۗۙۡۘۘۗ۠۠ۡۧۢۡۘۚۖۥۘۢۖۥۖۦ۬ۖۨ۬"
            goto L_0x0056
        L_0x0067:
            java.lang.String r0 = "ۙۤۥۘۡۘۜۘۤ۟۠ۥۚۥۙۜ۬ۖۗ۫ۚ۬ۚ۟ۙ۠ۦ۠"
            goto L_0x0056
        L_0x006a:
            java.lang.String r0 = "ۥۡۘۘۡۛۜ۬ۨۙۨۗۛۖ۟ۖۘۤۥۥۘ"
            goto L_0x0007
        L_0x006d:
            r0 = r5[r3]
            r9.a(r0)
            java.lang.String r0 = "ۦۛۖۨ۫ۛۧۛۜۛ۫ۤۙۡۢ۫ۙۘ"
            goto L_0x0007
        L_0x0075:
            int r1 = r3 + 1
            java.lang.String r0 = "۫ۤۧۨۗۗۢ۬۬ۦۧ۬ۦۖۘۥۗۥۘۢۦۥ۠ۦ۬۠ۛۖ"
            goto L_0x0007
        L_0x007a:
            java.lang.String r0 = "ۨۖۡۘۤۗۦۛ۫ۛۛ۬ۜۘۧ۫ۙۚۖۡ۬ۚۤ"
            r3 = r1
            goto L_0x0007
        L_0x007e:
            int r0 = r9.f945g
            int r0 = r0 + 1
            r9.f945g = r0
            java.lang.String r0 = "ۜۘۢۘۚۖۘۗۤۙ۬ۤۦۜۧۦۨۨ۫ۡ۬"
            goto L_0x0007
        L_0x0087:
            java.lang.String r0 = "ۙ۬۠۫۠ۥۚ۟ۨۘ۬ۦۙۨۜۡۘ۠ۧۜۘۖ۟ۙۙۢۘۛۘ"
            goto L_0x0007
        L_0x008b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.youbasha.backuprestore.BackupRestoreCopyingTask.a(java.io.File):void");
    }

    public final void c() {
        String str = this.f949k;
        try {
            File file = new File(str + "/shared_prefs/io.fabric.sdk.android:fabric:io.fabric.sdk.android.i.xml");
            String str2 = "ۦۛۥۗۥۧۘۗۙۜ۟ۖۖۖۖۧ۬ۢۛ۬ۤۜۘ";
            while (true) {
                switch (str2.hashCode() ^ -1085637645) {
                    case -1758298640:
                        str2 = "ۛ۬ۘۘۤ۫ۨۜۦ۫ۙۥ۠۟۠۠";
                        continue;
                    case -129349585:
                        file.delete();
                        break;
                    case 909271349:
                        if (!file.exists()) {
                            str2 = "ۧۙۚ۟۫ۖۘۡۧۦۘۚۤۥۢۚۢۧۜ۫۫ۤۦۘۗۦۖۘ";
                            break;
                        } else {
                            str2 = "ۚۡۤۚۗۤۘۛ۫ۘۤۚۢۘۜ۬ۥۥۘۨۚ۠ۜۥۘ";
                            continue;
                        }
                    case 1273069030:
                        break;
                    default:
                        continue;
                }
            }
            File file2 = new File(str + "/shared_prefs/io.fabric.sdk.android:fabric:io.fabric.sdk.android.Onboarding.xml");
            String str3 = "۟ۜۡۘۧ۫ۨۘۡ۫ۨۗ۫۠ۨۘۨۤۦۤ";
            while (true) {
                switch (str3.hashCode() ^ 603096771) {
                    case -1352704861:
                        break;
                    case 495054418:
                        file2.delete();
                        break;
                    case 543621283:
                        if (file2.exists()) {
                            str3 = "ۥۧۦۧۛۘۧ۫ۜۤۤۖۢۛۥۘۨ۫۫ۨۜۦۘۜۨۘ";
                            break;
                        } else {
                            str3 = "۫ۖۡۛۜۧۘۗۙۘۧۡۚۖ۬ۨ";
                            continue;
                        }
                    case 949260363:
                        str3 = "ۨۚۜۙۦ۠ۜۖۦۛۖۘۥۚ۬ۡۗۤ";
                        continue;
                    default:
                        continue;
                }
            }
            File file3 = new File(str + "/files/.Fabric");
            String str4 = "ۙۢۚۦۥۧۛ۫ۜۘ۠ۜۧۘۢۦۨۘ";
            while (true) {
                switch (str4.hashCode() ^ -1138302759) {
                    case -1619288594:
                        b(file3);
                        return;
                    case -1054356643:
                        if (!file3.isDirectory()) {
                            str4 = "ۦۙ۬ۘ۟ۦۤۨۚ۠ۨۖ۟ۛۥۘۨۘۙۤۧ";
                            break;
                        } else {
                            str4 = "ۖۚۖۤۚۨۘۨۦۘۘۡۖۘۦۡۜۤۢۢ";
                            break;
                        }
                    case -307071959:
                        str4 = "ۜۜۜۘۦۤۘۘۧۥ۬ۧۛۨۘ۠ۗۙۚۨۛۤۚۧۥ۫۟ۤۤۢ";
                        break;
                    case -200287930:
                        return;
                }
            }
        } catch (Exception e2) {
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0035 A[Catch:{ Exception -> 0x003b }] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00ba A[Catch:{ Exception -> 0x003b }] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00c4 A[SYNTHETIC, Splitter:B:51:0x00c4] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0036 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void copyDirectory(java.io.File r8, java.io.File r9) {
        /*
            r7 = this;
            r0 = 0
            r8.getPath()     // Catch:{ Exception -> 0x003b }
            boolean r2 = r8.isDirectory()     // Catch:{ Exception -> 0x003b }
            r3 = -1336635045(0xffffffffb054915b, float:-7.7331713E-10)
            java.lang.String r1 = "ۤۘۥۘ۫ۡۦۘ۬ۥۦۘۜ۟۫ۜۤۘۛۖۖۘ"
        L_0x000d:
            int r4 = r1.hashCode()     // Catch:{ Exception -> 0x003b }
            r4 = r4 ^ r3
            switch(r4) {
                case -604258684: goto L_0x0040;
                case -252654672: goto L_0x0048;
                case -30154761: goto L_0x0045;
                case 1543042248: goto L_0x0016;
                default: goto L_0x0015;
            }     // Catch:{ Exception -> 0x003b }
        L_0x0015:
            goto L_0x000d
        L_0x0016:
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ Exception -> 0x003b }
            r1.<init>(r8)     // Catch:{ Exception -> 0x003b }
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x003b }
            r2.<init>(r9)     // Catch:{ Exception -> 0x003b }
            r0 = 1024(0x400, float:1.435E-42)
            byte[] r3 = new byte[r0]     // Catch:{ Exception -> 0x003b }
        L_0x0024:
            int r4 = r1.read(r3)     // Catch:{ Exception -> 0x003b }
            r5 = 1585472562(0x5e806432, float:4.6257873E18)
            java.lang.String r0 = "ۦۖۖۖۡۛۦ۫ۦۘۛ۬۫ۧ۬۫۫ۙۡۘۙۘۘ"
        L_0x002d:
            int r6 = r0.hashCode()     // Catch:{ Exception -> 0x003b }
            r6 = r6 ^ r5
            switch(r6) {
                case -1935896723: goto L_0x0036;
                case -1266874464: goto L_0x00c0;
                case -527660577: goto L_0x00c4;
                case 1055566357: goto L_0x00ba;
                default: goto L_0x0035;
            }     // Catch:{ Exception -> 0x003b }
        L_0x0035:
            goto L_0x002d
        L_0x0036:
            r0 = 0
            r2.write(r3, r0, r4)     // Catch:{ Exception -> 0x003b }
            goto L_0x0024
        L_0x003b:
            r0 = move-exception
        L_0x003c:
            return
        L_0x003d:
            java.lang.String r1 = "۬ۢۥۘۘ۫ۨ۬ۚۢۦ۫۬ۤ۬ۛۧ"
            goto L_0x000d
        L_0x0040:
            if (r2 == 0) goto L_0x003d
            java.lang.String r1 = "ۧۖۛۤۘۜۚ۫ۜۛۜ۫ۙۥۡۘ۠ۤۢۜۘۜۢۖۚۥ۫"
            goto L_0x000d
        L_0x0045:
            java.lang.String r1 = "ۢۘۥۘۥۙۛۘۧۘۡۡۡۘۘۡۖ"
            goto L_0x000d
        L_0x0048:
            r2 = 1247690720(0x4a5e3fe0, float:3641336.0)
            java.lang.String r1 = "۫ۨ۟ۖۧۙۜۙۤ۫۬ۜ۬ۙۘۛۥۤۨۢ"
        L_0x004d:
            int r3 = r1.hashCode()     // Catch:{ Exception -> 0x003b }
            r3 = r3 ^ r2
            switch(r3) {
                case -80121971: goto L_0x0062;
                case 242587406: goto L_0x0065;
                case 1295822947: goto L_0x0056;
                case 1945769759: goto L_0x0068;
                default: goto L_0x0055;
            }     // Catch:{ Exception -> 0x003b }
        L_0x0055:
            goto L_0x004d
        L_0x0056:
            boolean r1 = r9.exists()     // Catch:{ Exception -> 0x003b }
            if (r1 == 0) goto L_0x005f
            java.lang.String r1 = "۟ۙ۬ۘۛ۫۬ۗۛۘۤۡۘ۬ۥۗ۠۬ۤۧۤۤۢۜۗ"
            goto L_0x004d
        L_0x005f:
            java.lang.String r1 = "ۡۗۛۧۖۖۘۖۡۘۘۤ۫ۙ۫ۙۘۘ"
            goto L_0x004d
        L_0x0062:
            java.lang.String r1 = "ۛ۠ۜۘۧۧ۟ۤۨۘۘۤۚۚۖ۬ۜۖۦۘۖۡۢ۠ۜۜۧۘ۬"
            goto L_0x004d
        L_0x0065:
            b(r9)     // Catch:{ Exception -> 0x003b }
        L_0x0068:
            r9.mkdir()     // Catch:{ Exception -> 0x003b }
            java.lang.String[] r2 = r8.list()     // Catch:{ Exception -> 0x003b }
            r3 = -550477160(0xffffffffdf306298, float:-1.2709888E19)
            java.lang.String r1 = "ۦۧۘۘۨۤ۫۫ۦۘۖۧۥۘۨۙۡ۫ۛۨ۬ۙۥۘ"
        L_0x0074:
            int r4 = r1.hashCode()     // Catch:{ Exception -> 0x003b }
            r4 = r4 ^ r3
            switch(r4) {
                case -2102723270: goto L_0x0085;
                case -442962767: goto L_0x0016;
                case 818428094: goto L_0x00df;
                case 1330829667: goto L_0x007d;
                default: goto L_0x007c;
            }     // Catch:{ Exception -> 0x003b }
        L_0x007c:
            goto L_0x0074
        L_0x007d:
            if (r2 == 0) goto L_0x0082
            java.lang.String r1 = "ۙۗ۬ۨۗۨۨۛ۟ۦۙۥۘ۫ۤۢۨ۫ۤۨ۬۫۬ۡ۟"
            goto L_0x0074
        L_0x0082:
            java.lang.String r1 = "ۗۦۦۘۚۤ۫ۙۧۜۘ۟ۥۢۥ۫ۥ۫ۧۜۘۢۤۖۘ"
            goto L_0x0074
        L_0x0085:
            java.lang.String r1 = "ۦۤ۟۟ۜ۫ۘۥۥۜۙۧۦۙۘ"
            goto L_0x0074
        L_0x0088:
            java.io.File r0 = new java.io.File     // Catch:{ Exception -> 0x003b }
            r3 = r2[r1]     // Catch:{ Exception -> 0x003b }
            r0.<init>(r8, r3)     // Catch:{ Exception -> 0x003b }
            java.io.File r3 = new java.io.File     // Catch:{ Exception -> 0x003b }
            r4 = r2[r1]     // Catch:{ Exception -> 0x003b }
            r3.<init>(r9, r4)     // Catch:{ Exception -> 0x003b }
            r7.copyDirectory(r0, r3)     // Catch:{ Exception -> 0x003b }
            int r0 = r1 + 1
            r1 = r0
        L_0x009c:
            r3 = -192862169(0xfffffffff4812827, float:-8.186288E31)
            java.lang.String r0 = "۠۟ۖۘۗۦۤۚۨۡۥۡۧۘۨۢۧ۟ۜۚۙۗ"
        L_0x00a1:
            int r4 = r0.hashCode()     // Catch:{ Exception -> 0x003b }
            r4 = r4 ^ r3
            switch(r4) {
                case -1373232974: goto L_0x003c;
                case 31551140: goto L_0x0088;
                case 1182538766: goto L_0x00aa;
                case 1537924573: goto L_0x00b0;
                default: goto L_0x00a9;
            }     // Catch:{ Exception -> 0x003b }
        L_0x00a9:
            goto L_0x00a1
        L_0x00aa:
            java.lang.String r0 = "ۗ۟۠۫۫ۤۘ۫۠ۖۖ۟ۧ۬ۦ"
            goto L_0x00a1
        L_0x00ad:
            java.lang.String r0 = "ۚۥۤ۠ۢ۫ۧۙۦۡ۫ۜۘۙۥ۬ۖۛ۠ۦۗۡۘۗۜۗۗۙۜ"
            goto L_0x00a1
        L_0x00b0:
            int r0 = r2.length     // Catch:{ Exception -> 0x003b }
            if (r1 >= r0) goto L_0x00ad
            java.lang.String r0 = "ۘ۫ۦ۟ۥۤ۫ۨۖۜۤۥۥۘۘۤۗ"
            goto L_0x00a1
        L_0x00b6:
            java.lang.String r0 = "ۦۛۘۘۢۘۙۖۡۡۘۙۨ۬۠ۘۢۜ"
            goto L_0x002d
        L_0x00ba:
            if (r4 > 0) goto L_0x00b6
            java.lang.String r0 = "ۛۡۘۘ۬ۖۛۘۧۧۡ۟ۜۘۗۚۜ"
            goto L_0x002d
        L_0x00c0:
            java.lang.String r0 = "ۛ۬۠ۡۨ۠ۦۡۨ۠۠ۜ۠۠ۦ"
            goto L_0x002d
        L_0x00c4:
            r1.close()     // Catch:{ Exception -> 0x003b }
            r2.close()     // Catch:{ Exception -> 0x003b }
            int r0 = r7.f943e     // Catch:{ Exception -> 0x003b }
            int r0 = r0 + 1
            r7.f943e = r0     // Catch:{ Exception -> 0x003b }
            r1 = 1
            java.lang.Integer[] r1 = new java.lang.Integer[r1]     // Catch:{ Exception -> 0x003b }
            r2 = 0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x003b }
            r1[r2] = r0     // Catch:{ Exception -> 0x003b }
            r7.publishProgress(r1)     // Catch:{ Exception -> 0x003b }
            goto L_0x003c
        L_0x00df:
            r1 = r0
            goto L_0x009c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.youbasha.backuprestore.BackupRestoreCopyingTask.copyDirectory(java.io.File, java.io.File):void");
    }

    public Integer doInBackground(File... fileArr) {
        try {
            boolean z2 = this.f944f;
            File file = this.f948j;
            File file2 = this.f947i;
            String str = "ۦۘۗۤۙۗۦۦۚۧۖۧۘ۫ۗۜۤۚۢۘۨ۬ۖۤۨۘ";
            while (true) {
                switch (str.hashCode() ^ -1232122897) {
                    case -2058857938:
                        if (z2) {
                            str = "ۦۨۗ۟ۧۨۘۢۥۜۢۧۢ۠ۨۥۘ";
                            break;
                        } else {
                            str = "ۦۧۡۛۙۨۚۚۤ۫۫ۘۘ۠ۘۘۜۗۦۦۥۗۡۚۙ";
                            continue;
                        }
                    case -2057368670:
                        File file3 = new File(file2, Constants.f953c);
                        String str2 = "ۥۡۜۘ۠ۘۡۥ۬ۨۘۗۨۧ۟۬ۥۘۧۤۦۜ۠۠ۢۨۙ";
                        while (true) {
                            switch (str2.hashCode() ^ -745849141) {
                                case -1923271275:
                                    copyDirectory(file2, file);
                                    break;
                                case -1490214294:
                                    ZipManager.unzip(file3.getAbsolutePath(), file.getAbsolutePath());
                                    break;
                                case 58497105:
                                    str2 = "ۚ۠ۨۘ۬ۜۖۘۗۛۡۤۚ۟ۙۧۗ۠ۥۚۜۤۨۤۜۜۘۨۙۜۘ";
                                    continue;
                                case 803267769:
                                    if (file3.exists()) {
                                        str2 = "ۖۚۖۘۨۦۤ۟ۦۨۥۢۦ۠۟ۥۘ";
                                        break;
                                    } else {
                                        str2 = "۫ۢۥۘۡۖ۠ۙۗۡۦۢۢۙۡۦۘ";
                                        continue;
                                    }
                                default:
                                    continue;
                            }
                        }
                    case -1582043858:
                        ArrayList arrayList = new ArrayList();
                        arrayList.add("lib");
                        arrayList.add("emojipacks");
                        ZipManager.zipFolder(file, file2, Constants.f953c, arrayList);
                        break;
                    case 80075587:
                        str = "ۡۢۖۗۤ۟ۨۛۧۥ۬۠ۚۨۧۘ";
                        continue;
                    default:
                        continue;
                }
            }
            this.f941c = true;
            return null;
        } catch (Exception e2) {
            this.f941c = false;
            return null;
        }
    }

    public /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        String str = "ۤ۫ۖ۫ۘۖۘۗۘۡۖۢۛۥ۬ۤۦ۟ۥۘ";
        while (true) {
            switch ((str.hashCode() ^ 497) ^ 929273576) {
                case -2060097865:
                    str = "ۤۧۤ۟ۨۗ۬ۦۡۘ۬ۘۘۡۘۡۘۗۥۗۖ۟ۜۨۘ";
                    break;
                case -478680145:
                    return doInBackground((File[]) objArr);
                case 482684037:
                    str = "۠ۘۡۘۨۗ۬ۚۙۗۚ۠ۘۘۨ۠ۚ۠ۨۨۡۢۦۧۥۜۙ۬ۨ";
                    break;
            }
        }
    }

    public String getString(String str) {
        Context context = null;
        String str2 = "ۦۡ۠۠ۦۡۢۗۧۦ۫ۘۢ۬ۙۧۖۦۘۨۘۗ";
        while (true) {
            switch ((str2.hashCode() ^ 936) ^ 786857205) {
                case -1211512226:
                    context = this.f939a;
                    str2 = "ۤۥۢ۫ۧۜۘ۠ۦۖۥۘۧۘۖۖ۬ۘ۬۟";
                    break;
                case -956870157:
                    str2 = "ۧ۠۫ۡ۬ۥۘۦ۟ۖۜۖ۬ۡ۫ۦۘۥۡۜۧ۟ۧ۫۟ۙ";
                    break;
                case -147242041:
                    return context.getString(context.getResources().getIdentifier(str, "string", context.getPackageName()));
                case 629573192:
                    str2 = "ۙۦۦۛ۫۠۟۠ۘۥۨۘۥۦۦۖۖۖۗۗۡۘۡۧ";
                    break;
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x009a, code lost:
        r0 = "ۖ۠۠ۡۛ۬۟ۢۨۚۡۘۡ۠ۨ";
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCancelled() {
        /*
            r7 = this;
            r2 = 0
            java.lang.String r0 = "ۜ۠ۜۧۖۜ۫۠۬ۥ۬ۖۙۙ۠ۤۙۜۖۖۘۡۨۘ"
            r1 = r2
            r3 = r2
            r4 = r2
        L_0x0006:
            int r2 = r0.hashCode()
            r5 = 397(0x18d, float:5.56E-43)
            r6 = 1169193350(0x45b07986, float:5647.1904)
            r2 = r2 ^ r5
            r2 = r2 ^ r6
            switch(r2) {
                case -1776538145: goto L_0x00b1;
                case -1522418903: goto L_0x0049;
                case -1242908019: goto L_0x0051;
                case -541883702: goto L_0x00bc;
                case -291289398: goto L_0x006f;
                case -252873883: goto L_0x006a;
                case -129663308: goto L_0x005d;
                case 268028736: goto L_0x0036;
                case 480309702: goto L_0x0015;
                case 759011875: goto L_0x008c;
                case 1267466330: goto L_0x0018;
                case 1540624989: goto L_0x0041;
                default: goto L_0x0014;
            }
        L_0x0014:
            goto L_0x0006
        L_0x0015:
            java.lang.String r0 = "ۨۚۜ۬ۙۖۥۥۖۘۧ۟ۢ۟ۦۡ"
            goto L_0x0006
        L_0x0018:
            r2 = 835809714(0x31d171b2, float:6.0956262E-9)
            java.lang.String r0 = "ۦۦۛۧۘۜۘۧۘۚ۟۬ۢ۫"
        L_0x001d:
            int r5 = r0.hashCode()
            r5 = r5 ^ r2
            switch(r5) {
                case -1584734266: goto L_0x00b8;
                case -583493819: goto L_0x002c;
                case -575723941: goto L_0x0026;
                case -383665552: goto L_0x0033;
                default: goto L_0x0025;
            }
        L_0x0025:
            goto L_0x001d
        L_0x0026:
            java.lang.String r0 = "ۚۧۦ۫ۢۨۘۘ۫ۨۘ۟ۘۤۚۧۜۘۛۙۚ"
            goto L_0x0006
        L_0x0029:
            java.lang.String r0 = "۫ۘۖۘۜۘۥۘۨۙ۫۟ۙۜۘ۫۟ۨ۠ۢۨۘ"
            goto L_0x001d
        L_0x002c:
            boolean r0 = r7.f942d
            if (r0 != 0) goto L_0x0029
            java.lang.String r0 = "ۚ۬ۦۧۤۤۧۡۦۘۘ۬ۘۘۙ۫ۙ۠۠ۖ"
            goto L_0x001d
        L_0x0033:
            java.lang.String r0 = "ۥۤۛۥۘۨۘۜۗۧۦ۟ۦ۫ۙ۬ۗ۟ۡۘۚۧۧۧۚۙ"
            goto L_0x001d
        L_0x0036:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r0 = "yo"
            r2.<init>(r0)
            java.lang.String r0 = "ۥۢۜۡ۬ۖۘۘ۠ۥۡ۬ۨۚۧۨۡۡۥ"
            r4 = r2
            goto L_0x0006
        L_0x0041:
            java.lang.String r0 = r7.f946h
            r4.append(r0)
            java.lang.String r0 = "۬۠ۘۘۥۚۗۡۖۚۜۙۢ۠۠ۤۥ۬ۦۛۡۥۘ"
            goto L_0x0006
        L_0x0049:
            java.lang.String r0 = "Fail"
            r4.append(r0)
            java.lang.String r0 = "۬ۦۘۤۘۧ۟ۦۨۘۢۥ۬ۛ۬ۜۘ۬ۨ"
            goto L_0x0006
        L_0x0051:
            java.lang.String r0 = r4.toString()
            java.lang.String r2 = r7.getString(r0)
            java.lang.String r0 = "ۘۤۛۧۛ۟ۨۦۥۜۛۡۤۨۥۘۦۤۖۜ۟۠ۨۡۘۦ۟ۤ"
            r3 = r2
            goto L_0x0006
        L_0x005d:
            android.content.Context r0 = r7.f939a
            r2 = 0
            android.widget.Toast r0 = android.widget.Toast.makeText(r0, r3, r2)
            r0.show()
            java.lang.String r0 = "ۤۤۧۛۨۨ۫۟ۘۘۡۨۨۖۗۗۡۜۦ"
            goto L_0x0006
        L_0x006a:
            android.app.ProgressDialog r1 = r7.f940b
            java.lang.String r0 = "۬۟ۘۗۡۖۘۖۥۙۢۙۚۡۨۘۛ۟ۘۘۜۨۘ"
            goto L_0x0006
        L_0x006f:
            r2 = 125693181(0x77decfd, float:1.9103249E-34)
            java.lang.String r0 = "ۥۛۛ۫ۙۚ۫ۘۤۛۢۘۘۤۜۗۘ۠ۨۘ"
        L_0x0074:
            int r5 = r0.hashCode()
            r5 = r5 ^ r2
            switch(r5) {
                case -1457000947: goto L_0x0088;
                case 249690461: goto L_0x007d;
                case 874360463: goto L_0x009a;
                case 1711662818: goto L_0x0085;
                default: goto L_0x007c;
            }
        L_0x007c:
            goto L_0x0074
        L_0x007d:
            if (r1 == 0) goto L_0x0082
            java.lang.String r0 = "ۢۧۘۘۨۜۛۦۙۜ۬ۘۦۘۜۧۛۙ۬ۡ۠ۨۥۚۦۥ"
            goto L_0x0074
        L_0x0082:
            java.lang.String r0 = "ۤ۟ۖۘ۬ۤۨۘۛ۫ۚ۠۫ۘۧۡۗۜۘ۫ۧۚ۟"
            goto L_0x0074
        L_0x0085:
            java.lang.String r0 = "ۚۡۧۘۡۙۤۤۨۢۖ۠ۦۘۧ۬ۛ"
            goto L_0x0074
        L_0x0088:
            java.lang.String r0 = "ۜۥۤ۫ۜۖۜۧۖۢۚ۠ۜۨۨۖۡۡ۫۫ۘ۟ۨۘۨ۟ۗ"
            goto L_0x0006
        L_0x008c:
            r2 = 1529234966(0x5b264616, float:4.6801906E16)
            java.lang.String r0 = "ۘ۬ۧ۬ۧ۬ۧۚ۠ۛۨۢ۫۠ۡۘۖۘ۫"
        L_0x0091:
            int r5 = r0.hashCode()
            r5 = r5 ^ r2
            switch(r5) {
                case -279894120: goto L_0x00ad;
                case 193375041: goto L_0x00a1;
                case 556398925: goto L_0x00aa;
                case 1329024267: goto L_0x009a;
                default: goto L_0x0099;
            }
        L_0x0099:
            goto L_0x0091
        L_0x009a:
            java.lang.String r0 = "ۖ۠۠ۡۛ۬۟ۢۨۚۡۘۡ۠ۨ"
            goto L_0x0006
        L_0x009e:
            java.lang.String r0 = "ۜۢۜۘۢۛۘۛۚۥۤۜۨۘ۟ۛ۠ۦ۠ۦۖۢۢ"
            goto L_0x0091
        L_0x00a1:
            boolean r0 = r1.isShowing()
            if (r0 == 0) goto L_0x009e
            java.lang.String r0 = "ۘۚۥۘ۠ۚۜۘ۟ۤۖ۬ۤ۟ۤ۫ۥۘ"
            goto L_0x0091
        L_0x00aa:
            java.lang.String r0 = "ۡۖ۟۠ۚۡ۠۠ۘۘۦۖ۫ۙۧۙۗۡۖۦ۬ۙۧۖۦۡۚۦۘ"
            goto L_0x0091
        L_0x00ad:
            java.lang.String r0 = "۫۫ۜۘۛۡۜۥۛۦۘۜۨۖۥ۬ۧۚۧۡۥۧۨۘۘۜۖۘ"
            goto L_0x0006
        L_0x00b1:
            r1.dismiss()
            java.lang.String r0 = "ۖ۠۠ۡۛ۬۟ۢۨۚۡۘۡ۠ۨ"
            goto L_0x0006
        L_0x00b8:
            java.lang.String r0 = "ۤۤۧۛۨۨ۫۟ۘۘۡۨۨۖۗۗۡۜۦ"
            goto L_0x0006
        L_0x00bc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.youbasha.backuprestore.BackupRestoreCopyingTask.onCancelled():void");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00a6, code lost:
        r1.append(r0);
        android.widget.Toast.makeText(r3, getString(r1.toString()), 0).show();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onPostExecute(java.lang.Integer r8) {
        /*
            r7 = this;
            android.app.ProgressDialog r1 = r7.f940b
            r2 = 1779461515(0x6a106d8b, float:4.3650655E25)
            java.lang.String r0 = "ۘۥۧۘ۠۫ۖۘۚ۠ۦۘۡۛۘۘۤۨۡۘۥۖۖۘۧۖۤۘ۬۟۫ۗ۫"
        L_0x0007:
            int r3 = r0.hashCode()
            r3 = r3 ^ r2
            switch(r3) {
                case 276046804: goto L_0x0010;
                case 910749876: goto L_0x001e;
                case 937503794: goto L_0x001b;
                case 1758542357: goto L_0x0016;
                default: goto L_0x000f;
            }
        L_0x000f:
            goto L_0x0007
        L_0x0010:
            java.lang.String r0 = "ۨۢۦۘۘۦ۬ۖۢۨۖۦ۬ۚ۠ۧۖ۟ۨۘ۟ۜۦۘ۬۫ۥ۫۟ۜ"
            goto L_0x0007
        L_0x0013:
            java.lang.String r0 = "ۜۡ۟ۡۨۘۛۦۨۘۜۙ۟ۥ۬ۢۗۢۘ۟ۦۖۘ۠ۢۦۘ"
            goto L_0x0007
        L_0x0016:
            if (r1 == 0) goto L_0x0013
            java.lang.String r0 = "۫ۡۧ۠ۦۨۡۖۨ۠۬ۧۖ۬ۜۨۘۖۘ"
            goto L_0x0007
        L_0x001b:
            r1.dismiss()
        L_0x001e:
            boolean r1 = r7.f941c
            java.lang.String r2 = r7.f946h
            android.content.Context r3 = r7.f939a
            boolean r4 = r7.f942d
            r5 = -673532900(0xffffffffd7dab41c, float:-4.80934197E14)
            java.lang.String r0 = "ۡۡۨ۫ۛۜۘۦۖۥۘۚۦۨ۠ۥۨۖۗۙۚۦۘ"
        L_0x002b:
            int r6 = r0.hashCode()
            r6 = r6 ^ r5
            switch(r6) {
                case -1795358258: goto L_0x004a;
                case -451844176: goto L_0x0052;
                case 955361472: goto L_0x004f;
                case 1134535823: goto L_0x0034;
                default: goto L_0x0033;
            }
        L_0x0033:
            goto L_0x002b
        L_0x0034:
            r1 = 444022463(0x1a773ebf, float:5.112909E-23)
            java.lang.String r0 = "ۗۢۙۛۥۤۖۦۦۘۡ۠۠ۜۜۦۥۖۥۘ"
        L_0x0039:
            int r5 = r0.hashCode()
            r5 = r5 ^ r1
            switch(r5) {
                case -2126671224: goto L_0x0042;
                case 477691138: goto L_0x00ce;
                case 918716176: goto L_0x00d2;
                case 1681763321: goto L_0x00b9;
                default: goto L_0x0041;
            }
        L_0x0041:
            goto L_0x0039
        L_0x0042:
            if (r4 != 0) goto L_0x00ca
            java.lang.String r0 = "ۢۡۢۛۘۘ۟ۛۛۚۖۘۘۥۢۛۡ۬ۚ۫ۦ۬"
            goto L_0x0039
        L_0x0047:
            java.lang.String r0 = "ۥ۟ۤۛ۠ۡۥ۫ۦۘ۠ۗ۠ۨۡۚ۫۫۫ۚۗۙ"
            goto L_0x002b
        L_0x004a:
            if (r1 == 0) goto L_0x0047
            java.lang.String r0 = "ۙۖۜۦ۬ۨۨۛۥۧۧۦۢ۬ۜۘۥۙۘۘۡۘۤ"
            goto L_0x002b
        L_0x004f:
            java.lang.String r0 = "۫ۨۘۘۤۘۧۢۚۗ۟۬ۦۘۚ۫ۥۘ"
            goto L_0x002b
        L_0x0052:
            java.io.File r1 = new java.io.File     // Catch:{ Exception -> 0x008d }
            java.lang.String r0 = r7.f950l     // Catch:{ Exception -> 0x008d }
            java.lang.String r5 = ".nomedia"
            r1.<init>(r0, r5)     // Catch:{ Exception -> 0x008d }
            r5 = -1951584092(0xffffffff8bad30a4, float:-6.671036E-32)
            java.lang.String r0 = "ۡۖۜۧۗ۟۟ۥۜۖۘۜ۟ۦۘۡ۟ۘ"
        L_0x0060:
            int r6 = r0.hashCode()     // Catch:{ Exception -> 0x008d }
            r6 = r6 ^ r5
            switch(r6) {
                case -2081046539: goto L_0x0089;
                case -553847663: goto L_0x007d;
                case 162940182: goto L_0x0069;
                case 453125564: goto L_0x0086;
                default: goto L_0x0068;
            }
        L_0x0068:
            goto L_0x0060
        L_0x0069:
            r1 = 854355974(0x32ec7006, float:2.7524958E-8)
            java.lang.String r0 = "ۥۘۧۜۧۡ۠۫ۨ۫ۘۘۙۢۙۙۢۧۚ۬ۙ"
        L_0x006e:
            int r5 = r0.hashCode()
            r5 = r5 ^ r1
            switch(r5) {
                case -1456606417: goto L_0x0095;
                case -1189659981: goto L_0x009a;
                case -827634611: goto L_0x0077;
                case 1379818067: goto L_0x00b9;
                default: goto L_0x0076;
            }
        L_0x0076:
            goto L_0x006e
        L_0x0077:
            java.lang.String r0 = "ۚ۬ۖۘO۠ۥۡۘۗۡۜ۬ۗۖۘۧۥۜۤۛۡۛۘۦ"
            goto L_0x006e
        L_0x007a:
            java.lang.String r0 = "ۚۚۖۨۖۛۜۗۢۘۜۥۘۙۚ۬ۗ۠۟"
            goto L_0x0060
        L_0x007d:
            boolean r0 = r1.exists()     // Catch:{ Exception -> 0x008d }
            if (r0 != 0) goto L_0x007a
            java.lang.String r0 = "ۡ۫ۢۗۦۖۘۧۡۤۗۧۙۦۢۜ"
            goto L_0x0060
        L_0x0086:
            java.lang.String r0 = "ۙۜۚۤۚۤۧۜۢۜۜۥۖ۬ۡۘۗۜۦ۬۟ۗ۫۠ۥ"
            goto L_0x0060
        L_0x0089:
            r1.createNewFile()     // Catch:{ Exception -> 0x008d }
            goto L_0x0069
        L_0x008d:
            r0 = move-exception
            r0.printStackTrace()
            goto L_0x0069
        L_0x0092:
            java.lang.String r0 = "۟ۖۜۘۚۦۜ۟ۖۦۦۜۙۡۧۜۘ۠ۢ"
            goto L_0x006e
        L_0x0095:
            if (r4 != 0) goto L_0x0092
            java.lang.String r0 = "ۚۨۘۙ۬۬ۖۘۖۗ۟۫ۨۚۨۘۤ۠ۗۦ"
            goto L_0x006e
        L_0x009a:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r0 = "yo"
            r1.<init>(r0)
            r1.append(r2)
            java.lang.String r0 = "Done"
        L_0x00a6:
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.String r0 = r7.getString(r0)
            r1 = 0
            android.widget.Toast r0 = android.widget.Toast.makeText(r3, r0, r1)
            r0.show()
        L_0x00b9:
            r1 = -843006538(0xffffffffcdc0bdb6, float:-4.04207296E8)
            java.lang.String r0 = "ۖۙۡۘ۬۬۬ۛ۫ۗۥۚۦۘ۬۟ۥۗ۟ۤۡ۟"
        L_0x00be:
            int r2 = r0.hashCode()
            r2 = r2 ^ r1
            switch(r2) {
                case 106473362: goto L_0x00e2;
                case 124019967: goto L_0x00ec;
                case 720576889: goto L_0x00c7;
                case 1590608434: goto L_0x00e9;
                default: goto L_0x00c6;
            }
        L_0x00c6:
            goto L_0x00be
        L_0x00c7:
            java.lang.String r0 = "ۢ۬۟ۘۨۡۘ۬ۗۨۙۙۘۘۘۡۘۘ۫ۥۚۧۧۚ"
            goto L_0x00be
        L_0x00ca:
            java.lang.String r0 = "ۥۡۖۘۤ۟ۧۤ۫ۨۘۜۚۨۙۙۥۤۡ۫ۧۗۤ"
            goto L_0x0039
        L_0x00ce:
            java.lang.String r0 = "ۘۦۖۘۢۢۘۨۡۚۤۨۤۖۧۡۘ"
            goto L_0x0039
        L_0x00d2:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r0 = "yo"
            r1.<init>(r0)
            r1.append(r2)
            java.lang.String r0 = "Fail"
            goto L_0x00a6
        L_0x00df:
            java.lang.String r0 = "ۧ۠۠۫ۡۘۨ۫۫۟۠ۗ۫ۘ۟"
            goto L_0x00be
        L_0x00e2:
            boolean r0 = r7.f944f
            if (r0 != 0) goto L_0x00df
            java.lang.String r0 = "ۨۙۢ۟ۨۛ۟۬ۜۦۧۦۡۧۦۘ"
            goto L_0x00be
        L_0x00e9:
            com.obwhatsapp.yo.yo.rebootYo()
        L_0x00ec:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.youbasha.backuprestore.BackupRestoreCopyingTask.onPostExecute(java.lang.Integer):void");
    }

    public /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        String str = "ۗۚ۬ۥۜۜۘ۫ۗۜۘ۬ۘۜۘ۬۟ۨۙۤۥۖ۬ۘ";
        while (true) {
            switch ((str.hashCode() ^ 461) ^ 2024839365) {
                case -1919265761:
                    return;
                case 106766170:
                    onPostExecute((Integer) obj);
                    str = "۟۟ۜۘۜۛ۟ۦۙۗۤۖۜۘۢ۫ۘۘ";
                    break;
                case 459681511:
                    str = "ۡۚ۬ۧ۠ۤۦۨۘۡۥ۠ۡۙۗۡۜ۬ۦۦۦۦۦۜۘ";
                    break;
                case 1559088665:
                    str = "ۜۨۜۛ۠ۢۗۗۢۤۨۨ۠ۨۦۤۚۖۘۥۖۚۘۥ۬ۜۨۘ";
                    break;
            }
        }
    }

    public void onPreExecute() {
        try {
            c();
            a(this.f947i);
            boolean z2 = this.f942d;
            String str = "ۚ۫ۡۘۤۛ۫ۛ۫ۦۙۢۨۘۚۚۧۙۛۘۜۗۘۦۡۖ";
            while (true) {
                switch (str.hashCode() ^ 596176281) {
                    case -1484626922:
                        return;
                    case -450024609:
                        str = "۟ۡۧ۫ۧۙۖۖ۠ۨۥۛۛ۬ۨۢۖۜ";
                        break;
                    case 248519486:
                        ProgressDialog progressDialog = this.f940b;
                        progressDialog.setMax(this.f945g);
                        progressDialog.show();
                        return;
                    case 1796993001:
                        if (z2) {
                            str = "ۢۛ۬ۢۖۡۘۙۦۙ۟ۖۜ۟۠ۧ";
                            break;
                        } else {
                            str = "ۖ۬ۘۥۚۙۧۜۥۙ۟ۜۘ۬ۧۚۤۛ";
                            break;
                        }
                }
            }
        } catch (Exception e2) {
            cancel(true);
        }
    }

    public void onProgressUpdate(Integer... numArr) {
        String str = "ۖ۟ۧ۠ۧۖۘۙۧۨۘ۬۠ۦۢۦۖ";
        while (true) {
            switch ((str.hashCode() ^ 141) ^ 162180092) {
                case -968426322:
                    return;
                case 524264948:
                    str = "۠ۦۧۡۧۥۖۡۢۘۗۦۧ۫ۧ";
                    break;
                case 1407129700:
                    str = "ۥۖۘۚۖۘۘۙۤ۠ۜۜۧۘۙۗۛۧۢ";
                    break;
                case 2008178404:
                    this.f940b.setProgress(numArr[0].intValue());
                    str = "ۦۨۥۘ۫ۦۜۘۦۘۢۜۢۚۙ۫ۜۘۘۚ۫ۥۢۗ۟ۨۗ";
                    break;
            }
        }
    }

    public /* bridge */ /* synthetic */ void onProgressUpdate(Object[] objArr) {
        String str = "ۨۤۦۘۢ۬ۧۛۖ۬ۦ۟ۖۗۜۜ۫ۥۖۖ۟ۨۧۢۘۘ";
        while (true) {
            switch ((str.hashCode() ^ 610) ^ -1712839232) {
                case -153484135:
                    return;
                case 259550395:
                    onProgressUpdate((Integer[]) objArr);
                    str = "ۤۧ۫ۢۧۡۤ۬ۜ۬۬ۜۘۚۦۥۘ";
                    break;
                case 1359037912:
                    str = "ۡۥۚۖۛۨۘۦۤۦۘۘۜۜۨۧۘۧۜۨۘۥۦ۟";
                    break;
                case 1990895967:
                    str = "۟ۢ۫ۤ۬ۦۦۦۥ۫۫ۡ۬ۨۘ۫ۜ۬ۦۗۛ";
                    break;
            }
        }
    }
}
