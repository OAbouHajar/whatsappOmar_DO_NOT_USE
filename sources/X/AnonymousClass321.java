package X;

/* renamed from: X.321  reason: invalid class name */
public final class AnonymousClass321 extends C16470t7 {
    public Boolean A00;
    public Double A01;
    public Double A02;
    public Double A03;
    public Integer A04;
    public Integer A05;
    public Integer A06;
    public Long A07;
    public Long A08;
    public Long A09;
    public Long A0A;
    public Long A0B;
    public Long A0C;
    public Long A0D;
    public Long A0E;

    public AnonymousClass321() {
        super(1584, new AnonymousClass00F(1, 1, 100), 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(4, this.A01);
        r3.AdT(5, this.A02);
        r3.AdT(15, this.A00);
        r3.AdT(7, this.A07);
        r3.AdT(2, this.A03);
        r3.AdT(3, this.A04);
        r3.AdT(10, this.A08);
        r3.AdT(1, this.A09);
        r3.AdT(14, this.A0A);
        r3.AdT(16, this.A05);
        r3.AdT(11, this.A06);
        r3.AdT(13, this.A0B);
        r3.AdT(9, this.A0C);
        r3.AdT(8, this.A0D);
        r3.AdT(6, this.A0E);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("WamMediaStreamPlayback {");
        C16470t7.appendFieldToStringBuilder(A0r, "bytesDownloadedStart", this.A01);
        C16470t7.appendFieldToStringBuilder(A0r, "bytesTransferred", this.A02);
        C16470t7.appendFieldToStringBuilder(A0r, "didPlay", this.A00);
        C16470t7.appendFieldToStringBuilder(A0r, "initialBufferingT", this.A07);
        C16470t7.appendFieldToStringBuilder(A0r, "mediaSize", this.A03);
        C16470t7.appendFieldToStringBuilder(A0r, "mediaType", C13690nt.A0d(this.A04));
        C16470t7.appendFieldToStringBuilder(A0r, "overallPlayT", this.A08);
        C16470t7.appendFieldToStringBuilder(A0r, "overallT", this.A09);
        C16470t7.appendFieldToStringBuilder(A0r, "playbackCount", this.A0A);
        C16470t7.appendFieldToStringBuilder(A0r, "playbackOrigin", C13690nt.A0d(this.A05));
        C16470t7.appendFieldToStringBuilder(A0r, "playbackState", C13690nt.A0d(this.A06));
        C16470t7.appendFieldToStringBuilder(A0r, "seekCount", this.A0B);
        C16470t7.appendFieldToStringBuilder(A0r, "totalRebufferingCount", this.A0C);
        C16470t7.appendFieldToStringBuilder(A0r, "totalRebufferingT", this.A0D);
        C16470t7.appendFieldToStringBuilder(A0r, "videoDuration", this.A0E);
        return AnonymousClass000.A0h("}", A0r);
    }
}
