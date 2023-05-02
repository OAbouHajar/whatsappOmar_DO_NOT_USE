package X;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: X.3Z8  reason: invalid class name */
public final class AnonymousClass3Z8 extends C105875Bn<Long> implements C110015Ur<Long>, RandomAccess {
    public static final AnonymousClass3Z8 A02;
    public int A00;
    public long[] A01;

    static {
        AnonymousClass3Z8 r0 = new AnonymousClass3Z8(new long[10], 0);
        A02 = r0;
        r0.A00 = false;
    }

    public AnonymousClass3Z8(long[] jArr, int i2) {
        this.A01 = jArr;
        this.A00 = i2;
    }

    public final void A03(int i2) {
        if (i2 < 0 || i2 >= this.A00) {
            throw AnonymousClass3K2.A0W(i2, this.A00);
        }
    }

    public final void A04(int i2, long j2) {
        int i3;
        A02();
        if (i2 < 0 || i2 > (i3 = this.A00)) {
            throw AnonymousClass3K2.A0W(i2, this.A00);
        }
        long[] jArr = this.A01;
        if (i3 < jArr.length) {
            AnonymousClass3K4.A10(jArr, i2, i3);
        } else {
            long[] jArr2 = new long[AnonymousClass3K4.A03(i3)];
            System.arraycopy(jArr, 0, jArr2, 0, i2);
            System.arraycopy(this.A01, i2, jArr2, i2 + 1, this.A00 - i2);
            this.A01 = jArr2;
        }
        this.A01[i2] = j2;
        this.A00++;
        this.modCount++;
    }

    public final /* synthetic */ C110015Ur AjM(int i2) {
        if (i2 >= this.A00) {
            return new AnonymousClass3Z8(Arrays.copyOf(this.A01, i2), this.A00);
        }
        throw AnonymousClass3K3.A0f();
    }

    public final /* synthetic */ void add(int i2, Object obj) {
        A04(i2, C13700nu.A01(obj));
    }

    public final boolean addAll(Collection collection) {
        A02();
        if (!(collection instanceof AnonymousClass3Z8)) {
            return super.addAll(collection);
        }
        AnonymousClass3Z8 r7 = (AnonymousClass3Z8) collection;
        int i2 = r7.A00;
        if (i2 == 0) {
            return false;
        }
        int i3 = this.A00;
        if (Integer.MAX_VALUE - i3 >= i2) {
            int i4 = i3 + i2;
            long[] jArr = this.A01;
            if (i4 > jArr.length) {
                jArr = Arrays.copyOf(jArr, i4);
                this.A01 = jArr;
            }
            System.arraycopy(r7.A01, 0, jArr, this.A00, r7.A00);
            this.A00 = i4;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof AnonymousClass3Z8)) {
                return super.equals(obj);
            }
            AnonymousClass3Z8 r11 = (AnonymousClass3Z8) obj;
            int i2 = this.A00;
            if (i2 == r11.A00) {
                long[] jArr = r11.A01;
                int i3 = 0;
                while (i3 < i2) {
                    if (this.A01[i3] == jArr[i3]) {
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
        return Long.valueOf(this.A01[i2]);
    }

    public final int hashCode() {
        int i2 = 1;
        for (int i3 = 0; i3 < this.A00; i3++) {
            i2 = (i2 * 31) + AnonymousClass3K2.A04(this.A01[i3]);
        }
        return i2;
    }

    public final /* synthetic */ Object remove(int i2) {
        A02();
        A03(i2);
        long[] jArr = this.A01;
        long j2 = jArr[i2];
        C105875Bn.A01(jArr, this.A00, i2);
        this.A00--;
        this.modCount++;
        return Long.valueOf(j2);
    }

    public final boolean remove(Object obj) {
        A02();
        for (int i2 = 0; i2 < this.A00; i2++) {
            if (obj.equals(Long.valueOf(this.A01[i2]))) {
                long[] jArr = this.A01;
                System.arraycopy(jArr, i2 + 1, jArr, i2, this.A00 - i2);
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
            long[] jArr = this.A01;
            System.arraycopy(jArr, i3, jArr, i2, this.A00 - i3);
            this.A00 -= i3 - i2;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* synthetic */ Object set(int i2, Object obj) {
        long A012 = C13700nu.A01(obj);
        A02();
        A03(i2);
        long[] jArr = this.A01;
        long j2 = jArr[i2];
        jArr[i2] = A012;
        return Long.valueOf(j2);
    }

    public final int size() {
        return this.A00;
    }
}
