package com.obwhatsapp.yo.autoschedreply;

import android.view.View;

public final /* synthetic */ class h implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final AutoMessageAdapter f693a;

    /* renamed from: b  reason: collision with root package name */
    public final object_automsg f694b;

    /* renamed from: c  reason: collision with root package name */
    public final int f695c;

    public /* synthetic */ h(AutoMessageAdapter autoMessageAdapter, object_automsg object_automsg, int i2) {
        this.f693a = autoMessageAdapter;
        this.f694b = object_automsg;
        this.f695c = i2;
    }

    public final void onClick(View view) {
        Auto_message auto_message = null;
        String str = "ۤ۟۬ۥۜۡۤۙۥۘۢۜ۬ۘۜۖۦ۟ۥۘ";
        while (true) {
            switch ((str.hashCode() ^ 982) ^ 1089155866) {
                case -1866525796:
                    auto_message.f662t.remove(this.f695c);
                    str = "ۦۦۥۘۦۛۡۘۚ۬ۛ۬ۦۦۦۛ۠ۛۘۦ";
                    break;
                case -1071319552:
                    auto_message = this.f693a.f628a;
                    str = "ۤۜۖۢۧۖ۠ۖۛۧ۫ۢۧ۠ۙۗۘۘ";
                    break;
                case -625873119:
                    str = "ۡۘۥۧۜۙۥ۠۬ۧۛ۟۬ۖۘۙۘۚۨۚۗۥۡۘ";
                    break;
                case 223803416:
                    str = "ۙۡ۬ۖ۟ۦۘۛۤۥۘۛۘۨۥۧۥۦۥۧۚۛۗۘ۬ۡ";
                    break;
                case 662236803:
                    auto_message.f661s.delete(this.f694b.get_id());
                    str = "ۖۧۘۘۦۢ۟ۜ۟ۖۦۡۥۘۧۛۡۢۘۜۘ";
                    break;
                case 680742949:
                    return;
                case 710950735:
                    auto_message.f661s.open();
                    str = "۟۟ۧ۫ۗۤۖۚۜۦ۫ۘۘۙۤۦ";
                    break;
                case 1537975212:
                    auto_message.a();
                    str = "۟ۙۥۡۥ۫ۨۛۙۤۦۨۦ۠ۦۘ۬ۜ۟۫ۥۢۗ۟ۧ";
                    break;
                case 2093129330:
                    auto_message.f661s.close();
                    str = "ۤۜۖۘۛۤۥ۬۬۫ۦۚۨ۟ۦۛ";
                    break;
            }
        }
    }
}
