package com.obwhatsapp.yo;

import android.support.v4.view.GravityCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public final class x0 extends BaseAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final CharSequence[] f908a;

    /* renamed from: b  reason: collision with root package name */
    public final CharSequence[] f909b;

    /* renamed from: c  reason: collision with root package name */
    public final YoFontListPreference f910c;

    public x0(YoFontListPreference yoFontListPreference, CharSequence[] charSequenceArr, CharSequence[] charSequenceArr2) {
        this.f910c = yoFontListPreference;
        this.f908a = charSequenceArr;
        this.f909b = charSequenceArr2;
    }

    public final int getCount() {
        String str = "ۧۙۚۛ۫۫ۧ۟ۛۘۗۘۛۡۨۧۛ۠۬ۚۦۘ";
        while (true) {
            switch ((str.hashCode() ^ 914) ^ 1410968566) {
                case -2117910139:
                    return this.f908a.length;
                case -168689321:
                    str = "ۙۖۢ۫۬ۖۧۧۘۗ۫ۥۚۥۗۛۨۥۘۜۗ۟";
                    break;
            }
        }
    }

    public final Object getItem(int i2) {
        String str = "ۤۥۤۙۜ۟ۘ۬ۡۘۡۨۤۛۡۖ۫ۙۤۨۗۤۛۚۚ";
        while (true) {
            switch ((str.hashCode() ^ 350) ^ 523325686) {
                case -2096266515:
                    str = "ۙۧ۟ۧۜۡ۬ۧ۠ۨۜۦۘۘۦ۠۟ۘ۫ۜۡۦۘ";
                    break;
                case 1400187631:
                    str = "ۗۡۥۘۜۗۛۜۥۖ۟ۗۤۢۦۥۖۘۨۘ";
                    break;
                case 1458294553:
                    return this.f909b[i2];
            }
        }
    }

    public final long getItemId(int i2) {
        String str = "ۤۨۚۖۘۡۘ۠ۜ۠ۢۨۨ۟ۧۛۦۦ";
        while (true) {
            switch ((str.hashCode() ^ 978) ^ 438682589) {
                case -2110561623:
                    str = "۠ۘۦ۫۬ۨۘۚۛۛۚۜۦۘۥۘۡۜ۫";
                    break;
                case -47653439:
                    str = "۠ۦۜۤۙۧ۟ۜ۟۠۫۠ۖۢۧۧۛۥۘ۟ۖۡۘۚۥۗ";
                    break;
                case 705108484:
                    return (long) i2;
            }
        }
    }

    public final View getView(int i2, View view, ViewGroup viewGroup) {
        String str = "۠ۖ۟ۨۡ۟ۚۢ۫ۗۤۨۘۥۨۡۙۨۢ";
        YoFontListPreference yoFontListPreference = null;
        CharSequence charSequence = null;
        CharSequence[] charSequenceArr = null;
        CharSequence charSequence2 = null;
        TextView textView = null;
        TextView textView2 = null;
        View view2 = null;
        while (true) {
            switch ((str.hashCode() ^ 731) ^ 1756858573) {
                case -2093088051:
                    charSequence = charSequenceArr[i2];
                    str = "ۡۥۨۘۥۨۦۘۡۖۖۘۖۤۥۘۙ۟ۨۤۨۢۨۦ۟ۤۗۖۘ";
                    break;
                case -1834491647:
                    YoFontListPreference.a(yoFontListPreference, textView, charSequenceArr[i2]);
                    str = "ۨۨۥۘ۟ۘۡ۫۠ۖۚۜۘۚ۠ۡۘۡ۫۬ۗۥۤۦۙ۟";
                    break;
                case -1549539392:
                    str = "ۙۢۥۘۙۖۜۚۖۧۘۡۡ۫ۢۤۧۛۡۙۚۢۗ";
                    break;
                case -1539570168:
                    textView.setText("اتق شر من احسنت اليه");
                    str = "ۧۖ۫۟ۜ۫ۘۗۘۦۜۜۘۢ۠۠ۧۗۘۦ۟ۘۨۜۧۘ۫۟ۢ";
                    break;
                case -1364289674:
                    charSequence2 = this.f908a[i2];
                    str = "ۜۧۛۖۨ۫ۨۜۤۚۜۢۖۦۜۘ۬ۜۜۥۦۧ۠ۙۨ";
                    break;
                case -1102504325:
                    String str2 = "ۡ۠ۨۚۦۖۚۛۨۘۙۖۜ۠ۖۚۨ۫۟";
                    while (true) {
                        switch (str2.hashCode() ^ 1207789375) {
                            case 857678322:
                                str = "۬ۛۦۘۥۢۙ۠ۥ۬ۤۜۖۨۘۘ";
                                continue;
                            case 1104586355:
                                str2 = "ۖۡۢۘۙۥۘۤۤۡۧۜ۫۫ۨۛۜ۠ۤ۫ۙۥ۟ۥۨ۫۬ۘۘ";
                                break;
                            case 1426952826:
                                if (!charSequence2.toString().endsWith("(Arabic)")) {
                                    str2 = "۠ۖۡۘ۫ۗۚ۠ۛۚ۠۠ۤۘۥۚ۟۟۟ۛۘۗ۟ۛۤۥۨۖ";
                                    break;
                                } else {
                                    str2 = "۠ۗۘۘۤۦۧۘۘ۟ۨۡ۫ۙۛۚۘۘۥۗ۬ۦۦۚۘۜۧۘ۫ۙۦ";
                                    break;
                                }
                            case 1440376273:
                                str = "ۚۦ۠ۗۦۥۘۙۜۙۜۢۨۧۨۛۤۚۨۘ";
                                continue;
                        }
                    }
                    break;
                case -915339614:
                    YoFontListPreference.a(yoFontListPreference, textView2, charSequence);
                    str = "ۗۨۧ۠ۛۘۘۦۨۨ۠ۡۥۨۧۙۨۢۘ۟ۡ۬";
                    break;
                case -835457692:
                    str = "ۘۦۦۘۨۨۥۗۧۥۚۚ۫ۥۙۤۘ۫ۥۘۜ۟ۥۡۧۙۥۜ۬";
                    break;
                case -625125137:
                    yoFontListPreference = this.f910c;
                    str = "۬۫ۜۦۙۦ۠ۧ۬ۜۦۦۘۜۥ۫۟ۙۖۘۛۗۚۢۙۖ";
                    break;
                case -134217047:
                    str = "ۥۡۜۢۤۦۧۤۢۙۨۤۙۧۦۥۨۙۦۗۥۘ";
                    break;
                case -94431915:
                    str = "ۦ۬ۨۛ۫ۨۘ۠ۚ۠ۖ۬ۤۙۤۧ";
                    textView2 = (TextView) view2.findViewById(16908308);
                    break;
                case 658961536:
                    textView.setText("Impossible can be achieved");
                    str = "ۙۢۥۘۙۖۜۚۖۧۘۡۡ۫ۢۤۧۛۡۙۚۢۗ";
                    break;
                case 854263750:
                    textView2.setText(charSequence2);
                    str = "۟ۚۜۗۥۧۘۦۢۢۛۨ۫ۜۛۤ";
                    break;
                case 930972607:
                    str = "ۙ۟ۜ۫۫ۢۦۥۖۘۚۢۙ۟ۘۖۘ";
                    break;
                case 1111411327:
                    textView2.setGravity(GravityCompat.END);
                    str = "ۘۜۛۛۥۜۘۘۖۘۧۙۜۡۤۥۘۙۜۜ";
                    break;
                case 1119457358:
                    str = "ۡۥ۠ۤۗۨۛۢۦۘۥ۟ۧۜۥۚ۠ۤ۬";
                    break;
                case 1415487744:
                    view2 = LayoutInflater.from(yo.getCtx()).inflate(17367044, (ViewGroup) null, false);
                    str = "ۛۥۘۚ۟ۤۢۡۘۨۙۖۘ۫ۘۦۧ۬";
                    break;
                case 1418869540:
                    str = "ۧۡۤۗۤۖۙ۬ۜ۫ۙۤۜۖۘۖ۫ۡۘۖ۠ۦۘۜۡ۟";
                    textView = (TextView) view2.findViewById(16908309);
                    break;
                case 1772776071:
                    return view2;
                case 1971446320:
                    charSequenceArr = this.f909b;
                    str = "ۦ۠ۖۘۚۥۧۘۚۖۡۧۘۡۦ۟ۢ۟ۡۦۢۘۛۡۡۗۨۘۛ";
                    break;
            }
        }
    }
}
