package X;

/* renamed from: X.1Ni  reason: invalid class name and case insensitive filesystem */
public final class C26341Ni implements C18540wr {
    public final AnonymousClass1CG A00;
    public final AnonymousClass15P A01;

    public C26341Ni(AnonymousClass1CG r2, AnonymousClass15P r3) {
        C18450wi.A0H(r2, 1);
        C18450wi.A0H(r3, 2);
        this.A00 = r2;
        this.A01 = r3;
    }

    public void AUu(C75983t2 r4) {
        C31971fK A02;
        Integer num;
        C18450wi.A0H(r4, 0);
        r4.A0J = Boolean.valueOf(this.A01.A04());
        AnonymousClass1CG r1 = this.A00;
        synchronized (r1) {
            A02 = r1.A02();
        }
        int i2 = A02.A00;
        int i3 = 1;
        if (i2 != 0) {
            int i4 = 2;
            if (i2 != 1) {
                i3 = 3;
                if (i2 != 2) {
                    i4 = 4;
                    if (i2 != 3) {
                        i3 = 5;
                        if (i2 != 4) {
                            num = null;
                            if (i2 == 5) {
                                i4 = 6;
                            }
                            r4.A0V = num;
                        }
                    }
                }
            }
            num = Integer.valueOf(i4);
            r4.A0V = num;
        }
        num = Integer.valueOf(i3);
        r4.A0V = num;
    }
}
