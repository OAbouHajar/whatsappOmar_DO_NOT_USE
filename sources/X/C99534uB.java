package X;

import java.util.List;

/* renamed from: X.4uB  reason: invalid class name and case insensitive filesystem */
public class C99534uB implements AnonymousClass5OR {
    public boolean A8k(C89494cI r5, C89494cI r6, C84634Lh r7) {
        int size;
        if (!(r6 instanceof C70173gE)) {
            return false;
        }
        int intValue = r6.A03().A00.intValue();
        if (r5 instanceof C70133gA) {
            size = r5.A05().A01.length();
        } else if (!(r5 instanceof C70163gD)) {
            return false;
        } else {
            C70163gD A02 = r5.A02();
            size = A02.A07() instanceof List ? ((List) A02.A07()).size() : -1;
        }
        return size == intValue;
    }
}
