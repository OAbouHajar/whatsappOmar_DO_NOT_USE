package X;

/* renamed from: X.3rl  reason: invalid class name and case insensitive filesystem */
public final class C75193rl extends C16470t7 {
    public Long A00;
    public Long A01;
    public Long A02;
    public Long A03;
    public String A04;

    public C75193rl() {
        super(3494, AnonymousClass3K3.A0d(), 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(1, this.A00);
        r3.AdT(2, this.A01);
        r3.AdT(3, this.A02);
        r3.AdT(4, this.A04);
        r3.AdT(5, this.A03);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("WamCommunityHomeAction {");
        C16470t7.appendFieldToStringBuilder(A0r, "communityHomeGroupDiscoveries", this.A00);
        C16470t7.appendFieldToStringBuilder(A0r, "communityHomeGroupJoins", this.A01);
        C16470t7.appendFieldToStringBuilder(A0r, "communityHomeGroupNavigations", this.A02);
        C16470t7.appendFieldToStringBuilder(A0r, "communityHomeId", this.A04);
        C16470t7.appendFieldToStringBuilder(A0r, "communityHomeViews", this.A03);
        return AnonymousClass000.A0h("}", A0r);
    }
}
