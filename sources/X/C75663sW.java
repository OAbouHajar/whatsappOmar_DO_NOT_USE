package X;

/* renamed from: X.3sW  reason: invalid class name and case insensitive filesystem */
public final class C75663sW extends C16470t7 {
    public Integer A00;
    public Integer A01;
    public Integer A02;
    public Long A03;
    public Long A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;

    public C75663sW() {
        super(3502, AnonymousClass3K3.A0d(), 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(1, this.A00);
        r3.AdT(2, this.A01);
        r3.AdT(3, this.A02);
        r3.AdT(4, this.A03);
        r3.AdT(5, this.A04);
        r3.AdT(6, this.A05);
        r3.AdT(7, this.A06);
        r3.AdT(8, this.A07);
        r3.AdT(9, this.A08);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("WamBizIntegrityBannerEvent {");
        C16470t7.appendFieldToStringBuilder(A0r, "bizIntegrityBannerBannerType", C13690nt.A0d(this.A00));
        C16470t7.appendFieldToStringBuilder(A0r, "bizIntegrityBannerEventSource", C13690nt.A0d(this.A01));
        C16470t7.appendFieldToStringBuilder(A0r, "bizIntegrityBannerEventType", C13690nt.A0d(this.A02));
        C16470t7.appendFieldToStringBuilder(A0r, "timeSpent", this.A03);
        C16470t7.appendFieldToStringBuilder(A0r, "violationPriority", this.A04);
        C16470t7.appendFieldToStringBuilder(A0r, "violationSeverity", this.A05);
        C16470t7.appendFieldToStringBuilder(A0r, "violationSource", this.A06);
        C16470t7.appendFieldToStringBuilder(A0r, "violationStatus", this.A07);
        C16470t7.appendFieldToStringBuilder(A0r, "violationType", this.A08);
        return AnonymousClass000.A0h("}", A0r);
    }
}
