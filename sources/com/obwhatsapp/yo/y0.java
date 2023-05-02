package com.obwhatsapp.yo;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.joom.paranoid.Deobfuscator$app$Custom;
import com.obwhatsapp.youbasha.task.utils;
import com.obwhatsapp.youbasha.ui.lockV2.LockBaseActivity;

public final /* synthetic */ class y0 implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final int f913a;

    /* renamed from: b  reason: collision with root package name */
    public final Activity f914b;

    public /* synthetic */ y0(Activity activity, int i2) {
        this.f913a = i2;
        this.f914b = activity;
    }

    public final void onClick(View view) {
        int i2 = 0;
        String str = "۬ۡۡۘۗۚۗۛۧ۠۬ۚۧ۫ۙ۟۠ۛۛۛۡۘۗۢ۬";
        Intent intent = null;
        Activity activity = null;
        while (true) {
            switch ((str.hashCode() ^ 440) ^ -444229201) {
                case -1949060626:
                case -81127106:
                    return;
                case -1934445622:
                    str = "ۥۤۡ۬ۦۤۙۜۥ۟ۡۛۛۚ";
                    break;
                case -1688483449:
                    activity.startActivity(intent);
                    str = "ۜۨۨۘۙۨۜۘۜۦۥۘۘۥۥۘۘۦۖۦۚ۬ۘ۠ۡۨۦ۠ۖۘۘ";
                    break;
                case -1631302487:
                    str = "۫ۨۢۜۜۜ۠۬ۦۤ۟۠ۦ۫ۥۘۜۗۘۘۨ۫۠";
                    i2 = this.f913a;
                    break;
                case -1091217970:
                    activity.finish();
                    str = "ۙ۠ۧۗۨۧۘۖ۠ۜۙۚۛۙۦ۠";
                    break;
                case -662308437:
                    z0.f925i = utils.dbsf(shp.getStringPriv(Deobfuscator$app$Custom.getString(-2467951902145L)), 2);
                    str = "ۜ۫۬ۛۤۘۘۧۖ۬ۘۗۜۥۥۜۘۨ۟ۙۤۦۗۗۗۦۘ";
                    break;
                case -488402337:
                    str = "۫ۘۧ۠۬ۖۖۢۜ۫ۙۙۘۚۜۙۙ۟";
                    activity = this.f914b;
                    break;
                case -387407747:
                    String str2 = "ۛۧ۬ۗۛۖۘ۬ۤۡۘۙۤۥۦ۠ۚۗۧۦ۠ۜۘۘ";
                    while (true) {
                        switch (str2.hashCode() ^ 919365699) {
                            case -1562178222:
                                str2 = "ۥۜۘ۫ۦۜۘۚ۫ۥۘۜۙۜۘ۬ۧ۫ۘۖۛ";
                                break;
                            case -422839724:
                                if (z0.f925i != null) {
                                    str2 = "ۗۖۘۛۛ۫ۥۤۛۖۜۖ۫۫ۡۘ۟۟ۗۖۘ۫";
                                    break;
                                } else {
                                    str2 = "ۡۜۛۖۦ۠ۗ۟ۡۘۘۖۚ۠ۤ";
                                    break;
                                }
                            case 138853324:
                                str = "ۜ۫۬ۛۤۘۘۧۖ۬ۘۗۜۥۥۜۘۨ۟ۙۤۦۗۗۗۦۘ";
                                continue;
                            case 587207009:
                                str = "ۗۖۖۘ۠ۖۨۘۧ۫ۖۘۛۧۖۘۦۖۧ";
                                continue;
                        }
                    }
                    break;
                case 50136999:
                    switch (i2) {
                        case 0:
                            str = "۠ۧۡۡۜۤۤۨۜ۟ۦ۬۬ۨۢ";
                            break;
                        default:
                            str = "ۤۜۛۦۢۢۢ۠ۖۘۨۨۦۜۚۘۘۧۡۡۘۤۙۥۙ۠";
                            break;
                    }
                case 362603228:
                    str = "ۢۨۢ۠۫۬ۘۛۜ۬۟ۜۘۡ۫ۚۖۢ۠ۛۛۤ";
                    break;
                case 814312755:
                    String str3 = LockBaseActivity.lockWallPath;
                    str = "ۗۜۗۘۘۛ۟۠ۨۨۨۘۨۖ۠ۥۧۥۘۧۗۖۢ۬ۜ";
                    break;
                case 1910288498:
                    str = "ۡۖۙ۟ۙۦۚۗۖ۠ۧۡۘ۟ۥ۟۠۟ۦۘ۟ۢۦۘۛۨۡ";
                    break;
                case 1992736848:
                    intent = new Intent(Deobfuscator$app$Custom.getString(-2502311640513L), Uri.parse(z0.f925i));
                    str = "ۢۢ۟ۡۘۢۘۦۘۗۡۛ۠ۥۧۘۛۤۖۥۖۦ۟ۖۥۤ۬";
                    break;
                case 2142531698:
                    intent.addFlags(268435456);
                    str = "ۢۜۚۡۥۧ۠ۤ۠ۖۛۜۘۜۢۨۘ";
                    break;
            }
        }
    }
}
