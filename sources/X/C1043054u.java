package X;

import java.util.Arrays;
import org.apache.commons.io.IOUtils;

/* renamed from: X.54u  reason: invalid class name and case insensitive filesystem */
public final class C1043054u implements Cloneable {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int[] A03;

    public C1043054u(int i2, int i3) {
        if (i2 <= 0 || i3 <= 0) {
            throw AnonymousClass000.A0T("Both dimensions must be greater than 0");
        }
        this.A02 = i2;
        this.A00 = i3;
        int i4 = (i2 + 31) >> 5;
        this.A01 = i4;
        this.A03 = new int[(i4 * i3)];
    }

    public C1043054u(int[] iArr, int i2, int i3, int i4) {
        this.A02 = i2;
        this.A00 = i3;
        this.A01 = i4;
        this.A03 = iArr;
    }

    public void A00(int i2, int i3) {
        int i4 = (i3 * this.A01) + (i2 >> 5);
        int[] iArr = this.A03;
        iArr[i4] = (1 << (i2 & 31)) ^ iArr[i4];
    }

    public void A01(int i2, int i3) {
        int i4 = (i3 * this.A01) + (i2 >> 5);
        int[] iArr = this.A03;
        iArr[i4] = (1 << (i2 & 31)) | iArr[i4];
    }

    public void A02(int i2, int i3, int i4, int i5) {
        String str;
        if (i3 < 0 || i2 < 0) {
            str = "Left and top must be nonnegative";
        } else if (i5 <= 0 || i4 <= 0) {
            str = "Height and width must be at least 1";
        } else {
            int i6 = i4 + i2;
            int i7 = i5 + i3;
            if (i7 > this.A00 || i6 > this.A02) {
                str = "The region must fit inside the matrix";
            } else {
                while (i3 < i7) {
                    int i8 = this.A01 * i3;
                    for (int i9 = i2; i9 < i6; i9++) {
                        int[] iArr = this.A03;
                        int i10 = (i9 >> 5) + i8;
                        iArr[i10] = iArr[i10] | (1 << (i9 & 31));
                    }
                    i3++;
                }
                return;
            }
        }
        throw AnonymousClass000.A0T(str);
    }

    public boolean A03(int i2, int i3) {
        return ((this.A03[(i3 * this.A01) + (i2 >> 5)] >>> (i2 & 31)) & 1) != 0;
    }

    public /* bridge */ /* synthetic */ Object clone() {
        return new C1043054u((int[]) this.A03.clone(), this.A02, this.A00, this.A01);
    }

    public boolean equals(Object obj) {
        if (obj instanceof C1043054u) {
            C1043054u r4 = (C1043054u) obj;
            return this.A02 == r4.A02 && this.A00 == r4.A00 && this.A01 == r4.A01 && Arrays.equals(this.A03, r4.A03);
        }
    }

    public int hashCode() {
        int i2 = this.A02;
        return (((((((i2 * 31) + i2) * 31) + this.A00) * 31) + this.A01) * 31) + Arrays.hashCode(this.A03);
    }

    public String toString() {
        int i2 = this.A00;
        int i3 = this.A02;
        StringBuilder A0g = C13690nt.A0g((i3 + 1) * i2);
        for (int i4 = 0; i4 < i2; i4++) {
            for (int i5 = 0; i5 < i3; i5++) {
                String str = "  ";
                if (A03(i5, i4)) {
                    str = "X ";
                }
                A0g.append(str);
            }
            A0g.append(IOUtils.LINE_SEPARATOR_UNIX);
        }
        return A0g.toString();
    }
}
