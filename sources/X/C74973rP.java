package X;

/* renamed from: X.3rP  reason: invalid class name and case insensitive filesystem */
public final class C74973rP extends C16470t7 {
    public Integer A00;
    public Long A01;
    public String A02;

    public C74973rP() {
        super(3298, AnonymousClass3K3.A0d(), 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(1, this.A00);
        r3.AdT(2, this.A01);
        r3.AdT(3, this.A02);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("WamUiRevokeAction {");
        C16470t7.appendFieldToStringBuilder(A0r, "messageAction", C13690nt.A0d(this.A00));
        C16470t7.appendFieldToStringBuilder(A0r, "uiRevokeActionDuration", this.A01);
        C16470t7.appendFieldToStringBuilder(A0r, "uiRevokeActionSessionId", this.A02);
        return AnonymousClass000.A0h("}", A0r);
    }
}
