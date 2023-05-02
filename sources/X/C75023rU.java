package X;

/* renamed from: X.3rU  reason: invalid class name and case insensitive filesystem */
public final class C75023rU extends C16470t7 {
    public Integer A00;
    public Integer A01;
    public Integer A02;
    public Long A03;

    public C75023rU() {
        super(2064, new AnonymousClass00F(1, 20, 20), 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(4, this.A00);
        r3.AdT(1, this.A03);
        r3.AdT(3, this.A01);
        r3.AdT(2, this.A02);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("WamCameraTti {");
        C16470t7.appendFieldToStringBuilder(A0r, "cameraApi", C13690nt.A0d(this.A00));
        C16470t7.appendFieldToStringBuilder(A0r, "cameraTtiDuration", this.A03);
        C16470t7.appendFieldToStringBuilder(A0r, "cameraType", C13690nt.A0d(this.A01));
        C16470t7.appendFieldToStringBuilder(A0r, "launchType", C13690nt.A0d(this.A02));
        return AnonymousClass000.A0h("}", A0r);
    }
}
