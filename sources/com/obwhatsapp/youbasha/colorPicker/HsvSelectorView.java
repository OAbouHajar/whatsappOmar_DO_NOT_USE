package com.obwhatsapp.youbasha.colorPicker;

import android.content.Context;
import android.graphics.Color;
import android.support.v4.view.MotionEventCompat;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.obwhatsapp.youbasha.others;
import j.i;

public class HsvSelectorView extends LinearLayout {

    /* renamed from: f  reason: collision with root package name */
    public static final int f1021f = 0;

    /* renamed from: a  reason: collision with root package name */
    public HsvAlphaSelectorView f1022a;

    /* renamed from: b  reason: collision with root package name */
    public HsvHueSelectorView f1023b;

    /* renamed from: c  reason: collision with root package name */
    public HsvColorValueView f1024c;

    /* renamed from: d  reason: collision with root package name */
    public int f1025d;

    /* renamed from: e  reason: collision with root package name */
    public OnColorChangedListener f1026e;

    public interface OnColorChangedListener {
        void colorChanged(int i2);
    }

    public HsvSelectorView(Context context) {
        super(context);
        b();
    }

    public HsvSelectorView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        b();
    }

    public final int a(boolean z2) {
        String str = "ۨۚۖۘۨۘۨ۬ۧ۟ۤۥۘۨۜ۬";
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        float f2 = 0.0f;
        float f3 = 0.0f;
        float f4 = 0.0f;
        while (true) {
            switch ((str.hashCode() ^ 614) ^ -1551602521) {
                case -1958096446:
                    f2 = this.f1024c.getValue();
                    str = "۠۫ۜۗۨۤ۬ۢۙۗۨۤۜۤۙۘ۠ۥۘ";
                    break;
                case -1622036181:
                    str = "ۘۨۘۘۖ۠ۤۖۧۥ۬ۦۧۛۥۥۘۡۘۦۘۧۗۖۘۚۥۥۘ";
                    i3 = i4;
                    break;
                case -1460886117:
                    String str2 = "۫ۛۛۥۢۡۘۥ۠ۡ۟ۧۨۖۚ۟ۥۤۤ";
                    while (true) {
                        switch (str2.hashCode() ^ 1753789399) {
                            case -1572523826:
                                str = "ۥۜۥۚ۠ۦۘۖ۬۫ۡۛۘۘ۠۠۠۟ۦ۠";
                                continue;
                            case -543630675:
                                str = "۫ۥ۬۟ۜۧۘۘۦۨۘۚ۬ۖۖۦ۫ۛۖۖ";
                                continue;
                            case 843157297:
                                str2 = "ۨۗۧۖۤۦ۠ۥۨۘ۟ۙۡۤۘ۠۫۟ۚۥۧۨ";
                                break;
                            case 1003641364:
                                if (!z2) {
                                    str2 = "۫ۡۚۜ۬ۡۘ۟ۥۘۘۤ۠ۖ۫۟ۢ۠۬ۥۘۚۘۢۖۘۡۘ";
                                    break;
                                } else {
                                    str2 = "ۤۛۦۘۖۥۦۘ۫ۗۧۢۚ۟ۙۘۘۖۦۡۘۤۚۨۘ۟ۡ۫۬ۥۘ";
                                    break;
                                }
                        }
                    }
                    break;
                case -1385360310:
                    str = "۠ۛۖۘۘۘۛۚ۟۠۠ۚ۠ۧ۫ۙ۠۫ۧۙۚ۫ۡۖۡۙ۬۫";
                    f4 = this.f1023b.getHue();
                    break;
                case -880530777:
                    str = "ۖۥ۬۟ۚۛۛۥۥۗۥ۠۠۫ۨۘۗۧۨ۫ۜۨۧۘ۟۬ۦۗ";
                    f3 = this.f1024c.getSaturation();
                    break;
                case -488654962:
                    str = "۠ۗۛ۬ۤ۫۫ۘۥۘۗۥۡۘۘۤ۫ۨ۠ۥۘۜۨۧۙ۬ۘ";
                    i3 = i2;
                    break;
                case -382434376:
                    str = "۠ۗۛ۬ۤ۫۫ۘۥۘۗۥۡۘۘۤ۫ۨ۠ۥۘۜۨۧۙ۬ۘ";
                    break;
                case 15920999:
                    i4 = (int) this.f1022a.getAlpha();
                    str = "ۚۘۧۘۗۙۙۚۜ۠ۘۙۥ۠۬ۜۧۛۗۙۧۚۨۧۦۦ";
                    break;
                case 359858337:
                    return Color.HSVToColor(i3, new float[]{f4, f3, f2});
                case 1605340768:
                    str = "ۧۛۜۘ۫ۨۨۨۨۙۢۖۧۖۗۡۙۛۜۤۗۜۥۚۦۘ۠ۢۘ";
                    break;
                case 1759951107:
                    i2 = MotionEventCompat.ACTION_MASK;
                    str = "ۢۦۦۘۖۥۦۨ۠ۤۙۛ۠ۘۢۗ۠ۜۘۜۢۦۨۙ";
                    break;
                case 1782424724:
                    str = "ۚ۟ۘۘ۫۫ۡۚۥۦۙۖ۬ۥ۬ۙۛۜۘۢۙۘۛۤۘۘ۬ۢ";
                    break;
            }
        }
    }

    public final void b() {
        String str = "ۥ۫ۨۚۗۢۜۤۖۙۙۛۨ۠ۖۘۡۘۚۧۨۦۘ";
        HsvHueSelectorView hsvHueSelectorView = null;
        HsvAlphaSelectorView hsvAlphaSelectorView = null;
        HsvColorValueView hsvColorValueView = null;
        View view = null;
        while (true) {
            switch ((str.hashCode() ^ 632) ^ -1036825056) {
                case -1825307009:
                    this.f1023b = hsvHueSelectorView;
                    str = "۫۬ۖۘۖۜۙۥ۬ۤۙۨۖۜۤۜۗۨۜۖۤۘۘ";
                    break;
                case -1560166166:
                    str = "ۢ۬ۡ۟ۗۗ۫ۘۥۘۡۖۘۘۛۥۧۛۗۘ۠ۚۢۡۜۧۙۧۥ";
                    hsvAlphaSelectorView = (HsvAlphaSelectorView) view.findViewById(others.getID("color_hsv_alpha", "id"));
                    break;
                case -1546588519:
                    addView(view, new LinearLayout.LayoutParams(-1, -1));
                    str = "۫ۙۜۘ۫۟ۨۘ۫ۘۘ۬ۙۚ۬ۦۛ";
                    break;
                case -1542093791:
                    str = "ۜۘۦۨۧۛۡۖۦۚۜۡۙ۫ۥۘ";
                    hsvColorValueView = (HsvColorValueView) view.findViewById(others.getID("color_hsv_value", "id"));
                    break;
                case -1398681219:
                    setWillNotDraw(false);
                    str = "ۚ۠ۦۧۗۦۘ۠ۚۛۤۡۤۚۛۤۢۧۧۜۖۨۘ";
                    break;
                case -925120214:
                    hsvAlphaSelectorView.setOnAlphaChangedListener(new i(this));
                    str = "ۛ۠ۡۘۥۖ۫ۖۦۘۘ۠۟ۘۧ۫ۘۘ۟۫ۖۘۥۜۘۘ۟ۧ";
                    break;
                case -856822684:
                    str = "۫۫ۡۖ۫ۚۗۖۘۘۥۤۘۘۙۤۛۗۘۤۡ۫ۨۘۖۗۗ";
                    hsvHueSelectorView = (HsvHueSelectorView) view.findViewById(others.getID("color_hsv_hue", "id"));
                    break;
                case -390337393:
                    this.f1022a = hsvAlphaSelectorView;
                    str = "ۛ۬ۗ۬ۤۦ۬ۤ۠ۜۚۡ۠ۘۡۘ";
                    break;
                case -212248087:
                    view = LayoutInflater.from(getContext()).inflate(others.getID("color_hsvview", "layout"), (ViewGroup) null);
                    str = "ۨۧۨۘۙۗۜۘۡۚۘۗۛۨۧ۬ۘۘ۠ۦۗۦۧۜۘۜۘۖۘ";
                    break;
                case 370772976:
                    hsvColorValueView.setOnSaturationOrValueChanged(new i(this));
                    str = "ۚۘۢۡۨۖۘۥ۠ۧۛۛۥۘۛ۫ۤ۬ۜ";
                    break;
                case 553370040:
                    setGravity(1);
                    str = "ۡۨۘۚۨۙ۠۟ۖۘۤ۠۬ۛۙۘ";
                    break;
                case 1058541191:
                    hsvHueSelectorView.setOnHueChangedListener(new i(this));
                    str = "۬ۨۙۛۦۨ۟ۚۧ۬ۗۙۤۢۥۘ";
                    break;
                case 1155776963:
                    setOrientation(0);
                    str = "ۡۢ۫ۦ۟ۧۥۨۘۘۥۦۛۢۦۢۢ۫۬ۨۥۜۦ۟";
                    break;
                case 1253494141:
                    this.f1024c = hsvColorValueView;
                    str = "ۤ۟ۧۢ۫ۢ۠ۧۘۘۗۜۘۗۜۚ۫ۥۘ";
                    break;
                case 1427980628:
                    str = "ۨۚۗۜۚ۟ۜۨۘ۟ۚ۬ۡۥ۠";
                    break;
                case 1771282377:
                    return;
                case 1942336523:
                    setColor(-16777216);
                    str = "ۜۧۘۢۙۥۘۥۖۖۧۛۦ۠۫۠ۡ۫ۜۢۙۦ۫ۧۡۘ";
                    break;
            }
        }
    }

    public int getColor() {
        String str = "ۡۤۙۡۚ۫۟ۙۗۚۧۦۤۨۖۤ۫۟۟ۙۨۘ";
        while (true) {
            switch ((str.hashCode() ^ 481) ^ 1150526090) {
                case -969527549:
                    str = "۟۠ۤۜۧۥ۬ۖۨۙ۟ۡۜۡۢ۟۠۠";
                    break;
                case -912877027:
                    return this.f1025d;
            }
        }
    }

    public void onMeasure(int i2, int i3) {
        String str = "ۦ۠ۖۘ۟ۙۡۘۢۤۡ۠ۧ۬۠ۥۘۘۘۧۢ";
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            switch ((str.hashCode() ^ 963) ^ 1362577479) {
                case -1635901547:
                    this.f1023b.setMinContentOffset(this.f1024c.getBackgroundOffset());
                    str = "ۧۥۧۡۢ۬ۙۘۖۘۜۛۦۥۦۦ";
                    break;
                case -1605633857:
                    str = "ۢۚ۬ۥۨۘۗۥۥۘۜۨۘۜۘۘۦ۬ۦ۫۬۬";
                    break;
                case -1464128251:
                    i6 = this.f1024c.getHeight();
                    str = "ۖۦۜۛۗۖۘۢۖ۬ۨۙ۫ۗۡۘۚۦۤ";
                    break;
                case -1275182709:
                    str = "۟ۜۤۜۦۗۙۦۤ۠۟ۨۘۚۦۖۘۜ۟ۘۘۧۚ۫۬ۗۦۘۢۦۜ";
                    i5 = i6;
                    break;
                case -969502006:
                    super.onMeasure(i2, i3);
                    str = "۫ۖۘۛ۠ۛۦۧ۠ۥۘۖۘۙۘۘۧ۠ۤۙۙ۟ۗ۬ۘ";
                    break;
                case -945912782:
                    String str2 = "ۦۜ۫۟۫ۦۘ۫ۛۜۘ۠ۧۦۘۖۙۥۡ۫۫";
                    while (true) {
                        switch (str2.hashCode() ^ -1206848673) {
                            case -2114933176:
                                if (i6 <= 0) {
                                    str2 = "ۛۖۨۘۧۛۨۘ۬ۛۜۘۢۙۙۚۨۦ";
                                    break;
                                } else {
                                    str2 = "۠ۛۡۘۡۚۢۡۗۚۦۢۖۘۦۨۡۛۦۘۘ۬ۚۡۘۗۚۖ";
                                    break;
                                }
                            case -1660080580:
                                str = "ۜۜۖۘۦۢۦۥۧۚۦ۠ۖۚۚۛ";
                                continue;
                            case -1534827313:
                                str = "ۙۥۗۗۖۥۘۚۤۡۥۚۜۖۙۡۘ۫ۜۧ۟ۚ۬ۢۚۘ";
                                continue;
                            case -1280776016:
                                str2 = "۫ۙۘۖ۬ۡۢ۬ۥۤۢۚۚۢۖ۬ۘۗۧ۬ۨۘۛ۟ۛ";
                                break;
                        }
                    }
                    break;
                case -775336283:
                    this.f1022a.setMinContentOffset(this.f1024c.getBackgroundOffset());
                    str = "۫ۗۦۘۥۛ۠ۛۦۨۘۚۦۥۦ۫ۛۗۤۜۘۚۙۖۘۛۡۛۘۡۚ";
                    break;
                case -67817015:
                    this.f1023b.setMaxHeight(i5);
                    str = "۟ۜ۫۠ۖۨۘۥ۠ۦۘۦۖۦۚۡ۫ۛۤۥۗۧۜۘۗۤۖۘۦ۟ۨۘ";
                    break;
                case 609651820:
                    str = "ۛۢ۠ۨۜۖۘۚ۟ۚۧۛ۠ۥۨۗ";
                    break;
                case 1233880505:
                    str = "ۥۚۢۖ۠ۜۘۡۤۢۤۧۘۘۨۦۧ۟ۢۥۘ۫ۦۘۛۖۙۚۚۙ";
                    break;
                case 1330583086:
                    return;
                case 1698141172:
                    this.f1022a.setMaxHeight(i5);
                    str = "ۘۙۛۦ۫ۧ۫ۙۘۜۧۖۘۡۧ۬ۧۥۘۚۡۘ۬ۙۗۨۙۚ";
                    break;
                case 1749918960:
                    str = "ۚ۟ۥۧ۟ۚ۟ۜۗ۠ۚۜۙۥۦ";
                    break;
                case 1801619770:
                    i4 = this.f1024c.getMeasuredHeight();
                    str = "ۘۦۥۙ۟ۘۘ۬ۤۖۤۦۦۘۖۗۡۧۡۘۙۢۖۘ";
                    break;
                case 2081645466:
                    str = "ۚ۟ۥۧ۟ۚ۟ۜۗ۠ۚۜۙۥۦ";
                    i5 = i4;
                    break;
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00f6, code lost:
        r0 = "ۡۘۜۛۜۚۜۤۦۘۛۜۘۨ۟ۥۘۘۛۤۛۘ۬ۚ۠ۤۖۥۙ";
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setColor(int r13) {
        /*
            r12 = this;
            r5 = 1
            r2 = 0
            r4 = 0
            java.lang.String r0 = "ۘۜۧۘۨۜۘۡۙ۟ۜۘۨۖۗۡ"
            r1 = r2
            r3 = r4
            r6 = r4
            r7 = r2
            r8 = r2
            r9 = r4
        L_0x000b:
            int r2 = r0.hashCode()
            r10 = 737(0x2e1, float:1.033E-42)
            r11 = 273480210(0x104cfa12, float:4.0424553E-29)
            r2 = r2 ^ r10
            r2 = r2 ^ r11
            switch(r2) {
                case -1716634305: goto L_0x001a;
                case -1665406342: goto L_0x009f;
                case -1573075018: goto L_0x00a4;
                case -1541474643: goto L_0x0070;
                case -1532302788: goto L_0x0046;
                case -1257235243: goto L_0x00ef;
                case -1244165974: goto L_0x005b;
                case -1215055800: goto L_0x0037;
                case -1130999971: goto L_0x0049;
                case -775690293: goto L_0x007c;
                case -518892061: goto L_0x001d;
                case -514398178: goto L_0x0028;
                case -470346545: goto L_0x00d2;
                case -289818826: goto L_0x0020;
                case -213591484: goto L_0x0030;
                case -160010786: goto L_0x00fa;
                case 317852670: goto L_0x0065;
                case 402023013: goto L_0x00a9;
                case 737357511: goto L_0x00cc;
                case 1032726634: goto L_0x0078;
                case 1561464586: goto L_0x00af;
                case 1640668019: goto L_0x0040;
                case 1648475434: goto L_0x0051;
                default: goto L_0x0019;
            }
        L_0x0019:
            goto L_0x000b
        L_0x001a:
            java.lang.String r0 = "ۤۥ۠۫ۖۦۘۛۧۡۘۦۛ۠ۖۖ۟ۙۨ۫ۨۨۘۘۘۡۢ"
            goto L_0x000b
        L_0x001d:
            java.lang.String r0 = "۫ۜۨۧ۠۟ۙ۬۠ۗۡ۫ۤۜۘۡۤ۟ۖۤۡۘۨۜۜۦۤۧ"
            goto L_0x000b
        L_0x0020:
            int r2 = android.graphics.Color.alpha(r13)
            java.lang.String r0 = "ۤۤۥۛۧۨ۫ۙۖۨ۠۬ۥۨۘ۟ۗۗ"
            r9 = r2
            goto L_0x000b
        L_0x0028:
            com.obwhatsapp.youbasha.colorPicker.HsvAlphaSelectorView r0 = r12.f1022a
            r0.setAlpha(r9)
            java.lang.String r0 = "ۚۦۢۧۧۦۘۖۦۡۤۘۗۛ۟ۧۥۜۛۦۡ۟ۤۡۜۧۥ۫"
            goto L_0x000b
        L_0x0030:
            r0 = 3
            float[] r2 = new float[r0]
            java.lang.String r0 = "ۛۡۚۦ۫ۜۨۥۨۘ۫ۦ۫ۦۗۘۘۘۦۚ"
            r8 = r2
            goto L_0x000b
        L_0x0037:
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r0 = r0 | r13
            android.graphics.Color.colorToHSV(r0, r8)
            java.lang.String r0 = "۟ۜ۬ۖۗ۠۬۬ۢۖۛۙۜۖۧۘۧۖۧ۫"
            goto L_0x000b
        L_0x0040:
            com.obwhatsapp.youbasha.colorPicker.HsvHueSelectorView r2 = r12.f1023b
            java.lang.String r0 = "ۥۘ۟۫ۛۛ۠۟ۦۦۚۤۖۗۜۛۤۥۘ"
            r7 = r2
            goto L_0x000b
        L_0x0046:
            java.lang.String r0 = "ۖۧۨۨۨ۫ۥۦۨ۫۟ۜ۫ۖۚۙۛۜۘۢۧۛ۫ۛ"
            goto L_0x000b
        L_0x0049:
            r0 = r8[r4]
            r7.setHue(r0)
            java.lang.String r0 = "ۘ۟ۘۗۖۥ۬۠۫ۨۨۘۘۛۛۖۘۥۖۡۘۖۧۖ"
            goto L_0x000b
        L_0x0051:
            com.obwhatsapp.youbasha.colorPicker.HsvColorValueView r0 = r12.f1024c
            r2 = r8[r4]
            r0.setHue(r2)
            java.lang.String r0 = "ۜۢۘ۠۟ۜۘۦۜۡ۟۠۬۬ۨۨۘ"
            goto L_0x000b
        L_0x005b:
            com.obwhatsapp.youbasha.colorPicker.HsvColorValueView r0 = r12.f1024c
            r2 = r8[r5]
            r0.setSaturation(r2)
            java.lang.String r0 = "۫ۦۙۚۜۦۘۥۡۦۢۖۛۚۘۖۢ۟ۤۡۢۖۘۙ۫۠"
            goto L_0x000b
        L_0x0065:
            com.obwhatsapp.youbasha.colorPicker.HsvColorValueView r0 = r12.f1024c
            r2 = 2
            r2 = r8[r2]
            r0.setValue(r2)
            java.lang.String r0 = "۫ۤۗۘۦۡۦ۬ۖۢۗۨۘۚۨۗۖۦۧۘۖۘۢ۟ۘۙۗۚ۫"
            goto L_0x000b
        L_0x0070:
            com.obwhatsapp.youbasha.colorPicker.HsvAlphaSelectorView r0 = r12.f1022a
            r0.setColor(r13)
            java.lang.String r0 = "ۖۥۥۘ۫ۙۢۦ۫ۜۨ۠ۗۨۨۦۙ۫ۘۘۡۗۦ۠ۗۧۤۧۚ"
            goto L_0x000b
        L_0x0078:
            java.lang.String r0 = "ۧۙۨۚۢ۬ۘۧۗ۬ۜۛۖۡۡۡۡۥۘ"
            r6 = r4
            goto L_0x000b
        L_0x007c:
            r2 = 724464264(0x2b2e7288, float:6.197616E-13)
            java.lang.String r0 = "ۤۤۜۢ۠ۡ۟۟ۥۙۧۛۢ۟ۢ۠ۦۙۡ۠ۥ"
        L_0x0081:
            int r10 = r0.hashCode()
            r10 = r10 ^ r2
            switch(r10) {
                case -702016189: goto L_0x0098;
                case 419441281: goto L_0x0091;
                case 824077197: goto L_0x008a;
                case 1080759760: goto L_0x009b;
                default: goto L_0x0089;
            }
        L_0x0089:
            goto L_0x0081
        L_0x008a:
            java.lang.String r0 = "ۢۨۧۘۖۘۙ۠ۙۨ۫ۜۤۨۧۙ"
            goto L_0x000b
        L_0x008e:
            java.lang.String r0 = "ۛ۟ۥۘۗۚۗۨۦۨۧ۠ۥۘۖ۫۬ۛۦۦۘۥۤ۟"
            goto L_0x0081
        L_0x0091:
            int r0 = r12.f1025d
            if (r0 == r13) goto L_0x008e
            java.lang.String r0 = "ۤۜۘۘۘۡۡۘۗ۠ۤۖ۠ۨۥۖۗ"
            goto L_0x0081
        L_0x0098:
            java.lang.String r0 = "ۤۜ۫۠ۚ۫ۡۧۜۙۙۘۤۜۘۘ"
            goto L_0x0081
        L_0x009b:
            java.lang.String r0 = "ۛۡۧۘ۠ۙۘۨۜۥۘۛ۬ۜۡۡۥ"
            goto L_0x000b
        L_0x009f:
            java.lang.String r0 = "ۘ۠ۚۥۘۛۥ۟ۥۜۨۗۙۚۦۨ۫۠ۚۖ۫۟ۧۜۖ۟ۡ"
            r3 = r5
            goto L_0x000b
        L_0x00a4:
            java.lang.String r0 = "ۢۨۧۘۖۘۙ۠ۙۨ۫ۜۤۨۧۙ"
            r6 = r3
            goto L_0x000b
        L_0x00a9:
            r12.f1025d = r13
            java.lang.String r0 = "ۡۜۦۘۢۧۥۦۚۙ۬ۤۜۨۧ۬ۛۡۡۗ۠ۙۘۗۨ"
            goto L_0x000b
        L_0x00af:
            r2 = -478967978(0xffffffffe3738756, float:-4.4923108E21)
            java.lang.String r0 = "ۨۙۨۚ۬۬ۨۖۘ۠ۘ۠ۜ۠ۖۘ"
        L_0x00b4:
            int r10 = r0.hashCode()
            r10 = r10 ^ r2
            switch(r10) {
                case -2108421566: goto L_0x00c5;
                case -2057758759: goto L_0x00c8;
                case -1898650191: goto L_0x00bd;
                case -131111528: goto L_0x00f6;
                default: goto L_0x00bc;
            }
        L_0x00bc:
            goto L_0x00b4
        L_0x00bd:
            if (r6 == 0) goto L_0x00c2
            java.lang.String r0 = "ۦۘۗ۬ۚۘۡۘ۠ۘۥۨ۠ۛۙۢۗۥۘۚۤۛۛ۟ۚ"
            goto L_0x00b4
        L_0x00c2:
            java.lang.String r0 = "ۥۛ۫۠۟ۤۤ۫ۥۘ۠۠ۜۘۙۨۘ۟ۦ۬ۛۤۡۘۛۖ۫"
            goto L_0x00b4
        L_0x00c5:
            java.lang.String r0 = "ۥۦ۫ۙۘ۟۫ۜۘۖۖۧ۟ۘ۫۬ۨۧ"
            goto L_0x00b4
        L_0x00c8:
            java.lang.String r0 = "ۚۚ۬ۛۘۚ۠ۗۚۛۨۡۖۘۤۛۘۘۦ۟ۦۨۥۧۘۢۙ۫"
            goto L_0x000b
        L_0x00cc:
            com.obwhatsapp.youbasha.colorPicker.HsvSelectorView$OnColorChangedListener r1 = r12.f1026e
            java.lang.String r0 = "ۢۜۛۧۥ۟۠ۢۥۘ۬۬ۖۘۡۧۘۛۙۥۙۛ۬ۜ۬ۤۡۧۘ"
            goto L_0x000b
        L_0x00d2:
            r2 = 1552116387(0x5c836aa3, float:2.95923762E17)
            java.lang.String r0 = "ۘۨ۟۟ۢۗ۟ۦۦۨ۬ۘۘ۬ۨۖ"
        L_0x00d7:
            int r10 = r0.hashCode()
            r10 = r10 ^ r2
            switch(r10) {
                case -1378610721: goto L_0x00e6;
                case -357052818: goto L_0x00e0;
                case -259207668: goto L_0x00f6;
                case 1781466709: goto L_0x00eb;
                default: goto L_0x00df;
            }
        L_0x00df:
            goto L_0x00d7
        L_0x00e0:
            java.lang.String r0 = "ۡۡۧۘ۫ۧۥۘۤۢۧ۟ۜۛۙۧۥۘ"
            goto L_0x00d7
        L_0x00e3:
            java.lang.String r0 = "ۧۦۜۘۥۜۥۚۤۡۙۘۚۜۧۥۙۗۡۡۘۧۘۗۗۗ"
            goto L_0x00d7
        L_0x00e6:
            if (r1 == 0) goto L_0x00e3
            java.lang.String r0 = "ۡۨۧۘۥۡۨۘۘۦۧۘ۟ۗۡۚۡ"
            goto L_0x00d7
        L_0x00eb:
            java.lang.String r0 = "۟ۜۘۘۜۢۖۘۥ۫ۡۘ۬ۗۚ۬ۦۗۜ۠ۥۘۗۡۗ"
            goto L_0x000b
        L_0x00ef:
            r1.colorChanged(r13)
            java.lang.String r0 = "ۡۘۜۛۜۚۜۤۦۘۛۜۘۨ۟ۥۘۘۛۤۛۘ۬ۚ۠ۤۖۥۙ"
            goto L_0x000b
        L_0x00f6:
            java.lang.String r0 = "ۡۘۜۛۜۚۜۤۦۘۛۜۘۨ۟ۥۘۘۛۤۛۘ۬ۚ۠ۤۖۥۙ"
            goto L_0x000b
        L_0x00fa:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.youbasha.colorPicker.HsvSelectorView.setColor(int):void");
    }

    public void setOnColorChangedListener(OnColorChangedListener onColorChangedListener) {
        String str = "۟۫ۢ۫۟ۘ۬ۚۜ۟ۘۥۥۚۨۜۚۤۙۗۜۘۙ۠۫۠ۦۦ";
        while (true) {
            switch ((str.hashCode() ^ 918) ^ -1761951962) {
                case -420225832:
                    this.f1026e = onColorChangedListener;
                    str = "ۡۦ۠ۙۥۚ۟ۘۘۢۗۖۧۜۦۘۨۘ";
                    break;
                case 932833157:
                    str = "ۦۨۘۘۥۡۙ۠ۦۢۚۘۨ۟ۛۘۘ۫ۦۦۘۜۢۨۘۘۨۘۚۤۖ";
                    break;
                case 1055893660:
                    return;
                case 1724495836:
                    str = "ۜۘۧۘۘ۟ۤۨۢۗۨۧۘۖۚۜۘ۫ۖ۟";
                    break;
            }
        }
    }
}
