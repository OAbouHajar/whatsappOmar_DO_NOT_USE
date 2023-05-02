package com.obwhatsapp.youbasha.ui.views;

import android.view.animation.LinearInterpolator;
import android.widget.OverScroller;
import com.obwhatsapp.yo.g;

public final class v implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final OverScroller f1517a;

    /* renamed from: b  reason: collision with root package name */
    public final w f1518b;

    /* renamed from: c  reason: collision with root package name */
    public final g f1519c;

    /* renamed from: d  reason: collision with root package name */
    public final long f1520d;

    /* renamed from: e  reason: collision with root package name */
    public final YoSwipeableConvRow f1521e;

    public v(YoSwipeableConvRow yoSwipeableConvRow, w wVar, g gVar, long j2) {
        this.f1521e = yoSwipeableConvRow;
        this.f1517a = new OverScroller(yoSwipeableConvRow.getContext(), new LinearInterpolator());
        this.f1518b = wVar;
        this.f1519c = gVar;
        this.f1520d = j2;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r12 = this;
            r8 = 0
            r3 = 0
            java.lang.String r0 = "ۚۡۨۘۙ۟ۨ۠۫ۨۗۖۘۘۧۛۖۘ۟۬ۡۘ"
            r1 = r0
            r2 = r3
            r4 = r3
            r5 = r3
            r6 = r3
            r7 = r8
            r9 = r8
            r10 = r3
        L_0x000c:
            int r0 = r1.hashCode()
            r3 = 931(0x3a3, float:1.305E-42)
            r11 = 1750633922(0x68588dc2, float:4.0905845E24)
            r0 = r0 ^ r3
            r0 = r0 ^ r11
            switch(r0) {
                case -1728831517: goto L_0x0108;
                case -1709853622: goto L_0x001b;
                case -1666579529: goto L_0x0108;
                case -1203009755: goto L_0x002f;
                case -1064498030: goto L_0x0072;
                case -794855226: goto L_0x00c6;
                case -374098937: goto L_0x010d;
                case -371864328: goto L_0x00bf;
                case -235696848: goto L_0x00eb;
                case -38985279: goto L_0x00b8;
                case 68021295: goto L_0x0055;
                case 161752075: goto L_0x003f;
                case 267523230: goto L_0x004e;
                case 273722349: goto L_0x00f2;
                case 543733962: goto L_0x0091;
                case 836815646: goto L_0x0026;
                case 908502883: goto L_0x0038;
                case 1033731330: goto L_0x0045;
                case 1174885129: goto L_0x00fa;
                case 1190283748: goto L_0x0089;
                case 1309782405: goto L_0x00af;
                case 1424946149: goto L_0x001f;
                case 1731317403: goto L_0x0082;
                case 1794886668: goto L_0x007b;
                default: goto L_0x001a;
            }
        L_0x001a:
            goto L_0x000c
        L_0x001b:
            java.lang.String r0 = "۬ۢۧۧۤۘۙۤۧۖۢۨۘۡ۬۬ۜۚ۟۠ۘ۠ۖ۟ۧ"
            r1 = r0
            goto L_0x000c
        L_0x001f:
            android.widget.OverScroller r3 = r12.f1517a
            java.lang.String r0 = "ۦۥۦۘ۬۠۠ۢ۬ۨۘۤۡۡ۬۟ۜۘۘ۟ۡۘۧۤۜۜۧ۟ۧۖ۟"
            r1 = r0
            r10 = r3
            goto L_0x000c
        L_0x0026:
            boolean r3 = r10.computeScrollOffset()
            java.lang.String r0 = "ۙۖۛۨۥۥۧۗۦۘۧۘۖۘۤۜۢۙۤۧۤۗۢ۫ۙۧۙۢۘۘ"
            r1 = r0
            r9 = r3
            goto L_0x000c
        L_0x002f:
            int r3 = r10.getCurrX()
            java.lang.String r0 = "ۘۦۜۘۦ۬۬ۡۖۘۘۘۡۡۘۢۢۢ۬۫ۧۜۙۢۚۥۛ"
            r1 = r0
            r7 = r3
            goto L_0x000c
        L_0x0038:
            com.obwhatsapp.youbasha.ui.views.YoSwipeableConvRow r3 = r12.f1521e
            java.lang.String r0 = "ۦۥۡۢۤۤۘۧۜۜ۫ۙۨۦۜۖۜۡۦۜ۬ۦ"
            r1 = r0
            r6 = r3
            goto L_0x000c
        L_0x003f:
            r6.mCurrentOffset = r7
            java.lang.String r0 = "ۚۨۡ۫ۖۦۘ۫ۦۦۖۜۖۖۧۖۘۘ۬۟"
            r1 = r0
            goto L_0x000c
        L_0x0045:
            com.obwhatsapp.youbasha.ui.views.u r0 = r6.f1408c
            r0.a(r7)
            java.lang.String r0 = "۟ۡۦۘۨۜۗۚۗ۫۬ۦۤ۠ۘۛ۠ۦۛۢۜۖ"
            r1 = r0
            goto L_0x000c
        L_0x004e:
            com.obwhatsapp.youbasha.ui.views.YoSwipeableConvRow.c(r6)
            java.lang.String r0 = "۬۟ۙ۬۫ۢۖۜۤۘۛۖۘۦ۟ۜۘۧۡ۠ۥۜ۫۫ۘۧۗ۠ۨ"
            r1 = r0
            goto L_0x000c
        L_0x0055:
            r1 = -374406760(0xffffffffe9af0198, float:-2.6446193E25)
            java.lang.String r0 = "۠ۘۚ۟۬ۖ۠ۛۦۘۙۖۛۡ۠ۤۨۥۧ۠۫ۙ"
        L_0x005a:
            int r3 = r0.hashCode()
            r3 = r3 ^ r1
            switch(r3) {
                case -2034401659: goto L_0x006e;
                case -986837966: goto L_0x0103;
                case 1825296103: goto L_0x0063;
                case 2054174744: goto L_0x006b;
                default: goto L_0x0062;
            }
        L_0x0062:
            goto L_0x005a
        L_0x0063:
            if (r9 == 0) goto L_0x0068
            java.lang.String r0 = "۫۟ۥۚۜۘۘۦۡ۟۫ۖۜۘۚۨۦ"
            goto L_0x005a
        L_0x0068:
            java.lang.String r0 = "ۛۤۨۘۜۖۘۛ۬ۖۘ۬ۧۡۡۜۙ۬ۨ۬ۖۨۢۙ۫۬"
            goto L_0x005a
        L_0x006b:
            java.lang.String r0 = "ۡۚ۠۬ۖۤۧ۠۫۟ۧۡۛ۠ۜ"
            goto L_0x005a
        L_0x006e:
            java.lang.String r0 = "ۧۨۥۘۖۚۤۜۗ۬ۢۜۛ۬ۥۥ۠ۧۨۘۜۨۘۘ"
            r1 = r0
            goto L_0x000c
        L_0x0072:
            r0 = 0
            r6.postDelayed(r12, r0)
            java.lang.String r0 = "ۢۚ۫ۢۘۨۘۥ۟ۧۛۖۧۘۚ۬ۛۧۢۦ"
            r1 = r0
            goto L_0x000c
        L_0x007b:
            r6.removeCallbacks(r12)
            java.lang.String r0 = "ۘۗۖۙ۟ۥ۫ۤۡۘ۬ۜۧۘۨۦۡۘ۟ۧۨۘ۟۠ۥۘ"
            r1 = r0
            goto L_0x000c
        L_0x0082:
            r10.abortAnimation()
            java.lang.String r0 = "ۢ۬ۡۘۦۥۘۘۦ۫ۢۨۥۧۘۙۢۡۘۜۤۘ"
            r1 = r0
            goto L_0x000c
        L_0x0089:
            com.obwhatsapp.yo.g r3 = r12.f1519c
            java.lang.String r0 = "ۛ۟ۨۡۨۨ۟ۛۦۚۛۦۧۦۜۧ۟ۘ۫ۦۡ"
            r1 = r0
            r5 = r3
            goto L_0x000c
        L_0x0091:
            r1 = 186642386(0xb1fefd2, float:3.0802707E-32)
            java.lang.String r0 = "ۨۨۜۤ۬ۨۘۡ۫۬۫ۥۘۜۘ"
        L_0x0096:
            int r3 = r0.hashCode()
            r3 = r3 ^ r1
            switch(r3) {
                case -1967692221: goto L_0x00aa;
                case -1937774054: goto L_0x009f;
                case -1162807650: goto L_0x00a5;
                case 766894329: goto L_0x0108;
                default: goto L_0x009e;
            }
        L_0x009e:
            goto L_0x0096
        L_0x009f:
            java.lang.String r0 = "ۦۘۚۢۖۗۤۚۛۚۡۙۡۖۘۢۦۖۘۧۥۦۘۤۙۗ"
            goto L_0x0096
        L_0x00a2:
            java.lang.String r0 = "ۡۤۦۘۛۚ۬ۢۜۥۘ۬۫ۙ۠ۜۨۚۗ۟"
            goto L_0x0096
        L_0x00a5:
            if (r5 == 0) goto L_0x00a2
            java.lang.String r0 = "۟ۦ۫ۧ۫ۗۚۙۥۤ۬ۗۢۘۜۧ۬ۥۢۨۘۖۢۦۥۜۡۘ"
            goto L_0x0096
        L_0x00aa:
            java.lang.String r0 = "ۢ۠ۥۜۨۘۥۙۚۘۡۦۥۙۨۘۧۨۥ"
            r1 = r0
            goto L_0x000c
        L_0x00af:
            java.lang.Object r0 = r5.f772b
            com.obwhatsapp.youbasha.ui.views.YoSwipeableConvRow r0 = (com.obwhatsapp.youbasha.ui.views.YoSwipeableConvRow) r0
            java.lang.String r1 = "ۨۘۧۘۛۘۨۥۤۚۤۡۥۜۜۗ"
            r4 = r0
            goto L_0x000c
        L_0x00b8:
            com.obwhatsapp.youbasha.ui.views.w r2 = r12.f1518b
            java.lang.String r0 = "ۢۨۘۘۢۗۘۘۤۥۘۛۢۥۘۤۡ۬ۧۛ۬ۡۜۘۡۜ"
            r1 = r0
            goto L_0x000c
        L_0x00bf:
            r4.f1409d = r2
            java.lang.String r0 = "۫ۗۜۘۘۘۤ۫ۥ۠ۜۢۧ۟ۛۨۘ۟ۦۨۦۘۗ"
            r1 = r0
            goto L_0x000c
        L_0x00c6:
            r1 = -1809980689(0xffffffff941de2ef, float:-7.971229E-27)
            java.lang.String r0 = "ۛۖۥۨۦۜۜۜۡۘۖ۠ۡ۬ۖۛۘۢۜ"
        L_0x00cb:
            int r3 = r0.hashCode()
            r3 = r3 ^ r1
            switch(r3) {
                case -746961288: goto L_0x00e3;
                case -106866530: goto L_0x00e6;
                case 398459842: goto L_0x00dc;
                case 695770078: goto L_0x00d4;
                default: goto L_0x00d3;
            }
        L_0x00d3:
            goto L_0x00cb
        L_0x00d4:
            java.lang.String r0 = "۫ۡۢۥۨۖۘۧۜۜۘۥۧۜۘ۫ۦۧۘ"
            r1 = r0
            goto L_0x000c
        L_0x00d9:
            java.lang.String r0 = "ۘۤۙۥۛۙۙۛۖۘۖۨۚ۠۟ۥۘۡ۬۟ۦۘۛۙۛۨ"
            goto L_0x00cb
        L_0x00dc:
            com.obwhatsapp.youbasha.ui.views.w r0 = com.obwhatsapp.youbasha.ui.views.w.f1523b
            if (r2 != r0) goto L_0x00d9
            java.lang.String r0 = "ۥۗۦۘ۟ۘۧۘۛۢۜۦۧۦۡ۫ۘۘۜ۫۬ۚۛۛۧۧۦۘ"
            goto L_0x00cb
        L_0x00e3:
            java.lang.String r0 = "ۧۛۘ۟ۘۨۘ۫ۧ۫۫ۦۡۙۙۜۥۥۖۤ۠۫"
            goto L_0x00cb
        L_0x00e6:
            java.lang.String r0 = "ۥۡۨۘ۠ۛ۠ۧۙۜۘۜۨۥۘ۠ۥۖۤۤۥ۬ۘۘ۠۬ۥۘ"
            r1 = r0
            goto L_0x000c
        L_0x00eb:
            r4.f1421p = r8
            java.lang.String r0 = "ۘۨۨۘۨ۠۠ۚۥۘۛ۟ۙۧ۬۫"
            r1 = r0
            goto L_0x000c
        L_0x00f2:
            r0 = 1
            r4.f1421p = r0
            java.lang.String r0 = "ۘۜۙۗۗۙ۫ۡۡۘ۟ۤۛۚۥۧۘ۠ۚۡ۟ۙۨ"
            r1 = r0
            goto L_0x000c
        L_0x00fa:
            com.obwhatsapp.youbasha.ui.views.t r0 = com.obwhatsapp.youbasha.ui.views.t.f1513c
            r4.f1407b = r0
            java.lang.String r0 = "۫ۖۗۧۨ۟۫ۘۥۚۦ۟۬۠ۨۘۚۦۦۘۜ۫ۤ"
            r1 = r0
            goto L_0x000c
        L_0x0103:
            java.lang.String r0 = "ۙ۫۫ۤۖۥۘ۬ۧۡۜ۟ۛۧۥۤۖۚۥۘ"
            r1 = r0
            goto L_0x000c
        L_0x0108:
            java.lang.String r0 = "۫ۖۗۧۨ۟۫ۘۥۚۦ۟۬۠ۨۘۚۦۦۘۜ۫ۤ"
            r1 = r0
            goto L_0x000c
        L_0x010d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.youbasha.ui.views.v.run():void");
    }
}
