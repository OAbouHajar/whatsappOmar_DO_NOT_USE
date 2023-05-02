package X;

/* renamed from: X.1L9  reason: invalid class name */
public class AnonymousClass1L9 {
    public int A00 = 0;
    public long A01;
    public String A02;
    public boolean A03;
    public final C16440t3 A04;
    public final C16490t9 A05;
    public final AnonymousClass00F A06;

    public AnonymousClass1L9(C16440t3 r3, C16490t9 r4) {
        AnonymousClass00F r1 = C16470t7.DEFAULT_SAMPLING_RATE;
        this.A04 = r3;
        this.A05 = r4;
        this.A06 = r1;
    }

    public final void A00(int i2) {
        C74973rP r6 = new C74973rP();
        boolean z2 = false;
        if (this.A02 != null) {
            z2 = true;
        }
        AnonymousClass00B.A0B("RevokeUiActionWamEventLogger/logNextEvent: A session must be started before logging.", z2);
        r6.A02 = this.A02;
        r6.A00 = Integer.valueOf(i2);
        long A002 = this.A04.A00();
        r6.A01 = Long.valueOf(A002 - this.A01);
        this.A01 = A002;
        this.A05.A04(r6);
    }
}
