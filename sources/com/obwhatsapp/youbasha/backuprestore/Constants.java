package com.obwhatsapp.youbasha.backuprestore;

import a.a;
import android.os.Environment;
import com.obwhatsapp.yo.yo;
import com.obwhatsapp.youbasha.task.utils;
import java.io.File;

public abstract class Constants {
    public static final String FMWA_CURRENT_BACKUP_PATH;
    public static final String WA_DATABASES_PATH;

    /* renamed from: a  reason: collision with root package name */
    public static final String f951a;

    /* renamed from: b  reason: collision with root package name */
    public static final String f952b;

    /* renamed from: c  reason: collision with root package name */
    public static final String f953c = String.format("%s.zip", new Object[]{yo.mpack});

    /* renamed from: d  reason: collision with root package name */
    public static final String f954d;

    static {
        String str = "۫ۦۧۘ۟ۚۛۖۘۘۘۚۙۥ۠ۖۙۘۗۨ";
        StringBuilder sb = null;
        String str2 = null;
        String str3 = null;
        StringBuilder sb2 = null;
        StringBuilder sb3 = null;
        StringBuilder sb4 = null;
        StringBuilder sb5 = null;
        while (true) {
            switch ((str.hashCode() ^ 819) ^ 1906589160) {
                case -2089928437:
                    FMWA_CURRENT_BACKUP_PATH = str2;
                    str = "ۖۖۦۨ۠۫۟ۚۦۘ۫ۧۦۘۚۗۘۘ۟ۘۤۙ۬ۡۘ۟۫۠";
                    break;
                case -1927896435:
                    str = "۟ۥۦۛۜۦ۬ۡ۠ۛۨۥۘۖۖۢۖۛ۟ۧۗ۠ۥۖۥ";
                    sb5 = new StringBuilder();
                    break;
                case -1901498524:
                    sb.append(str3);
                    str = "ۚۚۛۗۨۙۗۡۧۘۥۗۘۘۥ۟ۤ۬۬۬ۘۖۧ۫۫ۘۥۧۘ";
                    break;
                case -1807062969:
                    sb5.append("Databases");
                    str = "ۤۗۘۘۤۢۖۘۥۗ۬ۢۚۥۘۜۦۦۦۖۨۧۘۜ";
                    break;
                case -1790327026:
                    str = "ۨۥۥۘۙۢۥۘۨۛۦۘۖۘۢ۠۟۠ۚ۠ۧۥۘۘ";
                    sb4 = new StringBuilder();
                    break;
                case -1771833242:
                    WA_DATABASES_PATH = sb5.toString();
                    str = "ۤۛۖۘ۟ۚۢۘۖ۟ۤۚۜۦۥۗ۫ۙۨ";
                    break;
                case -1681180673:
                    str = "ۛۤ۟ۢۚۚۧۢ۠ۖۜۛ۠ۨۥۛۨ۟ۡ۟ۘۘۦ۫";
                    sb2 = new StringBuilder();
                    break;
                case -1318164051:
                    sb4.append(Environment.getDataDirectory());
                    str = "۬ۗۤۤۖۢۡ۫ۨۘ۫ۗۚۡ۟ۜۘۡۦ۠ۗۡۥۘۡ۬ۚۙ۬ۦ";
                    break;
                case -1295126287:
                    f952b = sb3.toString();
                    str = "۠۟۫ۖۦۧ۬ۗۙۢ۠ۖ۬۫ۡۘۥۘ۠ۡ۬ۚ۟ۧۙ";
                    break;
                case -1265768711:
                    sb.append(Environment.getExternalStorageDirectory());
                    str = "ۢۨۜۘۛۡۥۘۙۘۥۦ۟ۦۧ۟ۛۨ۠ۢ";
                    break;
                case -1153536705:
                    return;
                case -1021346766:
                    sb.append(str3);
                    str = "ۘۧۙۙۥ۠ۜۥۖۜ۬ۘۘ۫ۨۨۦۙ۬";
                    break;
                case -672428511:
                    sb3.append(yo.mpack);
                    str = "۫ۜۜۘۧۡۦۙۖۧۡۤۚۡۨۜۘۦۤۖۗۜۘ";
                    break;
                case -656159334:
                    sb.append(yo.pname);
                    str = "ۛۧۜۘۨۨۨۘۗ۫ۨۘۧۜۡۘ۫ۢۛۚ۟۠";
                    break;
                case -600628036:
                    f951a = sb4.toString();
                    str = "ۜۥۛۢۦۙۖۖۨ۠ۢۛۡۥۨۘۥ۟ۛۢۜۧۛۡۡۘ";
                    break;
                case -509285021:
                    str = "ۥۖۧۘ۬ۢۦۘۧۦ۬ۤۗۥ۟ۙ۟ۨ۠ۖۖۙۖۘۥ۫ۘۛۖۨۘ";
                    break;
                case -403808593:
                    f954d = sb.toString();
                    str = "۠ۜۨۘۦۢۦۘۢۥۥۘۛۗۧۧ۬ۚۦۙۘۙ۟۫ۗۤ۫";
                    break;
                case -95127786:
                    sb4.append(yo.mpack);
                    str = "ۗۦۘ۬ۢ۠۟ۢۖ۟۬۫۫ۘۗۜۜۗۤۜۘ";
                    break;
                case -38089730:
                    sb4.append("/data/");
                    str = "ۘۜۗۗ۬ۜۘۥ۟ۘۘۘۖۘۢۥ۬";
                    break;
                case 290528560:
                    sb.append("OBBackup/");
                    str = "ۢۚۡۖۛۖۘۗۧۘ۬۟ۧ۬ۥۙۜۢ۫";
                    break;
                case 338161239:
                    sb3.append(utils.getWAFolderPath());
                    str = "ۧۢۜۘۨ۠ۘۧ۬ۦۡۖۤۤۘۚۘ۬۬ۥ۠ۨۧ۟۬";
                    break;
                case 381626895:
                    sb2.append(Environment.getExternalStoragePublicDirectory(yo.pname));
                    str = "ۢۡۙۛۡۦ۬ۡۤۘۚۦۗۙۥۘۘ۬ۨۘۜ۠ۧۨۤۡۘ";
                    break;
                case 871891103:
                    sb = new StringBuilder();
                    str = "۬ۧۧۘۤۦۘ۠۫ۗۙۙۢۛۡۨ";
                    break;
                case 953394713:
                    str = "۠ۛۢۦۛۢۦ۠ۡۢۛۙۘۘۛۧۧۖۘ";
                    str3 = File.separator;
                    break;
                case 1300425514:
                    str = "۫ۖۨۘۜۨۗۗۛ۟ۙۨۘۘۙۥۘۥۡۖۘۛۦۧ";
                    sb3 = new StringBuilder();
                    break;
                case 1347240587:
                    sb3.append("OBBackup/");
                    str = "ۢۥۦۘ۫۬ۖۙۘ۬ۚۢۦۘۚۡۘۦۡۦۙۛۦۘ۟ۨۘ";
                    break;
                case 1374741466:
                    sb.append(yo.mpack);
                    str = "ۙۤۜۘۖۖۧۘۥۨ۠ۤ۫ۢۢۦۗ۠ۥۖ";
                    break;
                case 1377265573:
                    str = "۬ۢۚۤۘۜۥۛۨ۠۫ۘۘۦۥ۬ۙ۬۟";
                    str2 = a.f(sb2, str3, "OBBackup");
                    break;
                case 1680903769:
                    sb5.append(utils.getWAFolderPath());
                    str = "ۡۜۨۘ۬ۦۧۚۜۙ۫ۚ۫ۚۙۧۡۨۦۜۢۨ۠ۤۢۤۦ";
                    break;
            }
        }
    }
}
