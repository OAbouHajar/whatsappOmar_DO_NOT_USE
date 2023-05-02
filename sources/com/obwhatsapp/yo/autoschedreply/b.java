package com.obwhatsapp.yo.autoschedreply;

import android.content.DialogInterface;
import java.util.ArrayList;

public final /* synthetic */ class b implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final ListMessages f681a;

    /* renamed from: b  reason: collision with root package name */
    public final int f682b;

    public /* synthetic */ b(int i2, ListMessages listMessages) {
        this.f681a = listMessages;
        this.f682b = i2;
    }

    public final void onClick(DialogInterface dialogInterface, int i2) {
        int i3 = 0;
        String str = "۠ۦۦۘۢۘۖۖۥۘۧۚۦۘۤۥۦۗۧۗۨ۟۬";
        ArrayList arrayList = null;
        SQLiteAdapter sQLiteAdapter = null;
        ListMessages listMessages = null;
        while (true) {
            switch ((str.hashCode() ^ 412) ^ 1194347526) {
                case -1757589864:
                    listMessages.f670c.remove(i3);
                    str = "ۗۢۗ۟ۧۗ۠ۛۘۘۦۖۥۢۤۘۘۛۢ۬۠ۥۚ۠ۛۖۘۡۨۜ";
                    break;
                case -1141978764:
                    str = "ۢ۠۬ۧ۫ۦۗۧ۟ۥۛ۫ۡۛۚۤ۬۫ۚۦۧۙۤۧۤۡ۠";
                    listMessages = this.f681a;
                    break;
                case -874059625:
                    str = "ۛۙۥ۬۫۬ۛۙۥۛۘۤۛۢۜۛۘۜۘ۟ۖۡۜۢۨۘ";
                    break;
                case -582829006:
                    return;
                case -104063361:
                    listMessages.f669b.open();
                    str = "ۥ۬ۛۛ۬ۤۧۘۨ۬ۥۨۘۜۡۨۡۧ۫ۜۜۚۥۥۦۘ";
                    break;
                case 97510012:
                    listMessages.f669b.close();
                    str = "ۦۛۥۘ۫ۨۡۘۤۥۥۘۡۧۦۘۖۚۜۘ";
                    break;
                case 594252275:
                    str = "۠ۦ۠ۦۚۖۘۡۨۧۘۤۜۡۘ۟ۢۙ";
                    sQLiteAdapter = listMessages.f669b;
                    break;
                case 672361605:
                    arrayList = listMessages.f670c;
                    str = "ۖۤۡۤۜۘۥ۫ۡۘۧۥۨۘۥۙۖۤۘۧۙۘ";
                    break;
                case 834101043:
                    str = "ۥۙۡۘ۟ۙۘۥ۫۬۬ۜۘۚ۫ۦۘ۠ۜۖۚۖ۬";
                    break;
                case 1147441986:
                    str = "۫ۤۨ۬ۙ۬۬ۤۚۖ۫ۨۘۦ۠ۡۘۘ۬ۥ";
                    break;
                case 1359165141:
                    listMessages.a();
                    str = "ۚۜۜۘۥ۠ۤ۫۠ۤۧۢۢۥۨۦۘۨۚۦۘۗ۟ۨۢۦۛ۬ۛۨ";
                    break;
                case 1536861403:
                    sQLiteAdapter.delete(((object_alert) arrayList.get(i3)).get_id());
                    str = "ۘ۫ۖۥۚۤۧۜۚۙۨۙۖۥۖۘ";
                    break;
                case 1704876306:
                    i3 = this.f682b;
                    str = "ۗ۫۬ۘۗۚ۟ۨۦۨۨۨۜ۫ۨ۬ۘۘ";
                    break;
            }
        }
    }
}
