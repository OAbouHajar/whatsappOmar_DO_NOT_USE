package X;

import android.os.Looper;

/* renamed from: X.2sU  reason: invalid class name and case insensitive filesystem */
public final class C58062sU extends AnonymousClass3M3 {
    public final /* synthetic */ C15770rp A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58062sU(Looper looper, C15770rp r2) {
        super(looper);
        this.A00 = r2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v15, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: android.app.PendingIntent} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x008b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void handleMessage(android.os.Message r10) {
        /*
            r9 = this;
            X.0rp r2 = r9.A00
            java.util.concurrent.atomic.AtomicInteger r0 = r2.A0C
            int r1 = r0.get()
            int r0 = r10.arg1
            if (r1 == r0) goto L_0x001f
            int r2 = r10.what
            r1 = 1
            r0 = 2
            if (r2 == r0) goto L_0x0017
            if (r2 == r1) goto L_0x0017
            r0 = 7
            if (r2 != r0) goto L_0x001e
        L_0x0017:
            java.lang.Object r0 = r10.obj
            X.4R4 r0 = (X.AnonymousClass4R4) r0
            r0.A00()
        L_0x001e:
            return
        L_0x001f:
            int r3 = r10.what
            r1 = 4
            r5 = 1
            r8 = 5
            if (r3 == r5) goto L_0x002d
            r0 = 7
            if (r3 == r0) goto L_0x002d
            if (r3 == r1) goto L_0x002d
            if (r3 != r8) goto L_0x0033
        L_0x002d:
            boolean r0 = r2.AIg()
            if (r0 == 0) goto L_0x0017
        L_0x0033:
            int r4 = r10.what
            r7 = 8
            r3 = 3
            r6 = 0
            if (r4 != r1) goto L_0x0063
            int r1 = r10.arg2
            X.0rh r0 = new X.0rh
            r0.<init>(r1)
            r2.A07 = r0
            boolean r0 = r2.A0D
            if (r0 != 0) goto L_0x0087
            java.lang.String r1 = r2.A0A()
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x0087
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 != 0) goto L_0x0087
            java.lang.Class.forName(r1)     // Catch:{ ClassNotFoundException -> 0x0087 }
            boolean r0 = r2.A0D
            if (r0 != 0) goto L_0x0087
            r2.A04(r6, r3)
            return
        L_0x0063:
            if (r4 == r8) goto L_0x0087
            if (r4 != r3) goto L_0x0091
            java.lang.Object r1 = r10.obj
            boolean r0 = r1 instanceof android.app.PendingIntent
            if (r0 == 0) goto L_0x0070
            r6 = r1
            android.app.PendingIntent r6 = (android.app.PendingIntent) r6
        L_0x0070:
            int r0 = r10.arg2
            X.0rh r1 = new X.0rh
            r1.<init>(r0, r6)
        L_0x0077:
            X.5Nw r0 = r2.A08
            r0.AWA(r1)
            int r0 = r1.A01
            r2.A01 = r0
            long r0 = java.lang.System.currentTimeMillis()
            r2.A05 = r0
            return
        L_0x0087:
            X.0rh r1 = r2.A07
            if (r1 != 0) goto L_0x0077
            X.0rh r1 = new X.0rh
            r1.<init>(r7)
            goto L_0x0077
        L_0x0091:
            r0 = 6
            if (r4 != r0) goto L_0x00b2
            r2.A04(r6, r8)
            X.5Lk r0 = r2.A0J
            if (r0 == 0) goto L_0x00a4
            int r1 = r10.arg2
            X.4qv r0 = (X.C97994qv) r0
            X.0rd r0 = r0.A00
            r0.onConnectionSuspended(r1)
        L_0x00a4:
            int r0 = r10.arg2
            r2.A00 = r0
            long r0 = java.lang.System.currentTimeMillis()
            r2.A03 = r0
            X.C15770rp.A00(r6, r2, r8, r5)
            return
        L_0x00b2:
            r1 = 2
            if (r4 != r1) goto L_0x00bb
            boolean r0 = r2.isConnected()
            if (r0 == 0) goto L_0x0017
        L_0x00bb:
            int r2 = r10.what
            if (r2 == r1) goto L_0x00e1
            if (r2 == r5) goto L_0x00e1
            r0 = 7
            if (r2 == r0) goto L_0x00e1
            r0 = 45
            java.lang.StringBuilder r1 = X.C13690nt.A0g(r0)
            java.lang.String r0 = "Don't know how to handle message: "
            r1.append(r0)
            r1.append(r2)
            java.lang.Exception r2 = new java.lang.Exception
            r2.<init>()
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = "GmsClient"
            android.util.Log.wtf(r0, r1, r2)
            return
        L_0x00e1:
            java.lang.Object r4 = r10.obj
            X.4R4 r4 = (X.AnonymousClass4R4) r4
            monitor-enter(r4)
            java.lang.Object r8 = r4.A00     // Catch:{ all -> 0x0150 }
            boolean r0 = r4.A01     // Catch:{ all -> 0x0150 }
            if (r0 == 0) goto L_0x010d
            java.lang.String r3 = "GmsClient"
            java.lang.String r2 = r4.toString()     // Catch:{ all -> 0x0150 }
            int r0 = r2.length()     // Catch:{ all -> 0x0150 }
            int r0 = r0 + 47
            java.lang.StringBuilder r1 = X.C13690nt.A0g(r0)     // Catch:{ all -> 0x0150 }
            java.lang.String r0 = "Callback proxy "
            r1.append(r0)     // Catch:{ all -> 0x0150 }
            r1.append(r2)     // Catch:{ all -> 0x0150 }
            java.lang.String r0 = " being reused. This is not safe."
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r1)     // Catch:{ all -> 0x0150 }
            android.util.Log.w(r3, r0)     // Catch:{ all -> 0x0150 }
        L_0x010d:
            monitor-exit(r4)     // Catch:{ all -> 0x0150 }
            if (r8 == 0) goto L_0x0145
            r3 = r4
            X.3YN r3 = (X.AnonymousClass3YN) r3     // Catch:{ RuntimeException -> 0x0143 }
            int r2 = r3.A00     // Catch:{ RuntimeException -> 0x0143 }
            r0 = 0
            if (r2 != 0) goto L_0x012c
            boolean r0 = r3.A02()     // Catch:{ RuntimeException -> 0x0143 }
            if (r0 != 0) goto L_0x0145
            X.0rp r0 = r3.A02     // Catch:{ RuntimeException -> 0x0143 }
            r0.A04(r6, r5)     // Catch:{ RuntimeException -> 0x0143 }
            X.0rh r1 = new X.0rh     // Catch:{ RuntimeException -> 0x0143 }
            r1.<init>(r7, r6)     // Catch:{ RuntimeException -> 0x0143 }
        L_0x0128:
            r3.A01(r1)     // Catch:{ RuntimeException -> 0x0143 }
            goto L_0x0145
        L_0x012c:
            X.0rp r1 = r3.A02     // Catch:{ RuntimeException -> 0x0143 }
            r1.A04(r6, r5)     // Catch:{ RuntimeException -> 0x0143 }
            android.os.Bundle r1 = r3.A01     // Catch:{ RuntimeException -> 0x0143 }
            if (r1 == 0) goto L_0x013d
            java.lang.String r0 = "pendingIntent"
            android.os.Parcelable r0 = r1.getParcelable(r0)     // Catch:{ RuntimeException -> 0x0143 }
            android.app.PendingIntent r0 = (android.app.PendingIntent) r0     // Catch:{ RuntimeException -> 0x0143 }
        L_0x013d:
            X.0rh r1 = new X.0rh     // Catch:{ RuntimeException -> 0x0143 }
            r1.<init>(r2, r0)     // Catch:{ RuntimeException -> 0x0143 }
            goto L_0x0128
        L_0x0143:
            r0 = move-exception
            throw r0
        L_0x0145:
            monitor-enter(r4)
            r4.A01 = r5     // Catch:{ all -> 0x014d }
            monitor-exit(r4)     // Catch:{ all -> 0x014d }
            r4.A00()
            return
        L_0x014d:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x014d }
            throw r0
        L_0x0150:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0150 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58062sU.handleMessage(android.os.Message):void");
    }
}
