package X;

import android.view.View;
import java.util.ArrayList;

/* renamed from: X.2Wl  reason: invalid class name and case insensitive filesystem */
public class C49892Wl {
    public C83934Ip A00;
    public AnonymousClass4FC A01;
    public final int A02;
    public final C16980tz A03;
    public final C83954Ir A04;
    public final C23621Cr A05;
    public final AnonymousClass1L1 A06;
    public final C23631Ct A07;
    public final AnonymousClass01D A08;

    public C49892Wl(C16980tz r4, C23621Cr r5, AnonymousClass1L1 r6, C23631Ct r7, AnonymousClass01D r8, int i2, boolean z2) {
        this.A03 = r4;
        this.A07 = r7;
        this.A05 = r5;
        this.A06 = r6;
        this.A08 = r8;
        this.A02 = i2;
        boolean z3 = true;
        boolean z4 = !new ArrayList(r5.A03.values()).isEmpty();
        this.A04 = new C83954Ir(z4, (z2 || !z4) ? false : z3);
        this.A01 = new AnonymousClass4FC(this);
    }

    public final void A00() {
        C83934Ip r0 = this.A00;
        if (r0 != null) {
            C83954Ir r4 = this.A04;
            C63313Gy r3 = r0.A01;
            View view = r3.A01;
            if (view != null) {
                boolean z2 = r4.A00;
                int visibility = view.getVisibility();
                boolean z3 = false;
                if (visibility == 0) {
                    z3 = true;
                }
                if (z2 != z3) {
                    r3.A00(z2, r4.A01);
                }
            }
        }
    }
}
