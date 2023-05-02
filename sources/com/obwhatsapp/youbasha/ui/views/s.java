package com.obwhatsapp.youbasha.ui.views;

import android.view.KeyEvent;
import android.view.View;
import rc.whatsapp.conversation.translateImageButton;

public final /* synthetic */ class s implements View.OnLongClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final int f1509a;

    /* renamed from: b  reason: collision with root package name */
    public final View f1510b;

    public /* synthetic */ s(View view, int i2) {
        this.f1509a = i2;
        this.f1510b = view;
    }

    public final boolean onLongClick(View view) {
        int i2 = 0;
        String str = "ۥۘۜۧۖ۠ۧۥۘۘۥۙۡۘۦۨۨۘ";
        translateImageButton translateimagebutton = null;
        KeyEvent.Callback callback = null;
        while (true) {
            switch ((str.hashCode() ^ 150) ^ -1466729163) {
                case -1826768837:
                    translateimagebutton.a(view);
                    str = "ۡۨۘ۬ۙۥۖۚۖ۟ۡۡۘۡۛۤ۟ۜۥۘ";
                    break;
                case -1545380245:
                    callback = this.f1510b;
                    str = "ۗ۟ۗۜۛۦۘۖۨۖۘ۟ۨۢۘۢۥ۬ۧۜۙۘۨۘۥۤۢ";
                    break;
                case -1119829072:
                    str = "ۨۡ۟۟ۚۤۤۜۧۘۧۖۖۘۜۧۛۛۥۘۖۖۚۡۢۨ";
                    i2 = this.f1509a;
                    break;
                case -1118592682:
                    str = "ۗ۫ۗ۬ۛۡۘ۠ۗۡۘ۟ۡۜۘۦۨ۫ۖۦۜۘۜۤۨۗۨۗۤۥۖ";
                    translateimagebutton = (translateImageButton) callback;
                    break;
                case -214779384:
                    YoSwipeableConvRow.a((YoSwipeableConvRow) callback);
                    str = "۫ۛۖۚۖۜۢ۟۠ۙۨۘ۬ۙۚ۬۠ۧ۫ۗۢ";
                    break;
                case -59146816:
                    str = "ۛۙۨۖۦ۠ۜۥ۬ۙۛۥۘۗۖۨۥۥۡۛ۠ۥۘۢۚۚ";
                    break;
                case 260672035:
                    str = "ۢ۠ۙ۠ۥۙۘۗ۟ۥۡۚ۫ۧ";
                    break;
                case 840160072:
                    str = "ۤۤۡۘۦۙ۠۟ۛۡۘۜۗۖۨ۟ۢۖۖۖۥۧۘۘۥۦۘۙۖ";
                    break;
                case 883787733:
                case 1855802739:
                    return true;
                case 1456692170:
                    switch (i2) {
                        case 0:
                            str = "ۦۢۖۘۢۨۜۘۘۙۧۙۛۜۘ۫ۖۤۡ۫ۗ۟ۢۘۘ۠ۨۜۘۨ۠ۢ";
                            break;
                        default:
                            str = "ۧۦۢۦ۟ۡ۬۠ۚۥ۟ۤۧۘۥ";
                            break;
                    }
                case 1975418348:
                    int i3 = translateImageButton.f2478c;
                    str = "۟۬ۗ۠ۨۗ۠ۢ۟ۖۨ۫۫ۧۦ۠ۛۜ";
                    break;
            }
        }
    }
}
