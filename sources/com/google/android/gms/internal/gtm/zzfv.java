package com.google.android.gms.internal.gtm;

import java.lang.reflect.Method;

public final class zzfv {
    public static final Method zza;
    public static final Method zzb;

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0037  */
    static {
        /*
            java.lang.Class<java.lang.String> r9 = java.lang.String.class
            int r7 = android.os.Build.VERSION.SDK_INT
            r4 = 6
            r5 = 0
            r6 = 24
            java.lang.String r3 = "JobSchedulerCompat"
            r8 = 0
            r0 = 4
            if (r7 < r6) goto L_0x0032
            java.lang.Class[] r2 = new java.lang.Class[r0]     // Catch:{ NoSuchMethodException -> 0x0027 }
            java.lang.Class<android.app.job.JobInfo> r0 = android.app.job.JobInfo.class
            X.C13690nt.A1L(r0, r9, r2)     // Catch:{ NoSuchMethodException -> 0x0027 }
            r1 = 2
            java.lang.Class r0 = java.lang.Integer.TYPE     // Catch:{ NoSuchMethodException -> 0x0027 }
            r2[r1] = r0     // Catch:{ NoSuchMethodException -> 0x0027 }
            r0 = 3
            r2[r0] = r9     // Catch:{ NoSuchMethodException -> 0x0027 }
            java.lang.Class<android.app.job.JobScheduler> r1 = android.app.job.JobScheduler.class
            java.lang.String r0 = "scheduleAsPackage"
            java.lang.reflect.Method r0 = r1.getDeclaredMethod(r0, r2)     // Catch:{ NoSuchMethodException -> 0x0027 }
            goto L_0x0033
        L_0x0027:
            boolean r0 = android.util.Log.isLoggable(r3, r4)
            if (r0 == 0) goto L_0x0032
            java.lang.String r0 = "No scheduleAsPackage method available, falling back to schedule"
            android.util.Log.e(r3, r0)
        L_0x0032:
            r0 = r8
        L_0x0033:
            zza = r0
            if (r7 < r6) goto L_0x004d
            java.lang.Class<android.os.UserHandle> r2 = android.os.UserHandle.class
            java.lang.String r1 = "myUserId"
            java.lang.Class[] r0 = new java.lang.Class[r5]     // Catch:{ NoSuchMethodException -> 0x0042 }
            java.lang.reflect.Method r8 = r2.getDeclaredMethod(r1, r0)     // Catch:{ NoSuchMethodException -> 0x0042 }
            goto L_0x004d
        L_0x0042:
            boolean r0 = android.util.Log.isLoggable(r3, r4)
            if (r0 == 0) goto L_0x004d
            java.lang.String r0 = "No myUserId method available"
            android.util.Log.e(r3, r0)
        L_0x004d:
            zzb = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzfv.<clinit>():void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0042  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int zza(android.content.Context r7, android.app.job.JobInfo r8, java.lang.String r9, java.lang.String r10) {
        /*
            java.lang.String r0 = "jobscheduler"
            java.lang.Object r5 = r7.getSystemService(r0)
            android.app.job.JobScheduler r5 = (android.app.job.JobScheduler) r5
            java.lang.reflect.Method r0 = zza
            if (r0 == 0) goto L_0x0067
            java.lang.String r0 = "android.permission.UPDATE_DEVICE_STATS"
            int r0 = r7.checkSelfPermission(r0)
            if (r0 != 0) goto L_0x0067
            java.lang.reflect.Method r2 = zzb
            r6 = 0
            if (r2 == 0) goto L_0x0039
            java.lang.Class<android.os.UserHandle> r1 = android.os.UserHandle.class
            java.lang.Object[] r0 = new java.lang.Object[r6]     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x002a }
            java.lang.Object r0 = r2.invoke(r1, r0)     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x002a }
            java.lang.Number r0 = (java.lang.Number) r0     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x002a }
            if (r0 == 0) goto L_0x0039
            int r7 = r0.intValue()     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x002a }
            goto L_0x003a
        L_0x002a:
            r2 = move-exception
            r0 = 6
            java.lang.String r1 = "JobSchedulerCompat"
            boolean r0 = android.util.Log.isLoggable(r1, r0)
            if (r0 == 0) goto L_0x0039
            java.lang.String r0 = "myUserId invocation illegal"
            android.util.Log.e(r1, r0, r2)
        L_0x0039:
            r7 = 0
        L_0x003a:
            java.lang.String r4 = "com.google.android.gms"
            java.lang.String r3 = "DispatchAlarm"
            java.lang.reflect.Method r2 = zza
            if (r2 == 0) goto L_0x0062
            r0 = 4
            java.lang.Object[] r1 = new java.lang.Object[r0]     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x005c }
            X.C13690nt.A1L(r8, r4, r1)     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x005c }
            r0 = 2
            X.AnonymousClass000.A1M(r1, r7, r0)     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x005c }
            r0 = 3
            r1[r0] = r3     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x005c }
            java.lang.Object r0 = r2.invoke(r5, r1)     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x005c }
            java.lang.Number r0 = (java.lang.Number) r0     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x005c }
            if (r0 == 0) goto L_0x0066
            int r6 = r0.intValue()     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x005c }
            return r6
        L_0x005c:
            r1 = move-exception
            java.lang.String r0 = "error calling scheduleAsPackage"
            android.util.Log.e(r3, r0, r1)
        L_0x0062:
            int r6 = r5.schedule(r8)
        L_0x0066:
            return r6
        L_0x0067:
            int r0 = r5.schedule(r8)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzfv.zza(android.content.Context, android.app.job.JobInfo, java.lang.String, java.lang.String):int");
    }
}
