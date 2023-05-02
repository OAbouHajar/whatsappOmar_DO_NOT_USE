package X;

import java.util.Map;

/* renamed from: X.4W3  reason: invalid class name */
public final class AnonymousClass4W3 {
    public final long A00;
    public final String A01;
    public final Map A02;

    public AnonymousClass4W3(String str, Map map, long j2) {
        this.A00 = j2;
        this.A01 = str;
        this.A02 = map;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass4W3) {
                AnonymousClass4W3 r8 = (AnonymousClass4W3) obj;
                if (this.A00 != r8.A00 || !C18450wi.A0R(this.A01, r8.A01) || !C18450wi.A0R(this.A02, r8.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i2 = 0;
        int A04 = ((AnonymousClass3K2.A04(this.A00) * 31) + AnonymousClass000.A0G(this.A01)) * 31;
        Map map = this.A02;
        if (map != null) {
            i2 = map.hashCode();
        }
        return A04 + i2;
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("FdsError(errorCode=");
        A0r.append(this.A00);
        A0r.append(", errorMessage=");
        A0r.append(this.A01);
        A0r.append(", params=");
        return AnonymousClass3K2.A0k(this.A02, A0r);
    }
}
