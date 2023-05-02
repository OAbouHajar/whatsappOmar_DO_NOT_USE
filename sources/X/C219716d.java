package X;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.Socket;

/* renamed from: X.16d  reason: invalid class name and case insensitive filesystem */
public final class C219716d {
    public Class A00;
    public Method A01;
    public Method A02;
    public boolean A03;

    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:8:? A[ExcHandler: NoSuchMethodException (unused java.lang.NoSuchMethodException), SYNTHETIC, Splitter:B:5:0x000e] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C219716d() {
        /*
            r6 = this;
            r6.<init>()
            java.lang.String r0 = "com.android.org.conscrypt.OpenSSLSocketImpl"
            java.lang.Class r3 = java.lang.Class.forName(r0)     // Catch:{ ClassNotFoundException -> 0x000c }
            r6.A00 = r3     // Catch:{ ClassNotFoundException -> 0x000c }
            goto L_0x0014
        L_0x000c:
            java.lang.String r0 = "org.apache.harmony.xnet.provider.jsse.OpenSSLSocketImpl"
            java.lang.Class r3 = java.lang.Class.forName(r0)     // Catch:{ NoSuchMethodException -> 0x0038, NoSuchMethodException -> 0x0038 }
            r6.A00 = r3     // Catch:{ NoSuchMethodException -> 0x0038, NoSuchMethodException -> 0x0038 }
        L_0x0014:
            java.lang.String r2 = "setUseSessionTickets"
            r5 = 1
            java.lang.Class[] r1 = new java.lang.Class[r5]     // Catch:{ NoSuchMethodException -> 0x0038, NoSuchMethodException -> 0x0038 }
            java.lang.Class r0 = java.lang.Boolean.TYPE     // Catch:{ NoSuchMethodException -> 0x0038, NoSuchMethodException -> 0x0038 }
            r4 = 0
            r1[r4] = r0     // Catch:{ NoSuchMethodException -> 0x0038, NoSuchMethodException -> 0x0038 }
            java.lang.reflect.Method r0 = r3.getMethod(r2, r1)     // Catch:{ NoSuchMethodException -> 0x0038, NoSuchMethodException -> 0x0038 }
            r6.A02 = r0     // Catch:{ NoSuchMethodException -> 0x0038, NoSuchMethodException -> 0x0038 }
            java.lang.Class r3 = r6.A00     // Catch:{ NoSuchMethodException -> 0x0038, NoSuchMethodException -> 0x0038 }
            java.lang.String r2 = "setHostname"
            java.lang.Class[] r1 = new java.lang.Class[r5]     // Catch:{ NoSuchMethodException -> 0x0038, NoSuchMethodException -> 0x0038 }
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            r1[r4] = r0     // Catch:{ NoSuchMethodException -> 0x0038, NoSuchMethodException -> 0x0038 }
            java.lang.reflect.Method r0 = r3.getMethod(r2, r1)     // Catch:{ NoSuchMethodException -> 0x0038, NoSuchMethodException -> 0x0038 }
            r6.A01 = r0     // Catch:{ NoSuchMethodException -> 0x0038, NoSuchMethodException -> 0x0038 }
            r6.A03 = r5     // Catch:{ NoSuchMethodException -> 0x0038, NoSuchMethodException -> 0x0038 }
        L_0x0038:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C219716d.<init>():void");
    }

    public void A00(String str, Socket socket) {
        if (this.A03 && this.A00.isInstance(socket)) {
            try {
                this.A02.invoke(socket, new Object[]{Boolean.TRUE});
                this.A01.invoke(socket, new Object[]{str});
            } catch (InvocationTargetException e2) {
                throw new RuntimeException(e2);
            } catch (IllegalAccessException e3) {
                throw new AssertionError(e3);
            }
        }
    }
}
