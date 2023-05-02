package X;

/* renamed from: X.3hm  reason: invalid class name and case insensitive filesystem */
public final class C70813hm extends C70823hn {
    public final Integer A00;
    public final boolean A01;

    public C70813hm() {
        this((Integer) null, false);
    }

    public C70813hm(Integer num, boolean z2) {
        this.A01 = z2;
        this.A00 = num;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C70813hm) {
                C70813hm r5 = (C70813hm) obj;
                if (this.A01 != r5.A01 || !C18450wi.A0R(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        boolean z2 = this.A01;
        if (z2) {
            z2 = true;
        }
        return ((z2 ? 1 : 0) * true) + AnonymousClass000.A0C(this.A00);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("Loading(isSelected=");
        A0r.append(this.A01);
        A0r.append(", ringColor=");
        return AnonymousClass3K2.A0k(this.A00, A0r);
    }
}
