package X;

/* renamed from: X.3so  reason: invalid class name and case insensitive filesystem */
public final class C75843so extends C16470t7 {
    public Integer A00;
    public Integer A01;
    public Integer A02;
    public Integer A03;
    public Long A04;
    public Long A05;
    public Long A06;
    public Long A07;
    public Long A08;
    public Long A09;
    public String A0A;
    public String A0B;

    public C75843so() {
        super(2636, C16470t7.DEFAULT_SAMPLING_RATE, 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(10, this.A00);
        r3.AdT(6, this.A01);
        r3.AdT(7, this.A02);
        r3.AdT(9, this.A0A);
        r3.AdT(2, this.A04);
        r3.AdT(1, this.A05);
        r3.AdT(5, this.A06);
        r3.AdT(4, this.A07);
        r3.AdT(8, this.A0B);
        r3.AdT(12, this.A08);
        r3.AdT(3, this.A03);
        r3.AdT(11, this.A09);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("WamAckKickReceived {");
        C16470t7.appendFieldToStringBuilder(A0r, "callStanzaType", C13690nt.A0d(this.A00));
        C16470t7.appendFieldToStringBuilder(A0r, "mediaType", C13690nt.A0d(this.A01));
        C16470t7.appendFieldToStringBuilder(A0r, "messageType", C13690nt.A0d(this.A02));
        C16470t7.appendFieldToStringBuilder(A0r, "notificationStanzaType", this.A0A);
        C16470t7.appendFieldToStringBuilder(A0r, "numOfflineStanzasProcessing", this.A04);
        C16470t7.appendFieldToStringBuilder(A0r, "numStanzasProcessing", this.A05);
        C16470t7.appendFieldToStringBuilder(A0r, "numStanzasProcessingForType", this.A06);
        C16470t7.appendFieldToStringBuilder(A0r, "numStanzasWithSameId", this.A07);
        C16470t7.appendFieldToStringBuilder(A0r, "receiptStanzaType", this.A0B);
        C16470t7.appendFieldToStringBuilder(A0r, "stanzaOfflineCount", this.A08);
        C16470t7.appendFieldToStringBuilder(A0r, "stanzaType", C13690nt.A0d(this.A03));
        C16470t7.appendFieldToStringBuilder(A0r, "timeToAckKickInMs", this.A09);
        return AnonymousClass000.A0h("}", A0r);
    }
}
