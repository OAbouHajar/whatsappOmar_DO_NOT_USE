package X;

/* renamed from: X.3rp  reason: invalid class name and case insensitive filesystem */
public final class C75233rp extends C16470t7 {
    public Integer A00;
    public Integer A01;
    public Long A02;
    public Long A03;
    public String A04;

    public C75233rp() {
        super(2370, AnonymousClass3K3.A0d(), 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(1, this.A02);
        r3.AdT(3, this.A00);
        r3.AdT(5, this.A01);
        r3.AdT(2, this.A03);
        r3.AdT(6, this.A04);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("WamEphemeralSettingChange {");
        C16470t7.appendFieldToStringBuilder(A0r, "chatEphemeralityDuration", this.A02);
        C16470t7.appendFieldToStringBuilder(A0r, "ephemeralSettingEntryPoint", C13690nt.A0d(this.A00));
        C16470t7.appendFieldToStringBuilder(A0r, "ephemeralSettingGroupSize", C13690nt.A0d(this.A01));
        C16470t7.appendFieldToStringBuilder(A0r, "previousEphemeralityDuration", this.A03);
        C16470t7.appendFieldToStringBuilder(A0r, "threadId", this.A04);
        return AnonymousClass000.A0h("}", A0r);
    }
}
