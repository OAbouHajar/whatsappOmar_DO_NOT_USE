package X;

/* renamed from: X.3rX  reason: invalid class name and case insensitive filesystem */
public final class C75053rX extends C16470t7 {
    public Integer A00;
    public Integer A01;
    public Long A02;
    public String A03;

    public C75053rX() {
        super(3492, AnonymousClass3K3.A0d(), 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(1, this.A02);
        r3.AdT(2, this.A00);
        r3.AdT(3, this.A01);
        r3.AdT(4, this.A03);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("WamCommunityCreation {");
        C16470t7.appendFieldToStringBuilder(A0r, "communityCreationActionCount", this.A02);
        C16470t7.appendFieldToStringBuilder(A0r, "communityCreationActionTaken", C13690nt.A0d(this.A00));
        C16470t7.appendFieldToStringBuilder(A0r, "communityCreationCurrentScreen", C13690nt.A0d(this.A01));
        C16470t7.appendFieldToStringBuilder(A0r, "communityCreationSessionId", this.A03);
        return AnonymousClass000.A0h("}", A0r);
    }
}
