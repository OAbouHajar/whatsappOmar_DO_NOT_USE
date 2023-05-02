package X;

import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: X.3A0  reason: invalid class name */
public class AnonymousClass3A0 {
    public static Object A00(C109615Sw r4) {
        AnonymousClass424 AaO = r4.AaO();
        AnonymousClass424 r1 = AnonymousClass424.START_OBJECT;
        if (AaO != r1) {
            AnonymousClass424 r0 = AnonymousClass424.START_ARRAY;
            if (AaO == r0) {
                ArrayList A0u = AnonymousClass000.A0u();
                if (AaO == r0) {
                    while (r4.ALo() != AnonymousClass424.END_ARRAY) {
                        A0u.add(A00(r4));
                    }
                }
                return A0u;
            } else if (AaO == AnonymousClass424.NULL) {
                return null;
            } else {
                if (AaO == AnonymousClass424.BOOLEAN) {
                    return Boolean.valueOf(r4.AaP().A5e());
                }
                if (AaO == AnonymousClass424.NUMBER) {
                    Number ALr = r4.AaP().ALr();
                    return ALr instanceof Long ? Long.valueOf(ALr.longValue()) : Double.valueOf(ALr.doubleValue());
                } else if (AaO == AnonymousClass424.STRING) {
                    return r4.AaP().AgS();
                } else {
                    throw AnonymousClass000.A0V(AnonymousClass000.A0g("unsupported token type ", AaO));
                }
            }
        } else if (r4.AaO() != r1) {
            return null;
        } else {
            HashMap A0x = AnonymousClass000.A0x();
            while (r4.ALo() != AnonymousClass424.END_OBJECT) {
                String AaN = r4.AaN();
                r4.ALo();
                A0x.put(AaN, A00(r4));
            }
            return A0x;
        }
    }
}
