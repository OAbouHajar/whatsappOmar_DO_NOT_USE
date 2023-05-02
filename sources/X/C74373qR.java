package X;

/* renamed from: X.3qR  reason: invalid class name and case insensitive filesystem */
public final class C74373qR extends C16470t7 {
    public Boolean A00;

    public C74373qR() {
        super(3718, AnonymousClass3K3.A0d(), 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(1, this.A00);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("WamGroupSettingAnyoneCanAdd {");
        C16470t7.appendFieldToStringBuilder(A0r, "anyoneCanAddToggle", this.A00);
        return AnonymousClass000.A0h("}", A0r);
    }
}
