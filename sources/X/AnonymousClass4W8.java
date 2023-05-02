package X;

/* renamed from: X.4W8  reason: invalid class name */
public final class AnonymousClass4W8 {
    public final float A00;
    public final float A01;
    public final C87184Vt A02;

    public AnonymousClass4W8(C87184Vt r1, float f2, float f3) {
        this.A02 = r1;
        this.A01 = f2;
        this.A00 = f3;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass4W8) {
                AnonymousClass4W8 r5 = (AnonymousClass4W8) obj;
                if (!C18450wi.A0R(this.A02, r5.A02) || !C18450wi.A0R(Float.valueOf(this.A01), Float.valueOf(r5.A01)) || !C18450wi.A0R(Float.valueOf(this.A00), Float.valueOf(r5.A00))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((AnonymousClass3K3.A0H(this.A02) + Float.floatToIntBits(this.A01)) * 31) + Float.floatToIntBits(this.A00);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("StatusSize(size=");
        A0r.append(this.A02);
        A0r.append(", strokeWidth=");
        A0r.append(this.A01);
        A0r.append(", innerStrokeWidth=");
        A0r.append(this.A00);
        return AnonymousClass000.A0j(A0r);
    }
}
