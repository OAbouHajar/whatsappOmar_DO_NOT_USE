package X;

/* renamed from: X.2Y8  reason: invalid class name */
public final class AnonymousClass2Y8 extends AnonymousClass2XV {
    public final AnonymousClass2Y5 A00;

    public AnonymousClass2Y8(AnonymousClass2Y5 r2) {
        super(C440222l.A00);
        this.A00 = r2;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass2Y8) && C18450wi.A0R(this.A00, ((AnonymousClass2Y8) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("FailedStartSearch(failureType=");
        sb.append(this.A00);
        sb.append(')');
        return sb.toString();
    }
}
