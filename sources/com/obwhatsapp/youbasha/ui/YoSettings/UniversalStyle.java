package com.obwhatsapp.youbasha.ui.YoSettings;

import X.AnonymousClass00T;
import android.annotation.SuppressLint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.preference.Preference;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import com.obwhatsapp.emoji.cem;
import com.obwhatsapp.yo.ColorStore;
import com.obwhatsapp.yo.m;
import com.obwhatsapp.yo.shp;
import com.obwhatsapp.yo.yo;
import m.o;
import m.p;
import m.q;

public class UniversalStyle extends BasePreferenceActivity {

    /* renamed from: h  reason: collision with root package name */
    public static final String f1224h = shp.getStringPriv("em_setV2", "stock");

    /* renamed from: e  reason: collision with root package name */
    public RadioGroup f1225e;

    /* renamed from: f  reason: collision with root package name */
    public Drawable f1226f;

    /* renamed from: g  reason: collision with root package name */
    public Drawable f1227g = null;

    static {
        String str = "ۛۡۘۜۢۧۘۗۖۖۢ۫ۜ۟ۨۚۜۘ۬ۦۧ";
        while (true) {
            switch ((str.hashCode() ^ 172) ^ 766251119) {
                case -1901212218:
                    str = "ۡۨۥۡۢ۟ۖۜۖۢۛۜۘۨۜۘۘ۬ۚۗۡۢۦۧ۟۠";
                    break;
                case 1950809232:
                    return;
            }
        }
    }

    public static void d(RadioButton radioButton) {
        String str = "ۡۙۖۘ۬ۢۚۡۢۨ۫۟ۥۗۤۘۘۗۤۖۙۥ۫";
        String str2 = null;
        while (true) {
            switch ((str.hashCode() ^ 583) ^ 1934605551) {
                case -1417378613:
                    radioButton.setOnCheckedChangeListener(new m(3, str2));
                    str = "ۙۨۤۜۖۜۘۨ۫ۜۘۡۥۦۘۜ۟ۡۢ۬۠ۨۧ";
                    break;
                case -829521961:
                    radioButton.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
                    str = "ۚ۫ۦۥۚۜۘۘ۫۠ۘۖۜۘۤ۠ۜۘۦۢۖۘۦۥۡۘۘۨ۟";
                    break;
                case -582856609:
                    radioButton.setChecked(str2.equals(f1224h));
                    str = "ۥۗۤۗ۫ۥ۫ۘۘۦۢۙۚ۠ۤۘ۫ۦ";
                    break;
                case -33293206:
                    radioButton.setOnTouchListener((View.OnTouchListener) null);
                    str = "ۧۖۧۘۖۢۥۘۡ۫ۚ۠ۥۦۘۢۤۚۥۖۛۡۤۖۜۜۗ";
                    break;
                case 612445718:
                    str2 = radioButton.getTag().toString();
                    str = "۬۫۠ۖۛۜۘۤۢۘۘۥۜۨۘۦۧۡۘۧۥ۟ۙۧۥۘ۫ۡۜ";
                    break;
                case 1814796031:
                    str = "ۦۛۨۛۘۜۖۥۨۘۘۖۤۨۖۨ";
                    break;
                case 2044030702:
                    return;
            }
        }
    }

    public final void c() {
        String str = "ۘ۬ۧۜۚۢ۬ۥۥۥۜۘۤۢ۫ۥۨۖ۟ۖۦۘۙ۫ۙ۫۟ۖ";
        int i2 = 0;
        boolean z2 = false;
        String str2 = null;
        RadioButton radioButton = null;
        int i3 = 0;
        int i4 = 0;
        Drawable drawable = null;
        Drawable drawable2 = null;
        while (true) {
            switch ((str.hashCode() ^ 810) ^ -1803502396) {
                case -2144742775:
                case 1751512732:
                    str = "ۚۢۜۚۘۚ۬۬ۨۡۛۘۘۜۥۛۜۡۖۚۙۢ۠ۤۗ۬";
                    break;
                case -2079631516:
                    drawable2 = AnonymousClass00T.A04(yo.getCtx(), yo.getID("sticker_store_download", "drawable"));
                    str = "ۚ۬ۨۗۜۦۘۗۘۡۘۥۢ۠۠ۖۦۡۗۖ";
                    break;
                case -1852726300:
                    this.f1225e = (RadioGroup) findViewById(yo.getID("checkbox_area", "id"));
                    str = "ۨۡۨۘ۟۬ۡۘۖ۫ۜۛۦۥۘۙۖۖۘۤ۠ۡۘ";
                    break;
                case -1524416850:
                    str = "ۢۦۖ۬ۘ۟ۜۧ۟ۜۦ۠ۚۨ";
                    i3 = i4;
                    break;
                case -1447768841:
                    radioButton.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, this.f1227g, (Drawable) null);
                    str = "ۗۢۖۘۛ۬ۨۧۘۙۥۥۘۘۨۜۘۢ۬ۜۗۤۨۡۜۛ";
                    break;
                case -1444691132:
                    radioButton.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, this.f1226f, (Drawable) null);
                    str = "ۥۥۥۢۧۨ۠۫ۥۖۨۘۗ۬ۖۡۙۙۜۘۘۧۚۥۘۤۥۘ";
                    break;
                case -1419870333:
                    drawable2.mutate().setColorFilter(ColorStore.getFabColorNormal(), PorterDuff.Mode.SRC_ATOP);
                    str = "ۙ۬ۡۨ۠ۧۢۧ۠ۖۖۗۡۤۦۘۥۥۢ";
                    break;
                case -877304337:
                    this.f1227g = drawable;
                    str = "ۧۡۢۧۚۡۘ۠ۤ۟ۡۧۦۘۧۚ۫ۜ۬ۖۘۡۗ۠";
                    break;
                case -626155730:
                    d((RadioButton) this.f1225e.getChildAt(0));
                    str = "ۘۜۥۘۡۙۘۘۨۤۙۧۚۦۘ۫۟ۡۘۙۛۜۢۘۦ۬۫ۘۨۜ";
                    break;
                case -606918066:
                    str = "ۢۦۖ۬ۘ۟ۜۧ۟ۜۦ۠ۚۨ";
                    break;
                case -515976898:
                    str = "ۤۚۧ۫ۘۦۚۦۨۜۚۘۨ۬ۛۨۤ۟۟ۢ۟";
                    break;
                case -488014866:
                    d(radioButton);
                    str = "ۗۢۘۘۦۡۡۥۦۘۢۜۢۗ۟ۦۤ۫ۙۧۢۖۘ۠ۘۚ۬ۥۥ";
                    break;
                case -253445002:
                    d(radioButton);
                    str = "ۦۨۗۢۥۖۙۦۨۘۙۜۧۘۡۛۙۚۧۜۘ";
                    break;
                case -136617590:
                    String str3 = "ۤۖۥۙۤۨۖ۫ۜۘۗۛ۟ۧۙۥۜ";
                    while (true) {
                        switch (str3.hashCode() ^ -1309012198) {
                            case -173523725:
                                if (!z2) {
                                    str3 = "ۜۜۖۢ۫۫ۛۚۡۥۢ۫۟ۥۨ";
                                    break;
                                } else {
                                    str3 = "ۗۙۚۥۤۧۧۨۧۘ۟ۨۜۥ۟ۨۘۥۦۖۛۦۡۘ۫۠ۡ۟ۛۢ";
                                    break;
                                }
                            case -12468528:
                                str = "۫۟ۦ۠ۨۖۘۡۘۦۦۤۙۙۜۗۙ۫ۦ";
                                continue;
                            case 53607436:
                                str3 = "۫ۧ۬ۨۦۙۦ۬ۡ۬۟ۤ۬ۚۡۘۖۦۜۙۡۗۘۨۖۘۘۡۤ";
                                break;
                            case 372767578:
                                str = "ۤ۬ۖۘۦۥۜۘۨۦۧۘۡۡۡۡۖۨۚۗ۫ۦۖ";
                                continue;
                        }
                    }
                    break;
                case 162187238:
                    radioButton.setOnCheckedChangeListener(new p());
                    str = "ۗ۫۠ۦۢۖۚۚ۫ۚۥۘۗۘۖۢ۟۬";
                    break;
                case 164655515:
                    String str4 = "ۥۚۥۘۥۧۘۨۥۦ۟۬ۛ۬ۛ۫ۦۢۤ";
                    while (true) {
                        switch (str4.hashCode() ^ 1979158867) {
                            case -1712091687:
                                str = "ۤۛۢ۠ۧۖ۬۠ۨۘۤ۠ۖۙۦۘۚ۟ۗۚۦۘۚۦ۠۟ۖۘ";
                                continue;
                            case -1621183660:
                                str4 = "۟ۧۙ۫ۛۡۖۡۧۖۡۥۘۖۢۘۢۥ۟ۥۧۦۧۗۘۘ";
                                break;
                            case -235289396:
                                str = "۟ۘۥۚۖ۬ۙۨۜۗۡۛ۬ۙۡۘۗۥۢۘۚۧ۠ۗۘ";
                                continue;
                            case 2146392748:
                                if (!str2.equals("sys")) {
                                    str4 = "ۙۖۦۡۥ۠۫ۖ۫ۚۙۚ۫ۘ۟ۡۤۦ";
                                    break;
                                } else {
                                    str4 = "ۚۨ۟۬ۤۥۘۛۘۨۘۙۜۗ۫ۛۦۘۖ۫ۡۘ۫ۛۘۧۗ۠ۧۤۥ";
                                    break;
                                }
                        }
                    }
                    break;
                case 435621513:
                    str2 = radioButton.getTag().toString();
                    str = "ۧۧۗۧۛۥ۬ۘۢۚۧۗۗۘۢۙۥۢۚۗۖۘ";
                    break;
                case 458596415:
                    String str5 = "ۨۛۜۧۘۖۘۖۢ۠ۜۚۨۛۡۛۗۡۤۖۦۦۖۙۨۘۖۥۜۘ";
                    while (true) {
                        switch (str5.hashCode() ^ 540533905) {
                            case -1041988293:
                                str = "ۚ۫ۖ۠ۚۜۚۘ۫۬ۜۖۘۤ۟ۡۘ";
                                continue;
                            case -248638926:
                                str5 = "۬ۗ۟۟ۡۡۘۙۢۢۥۦۦۥ۫۬۟ۘۤ۟۟ۜۘۖۖۧۘ";
                                break;
                            case 165839244:
                                if (i3 >= this.f1225e.getChildCount()) {
                                    str5 = "ۧۨۚۜ۠ۢۡ۠ۖۘۥۦ۫ۛۨۛ";
                                    break;
                                } else {
                                    str5 = "ۛۨۤۛۙۦۛۙۨۢۘۘۘۛۨ۟";
                                    break;
                                }
                            case 1914508186:
                                str = "ۥۢۜۥۢۡۘۜۦ۠ۛۤ۫ۥۚۙ";
                                continue;
                        }
                    }
                    break;
                case 568890001:
                    radioButton.setOnTouchListener(new q(this, radioButton, 0));
                    str = "ۚۢۜۚۘۚ۬۬ۨۡۛۘۘۜۥۛۜۡۖۚۙۢ۠ۤۗ۬";
                    break;
                case 775393846:
                    str = "۠ۡۙۙۤۡۘۥۛۦۖۤۤۖۨۤۚۦۖۘ";
                    i3 = i2;
                    break;
                case 1067735436:
                    z2 = cem.isEmojiPackInstalled(str2);
                    str = "ۥۚۛ۠ۘ۬ۗۗ۟ۚۘۨۘۛۧ۠";
                    break;
                case 1146175819:
                    str = "ۜ۬ۙۗۨۧ۠ۚۦۥۨ۠ۤۡ۟ۙۥ۬ۜ۠۠ۚۙۤۥۧ";
                    radioButton = (RadioButton) this.f1225e.getChildAt(i3);
                    break;
                case 1187281663:
                    radioButton.setOnTouchListener(new q(this, radioButton, 1));
                    str = "ۨۚۨۘۜ۬ۖۘۦ۬ۘۘۜۗۡۢۗۜ۟۟ۨ۫۫۟";
                    break;
                case 1255759614:
                    drawable = AnonymousClass00T.A04(yo.getCtx(), yo.getID("sticker_store_delete", "drawable"));
                    str = "ۨۤۗ۬۟ۤۜۤۘۘۘۢۜۦ۫ۘۘۗۤ۫ۙۛ۬ۛۛۜۘ";
                    break;
                case 1259463639:
                    str = "۬ۗۥۘ۬ۧۜۢ۫ۦۙۨۖۦ۫ۜۡۖۧۗۖ۠ۧۘۤۢۨ";
                    i4 = 1;
                    break;
                case 1295438618:
                    return;
                case 1581977391:
                    drawable.mutate().setColorFilter(ColorStore.getFabColorNormal(), PorterDuff.Mode.SRC_ATOP);
                    str = "ۢۜۜۘۙ۠ۘۘ۠ۤۡۛۢۘۘ۫۫ۡۡۛۙۚ۫ۖۦۜۗۢۚۙ";
                    break;
                case 1615036992:
                    this.f1226f = drawable2;
                    str = "ۜۗ۫ۡۜۖۘۥۜۡۘۗۘۨۘۥۜۚۢ۫ۘۘ۠ۖۡۘۤ۟ۖۘ۫ۖۢ";
                    break;
                case 1928544141:
                    i2 = i3 + 1;
                    str = "۬۠ۚۧ۠ۧۘ۠ۙۦۤۧ۬ۦۖۨ۠ۡۤۦۦ۟۠";
                    break;
            }
        }
    }

    @SuppressLint({"MissingSuperCall"})
    public void onCreate(Bundle bundle) {
        String str = "ۖ۟ۤۢۥۤ۟ۜ۬ۜۥۗ۟۫ۧۜۗ";
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Preference preference = null;
        while (true) {
            switch ((str.hashCode() ^ 221) ^ 1455036364) {
                case -1952566656:
                    str = "۬ۢ۬ۢۡۗ۫ۛۡۘۧۘۤ۟۟ۚ۠ۤۘۘ۠ۥ۬ۡۘۡۘ";
                    break;
                case -1870332281:
                    addPreferencesFromResource(yo.getID("yo_universal_style", "xml"));
                    str = "ۤۚۘۘۜۦۘۨۦۢۘۘۨۤۖۘ۫ۘۤ۠۟ۖ";
                    break;
                case -1682949708:
                    preference.setSummary(str3);
                    str = "ۗۢۨۦۖۡۘۛۡۙۨۥۘۘۥۢۖۘۨۙۖۘ";
                    break;
                case -1498401220:
                    str = "۬ۗۘۘۥۤ۟ۖۢۤ۫ۚۜ۬ۧ";
                    str3 = str2;
                    break;
                case -800620309:
                    return;
                case -136714181:
                    findPreference("acjicons").setOnPreferenceClickListener(new o(this, 1));
                    str = "ۚ۟ۜۦ۠ۨۘ۫ۨۧۘ۠۠۬۟ۙۜۘ";
                    break;
                case -45099863:
                    super.onCreatePrivate(bundle);
                    str = "ۨ۬ۨۘۚۥۗۤۛ۠۠۟ۘۘ۫۟ۜۘۧۤ";
                    break;
                case -44925502:
                    str = "۬ۗۘۘۥۤ۟ۖۢۤ۫ۚۜ۬ۧ";
                    break;
                case 1017608796:
                    String str5 = "ۗۦۘۘ۠ۦۨۘ۟ۙۗۙ۟ۗۜ۬ۘۤۙۘۛ۬ۨۘ";
                    while (true) {
                        switch (str5.hashCode() ^ 1038625324) {
                            case -1479838537:
                                str5 = "ۙۦۨۘ۟ۖۙۧۦۦۘۘۜۢۧۦ۠ۜۡۧۘ۫۟ۚۤ۫۫ۚ۠";
                                break;
                            case -286426497:
                                str = "ۘ۫۫ۨۖۨۘۘۗ۫۟ۥۨۘۨۙۤ۟ۙۨۘ";
                                continue;
                            case 1532549855:
                                str = "ۤۥۖۧ۫ۚ۠ۢۡۥ۟ۖۘۦۡۖۗۧۜۘۨ۫ۢۥۙ";
                                continue;
                            case 1967399865:
                                if (!shp.getFontName().equals("Custom (Load font)")) {
                                    str5 = "ۤۧ۟ۗۥ۠ۗۗۘ۟ۛ۠ۥۧۡۘ۠ۘ";
                                    break;
                                } else {
                                    str5 = "ۡۖۖۖۙۦۘۙۗۖۜ۟ۢ۠ۡۡۦۤۜۘ۫ۜۢۥۚۤ";
                                    break;
                                }
                        }
                    }
                    break;
                case 1083069740:
                    setContentView(yo.getID("yo_settings_universalstyles", "layout"));
                    str = "۫ۜ۟ۥۛۡۧۙۜۘۦۙۨۛۨۖ۫ۢ";
                    break;
                case 1627378767:
                    preference.setOnPreferenceClickListener(new o(this, 0));
                    str = "۠ۤۘۡ۟ۧۡ۟ۢۦ۫ۦۜۦ۫ۧۢۦ۫ۨۘۤ۟";
                    break;
                case 1732445312:
                    str4 = shp.getFontName();
                    str = "۬ۢۨۤ۠ۚۘۘۢۡۨۜۧۢۧۡۦۦۘ";
                    break;
                case 1794918551:
                    str2 = yo.getString("abc_capital_off");
                    str = "ۗ۬ۤۖ۠ۘۘۡ۟ۢۜۥۘۡۤۤ۟ۖۨۘۢ۫ۘۘ";
                    break;
                case 1806604629:
                    str = "ۘۗۘۨۘ۬ۧ۬۫ۦۘۘۨۡۙۗۖۙ۬ۡۨۘۖۡۘۢ۟ۛ";
                    str3 = str4;
                    break;
                case 2068190082:
                    str = "ۗ۟۫ۡۨۡۗۛۙۥۥۗۖۨ۟ۖ۠۫";
                    preference = findPreference("load_customfont");
                    break;
                case 2090004720:
                    str = "ۜ۟ۙ۠ۧۨۘۚۜۡۙۘ۫ۚۥۥۚۤۢ";
                    break;
            }
        }
    }

    public void onResume() {
        String str = "ۥۚۘۢ۠ۦۨۦۨۘۙۤۨۡۢۜۘۦۜۘۘ۟ۥۘ۟ۚۙ";
        while (true) {
            switch ((str.hashCode() ^ 775) ^ 2141682839) {
                case -1460943840:
                    return;
                case -690562688:
                    super.onResume();
                    str = "ۛ۟ۛۡ۟ۦۦۘ۫ۦ۠ۢۗۦۗۛ۬ۨۘۡۘۨۖۚ";
                    break;
                case 864419321:
                    str = "ۜۢۧۗۛۘ۫۫ۖۡ۠ۧۖۗۡۘ۫ۦۡۘۤ۠ۥۘۢۙۥ";
                    break;
                case 1981440828:
                    c();
                    str = "ۙ۠۫ۘ۠ۘۖۗۛۗۗ۫ۦۙ";
                    break;
            }
        }
    }
}
