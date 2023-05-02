package X;

import java.util.Arrays;

/* renamed from: X.5HF  reason: invalid class name */
public final class AnonymousClass5HF extends C09200f6 {
    public final transient int[] A00;
    public final transient byte[][] A01;

    public AnonymousClass5HF(int[] iArr, byte[][] bArr) {
        super(C09200f6.A02.data);
        this.A01 = bArr;
        this.A00 = iArr;
    }

    private final Object writeReplace() {
        return new C09200f6(A07());
    }

    public byte A00(int i2) {
        int[] iArr = this.A00;
        byte[][] bArr = this.A01;
        int length = bArr.length;
        AnonymousClass48B.A00((long) iArr[length - 1], (long) i2, 1);
        int binarySearch = Arrays.binarySearch(iArr, 0, length, i2 + 1);
        if (binarySearch < 0) {
            binarySearch ^= -1;
        }
        return bArr[binarySearch][(i2 - (binarySearch == 0 ? 0 : iArr[binarySearch - 1])) + iArr[length + binarySearch]];
    }

    public int A01() {
        return this.A00[this.A01.length - 1];
    }

    public String A03() {
        return new C09200f6(A07()).A03();
    }

    public boolean A04(C09200f6 r14, int i2, int i3, int i4) {
        int i5 = 0;
        int i6 = 0;
        int i7 = i4;
        if (0 <= A01() - i4) {
            int[] iArr = this.A00;
            byte[][] bArr = this.A01;
            int length = bArr.length;
            int binarySearch = Arrays.binarySearch(iArr, 0, length, 1);
            if (binarySearch < 0) {
                binarySearch ^= -1;
            }
            while (i5 < i7) {
                int i8 = binarySearch == 0 ? 0 : iArr[binarySearch - 1];
                int i9 = iArr[length + binarySearch];
                int min = Math.min(i7, (iArr[binarySearch] - i8) + i8) - i5;
                if (r14.A05(bArr[binarySearch], i6, i9 + (i5 - i8), min)) {
                    i6 += min;
                    i5 += min;
                    binarySearch++;
                }
            }
            return true;
        }
        return false;
    }

    public boolean A05(byte[] bArr, int i2, int i3, int i4) {
        int i5 = i2;
        int i6 = i3;
        byte[] bArr2 = bArr;
        C18450wi.A0G(bArr2, 1);
        if (i2 >= 0) {
            if (i5 <= A01() - i4 && i3 >= 0 && i6 <= bArr2.length - i4) {
                int i7 = i4 + i2;
                int[] iArr = this.A00;
                byte[][] bArr3 = this.A01;
                int length = bArr3.length;
                int binarySearch = Arrays.binarySearch(iArr, 0, length, i2 + 1);
                if (binarySearch < 0) {
                    binarySearch ^= -1;
                }
                while (i5 < i7) {
                    int i8 = binarySearch == 0 ? 0 : iArr[binarySearch - 1];
                    int i9 = iArr[length + binarySearch];
                    int min = Math.min(i7, (iArr[binarySearch] - i8) + i8) - i5;
                    int i10 = i9 + (i5 - i8);
                    byte[] bArr4 = bArr3[binarySearch];
                    C18450wi.A0G(bArr4, 0);
                    int i11 = 0;
                    while (i11 < min) {
                        if (bArr4[i11 + i10] == bArr[i11 + i6]) {
                            i11++;
                        }
                    }
                    i6 += min;
                    i5 += min;
                    binarySearch++;
                }
                return true;
            }
        }
        return false;
    }

    public byte[] A06() {
        return A07();
    }

    public byte[] A07() {
        byte[] bArr = new byte[A01()];
        byte[][] bArr2 = this.A01;
        int length = bArr2.length;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i2 < length) {
            int[] iArr = this.A00;
            int i5 = iArr[length + i2];
            int i6 = iArr[i2];
            byte[] bArr3 = bArr2[i2];
            int i7 = i6 - i3;
            C18450wi.A0G(bArr3, 0);
            System.arraycopy(bArr3, i5, bArr, i4, i7);
            i4 += i7;
            i2++;
            i3 = i6;
        }
        return bArr;
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof C09200f6)) {
                return false;
            }
            C09200f6 r5 = (C09200f6) obj;
            if (r5.A01() != A01() || !A04(r5, 0, 0, A01())) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i2 = this.A00;
        if (i2 != 0) {
            return i2;
        }
        byte[][] bArr = this.A01;
        int length = bArr.length;
        int i3 = 0;
        int i4 = 0;
        int i5 = 1;
        while (i3 < length) {
            int[] iArr = this.A00;
            int i6 = iArr[length + i3];
            int i7 = iArr[i3];
            byte[] bArr2 = bArr[i3];
            int i8 = (i7 - i4) + i6;
            while (i6 < i8) {
                i5 = (i5 * 31) + bArr2[i6];
                i6++;
            }
            i3++;
            i4 = i7;
        }
        this.A00 = i5;
        return i5;
    }

    public String toString() {
        return new C09200f6(A07()).toString();
    }
}
