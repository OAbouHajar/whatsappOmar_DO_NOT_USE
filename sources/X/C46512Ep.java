package X;

/* renamed from: X.2Ep  reason: invalid class name and case insensitive filesystem */
public final class C46512Ep extends C16470t7 {
    public Boolean A00;
    public Boolean A01;
    public Double A02;
    public Double A03;
    public Integer A04;
    public Integer A05;
    public Integer A06;
    public Integer A07;
    public Integer A08;
    public Long A09;
    public Long A0A;

    public C46512Ep() {
        super(2054, new AnonymousClass00F(1, 1, 1), 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(15, this.A00);
        r3.AdT(4, this.A04);
        r3.AdT(9, this.A05);
        r3.AdT(8, this.A06);
        r3.AdT(1, this.A09);
        r3.AdT(2, this.A02);
        r3.AdT(11, this.A01);
        r3.AdT(14, this.A0A);
        r3.AdT(5, this.A07);
        r3.AdT(7, this.A03);
        r3.AdT(6, this.A08);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("WamAndroidRegDirectMigrationFlow {");
        C16470t7.appendFieldToStringBuilder(sb, "didReceiveRcFromConsumer", this.A00);
        String str = null;
        Integer num = this.A04;
        if (num != null) {
            str = num.toString();
        }
        C16470t7.appendFieldToStringBuilder(sb, "firstMigrationFailureReason", str);
        Integer num2 = this.A05;
        C16470t7.appendFieldToStringBuilder(sb, "migrateMediaResult", num2 == null ? null : num2.toString());
        Integer num3 = this.A06;
        C16470t7.appendFieldToStringBuilder(sb, "migratePhoneNumberScreenAction", num3 == null ? null : num3.toString());
        C16470t7.appendFieldToStringBuilder(sb, "migrationDurationT", this.A09);
        C16470t7.appendFieldToStringBuilder(sb, "migrationTotalSize", this.A02);
        C16470t7.appendFieldToStringBuilder(sb, "otherFilesMigrationFailed", this.A01);
        C16470t7.appendFieldToStringBuilder(sb, "providerAppVersionCode", this.A0A);
        Integer num4 = this.A07;
        C16470t7.appendFieldToStringBuilder(sb, "secondMigrationFailureReason", num4 == null ? null : num4.toString());
        C16470t7.appendFieldToStringBuilder(sb, "spacePredictedToNeed", this.A03);
        Integer num5 = this.A08;
        C16470t7.appendFieldToStringBuilder(sb, "thirdMigrationFailureReason", num5 == null ? null : num5.toString());
        sb.append("}");
        return sb.toString();
    }
}
