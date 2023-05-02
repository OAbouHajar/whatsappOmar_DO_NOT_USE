package X;

/* renamed from: X.12m  reason: invalid class name and case insensitive filesystem */
public class C210212m {
    public AnonymousClass2Dk A00;
    public final C16300so A01;
    public final C16980tz A02;
    public final C206911f A03;
    public final C14710pd A04;

    public C210212m(C16300so r1, C16980tz r2, C206911f r3, C14710pd r4) {
        this.A02 = r2;
        this.A04 = r4;
        this.A01 = r1;
        this.A03 = r3;
    }

    public synchronized AnonymousClass2Dk A00() {
        AnonymousClass2Dk r4;
        r4 = this.A00;
        if (r4 == null) {
            r4 = new AnonymousClass2Dk(this.A01, this.A02, this.A03, this.A04);
            this.A00 = r4;
        }
        return r4;
    }

    public synchronized void A01() {
        AnonymousClass2Dk r0 = this.A00;
        if (r0 != null) {
            r0.A03();
            this.A00.close();
            this.A00 = null;
        }
    }
}
