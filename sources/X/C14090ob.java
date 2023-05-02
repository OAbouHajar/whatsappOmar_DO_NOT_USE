package X;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Base64;
import android.util.Log;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;

/* renamed from: X.0ob  reason: invalid class name and case insensitive filesystem */
public final class C14090ob {
    public int A00;
    public int A01 = 0;
    public String A02;
    public String A03;
    public final Context A04;

    public C14090ob(Context context) {
        this.A04 = context;
    }

    public static String A00(C13720nx r3) {
        r3.A02();
        C13740nz r1 = r3.A01;
        String str = r1.A04;
        if (str != null) {
            return str;
        }
        r3.A02();
        String str2 = r1.A01;
        if (str2.startsWith("1:")) {
            String[] split = str2.split(":");
            if (split.length >= 2) {
                str2 = split[1];
                if (str2.isEmpty()) {
                    return null;
                }
            }
            return null;
        }
        return str2;
    }

    public static String A01(PublicKey publicKey) {
        try {
            byte[] digest = MessageDigest.getInstance("SHA1").digest(publicKey.getEncoded());
            digest[0] = (byte) ((digest[0] & 15) + 112);
            return Base64.encodeToString(digest, 0, 8, 11);
        } catch (NoSuchAlgorithmException unused) {
            Log.w("FirebaseInstanceId", "Unexpected error, device missing required algorithms");
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x005a, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0071, code lost:
        return r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized int A02() {
        /*
            r6 = this;
            monitor-enter(r6)
            int r0 = r6.A01     // Catch:{ all -> 0x0072 }
            if (r0 != 0) goto L_0x0070
            android.content.Context r0 = r6.A04     // Catch:{ all -> 0x0072 }
            android.content.pm.PackageManager r5 = r0.getPackageManager()     // Catch:{ all -> 0x0072 }
            java.lang.String r0 = "com.google.android.c2dm.permission.SEND"
            java.lang.String r4 = "com.google.android.gms"
            int r1 = r5.checkPermission(r0, r4)     // Catch:{ all -> 0x0072 }
            r0 = -1
            r3 = 0
            if (r1 != r0) goto L_0x001f
            java.lang.String r1 = "FirebaseInstanceId"
            java.lang.String r0 = "Google Play services missing or without correct permission."
            android.util.Log.e(r1, r0)     // Catch:{ all -> 0x0072 }
            goto L_0x0059
        L_0x001f:
            boolean r0 = X.C14320oy.A03()     // Catch:{ all -> 0x0072 }
            r2 = 1
            if (r0 != 0) goto L_0x0040
            java.lang.String r1 = "com.google.android.c2dm.intent.REGISTER"
            android.content.Intent r0 = new android.content.Intent     // Catch:{ all -> 0x0072 }
            r0.<init>(r1)     // Catch:{ all -> 0x0072 }
            r0.setPackage(r4)     // Catch:{ all -> 0x0072 }
            java.util.List r0 = r5.queryIntentServices(r0, r3)     // Catch:{ all -> 0x0072 }
            if (r0 == 0) goto L_0x0040
            int r0 = r0.size()     // Catch:{ all -> 0x0072 }
            if (r0 <= 0) goto L_0x0040
            r6.A01 = r2     // Catch:{ all -> 0x0072 }
            monitor-exit(r6)
            return r2
        L_0x0040:
            java.lang.String r1 = "com.google.iid.TOKEN_REQUEST"
            android.content.Intent r0 = new android.content.Intent     // Catch:{ all -> 0x0072 }
            r0.<init>(r1)     // Catch:{ all -> 0x0072 }
            r0.setPackage(r4)     // Catch:{ all -> 0x0072 }
            java.util.List r0 = r5.queryBroadcastReceivers(r0, r3)     // Catch:{ all -> 0x0072 }
            r3 = 2
            if (r0 == 0) goto L_0x005b
            int r0 = r0.size()     // Catch:{ all -> 0x0072 }
            if (r0 <= 0) goto L_0x005b
            r6.A01 = r3     // Catch:{ all -> 0x0072 }
        L_0x0059:
            monitor-exit(r6)
            return r3
        L_0x005b:
            java.lang.String r1 = "FirebaseInstanceId"
            java.lang.String r0 = "Failed to resolve IID implementation package, falling back"
            android.util.Log.w(r1, r0)     // Catch:{ all -> 0x0072 }
            boolean r0 = X.C14320oy.A03()     // Catch:{ all -> 0x0072 }
            if (r0 == 0) goto L_0x006b
            r6.A01 = r3     // Catch:{ all -> 0x0072 }
            goto L_0x006f
        L_0x006b:
            r6.A01 = r2     // Catch:{ all -> 0x0072 }
            r0 = 1
            goto L_0x0070
        L_0x006f:
            r0 = 2
        L_0x0070:
            monitor-exit(r6)
            return r0
        L_0x0072:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14090ob.A02():int");
    }

    public final synchronized int A03() {
        PackageInfo A042;
        if (this.A00 == 0 && (A042 = A04("com.google.android.gms")) != null) {
            this.A00 = A042.versionCode;
        }
        return this.A00;
    }

    public final PackageInfo A04(String str) {
        try {
            return this.A04.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e2) {
            String valueOf = String.valueOf(e2);
            StringBuilder sb = new StringBuilder(valueOf.length() + 23);
            sb.append("Failed to find package ");
            sb.append(valueOf);
            Log.w("FirebaseInstanceId", sb.toString());
            return null;
        }
    }

    public final synchronized String A05() {
        if (this.A02 == null) {
            A06();
        }
        return this.A02;
    }

    public final synchronized void A06() {
        PackageInfo A042 = A04(this.A04.getPackageName());
        if (A042 != null) {
            this.A02 = Integer.toString(A042.versionCode);
            this.A03 = A042.versionName;
        }
    }
}
