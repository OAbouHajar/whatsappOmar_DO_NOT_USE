package X;

/* renamed from: X.3qv  reason: invalid class name and case insensitive filesystem */
public final class C74673qv extends C16470t7 {
    public Long A00;
    public String A01;

    public C74673qv() {
        super(2442, C16470t7.DEFAULT_SAMPLING_RATE, 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(2, this.A01);
        r3.AdT(1, this.A00);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("WamExitReasonsSummary {");
        C16470t7.appendFieldToStringBuilder(A0r, "exitReasonsCensus", this.A01);
        C16470t7.appendFieldToStringBuilder(A0r, "lastReportedExitTime", this.A00);
        return AnonymousClass000.A0h("}", A0r);
    }
}
