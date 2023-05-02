package X;

/* renamed from: X.4dN  reason: invalid class name and case insensitive filesystem */
public final class C90024dN {
    public static final int[][] A02 = {new int[]{21522, 0}, new int[]{20773, 1}, new int[]{24188, 2}, new int[]{23371, 3}, new int[]{17913, 4}, new int[]{16590, 5}, new int[]{20375, 6}, new int[]{19104, 7}, new int[]{30660, 8}, new int[]{29427, 9}, new int[]{32170, 10}, new int[]{30877, 11}, new int[]{26159, 12}, new int[]{25368, 13}, new int[]{27713, 14}, new int[]{26998, 15}, new int[]{5769, 16}, new int[]{5054, 17}, new int[]{7399, 18}, new int[]{6608, 19}, new int[]{1890, 20}, new int[]{597, 21}, new int[]{3340, 22}, new int[]{2107, 23}, new int[]{13663, 24}, new int[]{12392, 25}, new int[]{16177, 26}, new int[]{14854, 27}, new int[]{9396, 28}, new int[]{8579, 29}, new int[]{11994, 30}, new int[]{11245, 31}};
    public final byte A00;
    public final C51232bE A01;

    public C90024dN(int i2) {
        int i3 = (i2 >> 3) & 3;
        if (i3 >= 0) {
            C51232bE[] r1 = C51232bE.A00;
            if (i3 < r1.length) {
                this.A01 = r1[i3];
                this.A00 = (byte) (i2 & 7);
                return;
            }
        }
        throw AnonymousClass3K3.A0f();
    }

    public static C90024dN A00(int i2, int i3) {
        int[] iArr;
        int bitCount;
        int[][] iArr2 = A02;
        int length = iArr2.length;
        int i4 = Integer.MAX_VALUE;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            if (i5 < length) {
                iArr = iArr2[i5];
                int i7 = iArr[0];
                if (i7 == i2 || i7 == i3) {
                    i6 = iArr[1];
                } else {
                    int bitCount2 = Integer.bitCount(i2 ^ i7);
                    if (bitCount2 < i4) {
                        i6 = iArr[1];
                        i4 = bitCount2;
                    }
                    if (i2 != i3 && (bitCount = Integer.bitCount(i3 ^ i7)) < i4) {
                        i6 = iArr[1];
                        i4 = bitCount;
                    }
                    i5++;
                }
            } else if (i4 > 3) {
                return null;
            }
        }
        i6 = iArr[1];
        return new C90024dN(i6);
    }

    public boolean equals(Object obj) {
        if (obj instanceof C90024dN) {
            C90024dN r4 = (C90024dN) obj;
            return this.A01 == r4.A01 && this.A00 == r4.A00;
        }
    }

    public int hashCode() {
        return (this.A01.ordinal() << 3) | this.A00;
    }
}
