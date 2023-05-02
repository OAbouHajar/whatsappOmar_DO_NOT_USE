package X;

/* renamed from: X.2WI  reason: invalid class name */
public final class AnonymousClass2WI extends AnonymousClass2WH {
    public final boolean A00;

    public AnonymousClass2WI() {
        this(false);
    }

    public AnonymousClass2WI(boolean z2) {
        this.A00 = z2;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass2WI) && this.A00 == ((AnonymousClass2WI) obj).A00);
    }

    public int hashCode() {
        boolean z2 = this.A00;
        if (z2) {
            return 1;
        }
        return z2 ? 1 : 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("NewUser(isDeleted=");
        sb.append(this.A00);
        sb.append(')');
        return sb.toString();
    }
}
