package X;

import android.content.ContentResolver;
import android.content.Context;
import android.net.ConnectivityManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import com.facebook.redex.RunnableRunnableShape0S0300000_I0;
import com.whatsapp.util.Log;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.0wP  reason: invalid class name and case insensitive filesystem */
public class C18260wP extends C16580tI {
    public AnonymousClass1UX A00;
    public final Handler A01;
    public final C16980tz A02;
    public final AnonymousClass01D A03;
    public final AnonymousClass01D A04;
    public final AnonymousClass01D A05;
    public final Object A06 = new Object();
    public final AtomicBoolean A07 = new AtomicBoolean(false);
    public volatile AnonymousClass3LP A08;

    public C18260wP(C16980tz r3, AnonymousClass01D r4, AnonymousClass01D r5, AnonymousClass01D r6, AnonymousClass01D r7) {
        super(r7);
        this.A02 = r3;
        this.A04 = r4;
        this.A03 = r5;
        this.A05 = r6;
        this.A01 = new Handler(Looper.getMainLooper());
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0049  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A01() {
        /*
            java.lang.String r2 = X.AnonymousClass021.A0G
            r0 = 3
            r3 = 0
            r1 = 0
            android.net.TrafficStats.setThreadStatsTag(r0)     // Catch:{ IOException | SecurityException -> 0x0047, all -> 0x003a }
            java.net.URL r0 = new java.net.URL     // Catch:{ IOException | SecurityException -> 0x0047, all -> 0x003a }
            r0.<init>(r2)     // Catch:{ IOException | SecurityException -> 0x0047, all -> 0x003a }
            java.net.URLConnection r2 = r0.openConnection()     // Catch:{ IOException | SecurityException -> 0x0047, all -> 0x003a }
            java.net.HttpURLConnection r2 = (java.net.HttpURLConnection) r2     // Catch:{ IOException | SecurityException -> 0x0047, all -> 0x003a }
            r2.setInstanceFollowRedirects(r3)     // Catch:{ IOException | SecurityException -> 0x0046, all -> 0x003c }
            r0 = 10000(0x2710, float:1.4013E-41)
            r2.setConnectTimeout(r0)     // Catch:{ IOException | SecurityException -> 0x0046, all -> 0x003c }
            r2.setReadTimeout(r0)     // Catch:{ IOException | SecurityException -> 0x0046, all -> 0x003c }
            r2.setUseCaches(r3)     // Catch:{ IOException | SecurityException -> 0x0046, all -> 0x003c }
            r2.getInputStream()     // Catch:{ IOException | SecurityException -> 0x0046, all -> 0x003c }
            int r1 = r2.getResponseCode()     // Catch:{ IOException | SecurityException -> 0x0046, all -> 0x003c }
            r0 = 204(0xcc, float:2.86E-43)
            if (r1 != r0) goto L_0x002d
            goto L_0x004d
        L_0x002d:
            java.lang.String r0 = "captive portal"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ IOException | SecurityException -> 0x0046, all -> 0x003c }
            r0 = 1
            r2.disconnect()
            android.net.TrafficStats.clearThreadStatsTag()
            return r0
        L_0x003a:
            r0 = move-exception
            goto L_0x0042
        L_0x003c:
            r0 = move-exception
            if (r2 == 0) goto L_0x0042
            r2.disconnect()
        L_0x0042:
            android.net.TrafficStats.clearThreadStatsTag()
            throw r0
        L_0x0046:
            r1 = r2
        L_0x0047:
            if (r1 == 0) goto L_0x0050
            r1.disconnect()
            goto L_0x0050
        L_0x004d:
            r2.disconnect()
        L_0x0050:
            android.net.TrafficStats.clearThreadStatsTag()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18260wP.A01():boolean");
    }

    public static boolean A02(Context context) {
        int i2 = Build.VERSION.SDK_INT;
        ContentResolver contentResolver = context.getContentResolver();
        return (i2 < 17 ? Settings.System.getInt(contentResolver, "airplane_mode_on", 0) : Settings.Global.getInt(contentResolver, "airplane_mode_on", 0)) != 0;
    }

    public int A04(boolean z2) {
        return A0C() ? A05().A00() : ((C19310yE) this.A03.get()).A00(z2);
    }

    public final AnonymousClass3LP A05() {
        if (this.A08 == null) {
            synchronized (this) {
                if (this.A08 == null) {
                    this.A08 = new AnonymousClass3LP(this, (C16260sj) this.A05.get());
                }
            }
        }
        return this.A08;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0029, code lost:
        if (r2 != 2) goto L_0x002b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass1UW A06() {
        /*
            r13 = this;
            boolean r0 = r13.A0C()
            r9 = 1
            if (r0 == 0) goto L_0x00b3
            X.3LP r3 = r13.A05()
            int r2 = r3.A00()
            X.01D r0 = r13.A05
            java.lang.Object r1 = r0.get()
            X.0sj r1 = (X.C16260sj) r1
            java.lang.String r0 = "android.permission.READ_PHONE_STATE"
            int r0 = r1.A03(r0)
            if (r0 != 0) goto L_0x009c
            int r4 = r3.A01()
        L_0x0023:
            r5 = 1
            if (r2 == r9) goto L_0x002b
            r5 = 0
            r0 = 2
            r6 = 1
            if (r2 == r0) goto L_0x002c
        L_0x002b:
            r6 = 0
        L_0x002c:
            boolean r7 = r3.A05()
            r0 = 3
            if (r2 != r0) goto L_0x008e
            r8 = 1
            java.lang.String r2 = "ROAMING"
        L_0x0036:
            switch(r4) {
                case 1: goto L_0x0052;
                case 2: goto L_0x0055;
                case 3: goto L_0x0058;
                case 4: goto L_0x005b;
                case 5: goto L_0x005e;
                case 6: goto L_0x0061;
                case 7: goto L_0x0064;
                case 8: goto L_0x0067;
                case 9: goto L_0x006a;
                case 10: goto L_0x006d;
                case 11: goto L_0x0070;
                case 12: goto L_0x0073;
                case 13: goto L_0x0076;
                case 14: goto L_0x0079;
                case 15: goto L_0x007c;
                case 16: goto L_0x007f;
                case 17: goto L_0x0082;
                case 18: goto L_0x0085;
                case 19: goto L_0x0088;
                case 20: goto L_0x008b;
                default: goto L_0x0039;
            }
        L_0x0039:
            java.lang.String r0 = "UNDEFINED("
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r4)
            java.lang.String r0 = ")"
            r1.append(r0)
            java.lang.String r3 = r1.toString()
        L_0x004c:
            X.1UW r1 = new X.1UW
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            return r1
        L_0x0052:
            java.lang.String r3 = "GPRS"
            goto L_0x004c
        L_0x0055:
            java.lang.String r3 = "EDGE"
            goto L_0x004c
        L_0x0058:
            java.lang.String r3 = "UMTS"
            goto L_0x004c
        L_0x005b:
            java.lang.String r3 = "CDMA"
            goto L_0x004c
        L_0x005e:
            java.lang.String r3 = "EVDO_0"
            goto L_0x004c
        L_0x0061:
            java.lang.String r3 = "EVDO_A"
            goto L_0x004c
        L_0x0064:
            java.lang.String r3 = "1xRTT"
            goto L_0x004c
        L_0x0067:
            java.lang.String r3 = "HSDPA"
            goto L_0x004c
        L_0x006a:
            java.lang.String r3 = "HSUPA"
            goto L_0x004c
        L_0x006d:
            java.lang.String r3 = "HSPA"
            goto L_0x004c
        L_0x0070:
            java.lang.String r3 = "IDEN"
            goto L_0x004c
        L_0x0073:
            java.lang.String r3 = "EVDO_B"
            goto L_0x004c
        L_0x0076:
            java.lang.String r3 = "LTE"
            goto L_0x004c
        L_0x0079:
            java.lang.String r3 = "EHRPD"
            goto L_0x004c
        L_0x007c:
            java.lang.String r3 = "HSPAP"
            goto L_0x004c
        L_0x007f:
            java.lang.String r3 = "GSM"
            goto L_0x004c
        L_0x0082:
            java.lang.String r3 = "TD_SCDMA"
            goto L_0x004c
        L_0x0085:
            java.lang.String r3 = "IWLAN"
            goto L_0x004c
        L_0x0088:
            java.lang.String r3 = "LTE_CA"
            goto L_0x004c
        L_0x008b:
            java.lang.String r3 = "NR"
            goto L_0x004c
        L_0x008e:
            r8 = 0
            if (r2 == 0) goto L_0x0099
            if (r2 == r9) goto L_0x0096
            java.lang.String r2 = "CELLULAR"
            goto L_0x0036
        L_0x0096:
            java.lang.String r2 = "WIFI"
            goto L_0x0036
        L_0x0099:
            java.lang.String r2 = "NONE"
            goto L_0x0036
        L_0x009c:
            X.01D r0 = r13.A03
            java.lang.Object r0 = r0.get()
            X.0yE r0 = (X.C19310yE) r0
            android.net.NetworkInfo r0 = r0.A01()
            if (r0 == 0) goto L_0x00b0
            int r4 = r0.getSubtype()
            goto L_0x0023
        L_0x00b0:
            r4 = 0
            goto L_0x0023
        L_0x00b3:
            X.01D r0 = r13.A03
            java.lang.Object r0 = r0.get()
            X.0yE r0 = (X.C19310yE) r0
            android.net.NetworkInfo r1 = r0.A01()
            if (r1 == 0) goto L_0x00ea
            int r0 = r1.getType()
            if (r0 == r9) goto L_0x00c8
            r9 = 0
        L_0x00c8:
            int r0 = r1.getType()
            r10 = 0
            if (r0 != 0) goto L_0x00d0
            r10 = 1
        L_0x00d0:
            int r8 = r1.getSubtype()
            boolean r11 = r1.isConnected()
            boolean r12 = r1.isRoaming()
            java.lang.String r6 = r1.getTypeName()
            java.lang.String r7 = r1.getSubtypeName()
            X.1UW r5 = new X.1UW
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            return r5
        L_0x00ea:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18260wP.A06():X.1UW");
    }

    public void A07() {
        AnonymousClass1UW A062 = A06();
        this.A01.post(new RunnableRunnableShape0S0300000_I0(this, AnonymousClass1UX.A00(A062, ((C16440t3) this.A04.get()).A00()), A062, 32));
    }

    public void A08(AnonymousClass1UW r3) {
        this.A07.set(true);
        A05().A03(r3);
    }

    public void A09(AnonymousClass1UX r3) {
        synchronized (this.A06) {
            this.A00 = r3;
        }
        for (C18000vz AP4 : A01()) {
            AP4.AP4(r3);
        }
    }

    public boolean A0A() {
        return A0C() ? A05().A05() : ((C19310yE) this.A03.get()).A02();
    }

    public boolean A0B() {
        return A0C() ? A05().A04() : ((C19310yE) this.A03.get()).A03();
    }

    public boolean A0C() {
        return Build.VERSION.SDK_INT >= 29 && this.A07.get();
    }

    public boolean A0D(ConnectivityManager connectivityManager, TelephonyManager telephonyManager) {
        if (connectivityManager != null) {
            try {
                AnonymousClass3LP A052 = A05();
                connectivityManager.registerDefaultNetworkCallback(A052);
                A052.A02(connectivityManager, telephonyManager);
                return true;
            } catch (RuntimeException e2) {
                Log.e("ConnectivityStateProvider/registerForNetworkCallbacks", e2);
            }
        }
        return false;
    }
}
