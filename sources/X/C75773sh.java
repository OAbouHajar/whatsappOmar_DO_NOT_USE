package X;

/* renamed from: X.3sh  reason: invalid class name and case insensitive filesystem */
public final class C75773sh extends C16470t7 {
    public Integer A00;
    public Long A01;
    public Long A02;
    public Long A03;
    public Long A04;
    public Long A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;

    public C75773sh() {
        super(3062, AnonymousClass3K3.A0d(), 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(9, this.A01);
        r3.AdT(10, this.A02);
        r3.AdT(3, this.A00);
        r3.AdT(5, this.A03);
        r3.AdT(6, this.A04);
        r3.AdT(2, this.A06);
        r3.AdT(8, this.A07);
        r3.AdT(4, this.A05);
        r3.AdT(7, this.A08);
        r3.AdT(1, this.A09);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("WamDirectorySearchConsumerServerErrors {");
        C16470t7.appendFieldToStringBuilder(A0r, "directorySearchAcsErrorCode", this.A01);
        C16470t7.appendFieldToStringBuilder(A0r, "directorySearchAcsTokenNotReadyReason", this.A02);
        C16470t7.appendFieldToStringBuilder(A0r, "directorySearchCallType", C13690nt.A0d(this.A00));
        C16470t7.appendFieldToStringBuilder(A0r, "directorySearchErrorApiErrorCode", this.A03);
        C16470t7.appendFieldToStringBuilder(A0r, "directorySearchErrorApiErrorSubCode", this.A04);
        C16470t7.appendFieldToStringBuilder(A0r, "directorySearchErrorEntrypoint", this.A06);
        C16470t7.appendFieldToStringBuilder(A0r, "directorySearchErrorFbtraceId", this.A07);
        C16470t7.appendFieldToStringBuilder(A0r, "directorySearchErrorHttpResponseCode", this.A05);
        C16470t7.appendFieldToStringBuilder(A0r, "directorySearchErrorMessage", this.A08);
        C16470t7.appendFieldToStringBuilder(A0r, "directorySessionId", this.A09);
        return AnonymousClass000.A0h("}", A0r);
    }
}
