package X;

/* renamed from: X.4Vy  reason: invalid class name and case insensitive filesystem */
public final class C87234Vy {
    public final AnonymousClass4DQ A00;
    public final C73563oM A01;
    public final boolean A02;

    public C87234Vy(AnonymousClass4DQ r2, C73563oM r3, boolean z2) {
        C18450wi.A0H(r2, 2);
        this.A02 = z2;
        this.A00 = r2;
        this.A01 = r3;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C87234Vy) {
                C87234Vy r5 = (C87234Vy) obj;
                if (this.A02 != r5.A02 || !C18450wi.A0R(this.A00, r5.A00) || !C18450wi.A0R(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        boolean z2 = this.A02;
        if (z2) {
            z2 = true;
        }
        return AnonymousClass3K2.A06(this.A01, AnonymousClass000.A0E(this.A00, (z2 ? 1 : 0) * true));
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("MapViewFilterItem(isSelected=");
        A0r.append(this.A02);
        A0r.append(", clickListener=");
        A0r.append(this.A00);
        A0r.append(", bizDirectoryCategory=");
        return AnonymousClass3K2.A0k(this.A01, A0r);
    }
}
