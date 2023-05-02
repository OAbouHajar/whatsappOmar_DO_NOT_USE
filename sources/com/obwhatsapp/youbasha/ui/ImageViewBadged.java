package com.obwhatsapp.youbasha.ui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.obwhatsapp.yo.yo;
import com.obwhatsapp.youbasha.others;

@SuppressLint({"AppCompatCustomView"})
public class ImageViewBadged extends ImageView {

    /* renamed from: a  reason: collision with root package name */
    public String f1113a = "";

    /* renamed from: b  reason: collision with root package name */
    public boolean f1114b = false;

    /* renamed from: c  reason: collision with root package name */
    public int f1115c = -65536;

    /* renamed from: d  reason: collision with root package name */
    public int f1116d = -1;

    /* renamed from: e  reason: collision with root package name */
    public int f1117e = 0;

    /* renamed from: f  reason: collision with root package name */
    public final int f1118f = 12;

    /* renamed from: g  reason: collision with root package name */
    public float f1119g;

    /* renamed from: h  reason: collision with root package name */
    public Paint f1120h;

    /* renamed from: i  reason: collision with root package name */
    public final Context f1121i;

    public ImageViewBadged(Context context) {
        super(context);
        this.f1121i = context;
        a();
    }

    public ImageViewBadged(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1121i = context;
        a();
    }

    public ImageViewBadged(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f1121i = context;
        a();
    }

    private Paint getPaint() {
        float f2 = 0.0f;
        String str = "ۡۖۧۥۦۢۖۥۦۛۜۥۘۜ۫ۜ۫۟ۦۘ";
        while (true) {
            switch ((str.hashCode() ^ 811) ^ -53367153) {
                case -1764426574:
                    this.f1119g = f2;
                    str = "۟ۗۛ۠۠ۡۧۖۘ۠ۤ۫ۙ۬ۥۙۗۨۘ";
                    break;
                case -1001215790:
                    this.f1120h = new Paint();
                    str = "۫۠ۘۘۖۧۚۦۥۥۢۘۦ۠ۨ۠ۖ۟ۦ";
                    break;
                case -922170803:
                    return this.f1120h;
                case 17682016:
                    this.f1120h.setTextSize(((float) this.f1118f) * f2);
                    str = "ۗ۠ۨۘۙۦۡۘۜۖۦۦۨۖۘۚ۠ۧۙۨۦۨۗۡ";
                    break;
                case 519987507:
                    str = "ۦۛۗۢۛۛۜ۟ۤۖۨۨۘۗۧۗ۬ۚۖۘ۫ۦۢۨۘۦۡۦۥۘ";
                    break;
                case 574261311:
                    String str2 = "ۢ۬ۧۤۜۜۧ۠ۛۜ۬ۤۢ۟ۦۘۖۦۡ";
                    while (true) {
                        switch (str2.hashCode() ^ -1169320155) {
                            case -1828952284:
                                str = "ۖۜۚ۫۠ۚۗۗۖ۬ۨ۬۠ۗ۬ۚۧۨۘۘۢۤ۟ۤۚۘ";
                                continue;
                            case -1369629206:
                                str = "ۗ۠ۨۘۙۦۡۘۜۖۦۦۨۖۘۚ۠ۧۙۨۦۨۗۡ";
                                continue;
                            case -1011706362:
                                str2 = "ۗۖۘۘۧۥۛۨۛ۟۠ۧۖۘۤۥۦۘۖ۠ۛۛۢۥۘ";
                                break;
                            case 1978958060:
                                if (this.f1120h != null) {
                                    str2 = "ۥۚ۟ۡ۬ۦۘۖۢ۟ۦۗ۟۠ۙۥۙۖۖ۟ۚۦۧۢۦ";
                                    break;
                                } else {
                                    str2 = "ۨ۬ۙۗ۟ۘۘۨۨۧۘۤۢ۟ۚۦۖ۫ۛۜۘ";
                                    break;
                                }
                        }
                    }
                    break;
                case 962851879:
                    f2 = this.f1121i.getResources().getDisplayMetrics().density;
                    str = "ۛۡ۠ۚ۬۬ۡۘۥۘۚۜۨ۟ۖۤ۟ۨۘۛ۫ۧۗ۠ۘ";
                    break;
            }
        }
    }

    public final void a() {
        String str = "ۦۚۗۦۙ۫ۘۚ۫ۙۡۨۗۢ";
        while (true) {
            switch ((str.hashCode() ^ 309) ^ -536205972) {
                case -1071763090:
                    str = "ۡۥۖۤ۬ۨ۟ۨۘۘۥۖۖ۫ۦۛ";
                    break;
                case 965030379:
                    setBadgeColor(others.getTabBageBKColor(-1));
                    str = "ۛۙۖ۫ۖۧۢ۟ۘۖۡ۬ۙۧۘۙ۫ۥۛۥۘ";
                    break;
                case 1654193300:
                    return;
                case 1746286466:
                    setBadgeTextColor(others.getColor("tabadgeTextColor", yo.circleColor()));
                    str = "ۗۨ۫ۡۘۛۡۛۛۥۘۗ";
                    break;
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x019c, code lost:
        r4 = "ۖۨۙۜۖۘ۟ۡۢۧ۟ۨۘۥۜۧۦۙۛ";
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void draw(android.graphics.Canvas r21) {
        /*
            r20 = this;
            r16 = 0
            r15 = 0
            r14 = 0
            r13 = 0
            r12 = 0
            r11 = 0
            r10 = 0
            r9 = 0
            r8 = 0
            r7 = 0
            r6 = 0
            r5 = 0
            java.lang.String r4 = "۠ۜۗۜۚ۬۬ۥۡۛۨۘۛۖۛۧۨۘ۬ۥۘۦۨ"
        L_0x000f:
            int r17 = r4.hashCode()
            r18 = 970(0x3ca, float:1.359E-42)
            r19 = -1169385547(0xffffffffba4c97b5, float:-7.8045885E-4)
            r17 = r17 ^ r18
            r17 = r17 ^ r19
            switch(r17) {
                case -1950947528: goto L_0x004d;
                case -1937048394: goto L_0x01a0;
                case -1589299277: goto L_0x012f;
                case -1354780981: goto L_0x0020;
                case -1152647444: goto L_0x011c;
                case -1048683289: goto L_0x002c;
                case -1024607271: goto L_0x0160;
                case -827886287: goto L_0x0102;
                case -296284574: goto L_0x00ad;
                case -166632519: goto L_0x007b;
                case -41930334: goto L_0x0089;
                case 49518791: goto L_0x00b8;
                case 145057600: goto L_0x006e;
                case 295630873: goto L_0x0090;
                case 342959905: goto L_0x0113;
                case 541141311: goto L_0x00f3;
                case 690527687: goto L_0x0026;
                case 709306405: goto L_0x00fa;
                case 715249928: goto L_0x00c0;
                case 1011822806: goto L_0x0023;
                case 1116948604: goto L_0x014d;
                case 1192942678: goto L_0x0082;
                case 1220015190: goto L_0x00e2;
                case 1237899880: goto L_0x009d;
                case 1773942422: goto L_0x010c;
                case 2048652140: goto L_0x0074;
                default: goto L_0x001f;
            }
        L_0x001f:
            goto L_0x000f
        L_0x0020:
            java.lang.String r4 = "ۘ۫ۙۨۚۨۘۜۤۙۙۦۧۦ۠ۨۘۧۧ۫۬ۧۤۤۛۖۘۢۙۘۘ"
            goto L_0x000f
        L_0x0023:
            java.lang.String r4 = "ۤ۬۬ۜۥۡۙۘۗۙۙۡۘۡۜۛۨ۠ۖۖۡ۫ۚۚۖ۫ۜۘ"
            goto L_0x000f
        L_0x0026:
            super.draw(r21)
            java.lang.String r4 = "ۖۡ۬۫ۧۖۘۘۤۖۘۦۦ۠ۖ۬ۨ۠ۤ۬ۖۦۚۨۦۜۦۜ۫"
            goto L_0x000f
        L_0x002c:
            r17 = 92127071(0x57dbf5f, float:1.1931152E-35)
            java.lang.String r4 = "ۤۤۙۦۛۡۘۜۡۛۘۚۧۨ۬ۘۘ"
        L_0x0031:
            int r18 = r4.hashCode()
            r18 = r18 ^ r17
            switch(r18) {
                case -1910519074: goto L_0x004a;
                case -965937480: goto L_0x019c;
                case 1068092783: goto L_0x003b;
                case 1754634311: goto L_0x0041;
                default: goto L_0x003a;
            }
        L_0x003a:
            goto L_0x0031
        L_0x003b:
            java.lang.String r4 = "ۦۧ۠ۗۨۘۥ۟ۢۤۖۡۘۥۛۦ"
            goto L_0x000f
        L_0x003e:
            java.lang.String r4 = "۟ۧۤۙۦۜۚۦۡۘۢۢۦۤ۫ۥۘۢۘۗۦۥۚۙۧۙ"
            goto L_0x0031
        L_0x0041:
            r0 = r20
            boolean r4 = r0.f1114b
            if (r4 == 0) goto L_0x003e
            java.lang.String r4 = "ۦۖ۬ۙۤۘۘۦۢۛۥۖۘۜۘۡۘۧۜۘ"
            goto L_0x0031
        L_0x004a:
            java.lang.String r4 = "ۦۡۜۜ۠ۘۘ۫ۖۘۤ۫ۖۘۧۧۘۨۤۗۡۜ۟"
            goto L_0x0031
        L_0x004d:
            r17 = -234802245(0xfffffffff20133bb, float:-2.5591107E30)
            java.lang.String r4 = "ۦۢۗۘۙۖۘۥۜۥۘۘۥۢۖۤ۫ۖۚۨۥۘۜۘ"
        L_0x0052:
            int r18 = r4.hashCode()
            r18 = r18 ^ r17
            switch(r18) {
                case -898741948: goto L_0x006b;
                case -731853406: goto L_0x005c;
                case 814991576: goto L_0x019c;
                case 2142149656: goto L_0x0062;
                default: goto L_0x005b;
            }
        L_0x005b:
            goto L_0x0052
        L_0x005c:
            java.lang.String r4 = "۬ۡ۟۫ۢۜۦۤ۬ۤۦۚۤۢۗۜۨۜۘۖ۟۠ۘۜۘۘ"
            goto L_0x0052
        L_0x005f:
            java.lang.String r4 = "۠ۥ۫ۥۚۦۘۡۛۤ۫ۖۤۖۛۨۘۙۘۥۘ"
            goto L_0x0052
        L_0x0062:
            r0 = r20
            java.lang.String r4 = r0.f1113a
            if (r4 == 0) goto L_0x005f
            java.lang.String r4 = "ۗۤ۠ۤۧۜۨۧۥۤۛۦ۫ۢۡۘۨ۬ۦۢ۠ۢۧۥۜۘ"
            goto L_0x0052
        L_0x006b:
            java.lang.String r4 = "۬ۢۡۘۚۧۖۘۤ۟ۤۗۛۢ۫ۜ۟ۥۡۨۗۧ"
            goto L_0x000f
        L_0x006e:
            r20.getPaint()
            java.lang.String r4 = "ۢۧۙۖۥۙۧۦۙۦ۟ۛۛۗۘۘۜ۬ۦۘ۬ۗۤۨۜۖۘ"
            goto L_0x000f
        L_0x0074:
            float r16 = r20.getPivotX()
            java.lang.String r4 = "۠۫ۙۢۚۗۖۢۧۖۡ۫۬۬ۥۜ۠ۙ"
            goto L_0x000f
        L_0x007b:
            float r15 = r20.getPivotY()
            java.lang.String r4 = "ۨ۬۫ۤۛ۬ۖۦۨ۠۫ۘۘۥۨۜۨۜۧۘ"
            goto L_0x000f
        L_0x0082:
            int r14 = r20.getMeasuredHeight()
            java.lang.String r4 = "ۖۥۛۘۗ۬ۙ۫ۡۘۜۖۡ۟ۘ۠۟ۨ۫ۙۜ۠ۧۛۖ"
            goto L_0x000f
        L_0x0089:
            int r13 = r20.getMeasuredWidth()
            java.lang.String r4 = "۠ۖۗ۫۠ۜۘۛۛ۠۠۬ۖۘۥۛۘۚۚۘۘ"
            goto L_0x000f
        L_0x0090:
            r4 = 2
            int r4 = com.obwhatsapp.youbasha.task.utils.dimenInDP(r4)
            r0 = r20
            r0.f1117e = r4
            java.lang.String r4 = "ۜۗۖ۬ۛۢۡۚۛۡۜ۫۬۟ۗ۫ۤ"
            goto L_0x000f
        L_0x009d:
            r0 = r20
            android.graphics.Paint r4 = r0.f1120h
            r0 = r20
            java.lang.String r12 = r0.f1113a
            float r12 = r4.measureText(r12)
            java.lang.String r4 = "ۥۡۥۘۤۘۥۘۙۗۚۖۖۙ۟ۙۨۘ"
            goto L_0x000f
        L_0x00ad:
            r0 = r20
            int r4 = r0.f1117e
            int r4 = r4 * 2
            float r11 = (float) r4
            java.lang.String r4 = "ۧۗۜۘۜۖۤۜۡۨۤۖۖۘ۬ۥۖۘۥۘۧۘ"
            goto L_0x000f
        L_0x00b8:
            r0 = r20
            float r10 = r0.f1119g
            java.lang.String r4 = "ۚۚۧۜۢۖۜۥۙۜۛۥۘ۠۫ۥۛۨۥ"
            goto L_0x000f
        L_0x00c0:
            r17 = -1916275628(0xffffffff8dc7f454, float:-1.2323142E-30)
            java.lang.String r4 = "۠۠۟ۙۤۨۜۤۗۢ۫ۖۘۖ۬ۘ"
        L_0x00c5:
            int r18 = r4.hashCode()
            r18 = r18 ^ r17
            switch(r18) {
                case -1569095918: goto L_0x00d6;
                case 466529397: goto L_0x00df;
                case 963674554: goto L_0x00cf;
                case 1871914338: goto L_0x0198;
                default: goto L_0x00ce;
            }
        L_0x00ce:
            goto L_0x00c5
        L_0x00cf:
            java.lang.String r4 = "۬ۜۜ۟۟ۗۘۥۤ۬۬ۢۙ۬۬ۚۦۘ"
            goto L_0x000f
        L_0x00d3:
            java.lang.String r4 = "ۜ۟۬ۘۘ۬ۗۜ۫۠ۨۘۘۨۥۙۧ"
            goto L_0x00c5
        L_0x00d6:
            float r4 = r11 * r10
            int r4 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r4 <= 0) goto L_0x00d3
            java.lang.String r4 = "ۚ۫ۦ۠ۘۨ۠۬۫ۡۧۥۙۨۨۘ۬۟ۨۘ۫ۜ۫ۛ۠ۨۧۚۚ"
            goto L_0x00c5
        L_0x00df:
            java.lang.String r4 = "۟ۜۘۧۥۤ۬ۤۡۘۧۙۡۨ۟ۚ"
            goto L_0x00c5
        L_0x00e2:
            r4 = 1073741824(0x40000000, float:2.0)
            float r4 = r4 * r12
            r17 = 1077936128(0x40400000, float:3.0)
            float r4 = r4 / r17
            float r4 = r4 / r10
            int r4 = (int) r4
            r0 = r20
            r0.f1117e = r4
            java.lang.String r4 = "ۢ۠ۖۥ۠۬ۡ۬ۙ۟ۤۦۖۦۨۘۧۙۖۘ"
            goto L_0x000f
        L_0x00f3:
            int r4 = r13 / 5
            float r9 = (float) r4
            java.lang.String r4 = "ۧۜۥ۠ۖۙۨۡۖ۠ۙ۫۟۠ۖۘۡۜ۟ۨ۫ۖ"
            goto L_0x000f
        L_0x00fa:
            r0 = r20
            int r8 = r0.f1117e
            java.lang.String r4 = "۠۬ۚۡۙۖ۟۟۬ۨۚ۫ۢۤ۠ۤۡۘۛۧ۬ۖۤۡۘۜۜۙ"
            goto L_0x000f
        L_0x0102:
            float r4 = r16 + r9
            float r7 = (float) r8
            float r7 = r7 * r10
            float r7 = r4 - r7
            java.lang.String r4 = "ۛۛ۬ۙۗۡۖۤۦۜۦۥۘۤۧۦۦۘۧۨ۬ۡ۫ۡۥۙ۠"
            goto L_0x000f
        L_0x010c:
            int r4 = r14 / 4
            float r6 = (float) r4
            java.lang.String r4 = "ۜۥۧۘۢۡ۟ۧۦۖۘ۬ۛۘۘۙۖ۬ۧۖۧۥ۠ۘ"
            goto L_0x000f
        L_0x0113:
            float r4 = (float) r8
            float r4 = r4 * r10
            float r5 = r15 - r6
            float r5 = r5 + r4
            java.lang.String r4 = "۟ۢۢۡۗۦۡ۬ۨۖۙۤ۫ۦۦۦۤۜۙۥۧ"
            goto L_0x000f
        L_0x011c:
            r0 = r20
            android.graphics.Paint r4 = r0.f1120h
            r0 = r20
            int r0 = r0.f1115c
            r17 = r0
            r0 = r17
            r4.setColor(r0)
            java.lang.String r4 = "۫ۗۙۧۡۥۨۦ۠ۨ۬ۘ۫ۥۨ۠ۢۛۡۥ۫"
            goto L_0x000f
        L_0x012f:
            r0 = r20
            int r4 = r0.f1117e
            float r4 = (float) r4
            r0 = r20
            float r0 = r0.f1119g
            r17 = r0
            float r4 = r4 * r17
            r0 = r20
            android.graphics.Paint r0 = r0.f1120h
            r17 = r0
            r0 = r21
            r1 = r17
            r0.drawCircle(r7, r5, r4, r1)
            java.lang.String r4 = "ۗۜۘۘۥۗۢۙۜۜۘۥ۟۠ۗۗۜۚۤۢۡۚۦۘ"
            goto L_0x000f
        L_0x014d:
            r0 = r20
            android.graphics.Paint r4 = r0.f1120h
            r0 = r20
            int r0 = r0.f1116d
            r17 = r0
            r0 = r17
            r4.setColor(r0)
            java.lang.String r4 = "ۖۦۨۙۥ۫ۢۤۦۤۜۧ۟ۜۧۘۤ۠ۜۘۢ۟ۥۜۚۨۘۧۙۖ"
            goto L_0x000f
        L_0x0160:
            r0 = r20
            java.lang.String r4 = r0.f1113a
            r17 = 1073741824(0x40000000, float:2.0)
            float r17 = r12 / r17
            float r17 = r7 - r17
            r0 = r20
            int r0 = r0.f1118f
            r18 = r0
            r0 = r18
            float r0 = (float) r0
            r18 = r0
            r0 = r20
            float r0 = r0.f1119g
            r19 = r0
            float r18 = r18 * r19
            r19 = 1077936128(0x40400000, float:3.0)
            float r18 = r18 / r19
            float r18 = r18 + r5
            r0 = r20
            android.graphics.Paint r0 = r0.f1120h
            r19 = r0
            r0 = r21
            r1 = r17
            r2 = r18
            r3 = r19
            r0.drawText(r4, r1, r2, r3)
            java.lang.String r4 = "ۖۨۙۜۖۘ۟ۡۢۧ۟ۨۘۥۜۧۦۙۛ"
            goto L_0x000f
        L_0x0198:
            java.lang.String r4 = "ۢ۠ۖۥ۠۬ۡ۬ۙ۟ۤۦۖۦۨۘۧۙۖۘ"
            goto L_0x000f
        L_0x019c:
            java.lang.String r4 = "ۖۨۙۜۖۘ۟ۡۢۧ۟ۨۘۥۜۧۦۙۛ"
            goto L_0x000f
        L_0x01a0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.youbasha.ui.ImageViewBadged.draw(android.graphics.Canvas):void");
    }

    public int getBadgeColor() {
        String str = "ۤۨۦۘۜۦۤۗۜۦۡۗۜۘۢۚ۠۠ۨۖۧۖۙ۠ۚ۠ۤۡۘ";
        while (true) {
            switch ((str.hashCode() ^ 248) ^ -953461434) {
                case 81948308:
                    str = "ۨۡۡۦۙۥۧۥۢۡۡۛۦۜ";
                    break;
                case 1322162249:
                    return this.f1115c;
            }
        }
    }

    public String getBadgeValue() {
        String str = "ۖۨۘۘۡۘۜۘ۬ۨۛۢ۠ۜۦۜۛ";
        while (true) {
            switch ((str.hashCode() ^ 869) ^ -1067963823) {
                case -1169699135:
                    return this.f1113a;
                case 1008899029:
                    str = "ۗۡ۬ۜۖۙ۟ۙۜۨۤۥۦۗ";
                    break;
            }
        }
    }

    public void setBadgeColor(int i2) {
        String str = "ۥۧۤۥۖ۠ۚۥۦۡۙۚۥ۠ۛۥ۬ۖۜۨ۟ۥۢ۠";
        while (true) {
            switch ((str.hashCode() ^ 405) ^ 764711716) {
                case -668243594:
                    return;
                case -136104230:
                    invalidate();
                    str = "ۥۧۖۘۤۢ۠ۘۥۨۨۨۤۜۧ۠ۦ۟";
                    break;
                case 937558658:
                    str = "ۨۧۥۡۨۥۘ۫ۗۜۘۥۚۘۡۢ۫ۨۜۨۧۨۙۛۧۥۘ";
                    break;
                case 1425853696:
                    this.f1115c = i2;
                    str = "ۚۛۤۧۨۦۘۖۚۦۤۚۗ۬ۘۘ۟۫ۧۥ۬ۡ۟ۘۚ";
                    break;
                case 1613236387:
                    str = "ۖۙۥۘ۬ۢ۟ۛۙۘۘۢ۫ۥۧۦۘۘۥ۬";
                    break;
            }
        }
    }

    public void setBadgeTextColor(int i2) {
        String str = "۬ۛۥۘۛۧ۟ۘۧ۫۠ۛۨ۠۬ۗۢۥۦ";
        while (true) {
            switch ((str.hashCode() ^ 365) ^ -2055128060) {
                case -1588768895:
                    str = "ۜۥۧ۬ۗۧۧۥۚ۟ۗۛۜۜۦۘ";
                    break;
                case -1436327309:
                    str = "ۚۤۡۘۗۙۥۘ۟ۥ۠ۦۧۨۚۥۖ";
                    break;
                case -1214255943:
                    return;
                case 981687038:
                    this.f1116d = i2;
                    str = "ۚۦ۬۟۫ۚۙ۠ۘۘۗۨۘۦۧۘۘۡۛۨۢۗ۬";
                    break;
                case 1176153237:
                    invalidate();
                    str = "ۤۢۜۘۡۧۘۘ۬ۢۨۘۚۧۨ۠ۜ۬ۦۛۘۘ";
                    break;
            }
        }
    }

    public void setBadgeValue(String str) {
        String str2 = "ۤۢۖۚۧۨۘۚۖۜۘۧۤۙۨ۬ۥۜۖۖۗۛ۫ۖۨ";
        boolean z2 = false;
        boolean z3 = false;
        while (true) {
            switch ((str2.hashCode() ^ 507) ^ -1532495191) {
                case -2006996482:
                    str2 = "ۛ۫ۨۙۘ۠ۛۡ۠ۧۗۘۘ۟ۚ۟۬ۗۘ۬ۧۦۘ";
                    z2 = false;
                    break;
                case -1884204027:
                    this.f1114b = z2;
                    str2 = "ۘۜۨۧۧۛۢۘ۠۟۟ۨۡ۟ۧۨۤۥۗۜۘۖۛۨ";
                    break;
                case -984180201:
                    this.f1113a = str;
                    str2 = "ۦۡۦۘۖۘۤ۟ۤۦۛۖۤۚۛ۫ۜ۟";
                    break;
                case -903201350:
                    str2 = "ۛ۫ۨۙۘ۠ۛۡ۠ۧۗۘۘ۟ۚ۟۬ۗۘ۬ۧۦۘ";
                    break;
                case -887844907:
                    z3 = true;
                    str2 = "ۙۡۦۘۚ۬ۙۦۚۦۖۨۘۘۧۖۘۘ";
                    break;
                case -230038508:
                    str2 = "ۤ۬ۖۜۢ۠ۨ۠ۦۤۖۘ۟۠ۨۨۜ۟";
                    z2 = z3;
                    break;
                case -49379550:
                    invalidate();
                    str2 = "ۤ۬ۖۘۜۜۦۚ۟ۖۘۖۘۙ۫۫ۡۜۘۛ۟ۡۛۘۘ";
                    break;
                case 149841141:
                    return;
                case 167928997:
                    str2 = "ۤۙۜۗۛۤۗۖ۟۬ۖۖۜۘۥۗۢ۫۠ۡۗ۟۠ۖۧۘۘ";
                    break;
                case 435485469:
                    str2 = "۫۫ۘۘۜ۫ۙۦۘۦ۟ۚۡ۟ۙۗۚۥۦۚۜۛ";
                    break;
                case 1006500386:
                    String str3 = "۫۟۫ۡ۫ۘۨۛۜۡۡۧۘۡۢۧۜۨۧۖۢۛۙۦۜۘۢۥ۬";
                    while (true) {
                        switch (str3.hashCode() ^ 1020252083) {
                            case -1039031558:
                                str3 = "ۧۛۙۖ۬ۥۘۗۜۨۘۜۢۘۘۡ۠۠ۜۙۗ";
                                break;
                            case -454531750:
                                if (str == null) {
                                    str3 = "ۙۚۘ۠ۘۢۜۦۘۘۦۛۙۧۧ۫ۥۗۤۨۜۜۤۗ۠ۚۢ۫";
                                    break;
                                } else {
                                    str3 = "ۦۨۥۘۛ۫ۤ۫ۨۜۘۗۖۧۘۥۨۤۨ۬ۤۚ۫ۜۘ۟۟ۤۛۡۥۘ";
                                    break;
                                }
                            case -27252047:
                                str2 = "ۤۡۧۙۤۦۘۧۧۡ۟ۥۨۘۛۙ۟ۘ۬ۡۥ۬ۙۥۖۢ۟۫";
                                continue;
                            case 769165475:
                                str2 = "ۧۡۖ۟ۜۘۚ۫ۨۘۛۢ۟۬ۘۛ";
                                continue;
                        }
                    }
                    break;
                case 1571591533:
                    str2 = "۫۬ۘۘۡۨۨۘ۠ۗۜۘۦۢۘۘ۫ۘۥۘۡۡۢ۫۬۬";
                    break;
            }
        }
    }
}
