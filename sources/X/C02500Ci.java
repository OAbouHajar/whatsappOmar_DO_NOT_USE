package X;

import android.content.IntentFilter;

/* renamed from: X.0Ci  reason: invalid class name and case insensitive filesystem */
public class C02500Ci extends C05510Rv {
    public final AnonymousClass0OY A00;
    public final /* synthetic */ AnonymousClass06G A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C02500Ci(AnonymousClass06G r1, AnonymousClass0OY r2) {
        super(r1);
        this.A01 = r1;
        this.A00 = r2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0102  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A00() {
        /*
            r24 = this;
            r0 = r24
            X.0OY r5 = r0.A00
            X.0Nq r4 = r5.A02
            long r6 = r4.A00
            long r1 = java.lang.System.currentTimeMillis()
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x00d1
            android.content.Context r6 = r5.A00
            java.lang.String r3 = "android.permission.ACCESS_COARSE_LOCATION"
            int r2 = android.os.Process.myPid()
            int r1 = android.os.Process.myUid()
            java.lang.String r0 = r6.getPackageName()
            int r0 = X.AnonymousClass0LQ.A00(r6, r3, r0, r2, r1)
            r7 = 0
            if (r0 != 0) goto L_0x003e
            java.lang.String r2 = "network"
            android.location.LocationManager r1 = r5.A01     // Catch:{ Exception -> 0x0036 }
            boolean r0 = r1.isProviderEnabled(r2)     // Catch:{ Exception -> 0x0036 }
            if (r0 == 0) goto L_0x003e
            android.location.Location r7 = r1.getLastKnownLocation(r2)     // Catch:{ Exception -> 0x0036 }
            goto L_0x003e
        L_0x0036:
            r2 = move-exception
            java.lang.String r1 = "TwilightManager"
            java.lang.String r0 = "Failed to get last known location"
            android.util.Log.d(r1, r0, r2)
        L_0x003e:
            java.lang.String r3 = "android.permission.ACCESS_FINE_LOCATION"
            int r2 = android.os.Process.myPid()
            int r1 = android.os.Process.myUid()
            java.lang.String r0 = r6.getPackageName()
            int r0 = X.AnonymousClass0LQ.A00(r6, r3, r0, r2, r1)
            if (r0 != 0) goto L_0x00de
            java.lang.String r2 = "gps"
            android.location.LocationManager r1 = r5.A01     // Catch:{ Exception -> 0x00d6 }
            boolean r0 = r1.isProviderEnabled(r2)     // Catch:{ Exception -> 0x00d6 }
            if (r0 == 0) goto L_0x00de
            android.location.Location r3 = r1.getLastKnownLocation(r2)     // Catch:{ Exception -> 0x00d6 }
            if (r3 == 0) goto L_0x00de
            if (r7 == 0) goto L_0x0070
            long r5 = r3.getTime()
            long r1 = r7.getTime()
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0071
        L_0x0070:
            r7 = r3
        L_0x0071:
            long r15 = java.lang.System.currentTimeMillis()
            X.0Pg r8 = X.C05100Pg.A03
            if (r8 != 0) goto L_0x0080
            X.0Pg r8 = new X.0Pg
            r8.<init>()
            X.C05100Pg.A03 = r8
        L_0x0080:
            r22 = 86400000(0x5265c00, double:4.2687272E-316)
            long r13 = r15 - r22
            double r9 = r7.getLatitude()
            double r11 = r7.getLongitude()
            r8.A00(r9, r11, r13)
            double r11 = r7.getLatitude()
            double r13 = r7.getLongitude()
            r10 = r8
            r10.A00(r11, r13, r15)
            int r1 = r8.A00
            r0 = 1
            boolean r9 = X.AnonymousClass000.A1R(r1, r0)
            long r2 = r8.A01
            long r0 = r8.A02
            long r22 = r22 + r15
            double r18 = r7.getLatitude()
            double r20 = r7.getLongitude()
            r17 = r8
            r17.A00(r18, r20, r22)
            long r7 = r8.A01
            r5 = 0
            r11 = -1
            int r10 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r10 == 0) goto L_0x0102
            int r10 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r10 == 0) goto L_0x0102
            int r10 = (r15 > r0 ? 1 : (r15 == r0 ? 0 : -1))
            if (r10 <= 0) goto L_0x00fa
            long r5 = r5 + r7
        L_0x00c9:
            r0 = 60000(0xea60, double:2.9644E-319)
            long r5 = r5 + r0
        L_0x00cd:
            r4.A01 = r9
            r4.A00 = r5
        L_0x00d1:
            boolean r0 = r4.A01
            if (r0 == 0) goto L_0x0107
            goto L_0x00f8
        L_0x00d6:
            r2 = move-exception
            java.lang.String r1 = "TwilightManager"
            java.lang.String r0 = "Failed to get last known location"
            android.util.Log.d(r1, r0, r2)
        L_0x00de:
            if (r7 != 0) goto L_0x0071
            java.lang.String r1 = "TwilightManager"
            java.lang.String r0 = "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values."
            android.util.Log.i(r1, r0)
            java.util.Calendar r1 = java.util.Calendar.getInstance()
            r0 = 11
            int r1 = r1.get(r0)
            r0 = 6
            if (r1 < r0) goto L_0x00f8
            r0 = 22
            if (r1 < r0) goto L_0x0107
        L_0x00f8:
            r0 = 2
            return r0
        L_0x00fa:
            int r7 = (r15 > r2 ? 1 : (r15 == r2 ? 0 : -1))
            if (r7 <= 0) goto L_0x0100
            long r5 = r5 + r0
            goto L_0x00c9
        L_0x0100:
            long r5 = r5 + r2
            goto L_0x00c9
        L_0x0102:
            r5 = 43200000(0x2932e00, double:2.1343636E-316)
            long r5 = r5 + r15
            goto L_0x00cd
        L_0x0107:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C02500Ci.A00():int");
    }

    public IntentFilter A01() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.TIME_SET");
        intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
        intentFilter.addAction("android.intent.action.TIME_TICK");
        return intentFilter;
    }

    public void A04() {
        this.A01.A0V(true);
    }
}
