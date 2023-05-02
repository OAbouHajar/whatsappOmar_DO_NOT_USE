package X;

/* renamed from: X.4tn  reason: invalid class name and case insensitive filesystem */
public class C99294tn implements AnonymousClass5OP {
    public final AnonymousClass5OP A00;

    public C99294tn(AnonymousClass5OP r1) {
        this.A00 = r1;
    }

    public boolean Agf(C31201dg r8) {
        for (C31201dg Agf : r8.A0L()) {
            if (this.A00.Agf(Agf)) {
                return true;
            }
        }
        int[] A002 = C90154da.A00().A06().A00(r8);
        for (int A0M : A002) {
            for (C31201dg r1 : r8.A0M(A0M)) {
                if (r1 != null && this.A00.Agf(r1)) {
                    return true;
                }
            }
        }
        int[] A01 = C90154da.A00().A06().A01(r8);
        for (int A0G : A01) {
            C31201dg A0G2 = r8.A0G(A0G);
            if (A0G2 != null && this.A00.Agf(A0G2)) {
                return true;
            }
        }
        return false;
    }
}
