package X;

/* renamed from: X.0Q4  reason: invalid class name */
public class AnonymousClass0Q4 {
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final AnonymousClass0JN A07;
    public final String A08;
    public final String A09;
    public final boolean A0A;

    public AnonymousClass0Q4(AnonymousClass0JN r1, String str, String str2, float f2, float f3, float f4, float f5, int i2, int i3, int i4, boolean z2) {
        this.A09 = str;
        this.A08 = str2;
        this.A02 = f2;
        this.A07 = r1;
        this.A06 = i2;
        this.A01 = f3;
        this.A00 = f4;
        this.A04 = i3;
        this.A05 = i4;
        this.A03 = f5;
        this.A0A = z2;
    }

    public int hashCode() {
        int hashCode = (((((int) (((float) (((this.A09.hashCode() * 31) + this.A08.hashCode()) * 31)) + this.A02)) * 31) + this.A07.ordinal()) * 31) + this.A06;
        long floatToRawIntBits = (long) Float.floatToRawIntBits(this.A01);
        return (((hashCode * 31) + ((int) (floatToRawIntBits ^ (floatToRawIntBits >>> 32)))) * 31) + this.A04;
    }
}
