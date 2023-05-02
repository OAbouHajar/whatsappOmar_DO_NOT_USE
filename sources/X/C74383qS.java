package X;

/* renamed from: X.3qS  reason: invalid class name and case insensitive filesystem */
public final class C74383qS extends C16470t7 {
    public String A00;

    public C74383qS() {
        super(2190, new AnonymousClass00F(1, 20, 20), 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(1, this.A00);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("WamLanguageNotRenderable {");
        C16470t7.appendFieldToStringBuilder(A0r, "missingLanguage", this.A00);
        return AnonymousClass000.A0h("}", A0r);
    }
}
