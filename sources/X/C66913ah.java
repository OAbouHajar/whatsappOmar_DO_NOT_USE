package X;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: X.3ah  reason: invalid class name and case insensitive filesystem */
public final class C66913ah extends C105895Bp<Integer> implements C110025Us<Integer>, AnonymousClass5M5, RandomAccess {
    public static final C66913ah A02;
    public int A00;
    public int[] A01;

    static {
        C66913ah r0 = new C66913ah(new int[0], 0);
        A02 = r0;
        r0.A00 = false;
    }

    public C66913ah() {
        this(new int[10], 0);
    }

    public C66913ah(int[] iArr, int i2) {
        this.A01 = iArr;
        this.A00 = i2;
    }

    public final void A03(int i2) {
        A02();
        int i3 = this.A00;
        int[] iArr = this.A01;
        if (i3 == iArr.length) {
            int[] iArr2 = new int[AnonymousClass3K4.A03(i3)];
            System.arraycopy(iArr, 0, iArr2, 0, i3);
            this.A01 = iArr2;
            iArr = iArr2;
        }
        int i4 = this.A00;
        this.A00 = i4 + 1;
        iArr[i4] = i2;
    }

    public final void A04(int i2) {
        if (i2 < 0 || i2 >= this.A00) {
            throw AnonymousClass3K2.A0W(i2, this.A00);
        }
    }

    public final /* synthetic */ C110025Us Aim(int i2) {
        if (i2 >= this.A00) {
            return new C66913ah(Arrays.copyOf(this.A01, i2), this.A00);
        }
        throw AnonymousClass3K3.A0f();
    }

    public final /* synthetic */ void add(int i2, Object obj) {
        int i3;
        int A0D = AnonymousClass000.A0D(obj);
        A02();
        if (i2 < 0 || i2 > (i3 = this.A00)) {
            throw AnonymousClass3K2.A0W(i2, this.A00);
        }
        int[] iArr = this.A01;
        if (i3 < iArr.length) {
            AnonymousClass3K4.A10(iArr, i2, i3);
        } else {
            int[] iArr2 = new int[AnonymousClass3K4.A03(i3)];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            System.arraycopy(this.A01, i2, iArr2, i2 + 1, this.A00 - i2);
            this.A01 = iArr2;
        }
        this.A01[i2] = A0D;
        this.A00++;
        this.modCount++;
    }

    public final /* synthetic */ boolean add(Object obj) {
        A03(AnonymousClass000.A0D(obj));
        return true;
    }

    public final boolean addAll(Collection collection) {
        A02();
        if (!(collection instanceof C66913ah)) {
            return super.addAll(collection);
        }
        C66913ah r7 = (C66913ah) collection;
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

    public final boolean contains(Object obj) {
        return AnonymousClass3K2.A1X(indexOf(obj), -1);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C66913ah)) {
                return super.equals(obj);
            }
            C66913ah r8 = (C66913ah) obj;
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

    public final /* synthetic */ Object get(int i2) {
        A04(i2);
        return Integer.valueOf(this.A01[i2]);
    }

    public final int hashCode() {
        int i2 = 1;
        for (int i3 = 0; i3 < this.A00; i3++) {
            i2 = (i2 * 31) + this.A01[i3];
        }
        return i2;
    }

    public final int indexOf(Object obj) {
        if (obj instanceof Integer) {
            int A0D = AnonymousClass000.A0D(obj);
            int size = size();
            for (int i2 = 0; i2 < size; i2++) {
                if (this.A01[i2] == A0D) {
                    return i2;
                }
            }
        }
        return -1;
    }

    public final /* synthetic */ Object remove(int i2) {
        A02();
        A04(i2);
        int[] iArr = this.A01;
        int i3 = iArr[i2];
        C105895Bp.A01(iArr, this.A00, i2);
        this.A00--;
        this.modCount++;
        return Integer.valueOf(i3);
    }

    public final void removeRange(int i2, int i3) {
        A02();
        if (i3 >= i2) {
            int[] iArr = this.A01;
            System.arraycopy(iArr, i3, iArr, i2, this.A00 - i3);
            this.A00 -= i3 - i2;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* synthetic */ Object set(int i2, Object obj) {
        int A0D = AnonymousClass000.A0D(obj);
        A02();
        A04(i2);
        int[] iArr = this.A01;
        int i3 = iArr[i2];
        iArr[i2] = A0D;
        return Integer.valueOf(i3);
    }

    public final int size() {
        return this.A00;
    }
}
