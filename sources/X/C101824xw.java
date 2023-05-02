package X;

/* renamed from: X.4xw  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C101824xw implements C39541se {
    public final /* synthetic */ C16740tZ A00;
    public final /* synthetic */ boolean A01;

    public /* synthetic */ C101824xw(C16740tZ r1, boolean z2) {
        this.A00 = r1;
        this.A01 = z2;
    }

    public final void AhJ(C16740tZ r8) {
        C16740tZ r5 = this.A00;
        boolean z2 = this.A01;
        if (r8.A0t && r8.A0I == r5.A0I) {
            C28381Vw r1 = r8.A11;
            if (r1.A02 && r1.A01.equals(r5.A11.A01)) {
                r8.A0W(r5.A0C);
                int i2 = r8.A04;
                if (i2 > 0 && z2) {
                    r8.A0Z = Long.valueOf(r5.A0H + (((long) i2) * 1000));
                }
            }
        }
    }
}
