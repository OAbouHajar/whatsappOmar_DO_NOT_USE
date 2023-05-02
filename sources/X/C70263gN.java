package X;

import java.util.List;

/* renamed from: X.3gN  reason: invalid class name and case insensitive filesystem */
public abstract class C70263gN extends AnonymousClass4XQ {
    public boolean A08(C89314bx r5, Object obj, String str) {
        if (obj != null) {
            AnonymousClass4RV r1 = r5.A01;
            if (obj instanceof List) {
                return true;
            }
            if (A07() && !r1.A03.contains(AnonymousClass420.SUPPRESS_EXCEPTIONS)) {
                Object[] A1Z = C13690nt.A1Z();
                A1Z[0] = toString();
                A1Z[1] = obj;
                throw new C69963ft(String.format("Filter: %s can only be applied to arrays. Current context is: %s", A1Z));
            }
        } else if (A07() && !r5.A01.A03.contains(AnonymousClass420.SUPPRESS_EXCEPTIONS)) {
            StringBuilder A0r = AnonymousClass000.A0r("The path ");
            A0r.append(str);
            throw new C69963ft(AnonymousClass000.A0h(" is null", A0r));
        }
        return false;
    }
}
