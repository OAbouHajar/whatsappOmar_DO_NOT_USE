package X;

/* renamed from: X.3sv  reason: invalid class name and case insensitive filesystem */
public final class C75913sv extends C16470t7 {
    public Boolean A00;
    public Boolean A01;
    public Boolean A02;
    public Double A03;
    public Integer A04;
    public Integer A05;
    public Integer A06;
    public Integer A07;
    public Long A08;
    public Long A09;
    public Long A0A;
    public Long A0B;
    public Long A0C;

    public C75913sv() {
        super(2044, C16470t7.DEFAULT_SAMPLING_RATE, 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(12, this.A08);
        r3.AdT(15, this.A09);
        r3.AdT(16, this.A00);
        r3.AdT(17, this.A0A);
        r3.AdT(8, this.A01);
        r3.AdT(10, this.A04);
        r3.AdT(11, this.A0B);
        r3.AdT(18, this.A02);
        r3.AdT(14, this.A03);
        r3.AdT(9, this.A05);
        r3.AdT(13, this.A0C);
        r3.AdT(5, this.A06);
        r3.AdT(6, this.A07);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("WamPttPlayback {");
        C16470t7.appendFieldToStringBuilder(A0r, "pttDuration", this.A08);
        C16470t7.appendFieldToStringBuilder(A0r, "pttMiniPlayerClick", this.A09);
        C16470t7.appendFieldToStringBuilder(A0r, "pttMiniPlayerClose", this.A00);
        C16470t7.appendFieldToStringBuilder(A0r, "pttMiniPlayerPauseCnt", this.A0A);
        C16470t7.appendFieldToStringBuilder(A0r, "pttPlaybackFailed", this.A01);
        C16470t7.appendFieldToStringBuilder(A0r, "pttPlaybackSpeed", C13690nt.A0d(this.A04));
        C16470t7.appendFieldToStringBuilder(A0r, "pttPlaybackSpeedCnt", this.A0B);
        C16470t7.appendFieldToStringBuilder(A0r, "pttPlayedOutOfChat", this.A02);
        C16470t7.appendFieldToStringBuilder(A0r, "pttPlayedPct", this.A03);
        C16470t7.appendFieldToStringBuilder(A0r, "pttPlayer", C13690nt.A0d(this.A05));
        C16470t7.appendFieldToStringBuilder(A0r, "pttSeekCnt", this.A0C);
        C16470t7.appendFieldToStringBuilder(A0r, "pttTrigger", C13690nt.A0d(this.A06));
        C16470t7.appendFieldToStringBuilder(A0r, "pttType", C13690nt.A0d(this.A07));
        return AnonymousClass000.A0h("}", A0r);
    }
}
