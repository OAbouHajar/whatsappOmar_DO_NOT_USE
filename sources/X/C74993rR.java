package X;

/* renamed from: X.3rR  reason: invalid class name and case insensitive filesystem */
public final class C74993rR extends C16470t7 {
    public Integer A00;
    public Integer A01;
    public Long A02;
    public String A03;

    public C74993rR() {
        super(2184, AnonymousClass3K3.A0d(), 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(1, this.A00);
        r3.AdT(4, this.A03);
        r3.AdT(2, this.A01);
        r3.AdT(3, this.A02);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("WamAndroidAddContactEvent {");
        C16470t7.appendFieldToStringBuilder(A0r, "addContactEventType", C13690nt.A0d(this.A00));
        C16470t7.appendFieldToStringBuilder(A0r, "addContactSessionId", this.A03);
        C16470t7.appendFieldToStringBuilder(A0r, "addContactSource", C13690nt.A0d(this.A01));
        C16470t7.appendFieldToStringBuilder(A0r, "phoneContactCount", this.A02);
        return AnonymousClass000.A0h("}", A0r);
    }
}
