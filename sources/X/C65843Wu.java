package X;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.util.Log;
import java.util.concurrent.ExecutorService;

/* renamed from: X.3Wu  reason: invalid class name and case insensitive filesystem */
public final class C65843Wu extends C57972sH {
    public final C85794Pz A00;
    public final C85794Pz A01;
    public final C85794Pz A02;
    public final C85794Pz A03;
    public final C85794Pz A04;
    public final C85794Pz A05;
    public final C85794Pz A06;
    public final C85794Pz A07;
    public final C85794Pz A08;
    public final C89974dH A09;
    public final ExecutorService A0A;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C65843Wu(android.content.Context r11, android.os.Looper r12, X.C15650rc r13, X.C15670re r14, X.AnonymousClass4O1 r15) {
        /*
            r10 = this;
            java.util.concurrent.ExecutorService r0 = java.util.concurrent.Executors.newCachedThreadPool()
            java.util.concurrent.ExecutorService r2 = java.util.concurrent.Executors.unconfigurableExecutorService(r0)
            r4 = r11
            X.C13710nw.A01(r11)
            java.lang.Class<X.4dH> r1 = X.C89974dH.class
            monitor-enter(r1)
            X.4dH r0 = X.C89974dH.A01     // Catch:{ all -> 0x006e }
            if (r0 != 0) goto L_0x001a
            X.4dH r0 = new X.4dH     // Catch:{ all -> 0x006e }
            r0.<init>(r11)     // Catch:{ all -> 0x006e }
            X.C89974dH.A01 = r0     // Catch:{ all -> 0x006e }
        L_0x001a:
            monitor-exit(r1)     // Catch:{ all -> 0x006e }
            X.4dH r1 = X.C89974dH.A01
            r9 = 14
            r3 = r10
            r5 = r12
            r6 = r13
            r7 = r14
            r8 = r15
            r3.<init>(r4, r5, r6, r7, r8, r9)
            X.4Pz r0 = new X.4Pz
            r0.<init>()
            r10.A00 = r0
            X.4Pz r0 = new X.4Pz
            r0.<init>()
            r10.A01 = r0
            X.4Pz r0 = new X.4Pz
            r0.<init>()
            r10.A02 = r0
            X.4Pz r0 = new X.4Pz
            r0.<init>()
            r10.A03 = r0
            X.4Pz r0 = new X.4Pz
            r0.<init>()
            r10.A04 = r0
            X.4Pz r0 = new X.4Pz
            r0.<init>()
            r10.A05 = r0
            X.4Pz r0 = new X.4Pz
            r0.<init>()
            r10.A06 = r0
            X.4Pz r0 = new X.4Pz
            r0.<init>()
            r10.A07 = r0
            X.4Pz r0 = new X.4Pz
            r0.<init>()
            r10.A08 = r0
            X.C13710nw.A01(r2)
            r10.A0A = r2
            r10.A09 = r1
            return
        L_0x006e:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x006e }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65843Wu.<init>(android.content.Context, android.os.Looper, X.0rc, X.0re, X.4O1):void");
    }

    public final String A02() {
        return this.A09.A01() ? "com.google.android.wearable.app.cn" : "com.google.android.gms";
    }

    public final void A03(Bundle bundle, IBinder iBinder, int i2, int i3) {
        if (Log.isLoggable("WearableClient", 2)) {
            Log.v("WearableClient", C13680ns.A0i("onPostInitHandler: statusCode ", C13690nt.A0g(41), i2));
        }
        if (i2 == 0) {
            this.A00.A00(iBinder);
            this.A01.A00(iBinder);
            this.A02.A00(iBinder);
            this.A03.A00(iBinder);
            this.A04.A00(iBinder);
            this.A05.A00(iBinder);
            this.A06.A00(iBinder);
            this.A07.A00(iBinder);
            this.A08.A00(iBinder);
            i2 = 0;
        }
        super.A03(bundle, iBinder, i2, i3);
    }

    public final boolean A06() {
        return true;
    }

    public final AnonymousClass3Y2[] A07() {
        return AnonymousClass4BC.A04;
    }

    public final /* bridge */ /* synthetic */ IInterface A09(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableService");
        return !(queryLocalInterface instanceof C67383bS) ? new C67383bS(iBinder) : queryLocalInterface;
    }

    public final String A0A() {
        return "com.google.android.gms.wearable.internal.IWearableService";
    }

    public final String A0B() {
        return "com.google.android.gms.wearable.BIND";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0022, code lost:
        if (r1 < 8600000) goto L_0x0024;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A6Y(X.C108415Nw r7) {
        /*
            r6 = this;
            java.lang.String r5 = "com.google.android.wearable.app.cn"
            boolean r0 = r6.AcL()
            if (r0 != 0) goto L_0x00a6
            android.content.Context r4 = r6.A0F     // Catch:{ NameNotFoundException -> 0x008b }
            android.content.pm.PackageManager r1 = r4.getPackageManager()     // Catch:{ NameNotFoundException -> 0x008b }
            r0 = 128(0x80, float:1.794E-43)
            android.content.pm.ApplicationInfo r0 = r1.getApplicationInfo(r5, r0)     // Catch:{ NameNotFoundException -> 0x008b }
            android.os.Bundle r1 = r0.metaData     // Catch:{ NameNotFoundException -> 0x008b }
            r3 = 0
            if (r1 == 0) goto L_0x0088
            java.lang.String r0 = "com.google.android.wearable.api.version"
            int r1 = r1.getInt(r0, r3)     // Catch:{ NameNotFoundException -> 0x008b }
            r0 = 8600000(0x8339c0, float:1.2051167E-38)
            if (r1 >= r0) goto L_0x00a6
        L_0x0024:
            r0 = 82
            java.lang.StringBuilder r2 = X.C13690nt.A0g(r0)     // Catch:{ NameNotFoundException -> 0x008b }
            java.lang.String r0 = "The Wear OS app is out of date. Requires API version 8600000 but found "
            r2.append(r0)     // Catch:{ NameNotFoundException -> 0x008b }
            r2.append(r1)     // Catch:{ NameNotFoundException -> 0x008b }
            java.lang.String r1 = "WearableClient"
            java.lang.String r0 = r2.toString()     // Catch:{ NameNotFoundException -> 0x008b }
            android.util.Log.w(r1, r0)     // Catch:{ NameNotFoundException -> 0x008b }
            java.lang.String r0 = "com.google.android.wearable.app.cn.UPDATE_ANDROID_WEAR"
            android.content.Intent r0 = X.C13700nu.A02(r0)     // Catch:{ NameNotFoundException -> 0x008b }
            android.content.Intent r2 = r0.setPackage(r5)     // Catch:{ NameNotFoundException -> 0x008b }
            android.content.pm.PackageManager r1 = r4.getPackageManager()     // Catch:{ NameNotFoundException -> 0x008b }
            r0 = 65536(0x10000, float:9.18355E-41)
            android.content.pm.ResolveInfo r0 = r1.resolveActivity(r2, r0)     // Catch:{ NameNotFoundException -> 0x008b }
            if (r0 != 0) goto L_0x0069
            java.lang.String r0 = "market://details"
            android.net.Uri r0 = android.net.Uri.parse(r0)     // Catch:{ NameNotFoundException -> 0x008b }
            android.net.Uri$Builder r1 = r0.buildUpon()     // Catch:{ NameNotFoundException -> 0x008b }
            java.lang.String r0 = "id"
            android.net.Uri$Builder r0 = r1.appendQueryParameter(r0, r5)     // Catch:{ NameNotFoundException -> 0x008b }
            android.net.Uri r0 = r0.build()     // Catch:{ NameNotFoundException -> 0x008b }
            android.content.Intent r2 = X.C13690nt.A0B(r0)     // Catch:{ NameNotFoundException -> 0x008b }
        L_0x0069:
            int r0 = X.AnonymousClass490.A00     // Catch:{ NameNotFoundException -> 0x008b }
            android.app.PendingIntent r4 = android.app.PendingIntent.getActivity(r4, r3, r2, r0)     // Catch:{ NameNotFoundException -> 0x008b }
            r3 = 6
            java.lang.String r0 = "Connection progress callbacks cannot be null."
            X.C13710nw.A02(r7, r0)     // Catch:{ NameNotFoundException -> 0x008b }
            r6.A08 = r7     // Catch:{ NameNotFoundException -> 0x008b }
            android.os.Handler r2 = r6.A0G     // Catch:{ NameNotFoundException -> 0x008b }
            java.util.concurrent.atomic.AtomicInteger r0 = r6.A0C     // Catch:{ NameNotFoundException -> 0x008b }
            int r1 = r0.get()     // Catch:{ NameNotFoundException -> 0x008b }
            r0 = 3
            android.os.Message r0 = r2.obtainMessage(r0, r1, r3, r4)     // Catch:{ NameNotFoundException -> 0x008b }
            r2.sendMessage(r0)     // Catch:{ NameNotFoundException -> 0x008b }
            goto L_0x008a
        L_0x0088:
            r1 = 0
            goto L_0x0024
        L_0x008a:
            return
        L_0x008b:
            r4 = 0
            r3 = 16
            java.lang.String r0 = "Connection progress callbacks cannot be null."
            X.C13710nw.A02(r7, r0)
            r6.A08 = r7
            android.os.Handler r2 = r6.A0G
            java.util.concurrent.atomic.AtomicInteger r0 = r6.A0C
            int r1 = r0.get()
            r0 = 3
            android.os.Message r0 = r2.obtainMessage(r0, r1, r3, r4)
            r2.sendMessage(r0)
            return
        L_0x00a6:
            super.A6Y(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65843Wu.A6Y(X.5Nw):void");
    }

    public final int ADl() {
        return 8600000;
    }

    public final boolean AcL() {
        return AnonymousClass000.A1P(this.A09.A01() ? 1 : 0);
    }
}
