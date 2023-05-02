package X;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: X.3af  reason: invalid class name and case insensitive filesystem */
public final class C66893af extends C105895Bp<Double> implements C110025Us<Double>, AnonymousClass5M5, RandomAccess {
    public static final C66893af A02;
    public int A00;
    public double[] A01;

    static {
        C66893af r0 = new C66893af(new double[0], 0);
        A02 = r0;
        r0.A00 = false;
    }

    public C66893af() {
        this(new double[10], 0);
    }

    public C66893af(double[] dArr, int i2) {
        this.A01 = dArr;
        this.A00 = i2;
    }

    public final void A03(double d2) {
        A02();
        int i2 = this.A00;
        double[] dArr = this.A01;
        if (i2 == dArr.length) {
            double[] dArr2 = new double[AnonymousClass3K4.A03(i2)];
            System.arraycopy(dArr, 0, dArr2, 0, i2);
            this.A01 = dArr2;
            dArr = dArr2;
        }
        int i3 = this.A00;
        this.A00 = i3 + 1;
        dArr[i3] = d2;
    }

    public final /* synthetic */ C110025Us Aim(int i2) {
        if (i2 >= this.A00) {
            return new C66893af(Arrays.copyOf(this.A01, i2), this.A00);
        }
        throw AnonymousClass3K3.A0f();
    }

    public final /* synthetic */ void add(int i2, Object obj) {
        int i3;
        double A012 = AnonymousClass3K3.A01(obj);
        A02();
        if (i2 < 0 || i2 > (i3 = this.A00)) {
            throw AnonymousClass3K2.A0W(i2, this.A00);
        }
        double[] dArr = this.A01;
        if (i3 < dArr.length) {
            AnonymousClass3K4.A10(dArr, i2, i3);
        } else {
            double[] dArr2 = new double[AnonymousClass3K4.A03(i3)];
            System.arraycopy(dArr, 0, dArr2, 0, i2);
            System.arraycopy(this.A01, i2, dArr2, i2 + 1, this.A00 - i2);
            this.A01 = dArr2;
        }
        this.A01[i2] = A012;
        this.A00++;
        this.modCount++;
    }

    public final /* synthetic */ boolean add(Object obj) {
        A03(AnonymousClass3K3.A01(obj));
        return true;
    }

    public final boolean addAll(Collection collection) {
        A02();
        if (!(collection instanceof C66893af)) {
            return super.addAll(collection);
        }
        C66893af r7 = (C66893af) collection;
        int i2 = r7.A00;
        if (i2 == 0) {
            return false;
        }
        int i3 = this.A00;
        if (Integer.MAX_VALUE - i3 >= i2) {
            int i4 = i3 + i2;
            double[] dArr = this.A01;
            if (i4 > dArr.length) {
                dArr = Arrays.copyOf(dArr, i4);
                this.A01 = dArr;
            }
            System.arraycopy(r7.A01, 0, dArr, this.A00, r7.A00);
            this.A00 = i4;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean contains(Object obj) {
        return AnonymousClass3K2.A1X(indexOf(obj), -1);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C66893af)) {
                return super.equals(obj);
            }
            C66893af r11 = (C66893af) obj;
            int i2 = this.A00;
            if (i2 == r11.A00) {
                double[] dArr = r11.A01;
                int i3 = 0;
                while (i3 < i2) {
                    if (Double.doubleToLongBits(this.A01[i3]) == Double.doubleToLongBits(dArr[i3])) {
                        i3++;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final /* synthetic */ Object get(int i2) {
        if (i2 >= 0 && i2 < this.A00) {
            return Double.valueOf(this.A01[i2]);
        }
        throw AnonymousClass3K2.A0W(i2, this.A00);
    }

    public final int hashCode() {
        int i2 = 1;
        for (int i3 = 0; i3 < this.A00; i3++) {
            i2 = (i2 * 31) + AnonymousClass3K2.A04(Double.doubleToLongBits(this.A01[i3]));
        }
        return i2;
    }

    public final int indexOf(Object obj) {
        if (obj instanceof Double) {
            double A012 = AnonymousClass3K3.A01(obj);
            int size = size();
            for (int i2 = 0; i2 < size; i2++) {
                if (this.A01[i2] == A012) {
                    return i2;
                }
            }
        }
        return -1;
    }

    public final /* synthetic */ Object remove(int i2) {
        int i3;
        A02();
        if (i2 < 0 || i2 >= (i3 = this.A00)) {
            throw AnonymousClass3K2.A0W(i2, this.A00);
        }
        double[] dArr = this.A01;
        double d2 = dArr[i2];
        C105895Bp.A01(dArr, i3, i2);
        this.A00--;
        this.modCount++;
        return Double.valueOf(d2);
    }

    public final void removeRange(int i2, int i3) {
        A02();
        if (i3 >= i2) {
            double[] dArr = this.A01;
            System.arraycopy(dArr, i3, dArr, i2, this.A00 - i3);
            this.A00 -= i3 - i2;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* synthetic */ Object set(int i2, Object obj) {
        double A012 = AnonymousClass3K3.A01(obj);
        A02();
        if (i2 < 0 || i2 >= this.A00) {
            throw AnonymousClass3K2.A0W(i2, this.A00);
        }
        double[] dArr = this.A01;
        double d2 = dArr[i2];
        dArr[i2] = A012;
        return Double.valueOf(d2);
    }

    public final int size() {
        return this.A00;
    }
}
