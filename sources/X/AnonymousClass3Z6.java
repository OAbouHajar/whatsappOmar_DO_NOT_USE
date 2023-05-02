package X;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: X.3Z6  reason: invalid class name */
public final class AnonymousClass3Z6 extends C105875Bn<Float> implements C110015Ur<Float>, RandomAccess {
    public static final AnonymousClass3Z6 A02;
    public int A00;
    public float[] A01;

    static {
        AnonymousClass3Z6 r0 = new AnonymousClass3Z6(new float[10], 0);
        A02 = r0;
        r0.A00 = false;
    }

    public AnonymousClass3Z6(float[] fArr, int i2) {
        this.A01 = fArr;
        this.A00 = i2;
    }

    public final void A03(int i2, float f2) {
        int i3;
        A02();
        if (i2 < 0 || i2 > (i3 = this.A00)) {
            throw AnonymousClass3K2.A0W(i2, this.A00);
        }
        float[] fArr = this.A01;
        if (i3 < fArr.length) {
            AnonymousClass3K4.A10(fArr, i2, i3);
        } else {
            float[] fArr2 = new float[AnonymousClass3K4.A03(i3)];
            System.arraycopy(fArr, 0, fArr2, 0, i2);
            System.arraycopy(this.A01, i2, fArr2, i2 + 1, this.A00 - i2);
            this.A01 = fArr2;
        }
        this.A01[i2] = f2;
        this.A00++;
        this.modCount++;
    }

    public final /* synthetic */ C110015Ur AjM(int i2) {
        if (i2 >= this.A00) {
            return new AnonymousClass3Z6(Arrays.copyOf(this.A01, i2), this.A00);
        }
        throw AnonymousClass3K3.A0f();
    }

    public final /* synthetic */ void add(int i2, Object obj) {
        A03(i2, AnonymousClass000.A04(obj));
    }

    public final boolean addAll(Collection collection) {
        A02();
        if (!(collection instanceof AnonymousClass3Z6)) {
            return super.addAll(collection);
        }
        AnonymousClass3Z6 r7 = (AnonymousClass3Z6) collection;
        int i2 = r7.A00;
        if (i2 == 0) {
            return false;
        }
        int i3 = this.A00;
        if (Integer.MAX_VALUE - i3 >= i2) {
            int i4 = i3 + i2;
            float[] fArr = this.A01;
            if (i4 > fArr.length) {
                fArr = Arrays.copyOf(fArr, i4);
                this.A01 = fArr;
            }
            System.arraycopy(r7.A01, 0, fArr, this.A00, r7.A00);
            this.A00 = i4;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof AnonymousClass3Z6)) {
                return super.equals(obj);
            }
            AnonymousClass3Z6 r8 = (AnonymousClass3Z6) obj;
            int i2 = this.A00;
            if (i2 == r8.A00) {
                float[] fArr = r8.A01;
                int i3 = 0;
                while (i3 < i2) {
                    if (this.A01[i3] == fArr[i3]) {
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
            return Float.valueOf(this.A01[i2]);
        }
        throw AnonymousClass3K2.A0W(i2, this.A00);
    }

    public final int hashCode() {
        int i2 = 1;
        for (int i3 = 0; i3 < this.A00; i3++) {
            i2 = (i2 * 31) + Float.floatToIntBits(this.A01[i3]);
        }
        return i2;
    }

    public final /* synthetic */ Object remove(int i2) {
        int i3;
        A02();
        if (i2 < 0 || i2 >= (i3 = this.A00)) {
            throw AnonymousClass3K2.A0W(i2, this.A00);
        }
        float[] fArr = this.A01;
        float f2 = fArr[i2];
        C105875Bn.A01(fArr, i3, i2);
        this.A00--;
        this.modCount++;
        return Float.valueOf(f2);
    }

    public final boolean remove(Object obj) {
        A02();
        for (int i2 = 0; i2 < this.A00; i2++) {
            if (obj.equals(Float.valueOf(this.A01[i2]))) {
                float[] fArr = this.A01;
                System.arraycopy(fArr, i2 + 1, fArr, i2, this.A00 - i2);
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
            float[] fArr = this.A01;
            System.arraycopy(fArr, i3, fArr, i2, this.A00 - i3);
            this.A00 -= i3 - i2;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* synthetic */ Object set(int i2, Object obj) {
        float A04 = AnonymousClass000.A04(obj);
        A02();
        if (i2 < 0 || i2 >= this.A00) {
            throw AnonymousClass3K2.A0W(i2, this.A00);
        }
        float[] fArr = this.A01;
        float f2 = fArr[i2];
        fArr[i2] = A04;
        return Float.valueOf(f2);
    }

    public final int size() {
        return this.A00;
    }
}
