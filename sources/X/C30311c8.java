package X;

import com.whatsapp.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.Socket;
import org.json.JSONObject;

/* renamed from: X.1c8  reason: invalid class name and case insensitive filesystem */
public class C30311c8 {
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001c, code lost:
        r0 = r2.toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x004c, code lost:
        r4.close();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x0041 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0046 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String A00(java.io.InputStream r6) {
        /*
            r0 = 0
            if (r6 == 0) goto L_0x004f
            r0 = 8192(0x2000, float:1.14794E-41)
            char[] r5 = new char[r0]
            java.io.InputStreamReader r4 = new java.io.InputStreamReader
            r4.<init>(r6)
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch:{ all -> 0x0047 }
            r3.<init>(r4)     // Catch:{ all -> 0x0047 }
            java.io.StringWriter r2 = new java.io.StringWriter     // Catch:{ all -> 0x0042 }
            r2.<init>()     // Catch:{ all -> 0x0042 }
        L_0x0016:
            int r1 = r3.read(r5)     // Catch:{ all -> 0x003d }
            if (r1 >= 0) goto L_0x0021
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x003d }
            goto L_0x0030
        L_0x0021:
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x003d }
            boolean r0 = r0.isInterrupted()     // Catch:{ all -> 0x003d }
            if (r0 != 0) goto L_0x0037
            r0 = 0
            r2.write(r5, r0, r1)     // Catch:{ all -> 0x003d }
            goto L_0x0016
        L_0x0030:
            r2.close()     // Catch:{ all -> 0x0042 }
            r3.close()     // Catch:{ all -> 0x0047 }
            goto L_0x004c
        L_0x0037:
            java.io.InterruptedIOException r0 = new java.io.InterruptedIOException     // Catch:{ all -> 0x003d }
            r0.<init>()     // Catch:{ all -> 0x003d }
            throw r0     // Catch:{ all -> 0x003d }
        L_0x003d:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x0041 }
        L_0x0041:
            throw r0     // Catch:{ all -> 0x0042 }
        L_0x0042:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x0046 }
        L_0x0046:
            throw r0     // Catch:{ all -> 0x0047 }
        L_0x0047:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x004b }
        L_0x004b:
            throw r0
        L_0x004c:
            r4.close()
        L_0x004f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C30311c8.A00(java.io.InputStream):java.lang.String");
    }

    public static String A01(HttpURLConnection httpURLConnection) {
        return A00(httpURLConnection.getErrorStream());
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x0020 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0025 */
    @java.lang.Deprecated
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List A02(byte[] r4) {
        /*
            java.io.ByteArrayInputStream r3 = new java.io.ByteArrayInputStream     // Catch:{ IOException | ClassNotFoundException | NullPointerException -> 0x0026 }
            r3.<init>(r4)     // Catch:{ IOException | ClassNotFoundException | NullPointerException -> 0x0026 }
            java.io.ObjectInputStream r2 = new java.io.ObjectInputStream     // Catch:{ all -> 0x0021 }
            r2.<init>(r3)     // Catch:{ all -> 0x0021 }
            java.lang.Object r1 = r2.readObject()     // Catch:{ all -> 0x001c }
            java.util.List r1 = (java.util.List) r1     // Catch:{ all -> 0x001c }
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x001c }
            r0.<init>(r1)     // Catch:{ all -> 0x001c }
            r2.close()     // Catch:{ all -> 0x0021 }
            r3.close()     // Catch:{ IOException | ClassNotFoundException | NullPointerException -> 0x0026 }
            return r0
        L_0x001c:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x0020 }
        L_0x0020:
            throw r0     // Catch:{ all -> 0x0021 }
        L_0x0021:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x0025 }
        L_0x0025:
            throw r0     // Catch:{ IOException | ClassNotFoundException | NullPointerException -> 0x0026 }
        L_0x0026:
            r1 = move-exception
            java.lang.String r0 = "ContactUtil/getContactsFromBytes/error getting contacts from data"
            com.whatsapp.util.Log.e(r0, r1)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C30311c8.A02(byte[]):java.util.List");
    }

    public static JSONObject A03(InputStream inputStream) {
        String A00 = A00(inputStream);
        if (A00 != null) {
            return new JSONObject(A00);
        }
        return null;
    }

    public static void A04(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable th) {
                Log.e(th);
            }
        }
    }

    public static void A05(Closeable closeable, Closeable closeable2, Closeable closeable3) {
        A04(closeable);
        A04(closeable2);
        A04(closeable3);
    }

    public static void A06(InputStream inputStream, long j2) {
        while (j2 > 0) {
            long skip = inputStream.skip(j2);
            if (skip > 0) {
                j2 -= skip;
            } else if (inputStream.read() != -1) {
                j2--;
            } else {
                return;
            }
        }
    }

    public static void A07(Socket socket) {
        if (socket != null) {
            try {
                socket.close();
            } catch (Throwable th) {
                Log.e(th);
            }
        }
    }

    public static byte[] A08(InputStream inputStream) {
        byte[] bArr = new byte[8192];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(inputStream.available());
        while (true) {
            try {
                int read = inputStream.read(bArr, 0, 8192);
                if (read < 0) {
                    byteArrayOutputStream.flush();
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.close();
                    return byteArray;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            } catch (Throwable unused) {
            }
        }
        throw th;
    }
}
