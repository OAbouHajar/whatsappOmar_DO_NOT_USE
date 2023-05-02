package X;

/* renamed from: X.3r4  reason: invalid class name and case insensitive filesystem */
public final class C74763r4 extends C16470t7 {
    public String A00;
    public String A01;

    public C74763r4() {
        super(3448, new AnonymousClass00F(1, 1000, 2000), 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(1, this.A00);
        r3.AdT(2, this.A01);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("WamUnknownStanza {");
        C16470t7.appendFieldToStringBuilder(A0r, "unknownStanzaTag", this.A00);
        C16470t7.appendFieldToStringBuilder(A0r, "unknownStanzaType", this.A01);
        return AnonymousClass000.A0h("}", A0r);
    }
}
