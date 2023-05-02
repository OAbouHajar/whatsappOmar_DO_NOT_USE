package X;

/* renamed from: X.16z  reason: invalid class name and case insensitive filesystem */
public final class C221916z {
    public final C16490t9 A00;
    public final C18040w3 A01;

    public C221916z(C16490t9 r2, C18040w3 r3) {
        C18450wi.A0H(r2, 1);
        C18450wi.A0H(r3, 2);
        this.A00 = r2;
        this.A01 = r3;
    }

    public final void A00(AnonymousClass1ZX r5, int i2, int i3, boolean z2) {
        C18450wi.A0H(r5, 0);
        C41221vR r3 = new C41221vR();
        r3.A00 = Integer.valueOf(i2);
        r3.A03 = Integer.valueOf(i3);
        int i4 = 1;
        r3.A02 = 1;
        r3.A04 = this.A01.A03(r5.getRawString());
        if (!z2) {
            i4 = 2;
        }
        r3.A01 = i4;
        this.A00.A06(r3);
    }
}
