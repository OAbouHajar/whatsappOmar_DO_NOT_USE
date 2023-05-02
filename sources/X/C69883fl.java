package X;

import android.util.SparseArray;
import java.util.List;

/* renamed from: X.3fl  reason: invalid class name and case insensitive filesystem */
public final class C69883fl extends C31201dg {
    public C69883fl(List list, int i2, int i3) {
        super(list, i2, i3 + 1);
    }

    public void A0R() {
        boolean z2;
        String str;
        String str2;
        SparseArray sparseArray = this.A02;
        Object obj = sparseArray.get(135);
        if ((obj instanceof String) && (str2 = (String) obj) != null) {
            sparseArray.put(135, C87574Xm.A01(str2));
        }
        Object obj2 = sparseArray.get(134);
        if ((obj2 instanceof String) && (str = (String) obj2) != null) {
            sparseArray.put(134, C87574Xm.A01(str));
        }
        if (sparseArray.get(135) == null) {
            int[] A01 = C90154da.A00().A06().A01(this);
            int length = A01.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    int[] A00 = C90154da.A00().A06().A00(this);
                    int length2 = A00.length;
                    int i3 = 0;
                    loop1:
                    while (true) {
                        if (i3 >= length2) {
                            z2 = false;
                            break;
                        }
                        for (C31201dg r0 : A0M(A00[i3])) {
                            if (r0 != null && r0.A0P(148, true)) {
                                break loop1;
                            }
                        }
                        i3++;
                    }
                } else {
                    C31201dg A0G = A0G(A01[i2]);
                    if (A0G != null && A0G.A0P(148, true)) {
                        break;
                    }
                    i2++;
                }
            }
            sparseArray.put(148, Boolean.valueOf(z2));
        }
        z2 = true;
        sparseArray.put(148, Boolean.valueOf(z2));
    }
}
