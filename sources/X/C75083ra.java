package X;

/* renamed from: X.3ra  reason: invalid class name and case insensitive filesystem */
public final class C75083ra extends C16470t7 {
    public Long A00;
    public Long A01;
    public Long A02;
    public Long A03;

    public C75083ra() {
        super(3484, AnonymousClass3K3.A0d(), 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(3, this.A00);
        r3.AdT(4, this.A01);
        r3.AdT(5, this.A02);
        r3.AdT(6, this.A03);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("WamKeepInChatNotif {");
        C16470t7.appendFieldToStringBuilder(A0r, "kicGroupNotificationTaps", this.A00);
        C16470t7.appendFieldToStringBuilder(A0r, "kicGroupNotifications", this.A01);
        C16470t7.appendFieldToStringBuilder(A0r, "kicNotificationTaps", this.A02);
        C16470t7.appendFieldToStringBuilder(A0r, "kicNotifications", this.A03);
        return AnonymousClass000.A0h("}", A0r);
    }
}
