package X;

/* renamed from: X.3qL  reason: invalid class name and case insensitive filesystem */
public final class C74313qL extends C16470t7 {
    public Integer A00;

    public C74313qL() {
        super(2888, AnonymousClass3K3.A0d(), 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(1, this.A00);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("WamEncryptedRestore {");
        C16470t7.appendFieldToStringBuilder(A0r, "restoreUserEvent", C13690nt.A0d(this.A00));
        return AnonymousClass000.A0h("}", A0r);
    }
}
