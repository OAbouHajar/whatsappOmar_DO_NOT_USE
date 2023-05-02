package com.obwhatsapp.yo;

import android.annotation.TargetApi;
import android.content.Context;
import android.preference.Preference;
import android.util.AttributeSet;
import android.view.View;

public class PreviewPref extends Preference {

    /* renamed from: a  reason: collision with root package name */
    public View f555a;

    public PreviewPref(Context context) {
        super(context);
    }

    public PreviewPref(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PreviewPref(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
    }

    @TargetApi(21)
    public PreviewPref(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
    }

    public View getPrefView() {
        String str = "ۥۚۜۗۦۡۖۜۖۘ۫ۚۡۙۜۗۢۘۜۗۗۙۗۛۜۘۛۤۨۘ";
        while (true) {
            switch ((str.hashCode() ^ 193) ^ -471990399) {
                case 1953767217:
                    return this.f555a;
                case 2009697409:
                    str = "ۜۧۤۜۖۛۢۢ۫ۗۡۖۘۢۜۖۤ۫ۛۗ۫۬";
                    break;
            }
        }
    }

    public void onBindView(View view) {
        String str = "ۜۤۧۨۛۨۤۜۚۙ۫ۜۨۦۘۨۜ۠۟ۙ۫";
        while (true) {
            switch ((str.hashCode() ^ 774) ^ -175618609) {
                case -1307290840:
                    str = "ۨ۬ۢ۠۠ۘۘۛ۫ۤۙۗۛۙۛۚۗۖۛۡۚ۟ۦۘۙ";
                    break;
                case -72781775:
                    return;
                case 193173324:
                    this.f555a = view;
                    str = "ۤۧۨۘۚۥ۠۠ۦۦۘۢ۟۫ۢۜۦ";
                    break;
                case 1337484813:
                    super.onBindView(view);
                    str = "ۜۗۦۡۖۡۘۢۨۚ۫ۥۡۘۢۙۗۛۨۙۧ۟ۗ";
                    break;
                case 1693281093:
                    str = "ۡۢۦۘۥۧۘۨۢۘ۫ۤۚۢۜۦ۬۬ۜۘۨۢۥۘ۬ۗۛۗۧۥۘ";
                    break;
            }
        }
    }

    public void setView(View view) {
        String str = "ۘۘ۠۫۬ۨۙۡۘۚۤۤۢۜۦۜۚۤ۟ۖۥ";
        while (true) {
            switch ((str.hashCode() ^ 474) ^ -1931675749) {
                case 423318580:
                    str = "ۦۚۜۘۧۥۜۖۜ۠ۨۤ۬ۦۧۜۡۥ۬ۤۖۖۘۗ۟ۘۘ";
                    break;
                case 1433766849:
                    return;
                case 1587336812:
                    this.f555a = view;
                    str = "ۙۥۢۨۢۚ۠۟ۨۘۜۛ۬ۚۤۖۘۗۦۢۢۛۡۘۥۧۘۘۜۦۧۘ";
                    break;
                case 1592528930:
                    str = "ۧ۠ۘۢ۫ۘۦ۟ۧۜۡۤۙۚۜۘ۠ۥۖۘۤۨۘۘۥ۠ۙ";
                    break;
            }
        }
    }
}
