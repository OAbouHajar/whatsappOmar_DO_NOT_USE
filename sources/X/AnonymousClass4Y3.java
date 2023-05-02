package X;

import java.util.UUID;

/* renamed from: X.4Y3  reason: invalid class name */
public class AnonymousClass4Y3 {
    public static String A00(C16490t9 r3, int i2) {
        String obj = UUID.randomUUID().toString();
        C75573sN r1 = new C75573sN();
        A01(r1, obj, 1, i2);
        r3.A06(r1);
        return obj;
    }

    public static void A01(C75573sN r1, String str, int i2, int i3) {
        r1.A01 = Integer.valueOf(i2);
        r1.A06 = str;
        r1.A00 = Integer.valueOf(i3);
        r1.A02 = C13680ns.A0Z();
    }
}
