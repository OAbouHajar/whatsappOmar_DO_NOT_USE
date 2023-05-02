package X;

/* renamed from: X.3sy  reason: invalid class name and case insensitive filesystem */
public final class C75943sy extends C16470t7 {
    public Boolean A00;
    public Double A01;
    public Double A02;
    public Integer A03;
    public Integer A04;
    public Integer A05;
    public Long A06;
    public Long A07;
    public Long A08;
    public Long A09;
    public Long A0A;
    public Long A0B;
    public Long A0C;
    public Long A0D;

    public C75943sy() {
        super(1766, AnonymousClass3K3.A0d(), 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(2, this.A01);
        r3.AdT(1, this.A02);
        r3.AdT(13, this.A06);
        r3.AdT(14, this.A07);
        r3.AdT(11, this.A08);
        r3.AdT(10, this.A09);
        r3.AdT(15, this.A0A);
        r3.AdT(12, this.A0B);
        r3.AdT(16, this.A0C);
        r3.AdT(7, this.A00);
        r3.AdT(6, this.A03);
        r3.AdT(4, this.A04);
        r3.AdT(3, this.A0D);
        r3.AdT(5, this.A05);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("WamMediaDailyDataUsage {");
        C16470t7.appendFieldToStringBuilder(A0r, "bytesReceived", this.A01);
        C16470t7.appendFieldToStringBuilder(A0r, "bytesSent", this.A02);
        C16470t7.appendFieldToStringBuilder(A0r, "countDownloaded", this.A06);
        C16470t7.appendFieldToStringBuilder(A0r, "countForward", this.A07);
        C16470t7.appendFieldToStringBuilder(A0r, "countMessageReceived", this.A08);
        C16470t7.appendFieldToStringBuilder(A0r, "countMessageSent", this.A09);
        C16470t7.appendFieldToStringBuilder(A0r, "countShared", this.A0A);
        C16470t7.appendFieldToStringBuilder(A0r, "countUploaded", this.A0B);
        C16470t7.appendFieldToStringBuilder(A0r, "countViewed", this.A0C);
        C16470t7.appendFieldToStringBuilder(A0r, "isAutoDownload", this.A00);
        C16470t7.appendFieldToStringBuilder(A0r, "mediaTransferOrigin", C13690nt.A0d(this.A03));
        C16470t7.appendFieldToStringBuilder(A0r, "mediaType", C13690nt.A0d(this.A04));
        C16470t7.appendFieldToStringBuilder(A0r, "transferDate", this.A0D);
        C16470t7.appendFieldToStringBuilder(A0r, "transferRadio", C13690nt.A0d(this.A05));
        return AnonymousClass000.A0h("}", A0r);
    }
}
