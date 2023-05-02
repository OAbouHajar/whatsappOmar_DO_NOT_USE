package com.facebook.redex;

import X.AnonymousClass1WE;

public class IDxNConsumerShape1S1000000_2_I1 implements AnonymousClass1WE {
    public String A00;
    public final int A01;

    public IDxNConsumerShape1S1000000_2_I1(String str, int i2) {
        this.A01 = i2;
        this.A00 = str;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x00a2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void accept(java.lang.Object r10) {
        /*
            r9 = this;
            int r1 = r9.A01
            java.lang.String r5 = r9.A00
            X.1S5 r10 = (X.AnonymousClass1S5) r10
            java.util.concurrent.ConcurrentHashMap r0 = r10.A03
            switch(r1) {
                case 0: goto L_0x0032;
                case 1: goto L_0x00d3;
                default: goto L_0x000b;
            }
        L_0x000b:
            java.lang.Object r6 = r0.get(r5)
            X.4OG r6 = (X.AnonymousClass4OG) r6
            if (r6 == 0) goto L_0x0031
            long r3 = r6.A05
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0031
            long r0 = android.os.SystemClock.uptimeMillis()
            r6.A05 = r0
            X.1dR r2 = r10.A02
            int r1 = r5.hashCode()
            java.lang.String r0 = "iq_send"
            r2.A01(r1, r0)
            java.lang.String r0 = "iq_processing"
        L_0x002e:
            r2.A02(r1, r0)
        L_0x0031:
            return
        L_0x0032:
            java.lang.Object r6 = r0.remove(r5)
            X.4OG r6 = (X.AnonymousClass4OG) r6
            if (r6 == 0) goto L_0x0031
            long r1 = r6.A03
            r7 = 0
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r0 != 0) goto L_0x0031
            long r0 = android.os.SystemClock.uptimeMillis()
            r6.A03 = r0
            X.3sJ r4 = new X.3sJ
            r4.<init>()
            int r0 = r6.A00
            long r0 = (long) r0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r4.A05 = r0
            long r2 = r6.A06
            long r0 = r6.A04
            long r2 = r2 - r0
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            r4.A03 = r0
            long r2 = r6.A05
            long r0 = r6.A06
            long r2 = r2 - r0
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            r4.A01 = r0
            long r2 = r6.A03
            long r0 = r6.A05
            long r2 = r2 - r0
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            r4.A02 = r0
            long r2 = r6.A03
            long r0 = r6.A04
            long r2 = r2 - r0
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            r4.A04 = r0
            java.lang.Integer r0 = r6.A01
            r3 = 1
            if (r0 != 0) goto L_0x00a8
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
        L_0x008b:
            r4.A00 = r0
        L_0x008d:
            X.0t9 r0 = r10.A01
            r0.A06(r4)
            X.1dR r3 = r10.A02
            int r2 = r5.hashCode()
            java.lang.String r0 = "iq_processing"
            r3.A01(r2, r0)
            java.lang.Integer r1 = r6.A01
            r0 = 2
            if (r1 == 0) goto L_0x00a4
            r0 = 87
        L_0x00a4:
            r3.A05(r2, r0)
            return
        L_0x00a8:
            int r2 = r0.intValue()
            r1 = 2
            r0 = 3
            if (r0 == r2) goto L_0x00b9
            if (r1 == r2) goto L_0x00b9
            if (r3 == r2) goto L_0x00b9
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x008b
        L_0x00b9:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r4.A00 = r0
            java.lang.Integer r0 = r6.A02
            if (r0 == 0) goto L_0x008d
            int r0 = r0.intValue()
            long r0 = (long) r0
            int r2 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r2 == 0) goto L_0x008d
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r4.A06 = r0
            goto L_0x008d
        L_0x00d3:
            java.lang.Object r6 = r0.get(r5)
            X.4OG r6 = (X.AnonymousClass4OG) r6
            if (r6 == 0) goto L_0x0031
            long r3 = r6.A06
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0031
            long r0 = android.os.SystemClock.uptimeMillis()
            r6.A06 = r0
            X.1dR r2 = r10.A02
            int r1 = r5.hashCode()
            java.lang.String r0 = "iq_queue"
            r2.A01(r1, r0)
            java.lang.String r0 = "iq_send"
            goto L_0x002e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.IDxNConsumerShape1S1000000_2_I1.accept(java.lang.Object):void");
    }
}
