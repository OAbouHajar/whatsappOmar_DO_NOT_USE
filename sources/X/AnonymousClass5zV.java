package X;

import android.app.Activity;
import android.content.Context;

/* renamed from: X.5zV  reason: invalid class name */
public final /* synthetic */ class AnonymousClass5zV implements AnonymousClass2D0 {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ AnonymousClass60O A01;
    public final /* synthetic */ AnonymousClass5Q2 A02;
    public final /* synthetic */ C18310wU A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ boolean A05;

    public /* synthetic */ AnonymousClass5zV(Activity activity, AnonymousClass60O r2, AnonymousClass5Q2 r3, C18310wU r4, String str, boolean z2) {
        this.A01 = r2;
        this.A03 = r4;
        this.A04 = str;
        this.A05 = z2;
        this.A00 = activity;
        this.A02 = r3;
    }

    public final void A5d() {
        AnonymousClass60O r9 = this.A01;
        C18310wU r8 = this.A03;
        String str = this.A04;
        boolean z2 = this.A05;
        Activity activity = this.A00;
        AnonymousClass5Q2 r6 = this.A02;
        Context context = r9.A05.A00;
        C112205i7 r15 = new C112205i7(context, r9.A02, r9.A03, r9.A06, r9, r9.A07, r9.A09, r8);
        C118135uC r82 = new C118135uC(activity, r9, r6);
        StringBuilder A0r = AnonymousClass000.A0r("PAY: blockNonWaVpa called vpa: ");
        A0r.append(AnonymousClass5x3.A02(str));
        A0r.append(" block: ");
        A0r.append(z2);
        C13680ns.A1V(A0r);
        String str2 = z2 ? "upi-block-vpa" : "upi-unblock-vpa";
        AnonymousClass4XO A022 = C116635rh.A02(r15, str2);
        C17190ug r152 = r15.A03;
        String A023 = r152.A02();
        C51812cK r5 = new C51812cK(A023);
        C32461gQ A0X = C110105dW.A0X();
        C32461gQ A0Y = C110105dW.A0Y(A0X);
        C32461gQ.A00(A0Y, "action", z2 ? "upi-block-vpa" : "upi-unblock-vpa");
        if (C110115dX.A1A(str, 0, false)) {
            C32461gQ.A00(A0Y, "vpa", str);
        }
        r152.A0A(new C112435iU(r15.A00, r15.A01, r82, r15.A05, A022, r15, str2, str, z2), C110105dW.A0T(A0Y, A0X, r5), A023, 204, 0);
    }
}
