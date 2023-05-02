package X;

import java.util.Set;

/* renamed from: X.1No  reason: invalid class name and case insensitive filesystem */
public final class C26401No implements C23541Cj {
    public final C16040sK A00;
    public final C18260wP A01;
    public final C17990vy A02;
    public final C16490t9 A03;
    public final AnonymousClass01D A04;

    public C26401No(C16040sK r2, C18260wP r3, C17990vy r4, C16490t9 r5, AnonymousClass01D r6) {
        C18450wi.A0H(r2, 1);
        C18450wi.A0H(r5, 2);
        C18450wi.A0H(r3, 3);
        C18450wi.A0H(r4, 4);
        C18450wi.A0H(r6, 5);
        this.A00 = r2;
        this.A03 = r5;
        this.A01 = r3;
        this.A02 = r4;
        this.A04 = r6;
    }

    public void APJ() {
        C16040sK r0 = this.A00;
        r0.A0B();
        if (r0.A00 != null) {
            this.A02.A01(this.A01.A06());
            C75983t2 r2 = new C75983t2();
            for (C18540wr AUu : (Set) this.A04.get()) {
                AUu.AUu(r2);
            }
            this.A03.A04(r2);
        }
    }

    public /* synthetic */ void APK() {
    }
}
