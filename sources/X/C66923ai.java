package X;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: X.3ai  reason: invalid class name and case insensitive filesystem */
public final class C66923ai extends C105895Bp<Long> implements C110025Us<Long>, AnonymousClass5M5, RandomAccess {
    public static final C66923ai A02;
    public int A00;
    public long[] A01;

    static {
        C66923ai r0 = new C66923ai(new long[0], 0);
        A02 = r0;
        r0.A00 = false;
    }

    public C66923ai() {
        this(new long[10], 0);
    }

    public C66923ai(long[] jArr, int i2) {
        this.A01 = jArr;
        this.A00 = i2;
    }

    public final void A03(int i2) {
        if (i2 < 0 || i2 >= this.A00) {
            throw AnonymousClass3K2.A0W(i2, this.A00);
        }
    }

    public final void A04(long j2) {
        A02();
        int i2 = this.A00;
        long[] jArr = this.A01;
        if (i2 == jArr.length) {
            long[] jArr2 = new long[AnonymousClass3K4.A03(i2)];
            System.arraycopy(jArr, 0, jArr2, 0, i2);
            this.A01 = jArr2;
            jArr = jArr2;
        }
        int i3 = this.A00;
        this.A00 = i3 + 1;
        jArr[i3] = j2;
    }

    public final /* synthetic */ C110025Us Aim(int i2) {
        if (i2 >= this.A00) {
            return new C66923ai(Arrays.copyOf(this.A01, i2), this.A00);
        }
        throw AnonymousClass3K3.A0f();
    }

    public final /* synthetic */ void add(int i2, Object obj) {
        int i3;
        long A012 = C13700nu.A01(obj);
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
        this.A01[i2] = A012;
        this.A00++;
        this.modCount++;
    }

    public final /* synthetic */ boolean add(Object obj) {
        A04(C13700nu.A01(obj));
        return true;
    }

    public final boolean addAll(Collection collection) {
        A02();
        if (!(collection instanceof C66923ai)) {
            return super.addAll(collection);
        }
        C66923ai r7 = (C66923ai) collection;
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

    public final boolean contains(Object obj) {
        return AnonymousClass3K2.A1X(indexOf(obj), -1);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C66923ai)) {
                return super.equals(obj);
            }
            C66923ai r11 = (C66923ai) obj;
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

    public final int indexOf(Object obj) {
        if (obj instanceof Long) {
            long A012 = C13700nu.A01(obj);
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
        A02();
        A03(i2);
        long[] jArr = this.A01;
        long j2 = jArr[i2];
        C105895Bp.A01(jArr, this.A00, i2);
        this.A00--;
        this.modCount++;
        return Long.valueOf(j2);
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
