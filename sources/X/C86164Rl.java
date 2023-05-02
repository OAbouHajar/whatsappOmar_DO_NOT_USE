package X;

/* renamed from: X.4Rl  reason: invalid class name and case insensitive filesystem */
public class C86164Rl {
    public int A00 = -1;
    public long A01;
    public AnonymousClass2BF A02;
    public final int A03;
    public final AnonymousClass2BC A04;

    public C86164Rl(AnonymousClass2BC r2, int i2) {
        this.A04 = r2;
        this.A03 = i2;
    }

    public boolean A00() {
        int i2 = this.A00;
        AnonymousClass2BC r1 = this.A04;
        if (i2 >= r1.getCount() - 1) {
            return false;
        }
        int i3 = this.A00 + 1;
        this.A00 = i3;
        AnonymousClass2BF ADR = r1.ADR(i3);
        this.A02 = ADR;
        this.A01 = ADR.ABe();
        return true;
    }
}
