package X;

/* renamed from: X.66X  reason: invalid class name */
public final /* synthetic */ class AnonymousClass66X implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ C110605eV A02;

    public /* synthetic */ AnonymousClass66X(C110605eV r1, long j2, long j3) {
        this.A02 = r1;
        this.A00 = j2;
        this.A01 = j3;
    }

    public final void run() {
        C110605eV r7 = this.A02;
        long j2 = this.A00;
        long j3 = this.A01;
        AnonymousClass5xC r6 = C110115dX.A0K(r7.A01).A0B;
        AnonymousClass00B.A06(r6);
        AnonymousClass5x8 r1 = new AnonymousClass5x8();
        r1.A02 = "PAUSE";
        r1.A03 = "PENDING";
        r1.A01 = j2;
        r1.A00 = j3;
        r6.A0B = r1;
        C18290wS r0 = r7.A0A;
        r0.A06();
        r0.A08.A0j(r7.A01);
        r7.A04.A0K(new C1212564u(r7));
    }
}
