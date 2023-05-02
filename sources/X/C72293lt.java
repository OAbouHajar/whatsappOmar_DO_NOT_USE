package X;

/* renamed from: X.3lt  reason: invalid class name and case insensitive filesystem */
public final class C72293lt extends AnonymousClass4PT {
    public final boolean A00;

    public C72293lt() {
        this(false);
    }

    public C72293lt(boolean z2) {
        this.A00 = z2;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C72293lt) && this.A00 == ((C72293lt) obj).A00);
    }

    public int hashCode() {
        boolean z2 = this.A00;
        if (z2) {
            return 1;
        }
        return z2 ? 1 : 0;
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("OpenNowChip(isSelected=");
        A0r.append(this.A00);
        return AnonymousClass000.A0j(A0r);
    }
}
