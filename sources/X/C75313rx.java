package X;

/* renamed from: X.3rx  reason: invalid class name and case insensitive filesystem */
public final class C75313rx extends C16470t7 {
    public Integer A00;
    public Long A01;
    public Long A02;
    public String A03;
    public String A04;

    public C75313rx() {
        super(2166, AnonymousClass3K3.A0d(), 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(6, this.A00);
        r3.AdT(3, this.A03);
        r3.AdT(1, this.A04);
        r3.AdT(4, this.A01);
        r3.AdT(5, this.A02);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("WamPushNotificationReceived {");
        C16470t7.appendFieldToStringBuilder(A0r, "deliveredPriority", C13690nt.A0d(this.A00));
        C16470t7.appendFieldToStringBuilder(A0r, "pushNotificationEventId", this.A03);
        C16470t7.appendFieldToStringBuilder(A0r, "pushNotificationId", this.A04);
        C16470t7.appendFieldToStringBuilder(A0r, "pushReceivedT", this.A01);
        C16470t7.appendFieldToStringBuilder(A0r, "pushSentT", this.A02);
        return AnonymousClass000.A0h("}", A0r);
    }
}
