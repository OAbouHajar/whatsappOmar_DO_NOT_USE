package X;

import java.util.HashMap;

/* renamed from: X.27d  reason: invalid class name and case insensitive filesystem */
public class C451227d {
    public final C16440t3 A00;
    public final C16490t9 A01;
    public final HashMap A02 = new HashMap();

    public C451227d(C16440t3 r2, C16490t9 r3) {
        this.A01 = r3;
        this.A00 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000b, code lost:
        if (r0.A03 == false) goto L_0x000d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A00(X.C451127c r4, X.C451027b r5) {
        /*
            X.27e r3 = r4.A00
            X.27g r0 = r3.A01
            r1 = 0
            if (r0 == 0) goto L_0x0086
            r2 = 1
            boolean r0 = r0.A03
            r1 = 1
            if (r0 != 0) goto L_0x0086
        L_0x000d:
            X.27g r0 = r3.A07
            if (r0 == 0) goto L_0x0019
            r1 = r1 | 2
            boolean r0 = r0.A03
            if (r0 != 0) goto L_0x0019
            r2 = r2 | 2
        L_0x0019:
            X.27g r0 = r3.A08
            if (r0 == 0) goto L_0x0025
            r1 = r1 | 4
            boolean r0 = r0.A03
            if (r0 != 0) goto L_0x0025
            r2 = r2 | 4
        L_0x0025:
            X.27g r0 = r3.A06
            if (r0 == 0) goto L_0x0031
            r1 = r1 | 8
            boolean r0 = r0.A03
            if (r0 != 0) goto L_0x0031
            r2 = r2 | 8
        L_0x0031:
            X.27g r0 = r3.A00
            if (r0 == 0) goto L_0x003d
            r1 = r1 | 16
            boolean r0 = r0.A03
            if (r0 != 0) goto L_0x003d
            r2 = r2 | 16
        L_0x003d:
            X.27g r0 = r3.A02
            if (r0 == 0) goto L_0x0049
            r1 = r1 | 32
            boolean r0 = r0.A03
            if (r0 != 0) goto L_0x0049
            r2 = r2 | 32
        L_0x0049:
            X.27g r0 = r3.A05
            if (r0 == 0) goto L_0x0055
            r1 = r1 | 64
            boolean r0 = r0.A03
            if (r0 != 0) goto L_0x0055
            r2 = r2 | 64
        L_0x0055:
            X.27g r0 = r3.A03
            if (r0 == 0) goto L_0x0061
            r1 = r1 | 128(0x80, float:1.794E-43)
            boolean r0 = r0.A03
            if (r0 != 0) goto L_0x0061
            r2 = r2 | 128(0x80, float:1.794E-43)
        L_0x0061:
            X.27g r0 = r3.A04
            if (r0 == 0) goto L_0x006d
            r1 = r1 | 256(0x100, float:3.59E-43)
            boolean r0 = r0.A03
            if (r0 != 0) goto L_0x006d
            r2 = r2 | 256(0x100, float:3.59E-43)
        L_0x006d:
            long r0 = (long) r1
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r5.A0D = r0
            long r0 = (long) r2
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r5.A0A = r0
            X.27a[] r0 = r4.A01
            int r0 = r0.length
            long r0 = (long) r0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r5.A0G = r0
            return
        L_0x0086:
            r2 = 0
            goto L_0x000d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C451227d.A00(X.27c, X.27b):void");
    }

    public final void A01(C451027b r6) {
        HashMap hashMap = this.A02;
        if (hashMap.containsKey(r6)) {
            r6.A0B = Long.valueOf(this.A00.A00() - ((Number) hashMap.get(r6)).longValue());
            hashMap.remove(r6);
            return;
        }
        r6.A0B = -1L;
    }
}
