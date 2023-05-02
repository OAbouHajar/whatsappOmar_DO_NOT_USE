package X;

/* renamed from: X.4x0  reason: invalid class name and case insensitive filesystem */
public class C101274x0 implements C109555Sp {
    public long A00;
    public String A01;
    public final AnonymousClass19E A02;
    public final C16440t3 A03;
    public final C16490t9 A04;
    public final C16320sq A05;

    public C101274x0(AnonymousClass19E r1, C16440t3 r2, C16490t9 r3, C16320sq r4) {
        this.A03 = r2;
        this.A05 = r4;
        this.A04 = r3;
        this.A02 = r1;
    }

    public void AKP(int i2) {
        AKQ(1, -1);
    }

    public void AKQ(int i2, long j2) {
        long j3 = this.A00;
        this.A05.Acl(new AnonymousClass567(this, this.A01, i2, j3, j2));
    }

    public void AKZ() {
        long j2 = this.A00;
        this.A05.Acl(new AnonymousClass567(this, this.A01, 4, j2, 0));
    }

    public void AVx(String str) {
        this.A00 = C13690nt.A09(this.A03.A00());
        this.A01 = str;
    }
}
