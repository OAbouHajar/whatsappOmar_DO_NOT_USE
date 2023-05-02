package X;

/* renamed from: X.3s5  reason: invalid class name and case insensitive filesystem */
public final class C75393s5 extends C16470t7 {
    public Long A00;
    public Long A01;
    public Long A02;
    public String A03;
    public String A04;
    public String A05;

    public C75393s5() {
        super(3248, AnonymousClass3K3.A0d(), 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(2, this.A03);
        r3.AdT(3, this.A00);
        r3.AdT(5, this.A01);
        r3.AdT(7, this.A04);
        r3.AdT(9, this.A05);
        r3.AdT(8, this.A02);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("WamDirectoryServerRequests {");
        C16470t7.appendFieldToStringBuilder(A0r, "directorySessionId", this.A03);
        C16470t7.appendFieldToStringBuilder(A0r, "endResponseTime", this.A00);
        C16470t7.appendFieldToStringBuilder(A0r, "httpResponseCode", this.A01);
        C16470t7.appendFieldToStringBuilder(A0r, "neworkLibraryType", this.A04);
        C16470t7.appendFieldToStringBuilder(A0r, "requestEndpoint", this.A05);
        C16470t7.appendFieldToStringBuilder(A0r, "startResponseTime", this.A02);
        return AnonymousClass000.A0h("}", A0r);
    }
}
