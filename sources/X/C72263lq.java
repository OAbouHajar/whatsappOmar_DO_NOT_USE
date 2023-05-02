package X;

import java.util.Set;

/* renamed from: X.3lq  reason: invalid class name and case insensitive filesystem */
public final class C72263lq extends AnonymousClass4PT {
    public final Set A00;
    public final boolean A01;

    public C72263lq(Set set, boolean z2) {
        this.A00 = set;
        this.A01 = z2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C72263lq) {
                C72263lq r5 = (C72263lq) obj;
                if (!C18450wi.A0R(this.A00, r5.A00) || this.A01 != r5.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int A0H = AnonymousClass3K3.A0H(this.A00);
        boolean z2 = this.A01;
        if (z2) {
            z2 = true;
        }
        return A0H + (z2 ? 1 : 0);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("GroupedCategoriesChip(categories=");
        A0r.append(this.A00);
        A0r.append(", isSelected=");
        A0r.append(this.A01);
        return AnonymousClass000.A0j(A0r);
    }
}
