package com.obwhatsapp.youbasha.filechooser.internals;

import java.io.File;
import java.text.DecimalFormat;
import org.apache.commons.io.FileUtils;

public class FileUtil {
    public static String getExtension(File file) {
        int i2 = 0;
        String str = "۠ۦ۫ۢۦ۬ۥۛ۠ۦۚۡۘ۠ۚۤ";
        while (true) {
            switch ((str.hashCode() ^ 708) ^ 395197240) {
                case -593551068:
                    return null;
                case -548070225:
                    String str2 = "ۙۡۙۚۘۗۘ۫ۘ۠ۤۜۘۦۘۡۗۛۖۢۦ۬";
                    while (true) {
                        switch (str2.hashCode() ^ 983101402) {
                            case -432580366:
                                if (i2 < 0) {
                                    str2 = "ۜۙۥۘۛۚۛۧۨۖۨۘۛۙۘ۟۟ۜۘۜ۠۟ۖۨ۟";
                                    break;
                                } else {
                                    str2 = "ۤۜۘۘۦۘۥۨۘۘۨۥۙۖۤۜۘۛۥۡۘ۠ۡۜۤۜۘۗۜۙ";
                                    break;
                                }
                            case -432237926:
                                str = "ۧ۟ۥۘۘۜۙۙۖۘۡ۠ۤۥۙۙۧ۠ۗۜۧۘ";
                                continue;
                            case -300600747:
                                str = "ۛۡۨۦۤۨۘۥۢۖۖۡۨۘۘۘۚ۟ۖۨ";
                                continue;
                            case 30149839:
                                str2 = "ۨۜۡ۠ۤۗ۫ۙۦۘ۬ۚۚ۠۟ۨۘۡۙۛۤۛۥ";
                                break;
                        }
                    }
                    break;
                case -453348793:
                    return "";
                case 709587211:
                    String str3 = "۫ۧۗۛۧ۫ۧ۟ۥۘۙۚۘۘۢۦۘۘ۟ۡۢ۫ۘۖۨۨۘۘ";
                    while (true) {
                        switch (str3.hashCode() ^ 833775219) {
                            case -427069219:
                                str = "۟ۗۘۤۦۡۘۚۡ۬ۧۚۚۦۙ۠ۥۨۤۤ۠ۤۜۤۡۘ";
                                continue;
                            case 43649262:
                                if (file != null) {
                                    str3 = "ۖۨۦۨۡ۟ۙۘۨۚۖۨۚۥۘ";
                                    break;
                                } else {
                                    str3 = "ۜ۠ۛۡۨۢۦۡۨۘۦۚ۠۬ۢ۫۟ۚۜۢۘۗۤۘۧۘۧ۬ۦ";
                                    break;
                                }
                            case 544272311:
                                str3 = "۬ۜۜۛ۫ۨ۟ۖۧۧ۠۬ۨۥۘ۬ۧۖۚۦۜ۟ۦۘۢۦۢ";
                                break;
                            case 859132747:
                                str = "ۢ۟۠ۥۢۤۡۢۖۚۤۛۗ۬ۘۚۨۘۘۤۧۖۘۤ۟ۚۡۙ";
                                continue;
                        }
                    }
                    break;
                case 1427218076:
                    return file.getName().substring(i2);
                case 1923947044:
                    str = "ۚۖۥۥۢ۬ۥۖۡۚۜۦۗۙۛ۟ۢ۟ۛۙۜۘ";
                    break;
                case 2001111133:
                    i2 = file.getName().lastIndexOf(".");
                    str = "ۘۧۗ۠ۘۤ۟ۙۘۗۜۧۘۤۖۜۘۢ۬ۡۘۚۧۡۘۨۨۨۘ";
                    break;
            }
        }
    }

    public static String getReadableFileSize(long j2) {
        DecimalFormat decimalFormat = null;
        String str = null;
        float f2 = 0.0f;
        float f3 = 0.0f;
        float f4 = 0.0f;
        String str2 = null;
        String str3 = null;
        float f5 = 0.0f;
        float f6 = 0.0f;
        String str4 = null;
        StringBuilder sb = null;
        String str5 = "ۧۡۡۘ۬ۨۘۘۥۢۚ۠ۤ۠ۘۜۡۘۧ۫ۜۘ";
        while (true) {
            switch ((str5.hashCode() ^ 573) ^ -320168367) {
                case -2120045967:
                    str5 = "ۨۖۨۤ۠ۗ۫ۜۜۘۧۡۥۚۤۜۦۢۨۘ۟ۗ۟۬۟ۙۘۗۖۘ";
                    str4 = str2;
                    break;
                case -2003466773:
                    str = " KB";
                    str5 = "۟ۢۦۤۚ۟ۢۧۨۥۥۜۘ۬ۧۙ";
                    break;
                case -1881927961:
                    str5 = "۬۫۟ۜۧۤۡ۬ۛۙۛۧۨۙۧۘۜۤۚۢۢ۫ۗۜۘۦۘۗ";
                    str4 = str;
                    break;
                case -1839465348:
                    sb.append(str4);
                    str5 = "ۤۧۙۛۚۖۘۚ۫ۨۗۧۡۧۜۥۘ۫ۤۜ۬ۘ۟";
                    break;
                case -1627574642:
                    str5 = "ۤۢۡۘۗ۠ۘۘ۬ۙۦۘۘۧ۟ۙۧۥۘۙۙۚۨۛۘۨۨۖۘ";
                    str4 = str3;
                    break;
                case -1348138389:
                    str5 = "ۨۥۛ۬ۥۚ۫ۗۦۗۢۥۢۨۧۘ";
                    break;
                case -1069114857:
                    sb = new StringBuilder();
                    str5 = "ۥۖۧۘ۠ۖۛۗۜۘۤۥۙۤ۟ۢۧۙۨۘۗۘۡۘۨۛ۠ۢۚۘ";
                    break;
                case -884143875:
                    str3 = " MB";
                    str5 = "ۜۤۘۘ۠ۧۡۘ۠۟ۥۘ۟ۢۚۤ۟ۦۘۨۛۖۘ۬ۦۥۘۢ۫ۢۥۜۤ";
                    break;
                case -862686477:
                    String str6 = "۟ۚۤ۬ۚۥۘۖۙ۟ۗ۬ۙ۬ۨ۬ۧۛۛۜۡۡۘۨۚۘۘ";
                    while (true) {
                        switch (str6.hashCode() ^ 1767049585) {
                            case -1703990611:
                                str5 = "ۚۙۨۛۤۡۤ۫ۘۘۖۧۦ۟ۥۨۘ۟ۦۜ";
                                continue;
                            case -1245022938:
                                if (f2 <= 1024.0f) {
                                    str6 = "ۤۥۘۜۛۢ۠ۖۨۘ۫۬۬ۛۘ۫";
                                    break;
                                } else {
                                    str6 = "۟ۗۘۙۧۨۘ۬۬ۦۘۤۖۨۘۗ۫۬";
                                    break;
                                }
                            case -1214634108:
                            case 1131224055:
                                str6 = "ۗۧۜۘۦ۫ۥۦۛۥۘۤۙۥۘ۫ۧۥ۟ۗۘۚۡۖۘ۠ۢۢ";
                                break;
                        }
                    }
                    break;
                case -752351587:
                case 1301661177:
                    str5 = "۬۫۟ۜۧۤۡ۬ۛۙۛۧۨۙۧۘۜۤۚۢۢ۫ۗۜۘۦۘۗ";
                    break;
                case -726125979:
                    return String.valueOf(sb.toString());
                case -709283167:
                    f4 = f3 / 1024.0f;
                    str5 = "ۤ۫ۡ۬ۜۘۢ۫ۜۢۙۘۘۖۡۨۘۢۢۜۘ";
                    break;
                case -543981395:
                    str5 = "ۘۥۧۗۢۡۘۨۘۡۧۢۥۚۨۘ";
                    f6 = f3;
                    break;
                case -340082485:
                    str5 = "ۡۗۡۢۦۧۘۢۛۛۛۜۘۘۦ۠۠ۥۚۘۘۛۗ۟ۥۢۧ";
                    f6 = f2;
                    break;
                case -211473625:
                    str5 = "ۜۡۥۘۢ۫ۛۤۖۛۤۖۗۚۗۜۘۘۤۗۛ۟ۥۘ۟ۡۜ";
                    str4 = str;
                    break;
                case 56388684:
                    f3 = f2 / 1024.0f;
                    str5 = "۬ۡۧۘۢۗۙ۫ۘۜۖۙۥۤۦ۠";
                    break;
                case 334265997:
                    str5 = "۬ۛ۬ۨۧۨۘۛۚۛۥۢۡۘۖ۠ۙ۟ۢ۟";
                    f6 = f4;
                    break;
                case 412471647:
                    str2 = " GB";
                    str5 = "ۚۢۙۦ۫ۨۘۛ۠ۦۗۥۗۤۗۜۘ";
                    break;
                case 445857856:
                    sb.append(decimalFormat.format((double) f6));
                    str5 = "ۗۜۖۘ۟۟ۛۤۜۗۘۗۦۢ۬۠۬۫ۥ۠ۙۘۘۗۦۤ";
                    break;
                case 688436881:
                    f2 = (float) (j2 / FileUtils.ONE_KB);
                    str5 = "ۥۨۥۖۖۜۖۤۨۘۙۢۨۘۚ۟ۡ";
                    break;
                case 976512393:
                    String str7 = "۬ۛۛۡۖۨۘۤۜۦۗۢۨۥۤۚ";
                    while (true) {
                        switch (str7.hashCode() ^ -419056178) {
                            case -1919213227:
                                if (j2 <= FileUtils.ONE_KB) {
                                    str7 = "ۛ۫۫ۢۧۜۛ۟ۖۜۗۛۖۜۡۘ۬ۖۨۘۘۘۛۥۜۘ";
                                    break;
                                } else {
                                    str7 = "ۛۡۧۦۧۚ۠ۛۖۘ۟ۛۖۘۗۚ۬ۥۜۨۘۨۧۦ۫ۖۦۘۘۥ۠";
                                    break;
                                }
                            case -1116462142:
                                str7 = "ۢۤۜۡۡۘۥۢ۫ۨۗ۟ۢ۟۟ۢ۠";
                                break;
                            case -198038007:
                                str5 = "ۦۚۧۦۖۨۘ۫ۛۗۡ۟ۜۛۛ۫ۦۨۢۤ۠ۨۘ۬۠ۧۖۘۛ";
                                continue;
                            case 392699406:
                                str5 = "ۢۨۡۥۢۢۧۢۢۡۧۦۧۜۨۨ۠ۥ";
                                continue;
                        }
                    }
                    break;
                case 1101589949:
                    f5 = 0.0f;
                    str5 = "ۢۙۙۛۖۡۘۘۧۤۨۢ۬۫۟۬ۤۘۘ";
                    break;
                case 1858800225:
                    String str8 = "۫۬۠ۛۗۚۨۧۨۘ۟ۜۢ۫ۜ۟ۗ۫ۥ";
                    while (true) {
                        switch (str8.hashCode() ^ 414460021) {
                            case -1952748913:
                                if (f3 <= 1024.0f) {
                                    str8 = "ۦ۬ۨۘ۠ۗ۟ۗۗ۫ۢۡۙۤۙۗ۬ۖ۟ۤ۫ۧۧۧۛ";
                                    break;
                                } else {
                                    str8 = "ۜۢۡۘۢۗۥۙۙۖۘۤۚ۬ۥ۠ۜۘۙ۫ۢۤۖۖۘۛۛۙۖۙۖ";
                                    break;
                                }
                            case -1184990221:
                                str8 = "۠۫ۥۘۜۧۡۥۘۛۨ۠ۤۜۛۜۧۦۦۛۥۙۚۧۢ";
                                break;
                            case 157531641:
                                str5 = "ۢۗۛۢۢۥۤۛۜۜۚۨۢۘۧ";
                                continue;
                            case 497168442:
                                str5 = "ۢ۬ۜۜۦ۟۠۟۠ۘۛ۫ۘۢۥۘ۬۟ۡۘ";
                                continue;
                        }
                    }
                    break;
                case 1968548593:
                    str5 = "ۗۖۜۡۧۛۥۦۡۡۦۘۡۘۡۦۗ۠ۛۘۘۛ۟ۚ";
                    f6 = f5;
                    break;
                case 2068642422:
                    decimalFormat = new DecimalFormat("###.#");
                    str5 = "ۘۢۥۘۘۧۤۘۙۘۧۨۨۛۥۘۗۖۢۨۤ۠";
                    break;
            }
        }
    }
}
