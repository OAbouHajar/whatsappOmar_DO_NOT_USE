package X;

/* renamed from: X.3qO  reason: invalid class name and case insensitive filesystem */
public final class C74343qO extends C16470t7 {
    public Integer A00;

    public C74343qO() {
        super(1122, C16470t7.DEFAULT_SAMPLING_RATE, 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(1, this.A00);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("WamGifSearchResultTapped {");
        C16470t7.appendFieldToStringBuilder(A0r, "gifSearchProvider", C13690nt.A0d(this.A00));
        return AnonymousClass000.A0h("}", A0r);
    }
}
