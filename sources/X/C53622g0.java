package X;

/* renamed from: X.2g0  reason: invalid class name and case insensitive filesystem */
public class C53622g0 {
    public static C30821d1 A00(C28371Vv r4) {
        int i2;
        String A0N = r4.A0N("v", (String) null);
        if ("1".equals(A0N) || "2".equals(A0N)) {
            int parseInt = Integer.parseInt(A0N);
            String A0N2 = r4.A0N("type", (String) null);
            if ("msg".equals(A0N2)) {
                i2 = 0;
            } else if ("pkmsg".equals(A0N2)) {
                i2 = 1;
            } else if ("skmsg".equals(A0N2)) {
                i2 = 2;
            } else if ("frskmsg".equals(A0N2)) {
                i2 = 3;
            } else {
                StringBuilder sb = new StringBuilder("invalid encrypted node type provided: ");
                sb.append(A0N2);
                throw new AnonymousClass1W9(sb.toString());
            }
            return new C30821d1(r4.A01, parseInt, i2);
        }
        StringBuilder sb2 = new StringBuilder("invalid encrypted node version provided: ");
        sb2.append(A0N);
        throw new AnonymousClass1W9(sb2.toString());
    }
}
