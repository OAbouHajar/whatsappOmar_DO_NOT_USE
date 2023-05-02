package X;

import java.io.File;

/* renamed from: X.1pX  reason: invalid class name and case insensitive filesystem */
public class C37671pX extends C34711kk {
    public C37671pX(C17010u2 r2, C214414c r3, int i2) {
        super(r2, r3, "gifmemorycache", i2);
    }

    public AnonymousClass20S A04(String str) {
        AnonymousClass20S r2 = (AnonymousClass20S) A00(str);
        if (r2 != null) {
            String str2 = r2.A00;
            if (!new File(str2).exists()) {
                this.A02.A03(str);
                return null;
            } else if (r2.A02 == null && !AnonymousClass01E.A01()) {
                r2.A02 = C18830xK.A03(C18830xK.A01(new File(str2)), 100);
            }
        }
        return r2;
    }
}
