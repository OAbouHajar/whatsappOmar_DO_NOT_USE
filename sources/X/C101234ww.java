package X;

import java.util.List;

/* renamed from: X.4ww  reason: invalid class name and case insensitive filesystem */
public final class C101234ww implements C50192Yi {
    public final int A00;
    public final AnonymousClass04N A01;
    public final AnonymousClass013 A02;
    public final AnonymousClass2OJ A03 = new AnonymousClass2OJ(Boolean.FALSE);
    public final Runnable A04;
    public final List A05 = AnonymousClass000.A0u();

    public C101234ww(AnonymousClass04N r3, AnonymousClass013 r4, Runnable runnable, int i2) {
        C18450wi.A0H(r4, 1);
        this.A02 = r4;
        this.A00 = i2;
        this.A04 = runnable;
        this.A01 = r3;
    }

    public boolean Agg(int i2, Object obj) {
        Object A012 = this.A03.A01();
        C18450wi.A0B(A012);
        boolean A1X = AnonymousClass000.A1X(A012);
        if (5 - i2 != 0) {
            return !A1X;
        }
        if (A1X) {
            List list = this.A05;
            if (!list.isEmpty()) {
                if (obj == null) {
                    return false;
                }
                return C40661uU.A03(this.A02, ((C84394Kj) obj).A00.A03, list, true);
            }
        }
    }
}
