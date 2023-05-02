package X;

/* renamed from: X.2GU  reason: invalid class name */
public final class AnonymousClass2GU extends C16470t7 {
    public Boolean A00;
    public Boolean A01;
    public Double A02;
    public Double A03;
    public Double A04;
    public Double A05;
    public Double A06;
    public Double A07;
    public Double A08;
    public Integer A09;
    public Long A0A;
    public Long A0B;
    public Long A0C;
    public Long A0D;

    public AnonymousClass2GU() {
        super(486, new AnonymousClass00F(1, 1, 1), 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(8, this.A02);
        r3.AdT(19, this.A0A);
        r3.AdT(5, this.A00);
        r3.AdT(2, this.A01);
        r3.AdT(3, this.A0B);
        r3.AdT(12, this.A03);
        r3.AdT(9, this.A04);
        r3.AdT(13, this.A05);
        r3.AdT(1, this.A09);
        r3.AdT(6, this.A0C);
        r3.AdT(7, this.A06);
        r3.AdT(11, this.A07);
        r3.AdT(10, this.A08);
        r3.AdT(14, this.A0D);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("WamRestore {");
        C16470t7.appendFieldToStringBuilder(sb, "backupRestoreChatdbSize", this.A02);
        C16470t7.appendFieldToStringBuilder(sb, "backupRestoreEncryptionVersion", this.A0A);
        C16470t7.appendFieldToStringBuilder(sb, "backupRestoreIncludeVideos", this.A00);
        C16470t7.appendFieldToStringBuilder(sb, "backupRestoreIsFull", this.A01);
        C16470t7.appendFieldToStringBuilder(sb, "backupRestoreIsWifi", this.A0B);
        C16470t7.appendFieldToStringBuilder(sb, "backupRestoreMediaFileCount", this.A03);
        C16470t7.appendFieldToStringBuilder(sb, "backupRestoreMediaSize", this.A04);
        C16470t7.appendFieldToStringBuilder(sb, "backupRestoreNetworkRequestCount", this.A05);
        Integer num = this.A09;
        C16470t7.appendFieldToStringBuilder(sb, "backupRestoreResult", num == null ? null : num.toString());
        C16470t7.appendFieldToStringBuilder(sb, "backupRestoreT", this.A0C);
        C16470t7.appendFieldToStringBuilder(sb, "backupRestoreTotalSize", this.A06);
        C16470t7.appendFieldToStringBuilder(sb, "backupRestoreTransferFailedSize", this.A07);
        C16470t7.appendFieldToStringBuilder(sb, "backupRestoreTransferSize", this.A08);
        C16470t7.appendFieldToStringBuilder(sb, "restoreConcurrentReadsCount", this.A0D);
        sb.append("}");
        return sb.toString();
    }
}
