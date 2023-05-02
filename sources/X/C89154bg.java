package X;

/* renamed from: X.4bg  reason: invalid class name and case insensitive filesystem */
public final class C89154bg {
    public Integer A00 = null;
    public String A01 = null;

    public C89154bg() {
    }

    public /* synthetic */ C89154bg(Integer num, String str, C54392hN r4, int i2) {
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C89154bg) {
                C89154bg r5 = (C89154bg) obj;
                if (!C18450wi.A0R(this.A00, r5.A00) || !C18450wi.A0R(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i2 = 0;
        int A0C = AnonymousClass000.A0C(this.A00) * 31;
        String str = this.A01;
        if (str != null) {
            i2 = str.hashCode();
        }
        return A0C + i2;
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("ConfigFetchResult(responseCode=");
        A0r.append(this.A00);
        A0r.append(", exception=");
        return AnonymousClass3K2.A0k(this.A01, A0r);
    }
}
