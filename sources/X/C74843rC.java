package X;

/* renamed from: X.3rC  reason: invalid class name and case insensitive filesystem */
public final class C74843rC extends C16470t7 {
    public Integer A00;
    public Integer A01;
    public String A02;

    public C74843rC() {
        super(3696, AnonymousClass3K3.A0d(), 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(2, this.A02);
        r3.AdT(4, this.A00);
        r3.AdT(3, this.A01);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("WamCommunityFeatureUsage {");
        C16470t7.appendFieldToStringBuilder(A0r, "communityId", this.A02);
        C16470t7.appendFieldToStringBuilder(A0r, "communityUiAction", C13690nt.A0d(this.A00));
        C16470t7.appendFieldToStringBuilder(A0r, "communityUiFeature", C13690nt.A0d(this.A01));
        return AnonymousClass000.A0h("}", A0r);
    }
}