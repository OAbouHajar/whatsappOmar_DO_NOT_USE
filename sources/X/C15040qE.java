package X;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.0qE  reason: invalid class name and case insensitive filesystem */
public class C15040qE {
    public static boolean A00;
    public static boolean A01;
    public static final AtomicBoolean A02 = new AtomicBoolean();
    public static final AtomicBoolean A03 = new AtomicBoolean();

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x006e, code lost:
        if (r0.booleanValue() != false) goto L_0x0070;
     */
    @java.lang.Deprecated
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int A00(android.content.Context r10, int r11) {
        /*
            java.lang.String r3 = "GooglePlayServicesUtil"
            android.content.res.Resources r1 = r10.getResources()     // Catch:{ all -> 0x000d }
            r0 = 2131893293(0x7f121c2d, float:1.9421358E38)
            r1.getString(r0)     // Catch:{ all -> 0x000d }
            goto L_0x0012
        L_0x000d:
            java.lang.String r0 = "The Google Play services resources were not found. Check your project configuration to ensure that the resources are included."
            android.util.Log.e(r3, r0)
        L_0x0012:
            java.lang.String r0 = r10.getPackageName()
            java.lang.String r8 = "com.google.android.gms"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x003d
            java.util.concurrent.atomic.AtomicBoolean r0 = A03
            boolean r0 = r0.get()
            if (r0 != 0) goto L_0x003d
            int r1 = X.AnonymousClass4Z5.A00(r10)
            if (r1 == 0) goto L_0x0037
            r0 = 12451000(0xbdfcb8, float:1.7447567E-38)
            if (r1 == r0) goto L_0x003d
            com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException r0 = new com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException
            r0.<init>(r1)
            throw r0
        L_0x0037:
            com.google.android.gms.common.GooglePlayServicesMissingManifestValueException r0 = new com.google.android.gms.common.GooglePlayServicesMissingManifestValueException
            r0.<init>()
            throw r0
        L_0x003d:
            boolean r0 = X.C89794cv.A01(r10)
            r5 = 1
            r7 = 0
            if (r0 != 0) goto L_0x0070
            java.lang.Boolean r0 = X.C89794cv.A02
            if (r0 != 0) goto L_0x0069
            android.content.pm.PackageManager r1 = r10.getPackageManager()
            java.lang.String r0 = "android.hardware.type.iot"
            boolean r0 = r1.hasSystemFeature(r0)
            r2 = 1
            if (r0 != 0) goto L_0x0063
            android.content.pm.PackageManager r1 = r10.getPackageManager()
            java.lang.String r0 = "android.hardware.type.embedded"
            boolean r0 = r1.hasSystemFeature(r0)
            if (r0 != 0) goto L_0x0063
            r2 = 0
        L_0x0063:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            X.C89794cv.A02 = r0
        L_0x0069:
            boolean r0 = r0.booleanValue()
            r2 = 1
            if (r0 == 0) goto L_0x0071
        L_0x0070:
            r2 = 0
        L_0x0071:
            if (r11 < 0) goto L_0x0150
            java.lang.String r4 = r10.getPackageName()
            android.content.pm.PackageManager r6 = r10.getPackageManager()
            if (r2 == 0) goto L_0x0086
            java.lang.String r1 = "com.android.vending"
            r0 = 8256(0x2040, float:1.1569E-41)
            android.content.pm.PackageInfo r1 = r6.getPackageInfo(r1, r0)     // Catch:{ NameNotFoundException -> 0x00d6 }
            goto L_0x0087
        L_0x0086:
            r1 = 0
        L_0x0087:
            r0 = 64
            android.content.pm.PackageInfo r9 = r6.getPackageInfo(r8, r0)     // Catch:{ NameNotFoundException -> 0x0142 }
            X.C89894d7.A00(r10)
            boolean r0 = X.C89894d7.A01(r9, r5)
            if (r0 != 0) goto L_0x0097
            goto L_0x00c8
        L_0x0097:
            if (r2 == 0) goto L_0x00e6
            X.C13710nw.A01(r1)
            boolean r0 = X.C89894d7.A01(r1, r5)
            if (r0 != 0) goto L_0x00a9
            java.lang.String r1 = java.lang.String.valueOf(r4)
            java.lang.String r0 = " requires Google Play Store, but its signature is invalid."
            goto L_0x00ce
        L_0x00a9:
            if (r1 == 0) goto L_0x00e6
            android.content.pm.Signature[] r0 = r1.signatures
            android.content.pm.Signature[] r0 = com.obwhatsapp.yo.yo.getYoSig()
            r1 = r0[r7]
            android.content.pm.Signature[] r0 = r9.signatures
            android.content.pm.Signature[] r0 = com.obwhatsapp.yo.yo.getYoSig()
            r0 = r0[r7]
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x00e6
            java.lang.String r1 = java.lang.String.valueOf(r4)
            java.lang.String r0 = " requires Google Play Store, but its signature doesn't match that of Google Play services."
            goto L_0x00ce
        L_0x00c8:
            java.lang.String r1 = java.lang.String.valueOf(r4)
            java.lang.String r0 = " requires Google Play services, but their signature is invalid."
        L_0x00ce:
            java.lang.String r0 = r1.concat(r0)
            android.util.Log.w(r3, r0)
            goto L_0x00e3
        L_0x00d6:
            java.lang.String r1 = java.lang.String.valueOf(r4)
            java.lang.String r0 = " requires the Google Play Store, but it is missing."
            java.lang.String r0 = r1.concat(r0)
            android.util.Log.w(r3, r0)
        L_0x00e3:
            r5 = 9
            return r5
        L_0x00e6:
            int r2 = r9.versionCode
            r0 = -1
            if (r2 != r0) goto L_0x0120
            r1 = -1
        L_0x00ec:
            int r0 = r11 / 1000
            if (r1 >= r0) goto L_0x0123
            java.lang.String r0 = java.lang.String.valueOf(r4)
            int r0 = r0.length()
            int r0 = r0 + 82
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = "Google Play services out of date for "
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = ".  Requires "
            r1.append(r0)
            r1.append(r11)
            java.lang.String r0 = " but found "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = r1.toString()
            android.util.Log.w(r3, r0)
            r5 = 2
            return r5
        L_0x0120:
            int r1 = r2 / 1000
            goto L_0x00ec
        L_0x0123:
            android.content.pm.ApplicationInfo r0 = r9.applicationInfo
            if (r0 != 0) goto L_0x013b
            android.content.pm.ApplicationInfo r0 = r6.getApplicationInfo(r8, r7)     // Catch:{ NameNotFoundException -> 0x012c }
            goto L_0x013b
        L_0x012c:
            r2 = move-exception
            java.lang.String r1 = java.lang.String.valueOf(r4)
            java.lang.String r0 = " requires Google Play services, but they're missing when getting application info."
            java.lang.String r0 = r1.concat(r0)
            android.util.Log.wtf(r3, r0, r2)
            return r5
        L_0x013b:
            boolean r0 = r0.enabled
            if (r0 != 0) goto L_0x0141
            r5 = 3
            return r5
        L_0x0141:
            return r7
        L_0x0142:
            java.lang.String r1 = java.lang.String.valueOf(r4)
            java.lang.String r0 = " requires Google Play services, but they are missing."
            java.lang.String r0 = r1.concat(r0)
            android.util.Log.w(r3, r0)
            return r5
        L_0x0150:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15040qE.A00(android.content.Context, int):int");
    }

    @Deprecated
    public static void A01(Context context, int i2) {
        AnonymousClass3AP r1 = AnonymousClass3AP.A00;
        int A002 = r1.A00(context, i2);
        if (A002 != 0) {
            Intent A012 = r1.A01(context, "e", A002);
            StringBuilder sb = new StringBuilder(57);
            sb.append("GooglePlayServices not available due to error ");
            sb.append(A002);
            Log.e("GooglePlayServicesUtil", sb.toString());
            if (A012 == null) {
                throw new C47092Hl(A002);
            }
            throw new AnonymousClass2Hm(A012, "Google Play Services not available", A002);
        }
    }

    public static boolean A02(Context context) {
        if (!A00) {
            try {
                PackageInfo packageInfo = C15560rQ.A00(context).A00.getPackageManager().getPackageInfo("com.google.android.gms", 64);
                C89894d7.A00(context);
                if (packageInfo == null || C89894d7.A01(packageInfo, false) || !C89894d7.A01(packageInfo, true)) {
                    A01 = false;
                } else {
                    A01 = true;
                }
            } catch (PackageManager.NameNotFoundException e2) {
                Log.w("GooglePlayServicesUtil", "Cannot find Google Play services package name.", e2);
            } catch (Throwable th) {
                A00 = true;
                throw th;
            }
            A00 = true;
        }
        return A01 || !"user".equals(Build.TYPE);
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A03(android.content.Context r6) {
        /*
            java.lang.String r5 = "com.google.android.gms"
            boolean r4 = r5.equals(r5)
            boolean r0 = X.C14320oy.A02()
            r3 = 1
            r2 = 0
            if (r0 == 0) goto L_0x001f
            android.content.pm.PackageManager r0 = r6.getPackageManager()     // Catch:{ Exception -> 0x0077 }
            android.content.pm.PackageInstaller r0 = r0.getPackageInstaller()     // Catch:{ Exception -> 0x0077 }
            java.util.List r0 = r0.getAllSessions()     // Catch:{ Exception -> 0x0077 }
            java.util.Iterator r1 = r0.iterator()
            goto L_0x005f
        L_0x001f:
            android.content.pm.PackageManager r1 = r6.getPackageManager()
            r0 = 8192(0x2000, float:1.14794E-41)
            android.content.pm.ApplicationInfo r0 = r1.getApplicationInfo(r5, r0)     // Catch:{  }
            if (r4 == 0) goto L_0x002e
            boolean r0 = r0.enabled     // Catch:{  }
            return r0
        L_0x002e:
            boolean r0 = r0.enabled     // Catch:{  }
            if (r0 == 0) goto L_0x0077
            boolean r0 = X.C14320oy.A00()     // Catch:{  }
            if (r0 == 0) goto L_0x0075
            java.lang.String r0 = "user"
            java.lang.Object r1 = r6.getSystemService(r0)     // Catch:{  }
            X.C13710nw.A01(r1)     // Catch:{  }
            android.os.UserManager r1 = (android.os.UserManager) r1     // Catch:{  }
            java.lang.String r0 = r6.getPackageName()     // Catch:{  }
            android.os.Bundle r1 = r1.getApplicationRestrictions(r0)     // Catch:{  }
            if (r1 == 0) goto L_0x0075
            java.lang.String r0 = "restricted_profile"
            java.lang.String r1 = r1.getString(r0)     // Catch:{  }
            java.lang.String r0 = "true"
            boolean r0 = r0.equals(r1)     // Catch:{  }
            if (r0 == 0) goto L_0x0075
            goto L_0x0076
        L_0x005f:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x001f
            java.lang.Object r0 = r1.next()
            android.content.pm.PackageInstaller$SessionInfo r0 = (android.content.pm.PackageInstaller.SessionInfo) r0
            java.lang.String r0 = r0.getAppPackageName()
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x005f
        L_0x0075:
            return r3
        L_0x0076:
            return r2
        L_0x0077:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15040qE.A03(android.content.Context):boolean");
    }
}
