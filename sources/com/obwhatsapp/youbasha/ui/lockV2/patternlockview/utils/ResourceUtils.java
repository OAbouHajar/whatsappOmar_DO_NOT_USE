package com.obwhatsapp.youbasha.ui.lockV2.patternlockview.utils;

import android.content.Context;
import androidx.annotation.ColorRes;
import androidx.annotation.DimenRes;
import androidx.annotation.NonNull;
import androidx.annotation.StringRes;
import androidx.core.content.ContextCompat;

public abstract class ResourceUtils {
    public static int getColor(@NonNull Context context, @ColorRes int i2) {
        String str = "ۢۤۘ۠ۨۘۚۥۥۘۖ۬۟ۥۨۤۢۨۨۘ";
        while (true) {
            switch ((str.hashCode() ^ 380) ^ -989900512) {
                case -1212104146:
                    str = "ۦۧ۬ۙۥۛۗۤۢۛ۬ۨۘۡۨۘۨۘۘۨۜ۟ۘۥۧۘ۬ۘ۫";
                    break;
                case 360780835:
                    return ContextCompat.getColor(context, i2);
                case 828113434:
                    str = "ۜ۠ۖۘۢۨۦ۟۟ۦۚ۠ۚۖ۟ۗۙۤۜۧۦۜ";
                    break;
            }
        }
    }

    public static float getDimensionInPx(@NonNull Context context, @DimenRes int i2) {
        String str = "۟۫ۡ۫ۨۨۘۜۧۥۦۛۢۥۧۘ۬ۖ۫ۖۙۧۤۢۖۘ۟ۥۖۘ";
        while (true) {
            switch ((str.hashCode() ^ 704) ^ -739724060) {
                case -579332760:
                    str = "ۡۧۦۘۦۧ۟۟ۥۖۘۙ۟ۧۤۚۨ";
                    break;
                case 611568090:
                    return context.getResources().getDimension(i2);
                case 687419067:
                    str = "ۦۜۨۘۧۘۚۧۖ۬ۗۢۡۘۤ۫۠ۜۢۦۘۢۡۢۚۘۦۘ";
                    break;
            }
        }
    }

    public static String getString(@NonNull Context context, @StringRes int i2) {
        String str = "ۨۘ۬ۛۖۥ۟ۤۖۚ۠ۚۘۦۥۘۦۙۨۘۛۦۧۙۗۗۦۛ۫";
        while (true) {
            switch ((str.hashCode() ^ 202) ^ 350874933) {
                case -216321308:
                    return context.getString(i2);
                case 501184521:
                    str = "ۡۤۨ۫ۥۙۚۜۨۛۗۡۘ۬ۘۥۘۡۧۜۜۢۖۘۚ۟ۡۨۧۘۘ";
                    break;
                case 2108249435:
                    str = "ۚۜۤۧۛۚۖۗۜۘۗۦۜۡ۫";
                    break;
            }
        }
    }
}
