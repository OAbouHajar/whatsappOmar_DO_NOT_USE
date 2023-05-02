package X;

import kotlin.jvm.internal.IDxLambdaShape59S0000000_2_I1;

/* renamed from: X.4cx  reason: invalid class name and case insensitive filesystem */
public final class C89804cx {
    public static final AnonymousClass1UJ A00 = new IDxLambdaShape59S0000000_2_I1(5);
    public static final AnonymousClass1UJ A01 = new IDxLambdaShape59S0000000_2_I1(6);
    public static final AnonymousClass1UJ A02 = new IDxLambdaShape59S0000000_2_I1(7);
    public static final AnonymousClass4QY A03 = new AnonymousClass4QY("NO_THREAD_ELEMENTS");

    public static final Object A00(Object obj, AnonymousClass1UM r2) {
        if (obj == null) {
            obj = r2.fold(C13680ns.A0X(), A00);
            C18450wi.A0F(obj);
        }
        if (obj == C13680ns.A0X()) {
            return A03;
        }
        if (obj instanceof Integer) {
            return r2.fold(new AnonymousClass4JC(r2, AnonymousClass000.A0D(obj)), A02);
        }
        throw AnonymousClass000.A0W("updateThreadContext");
    }

    public static final void A01(Object obj, AnonymousClass1UM r2) {
        String str;
        if (obj != A03) {
            if (obj instanceof AnonymousClass4JC) {
                AnonymousClass5VB[] r1 = ((AnonymousClass4JC) obj).A01;
                int length = r1.length - 1;
                if (length >= 0) {
                    C18450wi.A0F(r1[length]);
                } else {
                    return;
                }
            } else if (r2.fold((Object) null, A01) == null) {
                str = "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>";
                throw AnonymousClass000.A0W(str);
            }
            str = "restoreThreadContext";
            throw AnonymousClass000.A0W(str);
        }
    }
}
