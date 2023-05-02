package X;

/* renamed from: X.3z2  reason: invalid class name and case insensitive filesystem */
public class C79003z2 extends C16690tT {
    public final int A00 = 15;
    public final int A01;
    public final long A02;
    public final long A03;
    public final C18290wS A04;
    public final Runnable A05;
    public final String A06;

    public C79003z2(C18290wS r2, Runnable runnable, String str, int i2, long j2, long j3) {
        this.A06 = str;
        this.A01 = i2;
        this.A02 = j2;
        this.A03 = j3;
        this.A04 = r2;
        this.A05 = runnable;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        C18290wS r0 = this.A04;
        r0.A06();
        r0.A08.A0g(this.A06, this.A01, this.A00, this.A02, this.A03);
        return null;
    }

    public /* bridge */ /* synthetic */ void A0A(Object obj) {
        this.A05.run();
    }
}
