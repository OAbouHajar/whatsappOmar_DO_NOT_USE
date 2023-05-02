package X;

/* renamed from: X.5hd  reason: invalid class name and case insensitive filesystem */
public final class C111915hd extends C16470t7 {
    public Boolean A00;
    public Boolean A01;
    public String A02;

    public C111915hd() {
        super(3580, new AnonymousClass00F(1, 1, 1), 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(1, this.A02);
        r3.AdT(3, this.A00);
        r3.AdT(4, this.A01);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("WamAndroidRootedDeviceCheck {");
        C16470t7.appendFieldToStringBuilder(A0r, "checkLocation", this.A02);
        C16470t7.appendFieldToStringBuilder(A0r, "rwPaths", this.A00);
        C16470t7.appendFieldToStringBuilder(A0r, "suExists", this.A01);
        return AnonymousClass000.A0h("}", A0r);
    }
}
