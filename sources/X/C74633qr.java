package X;

/* renamed from: X.3qr  reason: invalid class name and case insensitive filesystem */
public final class C74633qr extends C16470t7 {
    public String A00;
    public String A01;

    public C74633qr() {
        super(3290, AnonymousClass3K3.A0d(), 2, 0);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(1, this.A00);
        r3.AdT(2, this.A01);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("WamDirectorySearchQuery {");
        C16470t7.appendFieldToStringBuilder(A0r, "queryString", this.A00);
        C16470t7.appendFieldToStringBuilder(A0r, "searchQuerySessionId", this.A01);
        return AnonymousClass000.A0h("}", A0r);
    }
}
