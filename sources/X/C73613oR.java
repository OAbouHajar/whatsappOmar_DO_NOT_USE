package X;

/* renamed from: X.3oR  reason: invalid class name and case insensitive filesystem */
public class C73613oR extends C73583oO {
    public final /* synthetic */ C60072zu A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C73613oR(C60072zu r1, C16080sP r2, AnonymousClass013 r3) {
        super(r2, r3);
        this.A00 = r1;
    }

    public int A00(C16010sH r3, C16010sH r4) {
        C34911l4 r1 = r3.A0G;
        C34911l4 r0 = r4.A0G;
        if (r1 == null) {
            if (r0 != null) {
                return -1;
            }
        } else if (r0 == null) {
            return 1;
        } else {
            C16050sL r12 = r1.A01;
            C16050sL r02 = r0.A01;
            if (r12 != null) {
                if (r02 == null) {
                    return 1;
                }
            } else if (r02 != null) {
                return -1;
            }
        }
        return super.A00(r3, r4);
    }
}
