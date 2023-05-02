package com.obwhatsapp.yo;

import android.database.sqlite.SQLiteDatabase;

public final /* synthetic */ class s1 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final long f873a;

    public /* synthetic */ s1(long j2) {
        this.f873a = j2;
    }

    public final void run() {
        String str = "۫ۖۥۨۗۦۥۥۨۘۡۙۚۢۗۚ";
        StringBuilder sb = null;
        SQLiteDatabase sQLiteDatabase = null;
        while (true) {
            switch ((str.hashCode() ^ 934) ^ 1264751966) {
                case -1137893669:
                    sb = new StringBuilder("_id=");
                    str = "۠۬ۡۨۛۘ۫ۨۘۥۢۧۖۛ۠ۧۘۖۘۖ۫ۙۦۖۨ";
                    break;
                case -331419831:
                    return;
                case -25625821:
                    sQLiteDatabase.delete("GroupChatsUnreadMsgs", sb.toString(), (String[]) null);
                    str = "ۚۙۖۘ۬ۖۤۙ۟ۙۧۜۡۘۘۙۨۗۡۜۘۘ";
                    break;
                case 387459772:
                    yo.f126r.getClass();
                    str = "ۥ۫ۖۢۡۘۘۨۡۖۙۥۢۖۢۖۘۚۥۢۢۘ۟ۡۜۘ۬ۙۗ";
                    break;
                case 537599437:
                    sQLiteDatabase = a.f608a;
                    str = "ۖۘۙ۟۬ۥ۠ۚۖۥ۠ۨۚۙ۫ۤۙۜۜ۫ۖۘ۟ۤۦ";
                    break;
                case 1326359240:
                    str = "ۧۖۗۢۘۛۘ۫ۜۙۖۧۘۤۡۛ۬ۛۗ";
                    break;
                case 1801175099:
                    sb.append(this.f873a);
                    str = "ۥۦۧۦۘۨۘۛ۫ۛ۬۬ۖۘۗۤۡۙۗۗۗۜ۬ۨۦ";
                    break;
            }
        }
    }
}
