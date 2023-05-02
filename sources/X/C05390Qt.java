package X;

/* renamed from: X.0Qt  reason: invalid class name and case insensitive filesystem */
public final class C05390Qt {
    public final long A00;

    public C05390Qt(long j2) {
        this.A00 = j2;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C05390Qt) && this.A00 == ((C05390Qt) obj).A00);
    }

    public int hashCode() {
        long j2 = this.A00;
        return (int) (j2 ^ (j2 >>> 32));
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("RenderSummary(createdAt=");
        A0r.append(this.A00);
        return AnonymousClass000.A0j(A0r);
    }
}
