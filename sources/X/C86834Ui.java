package X;

/* renamed from: X.4Ui  reason: invalid class name and case insensitive filesystem */
public final class C86834Ui {
    public final int A00;
    public final AnonymousClass5TV A01;
    public final C437721l A02;
    public final String A03;

    public C86834Ui(AnonymousClass5TV r3, C437721l r4, String str) {
        this.A02 = r4;
        this.A01 = r3;
        this.A03 = str;
        Object[] objArr = new Object[3];
        AnonymousClass000.A1E(r4, r3, objArr);
        this.A00 = AnonymousClass000.A0F(str, objArr, 2);
    }

    public final boolean equals(Object obj) {
        if (obj != null) {
            if (obj != this) {
                if (obj instanceof C86834Ui) {
                    C86834Ui r5 = (C86834Ui) obj;
                    if (!AnonymousClass45A.A00(this.A02, r5.A02) || !AnonymousClass45A.A00(this.A01, r5.A01) || !AnonymousClass45A.A00(this.A03, r5.A03)) {
                        return false;
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.A00;
    }
}
