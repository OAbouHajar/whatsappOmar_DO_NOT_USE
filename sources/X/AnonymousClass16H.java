package X;

import android.net.Uri;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;

/* renamed from: X.16H  reason: invalid class name */
public class AnonymousClass16H implements C19950zG {
    public final C17130ua A00;
    public final C17660vR A01;

    public AnonymousClass16H(C17130ua r1, C17660vR r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0090 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C37801pl A00(java.lang.Integer r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, java.util.Map r10, boolean r11, boolean r12) {
        /*
            r5 = this;
            java.lang.String r1 = "POST"
            java.net.URL r0 = new java.net.URL
            r0.<init>(r7)
            java.net.URLConnection r3 = r0.openConnection()
            java.net.HttpURLConnection r3 = (java.net.HttpURLConnection) r3
            r0 = 15000(0x3a98, float:2.102E-41)
            r3.setConnectTimeout(r0)
            r0 = 30000(0x7530, float:4.2039E-41)
            r3.setReadTimeout(r0)
            if (r9 != 0) goto L_0x001f
            X.0vR r0 = r5.A01
            java.lang.String r9 = r0.A00()
        L_0x001f:
            java.lang.String r0 = "User-Agent"
            r3.setRequestProperty(r0, r9)
            java.lang.String r2 = "gzip"
            if (r11 == 0) goto L_0x002d
            java.lang.String r0 = "Accept-Encoding"
            r3.setRequestProperty(r0, r2)
        L_0x002d:
            if (r8 == 0) goto L_0x0044
            r3.setRequestMethod(r1)
            r0 = 1
            r3.setDoOutput(r0)
            java.lang.String r1 = "Content-Type"
            java.lang.String r0 = "application/json"
            r3.setRequestProperty(r1, r0)
            if (r12 == 0) goto L_0x0044
            java.lang.String r0 = "Content-Encoding"
            r3.setRequestProperty(r0, r2)
        L_0x0044:
            if (r10 == 0) goto L_0x006a
            java.util.Set r0 = r10.entrySet()
            java.util.Iterator r2 = r0.iterator()
        L_0x004e:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x006a
            java.lang.Object r0 = r2.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.getValue()
            java.lang.String r0 = (java.lang.String) r0
            r3.setRequestProperty(r1, r0)
            goto L_0x004e
        L_0x006a:
            if (r8 == 0) goto L_0x00a3
            X.0ua r4 = r5.A00
            r1 = 0
            java.io.OutputStream r0 = r3.getOutputStream()
            X.1pm r2 = new X.1pm
            r2.<init>(r4, r0, r1, r6)
            if (r12 == 0) goto L_0x0091
            java.util.zip.GZIPOutputStream r1 = new java.util.zip.GZIPOutputStream     // Catch:{ all -> 0x009b }
            r1.<init>(r2)     // Catch:{ all -> 0x009b }
            java.lang.String r0 = X.AnonymousClass01S.A08     // Catch:{ all -> 0x008c }
            byte[] r0 = r8.getBytes(r0)     // Catch:{ all -> 0x008c }
            r1.write(r0)     // Catch:{ all -> 0x008c }
            r1.close()     // Catch:{ all -> 0x009b }
            goto L_0x00a0
        L_0x008c:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x0090 }
        L_0x0090:
            throw r0     // Catch:{ all -> 0x009b }
        L_0x0091:
            java.lang.String r0 = X.AnonymousClass01S.A08     // Catch:{ all -> 0x009b }
            byte[] r0 = r8.getBytes(r0)     // Catch:{ all -> 0x009b }
            r2.write(r0)     // Catch:{ all -> 0x009b }
            goto L_0x00a0
        L_0x009b:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x009f }
        L_0x009f:
            throw r0
        L_0x00a0:
            r2.close()
        L_0x00a3:
            r3.connect()
            r1 = 0
            X.1pk r0 = new X.1pk
            r0.<init>(r1, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass16H.A00(java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.util.Map, boolean, boolean):X.1pl");
    }

    public C37801pl A7K(C17670vS r5, String str, String str2, String str3, String str4) {
        try {
            try {
                URLConnection openConnection = new URL(Uri.parse(str).toString()).openConnection();
                if (openConnection instanceof HttpsURLConnection) {
                    HttpsURLConnection httpsURLConnection = (HttpsURLConnection) openConnection;
                    httpsURLConnection.setSSLSocketFactory(r5.A02());
                    httpsURLConnection.setConnectTimeout(15000);
                    httpsURLConnection.setReadTimeout(30000);
                    if (str3 != null) {
                        httpsURLConnection.addRequestProperty("If-None-Match", str3);
                    }
                    if (str2 == null) {
                        str2 = this.A01.A00();
                    }
                    httpsURLConnection.setRequestProperty("User-Agent", str2);
                    return new C37791pk((Boolean) null, httpsURLConnection);
                }
                throw new IOException("WaHttpUrlConnectionClient/createDownloadableFilesConnection/failed to open http url connection");
            } catch (IOException e2) {
                throw new IOException("WaHttpUrlConnectionClient/createDownloadableFilesConnection/failed to open http url connection", e2);
            }
        } catch (MalformedURLException e3) {
            Log.e("WaHttpUrlConnectionClient/createDownloadableFilesConnection/malformed-url : ", e3);
            throw e3;
        }
    }

    public C37801pl AFY(String str) {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setConnectTimeout(15000);
        httpURLConnection.setReadTimeout(30000);
        httpURLConnection.connect();
        return new C37791pk((Boolean) null, httpURLConnection);
    }
}
