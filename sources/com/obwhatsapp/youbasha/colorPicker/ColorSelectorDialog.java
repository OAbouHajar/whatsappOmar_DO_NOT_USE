package com.obwhatsapp.youbasha.colorPicker;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;
import com.obwhatsapp.yo.yo;
import com.obwhatsapp.youbasha.others;
import j.a;
import j.b;

public class ColorSelectorDialog extends Dialog {

    /* renamed from: i  reason: collision with root package name */
    public static final int f955i = 0;

    /* renamed from: a  reason: collision with root package name */
    public ColorSelectorView f956a;

    /* renamed from: b  reason: collision with root package name */
    public final OnColorChangedListener f957b;

    /* renamed from: c  reason: collision with root package name */
    public HistorySelectorView f958c;

    /* renamed from: d  reason: collision with root package name */
    public final int f959d;

    /* renamed from: e  reason: collision with root package name */
    public int f960e;

    /* renamed from: f  reason: collision with root package name */
    public Button f961f;

    /* renamed from: g  reason: collision with root package name */
    public Button f962g;

    /* renamed from: h  reason: collision with root package name */
    public Button f963h;

    public interface OnColorChangedListener {
        void colorChanged(int i2);
    }

    public ColorSelectorDialog(Context context, OnColorChangedListener onColorChangedListener, int i2) {
        super(context);
        this.f957b = onColorChangedListener;
        this.f959d = i2;
    }

    public void onCreate(Bundle bundle) {
        LinearLayout linearLayout = null;
        LinearLayout linearLayout2 = null;
        Button button = null;
        LinearLayout.LayoutParams layoutParams = null;
        Button button2 = null;
        LinearLayout.LayoutParams layoutParams2 = null;
        ColorSelectorView colorSelectorView = null;
        LinearLayout.LayoutParams layoutParams3 = null;
        LinearLayout.LayoutParams layoutParams4 = null;
        LinearLayout.LayoutParams layoutParams5 = null;
        Button button3 = null;
        LinearLayout.LayoutParams layoutParams6 = null;
        Button button4 = null;
        int i2 = 0;
        String str = "ۛۤۢۥۖۧۥۛۡۘۢ۟ۧۛۛۚ۬۬ۚۚۨ";
        while (true) {
            switch ((str.hashCode() ^ 162) ^ 1306570463) {
                case -2106047300:
                    this.f956a = colorSelectorView;
                    str = "ۧۖۤۙۛ۫ۘۙ۬ۡ۫ۖۘۤۜۦۗۛۤ";
                    break;
                case -1987207715:
                    this.f962g.setOnClickListener(new a(this, 1));
                    str = "۟ۖ۫۟ۙۙۗۛۛۡۡۦۘۚۥ۬ۚۖۖۘۢۤ۬";
                    break;
                case -1973693403:
                    layoutParams = new LinearLayout.LayoutParams(-1, -2);
                    str = "ۖ۬۫ۥۚۥۡۘۙۗ۬ۡۡ۬";
                    break;
                case -1969562159:
                    button3.setText(yo.getString("vibrate_length_default"));
                    str = "۟ۚۤۗ۫ۡۘۚۥۘۘۘۖ۬۟ۢ۫ۦۙ۬ۡ";
                    break;
                case -1722417110:
                    this.f961f = button;
                    str = "ۧۤۛۖۨۜۥۜۙۜۦۜۘۜ۫ۦۘ";
                    break;
                case -1681860299:
                    layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
                    str = "ۘۢۛۢ۟ۧۘ۬ۜۘۚۨۨ۟ۡۙۘۛۨ۟۟ۚ";
                    break;
                case -1426294461:
                    button = new Button(getContext());
                    str = "۫۬ۥۧۤۛۚۛۦۜ۠ۖۜۖۦۢۙۢۢۥۙۙ۠";
                    break;
                case -1320657501:
                    str = "ۥ۟ۚۚ۠ۦ۫ۙۡۘۦۧۥۘۥۢۨۨۤۦۥۗۡۛۘۨۧۡ";
                    break;
                case -1309067326:
                    this.f963h.setOnClickListener(new a(this, 2));
                    str = "۬ۗۛۛۛۘ۬ۢ۠ۙۡۜۘۧۢۥۘۥ۠ۙ";
                    break;
                case -1255067414:
                    linearLayout = new LinearLayout(getContext());
                    str = "ۨۧۚۦۤۚۨۙۡۘۤۢۥۘۤۘ۟";
                    break;
                case -1192449910:
                    button3 = new Button(getContext());
                    str = "ۖۚۛ۠ۘۢۧۗۨۘۤۗۤۤ۠ۘۘۡۡۖۘ۫۬ۙ۠ۡۥ۫ۧۨۘ";
                    break;
                case -1107151959:
                    this.f963h = button3;
                    str = "ۥ۠ۨۘۧۗۢۖۚۥۜۨ۠ۚۤ۫ۜۡ";
                    break;
                case -993697427:
                    this.f958c = new HistorySelectorView(getContext());
                    str = "ۘۛۖۘۗۧۜۘۤ۬۟ۙ۟ۨۜۘۥۘۜۥۥۧۥۥۦۦۖۘۦ۫ۡۘ";
                    break;
                case -898807437:
                    str = "۬ۦۡۘۙۖۚۚۨۘۤۢۘۘۖۘ";
                    break;
                case -803664532:
                    linearLayout.setOrientation(1);
                    str = "ۥۗۧ۠ۙۥ۠۟ۡۘ۫ۚۢۗۜۤۛ۠ۦۘ";
                    break;
                case -765235538:
                    button2 = new Button(getContext());
                    str = "ۥۧ۬ۨۖۨۖۜ۠ۤۛۜۥۥ";
                    break;
                case -734900246:
                    linearLayout.addView(this.f958c, 2, layoutParams4);
                    str = "۫ۙۘۘۡ۠ۥۥۥۡۘۛ۬ۖۢۡۦۥۧۜۘ۬۟ۡۘۖۦۧۚۗۥ";
                    break;
                case -731656507:
                    this.f958c.setOnColorChangedListener(new b(this, 1));
                    str = "۫ۙۤۜۨۛۜ۬ۘۘۨ۟ۜۡ۫";
                    break;
                case -703226760:
                    linearLayout2.setBackgroundResource(others.getID("transparentbackrepeat", "drawable"));
                    str = "ۘ۠ۦۘۨۘۘ۫ۤۨۘۢۧۗۘۢ۠ۧ۟ۖ۬ۥ۟۫ۤۖۘ";
                    break;
                case -657541540:
                    layoutParams6 = new LinearLayout.LayoutParams(-1, -2);
                    str = "ۤۧ۫ۜ۠ۜۘۗۚۢۥۗۨۛ۟ۤۙۗۚۖۗۦۤۥۨۘۗۤۨۘ";
                    break;
                case -608861356:
                    colorSelectorView = new ColorSelectorView(getContext());
                    str = "ۘۙۖۙۘۤۢۙۗۡۡ۬ۘۢۧ";
                    break;
                case -356572302:
                    button4.setBackgroundColor(i2);
                    str = "ۥۘۧۘ۟ۨۡۘۡ۬ۗۚ۟۬ۙۛۛۗۤۦ";
                    break;
                case -259560840:
                    setContentView(linearLayout);
                    str = "۠ۨۗ۟ۦۙ۠۟ۥۘۡۜۥۘ۠۫ۜ";
                    break;
                case -123498922:
                    linearLayout2.addView(this.f961f, layoutParams);
                    str = "ۥ۬ۚۚۥۦۘۛۗۜۘۘۤۚۤۚۚۘۢۨۘ";
                    break;
                case -80034821:
                    layoutParams3 = new LinearLayout.LayoutParams(-1, -1);
                    str = "ۡۢۨۘۦۡۦ۟ۚۡۤۤ۟ۛۡۘۜۖۨۘ";
                    break;
                case -42262377:
                    linearLayout.addView(linearLayout2, 3, layoutParams5);
                    str = "ۥۙۤ۬۬ۨۘۚ۠ۦۘۗۡۘۥۦۧۖۛۥ۬ۗ۠۟ۜۢۛۡ۫";
                    break;
                case -38353339:
                    this.f961f.setOnClickListener(new a(this, 0));
                    str = "ۙۤ۟ۗۖۥۛ۫ۛۡ۠ۧ۫ۖ۠ۢۘ۟ۚۦۧۘۗۥۡ";
                    break;
                case 37756082:
                    layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
                    str = "ۦۤ۟ۧ۫ۦ۠ۨۦۦۘۘۦۛۖۘۦۖۡۘۜۡۗۗۜۖ";
                    break;
                case 37985939:
                    button4 = this.f961f;
                    str = "۬ۡ۫ۦۧۗ۟ۛۖ۟ۜۚۥ۬ۜۘۧۥۗۧۧۤ";
                    break;
                case 187604873:
                    linearLayout.addView(this.f956a, 0, layoutParams3);
                    str = "ۡۖۨۘ۠۟۟ۗ۫ۖۛۦ۫ۧۗۢۙۛ۟۬۠ۨۘۖۜۧۘۦۢۜۘ";
                    break;
                case 270547969:
                    linearLayout2.addView(this.f962g, layoutParams2);
                    str = "ۦۤۡۗۛۨۜۢۖۘۚۤۢۖۧ۠";
                    break;
                case 281309158:
                    layoutParams4.weight = 0.0f;
                    str = "ۡ۟ۤۧۧۧۗۤ۟ۧۧۢ۟۫۠ۤۢۡۘۡۛ۫";
                    break;
                case 291488685:
                    layoutParams6.setMargins(0, 0, 0, 40);
                    str = "۠۟ۨۘۗۘۖۘۨ۬ۚۚۨۛۛ۬ۨۚۜۢۚۢ۠۫ۢۖۘ";
                    break;
                case 319894573:
                    layoutParams5.weight = 0.0f;
                    str = "ۢ۠ۦۘ۠ۥۖۗ۬ۦ۠۫ۥۘۜۚۨۥۛۥ۟ۥۧۗۜۤۗۧۥۘ";
                    break;
                case 369742056:
                    colorSelectorView.setOnColorChangedListener(new b(this, 0));
                    str = "۬۟ۘۘۜۡۧۘۡۗۥۘۢۨۧ۬۫ۦ";
                    break;
                case 556077247:
                    return;
                case 590304279:
                    layoutParams5 = new LinearLayout.LayoutParams(-1, -2);
                    str = "۟۟ۗ۬۬۟ۗۦۘۘۤۤ۫ۖۥۡۘ۫ۜۘۤۨۧۚۘۤ";
                    break;
                case 680014893:
                    layoutParams.weight = 1.0f;
                    str = "ۚۙۛۡۥۧۘۤ۫ۗۗۗۨۚ۠ۚ";
                    break;
                case 751155876:
                    layoutParams4.setMargins(0, 0, 0, 30);
                    str = "ۛۘۡۘۚ۬ۨۥۤۛۡۤۨۚۧۦۘ";
                    break;
                case 782361615:
                    this.f956a.setColor(i2);
                    str = "ۨۥۤ۬ۨۘۢۘۘۗۦۘۗۛۘۢۥ۬ۥۚۜۘ";
                    break;
                case 856849097:
                    linearLayout2 = new LinearLayout(getContext());
                    str = "ۙۚ۟ۙ۬ۖۘۢۘۛۚ۟۫ۚۙ۠ۘ۟ۡۖ۟ۨۛۢۛۥۨۘۘ";
                    break;
                case 859045932:
                    i2 = this.f959d;
                    str = "ۡۘۖ۟۟۠ۥۗۦۧ۟ۡۢۤۜۙۥۢۢۖۥۘ۟ۙۢ";
                    break;
                case 1391356308:
                    layoutParams3.weight = 1.0f;
                    str = "ۜۢۖۘ۠ۦۜۘۨۘۜۘۖۜۦۢۢۛۖۚۤۗۢۖۘۚۦ";
                    break;
                case 1408713527:
                    linearLayout.addView(this.f963h, 1, layoutParams6);
                    str = "ۗ۫ۘۘۤۤۨۘۡۜۥۘۦ۬ۨۘۦ۬ۜۘ۫۠ۖ";
                    break;
                case 1457461979:
                    layoutParams2.weight = 1.0f;
                    str = "ۚۜۛۘۦۖۘۨ۬ۦۘۛۧۙۡۡۡۘۘۤۦ۟ۛۨۘۜۧۨ";
                    break;
                case 1502367366:
                    this.f962g = button2;
                    str = "۠۬ۦۘ۫۠ۥۘۤۜۧۘۡ۠ۚۘۨۥۘۡۡۘۘۜ۬ۡۘ";
                    break;
                case 1704025024:
                    button.setText(yo.getString("color_old_color"));
                    str = "ۢۜۖۖۨۚۜۘۨ۠ۦۧۘۥۤۢۖۥ۟ۡۨۨۘۦۡۤۡۛۨۘ";
                    break;
                case 1721211955:
                    super.onCreate(bundle);
                    str = "ۙ۟ۡۘۙۦۨ۟۠ۧۙۦۘۗ۫";
                    break;
                case 1735060386:
                    this.f961f.setTextColor((i2 ^ -1) | -16777216);
                    str = "ۙۘ۬ۙ۠۠ۧۚۢۗۢۘۢۦۦ۟ۢۛۦۢۛ۠ۜۡۘ";
                    break;
                case 2089139083:
                    button2.setText(yo.getString("color_new_color"));
                    str = "۟ۗۢۚۡۛۤۥۧ۬ۗ۫۠ۘۦۘ۠ۤۥۖۛۡۘ";
                    break;
                case 2120624293:
                    layoutParams6.weight = 0.0f;
                    str = "ۥۖ۠۫ۨ۬ۚۖۧ۠ۖ۫۬۟ۛۖۨ";
                    break;
            }
        }
    }

    public void setColor(int i2) {
        String str = "ۘۨۢۛ۫ۧ۠ۘ۟ۢۡۖۘۦۚۙۚۙۜۘ۫ۧ۠";
        while (true) {
            switch ((str.hashCode() ^ 363) ^ -717888095) {
                case -1855297217:
                    return;
                case -810806662:
                    str = "ۙ۠ۚۡ۟ۚۙۙ۟ۘۢ۟۠ۥ۫ۧۜۘۗۥۡۘ";
                    break;
                case 1528168205:
                    str = "ۥۦۧۧۗ۠ۥۚۥۘۡۤۘ۬ۥ۬";
                    break;
                case 2121347115:
                    this.f956a.setColor(i2);
                    str = "ۢ۫۫۠ۜۡۗۨۖ۬ۛۛ۫۫ۘۘۨۦ۠ۤۧ۫ۨۦۨۙۤۨۘ";
                    break;
            }
        }
    }
}
