package X;

import android.content.Context;
import android.os.Build;

/* renamed from: X.0Vg  reason: invalid class name and case insensitive filesystem */
public final class C06320Vg {
    public static final String A00;

    static {
        String A01 = C06530Wm.A01("NetworkStateTracker");
        C18450wi.A0B(A01);
        A00 = A01;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0010, code lost:
        if (r6.isConnected() == false) goto L_0x0012;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.AnonymousClass0RR A00(android.net.ConnectivityManager r7) {
        /*
            r0 = 0
            X.C18450wi.A0H(r7, r0)
            android.net.NetworkInfo r6 = r7.getActiveNetworkInfo()
            r5 = 1
            if (r6 == 0) goto L_0x0012
            boolean r0 = r6.isConnected()
            r4 = 1
            if (r0 != 0) goto L_0x0013
        L_0x0012:
            r4 = 0
        L_0x0013:
            int r1 = android.os.Build.VERSION.SDK_INT
            r3 = 0
            r0 = 23
            if (r1 < r0) goto L_0x0036
            android.net.Network r0 = X.AnonymousClass0MR.A00(r7)     // Catch:{ SecurityException -> 0x002b }
            android.net.NetworkCapabilities r1 = X.C06260Va.A00(r7, r0)     // Catch:{ SecurityException -> 0x002b }
            if (r1 == 0) goto L_0x0036
            r0 = 16
            boolean r3 = X.C06260Va.A02(r1, r0)     // Catch:{ SecurityException -> 0x002b }
            goto L_0x0036
        L_0x002b:
            r2 = move-exception
            X.C06530Wm.A00()
            java.lang.String r1 = A00
            java.lang.String r0 = "Unable to validate active network"
            android.util.Log.e(r1, r0, r2)
        L_0x0036:
            boolean r1 = r7.isActiveNetworkMetered()
            if (r6 == 0) goto L_0x0048
            boolean r0 = r6.isRoaming()
            if (r0 != 0) goto L_0x0048
        L_0x0042:
            X.0RR r0 = new X.0RR
            r0.<init>(r4, r3, r1, r5)
            return r0
        L_0x0048:
            r5 = 0
            goto L_0x0042
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C06320Vg.A00(android.net.ConnectivityManager):X.0RR");
    }

    public static final AnonymousClass0V4 A01(Context context, AnonymousClass04d r3) {
        return Build.VERSION.SDK_INT >= 24 ? new AnonymousClass0H3(context, r3) : new AnonymousClass0H1(context, r3);
    }
}
