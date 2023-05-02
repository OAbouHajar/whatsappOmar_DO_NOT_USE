package X;

/* renamed from: X.3sl  reason: invalid class name and case insensitive filesystem */
public final class C75813sl extends C16470t7 {
    public Double A00;
    public Double A01;
    public Double A02;
    public Integer A03;
    public Integer A04;
    public Integer A05;
    public Long A06;
    public Long A07;
    public Long A08;
    public String A09;

    public C75813sl() {
        super(2872, AnonymousClass3K3.A0d(), 1, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(9, this.A06);
        r3.AdT(7, this.A00);
        r3.AdT(8, this.A01);
        r3.AdT(10, this.A03);
        r3.AdT(5, this.A04);
        r3.AdT(1, this.A05);
        r3.AdT(11, this.A07);
        r3.AdT(12, this.A08);
        r3.AdT(6, this.A02);
        r3.AdT(2, this.A09);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("WamXplatformMigrationExport {");
        C16470t7.appendFieldToStringBuilder(A0r, "storageAvailSize", this.A06);
        C16470t7.appendFieldToStringBuilder(A0r, "waDbSize", this.A00);
        C16470t7.appendFieldToStringBuilder(A0r, "waMediaSize", this.A01);
        C16470t7.appendFieldToStringBuilder(A0r, "xpmDonorPlatform", C13690nt.A0d(this.A03));
        C16470t7.appendFieldToStringBuilder(A0r, "xpmError", C13690nt.A0d(this.A04));
        C16470t7.appendFieldToStringBuilder(A0r, "xpmEvent", C13690nt.A0d(this.A05));
        C16470t7.appendFieldToStringBuilder(A0r, "xpmExportDuration", this.A07);
        C16470t7.appendFieldToStringBuilder(A0r, "xpmExportProgress", this.A08);
        C16470t7.appendFieldToStringBuilder(A0r, "xpmExportedDbSize", this.A02);
        C16470t7.appendFieldToStringBuilder(A0r, "xpmFunnelId", this.A09);
        return AnonymousClass000.A0h("}", A0r);
    }
}
