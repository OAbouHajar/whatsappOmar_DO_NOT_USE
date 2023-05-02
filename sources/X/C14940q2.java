package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.0q2  reason: invalid class name and case insensitive filesystem */
public class C14940q2 {
    public final List A00 = new ArrayList();

    public static void A00(C14990q7 r2, C31201dg r3, C14940q2 r4, C14930q1 r5) {
        C29701b3.A01(r2, r3, new C14950q3(r4.A00), r5);
    }

    public C14950q3 A01() {
        return new C14950q3(this.A00);
    }

    public void A02(Object obj, int i2) {
        List list = this.A00;
        if (list.size() <= i2) {
            list.add(i2, obj);
            return;
        }
        throw new IllegalArgumentException("Arguments must be continuous");
    }

    @Deprecated
    public void A03(Object obj, int i2) {
        List list = this.A00;
        if (list.size() <= i2) {
            list.add(i2, obj);
            return;
        }
        throw new IllegalArgumentException("Arguments must be continuous");
    }
}
