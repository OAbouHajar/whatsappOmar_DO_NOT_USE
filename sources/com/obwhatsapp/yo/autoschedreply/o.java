package com.obwhatsapp.yo.autoschedreply;

import android.content.Intent;
import android.view.View;

public final /* synthetic */ class o implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final int f708a;

    /* renamed from: b  reason: collision with root package name */
    public final ListMessages f709b;

    public /* synthetic */ o(int i2, ListMessages listMessages) {
        this.f708a = i2;
        this.f709b = listMessages;
    }

    public final void onClick(View view) {
        int i2 = 0;
        ListMessages listMessages = null;
        String str = "۫ۙۜۘۥۘۘۨ۠ۘۘۚۢۨۖۦۖۘۨ۫ۤ۫ۙۜۘ";
        while (true) {
            switch ((str.hashCode() ^ 627) ^ 1199516732) {
                case -1107936546:
                    int i3 = ListMessages.f667d;
                    str = "ۚۧۡۘۧۧۡۘۜۘۥۡۘۜۘۘۚ۬۫ۜۙ۫۠ۚ";
                    break;
                case -249060663:
                    listMessages.getClass();
                    str = "۫ۤ۠ۨ۬ۨۘۤۥۜۘ۟ۗۨۘ۫ۢۨۨۜۧۘۦۨۘ";
                    break;
                case -130892341:
                    switch (i2) {
                        case 0:
                            str = "ۥۙ۠ۥۥۢۗۙۦۘۜۘۘۛ۟ۖۧۙۥۦ۠ۤۚۡۨ۠";
                            break;
                        default:
                            str = "ۚۥۦۗۧ۠ۨ۟ۡۘ۠ۥۤۘۤۨۗۤۨ۬ۚۥ";
                            break;
                    }
                case 348548581:
                    listMessages = this.f709b;
                    str = "ۛ۟ۜۘۗۜۛۤۢۖۗۜۦۢۡۦ۬";
                    break;
                case 624797465:
                    int i4 = ListMessages.f667d;
                    str = "ۧۘۨۘۛۡۤۥ۠ۨۘۚۖۥۛۢۦۚۙۜۘۡۧۚۡۗ۬";
                    break;
                case 842381475:
                    str = "ۘ۫ۘۘ۟ۗ۠ۦۗۨۤۤۥۛ۠ۗ";
                    break;
                case 927500435:
                    str = "ۦۧۨ۟ۙۡۡۖۦۘۥۡ۬ۛ۠ۡۡۧ۬ۚۥۡۘۧۡ۠";
                    break;
                case 1093781536:
                    str = "ۙۢۜۛ۫ۡ۠ۥۡۗۡ۠ۤۤ۫ۡۜ۟";
                    break;
                case 1230173408:
                case 1450873022:
                    return;
                case 1671936847:
                    listMessages.startActivity(new Intent(listMessages, AddMessage.class));
                    str = "ۥۦۗۖۡۘۤۤۜ۠ۨۜۘۖۡۖۦۚۦۘ۠ۧۡۘۜ۬ۘۦۡ۬";
                    break;
                case 1851279646:
                    i2 = this.f708a;
                    str = "۫ۛۦۦ۠ۨۘۨۨۦۘۤۦۧ۠ۜۨۘ۫ۢ۠";
                    break;
                case 1857530516:
                    listMessages.onBackPressed();
                    str = "ۙۗۘۛۧۤۘۥۦۘۡ۬ۥۛۖۗۦۧۡۘۥۘ۟ۜۘ";
                    break;
            }
        }
    }
}
