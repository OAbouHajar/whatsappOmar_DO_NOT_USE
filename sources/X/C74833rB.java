package X;

/* renamed from: X.3rB  reason: invalid class name and case insensitive filesystem */
public final class C74833rB extends C16470t7 {
    public Integer A00;
    public String A01;
    public String A02;

    public C74833rB() {
        super(3574, AnonymousClass3K3.A0d(), 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(1, this.A00);
        r3.AdT(4, this.A01);
        r3.AdT(5, this.A02);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("WamChatPsaRead {");
        C16470t7.appendFieldToStringBuilder(A0r, "messageMediaType", C13690nt.A0d(this.A00));
        C16470t7.appendFieldToStringBuilder(A0r, "psaCampaignId", this.A01);
        C16470t7.appendFieldToStringBuilder(A0r, "psaMsgId", this.A02);
        return AnonymousClass000.A0h("}", A0r);
    }
}
