package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.0ir  reason: invalid class name and case insensitive filesystem */
public class C11490ir extends AnonymousClass5G6 {
    public static final int A00(AnonymousClass22G r2) {
        Iterator it = r2.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            it.next();
            i2++;
            if (i2 < 0) {
                throw new ArithmeticException("Count overflow has happened.");
            }
        }
        return i2;
    }

    public static final Iterable A01(AnonymousClass22G r1) {
        return new AnonymousClass559(r1);
    }

    public static final List A02(AnonymousClass22G r1) {
        C18450wi.A0H(r1, 0);
        ArrayList A0u = AnonymousClass000.A0u();
        A05(A0u, r1);
        return A0u;
    }

    public static final AnonymousClass22G A03(AnonymousClass22J r2, AnonymousClass22G r3) {
        return new AnonymousClass22K(r2, r3, false);
    }

    public static final AnonymousClass22G A04(AnonymousClass22J r1, AnonymousClass22G r2) {
        return new AnonymousClass22w(r1, r2);
    }

    public static final void A05(Collection collection, AnonymousClass22G r3) {
        C18450wi.A0H(r3, 0);
        for (Object add : r3) {
            collection.add(add);
        }
    }
}
