package X;

import java.util.HashMap;

/* renamed from: X.4B1  reason: invalid class name */
public class AnonymousClass4B1 {
    public static final HashMap A00;
    public static final HashMap A01;
    public static final HashMap A02;

    static {
        HashMap A0x = AnonymousClass000.A0x();
        A02 = A0x;
        HashMap A0x2 = AnonymousClass000.A0x();
        A01 = A0x2;
        HashMap A0x3 = AnonymousClass000.A0x();
        A00 = A0x3;
        A0x.put("IN", A0x2);
        A0x.put("BR", A0x3);
        Integer A0Z = C13680ns.A0Z();
        A0x2.put("stable_release", A0Z);
        C13680ns.A1X("stable_release", A0x3, 1);
        A0x3.put("feature_bip", A0Z);
    }
}
