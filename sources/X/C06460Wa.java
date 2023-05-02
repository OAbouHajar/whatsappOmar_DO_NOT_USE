package X;

import java.util.concurrent.CancellationException;

/* renamed from: X.0Wa  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C06460Wa {
    public static final C107035Gd A00() {
        return new C107035Gd();
    }

    public static final void A01(CancellationException cancellationException, AnonymousClass1UM r2) {
        C004001t r0 = (C004001t) r2.get(C004001t.A00);
        if (r0 != null) {
            r0.A62(cancellationException);
        }
    }

    public static final void A02(AnonymousClass1UM r1) {
        C004001t r0 = (C004001t) r1.get(C004001t.A00);
        if (r0 != null) {
            C06300Ve.A02(r0);
        }
    }

    public static final void A03(C004001t r1) {
        if (!r1.AIc()) {
            throw r1.AAS();
        }
    }
}
