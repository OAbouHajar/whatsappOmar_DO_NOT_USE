package com.obwhatsapp.yo;

import android.app.ProgressDialog;

public final /* synthetic */ class l0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final int f797a;

    /* renamed from: b  reason: collision with root package name */
    public final n0 f798b;

    /* renamed from: c  reason: collision with root package name */
    public final int f799c;

    public /* synthetic */ l0(n0 n0Var, int i2, int i3) {
        this.f797a = i3;
        this.f798b = n0Var;
        this.f799c = i2;
    }

    public final void run() {
        String str = "ۙۢۦۘۜۖۖۘ۬ۤۗۛ۬ۡۘۥۦۛۚۢۥۘۚ۟ۘۨۗۡۘ";
        ProgressDialog progressDialog = null;
        n0 n0Var = null;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            switch ((str.hashCode() ^ 498) ^ 861635458) {
                case -1372138397:
                    progressDialog.show();
                    str = "ۥۥۥۘۙۙۨۘۧ۟ۙۙۡۦۘ۫ۥۦۡۘۦۛۘۢۙ۬ۦۘ";
                    break;
                case -1078566224:
                    progressDialog = n0Var.f830d;
                    str = "ۤۚۥۘۨۖ۫۠ۗۖۖۧۜۘ۬۬ۜۦۗ۫ۘۘۥۘ۠";
                    break;
                case -1016054899:
                case 53446847:
                    return;
                case -356684334:
                    str = "ۘۥ۟ۜۙۘۘۖۡۥۥۢۨۨۧۜ۟۬ۗۨۘ";
                    i3 = this.f797a;
                    break;
                case -335655452:
                    str = "۫ۚۤ۬۫ۢۦۚ۟۟ۤۛۗۜۧۗۦۛۨ۫ۜۘ";
                    break;
                case -17616807:
                    str = "۬۟ۧۢۗۡۨۛۚ۫۟ۙ۫ۡۙۗ۟ۧۤۦۨۘۛۜ۟ۧۜ۫";
                    break;
                case 347293639:
                    progressDialog.setMax(i2);
                    str = "ۤۢۥۘۛۡۗ۟ۤ۬ۤۡۖۥۦ";
                    break;
                case 1017532301:
                    str = "ۙۨۦۘۜۢۦۧۙۘۘ۬ۚۗۦۨۜۚۤ۬";
                    i2 = this.f799c;
                    break;
                case 1237380492:
                    n0Var.f830d.setProgress(i2);
                    str = "۟۟ۦۘۥۦ۠۬ۛۡۘ۟ۗۚۨۨۨۘ۟۬ۤ۫ۤۨۥۙۦۘ";
                    break;
                case 1353118240:
                    switch (i3) {
                        case 0:
                            str = "۟۬ۖۜ۟ۢۤۖۡ۫ۗۨۧۦۘ۫ۖۘۘۙۨ۫ۧ۬";
                            break;
                        default:
                            str = "ۜۚۜۛۧۛۙۢۤۘ۟ۦۘۥ۬ۥ۬ۢ۬ۛۨۡۘۡ۟ۦ";
                            break;
                    }
                case 1898397136:
                    str = "ۖۥ۬ۖۘۡۘۚ۟ۗ۠ۖۧۥ۟ۡ۫ۛۘۘ۟ۙۧۦ۠ۚۡۛ۟";
                    n0Var = this.f798b;
                    break;
            }
        }
    }
}
