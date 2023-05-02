package X;

/* renamed from: X.3sK  reason: invalid class name and case insensitive filesystem */
public final class C75543sK extends C16470t7 {
    public Double A00;
    public Double A01;
    public Double A02;
    public Double A03;
    public Double A04;
    public Double A05;
    public Long A06;

    public C75543sK() {
        super(1336, C16470t7.DEFAULT_SAMPLING_RATE, 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(13, this.A00);
        r3.AdT(12, this.A01);
        r3.AdT(11, this.A06);
        r3.AdT(3, this.A02);
        r3.AdT(4, this.A03);
        r3.AdT(6, this.A04);
        r3.AdT(1, this.A05);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("WamMemoryStat {");
        C16470t7.appendFieldToStringBuilder(A0r, "androidDalvikPrivateDirty", this.A00);
        C16470t7.appendFieldToStringBuilder(A0r, "androidNativePrivateDirty", this.A01);
        C16470t7.appendFieldToStringBuilder(A0r, "androidThreadCount", this.A06);
        C16470t7.appendFieldToStringBuilder(A0r, "privateBytes", this.A02);
        C16470t7.appendFieldToStringBuilder(A0r, "sharedBytes", this.A03);
        C16470t7.appendFieldToStringBuilder(A0r, "uptime", this.A04);
        C16470t7.appendFieldToStringBuilder(A0r, "workingSetSize", this.A05);
        return AnonymousClass000.A0h("}", A0r);
    }
}
