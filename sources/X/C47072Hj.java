package X;

import android.content.Context;
import android.util.Log;
import java.util.HashMap;

/* renamed from: X.2Hj  reason: invalid class name and case insensitive filesystem */
public class C47072Hj {
    public C91554g6 A00;
    public C109795Tr A01;
    public boolean A02;
    public final Context A03;
    public final Object A04 = new Object();
    public final boolean A05;

    public C47072Hj(Context context, boolean z2, boolean z3) {
        Context applicationContext;
        C13710nw.A01(context);
        if (z2 && (applicationContext = context.getApplicationContext()) != null) {
            context = applicationContext;
        }
        this.A03 = context;
        this.A02 = false;
        this.A05 = z3;
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0024  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0032 A[SYNTHETIC, Splitter:B:19:0x0032] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0041 A[SYNTHETIC, Splitter:B:23:0x0041] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0050 A[SYNTHETIC, Splitter:B:27:0x0050] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006a A[SYNTHETIC, Splitter:B:35:0x006a] */
    public static X.C47082Hk A00(android.content.Context r27) {
        /*
            r13 = 0
            r4 = r27
            java.lang.String r1 = "com.google.android.gms"
            r0 = 3
            android.content.Context r2 = r4.createPackageContext(r1, r0)     // Catch:{ NameNotFoundException -> 0x001e }
            if (r2 == 0) goto L_0x001e
            java.lang.String r1 = "google_ads_flags"
            r0 = 0
            android.content.SharedPreferences r6 = r2.getSharedPreferences(r1, r0)     // Catch:{ all -> 0x0014 }
            goto L_0x001f
        L_0x0014:
            r2 = move-exception
            java.lang.String r1 = "GmscoreFlag"
            java.lang.String r0 = "Error while getting SharedPreferences "
            android.util.Log.w(r1, r0, r2)
            r6 = r13
            goto L_0x001f
        L_0x001e:
            r6 = r13
        L_0x001f:
            java.lang.String r0 = "gads:ad_id_app_context:enabled"
            r5 = 0
            if (r6 != 0) goto L_0x0041
            r2 = 0
        L_0x0025:
            java.lang.String r1 = "gads:ad_id_app_context:ping_ratio"
            r0 = 0
            if (r6 != 0) goto L_0x0032
            r14 = 0
        L_0x002b:
            java.lang.String r0 = "gads:ad_id_use_shared_preference:experiment_id"
            java.lang.String r12 = ""
            if (r6 == 0) goto L_0x005d
            goto L_0x0050
        L_0x0032:
            float r14 = r6.getFloat(r1, r0)     // Catch:{ all -> 0x0037 }
            goto L_0x002b
        L_0x0037:
            r3 = move-exception
            java.lang.String r1 = "GmscoreFlag"
            java.lang.String r0 = "Error while reading from SharedPreferences "
            android.util.Log.w(r1, r0, r3)
            r14 = 0
            goto L_0x002b
        L_0x0041:
            boolean r2 = r6.getBoolean(r0, r5)     // Catch:{ all -> 0x0046 }
            goto L_0x0025
        L_0x0046:
            r2 = move-exception
            java.lang.String r1 = "GmscoreFlag"
            java.lang.String r0 = "Error while reading from SharedPreferences "
            android.util.Log.w(r1, r0, r2)
            r2 = 0
            goto L_0x0025
        L_0x0050:
            java.lang.String r12 = r6.getString(r0, r12)     // Catch:{ all -> 0x0055 }
            goto L_0x005d
        L_0x0055:
            r3 = move-exception
            java.lang.String r1 = "GmscoreFlag"
            java.lang.String r0 = "Error while reading from SharedPreferences "
            android.util.Log.w(r1, r0, r3)
        L_0x005d:
            java.lang.String r0 = "gads:ad_id_use_persistent_service:enabled"
            if (r6 != 0) goto L_0x006a
            r0 = 0
        L_0x0062:
            r20 = -1
            X.2Hj r10 = new X.2Hj
            r10.<init>(r4, r2, r0)
            goto L_0x0079
        L_0x006a:
            boolean r0 = r6.getBoolean(r0, r5)     // Catch:{ all -> 0x006f }
            goto L_0x0062
        L_0x006f:
            r3 = move-exception
            java.lang.String r1 = "GmscoreFlag"
            java.lang.String r0 = "Error while reading from SharedPreferences "
            android.util.Log.w(r1, r0, r3)
            r0 = 0
            goto L_0x0062
        L_0x0079:
            long r8 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x01ca }
            java.lang.String r7 = "Calling this from your main thread can lead to deadlock"
            X.C13710nw.A06(r7)     // Catch:{ all -> 0x01ca }
            monitor-enter(r10)     // Catch:{ all -> 0x01ca }
            boolean r0 = r10.A02     // Catch:{ all -> 0x01c7 }
            if (r0 == 0) goto L_0x008a
            r10.A01()     // Catch:{ all -> 0x01c7 }
        L_0x008a:
            android.content.Context r3 = r10.A03     // Catch:{ all -> 0x01c7 }
            boolean r4 = r10.A05     // Catch:{ all -> 0x01c7 }
            android.content.pm.PackageManager r1 = r3.getPackageManager()     // Catch:{ NameNotFoundException -> 0x01bf }
            java.lang.String r0 = "com.android.vending"
            r1.getPackageInfo(r0, r5)     // Catch:{ NameNotFoundException -> 0x01bf }
            X.3AP r1 = X.AnonymousClass3AP.A00     // Catch:{ all -> 0x01c7 }
            r0 = 12451000(0xbdfcb8, float:1.7447567E-38)
            int r1 = r1.A00(r3, r0)     // Catch:{ all -> 0x01c7 }
            if (r1 == 0) goto L_0x00ad
            r0 = 2
            if (r1 == r0) goto L_0x00ad
            java.lang.String r1 = "Google Play services not available"
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x01c7 }
            r0.<init>(r1)     // Catch:{ all -> 0x01c7 }
            throw r0     // Catch:{ all -> 0x01c7 }
        L_0x00ad:
            if (r4 == 0) goto L_0x00b0
            goto L_0x00b3
        L_0x00b0:
            java.lang.String r0 = "com.google.android.gms.ads.identifier.service.START"
            goto L_0x00b5
        L_0x00b3:
            java.lang.String r0 = "com.google.android.gms.ads.identifier.service.PERSISTENT_START"
        L_0x00b5:
            X.4g6 r4 = new X.4g6     // Catch:{ all -> 0x01c7 }
            r4.<init>()     // Catch:{ all -> 0x01c7 }
            android.content.Intent r1 = new android.content.Intent     // Catch:{ all -> 0x01c7 }
            r1.<init>(r0)     // Catch:{ all -> 0x01c7 }
            java.lang.String r0 = "com.google.android.gms"
            r1.setPackage(r0)     // Catch:{ all -> 0x01c7 }
            X.3BF r22 = X.AnonymousClass3BF.A00()     // Catch:{ all -> 0x01b8 }
            r5 = 1
            java.lang.Class r0 = r3.getClass()     // Catch:{ all -> 0x01b8 }
            java.lang.String r26 = r0.getName()     // Catch:{ all -> 0x01b8 }
            r27 = 1
            r24 = r1
            r25 = r4
            r23 = r3
            boolean r0 = r22.A02(r23, r24, r25, r26, r27)     // Catch:{ all -> 0x01b8 }
            if (r0 == 0) goto L_0x01b0
            r10.A00 = r4     // Catch:{ all -> 0x01c7 }
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ InterruptedException -> 0x01a1, all -> 0x01a9 }
            r0 = 10000(0x2710, double:4.9407E-320)
            java.lang.String r3 = "BlockingServiceConnection.getServiceWithTimeout() called on main thread"
            X.C13710nw.A06(r3)     // Catch:{ InterruptedException -> 0x01a1, all -> 0x01a9 }
            boolean r3 = r4.A00     // Catch:{ InterruptedException -> 0x01a1, all -> 0x01a9 }
            if (r3 != 0) goto L_0x0199
            r4.A00 = r5     // Catch:{ InterruptedException -> 0x01a1, all -> 0x01a9 }
            java.util.concurrent.BlockingQueue r3 = r4.A01     // Catch:{ InterruptedException -> 0x01a1, all -> 0x01a9 }
            java.lang.Object r3 = r3.poll(r0, r6)     // Catch:{ InterruptedException -> 0x01a1, all -> 0x01a9 }
            android.os.IBinder r3 = (android.os.IBinder) r3     // Catch:{ InterruptedException -> 0x01a1, all -> 0x01a9 }
            if (r3 == 0) goto L_0x0191
            java.lang.String r6 = "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService"
            android.os.IInterface r1 = r3.queryLocalInterface(r6)     // Catch:{ InterruptedException -> 0x01a1, all -> 0x01a9 }
            boolean r0 = r1 instanceof X.C109795Tr     // Catch:{ InterruptedException -> 0x01a1, all -> 0x01a9 }
            if (r0 == 0) goto L_0x0107
            X.5Tr r1 = (X.C109795Tr) r1     // Catch:{ InterruptedException -> 0x01a1, all -> 0x01a9 }
            goto L_0x010c
        L_0x0107:
            X.4h7 r1 = new X.4h7     // Catch:{ InterruptedException -> 0x01a1, all -> 0x01a9 }
            r1.<init>(r3)     // Catch:{ InterruptedException -> 0x01a1, all -> 0x01a9 }
        L_0x010c:
            r10.A01 = r1     // Catch:{ all -> 0x01c7 }
            r10.A02 = r5     // Catch:{ all -> 0x01c7 }
            monitor-exit(r10)     // Catch:{ all -> 0x01c7 }
            X.C13710nw.A06(r7)     // Catch:{ all -> 0x01ca }
            monitor-enter(r10)     // Catch:{ all -> 0x01ca }
            boolean r0 = r10.A02     // Catch:{ all -> 0x018e }
            if (r0 != 0) goto L_0x0127
            java.lang.Object r3 = r10.A04     // Catch:{ all -> 0x018e }
            monitor-enter(r3)     // Catch:{ all -> 0x018e }
            java.lang.String r1 = "AdvertisingIdClient is not connected."
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x0124 }
            r0.<init>(r1)     // Catch:{ all -> 0x0124 }
            throw r0     // Catch:{ all -> 0x0124 }
        L_0x0124:
            r1 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0124 }
            goto L_0x018d
        L_0x0127:
            X.4g6 r0 = r10.A00     // Catch:{ all -> 0x018e }
            X.C13710nw.A01(r0)     // Catch:{ all -> 0x018e }
            X.5Tr r1 = r10.A01     // Catch:{ all -> 0x018e }
            X.C13710nw.A01(r1)     // Catch:{ all -> 0x018e }
            X.4h7 r1 = (X.C92164h7) r1     // Catch:{ RemoteException -> 0x017e }
            android.os.Parcel r0 = android.os.Parcel.obtain()     // Catch:{ RemoteException -> 0x017e }
            r0.writeInterfaceToken(r6)     // Catch:{ RemoteException -> 0x017e }
            android.os.Parcel r0 = r1.A00(r5, r0)     // Catch:{ RemoteException -> 0x017e }
            java.lang.String r4 = r0.readString()     // Catch:{ RemoteException -> 0x017e }
            r0.recycle()     // Catch:{ RemoteException -> 0x017e }
            X.5Tr r3 = r10.A01     // Catch:{ RemoteException -> 0x017e }
            X.4h7 r3 = (X.C92164h7) r3     // Catch:{ RemoteException -> 0x017e }
            android.os.Parcel r1 = android.os.Parcel.obtain()     // Catch:{ RemoteException -> 0x017e }
            r1.writeInterfaceToken(r6)     // Catch:{ RemoteException -> 0x017e }
            r1.writeInt(r5)     // Catch:{ RemoteException -> 0x017e }
            r0 = 2
            android.os.Parcel r3 = r3.A00(r0, r1)     // Catch:{ RemoteException -> 0x017e }
            int r1 = r3.readInt()     // Catch:{ RemoteException -> 0x017e }
            r0 = 0
            if (r1 == 0) goto L_0x0160
            r0 = 1
        L_0x0160:
            r3.recycle()     // Catch:{ RemoteException -> 0x017e }
            X.2Hk r11 = new X.2Hk     // Catch:{ RemoteException -> 0x017e }
            r11.<init>(r4, r0)     // Catch:{ RemoteException -> 0x017e }
            monitor-exit(r10)     // Catch:{ all -> 0x018e }
            java.lang.Object r1 = r10.A04     // Catch:{ all -> 0x01ca }
            monitor-enter(r1)     // Catch:{ all -> 0x01ca }
            monitor-exit(r1)     // Catch:{ all -> 0x017b }
            long r15 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x01ca }
            long r15 = r15 - r8
            r17 = r2
            r10.A02(r11, r12, r13, r14, r15, r17)     // Catch:{ all -> 0x01ca }
            r10.A01()
            return r11
        L_0x017b:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x017b }
            goto L_0x01c9
        L_0x017e:
            r3 = move-exception
            java.lang.String r1 = "AdvertisingIdClient"
            java.lang.String r0 = "GMS remote exception "
            android.util.Log.i(r1, r0, r3)     // Catch:{ all -> 0x018e }
            java.lang.String r0 = "Remote exception"
            java.io.IOException r1 = new java.io.IOException     // Catch:{ all -> 0x018e }
            r1.<init>(r0)     // Catch:{ all -> 0x018e }
        L_0x018d:
            throw r1     // Catch:{ all -> 0x018e }
        L_0x018e:
            r0 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x018e }
            goto L_0x01c9
        L_0x0191:
            java.lang.String r1 = "Timed out waiting for the service connection"
            java.util.concurrent.TimeoutException r0 = new java.util.concurrent.TimeoutException     // Catch:{ InterruptedException -> 0x01a1, all -> 0x01a9 }
            r0.<init>(r1)     // Catch:{ InterruptedException -> 0x01a1, all -> 0x01a9 }
            throw r0     // Catch:{ InterruptedException -> 0x01a1, all -> 0x01a9 }
        L_0x0199:
            java.lang.String r1 = "Cannot call get on this connection more than once"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ InterruptedException -> 0x01a1, all -> 0x01a9 }
            r0.<init>(r1)     // Catch:{ InterruptedException -> 0x01a1, all -> 0x01a9 }
            throw r0     // Catch:{ InterruptedException -> 0x01a1, all -> 0x01a9 }
        L_0x01a1:
            java.lang.String r0 = "Interrupted exception"
            java.io.IOException r1 = new java.io.IOException     // Catch:{ all -> 0x01c7 }
            r1.<init>(r0)     // Catch:{ all -> 0x01c7 }
            goto L_0x01af
        L_0x01a9:
            r0 = move-exception
            java.io.IOException r1 = new java.io.IOException     // Catch:{ all -> 0x01c7 }
            r1.<init>(r0)     // Catch:{ all -> 0x01c7 }
        L_0x01af:
            throw r1     // Catch:{ all -> 0x01c7 }
        L_0x01b0:
            java.lang.String r1 = "Connection failure"
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x01c7 }
            r0.<init>(r1)     // Catch:{ all -> 0x01c7 }
            throw r0     // Catch:{ all -> 0x01c7 }
        L_0x01b8:
            r1 = move-exception
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x01c7 }
            r0.<init>(r1)     // Catch:{ all -> 0x01c7 }
            throw r0     // Catch:{ all -> 0x01c7 }
        L_0x01bf:
            r1 = 9
            X.2Hl r0 = new X.2Hl     // Catch:{ all -> 0x01c7 }
            r0.<init>(r1)     // Catch:{ all -> 0x01c7 }
            throw r0     // Catch:{ all -> 0x01c7 }
        L_0x01c7:
            r0 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x01c7 }
        L_0x01c9:
            throw r0     // Catch:{ all -> 0x01ca }
        L_0x01ca:
            r18 = move-exception
            r15 = r10
            r16 = r13
            r17 = r12
            r19 = r14
            r22 = r2
            r15.A02(r16, r17, r18, r19, r20, r22)     // Catch:{ all -> 0x01d8 }
            throw r18     // Catch:{ all -> 0x01d8 }
        L_0x01d8:
            r0 = move-exception
            r10.A01()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47072Hj.A00(android.content.Context):X.2Hk");
    }

    public final void A01() {
        C13710nw.A06("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            Context context = this.A03;
            if (!(context == null || this.A00 == null)) {
                try {
                    if (this.A02) {
                        AnonymousClass3BF.A00().A01(context, this.A00);
                    }
                } catch (Throwable th) {
                    Log.i("AdvertisingIdClient", "AdvertisingIdClient unbindService failed.", th);
                }
                this.A02 = false;
                this.A01 = null;
                this.A00 = null;
            }
        }
    }

    public final void A02(C47082Hk r6, String str, Throwable th, float f2, long j2, boolean z2) {
        if (Math.random() <= ((double) f2)) {
            HashMap hashMap = new HashMap();
            String str2 = "1";
            String str3 = "0";
            if (z2) {
                str3 = str2;
            }
            hashMap.put("app_context", str3);
            if (r6 != null) {
                if (!r6.A01) {
                    str2 = "0";
                }
                hashMap.put("limit_ad_tracking", str2);
                String str4 = r6.A00;
                if (str4 != null) {
                    hashMap.put("ad_id_size", Integer.toString(str4.length()));
                }
            }
            if (th != null) {
                hashMap.put("error", th.getClass().getName());
            }
            if (str != null && !str.isEmpty()) {
                hashMap.put("experiment_id", str);
            }
            hashMap.put("tag", "AdvertisingIdClient");
            hashMap.put("time_spent", Long.toString(j2));
            new C63443Ie(hashMap).start();
        }
    }

    public void finalize() {
        A01();
        super.finalize();
    }
}
