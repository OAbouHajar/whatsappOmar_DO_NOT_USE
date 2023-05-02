package X;

/* renamed from: X.3qq  reason: invalid class name and case insensitive filesystem */
public final class C74623qq extends C16470t7 {
    public Integer A00;
    public String A01;

    public C74623qq() {
        super(3436, AnonymousClass3K3.A0d(), 2, 0);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(1, this.A00);
        r3.AdT(2, this.A01);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("WamDirectoryBusinessProfileViewsEvent {");
        C16470t7.appendFieldToStringBuilder(A0r, "businessProfileEvent", C13690nt.A0d(this.A00));
        C16470t7.appendFieldToStringBuilder(A0r, "directoryBusinessJid", this.A01);
        return AnonymousClass000.A0h("}", A0r);
    }
}
