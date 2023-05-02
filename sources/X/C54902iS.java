package X;

import android.view.View;

/* renamed from: X.2iS  reason: invalid class name and case insensitive filesystem */
public class C54902iS extends C16690tT {
    public final C54892iR A00;
    public final C49172Rk A01;

    public C54902iS(C001300o r2, C54892iR r3, C49172Rk r4) {
        super(r2, true);
        this.A01 = r4;
        this.A00 = r3;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        C49172Rk r5 = this.A01;
        C35341ll r0 = new C35341ll();
        r0.A01 = 2;
        r0.A00 = 7;
        r0.A02 = 2;
        r0.A03 = null;
        r0.A04 = false;
        AnonymousClass2BC A002 = r5.A00(r0);
        if (!this.A02.isCancelled()) {
            return A002;
        }
        A002.close();
        return null;
    }

    public /* bridge */ /* synthetic */ void A0A(Object obj) {
        AnonymousClass2V7 r2;
        AnonymousClass2BC r5 = (AnonymousClass2BC) obj;
        C29251aI r3 = this.A00.A00;
        r3.A0D.A02 = r5;
        if (r3.A0S) {
            if (!(r5 == null || (r2 = r3.A0G) == null)) {
                C54852iN r1 = r2.A04;
                if (r1 != null) {
                    AnonymousClass2BC r0 = r1.A00;
                    if (r0 != null) {
                        r0.close();
                        r1.A00 = null;
                    }
                    r1.A00 = r5;
                    r1.A01();
                }
                View view = r2.A01;
                if (view != null) {
                    view.setVisibility(0);
                }
            }
            AnonymousClass01A r12 = r3.A0b;
            if (r12 instanceof C50452Zp) {
                ((C50452Zp) r12).AbZ();
            }
        }
    }
}
