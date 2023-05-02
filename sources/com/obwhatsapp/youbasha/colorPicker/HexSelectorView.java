package com.obwhatsapp.youbasha.colorPicker;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import c.c;
import com.obwhatsapp.youbasha.others;

public class HexSelectorView extends LinearLayout {

    /* renamed from: e  reason: collision with root package name */
    public static final int f983e = 0;

    /* renamed from: a  reason: collision with root package name */
    public EditText f984a;

    /* renamed from: b  reason: collision with root package name */
    public int f985b;

    /* renamed from: c  reason: collision with root package name */
    public TextView f986c;

    /* renamed from: d  reason: collision with root package name */
    public OnColorChangedListener f987d;

    public interface OnColorChangedListener {
        void colorChanged(int i2);
    }

    public HexSelectorView(Context context) {
        super(context);
        a();
    }

    public HexSelectorView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }

    public final void a() {
        String str = "ۡ۬ۜ۠ۤۗۗۧۙۦۘۜۖۧۘۗۨۧۘۗۢۡۘ۟ۨۥۘ";
        View view = null;
        while (true) {
            switch ((str.hashCode() ^ 796) ^ 2109908403) {
                case -474446563:
                    return;
                case 152050379:
                    view = ((LayoutInflater) getContext().getSystemService("layout_inflater")).inflate(others.getID("color_hexview", "layout"), (ViewGroup) null);
                    str = "ۚۧۡۧۙۜ۠۠ۧۗ۠ۨ۟ۙۥ";
                    break;
                case 324679915:
                    str = "ۙ۫ۙ۬۠ۦۡ۟ۢۨۥۖۜ۠";
                    break;
                case 445098546:
                    addView(view, new LinearLayout.LayoutParams(-1, -1));
                    str = "۟ۡۧۘۘۥۡۥۘۜۗۤۥۜۘۜۦ۟ۦۤ۫";
                    break;
                case 524150863:
                    this.f984a = (EditText) view.findViewById(others.getID("color_hex_edit", "id"));
                    str = "ۥۛۚۛ۫ۗۘ۬۠ۗۚ۫ۧ۫ۡۘۦۚۜۘۚ۬ۖۘ";
                    break;
                case 888254417:
                    ((Button) view.findViewById(others.getID("color_hex_btnSave", "id"))).setOnClickListener(new c(this, 5));
                    str = "ۡۨۛۥۗ۟ۜۚۥۘۛۜۡۘ۬ۜ";
                    break;
                case 1763533067:
                    this.f986c = (TextView) view.findViewById(others.getID("color_hex_txtError", "id"));
                    str = "۟ۘۥۘ۫۬۠ۦ۟۠ۢۖۨۨۥۜۘۥ۫۟";
                    break;
            }
        }
    }

    public int getColor() {
        String str = "ۥ۫ۦ۫ۤۗۦۢ۠ۛۗۘۘۙۨۙ۟ۥۨۘۘۦۜۘ";
        while (true) {
            switch ((str.hashCode() ^ 882) ^ 113844692) {
                case -91641255:
                    return this.f985b;
                case 921450670:
                    str = "ۨۘۤۨۡ۫ۥۙۘۖۨ۫ۨۢۦۥۛۜۘۥۦۦۘۥۧ۟";
                    break;
            }
        }
    }

    public void setColor(int i2) {
        String str = "ۘۨ۬ۚ۫ۙۚۖۧۦۧۛ۟۬ۡۦ۬ۛۚ۬۠۟ۨ۫";
        String str2 = null;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        StringBuilder sb = null;
        String str3 = null;
        String str4 = null;
        EditText editText = null;
        while (true) {
            switch ((str.hashCode() ^ 567) ^ -304614762) {
                case -1978597089:
                case -1264416389:
                    return;
                case -1864484928:
                    editText.setText(str3);
                    str = "۬ۙۖ۬ۗۨ۬ۘ۟ۙ۟ۢۥۧۘۢۗۡۥۗۙۖۚۘۘۡ";
                    break;
                case -1775868664:
                    this.f986c.setVisibility(8);
                    str = "ۙ۟ۘ۟ۚۜۛۦ۠ۘ۫ۜۘۡ۟۫ۚۨ۬ۖۘۡۘۤۢۗ";
                    break;
                case -927440516:
                    str = "ۢۚۥۥۧۛۗۘۛ۬ۦۗۚۢ۠۬ۥۘۜۡۦۘۙۧۦۡۜ";
                    i3 = i4 + 1;
                    break;
                case -642122017:
                    String str5 = "ۤ۬ۢۗۗۡۜۤۡۘۥ۫ۖۘۛۤۥ۟ۚۡ۟ۡۗۢۖۘ۫ۘۜ";
                    while (true) {
                        switch (str5.hashCode() ^ 1350190946) {
                            case -2103367214:
                                str = "ۙۚۚۧۙ۬ۤۤۡۖۧۢۖۜۜۚۦۜ۠۬";
                                continue;
                            case -1923237202:
                                str = "۬ۦۦۘۨۖۛۘۜۘۦۥۦۦ۫ۡۧۘۥۘ";
                                continue;
                            case -67514454:
                                if (str4.length() < 8) {
                                    str5 = "ۘۗۘۘۦۙۘۘۘ۫۫۟ۡۛ۬ۘۤ۫ۜۦۘۡۛ۬ۛ۟ۚ";
                                    break;
                                } else {
                                    str5 = "ۖۚ۠ۥۚۖۘۤ۟ۛ۠ۘ۠۫ۘۦۤ۟ۦۘ";
                                    break;
                                }
                            case 1292663113:
                                str5 = "ۦ۟ۖۘۦ۟ۤۚۛۤ۟۫ۡۛ۬ۚۥۖۖۘۥۡ۠ۜۢ";
                                break;
                        }
                    }
                    break;
                case -632482618:
                    sb.append('0');
                    str = "ۗۚ۬۟ۥۚۜۡۜۘۢۜۧۘۖ۟ۜۘۡۙۖۛۘۥۘۧ۫ۨۘۡۦۨ";
                    break;
                case -549253232:
                    str = "ۙۙۛ۫۬۠ۤ۟ۡۘۛۛ۟ۧۨۤۖۖۗ۫ۥۘ";
                    break;
                case 21371186:
                    str = "ۡ۟۟ۘۙۘ۫ۡۜۧۨۧۘۥۧ۫";
                    break;
                case 103059149:
                    str = "O۫۠ۖ۟ۚۥۘۛۤۨۘۨۦۡۖۨۥۚۥۜۘ";
                    sb = new StringBuilder();
                    break;
                case 225028323:
                    str2 = sb.toString();
                    str = "ۜۙ۬ۧۜۦۙۢۜۘۗۧۛۛ۠۫ۙۚ۠ۥۥۙۡۚ";
                    break;
                case 305087167:
                    str = "ۥۢۘۧۦۨۤۡۥۘۨۨۦۖ۠ۘ۟۫ۘ";
                    editText = this.f984a;
                    break;
                case 350951610:
                    str = "۠۟ۡ۫۬۟ۡۧۖۡۢۨۛۘۡۘۜۛۚ";
                    i4 = i5;
                    break;
                case 434507825:
                    str = "ۤۛۦۨۥۚۦۚ۫۫۟ۘۡۧۥۢۡۦۖ";
                    break;
                case 557473627:
                    sb.append(str4);
                    str = "۠۫ۦۘۦۧۘۢۤۛۥۡ۬ۖۥۘۘ۟۫ۦۘۦۙۦۙۤۢ";
                    break;
                case 683212534:
                    str = "۟ۤۗ۠ۧ۬ۚ۬ۘۘۨ۫ۨۘۗۧۢ۠ۜۧ";
                    str3 = str4;
                    break;
                case 686603142:
                    String str6 = "۠۟ۨۧۡۘۘۛۥۛ۠ۙ۫ۤۨۧ۠ۜ۫";
                    while (true) {
                        switch (str6.hashCode() ^ -1419510868) {
                            case -1935427612:
                                str6 = "ۘۘۥۚۛۖۘۤۡۧۘۚ۠ۖۘ۟ۜۡ۬ۢۖۙۛۤۨۘۡ";
                                break;
                            case -1640949819:
                                str = "ۘ۟ۥ۬ۜۦ۫ۖ۫ۤۥۡۘۡ۠۫ۗۘۧۘ";
                                continue;
                            case -833845279:
                                str = "ۢۦۨۘۨۤۜۙۦۧۘ۠۫ۖۘۖۧۛۖۚ۫";
                                continue;
                            case 887981436:
                                if (i2 != this.f985b) {
                                    str6 = "ۧۙۡۘ۟ۤۚ۫ۖۜۘۚۜۖۘۖۨۖ";
                                    break;
                                } else {
                                    str6 = "۟ۜۨۘۛۤ۬ۦۨۘۘۢۚۡ۬ۢۨۘۡۤۢۡۤ۟ۗۖۧۘۧۦ۫";
                                    break;
                                }
                        }
                    }
                    break;
                case 819711527:
                    str4 = Integer.toHexString(i2).toUpperCase();
                    str = "ۜۗۘۧۡۖۘ۫ۦۤۤۘۡۘۖ۠ۦۘ۫۠ۜۖ۠ۘ";
                    break;
                case 834670193:
                    i5 = str4.length();
                    str = "۬۠ۗۘ۬ۘۛۡۤۧ۬۟ۖ۠ۢۖۤۤ";
                    break;
                case 845574023:
                    str = "۠ۖۘۥۦۥۘ۬ۢۡۘۦۤۘۧۜۦۜۨ";
                    i4 = i3;
                    break;
                case 1347822247:
                    str = "۠۟ۡ۫۬۟ۡۧۖۡۢۨۛۘۡۘۜۛۚ";
                    break;
                case 1851681749:
                    this.f985b = i2;
                    str = "۟ۧۥۙۖۜۢ۬ۗۗۢۨۤۜۗۜۡ۫۟۠۬ۢۛۥۘ";
                    break;
                case 2025115573:
                    String str7 = "ۗ۬ۘۘ۟۬ۧۥ۫۫ۡۖۜۘۗۘۜ۠ۗۤ";
                    while (true) {
                        switch (str7.hashCode() ^ -1162935169) {
                            case -892368132:
                                if (i4 >= 8) {
                                    str7 = "ۦ۬۠۫۠ۗۚۖ۠ۘ۠ۤۖ۫ۖ";
                                    break;
                                } else {
                                    str7 = "ۘۥۧۘۜ۟۫ۢۨ۬ۨۦۘۘۦۧۧ۟ۨ۠ۧۧۗ";
                                    break;
                                }
                            case -448228719:
                                str = "۫ۨۥۦۛ۠۟ۙۥۤۥۖۘ۟ۢ۫۟ۘۥۘۤۙۖۘۖۡۜۘ";
                                continue;
                            case 787086899:
                                str7 = "ۜ۫ۗ۠ۖۢۚ۠۬ۢ۫ۡۘۦۢ۬";
                                break;
                            case 810952222:
                                str = "۟ۖ۠ۦۦۧۘۧۘۙۥۢۛۡۛۗۖۜۘۥ۫ۤۗۤ۠";
                                continue;
                        }
                    }
                    break;
                case 2032780788:
                    str = "ۙۙۛ۫۬۠ۤ۟ۡۘۛۛ۟ۧۨۤۖۖۗ۫ۥۘ";
                    str3 = str2;
                    break;
            }
        }
    }

    public void setOnColorChangedListener(OnColorChangedListener onColorChangedListener) {
        String str = "۫ۧۥۨۛۥۘ۫۟۠ۖۨۨۘ۟۫ۨۘ";
        while (true) {
            switch ((str.hashCode() ^ 151) ^ -860464041) {
                case -1580524613:
                    str = "ۚۚۦۘۖۜۢۘۨۜۗۤۦۘۧ۟ۙ";
                    break;
                case -56930080:
                    str = "ۖۘۘۘۢۦۦۘۥۛ۠ۙۥۡۘۦۗۦ۬ۘۙ";
                    break;
                case 914310232:
                    return;
                case 1614662413:
                    this.f987d = onColorChangedListener;
                    str = "ۛ۠ۛ۬ۧۡۘۤۛۦۘ۫ۢۚۧۡۤ";
                    break;
            }
        }
    }
}
