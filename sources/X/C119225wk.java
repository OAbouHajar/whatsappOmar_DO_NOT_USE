package X;

/* renamed from: X.5wk  reason: invalid class name and case insensitive filesystem */
public final class C119225wk {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final AnonymousClass5wZ A05;
    public final AnonymousClass69E A06;
    public final AnonymousClass5xL A07;
    public final AnonymousClass5xL A08;
    public final AnonymousClass5xL A09;

    public C119225wk(AnonymousClass5wZ r1, AnonymousClass69E r2, AnonymousClass5xL r3, AnonymousClass5xL r4, AnonymousClass5xL r5, int i2, int i3, int i4, int i5, int i6) {
        this.A07 = r3;
        this.A09 = r4;
        this.A08 = r5;
        this.A01 = i6;
        this.A05 = r1;
        this.A00 = i2;
        this.A02 = i3;
        this.A04 = i4;
        this.A03 = i5;
        this.A06 = r2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x004e A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r3 = 1
            if (r4 == r5) goto L_0x004f
            r2 = 0
            if (r5 == 0) goto L_0x0059
            java.lang.Class<X.5wk> r1 = X.C119225wk.class
            java.lang.Class r0 = r5.getClass()
            if (r1 != r0) goto L_0x0059
            X.5wk r5 = (X.C119225wk) r5
            int r1 = r4.A00
            int r0 = r5.A00
            if (r1 != r0) goto L_0x004e
            int r1 = r4.A02
            int r0 = r5.A02
            if (r1 != r0) goto L_0x004e
            int r1 = r4.A04
            int r0 = r5.A04
            if (r1 != r0) goto L_0x004e
            int r1 = r4.A01
            int r0 = r5.A01
            if (r1 != r0) goto L_0x004e
            X.5xL r1 = r4.A07
            X.5xL r0 = r5.A07
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x004e
            X.5xL r1 = r4.A09
            X.5xL r0 = r5.A09
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x004e
            X.5xL r1 = r4.A08
            X.5xL r0 = r5.A08
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x004e
            X.5wZ r1 = r4.A05
            X.5wZ r0 = r5.A05
            if (r1 != 0) goto L_0x0050
            if (r0 == 0) goto L_0x004f
        L_0x004e:
            r3 = 0
        L_0x004f:
            return r3
        L_0x0050:
            if (r0 == 0) goto L_0x004e
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x004e
            return r3
        L_0x0059:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C119225wk.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        return ((((((((((this.A02 + 31) * 31) + this.A04) * 31) + this.A01) * 31) + this.A07.hashCode()) * 31) + this.A09.hashCode()) * 31) + this.A08.hashCode();
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("PaymentBannerConfiguration{bannerVisibility=");
        A0r.append(this.A02);
        A0r.append(", ctaButtonVisibility=");
        A0r.append(this.A04);
        A0r.append(", bannerType=");
        A0r.append(this.A01);
        A0r.append(", cta=");
        A0r.append(this.A07);
        A0r.append(", title=");
        A0r.append(this.A09);
        A0r.append(", description=");
        A0r.append(this.A08);
        A0r.append(", bannerOnClickListener=");
        A0r.append(this.A06);
        return AnonymousClass000.A0k(A0r);
    }
}
