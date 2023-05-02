package X;

/* renamed from: X.3sX  reason: invalid class name and case insensitive filesystem */
public final class C75673sX extends C16470t7 {
    public Double A00;
    public Double A01;
    public Integer A02;
    public Long A03;
    public Long A04;
    public Long A05;
    public Long A06;
    public Long A07;
    public Long A08;

    public C75673sX() {
        super(2900, AnonymousClass3K3.A0d(), 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(10, this.A03);
        r3.AdT(2, this.A04);
        r3.AdT(5, this.A00);
        r3.AdT(7, this.A05);
        r3.AdT(1, this.A06);
        r3.AdT(8, this.A07);
        r3.AdT(4, this.A01);
        r3.AdT(6, this.A08);
        r3.AdT(9, this.A02);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("WamEncryptedBackupsInitial {");
        C16470t7.appendFieldToStringBuilder(A0r, "backupRestoreInSessionRetryCount", this.A03);
        C16470t7.appendFieldToStringBuilder(A0r, "reencryptionMediaFilesEncrypted", this.A04);
        C16470t7.appendFieldToStringBuilder(A0r, "reencryptionMediaProgress", this.A00);
        C16470t7.appendFieldToStringBuilder(A0r, "reencryptionMediaTime", this.A05);
        C16470t7.appendFieldToStringBuilder(A0r, "reencryptionOverallFilesEncrypted", this.A06);
        C16470t7.appendFieldToStringBuilder(A0r, "reencryptionOverallMibytes", this.A07);
        C16470t7.appendFieldToStringBuilder(A0r, "reencryptionOverallProgress", this.A01);
        C16470t7.appendFieldToStringBuilder(A0r, "reencryptionOverallTime", this.A08);
        C16470t7.appendFieldToStringBuilder(A0r, "reencryptionResult", C13690nt.A0d(this.A02));
        return AnonymousClass000.A0h("}", A0r);
    }
}
