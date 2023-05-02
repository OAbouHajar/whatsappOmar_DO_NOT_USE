package X;

/* renamed from: X.3s9  reason: invalid class name and case insensitive filesystem */
public final class C75433s9 extends C16470t7 {
    public Integer A00;
    public Integer A01;
    public Integer A02;
    public Long A03;
    public String A04;
    public String A05;

    public C75433s9() {
        super(2638, C16470t7.DEFAULT_SAMPLING_RATE, 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(7, this.A00);
        r3.AdT(4, this.A01);
        r3.AdT(6, this.A04);
        r3.AdT(2, this.A03);
        r3.AdT(5, this.A05);
        r3.AdT(1, this.A02);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("WamOfflineCountTooHigh {");
        C16470t7.appendFieldToStringBuilder(A0r, "callStanzaType", C13690nt.A0d(this.A00));
        String str = null;
        Integer num = this.A01;
        if (num != null) {
            str = num.toString();
        }
        C16470t7.appendFieldToStringBuilder(A0r, "messageType", str);
        C16470t7.appendFieldToStringBuilder(A0r, "notificationStanzaType", this.A04);
        C16470t7.appendFieldToStringBuilder(A0r, "offlineCount", this.A03);
        C16470t7.appendFieldToStringBuilder(A0r, "receiptStanzaType", this.A05);
        C16470t7.appendFieldToStringBuilder(A0r, "stanzaType", C13690nt.A0d(this.A02));
        return AnonymousClass000.A0h("}", A0r);
    }
}
