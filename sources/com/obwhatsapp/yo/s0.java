package com.obwhatsapp.yo;

import android.widget.Scroller;
import com.obwhatsapp.yo.TouchImageView;

public final class s0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public int f869a;

    /* renamed from: b  reason: collision with root package name */
    public int f870b;

    /* renamed from: c  reason: collision with root package name */
    public Scroller f871c;

    /* renamed from: d  reason: collision with root package name */
    public final TouchImageView f872d;

    public s0(TouchImageView touchImageView, int i2, int i3) {
        int b2;
        int i4;
        int c2;
        int i5;
        this.f872d = touchImageView;
        TouchImageView.a(touchImageView, TouchImageView.State.FLING);
        this.f871c = new Scroller(touchImageView.f580a);
        touchImageView.f588i.getValues(touchImageView.f582c);
        float[] fArr = touchImageView.f582c;
        int i6 = (int) fArr[2];
        int i7 = (int) fArr[5];
        float b3 = TouchImageView.b(touchImageView);
        int i8 = touchImageView.f602w;
        String str = "۠ۙۖۙۜۧۤۦۢ۠ۖ۬ۛۜ۬ۢ۟ۤۥۤۧۚۤۦۦۗۦ";
        while (true) {
            switch (str.hashCode() ^ 1937933298) {
                case -1387576114:
                    b2 = i8 - ((int) TouchImageView.b(touchImageView));
                    i4 = 0;
                    break;
                case -962477670:
                    if (b3 > ((float) i8)) {
                        str = "ۡۡۖۛۤۖۘۚۚۙۥۗۡۨۘۘۤۧ۠ۢۛۥۥۚۦ";
                        break;
                    } else {
                        str = "ۙ۬ۡۘۙۖۖۘۜ۠ۦۘ۠۫ۘۘۡۗۥۘۙۜۡۛ۟۬ۤۚۛۛۤۨۘ";
                        continue;
                    }
                case -607394941:
                    str = "ۗۨ۫ۨۨۘۘ۫۠ۗ۟ۘۦۡۘ";
                    continue;
                case 682119315:
                    i4 = i6;
                    b2 = i6;
                    break;
            }
        }
        float c3 = TouchImageView.c(touchImageView);
        int i9 = touchImageView.f601v;
        String str2 = "ۚ۬ۨۘۖۨۨ۠ۛۦۘۦۥۡۘۘۘ۫۫ۦۘ۫ۤۘ۫ۤۥۗ۬۫";
        while (true) {
            switch (str2.hashCode() ^ 177051668) {
                case -1299101100:
                    if (c3 > ((float) i9)) {
                        str2 = "ۧۜۥ۠ۧ۫ۨ۟ۘ۬ۡۗۘۜۘ۠ۧۛۤۢۦۥۜ۫ۚ۠ۚ";
                        break;
                    } else {
                        str2 = "ۡ۬ۘۘۤ۠ۥۘۙ۟۬ۢۦۥۘۚ۠۠ۤۗۢۖۥ۫ۥۨۨ";
                        continue;
                    }
                case 10815573:
                    i5 = i7;
                    c2 = i7;
                    break;
                case 265057671:
                    str2 = "ۨ۠۟ۥۖۙ۬ۘۜۘ۠ۧۖۘۘ۠ۦۘ۬ۡۦۘۧۡۥۘۧۡۗ۠۬ۦۘ";
                    continue;
                case 1104107343:
                    c2 = i9 - ((int) TouchImageView.c(touchImageView));
                    i5 = 0;
                    break;
            }
        }
        this.f871c.fling(i6, i7, i2, i3, b2, i4, c2, i5);
        this.f869a = i6;
        this.f870b = i7;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r10 = this;
            r2 = 0
            r4 = 0
            java.lang.String r0 = "ۛۨ۠۟ۢۥۙۦۥ۫ۘۡۘۘۡۗۨ۟ۖ۠ۗۨۘۦۥۗۘۛ"
            r1 = r2
            r3 = r4
            r5 = r4
            r6 = r4
            r7 = r4
        L_0x0009:
            int r4 = r0.hashCode()
            r8 = 990(0x3de, float:1.387E-42)
            r9 = 1212540443(0x4845e61b, float:202648.42)
            r4 = r4 ^ r8
            r4 = r4 ^ r9
            switch(r4) {
                case -1992926868: goto L_0x0042;
                case -1892255838: goto L_0x003d;
                case -1292927309: goto L_0x0018;
                case -1250718695: goto L_0x00b3;
                case -1222868616: goto L_0x008e;
                case -667233028: goto L_0x0094;
                case -327950586: goto L_0x007e;
                case -143878626: goto L_0x001b;
                case 169342543: goto L_0x0088;
                case 199930145: goto L_0x00c2;
                case 536956609: goto L_0x00aa;
                case 576106650: goto L_0x006e;
                case 1382168384: goto L_0x0083;
                case 1519649217: goto L_0x0078;
                case 1530791502: goto L_0x00be;
                case 1723930442: goto L_0x00a3;
                case 1802476853: goto L_0x0064;
                default: goto L_0x0017;
            }
        L_0x0017:
            goto L_0x0009
        L_0x0018:
            java.lang.String r0 = "ۦۗ۟ۡ۬ۖ۫ۛۥۘۖۤۦۘۥۦۘۘۧۜۚ۬۟ۘۨۢۡۘ۟ۖۦۘ"
            goto L_0x0009
        L_0x001b:
            r4 = 199813757(0xbe8ea7d, float:8.971597E-32)
            java.lang.String r0 = "ۘۜۘۥ۠ۖۗۚۢۗۗۗۦ۟۟ۦۤۜۘۖۜ۠ۚ۬۠ۜ۟ۗ"
        L_0x0020:
            int r8 = r0.hashCode()
            r8 = r8 ^ r4
            switch(r8) {
                case -1837275348: goto L_0x00ba;
                case -464082495: goto L_0x0029;
                case 638587500: goto L_0x003a;
                case 1953176642: goto L_0x002f;
                default: goto L_0x0028;
            }
        L_0x0028:
            goto L_0x0020
        L_0x0029:
            java.lang.String r0 = "ۛۤۜ۠ۧ۠ۘۤۧۚ۬ۘۘۡۗۜۘۛۡۦ"
            goto L_0x0009
        L_0x002c:
            java.lang.String r0 = "۟ۦ۠۠ۜۚۛۗۚۤۤۦۛۚۨۡۖۘۘ"
            goto L_0x0020
        L_0x002f:
            android.widget.Scroller r0 = r10.f871c
            boolean r0 = r0.isFinished()
            if (r0 == 0) goto L_0x002c
            java.lang.String r0 = "ۨ۠ۘۤ۫ۚ۬ۧۨۘۙ۫ۗۦۥۘۙ۬ۚ۠ۧۙۖۘۖۘۥۚۧ"
            goto L_0x0020
        L_0x003a:
            java.lang.String r0 = "ۡ۬ۖۘۛ۠۟ۦۨۥۧۜۧۘۘۢۢ"
            goto L_0x0020
        L_0x003d:
            r10.f871c = r2
            java.lang.String r0 = "ۘ۫ۘۢۢۨۥۗۦۛۧۥۘۧۛۨۖ۟ۗۚۛۖ"
            goto L_0x0009
        L_0x0042:
            r4 = 1361421322(0x5125a40a, float:4.4463858E10)
            java.lang.String r0 = "ۥۢ۬ۧۜ۫۟ۤۘۘۧۡۦۘۧۜۖۤۜۚۨۢۡۘ"
        L_0x0047:
            int r8 = r0.hashCode()
            r8 = r8 ^ r4
            switch(r8) {
                case -1480311233: goto L_0x0050;
                case -776680875: goto L_0x00be;
                case -446190400: goto L_0x0056;
                case 1970961114: goto L_0x0061;
                default: goto L_0x004f;
            }
        L_0x004f:
            goto L_0x0047
        L_0x0050:
            java.lang.String r0 = "ۗۥۖۘۧۧۖۘۖۚۖۘۧ۟ۚۨۜۖۘۜ۬ۘۘ"
            goto L_0x0009
        L_0x0053:
            java.lang.String r0 = "ۚۙۥۗۤۦۘۦۙ۬ۡ۟ۨۘۚۘۡۥۢۗۨۡ۬۫ۧۖۗۖ"
            goto L_0x0047
        L_0x0056:
            android.widget.Scroller r0 = r10.f871c
            boolean r0 = r0.computeScrollOffset()
            if (r0 == 0) goto L_0x0053
            java.lang.String r0 = "ۚ۠ۨۘۦۧۡۘۛۢۖۙۧۛۥ۫ۨۘۖۤۦۘۖۧۛۥ۫ۖۜۥۡ"
            goto L_0x0047
        L_0x0061:
            java.lang.String r0 = "۟ۡ۟ۦۨۢۘ۫۬ۘۘۖۘۦ۟ۦ"
            goto L_0x0047
        L_0x0064:
            android.widget.Scroller r0 = r10.f871c
            int r4 = r0.getCurrX()
            java.lang.String r0 = "۠۫ۛ۟۠۟ۢ۫ۤۙۧۖۘۙۗۘۖۖۖۘ"
            r7 = r4
            goto L_0x0009
        L_0x006e:
            android.widget.Scroller r0 = r10.f871c
            int r4 = r0.getCurrY()
            java.lang.String r0 = "ۚۘۛۥ۟ۢۧ۟ۜ۬ۛۜۘۙۨۨۘۛۗۗ۟ۧۤ"
            r6 = r4
            goto L_0x0009
        L_0x0078:
            int r4 = r10.f869a
            java.lang.String r0 = "ۤۙۜۘ۫ۗ۬ۢۨ۬ۨۗ۫ۜۚۘۘ"
            r5 = r4
            goto L_0x0009
        L_0x007e:
            int r3 = r10.f870b
            java.lang.String r0 = "ۢۤ۟ۗۥۚۥۙ۫ۖۤ۟ۦۢ"
            goto L_0x0009
        L_0x0083:
            r10.f869a = r7
            java.lang.String r0 = "ۧۥۜۘۡۗ۠ۛۥ۬ۚۙ۠ۤۡۚۗۨۧۘۧۖۜۘۘۚۧ"
            goto L_0x0009
        L_0x0088:
            r10.f870b = r6
            java.lang.String r0 = "ۤ۬ۜ۠ۨ۟ۧۛۡۘ۫۠ۢۛۨۘ۬ۨۚ۟ۚۨۘ"
            goto L_0x0009
        L_0x008e:
            com.obwhatsapp.yo.TouchImageView r1 = r10.f872d
            java.lang.String r0 = "ۡ۠ۡ۬۫ۚ۟ۛۜۘۧۡۧۤۚۙۡۙۘ"
            goto L_0x0009
        L_0x0094:
            android.graphics.Matrix r0 = r1.f588i
            int r4 = r7 - r5
            float r4 = (float) r4
            int r8 = r6 - r3
            float r8 = (float) r8
            r0.postTranslate(r4, r8)
            java.lang.String r0 = "ۙۥۨۧۖۦ۫ۡۘۧۦۛۢ۬ۤ۟ۗۜۚۡۜ۠ۘۛۡۥ۠"
            goto L_0x0009
        L_0x00a3:
            r1.fixTrans()
            java.lang.String r0 = "ۤۡۧۘ۟ۚ۬ۛۢۛۜۖۘۥۗۜۛۘۜۖۛ۟۫ۧۨۘ"
            goto L_0x0009
        L_0x00aa:
            android.graphics.Matrix r0 = r1.f588i
            r1.setImageMatrix(r0)
            java.lang.String r0 = "۬۠ۦۘۙۤۖ۟ۥ۟۟ۨ۟ۙۙۥۛۨ۬"
            goto L_0x0009
        L_0x00b3:
            r1.postOnAnimation(r10)
            java.lang.String r0 = "ۗۘۘۙۤۘۘۛ۟۬۟ۡۜۘ۠ۙۥۜۨۘ"
            goto L_0x0009
        L_0x00ba:
            java.lang.String r0 = "ۜۛۨۘۚۗۥۚۨۗ۫ۧۨۡۜۦۘ"
            goto L_0x0009
        L_0x00be:
            java.lang.String r0 = "ۗۘۘۙۤۘۘۛ۟۬۟ۡۜۘ۠ۙۥۜۨۘ"
            goto L_0x0009
        L_0x00c2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.yo.s0.run():void");
    }
}
