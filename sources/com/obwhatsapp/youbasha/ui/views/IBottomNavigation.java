package com.obwhatsapp.youbasha.ui.views;

import com.obwhatsapp.yo.yo;

public interface IBottomNavigation {
    public static final int TAB_CALLS;
    public static final String TAB_CALLS_TAG = "b_calls";
    public static final int TAB_CAMERA = 0;
    public static final String TAB_CAMERA_TAG = "b_camera";
    public static final int TAB_CHATS = 1;
    public static final String TAB_CHATS_TAG = "b_chats";
    public static final String TAB_COMMUNITY_TAG = "b_community";
    public static final int TAB_GROUPS = 2;
    public static final String TAB_GROUPS_TAG = "b_groups";
    public static final int TAB_SETTINGS;
    public static final int TAB_STATUS;
    public static final String TAB_STATUS_TAG = "b_status";
    public static final boolean isGrpSep;

    static {
        String str = "ۥ۬ۚۧۘۙۙۤۖۘۗ۫ۥۘۘۖ۟";
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        boolean z2 = false;
        while (true) {
            switch ((str.hashCode() ^ 419) ^ 840402380) {
                case -2054825026:
                    str = "ۗ۬ۖۘۛۥۧۦۛۢۡۚۚۡ۠ۚ۬ۦۜۘ۠۠ۜۘ۟ۛۦۘۢۜۛ";
                    i8 = i7;
                    break;
                case -1999535120:
                    String str2 = "ۜۗۡۘۛۚۖۘۜۧ۠۬ۨۘۘۗ۟ۖۘۨۢۜۘۘ۟۫";
                    while (true) {
                        switch (str2.hashCode() ^ 1706850866) {
                            case -1093238580:
                                str2 = "۬ۚۗۡۧۥۡۥۘۗ۫ۜۘۧۗۦۘ";
                                break;
                            case 1175284258:
                                str = "۠ۡۛۘۨۛۧۙۗۛۖۤۛۦ۟۠۫ۤۨ۫ۘۘ۠ۤۛ";
                                continue;
                            case 1343224180:
                                if (!z2) {
                                    str2 = "۬ۡۜ۠ۚۦۘ۫ۚۖۘۗ۟ۜۖ۫۬۬ۙۗۦۨۚۥۡۡ";
                                    break;
                                } else {
                                    str2 = "ۘۘۢۦ۟ۗۡ۠ۦۘۙۖۙۗۢۘۘۨۘۨ";
                                    break;
                                }
                            case 1518228098:
                                str = "ۤۤ۬ۜۘۗۨۖۡۘۛۡۥ۟ۤ۫۫ۚۙۜۜۨۥۘۡۜ";
                                continue;
                        }
                    }
                    break;
                case -1767695339:
                    TAB_CALLS = i5;
                    str = "ۜۘۡۘۧۦۨۘۛۘۧۡ۠۫۬۬ۡ";
                    break;
                case -1399915537:
                    str = "۠ۤۨۡۚۚ۠ۥۘۥۢۛۢۙ۟";
                    i6 = 4;
                    break;
                case -1356886461:
                    str = "ۜۙۘۘۛۙۡۤۡۥ۠ۗۖۘۢۦۡۘۡۡۗ۬ۚ۠";
                    i7 = 2;
                    break;
                case -1352432736:
                    str = "ۛۘۖۙۥۨۤ۫ۗۨۜۨۘۗۤۢ";
                    i10 = 3;
                    break;
                case -1269840649:
                    str = "ۚۗۜۘ۬ۡۚۚۨۖ۠ۘۡۤۧ۫ۤۤۧۘۨۘۡۥ۬ۛۖۢ";
                    z2 = yo.isGrpSeparateEnabled();
                    break;
                case -730310481:
                    str = "۟ۨۨۤۗ۟ۨ۟ۡۘۨۚۘۗۦ۬ۚۧ";
                    i5 = i10;
                    break;
                case -688659285:
                    String str3 = "۟۠ۙ۟ۜ۠ۙۘۛۗ۟ۖۘۛ۬ۛ۬ۖۘۘۙۛۦۦۧۘۘ۫۠۟";
                    while (true) {
                        switch (str3.hashCode() ^ -756293882) {
                            case -2010933256:
                                if (!z2) {
                                    str3 = "ۖۘ۟ۧۦۢۜۗۢۤۨۜۘۥۛۦۖۥۗۧۛ۠";
                                    break;
                                } else {
                                    str3 = "ۛۤ۠ۛۤ۠۟ۤۖ۫۫ۦۢ۫ۖۘ۠ۦۨۘۤ۫ۖ";
                                    break;
                                }
                            case -1828551745:
                                str3 = "ۡۚ۫ۧ۟ۢۗۤۢۦۥۦۡ۟ۖۨۨۤ۠ۢۖۙ۠";
                                break;
                            case -1600749853:
                                str = "۬ۗۨۘۖ۠ۖۙۙۘۘۖ۠ۘۘۢۗ۟";
                                continue;
                            case 388400053:
                                str = "ۘۖۜۘۚ۬ۡۜۡۡۤۙۡۘ۠۫۬ۗ۠۬ۘۡۜۡۘۡۘ";
                                continue;
                        }
                    }
                    break;
                case -538786608:
                    str = "ۛۡۜۘ۠ۥۥۘۚۚۦۖۛۖۡۤۧ۬ۚ";
                    i3 = i2;
                    break;
                case -266384849:
                    TAB_STATUS = i8;
                    str = "ۚۡۡۧۤۨۘۜ۫۟۠ۘۜۘۖۙ۠ۜۨۘۖۚۧ۬ۤۦ۠ۡۘ";
                    break;
                case -132960446:
                    TAB_SETTINGS = i3;
                    str = "۬ۢ۠ۘ۬ۦۘۘ۟ۨۘۢۙۖۢۤۡۘ۟ۘۥۘۤۙۖ";
                    break;
                case -105933370:
                    String str4 = "۟۟۫ۧۛۙۘۛۡۘۥۘۜۦۚ۬";
                    while (true) {
                        switch (str4.hashCode() ^ -1449383992) {
                            case -1488192350:
                                str = "ۛۡۜۘ۠ۥۥۘۚۚۦۖۛۖۡۤۧ۬ۚ";
                                continue;
                            case 558944177:
                                str4 = "ۘ۬ۖۘۛ۟ۡ۫ۢۚ۠ۜۗۖ۬ۨۘۛ۬۬۠ۜۨ۠ۨۗۜۤ";
                                break;
                            case 717264043:
                                if (!z2) {
                                    str4 = "ۙۗۡۥ۟ۤۨ۟ۦ۠۫ۤۦۦ۟۬ۛۜۜۨۡۦۨۦۘ";
                                    break;
                                } else {
                                    str4 = "ۜۧۥۤۨۙۨۘۘۚۘۖۘ۟ۢۡۗ۠ۗۢۥۙ";
                                    break;
                                }
                            case 1746044393:
                                str = "ۧۚ۫ۦ۬ۥۚۤ۬ۥۢۨ۟۠۫۫۠ۡۤۘ۠";
                                continue;
                        }
                    }
                    break;
                case -42565011:
                    str = "ۗ۬ۖۘۛۥۧۦۛۢۡۚۚۡ۠ۚ۬ۦۜۘ۠۠ۜۘ۟ۛۦۘۢۜۛ";
                    break;
                case 15513374:
                    str = "۠ۡۛۘۨۛۧۙۗۛۖۤۛۦ۟۠۫ۤۨ۫ۘۘ۠ۤۛ";
                    i5 = i4;
                    break;
                case 317411661:
                    str = "ۗۢۜۧ۟ۖۗۦ۬۫ۨۘۨۚۜۦۢۗۗۖۜۘۖۨۘۤ۬ۙ";
                    i8 = i9;
                    break;
                case 572034962:
                    str = "۫۫ۙۗ۟ۛ۠ۧ۟ۧۥۦۨ۬ۗ";
                    i3 = i6;
                    break;
                case 621625867:
                    return;
                case 1192934932:
                    isGrpSep = z2;
                    str = "ۘۢۨۘۡۖۖۘ۬ۘۜۛۥۘۢۜۡۘۧ۫ۛ۠ۛۡ";
                    break;
                case 1847062165:
                    i2 = 5;
                    str = "ۛۘ۠۬ۙۧۜۜۜۢ۠ۢۨۚۜۘۥۤۥۘ";
                    break;
                case 1899482944:
                    str = "ۤۛۘۘۡۡۦۘ۬۠ۦۥ۬ۖۘۗ۟ۥۛۡۖۗ۬ۗۜۡۘۘ";
                    i9 = 3;
                    break;
                case 2034676104:
                    str = "ۡۧۦ۫ۛۘۘۧۢ۠ۘۘۤۛۨۜۢۜ۫";
                    i4 = 4;
                    break;
            }
        }
    }

    int getCurrentActiveItemPosition();

    void setBadgeValue(int i2, String str);

    void setCurrentActiveItem(int i2);

    void updateIconsColors();
}
