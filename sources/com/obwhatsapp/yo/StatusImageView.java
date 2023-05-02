package com.obwhatsapp.yo;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.obwhatsapp.youbasha.task.utils;
import java.util.HashMap;
import rc.whatsapp.stories.value.Stories;

@SuppressLint({"AppCompatCustomView"})
public class StatusImageView extends ImageView {

    /* renamed from: a  reason: collision with root package name */
    public int f570a;

    /* renamed from: b  reason: collision with root package name */
    public int f571b;

    /* renamed from: c  reason: collision with root package name */
    public int f572c;

    /* renamed from: d  reason: collision with root package name */
    public int f573d;

    /* renamed from: e  reason: collision with root package name */
    public final RectF f574e = new RectF();

    /* renamed from: f  reason: collision with root package name */
    public final HashMap f575f = new HashMap();

    /* renamed from: g  reason: collision with root package name */
    public final float f576g = ((float) utils.dimenInDP(3));

    /* renamed from: h  reason: collision with root package name */
    public Paint f577h;

    public StatusImageView(Context context) {
        super(context);
        a();
    }

    public StatusImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }

    public StatusImageView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        a();
    }

    public final void a() {
        Paint paint = null;
        String str = "۠ۗۦۘ۟۟ۨۘ۠ۥۨۦ۟۬ۜۘۘ۠ۛۧۤۛۧ۟ۖۨ";
        while (true) {
            switch ((str.hashCode() ^ 862) ^ -1667236624) {
                case -1783890742:
                    this.f577h.setFilterBitmap(true);
                    str = "ۡۚۛۤۜۚۥۗۧۗۥۚ۫۟ۜۥۤ۠۟۫";
                    break;
                case -1477706603:
                    this.f570a = Stories.seenColor();
                    str = "ۛۛۤۘۗۥ۟ۖۧۘۡ۫ۥۘۜۚۧۖۨۨۤۜۖۤ۟ۨۘ";
                    break;
                case -701391022:
                    return;
                case -195987665:
                    this.f577h = paint;
                    str = "ۨۦۡۘۡ۟ۙ۠ۘۢۖۜۛ۫۫۬ۡۡ";
                    break;
                case 551754406:
                    this.f577h.setDither(true);
                    str = "۟ۤۥۨۨۡۗۙ۠ۛۤۨ۟ۧۦۘۚۚ۠";
                    break;
                case 692493780:
                    str = "ۡۦۧۘۘ۫ۡۘۨۚۜۡۥۥۘ۬ۜۗ";
                    break;
                case 779316706:
                    paint = new Paint();
                    str = "ۚۗۦۖ۬۟ۦۢۚ۬ۢ۬ۥۙۚۜۚۨۘ۬۠ۛ۟ۧۥۛۘۦۘ";
                    break;
                case 1330164648:
                    yo.getResColor("contactStatusThumbnailRingBackground");
                    str = "ۧۦۡۘۡۛۜۜۛۜ۫ۢۢۙۨۘۘۥۡۛۘۡ۟ۢۚۧۧۤۧ";
                    break;
                case 1788435451:
                    this.f572c = Stories.unseenColor();
                    str = "ۗۗۧ۠ۧۥۜۨۚۨۗۥۨۙۜ";
                    break;
                case 1998821877:
                    paint.setAntiAlias(true);
                    str = "۫ۥۦۘۥۢۥۦۤۘ۬ۢۗۤۨۢۗۚۥۘۗ۟ۖ۫ۦۨۘ";
                    break;
            }
        }
    }

    public int getTotalCount() {
        String str = "ۘ۠۟ۥۦۦۘۙۙ۫ۦۗۧۚۜ۫ۥۤ۟ۚ۟۠ۘۖۗ";
        while (true) {
            switch ((str.hashCode() ^ 859) ^ -691123086) {
                case -2069481789:
                    str = "ۛۡۘۤۛۜ۟ۧۨۗۜۥۙ۠ۘۖۜۜۘۤۚۡ";
                    break;
                case 1891228354:
                    return this.f571b;
            }
        }
    }

    public void onDraw(Canvas canvas) {
        String str = "ۧ۟ۜۡۜۦ۟ۡۜۥۚۖۘۙۚۙ۫۟ۛ";
        while (true) {
            switch ((str.hashCode() ^ 183) ^ -1234427702) {
                case -1590214396:
                    str = "۫ۡۘۘۚۢۖۘۙ۬ۨۗۡۘۘ۫ۗۤ";
                    break;
                case -1468640034:
                    return;
                case -76225168:
                    super.onDraw(canvas);
                    str = "۟ۚۘۚ۬ۥۘۘۜۦۘۧۨ۬۟ۚۢۗۚۤۖ۠ۡۦ۫ۦ۬ۨۖ";
                    break;
                case 333334500:
                    str = "ۚۦۖۗۚ۟ۘۙۥۘۢۘ۠۟۠ۦۘۧۢۤ۫ۥۡۘۜۦ۠ۖۘ";
                    break;
                case 682996776:
                    onDrawBorder(canvas);
                    str = "ۥۜۢۧۧۛۢۡۘۘ۠ۜۗ۟ۤۗۢۙۥۜۚۤۖۗۖۘۚ۬۠";
                    break;
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x01b7, code lost:
        r2 = "ۡۚ۬ۨ۟ۚۖۙۖۘۖۨ۬۟ۦۘۙ۟ۡۘۦۤۢۗۛۜۧۥۢ";
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onDrawBorder(android.graphics.Canvas r34) {
        /*
            r33 = this;
            r32 = 0
            r31 = 0
            r30 = 0
            r29 = 0
            r3 = 0
            r28 = 0
            r27 = 0
            r26 = 0
            r25 = 0
            r24 = 0
            r23 = 0
            r22 = 0
            r20 = 0
            r21 = 0
            r17 = 0
            r19 = 0
            r15 = 0
            r14 = 0
            r13 = 0
            r7 = 0
            r6 = 0
            r12 = 0
            r5 = 0
            r4 = 0
            r16 = 0
            r18 = 0
            java.lang.String r2 = "ۛۘۙۙۧۛۜ۟ۖۧ۠۬ۦۖۚۚۛۡۘۧۘۘۘ"
            r8 = r4
            r9 = r5
            r10 = r6
            r11 = r7
        L_0x0031:
            int r4 = r2.hashCode()
            r5 = 232(0xe8, float:3.25E-43)
            r6 = 343031181(0x14723d8d, float:1.22300165E-26)
            r4 = r4 ^ r5
            r4 = r4 ^ r6
            switch(r4) {
                case -2135483278: goto L_0x021e;
                case -2106422632: goto L_0x025c;
                case -2102960126: goto L_0x02b0;
                case -1654064794: goto L_0x027e;
                case -1648986029: goto L_0x024e;
                case -1638392051: goto L_0x0261;
                case -1571157503: goto L_0x0219;
                case -1554776248: goto L_0x009a;
                case -1513953283: goto L_0x00fb;
                case -1507177901: goto L_0x0046;
                case -1501741531: goto L_0x00c3;
                case -1399407966: goto L_0x0043;
                case -1317805885: goto L_0x0163;
                case -1045508847: goto L_0x0082;
                case -825023752: goto L_0x00b6;
                case -801133435: goto L_0x00f1;
                case -798823705: goto L_0x0040;
                case -792032830: goto L_0x01a3;
                case -779494098: goto L_0x00ae;
                case -688535336: goto L_0x0108;
                case -572841132: goto L_0x00cd;
                case -570474036: goto L_0x028c;
                case -297241739: goto L_0x012c;
                case -291520356: goto L_0x0197;
                case -199827344: goto L_0x02a0;
                case -178555378: goto L_0x0245;
                case -152293635: goto L_0x019d;
                case -82605803: goto L_0x00d8;
                case 10818819: goto L_0x00a4;
                case 128267422: goto L_0x0169;
                case 143776184: goto L_0x01d0;
                case 215444699: goto L_0x016f;
                case 281867239: goto L_0x01e2;
                case 346779336: goto L_0x0155;
                case 563279184: goto L_0x01a9;
                case 637405057: goto L_0x008e;
                case 734254351: goto L_0x029c;
                case 744046828: goto L_0x00e4;
                case 771595119: goto L_0x01d9;
                case 794466247: goto L_0x017c;
                case 893996073: goto L_0x0191;
                case 970048724: goto L_0x0292;
                case 1151173931: goto L_0x006f;
                case 1203427103: goto L_0x0078;
                case 1209154507: goto L_0x0268;
                case 1297657863: goto L_0x0253;
                case 1555275647: goto L_0x02ac;
                case 1619162253: goto L_0x015b;
                case 1677380001: goto L_0x0182;
                case 1822037326: goto L_0x0175;
                case 1951630098: goto L_0x0285;
                case 1960965686: goto L_0x02a4;
                case 1961527193: goto L_0x014d;
                case 2057196934: goto L_0x0066;
                case 2100904425: goto L_0x0207;
                case 2104583538: goto L_0x02ac;
                default: goto L_0x003f;
            }
        L_0x003f:
            goto L_0x0031
        L_0x0040:
            java.lang.String r2 = "ۙۖۧۦۛۖۛۡۘۜ۟ۖۘ۠ۜۘۖۨ۫ۦۙۡۘ"
            goto L_0x0031
        L_0x0043:
            java.lang.String r2 = "ۖۖۗۡۢۧۡۚۨۘۙۡ۠ۘۦۨ۫۟ۤ"
            goto L_0x0031
        L_0x0046:
            r4 = 1394251349(0x531a9655, float:6.6394712E11)
            java.lang.String r2 = "ۦۢۨۘۤۥۦۘۙ۠۟ۙۤۡۘۜ۫۠۬۠ۢۛ۟۫ۤۨۙۦۢۖۘ"
        L_0x004b:
            int r5 = r2.hashCode()
            r5 = r5 ^ r4
            switch(r5) {
                case -16859599: goto L_0x005a;
                case 174921152: goto L_0x0054;
                case 967182541: goto L_0x0063;
                case 1892471870: goto L_0x01b7;
                default: goto L_0x0053;
            }
        L_0x0053:
            goto L_0x004b
        L_0x0054:
            java.lang.String r2 = "ۚۡۥ۫ۙ۠ۧۨۡۘۚۢۡۘۥۛۦۨۨۘ۠ۖۜۥ۟ۥ"
            goto L_0x004b
        L_0x0057:
            java.lang.String r2 = "۟۬ۛ۬ۘۡۥ۠۠ۙ۬ۥۘۢۚ۬ۢۙۘۢۡۨۤۜۛ"
            goto L_0x004b
        L_0x005a:
            r0 = r33
            int r2 = r0.f571b
            if (r2 <= 0) goto L_0x0057
            java.lang.String r2 = "ۦۨۥۘۗۚۛۦ۫ۖۙۤۜۘۤ۫ۡۘۘ۫ۛ"
            goto L_0x004b
        L_0x0063:
            java.lang.String r2 = "ۤۜۜۢۥۥۨۤۡۖۙۖۘۖۜ۟ۨ۠ۧۜۜۥ"
            goto L_0x0031
        L_0x0066:
            r0 = r33
            android.graphics.Paint r4 = r0.f577h
            java.lang.String r2 = "ۦۡۜۘۥۘۤۦ۬۫۬۟ۧ۠ۙ۬ۗۦۘ۬۠ۡ"
            r32 = r4
            goto L_0x0031
        L_0x006f:
            r0 = r33
            float r4 = r0.f576g
            java.lang.String r2 = "ۧۖۥۛۨۡۛ۬ۙۙۡۜ۫ۢۡ۠ۛۡۧ۟ۜۘ"
            r31 = r4
            goto L_0x0031
        L_0x0078:
            r0 = r32
            r1 = r31
            r0.setStrokeWidth(r1)
            java.lang.String r2 = "ۛۗۥۘۛ۟ۥۘۨۜۜۡۖۖۨۤۡۘۜۤ۫ۧۜۡۘۧۢ۬"
            goto L_0x0031
        L_0x0082:
            r0 = r33
            android.graphics.Paint r2 = r0.f577h
            android.graphics.Paint$Style r4 = android.graphics.Paint.Style.STROKE
            r2.setStyle(r4)
            java.lang.String r2 = "ۨ۬ۦۘۘۢۨۘۧۚۘۘۚۗۤۤۖۨ۠۫ۡ"
            goto L_0x0031
        L_0x008e:
            r0 = r33
            android.graphics.Paint r2 = r0.f577h
            android.graphics.Paint$Cap r4 = android.graphics.Paint.Cap.ROUND
            r2.setStrokeCap(r4)
            java.lang.String r2 = "ۗ۫ۡۘۗۦۥۢۙۥۛۙۛۨۚۛۗۧ۠ۖۦۜۗۙۚ"
            goto L_0x0031
        L_0x009a:
            int r2 = r33.getWidth()
            float r4 = (float) r2
            java.lang.String r2 = "۠ۤ۠ۦۨۦۘۗۤۥۘ۫ۖۚ۬ۨۨ۟ۖۨۦۨ"
            r30 = r4
            goto L_0x0031
        L_0x00a4:
            int r2 = r33.getHeight()
            float r4 = (float) r2
            java.lang.String r2 = "ۢۚۧۥۙۧۡۦ۫ۜۦۘۘۧ۟ۜۘۙ۠ۡۜۢۤ۬ۜۡۘ"
            r29 = r4
            goto L_0x0031
        L_0x00ae:
            r0 = r33
            android.graphics.RectF r3 = r0.f574e
            java.lang.String r2 = "۠ۡۙۙۤ۟ۙۧ۟ۨۜۡۘۚۢۗ۟ۗۨۘۤۜۢۤۗ۬ۖۛۨ"
            goto L_0x0031
        L_0x00b6:
            r2 = 0
            r4 = 0
            r0 = r30
            r1 = r29
            r3.set(r2, r4, r0, r1)
            java.lang.String r2 = "ۡۦۗۧۢۜۘۡ۫ۜۘۙۢۥۘۚۜۨۢۙۜ۠۟ۗۚۡ۬ۛ۠ۜ"
            goto L_0x0031
        L_0x00c3:
            r2 = 1073741824(0x40000000, float:2.0)
            float r4 = r31 / r2
            java.lang.String r2 = "ۡۛۚۢ۠۬ۥۘ۟ۦۖۘۘ۬ۖۦۦ۫ۤ"
            r28 = r4
            goto L_0x0031
        L_0x00cd:
            r0 = r28
            r1 = r28
            r3.inset(r0, r1)
            java.lang.String r2 = "۬۟ۖۡۛۢ۬ۡۡۥۗۦۘۧۛۧۦۡۡۘۦۚۖۘ"
            goto L_0x0031
        L_0x00d8:
            r0 = r33
            android.graphics.Paint r2 = r0.f577h
            r4 = 0
            r2.setColor(r4)
            java.lang.String r2 = "ۗ۠۫۬ۗۥۘۜۛۤۜ۟ۜۘۙۧۦۘ۟ۦۛۙ"
            goto L_0x0031
        L_0x00e4:
            r0 = r33
            android.graphics.Paint r2 = r0.f577h
            r0 = r34
            r0.drawOval(r3, r2)
            java.lang.String r2 = "ۢۥ۫ۛ۟ۜۘۤۗ۟ۘ۟ۨۘۨۘۜۘۙۖۜۘ"
            goto L_0x0031
        L_0x00f1:
            r0 = r33
            int r4 = r0.f571b
            java.lang.String r2 = "ۤ۟ۨۗ۬ۤۨۚۨۧۖۨۘۨۨۨۧۨۥۜ۬ۗ"
            r27 = r4
            goto L_0x0031
        L_0x00fb:
            r2 = 1135869952(0x43b40000, float:360.0)
            r0 = r27
            float r4 = (float) r0
            float r4 = r2 / r4
            java.lang.String r2 = "ۢۙۙۢ۬ۚۦ۬۫۟۫۬ۜ۟ۦۘۛ۫ۢۗۖۦۧۙۗ۫ۤۨ"
            r26 = r4
            goto L_0x0031
        L_0x0108:
            r4 = 2061424979(0x7aded953, float:5.785489E35)
            java.lang.String r2 = "ۚ۠ۚۚۧۧۡۖۡ۠ۚۖۖۧۦۘ۠ۛۖۘ۠ۗۙ"
        L_0x010d:
            int r5 = r2.hashCode()
            r5 = r5 ^ r4
            switch(r5) {
                case -2086417281: goto L_0x011d;
                case -1639040569: goto L_0x0116;
                case 391226344: goto L_0x0125;
                case 2070355308: goto L_0x0128;
                default: goto L_0x0115;
            }
        L_0x0115:
            goto L_0x010d
        L_0x0116:
            java.lang.String r2 = "ۘۛ۬ۖۛۖۘ۫ۧ۟ۜ۬ۦۙۚۨۘۢۡ۟ۨۧ"
            goto L_0x0031
        L_0x011a:
            java.lang.String r2 = "۠۫ۨۖۡ۬ۥۦۥۘۚۙۦۗۜ"
            goto L_0x010d
        L_0x011d:
            r2 = 1
            r0 = r27
            if (r0 == r2) goto L_0x011a
            java.lang.String r2 = "ۥۙۧۙۦۘۘ۬ۚ۟۫ۜۘۚۢۦۗۦ۟ۙۨۘۥۢۙ"
            goto L_0x010d
        L_0x0125:
            java.lang.String r2 = "ۥۚۨۘۚۘۗۨۨۘۘۜۗۡ۠ۚ۠ۥۜۤۡۧۘۘ"
            goto L_0x010d
        L_0x0128:
            java.lang.String r2 = "ۢۥۦۘۡ۠ۥ۠ۤۗ۬ۨۦۘۨۜۗۤ۟ۤۨۨۦ"
            goto L_0x0031
        L_0x012c:
            r4 = 247962259(0xec79a93, float:4.9206137E-30)
            java.lang.String r2 = "ۚۦۜۘ۟ۡۘۢ۬ۛۗۘۤۧ۬۫ۚۥۗۙۙۛۢۥ۟۬ۜ۟"
        L_0x0131:
            int r5 = r2.hashCode()
            r5 = r5 ^ r4
            switch(r5) {
                case -1462124801: goto L_0x0149;
                case 1341791251: goto L_0x013a;
                case 1566147739: goto L_0x0140;
                case 1986795725: goto L_0x0298;
                default: goto L_0x0139;
            }
        L_0x0139:
            goto L_0x0131
        L_0x013a:
            java.lang.String r2 = "۟ۥۛۖۢۛۘۡۤۘۘۖۜۡ۫۬ۖۧ"
            goto L_0x0131
        L_0x013d:
            java.lang.String r2 = "۫۠ۦ۟۠ۦۖ۠ۛۘۦۗۧۦۘۘۙۦۨۘۨۧۥ"
            goto L_0x0131
        L_0x0140:
            r2 = 1103101952(0x41c00000, float:24.0)
            int r2 = (r26 > r2 ? 1 : (r26 == r2 ? 0 : -1))
            if (r2 > 0) goto L_0x013d
            java.lang.String r2 = "ۘۚۤ۬ۤۖ۠ۡۢۜ۟ۛۜۥۜ"
            goto L_0x0131
        L_0x0149:
            java.lang.String r2 = "ۛ۟ۥۘۙ۠ۨ۬ۥۡۘۨۛۢ۫ۡۚۨۡۘۘ۠ۢۜۘۤ۬ۤۦۘۤ"
            goto L_0x0031
        L_0x014d:
            r2 = 1073741824(0x40000000, float:2.0)
            float r25 = r26 / r2
            java.lang.String r2 = "ۨ۟ۜ۟ۙۥۘۙ۠ۦۥۗۙۧۘۘ"
            goto L_0x0031
        L_0x0155:
            java.lang.String r2 = "ۚ۟ۥۘۨ۟ۥۢ۠۠ۡۡۤۧۚۥۙۡۡۘۛۡۖۘ۠ۙۤ"
            r23 = r25
            goto L_0x0031
        L_0x015b:
            r4 = 1094713344(0x41400000, float:12.0)
            java.lang.String r2 = "ۛۦۖۘۤۨۡۘۧۜۙ۟۟ۗۜ۟ۦۘۧۥۧۦۡۦۘ"
            r24 = r4
            goto L_0x0031
        L_0x0163:
            java.lang.String r2 = "ۢ۫ۘۘۨۚۤ۫ۧۖۧۥۧۘۨۥۘ"
            r23 = r24
            goto L_0x0031
        L_0x0169:
            java.lang.String r2 = "ۘۛۥۘۚۜ۟۬ۤ۫۫ۙۦ۟ۡ۬"
            r22 = r23
            goto L_0x0031
        L_0x016f:
            java.lang.String r2 = "۟ۗۗOۚ۫ۨ۬ۢ۠ۢۘۦۗ۬ۥۘ"
            r21 = r22
            goto L_0x0031
        L_0x0175:
            r4 = 0
            java.lang.String r2 = "ۖۛ۠ۢۗۧۤ۬ۚۡۦۧۨۛۜ"
            r20 = r4
            goto L_0x0031
        L_0x017c:
            java.lang.String r2 = "۬ۡۘۤۤۡۜۤۥۘۤۧۦ۟ۤۥۦۚۨۘۛۙۗۙۗۖۗ۟ۥ"
            r21 = r20
            goto L_0x0031
        L_0x0182:
            r0 = r33
            android.graphics.Paint r2 = r0.f577h
            r4 = 1065353216(0x3f800000, float:1.0)
            float r4 = r31 - r4
            r2.setStrokeWidth(r4)
            java.lang.String r2 = "ۖۙۖۘۨ۫۬ۙ۫ۦ۫ۘۙۨ"
            goto L_0x0031
        L_0x0191:
            r17 = -1028390912(0xffffffffc2b40000, float:-90.0)
            java.lang.String r2 = "ۥۤۥۘۗۛۚۛۥۜۨۘۚۦۧۘۤۦۜۘ"
            goto L_0x0031
        L_0x0197:
            r19 = 0
            java.lang.String r2 = "ۛ۠۟ۙۜ۠ۨۨۡۘۢۗ۫ۙۜۨۥۜۘ"
            goto L_0x0031
        L_0x019d:
            java.lang.String r2 = "ۡۢۤۙۧۜۘۧۢۥۚۦ۠ۧۦۧۘ"
            r18 = r19
            goto L_0x0031
        L_0x01a3:
            java.lang.String r2 = "۫ۚۖ۟۠۠ۢۦۧۗۥۡۙ۫ۘۖۥۖۘۧۢۥۥ۟ۘۦۦۦۘ"
            r16 = r17
            goto L_0x0031
        L_0x01a9:
            r4 = -529359150(0xffffffffe0729ed2, float:-6.9930567E19)
            java.lang.String r2 = "ۥۘۙۦۖۢ۠ۚۜ۟ۨۡۨۡۙۗۨۥۘ۫۫ۚۖۡۙ"
        L_0x01ae:
            int r5 = r2.hashCode()
            r5 = r5 ^ r4
            switch(r5) {
                case 68186474: goto L_0x01c9;
                case 569635940: goto L_0x01be;
                case 758880872: goto L_0x01b7;
                case 1876137361: goto L_0x01cc;
                default: goto L_0x01b6;
            }
        L_0x01b6:
            goto L_0x01ae
        L_0x01b7:
            java.lang.String r2 = "ۡۚ۬ۨ۟ۚۖۙۖۘۖۨ۬۟ۦۘۙ۟ۡۘۦۤۢۗۛۜۧۥۢ"
            goto L_0x0031
        L_0x01bb:
            java.lang.String r2 = "۬۠ۙۙ۫ۤۖۚۥۘ۬ۤ۫ۨۚۧۧ۬ۦۤۧۘۘۖ۟ۦۙ"
            goto L_0x01ae
        L_0x01be:
            r0 = r33
            int r2 = r0.f571b
            r0 = r18
            if (r0 >= r2) goto L_0x01bb
            java.lang.String r2 = "ۛۖۖۙۢۘۨۦ۠ۖۛ۫ۗۡۘۙۘۨۤۧۖۘ"
            goto L_0x01ae
        L_0x01c9:
            java.lang.String r2 = "ۧۖۘۘۧۖۡۘ۬ۛ۬۠ۧۨۘۡۚ۬ۤۥۜۘۡۚ۟ۚۦۤ"
            goto L_0x01ae
        L_0x01cc:
            java.lang.String r2 = "ۛۥۦۥۙۦۘ۟ۢ۟ۦۢۜۡۘ"
            goto L_0x0031
        L_0x01d0:
            r0 = r33
            android.graphics.Paint r4 = r0.f577h
            java.lang.String r2 = "ۦ۠ۢۘۤۥۘۘۜ۬۟ۚۗۚۛ۬ۧۗۛۨۧۤ"
            r15 = r4
            goto L_0x0031
        L_0x01d9:
            r0 = r33
            java.util.HashMap r4 = r0.f575f
            java.lang.String r2 = "۫۫ۤۢۤۥۘۥۨۡۜۨۘۘ۠ۚۦۛۜۘۨ۬ۢ"
            r14 = r4
            goto L_0x0031
        L_0x01e2:
            r4 = 1932078767(0x73292eaf, float:1.3404007E31)
            java.lang.String r2 = "ۙۢۘۘۨۡۥۜۖۘۤۚۨۘۧۘ۫ۧ۠"
        L_0x01e7:
            int r5 = r2.hashCode()
            r5 = r5 ^ r4
            switch(r5) {
                case -209772897: goto L_0x0203;
                case 500355291: goto L_0x0200;
                case 896971899: goto L_0x02a8;
                case 1982610237: goto L_0x01f0;
                default: goto L_0x01ef;
            }
        L_0x01ef:
            goto L_0x01e7
        L_0x01f0:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r18)
            boolean r2 = r14.containsKey(r2)
            if (r2 == 0) goto L_0x01fd
            java.lang.String r2 = "ۥۖۨۘ۟ۢۛۡ۟ۚۧۜۢۡۖۙۘۧۘۜۛ۠"
            goto L_0x01e7
        L_0x01fd:
            java.lang.String r2 = "۬ۛۦۥۤۤۗۤۜۘۨ۬۬ۙۨ۠۟ۥ۫ۧۖ"
            goto L_0x01e7
        L_0x0200:
            java.lang.String r2 = "ۥۥۦۥۧۨۚۢۤۙۦۙۡۦۛۖۡۛۢ۟ۘۗۤۛ۬۟"
            goto L_0x01e7
        L_0x0203:
            java.lang.String r2 = "ۦ۬ۧ۫ۖۜ۠ۨۧۥۖ۫ۙۘۘۘۢۦۧ۟۬ۛۤۦۘۗۢ"
            goto L_0x0031
        L_0x0207:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r18)
            java.lang.Object r2 = r14.get(r2)
            java.lang.Number r2 = (java.lang.Number) r2
            int r13 = r2.intValue()
            java.lang.String r2 = "۬ۨۘۛ۟ۦۘۖۚۙۘۢۨۜ۠ۖۘۙۗۜۗۦۘۘۚ۠ۦۘ"
            goto L_0x0031
        L_0x0219:
            java.lang.String r2 = "۫ۙۘۘۥۡۦۘۜۤۧۥۤۧۖ۫"
            r12 = r13
            goto L_0x0031
        L_0x021e:
            r4 = 1407955543(0x53ebb257, float:2.02461872E12)
            java.lang.String r2 = "ۙۘۜۚۗ۬ۗۙۥۘۥۗۖۘۡ۟ۘۧۛۡۘۦۧۨۚۥۨۦۛۘۘ"
        L_0x0223:
            int r5 = r2.hashCode()
            r5 = r5 ^ r4
            switch(r5) {
                case -1348430779: goto L_0x0241;
                case -420213982: goto L_0x0233;
                case 205881820: goto L_0x023e;
                case 809757361: goto L_0x022c;
                default: goto L_0x022b;
            }
        L_0x022b:
            goto L_0x0223
        L_0x022c:
            java.lang.String r2 = "ۖۤۡۘۧۚۨۢۡۗ۠ۢ۠ۚ۬ۚ۟ۖ۬ۗۖ"
            goto L_0x0031
        L_0x0230:
            java.lang.String r2 = "۟ۛۥ۠ۜۦ۬ۧۡۘۘۢۡۛۖۗۚۙۛ۠ۚۤ"
            goto L_0x0223
        L_0x0233:
            r0 = r33
            int r2 = r0.f573d
            r0 = r18
            if (r0 >= r2) goto L_0x0230
            java.lang.String r2 = "ۛۤۜۘۗۥۙۙۦۜۘۗ۬ۦۘۥ۟ۛ"
            goto L_0x0223
        L_0x023e:
            java.lang.String r2 = "ۗۤۛۗۧۛۘۤۡۘۢۤ۬۟ۚۡۘۧۛۖۘۙۙۤ"
            goto L_0x0223
        L_0x0241:
            java.lang.String r2 = "ۡۡۙ۬ۨۢ۟ۧۖۛۨۙ۟ۖۧۨۡ۫ۛۢۙۢۨۘۘ"
            goto L_0x0031
        L_0x0245:
            r0 = r33
            int r4 = r0.f572c
            java.lang.String r2 = "ۚۗۛ۬ۗۤ۟ۙۥۘ۬ۖۛۜ۠ۖۘ۠۟ۤ"
            r11 = r4
            goto L_0x0031
        L_0x024e:
            java.lang.String r2 = "ۧۙۧۦۖۜۢۤۨۘۨۢۡۘۗۘۜۘ"
            r12 = r11
            goto L_0x0031
        L_0x0253:
            r0 = r33
            int r4 = r0.f570a
            java.lang.String r2 = "ۡۤۜۘۘۚۙۨۨۢۙ۠ۦ۠ۗۦۗ۬ۖۘ۬ۘ"
            r10 = r4
            goto L_0x0031
        L_0x025c:
            java.lang.String r2 = "ۡۧۚ۫۫ۤۚۛۡۘۢ۟۠ۜ۟ۚۘ۫ۢۖۖۢۧۛ۫"
            r12 = r10
            goto L_0x0031
        L_0x0261:
            r15.setColor(r12)
            java.lang.String r2 = "ۘۚۗ۠ۧۖۘ۬۬ۥۘۖۨۛۦۚۚ"
            goto L_0x0031
        L_0x0268:
            r2 = 1073741824(0x40000000, float:2.0)
            float r2 = r21 / r2
            float r4 = r2 + r16
            float r5 = r26 - r21
            r6 = 0
            r0 = r33
            android.graphics.Paint r7 = r0.f577h
            r2 = r34
            r2.drawArc(r3, r4, r5, r6, r7)
            java.lang.String r2 = "ۢۜ۟ۙۘۘ۟ۤۥۜۤۘۘۛۡۜۘ۠ۦۙۜۨۙ۠ۛ۬ۤ"
            goto L_0x0031
        L_0x027e:
            float r4 = r16 + r26
            java.lang.String r2 = "۫ۖۤۡ۠ۛ۟۟۫ۨۚۦۘ۫۟ۚ۫ۖۦۘ"
            r9 = r4
            goto L_0x0031
        L_0x0285:
            int r4 = r18 + 1
            java.lang.String r2 = "ۗ۫ۖۘۧۨ۫۫ۛۢۖۘۜۘۥۥۥ"
            r8 = r4
            goto L_0x0031
        L_0x028c:
            java.lang.String r2 = "۬ۡۡۘۜۢ۠ۛۖۥۢۜۚۥۗۥۥۛۖۨ۬ۨۥۥۤ"
            r16 = r9
            goto L_0x0031
        L_0x0292:
            java.lang.String r2 = "ۙۜۤۡۖۖۘۢ۠۫۠۠ۡۘۜۧۡ۫۫ۥۗ۠ۗ"
            r18 = r8
            goto L_0x0031
        L_0x0298:
            java.lang.String r2 = "۟ۧۨۚۨۛۢۢۨۚۘ۬ۙۥۡۘۨۚۜۥۤۡۘ۬ۜۢ"
            goto L_0x0031
        L_0x029c:
            java.lang.String r2 = "ۢ۫ۘۘۨۚۤ۫ۧۖۧۥۧۘۨۥۘ"
            goto L_0x0031
        L_0x02a0:
            java.lang.String r2 = "۬ۡۘۤۤۡۜۤۥۘۤۧۦ۟ۤۥۦۚۨۘۛۙۗۙۗۖۗ۟ۥ"
            goto L_0x0031
        L_0x02a4:
            java.lang.String r2 = "۫ۚۖ۟۠۠ۢۦۧۗۥۡۙ۫ۘۖۥۖۘۧۢۥۥ۟ۘۦۦۦۘ"
            goto L_0x0031
        L_0x02a8:
            java.lang.String r2 = "۟ۜۨۘۜۦۦۘ۬ۗۙۢۥۗ۟ۧ۟ۖۗ۠"
            goto L_0x0031
        L_0x02ac:
            java.lang.String r2 = "ۡۧۚ۫۫ۤۚۛۡۘۢ۟۠ۜ۟ۚۘ۫ۢۖۖۢۧۛ۫"
            goto L_0x0031
        L_0x02b0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.yo.StatusImageView.onDrawBorder(android.graphics.Canvas):void");
    }

    public void seen(int i2) {
        String str = "ۧ۬۫ۘ۟ۙ۬۠ۢ۟ۥۦ۠۬ۨۜۢۖۘ";
        while (true) {
            switch ((str.hashCode() ^ 432) ^ -530317746) {
                case -1584150794:
                    this.f570a = i2;
                    str = "ۜ۠ۨ۫ۨۤۚۖ۠۟ۛۜۦۘۢ";
                    break;
                case -524164785:
                    invalidate();
                    str = "ۥ۠ۢ۟ۜۥۧۘ۠ۧۜ۟ۙۦۡۘ";
                    break;
                case 293908216:
                    str = "ۚۘۥۜۡۥۘۚۛۜۘۧۖۥۘۧۙۚۜۧۘۘۨۤۙ";
                    break;
                case 438872318:
                    return;
                case 1735796662:
                    str = "ۧۥۧۢۨۦۘۚۤۜۘۚۡۢۧۡۜۘ۫ۧ۟ۨۢۜۘ۠ۙۘۘ";
                    break;
            }
        }
    }

    public void setInfo(int i2, int i3) {
        String str = "ۙۙ۫ۘۤ۬ۥ۟ۨۡۧ۠ۦۧۧۗ۫ۜۥۛ۫ۗ۠ۘۢ۟ۜ";
        while (true) {
            switch ((str.hashCode() ^ 92) ^ 2065719478) {
                case -1567830132:
                    invalidate();
                    str = "ۘ۠ۨۘۚۗۖۘۡ۟۫ۘۛۧ۫ۖۘ";
                    break;
                case -1550895341:
                    this.f573d = i2;
                    str = "ۚۥۘۘۛۜۖۘ۬ۨۡۘ۫ۡۜۘۛۗ۟ۙۤۡۗۚۖۘۛۢۨ";
                    break;
                case 397350844:
                    this.f571b = i3;
                    str = "ۧۚۙۚۜ۠ۡۖۦ۬ۥۘۘۤۜۜۘ";
                    break;
                case 547998453:
                    return;
                case 960126959:
                    str = "ۤۦۘ۟ۘ۬ۢۦۘۗ۬ۜۖۥۚۛۙۜۥۡ۟ۛ۬۫ۖۢ۫";
                    break;
                case 1620645928:
                    str = "۟۠ۦۘۗۥۦۘۥۘۗ۟ۧۦۘۖۚۛۥۘ۫ۢۜ۫";
                    break;
                case 1718445775:
                    str = "ۥ۬ۖۚ۫ۤۖۡۘۛۡۖۘۦ۬ۨۨۢۧۥۨۘ";
                    break;
            }
        }
    }

    public void unseen(int i2) {
        String str = "ۨۖۨۦۦۘ۟ۖۥۤۢ۫ۗۗۨۘۗۗۥۘ";
        while (true) {
            switch ((str.hashCode() ^ 407) ^ 245635577) {
                case -1755811399:
                    invalidate();
                    str = "ۢۚۢۡۥۖۧ۫ۚۗۤۘۘۢۖ۟ۥۙۡۘۢۤۙۜۗۗۛۦ۬";
                    break;
                case -1108053746:
                    str = "ۗۙۖۚۗۥۧۢۨۘۥ۟ۜۢۚۤ";
                    break;
                case -999447383:
                    this.f572c = i2;
                    str = "ۗ۟ۥۙۘۨۘ۠ۥۥ۠ۜۙۘ۬ۛ۟۫ۗۤ";
                    break;
                case -941771481:
                    str = "ۛۢۖۖۥۘۖۦۦۘۗۚۛۚۘۡ";
                    break;
                case 168856047:
                    return;
            }
        }
    }
}
