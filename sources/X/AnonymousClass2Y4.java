package X;

/* renamed from: X.2Y4  reason: invalid class name */
public final class AnonymousClass2Y4 extends AnonymousClass2XV {
    public final AnonymousClass2Y5 A00;

    public AnonymousClass2Y4(AnonymousClass2Y5 r2) {
        super(C440222l.A00);
        this.A00 = r2;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass2Y4) && C18450wi.A0R(this.A00, ((AnonymousClass2Y4) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("FailedContinueSearch(failureType=");
        sb.append(this.A00);
        sb.append(')');
        return sb.toString();
    }
}
