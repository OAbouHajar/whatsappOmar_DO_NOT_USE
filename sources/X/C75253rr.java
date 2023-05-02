package X;

/* renamed from: X.3rr  reason: invalid class name and case insensitive filesystem */
public final class C75253rr extends C16470t7 {
    public Integer A00;
    public Integer A01;
    public Integer A02;
    public Long A03;
    public String A04;

    public C75253rr() {
        super(3206, AnonymousClass3K3.A0d(), 2, 0);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(4, this.A04);
        r3.AdT(5, this.A00);
        r3.AdT(1, this.A01);
        r3.AdT(3, this.A03);
        r3.AdT(2, this.A02);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("WamGraphqlCatalogRequest {");
        C16470t7.appendFieldToStringBuilder(A0r, "businessJid", this.A04);
        C16470t7.appendFieldToStringBuilder(A0r, "businessType", C13690nt.A0d(this.A00));
        C16470t7.appendFieldToStringBuilder(A0r, "graphqlCatalogEndpoint", C13690nt.A0d(this.A01));
        C16470t7.appendFieldToStringBuilder(A0r, "graphqlErrorCode", this.A03);
        C16470t7.appendFieldToStringBuilder(A0r, "graphqlRequestResult", C13690nt.A0d(this.A02));
        return AnonymousClass000.A0h("}", A0r);
    }
}
