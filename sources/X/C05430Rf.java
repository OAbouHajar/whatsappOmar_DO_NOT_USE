package X;

import java.util.Map;
import java.util.Set;

/* renamed from: X.0Rf  reason: invalid class name and case insensitive filesystem */
public final class C05430Rf {
    public final C14930q1 A00;
    public final C14930q1 A01;
    public final Long A02;
    public final String A03;
    public final String A04;
    public final Map A05;
    public final Set A06;

    public C05430Rf(C14930q1 r1, C14930q1 r2, Long l2, String str, String str2, Map map, Set set) {
        this.A04 = str;
        this.A03 = str2;
        this.A01 = r1;
        this.A00 = r2;
        this.A06 = set;
        this.A05 = map;
        this.A02 = l2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C05430Rf) {
                C05430Rf r5 = (C05430Rf) obj;
                if (!C18450wi.A0R(this.A04, r5.A04) || !C18450wi.A0R(this.A03, r5.A03) || !C18450wi.A0R(this.A01, r5.A01) || !C18450wi.A0R(this.A00, r5.A00) || !C18450wi.A0R(this.A06, r5.A06) || !C18450wi.A0R(this.A05, r5.A05) || !C18450wi.A0R(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i2 = 0;
        int hashCode = ((((((((((this.A04.hashCode() * 31) + this.A03.hashCode()) * 31) + AnonymousClass000.A0C(this.A01)) * 31) + AnonymousClass000.A0C(this.A00)) * 31) + AnonymousClass000.A0C(this.A06)) * 31) + AnonymousClass000.A0C(this.A05)) * 31;
        Long l2 = this.A02;
        if (l2 != null) {
            i2 = l2.hashCode();
        }
        return hashCode + i2;
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("ScopedBloksComponentQueryDefinition(id=");
        A0r.append(this.A04);
        A0r.append(", appId=");
        A0r.append(this.A03);
        A0r.append(", paramsExpression=");
        A0r.append(this.A01);
        A0r.append(", clientParamsExpression=");
        A0r.append(this.A00);
        A0r.append(", dependencies=");
        A0r.append(this.A06);
        A0r.append(", targets=");
        A0r.append(this.A05);
        A0r.append(", cacheTtl=");
        A0r.append(this.A02);
        return AnonymousClass000.A0j(A0r);
    }
}
