package com.facebook.redex;

import X.C53332fX;
import X.C53342fY;
import X.C53452fj;
import com.whatsapp.util.Log;

public class IDxICallbackShape450S0100000_2_I0 implements C53332fX {
    public Object A00;
    public final int A01;

    public IDxICallbackShape450S0100000_2_I0(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public void AQQ() {
        if (this.A01 != 0) {
            Log.e("PAY: PaymentIncentiveManager/syncIncentiveData/refreshUserClaimInfo failed");
            ((C53342fY) this.A00).A00.AQQ();
            return;
        }
        Log.e("PAY: PaymentIncentiveManager/refreshUserClaimInfo/processSuccessfulGetClaimInfo failed");
        C53332fX r0 = ((C53452fj) this.A00).A01;
        if (r0 != null) {
            r0.AQQ();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0033, code lost:
        if (r2.A02 != false) goto L_0x0035;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void AY7(X.C53292fT r7) {
        /*
            r6 = this;
            int r0 = r6.A01
            if (r0 == 0) goto L_0x0014
            java.lang.Object r0 = r6.A00
            X.2fY r0 = (X.C53342fY) r0
            X.2fh r1 = r0.A00
            X.1GO r0 = r0.A01
            X.2fW r0 = r0.A00()
            r1.AY6(r0)
        L_0x0013:
            return
        L_0x0014:
            java.lang.Object r5 = r6.A00
            X.2fj r5 = (X.C53452fj) r5
            X.1GO r4 = r5.A02
            X.2fU r2 = r4.A02()
            X.0pd r1 = r4.A0A
            r0 = 889(0x379, float:1.246E-42)
            boolean r0 = r1.A0C(r0)
            if (r0 == 0) goto L_0x0035
            boolean r0 = r4.A0B()
            if (r0 == 0) goto L_0x0035
            if (r2 == 0) goto L_0x0035
            boolean r0 = r2.A02
            r3 = 1
            if (r0 == 0) goto L_0x0036
        L_0x0035:
            r3 = 0
        L_0x0036:
            X.0sq r2 = r4.A0H
            r1 = 7
            com.facebook.redex.RunnableRunnableShape1S0110000_I1 r0 = new com.facebook.redex.RunnableRunnableShape1S0110000_I1
            r0.<init>(r6, r1, r3)
            r2.Acl(r0)
            X.2fX r0 = r5.A01
            if (r0 == 0) goto L_0x0013
            r0.AY7(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.IDxICallbackShape450S0100000_2_I0.AY7(X.2fT):void");
    }
}
