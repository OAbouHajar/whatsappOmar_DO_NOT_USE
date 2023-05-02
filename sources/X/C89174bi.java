package X;

/* renamed from: X.4bi  reason: invalid class name and case insensitive filesystem */
public final class C89174bi {
    public static final C89174bi A02 = new C89174bi(0, 0);
    public final long A00;
    public final long A01;

    public C89174bi(long j2, long j3) {
        this.A01 = j2;
        this.A00 = j3;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || C89174bi.class != obj.getClass()) {
                return false;
            }
            C89174bi r7 = (C89174bi) obj;
            if (!(this.A01 == r7.A01 && this.A00 == r7.A00)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (((int) this.A01) * 31) + ((int) this.A00);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("[timeUs=");
        A0r.append(this.A01);
        A0r.append(", position=");
        A0r.append(this.A00);
        return AnonymousClass000.A0h("]", A0r);
    }
}
