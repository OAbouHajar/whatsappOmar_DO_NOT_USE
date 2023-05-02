package X;

/* renamed from: X.1uE  reason: invalid class name and case insensitive filesystem */
public final class C40501uE extends C16470t7 {
    public Boolean A00;
    public Boolean A01;
    public Integer A02;
    public Long A03;
    public Long A04;
    public Long A05;
    public Long A06;
    public String A07;

    public C40501uE() {
        super(3892, new AnonymousClass00F(1, 1, 1), 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(1, this.A02);
        r3.AdT(2, this.A03);
        r3.AdT(3, this.A00);
        r3.AdT(5, this.A01);
        r3.AdT(6, this.A04);
        r3.AdT(7, this.A05);
        r3.AdT(8, this.A07);
        r3.AdT(9, this.A06);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("WamEphemeralOutOfSyncInfo {");
        Integer num = this.A02;
        C16470t7.appendFieldToStringBuilder(sb, "groupSizeBucket", num == null ? null : num.toString());
        C16470t7.appendFieldToStringBuilder(sb, "incomingMessageEphemeralityDuration", this.A03);
        C16470t7.appendFieldToStringBuilder(sb, "isAGroup", this.A00);
        C16470t7.appendFieldToStringBuilder(sb, "isNewThreadForUser", this.A01);
        C16470t7.appendFieldToStringBuilder(sb, "otherDefaultModeDuration", this.A04);
        C16470t7.appendFieldToStringBuilder(sb, "threadEphemeralityDuration", this.A05);
        C16470t7.appendFieldToStringBuilder(sb, "threadId", this.A07);
        C16470t7.appendFieldToStringBuilder(sb, "userDefaultModeDuration", this.A06);
        sb.append("}");
        return sb.toString();
    }
}
