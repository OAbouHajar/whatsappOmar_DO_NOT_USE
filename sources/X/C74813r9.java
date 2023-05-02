package X;

/* renamed from: X.3r9  reason: invalid class name and case insensitive filesystem */
public final class C74813r9 extends C16470t7 {
    public Integer A00;
    public Integer A01;
    public Long A02;

    public C74813r9() {
        super(2068, new AnonymousClass00F(1, 20, 20), 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(3, this.A00);
        r3.AdT(1, this.A02);
        r3.AdT(2, this.A01);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("WamCameraTtSwitch {");
        C16470t7.appendFieldToStringBuilder(A0r, "cameraApi", C13690nt.A0d(this.A00));
        C16470t7.appendFieldToStringBuilder(A0r, "cameraTtSwitchDuration", this.A02);
        C16470t7.appendFieldToStringBuilder(A0r, "cameraType", C13690nt.A0d(this.A01));
        return AnonymousClass000.A0h("}", A0r);
    }
}
