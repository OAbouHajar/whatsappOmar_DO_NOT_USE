package X;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: X.05w  reason: invalid class name */
public class AnonymousClass05w extends AnonymousClass05u {
    public final Object A00 = new Object();
    public final ExecutorService A01 = Executors.newFixedThreadPool(4, new C012005x(this));
    public volatile Handler A02;

    public void A01(Runnable runnable) {
        this.A01.execute(runnable);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:16|17) */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r0 = new android.os.Handler(r7);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x0047 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A02(java.lang.Runnable r10) {
        /*
            r9 = this;
            android.os.Handler r0 = r9.A02
            if (r0 != 0) goto L_0x0050
            java.lang.Object r6 = r9.A00
            monitor-enter(r6)
            android.os.Handler r0 = r9.A02     // Catch:{ all -> 0x004d }
            if (r0 != 0) goto L_0x001b
            android.os.Looper r7 = android.os.Looper.getMainLooper()     // Catch:{ all -> 0x004d }
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x004d }
            r0 = 28
            if (r1 < r0) goto L_0x001d
            android.os.Handler r0 = android.os.Handler.createAsync(r7)     // Catch:{ all -> 0x004d }
        L_0x0019:
            r9.A02 = r0     // Catch:{ all -> 0x004d }
        L_0x001b:
            monitor-exit(r6)     // Catch:{ all -> 0x004d }
            goto L_0x0050
        L_0x001d:
            java.lang.Class<android.os.Handler> r2 = android.os.Handler.class
            r8 = 3
            java.lang.Class[] r1 = new java.lang.Class[r8]     // Catch:{ IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException -> 0x0047 }
            java.lang.Class<android.os.Looper> r0 = android.os.Looper.class
            r5 = 0
            r1[r5] = r0     // Catch:{ IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException -> 0x0047 }
            java.lang.Class<android.os.Handler$Callback> r0 = android.os.Handler.Callback.class
            r4 = 1
            r1[r4] = r0     // Catch:{ IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException -> 0x0047 }
            java.lang.Class r0 = java.lang.Boolean.TYPE     // Catch:{ IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException -> 0x0047 }
            r3 = 2
            r1[r3] = r0     // Catch:{ IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException -> 0x0047 }
            java.lang.reflect.Constructor r2 = r2.getDeclaredConstructor(r1)     // Catch:{ IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException -> 0x0047 }
            java.lang.Object[] r1 = new java.lang.Object[r8]     // Catch:{ IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException -> 0x0047 }
            r1[r5] = r7     // Catch:{ IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException -> 0x0047 }
            r0 = 0
            r1[r4] = r0     // Catch:{ IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException -> 0x0047 }
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch:{ IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException -> 0x0047 }
            r1[r3] = r0     // Catch:{ IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException -> 0x0047 }
            java.lang.Object r0 = r2.newInstance(r1)     // Catch:{ IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException -> 0x0047 }
            android.os.Handler r0 = (android.os.Handler) r0     // Catch:{ IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException -> 0x0047 }
            goto L_0x0019
        L_0x0047:
            android.os.Handler r0 = new android.os.Handler     // Catch:{ all -> 0x004d }
            r0.<init>(r7)     // Catch:{ all -> 0x004d }
            goto L_0x0019
        L_0x004d:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x004d }
            throw r0
        L_0x0050:
            android.os.Handler r0 = r9.A02
            r0.post(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass05w.A02(java.lang.Runnable):void");
    }

    public boolean A03() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }
}
