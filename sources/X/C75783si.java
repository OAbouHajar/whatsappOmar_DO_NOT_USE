package X;

/* renamed from: X.3si  reason: invalid class name and case insensitive filesystem */
public final class C75783si extends C16470t7 {
    public Boolean A00;
    public Boolean A01;
    public Boolean A02;
    public Boolean A03;
    public Integer A04;
    public Integer A05;
    public Integer A06;
    public Long A07;
    public Long A08;
    public Long A09;

    public C75783si() {
        super(2494, new AnonymousClass00F(1, 1000, 2000), 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(5, this.A00);
        r3.AdT(3, this.A04);
        r3.AdT(10, this.A07);
        r3.AdT(1, this.A08);
        r3.AdT(6, this.A01);
        r3.AdT(7, this.A02);
        r3.AdT(2, this.A09);
        r3.AdT(8, this.A03);
        r3.AdT(9, this.A05);
        r3.AdT(4, this.A06);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("WamMessageStanzaReceive {");
        C16470t7.appendFieldToStringBuilder(A0r, "hasSenderKeyDistributionMessage", this.A00);
        C16470t7.appendFieldToStringBuilder(A0r, "mediaType", C13690nt.A0d(this.A04));
        C16470t7.appendFieldToStringBuilder(A0r, "messageStanzaDecryptQueueSize", this.A07);
        C16470t7.appendFieldToStringBuilder(A0r, "messageStanzaDuration", this.A08);
        C16470t7.appendFieldToStringBuilder(A0r, "messageStanzaE2eSuccess", this.A01);
        C16470t7.appendFieldToStringBuilder(A0r, "messageStanzaIsEphemeral", this.A02);
        C16470t7.appendFieldToStringBuilder(A0r, "messageStanzaOfflineCount", this.A09);
        C16470t7.appendFieldToStringBuilder(A0r, "messageStanzaRevoke", this.A03);
        C16470t7.appendFieldToStringBuilder(A0r, "messageStanzaStage", C13690nt.A0d(this.A05));
        C16470t7.appendFieldToStringBuilder(A0r, "messageType", C13690nt.A0d(this.A06));
        return AnonymousClass000.A0h("}", A0r);
    }
}
