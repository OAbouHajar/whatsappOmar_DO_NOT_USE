package com.obwhatsapp.yo;

import X.C15830rv;
import android.content.Context;
import com.obwhatsapp.jobqueue.job.SendReadReceiptJob;
import com.obwhatsapp.youbasha.task.YTranslate;
import com.whatsapp.jid.DeviceJid;

public final /* synthetic */ class f1 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final int f764a;

    /* renamed from: b  reason: collision with root package name */
    public final String f765b;

    public /* synthetic */ f1(int i2, String str) {
        this.f764a = i2;
        this.f765b = str;
    }

    public final void run() {
        String str = "ۚۦۢۡۡۦۘ۠ۗۗۥۦۚۙ۟ۨۘ۠ۗ۠";
        StringBuilder sb = null;
        String[] strArr = null;
        String str2 = null;
        int i2 = 0;
        while (true) {
            switch ((str.hashCode() ^ 322) ^ -40699332) {
                case -1251190774:
                    sb.append("rpass");
                    str = "۟۬ۖ۠ۢۜ۠ۨۦۦۗۗۛۧۘۨۧۘۡۡۗ";
                    break;
                case -1014830175:
                    dep.a(new SendReadReceiptJob(dep.gen_b(str2), (C15830rv) null, (DeviceJid) null, strArr, System.currentTimeMillis(), 0, false));
                    str = "ۤۘۥۘ۬ۘۛ۫ۦۢ۬ۘۜ۬ۖۥۘ۠ۘۘۤۧۜۙۧ";
                    break;
                case -765107265:
                    str = "۫ۙۘۙۙۡۘۨۛۧۚۢ۬ۧۨۢ";
                    str2 = this.f765b;
                    break;
                case -95820405:
                case 26501754:
                    return;
                case 232034924:
                    new CustomAlertDialogBuilder((Context) YTranslate.f1100a.get()).setTitle((CharSequence) "Translated").setMessage(str2).setPositiveButton(17039361, new o(1, str2)).setNegativeButton(17039370, new x(12)).create().show();
                    str = "ۡۥ۬ۖۡ۠ۥ۟ۥۘۨۨۘۗ۫ۖۘۙۨۥۘۡۡۡ۠۟ۙۗ۬";
                    break;
                case 338570668:
                    str = "ۢۧ۟ۥۧۤۡۦۧۘ۠ۖۦۘۧۘۨۘۤۤ";
                    break;
                case 462364301:
                    sb.append(strArr[0]);
                    str = "۬ۥۢۦۢۡۥ۠ۛۚۜۛۘۧۨۘ";
                    break;
                case 507342990:
                    switch (i2) {
                        case 0:
                            str = "۫ۨ۠ۢۘۧۘۜ۬ۘۘ۠ۗۧۨۛۧ۬ۧۘۘۧۥۖۘ";
                            break;
                        default:
                            str = "ۥ۟ۤۚۖۧۘۜۥ۬۬ۡۨ۟ۙۡۘ";
                            break;
                    }
                case 952790045:
                    str = "ۤ۫ۜۘۥۙۜۨۤۢ۬ۛۖ۟ۥ۟";
                    sb = new StringBuilder();
                    break;
                case 1035475815:
                    strArr = dep.g(str2);
                    str = "۟ۗۖۘۦۚۡ۟ۥۜۘۛۥۢ۬ۚۜۘ";
                    break;
                case 1042639193:
                    str = "ۙۛ۠ۨۘۘۘ۟ۙۘۨ۫ۡۘ۠ۗ۟۫ۖۥۘۨۡۖ";
                    i2 = this.f764a;
                    break;
                case 1202385647:
                    shp.setBooleanPriv(sb.toString(), true);
                    str = "ۘۢۙۧۚۘۘ۠ۨ۟ۜۘۦۘۙۡۧۜۤۤ۟۫۫";
                    break;
                case 1741536563:
                    String str3 = "ۢۧۛۛۢۘۘۛۚۢ۬ۘۙۨۡۧۘۘۦۦۘ";
                    while (true) {
                        switch (str3.hashCode() ^ -1607210322) {
                            case -765750180:
                                str3 = "ۡ۟ۨ۟ۜۢۜۤۖۖۚۖ۟ۚۢ۟ۧۚۨۘ";
                                break;
                            case 281300287:
                                if (strArr == null) {
                                    str3 = "۬ۗۖۦۛ۟۟ۙۧۥۤۤۥۘۗۡۘۡ";
                                    break;
                                } else {
                                    str3 = "ۤۚۧۚۙۥ۠ۡ۟ۗۘۜۘۚۡ۟";
                                    break;
                                }
                            case 1290907348:
                                str = "ۖ۬ۨۤۢۚۚۘۦۘۧۘۦۘۖۛۙۙۦۗۖۘۘ";
                                continue;
                            case 1613349491:
                                str = "ۤۘۥۘ۬ۘۛ۫ۦۢ۬ۘۜ۬ۖۥۘ۠ۘۘۤۧۜۙۧ";
                                continue;
                        }
                    }
                    break;
                case 2060153222:
                    str = "ۛۚ۬ۙۜۚۤۘۜۘۜ۠ۨۘۛ۟ۥۘۘۢۡ";
                    break;
            }
        }
    }
}
