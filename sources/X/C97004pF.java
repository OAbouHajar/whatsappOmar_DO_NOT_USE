package X;

/* renamed from: X.4pF  reason: invalid class name and case insensitive filesystem */
public final class C97004pF implements AnonymousClass5RA {
    public C32491gT A00;
    public C32481gS A01;
    public AnonymousClass4X5 A02;

    public C97004pF(String str) {
        C32471gR A0N = AnonymousClass3K4.A0N();
        A0N.A0R = str;
        this.A00 = new C32491gT(A0N);
    }

    public void A6b(C90504eH r14) {
        long j2;
        AnonymousClass4X5 r0 = this.A02;
        C90524eJ.A01(r0);
        long A002 = r0.A00();
        if (A002 != -9223372036854775807L) {
            C32491gT r5 = this.A00;
            if (A002 != r5.A0J) {
                C32471gR r02 = new C32471gR(r5);
                r02.A0H = A002;
                C32491gT r1 = new C32491gT(r02);
                this.A00 = r1;
                this.A01.A9D(r1);
            }
            int A003 = C90504eH.A00(r14);
            this.A01.Acw(r14, A003);
            C32481gS r6 = this.A01;
            AnonymousClass4X5 r52 = this.A02;
            synchronized (r52) {
                long j3 = r52.A01;
                j2 = -9223372036854775807L;
                if (j3 != -9223372036854775807L) {
                    j2 = r52.A02 + j3;
                } else {
                    long j4 = r52.A00;
                    if (j4 != Long.MAX_VALUE) {
                        j2 = j4;
                    }
                }
            }
            r6.Ad0((C86824Uh) null, 1, A003, 0, j2);
        }
    }

    public void AI2(C15060qG r3, AnonymousClass4WV r4, AnonymousClass4X5 r5) {
        this.A02 = r5;
        r4.A03();
        C32481gS Ah1 = r3.Ah1(r4.A01(), 5);
        this.A01 = Ah1;
        Ah1.A9D(this.A00);
    }
}
