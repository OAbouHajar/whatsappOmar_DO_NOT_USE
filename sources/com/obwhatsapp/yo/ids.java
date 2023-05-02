package com.obwhatsapp.yo;

import java.util.Locale;

public abstract class ids {

    /* renamed from: a  reason: collision with root package name */
    public static final i1 f783a = new i1();

    static {
        String str = "ۥۧۜ۬ۤۛۜۚۤۥۥۦۘۚ۟ۡۗۤۤۗۗۦۚ۫ۚۗ۬ۤ";
        while (true) {
            switch ((str.hashCode() ^ 717) ^ 1250452741) {
                case 20347139:
                    return;
                case 1760335626:
                    str = "ۨۡ۟ۗ۫ۦۛۗۘۘۘۜۜ۫ۦۜۘۡۥ";
                    break;
            }
        }
    }

    public static int getId(String str) {
        try {
            Integer num = (Integer) f783a.get(str.toLowerCase(Locale.ENGLISH));
            String str2 = "ۚۘۙۥۥۖۘۤۦۢ۠ۛۘۘۜ۬ۖۧۖۖۘۗۥۖۘ۟۫ۚۥۜۖ";
            while (true) {
                switch (str2.hashCode() ^ 1609530578) {
                    case -2094907496:
                        str2 = "۠۠۠۫ۗۜ۟ۡۘ۫ۢۨۘۨۡۚۦۨۢۢۦ۠۬۬ۥۨۙ۫";
                        continue;
                    case -1665435554:
                        break;
                    case 720325352:
                        if (num == null) {
                            str2 = "ۚۜ۫۬ۧۖۘۙۧۦۘۚۖۧۤ۟۬";
                            break;
                        } else {
                            str2 = "ۖۢۙۘ۠۟ۗۤ۬ۥ۬ۦۘ۟ۡۡ۟۫ۥۖۤۢ۠ۡۗ";
                            continue;
                        }
                    case 782775671:
                        return num.intValue();
                    default:
                        continue;
                }
            }
        } catch (Exception e2) {
        }
        return -1;
    }
}
