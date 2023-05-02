package X;

/* renamed from: X.3r8  reason: invalid class name and case insensitive filesystem */
public final class C74803r8 extends C16470t7 {
    public Boolean A00;
    public Integer A01;
    public Integer A02;

    public C74803r8() {
        super(3426, AnonymousClass3K3.A0d(), 0, -1);
    }

    public static C74803r8 A00(C87084Vh r2) {
        C74803r8 r1 = new C74803r8();
        r1.A01 = Integer.valueOf(r2.A00);
        return r1;
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(1, this.A01);
        r3.AdT(2, this.A02);
        r3.AdT(4, this.A00);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("WamCadminDemote {");
        C16470t7.appendFieldToStringBuilder(A0r, "cadminDemoteOrigin", C13690nt.A0d(this.A01));
        C16470t7.appendFieldToStringBuilder(A0r, "cadminDemoteResult", C13690nt.A0d(this.A02));
        C16470t7.appendFieldToStringBuilder(A0r, "isLastCadminOrCreator", this.A00);
        return AnonymousClass000.A0h("}", A0r);
    }
}
