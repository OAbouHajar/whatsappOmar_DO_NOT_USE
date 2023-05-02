package X;

/* renamed from: X.5I3  reason: invalid class name */
public class AnonymousClass5I3 extends C32061fa {
    public C33041hq A00;
    public C33041hq A01;
    public C32411gJ A02;
    public AnonymousClass5HY A03;
    public AnonymousClass5HY A04;
    public AnonymousClass5IQ A05;
    public AnonymousClass5IQ A06;
    public AnonymousClass5II A07;
    public C107335Hu A08;
    public C107365Hx A09;
    public AnonymousClass5IO A0A;
    public AnonymousClass5IO A0B;

    /* JADX WARNING: Removed duplicated region for block: B:41:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x008a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass5I3(X.C32411gJ r8) {
        /*
            r7 = this;
            r7.<init>()
            r7.A02 = r8
            r4 = 0
            X.1fb r0 = r8.A0C(r4)
            boolean r2 = r0 instanceof X.C107525In
            r0 = 0
            r3 = 1
            if (r2 == 0) goto L_0x00fa
            X.1fb r2 = r8.A0C(r4)
            X.5In r2 = (X.C107525In) r2
            X.1hq r2 = X.C33041hq.A01(r2, r3)
            r7.A01 = r2
            r5 = 0
        L_0x001e:
            java.math.BigInteger r0 = java.math.BigInteger.valueOf(r0)
            boolean r0 = r2.A0B(r0)
            if (r0 == 0) goto L_0x00d4
            r2 = 1
        L_0x0029:
            r6 = 0
        L_0x002a:
            int r0 = r5 + 1
            X.1fb r0 = r8.A0C(r0)
            X.1hq r0 = X.C33041hq.A00(r0)
            r7.A00 = r0
            int r0 = r5 + 2
            X.1fb r0 = r8.A0C(r0)
            X.5II r0 = X.AnonymousClass5II.A00(r0)
            r7.A07 = r0
            int r0 = r5 + 3
            X.1fb r0 = r8.A0C(r0)
            X.5IQ r0 = X.AnonymousClass5IQ.A01(r0)
            r7.A05 = r0
            int r0 = r5 + 4
            X.1fb r1 = r8.A0C(r0)
            X.1gJ r1 = (X.C32411gJ) r1
            X.1fb r0 = r1.A0C(r4)
            X.5IO r0 = X.AnonymousClass5IO.A00(r0)
            r7.A0B = r0
            X.1fb r0 = r1.A0C(r3)
            X.5IO r0 = X.AnonymousClass5IO.A00(r0)
            r7.A0A = r0
            int r0 = r5 + 5
            X.1fb r0 = r8.A0C(r0)
            X.5IQ r0 = X.AnonymousClass5IQ.A01(r0)
            r7.A06 = r0
            int r5 = r5 + 6
            X.1fb r0 = r8.A0C(r5)
            X.5Hx r0 = X.C107365Hx.A00(r0)
            r7.A09 = r0
            int r4 = r8.A0A()
            int r4 = r4 - r5
            int r4 = r4 - r3
            if (r4 == 0) goto L_0x0104
            if (r2 == 0) goto L_0x0093
            java.lang.String r0 = "version 1 certificate contains extra data"
        L_0x008e:
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0T(r0)
            throw r0
        L_0x0093:
            if (r4 <= 0) goto L_0x0104
            int r0 = r5 + r4
            X.1fb r2 = r8.A0C(r0)
            X.5In r2 = (X.C107525In) r2
            int r1 = r2.A00
            if (r1 == r3) goto L_0x00bd
            r0 = 2
            if (r1 == r0) goto L_0x00b6
            r0 = 3
            if (r1 != r0) goto L_0x00c7
            if (r6 != 0) goto L_0x00c4
            X.1gJ r0 = X.C32411gJ.A01(r2, r3)
            X.5Hu r0 = X.C107335Hu.A01(r0)
            r7.A08 = r0
        L_0x00b3:
            int r4 = r4 + -1
            goto L_0x0093
        L_0x00b6:
            X.5HY r0 = X.AnonymousClass5HY.A01(r2)
            r7.A04 = r0
            goto L_0x00b3
        L_0x00bd:
            X.5HY r0 = X.AnonymousClass5HY.A01(r2)
            r7.A03 = r0
            goto L_0x00b3
        L_0x00c4:
            java.lang.String r0 = "version 2 certificate cannot contain extensions"
            goto L_0x008e
        L_0x00c7:
            java.lang.String r0 = "Unknown tag encountered in structure: "
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)
            int r0 = r2.A00
            java.lang.String r0 = X.AnonymousClass000.A0l(r1, r0)
            goto L_0x008e
        L_0x00d4:
            X.1hq r2 = r7.A01
            r0 = 1
            java.math.BigInteger r0 = java.math.BigInteger.valueOf(r0)
            boolean r0 = r2.A0B(r0)
            if (r0 == 0) goto L_0x00e6
            r2 = 0
            r6 = 1
            goto L_0x002a
        L_0x00e6:
            X.1hq r2 = r7.A01
            r0 = 2
            java.math.BigInteger r0 = java.math.BigInteger.valueOf(r0)
            boolean r0 = r2.A0B(r0)
            if (r0 == 0) goto L_0x00f7
            r2 = 0
            goto L_0x0029
        L_0x00f7:
            java.lang.String r0 = "version number not recognised"
            goto L_0x008e
        L_0x00fa:
            X.1hq r2 = new X.1hq
            r2.<init>((long) r0)
            r7.A01 = r2
            r5 = -1
            goto L_0x001e
        L_0x0104:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5I3.<init>(X.1gJ):void");
    }

    public static AnonymousClass5I3 A00(Object obj) {
        if (obj instanceof AnonymousClass5I3) {
            return (AnonymousClass5I3) obj;
        }
        if (obj != null) {
            return new AnonymousClass5I3(C32411gJ.A00(obj));
        }
        return null;
    }

    public C32051fZ Agm() {
        if (C89714cm.A00("org.spongycastle.x509.allow_non-der_tbscert") == null || C89714cm.A01("org.spongycastle.x509.allow_non-der_tbscert")) {
            return this.A02;
        }
        C32391gH r4 = new C32391gH();
        C33041hq r1 = this.A01;
        if (!r1.A0B(AnonymousClass4BE.A04)) {
            C107525In.A03(r1, r4, 0, true);
        }
        r4.A02(this.A00);
        r4.A02(this.A07);
        r4.A02(this.A05);
        C32391gH r12 = new C32391gH(2);
        r12.A02(this.A0B);
        r4.A02(AnonymousClass3K3.A0x(this.A0A, r12));
        C32071fb r0 = this.A06;
        if (r0 == null) {
            r0 = new C32401gI();
        }
        r4.A02(r0);
        r4.A02(this.A09);
        AnonymousClass5HY r02 = this.A03;
        if (r02 != null) {
            C107525In.A03(r02, r4, 1, false);
        }
        AnonymousClass5HY r03 = this.A04;
        if (r03 != null) {
            C107525In.A03(r03, r4, 2, false);
        }
        C107335Hu r13 = this.A08;
        if (r13 != null) {
            C107525In.A03(r13, r4, 3, true);
        }
        return new C32401gI(r4);
    }
}
