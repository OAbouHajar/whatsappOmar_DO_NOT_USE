package X;

/* renamed from: X.0q6  reason: invalid class name and case insensitive filesystem */
public class C14980q6 {
    public final C14960q4 A00;

    public C14980q6(C14960q4 r1) {
        this.A00 = r1;
    }

    public static Object A00(C14960q4 r4, C14950q3 r5, C14930q1 r6) {
        Object obj;
        C14910pz A03;
        C89644cb.A01("LispyEvaluation");
        AnonymousClass4BI.A04.incrementAndGet();
        C14990q7 r3 = r4.A00;
        if (!(r3 == null || (A03 = C62183Bz.A03(r3)) == null)) {
            C62003Bg.A02("Tree operations are only supported from the UI Thread");
            A03.A00++;
        }
        try {
            obj = C807345g.A00(r5, r6, r4);
        } catch (AnonymousClass43P e2) {
            C29691b2.A01("BloksInterpreter", "Exception while evaluating Lispy Script", e2);
            obj = null;
        } catch (Throwable th) {
            C89644cb.A00();
            if (r3 != null) {
                C62183Bz.A07(r3);
            }
            throw th;
        }
        C89644cb.A00();
        if (r3 != null) {
            C62183Bz.A07(r3);
        }
        return obj;
    }

    public void A01(C14950q3 r2, C14930q1 r3) {
        A00(this.A00, r2, r3);
    }
}
