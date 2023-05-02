package X;

/* renamed from: X.2Je  reason: invalid class name and case insensitive filesystem */
public final class C47492Je extends C16470t7 {
    public Long A00;
    public Long A01;
    public String A02;

    public C47492Je() {
        super(1172, C16470t7.DEFAULT_SAMPLING_RATE, 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(5, this.A02);
        r3.AdT(2, this.A00);
        r3.AdT(1, this.A01);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("WamStatusTabOpen {");
        C16470t7.appendFieldToStringBuilder(sb, "psaCampaigns", this.A02);
        C16470t7.appendFieldToStringBuilder(sb, "statusAvailableUpdatesCount", this.A00);
        C16470t7.appendFieldToStringBuilder(sb, "statusSessionId", this.A01);
        sb.append("}");
        return sb.toString();
    }
}
