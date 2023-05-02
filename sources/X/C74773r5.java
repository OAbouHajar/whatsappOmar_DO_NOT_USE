package X;

/* renamed from: X.3r5  reason: invalid class name and case insensitive filesystem */
public final class C74773r5 extends C16470t7 {
    public Boolean A00;
    public Boolean A01;

    public C74773r5() {
        super(3976, AnonymousClass3K3.A0d(), 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(1, this.A00);
        r3.AdT(2, this.A01);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("WamUserProxySet {");
        C16470t7.appendFieldToStringBuilder(A0r, "connectionSuccess", this.A00);
        C16470t7.appendFieldToStringBuilder(A0r, "proxySet", this.A01);
        return AnonymousClass000.A0h("}", A0r);
    }
}
