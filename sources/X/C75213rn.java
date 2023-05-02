package X;

/* renamed from: X.3rn  reason: invalid class name and case insensitive filesystem */
public final class C75213rn extends C16470t7 {
    public Boolean A00;
    public Integer A01;
    public Integer A02;
    public Integer A03;
    public String A04;

    public C75213rn() {
        super(2136, AnonymousClass3K3.A0d(), 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(2, this.A01);
        r3.AdT(6, this.A04);
        r3.AdT(3, this.A02);
        r3.AdT(4, this.A00);
        r3.AdT(5, this.A03);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("WamDeepLinkOpen {");
        C16470t7.appendFieldToStringBuilder(A0r, "deepLinkOpenFrom", C13690nt.A0d(this.A01));
        C16470t7.appendFieldToStringBuilder(A0r, "deepLinkSessionId", this.A04);
        C16470t7.appendFieldToStringBuilder(A0r, "deepLinkType", C13690nt.A0d(this.A02));
        C16470t7.appendFieldToStringBuilder(A0r, "isContact", this.A00);
        C16470t7.appendFieldToStringBuilder(A0r, "linkOwnerType", C13690nt.A0d(this.A03));
        return AnonymousClass000.A0h("}", A0r);
    }
}
