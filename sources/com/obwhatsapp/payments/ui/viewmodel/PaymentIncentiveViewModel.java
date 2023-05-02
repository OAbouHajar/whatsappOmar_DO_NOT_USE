package com.obwhatsapp.payments.ui.viewmodel;

import X.AnonymousClass027;
import X.AnonymousClass1GO;
import X.C003401n;
import X.C110115dX;
import X.C13690nt;
import X.C14710pd;
import X.C16320sq;
import X.C16440t3;
import X.C18290wS;
import X.C42711yJ;
import X.C53292fT;
import X.C53302fU;
import X.C53322fW;
import java.util.concurrent.TimeUnit;

public class PaymentIncentiveViewModel extends C003401n {
    public final AnonymousClass027 A00 = C13690nt.A0O();
    public final AnonymousClass027 A01 = C13690nt.A0O();
    public final AnonymousClass027 A02 = C13690nt.A0O();
    public final C16440t3 A03;
    public final C42711yJ A04;
    public final C18290wS A05;
    public final AnonymousClass1GO A06;
    public final C16320sq A07;

    public PaymentIncentiveViewModel(C16440t3 r2, C18290wS r3, AnonymousClass1GO r4, C16320sq r5) {
        this.A03 = r2;
        this.A07 = r5;
        this.A05 = r3;
        this.A04 = C110115dX.A0L(r3);
        this.A06 = r4;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int A05(com.whatsapp.jid.UserJid r12) {
        /*
            r11 = this;
            if (r12 == 0) goto L_0x006e
            X.0wS r3 = r11.A05
            X.160 r0 = X.C110115dX.A0H(r3)
            X.1m3 r9 = r0.A05(r12)
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS
            X.0t3 r0 = r11.A03
            long r0 = r0.A00()
            long r0 = r2.toSeconds(r0)
            X.1GO r2 = r11.A06
            X.2fW r2 = r2.A00()
            X.1yJ r8 = X.C110115dX.A0L(r3)
            if (r8 == 0) goto L_0x006e
            int r5 = r2.A00(r0)
            X.2fU r7 = r2.A01
            X.2fT r10 = r2.A02
            if (r7 == 0) goto L_0x0069
            X.0pd r0 = r8.A07
            boolean r0 = X.C110115dX.A18(r0)
            r6 = 3
            if (r0 == 0) goto L_0x0046
            if (r10 == 0) goto L_0x0046
            long r3 = r7.A05
            int r1 = r10.A01
            int r0 = r10.A00
            int r1 = r1 + r0
            long r1 = (long) r1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0063
            r6 = 2
        L_0x0046:
            int r1 = r8.A07(r9, r12, r7)
            r0 = 3
            if (r6 == r0) goto L_0x0069
            if (r1 == r0) goto L_0x0069
            r0 = 2
            if (r6 != r0) goto L_0x005a
            r2 = 4
        L_0x0053:
            if (r5 == 0) goto L_0x006e
            r0 = 4
            if (r5 != r0) goto L_0x006b
            r2 = 1
        L_0x0059:
            return r2
        L_0x005a:
            if (r1 == 0) goto L_0x0061
            r2 = 5
            if (r1 == r0) goto L_0x0053
            r2 = 0
            goto L_0x0053
        L_0x0061:
            r2 = 3
            goto L_0x0053
        L_0x0063:
            boolean r0 = r10.A04
            if (r0 == 0) goto L_0x0046
            r6 = 1
            goto L_0x0046
        L_0x0069:
            r2 = 6
            goto L_0x0053
        L_0x006b:
            r0 = 3
            if (r5 != r0) goto L_0x0059
        L_0x006e:
            r2 = 6
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.payments.ui.viewmodel.PaymentIncentiveViewModel.A05(com.whatsapp.jid.UserJid):int");
    }

    public final boolean A06(C42711yJ r8, C53322fW r9) {
        if (r8 == null) {
            return false;
        }
        int A002 = r9.A00(TimeUnit.MILLISECONDS.toSeconds(this.A03.A00()));
        C14710pd r2 = r8.A07;
        if (!C110115dX.A18(r2) || A002 != 1) {
            return false;
        }
        C53302fU r1 = r9.A01;
        C53292fT r5 = r9.A02;
        return r1 != null && r5 != null && C110115dX.A18(r2) && r1.A05 > ((long) (r5.A01 + r5.A00)) && r5.A04;
    }
}
