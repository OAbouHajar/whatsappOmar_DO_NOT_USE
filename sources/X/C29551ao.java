package X;

import android.util.Pair;
import com.whatsapp.util.Log;
import com.whatsapp.util.NativeUtils;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.1ao  reason: invalid class name and case insensitive filesystem */
public class C29551ao {
    public long A00;
    public long A01;
    public Boolean A02;
    public String A03;
    public final C17130ua A04;
    public final C29541an A05;
    public final C17670vS A06;
    public final Integer A07;
    public final String A08;
    public final String A09;
    public final List A0A = new LinkedList();
    public final List A0B = new LinkedList();
    public final List A0C = new LinkedList();
    public final List A0D = new LinkedList();
    public final AtomicBoolean A0E = new AtomicBoolean();
    public final AtomicReference A0F = new AtomicReference();
    public final boolean A0G;
    public final boolean A0H;
    public final boolean A0I;

    public C29551ao(C17130ua r2, C29541an r3, C17670vS r4, String str, String str2, int i2, boolean z2, boolean z3, boolean z4) {
        this.A06 = r4;
        this.A08 = str;
        this.A09 = str2;
        this.A05 = r3;
        this.A0H = z2;
        this.A0I = z3;
        this.A04 = r2;
        this.A07 = Integer.valueOf(i2);
        this.A0G = z4;
    }

    public static String A00(URL url) {
        if (!(url == null || url.getHost() == null)) {
            try {
                return InetAddress.getByName(url.getHost()).getHostAddress();
            } catch (UnknownHostException unused) {
            }
        }
        return null;
    }

    public static void A01(C30741cs r1, Exception exc, URL url) {
        r1.A0B(exc);
        r1.A0T = A00(url);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0411, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:?, code lost:
        r12.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x035f, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:?, code lost:
        r1 = new java.lang.StringBuilder("failure during latePostParam call; name=");
        r1.append((java.lang.String) r2.first);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0377, code lost:
        throw new java.io.IOException(r1.toString(), r3);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:42:0x0161, B:84:0x034c] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:125:0x0415 */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x03ff A[LOOP:4: B:115:0x03f9->B:117:0x03ff, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A02(X.C29561ap r24) {
        /*
            r23 = this;
            r8 = r23
            r10 = r24
            if (r24 == 0) goto L_0x0014
            java.util.List r3 = r8.A0D
            java.lang.String r2 = r10.A01
            java.lang.String r1 = "auth"
            android.util.Pair r0 = new android.util.Pair
            r0.<init>(r1, r2)
            r3.add(r0)
        L_0x0014:
            java.util.UUID r0 = java.util.UUID.randomUUID()     // Catch:{ all -> 0x043e }
            java.lang.String r9 = r0.toString()     // Catch:{ all -> 0x043e }
            java.lang.String r7 = r8.A08     // Catch:{ all -> 0x043e }
            android.net.Uri r0 = android.net.Uri.parse(r7)     // Catch:{ all -> 0x043e }
            android.net.Uri$Builder r3 = r0.buildUpon()     // Catch:{ all -> 0x043e }
            java.util.List r0 = r8.A0D     // Catch:{ all -> 0x043e }
            java.util.Iterator r2 = r0.iterator()     // Catch:{ all -> 0x043e }
        L_0x002c:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x043e }
            if (r0 == 0) goto L_0x0044
            java.lang.Object r0 = r2.next()     // Catch:{ all -> 0x043e }
            android.util.Pair r0 = (android.util.Pair) r0     // Catch:{ all -> 0x043e }
            java.lang.Object r1 = r0.first     // Catch:{ all -> 0x043e }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x043e }
            java.lang.Object r0 = r0.second     // Catch:{ all -> 0x043e }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x043e }
            r3.appendQueryParameter(r1, r0)     // Catch:{ all -> 0x043e }
            goto L_0x002c
        L_0x0044:
            java.lang.String r1 = r3.toString()     // Catch:{ all -> 0x043e }
            java.net.URL r0 = new java.net.URL     // Catch:{ all -> 0x043e }
            r0.<init>(r1)     // Catch:{ all -> 0x043e }
            java.net.URLConnection r6 = r0.openConnection()     // Catch:{ all -> 0x043e }
            javax.net.ssl.HttpsURLConnection r6 = (javax.net.ssl.HttpsURLConnection) r6     // Catch:{ all -> 0x043e }
            boolean r0 = r8.A0H     // Catch:{ IllegalArgumentException -> 0x0432 }
            if (r0 == 0) goto L_0x0063
            r1 = 1
            X.0vS r0 = r8.A06     // Catch:{ IllegalArgumentException -> 0x0432 }
            X.1ae r15 = r0.A01(r1)     // Catch:{ IllegalArgumentException -> 0x0432 }
        L_0x005e:
            boolean r0 = r8.A0I     // Catch:{ IllegalArgumentException -> 0x0432 }
            if (r0 == 0) goto L_0x007a
            goto L_0x006a
        L_0x0063:
            X.0vS r0 = r8.A06     // Catch:{ IllegalArgumentException -> 0x0432 }
            X.1ad r15 = r0.A02()     // Catch:{ IllegalArgumentException -> 0x0432 }
            goto L_0x005e
        L_0x006a:
            if (r24 == 0) goto L_0x007a
            java.lang.String r2 = r10.A06     // Catch:{ IllegalArgumentException -> 0x0432 }
            javax.net.ssl.HostnameVerifier r1 = javax.net.ssl.HttpsURLConnection.getDefaultHostnameVerifier()     // Catch:{ IllegalArgumentException -> 0x0432 }
            X.1q6 r0 = new X.1q6     // Catch:{ IllegalArgumentException -> 0x0432 }
            r0.<init>(r2, r1)     // Catch:{ IllegalArgumentException -> 0x0432 }
            r6.setHostnameVerifier(r0)     // Catch:{ IllegalArgumentException -> 0x0432 }
        L_0x007a:
            int r5 = r15.AAm()     // Catch:{ IllegalArgumentException -> 0x0432 }
            r0 = r15
            javax.net.ssl.SSLSocketFactory r0 = (javax.net.ssl.SSLSocketFactory) r0     // Catch:{ IllegalArgumentException -> 0x0432 }
            r6.setSSLSocketFactory(r0)     // Catch:{ IllegalArgumentException -> 0x0432 }
            r0 = 15000(0x3a98, float:2.102E-41)
            r6.setConnectTimeout(r0)     // Catch:{ IllegalArgumentException -> 0x0432 }
            r0 = 60000(0xea60, float:8.4078E-41)
            r6.setReadTimeout(r0)     // Catch:{ IllegalArgumentException -> 0x0432 }
            java.lang.String r1 = "User-Agent"
            java.lang.String r0 = r8.A09     // Catch:{ IllegalArgumentException -> 0x0432 }
            r6.setRequestProperty(r1, r0)     // Catch:{ IllegalArgumentException -> 0x0432 }
            java.lang.String r1 = "Accept-Encoding"
            java.lang.String r0 = "identity"
            r6.setRequestProperty(r1, r0)     // Catch:{ IllegalArgumentException -> 0x0432 }
            r4 = 0
            if (r24 == 0) goto L_0x00a1
            goto L_0x00b8
        L_0x00a1:
            java.lang.String r2 = "Content-Type"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IllegalArgumentException -> 0x0432 }
            r1.<init>()     // Catch:{ IllegalArgumentException -> 0x0432 }
            java.lang.String r0 = "multipart/form-data; boundary="
            r1.append(r0)     // Catch:{ IllegalArgumentException -> 0x0432 }
            r1.append(r9)     // Catch:{ IllegalArgumentException -> 0x0432 }
            java.lang.String r0 = r1.toString()     // Catch:{ IllegalArgumentException -> 0x0432 }
            r6.setRequestProperty(r2, r0)     // Catch:{ IllegalArgumentException -> 0x0432 }
            goto L_0x0100
        L_0x00b8:
            java.lang.String r1 = "Host"
            java.lang.String r0 = r10.A06     // Catch:{ IllegalArgumentException -> 0x0432 }
            r6.setRequestProperty(r1, r0)     // Catch:{ IllegalArgumentException -> 0x0432 }
            java.util.List r12 = r8.A0A     // Catch:{ IllegalArgumentException -> 0x0432 }
            boolean r0 = r12.isEmpty()     // Catch:{ IllegalArgumentException -> 0x0432 }
            if (r0 != 0) goto L_0x0100
            java.lang.Object r0 = r12.get(r4)     // Catch:{ IllegalArgumentException -> 0x0432 }
            X.2JR r0 = (X.AnonymousClass2JR) r0     // Catch:{ IllegalArgumentException -> 0x0432 }
            long r2 = r0.A01     // Catch:{ IllegalArgumentException -> 0x0432 }
            java.lang.Object r0 = r12.get(r4)     // Catch:{ IllegalArgumentException -> 0x0432 }
            X.2JR r0 = (X.AnonymousClass2JR) r0     // Catch:{ IllegalArgumentException -> 0x0432 }
            long r0 = r0.A02     // Catch:{ IllegalArgumentException -> 0x0432 }
            r13 = 0
            int r11 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r11 <= 0) goto L_0x010c
            java.lang.String r3 = "Content-Range"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IllegalArgumentException -> 0x0432 }
            r2.<init>()     // Catch:{ IllegalArgumentException -> 0x0432 }
            java.lang.String r0 = "bytes "
            r2.append(r0)     // Catch:{ IllegalArgumentException -> 0x0432 }
            java.lang.Object r0 = r12.get(r4)     // Catch:{ IllegalArgumentException -> 0x0432 }
            X.2JR r0 = (X.AnonymousClass2JR) r0     // Catch:{ IllegalArgumentException -> 0x0432 }
            long r0 = r0.A02     // Catch:{ IllegalArgumentException -> 0x0432 }
            r2.append(r0)     // Catch:{ IllegalArgumentException -> 0x0432 }
            java.lang.String r0 = "-*/*"
            r2.append(r0)     // Catch:{ IllegalArgumentException -> 0x0432 }
            java.lang.String r0 = r2.toString()     // Catch:{ IllegalArgumentException -> 0x0432 }
            r6.setRequestProperty(r3, r0)     // Catch:{ IllegalArgumentException -> 0x0432 }
        L_0x0100:
            r0 = 1
            r6.setDoOutput(r0)     // Catch:{ IllegalArgumentException -> 0x0432 }
            r6.setChunkedStreamingMode(r4)     // Catch:{ IllegalArgumentException -> 0x0432 }
            long r11 = android.os.SystemClock.uptimeMillis()     // Catch:{ IllegalArgumentException -> 0x0432 }
            goto L_0x011e
        L_0x010c:
            boolean r0 = r8.A0G     // Catch:{ IllegalArgumentException -> 0x0432 }
            if (r0 == 0) goto L_0x0100
            int r0 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
            if (r0 <= 0) goto L_0x0100
            java.lang.String r1 = "Content-Length"
            java.lang.String r0 = java.lang.Long.toString(r2)     // Catch:{ IllegalArgumentException -> 0x0432 }
            r6.setRequestProperty(r1, r0)     // Catch:{ IllegalArgumentException -> 0x0432 }
            goto L_0x0100
        L_0x011e:
            r6.connect()     // Catch:{ all -> 0x0416 }
            long r0 = android.os.SystemClock.uptimeMillis()     // Catch:{ IllegalArgumentException -> 0x0432 }
            long r0 = r0 - r11
            r8.A00 = r0     // Catch:{ IllegalArgumentException -> 0x0432 }
            java.net.URL r0 = r6.getURL()     // Catch:{ IllegalArgumentException -> 0x0432 }
            java.lang.String r0 = A00(r0)     // Catch:{ IllegalArgumentException -> 0x0432 }
            r8.A03 = r0     // Catch:{ IllegalArgumentException -> 0x0432 }
            X.1an r0 = r8.A05     // Catch:{ IllegalArgumentException -> 0x0432 }
            r22 = r0
            r0.AP3(r7)     // Catch:{ IllegalArgumentException -> 0x0432 }
            int r0 = r15.AAm()     // Catch:{ IllegalArgumentException -> 0x0432 }
            if (r0 != r5) goto L_0x0140
            r4 = 1
        L_0x0140:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)     // Catch:{ IllegalArgumentException -> 0x0432 }
            r8.A02 = r0     // Catch:{ IllegalArgumentException -> 0x0432 }
            X.0ua r0 = r8.A04     // Catch:{ IllegalArgumentException -> 0x0432 }
            r21 = r0
            java.lang.Integer r0 = r8.A07     // Catch:{ IllegalArgumentException -> 0x0432 }
            r20 = r0
            r5 = 0
            java.io.OutputStream r3 = r6.getOutputStream()     // Catch:{ IllegalArgumentException -> 0x0432 }
            X.1pm r2 = new X.1pm     // Catch:{ IllegalArgumentException -> 0x0432 }
            r1 = r21
            r2.<init>(r1, r3, r5, r0)     // Catch:{ IllegalArgumentException -> 0x0432 }
            java.io.BufferedOutputStream r12 = new java.io.BufferedOutputStream     // Catch:{ IllegalArgumentException -> 0x0432 }
            r12.<init>(r2)     // Catch:{ IllegalArgumentException -> 0x0432 }
            if (r24 == 0) goto L_0x019f
            java.util.List r0 = r8.A0A     // Catch:{ all -> 0x0411 }
            r19 = r0
            int r0 = r19.size()     // Catch:{ all -> 0x0411 }
            if (r0 == 0) goto L_0x0398
            int r0 = r19.size()     // Catch:{ all -> 0x0411 }
            r3 = 0
            r2 = 1
            if (r0 == r2) goto L_0x0174
            r2 = 0
        L_0x0174:
            java.lang.String r0 = "MMS4 upload only supports a single file; we have been given "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0411 }
            r1.<init>(r0)     // Catch:{ all -> 0x0411 }
            int r0 = r19.size()     // Catch:{ all -> 0x0411 }
            r1.append(r0)     // Catch:{ all -> 0x0411 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0411 }
            X.AnonymousClass00B.A0B(r0, r2)     // Catch:{ all -> 0x0411 }
            r0 = r19
            java.lang.Object r2 = r0.get(r3)     // Catch:{ all -> 0x0411 }
            X.2JR r2 = (X.AnonymousClass2JR) r2     // Catch:{ all -> 0x0411 }
            java.util.concurrent.atomic.AtomicLong r1 = new java.util.concurrent.atomic.AtomicLong     // Catch:{ all -> 0x0411 }
            r1.<init>()     // Catch:{ all -> 0x0411 }
            android.util.Pair r0 = r8.A03()     // Catch:{ all -> 0x0411 }
            r8.A04(r0, r2, r12, r1)     // Catch:{ all -> 0x0411 }
            goto L_0x0398
        L_0x019f:
            android.util.Pair r17 = r8.A03()     // Catch:{ all -> 0x0411 }
            r0 = 2
            byte[] r13 = new byte[r0]     // Catch:{ all -> 0x0411 }
            r13 = {13, 10} // fill-array     // Catch:{ all -> 0x0411 }
            java.util.List r0 = r8.A0A     // Catch:{ all -> 0x0411 }
            r19 = r0
            java.util.Iterator r16 = r19.iterator()     // Catch:{ all -> 0x0411 }
            r1 = 0
        L_0x01b2:
            boolean r0 = r16.hasNext()     // Catch:{ all -> 0x0411 }
            java.lang.String r15 = "\r\n"
            java.lang.String r14 = "Content-Disposition: form-data; name=\""
            java.lang.String r11 = "\\\""
            java.lang.String r10 = "\""
            java.lang.String r7 = "\\\\"
            java.lang.String r4 = "\\"
            java.lang.String r3 = "--"
            if (r0 == 0) goto L_0x028b
            java.lang.Object r2 = r16.next()     // Catch:{ all -> 0x0411 }
            X.2JR r2 = (X.AnonymousClass2JR) r2     // Catch:{ all -> 0x0411 }
            if (r1 == 0) goto L_0x01d1
            r12.write(r13)     // Catch:{ all -> 0x0411 }
        L_0x01d1:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0411 }
            r0.<init>()     // Catch:{ all -> 0x0411 }
            r0.append(r3)     // Catch:{ all -> 0x0411 }
            r0.append(r9)     // Catch:{ all -> 0x0411 }
            r0.append(r15)     // Catch:{ all -> 0x0411 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0411 }
            byte[] r0 = r0.getBytes()     // Catch:{ all -> 0x0411 }
            r12.write(r0)     // Catch:{ all -> 0x0411 }
            java.lang.String r0 = r2.A05     // Catch:{ all -> 0x0411 }
            java.lang.String r0 = r0.replace(r4, r7)     // Catch:{ all -> 0x0411 }
            java.lang.String r15 = r0.replace(r10, r11)     // Catch:{ all -> 0x0411 }
            java.lang.String r1 = r2.A04     // Catch:{ all -> 0x0411 }
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x0411 }
            java.lang.String r3 = "\"\r\n"
            if (r0 != 0) goto L_0x0278
            java.lang.String r0 = r1.replace(r4, r7)     // Catch:{ all -> 0x0411 }
            java.lang.String r4 = r0.replace(r10, r11)     // Catch:{ all -> 0x0411 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0411 }
            r1.<init>()     // Catch:{ all -> 0x0411 }
            r1.append(r14)     // Catch:{ all -> 0x0411 }
            r1.append(r15)     // Catch:{ all -> 0x0411 }
            java.lang.String r0 = "\"; filename=\""
            r1.append(r0)     // Catch:{ all -> 0x0411 }
            r1.append(r4)     // Catch:{ all -> 0x0411 }
            r1.append(r3)     // Catch:{ all -> 0x0411 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0411 }
        L_0x0220:
            byte[] r0 = r0.getBytes()     // Catch:{ all -> 0x0411 }
            r12.write(r0)     // Catch:{ all -> 0x0411 }
            int r1 = r2.A00     // Catch:{ all -> 0x0411 }
            if (r1 != 0) goto L_0x026f
            java.lang.String r0 = "Content-Type: application/x-gzip\r\n"
            byte[] r0 = r0.getBytes()     // Catch:{ all -> 0x0411 }
            r12.write(r0)     // Catch:{ all -> 0x0411 }
            java.lang.String r0 = "Content-Encoding: gzip\r\n"
        L_0x0236:
            byte[] r0 = r0.getBytes()     // Catch:{ all -> 0x0411 }
            r12.write(r0)     // Catch:{ all -> 0x0411 }
            long r0 = r2.A02     // Catch:{ all -> 0x0411 }
            r10 = 0
            int r3 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r3 <= 0) goto L_0x025f
            java.lang.String r4 = "Content-Range: bytes "
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0411 }
            r3.<init>(r4)     // Catch:{ all -> 0x0411 }
            r3.append(r0)     // Catch:{ all -> 0x0411 }
            java.lang.String r0 = "-*/*\r\n"
            r3.append(r0)     // Catch:{ all -> 0x0411 }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x0411 }
            byte[] r0 = r0.getBytes()     // Catch:{ all -> 0x0411 }
            r12.write(r0)     // Catch:{ all -> 0x0411 }
        L_0x025f:
            r12.write(r13)     // Catch:{ all -> 0x0411 }
            java.util.concurrent.atomic.AtomicLong r1 = new java.util.concurrent.atomic.AtomicLong     // Catch:{ all -> 0x0411 }
            r1.<init>()     // Catch:{ all -> 0x0411 }
            r0 = r17
            r8.A04(r0, r2, r12, r1)     // Catch:{ all -> 0x0411 }
            r1 = 1
            goto L_0x01b2
        L_0x026f:
            r0 = 1
            if (r1 != r0) goto L_0x0275
            java.lang.String r0 = "Content-Type: application/zip\r\n"
            goto L_0x0236
        L_0x0275:
            java.lang.String r0 = "Content-Type: application/octet-stream\r\n"
            goto L_0x0236
        L_0x0278:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0411 }
            r0.<init>()     // Catch:{ all -> 0x0411 }
            r0.append(r14)     // Catch:{ all -> 0x0411 }
            r0.append(r15)     // Catch:{ all -> 0x0411 }
            r0.append(r3)     // Catch:{ all -> 0x0411 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0411 }
            goto L_0x0220
        L_0x028b:
            java.util.List r0 = r8.A0C     // Catch:{ all -> 0x0411 }
            java.util.Iterator r17 = r0.iterator()     // Catch:{ all -> 0x0411 }
        L_0x0291:
            boolean r0 = r17.hasNext()     // Catch:{ all -> 0x0411 }
            java.lang.String r18 = "\"\r\n\r\n"
            if (r0 == 0) goto L_0x02f3
            java.lang.Object r2 = r17.next()     // Catch:{ all -> 0x0411 }
            android.util.Pair r2 = (android.util.Pair) r2     // Catch:{ all -> 0x0411 }
            java.lang.Object r0 = r2.first     // Catch:{ all -> 0x0411 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x0411 }
            java.lang.String r0 = r0.replace(r4, r7)     // Catch:{ all -> 0x0411 }
            java.lang.String r16 = r0.replace(r10, r11)     // Catch:{ all -> 0x0411 }
            if (r1 == 0) goto L_0x02b0
            r12.write(r13)     // Catch:{ all -> 0x0411 }
        L_0x02b0:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0411 }
            r0.<init>()     // Catch:{ all -> 0x0411 }
            r0.append(r3)     // Catch:{ all -> 0x0411 }
            r0.append(r9)     // Catch:{ all -> 0x0411 }
            r0.append(r15)     // Catch:{ all -> 0x0411 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0411 }
            byte[] r0 = r0.getBytes()     // Catch:{ all -> 0x0411 }
            r12.write(r0)     // Catch:{ all -> 0x0411 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0411 }
            r1.<init>()     // Catch:{ all -> 0x0411 }
            r1.append(r14)     // Catch:{ all -> 0x0411 }
            r0 = r16
            r1.append(r0)     // Catch:{ all -> 0x0411 }
            r0 = r18
            r1.append(r0)     // Catch:{ all -> 0x0411 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0411 }
            byte[] r0 = r0.getBytes()     // Catch:{ all -> 0x0411 }
            r12.write(r0)     // Catch:{ all -> 0x0411 }
            java.lang.Object r0 = r2.second     // Catch:{ all -> 0x0411 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x0411 }
            byte[] r0 = r0.getBytes()     // Catch:{ all -> 0x0411 }
            r12.write(r0)     // Catch:{ all -> 0x0411 }
            r1 = 1
            goto L_0x0291
        L_0x02f3:
            java.util.List r0 = r8.A0B     // Catch:{ all -> 0x0411 }
            java.util.Iterator r17 = r0.iterator()     // Catch:{ all -> 0x0411 }
        L_0x02f9:
            boolean r0 = r17.hasNext()     // Catch:{ all -> 0x0411 }
            if (r0 == 0) goto L_0x0378
            java.lang.Object r2 = r17.next()     // Catch:{ all -> 0x0411 }
            android.util.Pair r2 = (android.util.Pair) r2     // Catch:{ all -> 0x0411 }
            java.lang.Object r0 = r2.first     // Catch:{ all -> 0x0411 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x0411 }
            java.lang.String r0 = r0.replace(r4, r7)     // Catch:{ all -> 0x0411 }
            java.lang.String r16 = r0.replace(r10, r11)     // Catch:{ all -> 0x0411 }
            if (r1 == 0) goto L_0x0316
            r12.write(r13)     // Catch:{ all -> 0x0411 }
        L_0x0316:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0411 }
            r0.<init>()     // Catch:{ all -> 0x0411 }
            r0.append(r3)     // Catch:{ all -> 0x0411 }
            r0.append(r9)     // Catch:{ all -> 0x0411 }
            r0.append(r15)     // Catch:{ all -> 0x0411 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0411 }
            byte[] r0 = r0.getBytes()     // Catch:{ all -> 0x0411 }
            r12.write(r0)     // Catch:{ all -> 0x0411 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0411 }
            r1.<init>()     // Catch:{ all -> 0x0411 }
            r1.append(r14)     // Catch:{ all -> 0x0411 }
            r0 = r16
            r1.append(r0)     // Catch:{ all -> 0x0411 }
            r0 = r18
            r1.append(r0)     // Catch:{ all -> 0x0411 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0411 }
            byte[] r0 = r0.getBytes()     // Catch:{ all -> 0x0411 }
            r12.write(r0)     // Catch:{ all -> 0x0411 }
            java.lang.Object r0 = r2.second     // Catch:{ Exception -> 0x035f }
            java.util.concurrent.Callable r0 = (java.util.concurrent.Callable) r0     // Catch:{ Exception -> 0x035f }
            java.lang.Object r0 = r0.call()     // Catch:{ Exception -> 0x035f }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x035f }
            byte[] r0 = r0.getBytes()     // Catch:{ Exception -> 0x035f }
            r12.write(r0)     // Catch:{ Exception -> 0x035f }
            r1 = 1
            goto L_0x02f9
        L_0x035f:
            r3 = move-exception
            java.lang.String r0 = "failure during latePostParam call; name="
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0411 }
            r1.<init>(r0)     // Catch:{ all -> 0x0411 }
            java.lang.Object r0 = r2.first     // Catch:{ all -> 0x0411 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x0411 }
            r1.append(r0)     // Catch:{ all -> 0x0411 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0411 }
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x0411 }
            r0.<init>(r1, r3)     // Catch:{ all -> 0x0411 }
            throw r0     // Catch:{ all -> 0x0411 }
        L_0x0378:
            if (r1 == 0) goto L_0x037d
            r12.write(r13)     // Catch:{ all -> 0x0411 }
        L_0x037d:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0411 }
            r1.<init>()     // Catch:{ all -> 0x0411 }
            r1.append(r3)     // Catch:{ all -> 0x0411 }
            r1.append(r9)     // Catch:{ all -> 0x0411 }
            java.lang.String r0 = "--\r\n"
            r1.append(r0)     // Catch:{ all -> 0x0411 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0411 }
            byte[] r0 = r0.getBytes()     // Catch:{ all -> 0x0411 }
            r12.write(r0)     // Catch:{ all -> 0x0411 }
        L_0x0398:
            r12.close()     // Catch:{ IllegalArgumentException -> 0x0432 }
            long r9 = android.os.SystemClock.uptimeMillis()     // Catch:{ IllegalArgumentException -> 0x0432 }
            int r3 = r6.getResponseCode()     // Catch:{ all -> 0x0429 }
            long r0 = android.os.SystemClock.uptimeMillis()     // Catch:{ IllegalArgumentException -> 0x0432 }
            long r0 = r0 - r9
            r8.A01 = r0     // Catch:{ IllegalArgumentException -> 0x0432 }
            java.util.Map r7 = r6.getHeaderFields()     // Catch:{ IllegalArgumentException -> 0x0432 }
            r0 = 400(0x190, float:5.6E-43)
            if (r3 < r0) goto L_0x03d4
            java.io.InputStream r0 = r6.getErrorStream()     // Catch:{ IllegalArgumentException -> 0x0432 }
            if (r0 == 0) goto L_0x03f2
            java.io.InputStream r4 = r6.getErrorStream()     // Catch:{ IllegalArgumentException -> 0x0432 }
            X.1qW r2 = new X.1qW     // Catch:{ IllegalArgumentException -> 0x0432 }
            r1 = r21
            r0 = r20
            r2.<init>(r1, r4, r5, r0)     // Catch:{ IllegalArgumentException -> 0x0432 }
            java.io.BufferedInputStream r4 = new java.io.BufferedInputStream     // Catch:{ IllegalArgumentException -> 0x0432 }
            r4.<init>(r2)     // Catch:{ IllegalArgumentException -> 0x0432 }
            java.lang.String r1 = X.C30311c8.A00(r4)     // Catch:{ all -> 0x040c }
            r0 = r22
            r0.AQb(r1)     // Catch:{ all -> 0x040c }
            goto L_0x03ef
        L_0x03d4:
            java.io.InputStream r4 = r6.getInputStream()     // Catch:{ IllegalArgumentException -> 0x0432 }
            X.1qW r2 = new X.1qW     // Catch:{ IllegalArgumentException -> 0x0432 }
            r1 = r21
            r0 = r20
            r2.<init>(r1, r4, r5, r0)     // Catch:{ IllegalArgumentException -> 0x0432 }
            java.io.BufferedInputStream r4 = new java.io.BufferedInputStream     // Catch:{ IllegalArgumentException -> 0x0432 }
            r4.<init>(r2)     // Catch:{ IllegalArgumentException -> 0x0432 }
            java.lang.String r1 = X.C30311c8.A00(r4)     // Catch:{ all -> 0x040c }
            r0 = r22
            r0.AWH(r1, r7)     // Catch:{ all -> 0x040c }
        L_0x03ef:
            r4.close()     // Catch:{ IllegalArgumentException -> 0x0432 }
        L_0x03f2:
            r6.disconnect()     // Catch:{ all -> 0x043e }
            java.util.Iterator r1 = r19.iterator()
        L_0x03f9:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x040b
            java.lang.Object r0 = r1.next()
            X.2JR r0 = (X.AnonymousClass2JR) r0
            java.io.InputStream r0 = r0.A03
            X.C30311c8.A04(r0)
            goto L_0x03f9
        L_0x040b:
            return r3
        L_0x040c:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x0415 }
            goto L_0x0415
        L_0x0411:
            r0 = move-exception
            r12.close()     // Catch:{ all -> 0x0415 }
        L_0x0415:
            throw r0     // Catch:{ IllegalArgumentException -> 0x0432 }
        L_0x0416:
            r2 = move-exception
            long r0 = android.os.SystemClock.uptimeMillis()     // Catch:{ IllegalArgumentException -> 0x0432 }
            long r0 = r0 - r11
            r8.A00 = r0     // Catch:{ IllegalArgumentException -> 0x0432 }
            java.net.URL r0 = r6.getURL()     // Catch:{ IllegalArgumentException -> 0x0432 }
            java.lang.String r0 = A00(r0)     // Catch:{ IllegalArgumentException -> 0x0432 }
            r8.A03 = r0     // Catch:{ IllegalArgumentException -> 0x0432 }
            goto L_0x0431
        L_0x0429:
            r2 = move-exception
            long r0 = android.os.SystemClock.uptimeMillis()     // Catch:{ IllegalArgumentException -> 0x0432 }
            long r0 = r0 - r9
            r8.A01 = r0     // Catch:{ IllegalArgumentException -> 0x0432 }
        L_0x0431:
            throw r2     // Catch:{ IllegalArgumentException -> 0x0432 }
        L_0x0432:
            r1 = move-exception
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x0439 }
            r0.<init>(r1)     // Catch:{ all -> 0x0439 }
            throw r0     // Catch:{ all -> 0x0439 }
        L_0x0439:
            r0 = move-exception
            r6.disconnect()     // Catch:{ all -> 0x043e }
            throw r0     // Catch:{ all -> 0x043e }
        L_0x043e:
            r2 = move-exception
            java.util.List r0 = r8.A0A
            java.util.Iterator r1 = r0.iterator()
        L_0x0445:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0457
            java.lang.Object r0 = r1.next()
            X.2JR r0 = (X.AnonymousClass2JR) r0
            java.io.InputStream r0 = r0.A03
            X.C30311c8.A04(r0)
            goto L_0x0445
        L_0x0457:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C29551ao.A02(X.1ap):int");
    }

    public final Pair A03() {
        boolean z2;
        Socket socket = (Socket) this.A0F.get();
        int i2 = 0;
        if (socket != null) {
            try {
                i2 = NativeUtils.getFileDescriptorForSocket(socket);
                z2 = true;
            } catch (UnsatisfiedLinkError | UnsupportedOperationException e2) {
                Log.w("httpsformpost/getSocketInfo", e2);
            }
            return new Pair(Integer.valueOf(i2), Boolean.valueOf(z2));
        }
        z2 = false;
        return new Pair(Integer.valueOf(i2), Boolean.valueOf(z2));
    }

    public final void A04(Pair pair, AnonymousClass2JR r9, OutputStream outputStream, AtomicLong atomicLong) {
        long j2 = r9.A02;
        long j3 = j2;
        while (j2 > 0) {
            j2 -= r9.A03.skip(j2);
        }
        byte[] bArr = new byte[16384];
        do {
            int read = r9.A03.read(bArr);
            if (read != -1) {
                outputStream.write(bArr, 0, read);
                j3 += (long) read;
                int intValue = ((Number) pair.first).intValue();
                int i2 = 0;
                if (((Boolean) pair.second).booleanValue()) {
                    try {
                        i2 = NativeUtils.getBytesInSocketOutputQueue(intValue);
                    } catch (UnsupportedOperationException unused) {
                    }
                }
                long j4 = j3 - ((long) i2);
                C29541an r4 = this.A05;
                if (r4 != null) {
                    r4.APP(j4);
                }
                if (Thread.currentThread().isInterrupted()) {
                    throw new InterruptedIOException();
                }
            } else {
                atomicLong.set(j3);
                return;
            }
        } while (!this.A0E.getAndSet(false));
        throw new AnonymousClass40C();
    }

    public void A05(InputStream inputStream, String str, String str2, long j2, long j3) {
        this.A0A.add(new AnonymousClass2JR(inputStream, str, str2, 2, j2, j3));
    }

    public void A06(String str, String str2) {
        this.A0C.add(Pair.create(str, str2));
    }

    public void A07(String str, String str2) {
        this.A0D.add(Pair.create(str, str2));
    }
}
