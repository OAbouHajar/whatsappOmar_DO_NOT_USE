package com.facebook.redex;

import X.AnonymousClass0Q5;
import X.AnonymousClass3K2;
import X.C84334Kd;

public class IDxICallbackShape4S0000000_2_I1 extends AnonymousClass0Q5 {
    public final int A00;

    public IDxICallbackShape4S0000000_2_I1(int i2) {
        this.A00 = i2;
    }

    public /* bridge */ /* synthetic */ boolean A00(Object obj, Object obj2) {
        switch (this.A00) {
            case 0:
                AnonymousClass3K2.A1H(obj, obj2);
                break;
            case 3:
                return ((C84334Kd) obj).A02.A00.equals(((C84334Kd) obj2).A02.A00);
        }
        return obj.equals(obj2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0042, code lost:
        if (r1 != r0) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0044, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0074, code lost:
        return r4.equals(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        return r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ boolean A01(java.lang.Object r4, java.lang.Object r5) {
        /*
            r3 = this;
            int r0 = r3.A00
            switch(r0) {
                case 0: goto L_0x001c;
                case 1: goto L_0x0070;
                case 2: goto L_0x0012;
                default: goto L_0x0005;
            }
        L_0x0005:
            X.4Kd r4 = (X.C84334Kd) r4
            X.4Kd r5 = (X.C84334Kd) r5
            X.4TW r1 = r4.A02
            X.4TW r0 = r5.A02
            boolean r2 = r1.equals(r0)
        L_0x0011:
            return r2
        L_0x0012:
            X.4Sn r4 = (X.C86394Sn) r4
            X.4Sn r5 = (X.C86394Sn) r5
            int r1 = r4.A00
            int r0 = r5.A00
            r2 = 0
            goto L_0x0042
        L_0x001c:
            X.45n r4 = (X.C807845n) r4
            X.45n r5 = (X.C807845n) r5
            X.AnonymousClass3K2.A1H(r4, r5)
            java.lang.Class r1 = r4.getClass()
            java.lang.Class r0 = r5.getClass()
            boolean r0 = X.C18450wi.A0R(r1, r0)
            r2 = 0
            if (r0 == 0) goto L_0x0011
            boolean r0 = r4 instanceof X.C70833ho
            if (r0 == 0) goto L_0x0046
            boolean r0 = r5 instanceof X.C70833ho
            if (r0 == 0) goto L_0x0046
            X.3ho r4 = (X.C70833ho) r4
            int r1 = r4.A00
            X.3ho r5 = (X.C70833ho) r5
            int r0 = r5.A00
        L_0x0042:
            if (r1 != r0) goto L_0x0011
            r2 = 1
            return r2
        L_0x0046:
            boolean r0 = r4 instanceof X.C70803hl
            if (r0 == 0) goto L_0x005b
            boolean r0 = r5 instanceof X.C70803hl
            if (r0 == 0) goto L_0x005b
            X.3hl r4 = (X.C70803hl) r4
            android.graphics.Bitmap r1 = r4.A01
            X.3hl r5 = (X.C70803hl) r5
            android.graphics.Bitmap r0 = r5.A01
            boolean r2 = X.C18450wi.A0R(r1, r0)
            return r2
        L_0x005b:
            boolean r0 = r4 instanceof X.C70813hm
            if (r0 == 0) goto L_0x0070
            boolean r0 = r5 instanceof X.C70813hm
            if (r0 == 0) goto L_0x0070
            X.3hm r4 = (X.C70813hm) r4
            java.lang.Integer r1 = r4.A00
            X.3hm r5 = (X.C70813hm) r5
            java.lang.Integer r0 = r5.A00
            boolean r2 = X.C18450wi.A0R(r1, r0)
            return r2
        L_0x0070:
            boolean r2 = r4.equals(r5)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.IDxICallbackShape4S0000000_2_I1.A01(java.lang.Object, java.lang.Object):boolean");
    }
}
