package X;

/* renamed from: X.0hA  reason: invalid class name and case insensitive filesystem */
public class C10460hA implements Runnable {
    public final /* synthetic */ C09040eo A00;
    public final /* synthetic */ C14990q7 A01;
    public final /* synthetic */ C14960q4 A02;
    public final /* synthetic */ C14930q1 A03;

    public C10460hA(C09040eo r1, C14990q7 r2, C14960q4 r3, C14930q1 r4) {
        this.A00 = r1;
        this.A02 = r3;
        this.A03 = r4;
        this.A01 = r2;
    }

    public void run() {
        C14980q6 r4 = new C14980q6(this.A02);
        C14930q1 r3 = this.A03;
        C14940q2 r2 = new C14940q2();
        r2.A03(this.A01, 0);
        r4.A01(r2.A01(), r3);
    }
}
