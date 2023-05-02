package X;

/* renamed from: X.4Vx  reason: invalid class name and case insensitive filesystem */
public final class C87224Vx {
    public final Object A00;
    public final String A01;
    public final String A02;

    public C87224Vx(Object obj, String str, String str2) {
        C18450wi.A0J(str, str2);
        this.A01 = str;
        this.A02 = str2;
        this.A00 = obj;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C87224Vx) {
                C87224Vx r5 = (C87224Vx) obj;
                if (!C18450wi.A0R(this.A01, r5.A01) || !C18450wi.A0R(this.A02, r5.A02) || !C18450wi.A0R(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass3K2.A09(this.A02, AnonymousClass3K4.A07(this.A01)) + AnonymousClass000.A0C(this.A00);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("BreadCrumbItem(itemId=");
        A0r.append(this.A01);
        A0r.append(", itemName=");
        A0r.append(this.A02);
        A0r.append(", data=");
        return AnonymousClass3K2.A0k(this.A00, A0r);
    }
}
