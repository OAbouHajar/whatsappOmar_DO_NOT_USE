package X;

/* renamed from: X.3qb  reason: invalid class name and case insensitive filesystem */
public final class C74473qb extends C16470t7 {
    public Integer A00;

    public C74473qb() {
        super(3200, AnonymousClass3K3.A0d(), 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(1, this.A00);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("WamStatusPrivacySettings {");
        C16470t7.appendFieldToStringBuilder(A0r, "setting", C13690nt.A0d(this.A00));
        return AnonymousClass000.A0h("}", A0r);
    }
}
