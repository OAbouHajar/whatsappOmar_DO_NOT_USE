package X;

/* renamed from: X.4Vt  reason: invalid class name and case insensitive filesystem */
public final class C87184Vt {
    public final float A00;
    public final float A01;

    public C87184Vt(float f2, float f3) {
        this.A01 = f2;
        this.A00 = f3;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C87184Vt) {
                C87184Vt r5 = (C87184Vt) obj;
                if (!C18450wi.A0R(Float.valueOf(this.A01), Float.valueOf(r5.A01)) || !C18450wi.A0R(Float.valueOf(this.A00), Float.valueOf(r5.A00))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (Float.floatToIntBits(this.A01) * 31) + Float.floatToIntBits(this.A00);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("Size(width=");
        A0r.append(this.A01);
        A0r.append(", height=");
        A0r.append(this.A00);
        return AnonymousClass000.A0j(A0r);
    }
}
