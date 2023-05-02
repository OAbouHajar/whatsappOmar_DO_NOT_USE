package com.obwhatsapp.yo;

import java.io.File;
import java.io.FileFilter;

public final /* synthetic */ class r1 implements FileFilter {

    /* renamed from: a  reason: collision with root package name */
    public final int f866a;

    public /* synthetic */ r1(int i2) {
        this.f866a = i2;
    }

    public final boolean accept(File file) {
        String str = "ۤۖۡۙۧۨۘۖۘۥۜۤۖۙۦۧۘۗۚۦۘۚ۬ۚۨۗۦۘ";
        while (true) {
            switch ((str.hashCode() ^ 560) ^ -1554780400) {
                case -2007175984:
                    return file.isFile();
                case -1735156692:
                    str = "ۨۛ۟ۖۛۡۘۦۛۥۘۢۙۘ۫ۨۧۚۢۨۘۦۢۖ";
                    break;
                case -839264407:
                    return file.isFile();
                case -575867405:
                    return file.isDirectory();
                case 1645605:
                    return file.getName().startsWith("msgstore-");
                case 356592739:
                    return file.isFile();
                case 561973049:
                    return file.isFile();
                case 606306851:
                    return file.getName().startsWith("msgstore-");
                case 760280411:
                    return !file.isHidden();
                case 1143837759:
                    return file.isFile();
                case 1261939561:
                    return file.isFile();
                case 1363978942:
                    str = "ۨۜۖۨ۠ۘۢۖۚۨۖۙۨۤۢۚۢۡ۠ۛ۠";
                    break;
                case 1568328431:
                    str = "ۤۡۢۘۖ۬ۢ۬ۙ۠ۛ۟ۘۙۢ";
                    break;
                case 1919653699:
                    switch (this.f866a) {
                        case 0:
                            str = "ۧۜۨۙۚۦ۟ۧ۫ۦۡۜۘ۠ۥ۬";
                            break;
                        case 1:
                            str = "ۢۧۚۙۜۧۡۙۚۢۨۧۢ۫ۜ";
                            break;
                        case 2:
                            str = "۟۟ۨۥۖۙۦۥۘ۠ۢۘۘ۟ۧۘۘ";
                            break;
                        case 3:
                            str = "ۧۢۖۘۧۘۘۤۦۘۘۤۧ۠ۢۙۛ";
                            break;
                        case 4:
                            str = "ۥۜۖ۫ۖ۟ۜ۟ۡۘۘ۬۠ۧۨ۠ۘۚۡۘ";
                            break;
                        case 5:
                            str = "ۙۚۘ۫ۤۛۤۛ۬۠ۜۛ۬۠";
                            break;
                        case 6:
                            str = "ۧۤۡۘۤۘۡۢۢۚۚۛۗۦۢۢ۫۟ۙ";
                            break;
                        case 7:
                            str = "ۦۦۦۘۗۤۗۛۘۤۗۚۜۤۧۧ۟ۖۨۡۥۘ۟ۚۖۨۨۦۘ";
                            break;
                        case 9:
                            str = "ۛۡۛۙۙۥۥۢ۫۬ۘۜۘۡۗۨۘۦۗۡۘۚۢۡۘۧۙ۫ۥ۟ۙ";
                            break;
                        case 10:
                            str = "ۘۘ۬ۦۛۖۘۥۙۤۚۢۤ۫۟";
                            break;
                        default:
                            str = "ۛۡۦۨۜۖۜۨۡۗۥۥۘۛۧۜۘ۫ۨۡۘۗۙۚۨ۫ۗ";
                            break;
                    }
                case 2004677268:
                    return file.isFile();
            }
        }
    }
}
