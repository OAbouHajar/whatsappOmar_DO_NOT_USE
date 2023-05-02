package X;

/* renamed from: X.3sP  reason: invalid class name and case insensitive filesystem */
public final class C75593sP extends C16470t7 {
    public Integer A00;
    public Integer A01;
    public Integer A02;
    public Integer A03;
    public Integer A04;
    public Long A05;
    public String A06;
    public String A07;

    public C75593sP() {
        super(3582, AnonymousClass3K3.A0d(), 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(2, this.A00);
        r3.AdT(4, this.A05);
        r3.AdT(8, this.A06);
        r3.AdT(10, this.A01);
        r3.AdT(9, this.A07);
        r3.AdT(5, this.A02);
        r3.AdT(6, this.A03);
        r3.AdT(7, this.A04);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("WamChatPsaRemove {");
        C16470t7.appendFieldToStringBuilder(A0r, "lastReceivedMediaType", C13690nt.A0d(this.A00));
        C16470t7.appendFieldToStringBuilder(A0r, "lastReceivedMessageTs", this.A05);
        C16470t7.appendFieldToStringBuilder(A0r, "lastReceivedMsgId", this.A06);
        C16470t7.appendFieldToStringBuilder(A0r, "psaBlockReason", C13690nt.A0d(this.A01));
        C16470t7.appendFieldToStringBuilder(A0r, "psaCampaignId", this.A07);
        C16470t7.appendFieldToStringBuilder(A0r, "psaMessageRemoveAction", C13690nt.A0d(this.A02));
        C16470t7.appendFieldToStringBuilder(A0r, "psaMessageRemoveEntryPoint", C13690nt.A0d(this.A03));
        C16470t7.appendFieldToStringBuilder(A0r, "waOfficialAccountName", C13690nt.A0d(this.A04));
        return AnonymousClass000.A0h("}", A0r);
    }
}
