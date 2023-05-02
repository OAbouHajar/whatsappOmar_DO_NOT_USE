package X;

import java.util.Iterator;
import java.util.List;

/* renamed from: X.5tY  reason: invalid class name and case insensitive filesystem */
public class C117785tY {
    public int[] A00(List list) {
        int i2;
        Iterator it = list.iterator();
        int[] iArr = null;
        int i3 = Integer.MAX_VALUE;
        while (it.hasNext()) {
            int[] iArr2 = (int[]) it.next();
            if (iArr2[1] >= 30000 && (i2 = iArr2[0]) < i3) {
                i3 = i2;
                iArr = iArr2;
            }
        }
        return iArr == null ? (int[]) list.get(list.size() - 1) : iArr;
    }
}
