package X;

import com.google.firebase.iid.FirebaseInstanceId;

/* renamed from: X.0og  reason: invalid class name and case insensitive filesystem */
public final class C14140og {
    public C15510rF A00;
    public Boolean A01;
    public boolean A02;
    public boolean A03;
    public final C13910oH A04;
    public final /* synthetic */ FirebaseInstanceId A05;

    public C14140og(C13910oH r1, FirebaseInstanceId firebaseInstanceId) {
        this.A05 = firebaseInstanceId;
        this.A04 = r1;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(12:5|6|7|8|9|(6:14|15|(1:17)(4:19|20|(1:28)|29)|18|(3:32|33|(2:35|98))|47)|13|15|(0)(0)|18|(0)|47) */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00e0, code lost:
        if (((X.C14070oZ) r0.A03.get()).A03.get() == false) goto L_0x00e2;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x000c */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x005c A[SYNTHETIC, Splitter:B:19:0x005c] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0087 A[SYNTHETIC, Splitter:B:32:0x0087] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean A00() {
        /*
            r7 = this;
            r6 = r7
            monitor-enter(r6)
            boolean r0 = r7.A03     // Catch:{ all -> 0x00e5 }
            if (r0 != 0) goto L_0x00bd
            java.lang.String r0 = "com.google.firebase.messaging.FirebaseMessaging"
            java.lang.Class.forName(r0)     // Catch:{ ClassNotFoundException -> 0x000c }
            goto L_0x0032
        L_0x000c:
            com.google.firebase.iid.FirebaseInstanceId r0 = r7.A05     // Catch:{ all -> 0x00e5 }
            X.0nx r0 = r0.A01     // Catch:{ all -> 0x00e5 }
            r0.A02()     // Catch:{ all -> 0x00e5 }
            android.content.Context r1 = r0.A00     // Catch:{ all -> 0x00e5 }
            java.lang.String r0 = "com.google.firebase.MESSAGING_EVENT"
            android.content.Intent r2 = new android.content.Intent     // Catch:{ all -> 0x00e5 }
            r2.<init>(r0)     // Catch:{ all -> 0x00e5 }
            java.lang.String r0 = r1.getPackageName()     // Catch:{ all -> 0x00e5 }
            r2.setPackage(r0)     // Catch:{ all -> 0x00e5 }
            android.content.pm.PackageManager r1 = r1.getPackageManager()     // Catch:{ all -> 0x00e5 }
            r0 = 0
            android.content.pm.ResolveInfo r0 = r1.resolveService(r2, r0)     // Catch:{ all -> 0x00e5 }
            if (r0 == 0) goto L_0x0034
            android.content.pm.ServiceInfo r0 = r0.serviceInfo     // Catch:{ all -> 0x00e5 }
            if (r0 == 0) goto L_0x0034
        L_0x0032:
            r0 = 1
            goto L_0x0035
        L_0x0034:
            r0 = 0
        L_0x0035:
            r7.A02 = r0     // Catch:{ all -> 0x00e5 }
            java.lang.String r5 = "firebase_messaging_auto_init_enabled"
            com.google.firebase.iid.FirebaseInstanceId r0 = r7.A05     // Catch:{ all -> 0x00e5 }
            X.0nx r0 = r0.A01     // Catch:{ all -> 0x00e5 }
            r0.A02()     // Catch:{ all -> 0x00e5 }
            android.content.Context r4 = r0.A00     // Catch:{ all -> 0x00e5 }
            java.lang.String r0 = "com.google.firebase.messaging"
            r3 = 0
            android.content.SharedPreferences r2 = r4.getSharedPreferences(r0, r3)     // Catch:{ all -> 0x00e5 }
            java.lang.String r1 = "auto_init"
            boolean r0 = r2.contains(r1)     // Catch:{ all -> 0x00e5 }
            if (r0 == 0) goto L_0x005c
            boolean r0 = r2.getBoolean(r1, r3)     // Catch:{ all -> 0x00e5 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x00e5 }
        L_0x0059:
            r7.A01 = r0     // Catch:{ all -> 0x00e5 }
            goto L_0x0085
        L_0x005c:
            android.content.pm.PackageManager r2 = r4.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0083 }
            if (r2 == 0) goto L_0x0083
            java.lang.String r1 = r4.getPackageName()     // Catch:{ NameNotFoundException -> 0x0083 }
            r0 = 128(0x80, float:1.794E-43)
            android.content.pm.ApplicationInfo r1 = r2.getApplicationInfo(r1, r0)     // Catch:{ NameNotFoundException -> 0x0083 }
            if (r1 == 0) goto L_0x0083
            android.os.Bundle r0 = r1.metaData     // Catch:{ NameNotFoundException -> 0x0083 }
            if (r0 == 0) goto L_0x0083
            boolean r0 = r0.containsKey(r5)     // Catch:{ NameNotFoundException -> 0x0083 }
            if (r0 == 0) goto L_0x0083
            android.os.Bundle r0 = r1.metaData     // Catch:{ NameNotFoundException -> 0x0083 }
            boolean r0 = r0.getBoolean(r5)     // Catch:{ NameNotFoundException -> 0x0083 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ NameNotFoundException -> 0x0083 }
            goto L_0x0059
        L_0x0083:
            r0 = 0
            goto L_0x0059
        L_0x0085:
            if (r0 != 0) goto L_0x00ba
            boolean r0 = r7.A02     // Catch:{ all -> 0x00e5 }
            if (r0 == 0) goto L_0x00ba
            X.0rF r5 = new X.0rF     // Catch:{ all -> 0x00e5 }
            r5.<init>(r7)     // Catch:{ all -> 0x00e5 }
            r7.A00 = r5     // Catch:{ all -> 0x00e5 }
            X.0oH r4 = r7.A04     // Catch:{ all -> 0x00e5 }
            java.lang.Class<X.0sY> r3 = X.C16160sY.class
            java.util.concurrent.Executor r2 = r4.A02     // Catch:{ all -> 0x00e5 }
            monitor-enter(r4)     // Catch:{ all -> 0x00e5 }
            X.C13710nw.A01(r2)     // Catch:{ all -> 0x00b6 }
            java.util.Map r1 = r4.A01     // Catch:{ all -> 0x00b6 }
            boolean r0 = r1.containsKey(r3)     // Catch:{ all -> 0x00b6 }
            if (r0 != 0) goto L_0x00ac
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap     // Catch:{ all -> 0x00b6 }
            r0.<init>()     // Catch:{ all -> 0x00b6 }
            r1.put(r3, r0)     // Catch:{ all -> 0x00b6 }
        L_0x00ac:
            java.lang.Object r0 = r1.get(r3)     // Catch:{ all -> 0x00b6 }
            java.util.concurrent.ConcurrentHashMap r0 = (java.util.concurrent.ConcurrentHashMap) r0     // Catch:{ all -> 0x00b6 }
            r0.put(r5, r2)     // Catch:{ all -> 0x00b6 }
            goto L_0x00b9
        L_0x00b6:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x00e5 }
            throw r0     // Catch:{ all -> 0x00e5 }
        L_0x00b9:
            monitor-exit(r4)     // Catch:{ all -> 0x00e5 }
        L_0x00ba:
            r0 = 1
            r7.A03 = r0     // Catch:{ all -> 0x00e5 }
        L_0x00bd:
            java.lang.Boolean r0 = r7.A01     // Catch:{ all -> 0x00e7 }
            if (r0 == 0) goto L_0x00c6
            boolean r1 = r0.booleanValue()     // Catch:{ all -> 0x00e7 }
            goto L_0x00e3
        L_0x00c6:
            boolean r0 = r7.A02     // Catch:{ all -> 0x00e7 }
            if (r0 == 0) goto L_0x00e2
            com.google.firebase.iid.FirebaseInstanceId r0 = r7.A05     // Catch:{ all -> 0x00e7 }
            X.0nx r0 = r0.A01     // Catch:{ all -> 0x00e7 }
            r0.A02()     // Catch:{ all -> 0x00e7 }
            X.0oB r0 = r0.A03     // Catch:{ all -> 0x00e7 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x00e7 }
            X.0oZ r0 = (X.C14070oZ) r0     // Catch:{ all -> 0x00e7 }
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.A03     // Catch:{ all -> 0x00e7 }
            boolean r0 = r0.get()     // Catch:{ all -> 0x00e7 }
            r1 = 1
            if (r0 != 0) goto L_0x00e3
        L_0x00e2:
            r1 = 0
        L_0x00e3:
            monitor-exit(r6)
            return r1
        L_0x00e5:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x00e7 }
        L_0x00e7:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14140og.A00():boolean");
    }
}
