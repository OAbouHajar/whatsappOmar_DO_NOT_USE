package X;

/* renamed from: X.3sL  reason: invalid class name and case insensitive filesystem */
public final class C75553sL extends C16470t7 {
    public Integer A00;
    public Long A01;
    public Long A02;
    public Long A03;
    public Long A04;
    public Long A05;
    public String A06;

    public C75553sL() {
        super(3902, AnonymousClass3K3.A0d(), 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(1, this.A01);
        r3.AdT(2, this.A02);
        r3.AdT(3, this.A03);
        r3.AdT(4, this.A04);
        r3.AdT(5, this.A06);
        r3.AdT(6, this.A00);
        r3.AdT(7, this.A05);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("WamNonMessagePeerDataMediaUpload {");
        C16470t7.appendFieldToStringBuilder(A0r, "peerDataErrorCount", this.A01);
        C16470t7.appendFieldToStringBuilder(A0r, "peerDataExistingDataNoUploadCount", this.A02);
        C16470t7.appendFieldToStringBuilder(A0r, "peerDataNotFoundCount", this.A03);
        C16470t7.appendFieldToStringBuilder(A0r, "peerDataRequestCount", this.A04);
        C16470t7.appendFieldToStringBuilder(A0r, "peerDataRequestSessionId", this.A06);
        C16470t7.appendFieldToStringBuilder(A0r, "peerDataRequestType", C13690nt.A0d(this.A00));
        C16470t7.appendFieldToStringBuilder(A0r, "peerDataSuccessUploadCount", this.A05);
        return AnonymousClass000.A0h("}", A0r);
    }
}
