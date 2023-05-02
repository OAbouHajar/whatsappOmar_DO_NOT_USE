package X;

/* renamed from: X.3le  reason: invalid class name and case insensitive filesystem */
public final class C72153le extends C31301dt {
    public final boolean A00;

    public C72153le(boolean z2) {
        super(AnonymousClass428.A0P);
        this.A00 = z2;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C72153le) && this.A00 == ((C72153le) obj).A00);
    }

    public int hashCode() {
        boolean z2 = this.A00;
        if (z2) {
            return 1;
        }
        return z2 ? 1 : 0;
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("NearbyBusinessWidgetShimmerItem(showHeaderShimmer=");
        A0r.append(this.A00);
        return AnonymousClass000.A0j(A0r);
    }
}
