package X;

/* renamed from: X.50Z  reason: invalid class name */
public final class AnonymousClass50Z implements C109735Tj {
    public static final C1032850u A02 = new C1032850u();
    public final String A00;
    public final String A01;

    public AnonymousClass50Z(String str, String str2) {
        this.A01 = str;
        this.A00 = str2;
    }

    public boolean A8i(AnonymousClass4QM r3) {
        C18450wi.A0H(r3, 0);
        Object A002 = r3.A00(this.A01);
        Object A003 = r3.A00(this.A00);
        if (A002 != null && A003 != null) {
            return !AnonymousClass3BU.A02(A002, A003);
        }
        throw AnonymousClass3K4.A0T("Either variable or expected value or both is/are null");
    }
}
