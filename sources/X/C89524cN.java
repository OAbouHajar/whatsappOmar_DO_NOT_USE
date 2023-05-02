package X;

import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.4cN  reason: invalid class name and case insensitive filesystem */
public class C89524cN {
    public static int A00(AnonymousClass5OP r3, List list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            C31201dg r1 = (C31201dg) list.get(i2);
            if (r1.A0I() != null && r3.Agf(r1)) {
                return i2;
            }
        }
        return -1;
    }

    public static Pair A01(C31201dg r5, AnonymousClass5OP r6) {
        List A0L = r5.A0L();
        int A00 = A00(r6, A0L);
        if (A00 < 0) {
            int[] A002 = C90154da.A00().A06().A00(r5);
            int length = A002.length;
            int i2 = 0;
            while (true) {
                if (i2 < length) {
                    A0L = r5.A0M(A002[i2]);
                    A00 = A00(r6, A0L);
                    if (A00 >= 0) {
                        break;
                    }
                    i2++;
                } else {
                    A0L = Collections.EMPTY_LIST;
                    A00 = -1;
                    break;
                }
            }
        }
        return C13680ns.A0F(A0L, A00);
    }

    public static List A02(List list) {
        ArrayList A0i = C13690nt.A0i(list.size());
        for (int i2 = 0; i2 < list.size(); i2++) {
            C31201dg r2 = (C31201dg) list.get(i2);
            if (r2 != null) {
                if (r2.A01 == 13346) {
                    List A0N = r2.A0N(32);
                    for (int i3 = 0; i3 < A0N.size(); i3++) {
                        A0i.add(A0N.get(i3));
                    }
                } else {
                    A0i.add(r2);
                }
            }
        }
        return A0i;
    }
}
