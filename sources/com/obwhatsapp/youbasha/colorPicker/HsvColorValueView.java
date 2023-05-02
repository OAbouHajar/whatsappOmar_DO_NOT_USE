package com.obwhatsapp.youbasha.colorPicker;

import X.AnonymousClass00T;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.obwhatsapp.yo.yo;
import com.obwhatsapp.youbasha.others;

public class HsvColorValueView extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public Paint f1002a;

    /* renamed from: b  reason: collision with root package name */
    public LinearGradient f1003b;

    /* renamed from: c  reason: collision with root package name */
    public LinearGradient f1004c;

    /* renamed from: d  reason: collision with root package name */
    public float f1005d = 0.0f;

    /* renamed from: e  reason: collision with root package name */
    public Bitmap f1006e = null;

    /* renamed from: f  reason: collision with root package name */
    public Drawable f1007f;

    /* renamed from: g  reason: collision with root package name */
    public ImageView f1008g;

    /* renamed from: h  reason: collision with root package name */
    public int f1009h = -1;

    /* renamed from: i  reason: collision with root package name */
    public float f1010i = 0.0f;

    /* renamed from: j  reason: collision with root package name */
    public float f1011j = 1.0f;

    /* renamed from: k  reason: collision with root package name */
    public OnSaturationOrValueChanged f1012k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f1013l = false;

    public interface OnSaturationOrValueChanged {
        void saturationOrValueChanged(HsvColorValueView hsvColorValueView, float f2, float f3, boolean z2);
    }

    public HsvColorValueView(Context context) {
        super(context);
        b();
    }

    public HsvColorValueView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        b();
    }

    public HsvColorValueView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        b();
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0191, code lost:
        r1 = "ۥ۟ۨۘ۟ۖۨۛۜۖۜۡۘۢۛۦۘ۬ۥۚۡۨۦۘ۠ۤۤۨۖ";
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a() {
        /*
            r17 = this;
            r16 = 0
            r7 = 0
            r14 = 0
            r4 = 0
            r6 = 0
            r3 = 0
            r5 = 0
            r2 = 0
            java.lang.String r1 = "ۙۛۤۡ۟ۘۦۘۜۨۨۘۛۥۧ"
            r10 = r2
            r11 = r3
            r12 = r4
            r13 = r6
            r15 = r7
        L_0x0010:
            int r2 = r1.hashCode()
            r3 = 554(0x22a, float:7.76E-43)
            r4 = -525602608(0xffffffffe0abf0d0, float:-9.911705E19)
            r2 = r2 ^ r3
            r2 = r2 ^ r4
            switch(r2) {
                case -1508106818: goto L_0x0195;
                case -1414054820: goto L_0x011a;
                case -1238591152: goto L_0x0086;
                case -1011910210: goto L_0x007e;
                case -554286312: goto L_0x0076;
                case -496540794: goto L_0x0042;
                case -483024441: goto L_0x00b0;
                case -422020445: goto L_0x0022;
                case -199482101: goto L_0x0082;
                case -41718587: goto L_0x0159;
                case 42017980: goto L_0x0055;
                case 223070677: goto L_0x00a7;
                case 296956776: goto L_0x0105;
                case 478757130: goto L_0x0172;
                case 840544877: goto L_0x001f;
                case 1090026010: goto L_0x005a;
                case 1524083650: goto L_0x00c2;
                case 1528755389: goto L_0x00e3;
                case 1792295743: goto L_0x0145;
                case 1805780132: goto L_0x0164;
                case 1835724575: goto L_0x004e;
                case 1897999544: goto L_0x0100;
                case 1998739092: goto L_0x00b5;
                default: goto L_0x001e;
            }
        L_0x001e:
            goto L_0x0010
        L_0x001f:
            java.lang.String r1 = "ۧ۟۠ۗۖۛۦ۟ۨۘ۬۠ۘۘۙۚۖۥۚ۠ۡ۠۫ۘۥۦۜۛ۬"
            goto L_0x0010
        L_0x0022:
            r2 = -1066658191(0xffffffffc06c1671, float:-3.6888697)
            java.lang.String r1 = "ۤۦۗۚۗۥۘ۠ۙۗۚۡۘۖۦ۟ۜۚ۟"
        L_0x0027:
            int r3 = r1.hashCode()
            r3 = r3 ^ r2
            switch(r3) {
                case -1219945157: goto L_0x0036;
                case -1089541152: goto L_0x003f;
                case -549660738: goto L_0x0189;
                case 1228094520: goto L_0x0030;
                default: goto L_0x002f;
            }
        L_0x002f:
            goto L_0x0027
        L_0x0030:
            java.lang.String r1 = "ۤ۠ۚۖ۟ۥۜۦۧ۟ۧۦۘۘۗۢۙ۫"
            goto L_0x0010
        L_0x0033:
            java.lang.String r1 = "ۦۨۦ۫۫ۦۖۥۧۢ۬ۗۤۥۥ۟۟ۜۘۜۥۡ"
            goto L_0x0027
        L_0x0036:
            r0 = r17
            android.graphics.Paint r1 = r0.f1002a
            if (r1 != 0) goto L_0x0033
            java.lang.String r1 = "ۥ۠ۜۤۜۗۤ۟ۥۘ۬ۨۥۘۙۥ۠ۨ۠"
            goto L_0x0027
        L_0x003f:
            java.lang.String r1 = "ۨ۫۟۟ۜۘۘۙۘۛ۫ۥۙۦۤۖۙۖۢ"
            goto L_0x0027
        L_0x0042:
            android.graphics.Paint r1 = new android.graphics.Paint
            r1.<init>()
            r0 = r17
            r0.f1002a = r1
            java.lang.String r1 = "ۥۙۥۗۙۖۘۗۗۖۜۢ۬ۛ۬ۜۘۨۡۙۙۘۤ۬ۧۗ"
            goto L_0x0010
        L_0x004e:
            int r16 = r17.getHeight()
            java.lang.String r1 = "ۦۘ۠ۚ۠ۥۘۤۚۜۘۡۤۧۙۢۦۤۧۛ"
            goto L_0x0010
        L_0x0055:
            java.lang.String r1 = "۫ۥۢ۠ۙۙ۠ۥۥۘۗۛۗۖ۫ۘ"
            r14 = r16
            goto L_0x0010
        L_0x005a:
            r2 = 1620773204(0x609b0954, float:8.937242E19)
            java.lang.String r1 = "ۨۚۦۘۘۛۨۡۧۘۚۡۡ۫۠ۖۘ۬ۙۖۙۚۙ"
        L_0x005f:
            int r3 = r1.hashCode()
            r3 = r3 ^ r2
            switch(r3) {
                case -1393806947: goto L_0x0073;
                case -496078284: goto L_0x018d;
                case 1797402664: goto L_0x0068;
                case 1877328763: goto L_0x006e;
                default: goto L_0x0067;
            }
        L_0x0067:
            goto L_0x005f
        L_0x0068:
            java.lang.String r1 = "۫۫ۖۘۦۗۨۘۘۛ۫ۛۥۜۖۡۦۦۖۧ"
            goto L_0x005f
        L_0x006b:
            java.lang.String r1 = "ۥۨۘۤ۬ۛۦۨ۟ۚ۫ۤ۠۬"
            goto L_0x005f
        L_0x006e:
            if (r16 > 0) goto L_0x006b
            java.lang.String r1 = "ۦۛ۟ۗۙۚۘۚۢۡۨۘۚ۠ۢۖۧۡ۬۬ۨۥۚۦ"
            goto L_0x005f
        L_0x0073:
            java.lang.String r1 = "ۗۥۘۘۙۗۛۚ۫۫ۡۤۖۘ۠ۥۜۘۢۤۢۤۨۚۖۢۖۘۡۛۥۘ"
            goto L_0x0010
        L_0x0076:
            int r2 = r17.getMeasuredHeight()
            java.lang.String r1 = "ۤۙۡ۫ۙۘ۫ۦ۟ۦۦۥ۫ۗۘۨۢۧۢۚۜ"
            r15 = r2
            goto L_0x0010
        L_0x007e:
            java.lang.String r1 = "ۨۜۛۨۛ۫ۚۤۛۛۥۖۥۧۘۧۛۜۙۛۖۦۡۢ"
            r14 = r15
            goto L_0x0010
        L_0x0082:
            java.lang.String r1 = "۫ۥۨۘ۠ۚۜۘۧ۠ۦ۠۟ۤۢ"
            r13 = r14
            goto L_0x0010
        L_0x0086:
            r2 = -737824355(0xffffffffd405b19d, float:-2.29684203E12)
            java.lang.String r1 = "ۢۧۨۖۦ۫ۜۦ۫ۛ۟ۤ۫۫ۙ"
        L_0x008b:
            int r3 = r1.hashCode()
            r3 = r3 ^ r2
            switch(r3) {
                case -1012038866: goto L_0x00a3;
                case -983327233: goto L_0x009b;
                case 1673942776: goto L_0x00a0;
                case 1982416553: goto L_0x0094;
                default: goto L_0x0093;
            }
        L_0x0093:
            goto L_0x008b
        L_0x0094:
            java.lang.String r1 = "ۛ۬ۖۘۧۤۤۘۤ۬ۖۥۚۖۘ۟۬ۧۧ"
            goto L_0x0010
        L_0x0098:
            java.lang.String r1 = "۠ۦۜۧۙۥۙ۫ۘۘۛۖۦۘۛۜۡۘ"
            goto L_0x008b
        L_0x009b:
            if (r14 > 0) goto L_0x0098
            java.lang.String r1 = "ۡۧۦۘۗۨۖۗۖۨۢۧۗۢۡۘۥۖۙ"
            goto L_0x008b
        L_0x00a0:
            java.lang.String r1 = "ۢۘۘۘۧۧۦۘۗۖ۫ۙۙۘۤۗۦۚۡۘۥۗۛۜ۠۫ۙۜ"
            goto L_0x008b
        L_0x00a3:
            java.lang.String r1 = "ۜۗ۬۬ۙۜۘۨۜۘۙۛۦۢۚۖۘۦۢۗۧۗۦ"
            goto L_0x0010
        L_0x00a7:
            r0 = r17
            int r2 = r0.f1009h
            java.lang.String r1 = "ۦۛۥۘۦۜۖۘ۫ۚۧۥۗ۠ۤۜ۫ۤۡۗ"
            r12 = r2
            goto L_0x0010
        L_0x00b0:
            java.lang.String r1 = "ۛ۬ۖۘۧۤۤۘۤ۬ۖۥۚۖۘ۟۬ۧۧ"
            r13 = r12
            goto L_0x0010
        L_0x00b5:
            int r1 = r17.getBackgroundOffset()
            int r1 = r1 * 2
            int r2 = r13 - r1
            java.lang.String r1 = "ۛۤۚۖۥ۠ۘۢۨۘۙۦۛۚ۠ۘۥۗۗۥۧۦۘۧۤ"
            r11 = r2
            goto L_0x0010
        L_0x00c2:
            r2 = -1166796609(0xffffffffba7418bf, float:-9.311549E-4)
            java.lang.String r1 = "ۘۥۜۡ۫ۖۘ۫ۧۘۘۗۧۨۘۦۦۡۘۧۗۛۗۧ"
        L_0x00c7:
            int r3 = r1.hashCode()
            r3 = r3 ^ r2
            switch(r3) {
                case -1738833550: goto L_0x00d0;
                case -3921344: goto L_0x0191;
                case 109186731: goto L_0x00df;
                case 1433745842: goto L_0x00d6;
                default: goto L_0x00cf;
            }
        L_0x00cf:
            goto L_0x00c7
        L_0x00d0:
            java.lang.String r1 = "ۘۨۥۥۢۡۖۙۧۛۦۜۘ۟ۙۖۚۨۜۘ۟ۛۚ"
            goto L_0x00c7
        L_0x00d3:
            java.lang.String r1 = "ۧۛۨۧۦ۠ۛۥۙۤۖۚۥ"
            goto L_0x00c7
        L_0x00d6:
            r0 = r17
            android.graphics.Bitmap r1 = r0.f1006e
            if (r1 != 0) goto L_0x00d3
            java.lang.String r1 = "۫ۖۡۦۧۨۨ۫ۡ۫ۢۤۨ۫ۥۘ۬ۢۚۘۘۛ"
            goto L_0x00c7
        L_0x00df:
            java.lang.String r1 = "ۡۨۖۨۘۧۘۡۗۥۤۚۥۛۧۤۜۙۡۥۡۛ۫ۜۥۘ"
            goto L_0x0010
        L_0x00e3:
            r2 = 62486466(0x3b977c2, float:1.0900818E-36)
            java.lang.String r1 = "ۥ۫ۙ۟ۤ۬ۤ۟ۤۜۗۥۜۨ۫"
        L_0x00e8:
            int r3 = r1.hashCode()
            r3 = r3 ^ r2
            switch(r3) {
                case -1044660041: goto L_0x00f9;
                case -288827528: goto L_0x00fc;
                case 365720648: goto L_0x00f1;
                case 876691875: goto L_0x0191;
                default: goto L_0x00f0;
            }
        L_0x00f0:
            goto L_0x00e8
        L_0x00f1:
            if (r11 <= 0) goto L_0x00f6
            java.lang.String r1 = "ۢ۫ۦ۠ۚۡۘۢۙۨۘۧۤۚۜۗۘ"
            goto L_0x00e8
        L_0x00f6:
            java.lang.String r1 = "ۜۗۡۥۘۙۦۙۦۤۘۦ۬ۤۥۘۙۖۡۘ۬ۢۘۘۤ۟ۢۛ۫ۤ"
            goto L_0x00e8
        L_0x00f9:
            java.lang.String r1 = "ۙۖۡ۬ۜۥۘۦۛۙ۬ۜۥۗۢۨۘۛۨۚ"
            goto L_0x00e8
        L_0x00fc:
            java.lang.String r1 = "ۚ۬۫ۦۚۤۡ۬ۘۡۦۥۘۛۨۧۘۜۖۛۜۛۥۘۖۜ۫۬ۥۙ"
            goto L_0x0010
        L_0x0100:
            float r5 = (float) r11
            java.lang.String r1 = "ۨ۠ۖۘۢۖۘۨ۬ۡۛ۫۫ۜۖۨۘ"
            goto L_0x0010
        L_0x0105:
            android.graphics.LinearGradient r1 = new android.graphics.LinearGradient
            r2 = 0
            r3 = 0
            r4 = 0
            r6 = -1
            r7 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            android.graphics.Shader$TileMode r8 = android.graphics.Shader.TileMode.CLAMP
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            r0 = r17
            r0.f1003b = r1
            java.lang.String r1 = "ۧۡۙ۫ۜۧۘۙۘۨۘۗۢۖۘۨۤۢۦۚۨۛۥۛ"
            goto L_0x0010
        L_0x011a:
            android.graphics.LinearGradient r2 = new android.graphics.LinearGradient
            r3 = 0
            r4 = 0
            r6 = 0
            r7 = -1
            r1 = 3
            float[] r1 = new float[r1]
            r8 = 0
            r0 = r17
            float r9 = r0.f1005d
            r1[r8] = r9
            r8 = 1
            r9 = 1065353216(0x3f800000, float:1.0)
            r1[r8] = r9
            r8 = 2
            r9 = 1065353216(0x3f800000, float:1.0)
            r1[r8] = r9
            int r8 = android.graphics.Color.HSVToColor(r1)
            android.graphics.Shader$TileMode r9 = android.graphics.Shader.TileMode.CLAMP
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            r0 = r17
            r0.f1004c = r2
            java.lang.String r1 = "۬۬۫ۜ۠۬ۗۜۨۧۡۜۗۧۨۙۤ۬"
            goto L_0x0010
        L_0x0145:
            android.graphics.ComposeShader r2 = new android.graphics.ComposeShader
            r0 = r17
            android.graphics.LinearGradient r1 = r0.f1003b
            r0 = r17
            android.graphics.LinearGradient r3 = r0.f1004c
            android.graphics.PorterDuff$Mode r4 = android.graphics.PorterDuff.Mode.MULTIPLY
            r2.<init>(r1, r3, r4)
            java.lang.String r1 = "ۚۤۤۖۢ۬ۛ۫ۛۗۛۗ۠ۗۛ۬ۢ۟ۤ۟ۤۖۘۗ"
            r10 = r2
            goto L_0x0010
        L_0x0159:
            r0 = r17
            android.graphics.Paint r1 = r0.f1002a
            r1.setShader(r10)
            java.lang.String r1 = "ۧۡۡۘ۟۠ۨۡ۫ۨۘۘۜۙۛۘ۠۟ۛۘ۬ۙۡۡۜۛۨۜۘۘ"
            goto L_0x0010
        L_0x0164:
            android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r1 = android.graphics.Bitmap.createBitmap(r11, r11, r1)
            r0 = r17
            r0.f1006e = r1
            java.lang.String r1 = "ۧۙۥۗ۟۟ۖۖۙۗ۬ۖۘۡۡۨۙۖ۟ۥ۟ۦۘ۫ۖۚۜۦۗ"
            goto L_0x0010
        L_0x0172:
            android.graphics.Canvas r2 = new android.graphics.Canvas
            r0 = r17
            android.graphics.Bitmap r1 = r0.f1006e
            r2.<init>(r1)
            r3 = 0
            r4 = 0
            r0 = r17
            android.graphics.Paint r7 = r0.f1002a
            r6 = r5
            r2.drawRect(r3, r4, r5, r6, r7)
            java.lang.String r1 = "ۥ۟ۨۘ۟ۖۨۛۜۖۜۡۘۢۛۦۘ۬ۥۚۡۨۦۘ۠ۤۤۨۖ"
            goto L_0x0010
        L_0x0189:
            java.lang.String r1 = "ۥۙۥۗۙۖۘۗۗۖۜۢ۬ۛ۬ۜۘۨۡۙۙۘۤ۬ۧۗ"
            goto L_0x0010
        L_0x018d:
            java.lang.String r1 = "ۨۜۛۨۛ۫ۚۤۛۛۥۖۥۧۘۧۛۜۙۛۖۦۡۢ"
            goto L_0x0010
        L_0x0191:
            java.lang.String r1 = "ۥ۟ۨۘ۟ۖۨۛۜۖۜۡۘۢۛۦۘ۬ۥۚۡۨۦۘ۠ۤۤۨۖ"
            goto L_0x0010
        L_0x0195:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.youbasha.colorPicker.HsvColorValueView.a():void");
    }

    public final void b() {
        ImageView imageView = null;
        String str = "ۧۚ۟۬ۛۗۚۦۙۙ۠ۡۘ۬۠۬ۢۗۙ۬۟۫ۜۨ۫ۘۚۨ";
        while (true) {
            switch ((str.hashCode() ^ 860) ^ -314821828) {
                case -1708864567:
                    addView(this.f1008g, new FrameLayout.LayoutParams(this.f1007f.getIntrinsicWidth(), this.f1007f.getIntrinsicHeight()));
                    str = "۟ۥۙۡۜۨ۬ۚۡۧۚۛۙۚۗۖۤۡۘۚۚ۟۟ۖۧۢۤۧ";
                    break;
                case -947081754:
                    imageView.setImageDrawable(this.f1007f);
                    str = "۠ۨ۬ۧۨۡۘۙ۬ۦۘۤۘۥۘۥۘ۬ۡۙۘۘ۟ۨۦۘۗ۠ۖ";
                    break;
                case -737214260:
                    this.f1007f = AnonymousClass00T.A04(yo.getCtx(), others.getID("color_selector", "drawable"));
                    str = "ۛۧۢ۬ۚۜۥۡۧۖۤۗۘۧ۫ۙۨۗۖۛۧۧ۠ۘ";
                    break;
                case 6226312:
                    setWillNotDraw(false);
                    str = "ۦۖۛۧۘۨۚۢ۫ۧۤ۬ۚ۟ۧۜۖۨۘ";
                    break;
                case 247404724:
                    return;
                case 1038584452:
                    str = "ۜۜۜۘۛ۠ۧۖ۟ۜۛۖۘۛۢ۬ۘۙۜۖۨۥۙۨ۬۫ۧ";
                    break;
                case 1879722399:
                    imageView = new ImageView(getContext());
                    str = "ۙۜ۟ۙۗ۬ۘۡۛۤۢۗۧۜۘ۠ۘۧ";
                    break;
                case 1891365989:
                    this.f1008g = imageView;
                    str = "ۤۤۦۖۜۜۘۧۘۦۘۤۖۢ۬ۘۡۙۙ۫ۗۚۜۘۛۡۦ";
                    break;
            }
        }
    }

    public final void c() {
        float f2 = 0.0f;
        ImageView imageView = null;
        String str = "ۡۙۗۘ۬ۖۗۡۥۧۥۜۖۢ۫ۙۢۦۢۦۚۖۘۨۘۡۛۘ";
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (true) {
            switch ((str.hashCode() ^ 114) ^ -1189714001) {
                case -1915360715:
                    f2 = (float) getBackgroundSize();
                    str = "ۚۨ۫۫ۡۜۢۧۢۚۚۡۤۜۜۢ۬ۛۙ۠ۨۘ";
                    break;
                case -1507121482:
                    i6 = (int) Math.ceil((double) (((float) this.f1008g.getHeight()) / 2.0f));
                    str = "ۡۡۡۘۥۤۚۗۗ۠ۖ۟ۦۡۥۢۡۨۨ";
                    break;
                case -1327193588:
                    i4 = (int) ((1.0f - this.f1011j) * f2);
                    str = "ۢۤۡۘۖ۠۬ۢ۟ۢۧۘۘ۬ۗۖۜۘۜۘۖۜ۫ۚۖۨ";
                    break;
                case -991267719:
                    i5 = (int) (((float) getBackgroundSize()) * this.f1010i);
                    str = "۬ۨۚۤۛۗۛۨۗۨۗۖۘ۠۟۫۠ۜۦۙۡۧ";
                    break;
                case 52731975:
                    str = "۠ۙۗۙۥۙۖۧۙۨۚۛۛ۠۟ۗۥۚۗ۠ۜ";
                    break;
                case 942923868:
                    imageView = this.f1008g;
                    str = "ۡۤۡ۬ۙۘۗۨۘۤۨۚۥۗۥۙ۬ۨۘ";
                    break;
                case 1059493038:
                    return;
                case 1442751884:
                    i7 = getBackgroundOffset();
                    str = "ۙۧۡۘۦۛ۟ۧۤۘۡۛۥۤۙۛۨۖۛ۬ۨۖۘۡ۬ۙۥ۠ۚ";
                    break;
                case 1513950914:
                    i3 = (Math.max(0, Math.min(getBackgroundSize(), i5)) + i7) - i6;
                    str = "ۢۘۦۘۘۨۖ۠۬ۗۜ۠ۘ۫۬ۜۘۘۚ۟ۥۧۛۖۖۖۘ";
                    break;
                case 1647520199:
                    imageView.layout(i3, i2, imageView.getWidth() + i3, this.f1008g.getHeight() + i2);
                    str = "ۘۦۗۤۙۤۡۥۨۥۨ۫ۤۙۨۡ۫";
                    break;
                case 1683065023:
                    i2 = (Math.max(0, Math.min(getBackgroundSize(), i4)) + i7) - i6;
                    str = "۟ۗۙۙۨ۫۟۬ۤۧۜۖۘۥۜۧۙۦۖۖۥۜ";
                    break;
            }
        }
    }

    public final void d(int i2, int i3, boolean z2) {
        int i4 = 0;
        float f2 = 0.0f;
        OnSaturationOrValueChanged onSaturationOrValueChanged = null;
        String str = "ۤۨۘ۬۟۟۠ۛۘۘۖ۠ۘ۠ۤۤ";
        while (true) {
            switch ((str.hashCode() ^ 832) ^ 242628131) {
                case -1870752474:
                    f2 = 1.0f - (((float) (i3 - i4)) / ((float) getBackgroundSize()));
                    str = "ۖۤۖۤۦۙۜ۠ۦ۟ۘۘۢ۟ۚ۠ۧۜۧۗۨۘۙۥۦۤ۠ۢ";
                    break;
                case -1275636975:
                    this.f1010i = ((float) (i2 - i4)) / ((float) getBackgroundSize());
                    str = "ۘۚۦۘ۠ۜۥۡۤۧۢ۬ۡ۫ۡۡۘۚۘ۬ۧۙۜۘۢ۟۫۫ۧۨ";
                    break;
                case -1236481170:
                    str = "ۖۢۨۢ۬۫ۨۘۡۘۛۦۜۘۛۨۛۛۛۙۦ۠ۢ";
                    break;
                case -1162300295:
                    String str2 = "ۦۧ۟۟ۖۧۤ۟۠ۧ۬ۡۦ";
                    while (true) {
                        switch (str2.hashCode() ^ -1891307357) {
                            case -1418559785:
                                str = "ۖۗۡۖۙ۠ۧۦۘۘۧۧۢ۟ۖۗ";
                                continue;
                            case -1257288834:
                                if (onSaturationOrValueChanged == null) {
                                    str2 = "ۡۗۙۚۘ۬ۤۡۘۜۦۧۢۦۛۚ۠ۜۘۡۚ۟۟۫ۜۘ";
                                    break;
                                } else {
                                    str2 = "ۗ۬ۚۘ۠ۥۧۨۜۘۘۤۤ۬ۚۢ";
                                    break;
                                }
                            case 637322625:
                                str = "ۗۡۘۘ۬ۜۘۛۘۜۘۤۙ۠۬ۛۥۘ۠ۖۜ";
                                continue;
                            case 1725876178:
                                str2 = "ۢ۬ۜ۫۠ۨۥۖۧۘ۟ۦۖۘۗۜۥۘۨۥۨۨ۠۬ۥ۟ۙۡۜۡ";
                                break;
                        }
                    }
                    break;
                case -1055951792:
                    return;
                case -990618877:
                    onSaturationOrValueChanged = this.f1012k;
                    str = "ۤۘۜۘۤۦۘ۫ۧۗۨۛۛۚۨۥۤۛۜۘ۠ۡۖۘ";
                    break;
                case -516908225:
                    str = "ۛ۟۬ۙۥۤۙۘۘۘۜ۠ۨۖۦۛۤ۬ۘۥۨ۠۠۟ۛۤۘۘۘ";
                    break;
                case 396495463:
                    i4 = getBackgroundOffset();
                    str = "ۨۤۚۡۧ۠ۘۙۦۜۥۡۘۗ۠ۤ";
                    break;
                case 570577945:
                    onSaturationOrValueChanged.saturationOrValueChanged(this, this.f1010i, f2, z2);
                    str = "ۗۡۘۘ۬ۜۘۛۘۜۘۤۙ۠۬ۛۥۘ۠ۖۜ";
                    break;
                case 1356337011:
                    this.f1011j = f2;
                    str = "ۦۦۢۧۢۗۡۖۨۘۧۙۥۙۜۗ";
                    break;
                case 1715263795:
                    c();
                    str = "ۖۜۖۘۛۥۨۘۘۢۥۡۖ۟ۜ۫ۜۘ۟۫ۨۥۨۖ";
                    break;
                case 1984704681:
                    str = "ۙۚۢۡۜۜۢۖ۫ۥۨ۟ۤ۟ۤ";
                    break;
                case 2032793766:
                    str = "ۖۨ۬ۢۡۢۥۜۧۙۚۢۛۙۡۢۡۘۛۨۙ";
                    break;
            }
        }
    }

    public int getBackgroundOffset() {
        String str = "ۜۤۙۖۦۨۥۢۥۘ۟ۛۙۢۡۤ۟ۦۗۦۨۦ";
        while (true) {
            switch ((str.hashCode() ^ 10) ^ -1587933298) {
                case -1486796265:
                    str = "۠۫ۨۘۘ۬ۧۡ۠ۢ۬ۘۖۘۙۗ";
                    break;
                case -778866061:
                    return (int) Math.ceil((double) (((float) this.f1007f.getIntrinsicHeight()) / 2.0f));
            }
        }
    }

    public int getBackgroundSize() {
        String str = "۬۠ۘۤ۫ۧۜۤۦۘۡۤۧ۠۬ۜۘۤۨۡۘۛۧ۫ۚۧ۠";
        while (true) {
            switch ((str.hashCode() ^ 706) ^ -381502247) {
                case -1072129131:
                    return this.f1006e.getHeight();
                case -370936961:
                    a();
                    str = "ۖۘۧۘۦۦۤۨۘۡۨۙۘۚۖۖۚ۟ۦ";
                    break;
                case 866654622:
                    str = "ۗۘۡۖۡۥۨۦۨۦ۟۠ۘۨۤۖۜۜۜۗۗۦۤۥ";
                    break;
            }
        }
    }

    public float getSaturation() {
        String str = "۬ۢۢۥ۠۠ۥۥ۟ۜۢۥۘۘۘۢ۫ۚۥۘ۬ۗۨۘۡۢۘۘۥۧۨ";
        while (true) {
            switch ((str.hashCode() ^ 775) ^ -1518003901) {
                case -108463098:
                    return this.f1010i;
                case 1423956545:
                    str = "ۗۥۨ۠ۘ۬ۙ۠۫ۘۖ۬ۨۥۖۘۧۨ۫ۧۢۤ";
                    break;
            }
        }
    }

    public float getValue() {
        String str = "ۙ۫ۨۤۡۦۘۢۤۦۛۨۨۧۜۤ";
        while (true) {
            switch ((str.hashCode() ^ 321) ^ -467947262) {
                case -2051763970:
                    return this.f1011j;
                case 852817424:
                    str = "ۙۢۗۦ۬۠ۗۙۜۘۧۥۨۘۛۢۦۖۤۦ۟ۖۥ";
                    break;
            }
        }
    }

    public void onDraw(Canvas canvas) {
        String str = "ۨ۫ۥ۬ۨۨۘ۬ۛۘۘۗۗۖۘۗۙۥۘ۠ۢۥۘۗۥۧۘۥۗۗۖۘۦ";
        while (true) {
            switch ((str.hashCode() ^ 133) ^ -363611489) {
                case -1605560163:
                    str = "ۗۧۖۥۘۥۘۤۥ۫ۚۢۢۛۙۨۚ۠ۘۗۦۖۘۘۛۗۧۦۤ";
                    break;
                case -1547183193:
                    return;
                case -1398257828:
                    str = "ۧۡۖۡۢۡۜۦۘۡۥ۠ۛ۟ۢۤۥ۫ۦۤۥۡۦۘۤۚ۫";
                    break;
                case -446241775:
                    super.onDraw(canvas);
                    str = "ۘۗۙۚ۬ۨ۬۫ۘۛۖۛۦۗۡۥۛۜۘۡۦ۟ۜۢۦۘۡۦۜۘ";
                    break;
                case 181457518:
                    canvas.drawBitmap(this.f1006e, (float) getBackgroundOffset(), (float) getBackgroundOffset(), this.f1002a);
                    str = "ۧ۟ۡۘۤ۟۠۫ۖۢۦۧۨۨ۠ۦۨۥۥ۬۟ۢۙۧۘۘ";
                    break;
                case 1206773614:
                    a();
                    str = "ۖۤۘ۫۠ۦۘ۠ۛۘ۬ۡۘۘ۬ۘۘۛ۟۫ۢۡ۫ۦۥۙ۫ۥۘ";
                    break;
            }
        }
    }

    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        String str = "ۜ۠ۖۖۥۗ۠ۜۛۥۘۢۨۙۧ۬ۙۥۘ";
        while (true) {
            switch ((str.hashCode() ^ 316) ^ -1657705372) {
                case -1799120796:
                    return;
                case -1525946220:
                    str = "ۧۧۘ۟ۦۛۢۡۜۢۥۙۘۤۥۘۤ۠ۘۛ۟ۨۘ";
                    break;
                case -1425548117:
                    str = "ۜۖۡ۬ۨۘۘۗۥۖۘۜۧۜۡۥۖۧۘۖۘۗۖۛۡۤۤ";
                    break;
                case 122444989:
                    str = "ۗ۠ۢۥ۠ۨۘ۬ۚۛ۟ۦۛۧۚۜۛۛۥۖۚۥۘۡۦۙ";
                    break;
                case 139507592:
                    str = "ۨۘۡۜۥۥۦۤۥۛۚ۫ۦۛۚ۬ۧ۠ۛۘۧۘ۠ۦۨۘۙ۟۟";
                    break;
                case 432408270:
                    str = "ۜۡۦۘۡۗ۟ۚۤۥۘ۟ۤۡۘۗۖۢۜۜ۟";
                    break;
                case 1496307716:
                    super.onLayout(z2, i2, i3, i4, i5);
                    str = "۠ۨۨۗۧۘۘۚۛۗ۬۟ۦۧ";
                    break;
                case 1976385282:
                    c();
                    str = "۟ۧۖۘۙۗۘۘ۫ۚۥۘ۬۟ۧۗۘۡۤۡۘۚۗۛۗۚ۠ۧۦ۟";
                    break;
                case 2022518399:
                    str = "ۥ۬ۦۛ۬۫۟ۜۥۧۘ۟۫ۚۤۢۥۦۢۘۘ";
                    break;
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0050, code lost:
        r0 = "ۢۚۢۛۤۙۗۙۡۙۙۧۤۜ۟۟";
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r8, int r9) {
        /*
            r7 = this;
            r2 = 0
            r3 = 0
            java.lang.String r0 = "ۚۦ۟ۢۡ۫ۥ۠ۥۘۢۡۗۜ۟۫ۗۖۤۨۤۜ"
            r1 = r2
        L_0x0005:
            int r4 = r0.hashCode()
            r5 = 569(0x239, float:7.97E-43)
            r6 = 146274690(0x8b7f982, float:1.1072571E-33)
            r4 = r4 ^ r5
            r4 = r4 ^ r6
            switch(r4) {
                case -1774314887: goto L_0x0042;
                case -1723878627: goto L_0x009a;
                case -1709852304: goto L_0x003d;
                case -1392303426: goto L_0x0032;
                case -1234815072: goto L_0x008b;
                case -1150872246: goto L_0x001d;
                case -513437633: goto L_0x0037;
                case -235536953: goto L_0x001a;
                case -85969584: goto L_0x0017;
                case 356795911: goto L_0x0094;
                case 1094467676: goto L_0x0061;
                case 1498854921: goto L_0x0014;
                case 2122781861: goto L_0x0023;
                default: goto L_0x0013;
            }
        L_0x0013:
            goto L_0x0005
        L_0x0014:
            java.lang.String r0 = "ۥۦۘۘۦ۟۟۫ۦۖ۠ۢۖۘۦۜۛ"
            goto L_0x0005
        L_0x0017:
            java.lang.String r0 = "ۨۗۗۡۤۢ۟۫ۖۘۖۤ۬۠ۜۨۘ۫ۢۦۘۢۚۢ"
            goto L_0x0005
        L_0x001a:
            java.lang.String r0 = "۠ۤۖۘۛۚۙۡۙۛۤۨ۫ۚ۫ۢۨۢۤ"
            goto L_0x0005
        L_0x001d:
            super.onMeasure(r8, r9)
            java.lang.String r0 = "ۜۨۦ۠ۙۤۦۜۥۜۥۦ۟ۙۥۘۘۗۤۖۗۘ"
            goto L_0x0005
        L_0x0023:
            int r0 = r7.getMeasuredHeight()
            int r3 = r7.getMeasuredWidth()
            int r3 = java.lang.Math.min(r0, r3)
            java.lang.String r0 = "ۗۛۥ۟ۚ۬ۨۧۚۦ۫ۨۘۨۤۡ"
            goto L_0x0005
        L_0x0032:
            r7.f1009h = r3
            java.lang.String r0 = "ۨۛۖ۬ۘۧ۫ۖۚۡۢ۠ۜۚۥۙۨۘۛ۫۠ۨ۠ۦ۬"
            goto L_0x0005
        L_0x0037:
            r7.setMeasuredDimension(r3, r3)
            java.lang.String r0 = "ۘۛۢۚ۬ۚۛۖۡۙۘۚۛ۠ۥۘۨۥۛۨۜۧ"
            goto L_0x0005
        L_0x003d:
            android.graphics.Bitmap r1 = r7.f1006e
            java.lang.String r0 = "ۛۘۛ۟ۥۧۘۗۦۛۨ۠ۗۡۚۖۘ۫ۢۜ"
            goto L_0x0005
        L_0x0042:
            r4 = -1585025808(0xffffffffa1866cf0, float:-9.109029E-19)
            java.lang.String r0 = "ۚۛۤۗۖۨۤۘ۟ۗۧ۬۠ۦۢۡۙۡۘ"
        L_0x0047:
            int r5 = r0.hashCode()
            r5 = r5 ^ r4
            switch(r5) {
                case -152021057: goto L_0x005e;
                case 800635426: goto L_0x0050;
                case 1028301721: goto L_0x005b;
                case 1271170308: goto L_0x0056;
                default: goto L_0x004f;
            }
        L_0x004f:
            goto L_0x0047
        L_0x0050:
            java.lang.String r0 = "ۢۚۢۛۤۙۗۙۡۙۙۧۤۜ۟۟"
            goto L_0x0005
        L_0x0053:
            java.lang.String r0 = "ۚۛۥۘ۠۟ۥۨ۫ۡۘ۬۠ۙۜۨۦۘۗ۟ۦۘۛۜۘۘ"
            goto L_0x0047
        L_0x0056:
            if (r1 == 0) goto L_0x0053
            java.lang.String r0 = "۠ۤۜۧۗۗۙۧۖ۠ۡۜۧۦ۬ۛۦۥۘ"
            goto L_0x0047
        L_0x005b:
            java.lang.String r0 = "ۗۦۡ۫ۚۜۘۦ۫ۡۥ۫ۘۦۗۚ۫ۢۨۨ۬ۧۖۦۡۘ"
            goto L_0x0047
        L_0x005e:
            java.lang.String r0 = "ۡۚۥۘ۟ۦۨۤۢۥۘۧ۠ۨۚۛۖۘ۫ۧۦ۫۬ۦۖۗۚۗ۟ۡ"
            goto L_0x0005
        L_0x0061:
            r4 = 256813917(0xf4eab5d, float:1.01895875E-29)
            java.lang.String r0 = "ۨۜۨ۟ۜۥۘۡ۫۟ۢۖۘۦ۬ۘۘ"
        L_0x0066:
            int r5 = r0.hashCode()
            r5 = r5 ^ r4
            switch(r5) {
                case 239422756: goto L_0x006f;
                case 998225435: goto L_0x0050;
                case 1743590256: goto L_0x0084;
                case 1758582050: goto L_0x0087;
                default: goto L_0x006e;
            }
        L_0x006e:
            goto L_0x0066
        L_0x006f:
            int r0 = r1.getHeight()
            int r5 = r7.f1009h
            int r6 = r7.getBackgroundOffset()
            int r6 = r6 * 2
            int r5 = r5 - r6
            if (r0 == r5) goto L_0x0081
            java.lang.String r0 = "ۘۨۦۘ۠ۤۡۘۖۡۗۛۗۥۥۧۨۖ۬ۘۘۚۧۘ۫ۡۤۚۡۙ"
            goto L_0x0066
        L_0x0081:
            java.lang.String r0 = "ۗۛۚۧ۬ۡ۬ۗ۫ۤ۫ۡۘۚۘۦۘ۬ۙۢۦۖۘۥ۬ۨ"
            goto L_0x0066
        L_0x0084:
            java.lang.String r0 = "۫ۥۥۚۧۖۘۨۛۨۘۦۢۨۘ۫ۧۖۘۛ۟ۧۙ۠ۜۘ"
            goto L_0x0066
        L_0x0087:
            java.lang.String r0 = "ۘ۬ۘۘۧۛۘۤ۟ۡ۟ۦۧۜۙۤ۟ۡۨۘۛۢۖۘ۫ۛۥۘ"
            goto L_0x0005
        L_0x008b:
            android.graphics.Bitmap r0 = r7.f1006e
            r0.recycle()
            java.lang.String r0 = "۠۠ۡۘۤۘۡۘۦۘۧۘۜۘۢۙۦۖ۬۠ۨۖۦۘۘ"
            goto L_0x0005
        L_0x0094:
            r7.f1006e = r2
            java.lang.String r0 = "ۢۚۢۛۤۙۗۙۡۙۙۧۤۜ۟۟"
            goto L_0x0005
        L_0x009a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.youbasha.colorPicker.HsvColorValueView.onMeasure(int, int):void");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x008f, code lost:
        r0 = "ۨۙۢۛۧۗۥۡۘۡۙ۠ۗ۬ۨۚۧ۟ۘۚۜۜ۬ۗ۬ۘۨۘ";
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            r5 = 0
            r1 = 1
            java.lang.String r0 = "۠۟ۦۘۘۦۨۘۙ۠ۙۖۡۛۙ۠ۖۘ"
        L_0x0004:
            int r2 = r0.hashCode()
            r3 = 56
            r4 = -663122417(0xffffffffd8798e0f, float:-1.09755413E15)
            r2 = r2 ^ r3
            r2 = r2 ^ r4
            switch(r2) {
                case -1992320959: goto L_0x003e;
                case -1689752912: goto L_0x00c6;
                case -1307082714: goto L_0x00a7;
                case -887852343: goto L_0x0060;
                case -221892415: goto L_0x0013;
                case 44018359: goto L_0x0040;
                case 100943888: goto L_0x0019;
                case 835970469: goto L_0x0081;
                case 841325415: goto L_0x0016;
                case 1003572753: goto L_0x0039;
                case 1241526073: goto L_0x00e4;
                case 1272322784: goto L_0x0065;
                case 1440528784: goto L_0x00e1;
                case 1887136926: goto L_0x007f;
                default: goto L_0x0012;
            }
        L_0x0012:
            goto L_0x0004
        L_0x0013:
            java.lang.String r0 = "ۤ۟ۙ۠ۦۖۧۨۜۘۥۘۘۚۖۢ"
            goto L_0x0004
        L_0x0016:
            java.lang.String r0 = "ۡۖۛۘ۬ۨۡۧۧۙۘۙۢۦۖۚۘ۬ۥۘۧۘ"
            goto L_0x0004
        L_0x0019:
            r2 = 70098176(0x42d9d00, float:2.0408143E-36)
            java.lang.String r0 = "ۦۧۢ۫ۢۘۖۡۘۗۥۦۘۖۢۘۘۥۥۤۦۢۨۢۧۥۘۗۘۘۘ"
        L_0x001e:
            int r3 = r0.hashCode()
            r3 = r3 ^ r2
            switch(r3) {
                case -1187304902: goto L_0x0027;
                case 380539108: goto L_0x0033;
                case 499831983: goto L_0x00ea;
                case 1282825039: goto L_0x0036;
                default: goto L_0x0026;
            }
        L_0x0026:
            goto L_0x001e
        L_0x0027:
            int r0 = r7.getAction()
            if (r0 != 0) goto L_0x0030
            java.lang.String r0 = "ۥۡۚۡۜۛۘۢۤۙۜۨۙ۬ۤۡۨ۠۫ۡۖۥۚۖۘۖۘ"
            goto L_0x001e
        L_0x0030:
            java.lang.String r0 = "ۗۨۜۛۘۦۘۨۘۜۘۜۚ۠۠ۡۗۤۡۚۙۖۢۙۦۖۘۛۙۘۘ"
            goto L_0x001e
        L_0x0033:
            java.lang.String r0 = "ۜۘۦۘۛۜۙۨۡۧۘ۟۫ۖۘۡۖۦ"
            goto L_0x001e
        L_0x0036:
            java.lang.String r0 = "۟ۗۘۥۡۛۢۙۧۨۗۢۥۨۗ۬۠۬"
            goto L_0x0004
        L_0x0039:
            r6.f1013l = r1
            java.lang.String r0 = "۫ۛۛۜۧۧۙۘۘۜۘۜۥ۠ۜۘۚۤۥۘۘۜۥۚۛ"
            goto L_0x0004
        L_0x003e:
            r0 = r1
        L_0x003f:
            return r0
        L_0x0040:
            r2 = 101603211(0x60e578b, float:2.6771548E-35)
            java.lang.String r0 = "ۢۖۘۥۤۦۘ۫۠ۧ۬۟۬ۢۡۛۦۥۨۘ۠ۥۢۘۖ۬ۜۤ۬"
        L_0x0045:
            int r3 = r0.hashCode()
            r3 = r3 ^ r2
            switch(r3) {
                case -1818927473: goto L_0x0054;
                case -372226338: goto L_0x004e;
                case 615153001: goto L_0x005d;
                case 1993024136: goto L_0x00ee;
                default: goto L_0x004d;
            }
        L_0x004d:
            goto L_0x0045
        L_0x004e:
            java.lang.String r0 = "۠ۘ۠۬ۥۤۦۧۡۦۨۛۡۡۘۧۖۖ۠ۛۢۨۚ۬"
            goto L_0x0004
        L_0x0051:
            java.lang.String r0 = "ۜ۬ۗۤۥۜۘۛۘۡۛۨۚۡۘۜۘ۬ۡۡۡ۠۬ۥۖۧۘ"
            goto L_0x0045
        L_0x0054:
            int r0 = r7.getAction()
            if (r0 != r1) goto L_0x0051
            java.lang.String r0 = "ۖ۟۫۠ۥۘۘۨۗۚۥۚۢۖۨۛۧۡۘۤۘ۠۠۫ۛ"
            goto L_0x0045
        L_0x005d:
            java.lang.String r0 = "ۨۗۙ۠ۨۧۘۧۡۦۘۖۤۗۗۖۛۖ۬ۙ۠ۚ۫ۘۗۤ"
            goto L_0x0045
        L_0x0060:
            r6.f1013l = r5
            java.lang.String r0 = "ۢۚ۠ۚۨۘۨۖۥۤۧۢ۟ۖۘ"
            goto L_0x0004
        L_0x0065:
            float r0 = r7.getX()
            int r0 = (int) r0
            int r2 = r6.getBackgroundOffset()
            int r0 = r0 - r2
            float r2 = r7.getY()
            int r2 = (int) r2
            int r3 = r6.getBackgroundOffset()
            int r2 = r2 - r3
            r6.d(r0, r2, r1)
            java.lang.String r0 = "ۙۤ۠ۘۦ۠ۜۗ۟۬ۜۤ۠ۤۚۥۖۧۙۗۥۘۥ۟ۜۘۗ۬"
            goto L_0x0004
        L_0x007f:
            r0 = r1
            goto L_0x003f
        L_0x0081:
            r2 = -623534325(0xffffffffdad59f0b, float:-3.00645198E16)
            java.lang.String r0 = "ۢ۫ۧۡۖۛۗۘۜۘ۬ۧ۠۬ۖۧ۠ۖۗ"
        L_0x0086:
            int r3 = r0.hashCode()
            r3 = r3 ^ r2
            switch(r3) {
                case -215049632: goto L_0x008f;
                case 179279241: goto L_0x00a3;
                case 810132079: goto L_0x0096;
                case 1492514487: goto L_0x00a0;
                default: goto L_0x008e;
            }
        L_0x008e:
            goto L_0x0086
        L_0x008f:
            java.lang.String r0 = "ۨۙۢۛۧۗۥۡۘۡۙ۠ۗ۬ۨۚۧ۟ۘۚۜۜ۬ۗ۬ۘۨۘ"
            goto L_0x0004
        L_0x0093:
            java.lang.String r0 = "ۨ۫ۜۘۜۥۗۦ۟۟ۜ۟ۡ۬ۡۗ۟ۨۙ۠۬ۨۢۦ"
            goto L_0x0086
        L_0x0096:
            int r0 = r7.getAction()
            r3 = 2
            if (r0 != r3) goto L_0x0093
            java.lang.String r0 = "ۚۧۚۧۜۥۙۡۘ۫ۨ۟۠ۖۘۘۜ۟ۚ۠۠ۧۦ۫ۜ"
            goto L_0x0086
        L_0x00a0:
            java.lang.String r0 = "ۢۛۨ۟ۧ۫ۜۖۜۨۜۦۘ۬ۚ۠۫ۛۧۢۖۥۘۥۢ۟"
            goto L_0x0086
        L_0x00a3:
            java.lang.String r0 = "۠ۢۗۦۜۥۘۨ۫۫ۨۨۘۧۡۙ"
            goto L_0x0004
        L_0x00a7:
            r2 = -1432916746(0xffffffffaa976cf6, float:-2.6898595E-13)
            java.lang.String r0 = "ۢۥۨۘۢ۫ۗۧۧۦۨ۬ۧۙ۬ۦۘۢۙۥ"
        L_0x00ac:
            int r3 = r0.hashCode()
            r3 = r3 ^ r2
            switch(r3) {
                case -435637145: goto L_0x00bb;
                case 880304678: goto L_0x00c2;
                case 920826894: goto L_0x008f;
                case 2126783532: goto L_0x00b5;
                default: goto L_0x00b4;
            }
        L_0x00b4:
            goto L_0x00ac
        L_0x00b5:
            java.lang.String r0 = "ۢۗۛۨۜۥۙۧ۫ۤۡۡ۬ۧۜۘۢ۬ۨ۟ۜ۟۟ۙ۟ۧۨۡۘ"
            goto L_0x00ac
        L_0x00b8:
            java.lang.String r0 = "ۨۚۜۘۤۚۡ۟ۗۨۘ۫۫ۚ۫۫ۜۨۙۛۧ۬ۨۘ"
            goto L_0x00ac
        L_0x00bb:
            boolean r0 = r6.f1013l
            if (r0 == 0) goto L_0x00b8
            java.lang.String r0 = "ۙۨۦۘ۠ۚۦۧ۬ۘۘۗۚۨۜۡ۟ۜۡۤ"
            goto L_0x00ac
        L_0x00c2:
            java.lang.String r0 = "۬ۙۜۘ۬ۚۖۛۙۘۖۘۡۘۥۢۨۧ۫ۢ"
            goto L_0x0004
        L_0x00c6:
            float r0 = r7.getX()
            int r0 = (int) r0
            int r2 = r6.getBackgroundOffset()
            int r0 = r0 - r2
            float r2 = r7.getY()
            int r2 = (int) r2
            int r3 = r6.getBackgroundOffset()
            int r2 = r2 - r3
            r6.d(r0, r2, r5)
            java.lang.String r0 = "ۧۙۖۘ۫ۗۘۘۤۢۘۦۢۦۘۙۤۥۘۤۧۘ۟ۛۜۘ"
            goto L_0x0004
        L_0x00e1:
            r0 = r1
            goto L_0x003f
        L_0x00e4:
            boolean r0 = super.onTouchEvent(r7)
            goto L_0x003f
        L_0x00ea:
            java.lang.String r0 = "ۤۦ۟۠ۤۖۘۙۤۦۘۚۡۥۜۙۨۢ۠ۘۘۢۥۖۘۚۢ۠ۛۜۡۘ"
            goto L_0x0004
        L_0x00ee:
            java.lang.String r0 = "ۤۥۢ۫۬ۤۜۦۚۦ۠ۡۘۗ۠ۙۗۤۖۡۢ۫"
            goto L_0x0004
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.youbasha.colorPicker.HsvColorValueView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setHue(float f2) {
        String str = "ۤۤۤ۫ۥۦۧ۠ۜۘۥۘۘۚۙۙۤۗۜۘ";
        while (true) {
            switch ((str.hashCode() ^ 134) ^ -1248006693) {
                case -210415496:
                    return;
                case 1440738438:
                    this.f1005d = f2;
                    str = "ۧۙ۫ۥۘ۫ۤ۬۬ۨۚۨ۟۫ۡۘۤۗۨ";
                    break;
                case 1882802780:
                    this.f1006e = null;
                    str = "۬۠ۛۧۢۦۘۜۤ۠ۜۛۡۨۥۛ۠ۙۡ۫ۜۘ";
                    break;
                case 1892628195:
                    str = "۬ۛۘۘۘ۬ۘۘۖ۟ۥ۬ۢۢ۬ۘۜۘ";
                    break;
                case 1944201852:
                    str = "ۢۛ۬ۢۡۗۚۤۦۘۘۚۘۘۤۤۡ";
                    break;
                case 2038780002:
                    invalidate();
                    str = "۬ۙۖۘۧۜۖۗۤ۟ۜۨۗۢ۟۠ۛۥۧ";
                    break;
            }
        }
    }

    public void setOnSaturationOrValueChanged(OnSaturationOrValueChanged onSaturationOrValueChanged) {
        String str = "ۡۡۖۘۜۘ۬۟ۦۡۜۛۧۥۡ";
        while (true) {
            switch ((str.hashCode() ^ 541) ^ -112538711) {
                case -1193427694:
                    this.f1012k = onSaturationOrValueChanged;
                    str = "ۖۤۚ۠ۘۛۦۨۜۘۤۗۧۤۨۦۡۜۛۨ۠ۦ۬ۧۛ۫۠ۜۘ";
                    break;
                case -879069012:
                    str = "۫۬ۦۖۧۡۘۨۧۙۨۡۨۘ۟ۡۜۧۥۛ۟ۦۢۧۡۢ";
                    break;
                case -179591756:
                    return;
                case 1717877554:
                    str = "ۖۡۘۡۙ۠ۥۖۥۘۥۤۘۘ۬ۚۥۤۧۚۗۦۛۖۤۢ";
                    break;
            }
        }
    }

    public void setSaturation(float f2) {
        String str = "ۧۨۜۘۨۛ۟ۘ۫ۡۘ۬ۜۘ۬ۖۨ۫ۢۚ";
        while (true) {
            switch ((str.hashCode() ^ 432) ^ 1973747864) {
                case -2058250599:
                    str = "۫ۤۚۛۗۧۜۦ۟ۖۘۘۛۥ";
                    break;
                case -1748005038:
                    c();
                    str = "ۗ۫ۘۘۢۢۨ۠ۚۘۘ۬ۖۛۙ۟ۨۘۜ۟۬۬ۢ۠";
                    break;
                case -1491944115:
                    String str2 = "ۚ۠ۧۥۡۜ۫۠ۡۘۗۥۥۛۜۘۢۡۧۘۧ۟ۨۘۥۙۥۨۚ";
                    while (true) {
                        switch (str2.hashCode() ^ -1362781905) {
                            case -313644499:
                                str2 = "ۥۧۤۛۥۜۙۧۡۘ۫ۥۤۘ۫ۘۘ۠ۧۜۘۨ۟ۦۘ۟ۖۙۦۡۜ";
                                break;
                            case -306865777:
                                if (this.f1006e == null) {
                                    str2 = "ۦۛۥۘۧۘۦۛۗ۫ۘۢۧۤۡۘ";
                                    break;
                                } else {
                                    str2 = "ۨ۬۫۟ۚۥۘۢ۫ۙۚۢ۟ۦۨۘ۬۫ۥ۟۫ۚ";
                                    break;
                                }
                            case 23505788:
                                str = "ۧۧۘۘۖۙۜ۫ۜۤۘۜۡۘ۠ۦ۬ۢ۫ۘۘ";
                                continue;
                            case 1089035823:
                                str = "ۗ۫ۘۘۢۢۨ۠ۚۘۘ۬ۖۛۙ۟ۨۘۜ۟۬۬ۢ۠";
                                continue;
                        }
                    }
                    break;
                case 362518386:
                    return;
                case 577741501:
                    this.f1010i = f2;
                    str = "ۡۡۥۘ۠۟۬ۤ۟ۡۘ۟ۢۤۖۤۖۘۘۜۜۘ";
                    break;
                case 2123685212:
                    str = "ۚۘۡۘۙۛۨۘۗۙۨۗ۫ۗۛۘۗۢۛۜۘۛۘۘۥۥ۬ۦ۟ۦ";
                    break;
            }
        }
    }

    public void setValue(float f2) {
        String str = "۠ۥۨۦۢۛۦۨۤۥۙۘۨۜۘۡۨ۫ۥ۟۟ۦ۫ۨۘۨۖ";
        while (true) {
            switch ((str.hashCode() ^ 595) ^ 1038428725) {
                case -1564321940:
                    return;
                case -279853325:
                    this.f1011j = f2;
                    str = "ۡۥۡۘۦۤۤۥۥۦۘۙۛۨ۟ۧۜۘۨۢۖۘۚۗۧۜۡۧۘ";
                    break;
                case 17421797:
                    str = "ۘۖ۫ۢۙ۫۫۟ۦۘۛۥۥۘ۟ۘۘ";
                    break;
                case 120121276:
                    c();
                    str = "ۥۡۗ۫۠ۘۘۤۗۨۦۤۚۥۨۤ";
                    break;
                case 143864940:
                    str = "ۗۧ۠ۙۡۘۘۤۛۡۘۙ۬۬ۘۥۨۘۨ۫ۖ";
                    break;
                case 1377374001:
                    String str2 = "ۧۤۘۨۡۚۗۤۦۘ۬ۙۥۤۡ۬ۡۗۡۘۥۢۥۗۤۜۘۥۦۦ";
                    while (true) {
                        switch (str2.hashCode() ^ -1717764686) {
                            case -2127720089:
                                str = "ۥۡۗ۫۠ۘۘۤۗۨۦۤۚۥۨۤ";
                                continue;
                            case -2063932017:
                                if (this.f1006e == null) {
                                    str2 = "۫ۥۜۘۘۦۧۘۢۘ۫ۥ۬ۥۘ۫۠ۤ";
                                    break;
                                } else {
                                    str2 = "ۖۖۦۘۘۧۘۖۜۤۜ۬ۡۥۦۚۜۗ";
                                    break;
                                }
                            case -1393965668:
                                str = "ۤۤۙۗۗۦۘۘۧۘۘ۟ۜۘ۟ۢ۬ۢ۠ۦۘۖۚۤۢۨۨ";
                                continue;
                            case 2067541976:
                                str2 = "ۦۗۡۦ۟ۘ۟ۢۖۘۥۨۥۨۦ۠ۡ۟ۜۘ";
                                break;
                        }
                    }
                    break;
            }
        }
    }
}
