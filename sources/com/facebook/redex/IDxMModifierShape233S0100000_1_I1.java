package com.facebook.redex;

import X.C27711Sv;
import X.C47512Jh;

public class IDxMModifierShape233S0100000_1_I1 implements C47512Jh {
    public Object A00;
    public final int A01;

    public IDxMModifierShape233S0100000_1_I1(C27711Sv r1, int i2) {
        this.A01 = i2;
        this.A00 = r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00f5, code lost:
        if (r4 == X.AnonymousClass1XK.A0S) goto L_0x00f7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A56(X.C16750ta r8, X.C16730tY r9, java.lang.Object r10) {
        /*
            r7 = this;
            int r0 = r7.A01
            if (r0 == 0) goto L_0x00cf
            java.lang.Object r4 = r7.A00
            X.1Sv r4 = (X.C27711Sv) r4
            X.21C r10 = (X.AnonymousClass21C) r10
            boolean r0 = r10.A02
            if (r0 == 0) goto L_0x00c4
            java.lang.String r0 = r9.A14()
            r3 = 0
            if (r0 == 0) goto L_0x0025
            android.net.Uri r1 = android.net.Uri.parse(r0)
            if (r1 == 0) goto L_0x0025
            boolean r0 = r1.isAbsolute()
            if (r0 == 0) goto L_0x0025
            java.io.File r3 = X.AnonymousClass1XI.A03(r1)
        L_0x0025:
            java.io.File r2 = r10.A01
            X.AnonymousClass00B.A06(r2)
            boolean r0 = r10 instanceof X.C76783ug
            if (r0 != 0) goto L_0x0034
            java.lang.String r0 = r2.getName()
            r9.A07 = r0
        L_0x0034:
            long r0 = r2.length()
            r8.A0A = r0
            r9.A01 = r0
            r8.A0F = r2
            X.0tm r0 = r9.A0F()
            if (r0 == 0) goto L_0x0054
            byte[] r1 = r10.A03
            if (r1 == 0) goto L_0x0054
            X.0tm r0 = r9.A0F()
            r0.A02(r1)
            X.1Ld r0 = r4.A06
            r0.A0D(r9)
        L_0x0054:
            r6 = 1
            r8.A0O = r6
            r8.A0L = r6
            boolean r0 = r10 instanceof X.C76823uk
            if (r0 == 0) goto L_0x008a
            r1 = r10
            X.3uk r1 = (X.C76823uk) r1
            int r0 = r1.A02
            r8.A06 = r0
            int r0 = r1.A03
            r8.A08 = r0
            int r0 = r1.A00
            r8.A02 = r0
            int r0 = r1.A01
            r8.A03 = r0
            boolean r0 = r1.A04
            if (r0 == 0) goto L_0x0135
            int[] r5 = r1.A05
            int r0 = r5.length
            if (r0 <= 0) goto L_0x0135
            X.1y4 r1 = r9.A12()
            X.AnonymousClass00B.A06(r1)
            monitor-enter(r1)
            r1.A03 = r5     // Catch:{ all -> 0x0087 }
            r1.A01 = r6     // Catch:{ all -> 0x0087 }
            goto L_0x0134
        L_0x0087:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x008a:
            boolean r0 = r10 instanceof X.C76803ui
            if (r0 == 0) goto L_0x00a2
            r1 = r10
            X.3ui r1 = (X.C76803ui) r1
            int r0 = r1.A00
            r9.A00 = r0
            boolean r1 = r1.A01
            r0 = 0
            if (r1 == 0) goto L_0x009e
            r9.A05 = r0
            r9.A04 = r0
        L_0x009e:
            r8.A0H = r0
            goto L_0x0135
        L_0x00a2:
            boolean r0 = r10 instanceof X.C76813uj
            if (r0 == 0) goto L_0x0135
            r1 = r10
            X.3uj r1 = (X.C76813uj) r1
            java.lang.String r0 = r1.A01
            r9.A05 = r0
            r0 = 0
            r9.A04 = r0
            int r0 = r1.A02
            if (r0 <= 0) goto L_0x00b6
            r8.A04 = r0
        L_0x00b6:
            java.lang.Boolean r0 = r1.A00
            if (r0 == 0) goto L_0x0135
            r1 = r9
            X.1rB r1 = (X.C38641rB) r1
            boolean r0 = r0.booleanValue()
            r1.A00 = r0
            goto L_0x0135
        L_0x00c4:
            r0 = 0
            r8.A0Z = r0
            r9.A0R()
            r8.A0L = r0
            r8.A0O = r0
            goto L_0x0146
        L_0x00cf:
            java.lang.Object r5 = r7.A00
            X.1Sv r5 = (X.C27711Sv) r5
            X.1x9 r10 = (X.C42051x9) r10
            byte r1 = r9.A10
            int r0 = r9.A08
            X.1XK r4 = X.C31831f6.A01(r1, r0)
            X.0tm r3 = r9.A0F()
            if (r3 == 0) goto L_0x00fb
            byte[] r2 = r10.A02
            if (r2 == 0) goto L_0x00fb
            X.18C r0 = r5.A04
            r0.A01(r3)
            boolean r0 = X.C221516v.A01(r4)
            if (r0 != 0) goto L_0x00f7
            X.1XK r1 = X.AnonymousClass1XK.A0S
            r0 = 0
            if (r4 != r1) goto L_0x00f8
        L_0x00f7:
            r0 = 1
        L_0x00f8:
            r3.A03(r2, r0)
        L_0x00fb:
            android.util.Pair r1 = r10.A01
            if (r1 == 0) goto L_0x010f
            java.lang.Object r0 = r1.first
            int r0 = X.AnonymousClass000.A0D(r0)
            r8.A08 = r0
            java.lang.Object r0 = r1.second
            int r0 = X.AnonymousClass000.A0D(r0)
            r8.A06 = r0
        L_0x010f:
            android.util.Pair r1 = r10.A00
            if (r1 == 0) goto L_0x0123
            java.lang.Object r0 = r1.first
            int r0 = X.AnonymousClass000.A0D(r0)
            r8.A02 = r0
            java.lang.Object r0 = r1.second
            int r0 = X.AnonymousClass000.A0D(r0)
            r8.A03 = r0
        L_0x0123:
            byte[] r1 = r10.A03
            if (r1 == 0) goto L_0x0146
            boolean r0 = r9 instanceof X.C38641rB
            if (r0 == 0) goto L_0x0146
            X.1rB r9 = (X.C38641rB) r9
            X.1XO r0 = X.AnonymousClass1XO.A00(r1)
            r9.A02 = r0
            goto L_0x0146
        L_0x0134:
            monitor-exit(r1)
        L_0x0135:
            java.lang.String r0 = r10.A00
            r9.A0A = r0
            if (r3 == 0) goto L_0x0146
            boolean r0 = r3.equals(r2)
            if (r0 != 0) goto L_0x0146
            X.1A9 r0 = r4.A05
            r0.A0d(r3)
        L_0x0146:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.IDxMModifierShape233S0100000_1_I1.A56(X.0ta, X.0tY, java.lang.Object):boolean");
    }
}
