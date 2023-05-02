package X;

/* renamed from: X.4Vu  reason: invalid class name and case insensitive filesystem */
public final class C87194Vu {
    public final int A00;
    public final Object A01;

    public C87194Vu(int i2, Object obj) {
        this.A00 = i2;
        this.A01 = obj;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C87194Vu) {
                C87194Vu r5 = (C87194Vu) obj;
                if (this.A00 != r5.A00 || !C18450wi.A0R(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.A00 * 31) + AnonymousClass000.A0C(this.A01);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("IndexedValue(index=");
        A0r.append(this.A00);
        A0r.append(", value=");
        return AnonymousClass3K2.A0k(this.A01, A0r);
    }
}
