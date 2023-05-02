package X;

/* renamed from: X.3se  reason: invalid class name and case insensitive filesystem */
public final class C75743se extends C16470t7 {
    public Boolean A00;
    public Boolean A01;
    public Double A02;
    public Integer A03;
    public Integer A04;
    public Long A05;
    public Long A06;
    public Long A07;
    public Long A08;

    public C75743se() {
        super(458, C16470t7.DEFAULT_SAMPLING_RATE, 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(7, this.A05);
        r3.AdT(8, this.A06);
        r3.AdT(5, this.A07);
        r3.AdT(4, this.A00);
        r3.AdT(9, this.A08);
        r3.AdT(1, this.A03);
        r3.AdT(3, this.A02);
        r3.AdT(2, this.A04);
        r3.AdT(6, this.A01);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("WamPtt {");
        C16470t7.appendFieldToStringBuilder(A0r, "pttDraftPlayCnt", this.A05);
        C16470t7.appendFieldToStringBuilder(A0r, "pttDraftSeekCnt", this.A06);
        C16470t7.appendFieldToStringBuilder(A0r, "pttDuration", this.A07);
        C16470t7.appendFieldToStringBuilder(A0r, "pttLock", this.A00);
        C16470t7.appendFieldToStringBuilder(A0r, "pttPauseCnt", this.A08);
        C16470t7.appendFieldToStringBuilder(A0r, "pttResult", C13690nt.A0d(this.A03));
        C16470t7.appendFieldToStringBuilder(A0r, "pttSize", this.A02);
        C16470t7.appendFieldToStringBuilder(A0r, "pttSource", C13690nt.A0d(this.A04));
        C16470t7.appendFieldToStringBuilder(A0r, "pttStop", this.A01);
        return AnonymousClass000.A0h("}", A0r);
    }
}
