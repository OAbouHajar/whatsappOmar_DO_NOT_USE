package X;

/* renamed from: X.3sn  reason: invalid class name and case insensitive filesystem */
public final class C75833sn extends C16470t7 {
    public Boolean A00;
    public Boolean A01;
    public Boolean A02;
    public Boolean A03;
    public Integer A04;
    public Integer A05;
    public Integer A06;
    public Long A07;
    public Long A08;
    public String A09;
    public String A0A;

    public C75833sn() {
        super(3790, AnonymousClass3K3.A0d(), 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(1, this.A04);
        r3.AdT(10, this.A07);
        r3.AdT(2, this.A05);
        r3.AdT(3, this.A00);
        r3.AdT(11, this.A08);
        r3.AdT(7, this.A09);
        r3.AdT(4, this.A01);
        r3.AdT(5, this.A02);
        r3.AdT(6, this.A06);
        r3.AdT(9, this.A03);
        r3.AdT(8, this.A0A);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("WamQbmIncomingMessage {");
        C16470t7.appendFieldToStringBuilder(A0r, "chatsFolderType", C13690nt.A0d(this.A04));
        C16470t7.appendFieldToStringBuilder(A0r, "companionDevices", this.A07);
        C16470t7.appendFieldToStringBuilder(A0r, "contactType", C13690nt.A0d(this.A05));
        C16470t7.appendFieldToStringBuilder(A0r, "keepChatsArchivedEnabled", this.A00);
        C16470t7.appendFieldToStringBuilder(A0r, "lastOutgoingMessageDeltaTime", this.A08);
        C16470t7.appendFieldToStringBuilder(A0r, "messageTypeStr", this.A09);
        C16470t7.appendFieldToStringBuilder(A0r, "muted", this.A01);
        C16470t7.appendFieldToStringBuilder(A0r, "notificationEnabled", this.A02);
        C16470t7.appendFieldToStringBuilder(A0r, "qbmFlag", C13690nt.A0d(this.A06));
        C16470t7.appendFieldToStringBuilder(A0r, "readReceiptsEnabled", this.A03);
        C16470t7.appendFieldToStringBuilder(A0r, "threadIdHmac", this.A0A);
        return AnonymousClass000.A0h("}", A0r);
    }
}
