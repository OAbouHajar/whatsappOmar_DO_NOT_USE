package X;

/* renamed from: X.4TL  reason: invalid class name */
public final class AnonymousClass4TL {
    public final C88964bN A00;
    public final C31201dg A01;

    public AnonymousClass4TL(C88964bN r1, C31201dg r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AnonymousClass4TL)) {
            return false;
        }
        AnonymousClass4TL r4 = (AnonymousClass4TL) obj;
        return this.A01 == r4.A01 && this.A00.equals(r4.A00);
    }

    public int hashCode() {
        return this.A01.hashCode() ^ this.A00.hashCode();
    }
}
