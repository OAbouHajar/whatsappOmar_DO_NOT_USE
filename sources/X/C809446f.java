package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.46f  reason: invalid class name and case insensitive filesystem */
public class C809446f {
    public static List A00(Long l2, int[] iArr) {
        long longValue;
        ArrayList A0u = AnonymousClass000.A0u();
        long j2 = 0;
        long j3 = 0;
        long j4 = 0;
        int i2 = 0;
        while (true) {
            int length = iArr.length;
            if (i2 >= length) {
                break;
            }
            j2 += (long) iArr[i2];
            if (i2 != length - 1 || l2 == null) {
                if (j2 > j3) {
                    int i3 = (int) ((((j2 - j3) + 15) / 16) * 16);
                    C13690nt.A1O(A0u, i3);
                    j4 = j3;
                    j3 = ((long) i3) + j3;
                }
                i2++;
            } else {
                if (j2 > j3) {
                    longValue = l2.longValue() - j3;
                } else {
                    A0u.remove(A0u.size() - 1);
                    longValue = l2.longValue() - j4;
                }
                C13690nt.A1O(A0u, (int) longValue);
            }
        }
        return A0u;
    }
}
