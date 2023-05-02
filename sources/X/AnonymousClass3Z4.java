package X;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: X.3Z4  reason: invalid class name */
public final class AnonymousClass3Z4 extends C105875Bn<Boolean> implements C110015Ur<Boolean>, RandomAccess {
    public static final AnonymousClass3Z4 A02;
    public int A00;
    public boolean[] A01;

    static {
        AnonymousClass3Z4 r0 = new AnonymousClass3Z4(new boolean[10], 0);
        A02 = r0;
        r0.A00 = false;
    }

    public AnonymousClass3Z4(boolean[] zArr, int i2) {
        this.A01 = zArr;
        this.A00 = i2;
    }

    public final void A03(int i2, boolean z2) {
        int i3;
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
        this.A01[i2] = z2;
        this.A00++;
        this.modCount++;
    }

    public final /* synthetic */ C110015Ur AjM(int i2) {
        if (i2 >= this.A00) {
            return new AnonymousClass3Z4(Arrays.copyOf(this.A01, i2), this.A00);
        }
        throw AnonymousClass3K3.A0f();
    }

    public final /* synthetic */ void add(int i2, Object obj) {
        A03(i2, AnonymousClass000.A1X(obj));
    }

    public final boolean addAll(Collection collection) {
        A02();
        if (!(collection instanceof AnonymousClass3Z4)) {
            return super.addAll(collection);
        }
        AnonymousClass3Z4 r7 = (AnonymousClass3Z4) collection;
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

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof AnonymousClass3Z4)) {
                return super.equals(obj);
            }
            AnonymousClass3Z4 r8 = (AnonymousClass3Z4) obj;
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

    public final /* synthetic */ Object remove(int i2) {
        int i3;
        A02();
        if (i2 < 0 || i2 >= (i3 = this.A00)) {
            throw AnonymousClass3K2.A0W(i2, this.A00);
        }
        boolean[] zArr = this.A01;
        boolean z2 = zArr[i2];
        C105875Bn.A01(zArr, i3, i2);
        this.A00--;
        this.modCount++;
        return Boolean.valueOf(z2);
    }

    public final boolean remove(Object obj) {
        A02();
        for (int i2 = 0; i2 < this.A00; i2++) {
            if (obj.equals(Boolean.valueOf(this.A01[i2]))) {
                boolean[] zArr = this.A01;
                System.arraycopy(zArr, i2 + 1, zArr, i2, this.A00 - i2);
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
