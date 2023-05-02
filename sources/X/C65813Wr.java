package X;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* renamed from: X.3Wr  reason: invalid class name and case insensitive filesystem */
public final class C65813Wr extends C57972sH {
    public final Context A00;

    public C65813Wr(Context context, Looper looper, C15650rc r10, C15670re r11, AnonymousClass4O1 r12) {
        super(context, looper, r10, r11, r12, 45);
        this.A00 = context;
    }

    public final boolean A06() {
        return true;
    }

    public final /* bridge */ /* synthetic */ IInterface A09(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.safetynet.internal.ISafetyNetService");
        return !(queryLocalInterface instanceof C66773aT) ? new C66773aT(iBinder) : queryLocalInterface;
    }

    public final String A0A() {
        return "com.google.android.gms.safetynet.internal.ISafetyNetService";
    }

    public final String A0B() {
        return "com.google.android.gms.safetynet.service.START";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001c, code lost:
        r0 = (java.lang.String) (r0 = (r0 = r2.getApplicationInfo(r0.getPackageName(), 128)).metaData).get("com.google.android.safetynet.ATTEST_API_KEY");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String A0C() {
        /*
            r5 = this;
            java.lang.String r4 = "com.google.android.safetynet.ATTEST_API_KEY"
            java.lang.String r3 = ""
            android.content.Context r0 = r5.A00     // Catch:{ NameNotFoundException -> 0x0026 }
            android.content.pm.PackageManager r2 = r0.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0026 }
            if (r2 == 0) goto L_0x0025
            java.lang.String r1 = r0.getPackageName()     // Catch:{ NameNotFoundException -> 0x0026 }
            r0 = 128(0x80, float:1.794E-43)
            android.content.pm.ApplicationInfo r0 = r2.getApplicationInfo(r1, r0)     // Catch:{ NameNotFoundException -> 0x0026 }
            if (r0 == 0) goto L_0x0025
            android.os.Bundle r0 = r0.metaData     // Catch:{ NameNotFoundException -> 0x0026 }
            if (r0 == 0) goto L_0x0025
            java.lang.Object r0 = r0.get(r4)     // Catch:{ NameNotFoundException -> 0x0026 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ NameNotFoundException -> 0x0026 }
            if (r0 == 0) goto L_0x0025
            return r0
        L_0x0025:
            return r3
        L_0x0026:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65813Wr.A0C():java.lang.String");
    }

    public final int ADl() {
        return 12200000;
    }
}
