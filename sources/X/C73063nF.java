package X;

import java.util.List;

/* renamed from: X.3nF  reason: invalid class name and case insensitive filesystem */
public final class C73063nF extends C82574Di {
    public boolean A00;
    public final List A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C73063nF(List list, boolean z2) {
        super(true);
        C18450wi.A0H(list, 1);
        this.A01 = list;
        this.A00 = z2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C73063nF) {
                C73063nF r5 = (C73063nF) obj;
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
        StringBuilder A0r = AnonymousClass000.A0r("FetchCategoriesSuccess(categories=");
        A0r.append(this.A01);
        A0r.append(", cached=");
        A0r.append(this.A00);
        return AnonymousClass000.A0j(A0r);
    }
}
