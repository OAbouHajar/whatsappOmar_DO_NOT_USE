package X;

import android.os.Bundle;

/* renamed from: X.2TA  reason: invalid class name */
public final class AnonymousClass2TA {
    public static AnonymousClass04o A00(C001100m r5, AnonymousClass04o r6) {
        AnonymousClass04o r3 = r6;
        C001100m r4 = r5;
        AnonymousClass2Z6 A04 = ((AnonymousClass2Rf) C004501y.A00(AnonymousClass2Rf.class, r5)).A04();
        Bundle extras = r5.getIntent() != null ? r5.getIntent().getExtras() : null;
        if (r6 == null) {
            r3 = new C010705c(A04.A00, extras, r5);
        }
        return new C95274mN(extras, r3, r4, A04.A01, A04.A02);
    }

    public static AnonymousClass04o A01(AnonymousClass01A r5, AnonymousClass04o r6) {
        AnonymousClass04o r3 = r6;
        AnonymousClass01A r4 = r5;
        AnonymousClass2Z6 A04 = ((C17050uS) ((C17060uT) C004501y.A00(C17060uT.class, r5))).A0Y.A04();
        Bundle bundle = r5.A05;
        if (r6 == null) {
            r3 = new C010705c(A04.A00, bundle, r5);
        }
        return new C95274mN(bundle, r3, r4, A04.A01, A04.A02);
    }
}
