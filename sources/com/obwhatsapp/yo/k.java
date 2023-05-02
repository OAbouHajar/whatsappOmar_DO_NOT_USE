package com.obwhatsapp.yo;

import android.app.Activity;
import com.obwhatsapp.youbasha.ui.lockV2.LockUtils;

public final /* synthetic */ class k implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final int f789a;

    /* renamed from: b  reason: collision with root package name */
    public final Activity f790b;

    /* renamed from: c  reason: collision with root package name */
    public final String f791c;

    public /* synthetic */ k(Activity activity, String str, int i2) {
        this.f789a = i2;
        this.f790b = activity;
        this.f791c = str;
    }

    public final void run() {
        int i2 = 0;
        String str = "ۥ۟ۗۗۨ۬ۧۥۘۘ۫ۡۘۢۗۤۡ۠۠";
        String str2 = null;
        Activity activity = null;
        while (true) {
            switch ((str.hashCode() ^ 101) ^ -1755989154) {
                case -2039720786:
                    Conversation.l(activity, LockUtils.isJIDLocked(str2));
                    str = "ۤۖۖۘۡۖ۬ۛ۫۟ۢ۫ۜۘ۬ۚۡۚۖۨ۫۫۟";
                    break;
                case -1344462677:
                    str2 = this.f791c;
                    str = "ۦۢ۬ۛۗۦۜۖۖۧۡۨۧۙۛ";
                    break;
                case -1122980578:
                    str = "ۢ۟ۨۤ۫ۜۘۘۜۘ۬ۙۤۛ۟ۥ";
                    activity = this.f790b;
                    break;
                case -1015362734:
                    str = "ۘ۟ۗۡۛۥۘۡۜۜۡۗۡۜۧۖۘ۬۟ۘۜۙۡۘ";
                    i2 = this.f789a;
                    break;
                case -386558632:
                    int i3 = Conversation.f512a;
                    str = "ۢۚۦۘۨۚۧۜۡۖۖۘۥۘۥ۟ۡۢ۟ۗ";
                    break;
                case -326357093:
                    str = "ۚۥۦۘۙۘۖۡۥۚۙۖ۠ۛۗۡۘۦۚۦۨ۠ۥۘۗۥ۫";
                    break;
                case 80098989:
                case 1240429102:
                case 1800598574:
                    return;
                case 664423558:
                    switch (i2) {
                        case 0:
                            str = "ۚۦۥۧۛۡۤ۬ۙۨۗۗۜ";
                            break;
                        case 1:
                            str = "ۡۥ۬ۖۡۘۘۖۨۛۤ۟۠ۦ۟۟۬ۖۨ۟۠۫";
                            break;
                        default:
                            str = "ۛ۟ۧۘۦۘۘ۠ۖۧۘۨۛۖۜۧۘۜۛۡ";
                            break;
                    }
                case 803549072:
                    Conversation.l(activity, LockUtils.isJIDLocked(str2));
                    str = "ۗۖۦۘۤۢۘۘۖۚۧ۠ۛ۬ۖۘۛۚۘۨۖ۠ۤۜۦ";
                    break;
                case 950838442:
                    int i4 = Conversation.f512a;
                    str = "ۢۦۥۘ۫۫ۦۘۛۥۤۨ۟ۙۗۨۘۦۦۚۨۥۖ";
                    break;
                case 1194044259:
                    str = "ۤۜ۬ۘۘۘۘۢۢۜۘ۬۠ۢۖۙۖۘۥ۫";
                    break;
                case 1511532245:
                    Conversation.l(activity, LockUtils.isJIDLocked(str2));
                    str = "ۖۚۢۡۖۘۘۤۘۖۘۧۨۨ۫ۗ۫ۛ۟ۢۡۨۧۘۧۛ۠۫ۥۦ";
                    break;
                case 2056926401:
                    int i5 = Conversation.f512a;
                    str = "ۧۘۢۚۜۜۨۦۚۢۗۢۧۦ۫۫ۖۥۗۚۘۘ";
                    break;
            }
        }
    }
}
