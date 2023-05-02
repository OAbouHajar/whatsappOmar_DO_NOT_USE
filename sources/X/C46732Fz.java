package X;

/* renamed from: X.2Fz  reason: invalid class name and case insensitive filesystem */
public final class C46732Fz extends C16470t7 {
    public Boolean A00;
    public Boolean A01;
    public Boolean A02;
    public Boolean A03;
    public Double A04;
    public Integer A05;
    public Long A06;
    public Long A07;
    public Long A08;
    public Long A09;
    public Long A0A;
    public String A0B;
    public String A0C;

    public C46732Fz() {
        super(976, new AnonymousClass00F(1, 1, 1), 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(4, this.A04);
        r3.AdT(1, this.A05);
        r3.AdT(2, this.A06);
        r3.AdT(6, this.A07);
        r3.AdT(12, this.A00);
        r3.AdT(10, this.A0B);
        r3.AdT(13, this.A01);
        r3.AdT(3, this.A08);
        r3.AdT(14, this.A09);
        r3.AdT(9, this.A0C);
        r3.AdT(15, this.A02);
        r3.AdT(5, this.A0A);
        r3.AdT(16, this.A03);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("WamChatDatabaseBackupEvent {");
        C16470t7.appendFieldToStringBuilder(sb, "compressionRatio", this.A04);
        Integer num = this.A05;
        C16470t7.appendFieldToStringBuilder(sb, "databaseBackupOverallResult", num == null ? null : num.toString());
        C16470t7.appendFieldToStringBuilder(sb, "databaseBackupVersion", this.A06);
        C16470t7.appendFieldToStringBuilder(sb, "freeDiskSpace", this.A07);
        C16470t7.appendFieldToStringBuilder(sb, "ftsCleaned", this.A00);
        C16470t7.appendFieldToStringBuilder(sb, "genericBackupFailureReason", this.A0B);
        C16470t7.appendFieldToStringBuilder(sb, "indexesCleaned", this.A01);
        C16470t7.appendFieldToStringBuilder(sb, "msgstoreBackupSize", this.A08);
        C16470t7.appendFieldToStringBuilder(sb, "savingsPercentageFromCleaning", this.A09);
        C16470t7.appendFieldToStringBuilder(sb, "sqliteVersion", this.A0C);
        C16470t7.appendFieldToStringBuilder(sb, "thumbnailsCleaned", this.A02);
        C16470t7.appendFieldToStringBuilder(sb, "totalBackupT", this.A0A);
        C16470t7.appendFieldToStringBuilder(sb, "vacuumed", this.A03);
        sb.append("}");
        return sb.toString();
    }
}
