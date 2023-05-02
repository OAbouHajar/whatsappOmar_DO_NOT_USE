package X;

/* renamed from: X.0f1  reason: invalid class name and case insensitive filesystem */
public class C09150f1 implements Cloneable {
    public float A00;
    public C03770Ju A01;

    public C09150f1(float f2) {
        this.A00 = f2;
        this.A01 = C03770Ju.px;
    }

    public C09150f1(C03770Ju r1, float f2) {
        this.A00 = f2;
        this.A01 = r1;
    }

    public float A00() {
        float f2;
        float f3;
        switch (this.A01.ordinal()) {
            case 3:
                return this.A00 * 96.0f;
            case 4:
                f2 = this.A00 * 96.0f;
                f3 = 2.54f;
                break;
            case 5:
                f2 = this.A00 * 96.0f;
                f3 = 25.4f;
                break;
            case 6:
                f2 = this.A00 * 96.0f;
                f3 = 72.0f;
                break;
            case 7:
                f2 = this.A00 * 96.0f;
                f3 = 6.0f;
                break;
            default:
                return this.A00;
        }
        return f2 / f3;
    }

    public float A01(AnonymousClass0XJ r6) {
        float sqrt;
        if (this.A01 != C03770Ju.percent) {
            return A02(r6);
        }
        AnonymousClass0UF r1 = r6.A02;
        AnonymousClass0UX r0 = r1.A02;
        if (r0 == null && (r0 = r1.A03) == null) {
            return this.A00;
        }
        float f2 = r0.A03;
        float f3 = r0.A00;
        if (f2 == f3) {
            sqrt = this.A00 * f2;
        } else {
            sqrt = this.A00 * ((float) (Math.sqrt((double) ((f2 * f2) + (f3 * f3))) / 1.414213562373095d));
        }
        return sqrt / 100.0f;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0035, code lost:
        return r2 * r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0060, code lost:
        return r2 / r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000b, code lost:
        return r3.A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public float A02(X.AnonymousClass0XJ r4) {
        /*
            r3 = this;
            X.0Ju r0 = r3.A01
            int r0 = r0.ordinal()
            switch(r0) {
                case 1: goto L_0x0017;
                case 2: goto L_0x0022;
                case 3: goto L_0x0030;
                case 4: goto L_0x0036;
                case 5: goto L_0x003f;
                case 6: goto L_0x0048;
                case 7: goto L_0x0050;
                case 8: goto L_0x000c;
                default: goto L_0x0009;
            }
        L_0x0009:
            float r0 = r3.A00
            return r0
        L_0x000c:
            X.0UF r1 = r4.A02
            X.0UX r0 = r1.A02
            if (r0 != 0) goto L_0x0058
            X.0UX r0 = r1.A03
            if (r0 != 0) goto L_0x0058
            goto L_0x0009
        L_0x0017:
            float r2 = r3.A00
            X.0UF r0 = r4.A02
            android.graphics.Paint r0 = r0.A00
            float r1 = r0.getTextSize()
            goto L_0x0034
        L_0x0022:
            float r2 = r3.A00
            X.0UF r0 = r4.A02
            android.graphics.Paint r0 = r0.A00
            float r1 = r0.getTextSize()
            r0 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r0
            goto L_0x0034
        L_0x0030:
            float r2 = r3.A00
            r1 = 1119879168(0x42c00000, float:96.0)
        L_0x0034:
            float r2 = r2 * r1
            return r2
        L_0x0036:
            float r2 = r3.A00
            r0 = 1119879168(0x42c00000, float:96.0)
            float r2 = r2 * r0
            r0 = 1076006748(0x40228f5c, float:2.54)
            goto L_0x005f
        L_0x003f:
            float r2 = r3.A00
            r0 = 1119879168(0x42c00000, float:96.0)
            float r2 = r2 * r0
            r0 = 1103835955(0x41cb3333, float:25.4)
            goto L_0x005f
        L_0x0048:
            float r2 = r3.A00
            r0 = 1119879168(0x42c00000, float:96.0)
            float r2 = r2 * r0
            r0 = 1116733440(0x42900000, float:72.0)
            goto L_0x005f
        L_0x0050:
            float r2 = r3.A00
            r0 = 1119879168(0x42c00000, float:96.0)
            float r2 = r2 * r0
            r0 = 1086324736(0x40c00000, float:6.0)
            goto L_0x005f
        L_0x0058:
            float r2 = r3.A00
            float r0 = r0.A03
            float r2 = r2 * r0
            r0 = 1120403456(0x42c80000, float:100.0)
        L_0x005f:
            float r2 = r2 / r0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C09150f1.A02(X.0XJ):float");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000c, code lost:
        r0 = r1.A03;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public float A03(X.AnonymousClass0XJ r3) {
        /*
            r2 = this;
            X.0Ju r1 = r2.A01
            X.0Ju r0 = X.C03770Ju.percent
            if (r1 != r0) goto L_0x001c
            X.0UF r1 = r3.A02
            X.0UX r0 = r1.A02
            if (r0 != 0) goto L_0x0013
            X.0UX r0 = r1.A03
            if (r0 != 0) goto L_0x0013
            float r0 = r2.A00
            return r0
        L_0x0013:
            float r1 = r2.A00
            float r0 = r0.A00
            float r1 = r1 * r0
            r0 = 1120403456(0x42c80000, float:100.0)
            float r1 = r1 / r0
            return r1
        L_0x001c:
            float r0 = r2.A02(r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C09150f1.A03(X.0XJ):float");
    }

    public float A04(AnonymousClass0XJ r3, float f2) {
        return this.A01 == C03770Ju.percent ? (this.A00 * f2) / 100.0f : A02(r3);
    }

    public boolean A05() {
        return this.A00 < 0.0f;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass000.A0o();
        A0o.append(String.valueOf(this.A00));
        return AnonymousClass000.A0f(this.A01, A0o);
    }
}
