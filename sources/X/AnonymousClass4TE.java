package X;

/* renamed from: X.4TE  reason: invalid class name */
public final class AnonymousClass4TE {
    public final int A00;
    public final int A01;

    public AnonymousClass4TE(int i2, int i3) {
        this.A01 = i2;
        this.A00 = i3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnonymousClass4TE)) {
            return false;
        }
        AnonymousClass4TE r4 = (AnonymousClass4TE) obj;
        return this.A01 == r4.A01 && this.A00 == r4.A00;
    }

    public int hashCode() {
        return ((16337 + this.A01) * 31) + this.A00;
    }
}
