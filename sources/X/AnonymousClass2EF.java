package X;

/* renamed from: X.2EF  reason: invalid class name */
public final class AnonymousClass2EF extends C16470t7 {
    public Double A00;
    public Double A01;
    public Double A02;
    public Integer A03;
    public Integer A04;
    public Long A05;
    public Long A06;
    public Long A07;
    public Long A08;
    public String A09;

    public AnonymousClass2EF() {
        super(1912, C16470t7.DEFAULT_SAMPLING_RATE, 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(5, this.A00);
        r3.AdT(4, this.A01);
        r3.AdT(9, this.A02);
        r3.AdT(1, this.A09);
        r3.AdT(10, this.A03);
        r3.AdT(2, this.A04);
        r3.AdT(3, this.A05);
        r3.AdT(6, this.A06);
        r3.AdT(7, this.A07);
        r3.AdT(8, this.A08);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("WamAndroidDatabaseMigrationEvent {");
        C16470t7.appendFieldToStringBuilder(sb, "afterMigrationMsgstoreSize", this.A00);
        C16470t7.appendFieldToStringBuilder(sb, "beforeMigrationMsgstoreSize", this.A01);
        C16470t7.appendFieldToStringBuilder(sb, "freeSpaceAvailable", this.A02);
        C16470t7.appendFieldToStringBuilder(sb, "migrationName", this.A09);
        Integer num = this.A03;
        C16470t7.appendFieldToStringBuilder(sb, "migrationSkipReason", num == null ? null : num.toString());
        Integer num2 = this.A04;
        C16470t7.appendFieldToStringBuilder(sb, "migrationStatus", num2 == null ? null : num2.toString());
        C16470t7.appendFieldToStringBuilder(sb, "migrationT", this.A05);
        C16470t7.appendFieldToStringBuilder(sb, "retryCount", this.A06);
        C16470t7.appendFieldToStringBuilder(sb, "rowProcessedCnt", this.A07);
        C16470t7.appendFieldToStringBuilder(sb, "rowSkippedCnt", this.A08);
        sb.append("}");
        return sb.toString();
    }
}
