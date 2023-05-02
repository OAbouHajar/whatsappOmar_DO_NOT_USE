package X;

import android.content.Context;

/* renamed from: X.4Yw  reason: invalid class name and case insensitive filesystem */
public class C87844Yw {
    public static Context A00;
    public static Boolean A01;

    /* JADX WARNING: Can't wrap try/catch for region: R(2:16|17) */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r0 = java.lang.Boolean.FALSE;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x0042 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized boolean A00(android.content.Context r4) {
        /*
            java.lang.Class<X.4Yw> r3 = X.C87844Yw.class
            monitor-enter(r3)
            android.content.Context r2 = r4.getApplicationContext()     // Catch:{ all -> 0x0047 }
            android.content.Context r1 = A00     // Catch:{ all -> 0x0047 }
            if (r1 == 0) goto L_0x0016
            java.lang.Boolean r0 = A01     // Catch:{ all -> 0x0047 }
            if (r0 == 0) goto L_0x0016
            if (r1 != r2) goto L_0x0016
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x0047 }
            goto L_0x0045
        L_0x0016:
            r0 = 0
            A01 = r0     // Catch:{ all -> 0x0047 }
            boolean r0 = X.C14320oy.A03()     // Catch:{ all -> 0x0047 }
            if (r0 == 0) goto L_0x0034
            android.content.pm.PackageManager r0 = r2.getPackageManager()     // Catch:{ all -> 0x0047 }
            boolean r0 = r0.isInstantApp()     // Catch:{ all -> 0x0047 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x0047 }
        L_0x002b:
            A01 = r0     // Catch:{ all -> 0x0047 }
        L_0x002d:
            A00 = r2     // Catch:{ all -> 0x0047 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x0047 }
            goto L_0x0045
        L_0x0034:
            java.lang.ClassLoader r1 = r4.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x0042 }
            java.lang.String r0 = "com.google.android.instantapps.supervisor.InstantAppsRuntime"
            r1.loadClass(r0)     // Catch:{ ClassNotFoundException -> 0x0042 }
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch:{ ClassNotFoundException -> 0x0042 }
            A01 = r0     // Catch:{ ClassNotFoundException -> 0x0042 }
            goto L_0x002d
        L_0x0042:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x0047 }
            goto L_0x002b
        L_0x0045:
            monitor-exit(r3)
            return r0
        L_0x0047:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C87844Yw.A00(android.content.Context):boolean");
    }
}
