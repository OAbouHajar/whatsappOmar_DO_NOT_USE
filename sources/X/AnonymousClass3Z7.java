package X;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: X.3Z7  reason: invalid class name */
public final class AnonymousClass3Z7 extends C105875Bn<Integer> implements C110015Ur<Integer>, RandomAccess {
    public static final AnonymousClass3Z7 A02;
    public int A00;
    public int[] A01;

    static {
        AnonymousClass3Z7 r0 = new AnonymousClass3Z7(new int[10], 0);
        A02 = r0;
        r0.A00 = false;
    }

    public AnonymousClass3Z7(int[] iArr, int i2) {
        this.A01 = iArr;
        this.A00 = i2;
    }

    public final void A03(int i2) {
        if (i2 < 0 || i2 >= this.A00) {
            throw AnonymousClass3K2.A0W(i2, this.A00);
        }
    }

    public final void A04(int i2, int i3) {
        int i4;
        A02();
        if (i2 < 0 || i2 > (i4 = this.A00)) {
            throw AnonymousClass3K2.A0W(i2, this.A00);
        }
        int[] iArr = this.A01;
        if (i4 < iArr.length) {
            AnonymousClass3K4.A10(iArr, i2, i4);
        } else {
            int[] iArr2 = new int[AnonymousClass3K4.A03(i4)];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            System.arraycopy(this.A01, i2, iArr2, i2 + 1, this.A00 - i2);
            this.A01 = iArr2;
        }
        this.A01[i2] = i3;
        this.A00++;
        this.modCount++;
    }

    public final /* synthetic */ C110015Ur AjM(int i2) {
        if (i2 >= this.A00) {
            return new AnonymousClass3Z7(Arrays.copyOf(this.A01, i2), this.A00);
        }
        throw AnonymousClass3K3.A0f();
    }

    public final /* synthetic */ void add(int i2, Object obj) {
        A04(i2, AnonymousClass000.A0D(obj));
    }

    public final boolean addAll(Collection collection) {
        A02();
        if (!(collection instanceof AnonymousClass3Z7)) {
            return super.addAll(collection);
        }
        AnonymousClass3Z7 r7 = (AnonymousClass3Z7) collection;
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

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof AnonymousClass3Z7)) {
                return super.equals(obj);
            }
            AnonymousClass3Z7 r8 = (AnonymousClass3Z7) obj;
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
        A03(i2);
        return Integer.valueOf(this.A01[i2]);
    }

    public final int hashCode() {
        int i2 = 1;
        for (int i3 = 0; i3 < this.A00; i3++) {
            i2 = (i2 * 31) + this.A01[i3];
        }
        return i2;
    }

    public final /* synthetic */ Object remove(int i2) {
        A02();
        A03(i2);
        int[] iArr = this.A01;
        int i3 = iArr[i2];
        C105875Bn.A01(iArr, this.A00, i2);
        this.A00--;
        this.modCount++;
        return Integer.valueOf(i3);
    }

    public final boolean remove(Object obj) {
        A02();
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
        A03(i2);
        int[] iArr = this.A01;
        int i3 = iArr[i2];
        iArr[i2] = A0D;
        return Integer.valueOf(i3);
    }

    public final int size() {
        return this.A00;
    }
}
