package X;

/* renamed from: X.3sJ  reason: invalid class name and case insensitive filesystem */
public final class C75533sJ extends C16470t7 {
    public Integer A00;
    public Long A01;
    public Long A02;
    public Long A03;
    public Long A04;
    public Long A05;
    public Long A06;

    public C75533sJ() {
        super(3508, new AnonymousClass00F(1, 1000, 2000), 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(7, this.A00);
        r3.AdT(1, this.A01);
        r3.AdT(2, this.A02);
        r3.AdT(4, this.A03);
        r3.AdT(5, this.A04);
        r3.AdT(6, this.A05);
        r3.AdT(8, this.A06);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("WamIqSend {");
        C16470t7.appendFieldToStringBuilder(A0r, "iqSendResult", C13690nt.A0d(this.A00));
        C16470t7.appendFieldToStringBuilder(A0r, "iqTimeToGetResponse", this.A01);
        C16470t7.appendFieldToStringBuilder(A0r, "iqTimeToProcess", this.A02);
        C16470t7.appendFieldToStringBuilder(A0r, "iqTimeToSend", this.A03);
        C16470t7.appendFieldToStringBuilder(A0r, "iqTotalTime", this.A04);
        C16470t7.appendFieldToStringBuilder(A0r, "iqType", this.A05);
        C16470t7.appendFieldToStringBuilder(A0r, "serverErrorCode", this.A06);
        return AnonymousClass000.A0h("}", A0r);
    }
}
