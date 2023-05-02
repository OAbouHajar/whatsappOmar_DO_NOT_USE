package com.facebook.redex;

import X.AnonymousClass1WE;

public class IDxNConsumerShape16S0300000_1_I1 implements AnonymousClass1WE {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public IDxNConsumerShape16S0300000_1_I1(Object obj, Object obj2, Object obj3, int i2) {
        this.A03 = i2;
        this.A00 = obj3;
        this.A01 = obj2;
        this.A02 = obj;
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x00da  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void accept(java.lang.Object r14) {
        /*
            r13 = this;
            r9 = r14
            int r0 = r13.A03
            if (r0 == 0) goto L_0x00b7
            java.lang.Object r11 = r13.A00
            X.34A r11 = (X.AnonymousClass34A) r11
            java.lang.Object r0 = r13.A01
            java.lang.Object r10 = r13.A02
            java.util.List r10 = (java.util.List) r10
            X.4Mi r9 = (X.C84904Mi) r9
            boolean r0 = r0 instanceof X.C38741rL
            if (r0 == 0) goto L_0x004a
            X.1sv r3 = r9.A03
            if (r3 == 0) goto L_0x0049
            X.2Ao r1 = r11.A0D
            com.obwhatsapp.WaImageView r0 = r11.A06
            r1.A09(r0, r3)
            java.lang.String r1 = r3.A02()
            r0 = 128(0x80, float:1.794E-43)
            java.lang.String r2 = X.AnonymousClass1ZW.A04(r0, r1)
            X.2pE r1 = r11.A07
            r0 = 0
            r1.setTitleAndDescription(r2, r0, r10)
            java.util.List r0 = r3.A05
            if (r0 == 0) goto L_0x0049
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0049
            java.util.List r0 = r3.A05
            java.lang.Object r0 = X.C13690nt.A0Z(r0)
            X.1sw r0 = (X.C39711sw) r0
            java.lang.String r1 = r0.A02
            X.2pE r0 = r11.A07
            r0.setSubText(r1, r10)
        L_0x0049:
            return
        L_0x004a:
            java.util.List r4 = r9.A02
            r8 = 0
            r3 = 0
        L_0x004e:
            java.util.List r0 = r11.A09
            int r0 = r0.size()
            if (r3 >= r0) goto L_0x0072
            int r0 = r4.size()
            if (r3 >= r0) goto L_0x006f
            X.2Ao r2 = r11.A0D
            java.lang.Object r1 = r4.get(r3)
            X.1sv r1 = (X.C39701sv) r1
            java.util.List r0 = r11.A09
            java.lang.Object r0 = r0.get(r3)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r2.A09(r0, r1)
        L_0x006f:
            int r3 = r3 + 1
            goto L_0x004e
        L_0x0072:
            int r7 = r9.A00
            X.1sv r0 = r9.A03
            r6 = 0
            if (r0 != 0) goto L_0x009d
            r1 = r6
        L_0x007a:
            r9 = 1
            if (r1 == 0) goto L_0x00a2
            int r7 = r7 - r9
            r0 = 128(0x80, float:1.794E-43)
            java.lang.String r5 = X.AnonymousClass1ZW.A04(r0, r1)
            X.013 r4 = r11.A0E
            r3 = 2131755049(0x7f100029, float:1.9140966E38)
            long r1 = (long) r7
            java.lang.Object[] r0 = X.C13690nt.A1Z()
            r0[r8] = r5
            X.AnonymousClass000.A1M(r0, r7, r9)
            java.lang.String r1 = r4.A0J(r0, r3, r1)
            X.2pE r0 = r11.A07
            r0.setTitleAndDescription(r1, r6, r10)
            return
        L_0x009d:
            java.lang.String r1 = r0.A02()
            goto L_0x007a
        L_0x00a2:
            X.2pE r5 = r11.A07
            X.013 r4 = r11.A0E
            r3 = 2131755224(0x7f1000d8, float:1.9141321E38)
            long r1 = (long) r7
            java.lang.Object[] r0 = new java.lang.Object[r9]
            X.AnonymousClass000.A1M(r0, r7, r8)
            java.lang.String r0 = r4.A0J(r0, r3, r1)
            r5.setTitleAndDescription(r0, r6, r6)
            return
        L_0x00b7:
            java.lang.Object r2 = r13.A00
            X.1XP r2 = (X.AnonymousClass1XP) r2
            java.lang.Object r4 = r13.A01
            X.4MK r4 = (X.AnonymousClass4MK) r4
            java.lang.Object r8 = r13.A02
            X.1WD r8 = (X.AnonymousClass1WD) r8
            java.lang.Integer r9 = (java.lang.Integer) r9
            r5 = 2
            r0 = 3
            X.C18450wi.A0H(r9, r0)
            X.1XS r0 = r2.A0H
            java.lang.Object r0 = r0.A00()
            X.21B r0 = (X.AnonymousClass21B) r0
            r12 = 0
            if (r0 != 0) goto L_0x0105
            r10 = r12
            r3 = r12
        L_0x00d7:
            r11 = r12
        L_0x00d8:
            if (r3 == 0) goto L_0x00de
            java.lang.String r12 = android.util.Base64.encodeToString(r3, r5)
        L_0x00de:
            X.1XS r0 = r2.A08
            java.lang.Object r1 = r0.A00()
            X.21L r1 = (X.AnonymousClass21L) r1
            if (r1 == 0) goto L_0x00f7
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.A02
            boolean r0 = r0.get()
            if (r0 != 0) goto L_0x00f7
            java.io.File r0 = r1.A01
            if (r0 == 0) goto L_0x00f7
            r0.delete()
        L_0x00f7:
            X.0pt r0 = r4.A00
            X.569 r7 = new X.569
            r7.<init>(r8, r9, r10, r11, r12)
            r0.A0K(r7)
            r2.A02()
            return
        L_0x0105:
            X.1ez r1 = r0.A02
            java.lang.String r10 = r1.A06()
            monitor-enter(r1)
            byte[] r0 = r1.A0L     // Catch:{ all -> 0x011a }
            monitor-exit(r1)
            monitor-enter(r1)
            byte[] r3 = r1.A0I     // Catch:{ all -> 0x011a }
            monitor-exit(r1)
            if (r0 == 0) goto L_0x00d7
            java.lang.String r11 = android.util.Base64.encodeToString(r0, r5)
            goto L_0x00d8
        L_0x011a:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.IDxNConsumerShape16S0300000_1_I1.accept(java.lang.Object):void");
    }
}
