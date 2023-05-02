package X;

import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.HttpURLConnection;
import java.util.regex.Pattern;

/* renamed from: X.2s6  reason: invalid class name and case insensitive filesystem */
public class C57882s6 extends AnonymousClass3E3 implements AnonymousClass5US {
    public static final Pattern A0D = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");
    public int A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public AnonymousClass3AL A05;
    public InputStream A06;
    public HttpURLConnection A07;
    public boolean A08;
    public byte[] A09;
    public final AnonymousClass4GO A0A;
    public final AnonymousClass4GO A0B;
    public final String A0C;

    @Deprecated
    public C57882s6() {
        this((AnonymousClass4GO) null, (String) null);
    }

    public C57882s6(AnonymousClass4GO r2, String str) {
        super(true);
        this.A0C = str;
        this.A0A = r2;
        this.A0B = new AnonymousClass4GO();
    }

    public final void A04() {
        HttpURLConnection httpURLConnection = this.A07;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e2) {
                C89504cL.A01("DefaultHttpDataSource", "Unexpected error while disconnecting", e2);
            }
            this.A07 = null;
        }
    }

    public Uri AGo() {
        HttpURLConnection httpURLConnection = this.A07;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    /* JADX WARNING: type inference failed for: r1v15, types: [X.40P] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0178  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x01d9  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x01ea A[Catch:{ IOException -> 0x023d }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long AZr(X.AnonymousClass3AL r24) {
        /*
            r23 = this;
            java.lang.String r13 = "Unable to connect"
            r9 = r23
            r10 = r24
            r9.A05 = r10
            r7 = 0
            r9.A01 = r7
            r9.A02 = r7
            r9.A01()
            r11 = 1
            android.net.Uri r0 = r10.A04     // Catch:{ IOException -> 0x0254 }
            java.lang.String r0 = r0.toString()     // Catch:{ IOException -> 0x0254 }
            java.net.URL r1 = new java.net.URL     // Catch:{ IOException -> 0x0254 }
            r1.<init>(r0)     // Catch:{ IOException -> 0x0254 }
            int r0 = r10.A01     // Catch:{ IOException -> 0x0254 }
            r18 = r0
            byte[] r12 = r10.A07     // Catch:{ IOException -> 0x0254 }
            long r5 = r10.A03     // Catch:{ IOException -> 0x0254 }
            long r3 = r10.A02     // Catch:{ IOException -> 0x0254 }
            r17 = 1
            int r0 = r10.A00     // Catch:{ IOException -> 0x0254 }
            r0 = r0 & 1
            if (r0 == r11) goto L_0x0031
            r17 = 0
        L_0x0031:
            java.util.Map r0 = r10.A06     // Catch:{ IOException -> 0x0254 }
            r16 = r0
            java.net.URLConnection r2 = r1.openConnection()     // Catch:{ IOException -> 0x0254 }
            java.net.HttpURLConnection r2 = (java.net.HttpURLConnection) r2     // Catch:{ IOException -> 0x0254 }
            r0 = 8000(0x1f40, float:1.121E-41)
            r2.setConnectTimeout(r0)     // Catch:{ IOException -> 0x0254 }
            r2.setReadTimeout(r0)     // Catch:{ IOException -> 0x0254 }
            java.util.HashMap r14 = X.AnonymousClass000.A0x()     // Catch:{ IOException -> 0x0254 }
            X.4GO r1 = r9.A0A     // Catch:{ IOException -> 0x0254 }
            monitor-enter(r1)     // Catch:{ IOException -> 0x0254 }
            java.util.Map r0 = r1.A00     // Catch:{ all -> 0x0251 }
            if (r0 != 0) goto L_0x005b
            java.util.Map r15 = r1.A01     // Catch:{ all -> 0x0251 }
            java.util.HashMap r0 = new java.util.HashMap     // Catch:{ all -> 0x0251 }
            r0.<init>(r15)     // Catch:{ all -> 0x0251 }
            java.util.Map r0 = java.util.Collections.unmodifiableMap(r0)     // Catch:{ all -> 0x0251 }
            r1.A00 = r0     // Catch:{ all -> 0x0251 }
        L_0x005b:
            monitor-exit(r1)     // Catch:{ IOException -> 0x0254 }
            r14.putAll(r0)     // Catch:{ IOException -> 0x0254 }
            X.4GO r1 = r9.A0B     // Catch:{ IOException -> 0x0254 }
            monitor-enter(r1)     // Catch:{ IOException -> 0x0254 }
            java.util.Map r0 = r1.A00     // Catch:{ all -> 0x0251 }
            if (r0 != 0) goto L_0x0073
            java.util.Map r15 = r1.A01     // Catch:{ all -> 0x0251 }
            java.util.HashMap r0 = new java.util.HashMap     // Catch:{ all -> 0x0251 }
            r0.<init>(r15)     // Catch:{ all -> 0x0251 }
            java.util.Map r0 = java.util.Collections.unmodifiableMap(r0)     // Catch:{ all -> 0x0251 }
            r1.A00 = r0     // Catch:{ all -> 0x0251 }
        L_0x0073:
            monitor-exit(r1)     // Catch:{ IOException -> 0x0254 }
            r14.putAll(r0)     // Catch:{ IOException -> 0x0254 }
            r0 = r16
            r14.putAll(r0)     // Catch:{ IOException -> 0x0254 }
            java.util.Iterator r14 = X.C13690nt.A0j(r14)     // Catch:{ IOException -> 0x0254 }
        L_0x0080:
            boolean r0 = r14.hasNext()     // Catch:{ IOException -> 0x0254 }
            if (r0 == 0) goto L_0x0098
            java.util.Map$Entry r0 = X.AnonymousClass000.A0z(r14)     // Catch:{ IOException -> 0x0254 }
            java.lang.String r1 = X.C13690nt.A0f(r0)     // Catch:{ IOException -> 0x0254 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ IOException -> 0x0254 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ IOException -> 0x0254 }
            r2.setRequestProperty(r1, r0)     // Catch:{ IOException -> 0x0254 }
            goto L_0x0080
        L_0x0098:
            r21 = 0
            r19 = -1
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 != 0) goto L_0x00a4
            int r0 = (r3 > r19 ? 1 : (r3 == r19 ? 0 : -1))
            if (r0 == 0) goto L_0x00c9
        L_0x00a4:
            java.lang.String r0 = "bytes="
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)     // Catch:{ IOException -> 0x0254 }
            r1.append(r5)     // Catch:{ IOException -> 0x0254 }
            java.lang.String r0 = "-"
            java.lang.String r1 = X.AnonymousClass000.A0h(r0, r1)     // Catch:{ IOException -> 0x0254 }
            int r0 = (r3 > r19 ? 1 : (r3 == r19 ? 0 : -1))
            if (r0 == 0) goto L_0x00c4
            java.lang.StringBuilder r14 = X.AnonymousClass000.A0q(r1)     // Catch:{ IOException -> 0x0254 }
            long r0 = r5 + r3
            r15 = 1
            long r0 = r0 - r15
            java.lang.String r1 = X.C13680ns.A0j(r14, r0)     // Catch:{ IOException -> 0x0254 }
        L_0x00c4:
            java.lang.String r0 = "Range"
            r2.setRequestProperty(r0, r1)     // Catch:{ IOException -> 0x0254 }
        L_0x00c9:
            java.lang.String r1 = r9.A0C     // Catch:{ IOException -> 0x0254 }
            if (r1 == 0) goto L_0x00d2
            java.lang.String r0 = "User-Agent"
            r2.setRequestProperty(r0, r1)     // Catch:{ IOException -> 0x0254 }
        L_0x00d2:
            if (r17 == 0) goto L_0x00d7
            java.lang.String r1 = "gzip"
            goto L_0x00d9
        L_0x00d7:
            java.lang.String r1 = "identity"
        L_0x00d9:
            java.lang.String r0 = "Accept-Encoding"
            r2.setRequestProperty(r0, r1)     // Catch:{ IOException -> 0x0254 }
            r2.setInstanceFollowRedirects(r11)     // Catch:{ IOException -> 0x0254 }
            boolean r0 = X.AnonymousClass000.A1V(r12)
            r2.setDoOutput(r0)     // Catch:{ IOException -> 0x0254 }
            r0 = r18
            if (r0 == r11) goto L_0x00ed
            goto L_0x00f0
        L_0x00ed:
            java.lang.String r0 = "GET"
            goto L_0x00f2
        L_0x00f0:
            java.lang.String r0 = "POST"
        L_0x00f2:
            r2.setRequestMethod(r0)     // Catch:{ IOException -> 0x0254 }
            if (r12 == 0) goto L_0x00f8
            goto L_0x00fc
        L_0x00f8:
            r2.connect()     // Catch:{ IOException -> 0x0254 }
            goto L_0x010d
        L_0x00fc:
            int r0 = r12.length     // Catch:{ IOException -> 0x0254 }
            r2.setFixedLengthStreamingMode(r0)     // Catch:{ IOException -> 0x0254 }
            r2.connect()     // Catch:{ IOException -> 0x0254 }
            java.io.OutputStream r0 = r2.getOutputStream()     // Catch:{ IOException -> 0x0254 }
            r0.write(r12)     // Catch:{ IOException -> 0x0254 }
            r0.close()     // Catch:{ IOException -> 0x0254 }
        L_0x010d:
            r9.A07 = r2     // Catch:{ IOException -> 0x0254 }
            int r0 = r2.getResponseCode()     // Catch:{ IOException -> 0x0247 }
            r9.A00 = r0     // Catch:{ IOException -> 0x0247 }
            java.lang.String r13 = r2.getResponseMessage()     // Catch:{ IOException -> 0x0247 }
            int r12 = r9.A00
            r1 = 200(0xc8, float:2.8E-43)
            if (r12 < r1) goto L_0x01f9
            r0 = 299(0x12b, float:4.19E-43)
            if (r12 > r0) goto L_0x01f9
            r2.getContentType()
            int r0 = r9.A00
            if (r0 != r1) goto L_0x012f
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 == 0) goto L_0x012f
            r7 = r5
        L_0x012f:
            r9.A04 = r7
            java.lang.String r0 = "Content-Encoding"
            java.lang.String r1 = r2.getHeaderField(r0)
            java.lang.String r0 = "gzip"
            boolean r18 = r0.equalsIgnoreCase(r1)
            if (r18 != 0) goto L_0x01e0
            r5 = -1
            int r0 = (r3 > r19 ? 1 : (r3 == r19 ? 0 : -1))
            if (r0 != 0) goto L_0x01e0
            java.lang.String r0 = "Content-Length"
            java.lang.String r15 = r2.getHeaderField(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r15)
            java.lang.String r13 = "]"
            java.lang.String r12 = "DefaultHttpDataSource"
            if (r0 != 0) goto L_0x016a
            long r3 = java.lang.Long.parseLong(r15)     // Catch:{ NumberFormatException -> 0x015a }
            goto L_0x016c
        L_0x015a:
            java.lang.String r0 = "Unexpected Content-Length ["
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0r(r0)
            r0.append(r15)
            java.lang.String r0 = X.AnonymousClass000.A0h(r13, r0)
            android.util.Log.e(r12, r0)
        L_0x016a:
            r3 = -1
        L_0x016c:
            java.lang.String r0 = "Content-Range"
            java.lang.String r8 = r2.getHeaderField(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            if (r0 != 0) goto L_0x01d5
            java.util.regex.Pattern r0 = A0D
            java.util.regex.Matcher r7 = r0.matcher(r8)
            boolean r0 = r7.find()
            if (r0 == 0) goto L_0x01d5
            r0 = 2
            java.lang.String r0 = r7.group(r0)     // Catch:{ NumberFormatException -> 0x01c5 }
            long r0 = java.lang.Long.parseLong(r0)     // Catch:{ NumberFormatException -> 0x01c5 }
            java.lang.String r7 = r7.group(r11)     // Catch:{ NumberFormatException -> 0x01c5 }
            long r16 = java.lang.Long.parseLong(r7)     // Catch:{ NumberFormatException -> 0x01c5 }
            long r0 = r0 - r16
            r16 = 1
            long r0 = r0 + r16
            int r7 = (r3 > r21 ? 1 : (r3 == r21 ? 0 : -1))
            if (r7 >= 0) goto L_0x01a1
            r3 = r0
            goto L_0x01d5
        L_0x01a1:
            int r7 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r7 == 0) goto L_0x01d5
            java.lang.StringBuilder r14 = X.AnonymousClass000.A0o()     // Catch:{ NumberFormatException -> 0x01c5 }
            java.lang.String r7 = "Inconsistent headers ["
            r14.append(r7)     // Catch:{ NumberFormatException -> 0x01c5 }
            r14.append(r15)     // Catch:{ NumberFormatException -> 0x01c5 }
            java.lang.String r7 = "] ["
            r14.append(r7)     // Catch:{ NumberFormatException -> 0x01c5 }
            r14.append(r8)     // Catch:{ NumberFormatException -> 0x01c5 }
            java.lang.String r7 = X.AnonymousClass000.A0h(r13, r14)     // Catch:{ NumberFormatException -> 0x01c5 }
            android.util.Log.w(r12, r7)     // Catch:{ NumberFormatException -> 0x01c5 }
            long r3 = java.lang.Math.max(r3, r0)     // Catch:{ NumberFormatException -> 0x01c5 }
            goto L_0x01d5
        L_0x01c5:
            java.lang.String r0 = "Unexpected Content-Range ["
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0r(r0)
            r0.append(r8)
            java.lang.String r0 = X.AnonymousClass000.A0h(r13, r0)
            android.util.Log.e(r12, r0)
        L_0x01d5:
            int r0 = (r3 > r19 ? 1 : (r3 == r19 ? 0 : -1))
            if (r0 == 0) goto L_0x01dd
            long r0 = r9.A04
            long r5 = r3 - r0
        L_0x01dd:
            r9.A03 = r5
            goto L_0x01e2
        L_0x01e0:
            r9.A03 = r3
        L_0x01e2:
            java.io.InputStream r1 = r2.getInputStream()     // Catch:{ IOException -> 0x023d }
            r9.A06 = r1     // Catch:{ IOException -> 0x023d }
            if (r18 == 0) goto L_0x01f1
            java.util.zip.GZIPInputStream r0 = new java.util.zip.GZIPInputStream     // Catch:{ IOException -> 0x023d }
            r0.<init>(r1)     // Catch:{ IOException -> 0x023d }
            r9.A06 = r0     // Catch:{ IOException -> 0x023d }
        L_0x01f1:
            r9.A08 = r11
            r9.A03(r10)
            long r0 = r9.A03
            return r0
        L_0x01f9:
            java.util.Map r14 = r2.getHeaderFields()
            java.io.InputStream r4 = r2.getErrorStream()
            if (r4 == 0) goto L_0x021d
            r0 = 4096(0x1000, float:5.74E-42)
            byte[] r3 = new byte[r0]     // Catch:{ IOException -> 0x0220 }
            java.io.ByteArrayOutputStream r2 = new java.io.ByteArrayOutputStream     // Catch:{ IOException -> 0x0220 }
            r2.<init>()     // Catch:{ IOException -> 0x0220 }
        L_0x020c:
            int r1 = r4.read(r3)     // Catch:{ IOException -> 0x0220 }
            r0 = -1
            if (r1 == r0) goto L_0x0218
            r0 = 0
            r2.write(r3, r0, r1)     // Catch:{ IOException -> 0x0220 }
            goto L_0x020c
        L_0x0218:
            byte[] r15 = r2.toByteArray()     // Catch:{ IOException -> 0x0220 }
            goto L_0x0222
        L_0x021d:
            byte[] r15 = X.AnonymousClass3C1.A0A     // Catch:{ IOException -> 0x0220 }
            goto L_0x0222
        L_0x0220:
            byte[] r15 = X.AnonymousClass3C1.A0A
        L_0x0222:
            r9.A04()
            int r2 = r9.A00
            X.3Vm r1 = new X.3Vm
            r11 = r1
            r12 = r10
            r16 = r2
            r11.<init>(r12, r13, r14, r15, r16)
            r0 = 416(0x1a0, float:5.83E-43)
            if (r2 != r0) goto L_0x0246
            X.40F r0 = new X.40F
            r0.<init>()
            r1.initCause(r0)
            throw r1
        L_0x023d:
            r0 = move-exception
            r9.A04()
            X.40P r1 = new X.40P
            r1.<init>((X.AnonymousClass3AL) r10, (java.io.IOException) r0, (int) r11)
        L_0x0246:
            throw r1
        L_0x0247:
            r0 = move-exception
            r9.A04()
            X.40P r1 = new X.40P
            r1.<init>((X.AnonymousClass3AL) r10, (java.io.IOException) r0, (java.lang.String) r13)
            throw r1
        L_0x0251:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ IOException -> 0x0254 }
            throw r0     // Catch:{ IOException -> 0x0254 }
        L_0x0254:
            r2 = move-exception
            java.lang.String r1 = r2.getMessage()
            if (r1 == 0) goto L_0x026f
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r1 = r1.toLowerCase(r0)
            java.lang.String r0 = "cleartext http traffic.*not permitted.*"
            boolean r0 = r1.matches(r0)
            if (r0 == 0) goto L_0x026f
            X.3Vl r1 = new X.3Vl
            r1.<init>(r10, r2)
            throw r1
        L_0x026f:
            X.40P r1 = new X.40P
            r1.<init>((X.AnonymousClass3AL) r10, (java.io.IOException) r2, (java.lang.String) r13)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C57882s6.AZr(X.3AL):long");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:4|(1:6)|(5:12|13|(2:15|(1:17))(2:18|(1:20))|21|(1:25))|26|27) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x0064 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void close() {
        /*
            r10 = this;
            r4 = 0
            r5 = 0
            java.io.InputStream r6 = r10.A06     // Catch:{ all -> 0x0081 }
            if (r6 == 0) goto L_0x0072
            java.net.HttpURLConnection r9 = r10.A07     // Catch:{ all -> 0x0081 }
            long r0 = r10.A03     // Catch:{ all -> 0x0081 }
            r7 = -1
            int r2 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r2 == 0) goto L_0x0013
            long r2 = r10.A01     // Catch:{ all -> 0x0081 }
            long r0 = r0 - r2
        L_0x0013:
            if (r9 == 0) goto L_0x0064
            int r3 = X.AnonymousClass3C1.A01     // Catch:{ all -> 0x0081 }
            r2 = 19
            if (r3 < r2) goto L_0x0064
            r2 = 20
            if (r3 > r2) goto L_0x0064
            java.io.InputStream r3 = r9.getInputStream()     // Catch:{ Exception -> 0x0064 }
            int r2 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r2 != 0) goto L_0x002f
            int r1 = r3.read()     // Catch:{ Exception -> 0x0064 }
            r0 = -1
            if (r1 != r0) goto L_0x0036
            goto L_0x0064
        L_0x002f:
            r7 = 2048(0x800, double:1.0118E-320)
            int r2 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r2 > 0) goto L_0x0036
            goto L_0x0064
        L_0x0036:
            java.lang.Class r2 = r3.getClass()     // Catch:{ Exception -> 0x0064 }
            java.lang.String r1 = r2.getName()     // Catch:{ Exception -> 0x0064 }
            java.lang.String r0 = "com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream"
            boolean r0 = r0.equals(r1)     // Catch:{ Exception -> 0x0064 }
            if (r0 != 0) goto L_0x004e
            java.lang.String r0 = "com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream"
            boolean r0 = r0.equals(r1)     // Catch:{ Exception -> 0x0064 }
            if (r0 == 0) goto L_0x0064
        L_0x004e:
            java.lang.Class r2 = r2.getSuperclass()     // Catch:{ Exception -> 0x0064 }
            java.lang.String r1 = "unexpectedEndOfInput"
            java.lang.Class[] r0 = new java.lang.Class[r4]     // Catch:{ Exception -> 0x0064 }
            java.lang.reflect.Method r1 = r2.getDeclaredMethod(r1, r0)     // Catch:{ Exception -> 0x0064 }
            r0 = 1
            r1.setAccessible(r0)     // Catch:{ Exception -> 0x0064 }
            java.lang.Object[] r0 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x0064 }
            r1.invoke(r3, r0)     // Catch:{ Exception -> 0x0064 }
        L_0x0064:
            r6.close()     // Catch:{ IOException -> 0x0068 }
            goto L_0x0072
        L_0x0068:
            r3 = move-exception
            X.3AL r2 = r10.A05     // Catch:{ all -> 0x0081 }
            r1 = 3
            X.40P r0 = new X.40P     // Catch:{ all -> 0x0081 }
            r0.<init>((X.AnonymousClass3AL) r2, (java.io.IOException) r3, (int) r1)     // Catch:{ all -> 0x0081 }
            throw r0     // Catch:{ all -> 0x0081 }
        L_0x0072:
            r10.A06 = r5
            r10.A04()
            boolean r0 = r10.A08
            if (r0 == 0) goto L_0x0080
            r10.A08 = r4
            r10.A00()
        L_0x0080:
            return
        L_0x0081:
            r1 = move-exception
            r10.A06 = r5
            r10.A04()
            boolean r0 = r10.A08
            if (r0 == 0) goto L_0x0090
            r10.A08 = r4
            r10.A00()
        L_0x0090:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C57882s6.close():void");
    }

    public int read(byte[] bArr, int i2, int i3) {
        try {
            if (this.A02 != this.A04) {
                if (this.A09 == null) {
                    this.A09 = new byte[4096];
                }
                while (true) {
                    long j2 = this.A02;
                    long j3 = this.A04;
                    if (j2 == j3) {
                        break;
                    }
                    byte[] bArr2 = this.A09;
                    int read = this.A06.read(bArr2, 0, (int) Math.min(j3 - j2, (long) bArr2.length));
                    if (Thread.currentThread().isInterrupted()) {
                        throw new InterruptedIOException();
                    } else if (read != -1) {
                        this.A02 += (long) read;
                        A02(read);
                    } else {
                        throw new EOFException();
                    }
                }
            }
            if (i3 == 0) {
                return 0;
            }
            long j4 = this.A03;
            if (j4 != -1) {
                long j5 = j4 - this.A01;
                if (j5 == 0) {
                    return -1;
                }
                i3 = (int) Math.min((long) i3, j5);
            }
            int read2 = this.A06.read(bArr, i2, i3);
            if (read2 != -1) {
                this.A01 += (long) read2;
                A02(read2);
                return read2;
            } else if (this.A03 == -1) {
                return -1;
            } else {
                throw new EOFException();
            }
        } catch (IOException e2) {
            throw new AnonymousClass40P(this.A05, e2, 2);
        }
    }
}
