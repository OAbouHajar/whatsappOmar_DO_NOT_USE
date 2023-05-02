package X;

/* renamed from: X.34b  reason: invalid class name and case insensitive filesystem */
public class C605734b extends AnonymousClass54M {
    public final AnonymousClass1NJ A00;

    public C605734b(AnonymousClass1NJ r1) {
        super(r1);
        this.A00 = r1;
    }

    public AnonymousClass1NJ A00() {
        return this.A00;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0035, code lost:
        if (r2 == X.C799041u.A02) goto L_0x0037;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.os.IInterface A01() {
        /*
            r15 = this;
            X.1NJ r5 = r15.A00
            r13 = 30000(0x7530, double:1.4822E-319)
            java.lang.String r4 = "GoogleMigrateClient"
            if (r5 != r5) goto L_0x0287
            monitor-enter(r5)
            X.3CG r0 = r5.A01     // Catch:{ all -> 0x0284 }
            r8 = 1
            r6 = 0
            if (r0 != 0) goto L_0x0029
            android.content.Context r7 = r5.A04     // Catch:{ all -> 0x0284 }
            X.0so r3 = r5.A05     // Catch:{ all -> 0x0284 }
            X.4F7 r2 = new X.4F7     // Catch:{ all -> 0x0284 }
            r2.<init>(r5)     // Catch:{ all -> 0x0284 }
            X.4F8 r1 = new X.4F8     // Catch:{ all -> 0x0284 }
            r1.<init>(r5)     // Catch:{ all -> 0x0284 }
            X.3CG r0 = new X.3CG     // Catch:{ all -> 0x0284 }
            r0.<init>(r7, r3, r2, r1)     // Catch:{ all -> 0x0284 }
            r5.A01 = r0     // Catch:{ all -> 0x0284 }
        L_0x0024:
            X.3CG r2 = r5.A01     // Catch:{ all -> 0x0284 }
            if (r8 == 0) goto L_0x0116
            goto L_0x006b
        L_0x0029:
            java.lang.Object r3 = r0.A06     // Catch:{ all -> 0x0284 }
            monitor-enter(r3)     // Catch:{ all -> 0x0284 }
            X.41u r2 = r0.A01     // Catch:{ all -> 0x01b1 }
            X.41u r0 = X.C799041u.CONNECTING     // Catch:{ all -> 0x01b1 }
            if (r2 == r0) goto L_0x0037
            X.41u r1 = X.C799041u.CONNECTED     // Catch:{ all -> 0x01b1 }
            r0 = 0
            if (r2 != r1) goto L_0x0038
        L_0x0037:
            r0 = 1
        L_0x0038:
            monitor-exit(r3)     // Catch:{ all -> 0x01b1 }
            if (r0 != 0) goto L_0x0069
            X.3CG r0 = r5.A01     // Catch:{ all -> 0x0284 }
            r0.A01(r6)     // Catch:{ all -> 0x0284 }
            android.content.Context r7 = r5.A04     // Catch:{ all -> 0x0284 }
            X.0so r3 = r5.A05     // Catch:{ all -> 0x0284 }
            X.4F7 r2 = new X.4F7     // Catch:{ all -> 0x0284 }
            r2.<init>(r5)     // Catch:{ all -> 0x0284 }
            X.4F8 r1 = new X.4F8     // Catch:{ all -> 0x0284 }
            r1.<init>(r5)     // Catch:{ all -> 0x0284 }
            X.3CG r0 = new X.3CG     // Catch:{ all -> 0x0284 }
            r0.<init>(r7, r3, r2, r1)     // Catch:{ all -> 0x0284 }
            r5.A01 = r0     // Catch:{ all -> 0x0284 }
            java.lang.String r2 = "svc-client-inconsistent-connection"
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0o()     // Catch:{ all -> 0x0284 }
            java.lang.String r0 = "name="
            r1.append(r0)     // Catch:{ all -> 0x0284 }
            java.lang.String r0 = X.AnonymousClass000.A0h(r4, r1)     // Catch:{ all -> 0x0284 }
            r3.AcB(r2, r0, r6)     // Catch:{ all -> 0x0284 }
            goto L_0x0024
        L_0x0069:
            r8 = 0
            goto L_0x0024
        L_0x006b:
            java.lang.String r1 = r5.A02     // Catch:{ all -> 0x010c }
            if (r1 != 0) goto L_0x0087
            java.lang.String r1 = "com.google.android.apps.restore"
            boolean r0 = r5.A05(r1)     // Catch:{ all -> 0x010c }
            if (r0 != 0) goto L_0x0085
            java.lang.String r1 = "com.google.android.apps.pixelmigrate"
            boolean r0 = r5.A05(r1)     // Catch:{ all -> 0x010c }
            if (r0 != 0) goto L_0x0085
            android.content.pm.PackageManager$NameNotFoundException r0 = new android.content.pm.PackageManager$NameNotFoundException     // Catch:{ all -> 0x010c }
            r0.<init>()     // Catch:{ all -> 0x010c }
            throw r0     // Catch:{ all -> 0x010c }
        L_0x0085:
            r5.A02 = r1     // Catch:{ all -> 0x010c }
        L_0x0087:
            android.content.Intent r9 = X.C13680ns.A09()     // Catch:{ NameNotFoundException -> 0x010e }
            r9.setPackage(r1)     // Catch:{ NameNotFoundException -> 0x010e }
            java.lang.String r0 = "com.google.android.apps.pixelmigrate.IOS_APP_DATA_READER_SERVICE"
            r9.setAction(r0)     // Catch:{ NameNotFoundException -> 0x010e }
            r3 = 1
            java.lang.String r0 = "svc-connection/start-connect; service="
            java.lang.String r11 = X.C13680ns.A0h(r0, r4)     // Catch:{ all -> 0x0284 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0q(r11)     // Catch:{ all -> 0x0284 }
            java.lang.String r0 = ", intent="
            r1.append(r0)     // Catch:{ all -> 0x0284 }
            r1.append(r9)     // Catch:{ all -> 0x0284 }
            X.C13680ns.A1V(r1)     // Catch:{ all -> 0x0284 }
            java.lang.Object r8 = r2.A06     // Catch:{ all -> 0x0284 }
            monitor-enter(r8)     // Catch:{ all -> 0x0284 }
            X.41u r7 = r2.A01     // Catch:{ all -> 0x0108 }
            X.41u r0 = X.C799041u.NEW     // Catch:{ all -> 0x0108 }
            if (r7 != r0) goto L_0x00e6
            X.41u r1 = X.C799041u.CONNECTING     // Catch:{ all -> 0x0108 }
            r2.A01 = r1     // Catch:{ all -> 0x0108 }
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0q(r11)     // Catch:{ all -> 0x0108 }
            java.lang.String r10 = " -> state="
            r0.append(r10)     // Catch:{ all -> 0x0108 }
            r0.append(r1)     // Catch:{ all -> 0x0108 }
            X.C13680ns.A1V(r0)     // Catch:{ all -> 0x0108 }
            monitor-exit(r8)     // Catch:{ all -> 0x0108 }
            android.content.Context r7 = r2.A03     // Catch:{ all -> 0x0284 }
            boolean r0 = r7.bindService(r9, r2, r3)     // Catch:{ all -> 0x0284 }
            if (r0 != 0) goto L_0x0116
            monitor-enter(r8)     // Catch:{ all -> 0x0284 }
            X.41u r1 = X.C799041u.CLOSED     // Catch:{ all -> 0x00e2 }
            r2.A01 = r1     // Catch:{ all -> 0x00e2 }
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0q(r11)     // Catch:{ all -> 0x00e2 }
            java.lang.String r0 = X.AnonymousClass000.A0e(r1, r10, r0)     // Catch:{ all -> 0x00e2 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x00e2 }
            monitor-exit(r8)     // Catch:{ all -> 0x00e2 }
            goto L_0x01b4
        L_0x00e2:
            r1 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x00e2 }
            goto L_0x0201
        L_0x00e6:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0q(r11)     // Catch:{ all -> 0x0108 }
            java.lang.String r0 = ", cannot start from state="
            java.lang.String r0 = X.AnonymousClass000.A0e(r7, r0, r1)     // Catch:{ all -> 0x0108 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0108 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0o()     // Catch:{ all -> 0x0108 }
            java.lang.String r0 = "Cannot start connection from state: "
            r1.append(r0)     // Catch:{ all -> 0x0108 }
            X.41u r0 = r2.A01     // Catch:{ all -> 0x0108 }
            java.lang.String r1 = X.AnonymousClass000.A0f(r0, r1)     // Catch:{ all -> 0x0108 }
            X.43s r0 = new X.43s     // Catch:{ all -> 0x0108 }
            r0.<init>((java.lang.String) r1)     // Catch:{ all -> 0x0108 }
            throw r0     // Catch:{ all -> 0x0108 }
        L_0x0108:
            r1 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x0108 }
            goto L_0x0201
        L_0x010c:
            r0 = move-exception
            throw r0     // Catch:{ NameNotFoundException -> 0x010e }
        L_0x010e:
            r0 = move-exception
            X.43s r1 = new X.43s     // Catch:{ all -> 0x0284 }
            r1.<init>((java.lang.Throwable) r0)     // Catch:{ all -> 0x0284 }
            goto L_0x0201
        L_0x0116:
            monitor-exit(r5)     // Catch:{ all -> 0x0284 }
            boolean r0 = X.AnonymousClass01E.A01()
            r1 = r0 ^ 1
            java.lang.String r0 = "Cannot be called from main thread, will deadlock."
            X.AnonymousClass00B.A0D(r0, r1)
            java.lang.String r9 = "svc-connection/await-binder; service="
            java.lang.String r12 = X.C13680ns.A0h(r9, r4)
            long r10 = android.os.SystemClock.elapsedRealtime()
            long r10 = r10 + r13
            java.lang.Object r3 = r2.A06
            monitor-enter(r3)
        L_0x0131:
            X.41u r8 = r2.A01     // Catch:{ all -> 0x01ae }
            X.41u r0 = X.C799041u.CONNECTED     // Catch:{ all -> 0x01ae }
            if (r8 != r0) goto L_0x013d
            android.os.IInterface r0 = r2.A00     // Catch:{ all -> 0x01ae }
            if (r0 == 0) goto L_0x0196
            monitor-exit(r3)     // Catch:{ all -> 0x01ae }
            goto L_0x0151
        L_0x013d:
            X.41u r0 = X.C799041u.CONNECTING     // Catch:{ all -> 0x01ae }
            if (r8 != r0) goto L_0x0174
            long r5 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x01ae }
            long r0 = r10 - r5
            r6 = 0
            int r5 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r5 <= 0) goto L_0x0152
            r3.wait(r0)     // Catch:{ all -> 0x01ae }
            goto L_0x0131
        L_0x0151:
            return r0
        L_0x0152:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0q(r12)     // Catch:{ all -> 0x01ae }
            java.lang.String r0 = ", timed out when in state="
            java.lang.String r0 = X.AnonymousClass000.A0e(r8, r0, r1)     // Catch:{ all -> 0x01ae }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x01ae }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0o()     // Catch:{ all -> 0x01ae }
            java.lang.String r0 = "Timed out. Connection state: "
            r1.append(r0)     // Catch:{ all -> 0x01ae }
            X.41u r0 = r2.A01     // Catch:{ all -> 0x01ae }
            java.lang.String r0 = X.AnonymousClass000.A0f(r0, r1)     // Catch:{ all -> 0x01ae }
            X.43s r1 = new X.43s     // Catch:{ all -> 0x01ae }
            r1.<init>((java.lang.String) r0)     // Catch:{ all -> 0x01ae }
            goto L_0x01ad
        L_0x0174:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0q(r12)     // Catch:{ all -> 0x01ae }
            java.lang.String r0 = ", not in CONNECTING state; state="
            java.lang.String r0 = X.AnonymousClass000.A0e(r8, r0, r1)     // Catch:{ all -> 0x01ae }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x01ae }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0o()     // Catch:{ all -> 0x01ae }
            java.lang.String r0 = "Cannot wait for binder from state: "
            r1.append(r0)     // Catch:{ all -> 0x01ae }
            X.41u r0 = r2.A01     // Catch:{ all -> 0x01ae }
            java.lang.String r0 = X.AnonymousClass000.A0f(r0, r1)     // Catch:{ all -> 0x01ae }
            X.43s r1 = new X.43s     // Catch:{ all -> 0x01ae }
            r1.<init>((java.lang.String) r0)     // Catch:{ all -> 0x01ae }
            goto L_0x01ad
        L_0x0196:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0q(r9)     // Catch:{ all -> 0x01ae }
            r1.append(r4)     // Catch:{ all -> 0x01ae }
            java.lang.String r0 = ", null binder"
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r1)     // Catch:{ all -> 0x01ae }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x01ae }
            java.lang.String r0 = "Unexpected failure. Connected with null binder."
            X.43s r1 = new X.43s     // Catch:{ all -> 0x01ae }
            r1.<init>((java.lang.String) r0)     // Catch:{ all -> 0x01ae }
        L_0x01ad:
            throw r1     // Catch:{ all -> 0x01ae }
        L_0x01ae:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x01ae }
            throw r0
        L_0x01b1:
            r1 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x01b1 }
            goto L_0x0201
        L_0x01b4:
            android.content.ComponentName r8 = r9.getComponent()     // Catch:{ all -> 0x0284 }
            if (r8 != 0) goto L_0x022b
            android.content.pm.PackageManager r0 = r7.getPackageManager()     // Catch:{ all -> 0x0284 }
            java.util.List r2 = r0.queryIntentServices(r9, r6)     // Catch:{ all -> 0x0284 }
            int r0 = r2.size()     // Catch:{ all -> 0x0284 }
            if (r0 != 0) goto L_0x0202
            java.lang.String r0 = "No services found for "
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)     // Catch:{ all -> 0x0284 }
            r1.append(r9)     // Catch:{ all -> 0x0284 }
            java.lang.String r0 = ". Did you update AndroidManifest/queries to enable package visibility for target service?"
            r1.append(r0)     // Catch:{ all -> 0x0284 }
        L_0x01d6:
            java.lang.String r2 = r1.toString()     // Catch:{ all -> 0x0284 }
        L_0x01da:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0q(r11)     // Catch:{ all -> 0x0284 }
            java.lang.String r0 = ", failed to bind; "
            r1.append(r0)     // Catch:{ all -> 0x0284 }
            java.lang.String r0 = X.AnonymousClass000.A0h(r2, r1)     // Catch:{ all -> 0x0284 }
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x0284 }
            java.lang.String r0 = "Failed to bind to "
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)     // Catch:{ all -> 0x0284 }
            r1.append(r4)     // Catch:{ all -> 0x0284 }
            java.lang.String r0 = "; "
            r1.append(r0)     // Catch:{ all -> 0x0284 }
            java.lang.String r0 = X.AnonymousClass000.A0h(r2, r1)     // Catch:{ all -> 0x0284 }
            X.43s r1 = new X.43s     // Catch:{ all -> 0x0284 }
            r1.<init>((java.lang.String) r0)     // Catch:{ all -> 0x0284 }
        L_0x0201:
            throw r1     // Catch:{ all -> 0x0284 }
        L_0x0202:
            int r0 = r2.size()     // Catch:{ all -> 0x0284 }
            if (r0 <= r3) goto L_0x021a
            java.lang.String r0 = "Multiple services ("
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)     // Catch:{ all -> 0x0284 }
            X.C13700nu.A0b(r1, r2)     // Catch:{ all -> 0x0284 }
            java.lang.String r0 = ") found for "
            r1.append(r0)     // Catch:{ all -> 0x0284 }
            r1.append(r9)     // Catch:{ all -> 0x0284 }
            goto L_0x01d6
        L_0x021a:
            java.lang.Object r0 = r2.get(r6)     // Catch:{ all -> 0x0284 }
            android.content.pm.ResolveInfo r0 = (android.content.pm.ResolveInfo) r0     // Catch:{ all -> 0x0284 }
            android.content.pm.ServiceInfo r0 = r0.serviceInfo     // Catch:{ all -> 0x0284 }
            java.lang.String r1 = r0.packageName     // Catch:{ all -> 0x0284 }
            java.lang.String r0 = r0.name     // Catch:{ all -> 0x0284 }
            android.content.ComponentName r8 = new android.content.ComponentName     // Catch:{ all -> 0x0284 }
            r8.<init>(r1, r0)     // Catch:{ all -> 0x0284 }
        L_0x022b:
            android.content.pm.PackageManager r1 = r7.getPackageManager()     // Catch:{ all -> 0x0284 }
            java.lang.String r7 = r8.getPackageName()     // Catch:{ all -> 0x0284 }
            android.content.pm.PackageInfo r0 = r1.getPackageInfo(r7, r6)     // Catch:{ NameNotFoundException -> 0x026d }
            android.content.pm.ApplicationInfo r0 = r0.applicationInfo     // Catch:{ NameNotFoundException -> 0x026d }
            boolean r0 = r0.enabled     // Catch:{ NameNotFoundException -> 0x026d }
            if (r0 != 0) goto L_0x024a
            java.util.Locale r2 = java.util.Locale.US     // Catch:{ NameNotFoundException -> 0x026d }
            java.lang.String r1 = "Package %s is disabled."
            java.lang.Object[] r0 = new java.lang.Object[r3]     // Catch:{ NameNotFoundException -> 0x026d }
            r0[r6] = r7     // Catch:{ NameNotFoundException -> 0x026d }
            java.lang.String r2 = java.lang.String.format(r2, r1, r0)     // Catch:{ NameNotFoundException -> 0x026d }
            goto L_0x01da
        L_0x024a:
            android.content.pm.ServiceInfo r0 = r1.getServiceInfo(r8, r6)     // Catch:{ NameNotFoundException -> 0x0276 }
            boolean r0 = r0.enabled     // Catch:{ NameNotFoundException -> 0x0276 }
            if (r0 != 0) goto L_0x0260
            java.util.Locale r2 = java.util.Locale.US     // Catch:{ NameNotFoundException -> 0x0276 }
            java.lang.String r1 = "Service %s is disabled."
            java.lang.Object[] r0 = new java.lang.Object[r3]     // Catch:{ NameNotFoundException -> 0x0276 }
            r0[r6] = r8     // Catch:{ NameNotFoundException -> 0x0276 }
            java.lang.String r2 = java.lang.String.format(r2, r1, r0)     // Catch:{ NameNotFoundException -> 0x0276 }
            goto L_0x01da
        L_0x0260:
            java.util.Locale r2 = java.util.Locale.US     // Catch:{ all -> 0x0284 }
            java.lang.Object[] r1 = X.C13690nt.A1Z()     // Catch:{ all -> 0x0284 }
            r1[r6] = r7     // Catch:{ all -> 0x0284 }
            r1[r3] = r8     // Catch:{ all -> 0x0284 }
            java.lang.String r0 = "Package %s is present and enabled; service %s is present and enabled."
            goto L_0x027e
        L_0x026d:
            java.util.Locale r2 = java.util.Locale.US     // Catch:{ all -> 0x0284 }
            java.lang.Object[] r1 = new java.lang.Object[r3]     // Catch:{ all -> 0x0284 }
            r1[r6] = r7     // Catch:{ all -> 0x0284 }
            java.lang.String r0 = "Package %s is not present."
            goto L_0x027e
        L_0x0276:
            java.util.Locale r2 = java.util.Locale.US     // Catch:{ all -> 0x0284 }
            java.lang.Object[] r1 = new java.lang.Object[r3]     // Catch:{ all -> 0x0284 }
            r1[r6] = r8     // Catch:{ all -> 0x0284 }
            java.lang.String r0 = "Service %s is not present."
        L_0x027e:
            java.lang.String r2 = java.lang.String.format(r2, r0, r1)     // Catch:{ all -> 0x0284 }
            goto L_0x01da
        L_0x0284:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0284 }
            throw r0
        L_0x0287:
            java.lang.String r0 = "A session from a different client has been provided. Client: "
            java.lang.String r0 = X.C13680ns.A0h(r0, r4)
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0T(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C605734b.A01():android.os.IInterface");
    }
}
