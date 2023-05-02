package com.obwhatsapp.location;

import X.AnonymousClass006;
import X.AnonymousClass01V;
import X.AnonymousClass16R;
import X.AnonymousClass1HW;
import X.AnonymousClass3CH;
import X.AnonymousClass54I;
import X.C007503l;
import X.C15860rz;
import X.C16260sj;
import X.C16440t3;
import X.C19430yQ;
import X.C210812s;
import X.C218415q;
import X.C27431Rs;
import X.C28311Vk;
import X.C42341xd;
import X.C446524y;
import X.C454828w;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.PowerManager;
import com.facebook.redex.RunnableRunnableShape10S0100000_I0_9;
import com.obwhatsapp.R;
import com.obwhatsapp.yo.yo;
import com.whatsapp.util.Log;

public class LocationSharingService extends C28311Vk implements C454828w, AnonymousClass006 {
    public static volatile boolean A0J;
    public long A00;
    public AnonymousClass16R A01;
    public C210812s A02;
    public AnonymousClass1HW A03;
    public AnonymousClass01V A04;
    public C16440t3 A05;
    public C16260sj A06;
    public C15860rz A07;
    public C19430yQ A08;
    public AnonymousClass3CH A09;
    public C27431Rs A0A;
    public boolean A0B;
    public final Handler A0C;
    public final Object A0D;
    public final Runnable A0E;
    public final Runnable A0F;
    public volatile AnonymousClass54I A0G;
    public volatile boolean A0H;
    public volatile boolean A0I;

    public LocationSharingService() {
        this(0);
        this.A0C = new Handler(Looper.getMainLooper());
        this.A0E = new RunnableRunnableShape10S0100000_I0_9((Object) this, 27);
        this.A0F = new RunnableRunnableShape10S0100000_I0_9((Object) this, 28);
    }

    public LocationSharingService(int i2) {
        this.A0D = new Object();
        this.A0B = false;
    }

    public static void A00(Context context, Intent intent) {
        if (!C446524y.A00(context, intent)) {
            C007503l A002 = C218415q.A00(context);
            A002.A0J = "other_notifications@1";
            A002.A0A(context.getString(R.string.str0e68));
            A002.A09(context.getString(R.string.str0e5f));
            Intent intent2 = new Intent();
            intent2.setClassName(context.getPackageName(), "com.obwhatsapp.location.LiveLocationPrivacyActivity");
            A002.A09 = C42341xd.A00(context, 0, intent2, 0);
            int i2 = -2;
            if (Build.VERSION.SDK_INT >= 26) {
                i2 = -1;
            }
            A002.A03 = i2;
            A002.A07.icon = yo.getNIcon(R.drawable.notifybar);
            ((NotificationManager) context.getSystemService("notification")).notify(12, A002.A01());
        }
    }

    public static void A01(Context context, C19430yQ r3) {
        if (Build.VERSION.SDK_INT < 29) {
            return;
        }
        if (r3.A0a()) {
            A00(context, new Intent(context, LocationSharingService.class).setAction("com.obwhatsapp.ShareLocationService.START_PERSISTENT_LOCATION_REPORTING"));
        } else if (A0J) {
            C446524y.A00(context, new Intent(context, LocationSharingService.class).setAction("com.obwhatsapp.ShareLocationService.STOP_LOCATION_REPORTING"));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003d, code lost:
        if (r3.A08.A0a() == false) goto L_0x003f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02() {
        /*
            r3 = this;
            boolean r0 = r3.A0H
            if (r0 != 0) goto L_0x0016
            boolean r0 = r3.A0I
            if (r0 != 0) goto L_0x0016
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 29
            if (r1 < r0) goto L_0x004b
            X.0yQ r0 = r3.A08
            boolean r0 = r0.A0a()
            if (r0 == 0) goto L_0x004b
        L_0x0016:
            java.lang.String r0 = "LocationSharingService/stopSelfIfNeeded/service not stopped: "
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r0)
            boolean r0 = r3.A0H
            r2.append(r0)
            java.lang.String r1 = "|"
            r2.append(r1)
            boolean r0 = r3.A0I
            r2.append(r0)
            r2.append(r1)
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 29
            if (r1 < r0) goto L_0x003f
            X.0yQ r0 = r3.A08
            boolean r1 = r0.A0a()
            r0 = 1
            if (r1 != 0) goto L_0x0040
        L_0x003f:
            r0 = 0
        L_0x0040:
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x004b:
            r3.stopSelf()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.location.LocationSharingService.A02():void");
    }

    public final Object generatedComponent() {
        if (this.A0G == null) {
            synchronized (this.A0D) {
                if (this.A0G == null) {
                    this.A0G = new AnonymousClass54I(this);
                }
            }
        }
        return this.A0G.generatedComponent();
    }

    public IBinder onBind(Intent intent) {
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x00ad, code lost:
        if (r0 != null) goto L_0x00af;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate() {
        /*
            r21 = this;
            java.lang.String r0 = "LocationSharingService/onCreate"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r5 = r21
            boolean r0 = r5.A0B
            if (r0 != 0) goto L_0x0072
            r0 = 1
            r5.A0B = r0
            java.lang.Object r0 = r5.generatedComponent()
            X.54H r0 = (X.AnonymousClass54H) r0
            X.2uj r0 = (X.C59132uj) r0
            X.0sX r1 = r0.A04
            X.01J r0 = r1.AP2
            java.lang.Object r0 = r0.get()
            X.0t3 r0 = (X.C16440t3) r0
            r5.A05 = r0
            X.01J r0 = r1.AOi
            java.lang.Object r0 = r0.get()
            X.01V r0 = (X.AnonymousClass01V) r0
            r5.A04 = r0
            X.01J r0 = r1.AR3
            java.lang.Object r0 = r0.get()
            X.1Rs r0 = (X.C27431Rs) r0
            r5.A0A = r0
            X.01J r0 = r1.AQh
            java.lang.Object r0 = r0.get()
            X.0rz r0 = (X.C15860rz) r0
            r5.A07 = r0
            X.01J r0 = r1.AQe
            java.lang.Object r0 = r0.get()
            X.0sj r0 = (X.C16260sj) r0
            r5.A06 = r0
            X.01J r0 = r1.A1h
            java.lang.Object r0 = r0.get()
            X.12s r0 = (X.C210812s) r0
            r5.A02 = r0
            X.01J r0 = r1.AAq
            java.lang.Object r0 = r0.get()
            X.16R r0 = (X.AnonymousClass16R) r0
            r5.A01 = r0
            X.01J r0 = r1.ADa
            java.lang.Object r0 = r0.get()
            X.0yQ r0 = (X.C19430yQ) r0
            r5.A08 = r0
            X.01J r0 = r1.AIy
            java.lang.Object r0 = r0.get()
            X.1HW r0 = (X.AnonymousClass1HW) r0
            r5.A03 = r0
        L_0x0072:
            super.onCreate()
            X.0t3 r3 = r5.A05
            X.01V r2 = r5.A04
            X.0rz r1 = r5.A07
            X.12s r15 = r5.A02
            X.16R r14 = r5.A01
            X.1HW r0 = r5.A03
            X.3CH r13 = new X.3CH
            r17 = r2
            r18 = r3
            r19 = r1
            r20 = r5
            r16 = r0
            r13.<init>(r14, r15, r16, r17, r18, r19, r20)
            r5.A09 = r13
            X.01V r0 = r13.A08     // Catch:{ RuntimeException -> 0x00bd }
            android.os.PowerManager r2 = r0.A0I()     // Catch:{ RuntimeException -> 0x00bd }
            if (r2 != 0) goto L_0x00a0
            java.lang.String r0 = "MyLocationUpdater/onCreate pm=null"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ RuntimeException -> 0x00bd }
            goto L_0x00c3
        L_0x00a0:
            android.os.PowerManager$WakeLock r0 = r13.A03     // Catch:{ RuntimeException -> 0x00bd }
            if (r0 != 0) goto L_0x00af
            r1 = 1
            java.lang.String r0 = "ShareLocationService"
            android.os.PowerManager$WakeLock r0 = X.C43421zy.A00(r2, r0, r1)     // Catch:{ RuntimeException -> 0x00bd }
            r13.A03 = r0     // Catch:{ RuntimeException -> 0x00bd }
            if (r0 == 0) goto L_0x00c3
        L_0x00af:
            boolean r0 = r0.isHeld()     // Catch:{ RuntimeException -> 0x00bd }
            if (r0 != 0) goto L_0x00c3
            android.os.PowerManager$WakeLock r2 = r13.A03     // Catch:{ RuntimeException -> 0x00bd }
            r0 = 5000(0x1388, double:2.4703E-320)
            r2.acquire(r0)     // Catch:{ RuntimeException -> 0x00bd }
            goto L_0x00c3
        L_0x00bd:
            r1 = move-exception
            java.lang.String r0 = "MyLocationUpdater/onCreate/PowerManager exception"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x00c3:
            X.0rz r0 = r13.A0A
            X.01D r0 = r0.A01
            java.lang.Object r2 = r0.get()
            android.content.SharedPreferences r2 = (android.content.SharedPreferences) r2
            java.lang.String r1 = "location_shared_duration"
            java.lang.String r0 = ""
            java.lang.String r1 = r2.getString(r1, r0)
            long r11 = java.lang.System.currentTimeMillis()
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x011f
            java.lang.String r0 = ";"
            java.lang.String[] r8 = r1.split(r0)
            int r7 = r8.length
            r10 = 0
            r6 = 0
        L_0x00e8:
            if (r6 >= r7) goto L_0x011f
            r1 = r8[r6]
            java.lang.String r0 = ","
            java.lang.String[] r9 = r1.split(r0)
            int r1 = r9.length
            r0 = 2
            if (r1 != r0) goto L_0x011c
            r0 = r9[r10]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r4 = r0.intValue()
            long r2 = (long) r4
            r0 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 * r0
            r0 = 86400000(0x5265c00, double:4.2687272E-316)
            long r2 = r2 + r0
            int r0 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r0 < 0) goto L_0x011c
            r0 = 1
            r0 = r9[r0]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r1 = r0.intValue()
            android.util.SparseIntArray r0 = r13.A04
            r0.put(r4, r1)
        L_0x011c:
            int r6 = r6 + 1
            goto L_0x00e8
        L_0x011f:
            android.os.Handler r3 = r5.A0C
            java.lang.Runnable r2 = r5.A0E
            r0 = 42000(0xa410, double:2.0751E-319)
            r3.postDelayed(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.location.LocationSharingService.onCreate():void");
    }

    public void onDestroy() {
        Log.i("LocationSharingService/onDestroy");
        C19430yQ r0 = this.A08;
        synchronized (r0.A0Q) {
            r0.A00 = 0;
        }
        stopForeground(true);
        A0J = false;
        this.A01.A08 = false;
        Handler handler = this.A0C;
        handler.removeCallbacks(this.A0E);
        handler.removeCallbacks(this.A0F);
        AnonymousClass3CH r1 = this.A09;
        r1.A05.A04(r1);
        r1.A00();
        PowerManager.WakeLock wakeLock = r1.A03;
        if (wakeLock != null && wakeLock.isHeld()) {
            r1.A03.release();
            r1.A03 = null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x0115  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x012f  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x013a  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0155  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0178  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x01f3 A[LOOP:1: B:54:0x01ed->B:56:0x01f3, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0219  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x021d  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x01e9 A[EDGE_INSN: B:86:0x01e9->B:53:0x01e9 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int onStartCommand(android.content.Intent r20, int r21, int r22) {
        /*
            r19 = this;
            java.lang.String r0 = "LocationSharingService/onStartCommand intent="
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r8 = r20
            r1.append(r8)
            java.lang.String r0 = " permission="
            r1.append(r0)
            r6 = r19
            X.0sj r0 = r6.A06
            boolean r0 = r0.A05()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.03l r3 = X.C218415q.A00(r6)
            java.lang.String r0 = "other_notifications@1"
            r3.A0J = r0
            r1 = 2131889765(0x7f120e65, float:1.9414203E38)
            java.lang.String r0 = r6.getString(r1)
            r3.A0B(r0)
            java.lang.String r0 = r6.getString(r1)
            r3.A0A(r0)
            android.content.Intent r2 = new android.content.Intent
            r2.<init>()
            java.lang.String r1 = r6.getPackageName()
            java.lang.String r0 = "com.obwhatsapp.location.LiveLocationPrivacyActivity"
            r2.setClassName(r1, r0)
            r7 = 0
            android.app.PendingIntent r0 = X.C42341xd.A00(r6, r7, r2, r7)
            r3.A09 = r0
            int r2 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            r0 = -2
            if (r2 < r1) goto L_0x0059
            r0 = -1
        L_0x0059:
            r3.A03 = r0
            X.0sj r0 = r6.A06
            boolean r0 = r0.A05()
            if (r0 == 0) goto L_0x01da
            r0 = 2131889758(0x7f120e5e, float:1.9414189E38)
            java.lang.String r0 = r6.getString(r0)
            r3.A09(r0)
            r1 = 2131232235(0x7f0805eb, float:1.8080574E38)
        L_0x0070:
            android.app.Notification r0 = r3.A07
            r0.icon = r1
            r1 = 12
            android.app.Notification r0 = r3.A01()
            r6.startForeground(r1, r0)
            r5 = 1
            A0J = r5
            X.16R r0 = r6.A01
            r0.A08 = r5
            if (r20 == 0) goto L_0x00a4
            java.lang.String r1 = r8.getAction()
            java.lang.String r0 = "com.obwhatsapp.ShareLocationService.ACTION_SEND_LOCATION_WEB_RESPONSE"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x00a0
            java.lang.String r1 = r8.getAction()
            java.lang.String r0 = "com.obwhatsapp.ShareLocationService.STOP_LOCATION_REPORTING"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00a4
            r6.A0H = r7
        L_0x00a0:
            r6.A02()
            return r5
        L_0x00a4:
            java.lang.String r2 = "duration"
            r3 = 42000(0xa410, double:2.0751E-319)
            if (r20 == 0) goto L_0x01a4
            java.lang.String r1 = r8.getAction()
            java.lang.String r0 = "com.obwhatsapp.ShareLocationService.ACTION_START_LOCATION_UPDATES_FOR_WEB"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x018b
            long r2 = r8.getLongExtra(r2, r3)
            android.os.Handler r1 = r6.A0C
            java.lang.Runnable r0 = r6.A0F
            r1.removeCallbacks(r0)
            r1.postDelayed(r0, r2)
            r6.A0I = r5
            java.lang.String r1 = "LocationSharingService/onStartCommand/start location updates; duration="
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.3CH r7 = r6.A09
            java.lang.String r6 = "web-client-updates"
        L_0x00dd:
            android.location.Location r0 = r7.A02
            r16 = 7200000(0x6ddd00, double:3.5572727E-317)
            if (r0 == 0) goto L_0x00f4
            long r3 = r0.getTime()
            r0 = 120000(0x1d4c0, double:5.9288E-319)
            long r3 = r3 + r0
            long r1 = java.lang.System.currentTimeMillis()
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0132
        L_0x00f4:
            X.16R r0 = r7.A05
            android.location.Location r3 = r0.A01(r6)
            r4 = 0
            if (r3 == 0) goto L_0x010c
            long r8 = r3.getTime()
            long r8 = r8 + r16
            long r1 = java.lang.System.currentTimeMillis()
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x010c
            r3 = r4
        L_0x010c:
            java.lang.String r0 = "MyLocationUpdater/onStartCommand/start; "
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r0)
            if (r3 != 0) goto L_0x0178
            java.lang.String r1 = "location="
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
        L_0x0123:
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            if (r3 == 0) goto L_0x0132
            r7.A01(r3)
        L_0x0132:
            long r3 = r7.A00
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x013d
            r7.A00()
        L_0x013d:
            long r3 = java.lang.System.currentTimeMillis()
            r7.A00 = r3
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            r3 = 0
            r6 = 0
        L_0x014b:
            android.util.SparseIntArray r8 = r7.A04
            int r0 = r8.size()
            r10 = 1000(0x3e8, double:4.94E-321)
            if (r6 >= r0) goto L_0x01e9
            int r14 = r8.keyAt(r6)
            int r13 = r8.get(r14)
            long r8 = (long) r14
            long r8 = r8 * r10
            r10 = 86400000(0x5265c00, double:4.2687272E-316)
            long r8 = r8 + r10
            long r10 = java.lang.System.currentTimeMillis()
            int r0 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r0 < 0) goto L_0x0170
            long r8 = (long) r13
            long r3 = r3 + r8
        L_0x016d:
            int r6 = r6 + 1
            goto L_0x014b
        L_0x0170:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r14)
            r12.add(r0)
            goto L_0x016d
        L_0x0178:
            java.lang.String r0 = "location.provider="
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = r3.getProvider()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            goto L_0x0123
        L_0x018b:
            java.lang.String r1 = r8.getAction()
            java.lang.String r0 = "com.obwhatsapp.ShareLocationService.ACTION_STOP_LOCATION_UPDATES_FOR_WEB"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x01a0
            java.lang.String r0 = "LocationSharingService/onStartCommand/stop location updates"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r6.A0I = r7
            goto L_0x00a0
        L_0x01a0:
            long r3 = r8.getLongExtra(r2, r3)
        L_0x01a4:
            android.os.Handler r1 = r6.A0C
            java.lang.Runnable r0 = r6.A0E
            r1.removeCallbacks(r0)
            r1.postDelayed(r0, r3)
            X.0t3 r0 = r6.A05
            long r0 = r0.A00()
            long r0 = r0 + r3
            r6.A00 = r0
            r6.A0H = r5
            java.lang.String r0 = "LocationSharingService/onStartCommand/start; duration="
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r0)
            r2.append(r3)
            java.lang.String r0 = "; maxEndTime="
            r2.append(r0)
            long r0 = r6.A00
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.3CH r7 = r6.A09
            java.lang.String r6 = "location-sharing-service"
            goto L_0x00dd
        L_0x01da:
            r0 = 2131889268(0x7f120c74, float:1.9413195E38)
            java.lang.String r0 = r6.getString(r0)
            r3.A09(r0)
            r1 = 2131232244(0x7f0805f4, float:1.8080592E38)
            goto L_0x0070
        L_0x01e9:
            java.util.Iterator r6 = r12.iterator()
        L_0x01ed:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0201
            java.lang.Object r0 = r6.next()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            r8.delete(r0)
            goto L_0x01ed
        L_0x0201:
            X.1HW r0 = r7.A07
            boolean r9 = r0.A05()
            X.12s r0 = r7.A06
            X.2Cv r0 = r0.A00
            boolean r6 = r0.A01()
            double r14 = r0.A00()
            boolean r0 = java.lang.Double.isNaN(r14)
            if (r0 == 0) goto L_0x021b
            r14 = 4636737291354636288(0x4059000000000000, double:100.0)
        L_0x021b:
            if (r9 != 0) goto L_0x023e
            r12 = 4629137466983448576(0x403e000000000000, double:30.0)
            if (r6 == 0) goto L_0x0232
            int r0 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r0 <= 0) goto L_0x0232
            r7.A00 = r1
        L_0x0227:
            r0 = 5000(0x1388, double:2.4703E-320)
            r6 = 3
            r17 = 1000(0x3e8, double:4.94E-321)
        L_0x022c:
            X.16R r10 = r7.A05
            r10.A04(r7)
            goto L_0x0259
        L_0x0232:
            int r0 = (r3 > r16 ? 1 : (r3 == r16 ? 0 : -1))
            if (r0 > 0) goto L_0x023e
            if (r6 != 0) goto L_0x0246
            r10 = 4624633867356078080(0x402e000000000000, double:15.0)
            int r0 = (r14 > r10 ? 1 : (r14 == r10 ? 0 : -1))
            if (r0 > 0) goto L_0x0246
        L_0x023e:
            r7.A00 = r1
            r0 = 30000(0x7530, double:1.4822E-319)
            r17 = 10000(0x2710, double:4.9407E-320)
            r6 = 0
            goto L_0x022c
        L_0x0246:
            r1 = 1800000(0x1b7740, double:8.89318E-318)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0253
            if (r6 != 0) goto L_0x0227
            int r0 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r0 > 0) goto L_0x0227
        L_0x0253:
            r17 = 5000(0x1388, double:2.4703E-320)
            r0 = 10000(0x2710, double:4.9407E-320)
            r6 = 2
            goto L_0x022c
        L_0x0259:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ IllegalArgumentException -> 0x028f }
            r8.<init>()     // Catch:{ IllegalArgumentException -> 0x028f }
            java.lang.String r2 = "MyLocationUpdater/onStartCommand/request location updates; powerSaveMode="
            r8.append(r2)     // Catch:{ IllegalArgumentException -> 0x028f }
            r8.append(r9)     // Catch:{ IllegalArgumentException -> 0x028f }
            java.lang.String r2 = "; duration="
            r8.append(r2)     // Catch:{ IllegalArgumentException -> 0x028f }
            r8.append(r3)     // Catch:{ IllegalArgumentException -> 0x028f }
            java.lang.String r2 = "; locationProviders="
            r8.append(r2)     // Catch:{ IllegalArgumentException -> 0x028f }
            r8.append(r6)     // Catch:{ IllegalArgumentException -> 0x028f }
            java.lang.String r2 = "; updateInterval="
            r8.append(r2)     // Catch:{ IllegalArgumentException -> 0x028f }
            r8.append(r0)     // Catch:{ IllegalArgumentException -> 0x028f }
            java.lang.String r2 = r8.toString()     // Catch:{ IllegalArgumentException -> 0x028f }
            com.whatsapp.util.Log.i((java.lang.String) r2)     // Catch:{ IllegalArgumentException -> 0x028f }
            r13 = 0
            java.lang.String r12 = "location-updater"
            r11 = r7
            r14 = r6
            r15 = r0
            r10.A05(r11, r12, r13, r14, r15, r17)     // Catch:{ IllegalArgumentException -> 0x028f }
            return r5
        L_0x028f:
            r1 = move-exception
            java.lang.String r0 = "MyLocationUpdater/onCreate/GPS error "
            com.whatsapp.util.Log.w(r0, r1)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.location.LocationSharingService.onStartCommand(android.content.Intent, int, int):int");
    }
}
