package com.obwhatsapp.youbasha.backuprestore;

import a.a;
import android.content.Context;
import com.obwhatsapp.yo.r1;
import com.obwhatsapp.yo.yo;
import java.io.File;

public abstract class Controller {
    public static String a() {
        StringBuilder sb = null;
        String str = "۫ۥۖ۠ۧۜۘۢۗۢۘۙۨۘ۟ۥۥۘۥۡۨۘ۬۠ۡۘ";
        while (true) {
            switch ((str.hashCode() ^ 3) ^ 329430961) {
                case -1276409015:
                    sb.append(yo.pname);
                    str = "ۤ۠ۜۘۦۡۧۘۘۥۖۘ۠ۘۨۡۜ";
                    break;
                case -575137612:
                    return a.f(sb, Constants.FMWA_CURRENT_BACKUP_PATH, "\n\n— All future backups will be ZIP file stored in above location ^^");
                case 1041574442:
                    sb.append(" *Backup* Location will be moved to:\n");
                    str = "ۙۗۛۢۗۡۥ۠ۨۘ۫ۢۡۘۦۥۦۘۘ۫ۜۚۨۧ۬۟ۢ";
                    break;
                case 1377668637:
                    sb = new StringBuilder("⚠️ Information:\n\n— ");
                    str = "ۨ۫۠ۢۛۖۘ۫ۙۦۨۚۡۘ۠۠ۢۗۦۘۙۨۥۗۘ۫ۛۜ۠";
                    break;
            }
        }
    }

    public static boolean cleanFMWABackup() {
        try {
            File file = new File(Constants.FMWA_CURRENT_BACKUP_PATH, Constants.f953c);
            String str = "۠ۨۗۛ۫ۨۘ۟ۦ۫ۘ۠ۥ۠ۜۦۧ۬ۤ";
            while (true) {
                switch (str.hashCode() ^ 2097096436) {
                    case -1692071652:
                        return false;
                    case -1525780932:
                        boolean delete = file.delete();
                        String str2 = "ۤۧۤۤۥۙۖۙ۟ۜۨۛۜۚۛۚ۟ۨۥۨۛ";
                        while (true) {
                            switch (str2.hashCode() ^ -2108413166) {
                                case -1959657094:
                                    if (!delete) {
                                        str2 = "ۧۛۛۘۘۡۘۨۗۚۥۢۤۘۜۚ۫ۦۧۡ۬ۡۖۖ۟";
                                        break;
                                    } else {
                                        str2 = "ۗۡ۬ۚۤۜۘۤۘۜۜۨۦۧۥۤ۠ۗ۬ۘۡ";
                                        break;
                                    }
                                case -1612046741:
                                    return false;
                                case -1604269427:
                                    return true;
                                case 202048000:
                                    str2 = "۟ۤ۠ۤۤۗ۟ۤۘ۠ۘۡۘۥۜ۬ۤۤۨۘ";
                                    break;
                            }
                        }
                        break;
                    case 1600999779:
                        str = "ۨۧۤ۫ۙۦۘۧۚ۟ۘۡۗۨۡۧۖ۫ۦۘ۬ۖۘۚۧۘۘ۫ۚۤ";
                        break;
                    case 1604048681:
                        if (!file.exists()) {
                            str = "ۙۧ۟ۢۖ۫۟ۨۜۘۧ۬۬ۛۛۜۙۨۘۢۗ۬ۛۡۙۛۦۘ";
                            break;
                        } else {
                            str = "ۥۢۨ۠ۗۤ۟۠۫ۖۨۦۘۗۦۗۙ۟ۙ";
                            break;
                        }
                }
            }
        } catch (Exception e2) {
            return false;
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void cleanWACryptDBs() {
        /*
            java.io.File r0 = new java.io.File     // Catch:{ Exception -> 0x0035 }
            java.lang.String r1 = com.obwhatsapp.youbasha.backuprestore.Constants.WA_DATABASES_PATH     // Catch:{ Exception -> 0x0035 }
            r0.<init>(r1)     // Catch:{ Exception -> 0x0035 }
            com.obwhatsapp.yo.r1 r1 = new com.obwhatsapp.yo.r1     // Catch:{ Exception -> 0x0035 }
            r2 = 1
            r1.<init>(r2)     // Catch:{ Exception -> 0x0035 }
            java.io.File[] r2 = r0.listFiles(r1)     // Catch:{ Exception -> 0x0035 }
            int r3 = r2.length     // Catch:{ Exception -> 0x0035 }
            r0 = 0
        L_0x0013:
            r4 = 1930555295(0x7311ef9f, float:1.1562243E31)
            java.lang.String r1 = "ۙ۠۠۠۟ۡۘ۫ۜۗۜۤۦ۬ۧۛۙۗۤۨۦۡ"
        L_0x0018:
            int r5 = r1.hashCode()
            r5 = r5 ^ r4
            switch(r5) {
                case -852949175: goto L_0x0025;
                case 71241764: goto L_0x002d;
                case 349279283: goto L_0x002a;
                case 1456949292: goto L_0x0021;
                default: goto L_0x0020;
            }
        L_0x0020:
            goto L_0x0018
        L_0x0021:
            return
        L_0x0022:
            java.lang.String r1 = "۫ۗۗۚۤۚۥۤۧ۫ۡۘۗ۠ۖۜۡۘۘ"
            goto L_0x0018
        L_0x0025:
            if (r0 >= r3) goto L_0x0022
            java.lang.String r1 = "ۡۧۜ۟ۚ۬ۙۧۥۘۡۙۖۘۘۖۡۘۜۚۦۛ۬ۗ۬ۗ۠"
            goto L_0x0018
        L_0x002a:
            java.lang.String r1 = "۠ۢۖۘۨ۠ۜۚۡۘۘۢۨ۠ۥۚۥۘ"
            goto L_0x0018
        L_0x002d:
            r1 = r2[r0]     // Catch:{ Exception -> 0x0035 }
            r1.delete()     // Catch:{ Exception -> 0x0035 }
            int r0 = r0 + 1
            goto L_0x0013
        L_0x0035:
            r0 = move-exception
            goto L_0x0021
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.youbasha.backuprestore.Controller.cleanWACryptDBs():void");
    }

    public static int getFMWABackupSize() {
        File file = null;
        String str = "ۜۥۨۗۡۜۘ۬ۚۢۨۙ۠۬ۥۘ";
        int i2 = 0;
        int i3 = 0;
        while (true) {
            switch ((str.hashCode() ^ 791) ^ 1051180175) {
                case -1334648702:
                    String str2 = "۠۫ۗ۟ۚۖۘۜ۬ۛ۠ۢۨۘۢۚۡۘۧۢۦۘ۠ۜۤۘۤۦۘ";
                    while (true) {
                        switch (str2.hashCode() ^ -590173297) {
                            case -1510402311:
                                if (!file.exists()) {
                                    str2 = "ۦۤۡۡۤۙۜۧۖۘ۟ۜۢۘۖۖۧۚۨۡۡ۫";
                                    break;
                                } else {
                                    str2 = "۫ۨۧۘۤ۬ۡ۬ۛ۬ۗۧ۠۫ۢ۬ۚۧۖۘۘ۟ۖۥ۬ۘۘ";
                                    break;
                                }
                            case -985969729:
                                str2 = "ۚۗ۫ۚۚۘۧ۫۫ۚۖ۠ۤۙ۫ۖ۬ۜۖۗۗۛۥۦۘ";
                                break;
                            case 497485990:
                                str = "ۖۡۧۘۙ۫۬ۙۡۘۤۙۧ۫ۘۘ";
                                continue;
                            case 1088567156:
                                str = "ۘ۟ۚۖۨۛۡۢۢ۟ۤ۟۟ۜۢۢ۠ۛ";
                                continue;
                        }
                    }
                    break;
                case -1273499585:
                    i3 = (int) file.length();
                    str = "ۤۤۦ۫ۢۜۚۧۥۘۚۗۥۘۚۗۚۗ۬ۖۥۛۢ۬ۦۥۘۡۤۨۘ";
                    break;
                case -1210707807:
                    str = "ۨ۬ۦۘۚۛۥۤۘ۬۠ۚۦۤۨ۟ۙۙ۟ۖۤۖۥۙ۬";
                    i2 = i3;
                    break;
                case -1076028018:
                    str = "ۨ۠ۨۦۨۡۦۜۨۙۤۥۚ۠ۡ۬۫ۜۘ۟ۖۥۗۤ۠";
                    break;
                case 582384691:
                    str = "ۗ۠ۚۜ۬ۚۧۢۡۘۦۗۦۥۢۤ";
                    break;
                case 617990492:
                    return i2;
                case 913414885:
                    str = "ۨ۠ۨۦۨۡۦۜۨۙۤۥۚ۠ۡ۬۫ۜۘ۟ۖۥۗۤ۠";
                    i2 = 0;
                    break;
                case 1322153319:
                    file = new File(Constants.FMWA_CURRENT_BACKUP_PATH, Constants.f953c);
                    str = "ۤۨ۬ۜۤۖۘۡۧۢۛۤۨۘ۫ۦۗ۠ۡۨ۠۬";
                    break;
            }
        }
    }

    public static int getWACryptDBsSize() {
        int i2 = 0;
        try {
            File[] listFiles = new File(Constants.WA_DATABASES_PATH).listFiles(new r1(2));
            int length = listFiles.length;
            int i3 = 0;
            while (true) {
                int i4 = i2;
                String str = "۠ۖۨۘۖ۠ۙ۫۠ۚۢۥۗۦۖۙۘۧۙۛۘۦۘ";
                while (true) {
                    switch (str.hashCode() ^ -641088864) {
                        case -1643874858:
                            try {
                                i2 = (int) (listFiles[i3].length() + ((long) i4));
                                i3++;
                            } catch (Exception e2) {
                                return i4;
                            }
                        case -1292442469:
                            return i4;
                        case 1151581580:
                            str = "۬ۢۚ۠۬ۧ۠ۚۢ۫ۨ۠ۦۧۢۜۨۘۙ۟ۙ";
                            break;
                        case 1681133544:
                            if (i3 >= length) {
                                str = "ۘۦۡۘۚۥۦۘۧۤۚ۬ۜۥۥ۟ۥ۠ۨ۟۬۠ۚۗۖۚ";
                                break;
                            } else {
                                str = "ۛ۫ۜۘۡۡۘۦۡۦۧۥ۠ۘۙۧۜۥۘۤۙۥۘ۫۫۠";
                                break;
                            }
                    }
                }
            }
        } catch (Exception e3) {
            return 0;
        }
    }

    public static void makeBackup(Context context, boolean z2) {
        String str = "ۚ۟ۡۘ۬ۖۡ۟۟۫۟ۘۜۘۨۛۨۘۚۥۜۚۡ۟ۥۖۦۨۙۜۘ";
        File file = null;
        File file2 = null;
        String str2 = null;
        while (true) {
            switch ((str.hashCode() ^ 264) ^ -1157232001) {
                case -2086577227:
                    new BackupRestoreCopyingTask(context, true, z2, Constants.f951a, str2).execute(new File[0]);
                    str = "ۦۨ۫ۢۘۘۖۚ۫ۢۚ۫ۘۙۙۛۛۢۙۘۦۘ۫ۖۤ۟ۥ۠";
                    break;
                case -2080828115:
                    String str3 = "ۚ۟ۙۢ۟ۘۘۤۛۢۛ۬ۡۡۛۘۘ۟ۙۖ۠ۜۜ";
                    while (true) {
                        switch (str3.hashCode() ^ -714188958) {
                            case -1984652360:
                                str3 = "۬ۙۘۘۨۙۘۗ۫ۤۡۜۙۜۛۙۥ۠ۡۘۜۜۧۘ";
                                break;
                            case -879964810:
                                if (file2.exists()) {
                                    str3 = "ۥۚۥۜۢۛ۠ۧ۫ۗۘ۟ۘ۠ۤۤۤۡۘۖۦۗ";
                                    break;
                                } else {
                                    str3 = "ۜۦۛۘۦۨۘۤۦ۫ۜ۟۫ۢۨۚ۠";
                                    break;
                                }
                            case 1638248695:
                                str = "۬۬ۧۚۥۘۗۚۜۘۤۢۖۛۜۡۧۗۨۘ";
                                continue;
                            case 1776674129:
                                str = "ۨۛۘۘۘۖۨۘۡۙۘۘ۟۠ۥۘۗۚۢ";
                                continue;
                        }
                    }
                    break;
                case -2060589608:
                    String str4 = "۠ۨۧۘۦۦۡۛۨۥۙۧۦۘۚۖۨۥۨۧۘ";
                    while (true) {
                        switch (str4.hashCode() ^ -1394153167) {
                            case -950229443:
                                str = "ۗۘۢۧۖۘ۟ۡۘۘۡۡۗۢۜۖۗۧۡ";
                                continue;
                            case -612608735:
                                if (!file.exists()) {
                                    str4 = "ۗۙۤۧۤۡۘۜۖۨۚۖۙۤۨۘۢۢۦۛۗۛ۠ۘ۬";
                                    break;
                                } else {
                                    str4 = "ۧۧۨۦ۬ۜۡۤۦۤ۟ۖۤۙۡ۫ۘۨۢ۠ۜۘۡۦۜ۬ۧۤ";
                                    break;
                                }
                            case 929051386:
                                str = "ۡۥۜۘۥۧۥۘۛ۟ۨۘۘۧۘۤۦۥۘۜۜۚ";
                                continue;
                            case 1711668976:
                                str4 = "ۘۤ۬ۥۥۚۙۙۨۘ۠ۧۖۨۤ۬";
                                break;
                        }
                    }
                    break;
                case -2009201555:
                    str = "۬ۚۨۗۖ۠ۜۛ۠ۖۗۖۘۥ۬ۙ۫ۤۨ";
                    file2 = new File(str2);
                    break;
                case -1971214620:
                    str = "ۙۥۚۚۘۙۘۚۡۘۨۦ۠ۨۖۥۘۥۖۖۘ";
                    break;
                case -1099873862:
                    file2.mkdirs();
                    str = "ۨۛۘۘۘۖۨۘۡۙۘۘ۟۠ۥۘۗۚۢ";
                    break;
                case 131275655:
                    str = "ۢۚۖۜ۠ۢۥۘۥۘۗۙۨۡۨۗ۫ۦۤ۬ۥۘ۟ۧۘۘ";
                    break;
                case 657796281:
                    str2 = Constants.FMWA_CURRENT_BACKUP_PATH;
                    str = "ۧۤۘ۠۬ۥۘۘۘۡۚۦۦ۠ۛۚۦ۫ۘۘۜۗۦ";
                    break;
                case 713383350:
                    return;
                case 1180272306:
                    file.delete();
                    str = "ۗۘۢۧۖۘ۟ۡۘۘۡۡۗۢۜۖۗۧۡ";
                    break;
                case 1847172517:
                    str = "ۚۤۘۘۡ۬ۖۢۧۗۤۘۤۘۧۨۧۜۦۘۖۛ۠ۚۧۖ";
                    file = new File(str2, Constants.f953c);
                    break;
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0240, code lost:
        r1 = "ۘ۠۟۟ۦۗۙۖ۬۬ۨۙۦۥۛ۠ۥۘۤۦۖۨۙ۫ۚۖۚ";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0248, code lost:
        r1 = "ۗۚۨۗۢۙۛۦۦۢۗۘۘۘۙ۬۠ۤۦۢ۠ۢ";
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void restoreBackup(android.content.Context r17) {
        /*
            r5 = 0
            r16 = 0
            r10 = 0
            r15 = 0
            r14 = 0
            r12 = 0
            r13 = 0
            r6 = 0
            r3 = 0
            r4 = 0
            r2 = 0
            java.lang.String r1 = "ۨۢ۫ۙ۫۫ۤۗ۟ۚۗۜۘۜۥ۟ۢۥۡۘ"
            r7 = r2
            r8 = r3
            r9 = r4
            r11 = r6
        L_0x0012:
            int r2 = r1.hashCode()
            r3 = 401(0x191, float:5.62E-43)
            r4 = 410327924(0x18751b74, float:3.1679368E-24)
            r2 = r2 ^ r3
            r2 = r2 ^ r4
            switch(r2) {
                case -1820362281: goto L_0x0172;
                case -1785779060: goto L_0x0112;
                case -1732294048: goto L_0x01a9;
                case -1459459256: goto L_0x01f2;
                case -1357695753: goto L_0x0066;
                case -1325589932: goto L_0x009e;
                case -1230785126: goto L_0x0244;
                case -1203549758: goto L_0x0250;
                case -1195622732: goto L_0x022c;
                case -1064846268: goto L_0x017e;
                case -616272719: goto L_0x01a4;
                case -453340386: goto L_0x0024;
                case -382518692: goto L_0x0254;
                case -324511773: goto L_0x01d5;
                case -199188065: goto L_0x0117;
                case -121417680: goto L_0x0056;
                case -92915308: goto L_0x00ec;
                case -27072326: goto L_0x010d;
                case 2768887: goto L_0x006a;
                case 148292681: goto L_0x0089;
                case 319480802: goto L_0x0122;
                case 363915019: goto L_0x0143;
                case 428595262: goto L_0x0250;
                case 561678635: goto L_0x01d0;
                case 662241898: goto L_0x0051;
                case 750248630: goto L_0x0021;
                case 789843941: goto L_0x0183;
                case 806143305: goto L_0x0254;
                case 900713234: goto L_0x0221;
                case 943445446: goto L_0x011d;
                case 1233547779: goto L_0x01ca;
                case 1260588561: goto L_0x0250;
                case 1294825381: goto L_0x00cb;
                case 1900659568: goto L_0x0044;
                case 1918290785: goto L_0x00aa;
                default: goto L_0x0020;
            }
        L_0x0020:
            goto L_0x0012
        L_0x0021:
            java.lang.String r1 = "ۘۙۜۘ۠ۧۗۜۧۨۘۦۧ۫ۘ۟۠۟ۢۛ"
            goto L_0x0012
        L_0x0024:
            r2 = -771759654(0xffffffffd1ffe1da, float:-1.37375728E11)
            java.lang.String r1 = "ۖۡۙۨۘۘۛۢۙۧ۟ۙۚۛ۬ۚۚۖ"
        L_0x0029:
            int r3 = r1.hashCode()
            r3 = r3 ^ r2
            switch(r3) {
                case -817698314: goto L_0x0041;
                case 438289255: goto L_0x0032;
                case 1755465998: goto L_0x0038;
                case 2091474534: goto L_0x023c;
                default: goto L_0x0031;
            }
        L_0x0031:
            goto L_0x0029
        L_0x0032:
            java.lang.String r1 = "ۦۤۚۜۤۤ۠۫ۗۧۜ۬ۡۧۦ"
            goto L_0x0012
        L_0x0035:
            java.lang.String r1 = "ۧۧۖۤۘ۬۬ۖۜۘۘۛۥۨۜۜۙ۫ۘۘۚ۫ۜۘۛ۠ۤۢۖۢ"
            goto L_0x0029
        L_0x0038:
            boolean r1 = com.obwhatsapp.youbasha.task.utils.isStorageGranted()
            if (r1 != 0) goto L_0x0035
            java.lang.String r1 = "ۖۧۛۢۗۜۙۨ۫ۘۜۚ۠ۘۛ"
            goto L_0x0029
        L_0x0041:
            java.lang.String r1 = "ۘۤۡۘ۟ۗۡۘۙۦ۫ۘۚۙۤۖ"
            goto L_0x0029
        L_0x0044:
            java.lang.String r1 = "permission_storage_need_write_access_on_restore_from_backup"
            android.content.Context r2 = com.obwhatsapp.yo.yo.getCtx()
            r3 = 1
            a.a.i(r1, r2, r3)
            java.lang.String r1 = "۫ۚۦۘ۟ۨۦۗۜۧۘۖۖۥۘۖۦۛۗ۫ۡۘۜۤۤۘۜۜۢۡۘ"
            goto L_0x0012
        L_0x0051:
            java.lang.String r5 = com.obwhatsapp.youbasha.backuprestore.Constants.FMWA_CURRENT_BACKUP_PATH
            java.lang.String r1 = "ۨ۬۟ۘ۟ۥۙۤۖۘۜۧۜۘ۬ۦۦ"
            goto L_0x0012
        L_0x0056:
            java.io.File r1 = new java.io.File
            java.lang.String r2 = com.obwhatsapp.youbasha.backuprestore.Constants.f953c
            r1.<init>(r5, r2)
            boolean r2 = r1.exists()
            java.lang.String r1 = "ۨۢۥۨۤۗۨ۠ۢۖۦۨۢۦۦۘۦۛۛ"
            r16 = r2
            goto L_0x0012
        L_0x0066:
            r10 = 0
            java.lang.String r1 = "ۨۘۤۚۨۦۘۖۡۧۚۛۦۙۛۥ۬ۘۘۘ"
            goto L_0x0012
        L_0x006a:
            r2 = 1613583131(0x602d531b, float:4.9957424E19)
            java.lang.String r1 = "ۖۤۦۜۚۧۡۚۙۨۨۘۙۤۘۘۖۡۧۘ۟ۚۙۨۛۦۙۦۥ"
        L_0x006f:
            int r3 = r1.hashCode()
            r3 = r3 ^ r2
            switch(r3) {
                case -1954305788: goto L_0x0086;
                case -1947419224: goto L_0x007e;
                case 1436440704: goto L_0x0083;
                case 1739760458: goto L_0x0078;
                default: goto L_0x0077;
            }
        L_0x0077:
            goto L_0x006f
        L_0x0078:
            java.lang.String r1 = "ۧۘۦۘۗۡۢۢۙۜۢۘ۟۟ۗ"
            goto L_0x0012
        L_0x007b:
            java.lang.String r1 = "۟ۤۨۦۜ۟ۖۨ۫۬ۖۤ۬۬ۘ"
            goto L_0x006f
        L_0x007e:
            if (r16 == 0) goto L_0x007b
            java.lang.String r1 = "۟ۘۖۡۜۘۘۚۨۖۘۢۧۚۨ۫ۜۘۧۗۚۧۖۨ"
            goto L_0x006f
        L_0x0083:
            java.lang.String r1 = "ۢۚۚۧۗۢۚۜۧۘۙۛ۠ۧ۠ۜۨۗۨۘۚۡۥۘۦۤۤۦۜۚ"
            goto L_0x006f
        L_0x0086:
            java.lang.String r1 = "ۧۨۥۘ۫ۚۦۙ۬ۙۚۡۦۗۜۜۡۦ۬"
            goto L_0x0012
        L_0x0089:
            com.obwhatsapp.youbasha.backuprestore.BackupRestoreCopyingTask r1 = new com.obwhatsapp.youbasha.backuprestore.BackupRestoreCopyingTask
            r3 = 0
            r4 = 0
            java.lang.String r6 = com.obwhatsapp.youbasha.backuprestore.Constants.f951a
            r2 = r17
            r1.<init>(r2, r3, r4, r5, r6)
            r2 = 0
            java.io.File[] r2 = new java.io.File[r2]
            r1.execute(r2)
            java.lang.String r1 = "ۢۥۚۖۖ۟ۙۖۘۘۙۛ۫ۦۖ"
            goto L_0x0012
        L_0x009e:
            java.io.File r2 = new java.io.File
            java.lang.String r1 = com.obwhatsapp.youbasha.backuprestore.Constants.f952b
            r2.<init>(r1)
            java.lang.String r1 = "۟ۜۥۤۙۜۡۛ۟ۢۖۡۡۢۖۦۘۚۦ۠ۚۖۦۥۙ۟ۙ"
            r15 = r2
            goto L_0x0012
        L_0x00aa:
            r2 = -681287453(0xffffffffd76460e3, float:-2.51104776E14)
            java.lang.String r1 = "ۤۛۤۨۡۖ۫ۢۗۨۜۘ۫۫ۤ۠ۥۘۖۦ"
        L_0x00af:
            int r3 = r1.hashCode()
            r3 = r3 ^ r2
            switch(r3) {
                case -969987516: goto L_0x00c4;
                case -14263468: goto L_0x00c7;
                case 380974626: goto L_0x0240;
                case 1611471856: goto L_0x00b8;
                default: goto L_0x00b7;
            }
        L_0x00b7:
            goto L_0x00af
        L_0x00b8:
            int r1 = android.os.Build.VERSION.SDK_INT
            r3 = 30
            if (r1 < r3) goto L_0x00c1
            java.lang.String r1 = "ۥۢ۠ۗۚۛۡ۟ۜۢ۬ۚۗ۫ۛ۠ۚۥۗۜۤۤۗ"
            goto L_0x00af
        L_0x00c1:
            java.lang.String r1 = "ۜۖ۬ۢۡۘۡۡ۟ۡ۠ۤۢۤ۠ۙۗۦۘ"
            goto L_0x00af
        L_0x00c4:
            java.lang.String r1 = "ۛۡۡۘۘۧۜۘۧۡۦۘۡۡۘۥۡۚۖۨۜ۟ۘۜ۫۠ۜ۫ۧۧ"
            goto L_0x00af
        L_0x00c7:
            java.lang.String r1 = "ۡ۫ۛۦۢۘ۟ۧۗ۠۫ۚ۟ۘۜۘ"
            goto L_0x0012
        L_0x00cb:
            r2 = 1054711665(0x3edd9f71, float:0.43285707)
            java.lang.String r1 = "ۗۖۧۙۗۤ۫ۖۜۘۢۧۥ۠ۜ۬ۧۘۜۘۥۖۘۘ"
        L_0x00d0:
            int r3 = r1.hashCode()
            r3 = r3 ^ r2
            switch(r3) {
                case -1902654436: goto L_0x00e9;
                case -908346288: goto L_0x00d9;
                case 394738913: goto L_0x0240;
                case 1927357314: goto L_0x00e0;
                default: goto L_0x00d8;
            }
        L_0x00d8:
            goto L_0x00d0
        L_0x00d9:
            java.lang.String r1 = "ۖ۫ۜۘۡۨۡۘۜ۬ۗۦۤۗ۟۬ۘۘۖۧۨۘۙ۟ۦ"
            goto L_0x0012
        L_0x00dd:
            java.lang.String r1 = "ۦۦۧ۟۟ۘۡۜ۟ۙۤۤۜۥۤۖۘۥۘۨۛۤۤۙ۬"
            goto L_0x00d0
        L_0x00e0:
            boolean r1 = r15.exists()
            if (r1 == 0) goto L_0x00dd
            java.lang.String r1 = "ۡ۠ۖۥ۠ۗۢۖۖۘۥۜۥۘۢۤۥ۟ۘۦۦۦۙۧ۫۬ۨۧۨۘ"
            goto L_0x00d0
        L_0x00e9:
            java.lang.String r1 = "ۚۜۥۘۜۥۥۘۘۡۚۙ۬ۜۘ۫۟ۤ"
            goto L_0x00d0
        L_0x00ec:
            r2 = -1467294101(0xffffffffa88ade6b, float:-1.5417536E-14)
            java.lang.String r1 = "ۨۡۜ۫ۡۜۘۦۤۨۥۧۨۖۛۢۨۦ۬ۙۦۜۥۤ۫ۚ"
        L_0x00f1:
            int r3 = r1.hashCode()
            r3 = r3 ^ r2
            switch(r3) {
                case 873773878: goto L_0x0106;
                case 1251478835: goto L_0x0240;
                case 1327447679: goto L_0x0109;
                case 1398514000: goto L_0x00fa;
                default: goto L_0x00f9;
            }
        L_0x00f9:
            goto L_0x00f1
        L_0x00fa:
            boolean r1 = r15.isDirectory()
            if (r1 == 0) goto L_0x0103
            java.lang.String r1 = "ۧ۫۫۬ۥۖ۟ۤ۠۬ۥ۫۬ۚۖۘ"
            goto L_0x00f1
        L_0x0103:
            java.lang.String r1 = "ۖۥۢۜۙۧۙۗۦۘ۬ۜۜۥۙۜۘۚۦۙ"
            goto L_0x00f1
        L_0x0106:
            java.lang.String r1 = "ۤۚ۠ۨ۫ۛۙۛۘۘ۠۠ۛۦۧۘۡۤۨۖۡۘ"
            goto L_0x00f1
        L_0x0109:
            java.lang.String r1 = "ۘۘۨۘۤۜۨۘۙۗۤۘۥۧ۬۠ۥۦ۠"
            goto L_0x0012
        L_0x010d:
            r14 = 1
            java.lang.String r1 = "ۜۘۥۘۢۖۥۘۨۜۘۥۥۧۘ۬ۥۡ"
            goto L_0x0012
        L_0x0112:
            java.lang.String r1 = "ۖ۬ۥۧۜۖ۟ۡ۫۫ۖۦۘۨۚۛۗۧۚۨۙۥ"
            r13 = r14
            goto L_0x0012
        L_0x0117:
            r2 = 0
            java.lang.String r1 = "ۛۥۥۘۧۘۜ۠ۜۚۥۡۛۙۗۗۜۗ۠ۧۗۦۗ۫ۜۘۙ۬ۡ"
            r12 = r2
            goto L_0x0012
        L_0x011d:
            java.lang.String r1 = "ۤۚۢۛۥۜۘۛ۬ۜۘۘۛۨۖۡۘ"
            r13 = r12
            goto L_0x0012
        L_0x0122:
            r2 = -2144516356(0xffffffff802d46fc, float:-4.158062E-39)
            java.lang.String r1 = "ۙۢ۟ۡۡۨۗ۬ۦۘ۟ۨ۬ۥۥۚ۬ۖۘۛۚۥۦۨۘ"
        L_0x0127:
            int r3 = r1.hashCode()
            r3 = r3 ^ r2
            switch(r3) {
                case -1857789241: goto L_0x013f;
                case 118847532: goto L_0x013c;
                case 1185399295: goto L_0x0130;
                case 1655055794: goto L_0x0137;
                default: goto L_0x012f;
            }
        L_0x012f:
            goto L_0x0127
        L_0x0130:
            java.lang.String r1 = "ۗۤ۟ۨ۫ۡۖۛۢۦۚۨ۠ۜۦۘ۟۫ۙ۟۫ۥۘۢۦۥۘ"
            goto L_0x0012
        L_0x0134:
            java.lang.String r1 = "ۡۜ۠ۙۦۢۚۢ۠ۨۖۦۘۜۛۨۥۛ۬۬ۚ"
            goto L_0x0127
        L_0x0137:
            if (r13 == 0) goto L_0x0134
            java.lang.String r1 = "ۦۜۨۘۚ۟ۘ۬۟ۜۘۛۦ۫۠ۘۤۘۡۧۘۡ۬ۢۥۤۤ"
            goto L_0x0127
        L_0x013c:
            java.lang.String r1 = "ۙۛۘۧۧۘۧ۬ۡۘۥۧۨۘ۟ۚۥۘ۟ۥۡۘ"
            goto L_0x0127
        L_0x013f:
            java.lang.String r1 = "ۙۨ۠۟ۛۨۘ۫ۜۡۚۡۥۘۘۘۢۥۦۜۘۥۛۦۧۜۡ"
            goto L_0x0012
        L_0x0143:
            android.app.AlertDialog$Builder r1 = new android.app.AlertDialog$Builder
            r0 = r17
            r1.<init>(r0)
            java.lang.String r2 = "msg_store_backup_found"
            java.lang.String r2 = com.obwhatsapp.yo.yo.getString((java.lang.String) r2)
            android.app.AlertDialog$Builder r1 = r1.setTitle(r2)
            java.lang.String r2 = a()
            android.app.AlertDialog$Builder r1 = r1.setMessage(r2)
            r2 = 17039370(0x104000a, float:2.42446E-38)
            i.a r3 = new i.a
            r4 = 0
            r0 = r17
            r3.<init>(r0, r4)
            android.app.AlertDialog$Builder r1 = r1.setPositiveButton(r2, r3)
            r1.show()
            java.lang.String r1 = "ۙۨۡۘ۬ۦۗۚۛۡ۫ۜۦ۫ۦۘ۫ۗۥۘ۫۫ۡۘ"
            goto L_0x0012
        L_0x0172:
            java.io.File r2 = new java.io.File
            java.lang.String r1 = com.obwhatsapp.youbasha.backuprestore.Constants.f954d
            r2.<init>(r1)
            java.lang.String r1 = "ۧۜۦۥۥۤۘ۬ۘۘۙۡۤۚۗۦۤۤۦۥۘۤۗۡۚۛۡۘ"
            r11 = r2
            goto L_0x0012
        L_0x017e:
            java.lang.String r1 = "ۦۨۘۘۜۥۧۨ۬ۦۗۖۙۜۧ۟"
            r9 = r10
            goto L_0x0012
        L_0x0183:
            r2 = 190843446(0xb600a36, float:4.3148513E-32)
            java.lang.String r1 = "ۖ۠ۨۘۗ۠ۤۛۖ۬۟۟۬ۗۖۧۡۨۛۗۜۖۘۘۘۗ"
        L_0x0188:
            int r3 = r1.hashCode()
            r3 = r3 ^ r2
            switch(r3) {
                case -26906160: goto L_0x01a0;
                case 1059832776: goto L_0x0191;
                case 1569151550: goto L_0x0197;
                case 1762045519: goto L_0x0248;
                default: goto L_0x0190;
            }
        L_0x0190:
            goto L_0x0188
        L_0x0191:
            java.lang.String r1 = "ۘ۟ۡۤ۫ۖۡ۟ۚۚۗۛۘۨۢۢۧۡۘۗۗۥۘۚۡۗ"
            goto L_0x0188
        L_0x0194:
            java.lang.String r1 = "ۖۚ۟۬ۤۜۥۗۚۙۨ۫ۚۙ۟ۡۖۨ۠ۧۤۢۜ۠"
            goto L_0x0188
        L_0x0197:
            boolean r1 = r11.exists()
            if (r1 == 0) goto L_0x0194
            java.lang.String r1 = "ۢۗۡۛ۫ۙ۬ۚۥۨۜۦۘۥ۬ۥ"
            goto L_0x0188
        L_0x01a0:
            java.lang.String r1 = "ۤ۬۟ۦۢۖۘ۟۠ۧۡۖ۫ۨۛۜۘ"
            goto L_0x0012
        L_0x01a4:
            java.lang.String r1 = "ۥۜ۬ۚۧۦۘۨۙۡۘۙۢ۫ۤ۬ۙۢۥۤۘۢۨۨۚ۟"
            r9 = r10
            goto L_0x0012
        L_0x01a9:
            r2 = 1453453077(0x56a1ef15, float:8.9024111E13)
            java.lang.String r1 = "۠ۧۙ۬ۜۧۘۧۢۤ۬ۥۚۧۛۧ۟ۛۖۘۜۚۦ"
        L_0x01ae:
            int r3 = r1.hashCode()
            r3 = r3 ^ r2
            switch(r3) {
                case -1980015273: goto L_0x01be;
                case -1675106236: goto L_0x01c7;
                case 197493296: goto L_0x01b7;
                case 1512440306: goto L_0x0248;
                default: goto L_0x01b6;
            }
        L_0x01b6:
            goto L_0x01ae
        L_0x01b7:
            java.lang.String r1 = "ۘ۫ۘۧۢۨۤ۠۟ۜ۬ۚۦۜ۟ۛۥ۬۬ۦۥ۬۫ۨۘۤۦۦۘ"
            goto L_0x0012
        L_0x01bb:
            java.lang.String r1 = "ۛۗۨۥۡۥۙ۫ۡۘۘۧۜۘۛۨۧ۫ۜۡ"
            goto L_0x01ae
        L_0x01be:
            boolean r1 = r11.isDirectory()
            if (r1 == 0) goto L_0x01bb
            java.lang.String r1 = "ۦ۠ۘۘ۟ۢۜۘ۫ۦۡۦ۠ۗ۟ۘۜۘۚۜۘۤۙۛۖ۫ۘ۠ۡ۠"
            goto L_0x01ae
        L_0x01c7:
            java.lang.String r1 = "ۧۘ۬ۥۚۦۚۜۖۤۡۘۘ۬ۨ۫ۜۘۘۢۤۤ۠ۥۤ"
            goto L_0x01ae
        L_0x01ca:
            r2 = 1
            java.lang.String r1 = "ۛۨۡۘۥۚۛۗ۠ۤۚۖۙۧۙۥۜۛۜ"
            r8 = r2
            goto L_0x0012
        L_0x01d0:
            java.lang.String r1 = "ۗۚۨۗۢۙۛۦۦۢۗۘۘۘۙ۬۠ۤۦۢ۠ۢ"
            r9 = r8
            goto L_0x0012
        L_0x01d5:
            r2 = -736754508(0xffffffffd41604b4, float:-2.577296E12)
            java.lang.String r1 = "ۚ۬ۧۗ۬ۚۖۦۚۦۖۖۘ۟ۚۧۚۨۨۘۙۜ۫۠ۡۘۘۡۡۚ"
        L_0x01da:
            int r3 = r1.hashCode()
            r3 = r3 ^ r2
            switch(r3) {
                case -1993752971: goto L_0x01eb;
                case -1942887663: goto L_0x024c;
                case -1878804093: goto L_0x01ee;
                case -59251749: goto L_0x01e3;
                default: goto L_0x01e2;
            }
        L_0x01e2:
            goto L_0x01da
        L_0x01e3:
            if (r9 == 0) goto L_0x01e8
            java.lang.String r1 = "۫ۤ۟ۗۘۧۘۙۤۢ۬ۨۘۖۡۘۢۧۜۘۦۥۖۘۛ۠ۧۧۡۡۘ"
            goto L_0x01da
        L_0x01e8:
            java.lang.String r1 = "ۘۤۘۘۧۖۜۤۨۤ۠ۙۨۘۥۗۙۨۖۖۚۗۧ۬ۘۥۗۨۜۘ"
            goto L_0x01da
        L_0x01eb:
            java.lang.String r1 = "ۚۧ۫۫ۘۖۘ۠ۖۥۘۨۗۡۧۡۡۘۖۤۜۘ"
            goto L_0x01da
        L_0x01ee:
            java.lang.String r1 = "ۦۨۤۘۚۡۙۨۧۘۖۨ۠ۦۢۜ۠۠ۡۗۡۧۘ"
            goto L_0x0012
        L_0x01f2:
            android.app.AlertDialog$Builder r1 = new android.app.AlertDialog$Builder
            r0 = r17
            r1.<init>(r0)
            java.lang.String r2 = "msg_store_backup_found"
            java.lang.String r2 = com.obwhatsapp.yo.yo.getString((java.lang.String) r2)
            android.app.AlertDialog$Builder r1 = r1.setTitle(r2)
            java.lang.String r2 = a()
            android.app.AlertDialog$Builder r1 = r1.setMessage(r2)
            r2 = 17039370(0x104000a, float:2.42446E-38)
            i.a r3 = new i.a
            r4 = 1
            r0 = r17
            r3.<init>(r0, r4)
            android.app.AlertDialog$Builder r1 = r1.setPositiveButton(r2, r3)
            r1.show()
            java.lang.String r1 = "ۦ۠ۢ۫ۚۨ۠ۦۗۚۜۘ۟ۗۗ۬ۡۧۘۧ۟۫ۛۡۥ"
            goto L_0x0012
        L_0x0221:
            java.lang.String r1 = "google_drive_no_backup_found"
            java.lang.String r2 = com.obwhatsapp.yo.yo.getString((java.lang.String) r1)
            java.lang.String r1 = "ۦ۠ۚۧۛۤۥۢۦۘۤۧۨۘۡۙۡۥۙۨۘۜ۬ۜ"
            r7 = r2
            goto L_0x0012
        L_0x022c:
            android.content.Context r1 = com.obwhatsapp.yo.yo.getCtx()
            r2 = 1
            android.widget.Toast r1 = android.widget.Toast.makeText(r1, r7, r2)
            r1.show()
            java.lang.String r1 = "۫ۧۧۙۥۜۡۗۖۤۖ۠ۥۦ۬ۧ۬ۚۖۖۥۘۚۨۗ"
            goto L_0x0012
        L_0x023c:
            java.lang.String r1 = "ۖۨۡۘ۟۟۠ۚۦۥۘۚۥۥۗۦۜۘ"
            goto L_0x0012
        L_0x0240:
            java.lang.String r1 = "ۘ۠۟۟ۦۗۙۖ۬۬ۨۙۦۥۛ۠ۥۘۤۦۖۨۙ۫ۚۖۚ"
            goto L_0x0012
        L_0x0244:
            java.lang.String r1 = "ۤۚۢۛۥۜۘۛ۬ۜۘۘۛۨۖۡۘ"
            goto L_0x0012
        L_0x0248:
            java.lang.String r1 = "ۗۚۨۗۢۙۛۦۦۢۗۘۘۘۙ۬۠ۤۦۢ۠ۢ"
            goto L_0x0012
        L_0x024c:
            java.lang.String r1 = "۟ۖۚۧ۫ۤ۫ۙ۟۬ۤۡۘۜۥۨ۫ۦ"
            goto L_0x0012
        L_0x0250:
            java.lang.String r1 = "۫ۧۧۙۥۜۡۗۖۤۖ۠ۥۦ۬ۧ۬ۚۖۖۥۘۚۨۗ"
            goto L_0x0012
        L_0x0254:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.youbasha.backuprestore.Controller.restoreBackup(android.content.Context):void");
    }
}
