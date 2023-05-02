package X;

/* renamed from: X.3sa  reason: invalid class name and case insensitive filesystem */
public final class C75703sa extends C16470t7 {
    public Boolean A00;
    public Integer A01;
    public Integer A02;
    public Integer A03;
    public Integer A04;
    public Long A05;
    public Long A06;
    public Long A07;
    public String A08;

    public C75703sa() {
        super(2298, AnonymousClass3K3.A0d(), 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(5, this.A01);
        r3.AdT(11, this.A05);
        r3.AdT(10, this.A02);
        r3.AdT(3, this.A03);
        r3.AdT(2, this.A04);
        r3.AdT(6, this.A06);
        r3.AdT(1, this.A08);
        r3.AdT(4, this.A07);
        r3.AdT(7, this.A00);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("WamMdBootstrapDataApplied {");
        C16470t7.appendFieldToStringBuilder(A0r, "collection", C13690nt.A0d(this.A01));
        C16470t7.appendFieldToStringBuilder(A0r, "historySyncStageProgress", this.A05);
        C16470t7.appendFieldToStringBuilder(A0r, "mdBootstrapHistoryPayloadType", C13690nt.A0d(this.A02));
        C16470t7.appendFieldToStringBuilder(A0r, "mdBootstrapPayloadType", C13690nt.A0d(this.A03));
        C16470t7.appendFieldToStringBuilder(A0r, "mdBootstrapSource", C13690nt.A0d(this.A04));
        C16470t7.appendFieldToStringBuilder(A0r, "mdBootstrapStepDuration", this.A06);
        C16470t7.appendFieldToStringBuilder(A0r, "mdSessionId", this.A08);
        C16470t7.appendFieldToStringBuilder(A0r, "mdTimestamp", this.A07);
        C16470t7.appendFieldToStringBuilder(A0r, "usedSnapshot", this.A00);
        return AnonymousClass000.A0h("}", A0r);
    }
}
