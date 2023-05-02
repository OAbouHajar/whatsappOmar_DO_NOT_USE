package X;

/* renamed from: X.3su  reason: invalid class name and case insensitive filesystem */
public final class C75903su extends C16470t7 {
    public Boolean A00;
    public Boolean A01;
    public Integer A02;
    public Long A03;
    public Long A04;
    public Long A05;
    public Long A06;
    public Long A07;
    public Long A08;
    public Long A09;
    public Long A0A;
    public Long A0B;
    public Long A0C;

    public C75903su() {
        super(3112, new AnonymousClass00F(1, 20, 1000), 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(17, this.A03);
        r3.AdT(18, this.A04);
        r3.AdT(19, this.A05);
        r3.AdT(2, this.A00);
        r3.AdT(13, this.A01);
        r3.AdT(3, this.A06);
        r3.AdT(14, this.A07);
        r3.AdT(6, this.A08);
        r3.AdT(7, this.A09);
        r3.AdT(8, this.A0A);
        r3.AdT(20, this.A0B);
        r3.AdT(9, this.A0C);
        r3.AdT(21, this.A02);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("WamOfflineResume {");
        C16470t7.appendFieldToStringBuilder(A0r, "expectedOfflineMessageCount", this.A03);
        C16470t7.appendFieldToStringBuilder(A0r, "expectedOfflineNotificationCount", this.A04);
        C16470t7.appendFieldToStringBuilder(A0r, "expectedOfflineReceiptCount", this.A05);
        C16470t7.appendFieldToStringBuilder(A0r, "isOfflineCompleteMissed", this.A00);
        C16470t7.appendFieldToStringBuilder(A0r, "isResumeInForeground", this.A01);
        C16470t7.appendFieldToStringBuilder(A0r, "lastStanzaT", this.A06);
        C16470t7.appendFieldToStringBuilder(A0r, "mailboxAge", this.A07);
        C16470t7.appendFieldToStringBuilder(A0r, "offlineMessageCount", this.A08);
        C16470t7.appendFieldToStringBuilder(A0r, "offlineNotificationCount", this.A09);
        C16470t7.appendFieldToStringBuilder(A0r, "offlinePreviewT", this.A0A);
        C16470t7.appendFieldToStringBuilder(A0r, "offlineProcessingT", this.A0B);
        C16470t7.appendFieldToStringBuilder(A0r, "offlineReceiptCount", this.A0C);
        C16470t7.appendFieldToStringBuilder(A0r, "offlineResumeResult", C13690nt.A0d(this.A02));
        return AnonymousClass000.A0h("}", A0r);
    }
}
