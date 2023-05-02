package X;

/* renamed from: X.3r1  reason: invalid class name and case insensitive filesystem */
public final class C74733r1 extends C16470t7 {
    public Double A00;
    public Integer A01;

    public C74733r1() {
        super(2172, C16470t7.DEFAULT_SAMPLING_RATE, 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(1, this.A00);
        r3.AdT(2, this.A01);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("WamSendDocument {");
        C16470t7.appendFieldToStringBuilder(A0r, "documentSize", this.A00);
        C16470t7.appendFieldToStringBuilder(A0r, "documentType", C13690nt.A0d(this.A01));
        return AnonymousClass000.A0h("}", A0r);
    }
}
