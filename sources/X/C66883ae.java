package X;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: X.3ae  reason: invalid class name and case insensitive filesystem */
public final class C66883ae extends C105895Bp<Boolean> implements C110025Us<Boolean>, AnonymousClass5M5, RandomAccess {
    public static final C66883ae A02;
    public int A00;
    public boolean[] A01;

    static {
        C66883ae r0 = new C66883ae(new boolean[0], 0);
        A02 = r0;
        r0.A00 = false;
    }

    public C66883ae() {
        this(new boolean[10], 0);
    }

    public C66883ae(boolean[] zArr, int i2) {
        this.A01 = zArr;
        this.A00 = i2;
    }

    public final void A03(boolean z2) {
        A02();
        int i2 = this.A00;
        boolean[] zArr = this.A01;
        if (i2 == zArr.length) {
            boolean[] zArr2 = new boolean[AnonymousClass3K4.A03(i2)];
            System.arraycopy(zArr, 0, zArr2, 0, i2);
            this.A01 = zArr2;
            zArr = zArr2;
        }
        int i3 = this.A00;
        this.A00 = i3 + 1;
        zArr[i3] = z2;
    }

    public final /* synthetic */ C110025Us Aim(int i2) {
        if (i2 >= this.A00) {
            return new C66883ae(Arrays.copyOf(this.A01, i2), this.A00);
        }
        throw AnonymousClass3K3.A0f();
    }

    public final /* synthetic */ void add(int i2, Object obj) {
        int i3;
        boolean A1X = AnonymousClass000.A1X(obj);
        A02();
        if (i2 < 0 || i2 > (i3 = this.A00)) {
            throw AnonymousClass3K2.A0W(i2, this.A00);
        }
        boolean[] zArr = this.A01;
        if (i3 < zArr.length) {
            AnonymousClass3K4.A10(zArr, i2, i3);
        } else {
            boolean[] zArr2 = new boolean[AnonymousClass3K4.A03(i3)];
            System.arraycopy(zArr, 0, zArr2, 0, i2);
            System.arraycopy(this.A01, i2, zArr2, i2 + 1, this.A00 - i2);
            this.A01 = zArr2;
        }
        this.A01[i2] = A1X;
        this.A00++;
        this.modCount++;
    }

    public final /* synthetic */ boolean add(Object obj) {
        A03(AnonymousClass000.A1X(obj));
        return true;
    }

    public final boolean addAll(Collection collection) {
        A02();
        if (!(collection instanceof C66883ae)) {
            return super.addAll(collection);
        }
        C66883ae r7 = (C66883ae) collection;
        int i2 = r7.A00;
        if (i2 == 0) {
            return false;
        }
        int i3 = this.A00;
        if (Integer.MAX_VALUE - i3 >= i2) {
            int i4 = i3 + i2;
            boolean[] zArr = this.A01;
            if (i4 > zArr.length) {
                zArr = Arrays.copyOf(zArr, i4);
                this.A01 = zArr;
            }
            System.arraycopy(r7.A01, 0, zArr, this.A00, r7.A00);
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
            if (!(obj instanceof C66883ae)) {
                return super.equals(obj);
            }
            C66883ae r8 = (C66883ae) obj;
            int i2 = this.A00;
            if (i2 == r8.A00) {
                boolean[] zArr = r8.A01;
                int i3 = 0;
                while (i3 < i2) {
                    if (this.A01[i3] == zArr[i3]) {
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
            return Boolean.valueOf(this.A01[i2]);
        }
        throw AnonymousClass3K2.A0W(i2, this.A00);
    }

    public final int hashCode() {
        int i2 = 1;
        for (int i3 = 0; i3 < this.A00; i3++) {
            int i4 = i2 * 31;
            int i5 = 1237;
            if (this.A01[i3]) {
                i5 = 1231;
            }
            i2 = i4 + i5;
        }
        return i2;
    }

    public final int indexOf(Object obj) {
        if (obj instanceof Boolean) {
            boolean A1X = AnonymousClass000.A1X(obj);
            int size = size();
            for (int i2 = 0; i2 < size; i2++) {
                if (this.A01[i2] == A1X) {
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
        boolean[] zArr = this.A01;
        boolean z2 = zArr[i2];
        C105895Bp.A01(zArr, i3, i2);
        this.A00--;
        this.modCount++;
        return Boolean.valueOf(z2);
    }

    public final void removeRange(int i2, int i3) {
        A02();
        if (i3 >= i2) {
            boolean[] zArr = this.A01;
            System.arraycopy(zArr, i3, zArr, i2, this.A00 - i3);
            this.A00 -= i3 - i2;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* synthetic */ Object set(int i2, Object obj) {
        boolean A1X = AnonymousClass000.A1X(obj);
        A02();
        if (i2 < 0 || i2 >= this.A00) {
            throw AnonymousClass3K2.A0W(i2, this.A00);
        }
        boolean[] zArr = this.A01;
        boolean z2 = zArr[i2];
        zArr[i2] = A1X;
        return Boolean.valueOf(z2);
    }

    public final int size() {
        return this.A00;
    }
}
