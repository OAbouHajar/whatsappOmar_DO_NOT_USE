package X;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: X.2sw  reason: invalid class name and case insensitive filesystem */
public final class C58132sw extends AnonymousClass1XF<Integer> implements AnonymousClass27P, RandomAccess {
    public static final C58132sw A02;
    public int A00;
    public int[] A01;

    static {
        C58132sw r0 = new C58132sw(new int[10], 0);
        A02 = r0;
        r0.A00 = false;
    }

    public C58132sw(int[] iArr, int i2) {
        this.A01 = iArr;
        this.A00 = i2;
    }

    public final void A01(int i2) {
        if (i2 < 0 || i2 >= this.A00) {
            StringBuilder A0r = AnonymousClass000.A0r("Index:");
            A0r.append(i2);
            A0r.append(", Size:");
            throw new IndexOutOfBoundsException(AnonymousClass000.A0l(A0r, this.A00));
        }
    }

    public final void A02(int i2, int i3) {
        int i4;
        A00();
        if (i2 < 0 || i2 > (i4 = this.A00)) {
            StringBuilder A0r = AnonymousClass000.A0r("Index:");
            A0r.append(i2);
            A0r.append(", Size:");
            throw new IndexOutOfBoundsException(AnonymousClass000.A0l(A0r, this.A00));
        }
        int[] iArr = this.A01;
        if (i4 < iArr.length) {
            System.arraycopy(iArr, i2, iArr, i2 + 1, i4 - i2);
        } else {
            int[] iArr2 = new int[(((i4 * 3) >> 1) + 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            System.arraycopy(this.A01, i2, iArr2, i2 + 1, this.A00 - i2);
            this.A01 = iArr2;
        }
        this.A01[i2] = i3;
        this.A00++;
        this.modCount++;
    }

    /* renamed from: ALd */
    public AnonymousClass27P ALe(int i2) {
        if (i2 >= this.A00) {
            return new C58132sw(Arrays.copyOf(this.A01, i2), this.A00);
        }
        throw new IllegalArgumentException();
    }

    public /* bridge */ /* synthetic */ void add(int i2, Object obj) {
        A02(i2, AnonymousClass000.A0D(obj));
    }

    public boolean addAll(Collection collection) {
        A00();
        if (!(collection instanceof C58132sw)) {
            return super.addAll(collection);
        }
        C58132sw r7 = (C58132sw) collection;
        int i2 = r7.A00;
        if (i2 == 0) {
            return false;
        }
        int i3 = this.A00;
        if (Integer.MAX_VALUE - i3 >= i2) {
            int i4 = i3 + i2;
            int[] iArr = this.A01;
            if (i4 > iArr.length) {
                iArr = Arrays.copyOf(iArr, i4);
                this.A01 = iArr;
            }
            System.arraycopy(r7.A01, 0, iArr, this.A00, r7.A00);
            this.A00 = i4;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C58132sw)) {
                return super.equals(obj);
            }
            C58132sw r8 = (C58132sw) obj;
            int i2 = this.A00;
            if (i2 == r8.A00) {
                int[] iArr = r8.A01;
                int i3 = 0;
                while (i3 < i2) {
                    if (this.A01[i3] == iArr[i3]) {
                        i3++;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public /* bridge */ /* synthetic */ Object get(int i2) {
        A01(i2);
        return Integer.valueOf(this.A01[i2]);
    }

    public int hashCode() {
        int i2 = 1;
        for (int i3 = 0; i3 < this.A00; i3++) {
            i2 = (i2 * 31) + this.A01[i3];
        }
        return i2;
    }

    public /* bridge */ /* synthetic */ Object remove(int i2) {
        A00();
        A01(i2);
        int[] iArr = this.A01;
        int i3 = iArr[i2];
        System.arraycopy(iArr, i2 + 1, iArr, i2, this.A00 - i2);
        this.A00--;
        this.modCount++;
        return Integer.valueOf(i3);
    }

    public boolean remove(Object obj) {
        A00();
        for (int i2 = 0; i2 < this.A00; i2++) {
            if (obj.equals(Integer.valueOf(this.A01[i2]))) {
                int[] iArr = this.A01;
                System.arraycopy(iArr, i2 + 1, iArr, i2, this.A00 - i2);
                this.A00--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }

    public /* bridge */ /* synthetic */ Object set(int i2, Object obj) {
        int A0D = AnonymousClass000.A0D(obj);
        A00();
        A01(i2);
        int[] iArr = this.A01;
        int i3 = iArr[i2];
        iArr[i2] = A0D;
        return Integer.valueOf(i3);
    }

    public int size() {
        return this.A00;
    }
}
