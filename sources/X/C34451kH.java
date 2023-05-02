package X;

import android.util.Pair;

/* renamed from: X.1kH  reason: invalid class name and case insensitive filesystem */
public class C34451kH {
    public static int A00(C28371Vv r0) {
        Pair A01 = A01(r0);
        if (A01 != null) {
            return ((Number) A01.first).intValue();
        }
        return 0;
    }

    public static Pair A01(C28371Vv r4) {
        for (C28371Vv r3 : r4.A0O("error")) {
            if (r3 != null) {
                String A0N = r3.A0N("code", (String) null);
                String A0N2 = r3.A0N("text", (String) null);
                if (A0N != null) {
                    return new Pair(Integer.valueOf(C29501aj.A00(A0N, 0)), A0N2);
                }
            }
        }
        return null;
    }
}
