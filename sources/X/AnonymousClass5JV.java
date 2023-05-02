package X;

/* renamed from: X.5JV  reason: invalid class name */
public class AnonymousClass5JV extends AnonymousClass5AG {
    public AnonymousClass5JV() {
    }

    public AnonymousClass5JV(AnonymousClass5JV r1) {
        super(r1);
    }

    public AnonymousClass5SH A6m() {
        return new AnonymousClass5JV(this);
    }

    public int A8A(byte[] bArr, int i2) {
        AnonymousClass5AG.A03(this, bArr, i2);
        reset();
        return 48;
    }

    public String A9q() {
        return "SHA-384";
    }

    public int ABn() {
        return 48;
    }

    public void AcP(AnonymousClass5SH r1) {
        super.A05((AnonymousClass5AG) r1);
    }

    public void reset() {
        super.reset();
        this.A02 = -3766243637369397544L;
        this.A03 = 7105036623409894663L;
        this.A04 = -7973340178411365097L;
        this.A05 = 1526699215303891257L;
        this.A06 = 7436329637833083697L;
        this.A07 = -8163818279084223215L;
        this.A08 = -2662702644619276377L;
        this.A09 = 5167115440072839076L;
    }
}
