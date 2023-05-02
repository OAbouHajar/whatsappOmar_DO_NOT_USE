package com.facebook.redex;

import X.AnonymousClass023;
import X.AnonymousClass026;
import X.AnonymousClass028;
import X.AnonymousClass5QZ;

public class IDxObserverShape7S0400000_2_I1 implements AnonymousClass023 {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public final int A04;

    public IDxObserverShape7S0400000_2_I1(AnonymousClass028 r1, AnonymousClass028 r2, AnonymousClass026 r3, AnonymousClass5QZ r4, int i2) {
        this.A04 = i2;
        this.A00 = r1;
        this.A01 = r2;
        this.A03 = r3;
        this.A02 = r4;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void AOH(java.lang.Object r8) {
        /*
            r7 = this;
            int r3 = r7.A04
            java.lang.Object r2 = r7.A00
            X.028 r2 = (X.AnonymousClass028) r2
            java.lang.Object r0 = r7.A01
            X.028 r0 = (X.AnonymousClass028) r0
            java.lang.Object r5 = r7.A03
            X.028 r5 = (X.AnonymousClass028) r5
            java.lang.Object r1 = r7.A02
            X.5QZ r1 = (X.AnonymousClass5QZ) r1
            switch(r3) {
                case 0: goto L_0x0063;
                case 1: goto L_0x00bc;
                default: goto L_0x0015;
            }
        L_0x0015:
            java.lang.Object r4 = r2.A01()
            java.lang.Object r2 = r0.A01()
            if (r4 == 0) goto L_0x014c
            if (r2 == 0) goto L_0x014c
            if (r8 == 0) goto L_0x014c
            com.facebook.redex.IDxTFunction3Shape461S0100000_2_I1 r1 = (com.facebook.redex.IDxTFunction3Shape461S0100000_2_I1) r1
            int r0 = r1.A01
            if (r0 == 0) goto L_0x012a
            java.lang.Object r1 = r1.A00
            X.51w r1 = (X.C1035651w) r1
            java.util.List r4 = (java.util.List) r4
            int r0 = X.AnonymousClass000.A0D(r2)
            int r3 = X.AnonymousClass000.A0D(r8)
            java.util.List r6 = r1.A09
            r6.clear()
            float r2 = (float) r0
            float r1 = (float) r3
            r0 = 1082130432(0x40800000, float:4.0)
            float r1 = r1 / r0
            float r2 = r2 * r1
            int r2 = java.lang.Math.round(r2)
            r1 = r2
        L_0x0047:
            int r0 = r2 + r3
            if (r1 >= r0) goto L_0x0149
            if (r1 < 0) goto L_0x005d
            int r0 = r4.size()
            if (r1 >= r0) goto L_0x005d
            java.lang.Object r0 = r4.get(r1)
        L_0x0057:
            r6.add(r0)
            int r1 = r1 + 1
            goto L_0x0047
        L_0x005d:
            r0 = 0
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            goto L_0x0057
        L_0x0063:
            java.lang.Object r4 = r2.A01()
            java.lang.Object r2 = r0.A01()
            if (r4 == 0) goto L_0x014c
            if (r8 == 0) goto L_0x014c
            if (r2 == 0) goto L_0x014c
            com.facebook.redex.IDxTFunction3Shape461S0100000_2_I1 r1 = (com.facebook.redex.IDxTFunction3Shape461S0100000_2_I1) r1
            int r0 = r1.A01
            if (r0 == 0) goto L_0x00b1
            java.lang.Object r1 = r1.A00
            X.51w r1 = (X.C1035651w) r1
            java.util.List r4 = (java.util.List) r4
            int r0 = X.AnonymousClass000.A0D(r8)
            int r3 = X.AnonymousClass000.A0D(r2)
            java.util.List r6 = r1.A09
            r6.clear()
            float r2 = (float) r0
            float r1 = (float) r3
            r0 = 1082130432(0x40800000, float:4.0)
            float r1 = r1 / r0
            float r2 = r2 * r1
            int r2 = java.lang.Math.round(r2)
            r1 = r2
        L_0x0095:
            int r0 = r2 + r3
            if (r1 >= r0) goto L_0x0149
            if (r1 < 0) goto L_0x00ab
            int r0 = r4.size()
            if (r1 >= r0) goto L_0x00ab
            java.lang.Object r0 = r4.get(r1)
        L_0x00a5:
            r6.add(r0)
            int r1 = r1 + 1
            goto L_0x0095
        L_0x00ab:
            r0 = 0
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            goto L_0x00a5
        L_0x00b1:
            java.util.List r4 = (java.util.List) r4
            int r3 = X.AnonymousClass000.A0D(r8)
            int r1 = X.AnonymousClass000.A0D(r2)
            goto L_0x0134
        L_0x00bc:
            java.lang.Object r3 = r2.A01()
            java.lang.Object r2 = r0.A01()
            if (r8 == 0) goto L_0x014c
            if (r3 == 0) goto L_0x014c
            if (r2 == 0) goto L_0x014c
            com.facebook.redex.IDxTFunction3Shape461S0100000_2_I1 r1 = (com.facebook.redex.IDxTFunction3Shape461S0100000_2_I1) r1
            int r0 = r1.A01
            if (r0 == 0) goto L_0x010a
            java.lang.Object r1 = r1.A00
            X.51w r1 = (X.C1035651w) r1
            java.util.List r8 = (java.util.List) r8
            int r0 = X.AnonymousClass000.A0D(r3)
            int r3 = X.AnonymousClass000.A0D(r2)
            java.util.List r6 = r1.A09
            r6.clear()
            float r2 = (float) r0
            float r1 = (float) r3
            r0 = 1082130432(0x40800000, float:4.0)
            float r1 = r1 / r0
            float r2 = r2 * r1
            int r2 = java.lang.Math.round(r2)
            r1 = r2
        L_0x00ee:
            int r0 = r2 + r3
            if (r1 >= r0) goto L_0x0149
            if (r1 < 0) goto L_0x0104
            int r0 = r8.size()
            if (r1 >= r0) goto L_0x0104
            java.lang.Object r0 = r8.get(r1)
        L_0x00fe:
            r6.add(r0)
            int r1 = r1 + 1
            goto L_0x00ee
        L_0x0104:
            r0 = 0
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            goto L_0x00fe
        L_0x010a:
            java.util.List r8 = (java.util.List) r8
            int r3 = X.AnonymousClass000.A0D(r3)
            int r1 = X.AnonymousClass000.A0D(r2)
            float r2 = (float) r3
            r0 = 1082130432(0x40800000, float:4.0)
            float r2 = r2 / r0
            float r1 = (float) r1
            r0 = 1125515264(0x43160000, float:150.0)
            float r1 = r1 / r0
            float r2 = r2 * r1
            int r0 = java.lang.Math.round(r2)
            int r3 = r3 + r0
            java.util.ArrayList r6 = X.C13690nt.A0i(r3)
            X.C809246c.A00(r8, r6, r3)
            goto L_0x0149
        L_0x012a:
            java.util.List r4 = (java.util.List) r4
            int r3 = X.AnonymousClass000.A0D(r2)
            int r1 = X.AnonymousClass000.A0D(r8)
        L_0x0134:
            float r2 = (float) r3
            r0 = 1082130432(0x40800000, float:4.0)
            float r2 = r2 / r0
            float r1 = (float) r1
            r0 = 1125515264(0x43160000, float:150.0)
            float r1 = r1 / r0
            float r2 = r2 * r1
            int r0 = java.lang.Math.round(r2)
            int r3 = r3 + r0
            java.util.ArrayList r6 = X.C13690nt.A0i(r3)
            X.C809246c.A00(r4, r6, r3)
        L_0x0149:
            r5.A0B(r6)
        L_0x014c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.IDxObserverShape7S0400000_2_I1.AOH(java.lang.Object):void");
    }
}
