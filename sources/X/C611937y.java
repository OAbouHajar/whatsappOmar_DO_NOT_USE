package X;

import java.util.Map;

/* renamed from: X.37y  reason: invalid class name and case insensitive filesystem */
public class C611937y {
    public static C31201dg A00(C14990q7 r8, C14960q4 r9, C31201dg r10) {
        C14990q7 r4 = r8;
        C14910pz A03 = C62183Bz.A03(r8);
        C88964bN r6 = r9.A01;
        if (r6 == null) {
            C62003Bg.A02("Tree resources can only be read from the UI Thread");
            r6 = A03.A04;
            Map map = A03.A08;
            if (map != null) {
                r6 = new C88964bN(r6.A02, r6.A01, map, r6.A00);
            }
        }
        AnonymousClass4K0 r92 = r9.A01;
        AnonymousClass4O3 A00 = C617039z.A00(AnonymousClass4YH.A00, r4, (AnonymousClass4O3) null, r6, r10, C99324tq.A00, r92);
        if (!A00.A03.isEmpty()) {
            C29691b2.A00("BloksBind", "Undefined Behavior: BloksBind::evaluate() returned controller binding operations");
        }
        return A00.A01;
    }
}
