package X;

import sun.misc.Unsafe;

/* renamed from: X.3d4  reason: invalid class name and case insensitive filesystem */
public final class C68213d4 extends AnonymousClass4X0 {
    public static final long A00;
    public static final long A01;
    public static final long A02;
    public static final long A03;
    public static final long A04;
    public static final Unsafe A05;

    /* JADX WARNING: Can't wrap try/catch for region: R(7:0|1|2|3|4|5|(3:6|7|8)) */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0063, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006f, code lost:
        throw new java.lang.RuntimeException("Could not initialize intrinsics", r0.getCause());
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0007 */
    static {
        /*
            java.lang.Class<X.4d8> r3 = X.C89904d8.class
            sun.misc.Unsafe r2 = sun.misc.Unsafe.getUnsafe()     // Catch:{ SecurityException -> 0x0007 }
            goto L_0x0012
        L_0x0007:
            X.56j r0 = new X.56j     // Catch:{ PrivilegedActionException -> 0x0063 }
            r0.<init>()     // Catch:{ PrivilegedActionException -> 0x0063 }
            java.lang.Object r2 = java.security.AccessController.doPrivileged(r0)     // Catch:{ PrivilegedActionException -> 0x0063 }
            sun.misc.Unsafe r2 = (sun.misc.Unsafe) r2     // Catch:{ PrivilegedActionException -> 0x0063 }
        L_0x0012:
            java.lang.Class<X.1bW> r4 = X.C29961bW.class
            java.lang.String r0 = "waiters"
            java.lang.reflect.Field r0 = r4.getDeclaredField(r0)     // Catch:{ Exception -> 0x0053 }
            long r0 = r2.objectFieldOffset(r0)     // Catch:{ Exception -> 0x0053 }
            A02 = r0     // Catch:{ Exception -> 0x0053 }
            java.lang.String r0 = "listeners"
            java.lang.reflect.Field r0 = r4.getDeclaredField(r0)     // Catch:{ Exception -> 0x0053 }
            long r0 = r2.objectFieldOffset(r0)     // Catch:{ Exception -> 0x0053 }
            A00 = r0     // Catch:{ Exception -> 0x0053 }
            java.lang.String r0 = "value"
            java.lang.reflect.Field r0 = r4.getDeclaredField(r0)     // Catch:{ Exception -> 0x0053 }
            long r0 = r2.objectFieldOffset(r0)     // Catch:{ Exception -> 0x0053 }
            A01 = r0     // Catch:{ Exception -> 0x0053 }
            java.lang.String r0 = "thread"
            java.lang.reflect.Field r0 = r3.getDeclaredField(r0)     // Catch:{ Exception -> 0x0053 }
            long r0 = r2.objectFieldOffset(r0)     // Catch:{ Exception -> 0x0053 }
            A04 = r0     // Catch:{ Exception -> 0x0053 }
            java.lang.String r0 = "next"
            java.lang.reflect.Field r0 = r3.getDeclaredField(r0)     // Catch:{ Exception -> 0x0053 }
            long r0 = r2.objectFieldOffset(r0)     // Catch:{ Exception -> 0x0053 }
            A03 = r0     // Catch:{ Exception -> 0x0053 }
            A05 = r2     // Catch:{ Exception -> 0x0053 }
            return
        L_0x0053:
            r1 = move-exception
            boolean r0 = r1 instanceof java.lang.RuntimeException
            if (r0 != 0) goto L_0x0062
            boolean r0 = r1 instanceof java.lang.Error
            if (r0 != 0) goto L_0x0062
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            r2.<init>(r1)
            throw r2
        L_0x0062:
            throw r1
        L_0x0063:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            java.lang.String r0 = "Could not initialize intrinsics"
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            r2.<init>(r0, r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C68213d4.<clinit>():void");
    }

    public void A00(C89904d8 r4, C89904d8 r5) {
        A05.putObject(r4, A03, r5);
    }

    public void A01(C89904d8 r4, Thread thread) {
        A05.putObject(r4, A04, thread);
    }

    public boolean A02(C89914d9 r8, C89914d9 r9, C29961bW r10) {
        Unsafe unsafe = A05;
        long j2 = A00;
        do {
            if (unsafe.compareAndSwapObject(r10, j2, r8, r9)) {
                return true;
            }
        } while (unsafe.getObject(r10, j2) == r8);
        return false;
    }

    public boolean A03(C89904d8 r8, C89904d8 r9, C29961bW r10) {
        Unsafe unsafe = A05;
        long j2 = A02;
        do {
            if (unsafe.compareAndSwapObject(r10, j2, r8, r9)) {
                return true;
            }
        } while (unsafe.getObject(r10, j2) == r8);
        return false;
    }

    public boolean A04(C29961bW r8, Object obj, Object obj2) {
        Unsafe unsafe = A05;
        long j2 = A01;
        while (!unsafe.compareAndSwapObject(r8, j2, (Object) null, obj2)) {
            if (unsafe.getObject(r8, j2) != null) {
                return false;
            }
        }
        return true;
    }
}
