package com.obwhatsapp.yo;

import com.joom.paranoid.Deobfuscator$app$Custom;
import com.obwhatsapp.youbasha.ui.YoSettings.Themes;
import java.io.File;
import java.io.FilenameFilter;

public final /* synthetic */ class h0 implements FilenameFilter {

    /* renamed from: a  reason: collision with root package name */
    public final int f777a;

    public /* synthetic */ h0(int i2) {
        this.f777a = i2;
    }

    public final boolean accept(File file, String str) {
        String str2 = "ۚۗۖۘۢۨۦۨۖۜۥ۟ۘۘۗۘۤ";
        while (true) {
            switch ((str2.hashCode() ^ 98) ^ -287666176) {
                case -2146111817:
                    switch (this.f777a) {
                        case 0:
                            str2 = "ۗۡۦۘۜۜۜۛۖۛۡۚۘۢۖۖۥۖۡۘۤۥۗۨۧۙۥ۫ۘ";
                            break;
                        default:
                            str2 = "ۧۡۛ۠۠ۢۛۥۙ۟۠ۦۘۤۛۥۘۥۜۢ۬ۖۤ";
                            break;
                    }
                case -1878591426:
                    str2 = "۟ۗۦۨۨۜۘۙۛ۠ۧۛۤۖۖ۬ۗۤۡۗۜۘ";
                    break;
                case -1685569944:
                    return str.endsWith(Deobfuscator$app$Custom.getString(-33683774209473L));
                case -185305437:
                    str2 = "۬ۦ۟ۛۚۖۛۥۘۛۚ۟ۧۦۦۘ";
                    break;
                case -66937599:
                    return str.startsWith(SS.f562i);
                case 237444397:
                    str2 = "ۦۢۜۘۥۨۧۨۨۜ۫ۥۙ۫ۤۦۛۢ۫۫ۛۖۘۜۥ";
                    break;
                case 316908943:
                    String str3 = Themes.newFMThemes_folder;
                    str2 = "ۚۡۡۘۘ۬ۢۘۨ۫۟ۖۡۘۖۚۦۘۖ۠ۥۤۧۧ۟ۘۚ۠ۥۜۘ";
                    break;
                case 1925951736:
                    str2 = "۠ۨۚۨۘۖ۠ۧۥۘۖ۠ۢ۫ۨۦ۠۫ۚۥۤۗۦۜۜۥۘۜۘ";
                    break;
            }
        }
    }
}
