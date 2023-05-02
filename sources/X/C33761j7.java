package X;

import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.os.Build;
import android.os.PowerManager;

/* renamed from: X.1j7  reason: invalid class name and case insensitive filesystem */
public final class C33761j7 extends BroadcastReceiver {
    public static boolean A04;
    public static final C33761j7 A05 = new C33761j7();
    public AnonymousClass01V A00;
    public C19490yW A01;
    public final Object A02 = new Object();
    public volatile boolean A03 = false;

    public static boolean A00(AnonymousClass01V r2) {
        AnonymousClass01V.A0P = true;
        PowerManager A0I = r2.A0I();
        KeyguardManager A07 = r2.A07();
        AnonymousClass01V.A0P = false;
        if (A0I == null || !A0I.isScreenOn()) {
            return false;
        }
        return "xiaomi".equalsIgnoreCase(Build.MANUFACTURER) || !A07.isKeyguardLocked() || !A07.inKeyguardRestrictedInputMode();
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onReceive(android.content.Context r6, android.content.Intent r7) {
        /*
            r5 = this;
            boolean r0 = r5.A03
            if (r0 != 0) goto L_0x002f
            java.lang.Object r2 = r5.A02
            monitor-enter(r2)
            boolean r0 = r5.A03     // Catch:{ all -> 0x002c }
            if (r0 != 0) goto L_0x002a
            java.lang.Object r1 = X.AnonymousClass2IF.A01(r6)     // Catch:{ all -> 0x002c }
            X.01F r1 = (X.AnonymousClass01F) r1     // Catch:{ all -> 0x002c }
            X.0sX r1 = (X.C16150sX) r1     // Catch:{ all -> 0x002c }
            X.01J r0 = r1.AOi     // Catch:{ all -> 0x002c }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x002c }
            X.01V r0 = (X.AnonymousClass01V) r0     // Catch:{ all -> 0x002c }
            r5.A00 = r0     // Catch:{ all -> 0x002c }
            X.01J r0 = r1.ALQ     // Catch:{ all -> 0x002c }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x002c }
            X.0yW r0 = (X.C19490yW) r0     // Catch:{ all -> 0x002c }
            r5.A01 = r0     // Catch:{ all -> 0x002c }
            r0 = 1
            r5.A03 = r0     // Catch:{ all -> 0x002c }
        L_0x002a:
            monitor-exit(r2)     // Catch:{ all -> 0x002c }
            goto L_0x002f
        L_0x002c:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x002c }
            throw r0
        L_0x002f:
            boolean r3 = A04
            java.lang.String r1 = r7.getAction()
            r4 = 1
            if (r1 == 0) goto L_0x003f
            int r0 = r1.hashCode()
            switch(r0) {
                case -2128145023: goto L_0x008b;
                case -1454123155: goto L_0x0080;
                case 823795052: goto L_0x0074;
                default: goto L_0x003f;
            }
        L_0x003f:
            java.lang.String r2 = "unknown"
        L_0x0042:
            X.01V r0 = r5.A00
            boolean r0 = A00(r0)
            r4 = r4 ^ r0
            A04 = r4
            java.lang.String r0 = "ScreenLockReceiver; tag="
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r2)
            java.lang.String r0 = "; locked="
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = "; oldLocked="
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.0yW r1 = r5.A01
            boolean r0 = A04
            r1.A04(r0)
            return
        L_0x0074:
            java.lang.String r0 = "android.intent.action.USER_PRESENT"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x003f
            java.lang.String r2 = "unlock"
            goto L_0x0042
        L_0x0080:
            java.lang.String r0 = "android.intent.action.SCREEN_ON"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x003f
            java.lang.String r2 = "on"
            goto L_0x0042
        L_0x008b:
            java.lang.String r0 = "android.intent.action.SCREEN_OFF"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x003f
            java.lang.String r2 = "off"
            goto L_0x0042
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C33761j7.onReceive(android.content.Context, android.content.Intent):void");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ScreenLockReceiver{locked=");
        sb.append(A04);
        sb.append('}');
        return sb.toString();
    }
}
