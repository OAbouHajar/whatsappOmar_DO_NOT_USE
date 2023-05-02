package X;

/* renamed from: X.3sY  reason: invalid class name and case insensitive filesystem */
public final class C75683sY extends C16470t7 {
    public Integer A00;
    public Integer A01;
    public Long A02;
    public Long A03;
    public Long A04;
    public Long A05;
    public Long A06;
    public String A07;
    public String A08;

    public C75683sY() {
        super(1650, C16470t7.DEFAULT_SAMPLING_RATE, 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(4, this.A02);
        r3.AdT(3, this.A03);
        r3.AdT(9, this.A07);
        r3.AdT(2, this.A00);
        r3.AdT(7, this.A04);
        r3.AdT(6, this.A05);
        r3.AdT(5, this.A06);
        r3.AdT(8, this.A01);
        r3.AdT(1, this.A08);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("WamGifBatchLoad {");
        C16470t7.appendFieldToStringBuilder(A0r, "gifBatchConnectionDownloadT", this.A02);
        C16470t7.appendFieldToStringBuilder(A0r, "gifBatchConnectionSetupT", this.A03);
        C16470t7.appendFieldToStringBuilder(A0r, "gifBatchErrorMessage", this.A07);
        C16470t7.appendFieldToStringBuilder(A0r, "gifBatchEventType", C13690nt.A0d(this.A00));
        C16470t7.appendFieldToStringBuilder(A0r, "gifBatchHttpCode", this.A04);
        C16470t7.appendFieldToStringBuilder(A0r, "gifBatchOverallT", this.A05);
        C16470t7.appendFieldToStringBuilder(A0r, "gifBatchParseResponseT", this.A06);
        C16470t7.appendFieldToStringBuilder(A0r, "gifBatchResult", C13690nt.A0d(this.A01));
        C16470t7.appendFieldToStringBuilder(A0r, "gifProvider", this.A08);
        return AnonymousClass000.A0h("}", A0r);
    }
}
