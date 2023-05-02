package X;

/* renamed from: X.2Vy  reason: invalid class name and case insensitive filesystem */
public final class C49812Vy {
    public final int A00;
    public final AnonymousClass076 A01;

    public C49812Vy(AnonymousClass076 r1, int i2) {
        this.A01 = r1;
        this.A00 = i2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C49812Vy) {
                C49812Vy r5 = (C49812Vy) obj;
                if (!C18450wi.A0R(this.A01, r5.A01) || this.A00 != r5.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.A01.hashCode() * 31) + this.A00;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("MapViewAction(cameraUpdate=");
        sb.append(this.A01);
        sb.append(", animationTime=");
        sb.append(this.A00);
        sb.append(')');
        return sb.toString();
    }
}
