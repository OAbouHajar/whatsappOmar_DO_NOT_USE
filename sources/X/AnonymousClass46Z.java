package X;

/* renamed from: X.46Z  reason: invalid class name */
public class AnonymousClass46Z {
    public static C16740tZ A00(C48952Qa r5, C16740tZ r6) {
        C16740tZ r4 = null;
        if (r5.getCursor() != null) {
            int count = r5.getCount();
            int A03 = r5.A03(r6);
            if (A03 >= 0) {
                int i2 = A03 + 1;
                r4 = r5.getItem(i2);
                while (i2 <= count && r4 != null && (r4.A11.A00 == null || r4.A10 == 10)) {
                    r4 = r5.getItem(i2);
                    i2++;
                }
            }
        }
        return r4;
    }
}
