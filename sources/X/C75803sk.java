package X;

/* renamed from: X.3sk  reason: invalid class name and case insensitive filesystem */
public final class C75803sk extends C16470t7 {
    public Boolean A00;
    public Boolean A01;
    public Integer A02;
    public Integer A03;
    public Integer A04;
    public Integer A05;
    public Integer A06;
    public Integer A07;
    public Long A08;
    public String A09;

    public C75803sk() {
        super(1522, AnonymousClass3K3.A0d(), 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(9, this.A02);
        r3.AdT(10, this.A03);
        r3.AdT(6, this.A09);
        r3.AdT(12, this.A00);
        r3.AdT(11, this.A01);
        r3.AdT(5, this.A04);
        r3.AdT(8, this.A05);
        r3.AdT(4, this.A08);
        r3.AdT(1, this.A06);
        r3.AdT(2, this.A07);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("WamViewBusinessProfile {");
        C16470t7.appendFieldToStringBuilder(A0r, "bizFbSize", C13690nt.A0d(this.A02));
        C16470t7.appendFieldToStringBuilder(A0r, "bizIgSize", C13690nt.A0d(this.A03));
        C16470t7.appendFieldToStringBuilder(A0r, "catalogSessionId", this.A09);
        C16470t7.appendFieldToStringBuilder(A0r, "hasCoverPhoto", this.A00);
        C16470t7.appendFieldToStringBuilder(A0r, "isProfileLinked", this.A01);
        C16470t7.appendFieldToStringBuilder(A0r, "linkedAccount", C13690nt.A0d(this.A04));
        C16470t7.appendFieldToStringBuilder(A0r, "profileEntryPoint", C13690nt.A0d(this.A05));
        C16470t7.appendFieldToStringBuilder(A0r, "scrollDepth", this.A08);
        C16470t7.appendFieldToStringBuilder(A0r, "viewBusinessProfileAction", C13690nt.A0d(this.A06));
        C16470t7.appendFieldToStringBuilder(A0r, "websiteSource", C13690nt.A0d(this.A07));
        return AnonymousClass000.A0h("}", A0r);
    }
}
