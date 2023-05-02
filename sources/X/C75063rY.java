package X;

/* renamed from: X.3rY  reason: invalid class name and case insensitive filesystem */
public final class C75063rY extends C16470t7 {
    public Long A00;
    public Long A01;
    public Long A02;
    public Long A03;

    public C75063rY() {
        super(3496, AnonymousClass3K3.A0d(), 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(4, this.A00);
        r3.AdT(1, this.A01);
        r3.AdT(2, this.A02);
        r3.AdT(3, this.A03);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("WamCommunityTabAction {");
        C16470t7.appendFieldToStringBuilder(A0r, "communityNoActionTabViews", this.A00);
        C16470t7.appendFieldToStringBuilder(A0r, "communityTabGroupNavigations", this.A01);
        C16470t7.appendFieldToStringBuilder(A0r, "communityTabToHomeViews", this.A02);
        C16470t7.appendFieldToStringBuilder(A0r, "communityTabViews", this.A03);
        return AnonymousClass000.A0h("}", A0r);
    }
}
