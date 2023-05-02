package com.obwhatsapp.yo;

import java.util.Locale;

public abstract class freqObfStringMapping {

    /* renamed from: a  reason: collision with root package name */
    public static final i1 f769a = new i1(0);

    /* renamed from: b  reason: collision with root package name */
    public static final j1 f770b = new j1();

    static {
        String str = "ۡۥ۠ۨۥۥۘۘۥۦۘۡۨ۠ۛۥۥۘۥۙۙۘۗ۠۟ۤ۫ۦۘۙ";
        while (true) {
            switch ((str.hashCode() ^ 823) ^ 744795884) {
                case -1945913069:
                    str = "ۛۗۛۜۥۥۘ۬ۥۧ۠ۨۨۤۡۨۘ۬ۤۙ۬ۤۖ۬۠ۢ";
                    break;
                case -257525933:
                    str = "ۡۡۥۘۚۦ۫ۛۥۦۘۛۗۖۘۗۧۖۨۤۛ۟۠ۧۢۘۥ";
                    break;
                case -204865652:
                    return;
            }
        }
    }

    public static String getStringObfName(String str) {
        try {
            String str2 = (String) f769a.get(str.toLowerCase(Locale.ENGLISH));
            String str3 = "ۨ۬ۦۘۛ۫ۨۡۥ۟۟ۙۙۥ۫";
            while (true) {
                switch (str3.hashCode() ^ 336605654) {
                    case 61933082:
                        if (str2 == null) {
                            str3 = "ۖۜۦۘۙۗۜۘ۫ۦۛۘۖ۫ۦۨۘۧ۫ۢۦۦ۬ۛ۬ۘۙۢۡۘ";
                            break;
                        } else {
                            str3 = "ۚۙۗۗۥۘۘۙۛۥۤۙۛۛۡۢۚۥۚۛۛۛ۠ۢۥۘ";
                            continue;
                        }
                    case 219803636:
                        break;
                    case 570199705:
                        return str2;
                    case 1530878786:
                        str3 = "۠ۢ۟۬ۥۨۘ۬ۡۧۘۤۖۥ۠ۘۘۦۦ۫ۙۖۘۘ";
                        continue;
                    default:
                        continue;
                }
            }
        } catch (Exception e2) {
        }
        return null;
    }

    public static boolean isFMString(int i2) {
        String str = "ۛۙۖۘ۠ۙ۬ۥۜۗۗ۬ۤۦۡۜۘۘۡۛۡۘۗۡ۬";
        boolean z2 = false;
        boolean z3 = false;
        while (true) {
            switch ((str.hashCode() ^ 977) ^ 740528677) {
                case -2002127102:
                    z3 = true;
                    str = "ۡۨۢۤۖ۫ۧۗ۬ۜۤۚۛۦۦۘۚۛۨۦۜۢۦ۠ۗۗ۟";
                    break;
                case -1793672960:
                    return z2;
                case -1542389818:
                    str = "ۢ۫ۜۘۦ۠ۥۘۡۘۡۛۢۜۚ۬۠ۗۖۙۡۨۘ۟۠ۜۘ۟ۡ۫";
                    break;
                case -175585656:
                    str = "۠۫ۜۘۨ۠ۖۗۥۧۚۨۧۛۜۡۘ۠ۥۨۘۘ";
                    break;
                case 1591795382:
                    str = "ۡۢۨۨۢۙ۠۫ۡۘۖۦۧۗ۠ۦۘۙ۬ۦۘ۬ۗۛۥۢۘۘ";
                    break;
                case 1679016219:
                    str = "ۖۢۦۘ۟ۚ۫ۚۙۥ۟ۥۢۚۦۨۤۢ۟ۢۛۗ۫۟ۡ";
                    z2 = z3;
                    break;
                case 1757106436:
                    str = "۠۫ۜۘۨ۠ۖۗۥۧۚۨۧۛۜۡۘ۠ۥۨۘۘ";
                    z2 = false;
                    break;
                case 1865714320:
                    String str2 = "ۙۜۤ۠ۚۧۢۙۦۘ۫ۢۢ۟ۜۖۘۤ۠۠ۖۦۥ";
                    while (true) {
                        switch (str2.hashCode() ^ 440211260) {
                            case 183954490:
                                if (f770b.get(i2, 2) == 2) {
                                    str2 = "ۢۧ۫ۤۚۧۚۦۨۨۘۗۘۢ";
                                    break;
                                } else {
                                    str2 = "ۥ۬ۧۛۥۘ۟۠ۥۘ۟۫ۦۘۦۘۧۘ";
                                    break;
                                }
                            case 351013372:
                                str = "ۜۖۙۗۘۨۘۚۧۜۘۢۥۦۚۥ۟ۜۖۢۚۜۘۨۥۗ";
                                continue;
                            case 1644536671:
                                str2 = "ۙ۠ۘۘۘۜۘۘۡۥۥۚۖۥۘۙۘۥۤۦۛ";
                                break;
                            case 1646993284:
                                str = "ۡ۫۠۟۫ۨۘۜۢ۫ۧۚۦ۟ۡۘۤۤ۬";
                                continue;
                        }
                    }
                    break;
            }
        }
    }
}
