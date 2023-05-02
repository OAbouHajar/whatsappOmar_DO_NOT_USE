package X;

import java.util.List;

/* renamed from: X.1LB  reason: invalid class name */
public class AnonymousClass1LB {
    public final C88394aQ A00;

    public AnonymousClass1LB(C14870pt r2, AnonymousClass01V r3, AnonymousClass013 r4, C16320sq r5) {
        this.A00 = new C88394aQ(r2, r3, r4, r5);
    }

    public void A00() {
        C88394aQ r5 = this.A00;
        AnonymousClass00B.A01();
        List<AnonymousClass29C> list = r5.A07;
        list.size();
        List<AnonymousClass29C> list2 = r5.A06;
        list2.size();
        for (AnonymousClass29C r2 : list2) {
            AnonymousClass4E2 r0 = r2.A0B;
            if (r0 != null) {
                C602430q r1 = r0.A00;
                r1.A1S();
                r1.A1T(false);
            }
            r2.A09();
        }
        list2.clear();
        for (AnonymousClass29C r22 : list) {
            AnonymousClass4E2 r02 = r22.A0B;
            if (r02 != null) {
                C602430q r12 = r02.A00;
                r12.A1S();
                r12.A1T(false);
            }
            r22.A09();
        }
        list.clear();
        r5.A00 = 0;
    }
}
