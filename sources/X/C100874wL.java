package X;

import java.util.Stack;

/* renamed from: X.4wL  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C100874wL implements C108685Oy {
    public final /* synthetic */ C57272qc A00;

    public /* synthetic */ C100874wL(C57272qc r1) {
        this.A00 = r1;
    }

    public final String AFs() {
        C57272qc r4 = this.A00;
        C30801cy r1 = r4.A0S;
        if (r1.A01() == null) {
            return null;
        }
        C31241dn r3 = (C31241dn) r1.A01();
        C31241dn r2 = (C31241dn) r4.A0T.A01();
        if (r2 != null) {
            Stack stack = r4.A05;
            if (!stack.isEmpty() && AnonymousClass000.A0D(stack.peek()) == 2) {
                r3 = r2;
            }
        }
        return r3.A00;
    }
}
