package com.obwhatsapp.yo.autoschedreply;

import android.content.Intent;
import android.view.View;
import com.obwhatsapp.yo.CustomAlertDialogBuilder;
import com.obwhatsapp.yo.x;
import com.obwhatsapp.yo.yo;
import com.obwhatsapp.youbasha.colorPicker.HistorySelectorView;

public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final int f678a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f679b;

    /* renamed from: c  reason: collision with root package name */
    public final int f680c;

    public /* synthetic */ a(Object obj, int i2, int i3) {
        this.f678a = i3;
        this.f679b = obj;
        this.f680c = i2;
    }

    public final void onClick(View view) {
        String str = "ۗۙۚ۬ۖۥۘۧۛۚۧۤۨۘۗۘۗۤۧۢ۬ۦ";
        object_alert object_alert = null;
        Intent intent = null;
        ListMessages listMessages = null;
        c cVar = null;
        ListMessages listMessages2 = null;
        c cVar2 = null;
        Object obj = null;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            switch ((str.hashCode() ^ 639) ^ 740140512) {
                case -1878030801:
                    intent.putExtra("text_message", ((object_alert) listMessages.f670c.get(i2)).getF_f());
                    str = "ۨۜۦۘ۠ۤ۬ۛۚۚۥۜۨۘۧۜۧۙۥۦۘ";
                    break;
                case -1857584639:
                    switch (i3) {
                        case 0:
                            str = "ۙ۟ۦۘ۠ۥۨۘۡۘۛۜ۠ۗۘۖۜۘۚۡۡۘ۫ۢ۠۫ۥ۫ۧ۠۠";
                            break;
                        case 1:
                            str = "ۖۢۘ۠ۧۢۙۚ۟ۘ۟۠ۛ۠ۤ";
                            break;
                        default:
                            str = "ۗۚ۬ۤۚۡ۫ۦۘۘۙۘۚۚۖ۠ۤۢۘۘۗۡۙ۫ۨ۬";
                            break;
                    }
                case -1785927734:
                    str = "ۦ۟ۖۗۗۢۖۚ۠ۤ۟ۡۘۖ۠ۘۨۛۦۘ";
                    cVar2 = (c) obj;
                    break;
                case -1588249135:
                    str = "ۧ۠ۦۦ۫۟ۜ۫ۘ۟ۧۨۘۨۛۤۛ۟۠ۨۗۙ";
                    i3 = this.f678a;
                    break;
                case -1375772201:
                    cVar.getClass();
                    str = "ۛۖۡۢۥ۠ۡۘۙۖۨۛۛۙ";
                    break;
                case -1288385998:
                    obj = this.f679b;
                    str = "ۢ۟ۙ۬۟ۘۢ۠ۢۥۚۘۘۘۦ";
                    break;
                case -1200747771:
                    str = "ۧۧۘۖ۫ۢ۬۬۟ۜۡۗۗ۟ۤ۫ۜۥۙۖۨۘ";
                    intent = new Intent(listMessages, AddMessage.class);
                    break;
                case -791840361:
                    str = "ۜ۫۫ۚ۟ۦۘۤۤ۠ۘۧۥۨۡۧ۫ۜۨۘ";
                    listMessages2 = cVar2.f684a;
                    break;
                case -764880779:
                    cVar2.getClass();
                    str = "ۜۖۜۘ۫ۢۖۘۧۙ۠ۨۥۧ۟ۗۛۤۦۦۤ۠";
                    break;
                case -548950658:
                    str = "ۦۙۖۘۜۥۜۜۖۡۘۚۢ۬ۧۖۙۡۨۖۙۜۘۖۜۚۚۧۜ";
                    break;
                case -453179527:
                    new CustomAlertDialogBuilder(listMessages2).setTitle((CharSequence) yo.getString("msg_store_confirm")).setPositiveButton(17039370, new b(i2, listMessages2)).setNegativeButton(17039360, new x(5)).create().show();
                    str = "۟۠۬ۢۙۜۘۘ۫ۖ۟ۖۤۦ۬ۖۡۚۥ۟";
                    break;
                case -250591020:
                    str = "ۤۖۖۘۛۦۘ۫۠ۡ۠ۤ۫ۗۢۧ";
                    cVar = (c) obj;
                    break;
                case -243025469:
                    str = "ۧۢۜۘۙۨ۬ۗ۬ۛۛۤ۬۬۬ۡۘ";
                    listMessages = cVar.f684a;
                    break;
                case -92273742:
                    intent.putExtra("edit", "yes");
                    str = "ۦۤۚۥۤ۟۟ۘۚۘۧۖۘ۟۟ۡ۫۠ۚۙ۠ۜۨۚۙۢۙ۫";
                    break;
                case 260119515:
                    str = "۟ۖۚۦ۠ۗۨۥ۬۬ۥۜۗۦۘۘۙۜ۬ۚۚۦ";
                    break;
                case 405508015:
                    intent.putExtra("id", object_alert.get_id());
                    str = "ۙۡۨۘۡۨۦ۬ۖۖۢۧۛ۠ۧۚۜۡۖۘۛۧۦ";
                    break;
                case 430807653:
                    HistorySelectorView.a((HistorySelectorView) obj, i2);
                    str = "۠ۡ۫ۜۛۜۘۗۢۤۜ۬۬ۢۜۤ";
                    break;
                case 623158759:
                    intent.putExtra("btnTime", object_alert.getA_a());
                    str = "ۙۗۤۤۖۨۘۛۢۘۘۚۙۢۦ۫۟ۡۦۗۜۤ۟ۧۙ۟۬ۨۦۘ";
                    break;
                case 767662616:
                    intent.putExtra("endDate", object_alert.getC_c());
                    str = "ۘۡۥۜۗۥ۫ۡۘۘۜ۟ۘۘۙۙ۟";
                    break;
                case 801233702:
                case 923564445:
                case 1604600228:
                    return;
                case 811097870:
                    listMessages.startActivity(intent);
                    str = "ۚۡۚ۬ۜ۬۟ۗۥۘ۟ۤۜۘۨ۬ۘۘ";
                    break;
                case 1154322236:
                    intent.putExtra("_id", object_alert.get_id());
                    str = "۬ۥۖۘ۠ۛۙۨ۟ۦ۬۫ۚ۬ۜۤۖۛۘۘ۫ۨ";
                    break;
                case 1221048333:
                    intent.putExtra("startDate", object_alert.getD_d());
                    str = "ۖۜۦۘۚۦۡۜ۠ۦۘۤۤۧ۬ۛۙ۟ۢ۠";
                    break;
                case 1250271663:
                    str = "ۚ۬ۧ۬ۘۨۥ۠ۖۘۦۨۚۛۧۡۘۖۗۛ";
                    object_alert = (object_alert) listMessages.f670c.get(i2);
                    break;
                case 1641989208:
                    intent.putExtra("edtName", object_alert.getE_e());
                    str = "ۛۨ۟ۙ۬۫ۘۥۨۢۧ۫ۧۚۖ";
                    break;
                case 1778844841:
                    str = "ۤۘۦۦۦۧۢۤۖۥۚۥۤ۬ۥۘۡۥ۠ۥۦۡۢۧۦ۟ۨۨ";
                    break;
                case 1914894452:
                    str = "ۙۤۖۡۙۥۛۧ۠ۚۨۡۛۘۢۜۘۥۘ۠ۘۘ";
                    i2 = this.f680c;
                    break;
            }
        }
    }
}
