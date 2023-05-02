package com.obwhatsapp.yo.autoschedreply;

import android.view.View;

public final /* synthetic */ class i implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final int f696a;

    /* renamed from: b  reason: collision with root package name */
    public final AutoMsg f697b;

    public /* synthetic */ i(AutoMsg autoMsg, int i2) {
        this.f696a = i2;
        this.f697b = autoMsg;
    }

    public final void onClick(View view) {
        int i2 = 0;
        AutoMsg autoMsg = null;
        String str = "ۜ۫ۥ۟ۢۡۘۤ۬ۘۘ۠۫ۧۘۦۤ۟ۧۥ۠ۦۦۘۢۤۜۘۛۤۦ";
        while (true) {
            switch ((str.hashCode() ^ 567) ^ 1682332741) {
                case -1576977486:
                    autoMsg = this.f697b;
                    str = "ۖۢ۟ۖۗۤۧۢۜۦ۬ۜۚۡۦۘۤۚ۠ۢۖۨۘۧۤۡۘ";
                    break;
                case -1517057386:
                    switch (i2) {
                        case 0:
                            str = "۬ۢۢۖۡۧۜۡۘۤۖۧ۬ۙۙ۠ۚۗۧ۟";
                            break;
                        default:
                            str = "ۡۧ۫ۧۜۥۧۦۘۨۛ۟۬ۚ۫ۗۦۦۘ۠ۙۦۘ";
                            break;
                    }
                case -1503882098:
                case 653329766:
                    return;
                case -1242657298:
                    str = "۠ۥۜۖۚۨۥۛ۬ۥۨۢۖۤ۬ۧۡۙۗۜۜۘۙۖۛ";
                    break;
                case 143784607:
                    autoMsg.Edit(view);
                    str = "۟ۜۥۦۢۖۘۛۗۡۥۤ۬ۖۤ";
                    break;
                case 297864372:
                    str = "ۚۙ۫ۨۗۨۘۦۦۧ۫ۢۦۧۢۥۘۙ۬۠۫۬ۡۘۨۛۘ";
                    break;
                case 388843945:
                    int i3 = AutoMsg.f637t;
                    str = "ۨۜۜۦۚ۫۬۠ۥۘۚ۫ۦۨۢۢ";
                    break;
                case 1433355481:
                    str = "۬ۛۗ۟ۚۙۨۙۥۘۨ۟ۘۘۡۛۖۡۘۨۨۥۥۘۗۢۨۘۛۗۚ";
                    break;
                case 1458131419:
                    autoMsg.onBackPressed();
                    str = "ۧۡۦۘۖۘ۟ۤۜۡۧۛ۫ۛۖۛۡۢ۫۟ۖۖۨۖۘ";
                    break;
                case 1691044819:
                    i2 = this.f696a;
                    str = "۫۫ۨۧۥ۠۫۠ۥۦ۠ۦۘۛۦۙۖۖ۬";
                    break;
            }
        }
    }
}
