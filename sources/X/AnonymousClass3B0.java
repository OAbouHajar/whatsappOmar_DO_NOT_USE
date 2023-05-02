package X;

import android.net.SSLSessionCache;
import com.whatsapp.util.Log;
import java.lang.reflect.Field;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;

/* renamed from: X.3B0  reason: invalid class name */
public class AnonymousClass3B0 {
    public static boolean A00;

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x00e0 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0103 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A00(android.net.SSLSessionCache r13, java.lang.String r14, javax.net.ssl.SSLContext r15, int r16) {
        /*
            java.lang.String r2 = "sslParameters"
            java.lang.Class<java.lang.String> r12 = java.lang.String.class
            boolean r0 = A00
            if (r0 != 0) goto L_0x0159
            if (r13 == 0) goto L_0x0159
            r3 = 1
            java.lang.Class r1 = r13.getClass()     // Catch:{ Exception -> 0x007c }
            java.lang.String r0 = "mSessionCache"
            java.lang.reflect.Field r0 = r1.getDeclaredField(r0)     // Catch:{ Exception -> 0x007c }
            r0.setAccessible(r3)     // Catch:{ Exception -> 0x007c }
            java.lang.Object r5 = r0.get(r13)     // Catch:{ Exception -> 0x007c }
            java.lang.Class r4 = r5.getClass()     // Catch:{ Exception -> 0x007c }
            java.lang.String r1 = "getSessionData"
            r8 = 2
            java.lang.Class[] r0 = new java.lang.Class[r8]     // Catch:{ Exception -> 0x007c }
            r11 = 0
            r0[r11] = r12     // Catch:{ Exception -> 0x007c }
            java.lang.Class r10 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x007c }
            r0[r3] = r10     // Catch:{ Exception -> 0x007c }
            java.lang.reflect.Method r1 = r4.getMethod(r1, r0)     // Catch:{ Exception -> 0x007c }
            java.lang.Object[] r0 = new java.lang.Object[r8]     // Catch:{ Exception -> 0x007c }
            r0[r11] = r14     // Catch:{ Exception -> 0x007c }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r16)     // Catch:{ Exception -> 0x007c }
            r0[r3] = r9     // Catch:{ Exception -> 0x007c }
            java.lang.Object r7 = r1.invoke(r5, r0)     // Catch:{ Exception -> 0x007c }
            byte[] r7 = (byte[]) r7     // Catch:{ Exception -> 0x007c }
            if (r7 == 0) goto L_0x0090
            javax.net.ssl.SSLSessionContext r0 = r15.getClientSessionContext()     // Catch:{ Exception -> 0x007c }
            java.lang.Class r0 = r0.getClass()     // Catch:{ Exception -> 0x007c }
            java.lang.Class r6 = r0.getSuperclass()     // Catch:{ Exception -> 0x007c }
            java.lang.String r4 = "toSession"
            r5 = 3
            java.lang.Class[] r1 = new java.lang.Class[r5]     // Catch:{ Exception -> 0x007c }
            java.lang.Class<byte[]> r0 = byte[].class
            r1[r11] = r0     // Catch:{ Exception -> 0x007c }
            r1[r3] = r12     // Catch:{ Exception -> 0x007c }
            r1[r8] = r10     // Catch:{ Exception -> 0x007c }
            java.lang.reflect.Method r4 = r6.getDeclaredMethod(r4, r1)     // Catch:{ Exception -> 0x007c }
            r4.setAccessible(r3)     // Catch:{ Exception -> 0x007c }
            javax.net.ssl.SSLSessionContext r1 = r15.getClientSessionContext()     // Catch:{ Exception -> 0x007c }
            java.lang.Object[] r0 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x007c }
            r0[r11] = r7     // Catch:{ Exception -> 0x007c }
            r0[r3] = r14     // Catch:{ Exception -> 0x007c }
            r0[r8] = r9     // Catch:{ Exception -> 0x007c }
            java.lang.Object r0 = r4.invoke(r1, r0)     // Catch:{ Exception -> 0x007c }
            javax.net.ssl.SSLSession r0 = (javax.net.ssl.SSLSession) r0     // Catch:{ Exception -> 0x007c }
            if (r0 == 0) goto L_0x0090
            A02(r0)     // Catch:{ Exception -> 0x007c }
            goto L_0x0090
        L_0x007c:
            r4 = move-exception
            java.lang.String r0 = "SSLSessionCacheHack:"
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)
            java.lang.String r0 = r4.toString()
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r1)
            com.whatsapp.util.Log.i((java.lang.String) r0)
            A00 = r3
        L_0x0090:
            java.lang.Class r1 = r13.getClass()     // Catch:{ Exception -> 0x0145 }
            java.lang.String r0 = "mSessionCache"
            java.lang.reflect.Field r0 = r1.getDeclaredField(r0)     // Catch:{ Exception -> 0x0145 }
            r0.setAccessible(r3)     // Catch:{ Exception -> 0x0145 }
            javax.net.ssl.SSLSessionContext r0 = r15.getClientSessionContext()     // Catch:{ Exception -> 0x0145 }
            java.lang.Class r5 = r0.getClass()     // Catch:{ Exception -> 0x0145 }
            java.lang.String r4 = "getSession"
            r7 = 2
            java.lang.Class[] r1 = new java.lang.Class[r7]     // Catch:{ Exception -> 0x0145 }
            r9 = 0
            r1[r9] = r12     // Catch:{ Exception -> 0x0145 }
            java.lang.Class r0 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x0145 }
            r1[r3] = r0     // Catch:{ Exception -> 0x0145 }
            java.lang.reflect.Method r4 = r5.getMethod(r4, r1)     // Catch:{ Exception -> 0x0145 }
            javax.net.ssl.SSLSessionContext r1 = r15.getClientSessionContext()     // Catch:{ Exception -> 0x0145 }
            java.lang.Object[] r0 = new java.lang.Object[r7]     // Catch:{ Exception -> 0x0145 }
            r0[r9] = r14     // Catch:{ Exception -> 0x0145 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r16)     // Catch:{ Exception -> 0x0145 }
            r0[r3] = r8     // Catch:{ Exception -> 0x0145 }
            java.lang.Object r1 = r4.invoke(r1, r0)     // Catch:{ Exception -> 0x0145 }
            javax.net.ssl.SSLSession r1 = (javax.net.ssl.SSLSession) r1     // Catch:{ Exception -> 0x0145 }
            javax.net.ssl.SSLSessionContext r0 = r15.getClientSessionContext()     // Catch:{ Exception -> 0x0145 }
            r0.getSessionTimeout()     // Catch:{ Exception -> 0x0145 }
            if (r1 == 0) goto L_0x00d5
            A02(r1)     // Catch:{ Exception -> 0x0145 }
        L_0x00d5:
            java.lang.Class r1 = r15.getClass()     // Catch:{ NoSuchFieldException -> 0x00e0 }
            java.lang.String r0 = "contextSpi"
            java.lang.reflect.Field r0 = r1.getDeclaredField(r0)     // Catch:{ NoSuchFieldException -> 0x00e0 }
            goto L_0x00eb
        L_0x00e0:
            java.lang.Class r1 = r15.getClass()     // Catch:{ Exception -> 0x0145 }
            java.lang.String r0 = "spiImpl"
            java.lang.reflect.Field r0 = r1.getDeclaredField(r0)     // Catch:{ Exception -> 0x0145 }
        L_0x00eb:
            if (r0 == 0) goto L_0x0142
            r0.setAccessible(r3)     // Catch:{ Exception -> 0x0145 }
            java.lang.Object r1 = r0.get(r15)     // Catch:{ Exception -> 0x0145 }
            if (r1 == 0) goto L_0x0159
            java.lang.Class r0 = r1.getClass()     // Catch:{ NoSuchFieldException -> 0x0103 }
            java.lang.Class r0 = r0.getSuperclass()     // Catch:{ NoSuchFieldException -> 0x0103 }
            java.lang.reflect.Field r0 = r0.getDeclaredField(r2)     // Catch:{ NoSuchFieldException -> 0x0103 }
            goto L_0x010b
        L_0x0103:
            java.lang.Class r0 = r1.getClass()     // Catch:{ Exception -> 0x0145 }
            java.lang.reflect.Field r0 = r0.getDeclaredField(r2)     // Catch:{ Exception -> 0x0145 }
        L_0x010b:
            r0.setAccessible(r3)     // Catch:{ Exception -> 0x0145 }
            java.lang.Object r6 = r0.get(r1)     // Catch:{ Exception -> 0x0145 }
            java.lang.Class r5 = r6.getClass()     // Catch:{ NoSuchMethodException -> 0x0142 }
            java.lang.String r2 = "getCachedClientSession"
            r4 = 3
            java.lang.Class[] r1 = new java.lang.Class[r4]     // Catch:{ NoSuchMethodException -> 0x0142 }
            javax.net.ssl.SSLSessionContext r0 = r15.getClientSessionContext()     // Catch:{ NoSuchMethodException -> 0x0142 }
            java.lang.Class r0 = r0.getClass()     // Catch:{ NoSuchMethodException -> 0x0142 }
            r1[r9] = r0     // Catch:{ NoSuchMethodException -> 0x0142 }
            r1[r3] = r12     // Catch:{ NoSuchMethodException -> 0x0142 }
            java.lang.Class r0 = java.lang.Integer.TYPE     // Catch:{ NoSuchMethodException -> 0x0142 }
            r1[r7] = r0     // Catch:{ NoSuchMethodException -> 0x0142 }
            java.lang.reflect.Method r2 = r5.getDeclaredMethod(r2, r1)     // Catch:{ NoSuchMethodException -> 0x0142 }
            r2.setAccessible(r3)     // Catch:{ Exception -> 0x0145 }
            java.lang.Object[] r1 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x0145 }
            javax.net.ssl.SSLSessionContext r0 = r15.getClientSessionContext()     // Catch:{ Exception -> 0x0145 }
            r1[r9] = r0     // Catch:{ Exception -> 0x0145 }
            r1[r3] = r14     // Catch:{ Exception -> 0x0145 }
            r1[r7] = r8     // Catch:{ Exception -> 0x0145 }
            r2.invoke(r6, r1)     // Catch:{ Exception -> 0x0145 }
            return
        L_0x0142:
            A00 = r3     // Catch:{ Exception -> 0x0145 }
            return
        L_0x0145:
            r2 = move-exception
            java.lang.String r0 = "SSLSessionCacheHack:"
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)
            java.lang.String r0 = r2.toString()
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r1)
            com.whatsapp.util.Log.w((java.lang.String) r0)
            A00 = r3
        L_0x0159:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3B0.A00(android.net.SSLSessionCache, java.lang.String, javax.net.ssl.SSLContext, int):void");
    }

    public static void A01(SSLSessionCache sSLSessionCache, SSLContext sSLContext) {
        String A0h;
        if (sSLContext.getClientSessionContext() == null) {
            A0h = "SSLSessionCacheHack/session context is null";
        } else if (!AnonymousClass000.A0c(sSLContext.getClientSessionContext()).equals("ClientSessionContext")) {
            A0h = AnonymousClass000.A0h(AnonymousClass000.A0d(sSLContext.getClientSessionContext()), AnonymousClass000.A0r("SSLSessionCacheHack/session context does not match, class="));
        } else {
            try {
                Field declaredField = sSLSessionCache.getClass().getDeclaredField("mSessionCache");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(sSLSessionCache);
                Class<?> cls = Class.forName("com.android.org.conscrypt.SSLClientSessionCache");
                sSLContext.getClientSessionContext().getClass().getMethod("setPersistentCache", new Class[]{cls}).invoke(sSLContext.getClientSessionContext(), new Object[]{obj});
                return;
            } catch (ClassNotFoundException e2) {
                e2.toString();
                return;
            } catch (Exception e3) {
                Log.e(AnonymousClass000.A0h(e3.toString(), AnonymousClass000.A0q("SSLSessionCacheHack:")));
                return;
            }
        }
        Log.w(A0h);
    }

    public static void A02(SSLSession sSLSession) {
        long j2;
        try {
            j2 = (long) sSLSession.getPeerCertificates().length;
        } catch (SSLPeerUnverifiedException e2) {
            Log.e((Throwable) e2);
            j2 = -1;
        }
        StringBuilder A0r = AnonymousClass000.A0r("age=");
        A0r.append(C13690nt.A09(System.currentTimeMillis() - sSLSession.getCreationTime()));
        A0r.append(", creation=");
        A0r.append(sSLSession.getCreationTime());
        A0r.append(", protocol=");
        A0r.append(sSLSession.getProtocol());
        A0r.append(", valid=");
        A0r.append(sSLSession.isValid());
        A0r.append(", peerCertificateCount=");
        A0r.append(j2);
        A0r.toString();
    }
}
