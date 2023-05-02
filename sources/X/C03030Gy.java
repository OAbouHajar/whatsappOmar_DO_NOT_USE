package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.util.Log;

/* renamed from: X.0Gy  reason: invalid class name and case insensitive filesystem */
public final class C03030Gy extends AnonymousClass0H2 {
    public C03030Gy(Context context, AnonymousClass04d r2) {
        super(context, r2);
    }

    public /* bridge */ /* synthetic */ Object A02() {
        int intExtra;
        Intent registerReceiver = this.A01.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver == null) {
            C06530Wm.A00();
            Log.e(C04480Ms.A00, "getInitialState - null intent received");
            return Boolean.FALSE;
        }
        boolean z2 = true;
        if (Build.VERSION.SDK_INT < 23 ? registerReceiver.getIntExtra("plugged", 0) == 0 : !((intExtra = registerReceiver.getIntExtra("status", -1)) == 2 || intExtra == 5)) {
            z2 = false;
        }
        return Boolean.valueOf(z2);
    }

    public IntentFilter A07() {
        String str;
        IntentFilter intentFilter = new IntentFilter();
        if (Build.VERSION.SDK_INT >= 23) {
            intentFilter.addAction("android.os.action.CHARGING");
            str = "android.os.action.DISCHARGING";
        } else {
            intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
            str = "android.intent.action.ACTION_POWER_DISCONNECTED";
        }
        intentFilter.addAction(str);
        return intentFilter;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0038, code lost:
        if (r3.equals(r0) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003a, code lost:
        r0 = java.lang.Boolean.FALSE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003c, code lost:
        A06(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x002a, code lost:
        if (r3.equals(r0) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002c, code lost:
        r0 = java.lang.Boolean.TRUE;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A08(android.content.Intent r5) {
        /*
            r4 = this;
            java.lang.String r3 = r5.getAction()
            if (r3 == 0) goto L_0x0020
            X.0Wm r2 = X.C06530Wm.A00()
            java.lang.String r1 = X.C04480Ms.A00
            java.lang.String r0 = "Received "
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0r(r0)
            java.lang.String r0 = X.AnonymousClass000.A0h(r3, r0)
            r2.A02(r1, r0)
            int r0 = r3.hashCode()
            switch(r0) {
                case -1886648615: goto L_0x0032;
                case -54942926: goto L_0x002f;
                case 948344062: goto L_0x0024;
                case 1019184907: goto L_0x0021;
                default: goto L_0x0020;
            }
        L_0x0020:
            return
        L_0x0021:
            java.lang.String r0 = "android.intent.action.ACTION_POWER_CONNECTED"
            goto L_0x0026
        L_0x0024:
            java.lang.String r0 = "android.os.action.CHARGING"
        L_0x0026:
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0020
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            goto L_0x003c
        L_0x002f:
            java.lang.String r0 = "android.os.action.DISCHARGING"
            goto L_0x0034
        L_0x0032:
            java.lang.String r0 = "android.intent.action.ACTION_POWER_DISCONNECTED"
        L_0x0034:
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0020
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
        L_0x003c:
            r4.A06(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03030Gy.A08(android.content.Intent):void");
    }
}
