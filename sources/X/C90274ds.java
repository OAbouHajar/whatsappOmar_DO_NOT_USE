package X;

import kotlin.jvm.internal.IDxLambdaShape59S0000000_2_I1;

/* renamed from: X.4ds  reason: invalid class name and case insensitive filesystem */
public final class C90274ds {
    public static Object A00(Object obj, AnonymousClass1UL r2, AnonymousClass1UJ r3) {
        C18450wi.A0H(r3, 2);
        return r3.AIV(obj, r2);
    }

    public static AnonymousClass1UL A01(AnonymousClass1UL r1, AnonymousClass5NJ r2) {
        C18450wi.A0H(r2, 1);
        if (!C18450wi.A0R(r1.getKey(), r2)) {
            return null;
        }
        return r1;
    }

    public static AnonymousClass1UM A02(AnonymousClass1UL r1, AnonymousClass5NJ r2) {
        C18450wi.A0H(r2, 1);
        return C18450wi.A0R(r1.getKey(), r2) ? C1052258r.A00 : r1;
    }

    public static AnonymousClass1UM A03(AnonymousClass1UL r2, AnonymousClass1UM r3) {
        C18450wi.A0H(r3, 1);
        return r3 != C1052258r.A00 ? (AnonymousClass1UM) r3.fold(r2, new IDxLambdaShape59S0000000_2_I1(3)) : r2;
    }
}
