package X;

import com.facebook.msys.mci.DataTaskListener;
import com.facebook.msys.mci.UrlRequest;
import java.io.File;
import java.io.FileInputStream;
import java.net.URL;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: X.1z9  reason: invalid class name */
public class AnonymousClass1z9 implements C42991zA {
    public int A00;
    public final DataTaskListener A01;
    public final C17130ua A02;
    public final C17670vS A03;
    public final C17660vR A04;
    public final C16320sq A05;
    public final File A06;
    public final Map A07 = Collections.synchronizedMap(new HashMap());

    public AnonymousClass1z9(C17130ua r2, C17670vS r3, C17660vR r4, C16320sq r5, File file) {
        this.A04 = r4;
        this.A05 = r5;
        this.A02 = r2;
        this.A03 = r3;
        this.A06 = file;
        this.A01 = new C62493Dt(this);
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x008c */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:19:0x0084=Splitter:B:19:0x0084, B:24:0x008c=Splitter:B:24:0x008c} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.facebook.msys.mci.UrlResponse A00(com.facebook.msys.mci.NetworkSession r22, com.facebook.msys.mci.UrlRequest r23, java.io.FileInputStream r24, java.io.OutputStream r25, java.lang.String r26, boolean r27, boolean r28) {
        /*
            r21 = this;
            r3 = r23
            r3.getUrl()
            byte[] r8 = r3.getHttpBody()
            r10 = r21
            r7 = r24
            javax.net.ssl.HttpsURLConnection r19 = r10.A01(r3, r7, r8)
            boolean r0 = r19.getDoOutput()     // Catch:{ all -> 0x00ba }
            r9 = r22
            r11 = r26
            if (r0 == 0) goto L_0x0096
            X.0ua r5 = r10.A02     // Catch:{ IllegalArgumentException | IndexOutOfBoundsException -> 0x008d }
            r4 = 0
            r0 = 29
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)     // Catch:{ IllegalArgumentException | IndexOutOfBoundsException -> 0x008d }
            java.io.OutputStream r1 = r19.getOutputStream()     // Catch:{ IllegalArgumentException | IndexOutOfBoundsException -> 0x008d }
            X.1pm r0 = new X.1pm     // Catch:{ IllegalArgumentException | IndexOutOfBoundsException -> 0x008d }
            r0.<init>(r5, r1, r4, r2)     // Catch:{ IllegalArgumentException | IndexOutOfBoundsException -> 0x008d }
            java.io.DataOutputStream r4 = new java.io.DataOutputStream     // Catch:{ IllegalArgumentException | IndexOutOfBoundsException -> 0x008d }
            r4.<init>(r0)     // Catch:{ IllegalArgumentException | IndexOutOfBoundsException -> 0x008d }
            r5 = 10240(0x2800, float:1.4349E-41)
            r2 = 0
            if (r24 == 0) goto L_0x0061
            int r14 = r7.available()     // Catch:{ all -> 0x0088 }
            int r6 = java.lang.Math.min(r5, r14)     // Catch:{ all -> 0x0088 }
            byte[] r1 = new byte[r6]     // Catch:{ all -> 0x0088 }
        L_0x0041:
            int r12 = r7.read(r1, r2, r6)     // Catch:{ all -> 0x0088 }
            r4.write(r1, r2, r12)     // Catch:{ all -> 0x0088 }
            int r0 = r7.available()     // Catch:{ all -> 0x0088 }
            int r6 = java.lang.Math.min(r5, r0)     // Catch:{ all -> 0x0088 }
            int r13 = r14 - r0
            if (r27 == 0) goto L_0x005e
            r15 = 1
            com.facebook.msys.mci.common.RunnableNRunnableShape0S1203000_I0 r8 = new com.facebook.msys.mci.common.RunnableNRunnableShape0S1203000_I0     // Catch:{ all -> 0x0088 }
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)     // Catch:{ all -> 0x0088 }
            r0 = 3
            com.facebook.msys.mci.Execution.executeAsyncWithPriority(r8, r0, r2)     // Catch:{ all -> 0x0088 }
        L_0x005e:
            if (r12 > 0) goto L_0x0041
            goto L_0x0084
        L_0x0061:
            int r7 = r8.length     // Catch:{ all -> 0x0088 }
            r6 = r7
        L_0x0063:
            if (r2 >= r6) goto L_0x0084
            int r0 = java.lang.Math.min(r5, r7)     // Catch:{ all -> 0x0088 }
            r4.write(r8, r2, r0)     // Catch:{ all -> 0x0088 }
            int r7 = r7 - r0
            int r2 = r2 + r0
            if (r27 == 0) goto L_0x0063
            X.3Tp r12 = new X.3Tp     // Catch:{ all -> 0x0088 }
            r13 = r9
            r14 = r10
            r15 = r11
            r16 = r8
            r17 = r0
            r18 = r2
            r12.<init>(r13, r14, r15, r16, r17, r18)     // Catch:{ all -> 0x0088 }
            r1 = 3
            r0 = 0
            com.facebook.msys.mci.Execution.executeAsyncWithPriority(r12, r1, r0)     // Catch:{ all -> 0x0088 }
            goto L_0x0063
        L_0x0084:
            r4.close()     // Catch:{ IllegalArgumentException | IndexOutOfBoundsException -> 0x008d }
            goto L_0x0096
        L_0x0088:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x008c }
        L_0x008c:
            throw r0     // Catch:{ IllegalArgumentException | IndexOutOfBoundsException -> 0x008d }
        L_0x008d:
            r2 = move-exception
            java.lang.String r1 = "Failed to setup connection"
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x00ba }
            r0.<init>(r1, r2)     // Catch:{ all -> 0x00ba }
            throw r0     // Catch:{ all -> 0x00ba }
        L_0x0096:
            r17 = r25
            r20 = r28
            r15 = r10
            r16 = r9
            r18 = r11
            r15.A02(r16, r17, r18, r19, r20)     // Catch:{ all -> 0x00ba }
            int r2 = r19.getResponseCode()     // Catch:{ all -> 0x00ba }
            java.util.Map r0 = r19.getHeaderFields()     // Catch:{ all -> 0x00ba }
            java.util.Map r1 = com.facebook.msys.mci.NetworkUtils.flattenHeaders((java.util.Map) r0)     // Catch:{ all -> 0x00ba }
            com.facebook.msys.mci.UrlResponse r0 = new com.facebook.msys.mci.UrlResponse     // Catch:{ all -> 0x00ba }
            r0.<init>(r3, r2, r1)     // Catch:{ all -> 0x00ba }
            r19.getResponseCode()     // Catch:{ all -> 0x00ba }
            r19.disconnect()
            return r0
        L_0x00ba:
            r0 = move-exception
            r19.disconnect()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1z9.A00(com.facebook.msys.mci.NetworkSession, com.facebook.msys.mci.UrlRequest, java.io.FileInputStream, java.io.OutputStream, java.lang.String, boolean, boolean):com.facebook.msys.mci.UrlResponse");
    }

    public final HttpsURLConnection A01(UrlRequest urlRequest, FileInputStream fileInputStream, byte[] bArr) {
        int length;
        HttpsURLConnection httpsURLConnection = (HttpsURLConnection) new URL(urlRequest.getUrl()).openConnection();
        Map httpHeaders = urlRequest.getHttpHeaders();
        httpsURLConnection.setDoInput(true);
        httpsURLConnection.setRequestMethod(urlRequest.getHttpMethod());
        httpsURLConnection.setRequestProperty("User-Agent", this.A04.A00());
        httpsURLConnection.setRequestProperty("WaMsysRequest", "1");
        if (httpHeaders.containsKey("X-Forwarded-Host")) {
            httpsURLConnection.setSSLSocketFactory((SSLSocketFactory) SSLSocketFactory.getDefault());
        } else {
            if (httpHeaders.containsKey("Host")) {
                httpsURLConnection.setHostnameVerifier(new C38011q6((String) httpHeaders.get("Host"), HttpsURLConnection.getDefaultHostnameVerifier()));
            }
            httpsURLConnection.setSSLSocketFactory(this.A03.A02());
        }
        int i2 = this.A00;
        if (i2 > 0) {
            httpsURLConnection.setConnectTimeout(i2);
            httpsURLConnection.setReadTimeout(this.A00);
        }
        if (!(bArr == null && fileInputStream == null)) {
            httpsURLConnection.setDoOutput(true);
            if (fileInputStream != null) {
                length = fileInputStream.available();
            } else {
                AnonymousClass00B.A06(bArr);
                length = bArr.length;
            }
            httpsURLConnection.setFixedLengthStreamingMode(length);
        }
        for (Map.Entry entry : httpHeaders.entrySet()) {
            httpsURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        return httpsURLConnection;
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x003e */
    /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x009a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02(com.facebook.msys.mci.NetworkSession r12, java.io.OutputStream r13, java.lang.String r14, java.net.HttpURLConnection r15, boolean r16) {
        /*
            r11 = this;
            r5 = r11
            X.0ua r4 = r11.A02     // Catch:{ IOException -> 0x0048, IllegalArgumentException | IndexOutOfBoundsException -> 0x003f }
            r3 = 0
            r0 = 29
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ IOException -> 0x0048, IllegalArgumentException | IndexOutOfBoundsException -> 0x003f }
            java.io.InputStream r0 = r15.getInputStream()     // Catch:{ IOException -> 0x0048, IllegalArgumentException | IndexOutOfBoundsException -> 0x003f }
            X.1qW r2 = new X.1qW     // Catch:{ IOException -> 0x0048, IllegalArgumentException | IndexOutOfBoundsException -> 0x003f }
            r2.<init>(r4, r0, r3, r1)     // Catch:{ IOException -> 0x0048, IllegalArgumentException | IndexOutOfBoundsException -> 0x003f }
            int r9 = r15.getContentLength()     // Catch:{ all -> 0x003a }
            r0 = 10240(0x2800, float:1.4349E-41)
            byte[] r1 = new byte[r0]     // Catch:{ all -> 0x003a }
            r10 = 0
            r8 = 0
        L_0x001d:
            int r7 = r2.read(r1)     // Catch:{ all -> 0x003a }
            r0 = -1
            if (r7 == r0) goto L_0x0036
            r13.write(r1, r10, r7)     // Catch:{ all -> 0x003a }
            int r8 = r8 + r7
            if (r16 == 0) goto L_0x001d
            com.facebook.msys.mci.common.RunnableNRunnableShape0S1203000_I0 r3 = new com.facebook.msys.mci.common.RunnableNRunnableShape0S1203000_I0     // Catch:{ all -> 0x003a }
            r4 = r12
            r6 = r14
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)     // Catch:{ all -> 0x003a }
            r0 = 3
            com.facebook.msys.mci.Execution.executeAsyncWithPriority(r3, r0, r10)     // Catch:{ all -> 0x003a }
            goto L_0x001d
        L_0x0036:
            r2.close()     // Catch:{ IOException -> 0x0048, IllegalArgumentException | IndexOutOfBoundsException -> 0x003f }
            return
        L_0x003a:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x003e }
        L_0x003e:
            throw r0     // Catch:{ IOException -> 0x0048, IllegalArgumentException | IndexOutOfBoundsException -> 0x003f }
        L_0x003f:
            r1 = move-exception
            java.lang.String r0 = "Malformed Http Response"
            java.io.IOException r2 = new java.io.IOException
            r2.<init>(r0, r1)
            throw r2
        L_0x0048:
            int r3 = r15.getResponseCode()
            r0 = 400(0x190, float:5.6E-43)
            if (r3 < r0) goto L_0x00a1
            r0 = 500(0x1f4, float:7.0E-43)
            if (r3 > r0) goto L_0x00a1
            r2 = 0
            r0 = 1
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r7 = 0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            r1[r7] = r0
            java.lang.String r0 = "[HTTP status=%d] Error Content = "
            java.lang.String r6 = java.lang.String.format(r2, r0, r1)
            java.io.InputStream r5 = r15.getErrorStream()     // Catch:{ IOException -> 0x009b }
            if (r5 == 0) goto L_0x009b
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0096 }
            r4.<init>()     // Catch:{ all -> 0x0096 }
            r4.append(r6)     // Catch:{ all -> 0x0096 }
            java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream     // Catch:{ all -> 0x0096 }
            r3.<init>()     // Catch:{ all -> 0x0096 }
            r0 = 1024(0x400, float:1.435E-42)
            byte[] r2 = new byte[r0]     // Catch:{ all -> 0x0096 }
        L_0x007c:
            int r1 = r5.read(r2)     // Catch:{ all -> 0x0096 }
            r0 = -1
            if (r1 == r0) goto L_0x0087
            r3.write(r2, r7, r1)     // Catch:{ all -> 0x0096 }
            goto L_0x007c
        L_0x0087:
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x0096 }
            r4.append(r0)     // Catch:{ all -> 0x0096 }
            java.lang.String r6 = r4.toString()     // Catch:{ all -> 0x0096 }
            r5.close()     // Catch:{ IOException -> 0x009b }
            goto L_0x009b
        L_0x0096:
            r0 = move-exception
            r5.close()     // Catch:{ all -> 0x009a }
        L_0x009a:
            throw r0     // Catch:{ IOException -> 0x009b }
        L_0x009b:
            java.io.IOException r2 = new java.io.IOException
            r2.<init>(r6)
            throw r2
        L_0x00a1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1z9.A02(com.facebook.msys.mci.NetworkSession, java.io.OutputStream, java.lang.String, java.net.HttpURLConnection, boolean):void");
    }
}
