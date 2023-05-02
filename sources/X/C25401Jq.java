package X;

import java.io.Serializable;

/* renamed from: X.1Jq  reason: invalid class name and case insensitive filesystem */
public final class C25401Jq implements Serializable {
    public final Object first;
    public final Object second;

    public C25401Jq(Object obj, Object obj2) {
        this.first = obj;
        this.second = obj2;
    }

    public static void A00(Object obj, Object obj2, Object[] objArr, int i2) {
        objArr[i2] = new C25401Jq(obj, obj2);
    }

    public final Object A01() {
        return this.first;
    }

    public final Object A02() {
        return this.second;
    }

    public final Object A03() {
        return this.first;
    }

    public final Object A04() {
        return this.second;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C25401Jq) {
                C25401Jq r5 = (C25401Jq) obj;
                if (!C18450wi.A0R(this.first, r5.first) || !C18450wi.A0R(this.second, r5.second)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        Object obj = this.first;
        int i2 = 0;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.second;
        if (obj2 != null) {
            i2 = obj2.hashCode();
        }
        return hashCode + i2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("(");
        sb.append(this.first);
        sb.append(", ");
        sb.append(this.second);
        sb.append(')');
        return sb.toString();
    }
}
