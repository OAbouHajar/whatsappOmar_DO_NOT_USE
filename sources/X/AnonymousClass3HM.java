package X;

import com.facebook.redex.RunnableRunnableShape18S0100000_I1_1;

/* renamed from: X.3HM  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3HM implements C108985Qg {
    public final /* synthetic */ C602430q A00;
    public final /* synthetic */ C38801rR A01;

    public /* synthetic */ AnonymousClass3HM(C602430q r1, C38801rR r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final void AUt(boolean z2, int i2) {
        C602430q r2 = this.A00;
        C38801rR r1 = this.A01;
        AnonymousClass29C r0 = r2.A0D;
        if (r0 != null) {
            AnonymousClass2PR r02 = r0.A08;
            AnonymousClass00B.A06(r02);
            r02.A03();
            AnonymousClass2PR r03 = r2.A0D.A08;
            AnonymousClass00B.A06(r03);
            r03.A03();
            C28381Vw r3 = r1.A11;
            r2.A0D.hashCode();
            if (i2 == 3) {
                if (!z2) {
                    RunnableRunnableShape18S0100000_I1_1 runnableRunnableShape18S0100000_I1_1 = new RunnableRunnableShape18S0100000_I1_1((Object) r2, 5);
                    r2.A0F = runnableRunnableShape18S0100000_I1_1;
                    r2.A0J.A0L(runnableRunnableShape18S0100000_I1_1, 150);
                } else if (r2.A0H) {
                    r2.A0D.hashCode();
                    r2.A0A.setVisibility(4);
                    r2.A03.setVisibility(4);
                    r2.A05.sendAccessibilityEvent(8);
                    r2.A02 = System.currentTimeMillis();
                }
            } else if (i2 == 4) {
                r2.A0A.setVisibility(0);
                r2.A03.setVisibility(0);
                C86374Sl r04 = r2.A0I;
                if (r04 != null) {
                    r04.A01(r3);
                }
            } else if (i2 == 1) {
                r2.A0H = true;
                r2.A0D.A07();
            }
        }
    }
}
