package X;

/* renamed from: X.3sm  reason: invalid class name and case insensitive filesystem */
public final class C75823sm extends C16470t7 {
    public Boolean A00;
    public Boolean A01;
    public Integer A02;
    public Integer A03;
    public Long A04;
    public Long A05;
    public Long A06;
    public Long A07;
    public Long A08;
    public Long A09;
    public String A0A;

    public C75823sm() {
        super(2032, C16470t7.DEFAULT_SAMPLING_RATE, 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(7, this.A04);
        r3.AdT(8, this.A00);
        r3.AdT(9, this.A05);
        r3.AdT(10, this.A02);
        r3.AdT(2, this.A06);
        r3.AdT(11, this.A0A);
        r3.AdT(6, this.A07);
        r3.AdT(3, this.A01);
        r3.AdT(4, this.A08);
        r3.AdT(1, this.A03);
        r3.AdT(5, this.A09);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("WamInlineVideoPlaybackClosed {");
        C16470t7.appendFieldToStringBuilder(A0r, "inlineVideoCancelBeforePlayStateT", this.A04);
        C16470t7.appendFieldToStringBuilder(A0r, "inlineVideoComplete", this.A00);
        C16470t7.appendFieldToStringBuilder(A0r, "inlineVideoCompletionRate", this.A05);
        C16470t7.appendFieldToStringBuilder(A0r, "inlineVideoCtaClick", C13690nt.A0d(this.A02));
        C16470t7.appendFieldToStringBuilder(A0r, "inlineVideoDurationT", this.A06);
        C16470t7.appendFieldToStringBuilder(A0r, "inlineVideoError", this.A0A);
        C16470t7.appendFieldToStringBuilder(A0r, "inlineVideoPlayStartT", this.A07);
        C16470t7.appendFieldToStringBuilder(A0r, "inlineVideoPlayed", this.A01);
        C16470t7.appendFieldToStringBuilder(A0r, "inlineVideoStallT", this.A08);
        C16470t7.appendFieldToStringBuilder(A0r, "inlineVideoType", C13690nt.A0d(this.A03));
        C16470t7.appendFieldToStringBuilder(A0r, "inlineVideoWatchT", this.A09);
        return AnonymousClass000.A0h("}", A0r);
    }
}
