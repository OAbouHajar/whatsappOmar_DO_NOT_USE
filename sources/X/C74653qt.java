package X;

/* renamed from: X.3qt  reason: invalid class name and case insensitive filesystem */
public final class C74653qt extends C16470t7 {
    public Integer A00;
    public Long A01;

    public C74653qt() {
        super(3918, AnonymousClass3K3.A0d(), 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(1, this.A01);
        r3.AdT(2, this.A00);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("WamDmInterstitialScreenImpression {");
        C16470t7.appendFieldToStringBuilder(A0r, "accountEphemeralityDuration", this.A01);
        C16470t7.appendFieldToStringBuilder(A0r, "dmScreenEntryPoint", C13690nt.A0d(this.A00));
        return AnonymousClass000.A0h("}", A0r);
    }
}
