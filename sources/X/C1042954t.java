package X;

import java.util.Arrays;
import org.apache.commons.io.FilenameUtils;

/* renamed from: X.54t  reason: invalid class name and case insensitive filesystem */
public final class C1042954t implements Cloneable {
    public int A00;
    public int[] A01;

    public C1042954t() {
        this.A00 = 0;
        this.A01 = new int[1];
    }

    public C1042954t(int[] iArr, int i2) {
        this.A01 = iArr;
        this.A00 = i2;
    }

    public final void A00(int i2) {
        int[] iArr = this.A01;
        int length = iArr.length;
        if (i2 > (length << 5)) {
            int[] iArr2 = new int[((i2 + 31) >> 5)];
            System.arraycopy(iArr, 0, iArr2, 0, length);
            this.A01 = iArr2;
        }
    }

    public void A01(int i2, int i3) {
        if (i3 < 0 || i3 > 32) {
            throw AnonymousClass000.A0T("Num bits must be between 0 and 32");
        }
        A00(this.A00 + i3);
        while (i3 > 0) {
            boolean z2 = true;
            if (((i2 >> (i3 - 1)) & 1) != 1) {
                z2 = false;
            }
            A02(z2);
            i3--;
        }
    }

    public void A02(boolean z2) {
        A00(this.A00 + 1);
        if (z2) {
            int[] iArr = this.A01;
            int i2 = this.A00;
            int i3 = i2 >> 5;
            iArr[i3] = (1 << (i2 & 31)) | iArr[i3];
        }
        this.A00++;
    }

    public boolean A03(int i2) {
        return ((1 << (i2 & 31)) & this.A01[i2 >> 5]) != 0;
    }

    public /* bridge */ /* synthetic */ Object clone() {
        return new C1042954t((int[]) this.A01.clone(), this.A00);
    }

    public boolean equals(Object obj) {
        if (obj instanceof C1042954t) {
            C1042954t r4 = (C1042954t) obj;
            return this.A00 == r4.A00 && Arrays.equals(this.A01, r4.A01);
        }
    }

    public int hashCode() {
        return (this.A00 * 31) + Arrays.hashCode(this.A01);
    }

    public String toString() {
        int i2 = this.A00;
        StringBuilder A0g = C13690nt.A0g((i2 >> 3) + i2 + 1);
        for (int i3 = 0; i3 < i2; i3++) {
            if ((i3 & 7) == 0) {
                A0g.append(' ');
            }
            boolean A03 = A03(i3);
            char c2 = FilenameUtils.EXTENSION_SEPARATOR;
            if (A03) {
                c2 = 'X';
            }
            A0g.append(c2);
        }
        return A0g.toString();
    }
}
