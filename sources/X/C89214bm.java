package X;

/* renamed from: X.4bm  reason: invalid class name and case insensitive filesystem */
public final class C89214bm {
    public static final C89214bm A03 = new C89214bm(1.0f, 1.0f);
    public final float A00;
    public final float A01;
    public final int A02;

    public C89214bm(float f2, float f3) {
        boolean z2 = true;
        C90524eJ.A03(AnonymousClass000.A1Q((f2 > 0.0f ? 1 : (f2 == 0.0f ? 0 : -1))));
        C90524eJ.A03(f3 <= 0.0f ? false : z2);
        this.A01 = f2;
        this.A00 = f3;
        this.A02 = Math.round(f2 * 1000.0f);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || C89214bm.class != obj.getClass()) {
                return false;
            }
            C89214bm r5 = (C89214bm) obj;
            if (!(this.A01 == r5.A01 && this.A00 == r5.A00)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass3K3.A07(Float.floatToRawIntBits(this.A01)) + Float.floatToRawIntBits(this.A00);
    }

    public String toString() {
        Object[] A1Z = C13690nt.A1Z();
        A1Z[0] = Float.valueOf(this.A01);
        A1Z[1] = Float.valueOf(this.A00);
        return AnonymousClass3K4.A0b("PlaybackParameters(speed=%.2f, pitch=%.2f)", A1Z);
    }
}
