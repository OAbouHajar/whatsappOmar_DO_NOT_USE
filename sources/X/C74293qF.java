package X;

/* renamed from: X.3qF  reason: invalid class name and case insensitive filesystem */
public final class C74293qF extends C16470t7 {
    public Long A00;

    public C74293qF() {
        super(3190, AnonymousClass3K3.A0d(), 2, 0);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(1, this.A00);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("WamContactDiscoveryTimeToEngagement {");
        C16470t7.appendFieldToStringBuilder(A0r, "elapsedTime", this.A00);
        return AnonymousClass000.A0h("}", A0r);
    }
}
