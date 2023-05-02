package X;

/* renamed from: X.38H  reason: invalid class name */
public final class AnonymousClass38H {
    public static final AnonymousClass5GI A00;

    /* JADX WARNING: type inference failed for: r2v2, types: [java.util.List, java.lang.Iterable] */
    /* JADX WARNING: type inference failed for: r2v7, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r2v11 */
    /* JADX WARNING: type inference failed for: r2v12 */
    /* JADX WARNING: type inference failed for: r2v13 */
    /* JADX WARNING: Can't wrap try/catch for region: R(2:39|40) */
    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        r2 = r4.A01(r5.getClassLoader());
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x00bc */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    static {
        /*
            java.lang.String r0 = "kotlinx.coroutines.fast.service.loader"
            r1 = 1
            java.lang.String r0 = java.lang.System.getProperty(r0)     // Catch:{ SecurityException -> 0x000d }
            if (r0 == 0) goto L_0x000d
            boolean r1 = java.lang.Boolean.parseBoolean(r0)
        L_0x000d:
            java.lang.Class<kotlinx.coroutines.android.AndroidDispatcherFactory> r5 = kotlinx.coroutines.android.AndroidDispatcherFactory.class
            r3 = 0
            if (r1 == 0) goto L_0x0013
            goto L_0x0036
        L_0x0013:
            java.lang.ClassLoader r0 = r5.getClassLoader()     // Catch:{ all -> 0x00d3 }
            java.util.ServiceLoader r0 = java.util.ServiceLoader.load(r5, r0)     // Catch:{ all -> 0x00d3 }
            java.util.Iterator r2 = r0.iterator()     // Catch:{ all -> 0x00d3 }
            r0 = 0
            X.C18450wi.A0H(r2, r0)     // Catch:{ all -> 0x00d3 }
            X.22F r1 = new X.22F     // Catch:{ all -> 0x00d3 }
            r1.<init>(r2)     // Catch:{ all -> 0x00d3 }
            X.22H r0 = new X.22H     // Catch:{ all -> 0x00d3 }
            r0.<init>(r1)     // Catch:{ all -> 0x00d3 }
            java.util.List r0 = X.C11490ir.A02(r0)     // Catch:{ all -> 0x00d3 }
            java.util.List r2 = X.AnonymousClass1JA.A0Q(r0)     // Catch:{ all -> 0x00d3 }
            goto L_0x0047
        L_0x0036:
            X.3AF r4 = new X.3AF     // Catch:{ all -> 0x00d3 }
            r4.<init>()     // Catch:{ all -> 0x00d3 }
            boolean r0 = X.AnonymousClass4AB.A00     // Catch:{ all -> 0x00d3 }
            if (r0 != 0) goto L_0x0070
            java.lang.ClassLoader r0 = r5.getClassLoader()     // Catch:{ all -> 0x00d3 }
            java.util.List r2 = r4.A01(r0)     // Catch:{ all -> 0x00d3 }
        L_0x0047:
            java.util.Iterator r1 = r2.iterator()     // Catch:{ all -> 0x00d3 }
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x00d3 }
            if (r0 == 0) goto L_0x005b
            java.lang.Object r3 = r1.next()     // Catch:{ all -> 0x00d3 }
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x00d3 }
            if (r0 != 0) goto L_0x0066
        L_0x005b:
            kotlinx.coroutines.android.AndroidDispatcherFactory r3 = (kotlinx.coroutines.android.AndroidDispatcherFactory) r3     // Catch:{ all -> 0x00d3 }
            if (r3 != 0) goto L_0x00c5
            r0 = 0
            X.5Ge r2 = new X.5Ge     // Catch:{ all -> 0x00d3 }
            r2.<init>(r0, r0)     // Catch:{ all -> 0x00d3 }
            goto L_0x00da
        L_0x0066:
            r1.next()     // Catch:{ all -> 0x00d3 }
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x00d3 }
            if (r0 != 0) goto L_0x0066
            goto L_0x005b
        L_0x0070:
            r0 = 2
            java.util.ArrayList r2 = X.C13690nt.A0i(r0)     // Catch:{ all -> 0x00bc }
            java.lang.String r1 = "kotlinx.coroutines.android.AndroidDispatcherFactory"
            r6 = 0
            r8 = 1
            r7 = 0
            java.lang.ClassLoader r0 = r5.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x0099 }
            java.lang.Class r1 = java.lang.Class.forName(r1, r8, r0)     // Catch:{ ClassNotFoundException -> 0x0099 }
            java.lang.Class[] r0 = new java.lang.Class[r7]     // Catch:{ ClassNotFoundException -> 0x0099 }
            java.lang.reflect.Constructor r1 = r1.getDeclaredConstructor(r0)     // Catch:{ ClassNotFoundException -> 0x0099 }
            java.lang.Object[] r0 = new java.lang.Object[r7]     // Catch:{ ClassNotFoundException -> 0x0099 }
            java.lang.Object r0 = r1.newInstance(r0)     // Catch:{ ClassNotFoundException -> 0x0099 }
            java.lang.Object r0 = r5.cast(r0)     // Catch:{ ClassNotFoundException -> 0x0099 }
            kotlinx.coroutines.android.AndroidDispatcherFactory r0 = (kotlinx.coroutines.android.AndroidDispatcherFactory) r0     // Catch:{ ClassNotFoundException -> 0x0099 }
            if (r0 == 0) goto L_0x0099
            r2.add(r0)     // Catch:{ all -> 0x00bc }
        L_0x0099:
            java.lang.String r1 = "kotlinx.coroutines.test.internal.TestMainDispatcherFactory"
            java.lang.ClassLoader r0 = r5.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x00b6 }
            java.lang.Class r1 = java.lang.Class.forName(r1, r8, r0)     // Catch:{ ClassNotFoundException -> 0x00b6 }
            java.lang.Class[] r0 = new java.lang.Class[r7]     // Catch:{ ClassNotFoundException -> 0x00b6 }
            java.lang.reflect.Constructor r1 = r1.getDeclaredConstructor(r0)     // Catch:{ ClassNotFoundException -> 0x00b6 }
            java.lang.Object[] r0 = new java.lang.Object[r7]     // Catch:{ ClassNotFoundException -> 0x00b6 }
            java.lang.Object r0 = r1.newInstance(r0)     // Catch:{ ClassNotFoundException -> 0x00b6 }
            java.lang.Object r0 = r5.cast(r0)     // Catch:{ ClassNotFoundException -> 0x00b6 }
            kotlinx.coroutines.android.AndroidDispatcherFactory r0 = (kotlinx.coroutines.android.AndroidDispatcherFactory) r0     // Catch:{ ClassNotFoundException -> 0x00b6 }
            r6 = r0
        L_0x00b6:
            if (r6 == 0) goto L_0x0047
            r2.add(r6)     // Catch:{ all -> 0x00bc }
            goto L_0x0047
        L_0x00bc:
            java.lang.ClassLoader r0 = r5.getClassLoader()     // Catch:{ all -> 0x00d3 }
            java.util.List r2 = r4.A01(r0)     // Catch:{ all -> 0x00d3 }
            goto L_0x0047
        L_0x00c5:
            X.5GI r2 = r3.createDispatcher(r2)     // Catch:{ all -> 0x00ca }
            goto L_0x00da
        L_0x00ca:
            r1 = move-exception
            java.lang.String r0 = "For tests Dispatchers.setMain from kotlinx-coroutines-test module can be used"
            X.5Ge r2 = new X.5Ge     // Catch:{ all -> 0x00d3 }
            r2.<init>(r0, r1)     // Catch:{ all -> 0x00d3 }
            goto L_0x00da
        L_0x00d3:
            r1 = move-exception
            r0 = 0
            X.5Ge r2 = new X.5Ge
            r2.<init>(r0, r1)
        L_0x00da:
            A00 = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass38H.<clinit>():void");
    }
}
