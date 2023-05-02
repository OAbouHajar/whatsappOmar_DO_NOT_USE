package X;

/* renamed from: X.3r0  reason: invalid class name and case insensitive filesystem */
public final class C74723r0 extends C16470t7 {
    public Integer A00;
    public Integer A01;

    public C74723r0() {
        super(3726, AnonymousClass3K3.A0d(), 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(1, this.A00);
        r3.AdT(2, this.A01);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("WamPrivacySettingsClick {");
        C16470t7.appendFieldToStringBuilder(A0r, "privacyControlEntryPoint", C13690nt.A0d(this.A00));
        C16470t7.appendFieldToStringBuilder(A0r, "privacyControlItem", C13690nt.A0d(this.A01));
        return AnonymousClass000.A0h("}", A0r);
    }
}
