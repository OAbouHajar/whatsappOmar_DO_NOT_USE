package com.obwhatsapp.yo.autoschedreply;

import android.app.Dialog;
import android.app.DialogFragment;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.text.format.DateFormat;

public class TimePickerFragment extends DialogFragment {

    /* renamed from: a  reason: collision with root package name */
    public int f675a;

    /* renamed from: b  reason: collision with root package name */
    public int f676b;

    /* renamed from: c  reason: collision with root package name */
    public TimePickerDialog.OnTimeSetListener f677c;

    public Dialog onCreateDialog(Bundle bundle) {
        String str = "ۢۧۖۥۖۦۨۘۘ۟ۗۡۤ۬ۥۛ۫۬ۗۖۙۢۛۖ";
        while (true) {
            switch ((str.hashCode() ^ 313) ^ -2007880898) {
                case -182293977:
                    str = "ۢۦۦۘۚۜۦۦ۬ۗۜۡۥۘ۬ۤۘۘۖۜۜ۠۠ۚۛۥۡ";
                    break;
                case 1114172832:
                    str = "ۜۡۧۤۗ۟ۚۢ۟ۦۥۧۘ۟۠ۚ۟ۡۚۚۙۛ";
                    break;
                case 1739321639:
                    return new TimePickerDialog(getActivity(), this.f677c, this.f675a, this.f676b, DateFormat.is24HourFormat(getActivity()));
            }
        }
    }

    public void setArguments(Bundle bundle) {
        String str = "ۙۨۥۘۜ۟ۦۘ۠ۘۤ۟۫۟ۨۦۜ۟ۖ۬ۘۘۨۘۙۡ۬۟ۖۛ";
        while (true) {
            switch ((str.hashCode() ^ 859) ^ 1491847252) {
                case -1480691556:
                    str = "ۗۥۢۙۡۗۜ۬ۡۧۡۧۥۚۤۧۨۢۖۘۥ۠ۛ۫";
                    break;
                case -642180743:
                    super.setArguments(bundle);
                    str = "ۤۦۢۢۨۡۘۙ۠ۨۨۦۤ۠ۙۚۡۦۦۘۧۘۢۢۦۙۚۙۦ";
                    break;
                case 1243157887:
                    this.f676b = bundle.getInt("minute");
                    str = "ۚۜۡ۟ۘ۫ۦۚۦۘۥ۫۠ۛۘۘۘ";
                    break;
                case 1262426385:
                    return;
                case 1515442626:
                    this.f675a = bundle.getInt("hour");
                    str = "۫ۢۛۘۘۧۘ۠۟ۛۜۙ۬ۤۜۘۧۛۜ";
                    break;
                case 1632152234:
                    str = "۠ۛۥۘ۟ۘۨۧۙۚ۬ۖۗۙۖۤۜۘۜۢ۫ۘۤۥۖۡۡۘ";
                    break;
            }
        }
    }

    public void setCallBack(TimePickerDialog.OnTimeSetListener onTimeSetListener) {
        String str = "ۖۗۙۛۛۥ۠ۘۘ۬ۥۧۘۗ۫ۗۨ۠۫ۗ۠ۥۘۨۙۡۘۨۧ۠";
        while (true) {
            switch ((str.hashCode() ^ 36) ^ 30437082) {
                case -1774524477:
                    return;
                case -161261755:
                    str = "ۧۖۜۘۘ۫۟۟ۡۖۘۚۜۧۘۙۢۘۘۤۙ۟۟ۙ۟";
                    break;
                case -57967006:
                    this.f677c = onTimeSetListener;
                    str = "ۧۖۥۙۤ۟۬ۙۗۙۥۨۤ۬ۨۢ۬ۗ";
                    break;
                case 1413283022:
                    str = "ۖۨۦۨ۟۫ۤۤۥۡ۫ۤ۫ۢۜۘۦۡۘۘ۬۫ۘۡۡۘۡۨۦۘ";
                    break;
            }
        }
    }
}
