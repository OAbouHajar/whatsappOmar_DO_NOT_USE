package X;

import android.os.Bundle;
import android.util.Log;
import java.io.IOException;
import java.util.concurrent.Executor;

/* renamed from: X.0oe  reason: invalid class name and case insensitive filesystem */
public final class C14120oe {
    public final C13720nx A00;
    public final C14090ob A01;
    public final C14350p1 A02;
    public final C13780o4 A03;
    public final Executor A04;

    public C14120oe(C13720nx r3, C14090ob r4, C13780o4 r5, Executor executor) {
        r3.A02();
        C14350p1 r0 = new C14350p1(r3.A00, r4);
        this.A00 = r3;
        this.A01 = r4;
        this.A02 = r0;
        this.A04 = executor;
        this.A03 = r5;
    }

    public static String A00(Bundle bundle) {
        if (bundle != null) {
            String string = bundle.getString("registration_id");
            if (string != null || (string = bundle.getString("unregistered")) != null) {
                return string;
            }
            String string2 = bundle.getString("error");
            if ("RST".equals(string2)) {
                throw new IOException("INSTANCE_ID_RESET");
            } else if (string2 != null) {
                throw new IOException(string2);
            } else {
                String valueOf = String.valueOf(bundle);
                StringBuilder sb = new StringBuilder(valueOf.length() + 21);
                sb.append("Unexpected response: ");
                sb.append(valueOf);
                Log.w("FirebaseInstanceId", sb.toString(), new Throwable());
                throw new IOException("SERVICE_NOT_AVAILABLE");
            }
        } else {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0175, code lost:
        if (r7 != null) goto L_0x018d;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x01e4 A[SYNTHETIC, Splitter:B:100:0x01e4] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0152 A[Catch:{ all -> 0x01e1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x015d A[Catch:{ all -> 0x01e1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0169 A[Catch:{ all -> 0x01e1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0171 A[SYNTHETIC, Splitter:B:60:0x0171] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C14210on A01(android.os.Bundle r12, java.lang.String r13, java.lang.String r14, java.lang.String r15) {
        /*
            r11 = this;
            java.lang.String r0 = "scope"
            r12.putString(r0, r15)
            java.lang.String r0 = "sender"
            r12.putString(r0, r14)
            java.lang.String r0 = "subtype"
            r12.putString(r0, r14)
            java.lang.String r0 = "appid"
            r12.putString(r0, r13)
            X.0nx r0 = r11.A00
            r0.A02()
            X.0nz r0 = r0.A01
            java.lang.String r1 = r0.A01
            java.lang.String r0 = "gmp_app_id"
            r12.putString(r0, r1)
            X.0ob r2 = r11.A01
            int r0 = r2.A03()
            java.lang.String r1 = java.lang.Integer.toString(r0)
            java.lang.String r0 = "gmsv"
            r12.putString(r0, r1)
            int r0 = android.os.Build.VERSION.SDK_INT
            java.lang.String r1 = java.lang.Integer.toString(r0)
            java.lang.String r0 = "osv"
            r12.putString(r0, r1)
            java.lang.String r1 = r2.A05()
            java.lang.String r0 = "app_ver"
            r12.putString(r0, r1)
            monitor-enter(r2)
            java.lang.String r0 = r2.A03     // Catch:{ all -> 0x01e8 }
            if (r0 != 0) goto L_0x0050
            r2.A06()     // Catch:{ all -> 0x01e8 }
        L_0x0050:
            java.lang.String r1 = r2.A03     // Catch:{ all -> 0x01e8 }
            monitor-exit(r2)
            java.lang.String r0 = "app_ver_name"
            r12.putString(r0, r1)
            X.0p2 r1 = X.C14360p2.A01
            java.lang.String r5 = "firebase-iid"
            java.lang.String r8 = "Failed to get app version for libraryName: "
            java.lang.String r4 = "LibraryVersion"
            java.lang.String r0 = "Please provide a valid libraryName"
            X.C13710nw.A07(r5, r0)
            java.util.concurrent.ConcurrentHashMap r3 = r1.A00
            boolean r0 = r3.containsKey(r5)
            if (r0 == 0) goto L_0x00b4
            java.lang.Object r7 = r3.get(r5)
        L_0x0071:
            java.lang.String r0 = "UNKNOWN"
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x0090
            r2 = 12451000(0xbdfcb8, float:1.7447567E-38)
            r0 = 19
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = "unknown_"
            r1.append(r0)
            r1.append(r2)
            java.lang.String r7 = r1.toString()
        L_0x0090:
            java.lang.String r2 = "fiid-"
            java.lang.String r1 = java.lang.String.valueOf(r7)
            int r0 = r1.length()
            if (r0 == 0) goto L_0x00ae
            java.lang.String r1 = r2.concat(r1)
        L_0x00a0:
            java.lang.String r0 = "cliv"
            r12.putString(r0, r1)
            X.0o4 r3 = r11.A03
            X.0oa r0 = r3.A00
            java.util.Set r2 = r0.A00
            monitor-enter(r2)
            goto L_0x0192
        L_0x00ae:
            java.lang.String r1 = new java.lang.String
            r1.<init>(r2)
            goto L_0x00a0
        L_0x00b4:
            java.util.Properties r6 = new java.util.Properties
            r6.<init>()
            r0 = 1
            r7 = 0
            java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch:{ IOException -> 0x0144 }
            r0 = 0
            r2[r0] = r5     // Catch:{ IOException -> 0x0144 }
            java.lang.Class<X.0p2> r1 = X.C14360p2.class
            java.lang.String r0 = "/%s.properties"
            java.lang.String r0 = java.lang.String.format(r0, r2)     // Catch:{ IOException -> 0x0144 }
            java.io.InputStream r9 = r1.getResourceAsStream(r0)     // Catch:{ IOException -> 0x0144 }
            if (r9 == 0) goto L_0x0117
            r6.load(r9)     // Catch:{ IOException -> 0x0140, all -> 0x01de }
            java.lang.String r0 = "version"
            java.lang.String r7 = r6.getProperty(r0, r7)     // Catch:{ IOException -> 0x0140, all -> 0x01de }
            X.0p4 r6 = X.C14360p2.A02     // Catch:{ IOException -> 0x0140, all -> 0x01de }
            java.lang.String r0 = java.lang.String.valueOf(r5)     // Catch:{ IOException -> 0x0140, all -> 0x01de }
            int r0 = r0.length()     // Catch:{ IOException -> 0x0140, all -> 0x01de }
            int r2 = r0 + 12
            java.lang.String r0 = java.lang.String.valueOf(r7)     // Catch:{ IOException -> 0x0140, all -> 0x01de }
            int r0 = r0.length()     // Catch:{ IOException -> 0x0140, all -> 0x01de }
            int r2 = r2 + r0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0140, all -> 0x01de }
            r1.<init>(r2)     // Catch:{ IOException -> 0x0140, all -> 0x01de }
            r1.append(r5)     // Catch:{ IOException -> 0x0140, all -> 0x01de }
            java.lang.String r0 = " version is "
            r1.append(r0)     // Catch:{ IOException -> 0x0140, all -> 0x01de }
            r1.append(r7)     // Catch:{ IOException -> 0x0140, all -> 0x01de }
            java.lang.String r1 = r1.toString()     // Catch:{ IOException -> 0x0140, all -> 0x01de }
            r0 = 2
            boolean r0 = android.util.Log.isLoggable(r4, r0)     // Catch:{ IOException -> 0x0140, all -> 0x01de }
            if (r0 == 0) goto L_0x0113
            java.lang.String r0 = r6.A00     // Catch:{ IOException -> 0x0140, all -> 0x01de }
            if (r0 == 0) goto L_0x0110
            java.lang.String r1 = r0.concat(r1)     // Catch:{ IOException -> 0x0140, all -> 0x01de }
        L_0x0110:
            android.util.Log.v(r4, r1)     // Catch:{ IOException -> 0x0140, all -> 0x01de }
        L_0x0113:
            r9.close()     // Catch:{ IOException -> 0x0175 }
            goto L_0x0175
        L_0x0117:
            X.0p4 r6 = X.C14360p2.A02     // Catch:{ IOException -> 0x0140, all -> 0x01de }
            java.lang.String r1 = java.lang.String.valueOf(r5)     // Catch:{ IOException -> 0x0140, all -> 0x01de }
            int r0 = r1.length()     // Catch:{ IOException -> 0x0140, all -> 0x01de }
            if (r0 == 0) goto L_0x013a
            java.lang.String r1 = r8.concat(r1)     // Catch:{ IOException -> 0x0140, all -> 0x01de }
        L_0x0127:
            r0 = 5
            boolean r0 = android.util.Log.isLoggable(r4, r0)     // Catch:{ IOException -> 0x0140, all -> 0x01de }
            if (r0 == 0) goto L_0x0177
            java.lang.String r0 = r6.A00     // Catch:{ IOException -> 0x0140, all -> 0x01de }
            if (r0 == 0) goto L_0x0136
            java.lang.String r1 = r0.concat(r1)     // Catch:{ IOException -> 0x0140, all -> 0x01de }
        L_0x0136:
            android.util.Log.w(r4, r1)     // Catch:{ IOException -> 0x0140, all -> 0x01de }
            goto L_0x0177
        L_0x013a:
            java.lang.String r1 = new java.lang.String     // Catch:{ IOException -> 0x0140, all -> 0x01de }
            r1.<init>(r8)     // Catch:{ IOException -> 0x0140, all -> 0x01de }
            goto L_0x0127
        L_0x0140:
            r2 = move-exception
            r10 = r7
            r7 = r9
            goto L_0x0146
        L_0x0144:
            r2 = move-exception
            r10 = r7
        L_0x0146:
            X.0p4 r6 = X.C14360p2.A02     // Catch:{ all -> 0x01e1 }
            java.lang.String r1 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x01e1 }
            int r0 = r1.length()     // Catch:{ all -> 0x01e1 }
            if (r0 == 0) goto L_0x0169
            java.lang.String r1 = r8.concat(r1)     // Catch:{ all -> 0x01e1 }
        L_0x0156:
            r0 = 6
            boolean r0 = android.util.Log.isLoggable(r4, r0)     // Catch:{ all -> 0x01e1 }
            if (r0 == 0) goto L_0x016f
            java.lang.String r0 = r6.A00     // Catch:{ all -> 0x01e1 }
            if (r0 == 0) goto L_0x0165
            java.lang.String r1 = r0.concat(r1)     // Catch:{ all -> 0x01e1 }
        L_0x0165:
            android.util.Log.e(r4, r1, r2)     // Catch:{ all -> 0x01e1 }
            goto L_0x016f
        L_0x0169:
            java.lang.String r1 = new java.lang.String     // Catch:{ all -> 0x01e1 }
            r1.<init>(r8)     // Catch:{ all -> 0x01e1 }
            goto L_0x0156
        L_0x016f:
            if (r7 == 0) goto L_0x0174
            r7.close()     // Catch:{ IOException -> 0x0174 }
        L_0x0174:
            r7 = r10
        L_0x0175:
            if (r7 != 0) goto L_0x018d
        L_0x0177:
            java.lang.String r1 = ".properties file is dropped during release process. Failure to read app version is expected during Google internal testing where locally-built libraries are used"
            r0 = 3
            boolean r0 = android.util.Log.isLoggable(r4, r0)
            if (r0 == 0) goto L_0x018b
            java.lang.String r0 = r6.A00
            if (r0 == 0) goto L_0x0188
            java.lang.String r1 = r0.concat(r1)
        L_0x0188:
            android.util.Log.d(r4, r1)
        L_0x018b:
            java.lang.String r7 = "UNKNOWN"
        L_0x018d:
            r3.put(r5, r7)
            goto L_0x0071
        L_0x0192:
            java.util.Set r0 = java.util.Collections.unmodifiableSet(r2)     // Catch:{ all -> 0x01db }
            monitor-exit(r2)     // Catch:{ all -> 0x01db }
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x01b7
            java.lang.String r1 = r3.A01
        L_0x019f:
            java.lang.String r0 = "Firebase-Client"
            r12.putString(r0, r1)
            X.0p3 r3 = new X.0p3
            r3.<init>()
            java.util.concurrent.Executor r2 = r11.A04
            r1 = 1
            com.facebook.redex.RunnableRunnableShape0S0300000_I0 r0 = new com.facebook.redex.RunnableRunnableShape0S0300000_I0
            r0.<init>(r11, r12, r3, r1)
            r2.execute(r0)
            X.0on r0 = r3.A00
            return r0
        L_0x01b7:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = r3.A01
            r1.append(r0)
            r0 = 32
            r1.append(r0)
            monitor-enter(r2)
            java.util.Set r0 = java.util.Collections.unmodifiableSet(r2)     // Catch:{ all -> 0x01d8 }
            monitor-exit(r2)     // Catch:{ all -> 0x01d8 }
            java.lang.String r0 = X.C13780o4.A00(r0)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            goto L_0x019f
        L_0x01d8:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x01d8 }
            throw r0
        L_0x01db:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x01db }
            throw r0
        L_0x01de:
            r0 = move-exception
            r7 = r9
            goto L_0x01e2
        L_0x01e1:
            r0 = move-exception
        L_0x01e2:
            if (r7 == 0) goto L_0x01e7
            r7.close()     // Catch:{ IOException -> 0x01e7 }
        L_0x01e7:
            throw r0
        L_0x01e8:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14120oe.A01(android.os.Bundle, java.lang.String, java.lang.String, java.lang.String):X.0on");
    }

    public final C14210on A02(C14210on r6) {
        Executor executor = C14390p5.A00;
        C14400p6 r3 = new C14400p6();
        C14210on r2 = new C14210on();
        r6.A03.A00(new C14410p7(r3, r2, executor));
        r6.A04();
        return r2;
    }

    public final C14210on A03(C14210on r6) {
        Executor executor = this.A04;
        C14420p8 r3 = new C14420p8(this);
        C14210on r2 = new C14210on();
        r6.A03.A00(new C14410p7(r3, r2, executor));
        r6.A04();
        return r2;
    }

    public final C14210on A04(String str, String str2, String str3) {
        Bundle bundle = new Bundle();
        bundle.putString("delete", "1");
        return A02(A03(A01(bundle, str, str2, str3)));
    }

    public final C14210on A05(String str, String str2, String str3) {
        Bundle bundle = new Bundle();
        String valueOf = String.valueOf(str3);
        bundle.putString("gcm.topic", valueOf.length() != 0 ? "/topics/".concat(valueOf) : new String("/topics/"));
        String valueOf2 = String.valueOf(str3);
        return A02(A03(A01(bundle, str, str2, valueOf2.length() != 0 ? "/topics/".concat(valueOf2) : new String("/topics/"))));
    }

    public final C14210on A06(String str, String str2, String str3) {
        Bundle bundle = new Bundle();
        String valueOf = String.valueOf(str3);
        bundle.putString("gcm.topic", valueOf.length() != 0 ? "/topics/".concat(valueOf) : new String("/topics/"));
        bundle.putString("delete", "1");
        String valueOf2 = String.valueOf(str3);
        return A02(A03(A01(bundle, str, str2, valueOf2.length() != 0 ? "/topics/".concat(valueOf2) : new String("/topics/"))));
    }
}
