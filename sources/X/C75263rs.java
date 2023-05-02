package X;

/* renamed from: X.3rs  reason: invalid class name and case insensitive filesystem */
public final class C75263rs extends C16470t7 {
    public Integer A00;
    public Long A01;
    public Long A02;
    public Long A03;
    public String A04;

    public C75263rs() {
        super(2576, AnonymousClass3K3.A0d(), 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(8, this.A01);
        r3.AdT(6, this.A02);
        r3.AdT(4, this.A00);
        r3.AdT(1, this.A04);
        r3.AdT(7, this.A03);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("WamMdLinkDeviceCompanion {");
        C16470t7.appendFieldToStringBuilder(A0r, "mdDurationS", this.A01);
        C16470t7.appendFieldToStringBuilder(A0r, "mdLinkDeviceCompanionErrorCode", this.A02);
        C16470t7.appendFieldToStringBuilder(A0r, "mdLinkDeviceCompanionStage", C13690nt.A0d(this.A00));
        C16470t7.appendFieldToStringBuilder(A0r, "mdSessionId", this.A04);
        C16470t7.appendFieldToStringBuilder(A0r, "mdTimestampS", this.A03);
        return AnonymousClass000.A0h("}", A0r);
    }
}
