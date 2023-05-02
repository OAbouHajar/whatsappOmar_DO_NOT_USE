package X;

/* renamed from: X.3s8  reason: invalid class name and case insensitive filesystem */
public final class C75423s8 extends C16470t7 {
    public Boolean A00;
    public Boolean A01;
    public Boolean A02;
    public Boolean A03;
    public Integer A04;
    public Integer A05;

    public C75423s8() {
        super(3684, AnonymousClass3K3.A0d(), 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(1, this.A00);
        r3.AdT(2, this.A01);
        r3.AdT(3, this.A04);
        r3.AdT(7, this.A02);
        r3.AdT(8, this.A03);
        r3.AdT(9, this.A05);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("WamNotificationSetting {");
        C16470t7.appendFieldToStringBuilder(A0r, "groupReactionNotification", this.A00);
        C16470t7.appendFieldToStringBuilder(A0r, "groupShowNotification", this.A01);
        C16470t7.appendFieldToStringBuilder(A0r, "groupSoundTone", C13690nt.A0d(this.A04));
        C16470t7.appendFieldToStringBuilder(A0r, "messageReactionNotification", this.A02);
        C16470t7.appendFieldToStringBuilder(A0r, "messageShowNotification", this.A03);
        C16470t7.appendFieldToStringBuilder(A0r, "messageSoundTone", C13690nt.A0d(this.A05));
        return AnonymousClass000.A0h("}", A0r);
    }
}
