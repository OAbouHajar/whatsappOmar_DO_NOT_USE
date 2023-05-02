package X;

/* renamed from: X.3sM  reason: invalid class name and case insensitive filesystem */
public final class C75563sM extends C16470t7 {
    public Integer A00;
    public Integer A01;
    public Long A02;
    public Long A03;
    public String A04;
    public String A05;
    public String A06;

    public C75563sM() {
        super(3548, AnonymousClass3K3.A0d(), 2, 0);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(1, this.A04);
        r3.AdT(2, this.A05);
        r3.AdT(3, this.A06);
        r3.AdT(4, this.A00);
        r3.AdT(5, this.A02);
        r3.AdT(6, this.A01);
        r3.AdT(7, this.A03);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("WamProductSearch {");
        C16470t7.appendFieldToStringBuilder(A0r, "catalogOwnerJid", this.A04);
        C16470t7.appendFieldToStringBuilder(A0r, "catalogSessionId", this.A05);
        C16470t7.appendFieldToStringBuilder(A0r, "productId", this.A06);
        C16470t7.appendFieldToStringBuilder(A0r, "searchEntryPoint", C13690nt.A0d(this.A00));
        C16470t7.appendFieldToStringBuilder(A0r, "searchResultIndex", this.A02);
        C16470t7.appendFieldToStringBuilder(A0r, "searchViewAction", C13690nt.A0d(this.A01));
        C16470t7.appendFieldToStringBuilder(A0r, "sequenceNumber", this.A03);
        return AnonymousClass000.A0h("}", A0r);
    }
}
