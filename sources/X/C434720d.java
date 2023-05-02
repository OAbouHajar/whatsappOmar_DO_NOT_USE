package X;

import java.util.Arrays;

/* renamed from: X.20d  reason: invalid class name and case insensitive filesystem */
public class C434720d {
    public final int[] A00;

    public C434720d(long j2) {
        int[] iArr = new int[5];
        int i2 = ((int) ((j2 >> 4) & 4095)) + 1;
        int i3 = 0;
        do {
            iArr[i3] = i2;
            i3++;
            i2 = ((int) ((j2 >> ((i3 * 12) + 4)) & 4095)) + 1;
            if (i2 <= 1) {
                break;
            }
        } while (i3 < 5);
        this.A00 = Arrays.copyOf(iArr, i3);
    }

    public C434720d(int[] iArr) {
        AnonymousClass00B.A0F(iArr.length <= 5);
        this.A00 = iArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C434720d)) {
            return false;
        }
        return Arrays.equals(this.A00, ((C434720d) obj).A00);
    }

    public int hashCode() {
        return Arrays.hashCode(this.A00);
    }
}
