package X;

/* renamed from: X.3rW  reason: invalid class name and case insensitive filesystem */
public final class C75043rW extends C16470t7 {
    public Integer A00;
    public Integer A01;
    public String A02;
    public String A03;

    public C75043rW() {
        super(3572, AnonymousClass3K3.A0d(), 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(1, this.A00);
        r3.AdT(4, this.A02);
        r3.AdT(2, this.A01);
        r3.AdT(5, this.A03);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("WamChatPsaAction {");
        C16470t7.appendFieldToStringBuilder(A0r, "messageMediaType", C13690nt.A0d(this.A00));
        C16470t7.appendFieldToStringBuilder(A0r, "psaCampaignId", this.A02);
        C16470t7.appendFieldToStringBuilder(A0r, "psaMessageActionType", C13690nt.A0d(this.A01));
        C16470t7.appendFieldToStringBuilder(A0r, "psaMsgId", this.A03);
        return AnonymousClass000.A0h("}", A0r);
    }
}
