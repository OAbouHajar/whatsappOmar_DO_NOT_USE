package X;

import java.util.Map;

/* renamed from: X.3nG  reason: invalid class name and case insensitive filesystem */
public final class C73073nG extends C82574Di {
    public boolean A00;
    public final Map A01;

    public C73073nG(Map map, boolean z2) {
        super(true);
        this.A01 = map;
        this.A00 = z2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C73073nG) {
                C73073nG r5 = (C73073nG) obj;
                if (!C18450wi.A0R(this.A01, r5.A01) || this.A00 != r5.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int A0H = AnonymousClass3K3.A0H(this.A01);
        boolean z2 = this.A00;
        if (z2) {
            z2 = true;
        }
        return A0H + (z2 ? 1 : 0);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("FetchGroupedCategoriesSuccess(categories=");
        A0r.append(this.A01);
        A0r.append(", cached=");
        A0r.append(this.A00);
        return AnonymousClass000.A0j(A0r);
    }
}
