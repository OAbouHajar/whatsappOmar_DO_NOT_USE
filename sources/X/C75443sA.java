package X;

/* renamed from: X.3sA  reason: invalid class name and case insensitive filesystem */
public final class C75443sA extends C16470t7 {
    public Integer A00;
    public Long A01;
    public Long A02;
    public Long A03;
    public Long A04;
    public String A05;

    public C75443sA() {
        super(3806, AnonymousClass3K3.A0d(), 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(1, this.A05);
        r3.AdT(2, this.A01);
        r3.AdT(3, this.A02);
        r3.AdT(4, this.A03);
        r3.AdT(5, this.A04);
        r3.AdT(6, this.A00);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("WamPnhDaily {");
        C16470t7.appendFieldToStringBuilder(A0r, "communityId", this.A05);
        C16470t7.appendFieldToStringBuilder(A0r, "pnhIndicatorClicksChat", this.A01);
        C16470t7.appendFieldToStringBuilder(A0r, "pnhIndicatorClicksInfoScreen", this.A02);
        C16470t7.appendFieldToStringBuilder(A0r, "reactionDeleteCount", this.A03);
        C16470t7.appendFieldToStringBuilder(A0r, "reactionOpenTrayCount", this.A04);
        C16470t7.appendFieldToStringBuilder(A0r, "typeOfGroup", C13690nt.A0d(this.A00));
        return AnonymousClass000.A0h("}", A0r);
    }
}
