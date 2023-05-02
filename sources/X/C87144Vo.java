package X;

import java.util.Map;

/* renamed from: X.4Vo  reason: invalid class name and case insensitive filesystem */
public final class C87144Vo {
    public final C86034Qy A00;
    public final Map A01;

    public C87144Vo(C86034Qy r1, Map map) {
        this.A00 = r1;
        this.A01 = map;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C87144Vo) {
                C87144Vo r5 = (C87144Vo) obj;
                if (!C18450wi.A0R(this.A00, r5.A00) || !C18450wi.A0R(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass3K3.A0H(this.A00) + AnonymousClass000.A0C(this.A01);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("StateInputCacheData(cachedState=");
        A0r.append(this.A00);
        A0r.append(", cachedStateInput=");
        return AnonymousClass3K2.A0k(this.A01, A0r);
    }
}
