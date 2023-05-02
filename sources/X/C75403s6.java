package X;

/* renamed from: X.3s6  reason: invalid class name and case insensitive filesystem */
public final class C75403s6 extends C16470t7 {
    public Boolean A00;
    public Integer A01;
    public Integer A02;
    public Integer A03;
    public Integer A04;
    public Integer A05;

    public C75403s6() {
        super(3914, AnonymousClass3K3.A0d(), 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(1, this.A01);
        r3.AdT(2, this.A02);
        r3.AdT(3, this.A03);
        r3.AdT(4, this.A04);
        r3.AdT(5, this.A00);
        r3.AdT(6, this.A05);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("WamFoldableDeviceInfo {");
        C16470t7.appendFieldToStringBuilder(A0r, "deviceAspectRatioCategory", C13690nt.A0d(this.A01));
        C16470t7.appendFieldToStringBuilder(A0r, "deviceFoldMode", C13690nt.A0d(this.A02));
        C16470t7.appendFieldToStringBuilder(A0r, "deviceFoldOrientation", C13690nt.A0d(this.A03));
        C16470t7.appendFieldToStringBuilder(A0r, "deviceFoldState", C13690nt.A0d(this.A04));
        C16470t7.appendFieldToStringBuilder(A0r, "deviceIsInMultiWindowMode", this.A00);
        C16470t7.appendFieldToStringBuilder(A0r, "deviceScreenOrientation", C13690nt.A0d(this.A05));
        return AnonymousClass000.A0h("}", A0r);
    }
}
