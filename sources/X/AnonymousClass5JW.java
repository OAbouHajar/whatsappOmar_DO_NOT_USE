package X;

/* renamed from: X.5JW  reason: invalid class name */
public class AnonymousClass5JW extends AnonymousClass5AG {
    public AnonymousClass5JW() {
    }

    public AnonymousClass5JW(AnonymousClass5JW r1) {
        super(r1);
    }

    public AnonymousClass5SH A6m() {
        return new AnonymousClass5JW(this);
    }

    public int A8A(byte[] bArr, int i2) {
        AnonymousClass5AG.A03(this, bArr, i2);
        C31461eE.A04(bArr, i2 + 48, this.A08);
        C31461eE.A04(bArr, i2 + 56, this.A09);
        reset();
        return 64;
    }

    public String A9q() {
        return "SHA-512";
    }

    public int ABn() {
        return 64;
    }

    public void AcP(AnonymousClass5SH r1) {
        A05((AnonymousClass5AG) r1);
    }

    public void reset() {
        super.reset();
        this.A02 = 7640891576956012808L;
        this.A03 = -4942790177534073029L;
        this.A04 = 4354685564936845355L;
        this.A05 = -6534734903238641935L;
        this.A06 = 5840696475078001361L;
        this.A07 = -7276294671716946913L;
        this.A08 = 2270897969802886507L;
        this.A09 = 6620516959819538809L;
    }
}
