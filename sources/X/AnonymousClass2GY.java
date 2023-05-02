package X;

/* renamed from: X.2GY  reason: invalid class name */
public final class AnonymousClass2GY extends C16470t7 {
    public Boolean A00;
    public Integer A01;
    public Integer A02;
    public Integer A03;
    public Long A04;

    public AnonymousClass2GY() {
        super(3534, new AnonymousClass00F(1, 1, 1), 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(1, this.A01);
        r3.AdT(2, this.A00);
        r3.AdT(3, this.A02);
        r3.AdT(4, this.A04);
        r3.AdT(5, this.A03);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("WamLocalBackup {");
        Integer num = this.A01;
        C16470t7.appendFieldToStringBuilder(sb, "backupSchedule", num == null ? null : num.toString());
        C16470t7.appendFieldToStringBuilder(sb, "localBackupGoogleBackupScheduled", this.A00);
        Integer num2 = this.A02;
        C16470t7.appendFieldToStringBuilder(sb, "localBackupResult", num2 == null ? null : num2.toString());
        C16470t7.appendFieldToStringBuilder(sb, "localBackupStartTimestamp", this.A04);
        Integer num3 = this.A03;
        C16470t7.appendFieldToStringBuilder(sb, "localBackupTriggerType", num3 == null ? null : num3.toString());
        sb.append("}");
        return sb.toString();
    }
}
