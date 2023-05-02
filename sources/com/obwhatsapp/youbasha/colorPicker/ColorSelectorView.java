package com.obwhatsapp.youbasha.colorPicker;

import X.AnonymousClass00T;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TabHost;
import com.obwhatsapp.yo.yo;
import com.obwhatsapp.youbasha.others;
import j.c;
import j.d;

public class ColorSelectorView extends LinearLayout {

    /* renamed from: i  reason: collision with root package name */
    public static final int f964i = 0;

    /* renamed from: a  reason: collision with root package name */
    public RgbSelectorView f965a;

    /* renamed from: b  reason: collision with root package name */
    public HsvSelectorView f966b;

    /* renamed from: c  reason: collision with root package name */
    public HexSelectorView f967c;

    /* renamed from: d  reason: collision with root package name */
    public TabHost f968d;

    /* renamed from: e  reason: collision with root package name */
    public int f969e = 0;

    /* renamed from: f  reason: collision with root package name */
    public int f970f = 0;

    /* renamed from: g  reason: collision with root package name */
    public int f971g;

    /* renamed from: h  reason: collision with root package name */
    public OnColorChangedListener f972h;

    public interface OnColorChangedListener {
        void colorChanged(int i2);
    }

    public ColorSelectorView(Context context) {
        super(context);
        a();
    }

    public ColorSelectorView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }

    public final void a() {
        String str = "ۙۤۨۘۥۗ۫ۜۦۖۘۛۜ۠ۘۖۧۘۙۘۥۘ";
        TabHost.TabSpec tabSpec = null;
        TabHost.TabSpec tabSpec2 = null;
        TabHost.TabSpec tabSpec3 = null;
        d dVar = null;
        TabHost tabHost = null;
        HexSelectorView hexSelectorView = null;
        RgbSelectorView rgbSelectorView = null;
        HsvSelectorView hsvSelectorView = null;
        View view = null;
        while (true) {
            switch ((str.hashCode() ^ 314) ^ -1662532190) {
                case -2123369629:
                    this.f968d.addTab(tabSpec);
                    str = "ۤۨۜۘۦ۫ۡۧۚۥۘۗ۠۟ۜۤۦ۟ۨ۫ۚۨۥۘ۟۠ۜۘۨۢۙ";
                    break;
                case -2122356192:
                    this.f966b = hsvSelectorView;
                    str = "ۘۜ۠ۜۤۥۤۥ۫ۨۘۗۗ۫۠ۧ۬";
                    break;
                case -2107812522:
                    this.f965a.setOnColorChangedListener(new c(this, 1));
                    str = "۫ۦۘۚۢۗۨۚۜۘۚ۠ۧۙ۠۫ۗۗۨۨ۫۬ۜۢ۫";
                    break;
                case -1872707598:
                    this.f968d.addTab(tabSpec3);
                    str = "ۘۦۘۘۨۤۖۘ۟ۢ۫ۢۧ۠ۖۧۙ۫ۚۦۗ۟ۚۢۘۥۘ";
                    break;
                case -1686936776:
                    this.f965a = rgbSelectorView;
                    str = "ۥۜۦ۬ۦۖ۟ۡۜۚۙ۟ۜۙۥۤۗۖ";
                    break;
                case -1356196129:
                    tabSpec = this.f968d.newTabSpec("HEX").setIndicator("HEX", AnonymousClass00T.A04(yo.getCtx(), others.getID("hex32", "drawable"))).setContent(dVar);
                    str = "ۦۥۛۗ۫ۛۦۙۛۡۥۗۥۙ";
                    break;
                case -1319831936:
                    hexSelectorView.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
                    str = "۠ۧ۬ۡۗۖۜۧۤۢۚ۠ۛۡۥۘۡۨۛ";
                    break;
                case -1039150440:
                    this.f967c = hexSelectorView;
                    str = "ۨ۬ۦۘ۫ۧ۬۫ۦۢۨۡۜۡۗۡۡۢۙۧۚۖۘ";
                    break;
                case -983362389:
                    hsvSelectorView.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
                    str = "ۜۜۧۨۗۖۨۦۤۦۜۧۜۨۥۛۦۧۘ";
                    break;
                case -817520594:
                    rgbSelectorView = new RgbSelectorView(getContext());
                    str = "ۤۜۢۙۚۨ۟ۤۦ۟ۦ۟ۧۡۤۡۡۘ۠ۚۜ";
                    break;
                case -736747307:
                    this.f968d.addTab(tabSpec2);
                    str = "۠ۤۦۛ۫ۨ۠ۦۦ۠ۡۨۙۖۥۘۚۨۘۘ";
                    break;
                case -581140757:
                    addView(view, new LinearLayout.LayoutParams(-1, -1));
                    str = "ۘۧۗۛۗۥۘۘۥۢ۫ۘۘۦۜۨۘ۠ۢۥۘۖۦ۟ۗۗۘ";
                    break;
                case -551069231:
                    view = LayoutInflater.from(getContext()).inflate(others.getID("color_colorselectview", "layout"), (ViewGroup) null);
                    str = "ۖۘۦۘۖۦۘۦ۫ۢۡۗۡۘۨۨۖۘۗۨۗۨۙ۫۠۠۟";
                    break;
                case -323132929:
                    tabSpec2 = this.f968d.newTabSpec("RGB").setIndicator("RGB", AnonymousClass00T.A04(yo.getCtx(), others.getID("rgb32", "drawable"))).setContent(dVar);
                    str = "۫ۡۧۥۖۦۜۤۖۘۖۙۧۖۧ";
                    break;
                case -68061145:
                    tabSpec3 = this.f968d.newTabSpec("HSV").setIndicator("HSV", AnonymousClass00T.A04(yo.getCtx(), others.getID("hsv32", "drawable"))).setContent(dVar);
                    str = "ۨ۟ۥۘ۬۫۠ۢۨۗ۟ۤۥۧۥ۫";
                    break;
                case -46348247:
                    hsvSelectorView = new HsvSelectorView(getContext());
                    str = "ۨۤۛۙۘۘۢۢۜ۫ۙۡۘۜۖۤۖۚۛۘۨۙۦۨۡۘۗۡ";
                    break;
                case 193078504:
                    dVar = new d(this);
                    str = "ۘۧ۠۠ۙۚۖ۟ۗۖ۟ۡۘۗۤۛ۟ۖۖۥۙۜۘ";
                    break;
                case 684793686:
                    rgbSelectorView.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
                    str = "ۙۦۧۘ۠ۖ۬۬۫ۖۢۧۡۚۜۤۙۛۥۘۥۨ۫";
                    break;
                case 746876169:
                    this.f967c.setOnColorChangedListener(new c(this, 2));
                    str = "۠۠۠ۗۘۜۘۗۢۛۦۛ۬ۚ۬ۖۨۙۥۚۥۖۘۦۙۡۘۖ۬ۨۘ";
                    break;
                case 795888750:
                    str = "ۚۚۤۜۘۡۘۙۜۨۘۛ۬ۘۘ۟ۚ۟";
                    break;
                case 1221058473:
                    str = "ۖۡۗۤ۫۬۠ۥۦۘۧۛۜ۠ۡۘ۟ۘ۫ۖۗ۠ۘۜۘ";
                    tabHost = (TabHost) view.findViewById(others.getID("colorview_tabColors", "id"));
                    break;
                case 1269007986:
                    this.f966b.setOnColorChangedListener(new c(this, 0));
                    str = "ۧۥۛۢۦۗۛ۟ۨۥۦۙ۟ۖۛۡۡۜۘ";
                    break;
                case 1461038096:
                    this.f968d = tabHost;
                    str = "۬ۡۨۘۦۦ۫ۛۙۧۙۗۖۦۙۖۘۧۘۦۖۥۦۘۘۥۚ";
                    break;
                case 1551227257:
                    tabHost.setup();
                    str = "ۛۛ۟ۖۖۡ۬ۦۧۘۜۜۧۘۦۗۜۘۢ۫ۤۦۖۢ۠ۨۚ";
                    break;
                case 1628222065:
                    return;
                case 2125873177:
                    hexSelectorView = new HexSelectorView(getContext());
                    str = "۬ۘۨۘۛۦۜۘۘۛۖۘۗۧۙ۬۬ۙۨۗۜۜۨۡۢۢ";
                    break;
            }
        }
    }

    public int getColor() {
        String str = "ۧۖۖۘۨۦۤۧۨۜۧۗۖۘۤ۫ۡۖۗۤۦۖ۬ۧۛۜ";
        while (true) {
            switch ((str.hashCode() ^ 498) ^ 1828780917) {
                case -1741518880:
                    return this.f971g;
                case 475336618:
                    str = "ۜ۬ۛۗ۬ۡۦۖۨۡۘۜۘ۫ۤۙۙ۠ۘۙۛ۬ۘۢۥۘۦ۫ۘ";
                    break;
            }
        }
    }

    public void onMeasure(int i2, int i3) {
        String str = "ۦ۫ۨۘ۬ۚۚۨ۠ۘ۫۫ۖۘۖۙۛۜۥۚۡ۟ۘ";
        while (true) {
            switch ((str.hashCode() ^ 52) ^ -1510708313) {
                case -2134723149:
                    this.f969e = getMeasuredHeight();
                    str = "ۢۨۜۗۛۚۗۖۘۤ۠ۥۘ۟۬ۡۖۨ۠۬ۨۦۘ";
                    break;
                case -1901524509:
                    super.onMeasure(i2, i3);
                    str = "۬ۢۘۛۦ۬ۢۧۡۨۢ۫ۡ۟ۢۜۗۡۘۨۛ۫ۚ۟ۜۘ";
                    break;
                case -1768329281:
                    setMeasuredDimension(this.f970f, this.f969e);
                    str = "۟ۥۨۘۘۜۖۡۘ۠ۙۡ۬ۡ۫ۛ۫ۗۥۦۦۘۢۖ۠ۢۛۡ";
                    break;
                case -1753934109:
                    this.f970f = getMeasuredWidth();
                    str = "ۧۡۡۘۘۖ۫ۘ۠۠ۘۢۤ۠ۤۜۥۙۨۘۤۦۦۘۚۨ۬";
                    break;
                case -1027561244:
                    String str2 = "۫ۘۡۗۧۦۜۢۡۜ۬ۦۘۧۛۖۘۧۦۧ۟ۡۚ۫۬ۜۘۗۘۚ";
                    while (true) {
                        switch (str2.hashCode() ^ -829250015) {
                            case -1725476024:
                                str = "ۧۡۡۘۘۖ۫ۘ۠۠ۘۢۤ۠ۤۜۥۙۨۘۤۦۦۘۚۨ۬";
                                continue;
                            case 59093456:
                                str2 = "ۖۘ۬ۗۚۛ۟ۖۤۙۤ۫ۨۤۖ۬ۘۧۦۜۡۘ";
                                break;
                            case 1489248270:
                                str = "ۨۛۦۘۖ۬۟ۤۚۧۖۖ۠ۦۤۦۘۥ۟ۥۘۚۥۧۦۜۢ";
                                continue;
                            case 1725441562:
                                if (!"HSV".equals(this.f968d.getCurrentTabTag())) {
                                    str2 = "۫ۙ۟۠۫ۘۘۜۥۗ۟ۧۜۘۚۦۖۦۗۦۘۧ۟ۘ";
                                    break;
                                } else {
                                    str2 = "۬ۤ۟ۚۘۚۗۧۢۚۛۘۧ۠۟ۢ۫ۢۙۢۙۤۗۛ۫ۗ";
                                    break;
                                }
                        }
                    }
                    break;
                case -449465814:
                    str = "ۚ۬ۘۘۢۜۜ۠ۖۗۖۙۛۡ۟ۙۖۦۦۛۡۘ";
                    break;
                case 267881253:
                    str = "ۛ۠ۦۘۗۘۥۘۖۛۧۦۤ۬۠ۚۡ";
                    break;
                case 1798317702:
                    return;
                case 1883354371:
                    str = "ۚۘۖۗۙۖۘۦۨۡۘۚ۟ۗۨۙۧ";
                    break;
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setColor(int r9) {
        /*
            r8 = this;
            r2 = 0
            java.lang.String r0 = "ۘ۬ۡۘۢۖ۠ۡۡۘۘۤۙۜۧۢ"
            r1 = r2
            r3 = r2
            r4 = r2
            r5 = r2
        L_0x0007:
            int r2 = r0.hashCode()
            r6 = 476(0x1dc, float:6.67E-43)
            r7 = -493199766(0xffffffffe29a5e6a, float:-1.4238009E21)
            r2 = r2 ^ r6
            r2 = r2 ^ r7
            switch(r2) {
                case -1930303532: goto L_0x003a;
                case -1110140192: goto L_0x008d;
                case -1099349697: goto L_0x0045;
                case -924637766: goto L_0x0094;
                case -221260756: goto L_0x0067;
                case -150347386: goto L_0x0061;
                case -89857443: goto L_0x00fd;
                case 154982284: goto L_0x00bf;
                case 250623114: goto L_0x00e2;
                case 501958977: goto L_0x009b;
                case 856359911: goto L_0x00b8;
                case 901321044: goto L_0x00f9;
                case 958184753: goto L_0x006d;
                case 1003011522: goto L_0x0019;
                case 1655405351: goto L_0x003f;
                case 2065871031: goto L_0x0016;
                case 2087197776: goto L_0x001c;
                case 2094820235: goto L_0x00c5;
                default: goto L_0x0015;
            }
        L_0x0015:
            goto L_0x0007
        L_0x0016:
            java.lang.String r0 = "ۥۖۛۘۧۚۖۗۜۧۢۗۤۚ۬"
            goto L_0x0007
        L_0x0019:
            java.lang.String r0 = "ۘۤۡۦ۫ۙۘ۬ۘۘۛ۠ۨۘۙۦۛ"
            goto L_0x0007
        L_0x001c:
            r2 = 694236410(0x296134fa, float:5.0005986E-14)
            java.lang.String r0 = "۟ۨۡ۫ۢۗۗ۟ۨۦ۟ۧۡۜ"
        L_0x0021:
            int r6 = r0.hashCode()
            r6 = r6 ^ r2
            switch(r6) {
                case -935060827: goto L_0x0034;
                case -623812780: goto L_0x00ed;
                case -127479093: goto L_0x002a;
                case 1256497217: goto L_0x0037;
                default: goto L_0x0029;
            }
        L_0x0029:
            goto L_0x0021
        L_0x002a:
            int r0 = r8.f971g
            if (r0 != r9) goto L_0x0031
            java.lang.String r0 = "ۚ۬ۖۨ۫ۖۨۦۘۧۢۦۘۨۘۧ"
            goto L_0x0021
        L_0x0031:
            java.lang.String r0 = "ۜ۟ۜۘۗۖۢۛۢۙۥۡۨ۬ۘۘ"
            goto L_0x0021
        L_0x0034:
            java.lang.String r0 = "۠ۥۙۦۖۖ۠ۥۚۧۘ۬۬۟ۛ۬ۢۡ"
            goto L_0x0021
        L_0x0037:
            java.lang.String r0 = "ۧ۟ۘۘۛۤۛۜۚۘۘۚۥۡۧ۬ۙۙۙ۫ۥۢۧۜۛۚۥۡ"
            goto L_0x0007
        L_0x003a:
            r8.f971g = r9
            java.lang.String r0 = "ۨۥۖۘۧۛۥۡۜۤۤۡۥۘ۟ۗۥۦۛۥۘۥۛ۠ۘ۫۠"
            goto L_0x0007
        L_0x003f:
            com.obwhatsapp.youbasha.colorPicker.HsvSelectorView r2 = r8.f966b
            java.lang.String r0 = "ۙۥۤ۟ۚۨۛۨۢۢۙ۟ۖۜ۬ۤۥۥۡۨۘ۟ۡۜۘ"
            r5 = r2
            goto L_0x0007
        L_0x0045:
            r2 = 1313366911(0x4e48637f, float:8.4049094E8)
            java.lang.String r0 = "ۡۦۥۘ۫ۘۨۤۡۡۤ۬۠۫۬۟ۛ۟ۛۥۘۘ"
        L_0x004a:
            int r6 = r0.hashCode()
            r6 = r6 ^ r2
            switch(r6) {
                case -981190774: goto L_0x0059;
                case 1137661649: goto L_0x0053;
                case 1531511359: goto L_0x005e;
                case 1835747480: goto L_0x00f1;
                default: goto L_0x0052;
            }
        L_0x0052:
            goto L_0x004a
        L_0x0053:
            java.lang.String r0 = "ۚۙۗۦۢۦۙۘۗۤۜۘ۬۫ۖۘۡۤۧ۫ۨ۠۫ۜۛ"
            goto L_0x0007
        L_0x0056:
            java.lang.String r0 = "ۢ۬ۗۥ۫ۘۘۡۘۘۘۗ۠ۛۦۤۡۘۚۗۥۘۛ۟ۘ"
            goto L_0x004a
        L_0x0059:
            if (r5 == 0) goto L_0x0056
            java.lang.String r0 = "ۢ۟ۖۤۖۨۡۛۙۢۚۥۘۧۘۥۦۖۥۘۘۦۘ"
            goto L_0x004a
        L_0x005e:
            java.lang.String r0 = "ۚ۫ۢۙۛ۫ۤ۬۟ۗ۠ۧۗۖۨۘ"
            goto L_0x004a
        L_0x0061:
            r5.setColor(r9)
            java.lang.String r0 = "ۥۘۙ۟ۨۗۙۤۨۗۜ۠ۜۜ۠"
            goto L_0x0007
        L_0x0067:
            com.obwhatsapp.youbasha.colorPicker.RgbSelectorView r2 = r8.f965a
            java.lang.String r0 = "۬ۨۧۘۢۜۦۖ۬ۜۘۨ۟ۖۖۨۛ۠ۖۘ"
            r4 = r2
            goto L_0x0007
        L_0x006d:
            r2 = -1435045548(0xffffffffaa76f154, float:-2.1932917E-13)
            java.lang.String r0 = "ۦۨۜۘۖۧۘۡ۟ۡۢ۟ۡۨۡۜۚۢۙۡۥۘ"
        L_0x0072:
            int r6 = r0.hashCode()
            r6 = r6 ^ r2
            switch(r6) {
                case -1727072980: goto L_0x007b;
                case -126005656: goto L_0x0081;
                case 890093065: goto L_0x0086;
                case 1528173298: goto L_0x0089;
                default: goto L_0x007a;
            }
        L_0x007a:
            goto L_0x0072
        L_0x007b:
            java.lang.String r0 = "ۡۡۨۨۢۦۘ۫ۨۘ۫۠۬ۧۢۖۘۙ۫ۥۘ۠ۦۡۡۥۙ"
            goto L_0x0007
        L_0x007e:
            java.lang.String r0 = "ۡۘۧۢۥ۫ۚۜۧۘۧۘۜۘۧۧۗۥۦۜۘۜۡۛ۬ۛۡ"
            goto L_0x0072
        L_0x0081:
            if (r4 == 0) goto L_0x007e
            java.lang.String r0 = "ۢۜۢۧۡۛ۫ۡۦۘۤۖۜۖۙ۫ۢ۬۬ۨۦۘ۬ۚۢ"
            goto L_0x0072
        L_0x0086:
            java.lang.String r0 = "ۡۡ۬ۙۜ۬۠۠ۡ۠ۙ۬ۥۢ۬ۙۗۤ"
            goto L_0x0072
        L_0x0089:
            java.lang.String r0 = "ۤۗۚ۟ۖۙۗۜۨۛۦۢۢۙۧۙۡۘ۠ۜۡ"
            goto L_0x0007
        L_0x008d:
            r4.setColor(r9)
            java.lang.String r0 = "ۡۡۨۨۢۦۘ۫ۨۘ۫۠۬ۧۢۖۘۙ۫ۥۘ۠ۦۡۡۥۙ"
            goto L_0x0007
        L_0x0094:
            com.obwhatsapp.youbasha.colorPicker.HexSelectorView r2 = r8.f967c
            java.lang.String r0 = "۠ۖۡۘۖۡۗۙ۟ۘۦۦۧۛۘۘۖۛۤ۠۟۟ۗۦ"
            r3 = r2
            goto L_0x0007
        L_0x009b:
            r2 = -1191039511(0xffffffffb9022de9, float:-1.2414869E-4)
            java.lang.String r0 = "ۜۡۥۡۥۡۗۖۦۥۨۖۘۢۢ۟۠۬ۘۘ"
        L_0x00a0:
            int r6 = r0.hashCode()
            r6 = r6 ^ r2
            switch(r6) {
                case -1189045642: goto L_0x00b5;
                case -233039567: goto L_0x00f5;
                case 845432576: goto L_0x00a9;
                case 1826593525: goto L_0x00b0;
                default: goto L_0x00a8;
            }
        L_0x00a8:
            goto L_0x00a0
        L_0x00a9:
            java.lang.String r0 = "ۙ۫ۖۘۧ۬ۗ۬ۜۖۨۥۤۚۖ۬"
            goto L_0x0007
        L_0x00ad:
            java.lang.String r0 = "ۜۙۥۘ۫ۙۚۖۖۥۚۜۥۘۥۨۙ"
            goto L_0x00a0
        L_0x00b0:
            if (r3 == 0) goto L_0x00ad
            java.lang.String r0 = "ۨۚۖۜۡۧۡۖۖۜۚۦۧۨۖۘۨۜۦۘۚۥۘ"
            goto L_0x00a0
        L_0x00b5:
            java.lang.String r0 = "ۜۙۦۙۧۥۨۤ۟ۨۧۨۢ۟ۜ۫ۥۜۘۦۗۛ"
            goto L_0x00a0
        L_0x00b8:
            r3.setColor(r9)
            java.lang.String r0 = "۫ۗ۟۟ۤۡۘۦۜۢ۠ۖ۬ۡۢ"
            goto L_0x0007
        L_0x00bf:
            com.obwhatsapp.youbasha.colorPicker.ColorSelectorView$OnColorChangedListener r1 = r8.f972h
            java.lang.String r0 = "ۙ۬۟۫ۦۘۘۧ۠ۢۗۜۛۙۜۨۙۡۗۢۗۗۨۤۘۧۘۦ"
            goto L_0x0007
        L_0x00c5:
            r2 = 873836738(0x3415b0c2, float:1.394101E-7)
            java.lang.String r0 = "ۛۚۛۥ۫ۡۘۡۖۘۗۢۛۛۘۦۙ۠۠"
        L_0x00ca:
            int r6 = r0.hashCode()
            r6 = r6 ^ r2
            switch(r6) {
                case -1710252080: goto L_0x00f9;
                case -336215836: goto L_0x00db;
                case 836141044: goto L_0x00d3;
                case 1353152144: goto L_0x00de;
                default: goto L_0x00d2;
            }
        L_0x00d2:
            goto L_0x00ca
        L_0x00d3:
            if (r1 == 0) goto L_0x00d8
            java.lang.String r0 = "ۜ۬ۧۖ۫ۨۘۜۗ۠ۦ۬ۛ۫ۨۘۗۥۦۘۚ۟ۦۘ"
            goto L_0x00ca
        L_0x00d8:
            java.lang.String r0 = "۟ۗۡۘۜۗۜۥۗۤۡ۬ۧۨ۟ۢۛۥۗۗۖۘ۠ۗۤ"
            goto L_0x00ca
        L_0x00db:
            java.lang.String r0 = "۠ۤۘۛۙۜۘۥ۠ۧۧ۬ۙۘۧۗ"
            goto L_0x00ca
        L_0x00de:
            java.lang.String r0 = "۫۟ۜۘۗۘ۬۠ۦۢۗۡۘۥۦۥۥۛ۠ۗۨۖۘ۫۫ۢ"
            goto L_0x0007
        L_0x00e2:
            int r0 = r8.getColor()
            r1.colorChanged(r0)
            java.lang.String r0 = "ۛۦۨۘۚۦۧۘۘ۠ۥ۫ۦۧۢۧۗۡۘۚۥۜۦۨ۟ۢۘۜۥۘ"
            goto L_0x0007
        L_0x00ed:
            java.lang.String r0 = "۠ۦۡۖۚۢۨۘۚۢۧ۟ۘۜۨۘ۬ۤۖۘۗۧۖۘ۫ۚۘۘ"
            goto L_0x0007
        L_0x00f1:
            java.lang.String r0 = "ۥۘۙ۟ۨۗۙۤۨۗۜ۠ۜۜ۠"
            goto L_0x0007
        L_0x00f5:
            java.lang.String r0 = "۫ۗ۟۟ۤۡۘۦۜۢ۠ۖ۬ۡۢ"
            goto L_0x0007
        L_0x00f9:
            java.lang.String r0 = "ۛۦۨۘۚۦۧۘۘ۠ۥ۫ۦۧۢۧۗۡۘۚۥۜۦۨ۟ۢۘۜۥۘ"
            goto L_0x0007
        L_0x00fd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.youbasha.colorPicker.ColorSelectorView.setColor(int):void");
    }

    public void setOnColorChangedListener(OnColorChangedListener onColorChangedListener) {
        String str = "ۚۖۧۘۜۧۗۘۖۖۘۛۥۡۘ۬ۨۖۘۛۧۘ۬۟ۧۡۨۨۢۤ";
        while (true) {
            switch ((str.hashCode() ^ 782) ^ -1278775513) {
                case -1262063532:
                    str = "ۛۛ۟ۙ۠ۦۘۜۤۨۡۡۥۘۡۖۛۦۚۦۘۨۨ۬۠ۢۜۦ۟";
                    break;
                case -1225122703:
                    str = "ۢۘۜۤ۬ۘۙۥۨۘۗۘۤۘ۠ۘۜۘ۬ۘ۠۟۬ۗۨۘۗۗ";
                    break;
                case -521106319:
                    return;
                case 1384015708:
                    this.f972h = onColorChangedListener;
                    str = "ۜۢ۬ۙۦۡۘ۟ۘۥۘۜۤۜۧۛۨۙۦۘ۠ۚۨ۬ۧۘ۫۟";
                    break;
            }
        }
    }
}
