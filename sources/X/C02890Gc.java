package X;

/* renamed from: X.0Gc  reason: invalid class name and case insensitive filesystem */
public final class C02890Gc extends AnonymousClass02Q {
    public final C007203h A00 = C007203h.A01;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C02890Gc.class != obj.getClass()) {
            return false;
        }
        return this.A00.equals(((C02890Gc) obj).A00);
    }

    public int hashCode() {
        return (C02890Gc.class.getName().hashCode() * 31) + this.A00.hashCode();
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("Failure {mOutputData=");
        A0r.append(this.A00);
        return AnonymousClass000.A0k(A0r);
    }
}
