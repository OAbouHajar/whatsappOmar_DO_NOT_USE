package X;

import android.os.Handler;
import android.os.Looper;

/* renamed from: X.3Bg  reason: invalid class name and case insensitive filesystem */
public final class C62003Bg {
    public static volatile Handler A00;
    public static volatile Handler A01;

    public static Handler A00() {
        if (A01 == null) {
            synchronized (C62003Bg.class) {
                if (A01 == null) {
                    A01 = AnonymousClass000.A0L();
                }
            }
        }
        return A01;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0015, code lost:
        if (r2 == false) goto L_0x0017;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Object A01(java.util.concurrent.Future r7, int r8) {
        /*
            java.lang.String r3 = ", "
            java.lang.String r6 = "Unable to restore priority: "
            int r0 = android.os.Process.myTid()
            r5 = 1
            r4 = 0
            r2 = 0
            if (r8 == r0) goto L_0x000e
            r2 = 1
        L_0x000e:
            boolean r0 = r7.isDone()
            if (r0 != 0) goto L_0x0017
            r1 = 1
            if (r2 != 0) goto L_0x0018
        L_0x0017:
            r1 = 0
        L_0x0018:
            boolean r0 = A03()
            if (r0 == 0) goto L_0x0035
            if (r1 == 0) goto L_0x0035
            int r0 = android.os.Process.myTid()
            int r0 = android.os.Process.getThreadPriority(r0)
            int r4 = android.os.Process.getThreadPriority(r8)
        L_0x002c:
            if (r0 >= r4) goto L_0x0036
            android.os.Process.setThreadPriority(r8, r0)     // Catch:{ SecurityException -> 0x0032 }
            goto L_0x0036
        L_0x0032:
            int r0 = r0 + 1
            goto L_0x002c
        L_0x0035:
            r5 = 0
        L_0x0036:
            java.lang.Object r0 = r7.get()     // Catch:{ ExecutionException -> 0x0056, InterruptedException | CancellationException -> 0x0054 }
            if (r5 == 0) goto L_0x0053
            android.os.Process.setThreadPriority(r8, r4)     // Catch:{ IllegalArgumentException | SecurityException -> 0x0040 }
            goto L_0x0052
        L_0x0040:
            r2 = move-exception
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0q(r6)
            r0.append(r8)
            java.lang.String r1 = X.C13680ns.A0i(r3, r0, r4)
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1, r2)
            throw r0
        L_0x0052:
            return r0
        L_0x0053:
            return r0
        L_0x0054:
            r2 = move-exception
            goto L_0x006c
        L_0x0056:
            r2 = move-exception
            java.lang.Throwable r1 = r2.getCause()     // Catch:{ all -> 0x0076 }
            boolean r0 = r1 instanceof java.lang.RuntimeException     // Catch:{ all -> 0x0076 }
            if (r0 == 0) goto L_0x0062
            java.lang.RuntimeException r1 = (java.lang.RuntimeException) r1     // Catch:{ all -> 0x0076 }
            goto L_0x0075
        L_0x0062:
            java.lang.String r0 = r2.getMessage()     // Catch:{ all -> 0x0076 }
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ all -> 0x0076 }
            r1.<init>(r0, r2)     // Catch:{ all -> 0x0076 }
            goto L_0x0075
        L_0x006c:
            java.lang.String r0 = r2.getMessage()     // Catch:{ all -> 0x0076 }
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ all -> 0x0076 }
            r1.<init>(r0, r2)     // Catch:{ all -> 0x0076 }
        L_0x0075:
            throw r1     // Catch:{ all -> 0x0076 }
        L_0x0076:
            r0 = move-exception
            if (r5 == 0) goto L_0x008f
            android.os.Process.setThreadPriority(r8, r4)     // Catch:{ IllegalArgumentException | SecurityException -> 0x007d }
            throw r0
        L_0x007d:
            r2 = move-exception
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0q(r6)
            r0.append(r8)
            java.lang.String r1 = X.C13680ns.A0i(r3, r0, r4)
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1, r2)
            throw r0
        L_0x008f:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C62003Bg.A01(java.util.concurrent.Future, int):java.lang.Object");
    }

    public static void A02(String str) {
        if (!AnonymousClass48i.A00 && !A03()) {
            throw AnonymousClass000.A0V(str);
        }
    }

    public static boolean A03() {
        return AnonymousClass000.A1Y(Looper.getMainLooper().getThread(), Thread.currentThread());
    }
}
