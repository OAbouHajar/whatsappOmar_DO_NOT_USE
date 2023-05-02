package X;

/* renamed from: X.3ls  reason: invalid class name and case insensitive filesystem */
public final class C72283ls extends AnonymousClass4PT {
    public final boolean A00;

    public C72283ls() {
        this(false);
    }

    public C72283ls(boolean z2) {
        this.A00 = z2;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C72283ls) && this.A00 == ((C72283ls) obj).A00);
    }

    public int hashCode() {
        boolean z2 = this.A00;
        if (z2) {
            return 1;
        }
        return z2 ? 1 : 0;
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("HasCatalogChip(isSelected=");
        A0r.append(this.A00);
        return AnonymousClass000.A0j(A0r);
    }
}
