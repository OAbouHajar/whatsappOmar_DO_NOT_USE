package X;

import java.util.Arrays;

/* renamed from: X.4TN  reason: invalid class name */
public class AnonymousClass4TN {
    public final C70303gR A00;
    public final boolean A01;

    public AnonymousClass4TN(C70303gR r6, boolean z2) {
        if ((r6.A01 instanceof C70293gQ) && (r6.A00() instanceof C70323gT)) {
            AnonymousClass4XQ r4 = r6;
            AnonymousClass4XQ r1 = null;
            while (true) {
                r4 = r4.A00();
                if (r4 instanceof C70293gQ) {
                    break;
                }
                r1 = r4;
            }
            r1.A01 = null;
            r6.A01 = r1;
            C90454eA r3 = new C90454eA();
            r3.A02 = new AnonymousClass4TN(r6, true);
            r3.A00 = AnonymousClass41D.PATH;
            ((C70293gQ) r4).A00 = Arrays.asList(new C90454eA[]{r3});
            r6 = new C70303gR('$');
            r6.A01 = r4;
            r6.A01 = r4;
        }
        this.A00 = r6;
        this.A01 = z2;
    }

    public C89314bx A00(AnonymousClass4RV r5, Object obj, Object obj2) {
        C89314bx r3 = new C89314bx(r5, this, obj2, false);
        try {
            this.A00.A02(AnonymousClass552.A01, r3, obj, "");
        } catch (C105625Ai unused) {
        }
        return r3;
    }

    public String toString() {
        return this.A00.toString();
    }
}
