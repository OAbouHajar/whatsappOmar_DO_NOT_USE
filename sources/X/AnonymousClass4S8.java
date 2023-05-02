package X;

import java.util.Arrays;

/* renamed from: X.4S8  reason: invalid class name */
public final class AnonymousClass4S8 {
    public final int A00;
    public final int A01;
    public final long A02;
    public final C85494Or A03;
    public final int[] A04;
    public final int[] A05;
    public final long[] A06;
    public final long[] A07;

    public AnonymousClass4S8(C85494Or r7, int[] iArr, int[] iArr2, long[] jArr, long[] jArr2, int i2, long j2) {
        int length = iArr.length;
        int length2 = jArr2.length;
        boolean z2 = false;
        C90524eJ.A03(AnonymousClass000.A1R(length, length2));
        int length3 = jArr.length;
        C90524eJ.A03(AnonymousClass000.A1R(length3, length2));
        int length4 = iArr2.length;
        C90524eJ.A03(length4 == length2 ? true : z2);
        this.A03 = r7;
        this.A06 = jArr;
        this.A05 = iArr;
        this.A00 = i2;
        this.A07 = jArr2;
        this.A04 = iArr2;
        this.A02 = j2;
        this.A01 = length3;
        if (length4 > 0) {
            int i3 = length4 - 1;
            iArr2[i3] = iArr2[i3] | 536870912;
        }
    }

    public int A00(long j2) {
        int i2;
        long[] jArr = this.A07;
        int binarySearch = Arrays.binarySearch(jArr, j2);
        if (binarySearch < 0) {
            i2 = binarySearch ^ -1;
        } else {
            do {
                binarySearch++;
                if (binarySearch >= jArr.length || jArr[binarySearch] != j2) {
                    i2 = binarySearch - 1;
                }
                binarySearch++;
                break;
            } while (jArr[binarySearch] != j2);
            i2 = binarySearch - 1;
        }
        while (i2 < jArr.length) {
            if ((this.A04[i2] & 1) != 0) {
                return i2;
            }
            i2++;
        }
        return -1;
    }
}
