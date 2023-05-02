package X;

import java.util.Random;

/* renamed from: X.00F  reason: invalid class name */
public class AnonymousClass00F {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final Random A04;
    public final boolean A05;

    public AnonymousClass00F(int i2, int i3) {
        this(true, 1, i2, i2, i3);
    }

    public AnonymousClass00F(int i2, int i3, int i4) {
        this(false, i2, i3, i3, i4);
    }

    public AnonymousClass00F(boolean z2, int i2, int i3, int i4, int i5) {
        this.A02 = i2;
        this.A00 = i3;
        this.A01 = i4;
        this.A03 = i5;
        this.A05 = z2;
        this.A04 = new Random();
    }

    public boolean A00() {
        return this.A04.nextInt(this.A03) == 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            AnonymousClass00F r5 = (AnonymousClass00F) obj;
            return this.A02 == r5.A02 && this.A00 == r5.A00 && this.A01 == r5.A01 && this.A03 == r5.A03 && this.A05 == r5.A05;
        }
        return false;
    }

    public int hashCode() {
        return (((((((this.A02 * 31) + this.A00) * 31) + this.A01) * 31) + this.A03) * 31) + (this.A05 ? 1 : 0);
    }
}
