package X;

/* renamed from: X.3fY  reason: invalid class name and case insensitive filesystem */
public final class C69753fY extends C89134be {
    public final float A00;

    public C69753fY(float f2, float f3, float f4) {
        super(f2, f3);
        this.A00 = f4;
    }

    public boolean A00(float f2, float f3, float f4) {
        if (AnonymousClass3K4.A01(f3, this.A01) <= f2 && AnonymousClass3K4.A01(f4, this.A00) <= f2) {
            float f5 = this.A00;
            float A01 = AnonymousClass3K4.A01(f2, f5);
            if (A01 <= 1.0f || A01 <= f5) {
                return true;
            }
        }
        return false;
    }
}
