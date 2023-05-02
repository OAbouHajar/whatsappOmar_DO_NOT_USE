package X;

import java.util.Map;

/* renamed from: X.4Vj  reason: invalid class name and case insensitive filesystem */
public final class C87104Vj {
    public final Map A00;
    public final Map A01;

    public C87104Vj(Map map, Map map2) {
        this.A01 = map;
        this.A00 = map2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C87104Vj) {
                C87104Vj r5 = (C87104Vj) obj;
                if (!C18450wi.A0R(this.A01, r5.A01) || !C18450wi.A0R(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass3K2.A06(this.A00, AnonymousClass3K3.A0H(this.A01));
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("MessageRanks(individualRanks=");
        A0r.append(this.A01);
        A0r.append(", groupRanks=");
        return AnonymousClass3K2.A0k(this.A00, A0r);
    }
}
