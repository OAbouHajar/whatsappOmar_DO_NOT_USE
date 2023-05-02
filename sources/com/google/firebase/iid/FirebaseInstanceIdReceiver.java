package com.google.firebase.iid;

import X.AnonymousClass01P;
import X.AnonymousClass3CF;
import X.AnonymousClass4RR;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.util.Log;

public final class FirebaseInstanceIdReceiver extends AnonymousClass01P {
    public static AnonymousClass3CF A00;

    public static int A00(BroadcastReceiver broadcastReceiver, Context context, Intent intent) {
        AnonymousClass3CF r4;
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            Log.d("FirebaseInstanceId", "Binding to service");
        }
        if (broadcastReceiver.isOrderedBroadcast()) {
            broadcastReceiver.setResultCode(-1);
        }
        synchronized (FirebaseInstanceIdReceiver.class) {
            r4 = A00;
            if (r4 == null) {
                r4 = new AnonymousClass3CF(context);
                A00 = r4;
            }
        }
        BroadcastReceiver.PendingResult goAsync = broadcastReceiver.goAsync();
        synchronized (r4) {
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                Log.d("FirebaseInstanceId", "new intent queued in the bind-strategy delivery");
            }
            r4.A04.add(new AnonymousClass4RR(goAsync, intent, r4.A05));
            r4.A00();
        }
        return -1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00f8, code lost:
        if (r10.getApplicationInfo().targetSdkVersion < 26) goto L_0x00fa;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(android.content.Context r10, android.content.Intent r11) {
        /*
            r9 = this;
            r0 = 0
            r11.setComponent(r0)
            java.lang.String r0 = r10.getPackageName()
            r11.setPackage(r0)
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 18
            if (r1 > r0) goto L_0x0018
            java.lang.String r0 = r10.getPackageName()
            r11.removeCategory(r0)
        L_0x0018:
            java.lang.String r0 = "from"
            java.lang.String r1 = r11.getStringExtra(r0)
            java.lang.String r0 = "google.com/iid"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00d3
            java.lang.String r0 = "CMD"
            java.lang.String r4 = r11.getStringExtra(r0)
            if (r4 == 0) goto L_0x0275
            r0 = 3
            java.lang.String r5 = "FirebaseInstanceId"
            boolean r0 = android.util.Log.isLoggable(r5, r0)
            if (r0 == 0) goto L_0x0066
            android.os.Bundle r0 = r11.getExtras()
            java.lang.String r3 = java.lang.String.valueOf(r0)
            int r0 = r4.length()
            int r2 = r0 + 21
            int r0 = r3.length()
            int r2 = r2 + r0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r2)
            java.lang.String r0 = "Received command: "
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = " - "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = r1.toString()
            android.util.Log.d(r5, r0)
        L_0x0066:
            java.lang.String r0 = "RST"
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x00c6
            java.lang.String r0 = "RST_FULL"
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x00c6
            java.lang.String r0 = "SYNC"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x0275
            X.0nx r0 = X.C13720nx.A00()
            com.google.firebase.iid.FirebaseInstanceId r6 = com.google.firebase.iid.FirebaseInstanceId.getInstance(r0)
            X.0od r5 = com.google.firebase.iid.FirebaseInstanceId.A08
            java.lang.String r0 = ""
            monitor-enter(r5)
            java.lang.String r1 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x00c3 }
            java.lang.String r0 = "|T|"
            java.lang.String r4 = r1.concat(r0)     // Catch:{ all -> 0x00c3 }
            android.content.SharedPreferences r0 = r5.A01     // Catch:{ all -> 0x00c3 }
            android.content.SharedPreferences$Editor r3 = r0.edit()     // Catch:{ all -> 0x00c3 }
            java.util.Map r0 = r0.getAll()     // Catch:{ all -> 0x00c3 }
            java.util.Set r0 = r0.keySet()     // Catch:{ all -> 0x00c3 }
            java.util.Iterator r2 = r0.iterator()     // Catch:{ all -> 0x00c3 }
        L_0x00a8:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x00c3 }
            if (r0 == 0) goto L_0x00be
            java.lang.Object r1 = r2.next()     // Catch:{ all -> 0x00c3 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x00c3 }
            boolean r0 = r1.startsWith(r4)     // Catch:{ all -> 0x00c3 }
            if (r0 == 0) goto L_0x00a8
            r3.remove(r1)     // Catch:{ all -> 0x00c3 }
            goto L_0x00a8
        L_0x00be:
            r3.commit()     // Catch:{ all -> 0x00c3 }
            goto L_0x0271
        L_0x00c3:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        L_0x00c6:
            X.0nx r0 = X.C13720nx.A00()
            com.google.firebase.iid.FirebaseInstanceId r0 = com.google.firebase.iid.FirebaseInstanceId.getInstance(r0)
            r0.A07()
            goto L_0x0275
        L_0x00d3:
            java.lang.String r2 = "gcm.rawData64"
            java.lang.String r1 = r11.getStringExtra(r2)
            if (r1 == 0) goto L_0x00e8
            r0 = 0
            byte[] r1 = android.util.Base64.decode(r1, r0)
            java.lang.String r0 = "rawData"
            r11.putExtra(r0, r1)
            r11.removeExtra(r2)
        L_0x00e8:
            boolean r0 = X.C14320oy.A03()
            r3 = 1
            if (r0 == 0) goto L_0x00fa
            android.content.pm.ApplicationInfo r0 = r10.getApplicationInfo()
            int r1 = r0.targetSdkVersion
            r0 = 26
            r2 = 1
            if (r1 >= r0) goto L_0x00fb
        L_0x00fa:
            r2 = 0
        L_0x00fb:
            int r1 = r11.getFlags()
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            r1 = r1 & r0
            if (r1 != 0) goto L_0x0105
            r3 = 0
        L_0x0105:
            if (r2 == 0) goto L_0x010f
            if (r3 != 0) goto L_0x010f
            int r1 = A00(r9, r10, r11)
            goto L_0x0276
        L_0x010f:
            X.0tS r2 = X.C16680tS.A00()
            java.lang.String r3 = "FirebaseInstanceId"
            r0 = 3
            boolean r0 = android.util.Log.isLoggable(r3, r0)
            if (r0 == 0) goto L_0x0121
            java.lang.String r0 = "Starting service"
            android.util.Log.d(r3, r0)
        L_0x0121:
            java.util.Queue r0 = r2.A03
            r0.offer(r11)
            java.lang.String r0 = "com.google.firebase.MESSAGING_EVENT"
            android.content.Intent r4 = new android.content.Intent
            r4.<init>(r0)
            java.lang.String r0 = r10.getPackageName()
            r4.setPackage(r0)
            monitor-enter(r2)
            java.lang.String r5 = r2.A02     // Catch:{ all -> 0x0280 }
            if (r5 != 0) goto L_0x01b6
            android.content.pm.PackageManager r1 = r10.getPackageManager()     // Catch:{ all -> 0x0280 }
            r0 = 0
            android.content.pm.ResolveInfo r0 = r1.resolveService(r4, r0)     // Catch:{ all -> 0x0280 }
            r5 = 0
            if (r0 == 0) goto L_0x0182
            android.content.pm.ServiceInfo r6 = r0.serviceInfo     // Catch:{ all -> 0x0280 }
            if (r6 == 0) goto L_0x0182
            java.lang.String r0 = r10.getPackageName()     // Catch:{ all -> 0x0280 }
            java.lang.String r8 = r6.packageName     // Catch:{ all -> 0x0280 }
            boolean r0 = r0.equals(r8)     // Catch:{ all -> 0x0280 }
            if (r0 == 0) goto L_0x0185
            java.lang.String r1 = r6.name     // Catch:{ all -> 0x0280 }
            if (r1 == 0) goto L_0x0185
            java.lang.String r0 = "."
            boolean r0 = r1.startsWith(r0)     // Catch:{ all -> 0x0280 }
            if (r0 == 0) goto L_0x0179
            java.lang.String r0 = r10.getPackageName()     // Catch:{ all -> 0x0280 }
            java.lang.String r5 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0280 }
            java.lang.String r0 = r6.name     // Catch:{ all -> 0x0280 }
            java.lang.String r1 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0280 }
            int r0 = r1.length()     // Catch:{ all -> 0x0280 }
            if (r0 == 0) goto L_0x017c
            java.lang.String r1 = r5.concat(r1)     // Catch:{ all -> 0x0280 }
        L_0x0179:
            r2.A02 = r1     // Catch:{ all -> 0x0280 }
            goto L_0x01b8
        L_0x017c:
            java.lang.String r1 = new java.lang.String     // Catch:{ all -> 0x0280 }
            r1.<init>(r5)     // Catch:{ all -> 0x0280 }
            goto L_0x0179
        L_0x0182:
            java.lang.String r0 = "Failed to resolve target intent service, skipping classname enforcement"
            goto L_0x01b3
        L_0x0185:
            java.lang.String r7 = r6.name     // Catch:{ all -> 0x0280 }
            java.lang.String r0 = java.lang.String.valueOf(r8)     // Catch:{ all -> 0x0280 }
            int r0 = r0.length()     // Catch:{ all -> 0x0280 }
            int r6 = r0 + 94
            java.lang.String r0 = java.lang.String.valueOf(r7)     // Catch:{ all -> 0x0280 }
            int r0 = r0.length()     // Catch:{ all -> 0x0280 }
            int r6 = r6 + r0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0280 }
            r1.<init>(r6)     // Catch:{ all -> 0x0280 }
            java.lang.String r0 = "Error resolving target intent service, skipping classname enforcement. Resolved service was: "
            r1.append(r0)     // Catch:{ all -> 0x0280 }
            r1.append(r8)     // Catch:{ all -> 0x0280 }
            java.lang.String r0 = "/"
            r1.append(r0)     // Catch:{ all -> 0x0280 }
            r1.append(r7)     // Catch:{ all -> 0x0280 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0280 }
        L_0x01b3:
            android.util.Log.e(r3, r0)     // Catch:{ all -> 0x0280 }
        L_0x01b6:
            monitor-exit(r2)
            goto L_0x01ba
        L_0x01b8:
            monitor-exit(r2)
            r5 = r1
        L_0x01ba:
            if (r5 == 0) goto L_0x01e0
            r0 = 3
            boolean r0 = android.util.Log.isLoggable(r3, r0)
            if (r0 == 0) goto L_0x01d2
            java.lang.String r1 = "Restricting intent to a specific service: "
            int r0 = r5.length()
            if (r0 == 0) goto L_0x01da
            java.lang.String r0 = r1.concat(r5)
        L_0x01cf:
            android.util.Log.d(r3, r0)
        L_0x01d2:
            java.lang.String r0 = r10.getPackageName()
            r4.setClassName(r0, r5)
            goto L_0x01e0
        L_0x01da:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r1)
            goto L_0x01cf
        L_0x01e0:
            boolean r0 = r2.A01(r10)     // Catch:{ SecurityException -> 0x0257, IllegalStateException -> 0x0235 }
            if (r0 == 0) goto L_0x0222
            java.lang.Object r5 = X.C82054Ay.A02     // Catch:{ SecurityException -> 0x0257, IllegalStateException -> 0x0235 }
            monitor-enter(r5)     // Catch:{ SecurityException -> 0x0257, IllegalStateException -> 0x0235 }
            X.0rJ r0 = X.C82054Ay.A00     // Catch:{ all -> 0x021f }
            r2 = 1
            if (r0 != 0) goto L_0x0202
            java.lang.String r1 = "wake:com.google.firebase.iid.WakeLockHolder"
            X.0rJ r0 = new X.0rJ     // Catch:{ all -> 0x021f }
            r0.<init>(r10, r1)     // Catch:{ all -> 0x021f }
            X.C82054Ay.A00 = r0     // Catch:{ all -> 0x021f }
            java.lang.Object r1 = r0.A0B     // Catch:{ all -> 0x021f }
            monitor-enter(r1)     // Catch:{ all -> 0x021f }
            r0.A08 = r2     // Catch:{ all -> 0x01ff }
            monitor-exit(r1)     // Catch:{ all -> 0x01ff }
            goto L_0x0202
        L_0x01ff:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x01ff }
            throw r0     // Catch:{ all -> 0x021f }
        L_0x0202:
            java.lang.String r1 = "com.google.firebase.iid.WakeLockHolder.wakefulintent"
            r0 = 0
            boolean r0 = r4.getBooleanExtra(r1, r0)     // Catch:{ all -> 0x021f }
            r4.putExtra(r1, r2)     // Catch:{ all -> 0x021f }
            android.content.ComponentName r4 = r10.startService(r4)     // Catch:{ all -> 0x021f }
            if (r4 != 0) goto L_0x0214
            r4 = 0
            goto L_0x021d
        L_0x0214:
            if (r0 != 0) goto L_0x021d
            X.0rJ r2 = X.C82054Ay.A00     // Catch:{ all -> 0x021f }
            long r0 = X.C82054Ay.A01     // Catch:{ all -> 0x021f }
            r2.A02(r0)     // Catch:{ all -> 0x021f }
        L_0x021d:
            monitor-exit(r5)     // Catch:{ all -> 0x021f }
            goto L_0x022b
        L_0x021f:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x021f }
            throw r0     // Catch:{ SecurityException -> 0x0257, IllegalStateException -> 0x0235 }
        L_0x0222:
            android.content.ComponentName r4 = r10.startService(r4)     // Catch:{ SecurityException -> 0x0257, IllegalStateException -> 0x0235 }
            java.lang.String r0 = "Missing wake lock permission, service start may be delayed"
            android.util.Log.d(r3, r0)     // Catch:{ SecurityException -> 0x0257, IllegalStateException -> 0x0235 }
        L_0x022b:
            if (r4 != 0) goto L_0x0260
            java.lang.String r0 = "Error while delivering the message: ServiceIntent not found."
            android.util.Log.e(r3, r0)     // Catch:{ SecurityException -> 0x0257, IllegalStateException -> 0x0235 }
            r1 = 404(0x194, float:5.66E-43)
            goto L_0x0261
        L_0x0235:
            r0 = move-exception
            java.lang.String r2 = java.lang.String.valueOf(r0)
            int r0 = r2.length()
            int r0 = r0 + 45
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = "Failed to start service while in background: "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = r1.toString()
            android.util.Log.e(r3, r0)
            r1 = 402(0x192, float:5.63E-43)
            goto L_0x0261
        L_0x0257:
            r1 = move-exception
            java.lang.String r0 = "Error while delivering the message to the serviceIntent"
            android.util.Log.e(r3, r0, r1)
            r1 = 401(0x191, float:5.62E-43)
            goto L_0x0261
        L_0x0260:
            r1 = -1
        L_0x0261:
            boolean r0 = X.C14320oy.A03()
            if (r0 == 0) goto L_0x0276
            r0 = 402(0x192, float:5.63E-43)
            if (r1 != r0) goto L_0x0276
            A00(r9, r10, r11)
            r1 = 403(0x193, float:5.65E-43)
            goto L_0x0276
        L_0x0271:
            monitor-exit(r5)
            r6.A08()
        L_0x0275:
            r1 = -1
        L_0x0276:
            boolean r0 = r9.isOrderedBroadcast()
            if (r0 == 0) goto L_0x027f
            r9.setResultCode(r1)
        L_0x027f:
            return
        L_0x0280:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.FirebaseInstanceIdReceiver.A01(android.content.Context, android.content.Intent):void");
    }

    public final void onReceive(Context context, Intent intent) {
        Intent intent2;
        if (intent != null) {
            Parcelable parcelableExtra = intent.getParcelableExtra("wrapped_intent");
            if (!(parcelableExtra instanceof Intent) || (intent2 = (Intent) parcelableExtra) == null) {
                A01(context, intent);
            } else {
                A01(context, intent2);
            }
        }
    }
}
