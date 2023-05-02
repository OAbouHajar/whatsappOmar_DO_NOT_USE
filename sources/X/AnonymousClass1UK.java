package X;

/* renamed from: X.1UK  reason: invalid class name */
public final class AnonymousClass1UK {
    public static /* synthetic */ C004001t A00(AnonymousClass1UJ r4, AnonymousClass1UB r5) {
        AnonymousClass1UM r0 = C1052258r.A00;
        AnonymousClass1UM AB0 = r5.AB0();
        if (((Boolean) AB0.fold(Boolean.FALSE, new C106925Fs())).booleanValue()) {
            C1041454c r3 = new C1041454c();
            r3.element = r0;
            AB0 = (AnonymousClass1UM) AB0.fold(r0, new C106995Fz(r3));
            r0 = (AnonymousClass1UM) r3.element;
        }
        AnonymousClass1UM plus = AB0.plus(r0);
        C11340ia r1 = C90394e4.A00;
        if (plus != r1 && plus.get(AnonymousClass5VC.A00) == null) {
            plus = plus.plus(r1);
        }
        AnonymousClass5G9 r02 = new AnonymousClass5G9(plus);
        r02.A0t(r02, r4);
        return r02;
    }
}
