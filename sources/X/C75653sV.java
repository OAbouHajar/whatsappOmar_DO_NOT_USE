package X;

/* renamed from: X.3sV  reason: invalid class name and case insensitive filesystem */
public final class C75653sV extends C16470t7 {
    public Long A00;
    public Long A01;
    public Long A02;
    public Long A03;
    public Long A04;
    public Long A05;
    public Long A06;
    public Long A07;
    public Long A08;

    public C75653sV() {
        super(2642, AnonymousClass3K3.A0d(), 2, 113760892);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(21, this.A00);
        r3.AdT(1, this.A01);
        r3.AdT(22, this.A02);
        r3.AdT(3, this.A03);
        r3.AdT(2, this.A04);
        r3.AdT(19, this.A05);
        r3.AdT(20, this.A06);
        r3.AdT(24, this.A07);
        r3.AdT(23, this.A08);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("WamAndroidInfraHealth {");
        C16470t7.appendFieldToStringBuilder(A0r, "psDailyStartsBgCold", this.A00);
        C16470t7.appendFieldToStringBuilder(A0r, "psDailyStartsCold", this.A01);
        C16470t7.appendFieldToStringBuilder(A0r, "psDailyStartsFgCold", this.A02);
        C16470t7.appendFieldToStringBuilder(A0r, "psDailyStartsLukeWarm", this.A03);
        C16470t7.appendFieldToStringBuilder(A0r, "psDailyStartsWarms", this.A04);
        C16470t7.appendFieldToStringBuilder(A0r, "timeSinceLastColdStartInMin", this.A05);
        C16470t7.appendFieldToStringBuilder(A0r, "timeSinceLastEventInMin", this.A06);
        C16470t7.appendFieldToStringBuilder(A0r, "timeSinceLastLukewarmStartInMin", this.A07);
        C16470t7.appendFieldToStringBuilder(A0r, "timeSinceLastWarmStartInMin", this.A08);
        return AnonymousClass000.A0h("}", A0r);
    }
}
