package X;

/* renamed from: X.3lr  reason: invalid class name and case insensitive filesystem */
public final class C72273lr extends AnonymousClass4PT {
    public final boolean A00;

    public C72273lr() {
        this(false);
    }

    public C72273lr(boolean z2) {
        this.A00 = z2;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C72273lr) && this.A00 == ((C72273lr) obj).A00);
    }

    public int hashCode() {
        boolean z2 = this.A00;
        if (z2) {
            return 1;
        }
        return z2 ? 1 : 0;
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("DistanceChip(isSelected=");
        A0r.append(this.A00);
        return AnonymousClass000.A0j(A0r);
    }
}
