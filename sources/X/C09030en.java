package X;

/* renamed from: X.0en  reason: invalid class name and case insensitive filesystem */
public class C09030en implements C25261Jc {
    public final C25261Jc A00;

    public C09030en(C25261Jc r1) {
        this.A00 = r1;
    }

    public static final double A00(AnonymousClass4X6 r1) {
        return r1.A00();
    }

    public static final void A01(AnonymousClass4X6 r2, float f2) {
        r2.A02((double) f2);
    }

    public final AnonymousClass4X6 A02(C14960q4 r4, C14930q1 r5) {
        AnonymousClass4X6 A01 = C88974bO.A00().A01();
        C14940q2 r1 = new C14940q2();
        r1.A03(A01, 0);
        A01.A03(new C03520Iv(this, r4, r1.A01(), r5));
        return A01;
    }

    /* renamed from: A03 */
    public Object A8l(C14960q4 r5, C14950q3 r6, C99354tt r7) {
        String str = r7.A00;
        switch (str.hashCode()) {
            case -600206934:
                if (str.equals("bk.action.animation.spring.GetCurrentValue")) {
                    return C89554cQ.A00(A00((AnonymousClass4X6) r6.A01(0)));
                }
                break;
            case -512481856:
                if (str.equals("bk.action.animation.spring.Create")) {
                    return A02(r5, C31411e8.A00(r6.A02(0)));
                }
                break;
            case 1371463060:
                if (str.equals("bk.action.animation.spring.SetEndValue")) {
                    A01((AnonymousClass4X6) r6.A01(0), AnonymousClass000.A04(r6.A02(1)));
                    return null;
                }
                break;
        }
        return this.A00.A8l(r6, r7, r5);
    }
}
