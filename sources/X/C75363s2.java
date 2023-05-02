package X;

/* renamed from: X.3s2  reason: invalid class name and case insensitive filesystem */
public final class C75363s2 extends C16470t7 {
    public Integer A00;
    public Integer A01;
    public Integer A02;
    public Integer A03;
    public Long A04;
    public String A05;

    public C75363s2() {
        super(2066, new AnonymousClass00F(1, 20, 20), 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(8, this.A00);
        r3.AdT(2, this.A01);
        r3.AdT(1, this.A04);
        r3.AdT(7, this.A02);
        r3.AdT(3, this.A03);
        r3.AdT(5, this.A05);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("WamCameraTtc {");
        C16470t7.appendFieldToStringBuilder(A0r, "cameraApi", C13690nt.A0d(this.A00));
        C16470t7.appendFieldToStringBuilder(A0r, "cameraFacing", C13690nt.A0d(this.A01));
        C16470t7.appendFieldToStringBuilder(A0r, "cameraTtcDuration", this.A04);
        C16470t7.appendFieldToStringBuilder(A0r, "cameraType", C13690nt.A0d(this.A02));
        C16470t7.appendFieldToStringBuilder(A0r, "flashMode", C13690nt.A0d(this.A03));
        C16470t7.appendFieldToStringBuilder(A0r, "requestedPhotoResolution", this.A05);
        return AnonymousClass000.A0h("}", A0r);
    }
}
