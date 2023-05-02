package X;

import java.util.List;

/* renamed from: X.4Qt  reason: invalid class name and case insensitive filesystem */
public class C85984Qt {
    public final C455929m A00;
    public final C455729k A01;

    public C85984Qt(C455929m r1, C455729k r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public void A00() {
        C455729k r3 = this.A01;
        AnonymousClass393 r1 = r3.A03;
        if (!r1.A00.isEmpty()) {
            List list = r3.A04;
            C455829l A002 = r1.A00(list);
            C455829l r0 = r3.A01;
            if (r0 != null && !list.contains(r0)) {
                r3.A01 = null;
            }
            if (A002 instanceof AnonymousClass32x) {
                this.A00.A02();
            }
            this.A00.A01();
        }
    }
}
