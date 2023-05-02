package X;

/* renamed from: X.3ss  reason: invalid class name and case insensitive filesystem */
public final class C75883ss extends C16470t7 {
    public Boolean A00;
    public Integer A01;
    public Integer A02;
    public Integer A03;
    public Integer A04;
    public Long A05;
    public Long A06;
    public Long A07;
    public Long A08;
    public Long A09;
    public String A0A;
    public String A0B;
    public String A0C;

    public C75883ss() {
        super(3734, AnonymousClass3K3.A0d(), 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(1, this.A01);
        r3.AdT(2, this.A02);
        r3.AdT(3, this.A0A);
        r3.AdT(9, this.A0B);
        r3.AdT(10, this.A05);
        r3.AdT(4, this.A06);
        r3.AdT(14, this.A07);
        r3.AdT(5, this.A08);
        r3.AdT(12, this.A03);
        r3.AdT(13, this.A0C);
        r3.AdT(6, this.A04);
        r3.AdT(7, this.A09);
        r3.AdT(8, this.A00);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("WamBizSearchConsumerEvents {");
        C16470t7.appendFieldToStringBuilder(A0r, "bizSearchConsumerEventType", C13690nt.A0d(this.A01));
        C16470t7.appendFieldToStringBuilder(A0r, "bizSearchSessionEntrypoint", C13690nt.A0d(this.A02));
        C16470t7.appendFieldToStringBuilder(A0r, "bizSearchSessionid", this.A0A);
        C16470t7.appendFieldToStringBuilder(A0r, "category", this.A0B);
        C16470t7.appendFieldToStringBuilder(A0r, "categoryRank", this.A05);
        C16470t7.appendFieldToStringBuilder(A0r, "cntBusinesses", this.A06);
        C16470t7.appendFieldToStringBuilder(A0r, "cntCategories", this.A07);
        C16470t7.appendFieldToStringBuilder(A0r, "cntObaBusinesses", this.A08);
        C16470t7.appendFieldToStringBuilder(A0r, "eventSource", C13690nt.A0d(this.A03));
        C16470t7.appendFieldToStringBuilder(A0r, "listOfModules", this.A0C);
        C16470t7.appendFieldToStringBuilder(A0r, "resultImpressionSource", C13690nt.A0d(this.A04));
        C16470t7.appendFieldToStringBuilder(A0r, "resultRank", this.A09);
        C16470t7.appendFieldToStringBuilder(A0r, "wasClicked", this.A00);
        return AnonymousClass000.A0h("}", A0r);
    }
}
