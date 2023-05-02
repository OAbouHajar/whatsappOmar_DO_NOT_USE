package X;

import android.os.Build;
import android.os.Process;
import android.os.UserManager;
import com.whatsapp.util.Log;

/* renamed from: X.19w  reason: invalid class name and case insensitive filesystem */
public class C229419w {
    public Boolean A00;
    public final C15900s5 A01;
    public final AnonymousClass01V A02;
    public final C16980tz A03;
    public final C15860rz A04;
    public final AnonymousClass1TZ A05;

    public C229419w(C15900s5 r1, AnonymousClass01V r2, C16980tz r3, C15860rz r4, AnonymousClass1TZ r5) {
        this.A03 = r3;
        this.A01 = r1;
        this.A02 = r2;
        this.A05 = r5;
        this.A04 = r4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x005b, code lost:
        if (r3 == null) goto L_0x005d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x005d, code lost:
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0034, code lost:
        if (230176001 != r3) goto L_0x0036;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A00(java.lang.String r8) {
        /*
            r7 = this;
            boolean r0 = r7.A01()
            if (r0 == 0) goto L_0x00c7
            X.0rz r5 = r7.A04
            X.01D r3 = r5.A01
            java.lang.Object r2 = r3.get()
            android.content.SharedPreferences r2 = (android.content.SharedPreferences) r2
            java.lang.String r1 = "fbns_token"
            r0 = 0
            java.lang.String r4 = r2.getString(r1, r0)
            java.lang.Object r2 = r3.get()
            android.content.SharedPreferences r2 = (android.content.SharedPreferences) r2
            java.lang.String r1 = "fbns_app_vers"
            r0 = 0
            int r3 = r2.getInt(r1, r0)
            r1 = 230176001(0xdb83501, float:1.1352636E-30)
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            if (r0 != 0) goto L_0x0036
            boolean r0 = r8.equals(r4)
            if (r0 == 0) goto L_0x0036
            r2 = 0
            if (r1 == r3) goto L_0x0037
        L_0x0036:
            r2 = 1
        L_0x0037:
            android.content.SharedPreferences$Editor r1 = r5.A0K()
            java.lang.String r0 = "last_server_fbns_token"
            android.content.SharedPreferences$Editor r0 = r1.putString(r0, r8)
            r0.apply()
            if (r2 == 0) goto L_0x00c2
            X.0tz r0 = r7.A03
            android.content.Context r4 = r0.A00
            java.lang.String r5 = X.AnonymousClass021.A09
            java.lang.String[] r6 = X.AnonymousClass08K.A00
            int r2 = r6.length
            r1 = 0
        L_0x0050:
            if (r1 >= r2) goto L_0x009c
            r3 = r6[r1]
            boolean r0 = X.AnonymousClass08L.A01(r4, r3)
            if (r0 == 0) goto L_0x0099
            r2 = 1
            if (r3 != 0) goto L_0x005e
        L_0x005d:
            r2 = 0
        L_0x005e:
            java.lang.String r1 = "FbnsTokenManager/requestFbnsToken fbns-enabled:"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            if (r2 == 0) goto L_0x00c7
            if (r3 == 0) goto L_0x00c7
            java.lang.String r0 = "com.facebook.rti.fbns.intent.REGISTER"
            android.content.Intent r2 = new android.content.Intent
            r2.<init>(r0)
            java.lang.String r1 = r4.getPackageName()
            java.lang.String r0 = "pkg_name"
            r2.putExtra(r0, r1)
            java.lang.String r0 = "appid"
            r2.putExtra(r0, r5)
            java.lang.String r0 = "com.facebook.services"
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L_0x009e
            java.lang.String r0 = "com.facebook.services.dev"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x00c7
            goto L_0x009e
        L_0x0099:
            int r1 = r1 + 1
            goto L_0x0050
        L_0x009c:
            r3 = 0
            goto L_0x005d
        L_0x009e:
            java.lang.String r1 = "com.facebook.oxygen.services.fbns.PreloadedFbnsService"
            android.content.ComponentName r0 = new android.content.ComponentName     // Catch:{ IllegalStateException -> 0x00b9, SecurityException -> 0x00c7, RuntimeException -> 0x00af }
            r0.<init>(r3, r1)     // Catch:{ IllegalStateException -> 0x00b9, SecurityException -> 0x00c7, RuntimeException -> 0x00af }
            r2.setComponent(r0)     // Catch:{ IllegalStateException -> 0x00b9, SecurityException -> 0x00c7, RuntimeException -> 0x00af }
            X.AnonymousClass08L.A00(r4, r2)     // Catch:{ IllegalStateException -> 0x00b9, SecurityException -> 0x00c7, RuntimeException -> 0x00af }
            r4.startService(r2)     // Catch:{ IllegalStateException -> 0x00b9, SecurityException -> 0x00c7, RuntimeException -> 0x00af }
            return
        L_0x00af:
            r2 = move-exception
            java.lang.Throwable r0 = r2.getCause()
            boolean r0 = r0 instanceof android.os.DeadObjectException
            if (r0 == 0) goto L_0x00c1
            return
        L_0x00b9:
            r2 = move-exception
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 26
            if (r1 < r0) goto L_0x00c1
            return
        L_0x00c1:
            throw r2
        L_0x00c2:
            java.lang.String r0 = "FbnsTokenManager/verifyFbnsToken no-need-to-refresh"
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x00c7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C229419w.A00(java.lang.String):void");
    }

    public boolean A01() {
        boolean booleanValue;
        UserManager A0J;
        C15900s5 r1 = this.A01;
        boolean A052 = r1.A05(C15910s6.A0M);
        boolean A053 = r1.A05(C15910s6.A0L);
        synchronized (this) {
            Boolean bool = this.A00;
            if (bool == null) {
                boolean z2 = true;
                if (Build.VERSION.SDK_INT >= 17 && (A0J = this.A02.A0J()) != null) {
                    try {
                        if (A0J.getSerialNumberForUser(Process.myUserHandle()) != 0) {
                            z2 = false;
                        }
                    } catch (Exception e2) {
                        Log.e("FbnsTokenManager/isAdminUser", e2);
                    }
                }
                bool = Boolean.valueOf(z2);
                this.A00 = bool;
            }
            booleanValue = bool.booleanValue();
        }
        if (A052) {
            return !A053 || booleanValue;
        }
        return false;
    }
}
