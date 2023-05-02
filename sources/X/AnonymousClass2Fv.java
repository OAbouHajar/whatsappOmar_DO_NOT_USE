package X;

/* renamed from: X.2Fv  reason: invalid class name */
public final class AnonymousClass2Fv extends C16470t7 {
    public Boolean A00;
    public Double A01;
    public Double A02;
    public Double A03;
    public Integer A04;
    public Long A05;
    public Long A06;
    public Long A07;
    public Long A08;
    public Long A09;
    public Long A0A;
    public Long A0B;
    public Long A0C;
    public Long A0D;
    public Long A0E;
    public Long A0F;
    public Long A0G;
    public Long A0H;
    public Long A0I;
    public Long A0J;

    public AnonymousClass2Fv() {
        super(1910, new AnonymousClass00F(1, 1, 5), 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(6, this.A01);
        r3.AdT(5, this.A02);
        r3.AdT(8, this.A03);
        r3.AdT(24, this.A04);
        r3.AdT(3, this.A05);
        r3.AdT(2, this.A06);
        r3.AdT(1, this.A00);
        r3.AdT(4, this.A07);
        r3.AdT(23, this.A08);
        r3.AdT(22, this.A09);
        r3.AdT(21, this.A0A);
        r3.AdT(14, this.A0B);
        r3.AdT(13, this.A0C);
        r3.AdT(12, this.A0D);
        r3.AdT(11, this.A0E);
        r3.AdT(10, this.A0F);
        r3.AdT(9, this.A0G);
        r3.AdT(20, this.A0H);
        r3.AdT(19, this.A0I);
        r3.AdT(18, this.A0J);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("WamAndroidDatabaseOverallMigrationEvent {");
        C16470t7.appendFieldToStringBuilder(sb, "afterMigrationMsgstoreSize", this.A01);
        C16470t7.appendFieldToStringBuilder(sb, "beforeMigrationMsgstoreSize", this.A02);
        C16470t7.appendFieldToStringBuilder(sb, "freeSpaceAvailable", this.A03);
        Integer num = this.A04;
        C16470t7.appendFieldToStringBuilder(sb, "migrationInitiator", num == null ? null : num.toString());
        C16470t7.appendFieldToStringBuilder(sb, "migrationProcessedCnt", this.A05);
        C16470t7.appendFieldToStringBuilder(sb, "migrationRegisteredCnt", this.A06);
        C16470t7.appendFieldToStringBuilder(sb, "migrationSucceeded", this.A00);
        C16470t7.appendFieldToStringBuilder(sb, "migrationT", this.A07);
        C16470t7.appendFieldToStringBuilder(sb, "phaseConsistencyFailedCnt", this.A08);
        C16470t7.appendFieldToStringBuilder(sb, "phaseConsistencySkippedCnt", this.A09);
        C16470t7.appendFieldToStringBuilder(sb, "phaseConsistencySuccessCnt", this.A0A);
        C16470t7.appendFieldToStringBuilder(sb, "phaseMigrationFailedCnt", this.A0B);
        C16470t7.appendFieldToStringBuilder(sb, "phaseMigrationSkippedCnt", this.A0C);
        C16470t7.appendFieldToStringBuilder(sb, "phaseMigrationSuccessCnt", this.A0D);
        C16470t7.appendFieldToStringBuilder(sb, "phaseRollbackFailedCnt", this.A0E);
        C16470t7.appendFieldToStringBuilder(sb, "phaseRollbackSkippedCnt", this.A0F);
        C16470t7.appendFieldToStringBuilder(sb, "phaseRollbackSuccessCnt", this.A0G);
        C16470t7.appendFieldToStringBuilder(sb, "phaseVerificationFailedCnt", this.A0H);
        C16470t7.appendFieldToStringBuilder(sb, "phaseVerificationSkippedCnt", this.A0I);
        C16470t7.appendFieldToStringBuilder(sb, "phaseVerificationSuccessCnt", this.A0J);
        sb.append("}");
        return sb.toString();
    }
}
