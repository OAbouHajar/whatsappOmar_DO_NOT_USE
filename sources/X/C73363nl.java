package X;

/* renamed from: X.3nl  reason: invalid class name and case insensitive filesystem */
public final class C73363nl extends AnonymousClass2YE {
    public final boolean A00;

    public C73363nl(boolean z2) {
        super((AnonymousClass2YC) null, 14, z2, false, false);
        this.A00 = z2;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C73363nl) && this.A00 == ((C73363nl) obj).A00);
    }

    public int hashCode() {
        boolean z2 = this.A00;
        if (z2) {
            return 1;
        }
        return z2 ? 1 : 0;
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("CategoryList(isCategoriesEnabled=");
        A0r.append(this.A00);
        return AnonymousClass000.A0j(A0r);
    }
}
