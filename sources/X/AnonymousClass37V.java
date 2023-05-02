package X;

import android.content.Context;
import android.webkit.URLUtil;
import java.io.File;
import java.util.HashMap;

/* renamed from: X.37V  reason: invalid class name */
public class AnonymousClass37V extends C16690tT {
    public static final HashMap A0A = AnonymousClass000.A0x();
    public final int A00;
    public final long A01;
    public final C17130ua A02;
    public final AnonymousClass12A A03;
    public final C16980tz A04;
    public final AnonymousClass277 A05;
    public final C219115x A06;
    public final C17670vS A07;
    public final C17660vR A08;
    public final C16320sq A09;

    public AnonymousClass37V(C17130ua r1, AnonymousClass12A r2, C16980tz r3, AnonymousClass277 r4, C219115x r5, C17670vS r6, C17660vR r7, C16320sq r8, int i2, long j2) {
        this.A04 = r3;
        this.A08 = r7;
        this.A09 = r8;
        this.A02 = r1;
        this.A07 = r6;
        this.A03 = r2;
        this.A06 = r5;
        this.A05 = r4;
        this.A00 = i2;
        this.A01 = j2;
    }

    public static File A03(Context context, AnonymousClass37V r3) {
        File A0C = C13700nu.A0C(context.getCacheDir(), "ProfilePictureTemp");
        A0C.mkdirs();
        return C13700nu.A0C(A0C, URLUtil.guessFileName(r3.A05.A05.toString(), (String) null, (String) null));
    }

    public static void A04(C17130ua r7, AnonymousClass12A r8, C16980tz r9, AnonymousClass277 r10, C219115x r11, C17670vS r12, C17660vR r13, C16320sq r14, int i2, long j2) {
        HashMap hashMap = A0A;
        synchronized (hashMap) {
            C15830rv r4 = r10.A03;
            if (hashMap.containsKey(r4)) {
                AnonymousClass37V r3 = (AnonymousClass37V) hashMap.get(r4);
                AnonymousClass277 r2 = r3.A05;
                if (!r2.A05.equals(r10.A05)) {
                    r3.A06(true);
                    hashMap.remove(r2.A03);
                } else if (r3.A03() != 1) {
                    hashMap.remove(r2.A03);
                }
            }
            AnonymousClass37V r6 = new AnonymousClass37V(r7, r8, r9, r10, r11, r12, r13, r14, i2, j2);
            hashMap.put(r4, r6);
            C13680ns.A1U(r6, r14);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: X.1qW} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: X.1qW} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: X.1qW} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: javax.net.ssl.HttpsURLConnection} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: X.1qW} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: X.1qW} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: X.1qW} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v10, resolved type: X.1qW} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v11, resolved type: X.1qW} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v12, resolved type: X.1qW} */
    /* JADX WARNING: type inference failed for: r4v1, types: [java.net.HttpURLConnection] */
    /* JADX WARNING: type inference failed for: r4v3, types: [java.net.HttpURLConnection] */
    /* JADX WARNING: type inference failed for: r4v7 */
    /* JADX WARNING: type inference failed for: r4v13 */
    /* JADX WARNING: type inference failed for: r4v15 */
    /* JADX WARNING: type inference failed for: r4v16 */
    /* JADX WARNING: type inference failed for: r4v19 */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x01c9, code lost:
        com.whatsapp.util.Log.w("ProfilePictureDownload: Could not close connection input stream", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00d8, code lost:
        if (r15 != 0) goto L_0x00da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x011e, code lost:
        r12 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:?, code lost:
        com.whatsapp.util.Log.w(X.AnonymousClass000.A0e(r12, "ProfilePictureDownload: IO Exception in middle of download: ", X.AnonymousClass000.A0o()));
        r13 = new X.AnonymousClass4MZ(r11, r10, 0, 5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x014e, code lost:
        r1 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x014f, code lost:
        r7 = r4;
        r4 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x01b9, code lost:
        if (r4 == null) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x01bc, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x01bd, code lost:
        r7 = r4;
        r4 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x01bf, code lost:
        r4.disconnect();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x01c2, code lost:
        if (r7 != null) goto L_0x01c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:?, code lost:
        r7.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x01c8, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x014e A[ExcHandler: 43n (e X.43n), PHI: r4 
      PHI: (r4v10 X.1qW) = (r4v0 X.1qW), (r4v0 X.1qW), (r4v0 X.1qW), (r4v12 X.1qW), (r4v12 X.1qW), (r4v12 X.1qW) binds: [B:15:0x006c, B:50:0x0138, B:51:?, B:22:0x0092, B:45:0x011f, B:46:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:15:0x006c] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0188 A[Catch:{ all -> 0x01b8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0194 A[Catch:{ all -> 0x01b8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x01a1  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x01a6 A[SYNTHETIC, Splitter:B:81:0x01a6] */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x01bc A[ExcHandler: all (th java.lang.Throwable), PHI: r4 
      PHI: (r4v6 X.1qW) = (r4v0 X.1qW), (r4v0 X.1qW), (r4v0 X.1qW), (r4v12 X.1qW), (r4v12 X.1qW), (r4v12 X.1qW) binds: [B:15:0x006c, B:50:0x0138, B:51:?, B:22:0x0092, B:45:0x011f, B:46:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:15:0x006c] */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object A08(java.lang.Object[] r20) {
        /*
            r19 = this;
            r11 = r19
            X.0tz r0 = r11.A04
            android.content.Context r0 = r0.A00
            java.io.File r10 = A03(r0, r11)
            boolean r0 = r10.createNewFile()     // Catch:{ IOException -> 0x01e1 }
            if (r0 != 0) goto L_0x0015
            long r0 = r10.length()     // Catch:{ IOException -> 0x01e1 }
            goto L_0x0017
        L_0x0015:
            r0 = 0
        L_0x0017:
            java.lang.String r9 = "ProfilePictureDownload: Could not close connection input stream"
            java.lang.String r8 = "ProfilePictureDownload: Could not close FileOutputStream "
            r7 = 5
            r6 = 1
            java.io.FileOutputStream r5 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x01d5 }
            r5.<init>(r10, r6)     // Catch:{ FileNotFoundException -> 0x01d5 }
            r4 = 0
            r3 = 0
            X.277 r2 = r11.A05     // Catch:{ IOException -> 0x017a, 43n -> 0x016c, all -> 0x016a }
            java.net.URL r2 = r2.A05     // Catch:{ IOException -> 0x017a, 43n -> 0x016c, all -> 0x016a }
            r18 = r2
            java.net.URLConnection r2 = r18.openConnection()     // Catch:{ IOException -> 0x017a, 43n -> 0x016c, all -> 0x016a }
            boolean r12 = r2 instanceof javax.net.ssl.HttpsURLConnection     // Catch:{ IOException -> 0x017a, 43n -> 0x016c, all -> 0x016a }
            if (r12 == 0) goto L_0x0156
            javax.net.ssl.HttpsURLConnection r2 = (javax.net.ssl.HttpsURLConnection) r2     // Catch:{ IOException -> 0x017a, 43n -> 0x016c, all -> 0x016a }
            X.0vS r12 = r11.A07     // Catch:{ IOException -> 0x017a, 43n -> 0x016c, all -> 0x016a }
            X.1ad r12 = r12.A02()     // Catch:{ IOException -> 0x017a, 43n -> 0x016c, all -> 0x016a }
            r2.setSSLSocketFactory(r12)     // Catch:{ IOException -> 0x017a, 43n -> 0x016c, all -> 0x016a }
            r12 = 15000(0x3a98, float:2.102E-41)
            r2.setConnectTimeout(r12)     // Catch:{ IOException -> 0x017a, 43n -> 0x016c, all -> 0x016a }
            r12 = 30000(0x7530, float:4.2039E-41)
            r2.setReadTimeout(r12)     // Catch:{ IOException -> 0x017a, 43n -> 0x016c, all -> 0x016a }
            X.0vR r12 = r11.A08     // Catch:{ IOException -> 0x017a, 43n -> 0x016c, all -> 0x016a }
            java.lang.String r13 = r12.A00()     // Catch:{ IOException -> 0x017a, 43n -> 0x016c, all -> 0x016a }
            java.lang.String r12 = "User-Agent"
            r2.setRequestProperty(r12, r13)     // Catch:{ IOException -> 0x017a, 43n -> 0x016c, all -> 0x016a }
            r13 = 0
            int r12 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r12 <= 0) goto L_0x006c
            java.lang.String r12 = "bytes="
            java.lang.StringBuilder r13 = X.AnonymousClass000.A0r(r12)     // Catch:{ IOException -> 0x017a, 43n -> 0x016c, all -> 0x016a }
            r13.append(r0)     // Catch:{ IOException -> 0x017a, 43n -> 0x016c, all -> 0x016a }
            java.lang.String r12 = "-"
            java.lang.String r13 = X.AnonymousClass000.A0h(r12, r13)     // Catch:{ IOException -> 0x017a, 43n -> 0x016c, all -> 0x016a }
            java.lang.String r12 = "Range"
            r2.setRequestProperty(r12, r13)     // Catch:{ IOException -> 0x017a, 43n -> 0x016c, all -> 0x016a }
        L_0x006c:
            r2.connect()     // Catch:{ IOException -> 0x0152, 43n -> 0x014e, all -> 0x01bc }
            int r13 = r2.getResponseCode()     // Catch:{ IOException -> 0x0152, 43n -> 0x014e, all -> 0x01bc }
            r14 = 0
            int r12 = (r0 > r14 ? 1 : (r0 == r14 ? 0 : -1))
            r0 = 200(0xc8, float:2.8E-43)
            if (r12 <= 0) goto L_0x007d
            r0 = 206(0xce, float:2.89E-43)
        L_0x007d:
            r12 = 6
            if (r13 != r0) goto L_0x0138
            X.0ua r15 = r11.A02     // Catch:{ IOException -> 0x0152, 43n -> 0x014e, all -> 0x01bc }
            java.lang.Integer r14 = java.lang.Integer.valueOf(r3)     // Catch:{ IOException -> 0x0152, 43n -> 0x014e, all -> 0x01bc }
            java.io.InputStream r1 = r2.getInputStream()     // Catch:{ IOException -> 0x0152, 43n -> 0x014e, all -> 0x01bc }
            X.1qW r0 = new X.1qW     // Catch:{ IOException -> 0x0152, 43n -> 0x014e, all -> 0x01bc }
            r0.<init>(r15, r1, r4, r14)     // Catch:{ IOException -> 0x0152, 43n -> 0x014e, all -> 0x01bc }
            r4 = r0
            r0 = 8192(0x2000, float:1.14794E-41)
            byte[] r14 = new byte[r0]     // Catch:{ IOException -> 0x011e, 43n -> 0x014e, all -> 0x01bc }
        L_0x0094:
            int r1 = r4.read(r14, r3, r0)     // Catch:{ IOException -> 0x011e, 43n -> 0x014e, all -> 0x01bc }
            r0 = -1
            if (r1 == r0) goto L_0x00ae
            boolean r0 = X.C16690tT.A02(r11)     // Catch:{ IOException -> 0x011e, 43n -> 0x014e, all -> 0x01bc }
            if (r0 == 0) goto L_0x00a8
            X.4MZ r13 = new X.4MZ     // Catch:{ IOException -> 0x011e, 43n -> 0x014e, all -> 0x01bc }
            r13.<init>(r11, r10, r6, r6)     // Catch:{ IOException -> 0x011e, 43n -> 0x014e, all -> 0x01bc }
            goto L_0x0131
        L_0x00a8:
            r5.write(r14, r3, r1)     // Catch:{ IOException -> 0x011e, 43n -> 0x014e, all -> 0x01bc }
            r0 = 8192(0x2000, float:1.14794E-41)
            goto L_0x0094
        L_0x00ae:
            r5.flush()     // Catch:{ IOException -> 0x011e, 43n -> 0x014e, all -> 0x01bc }
            r0 = 206(0xce, float:2.89E-43)
            if (r13 != r0) goto L_0x00d4
            java.lang.String r0 = "Content-Range"
            java.lang.String r1 = r2.getHeaderField(r0)     // Catch:{ IOException -> 0x011e, 43n -> 0x014e, all -> 0x01bc }
            boolean r0 = r1.isEmpty()     // Catch:{ IOException -> 0x011e, 43n -> 0x014e, all -> 0x01bc }
            if (r0 != 0) goto L_0x00d2
            java.lang.String r0 = "/"
            java.lang.String[] r14 = r1.split(r0)     // Catch:{ IOException -> 0x011e, 43n -> 0x014e, all -> 0x01bc }
            int r1 = r14.length     // Catch:{ IOException -> 0x011e, 43n -> 0x014e, all -> 0x01bc }
            r0 = 2
            if (r1 != r0) goto L_0x00d2
            r0 = r14[r6]     // Catch:{ IOException -> 0x011e, 43n -> 0x014e, all -> 0x01bc }
            int r15 = java.lang.Integer.parseInt(r0)     // Catch:{ IOException -> 0x011e, 43n -> 0x014e, all -> 0x01bc }
            goto L_0x00d8
        L_0x00d2:
            r15 = -1
            goto L_0x00da
        L_0x00d4:
            int r15 = r2.getContentLength()     // Catch:{ IOException -> 0x011e, 43n -> 0x014e, all -> 0x01bc }
        L_0x00d8:
            if (r15 == 0) goto L_0x0117
        L_0x00da:
            long r0 = (long) r15     // Catch:{ IOException -> 0x011e, 43n -> 0x014e, all -> 0x01bc }
            long r16 = r10.length()     // Catch:{ IOException -> 0x011e, 43n -> 0x014e, all -> 0x01bc }
            int r14 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r14 == 0) goto L_0x0117
            java.lang.StringBuilder r14 = X.AnonymousClass000.A0o()     // Catch:{ IOException -> 0x011e, 43n -> 0x014e, all -> 0x01bc }
            java.lang.String r0 = "ProfilePictureDownload: Length mismatch between CDN response and stored file: "
            r14.append(r0)     // Catch:{ IOException -> 0x011e, 43n -> 0x014e, all -> 0x01bc }
            r0 = r18
            r14.append(r0)     // Catch:{ IOException -> 0x011e, 43n -> 0x014e, all -> 0x01bc }
            java.lang.String r0 = " responseCode:"
            r14.append(r0)     // Catch:{ IOException -> 0x011e, 43n -> 0x014e, all -> 0x01bc }
            r14.append(r13)     // Catch:{ IOException -> 0x011e, 43n -> 0x014e, all -> 0x01bc }
            java.lang.String r0 = " contentLength:"
            r14.append(r0)     // Catch:{ IOException -> 0x011e, 43n -> 0x014e, all -> 0x01bc }
            r14.append(r15)     // Catch:{ IOException -> 0x011e, 43n -> 0x014e, all -> 0x01bc }
            java.lang.String r0 = " fileLength:"
            r14.append(r0)     // Catch:{ IOException -> 0x011e, 43n -> 0x014e, all -> 0x01bc }
            long r0 = r10.length()     // Catch:{ IOException -> 0x011e, 43n -> 0x014e, all -> 0x01bc }
            java.lang.String r0 = X.C13680ns.A0j(r14, r0)     // Catch:{ IOException -> 0x011e, 43n -> 0x014e, all -> 0x01bc }
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ IOException -> 0x011e, 43n -> 0x014e, all -> 0x01bc }
            X.4MZ r13 = new X.4MZ     // Catch:{ IOException -> 0x011e, 43n -> 0x014e, all -> 0x01bc }
            r13.<init>(r11, r10, r6, r12)     // Catch:{ IOException -> 0x011e, 43n -> 0x014e, all -> 0x01bc }
            goto L_0x0131
        L_0x0117:
            r0 = 2
            X.4MZ r13 = new X.4MZ     // Catch:{ IOException -> 0x011e, 43n -> 0x014e, all -> 0x01bc }
            r13.<init>(r11, r10, r0, r6)     // Catch:{ IOException -> 0x011e, 43n -> 0x014e, all -> 0x01bc }
            goto L_0x0131
        L_0x011e:
            r12 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0o()     // Catch:{ IOException -> 0x0152, 43n -> 0x014e, all -> 0x01bc }
            java.lang.String r0 = "ProfilePictureDownload: IO Exception in middle of download: "
            java.lang.String r0 = X.AnonymousClass000.A0e(r12, r0, r1)     // Catch:{ IOException -> 0x0152, 43n -> 0x014e, all -> 0x01bc }
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ IOException -> 0x0152, 43n -> 0x014e, all -> 0x01bc }
            X.4MZ r13 = new X.4MZ     // Catch:{ IOException -> 0x0152, 43n -> 0x014e, all -> 0x01bc }
            r13.<init>(r11, r10, r3, r7)     // Catch:{ IOException -> 0x0152, 43n -> 0x014e, all -> 0x01bc }
        L_0x0131:
            r2.disconnect()
            r4.close()     // Catch:{ IOException -> 0x01aa }
            goto L_0x01ae
        L_0x0138:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0o()     // Catch:{ IOException -> 0x0152, 43n -> 0x014e, all -> 0x01bc }
            java.lang.String r0 = "ProfilePictureDownload: Non Success Response from CDN: "
            java.lang.String r0 = X.C13680ns.A0i(r0, r1, r13)     // Catch:{ IOException -> 0x0152, 43n -> 0x014e, all -> 0x01bc }
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ IOException -> 0x0152, 43n -> 0x014e, all -> 0x01bc }
            X.4MZ r13 = new X.4MZ     // Catch:{ IOException -> 0x0152, 43n -> 0x014e, all -> 0x01bc }
            r13.<init>(r11, r10, r6, r12)     // Catch:{ IOException -> 0x0152, 43n -> 0x014e, all -> 0x01bc }
            r2.disconnect()
            goto L_0x01ae
        L_0x014e:
            r1 = move-exception
            r7 = r4
            r4 = r2
            goto L_0x016e
        L_0x0152:
            r1 = move-exception
            r7 = r4
            r4 = r2
            goto L_0x017c
        L_0x0156:
            java.lang.String r0 = "Could not get HTTPS Connection:"
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)     // Catch:{ IOException -> 0x017a, 43n -> 0x016c, all -> 0x016a }
            java.lang.String r0 = X.AnonymousClass000.A0d(r2)     // Catch:{ IOException -> 0x017a, 43n -> 0x016c, all -> 0x016a }
            java.lang.String r1 = X.AnonymousClass000.A0h(r0, r1)     // Catch:{ IOException -> 0x017a, 43n -> 0x016c, all -> 0x016a }
            X.43n r0 = new X.43n     // Catch:{ IOException -> 0x017a, 43n -> 0x016c, all -> 0x016a }
            r0.<init>(r11, r1)     // Catch:{ IOException -> 0x017a, 43n -> 0x016c, all -> 0x016a }
            throw r0     // Catch:{ IOException -> 0x017a, 43n -> 0x016c, all -> 0x016a }
        L_0x016a:
            r1 = move-exception
            goto L_0x01cc
        L_0x016c:
            r1 = move-exception
            r7 = r4
        L_0x016e:
            java.lang.String r0 = "ProfilePictureDownload: "
            com.whatsapp.util.Log.w(r0, r1)     // Catch:{ all -> 0x01b8 }
            r0 = 4
            X.4MZ r13 = new X.4MZ     // Catch:{ all -> 0x01b8 }
            r13.<init>(r11, r10, r3, r0)     // Catch:{ all -> 0x01b8 }
            goto L_0x019f
        L_0x017a:
            r1 = move-exception
            r7 = r4
        L_0x017c:
            boolean r0 = r1 instanceof java.net.UnknownHostException     // Catch:{ all -> 0x01b8 }
            if (r0 != 0) goto L_0x0194
            boolean r0 = r1 instanceof java.net.SocketTimeoutException     // Catch:{ all -> 0x01b8 }
            if (r0 != 0) goto L_0x0194
            boolean r0 = r1 instanceof java.net.ConnectException     // Catch:{ all -> 0x01b8 }
            if (r0 != 0) goto L_0x0194
            java.lang.String r0 = "ProfilePictureDownload: Fatal error connecting to CDN "
            com.whatsapp.util.Log.w(r0, r1)     // Catch:{ all -> 0x01b8 }
            r0 = 4
            X.4MZ r13 = new X.4MZ     // Catch:{ all -> 0x01b8 }
            r13.<init>(r11, r10, r6, r0)     // Catch:{ all -> 0x01b8 }
            goto L_0x019f
        L_0x0194:
            java.lang.String r0 = "ProfilePictureDownload: Transient error connecting to CDN "
            com.whatsapp.util.Log.w(r0, r1)     // Catch:{ all -> 0x01b8 }
            r0 = 4
            X.4MZ r13 = new X.4MZ     // Catch:{ all -> 0x01b8 }
            r13.<init>(r11, r10, r3, r0)     // Catch:{ all -> 0x01b8 }
        L_0x019f:
            if (r4 == 0) goto L_0x01a4
            r4.disconnect()
        L_0x01a4:
            if (r7 == 0) goto L_0x01ae
            r7.close()     // Catch:{ IOException -> 0x01aa }
            goto L_0x01ae
        L_0x01aa:
            r0 = move-exception
            com.whatsapp.util.Log.w(r9, r0)
        L_0x01ae:
            r5.close()     // Catch:{ IOException -> 0x01b2 }
            goto L_0x01b7
        L_0x01b2:
            r0 = move-exception
            com.whatsapp.util.Log.w(r8, r0)
            return r13
        L_0x01b7:
            return r13
        L_0x01b8:
            r1 = move-exception
            if (r4 == 0) goto L_0x01c2
            goto L_0x01bf
        L_0x01bc:
            r1 = move-exception
            r7 = r4
            r4 = r2
        L_0x01bf:
            r4.disconnect()
        L_0x01c2:
            if (r7 == 0) goto L_0x01cc
            r7.close()     // Catch:{ IOException -> 0x01c8 }
            goto L_0x01cc
        L_0x01c8:
            r0 = move-exception
            com.whatsapp.util.Log.w(r9, r0)
        L_0x01cc:
            r5.close()     // Catch:{ IOException -> 0x01d0 }
            throw r1
        L_0x01d0:
            r0 = move-exception
            com.whatsapp.util.Log.w(r8, r0)
            throw r1
        L_0x01d5:
            r1 = move-exception
            java.lang.String r0 = "ProfilePictureDownload: Could not open FileOutputStream "
            com.whatsapp.util.Log.w(r0, r1)
            X.4MZ r13 = new X.4MZ
            r13.<init>(r11, r10, r6, r7)
            return r13
        L_0x01e1:
            r1 = move-exception
            java.lang.String r0 = "ProfilePictureDownload: Failed, could not create temp file:"
            com.whatsapp.util.Log.w(r0, r1)
            r1 = 1
            r0 = 5
            X.4MZ r13 = new X.4MZ
            r13.<init>(r11, r10, r1, r0)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass37V.A08(java.lang.Object[]):java.lang.Object");
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processHandlersOutBlocks(RegionMaker.java:1008)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:978)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x0029 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x002e */
    public /* bridge */ /* synthetic */ void A0A(java.lang.Object r14) {
        /*
            r13 = this;
            X.4MZ r14 = (X.AnonymousClass4MZ) r14
            int r1 = r14.A01
            r0 = 2
            if (r1 != r0) goto L_0x0033
            java.io.File r5 = r14.A02
            long r0 = r5.length()
            int r4 = (int) r0
            byte[] r3 = new byte[r4]
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ FileNotFoundException -> 0x0052, IOException -> 0x002f }
            r2.<init>(r5)     // Catch:{ FileNotFoundException -> 0x0052, IOException -> 0x002f }
            java.io.BufferedInputStream r1 = new java.io.BufferedInputStream     // Catch:{ all -> 0x002a }
            r1.<init>(r2)     // Catch:{ all -> 0x002a }
            r0 = 0
            r1.read(r3, r0, r4)     // Catch:{ all -> 0x0025 }
            r1.close()     // Catch:{ all -> 0x002a }
            r2.close()     // Catch:{ FileNotFoundException -> 0x0052, IOException -> 0x002f }
            goto L_0x0058
        L_0x0025:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x0029 }
        L_0x0029:
            throw r0     // Catch:{ all -> 0x002a }
        L_0x002a:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x002e }
        L_0x002e:
            throw r0     // Catch:{ FileNotFoundException -> 0x0052, IOException -> 0x002f }
        L_0x002f:
            r1 = move-exception
            java.lang.String r0 = "ProfilePictureDownload: IO Exception while reading the picture download file"
            goto L_0x0055
        L_0x0033:
            if (r1 != 0) goto L_0x006a
            int r1 = r13.A00
            r0 = 3
            if (r1 >= r0) goto L_0x006a
            X.0tz r4 = r13.A04
            X.0vR r8 = r13.A08
            X.0sq r9 = r13.A09
            X.0ua r2 = r13.A02
            X.0vS r7 = r13.A07
            X.12A r3 = r13.A03
            X.15x r6 = r13.A06
            X.277 r5 = r13.A05
            int r10 = r1 + 1
            long r11 = r13.A01
            A04(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
        L_0x0052:
            r1 = move-exception
            java.lang.String r0 = "ProfilePictureDownload: Could not find picture download file"
        L_0x0055:
            com.whatsapp.util.Log.w(r0, r1)
        L_0x0058:
            X.277 r4 = r13.A05
            r4.A00 = r3
            X.12A r3 = r13.A03
            X.11y r2 = r3.A00
            r1 = 43
            com.facebook.redex.RunnableRunnableShape4S0200000_I0_2 r0 = new com.facebook.redex.RunnableRunnableShape4S0200000_I0_2
            r0.<init>(r3, r1, r4)
            r2.A01(r0)
        L_0x006a:
            X.15x r7 = r13.A06
            int r6 = r14.A00
            long r2 = android.os.SystemClock.elapsedRealtime()
            long r0 = r13.A01
            long r2 = r2 - r0
            java.lang.Long r5 = java.lang.Long.valueOf(r2)
            java.io.File r4 = r14.A02
            long r2 = r4.length()
            double r0 = (double) r2
            java.lang.Double r1 = java.lang.Double.valueOf(r0)
            r0 = 2
            r7.A00(r1, r5, r6, r0)
            java.util.HashMap r1 = A0A
            monitor-enter(r1)
            X.277 r0 = r13.A05     // Catch:{ all -> 0x0097 }
            X.0rv r0 = r0.A03     // Catch:{ all -> 0x0097 }
            r1.remove(r0)     // Catch:{ all -> 0x0097 }
            monitor-exit(r1)     // Catch:{ all -> 0x0097 }
            r4.delete()
            return
        L_0x0097:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0097 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass37V.A0A(java.lang.Object):void");
    }
}
