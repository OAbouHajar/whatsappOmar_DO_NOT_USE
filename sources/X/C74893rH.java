package X;

/* renamed from: X.3rH  reason: invalid class name and case insensitive filesystem */
public final class C74893rH extends C16470t7 {
    public Integer A00;
    public String A01;
    public String A02;

    public C74893rH() {
        super(1128, C16470t7.DEFAULT_SAMPLING_RATE, 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(1, this.A00);
        r3.AdT(3, this.A01);
        r3.AdT(2, this.A02);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("WamGifSearchNoResults {");
        C16470t7.appendFieldToStringBuilder(A0r, "gifSearchProvider", C13690nt.A0d(this.A00));
        C16470t7.appendFieldToStringBuilder(A0r, "inputLanguageCode", this.A01);
        C16470t7.appendFieldToStringBuilder(A0r, "languageCode", this.A02);
        return AnonymousClass000.A0h("}", A0r);
    }
}
