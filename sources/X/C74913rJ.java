package X;

/* renamed from: X.3rJ  reason: invalid class name and case insensitive filesystem */
public final class C74913rJ extends C16470t7 {
    public Boolean A00;
    public Integer A01;
    public Integer A02;

    public C74913rJ() {
        super(2304, AnonymousClass3K3.A0d(), 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(2, this.A01);
        r3.AdT(16, this.A00);
        r3.AdT(1, this.A02);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("WamMdFatalError {");
        C16470t7.appendFieldToStringBuilder(A0r, "collection", C13690nt.A0d(this.A01));
        C16470t7.appendFieldToStringBuilder(A0r, "isFatal", this.A00);
        C16470t7.appendFieldToStringBuilder(A0r, "mdFatalErrorCode", C13690nt.A0d(this.A02));
        return AnonymousClass000.A0h("}", A0r);
    }
}
