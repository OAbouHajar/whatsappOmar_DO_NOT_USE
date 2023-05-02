package X;

import java.util.concurrent.TimeUnit;

/* renamed from: X.13K  reason: invalid class name */
public final class AnonymousClass13K {
    public final C16490t9 A00;

    public AnonymousClass13K(C16490t9 r2) {
        C18450wi.A0H(r2, 1);
        this.A00 = r2;
    }

    public final void A00(int i2, long j2, int i3) {
        C16490t9 r4 = this.A00;
        C46302Dm r3 = new C46302Dm();
        r3.A01 = Long.valueOf((long) i2);
        r3.A00 = Integer.valueOf(i3);
        r3.A03 = 2L;
        if (j2 > 0) {
            r3.A02 = Long.valueOf(TimeUnit.SECONDS.toMinutes(j2));
        }
        r4.A04(r3);
    }
}
