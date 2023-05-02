package X;

/* renamed from: X.4u1  reason: invalid class name and case insensitive filesystem */
public class C99434u1 implements AnonymousClass5OR {
    public boolean A8k(C89494cI r3, C89494cI r4, C84634Lh r5) {
        boolean z2 = r3 instanceof C70113g8;
        if (z2 || (r4 instanceof C70113g8)) {
            if (z2) {
                boolean booleanValue = ((C70113g8) r3).A00.booleanValue();
                if (r4 instanceof C70113g8) {
                    return AnonymousClass000.A1R(booleanValue ? 1 : 0, ((C70113g8) r4).A00.booleanValue() ? 1 : 0);
                }
            }
            throw C70003fx.A00("Expected boolean node");
        }
        throw new AnonymousClass5Ar("Failed to evaluate exists expression");
    }
}
