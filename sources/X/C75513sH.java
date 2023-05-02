package X;

/* renamed from: X.3sH  reason: invalid class name and case insensitive filesystem */
public final class C75513sH extends C16470t7 {
    public Double A00;
    public Double A01;
    public Integer A02;
    public Integer A03;
    public Long A04;
    public String A05;
    public String A06;

    public C75513sH() {
        super(3634, AnonymousClass3K3.A0d(), 2, 0);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(1, this.A02);
        r3.AdT(2, this.A04);
        r3.AdT(3, this.A00);
        r3.AdT(4, this.A01);
        r3.AdT(5, this.A05);
        r3.AdT(6, this.A03);
        r3.AdT(7, this.A06);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("WamDirectorySearchRanking {");
        C16470t7.appendFieldToStringBuilder(A0r, "actionOnBusiness", C13690nt.A0d(this.A02));
        C16470t7.appendFieldToStringBuilder(A0r, "businessRankingPosition", this.A04);
        C16470t7.appendFieldToStringBuilder(A0r, "finalRankingScore", this.A00);
        C16470t7.appendFieldToStringBuilder(A0r, "proximity", this.A01);
        C16470t7.appendFieldToStringBuilder(A0r, "rankingResultId", this.A05);
        C16470t7.appendFieldToStringBuilder(A0r, "searchEndpoint", C13690nt.A0d(this.A03));
        C16470t7.appendFieldToStringBuilder(A0r, "searchSessionId", this.A06);
        return AnonymousClass000.A0h("}", A0r);
    }
}
