package X;

/* renamed from: X.3rF  reason: invalid class name and case insensitive filesystem */
public final class C74873rF extends C16470t7 {
    public Boolean A00;
    public Boolean A01;
    public String A02;

    public C74873rF() {
        super(1156, C16470t7.DEFAULT_SAMPLING_RATE, 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(2, this.A00);
        r3.AdT(1, this.A01);
        r3.AdT(3, this.A02);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("WamDeepLinkClick {");
        C16470t7.appendFieldToStringBuilder(A0r, "deepLinkHasPhoneNumber", this.A00);
        C16470t7.appendFieldToStringBuilder(A0r, "deepLinkHasText", this.A01);
        C16470t7.appendFieldToStringBuilder(A0r, "deepLinkSessionId", this.A02);
        return AnonymousClass000.A0h("}", A0r);
    }
}
