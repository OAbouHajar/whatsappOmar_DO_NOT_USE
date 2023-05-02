package X;

import com.facebook.redex.IDxComparatorShape20S0000000_2_I1;
import java.util.Arrays;

/* renamed from: X.4qB  reason: invalid class name and case insensitive filesystem */
public abstract class C97554qB implements AnonymousClass5UR {
    public int A00;
    public final int A01;
    public final C93574jQ A02;
    public final int[] A03;
    public final C32491gT[] A04;

    public C97554qB(C93574jQ r8, int... iArr) {
        int length = iArr.length;
        C90524eJ.A04(AnonymousClass000.A1Q(length));
        this.A02 = r8;
        this.A01 = length;
        C32491gT[] r3 = new C32491gT[length];
        this.A04 = r3;
        for (int i2 = 0; i2 < length; i2++) {
            r3[i2] = r8.A02[iArr[i2]];
        }
        Arrays.sort(r3, new IDxComparatorShape20S0000000_2_I1(3));
        int i3 = this.A01;
        int[] iArr2 = new int[i3];
        this.A03 = iArr2;
        for (int i4 = 0; i4 < i3; i4++) {
            C32491gT r32 = this.A04[i4];
            int i5 = 0;
            while (true) {
                C32491gT[] r1 = r8.A02;
                if (i5 < r1.length) {
                    if (r32 == r1[i5]) {
                        break;
                    }
                    i5++;
                } else {
                    i5 = -1;
                    break;
                }
            }
            iArr2[i4] = i5;
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C97554qB r5 = (C97554qB) obj;
            if (this.A02 != r5.A02 || !Arrays.equals(this.A03, r5.A03)) {
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
        int identityHashCode = (System.identityHashCode(this.A02) * 31) + Arrays.hashCode(this.A03);
        this.A00 = identityHashCode;
        return identityHashCode;
    }
}
