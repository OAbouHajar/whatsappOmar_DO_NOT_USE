package X;

/* renamed from: X.0QU  reason: invalid class name */
public final class AnonymousClass0QU {
    public C86294Sb A00;
    public boolean A01;
    public boolean A02;
    public final Object A03;

    public AnonymousClass0QU(AnonymousClass5OI r2, Object obj) {
        this.A03 = obj;
        this.A00 = (C86294Sb) r2.get();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AnonymousClass0QU.class != obj.getClass()) {
            return false;
        }
        return this.A03.equals(((AnonymousClass0QU) obj).A03);
    }

    public int hashCode() {
        return this.A03.hashCode();
    }
}
