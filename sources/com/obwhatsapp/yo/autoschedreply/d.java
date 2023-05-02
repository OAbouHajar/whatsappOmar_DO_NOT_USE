package com.obwhatsapp.yo.autoschedreply;

import android.app.DatePickerDialog;
import android.widget.DatePicker;
import android.widget.EditText;

public final /* synthetic */ class d implements DatePickerDialog.OnDateSetListener {

    /* renamed from: a  reason: collision with root package name */
    public final AddMessage f685a;

    public /* synthetic */ d(AddMessage addMessage) {
        this.f685a = addMessage;
    }

    public final void onDateSet(DatePicker datePicker, int i2, int i3, int i4) {
        String str = "ۡ۫ۥۛۢۙۨۨۛۡۖ۫ۦۗۤۙۗ";
        StringBuilder sb = null;
        EditText editText = null;
        while (true) {
            switch ((str.hashCode() ^ 342) ^ 1083689327) {
                case -2038360112:
                    str = "۠ۗۦۘۘۙۤۤۚۥۜۖۘۘۡۖۦ۟ۦۘ۠ۨۤۗۚۖ۠۬ۦ";
                    break;
                case -1992798092:
                    sb.append(i2);
                    str = "ۢۤۘۧۖۡۦ۟ۛۙۢۨۖۧۨۖۛ۟۠ۢ۠ۧۖۛۛۢۡ";
                    break;
                case -1683090746:
                    str = "ۦۘۨۛۚ۬ۧ۬ۜۘ۫ۘۘۘ۠ۛۗ۠ۥۧۘۤۤۗۘۤۥ";
                    break;
                case -1620673591:
                    sb.append("-");
                    str = "ۨۛۥۘۨ۠ۥۘ۫۫ۛۗۡۥۥۨۧۘۛۦۥۘ۫ۛۧ";
                    break;
                case -1357265587:
                    str = "ۨۡۨۗ۫ۘۗۥۧۛۘۜۘۢۖۢۡۘۡ";
                    break;
                case -1321700000:
                    sb.append(i4);
                    str = "ۤۛۖۦۛۨۘۜۥۚۧۦۘۖۜۜۢۘۡ";
                    break;
                case -1293975134:
                    str = "ۦ۬ۤۥۥۧۘۖۘ۟ۖۦۨۘۗۡۥۘۡۥۘ";
                    break;
                case -907690025:
                    sb = new StringBuilder();
                    str = "۠۠ۖ۠ۡۧۘۙۦ۟ۗۤ۟ۗۧۡ۟ۢۡۥۜ۬ۢۢۗ۫ۡ";
                    break;
                case -609969416:
                    editText.setText(sb.toString());
                    str = "ۖۤۜۘۥ۫ۦۘۨ۬ۘۜ۬ۥۘۛۨۤۨ۠۟ۘۧۘۘۦۛۡ";
                    break;
                case -607809791:
                    return;
                case -190288362:
                    str = "۫۟ۛۜ۠۬ۜۦۗۤۢۙۢۖۢۥۤۢۢۖۜۛۜ۠";
                    break;
                case 557347693:
                    sb.append(i3 + 1);
                    str = "ۜۛۙۛۗ۬ۦ۟ۜۗۖۘۘۘ۠ۙۘ۫ۗۗۘۦۘۛۖۙ۫ۙۥۘ";
                    break;
                case 1321876436:
                    sb.append("-");
                    str = "ۤۦ۬ۨ۬ۜۜۨۤۚۨۥ۠ۧۤۛۗۢۚۢۡۖۥۖۘۨۚ۟";
                    break;
                case 1797764096:
                    str = "ۗۙۡۘۚۙۦۖۗۚۥۛۨۗۦ۫ۤۧۦۖۙۗۢۦۘ";
                    editText = this.f685a.f618c;
                    break;
            }
        }
    }
}
