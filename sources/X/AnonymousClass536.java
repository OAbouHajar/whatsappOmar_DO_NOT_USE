package X;

/* renamed from: X.536  reason: invalid class name */
public final /* synthetic */ class AnonymousClass536 implements C108955Qd {
    public final /* synthetic */ C606834w A00;

    public /* synthetic */ AnonymousClass536(C606834w r1) {
        this.A00 = r1;
    }

    public final void AOy(AnonymousClass29D r5) {
        C606834w r3 = this.A00;
        if (r5.A03() != 0) {
            r3.A04++;
        }
        r3.A01++;
        if (r3.A03 == 0) {
            int A04 = r3.A02.A04();
            r3.A03 = A04;
            if (A04 > 1) {
                r3.A02 = r3.A0J((long) A04);
            } else {
                r3.A03 = 0;
            }
        }
        int i2 = r3.A04;
        int i3 = r3.A02;
        if (i2 >= i3 || r3.A01 >= (i3 << 2)) {
            r3.A05.A00();
            return;
        }
        r3.A00 = 0.0f;
        r5.A0A(0);
        r5.A08();
    }
}
