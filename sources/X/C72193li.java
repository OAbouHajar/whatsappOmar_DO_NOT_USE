package X;

/* renamed from: X.3li  reason: invalid class name and case insensitive filesystem */
public final class C72193li extends C31301dt {
    public final C29111a3 A00;
    public final String A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C72193li(C29111a3 r2, String str) {
        super(AnonymousClass428.A0J);
        C18450wi.A0H(r2, 2);
        this.A01 = str;
        this.A00 = r2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C72193li) {
                C72193li r5 = (C72193li) obj;
                if (!C18450wi.A0R(this.A01, r5.A01) || !C18450wi.A0R(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass3K2.A06(this.A00, AnonymousClass000.A0G(this.A01) * 31);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("LocationPermissionRequestFooterViewData(categoryId=");
        A0r.append(this.A01);
        A0r.append(", locationRequestClickListener=");
        return AnonymousClass3K2.A0k(this.A00, A0r);
    }
}
