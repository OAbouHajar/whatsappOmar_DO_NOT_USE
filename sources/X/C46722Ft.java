package X;

/* renamed from: X.2Ft  reason: invalid class name and case insensitive filesystem */
public final class C46722Ft extends C16470t7 {
    public Integer A00;
    public Long A01;
    public Long A02;
    public Long A03;
    public Long A04;

    public C46722Ft() {
        super(3060, new AnonymousClass00F(1, 20, 20), 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(5, this.A01);
        r3.AdT(3, this.A02);
        r3.AdT(4, this.A03);
        r3.AdT(2, this.A00);
        r3.AdT(1, this.A04);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("WamAndroidBgJobUsage {");
        C16470t7.appendFieldToStringBuilder(sb, "numMessageObserverCalls", this.A01);
        C16470t7.appendFieldToStringBuilder(sb, "numTotalJobs", this.A02);
        C16470t7.appendFieldToStringBuilder(sb, "numWaworkerJobs", this.A03);
        Integer num = this.A00;
        C16470t7.appendFieldToStringBuilder(sb, "sessionCategory", num == null ? null : num.toString());
        C16470t7.appendFieldToStringBuilder(sb, "sessionDuration", this.A04);
        sb.append("}");
        return sb.toString();
    }
}