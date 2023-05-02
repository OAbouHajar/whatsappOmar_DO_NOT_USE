package X;

/* renamed from: X.3sC  reason: invalid class name and case insensitive filesystem */
public final class C75463sC extends C16470t7 {
    public Integer A00;
    public Integer A01;
    public Integer A02;
    public Integer A03;
    public String A04;
    public String A05;

    public C75463sC() {
        super(3052, AnonymousClass3K3.A0d(), 2, 0);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(1, this.A00);
        r3.AdT(7, this.A04);
        r3.AdT(3, this.A01);
        r3.AdT(5, this.A05);
        r3.AdT(4, this.A02);
        r3.AdT(2, this.A03);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("WamPsStructuredMessageInteraction {");
        C16470t7.appendFieldToStringBuilder(A0r, "bizPlatform", C13690nt.A0d(this.A00));
        C16470t7.appendFieldToStringBuilder(A0r, "businessOwnerJid", this.A04);
        C16470t7.appendFieldToStringBuilder(A0r, "messageClass", C13690nt.A0d(this.A01));
        C16470t7.appendFieldToStringBuilder(A0r, "messageClassAttributes", this.A05);
        C16470t7.appendFieldToStringBuilder(A0r, "messageInteraction", C13690nt.A0d(this.A02));
        C16470t7.appendFieldToStringBuilder(A0r, "messageMediaType", C13690nt.A0d(this.A03));
        return AnonymousClass000.A0h("}", A0r);
    }
}
