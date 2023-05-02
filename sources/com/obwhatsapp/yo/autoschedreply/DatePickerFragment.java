package com.obwhatsapp.yo.autoschedreply;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.os.Bundle;
import java.util.Calendar;

public class DatePickerFragment extends DialogFragment {

    /* renamed from: a  reason: collision with root package name */
    public int f663a;

    /* renamed from: b  reason: collision with root package name */
    public int f664b;

    /* renamed from: c  reason: collision with root package name */
    public DatePickerDialog.OnDateSetListener f665c;

    /* renamed from: d  reason: collision with root package name */
    public int f666d;

    public Dialog onCreateDialog(Bundle bundle) {
        DatePickerDialog datePickerDialog = null;
        String str = "ۘۨۛ۟ۢۨۥۥۥۘ۟ۛۧۧۗۘۘۘۥۧۘۘ۟ۦۘۘۦۘ۟ۙۨۘ";
        while (true) {
            switch ((str.hashCode() ^ 570) ^ 1609600398) {
                case -939617542:
                    str = "ۙۦۙۢۘ۫ۥۡۘۡۡۜ۠۬۟";
                    datePickerDialog = new DatePickerDialog(getActivity(), this.f665c, this.f666d, this.f664b, this.f663a);
                    break;
                case -825763330:
                    datePickerDialog.getDatePicker().setMinDate(Calendar.getInstance().getTimeInMillis());
                    str = "ۖ۬ۖۤۛ۬ۤۗۨۛۚ۠۟ۨۙ۬ۜۘۤۘۗۡۥۚۜ۟ۦ";
                    break;
                case -766526973:
                    return datePickerDialog;
                case -764221189:
                    str = "۫ۙۨۘ۬ۧ۟ۘۥۖۘۧۡۡۘۖ۫۟ۧۛۥ۠ۚ۠ۧۢ";
                    break;
                case 880462848:
                    str = "۟ۡۗۗ۫ۜۛۚۦ۟ۡۙۜۦۜۘۚ۟ۜ";
                    break;
            }
        }
    }

    public void setArguments(Bundle bundle) {
        String str = "۬ۘۦۘ۟ۡۧۚ۟ۗۙۜۦۗۙۗۢۗۙۖ۬۫ۖۙ";
        while (true) {
            switch ((str.hashCode() ^ 16) ^ -59491155) {
                case -1926580309:
                    this.f663a = bundle.getInt("day");
                    str = "۬ۤۥۘۛۚۥۧۤۦۘ۫ۡۥۘۜ۬ۨ۫۟ۢۛۖۚۢۖۧۗۚۛ";
                    break;
                case -1728987757:
                    this.f664b = bundle.getInt("month");
                    str = "ۥۙۧۛۖۗۥ۫ۘۡۥ۬ۛۢۡۘ۬۠ۧ";
                    break;
                case -426099484:
                    super.setArguments(bundle);
                    str = "۠ۖۛ۠ۖۙۚۤۥۘۙۦۖۘۨۘۨ";
                    break;
                case 121758849:
                    str = "۬ۚۢۤۨۗۨۦۘۚۡۥۤ۫۠ۜۖۜۘۛۗۤۙۜۘ";
                    break;
                case 1616699468:
                    str = "ۗۙۢ۟ۘۡ۬ۢۚ۬ۨۧۘۛۚۤ";
                    break;
                case 1709560422:
                    return;
                case 2045690611:
                    this.f666d = bundle.getInt("year");
                    str = "۬ۚۤۥۨۦۘۡ۬ۘۘۨۨۖۘۚۙۙ۟۫ۜ";
                    break;
            }
        }
    }

    public void setCallBack(DatePickerDialog.OnDateSetListener onDateSetListener) {
        String str = "ۡۗۖ۠ۧ۟ۙۜ۟۫ۤۘۡۙۤۜۤۗۖ۬ۡ۫ۦۖ۬ۗ";
        while (true) {
            switch ((str.hashCode() ^ 981) ^ 1335855668) {
                case -965477773:
                    this.f665c = onDateSetListener;
                    str = "ۗۚۡۘۥ۬ۜۛۤۡۙۜۜۘۢۥۜۚ۬۟ۢۙ۟ۡ۫ۥۧۚۖۘ";
                    break;
                case -697078601:
                    str = "ۤۚۗۚۜ۠۟ۘۗۢۘۜ۟ۥۘۘۖ۫ۦۘ";
                    break;
                case -466291080:
                    str = "ۛ۟ۖۘۗۡۚۜۤۨۘ۟ۡۘۘۢۨۧ۟ۜۜۘ";
                    break;
                case -113651559:
                    return;
            }
        }
    }
}
