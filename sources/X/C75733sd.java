package X;

/* renamed from: X.3sd  reason: invalid class name and case insensitive filesystem */
public final class C75733sd extends C16470t7 {
    public Boolean A00;
    public Boolean A01;
    public Integer A02;
    public Integer A03;
    public Integer A04;
    public Integer A05;
    public Long A06;
    public Long A07;
    public Long A08;

    public C75733sd() {
        super(2244, new AnonymousClass00F(1, 1, 100), 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(6, this.A02);
        r3.AdT(3, this.A06);
        r3.AdT(1, this.A03);
        r3.AdT(2, this.A07);
        r3.AdT(11, this.A08);
        r3.AdT(10, this.A00);
        r3.AdT(4, this.A04);
        r3.AdT(9, this.A05);
        r3.AdT(5, this.A01);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("WamPsBufferUpload {");
        C16470t7.appendFieldToStringBuilder(A0r, "applicationState", C13690nt.A0d(this.A02));
        C16470t7.appendFieldToStringBuilder(A0r, "psBufferUploadHttpResponseCode", this.A06);
        C16470t7.appendFieldToStringBuilder(A0r, "psBufferUploadResult", C13690nt.A0d(this.A03));
        C16470t7.appendFieldToStringBuilder(A0r, "psBufferUploadT", this.A07);
        C16470t7.appendFieldToStringBuilder(A0r, "psDitheredT", this.A08);
        C16470t7.appendFieldToStringBuilder(A0r, "psForceUpload", this.A00);
        C16470t7.appendFieldToStringBuilder(A0r, "psTokenNotReadyReason", C13690nt.A0d(this.A04));
        C16470t7.appendFieldToStringBuilder(A0r, "psUploadReason", C13690nt.A0d(this.A05));
        C16470t7.appendFieldToStringBuilder(A0r, "waConnectedToChatd", this.A01);
        return AnonymousClass000.A0h("}", A0r);
    }
}
