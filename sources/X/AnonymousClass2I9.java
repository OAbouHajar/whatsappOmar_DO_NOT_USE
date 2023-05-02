package X;

/* renamed from: X.2I9  reason: invalid class name */
public final class AnonymousClass2I9 extends C16470t7 {
    public Long A00;
    public Long A01;
    public Long A02;
    public Long A03;
    public Long A04;
    public Long A05;

    public AnonymousClass2I9() {
        super(3314, C16470t7.DEFAULT_SAMPLING_RATE, 2, 113760892);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(1, this.A00);
        r3.AdT(2, this.A01);
        r3.AdT(3, this.A02);
        r3.AdT(4, this.A03);
        r3.AdT(5, this.A04);
        r3.AdT(6, this.A05);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("WamPsUserActivitySessionSummary {");
        C16470t7.appendFieldToStringBuilder(sb, "psUserActivityDuration", this.A00);
        C16470t7.appendFieldToStringBuilder(sb, "psUserActivityForeground", this.A01);
        C16470t7.appendFieldToStringBuilder(sb, "psUserActivitySessionsLength", this.A02);
        C16470t7.appendFieldToStringBuilder(sb, "psUserActivityStartTime", this.A03);
        C16470t7.appendFieldToStringBuilder(sb, "psUserActivityTimeChange", this.A04);
        C16470t7.appendFieldToStringBuilder(sb, "psUserSessionSummarySequence", this.A05);
        sb.append("}");
        return sb.toString();
    }
}
