package X;

/* renamed from: X.1xG  reason: invalid class name and case insensitive filesystem */
public class C42121xG {
    public static C42131xH A00(C39041rp r2) {
        C35101lN r1 = r2.A00;
        if (r1 == null) {
            return null;
        }
        int i2 = r1.A04;
        if (i2 == 1) {
            return new C63183Gl();
        }
        if (i2 == 2) {
            return new AnonymousClass33w(r1);
        }
        StringBuilder sb = new StringBuilder("Interactive response message does not support customizations: ");
        sb.append(i2);
        throw new IllegalStateException(sb.toString());
    }
}
