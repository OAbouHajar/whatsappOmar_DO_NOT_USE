package X;

/* renamed from: X.3rk  reason: invalid class name and case insensitive filesystem */
public final class C75183rk extends C16470t7 {
    public Long A00;
    public Long A01;
    public Long A02;
    public Long A03;
    public Long A04;

    public C75183rk() {
        super(2204, C16470t7.DEFAULT_SAMPLING_RATE, 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(4, this.A00);
        r3.AdT(3, this.A01);
        r3.AdT(1, this.A02);
        r3.AdT(2, this.A03);
        r3.AdT(5, this.A04);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("WamAndroidNtpSync {");
        C16470t7.appendFieldToStringBuilder(A0r, "ntpSyncCountPeriod", this.A00);
        C16470t7.appendFieldToStringBuilder(A0r, "ntpSyncFailedCount", this.A01);
        C16470t7.appendFieldToStringBuilder(A0r, "ntpSyncStartedCount", this.A02);
        C16470t7.appendFieldToStringBuilder(A0r, "ntpSyncSucceededCount", this.A03);
        C16470t7.appendFieldToStringBuilder(A0r, "ntpSyncWorkManagerInit", this.A04);
        return AnonymousClass000.A0h("}", A0r);
    }
}
