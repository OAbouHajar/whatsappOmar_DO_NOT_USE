package X;

/* renamed from: X.3sI  reason: invalid class name and case insensitive filesystem */
public final class C75523sI extends C16470t7 {
    public Integer A00;
    public Integer A01;
    public Long A02;
    public Long A03;
    public Long A04;
    public Long A05;
    public Long A06;

    public C75523sI() {
        super(3398, AnonymousClass3K3.A0d(), 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(1, this.A02);
        r3.AdT(2, this.A00);
        r3.AdT(3, this.A01);
        r3.AdT(4, this.A03);
        r3.AdT(5, this.A04);
        r3.AdT(7, this.A05);
        r3.AdT(8, this.A06);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("WamDisappearingMessageChatPicker {");
        C16470t7.appendFieldToStringBuilder(A0r, "chatsSelected", this.A02);
        C16470t7.appendFieldToStringBuilder(A0r, "dmChatPickerEntryPoint", C13690nt.A0d(this.A00));
        C16470t7.appendFieldToStringBuilder(A0r, "dmChatPickerEventName", C13690nt.A0d(this.A01));
        C16470t7.appendFieldToStringBuilder(A0r, "ephemeralityDuration", this.A03);
        C16470t7.appendFieldToStringBuilder(A0r, "groupChatsSelected", this.A04);
        C16470t7.appendFieldToStringBuilder(A0r, "newlyEphemeralChats", this.A05);
        C16470t7.appendFieldToStringBuilder(A0r, "totalChatsInChatPicker", this.A06);
        return AnonymousClass000.A0h("}", A0r);
    }
}
