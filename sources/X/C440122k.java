package X;

/* renamed from: X.22k  reason: invalid class name and case insensitive filesystem */
public final class C440122k {
    public final /* synthetic */ C35001lD A00;
    public final /* synthetic */ AnonymousClass1J2 A01;
    public final /* synthetic */ C118755vC A02;
    public final /* synthetic */ String A03;

    public C440122k(C35001lD r1, AnonymousClass1J2 r2, C118755vC r3, String str) {
        this.A01 = r2;
        this.A03 = str;
        this.A02 = r3;
        this.A00 = r1;
    }

    public void A00() {
        AnonymousClass1J2 r4 = this.A01;
        r4.A02.A01 = null;
        String str = this.A03;
        C439922i A012 = r4.A01(str);
        if (A012 == null) {
            this.A02.A00(new IllegalStateException("Bloks metadata should be provided"));
            return;
        }
        C118755vC r5 = this.A02;
        r4.A01.Acq(new AnonymousClass56D(A012, this.A00, r4, r5, str));
    }
}
