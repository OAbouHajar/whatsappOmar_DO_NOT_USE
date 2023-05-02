package com.obwhatsapp.yo;

import android.text.format.DateUtils;
import android.widget.TextView;

public final class t1 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final long f883a;

    /* renamed from: b  reason: collision with root package name */
    public final TextView f884b;

    public t1(long j2, TextView textView) {
        this.f883a = j2;
        this.f884b = textView;
    }

    public final void run() {
        String str = "ۙۖۙۚۨۥۘۛۘۧ۠ۗۨۘ۬۫ۥۚۢۤۘۡۜۘۘۚۥۘۢۧۦ";
        TextView textView = null;
        String str2 = null;
        while (true) {
            switch ((str.hashCode() ^ 112) ^ -864699031) {
                case -1523126460:
                    str = "۠۟ۖۘ۟ۚ۟ۗۨۘۘ۫ۘۡۗۦۢۨۥۘۘۨۗۗۢۤۖ";
                    break;
                case -1107429836:
                    textView = this.f884b;
                    str = "ۘۨۧۘ۬ۚۙۨۦۡۘۖۜ۬۫ۙ۠ۢۥۧۘۥۙ۬ۦۖ۫۫ۖۘ";
                    break;
                case -838780603:
                    str = "ۦ۬ۜۘۜ۫ۨۚۚۥۘۤۘ۫ۤۘۦۤۖۢ۠ۧۥۘۧۘۡۦۤۖ";
                    str2 = String.valueOf(DateUtils.getRelativeTimeSpanString(this.f883a));
                    break;
                case -405409006:
                    textView.setText(str2);
                    str = "۟ۢۜ۟ۛۡۘۙ۠ۢۚ۠ۤۡۦۖ۬ۛ۟";
                    break;
                case 1552563531:
                    return;
                case 1888924375:
                    textView.postDelayed(this, 60000);
                    str = "ۤۥۖ۬ۤۜ۬ۥۧۘۤۤۖ۟ۚۨ۟۫ۨۖۛۨۦۨ۫";
                    break;
            }
        }
    }
}
