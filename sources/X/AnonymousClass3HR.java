package X;

import java.util.Map;

/* renamed from: X.3HR  reason: invalid class name */
public final class AnonymousClass3HR implements AnonymousClass5SD {
    public final /* synthetic */ AnonymousClass4LB A00;

    public AnonymousClass3HR(AnonymousClass4LB r1) {
        this.A00 = r1;
    }

    public void AWK(C29661az r3) {
        throw new AnonymousClass1UT(AnonymousClass000.A0h("Not yet implemented", AnonymousClass000.A0r("An operation is not implemented: ")));
    }

    public void AWO(AnonymousClass2WZ r13) {
        AnonymousClass4LB r4 = this.A00;
        AnonymousClass2WZ r6 = r13;
        if (r13 == null || r13.A00 != 5) {
            AnonymousClass4Ro r0 = r4.A00;
            if (r0 != null) {
                AnonymousClass1VZ r02 = r0.A01;
                AnonymousClass4TZ r3 = r02.A02;
                if (r3 == null) {
                    throw C18450wi.A03("fcsLoadingEventManager");
                }
                r3.A01((Map) null, "onLoadingFailure", r02.A05);
                return;
            }
            return;
        }
        C20170zc r32 = r4.A01;
        C20140zZ r5 = r32.A01;
        C35001lD r2 = r32.A02;
        String str = r2.A01;
        StringBuilder A0q = AnonymousClass000.A0q(r4.A02);
        A0q.append("BloksLayoutData:046877784a36a1a3e5fbca72104f0172b903681b904c7b907b2e2fab4cad66cf:");
        r5.A03(r6, str, AnonymousClass000.A0f(C13690nt.A0m(r32.A00), A0q), r2.A00, r2.A02);
        AnonymousClass4Ro r03 = r4.A00;
        if (r03 != null) {
            r03.A00();
        }
    }
}
