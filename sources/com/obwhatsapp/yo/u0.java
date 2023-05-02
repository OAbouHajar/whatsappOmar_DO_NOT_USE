package com.obwhatsapp.yo;

import android.graphics.PointF;
import android.view.View;

public final class u0 implements View.OnTouchListener {

    /* renamed from: a  reason: collision with root package name */
    public final PointF f887a = new PointF();

    /* renamed from: b  reason: collision with root package name */
    public final TouchImageView f888b;

    public u0(TouchImageView touchImageView) {
        this.f888b = touchImageView;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0278, code lost:
        r2 = "ۦۜۨۘۤۛۗۥۘۜۘۖۜۜ۟۫ۙۚۚۥۘۤۖۧۘ";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x02df, code lost:
        r2 = "ۢۥۜۗۜۡۘۧ۫۠ۧ۬ۧ۬ۡۘۖۧۚۡۤۙ۟ۢ۠ۘۘ";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00a0, code lost:
        r2 = "ۨۡۖۥ۟ۥۘۨۧۢ۟۬ۛۨ۠ۖۘۘۨۧ";
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouch(android.view.View r23, android.view.MotionEvent r24) {
        /*
            r22 = this;
            r18 = 0
            r17 = 0
            r16 = 0
            r15 = 0
            r14 = 0
            r13 = 0
            r6 = 0
            r12 = 0
            r10 = 0
            r11 = 0
            r8 = 0
            r9 = 0
            r7 = 0
            r4 = 0
            r5 = 0
            r3 = 0
            java.lang.String r2 = "ۚۗ۫ۢۙۦۢ۬ۥۧۘۢۗۦۢ۠ۗۡۘۙ۬ۡۘۢ۟ۢ"
        L_0x0015:
            int r19 = r2.hashCode()
            r20 = 368(0x170, float:5.16E-43)
            r21 = 660398224(0x275ce090, float:3.0652869E-15)
            r19 = r19 ^ r20
            r19 = r19 ^ r21
            switch(r19) {
                case -2091472174: goto L_0x01bb;
                case -2016654671: goto L_0x010b;
                case -1941081030: goto L_0x01f7;
                case -1891684965: goto L_0x0261;
                case -1746765043: goto L_0x0044;
                case -1567381153: goto L_0x01e4;
                case -1520993083: goto L_0x012a;
                case -1512162878: goto L_0x0224;
                case -1423787504: goto L_0x02cc;
                case -1329181086: goto L_0x028b;
                case -1290037640: goto L_0x01c0;
                case -1282339849: goto L_0x02d9;
                case -1279841007: goto L_0x0192;
                case -1013707089: goto L_0x01fc;
                case -873650739: goto L_0x02e3;
                case -803905218: goto L_0x002f;
                case -563893622: goto L_0x02b4;
                case -426593110: goto L_0x002c;
                case -387421200: goto L_0x0091;
                case -266673730: goto L_0x01a6;
                case 50293311: goto L_0x01b2;
                case 298330949: goto L_0x006d;
                case 364613000: goto L_0x00e1;
                case 513694550: goto L_0x0269;
                case 595310234: goto L_0x02ab;
                case 622694454: goto L_0x02c1;
                case 634504868: goto L_0x0038;
                case 634657336: goto L_0x014d;
                case 639743798: goto L_0x016c;
                case 783512401: goto L_0x0026;
                case 827238216: goto L_0x00d9;
                case 891294197: goto L_0x0064;
                case 1088466974: goto L_0x0235;
                case 1186035861: goto L_0x02e3;
                case 1221283125: goto L_0x0072;
                case 1422949251: goto L_0x00e9;
                case 1474983356: goto L_0x019e;
                case 1608335058: goto L_0x0050;
                case 1729665538: goto L_0x00b7;
                case 1754409736: goto L_0x024f;
                case 1819965122: goto L_0x0229;
                case 1831927133: goto L_0x022e;
                case 1833369290: goto L_0x0029;
                case 1937957650: goto L_0x0258;
                case 1951553743: goto L_0x01ee;
                case 1985334272: goto L_0x023c;
                case 1992015230: goto L_0x01e9;
                case 2022382733: goto L_0x02e3;
                default: goto L_0x0025;
            }
        L_0x0025:
            goto L_0x0015
        L_0x0026:
            java.lang.String r2 = "ۧۦۤ۫۬ۥۡۜۤ۟۠ۡۙۛۤۚۙۡۤۜۘ"
            goto L_0x0015
        L_0x0029:
            java.lang.String r2 = "ۖ۫ۨۥۡۖۘۥ۟ۧ۬ۧۨۘۤۖۧۘ"
            goto L_0x0015
        L_0x002c:
            java.lang.String r2 = "ۤۘ۬ۜۜۢۚۛۥ۬۬ۢۦ"
            goto L_0x0015
        L_0x002f:
            r0 = r22
            com.obwhatsapp.yo.TouchImageView r0 = r0.f888b
            r18 = r0
            java.lang.String r2 = "ۖۡۡۘۚۗۢۥ۬۫ۧۥۥۥۧ۟ۛ۬۬"
            goto L_0x0015
        L_0x0038:
            r0 = r18
            android.view.ScaleGestureDetector r2 = r0.f584e
            r0 = r24
            r2.onTouchEvent(r0)
            java.lang.String r2 = "ۤۡۘۡۥۤۛۘ۫ۨۥۘ۬ۗۗۙ۠ۢۗ۬ۨۘ۟ۥۜۙۖ"
            goto L_0x0015
        L_0x0044:
            r0 = r18
            android.view.GestureDetector r2 = r0.f583d
            r0 = r24
            r2.onTouchEvent(r0)
            java.lang.String r2 = "ۥۚۚۧۖۤۤۥۦۘۥۚۡۘۧۡۜۧۦ"
            goto L_0x0015
        L_0x0050:
            android.graphics.PointF r17 = new android.graphics.PointF
            float r2 = r24.getX()
            float r19 = r24.getY()
            r0 = r17
            r1 = r19
            r0.<init>(r2, r1)
            java.lang.String r2 = "۠ۧۘۘۧ۟ۘۤۡۧۧ۫ۚۧۢ۬۟ۛ۬ۥ۠ۗۖۛۗۦۘۡ"
            goto L_0x0015
        L_0x0064:
            r0 = r18
            com.obwhatsapp.yo.TouchImageView$State r0 = r0.f598s
            r16 = r0
            java.lang.String r2 = "ۘۧۚۥۦۡۘ۫۟ۡۘۢۙۖۘۘۛۥ۬ۧۦۖ۠ۤۜۙۖۥۤۡۘ"
            goto L_0x0015
        L_0x006d:
            com.obwhatsapp.yo.TouchImageView$State r15 = com.obwhatsapp.yo.TouchImageView.State.NONE
            java.lang.String r2 = "ۗۙۤۧۦۧۘ۠۬ۦۘۖ۟ۥۡۘۘ"
            goto L_0x0015
        L_0x0072:
            r19 = 1352024738(0x509642a2, float:2.0167594E10)
            java.lang.String r2 = "ۡۜۥۛۨۨۨۗۧ۠ۚۛۖۨۥۤ۠ۥۘۙۦ"
        L_0x0077:
            int r20 = r2.hashCode()
            r20 = r20 ^ r19
            switch(r20) {
                case -776423732: goto L_0x008e;
                case 814903: goto L_0x0087;
                case 329614704: goto L_0x00a0;
                case 1702072245: goto L_0x0081;
                default: goto L_0x0080;
            }
        L_0x0080:
            goto L_0x0077
        L_0x0081:
            java.lang.String r2 = "ۧۤۥۨۤ۠ۛ۬ۡۘۤۘ۠ۜۢ۠۫ۡۘ۬ۧۙ"
            goto L_0x0077
        L_0x0084:
            java.lang.String r2 = "ۖ۫ۤۖۘۜۘۤ۟ۘۘۛۜ۫۫۟ۘۨۘۦۘۜۡۧۗۘۥۘ"
            goto L_0x0077
        L_0x0087:
            r0 = r16
            if (r0 == r15) goto L_0x0084
            java.lang.String r2 = "ۗ۟۫ۧۜۨۘۦۘۚۡۦۖۨ"
            goto L_0x0077
        L_0x008e:
            java.lang.String r2 = "ۚۗۦۘۡۡۗۚۘ۫ۨۨۚۤۨۡۘ"
            goto L_0x0015
        L_0x0091:
            r19 = -1173201859(0xffffffffba125c3d, float:-5.5832026E-4)
            java.lang.String r2 = "ۛ۠ۦۦ۟ۡۤۛۥۘۚ۫۬ۛۧۡۘۥۛ۫"
        L_0x0096:
            int r20 = r2.hashCode()
            r20 = r20 ^ r19
            switch(r20) {
                case -2147418219: goto L_0x00a7;
                case -454722627: goto L_0x00b0;
                case -196824325: goto L_0x00a0;
                case 1991033158: goto L_0x00b3;
                default: goto L_0x009f;
            }
        L_0x009f:
            goto L_0x0096
        L_0x00a0:
            java.lang.String r2 = "ۨۡۖۥ۟ۥۘۨۧۢ۟۬ۛۨ۠ۖۘۘۨۧ"
            goto L_0x0015
        L_0x00a4:
            java.lang.String r2 = "ۡۢۙOۨۚۦ۠ۘۜۘ۫ۜۨ"
            goto L_0x0096
        L_0x00a7:
            com.obwhatsapp.yo.TouchImageView$State r2 = com.obwhatsapp.yo.TouchImageView.State.DRAG
            r0 = r16
            if (r0 == r2) goto L_0x00a4
            java.lang.String r2 = "ۤۗۜۘ۬ۛۦۘ۫ۜ۟ۤ۫ۥۤۤ۠"
            goto L_0x0096
        L_0x00b0:
            java.lang.String r2 = "ۧۢۘۜۖ۠ۗ۟ۡۘۘۗۥۨۛ۬"
            goto L_0x0096
        L_0x00b3:
            java.lang.String r2 = "ۚۥۥۘۙ۟۫ۡ۬ۦۘ۟ۘۛۨ۬"
            goto L_0x0015
        L_0x00b7:
            r19 = -1537784734(0xffffffffa4574462, float:-4.6678616E-17)
            java.lang.String r2 = "ۨۤۚۗۘۛۤۖ۠ۦۘۗۘ۠ۨۘ"
        L_0x00bc:
            int r20 = r2.hashCode()
            r20 = r20 ^ r19
            switch(r20) {
                case -1369387669: goto L_0x00d5;
                case -643970112: goto L_0x00d2;
                case -160090615: goto L_0x00c6;
                case 751259288: goto L_0x02e3;
                default: goto L_0x00c5;
            }
        L_0x00c5:
            goto L_0x00bc
        L_0x00c6:
            com.obwhatsapp.yo.TouchImageView$State r2 = com.obwhatsapp.yo.TouchImageView.State.FLING
            r0 = r16
            if (r0 != r2) goto L_0x00cf
            java.lang.String r2 = "ۨۨۢۥۙۡۖۤۦۦۧۨۘۘۙۚۥ۟ۖۢۧۜۘ"
            goto L_0x00bc
        L_0x00cf:
            java.lang.String r2 = "ۜۡۤۢ۟۟ۢۖۛۜۗۘۧۧۤۖۤۦۚۚ۬ۥۤۜۘ"
            goto L_0x00bc
        L_0x00d2:
            java.lang.String r2 = "ۦۢۤۜۗۘۘۚۚ۬۠۫ۦۥۜۘۘ"
            goto L_0x00bc
        L_0x00d5:
            java.lang.String r2 = "ۨۡۖۥ۟ۥۘۨۧۢ۟۬ۛۨ۠ۖۘۘۨۧ"
            goto L_0x0015
        L_0x00d9:
            int r14 = r24.getAction()
            java.lang.String r2 = "۟ۤۘ۬۠ۘۘۜۧۚ۬ۧۘۘۦ۬۬ۨۥۙۜ۫ۘۘ"
            goto L_0x0015
        L_0x00e1:
            r0 = r22
            android.graphics.PointF r13 = r0.f887a
            java.lang.String r2 = "۠ۥۤۛۗۥۘۢۤ۟ۘۥ۠ۜ۬ۜۚۖۨۧۘۘ"
            goto L_0x0015
        L_0x00e9:
            r19 = 240089182(0xe4f785e, float:2.5572675E-30)
            java.lang.String r2 = "ۦۧۜۜۧۗۢۢۜۘۖ۫ۖۦۧۗۛۙۦۘۗۙۚ"
        L_0x00ee:
            int r20 = r2.hashCode()
            r20 = r20 ^ r19
            switch(r20) {
                case -1490376304: goto L_0x00f8;
                case -998890427: goto L_0x0104;
                case -419560136: goto L_0x00ff;
                case -340829056: goto L_0x0107;
                default: goto L_0x00f7;
            }
        L_0x00f7:
            goto L_0x00ee
        L_0x00f8:
            java.lang.String r2 = "ۦۥۙۦ۠ۨۘۡۙۘ۠ۙۜۖۢۖۢۙۨۘۚۛۡۘۨۥۦۘۖۛۨ"
            goto L_0x0015
        L_0x00fc:
            java.lang.String r2 = "۟ۥۖۘۖۤ۫۠۠ۜۨۤۡۘۗۥ۫ۨۗ۬ۡۤ۫"
            goto L_0x00ee
        L_0x00ff:
            if (r14 == 0) goto L_0x00fc
            java.lang.String r2 = "۬ۤ۠ۛۜۧۘۦۨ۠۫۫ۨۙ۟ۡ۟ۗۘۘ۫۬ۡۦۜۢ"
            goto L_0x00ee
        L_0x0104:
            java.lang.String r2 = "۬ۨۥۘۚۖۘ۬ۥۜۘ۬۠ۘۘۚۡۗۥۦۖۦ۫۫۠ۙۚ۟ۖۧۘ"
            goto L_0x00ee
        L_0x0107:
            java.lang.String r2 = "ۤۧۡۘۢۨۖۘۘۖۖۦ۟۠ۖۛۗ۫ۜۢ۟ۦۗۨۘۧۘۨۘۢ"
            goto L_0x0015
        L_0x010b:
            r19 = -419788429(0xffffffffe6fa8973, float:-5.9156356E23)
            java.lang.String r2 = "ۜۙۖۢ۫ۙۤۥ۠ۡۦۤۡۜ"
        L_0x0110:
            int r20 = r2.hashCode()
            r20 = r20 ^ r19
            switch(r20) {
                case -1050387902: goto L_0x011a;
                case -977506206: goto L_0x02df;
                case 582961606: goto L_0x0126;
                case 820487873: goto L_0x0120;
                default: goto L_0x0119;
            }
        L_0x0119:
            goto L_0x0110
        L_0x011a:
            java.lang.String r2 = "ۨۡۤۦۗۥۘۜۡ۟۠ۤۨۤ۠ۛۡۥ۟"
            goto L_0x0110
        L_0x011d:
            java.lang.String r2 = "۫۬ۡۘ۬ۥۚۘۨۧۘ۫۟ۦۚۤۢ۠ۦۨۤۧۘۘۛۘ۫۠ۘ"
            goto L_0x0110
        L_0x0120:
            r2 = 1
            if (r14 == r2) goto L_0x011d
            java.lang.String r2 = "ۢۦۢۘۗۦۥۘۦ۬ۥۧۘ۬ۨۥۘۢۛ۟ۤۡۧۘ"
            goto L_0x0110
        L_0x0126:
            java.lang.String r2 = "ۧۜۘۘۤۡ۫ۨۤ۠ۛۜۡۡۥۨۘۤۦۧۘۖۜۧ"
            goto L_0x0015
        L_0x012a:
            r19 = -1096299588(0xffffffffbea7cbbc, float:-0.32772624)
            java.lang.String r2 = "ۥۨۡۘۤۚۘۘۦ۠۟۫ۜۤ۠ۤۚ۬ۜ۠ۘۖۡۘۘۗۗ"
        L_0x012f:
            int r20 = r2.hashCode()
            r20 = r20 ^ r19
            switch(r20) {
                case -1556272706: goto L_0x0149;
                case -1436157513: goto L_0x0140;
                case -96324805: goto L_0x0139;
                case 462786992: goto L_0x0146;
                default: goto L_0x0138;
            }
        L_0x0138:
            goto L_0x012f
        L_0x0139:
            java.lang.String r2 = "ۦۨۨۛ۟ۗۨۙ۫ۘ۫ۦ۟ۛۘ"
            goto L_0x0015
        L_0x013d:
            java.lang.String r2 = "ۙ۬ۜ۟ۖ۠ۗۦۜۗۗۤۚۤ۬ۧۜۘۛۨ۬"
            goto L_0x012f
        L_0x0140:
            r2 = 2
            if (r14 == r2) goto L_0x013d
            java.lang.String r2 = "ۡۜۡۨۤۚۧ۠ۤ۫۠۠ۡۚۜۤۥ"
            goto L_0x012f
        L_0x0146:
            java.lang.String r2 = "ۤ۟ۡۘۨۨۖۘ۟ۚۜ۟۟ۖۤۚۡ"
            goto L_0x012f
        L_0x0149:
            java.lang.String r2 = "ۥ۫ۨ۟ۛۥۘۢۥۤۡۤۨۘۘۚۥۘ"
            goto L_0x0015
        L_0x014d:
            r19 = -1566997543(0xffffffffa29983d9, float:-4.1610332E-18)
            java.lang.String r2 = "ۜۨ۟ۜۛۡ۠ۡۨ۠ۧۢۤۥۧۤ۠ۖۤۙۜۘ۟۟۬ۦ۠ۛ"
        L_0x0152:
            int r20 = r2.hashCode()
            r20 = r20 ^ r19
            switch(r20) {
                case -1933829307: goto L_0x0168;
                case -530180148: goto L_0x02df;
                case 976601892: goto L_0x0162;
                case 1555300684: goto L_0x015c;
                default: goto L_0x015b;
            }
        L_0x015b:
            goto L_0x0152
        L_0x015c:
            java.lang.String r2 = "ۘۗۖۘۛۦۜۗۧ۬ۛۤۗ۟ۚ۫ۦۥۡۡ۬ۚۡۢ"
            goto L_0x0152
        L_0x015f:
            java.lang.String r2 = "ۥۧۢ۫ۛۨ۬ۨ۟۟۟ۥۘۦۖۖۘۡ۬ۥ۫ۛۖۘۡۘۖۘ"
            goto L_0x0152
        L_0x0162:
            r2 = 6
            if (r14 == r2) goto L_0x015f
            java.lang.String r2 = "ۚۛۛ۠ۢۜۡۦۥ۬۫۫ۨۢۛ"
            goto L_0x0152
        L_0x0168:
            java.lang.String r2 = "ۘۙۜۦۜ۠ۚۧۚۛۗ۫ۥۧۘۙ۟ۖۘ"
            goto L_0x0015
        L_0x016c:
            r19 = -2131846457(0xffffffff80ee9ac7, float:-2.1912372E-38)
            java.lang.String r2 = "ۖ۠ۘۢۡۡۘۤۘۘۤۖۥۘ۬۠ۚ"
        L_0x0171:
            int r20 = r2.hashCode()
            r20 = r20 ^ r19
            switch(r20) {
                case -1767240712: goto L_0x018e;
                case -1166644795: goto L_0x02e3;
                case -608350860: goto L_0x017b;
                case 1556395782: goto L_0x0181;
                default: goto L_0x017a;
            }
        L_0x017a:
            goto L_0x0171
        L_0x017b:
            java.lang.String r2 = "ۡۢۧ۫ۖۤۨۙۨۜۗۥۡۥۘۚۦۥۘۨۡ۟ۗۦۧ"
            goto L_0x0171
        L_0x017e:
            java.lang.String r2 = "۟ۦۘۘۡۘۦۗۗۚۥۛۖۘۧ۟"
            goto L_0x0171
        L_0x0181:
            r0 = r18
            com.obwhatsapp.yo.TouchImageView$State r2 = r0.f598s
            com.obwhatsapp.yo.TouchImageView$State r20 = com.obwhatsapp.yo.TouchImageView.State.DRAG
            r0 = r20
            if (r2 != r0) goto L_0x017e
            java.lang.String r2 = "ۜ۬۫ۛۚۚۛۢۗۡۢۘۘۤ۫ۘۘۥۢۧۡۧ۫"
            goto L_0x0171
        L_0x018e:
            java.lang.String r2 = "ۚۥۤۚۜۢۤۙۚۦ۬ۗۦۨۜۘ"
            goto L_0x0015
        L_0x0192:
            r0 = r17
            float r2 = r0.y
            float r6 = r13.y
            float r6 = r2 - r6
            java.lang.String r2 = "۬ۚ۟ۨۦۜۛ۟ۜ۠ۥ۫۬ۜۧۘ"
            goto L_0x0015
        L_0x019e:
            r0 = r18
            android.graphics.Matrix r12 = r0.f588i
            java.lang.String r2 = "ۛۚۙۖۥ۬۟۫ۤۘ۫ۖۡ۫ۖ"
            goto L_0x0015
        L_0x01a6:
            r0 = r17
            float r2 = r0.x
            float r10 = r13.x
            float r10 = r2 - r10
            java.lang.String r2 = "ۥۢۤۡۙۨۘۖۧۦۘۡ۠ۥۘۙۗۡ"
            goto L_0x0015
        L_0x01b2:
            r0 = r18
            int r2 = r0.f602w
            float r11 = (float) r2
            java.lang.String r2 = "ۚۘ۫ۤ۬ۖۙۥۛۥۨ۟۫ۦ۟ۙ۬ۛ"
            goto L_0x0015
        L_0x01bb:
            java.lang.String r2 = "ۚۖ۠ۦۡ۟ۦۢۦۘۡ۠ۘۘۢۜۦۘ۟۫ۥۘ"
            r9 = r10
            goto L_0x0015
        L_0x01c0:
            r19 = 360253224(0x15790728, float:5.0290795E-26)
            java.lang.String r2 = "ۡ۟ۡۚۨۘۘ۠۬ۘ۟۫۠ۗۘۦۘۚۦۡ۬۟ۜۘ۬ۜ۠ۗ۬ۛ"
        L_0x01c5:
            int r20 = r2.hashCode()
            r20 = r20 ^ r19
            switch(r20) {
                case -728537397: goto L_0x01dd;
                case 624834500: goto L_0x01e0;
                case 934827750: goto L_0x01cf;
                case 1580813007: goto L_0x02db;
                default: goto L_0x01ce;
            }
        L_0x01ce:
            goto L_0x01c5
        L_0x01cf:
            float r2 = com.obwhatsapp.yo.TouchImageView.b(r18)
            int r2 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r2 > 0) goto L_0x01da
            java.lang.String r2 = "۟ۗ۟۬ۜۧۛ۬ۦۘۨۡۘۧۜۜۚۢۚۛۥۖۘ"
            goto L_0x01c5
        L_0x01da:
            java.lang.String r2 = "۟۠ۙۛۚ۠۬ۗ۬ۤۗۖۦۦ۬ۧۚ۟ۡۡۘ۬۬ۘۧۚۥ"
            goto L_0x01c5
        L_0x01dd:
            java.lang.String r2 = "ۖۦۧۨ۠ۖۘۦۧ۫۬۟ۘۘۥۗ۬۬۫ۙ"
            goto L_0x01c5
        L_0x01e0:
            java.lang.String r2 = "ۧۗۜۦۖۖۖۚۜۘۨۘۥۘۤۘۜ۠ۨ۠ۚۧۨۡ۬ۘ"
            goto L_0x0015
        L_0x01e4:
            r8 = 0
            java.lang.String r2 = "ۤۙ۫ۢۙۗۡۡۘۘۙۧۦۛ۟ۖ۬ۖۨۘ"
            goto L_0x0015
        L_0x01e9:
            java.lang.String r2 = "ۙۥ۠ۥۚۚۧۦۥۥۧ۠ۧۜۧۘ"
            r9 = r8
            goto L_0x0015
        L_0x01ee:
            r0 = r18
            int r2 = r0.f601v
            float r7 = (float) r2
            java.lang.String r2 = "ۨۛ۟ۗ۠ۤۨۛۘۢۜۙۘۙۤ"
            goto L_0x0015
        L_0x01f7:
            java.lang.String r2 = "ۥۡ۟۠۠ۥۘۦۚ۫ۘ۟۠ۚۗۤ"
            r5 = r6
            goto L_0x0015
        L_0x01fc:
            r19 = -1608117403(0xffffffffa0261365, float:-1.4067164E-19)
            java.lang.String r2 = "ۜۨۨۘۤۨۡ۠۫ۚ۠ۦۚ۠ۢ۠ۡۥۨ۠ۥ۫۟ۛ۟"
        L_0x0201:
            int r20 = r2.hashCode()
            r20 = r20 ^ r19
            switch(r20) {
                case -1700671444: goto L_0x0212;
                case -1575606791: goto L_0x021d;
                case 672923805: goto L_0x0220;
                case 1974092552: goto L_0x020b;
                default: goto L_0x020a;
            }
        L_0x020a:
            goto L_0x0201
        L_0x020b:
            java.lang.String r2 = "۠ۤۡۚۙۘ۟ۢۤۗۡۘۢ۟ۡۘ"
            goto L_0x0015
        L_0x020f:
            java.lang.String r2 = "ۧ۠ۥۘۤ۫ۖۘ۠۟ۛۡۜۢۜۧۖۘ"
            goto L_0x0201
        L_0x0212:
            float r2 = com.obwhatsapp.yo.TouchImageView.c(r18)
            int r2 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r2 > 0) goto L_0x020f
            java.lang.String r2 = "ۤ۟۟ۘ۠ۦۦۡۘۧ۟ۜۧۦ۠ۧۜۘۙۖۜ"
            goto L_0x0201
        L_0x021d:
            java.lang.String r2 = "ۢۛۡۘۗۛۗۜ۠ۨۘ۫ۚۖۥ۠ۘ۫ۖ"
            goto L_0x0201
        L_0x0220:
            java.lang.String r2 = "ۛۧۚۖۖۗ۫ۥۜۘ۠۫ۦۚۗۛ"
            goto L_0x0015
        L_0x0224:
            r4 = 0
            java.lang.String r2 = "ۙۚۤۢۤۖۘۚۨۦۘ۫ۖۦۘۡۧۥۗۚ۠"
            goto L_0x0015
        L_0x0229:
            java.lang.String r2 = "۠ۤۡۚۙۘ۟ۢۤۗۡۘۢ۟ۡۘ"
            r5 = r4
            goto L_0x0015
        L_0x022e:
            r12.postTranslate(r9, r5)
            java.lang.String r2 = "ۢ۠۟ۧۥ۠ۘ۠ۤۦۢۖۘ۠ۚۦۜۦ۬ۤۙۢ"
            goto L_0x0015
        L_0x0235:
            r18.fixTrans()
            java.lang.String r2 = "ۧۘۗۦۦۖ۫۠ۡۘۖۜۥۘۤۙۙۢۧۨۤۜۤۘۖۨۘ۫ۥ۠"
            goto L_0x0015
        L_0x023c:
            r0 = r17
            float r2 = r0.x
            r0 = r17
            float r0 = r0.y
            r19 = r0
            r0 = r19
            r13.set(r2, r0)
            java.lang.String r2 = "ۜۖۥۘۦۚۙۡۚۜۘۜۘۧۘۗۘۜۦۡۧۥ۟ۚ"
            goto L_0x0015
        L_0x024f:
            r0 = r18
            com.obwhatsapp.yo.TouchImageView.a(r0, r15)
            java.lang.String r2 = "ۤۚۦۘۡۖۘۛۦۨۘۛ۠۫ۖۛۘۘۨۙۘۘۥۖۤ"
            goto L_0x0015
        L_0x0258:
            r0 = r17
            r13.set(r0)
            java.lang.String r2 = "ۦۨۨۦۧ۠۫ۙۦۨۙ۟ۧۤۘۘۨۢۘۙۥۙ"
            goto L_0x0015
        L_0x0261:
            r0 = r18
            com.obwhatsapp.yo.s0 r3 = r0.f581b
            java.lang.String r2 = "ۗۢۨۘۥۦ۟ۥۗۜ۫ۙۦۧۡۤۘۤۛ"
            goto L_0x0015
        L_0x0269:
            r19 = -1554970691(0xffffffffa35107bd, float:-1.1331551E-17)
            java.lang.String r2 = "ۘۨۖۘۙۛۤۧۢۨۘۜۧ۫۫۠ۧۖ۫ۙۛۦۘ"
        L_0x026e:
            int r20 = r2.hashCode()
            r20 = r20 ^ r19
            switch(r20) {
                case -1647456841: goto L_0x0278;
                case -1461384533: goto L_0x027f;
                case 180714412: goto L_0x0287;
                case 2073212044: goto L_0x0284;
                default: goto L_0x0277;
            }
        L_0x0277:
            goto L_0x026e
        L_0x0278:
            java.lang.String r2 = "ۦۜۨۘۤۛۗۥۘۜۘۖۜۜ۟۫ۙۚۚۥۘۤۖۧۘ"
            goto L_0x0015
        L_0x027c:
            java.lang.String r2 = "ۖۥۡ۠ۖۥ۬ۦۘۘۙۖۗۧۨ۫ۜۨۘۡۚۘۘ۫ۙۖ"
            goto L_0x026e
        L_0x027f:
            if (r3 == 0) goto L_0x027c
            java.lang.String r2 = "ۜۡۛ۟ۜۧۤۖۚ۟ۘۘ۫ۚ۫"
            goto L_0x026e
        L_0x0284:
            java.lang.String r2 = "ۨۤۦۡۥۙۨۦۚ۠ۖۚۧ۬ۜۙۖۖۘۘ۠ۚ۠ۘۘ"
            goto L_0x026e
        L_0x0287:
            java.lang.String r2 = "ۢۗ۬ۦۤۥۘۚۦۚ۟ۡۡۘ۬ۧۜ"
            goto L_0x0015
        L_0x028b:
            r19 = 1206353916(0x47e77ffc, float:118527.97)
            java.lang.String r2 = "ۖۜۜۘ۠۫ۥۘۥۖۘۚۤۡۚ۫ۡۘ"
        L_0x0290:
            int r20 = r2.hashCode()
            r20 = r20 ^ r19
            switch(r20) {
                case 398079961: goto L_0x02a4;
                case 844296228: goto L_0x029a;
                case 1419979358: goto L_0x0278;
                case 1926809305: goto L_0x02a7;
                default: goto L_0x0299;
            }
        L_0x0299:
            goto L_0x0290
        L_0x029a:
            android.widget.Scroller r2 = r3.f871c
            if (r2 == 0) goto L_0x02a1
            java.lang.String r2 = "ۜۘ۠ۨۧۥۘۜۡۧۘ۫ۘۤۜۖۖۘۜۤۥ۫ۜ۬"
            goto L_0x0290
        L_0x02a1:
            java.lang.String r2 = "ۘ۫ۖۘۚ۫ۡۘ۬۟ۡۤۖۨۘۗۥۨ۟ۡ۟ۡۛۦۘ"
            goto L_0x0290
        L_0x02a4:
            java.lang.String r2 = "ۧۗۘۘۢ۫ۥۗ۟ۜۢۤۡۘۦۖۖ"
            goto L_0x0290
        L_0x02a7:
            java.lang.String r2 = "ۥۢ۟ۦۤۦۤۛۜۦۨۥۗۡۨ"
            goto L_0x0015
        L_0x02ab:
            com.obwhatsapp.yo.TouchImageView r2 = r3.f872d
            com.obwhatsapp.yo.TouchImageView.a(r2, r15)
            java.lang.String r2 = "ۖ۠ۜۘۡ۠ۥ۠ۜۘۛۦ۫ۦۡ۫ۚۜۘ"
            goto L_0x0015
        L_0x02b4:
            android.widget.Scroller r2 = r3.f871c
            r19 = 1
            r0 = r19
            r2.forceFinished(r0)
            java.lang.String r2 = "ۦۜۨۘۤۛۗۥۘۜۘۖۜۜ۟۫ۙۚۚۥۘۤۖۧۘ"
            goto L_0x0015
        L_0x02c1:
            com.obwhatsapp.yo.TouchImageView$State r2 = com.obwhatsapp.yo.TouchImageView.State.DRAG
            r0 = r18
            com.obwhatsapp.yo.TouchImageView.a(r0, r2)
            java.lang.String r2 = "ۛۤۥۘۛۨۛۥۛۘۢۨۨۧۙۛ۟ۢۢۖۨۥ۟۬ۜۘ۫ۧ"
            goto L_0x0015
        L_0x02cc:
            r0 = r18
            android.graphics.Matrix r2 = r0.f588i
            r0 = r18
            r0.setImageMatrix(r2)
            java.lang.String r2 = "ۦ۠ۜۖ۫ۨۘۜۛۥۘ۠۫ۡ۟ۦۥۘ"
            goto L_0x0015
        L_0x02d9:
            r2 = 1
            return r2
        L_0x02db:
            java.lang.String r2 = "ۙۥ۠ۥۚۚۧۦۥۥۧ۠ۧۜۧۘ"
            goto L_0x0015
        L_0x02df:
            java.lang.String r2 = "ۢۥۜۗۜۡۘۧ۫۠ۧ۬ۧ۬ۡۘۖۧۚۡۤۙ۟ۢ۠ۘۘ"
            goto L_0x0015
        L_0x02e3:
            java.lang.String r2 = "ۛۤۥۘۛۨۛۥۛۘۢۨۨۧۙۛ۟ۢۢۖۨۥ۟۬ۜۘ۫ۧ"
            goto L_0x0015
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.yo.u0.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
