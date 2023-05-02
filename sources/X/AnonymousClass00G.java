package X;

import android.os.Build;
import com.facebook.msys.mci.DefaultCrypto;
import java.io.UnsupportedEncodingException;

/* renamed from: X.00G  reason: invalid class name */
public final class AnonymousClass00G {
    public static final byte[] A00;

    static {
        StringBuilder sb = new StringBuilder();
        String str = Build.FINGERPRINT;
        if (str != null) {
            sb.append(str);
        }
        String str2 = Build.SERIAL;
        if (str2 != null) {
            sb.append(str2);
        }
        try {
            A00 = sb.toString().getBytes(DefaultCrypto.UTF_8);
        } catch (UnsupportedEncodingException unused) {
            throw new RuntimeException("UTF-8 encoding not supported");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x00b1 A[Catch:{ NoSuchAlgorithmException -> 0x0110 }] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0112 A[SYNTHETIC, Splitter:B:37:0x0112] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A00() {
        /*
            java.lang.String r4 = "org.apache.harmony.xnet.provider.jsse.NativeCrypto"
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 18
            if (r1 > r0) goto L_0x0075
            java.lang.Class r3 = java.lang.Class.forName(r4)     // Catch:{ Exception -> 0x006c }
            java.lang.String r2 = "RAND_seed"
            r6 = 1
            java.lang.Class[] r1 = new java.lang.Class[r6]     // Catch:{ Exception -> 0x006c }
            java.lang.Class<byte[]> r0 = byte[].class
            r7 = 0
            r1[r7] = r0     // Catch:{ Exception -> 0x006c }
            java.lang.reflect.Method r2 = r3.getMethod(r2, r1)     // Catch:{ Exception -> 0x006c }
            java.lang.Object[] r1 = new java.lang.Object[r6]     // Catch:{ Exception -> 0x006c }
            byte[] r0 = A01()     // Catch:{ Exception -> 0x006c }
            r1[r7] = r0     // Catch:{ Exception -> 0x006c }
            r5 = 0
            r2.invoke(r5, r1)     // Catch:{ Exception -> 0x006c }
            java.lang.Class r4 = java.lang.Class.forName(r4)     // Catch:{ Exception -> 0x006c }
            java.lang.String r3 = "RAND_load_file"
            r2 = 2
            java.lang.Class[] r1 = new java.lang.Class[r2]     // Catch:{ Exception -> 0x006c }
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            r1[r7] = r0     // Catch:{ Exception -> 0x006c }
            java.lang.Class r0 = java.lang.Long.TYPE     // Catch:{ Exception -> 0x006c }
            r1[r6] = r0     // Catch:{ Exception -> 0x006c }
            java.lang.reflect.Method r3 = r4.getMethod(r3, r1)     // Catch:{ Exception -> 0x006c }
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x006c }
            java.lang.String r0 = "/dev/urandom"
            r2[r7] = r0     // Catch:{ Exception -> 0x006c }
            r1 = 1024(0x400, float:1.435E-42)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)     // Catch:{ Exception -> 0x006c }
            r2[r6] = r0     // Catch:{ Exception -> 0x006c }
            java.lang.Object r0 = r3.invoke(r5, r2)     // Catch:{ Exception -> 0x006c }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ Exception -> 0x006c }
            int r2 = r0.intValue()     // Catch:{ Exception -> 0x006c }
            if (r2 == r1) goto L_0x0075
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x006c }
            r1.<init>()     // Catch:{ Exception -> 0x006c }
            java.lang.String r0 = "Unexpected number of bytes read from Linux PRNG: "
            r1.append(r0)     // Catch:{ Exception -> 0x006c }
            r1.append(r2)     // Catch:{ Exception -> 0x006c }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x006c }
            java.io.IOException r0 = new java.io.IOException     // Catch:{ Exception -> 0x006c }
            r0.<init>(r1)     // Catch:{ Exception -> 0x006c }
            throw r0     // Catch:{ Exception -> 0x006c }
        L_0x006c:
            r2 = move-exception
            java.lang.String r1 = "Failed to seed OpenSSL PRNG"
            java.lang.SecurityException r0 = new java.lang.SecurityException
            r0.<init>(r1, r2)
            throw r0
        L_0x0075:
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 18
            if (r1 > r0) goto L_0x013c
            java.lang.Class<java.security.Security> r4 = java.security.Security.class
            monitor-enter(r4)
            java.lang.String r0 = "SecureRandom.SHA1PRNG"
            java.security.Provider[] r2 = java.security.Security.getProviders(r0)     // Catch:{ all -> 0x0139 }
            r1 = 1
            if (r2 == 0) goto L_0x00b2
            int r0 = r2.length     // Catch:{ all -> 0x0139 }
            if (r0 < r1) goto L_0x00b2
            java.lang.Class<X.0iQ> r3 = X.C11240iQ.class
            r0 = 0
            r0 = r2[r0]     // Catch:{ all -> 0x0139 }
            java.lang.Class r0 = r0.getClass()     // Catch:{ all -> 0x0139 }
            boolean r0 = r3.equals(r0)     // Catch:{ all -> 0x0139 }
            if (r0 == 0) goto L_0x00b2
            java.lang.String r0 = "prng not installing provider"
        L_0x009b:
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0139 }
            java.security.SecureRandom r2 = new java.security.SecureRandom     // Catch:{ all -> 0x0139 }
            r2.<init>()     // Catch:{ all -> 0x0139 }
            java.security.Provider r0 = r2.getProvider()     // Catch:{ all -> 0x0139 }
            java.lang.Class r0 = r0.getClass()     // Catch:{ all -> 0x0139 }
            boolean r0 = r3.equals(r0)     // Catch:{ all -> 0x0139 }
            if (r0 == 0) goto L_0x0112
            goto L_0x00db
        L_0x00b2:
            X.0iQ r0 = new X.0iQ     // Catch:{ all -> 0x0139 }
            r0.<init>()     // Catch:{ all -> 0x0139 }
            int r2 = java.security.Security.insertProviderAt(r0, r1)     // Catch:{ all -> 0x0139 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0139 }
            r1.<init>()     // Catch:{ all -> 0x0139 }
            java.lang.String r0 = "prng installed provider:"
            r1.append(r0)     // Catch:{ all -> 0x0139 }
            java.lang.Class<X.0iQ> r3 = X.C11240iQ.class
            java.lang.String r0 = r3.getName()     // Catch:{ all -> 0x0139 }
            r1.append(r0)     // Catch:{ all -> 0x0139 }
            java.lang.String r0 = " at position:"
            r1.append(r0)     // Catch:{ all -> 0x0139 }
            r1.append(r2)     // Catch:{ all -> 0x0139 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0139 }
            goto L_0x009b
        L_0x00db:
            java.lang.String r0 = "SHA1PRNG"
            java.security.SecureRandom r2 = java.security.SecureRandom.getInstance(r0)     // Catch:{ NoSuchAlgorithmException -> 0x0110 }
            java.security.Provider r0 = r2.getProvider()     // Catch:{ all -> 0x0139 }
            java.lang.Class r0 = r0.getClass()     // Catch:{ all -> 0x0139 }
            boolean r0 = r3.equals(r0)     // Catch:{ all -> 0x0139 }
            if (r0 == 0) goto L_0x00f1
            monitor-exit(r4)     // Catch:{ all -> 0x0139 }
            return
        L_0x00f1:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0139 }
            r1.<init>()     // Catch:{ all -> 0x0139 }
            java.lang.String r0 = "SecureRandom.getInstance(\"SHA1PRNG\") backed by wrong Provider: "
            r1.append(r0)     // Catch:{ all -> 0x0139 }
            java.security.Provider r0 = r2.getProvider()     // Catch:{ all -> 0x0139 }
            java.lang.Class r0 = r0.getClass()     // Catch:{ all -> 0x0139 }
            r1.append(r0)     // Catch:{ all -> 0x0139 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0139 }
            java.lang.SecurityException r1 = new java.lang.SecurityException     // Catch:{ all -> 0x0139 }
            r1.<init>(r0)     // Catch:{ all -> 0x0139 }
            goto L_0x0138
        L_0x0110:
            r2 = move-exception
            goto L_0x0131
        L_0x0112:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0139 }
            r1.<init>()     // Catch:{ all -> 0x0139 }
            java.lang.String r0 = "new SecureRandom() backed by wrong Provider: "
            r1.append(r0)     // Catch:{ all -> 0x0139 }
            java.security.Provider r0 = r2.getProvider()     // Catch:{ all -> 0x0139 }
            java.lang.Class r0 = r0.getClass()     // Catch:{ all -> 0x0139 }
            r1.append(r0)     // Catch:{ all -> 0x0139 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0139 }
            java.lang.SecurityException r1 = new java.lang.SecurityException     // Catch:{ all -> 0x0139 }
            r1.<init>(r0)     // Catch:{ all -> 0x0139 }
            goto L_0x0138
        L_0x0131:
            java.lang.String r0 = "SHA1PRNG not available"
            java.lang.SecurityException r1 = new java.lang.SecurityException     // Catch:{ all -> 0x0139 }
            r1.<init>(r0, r2)     // Catch:{ all -> 0x0139 }
        L_0x0138:
            throw r1     // Catch:{ all -> 0x0139 }
        L_0x0139:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0139 }
            throw r0
        L_0x013c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass00G.A00():void");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x003a */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x003f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] A01() {
        /*
            java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream     // Catch:{ IOException -> 0x0040 }
            r3.<init>()     // Catch:{ IOException -> 0x0040 }
            java.io.DataOutputStream r2 = new java.io.DataOutputStream     // Catch:{ all -> 0x003b }
            r2.<init>(r3)     // Catch:{ all -> 0x003b }
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0036 }
            r2.writeLong(r0)     // Catch:{ all -> 0x0036 }
            long r0 = java.lang.System.nanoTime()     // Catch:{ all -> 0x0036 }
            r2.writeLong(r0)     // Catch:{ all -> 0x0036 }
            int r0 = android.os.Process.myPid()     // Catch:{ all -> 0x0036 }
            r2.writeInt(r0)     // Catch:{ all -> 0x0036 }
            int r0 = android.os.Process.myUid()     // Catch:{ all -> 0x0036 }
            r2.writeInt(r0)     // Catch:{ all -> 0x0036 }
            byte[] r0 = A00     // Catch:{ all -> 0x0036 }
            r2.write(r0)     // Catch:{ all -> 0x0036 }
            byte[] r0 = r3.toByteArray()     // Catch:{ all -> 0x0036 }
            r2.close()     // Catch:{ all -> 0x003b }
            r3.close()     // Catch:{ IOException -> 0x0040 }
            return r0
        L_0x0036:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x003a }
        L_0x003a:
            throw r0     // Catch:{ all -> 0x003b }
        L_0x003b:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x003f }
        L_0x003f:
            throw r0     // Catch:{ IOException -> 0x0040 }
        L_0x0040:
            r2 = move-exception
            java.lang.String r1 = "Failed to generate seed"
            java.lang.SecurityException r0 = new java.lang.SecurityException
            r0.<init>(r1, r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass00G.A01():byte[]");
    }
}
