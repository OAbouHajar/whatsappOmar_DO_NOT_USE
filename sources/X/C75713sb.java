package X;

/* renamed from: X.3sb  reason: invalid class name and case insensitive filesystem */
public final class C75713sb extends C16470t7 {
    public Boolean A00;
    public Double A01;
    public Integer A02;
    public Integer A03;
    public Integer A04;
    public Long A05;
    public Long A06;
    public String A07;
    public String A08;

    public C75713sb() {
        super(834, C16470t7.DEFAULT_SAMPLING_RATE, 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(6, this.A00);
        r3.AdT(4, this.A07);
        r3.AdT(8, this.A01);
        r3.AdT(7, this.A08);
        r3.AdT(5, this.A05);
        r3.AdT(3, this.A02);
        r3.AdT(9, this.A06);
        r3.AdT(1, this.A03);
        r3.AdT(2, this.A04);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("WamPlacesApiQuery {");
        C16470t7.appendFieldToStringBuilder(A0r, "placesApiCached", this.A00);
        C16470t7.appendFieldToStringBuilder(A0r, "placesApiFailureDescription", this.A07);
        C16470t7.appendFieldToStringBuilder(A0r, "placesApiPlacesCount", this.A01);
        C16470t7.appendFieldToStringBuilder(A0r, "placesApiQueryString", this.A08);
        C16470t7.appendFieldToStringBuilder(A0r, "placesApiRequestIndex", this.A05);
        C16470t7.appendFieldToStringBuilder(A0r, "placesApiResponse", C13690nt.A0d(this.A02));
        C16470t7.appendFieldToStringBuilder(A0r, "placesApiResponseT", this.A06);
        C16470t7.appendFieldToStringBuilder(A0r, "placesApiSource", C13690nt.A0d(this.A03));
        C16470t7.appendFieldToStringBuilder(A0r, "placesApiSourceDefault", C13690nt.A0d(this.A04));
        return AnonymousClass000.A0h("}", A0r);
    }
}
