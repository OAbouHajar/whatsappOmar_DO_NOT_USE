package X;

/* renamed from: X.4be  reason: invalid class name and case insensitive filesystem */
public class C89134be {
    public final float A00;
    public final float A01;

    public C89134be(float f2, float f3) {
        this.A00 = f2;
        this.A01 = f3;
    }

    public static float A00(C89134be r4, C89134be r5) {
        float f2 = r4.A00;
        float f3 = r4.A01;
        float f4 = f2 - r5.A00;
        float f5 = f3 - r5.A01;
        return (float) Math.sqrt((double) ((f4 * f4) + (f5 * f5)));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C89134be) {
            C89134be r4 = (C89134be) obj;
            return this.A00 == r4.A00 && this.A01 == r4.A01;
        }
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.A00) * 31) + Float.floatToIntBits(this.A01);
    }

    public final String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("(");
        A0r.append(this.A00);
        A0r.append(',');
        A0r.append(this.A01);
        return AnonymousClass000.A0j(A0r);
    }
}
