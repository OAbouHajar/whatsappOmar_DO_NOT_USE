package X;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/* renamed from: X.3Uq  reason: invalid class name and case insensitive filesystem */
public final class C65403Uq extends C82214Bw {
    public long A00 = -9223372036854775807L;
    public long[] A01 = new long[0];
    public long[] A02 = new long[0];

    public C65403Uq() {
        super(new C96764or());
    }

    public static Object A00(C90504eH r4, int i2) {
        if (i2 == 0) {
            return Double.valueOf(Double.longBitsToDouble(r4.A0H()));
        }
        if (i2 == 1) {
            boolean z2 = true;
            if (r4.A0C() != 1) {
                z2 = false;
            }
            return Boolean.valueOf(z2);
        } else if (i2 == 2) {
            return A01(r4);
        } else {
            if (i2 == 3) {
                HashMap A0x = AnonymousClass000.A0x();
                while (true) {
                    String A012 = A01(r4);
                    int A0C = r4.A0C();
                    if (A0C == 9) {
                        return A0x;
                    }
                    Object A002 = A00(r4, A0C);
                    if (A002 != null) {
                        A0x.put(A012, A002);
                    }
                }
            } else if (i2 == 8) {
                return A02(r4);
            } else {
                if (i2 == 10) {
                    int A0E = r4.A0E();
                    ArrayList A0i = C13690nt.A0i(A0E);
                    for (int i3 = 0; i3 < A0E; i3++) {
                        Object A003 = A00(r4, r4.A0C());
                        if (A003 != null) {
                            A0i.add(A003);
                        }
                    }
                    return A0i;
                } else if (i2 != 11) {
                    return null;
                } else {
                    Date date = new Date((long) Double.longBitsToDouble(r4.A0H()));
                    r4.A0T(2);
                    return date;
                }
            }
        }
    }

    public static String A01(C90504eH r4) {
        int A0F = r4.A0F();
        int i2 = r4.A01;
        r4.A0T(A0F);
        return new String(r4.A02, i2, A0F);
    }

    public static HashMap A02(C90504eH r5) {
        int A0E = r5.A0E();
        HashMap hashMap = new HashMap(A0E);
        for (int i2 = 0; i2 < A0E; i2++) {
            String A012 = A01(r5);
            Object A002 = A00(r5, r5.A0C());
            if (A002 != null) {
                hashMap.put(A012, A002);
            }
        }
        return hashMap;
    }
}
