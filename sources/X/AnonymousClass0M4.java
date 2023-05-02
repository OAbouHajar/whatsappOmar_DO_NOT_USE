package X;

import java.util.Map;
import java.util.TreeMap;

/* renamed from: X.0M4  reason: invalid class name */
public final class AnonymousClass0M4 {
    public static final C07770cR A00(String str, int i2) {
        C18450wi.A0H(str, 0);
        TreeMap treeMap = C07770cR.A08;
        synchronized (treeMap) {
            Map.Entry ceilingEntry = treeMap.ceilingEntry(Integer.valueOf(i2));
            if (ceilingEntry != null) {
                treeMap.remove(ceilingEntry.getKey());
                C07770cR r0 = (C07770cR) ceilingEntry.getValue();
                r0.A07 = str;
                r0.A00 = i2;
                return r0;
            }
            C07770cR r02 = new C07770cR(i2);
            r02.A07 = str;
            r02.A00 = i2;
            return r02;
        }
    }

    public static C07770cR A01(String str, String str2) {
        C07770cR A00 = A00(str, 1);
        if (str2 == null) {
            A00.A5R(1);
            return A00;
        }
        A00.A5S(1, str2);
        return A00;
    }
}
