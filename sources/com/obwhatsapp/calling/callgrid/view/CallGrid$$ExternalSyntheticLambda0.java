package com.obwhatsapp.calling.callgrid.view;

import X.AnonymousClass000;
import X.AnonymousClass05T;
import X.AnonymousClass26d;
import X.AnonymousClass2Ao;
import X.AnonymousClass4DV;
import X.C001300o;
import X.C011405n;
import X.C13680ns;
import X.C13690nt;
import X.C16620tM;
import X.C17140ub;
import X.C17200uh;
import X.C23651Cv;
import X.C50042Xk;
import java.util.Iterator;
import java.util.Map;

public final /* synthetic */ class CallGrid$$ExternalSyntheticLambda0 implements AnonymousClass05T {
    public final /* synthetic */ CallGrid A00;

    public /* synthetic */ CallGrid$$ExternalSyntheticLambda0(CallGrid callGrid) {
        this.A00 = callGrid;
    }

    public final void AXa(C011405n r7, C001300o r8) {
        CallGrid callGrid = this.A00;
        if (r7 == C011405n.ON_START) {
            int i2 = C13690nt.A0H(callGrid).widthPixels;
            AnonymousClass4DV r4 = callGrid.A0V;
            C17200uh r5 = callGrid.A09;
            AnonymousClass2Ao A05 = r5.A05("call-grid", 0.0f, i2 >> 1);
            Map map = r4.A00;
            map.put(0, A05);
            map.put(C13680ns.A0Y(), r5.A04(callGrid.getContext(), "voip-call-control-bottom-sheet"));
            AnonymousClass26d r0 = callGrid.A03;
            r0.A02 = r4;
            C50042Xk r2 = callGrid.A04;
            r2.A02 = r4;
            C17140ub r1 = callGrid.A08;
            r1.A02(r0.A0C);
            r1.A02(r2.A0C);
            callGrid.A0U.A0o(callGrid.A0S);
            callGrid.A0T.A0o(callGrid.A0R);
        } else if (r7 == C011405n.ON_STOP) {
            if (callGrid.A0G) {
                callGrid.A08(AnonymousClass000.A0u(), false);
                callGrid.A08(AnonymousClass000.A0u(), true);
            }
            AnonymousClass4DV r02 = callGrid.A0V;
            if (r02 != null) {
                Map map2 = r02.A00;
                Iterator A0q = C13680ns.A0q(map2);
                while (A0q.hasNext()) {
                    ((AnonymousClass2Ao) A0q.next()).A00();
                }
                map2.clear();
            }
            C23651Cv r12 = callGrid.A01;
            synchronized (r12.A01) {
                if (r12.A07 != null) {
                    r12.A07.A01(0);
                }
            }
            C17140ub r13 = callGrid.A08;
            r13.A03(callGrid.A03.A0C);
            r13.A03(callGrid.A04.A0C);
            callGrid.A0U.A0p(callGrid.A0S);
            callGrid.A0T.A0p(callGrid.A0R);
            if (callGrid.A0B.A0E(C16620tM.A02, 2222)) {
                callGrid.A07.A00();
            } else {
                callGrid.A06.A01();
            }
        }
    }
}
