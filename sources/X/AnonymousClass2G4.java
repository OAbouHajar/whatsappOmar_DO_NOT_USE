package X;

/* renamed from: X.2G4  reason: invalid class name */
public final class AnonymousClass2G4 extends C16470t7 {
    public Boolean A00;
    public Boolean A01;
    public Boolean A02;
    public Boolean A03;
    public Boolean A04;
    public Boolean A05;
    public Boolean A06;
    public Boolean A07;
    public Boolean A08;
    public Boolean A09;
    public Integer A0A;
    public Integer A0B;
    public Long A0C;
    public Long A0D;
    public Long A0E;
    public Long A0F;
    public Long A0G;
    public Long A0H;
    public String A0I;

    public AnonymousClass2G4() {
        super(932, new AnonymousClass00F(1, 1, 1), 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(14, this.A0C);
        r3.AdT(11, this.A0A);
        r3.AdT(22, this.A00);
        r3.AdT(2, this.A0D);
        r3.AdT(10, this.A0E);
        r3.AdT(5, this.A01);
        r3.AdT(4, this.A02);
        r3.AdT(3, this.A03);
        r3.AdT(1, this.A04);
        r3.AdT(8, this.A05);
        r3.AdT(12, this.A0B);
        r3.AdT(6, this.A06);
        r3.AdT(9, this.A07);
        r3.AdT(20, this.A0I);
        r3.AdT(7, this.A08);
        r3.AdT(23, this.A0F);
        r3.AdT(24, this.A0G);
        r3.AdT(13, this.A0H);
        r3.AdT(25, this.A09);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("WamChatDatabaseRestoreEvent {");
        C16470t7.appendFieldToStringBuilder(sb, "backupFileIndex", this.A0C);
        Integer num = this.A0A;
        C16470t7.appendFieldToStringBuilder(sb, "backupRestoreStatusOfBackupFoundAtRestoreTime", num == null ? null : num.toString());
        C16470t7.appendFieldToStringBuilder(sb, "cleanedBackup", this.A00);
        C16470t7.appendFieldToStringBuilder(sb, "databaseBackupVersion", this.A0D);
        C16470t7.appendFieldToStringBuilder(sb, "databaseDumpAndRestoreRecoveryPercentage", this.A0E);
        C16470t7.appendFieldToStringBuilder(sb, "databaseRepairEnabled", this.A01);
        C16470t7.appendFieldToStringBuilder(sb, "databaseRestoreCorrectJid", this.A02);
        C16470t7.appendFieldToStringBuilder(sb, "databaseRestoreFileIntegrityCheck", this.A03);
        C16470t7.appendFieldToStringBuilder(sb, "databaseRestoreOverallResult", this.A04);
        C16470t7.appendFieldToStringBuilder(sb, "databaseRestoreReindexingResult", this.A05);
        Integer num2 = this.A0B;
        C16470t7.appendFieldToStringBuilder(sb, "databaseRestoreResultDetails", num2 == null ? null : num2.toString());
        C16470t7.appendFieldToStringBuilder(sb, "databaseRestoreSqliteIntegrityCheckResult", this.A06);
        C16470t7.appendFieldToStringBuilder(sb, "dbDumpAndRestoreResult", this.A07);
        C16470t7.appendFieldToStringBuilder(sb, "genericFailureReason", this.A0I);
        C16470t7.appendFieldToStringBuilder(sb, "hasOnlyIndexErrors", this.A08);
        C16470t7.appendFieldToStringBuilder(sb, "restoreChatDbTimeSec", this.A0F);
        C16470t7.appendFieldToStringBuilder(sb, "restoreIndexesTimeSec", this.A0G);
        C16470t7.appendFieldToStringBuilder(sb, "restoreTimeBackupFilesCount", this.A0H);
        C16470t7.appendFieldToStringBuilder(sb, "restoredIndexes", this.A09);
        sb.append("}");
        return sb.toString();
    }
}
