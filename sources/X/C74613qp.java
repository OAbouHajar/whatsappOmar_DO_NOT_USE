package X;

/* renamed from: X.3qp  reason: invalid class name and case insensitive filesystem */
public final class C74613qp extends C16470t7 {
    public Integer A00;
    public String A01;

    public C74613qp() {
        super(3720, AnonymousClass3K3.A0d(), 2, 113760892);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(2, this.A01);
        r3.AdT(3, this.A00);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("WamCtwaJwtVerificationState {");
        C16470t7.appendFieldToStringBuilder(A0r, "failReason", this.A01);
        C16470t7.appendFieldToStringBuilder(A0r, "verificationState", C13690nt.A0d(this.A00));
        return AnonymousClass000.A0h("}", A0r);
    }
}
