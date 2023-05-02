package X;

import android.support.v4.view.accessibility.AccessibilityEventCompat;

/* renamed from: X.1GD  reason: invalid class name */
public class AnonymousClass1GD {
    public final C16040sK A00;
    public final C14710pd A01;
    public final AnonymousClass1GC A02;

    public AnonymousClass1GD(C16040sK r1, C14710pd r2, AnonymousClass1GC r3) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = r3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0147, code lost:
        r3 = X.C436721a.A0I;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x014a, code lost:
        r3 = X.C436721a.A0C;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x014d, code lost:
        r3 = X.C436721a.A0D;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0153, code lost:
        r3 = X.C436721a.A0E;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0159, code lost:
        r3 = X.C436721a.A0J;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0162, code lost:
        r3 = X.C436721a.A0T;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0198, code lost:
        r3 = X.C436821b.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x019b, code lost:
        r3 = X.C436821b.A04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01a1, code lost:
        r3 = X.C436821b.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01b0, code lost:
        r3 = X.C436821b.A06;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass21Z A00(X.C16740tZ r10) {
        /*
            r9 = this;
            X.1Vt r4 = r10.A0L
            X.AnonymousClass00B.A06(r4)
            X.1Vy r0 = r4.A08
            X.AnonymousClass00B.A06(r0)
            X.21Z r0 = X.AnonymousClass21Z.A0E
            X.1Wr r2 = r0.A0U()
            int r1 = r4.A03
            r0 = 5
            if (r1 == r0) goto L_0x01cb
            boolean r0 = r4.A0G()
            if (r0 == 0) goto L_0x01cb
            java.lang.String r3 = r4.A0I
            r2.A03()
            X.1Wm r1 = r2.A00
            X.21Z r1 = (X.AnonymousClass21Z) r1
            int r0 = r1.A00
            r0 = r0 | 256(0x100, float:3.59E-43)
            r1.A00 = r0
            r1.A0A = r3
            X.1Vy r0 = r4.A08
            java.math.BigDecimal r1 = r0.A00
            r0 = 3
            java.math.BigDecimal r0 = r1.scaleByPowerOfTen(r0)
            long r5 = r0.longValue()
            r2.A03()
            X.1Wm r1 = r2.A00
            X.21Z r1 = (X.AnonymousClass21Z) r1
            int r0 = r1.A00
            r0 = r0 | 2
            r1.A00 = r0
            r1.A04 = r5
            long r5 = r4.A05
            r7 = 1000(0x3e8, double:4.94E-321)
            long r5 = r5 / r7
            r2.A03()
            X.1Wm r1 = r2.A00
            X.21Z r1 = (X.AnonymousClass21Z) r1
            int r0 = r1.A00
            r0 = r0 | 16
            r1.A00 = r0
            r1.A06 = r5
            int r0 = r4.A02
            if (r0 == 0) goto L_0x01b3
            switch(r0) {
                case 11: goto L_0x01b0;
                case 12: goto L_0x01a4;
                case 13: goto L_0x01a1;
                case 14: goto L_0x01a1;
                case 15: goto L_0x019e;
                case 16: goto L_0x019b;
                case 17: goto L_0x0198;
                case 18: goto L_0x0195;
                default: goto L_0x0063;
            }
        L_0x0063:
            switch(r0) {
                case 101: goto L_0x01b0;
                case 102: goto L_0x0192;
                case 103: goto L_0x01b0;
                case 104: goto L_0x01b0;
                case 105: goto L_0x01a1;
                case 106: goto L_0x0198;
                case 107: goto L_0x019b;
                case 108: goto L_0x01a1;
                default: goto L_0x0066;
            }
        L_0x0066:
            switch(r0) {
                case 401: goto L_0x01b0;
                case 402: goto L_0x01b6;
                case 403: goto L_0x01b0;
                case 404: goto L_0x01a1;
                case 405: goto L_0x0198;
                case 406: goto L_0x01a1;
                case 407: goto L_0x01a1;
                case 408: goto L_0x018f;
                case 409: goto L_0x01a1;
                case 410: goto L_0x01b0;
                case 411: goto L_0x01a1;
                case 412: goto L_0x01a1;
                case 413: goto L_0x01a1;
                case 414: goto L_0x01a1;
                case 415: goto L_0x01a1;
                case 416: goto L_0x019b;
                default: goto L_0x0069;
            }
        L_0x0069:
            int r0 = r4.A02
            if (r0 == 0) goto L_0x0177
            switch(r0) {
                case 11: goto L_0x0174;
                case 12: goto L_0x0171;
                case 13: goto L_0x016e;
                case 14: goto L_0x016b;
                case 15: goto L_0x0168;
                case 16: goto L_0x0165;
                case 17: goto L_0x0162;
                case 18: goto L_0x015f;
                case 19: goto L_0x015c;
                default: goto L_0x0070;
            }
        L_0x0070:
            switch(r0) {
                case 101: goto L_0x0159;
                case 102: goto L_0x0156;
                case 103: goto L_0x0153;
                case 104: goto L_0x0150;
                case 105: goto L_0x014d;
                case 106: goto L_0x0162;
                case 107: goto L_0x014a;
                case 108: goto L_0x0147;
                default: goto L_0x0073;
            }
        L_0x0073:
            switch(r0) {
                case 401: goto L_0x0159;
                case 402: goto L_0x0144;
                case 403: goto L_0x0153;
                case 404: goto L_0x0141;
                case 405: goto L_0x0162;
                case 406: goto L_0x014d;
                case 407: goto L_0x0147;
                case 408: goto L_0x013e;
                case 409: goto L_0x013b;
                case 410: goto L_0x0138;
                case 411: goto L_0x0135;
                case 412: goto L_0x0132;
                case 413: goto L_0x012f;
                case 414: goto L_0x012c;
                case 415: goto L_0x0129;
                case 416: goto L_0x014a;
                default: goto L_0x0076;
            }
        L_0x0076:
            switch(r0) {
                case 422: goto L_0x017a;
                case 423: goto L_0x0126;
                case 424: goto L_0x0123;
                default: goto L_0x0079;
            }
        L_0x0079:
            boolean r0 = r4.A0E()
            if (r0 == 0) goto L_0x00b8
            com.whatsapp.jid.UserJid r0 = r4.A0E
            if (r0 == 0) goto L_0x0096
            java.lang.String r3 = r0.getRawString()
            r2.A03()
            X.1Wm r1 = r2.A00
            X.21Z r1 = (X.AnonymousClass21Z) r1
            int r0 = r1.A00
            r0 = r0 | 4
            r1.A00 = r0
            r1.A0B = r3
        L_0x0096:
            X.1W2 r0 = r4.A0A
            if (r0 != 0) goto L_0x00b2
            r0 = 0
        L_0x009c:
            r2.A03()
            X.1Wm r4 = r2.A00
            X.21Z r4 = (X.AnonymousClass21Z) r4
            int r3 = r4.A00
            r3 = r3 | 64
            r4.A00 = r3
            r4.A05 = r0
        L_0x00ab:
            X.1Wm r0 = r2.A02()
            X.21Z r0 = (X.AnonymousClass21Z) r0
            return r0
        L_0x00b2:
            long r0 = r0.A09()
            long r0 = r0 / r7
            goto L_0x009c
        L_0x00b8:
            com.whatsapp.jid.UserJid r0 = r4.A0D
            if (r0 == 0) goto L_0x00cf
            java.lang.String r3 = r0.getRawString()
            r2.A03()
            X.1Wm r1 = r2.A00
            X.21Z r1 = (X.AnonymousClass21Z) r1
            int r0 = r1.A00
            r0 = r0 | 4
            r1.A00 = r0
            r1.A0B = r3
        L_0x00cf:
            java.lang.String r0 = r4.A0M
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x00ab
            X.1iF r0 = X.C33231iF.A05
            X.1Wr r3 = r0.A0U()
            X.1iG r3 = (X.C33241iG) r3
            java.lang.String r0 = r4.A0M
            r3.A05(r0)
            X.0sK r1 = r9.A00
            com.whatsapp.jid.UserJid r0 = r4.A0D
            boolean r0 = r1.A0I(r0)
            r3.A08(r0)
            X.1Vw r0 = r10.A11
            X.0rv r1 = r0.A00
            if (r1 == 0) goto L_0x0106
            boolean r0 = X.C16030sJ.A0L(r1)
            if (r0 == 0) goto L_0x0106
            com.whatsapp.jid.UserJid r0 = r4.A0D
            if (r0 == 0) goto L_0x0106
            java.lang.String r0 = r0.getRawString()
            r3.A06(r0)
        L_0x0106:
            java.lang.String r0 = X.C16030sJ.A03(r1)
            r3.A07(r0)
            X.1Wm r0 = r3.A02()
            X.1iF r0 = (X.C33231iF) r0
            r2.A03()
            X.1Wm r1 = r2.A00
            X.21Z r1 = (X.AnonymousClass21Z) r1
            r1.A09 = r0
            int r0 = r1.A00
            r0 = r0 | 32
            r1.A00 = r0
            goto L_0x00ab
        L_0x0123:
            X.21a r3 = X.C436721a.A0Q
            goto L_0x017c
        L_0x0126:
            X.21a r3 = X.C436721a.A0R
            goto L_0x017c
        L_0x0129:
            X.21a r3 = X.C436721a.A01
            goto L_0x017c
        L_0x012c:
            X.21a r3 = X.C436721a.A02
            goto L_0x017c
        L_0x012f:
            X.21a r3 = X.C436721a.A03
            goto L_0x017c
        L_0x0132:
            X.21a r3 = X.C436721a.A0F
            goto L_0x017c
        L_0x0135:
            X.21a r3 = X.C436721a.A0P
            goto L_0x017c
        L_0x0138:
            X.21a r3 = X.C436721a.A0H
            goto L_0x017c
        L_0x013b:
            X.21a r3 = X.C436721a.A0N
            goto L_0x017c
        L_0x013e:
            X.21a r3 = X.C436721a.A0M
            goto L_0x017c
        L_0x0141:
            X.21a r3 = X.C436721a.A0O
            goto L_0x017c
        L_0x0144:
            X.21a r3 = X.C436721a.A0K
            goto L_0x017c
        L_0x0147:
            X.21a r3 = X.C436721a.A0I
            goto L_0x017c
        L_0x014a:
            X.21a r3 = X.C436721a.A0C
            goto L_0x017c
        L_0x014d:
            X.21a r3 = X.C436721a.A0D
            goto L_0x017c
        L_0x0150:
            X.21a r3 = X.C436721a.A0G
            goto L_0x017c
        L_0x0153:
            X.21a r3 = X.C436721a.A0E
            goto L_0x017c
        L_0x0156:
            X.21a r3 = X.C436721a.A0L
            goto L_0x017c
        L_0x0159:
            X.21a r3 = X.C436721a.A0J
            goto L_0x017c
        L_0x015c:
            X.21a r3 = X.C436721a.A05
            goto L_0x017c
        L_0x015f:
            X.21a r3 = X.C436721a.A04
            goto L_0x017c
        L_0x0162:
            X.21a r3 = X.C436721a.A0T
            goto L_0x017c
        L_0x0165:
            X.21a r3 = X.C436721a.A06
            goto L_0x017c
        L_0x0168:
            X.21a r3 = X.C436721a.A0A
            goto L_0x017c
        L_0x016b:
            X.21a r3 = X.C436721a.A08
            goto L_0x017c
        L_0x016e:
            X.21a r3 = X.C436721a.A07
            goto L_0x017c
        L_0x0171:
            X.21a r3 = X.C436721a.A0B
            goto L_0x017c
        L_0x0174:
            X.21a r3 = X.C436721a.A09
            goto L_0x017c
        L_0x0177:
            X.21a r3 = X.C436721a.A0U
            goto L_0x017c
        L_0x017a:
            X.21a r3 = X.C436721a.A0S
        L_0x017c:
            r2.A03()
            X.1Wm r1 = r2.A00
            X.21Z r1 = (X.AnonymousClass21Z) r1
            int r0 = r1.A00
            r0 = r0 | 512(0x200, float:7.175E-43)
            r1.A00 = r0
            int r0 = r3.value
            r1.A03 = r0
            goto L_0x0079
        L_0x018f:
            X.21b r3 = X.C436821b.A07
            goto L_0x01b8
        L_0x0192:
            X.21b r3 = X.C436821b.A05
            goto L_0x01b8
        L_0x0195:
            X.21b r3 = X.C436821b.A01
            goto L_0x01b8
        L_0x0198:
            X.21b r3 = X.C436821b.A02
            goto L_0x01b8
        L_0x019b:
            X.21b r3 = X.C436821b.A04
            goto L_0x01b8
        L_0x019e:
            X.21b r3 = X.C436821b.A08
            goto L_0x01b8
        L_0x01a1:
            X.21b r3 = X.C436821b.A03
            goto L_0x01b8
        L_0x01a4:
            int r1 = r4.A03
            r0 = 10
            if (r1 != r0) goto L_0x01ad
            X.21b r3 = X.C436821b.A0C
            goto L_0x01b8
        L_0x01ad:
            X.21b r3 = X.C436821b.A0B
            goto L_0x01b8
        L_0x01b0:
            X.21b r3 = X.C436821b.A06
            goto L_0x01b8
        L_0x01b3:
            X.21b r3 = X.C436821b.A0A
            goto L_0x01b8
        L_0x01b6:
            X.21b r3 = X.C436821b.A09
        L_0x01b8:
            r2.A03()
            X.1Wm r1 = r2.A00
            X.21Z r1 = (X.AnonymousClass21Z) r1
            int r0 = r1.A00
            r0 = r0 | 8
            r1.A00 = r0
            int r0 = r3.value
            r1.A02 = r0
            goto L_0x0069
        L_0x01cb:
            r2.A03()
            X.1Wm r3 = r2.A00
            X.21Z r3 = (X.AnonymousClass21Z) r3
            r1 = 1
            int r0 = r3.A00
            r0 = r0 | 128(0x80, float:1.794E-43)
            r3.A00 = r0
            r3.A0C = r1
            goto L_0x00ab
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1GD.A00(X.0tZ):X.21Z");
    }

    public void A01(C30431cL r4, C16740tZ r5) {
        AnonymousClass1Vt r0;
        AnonymousClass1Vt r02 = r5.A0L;
        if (!(r02 == null || r02.A08 == null)) {
            AnonymousClass21Z A002 = A00(r5);
            r4.A03();
            C30441cM r2 = (C30441cM) r4.A00;
            r2.A0Q = A002;
            r2.A01 |= 131072;
        }
        C16740tZ A0D = r5.A0D();
        if (A0D != null && (r0 = A0D.A0L) != null && r0.A08 != null) {
            AnonymousClass21Z A003 = A00(A0D);
            r4.A03();
            C30441cM r22 = (C30441cM) r4.A00;
            r22.A0R = A003;
            r22.A01 |= AccessibilityEventCompat.TYPE_GESTURE_DETECTION_END;
        }
    }
}
