package X;

/* renamed from: X.4TH  reason: invalid class name */
public final class AnonymousClass4TH {
    public final long A00;
    public final long A01;

    public AnonymousClass4TH(long j2, long j3) {
        this.A01 = j2;
        this.A00 = j3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnonymousClass4TH)) {
            return false;
        }
        AnonymousClass4TH r7 = (AnonymousClass4TH) obj;
        return this.A01 == r7.A01 && this.A00 == r7.A00;
    }

    public int hashCode() {
        return (((int) this.A01) * 31) + ((int) this.A00);
    }
}
