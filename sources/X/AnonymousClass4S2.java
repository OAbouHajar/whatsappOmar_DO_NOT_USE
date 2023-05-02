package X;

/* renamed from: X.4S2  reason: invalid class name */
public final class AnonymousClass4S2 {
    public final int A00;
    public final C93604jT A01;
    public final int[] A02;
    public final int[] A03;
    public final C93604jT[] A04;
    public final String[] A05;
    public final int[][][] A06;

    public AnonymousClass4S2(C93604jT r2, int[] iArr, int[] iArr2, C93604jT[] r5, String[] strArr, int[][][] iArr3) {
        this.A05 = strArr;
        this.A03 = iArr;
        this.A04 = r5;
        this.A06 = iArr3;
        this.A02 = iArr2;
        this.A01 = r2;
        this.A00 = iArr.length;
    }

    public int A00(int i2) {
        int i3 = 0;
        for (int i4 = 0; i4 < this.A00; i4++) {
            if (this.A03[i4] == i2) {
                int[][] iArr = this.A06[i4];
                int length = iArr.length;
                int i5 = 0;
                int i6 = 0;
                while (true) {
                    if (i5 >= length) {
                        break;
                    }
                    for (int i7 : iArr[i5]) {
                        int i8 = i7 & 7;
                        int i9 = 2;
                        if (i8 == 0 || i8 == 1 || i8 == 2) {
                            i9 = 1;
                        } else if (i8 != 3) {
                            if (i8 == 4) {
                                i6 = 3;
                            } else {
                                throw AnonymousClass3K4.A0V();
                            }
                        }
                        i6 = Math.max(i6, i9);
                    }
                    i5++;
                }
                i3 = Math.max(i3, i6);
            }
        }
        return i3;
    }
}
