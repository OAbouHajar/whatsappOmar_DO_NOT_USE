package X;

/* renamed from: X.3s3  reason: invalid class name and case insensitive filesystem */
public final class C75373s3 extends C16470t7 {
    public Integer A00;
    public Long A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;

    public C75373s3() {
        super(494, AnonymousClass3K3.A0d(), 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(8, this.A02);
        r3.AdT(9, this.A03);
        r3.AdT(3, this.A04);
        r3.AdT(5, this.A01);
        r3.AdT(2, this.A05);
        r3.AdT(6, this.A00);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("WamCrashLog {");
        C16470t7.appendFieldToStringBuilder(A0r, "androidAppStateMetadata", this.A02);
        C16470t7.appendFieldToStringBuilder(A0r, "androidCrashedBuildVersion", this.A03);
        C16470t7.appendFieldToStringBuilder(A0r, "crashContext", this.A04);
        C16470t7.appendFieldToStringBuilder(A0r, "crashCount", this.A01);
        C16470t7.appendFieldToStringBuilder(A0r, "crashReason", this.A05);
        C16470t7.appendFieldToStringBuilder(A0r, "crashType", C13690nt.A0d(this.A00));
        return AnonymousClass000.A0h("}", A0r);
    }
}
