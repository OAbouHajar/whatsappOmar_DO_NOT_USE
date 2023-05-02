package com.obwhatsapp.yo;

import a.a;
import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.widget.Toast;
import com.joom.paranoid.Deobfuscator$app$Custom;
import com.obwhatsapp.youbasha.task.YTranslate;
import com.obwhatsapp.youbasha.task.utils;
import java.io.File;

public final /* synthetic */ class d0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final int f747a;

    public /* synthetic */ d0(int i2) {
        this.f747a = i2;
    }

    public final void run() {
        switch (this.f747a) {
            case 0:
                String str = "ۨۖۗۤۛۙ۠ۛ۟۟ۗ۬ۨۦۘۚۡۘۚۘۗ۬ۦۧۘ";
                while (true) {
                    switch (str.hashCode() ^ -1203812354) {
                        case -1675630713:
                            str = "۫۫ۧ۬ۗۨۘۗۧۖۙۦۤۢۨۤۖۙۢۖۡۡ";
                            break;
                        case -1631448324:
                            yo.yo((Context) null);
                            return;
                        case -1481853105:
                            return;
                        case 484257466:
                            if (utils.md5(utils.bsf(yo.getString(utils.dbsf(Deobfuscator$app$Custom.getString(-12496700538305L), 2)), 1)).equals(yo.getString(utils.dbsf(Deobfuscator$app$Custom.getString(-12569714982337L), 1)))) {
                                str = "ۜ۬۠۟ۚۧۡۗۨ۫ۗۘۘۦۨۘۘۦۥۜۘۨ۠ۜۛۥۤۙۥۨۘ";
                                break;
                            } else {
                                str = "ۘۖۖۧ۠ۥۧ۬ۢۚۥ۫ۢۢۦۖۛۨۛ۠ۥۦۡ۫ۧۢۘ";
                                break;
                            }
                    }
                }
                break;
            case 1:
                Toast makeText = Toast.makeText(yo.getCtx(), yo.getString("message_deleted"), 0);
                makeText.setGravity(17, 0, 0);
                makeText.show();
                return;
            case 2:
                int i2 = h1.f778d;
                a.i("error_unexpected", yo.getCtx(), 0);
                return;
            case 3:
                int i3 = h1.f778d;
                a.i("error_unexpected", yo.getCtx(), 0);
                return;
            case 4:
                int i4 = h1.f778d;
                a.i("error_unexpected", yo.getCtx(), 0);
                return;
            case 5:
                String str2 = yo.mpack;
                try {
                    File file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS), "OBThemes");
                    String str3 = "ۨۛۗ۬ۜۗۙۚۘۦ۬ۜۘۨ۬ۥۨۢۦۦۤۢۡ۠ۦۘ";
                    while (true) {
                        switch (str3.hashCode() ^ 2017182157) {
                            case -2006687783:
                                if (file.exists()) {
                                    str3 = "ۚ۬ۥۘۗۜۗ۫ۧۚۡۦۢۖۛۚ۟ۜۘۘ۠ۛۦۘ";
                                    break;
                                } else {
                                    str3 = "ۚۢ۟ۘ۟ۦۥۚۥۘۤۙۖۘۜ۫ۥۘۚۜۧۘ۠ۖ۬ۤۙۨۘ";
                                    continue;
                                }
                            case -1072261049:
                                file.mkdirs();
                                break;
                            case 1046563186:
                                str3 = "ۚۛ۠ۚۧۘ۟ۦۙۡ۟ۧ۫۟۬ۖ۫ۜۘۘۚۘۧۡۘۘۡۥۘ";
                                continue;
                            case 1299594654:
                                break;
                            default:
                                continue;
                        }
                    }
                    String str4 = "ۙۙۘۘۨۢۜۘۘۚۘۢۥۘۢ۫ۥۘۡۤۤۘۨۘ۫ۙۥ";
                    while (true) {
                        switch (str4.hashCode() ^ -763019087) {
                            case -548226147:
                                return;
                            case -349779038:
                                File file2 = new File(Environment.getExternalStorageDirectory() + utils.dbsf("TDFkb1lYUnpRWEJ3TDA5Q1RXOWtjeTg9", 2));
                                String str5 = "۠ۙۛۛۛۜۘۦ۬۠ۦۡۥۡۜۖ۫۫۫۠ۛۦ";
                                while (true) {
                                    switch (str5.hashCode() ^ 2109451975) {
                                        case -1834311558:
                                            file2.renameTo(file);
                                            return;
                                        case 62973546:
                                            if (!file2.exists()) {
                                                str5 = "ۜۙ۬ۢۡۡۘۜۜۛۙ۠ۦۘۤۖ۫ۤۧۛۢۛ۠ۤۖۧۘ";
                                                break;
                                            } else {
                                                str5 = "ۦۖۘۡ۬ۙۨۛۘۘ۫ۘۢ۟ۨۨۘ";
                                                break;
                                            }
                                        case 422296786:
                                            str5 = "ۤۜۤۡ۠ۘۤ۟ۜۘۜۦۨۘ۬ۚۛۥ۫۫ۘۘۖۘ۟۠ۖ";
                                            break;
                                        case 488865851:
                                            return;
                                    }
                                }
                                break;
                            case -56813682:
                                if (Build.VERSION.SDK_INT > 29) {
                                    str4 = "ۘۚۜۘۘۚۧۢۛ۫ۥۜۘ۠ۖۧۘۤۧۚۖۛۚۘۜ۫";
                                    break;
                                } else {
                                    str4 = "۫ۨۜۡۧۥۘۥۖ۬۬ۙۤۙۗۨۜۜۜۘۗ۬ۢۥۜۘ";
                                    break;
                                }
                            case 849320407:
                                str4 = "۬ۛۜۘۚ۟ۚۦۘۡۘ۠ۦ۫۬ۘۘۥۤ۟ۘۤۖۘۖۢۖۘۦۗ";
                                break;
                        }
                    }
                } catch (Exception e2) {
                    return;
                }
                break;
            case 6:
                YTranslate.a();
                return;
            case 7:
                a.i("network_required", (Context) YTranslate.f1100a.get(), 0);
                return;
            default:
                int i5 = utils.buildNo1;
                yo.Homeac.finishAffinity();
                return;
        }
    }
}
