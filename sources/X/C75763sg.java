package X;

/* renamed from: X.3sg  reason: invalid class name and case insensitive filesystem */
public final class C75763sg extends C16470t7 {
    public Boolean A00;
    public Integer A01;
    public Integer A02;
    public Long A03;
    public Long A04;
    public Long A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;

    public C75763sg() {
        super(3292, AnonymousClass3K3.A0d(), 2, 0);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(1, this.A06);
        r3.AdT(2, this.A07);
        r3.AdT(3, this.A08);
        r3.AdT(4, this.A01);
        r3.AdT(5, this.A03);
        r3.AdT(6, this.A04);
        r3.AdT(7, this.A00);
        r3.AdT(8, this.A09);
        r3.AdT(9, this.A05);
        r3.AdT(10, this.A02);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("WamCatalogCategoryView {");
        C16470t7.appendFieldToStringBuilder(A0r, "catalogCategoryId", this.A06);
        C16470t7.appendFieldToStringBuilder(A0r, "catalogOwnerJid", this.A07);
        C16470t7.appendFieldToStringBuilder(A0r, "catalogSessionId", this.A08);
        C16470t7.appendFieldToStringBuilder(A0r, "categoryBrowsingEntryPoint", C13690nt.A0d(this.A01));
        C16470t7.appendFieldToStringBuilder(A0r, "categoryItemIndex", this.A03);
        C16470t7.appendFieldToStringBuilder(A0r, "categoryLevel", this.A04);
        C16470t7.appendFieldToStringBuilder(A0r, "isLastLevel", this.A00);
        C16470t7.appendFieldToStringBuilder(A0r, "productId", this.A09);
        C16470t7.appendFieldToStringBuilder(A0r, "sequenceNumber", this.A05);
        C16470t7.appendFieldToStringBuilder(A0r, "viewAction", C13690nt.A0d(this.A02));
        return AnonymousClass000.A0h("}", A0r);
    }
}
