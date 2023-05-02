package X;

/* renamed from: X.2YD  reason: invalid class name */
public final class AnonymousClass2YD extends AnonymousClass2YE {
    public final AnonymousClass2YC A00;

    public AnonymousClass2YD(AnonymousClass2YC r7) {
        super(r7, 11, false, false, false);
        this.A00 = r7;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass2YD) && C18450wi.A0R(this.A00, ((AnonymousClass2YD) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Error(errorBehaviour=");
        sb.append(this.A00);
        sb.append(')');
        return sb.toString();
    }
}
