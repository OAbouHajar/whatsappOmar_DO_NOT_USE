package X;

/* renamed from: X.3sp  reason: invalid class name and case insensitive filesystem */
public final class C75853sp extends C16470t7 {
    public Integer A00;
    public Integer A01;
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

    public C75853sp() {
        super(1914, new AnonymousClass00F(1, 1000, 2000), 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(3, this.A02);
        r3.AdT(6, this.A03);
        r3.AdT(10, this.A04);
        r3.AdT(12, this.A05);
        r3.AdT(5, this.A06);
        r3.AdT(9, this.A07);
        r3.AdT(11, this.A08);
        r3.AdT(4, this.A09);
        r3.AdT(8, this.A0A);
        r3.AdT(7, this.A00);
        r3.AdT(1, this.A01);
        r3.AdT(2, this.A0B);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("WamAndroidMediaFileScanEvent {");
        C16470t7.appendFieldToStringBuilder(A0r, "analyzeT", this.A02);
        C16470t7.appendFieldToStringBuilder(A0r, "bytesAnalyzed", this.A03);
        C16470t7.appendFieldToStringBuilder(A0r, "bytesMerged", this.A04);
        C16470t7.appendFieldToStringBuilder(A0r, "bytesRelinked", this.A05);
        C16470t7.appendFieldToStringBuilder(A0r, "filesAnalyzed", this.A06);
        C16470t7.appendFieldToStringBuilder(A0r, "filesMerged", this.A07);
        C16470t7.appendFieldToStringBuilder(A0r, "filesRelinked", this.A08);
        C16470t7.appendFieldToStringBuilder(A0r, "filesScanned", this.A09);
        C16470t7.appendFieldToStringBuilder(A0r, "filesToAnalyze", this.A0A);
        C16470t7.appendFieldToStringBuilder(A0r, "mediaType", C13690nt.A0d(this.A00));
        C16470t7.appendFieldToStringBuilder(A0r, "origin", C13690nt.A0d(this.A01));
        C16470t7.appendFieldToStringBuilder(A0r, "scanT", this.A0B);
        return AnonymousClass000.A0h("}", A0r);
    }
}
