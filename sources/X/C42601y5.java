package X;

import com.facebook.redex.RunnableRunnableShape0S0501000_I0;

/* renamed from: X.1y5  reason: invalid class name and case insensitive filesystem */
public class C42601y5 {
    public static String A00(C16740tZ r3) {
        String str = r3.A11.A01;
        if (!AnonymousClass1ZW.A0E(str)) {
            String[] split = str.split("-");
            if (split.length >= 2) {
                return split[0];
            }
        }
        return null;
    }

    public static void A01(C19780yz r6, C20260zl r7, C16490t9 r8, C15830rv r9, C16320sq r10, Integer num, Integer num2, int i2) {
        C15830rv r5 = r9;
        if (C40561uK.A01(r7, r9)) {
            Integer num3 = num;
            r10.Acl(new RunnableRunnableShape0S0501000_I0(num3, r8, r6, num2, r5, i2, 0));
        }
    }

    public static void A02(C20260zl r3, C16490t9 r4, C16740tZ r5, int i2) {
        if (r5 != null) {
            C28381Vw r1 = r5.A11;
            if (C40561uK.A01(r3, r1.A00)) {
                C75043rW r32 = new C75043rW();
                r32.A03 = r1.A01;
                r32.A02 = A00(r5);
                r32.A00 = Integer.valueOf(C42141xI.A00(r5.A10, r5.A08, C30921dB.A04(r5)));
                r32.A01 = Integer.valueOf(i2);
                r4.A06(r32);
            }
        }
    }
}
