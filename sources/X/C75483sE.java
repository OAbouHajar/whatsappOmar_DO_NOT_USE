package X;

/* renamed from: X.3sE  reason: invalid class name and case insensitive filesystem */
public final class C75483sE extends C16470t7 {
    public Boolean A00;
    public Boolean A01;
    public Long A02;
    public Long A03;
    public Long A04;
    public String A05;
    public String A06;

    public C75483sE() {
        super(1780, AnonymousClass3K3.A0d(), 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(2, this.A02);
        r3.AdT(4, this.A03);
        r3.AdT(3, this.A00);
        r3.AdT(5, this.A04);
        r3.AdT(6, this.A05);
        r3.AdT(1, this.A01);
        r3.AdT(7, this.A06);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("WamAndroidFetchBloksRequest {");
        C16470t7.appendFieldToStringBuilder(A0r, "bloksCategory", this.A02);
        C16470t7.appendFieldToStringBuilder(A0r, "bloksFetchRetryCount", this.A03);
        C16470t7.appendFieldToStringBuilder(A0r, "bloksFetchSuccess", this.A00);
        C16470t7.appendFieldToStringBuilder(A0r, "bloksFetchTimeT", this.A04);
        C16470t7.appendFieldToStringBuilder(A0r, "bloksVersion", this.A05);
        C16470t7.appendFieldToStringBuilder(A0r, "isTriggeredOnBackground", this.A01);
        C16470t7.appendFieldToStringBuilder(A0r, "triggeringSource", this.A06);
        return AnonymousClass000.A0h("}", A0r);
    }
}
