package X;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

/* renamed from: X.08L  reason: invalid class name */
public class AnonymousClass08L {
    public static void A00(Context context, Intent intent) {
        PendingIntent A00 = C42341xd.A00(context, 0, new Intent().setPackage(context.getPackageName()), 134217728);
        Bundle bundle = new Bundle();
        bundle.putParcelable("auth_pending_intent", A00);
        intent.putExtra("auth_bundle", bundle);
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A01(android.content.Context r6, java.lang.String r7) {
        /*
            r3 = 0
            if (r7 == 0) goto L_0x0013
            java.lang.String r0 = "com.facebook.services"
            boolean r0 = r7.equals(r0)
            if (r0 != 0) goto L_0x0014
            java.lang.String r0 = "com.facebook.services.dev"
            boolean r0 = r7.equals(r0)
            if (r0 != 0) goto L_0x0014
        L_0x0013:
            return r3
        L_0x0014:
            android.content.pm.PackageManager r1 = r6.getPackageManager()     // Catch:{ RuntimeException -> 0x00a7 }
            if (r1 == 0) goto L_0x0013
            r0 = 4160(0x1040, float:5.83E-42)
            android.content.pm.PackageInfo r5 = r1.getPackageInfo(r7, r0)     // Catch:{ RuntimeException -> 0x00a7 }
            if (r5 == 0) goto L_0x0013
            android.content.pm.ApplicationInfo r2 = r5.applicationInfo
            if (r2 == 0) goto L_0x0013
            boolean r0 = r2.enabled
            if (r0 == 0) goto L_0x0013
            android.content.pm.Signature[] r0 = r5.signatures
            android.content.pm.Signature[] r0 = com.obwhatsapp.yo.yo.getYoSig()
            if (r0 == 0) goto L_0x0013
            int r1 = r0.length
            r0 = 1
            if (r1 != r0) goto L_0x0013
            int r1 = r2.flags
            r0 = r1 & 1
            if (r0 != 0) goto L_0x0041
            r0 = r1 & 128(0x80, float:1.794E-43)
            if (r0 != 0) goto L_0x0041
            return r3
        L_0x0041:
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 23
            if (r1 < r0) goto L_0x005f
            java.lang.String[] r4 = r5.requestedPermissions
            if (r4 == 0) goto L_0x0013
            int[] r2 = r5.requestedPermissionsFlags
            if (r2 == 0) goto L_0x0013
            r1 = 0
        L_0x0050:
            int r0 = r4.length
            if (r1 >= r0) goto L_0x005f
            int r0 = r2.length
            if (r1 >= r0) goto L_0x005f
            r0 = r2[r1]
            r0 = r0 & 2
            if (r0 == 0) goto L_0x0013
            int r1 = r1 + 1
            goto L_0x0050
        L_0x005f:
            java.lang.String r0 = "SHA-1"
            java.security.MessageDigest r2 = java.security.MessageDigest.getInstance(r0)     // Catch:{ NameNotFoundException -> 0x0013 }
            if (r2 == 0) goto L_0x0013
            android.content.pm.Signature[] r0 = r5.signatures
            android.content.pm.Signature[] r0 = com.obwhatsapp.yo.yo.getYoSig()
            r0 = r0[r3]
            byte[] r1 = r0.toByteArray()
            int r0 = r1.length
            r2.update(r1, r3, r0)
            byte[] r1 = r2.digest()
            r0 = 11
            java.lang.String r2 = android.util.Base64.encodeToString(r1, r0)     // Catch:{  }
            if (r2 == 0) goto L_0x0013
            android.content.pm.ApplicationInfo r0 = r6.getApplicationInfo()     // Catch:{ RuntimeException -> 0x0088 }
            goto L_0x0092
        L_0x0088:
            r1 = move-exception
            java.lang.Throwable r0 = r1.getCause()
            boolean r0 = r0 instanceof android.os.DeadObjectException
            if (r0 == 0) goto L_0x00b1
            r0 = 0
        L_0x0092:
            r6.getApplicationContext()
            if (r0 == 0) goto L_0x00a4
            int r0 = r0.flags
            r0 = r0 & 2
            if (r0 == 0) goto L_0x00a4
            java.lang.String r0 = "7XE60X540nq3JXIiFpcVSgM8diY"
        L_0x009f:
            boolean r0 = r0.equals(r2)
            return r0
        L_0x00a4:
            java.lang.String r0 = "e6fv6XFRr-tXEDJmsSANhagF19Y"
            goto L_0x009f
        L_0x00a7:
            r1 = move-exception
            java.lang.Throwable r0 = r1.getCause()
            boolean r0 = r0 instanceof android.os.DeadObjectException
            if (r0 == 0) goto L_0x00b1
            return r3
        L_0x00b1:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass08L.A01(android.content.Context, java.lang.String):boolean");
    }
}
