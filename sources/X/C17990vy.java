package X;

import com.whatsapp.fieldstats.events.WamCall;
import java.util.Set;

/* renamed from: X.0vy  reason: invalid class name and case insensitive filesystem */
public class C17990vy implements C18000vz {
    public long A00;
    public WamCall A01;
    public final C16040sK A02;
    public final C18260wP A03;
    public final AnonymousClass01V A04;
    public final C16980tz A05;
    public final C19070xi A06;
    public final C226318r A07;
    public final C17020u3 A08;
    public final Set A09;

    public C17990vy(C16040sK r1, C18260wP r2, AnonymousClass01V r3, C16980tz r4, C19070xi r5, C226318r r6, C17020u3 r7, Set set) {
        this.A05 = r4;
        this.A02 = r1;
        this.A06 = r5;
        this.A04 = r3;
        this.A07 = r6;
        this.A08 = r7;
        this.A03 = r2;
        this.A09 = set;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x01b1, code lost:
        if ("com.google.android.packageinstaller".equals("com.android.vending") != false) goto L_0x01b3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A00(long r10) {
        /*
            r9 = this;
            r9.A00 = r10
            X.01V r2 = r9.A04
            android.telephony.TelephonyManager r3 = r2.A0N()
            if (r3 == 0) goto L_0x0067
            int r1 = r3.getPhoneType()
            r0 = 1
            if (r1 != r0) goto L_0x0067
            java.lang.String r3 = r3.getNetworkOperator()
            if (r3 == 0) goto L_0x0067
            int r1 = r3.length()
            r0 = 5
            if (r1 < r0) goto L_0x0067
            r0 = 6
            if (r1 > r0) goto L_0x0067
            r0 = 0
            r1 = 3
            java.lang.String r0 = r3.substring(r0, r1)
            java.lang.String r1 = r3.substring(r1)
            r5 = 0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ NumberFormatException -> 0x0035 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r1)     // Catch:{ NumberFormatException -> 0x0035 }
            goto L_0x003d
        L_0x0035:
            r1 = move-exception
            java.lang.String r0 = "error parsing mcc/mnc"
            com.whatsapp.util.Log.w(r0, r1)
            r6 = r5
            r0 = r5
        L_0x003d:
            X.18r r3 = r9.A07
            if (r0 != 0) goto L_0x015c
            r4 = r5
        L_0x0042:
            r1 = 5
            r0 = 0
            r3.A02(r4, r1, r0)
            r0 = 1
            r3.A02(r4, r1, r0)
            r0 = 2
            r3.A02(r4, r1, r0)
            if (r6 == 0) goto L_0x005a
            int r0 = r6.intValue()
            long r0 = (long) r0
            java.lang.Long r5 = java.lang.Long.valueOf(r0)
        L_0x005a:
            r1 = 3
            r0 = 0
            r3.A02(r5, r1, r0)
            r0 = 1
            r3.A02(r5, r1, r0)
            r0 = 2
            r3.A02(r5, r1, r0)
        L_0x0067:
            X.18r r4 = r9.A07
            r0 = 2
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            r1 = 11
            r0 = 0
            r4.A02(r3, r1, r0)
            r0 = 1
            r4.A02(r3, r1, r0)
            r0 = 2
            r4.A02(r3, r1, r0)
            java.lang.String r5 = "2.23.1.76"
            r1 = 17
            r0 = 0
            r4.A02(r5, r1, r0)
            r0 = 1
            r4.A02(r5, r1, r0)
            r0 = 2
            r4.A02(r5, r1, r0)
            java.lang.String r5 = android.os.Build.VERSION.RELEASE
            r1 = 15
            r0 = 0
            r4.A02(r5, r1, r0)
            r0 = 1
            r4.A02(r5, r1, r0)
            r0 = 2
            r4.A02(r5, r1, r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r6 = android.os.Build.MANUFACTURER
            r1.append(r6)
            java.lang.String r0 = "-"
            r1.append(r0)
            java.lang.String r5 = android.os.Build.MODEL
            r1.append(r5)
            java.lang.String r7 = r1.toString()
            r1 = 13
            r0 = 0
            r4.A02(r7, r1, r0)
            r0 = 1
            r4.A02(r7, r1, r0)
            r0 = 2
            r4.A02(r7, r1, r0)
            int r0 = X.C29601at.A00(r2)
            long r0 = (long) r0
            java.lang.Long r7 = java.lang.Long.valueOf(r0)
            r1 = 655(0x28f, float:9.18E-43)
            r0 = 0
            r4.A02(r7, r1, r0)
            r0 = 1
            r4.A02(r7, r1, r0)
            r0 = 2
            r4.A02(r7, r1, r0)
            X.0u3 r8 = r9.A08
            int r0 = X.C42971z5.A01(r2, r8)
            long r0 = (long) r0
            java.lang.Long r7 = java.lang.Long.valueOf(r0)
            r1 = 689(0x2b1, float:9.65E-43)
            r0 = 0
            r4.A02(r7, r1, r0)
            r0 = 1
            r4.A02(r7, r1, r0)
            r0 = 2
            r4.A02(r7, r1, r0)
            int r0 = X.C42971z5.A02(r2, r8)
            long r0 = (long) r0
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
            r1 = 2617(0xa39, float:3.667E-42)
            r0 = 0
            r4.A02(r2, r1, r0)
            r0 = 1
            r4.A02(r2, r1, r0)
            r0 = 2
            r4.A02(r2, r1, r0)
            java.lang.String r2 = android.os.Build.DEVICE
            r1 = 495(0x1ef, float:6.94E-43)
            r0 = 0
            r4.A02(r2, r1, r0)
            r0 = 1
            r4.A02(r2, r1, r0)
            r1 = 287(0x11f, float:4.02E-43)
            r0 = 0
            r4.A02(r6, r1, r0)
            r0 = 1
            r4.A02(r6, r1, r0)
            r1 = 289(0x121, float:4.05E-43)
            r0 = 0
            r4.A02(r5, r1, r0)
            r0 = 1
            r4.A02(r5, r1, r0)
            r0 = 0
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
            r1 = 21
            r4.A02(r2, r1, r0)
            r0 = 1
            r4.A02(r2, r1, r0)
            r0 = 2
            r4.A02(r2, r1, r0)
            r0 = 4
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            r1 = 1657(0x679, float:2.322E-42)
            r0 = 0
            r4.A02(r2, r1, r0)
            r0 = 1
            r4.A02(r2, r1, r0)
            r0 = 2
            r4.A02(r2, r1, r0)
            r1 = 1659(0x67b, float:2.325E-42)
            r0 = 0
            r4.A02(r3, r1, r0)
            r0 = 1
            r4.A02(r3, r1, r0)
            X.0xi r5 = r9.A06
            monitor-enter(r5)
            goto L_0x0167
        L_0x015c:
            int r0 = r0.intValue()
            long r0 = (long) r0
            java.lang.Long r4 = java.lang.Long.valueOf(r0)
            goto L_0x0042
        L_0x0167:
            android.content.SharedPreferences r2 = r5.A01     // Catch:{ all -> 0x0233 }
            java.lang.String r1 = "ab_props:sys:config_key"
            r0 = 0
            java.lang.String r2 = r2.getString(r1, r0)     // Catch:{ all -> 0x0233 }
            monitor-exit(r5)
            r1 = 4473(0x1179, float:6.268E-42)
            r0 = 0
            r4.A02(r2, r1, r0)
            r0 = 1
            r4.A02(r2, r1, r0)
            X.0tz r0 = r9.A05
            android.content.Context r3 = r0.A00
            long r0 = X.AnonymousClass2CE.A00(r3)
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
            r1 = 6251(0x186b, float:8.76E-42)
            r0 = 0
            r4.A02(r2, r1, r0)
            r0 = 1
            r4.A02(r2, r1, r0)
            r0 = 2
            r4.A02(r2, r1, r0)
            android.content.pm.PackageManager r1 = r3.getPackageManager()
            java.lang.String r0 = r3.getPackageName()
            java.lang.String r1 = "com.android.vending"
            if (r1 != 0) goto L_0x01a2
            goto L_0x01b9
        L_0x01a2:
            java.lang.String r0 = "com.android.vending"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x01b3
            java.lang.String r0 = "com.google.android.packageinstaller"
            boolean r1 = r0.equals(r1)
            r0 = 0
            if (r1 == 0) goto L_0x01b4
        L_0x01b3:
            r0 = 1
        L_0x01b4:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
            goto L_0x01ba
        L_0x01b9:
            r2 = 0
        L_0x01ba:
            r1 = 10255(0x280f, float:1.437E-41)
            r0 = 0
            r4.A02(r2, r1, r0)
            r0 = 1
            r4.A02(r2, r1, r0)
            java.lang.String r2 = r5.A01()
            r1 = 5029(0x13a5, float:7.047E-42)
            r0 = 0
            r4.A02(r2, r1, r0)
            r0 = 1
            r4.A02(r2, r1, r0)
            r0 = 2
            r4.A02(r2, r1, r0)
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 17
            if (r1 < r0) goto L_0x01f3
            X.2CF r0 = X.C26791Pe.A02(r3)
            if (r0 == 0) goto L_0x01f3
            int r0 = r0.A00
            long r0 = (long) r0
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
            r1 = 12017(0x2ef1, float:1.684E-41)
            r0 = 0
            r4.A02(r2, r1, r0)
            r0 = 1
            r4.A02(r2, r1, r0)
        L_0x01f3:
            X.0sK r3 = r9.A02
            boolean r0 = r3.A0G()
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
            r1 = 12027(0x2efb, float:1.6853E-41)
            r0 = 0
            r4.A02(r2, r1, r0)
            r0 = 1
            r4.A02(r2, r1, r0)
            r3.A0B()
            com.obwhatsapp.Me r0 = r3.A00
            if (r0 == 0) goto L_0x021c
            java.lang.String r1 = r0.cc
            java.lang.String r0 = r0.number
            java.lang.String r2 = X.C18160wF.A01(r1, r0)
            r1 = 6833(0x1ab1, float:9.575E-42)
            r0 = 2
            r4.A02(r2, r1, r0)
        L_0x021c:
            java.util.Set r0 = r9.A09
            java.util.Iterator r1 = r0.iterator()
        L_0x0222:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0232
            java.lang.Object r0 = r1.next()
            X.0s7 r0 = (X.AnonymousClass0s7) r0
            r0.ARG()
            goto L_0x0222
        L_0x0232:
            return
        L_0x0233:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C17990vy.A00(long):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0007, code lost:
        if (r5.A06 == false) goto L_0x0009;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01(X.AnonymousClass1UW r5) {
        /*
            r4 = this;
            X.18r r3 = r4.A07
            if (r5 == 0) goto L_0x0009
            boolean r1 = r5.A06
            r0 = 1
            if (r1 != 0) goto L_0x000a
        L_0x0009:
            r0 = 0
        L_0x000a:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
            r1 = 23
            r0 = 0
            r3.A02(r2, r1, r0)
            r0 = 1
            r3.A02(r2, r1, r0)
            java.lang.Integer r2 = X.AnonymousClass2CG.A00(r5)
            r1 = 105(0x69, float:1.47E-43)
            r0 = 0
            r3.A02(r2, r1, r0)
            r0 = 1
            r3.A02(r2, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C17990vy.A01(X.1UW):void");
    }

    public void AP4(AnonymousClass1UX r2) {
        A01(this.A03.A06());
    }
}
