package X;

/* renamed from: X.2GT  reason: invalid class name */
public final class AnonymousClass2GT extends C16470t7 {
    public Boolean A00;
    public Boolean A01;
    public Double A02;
    public Double A03;
    public Double A04;
    public Double A05;
    public Double A06;
    public Double A07;
    public Double A08;
    public Double A09;
    public Double A0A;
    public Integer A0B;
    public Integer A0C;
    public Integer A0D;
    public Integer A0E;
    public Integer A0F;
    public Long A0G;
    public Long A0H;
    public Long A0I;
    public Long A0J;
    public Long A0K;
    public Long A0L;
    public Long A0M;

    public AnonymousClass2GT() {
        super(484, new AnonymousClass00F(1, 1, 1), 0, -1);
    }

    public static void A00(AnonymousClass2GT r1, int i2) {
        r1.A0C = Integer.valueOf(i2);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(23, this.A02);
        r3.AdT(17, this.A0B);
        r3.AdT(24, this.A0G);
        r3.AdT(10, this.A03);
        r3.AdT(22, this.A0H);
        r3.AdT(6, this.A0I);
        r3.AdT(21, this.A0J);
        r3.AdT(5, this.A00);
        r3.AdT(2, this.A01);
        r3.AdT(3, this.A0K);
        r3.AdT(14, this.A04);
        r3.AdT(11, this.A05);
        r3.AdT(15, this.A06);
        r3.AdT(1, this.A0C);
        r3.AdT(4, this.A0L);
        r3.AdT(7, this.A0D);
        r3.AdT(8, this.A0M);
        r3.AdT(9, this.A07);
        r3.AdT(13, this.A08);
        r3.AdT(12, this.A09);
        r3.AdT(20, this.A0E);
        r3.AdT(26, this.A0A);
        r3.AdT(18, this.A0F);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("WamBackup {");
        C16470t7.appendFieldToStringBuilder(sb, "backupDeletedMediaSize", this.A02);
        Integer num = this.A0B;
        C16470t7.appendFieldToStringBuilder(sb, "backupNetworkSetting", num == null ? null : num.toString());
        C16470t7.appendFieldToStringBuilder(sb, "backupNumberOfFilesDeleted", this.A0G);
        C16470t7.appendFieldToStringBuilder(sb, "backupRestoreChatdbSize", this.A03);
        C16470t7.appendFieldToStringBuilder(sb, "backupRestoreEncryptionVersion", this.A0H);
        C16470t7.appendFieldToStringBuilder(sb, "backupRestoreFinishedOverWifi", this.A0I);
        C16470t7.appendFieldToStringBuilder(sb, "backupRestoreInSessionRetryCount", this.A0J);
        C16470t7.appendFieldToStringBuilder(sb, "backupRestoreIncludeVideos", this.A00);
        C16470t7.appendFieldToStringBuilder(sb, "backupRestoreIsFull", this.A01);
        C16470t7.appendFieldToStringBuilder(sb, "backupRestoreIsWifi", this.A0K);
        C16470t7.appendFieldToStringBuilder(sb, "backupRestoreMediaFileCount", this.A04);
        C16470t7.appendFieldToStringBuilder(sb, "backupRestoreMediaSize", this.A05);
        C16470t7.appendFieldToStringBuilder(sb, "backupRestoreNetworkRequestCount", this.A06);
        Integer num2 = this.A0C;
        C16470t7.appendFieldToStringBuilder(sb, "backupRestoreResult", num2 == null ? null : num2.toString());
        C16470t7.appendFieldToStringBuilder(sb, "backupRestoreRetryCount", this.A0L);
        Integer num3 = this.A0D;
        C16470t7.appendFieldToStringBuilder(sb, "backupRestoreStage", num3 == null ? null : num3.toString());
        C16470t7.appendFieldToStringBuilder(sb, "backupRestoreT", this.A0M);
        C16470t7.appendFieldToStringBuilder(sb, "backupRestoreTotalSize", this.A07);
        C16470t7.appendFieldToStringBuilder(sb, "backupRestoreTransferFailedSize", this.A08);
        C16470t7.appendFieldToStringBuilder(sb, "backupRestoreTransferSize", this.A09);
        Integer num4 = this.A0E;
        C16470t7.appendFieldToStringBuilder(sb, "backupRestoreType", num4 == null ? null : num4.toString());
        C16470t7.appendFieldToStringBuilder(sb, "backupRestoreUserSettingsSize", this.A0A);
        Integer num5 = this.A0F;
        C16470t7.appendFieldToStringBuilder(sb, "backupSchedule", num5 == null ? null : num5.toString());
        sb.append("}");
        return sb.toString();
    }
}
