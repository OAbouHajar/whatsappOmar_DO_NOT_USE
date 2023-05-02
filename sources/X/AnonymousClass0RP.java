package X;

import java.util.Map;
import java.util.Set;

/* renamed from: X.0RP  reason: invalid class name */
public final class AnonymousClass0RP {
    public final String A00;
    public final Map A01;
    public final Set A02;
    public final Set A03;

    public AnonymousClass0RP(String str, Map map, Set set, Set set2) {
        this.A00 = str;
        this.A01 = map;
        this.A02 = set;
        this.A03 = set2;
    }

    public boolean equals(Object obj) {
        Set set;
        if (this == obj) {
            return true;
        }
        if (obj instanceof AnonymousClass0RP) {
            AnonymousClass0RP r5 = (AnonymousClass0RP) obj;
            if (C18450wi.A0R(this.A00, r5.A00) && C18450wi.A0R(this.A01, r5.A01) && C18450wi.A0R(this.A02, r5.A02)) {
                Set set2 = this.A03;
                if (set2 == null || (set = r5.A03) == null) {
                    return true;
                }
                return set2.equals(set);
            }
        }
        return false;
    }

    public int hashCode() {
        return AnonymousClass000.A0E(this.A01, this.A00.hashCode() * 31) + this.A02.hashCode();
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("TableInfo{name='");
        A0r.append(this.A00);
        A0r.append("', columns=");
        A0r.append(this.A01);
        A0r.append(", foreignKeys=");
        A0r.append(this.A02);
        A0r.append(", indices=");
        A0r.append(this.A03);
        return AnonymousClass000.A0k(A0r);
    }
}
