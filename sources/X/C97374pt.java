package X;

import java.util.Arrays;
import java.util.Random;

/* renamed from: X.4pt  reason: invalid class name and case insensitive filesystem */
public class C97374pt implements AnonymousClass5TE {
    public final Random A00;
    public final int[] A01;
    public final int[] A02;

    public C97374pt(Random random, int[] iArr) {
        this.A02 = iArr;
        this.A00 = random;
        int length = iArr.length;
        int[] iArr2 = new int[length];
        this.A01 = iArr2;
        for (int i2 = 0; i2 < length; i2++) {
            iArr2[iArr[i2]] = i2;
        }
    }

    public AnonymousClass5TE A6I() {
        return new C97374pt(new Random(this.A00.nextLong()), new int[0]);
    }

    public AnonymousClass5TE A6J(int i2, int i3) {
        int[] iArr = new int[i3];
        int[] iArr2 = new int[i3];
        int i4 = 0;
        while (i4 < i3) {
            Random random = this.A00;
            iArr[i4] = random.nextInt(this.A02.length + 1);
            int i5 = i4 + 1;
            int nextInt = random.nextInt(i5);
            iArr2[i4] = iArr2[nextInt];
            iArr2[nextInt] = i4;
            i4 = i5;
        }
        Arrays.sort(iArr);
        int[] iArr3 = this.A02;
        int length = iArr3.length + i3;
        int[] iArr4 = new int[length];
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < length; i8++) {
            if (i6 >= i3 || i7 != iArr[i6]) {
                int i9 = i7 + 1;
                int i10 = iArr3[i7];
                iArr4[i8] = i10;
                if (i10 >= 0) {
                    iArr4[i8] = iArr4[i8] + i3;
                }
                i7 = i9;
            } else {
                iArr4[i8] = iArr2[i6];
                i6++;
            }
        }
        return new C97374pt(new Random(this.A00.nextLong()), iArr4);
    }

    public AnonymousClass5TE A6K(int i2, int i3) {
        int[] iArr = this.A02;
        int length = iArr.length;
        int[] iArr2 = new int[(length - i3)];
        int i4 = 0;
        for (int i5 = 0; i5 < length; i5++) {
            if (iArr[i5] < 0 || iArr[i5] >= i3) {
                int i6 = i5 - i4;
                int i7 = iArr[i5];
                if (i7 >= 0) {
                    i7 -= i3;
                }
                iArr2[i6] = i7;
            } else {
                i4++;
            }
        }
        return new C97374pt(new Random(this.A00.nextLong()), iArr2);
    }

    public int ACJ() {
        int[] iArr = this.A02;
        if (iArr.length > 0) {
            return iArr[0];
        }
        return -1;
    }

    public int AD2() {
        int[] iArr = this.A02;
        int length = iArr.length;
        if (length > 0) {
            return iArr[length - 1];
        }
        return -1;
    }

    public int ADv(int i2) {
        int i3 = this.A01[i2] + 1;
        int[] iArr = this.A02;
        if (i3 < iArr.length) {
            return iArr[i3];
        }
        return -1;
    }

    public int AFC(int i2) {
        int i3 = this.A01[i2] - 1;
        if (i3 >= 0) {
            return this.A02[i3];
        }
        return -1;
    }

    public int getLength() {
        return this.A02.length;
    }
}
