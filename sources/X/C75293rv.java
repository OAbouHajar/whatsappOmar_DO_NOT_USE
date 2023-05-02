package X;

/* renamed from: X.3rv  reason: invalid class name and case insensitive filesystem */
public final class C75293rv extends C16470t7 {
    public Integer A00;
    public Long A01;
    public Long A02;
    public String A03;
    public String A04;

    public C75293rv() {
        super(2570, new AnonymousClass00F(1, 1000, 2000), 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(1, this.A01);
        r3.AdT(2, this.A02);
        r3.AdT(4, this.A00);
        r3.AdT(5, this.A03);
        r3.AdT(3, this.A04);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("WamNotificationStanzaReceive {");
        C16470t7.appendFieldToStringBuilder(A0r, "notificationStanzaDuration", this.A01);
        C16470t7.appendFieldToStringBuilder(A0r, "notificationStanzaOfflineCount", this.A02);
        C16470t7.appendFieldToStringBuilder(A0r, "notificationStanzaStage", C13690nt.A0d(this.A00));
        C16470t7.appendFieldToStringBuilder(A0r, "notificationStanzaSubType", this.A03);
        C16470t7.appendFieldToStringBuilder(A0r, "notificationStanzaType", this.A04);
        return AnonymousClass000.A0h("}", A0r);
    }
}
