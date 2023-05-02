package X;

/* renamed from: X.3sR  reason: invalid class name and case insensitive filesystem */
public final class C75613sR extends C16470t7 {
    public Boolean A00;
    public Double A01;
    public Double A02;
    public Long A03;
    public Long A04;
    public Long A05;
    public Long A06;
    public String A07;

    public C75613sR() {
        super(2444, new AnonymousClass00F(1, 20, 2000), 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(9, this.A03);
        r3.AdT(7, this.A00);
        r3.AdT(3, this.A01);
        r3.AdT(5, this.A04);
        r3.AdT(2, this.A07);
        r3.AdT(1, this.A05);
        r3.AdT(4, this.A02);
        r3.AdT(8, this.A06);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("WamExitReasonEvent {");
        C16470t7.appendFieldToStringBuilder(A0r, "exitImportance", this.A03);
        C16470t7.appendFieldToStringBuilder(A0r, "exitLowMemorySupported", this.A00);
        C16470t7.appendFieldToStringBuilder(A0r, "exitPss", this.A01);
        C16470t7.appendFieldToStringBuilder(A0r, "exitReason", this.A04);
        C16470t7.appendFieldToStringBuilder(A0r, "exitReasonDescription", this.A07);
        C16470t7.appendFieldToStringBuilder(A0r, "exitReasonTimestamp", this.A05);
        C16470t7.appendFieldToStringBuilder(A0r, "exitRss", this.A02);
        C16470t7.appendFieldToStringBuilder(A0r, "exitStatus", this.A06);
        return AnonymousClass000.A0h("}", A0r);
    }
}
