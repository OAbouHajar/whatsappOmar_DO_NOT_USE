package com.google.protobuf;

import sun.misc.Unsafe;

public final class UnsafeUtil {
    public static final long A00;
    public static final Unsafe A01;
    public static final boolean A02;
    public static final boolean A03;

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0068 A[SYNTHETIC, Splitter:B:12:0x0068] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    static {
        /*
            X.56k r0 = new X.56k     // Catch:{ all -> 0x000c }
            r0.<init>()     // Catch:{ all -> 0x000c }
            java.lang.Object r0 = java.security.AccessController.doPrivileged(r0)     // Catch:{ all -> 0x000c }
            sun.misc.Unsafe r0 = (sun.misc.Unsafe) r0     // Catch:{ all -> 0x000c }
            goto L_0x000d
        L_0x000c:
            r0 = 0
        L_0x000d:
            A01 = r0
            java.lang.String r8 = "getLong"
            r6 = 1
            r10 = 0
            if (r0 == 0) goto L_0x005e
            java.lang.Class r5 = r0.getClass()     // Catch:{ all -> 0x005e }
            java.lang.String r2 = "objectFieldOffset"
            java.lang.Class[] r1 = new java.lang.Class[r6]     // Catch:{ all -> 0x005e }
            java.lang.Class<java.lang.reflect.Field> r0 = java.lang.reflect.Field.class
            r1[r10] = r0     // Catch:{ all -> 0x005e }
            r5.getMethod(r2, r1)     // Catch:{ all -> 0x005e }
            java.lang.String r1 = "getByte"
            java.lang.Class[] r0 = new java.lang.Class[r6]     // Catch:{ all -> 0x005e }
            java.lang.Class r4 = java.lang.Long.TYPE     // Catch:{ all -> 0x005e }
            r0[r10] = r4     // Catch:{ all -> 0x005e }
            r5.getMethod(r1, r0)     // Catch:{ all -> 0x005e }
            r3 = 2
            java.lang.Class[] r1 = new java.lang.Class[r3]     // Catch:{ all -> 0x005e }
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            r1[r10] = r0     // Catch:{ all -> 0x005e }
            r1[r6] = r4     // Catch:{ all -> 0x005e }
            r5.getMethod(r8, r1)     // Catch:{ all -> 0x005e }
            java.lang.String r2 = "putByte"
            java.lang.Class[] r1 = new java.lang.Class[r3]     // Catch:{ all -> 0x005e }
            r1[r10] = r4     // Catch:{ all -> 0x005e }
            java.lang.Class r0 = java.lang.Byte.TYPE     // Catch:{ all -> 0x005e }
            r1[r6] = r0     // Catch:{ all -> 0x005e }
            r5.getMethod(r2, r1)     // Catch:{ all -> 0x005e }
            java.lang.Class[] r0 = new java.lang.Class[r6]     // Catch:{ all -> 0x005e }
            r0[r10] = r4     // Catch:{ all -> 0x005e }
            r5.getMethod(r8, r0)     // Catch:{ all -> 0x005e }
            java.lang.String r1 = "copyMemory"
            r0 = 3
            java.lang.Class[] r0 = new java.lang.Class[r0]     // Catch:{ all -> 0x005e }
            r0[r10] = r4     // Catch:{ all -> 0x005e }
            r0[r6] = r4     // Catch:{ all -> 0x005e }
            r0[r3] = r4     // Catch:{ all -> 0x005e }
            r5.getMethod(r1, r0)     // Catch:{ all -> 0x005e }
            goto L_0x005f
        L_0x005e:
            r6 = 0
        L_0x005f:
            A03 = r6
            java.lang.Class<java.lang.Object> r9 = java.lang.Object.class
            sun.misc.Unsafe r0 = A01
            r7 = 1
            if (r0 == 0) goto L_0x00ac
            java.lang.Class r6 = r0.getClass()     // Catch:{ all -> 0x00ac }
            java.lang.String r2 = "arrayBaseOffset"
            java.lang.Class[] r1 = new java.lang.Class[r7]     // Catch:{ all -> 0x00ac }
            java.lang.Class<java.lang.Class> r0 = java.lang.Class.class
            r1[r10] = r0     // Catch:{ all -> 0x00ac }
            r6.getMethod(r2, r1)     // Catch:{ all -> 0x00ac }
            java.lang.String r1 = "getByte"
            r5 = 2
            java.lang.Class[] r0 = new java.lang.Class[r5]     // Catch:{ all -> 0x00ac }
            r0[r10] = r9     // Catch:{ all -> 0x00ac }
            java.lang.Class r4 = java.lang.Long.TYPE     // Catch:{ all -> 0x00ac }
            r0[r7] = r4     // Catch:{ all -> 0x00ac }
            r6.getMethod(r1, r0)     // Catch:{ all -> 0x00ac }
            java.lang.String r2 = "putByte"
            r3 = 3
            java.lang.Class[] r1 = X.AnonymousClass3K3.A1Z(r4, r3)     // Catch:{ all -> 0x00ac }
            java.lang.Class r0 = java.lang.Byte.TYPE     // Catch:{ all -> 0x00ac }
            r1[r5] = r0     // Catch:{ all -> 0x00ac }
            r6.getMethod(r2, r1)     // Catch:{ all -> 0x00ac }
            java.lang.Class[] r0 = X.AnonymousClass3K3.A1Z(r4, r5)     // Catch:{ all -> 0x00ac }
            r6.getMethod(r8, r0)     // Catch:{ all -> 0x00ac }
            java.lang.String r2 = "copyMemory"
            r0 = 5
            java.lang.Class[] r1 = X.AnonymousClass3K3.A1Z(r4, r0)     // Catch:{ all -> 0x00ac }
            r1[r5] = r9     // Catch:{ all -> 0x00ac }
            r1[r3] = r4     // Catch:{ all -> 0x00ac }
            r0 = 4
            r1[r0] = r4     // Catch:{ all -> 0x00ac }
            r6.getMethod(r2, r1)     // Catch:{ all -> 0x00ac }
            goto L_0x00ad
        L_0x00ac:
            r7 = 0
        L_0x00ad:
            A02 = r7
            if (r7 == 0) goto L_0x00c1
            sun.misc.Unsafe r1 = A01
            java.lang.Class<byte[]> r0 = byte[].class
            int r0 = r1.arrayBaseOffset(r0)
        L_0x00b9:
            long r0 = (long) r0
            A00 = r0
            java.lang.Class<java.nio.Buffer> r1 = java.nio.Buffer.class
            java.lang.String r0 = "address"
            goto L_0x00c3
        L_0x00c1:
            r0 = -1
            goto L_0x00b9
        L_0x00c3:
            java.lang.reflect.Field r1 = r1.getDeclaredField(r0)     // Catch:{ all -> 0x00d2 }
            r0 = 1
            r1.setAccessible(r0)     // Catch:{ all -> 0x00d2 }
            sun.misc.Unsafe r0 = A01
            if (r0 == 0) goto L_0x00d2
            r0.objectFieldOffset(r1)
        L_0x00d2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.UnsafeUtil.<clinit>():void");
    }

    public static void A00(byte[] bArr, byte b2, long j2) {
        A01.putByte(bArr, j2, b2);
    }
}
