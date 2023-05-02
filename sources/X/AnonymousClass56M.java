package X;

/* renamed from: X.56M  reason: invalid class name */
public final /* synthetic */ class AnonymousClass56M implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C16180sb A01;
    public final /* synthetic */ C16440t3 A02;
    public final /* synthetic */ C16490t9 A03;
    public final /* synthetic */ AnonymousClass1CW A04;
    public final /* synthetic */ String A05;

    public /* synthetic */ AnonymousClass56M(C16180sb r1, C16440t3 r2, C16490t9 r3, AnonymousClass1CW r4, String str, int i2) {
        this.A05 = str;
        this.A00 = i2;
        this.A01 = r1;
        this.A02 = r2;
        this.A04 = r4;
        this.A03 = r3;
    }

    public final void run() {
        String str = this.A05;
        int i2 = this.A00;
        C16180sb r3 = this.A01;
        C16440t3 r2 = this.A02;
        AnonymousClass1CW r1 = this.A04;
        C16490t9 r4 = this.A03;
        long A002 = C14740pg.A00(r3, new C41721wT(r2, r1));
        C75573sN r12 = new C75573sN();
        AnonymousClass4Y3.A01(r12, str, 2, i2);
        r12.A05 = Long.valueOf(A002);
        r4.A06(r12);
    }
}
