package X;

/* renamed from: X.3rL  reason: invalid class name and case insensitive filesystem */
public final class C74933rL extends C16470t7 {
    public Boolean A00;
    public Integer A01;
    public Long A02;

    public C74933rL() {
        super(2540, C16470t7.DEFAULT_SAMPLING_RATE, 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(1, this.A00);
        r3.AdT(3, this.A01);
        r3.AdT(2, this.A02);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("WamPrekeysFetch {");
        C16470t7.appendFieldToStringBuilder(A0r, "onIdentityChange", this.A00);
        C16470t7.appendFieldToStringBuilder(A0r, "prekeysFetchContext", C13690nt.A0d(this.A01));
        C16470t7.appendFieldToStringBuilder(A0r, "prekeysFetchCount", this.A02);
        return AnonymousClass000.A0h("}", A0r);
    }
}
