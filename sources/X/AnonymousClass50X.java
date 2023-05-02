package X;

/* renamed from: X.50X  reason: invalid class name */
public final class AnonymousClass50X implements C109735Tj {
    public static final C1032650s A02 = new C1032650s();
    public final String A00;
    public final String A01;

    public AnonymousClass50X(String str, String str2) {
        this.A01 = str;
        this.A00 = str2;
    }

    public boolean A8i(AnonymousClass4QM r3) {
        C18450wi.A0H(r3, 0);
        Integer A002 = AnonymousClass3BU.A00(r3.A00(this.A01), r3.A00(this.A00));
        if (A002 != null) {
            return A002.intValue() < 0;
        }
        throw new UnsupportedOperationException("The data type is unsupported for this operation");
    }
}
