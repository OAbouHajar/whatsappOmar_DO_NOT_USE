package X;

import java.util.Iterator;

/* renamed from: X.22t  reason: invalid class name and case insensitive filesystem */
public class C441022t implements Iterable, C23861Dq {
    public final int A00;
    public final int A01;
    public final int A02;

    public C441022t(int i2, int i3, int i4) {
        this.A00 = i2;
        if (i4 > 0) {
            if (i2 < i3) {
                int i5 = i3 % i4;
                int i6 = i2 % i4;
                int i7 = ((i5 < 0 ? i5 + 1 : i5) - (i6 < 0 ? i6 + 1 : i6)) % i4;
                i3 -= i7 < 0 ? i7 + 1 : i7;
            }
        } else if (i2 > i3) {
            int i8 = -i4;
            int i9 = i2 % i8;
            int i10 = i3 % i8;
            int i11 = ((i9 < 0 ? i9 + i8 : i9) - (i10 < 0 ? i10 + i8 : i10)) % i8;
            i3 += i11 < 0 ? i11 + i8 : i11;
        }
        this.A01 = i3;
        this.A02 = i4;
    }

    public final int A00() {
        return this.A00;
    }

    public final int A01() {
        return this.A01;
    }

    public final int A02() {
        return this.A02;
    }

    public boolean A03() {
        if (this instanceof C440922s) {
            return this.A00 > this.A01;
        }
        int i2 = this.A02;
        int i3 = this.A00;
        int i4 = this.A01;
        return i2 > 0 ? i3 > i4 : i3 < i4;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C441022t)) {
            return false;
        }
        if (A03() && ((C441022t) obj).A03()) {
            return true;
        }
        C441022t r3 = (C441022t) obj;
        return this.A00 == r3.A00 && this.A01 == r3.A01 && this.A02 == r3.A02;
    }

    public int hashCode() {
        if (A03()) {
            return -1;
        }
        return (((this.A00 * 31) + this.A01) * 31) + this.A02;
    }

    public /* bridge */ /* synthetic */ Iterator iterator() {
        return new C52222dL(this.A00, this.A01, this.A02);
    }

    public String toString() {
        int i2;
        int i3 = this.A02;
        StringBuilder sb = new StringBuilder();
        int i4 = this.A00;
        if (i3 > 0) {
            sb.append(i4);
            sb.append("..");
            sb.append(this.A01);
            sb.append(" step ");
            i2 = 1;
        } else {
            sb.append(i4);
            sb.append(" downTo ");
            sb.append(this.A01);
            sb.append(" step ");
            i2 = -i3;
        }
        sb.append(i2);
        return sb.toString();
    }
}
