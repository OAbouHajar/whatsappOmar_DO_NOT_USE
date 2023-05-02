package X;

import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.IDxLambdaShape57S0000000_2_I0;

/* renamed from: X.1FK  reason: invalid class name */
public final class AnonymousClass1FK implements AnonymousClass1FG {
    public final C18930xU A00;
    public final C20370zw A01;
    public final C15810rt A02;
    public final C17580vJ A03;

    public AnonymousClass1FK(C18930xU r2, C20370zw r3, C15810rt r4, C17580vJ r5) {
        C18450wi.A0H(r4, 1);
        C18450wi.A0H(r5, 2);
        C18450wi.A0H(r2, 4);
        this.A02 = r4;
        this.A03 = r5;
        this.A01 = r3;
        this.A00 = r2;
    }

    public void API() {
        Set A0B = this.A02.A0B();
        C18450wi.A0B(A0B);
        AnonymousClass22G A032 = C11490ir.A03(new IDxLambdaShape57S0000000_2_I0(2), new AnonymousClass22w(new AnonymousClass5FJ(this), C11490ir.A03(new IDxLambdaShape57S0000000_2_I0(2), new AnonymousClass22w(new IDxLambdaShape57S0000000_2_I0(0), new C441122u(A0B)))));
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        C11490ir.A05(linkedHashSet, A032);
        Set A012 = AnonymousClass1F9.A01(linkedHashSet);
        if (!A012.isEmpty()) {
            this.A00.A0S(A012);
        }
    }
}
