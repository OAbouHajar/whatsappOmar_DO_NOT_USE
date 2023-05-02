package X;

/* renamed from: X.3sS  reason: invalid class name and case insensitive filesystem */
public final class C75623sS extends C16470t7 {
    public Boolean A00;
    public Boolean A01;
    public Boolean A02;
    public Integer A03;
    public Integer A04;
    public Integer A05;
    public Long A06;
    public Long A07;

    public C75623sS() {
        super(2110, new AnonymousClass00F(1, 1000, 2000), 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(7, this.A03);
        r3.AdT(4, this.A00);
        r3.AdT(3, this.A01);
        r3.AdT(8, this.A02);
        r3.AdT(6, this.A04);
        r3.AdT(1, this.A06);
        r3.AdT(5, this.A05);
        r3.AdT(2, this.A07);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("WamPushLatency {");
        C16470t7.appendFieldToStringBuilder(A0r, "deliveredPriority", C13690nt.A0d(this.A03));
        C16470t7.appendFieldToStringBuilder(A0r, "fbnsAvailable", this.A00);
        C16470t7.appendFieldToStringBuilder(A0r, "gcmAvailable", this.A01);
        C16470t7.appendFieldToStringBuilder(A0r, "hasSessionId", this.A02);
        C16470t7.appendFieldToStringBuilder(A0r, "originalPriority", C13690nt.A0d(this.A04));
        C16470t7.appendFieldToStringBuilder(A0r, "pushDelayT", this.A06);
        C16470t7.appendFieldToStringBuilder(A0r, "pushTransport", C13690nt.A0d(this.A05));
        C16470t7.appendFieldToStringBuilder(A0r, "serverTimestampT", this.A07);
        return AnonymousClass000.A0h("}", A0r);
    }
}
