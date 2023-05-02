package X;

import java.util.Map;

/* renamed from: X.4W4  reason: invalid class name */
public final class AnonymousClass4W4 {
    public final String A00;
    public final String A01;
    public final Map A02;

    public AnonymousClass4W4(Map map, String str, String str2) {
        C18450wi.A0H(str, 1);
        this.A00 = str;
        this.A01 = str2;
        this.A02 = map;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass4W4) {
                AnonymousClass4W4 r5 = (AnonymousClass4W4) obj;
                if (!C18450wi.A0R(this.A00, r5.A00) || !C18450wi.A0R(this.A01, r5.A01) || !C18450wi.A0R(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i2 = 0;
        int A07 = (AnonymousClass3K4.A07(this.A00) + AnonymousClass000.A0G(this.A01)) * 31;
        Map map = this.A02;
        if (map != null) {
            i2 = map.hashCode();
        }
        return A07 + i2;
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("FdsNode(config=");
        A0r.append(this.A00);
        A0r.append(", state=");
        A0r.append(this.A01);
        A0r.append(", params=");
        return AnonymousClass3K2.A0k(this.A02, A0r);
    }
}
