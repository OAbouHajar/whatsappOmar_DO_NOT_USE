package X;

/* renamed from: X.3US  reason: invalid class name */
public final class AnonymousClass3US extends C96304o7 {
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001e, code lost:
        if (r0 == 805306368) goto L_0x0020;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00a1 A[LOOP:4: B:23:0x00a1->B:24:0x00a3, LOOP_START, PHI: r4 
      PHI: (r4v1 int) = (r4v0 int), (r4v2 int) binds: [B:8:0x002a, B:24:0x00a3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void AbH(java.nio.ByteBuffer r10) {
        /*
            r9 = this;
            int r4 = r10.position()
            int r3 = r10.limit()
            int r2 = r3 - r4
            X.4b0 r0 = r9.A00
            int r0 = r0.A02
            r8 = 805306368(0x30000000, float:4.656613E-10)
            r7 = 536870912(0x20000000, float:1.0842022E-19)
            r6 = 268435456(0x10000000, float:2.5243549E-29)
            r5 = 4
            r1 = 3
            if (r0 == r1) goto L_0x004d
            if (r0 == r5) goto L_0x0020
            if (r0 == r6) goto L_0x0022
            if (r0 == r7) goto L_0x004b
            if (r0 != r8) goto L_0x00c1
        L_0x0020:
            int r2 = r2 >> 1
        L_0x0022:
            java.nio.ByteBuffer r2 = r9.A00(r2)
            X.4b0 r0 = r9.A00
            int r0 = r0.A02
            if (r0 == r1) goto L_0x00a1
            if (r0 == r5) goto L_0x007c
            if (r0 == r6) goto L_0x0067
            if (r0 == r7) goto L_0x0050
            if (r0 != r8) goto L_0x00c1
        L_0x0034:
            if (r4 >= r3) goto L_0x00b6
            int r0 = r4 + 2
            byte r0 = r10.get(r0)
            r2.put(r0)
            int r0 = r4 + 3
            byte r0 = r10.get(r0)
            r2.put(r0)
            int r4 = r4 + 4
            goto L_0x0034
        L_0x004b:
            int r2 = r2 / 3
        L_0x004d:
            int r2 = r2 << 1
            goto L_0x0022
        L_0x0050:
            if (r4 >= r3) goto L_0x00b6
            int r0 = r4 + 1
            byte r0 = r10.get(r0)
            r2.put(r0)
            int r0 = r4 + 2
            byte r0 = r10.get(r0)
            r2.put(r0)
            int r4 = r4 + 3
            goto L_0x0050
        L_0x0067:
            if (r4 >= r3) goto L_0x00b6
            int r0 = r4 + 1
            byte r0 = r10.get(r0)
            r2.put(r0)
            byte r0 = r10.get(r4)
            r2.put(r0)
            int r4 = r4 + 2
            goto L_0x0067
        L_0x007c:
            if (r4 >= r3) goto L_0x00b6
            float r5 = r10.getFloat(r4)
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0 = 1065353216(0x3f800000, float:1.0)
            float r1 = X.AnonymousClass000.A02(r5, r0, r1)
            r0 = 1191181824(0x46fffe00, float:32767.0)
            float r1 = r1 * r0
            int r0 = (int) r1
            short r1 = (short) r0
            r0 = r1 & 255(0xff, float:3.57E-43)
            byte r0 = (byte) r0
            r2.put(r0)
            int r0 = r1 >> 8
            r0 = r0 & 255(0xff, float:3.57E-43)
            byte r0 = (byte) r0
            r2.put(r0)
            int r4 = r4 + 4
            goto L_0x007c
        L_0x00a1:
            if (r4 >= r3) goto L_0x00b6
            r0 = 0
            r2.put(r0)
            byte r0 = r10.get(r4)
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r0 + -128
            byte r0 = (byte) r0
            r2.put(r0)
            int r4 = r4 + 1
            goto L_0x00a1
        L_0x00b6:
            int r0 = r10.limit()
            r10.position(r0)
            r2.flip()
            return
        L_0x00c1:
            java.lang.IllegalStateException r0 = X.AnonymousClass3K4.A0V()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3US.AbH(java.nio.ByteBuffer):void");
    }
}
