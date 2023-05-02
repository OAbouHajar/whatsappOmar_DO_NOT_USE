package X;

/* renamed from: X.50a  reason: invalid class name and case insensitive filesystem */
public final class C1030850a implements C109735Tj {
    public static final C1032950v A02 = new C1032950v();
    public final Object A00;
    public final String A01;

    public C1030850a(String str, Object obj) {
        this.A01 = str;
        this.A00 = obj;
    }

    public boolean A8i(AnonymousClass4QM r3) {
        Object obj;
        C18450wi.A0H(r3, 0);
        Object A002 = r3.A00(this.A01);
        if (A002 != null && (obj = this.A00) != null) {
            return !AnonymousClass3BU.A02(obj, A002);
        }
        throw AnonymousClass3K4.A0T("Either variable or expected value or both is/are null");
    }
}
