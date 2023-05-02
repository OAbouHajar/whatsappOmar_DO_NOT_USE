package X;

/* renamed from: X.50S  reason: invalid class name */
public final class AnonymousClass50S implements C109735Tj {
    public static final C1032150n A02 = new C1032150n();
    public final Object A00;
    public final String A01;

    public AnonymousClass50S(String str, Object obj) {
        this.A01 = str;
        this.A00 = obj;
    }

    public boolean A8i(AnonymousClass4QM r3) {
        C18450wi.A0H(r3, 0);
        Integer A002 = AnonymousClass3BU.A00(r3.A00(this.A01), this.A00);
        if (A002 != null) {
            return C13700nu.A0f(A002.intValue());
        }
        throw new UnsupportedOperationException("The data type is unsupported for this operation");
    }
}
