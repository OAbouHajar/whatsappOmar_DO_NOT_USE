package X;

/* renamed from: X.3sx  reason: invalid class name and case insensitive filesystem */
public final class C75933sx extends C16470t7 {
    public Long A00;
    public Long A01;
    public Long A02;
    public Long A03;
    public Long A04;
    public Long A05;
    public Long A06;
    public Long A07;
    public Long A08;
    public Long A09;
    public Long A0A;
    public Long A0B;
    public Long A0C;
    public Long A0D;

    public C75933sx() {
        super(2208, new AnonymousClass00F(1, 20, 1000), 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(7, this.A00);
        r3.AdT(3, this.A01);
        r3.AdT(14, this.A02);
        r3.AdT(13, this.A03);
        r3.AdT(12, this.A04);
        r3.AdT(10, this.A05);
        r3.AdT(9, this.A06);
        r3.AdT(11, this.A07);
        r3.AdT(8, this.A08);
        r3.AdT(6, this.A09);
        r3.AdT(5, this.A0A);
        r3.AdT(4, this.A0B);
        r3.AdT(2, this.A0C);
        r3.AdT(1, this.A0D);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("WamAndroidDiskFootprintEvent {");
        C16470t7.appendFieldToStringBuilder(A0r, "chatDatabaseSize", this.A00);
        C16470t7.appendFieldToStringBuilder(A0r, "chatUsageSize", this.A01);
        C16470t7.appendFieldToStringBuilder(A0r, "externalBackupsSize", this.A02);
        C16470t7.appendFieldToStringBuilder(A0r, "externalDatabasesSize", this.A03);
        C16470t7.appendFieldToStringBuilder(A0r, "externalMediaSize", this.A04);
        C16470t7.appendFieldToStringBuilder(A0r, "externalStorageAvailSize", this.A05);
        C16470t7.appendFieldToStringBuilder(A0r, "externalStorageTotalSize", this.A06);
        C16470t7.appendFieldToStringBuilder(A0r, "externalWhatsappFolderSize", this.A07);
        C16470t7.appendFieldToStringBuilder(A0r, "internalCachedirSize", this.A08);
        C16470t7.appendFieldToStringBuilder(A0r, "internalDatabasesSize", this.A09);
        C16470t7.appendFieldToStringBuilder(A0r, "internalFilesdirSize", this.A0A);
        C16470t7.appendFieldToStringBuilder(A0r, "internalWhatsappFolderSize", this.A0B);
        C16470t7.appendFieldToStringBuilder(A0r, "storageAvailSize", this.A0C);
        C16470t7.appendFieldToStringBuilder(A0r, "storageTotalSize", this.A0D);
        return AnonymousClass000.A0h("}", A0r);
    }
}
