package X;

import java.util.HashMap;

/* renamed from: X.5tm  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C117925tm {
    public final /* synthetic */ AnonymousClass1Z7 A00;

    public /* synthetic */ C117925tm(AnonymousClass1Z7 r1) {
        this.A00 = r1;
    }

    public final void A00(C35441lw r7, AnonymousClass2HJ r8) {
        String str;
        String str2;
        AnonymousClass1Z7 r5 = this.A00;
        HashMap A0x = AnonymousClass000.A0x();
        if (r8 == null) {
            C39931tI r0 = (C39931tI) r7.A08;
            if (r0 != null) {
                int i2 = r0.A00;
                boolean z2 = true;
                if ((i2 & 1) <= 0) {
                    z2 = false;
                }
                if (!z2) {
                    str2 = "sell_pending";
                } else if ((i2 & 2) <= 0) {
                    str2 = "payout_pending";
                }
                A0x.put(str2, "1");
            }
            str = "on_success";
        } else {
            C110105dW.A1I(r8, A0x);
            str = "on_failure";
        }
        r5.A01(str, A0x);
    }
}
