package X;

/* renamed from: X.3rq  reason: invalid class name and case insensitive filesystem */
public final class C75243rq extends C16470t7 {
    public Integer A00;
    public Long A01;
    public Long A02;
    public Long A03;
    public Long A04;

    public C75243rq() {
        super(2246, C16470t7.DEFAULT_SAMPLING_RATE, 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(5, this.A01);
        r3.AdT(1, this.A00);
        r3.AdT(2, this.A02);
        r3.AdT(3, this.A03);
        r3.AdT(4, this.A04);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("WamExtDirMigration {");
        C16470t7.appendFieldToStringBuilder(A0r, "attemptN", this.A01);
        C16470t7.appendFieldToStringBuilder(A0r, "extDirMigrationResult", C13690nt.A0d(this.A00));
        C16470t7.appendFieldToStringBuilder(A0r, "extDirMigrationTotalT", this.A02);
        C16470t7.appendFieldToStringBuilder(A0r, "moveT", this.A03);
        C16470t7.appendFieldToStringBuilder(A0r, "rescanT", this.A04);
        return AnonymousClass000.A0h("}", A0r);
    }
}
