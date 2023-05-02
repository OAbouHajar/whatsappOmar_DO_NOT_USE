package X;

import android.net.UrlQuerySanitizer;
import com.whatsapp.util.Log;
import java.net.URL;
import java.util.Set;

/* renamed from: X.14b  reason: invalid class name and case insensitive filesystem */
public class C214314b {
    public final C16300so A00;
    public final C14870pt A01;
    public final C16040sK A02;
    public final C17130ua A03;
    public final C16440t3 A04;
    public final C16980tz A05;
    public final C15860rz A06;
    public final AnonymousClass013 A07;
    public final C14710pd A08;
    public final C16490t9 A09;
    public final C19950zG A0A;
    public final C213013o A0B;
    public final C17670vS A0C;
    public final C215014i A0D;
    public final C17660vR A0E;

    public C214314b(C16300so r1, C14870pt r2, C16040sK r3, C17130ua r4, C16440t3 r5, C16980tz r6, C15860rz r7, AnonymousClass013 r8, C14710pd r9, C16490t9 r10, C19950zG r11, C213013o r12, C17670vS r13, C215014i r14, C17660vR r15) {
        this.A05 = r6;
        this.A04 = r5;
        this.A08 = r9;
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = r3;
        this.A0E = r15;
        this.A03 = r4;
        this.A09 = r10;
        this.A0A = r11;
        this.A07 = r8;
        this.A0C = r13;
        this.A06 = r7;
        this.A0B = r12;
        this.A0D = r14;
    }

    public C37771pi A00(C38251qU r7, String str) {
        C215014i r5 = this.A0D;
        if (!r5.A02()) {
            Log.i("StickerPackNetworkProvider/getStickerPackById skipped due to backoff time");
        } else {
            try {
                StringBuilder sb = new StringBuilder("https://static.whatsapp.net/sticker?id=");
                sb.append(str);
                sb.append("&lg=");
                sb.append(AnonymousClass1WH.A05(AnonymousClass013.A00(this.A07.A00)));
                String obj = sb.toString();
                if (this.A08.A0E(C16620tM.A02, 2565)) {
                    obj = this.A0B.A00(obj);
                }
                C38261qV A012 = A01(r7, obj, (String) null);
                r5.A00();
                if (A012 != null) {
                    return (C37771pi) A012.A01.get(0);
                }
            } catch (C37961q1 e2) {
                r5.A01();
                Log.e("StickerPackNetworkProvider/getStickerPackById failed", e2);
                return null;
            }
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0218, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x021d, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:?, code lost:
        r2 = new X.C37961q1("StickerPackNetworkProvider/getStickerPacks/JSONException/error parsing json data", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0226, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0227, code lost:
        r2 = new X.C37961q1("StickerPackNetworkProvider/getStickerPacks/IOException/error parsing sticker pack json", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0272, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:?, code lost:
        r6.A00.AcB("StickerPackNetworkProvider/getStickerPacks/EOFException", (java.lang.String) null, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0299, code lost:
        if (r3 == null) goto L_0x029e;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:56:0x021c */
    /* JADX WARNING: Missing exception handler attribute for start block: B:81:0x0292 */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0272 A[ExcHandler: IllegalArgumentException (e java.lang.IllegalArgumentException), Splitter:B:5:0x0049] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0292 A[PHI: r3 
      PHI: (r3v2 javax.net.ssl.HttpsURLConnection) = (r3v3 javax.net.ssl.HttpsURLConnection), (r3v7 javax.net.ssl.HttpsURLConnection), (r3v7 javax.net.ssl.HttpsURLConnection), (r3v7 javax.net.ssl.HttpsURLConnection), (r3v7 javax.net.ssl.HttpsURLConnection), (r3v7 javax.net.ssl.HttpsURLConnection), (r3v7 javax.net.ssl.HttpsURLConnection), (r3v7 javax.net.ssl.HttpsURLConnection), (r3v7 javax.net.ssl.HttpsURLConnection), (r3v7 javax.net.ssl.HttpsURLConnection), (r3v7 javax.net.ssl.HttpsURLConnection) binds: [B:79:0x0291, B:19:0x0090, B:60:0x0220, B:20:?, B:56:0x021c, B:57:?, B:47:0x0207, B:48:?, B:49:0x020a, B:50:?, B:5:0x0049] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC, Splitter:B:81:0x0292] */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x02a8  */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:81:0x0292=Splitter:B:81:0x0292, B:71:0x0279=Splitter:B:71:0x0279} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C38261qV A01(X.C38251qU r21, java.lang.String r22, java.lang.String r23) {
        /*
            r20 = this;
            java.lang.String r8 = ", reason: "
            java.lang.String r7 = "StickerPackNetworkProvider/getStickerPacks/StickerError/connection is not 200, result code: "
            r6 = r20
            X.0t3 r10 = r6.A04
            long r11 = r10.A00()
            r0 = 9
            r5 = 1
            r4 = 0
            android.net.TrafficStats.setThreadStatsTag(r0)     // Catch:{ EOFException -> 0x0291, IOException -> 0x0288, IllegalArgumentException -> 0x0277 }
            java.net.URL r0 = new java.net.URL     // Catch:{ EOFException -> 0x0291, IOException -> 0x0288, IllegalArgumentException -> 0x0277 }
            r9 = r22
            r0.<init>(r9)     // Catch:{ EOFException -> 0x0291, IOException -> 0x0288, IllegalArgumentException -> 0x0277 }
            java.net.URLConnection r3 = r0.openConnection()     // Catch:{ EOFException -> 0x0291, IOException -> 0x0288, IllegalArgumentException -> 0x0277 }
            javax.net.ssl.HttpsURLConnection r3 = (javax.net.ssl.HttpsURLConnection) r3     // Catch:{ EOFException -> 0x0291, IOException -> 0x0288, IllegalArgumentException -> 0x0277 }
            X.0vS r0 = r6.A0C     // Catch:{ EOFException -> 0x0291, IOException -> 0x0288, IllegalArgumentException -> 0x0277 }
            X.1ad r0 = r0.A02()     // Catch:{ EOFException -> 0x0291, IOException -> 0x0288, IllegalArgumentException -> 0x0277 }
            r3.setSSLSocketFactory(r0)     // Catch:{ EOFException -> 0x0291, IOException -> 0x0288, IllegalArgumentException -> 0x0277 }
            X.0vR r0 = r6.A0E     // Catch:{ EOFException -> 0x0291, IOException -> 0x0288, IllegalArgumentException -> 0x0277 }
            java.lang.String r1 = r0.A00()     // Catch:{ EOFException -> 0x0291, IOException -> 0x0288, IllegalArgumentException -> 0x0277 }
            java.lang.String r0 = "User-Agent"
            r3.setRequestProperty(r0, r1)     // Catch:{ EOFException -> 0x0291, IOException -> 0x0288, IllegalArgumentException -> 0x0277 }
            r0 = 15000(0x3a98, float:2.102E-41)
            r3.setConnectTimeout(r0)     // Catch:{ EOFException -> 0x0291, IOException -> 0x0288, IllegalArgumentException -> 0x0277 }
            r0 = 30000(0x7530, float:4.2039E-41)
            r3.setReadTimeout(r0)     // Catch:{ EOFException -> 0x0291, IOException -> 0x0288, IllegalArgumentException -> 0x0277 }
            java.lang.String r0 = "GET"
            r3.setRequestMethod(r0)     // Catch:{ EOFException -> 0x0291, IOException -> 0x0288, IllegalArgumentException -> 0x0277 }
            r1 = r23
            if (r23 == 0) goto L_0x0059
            java.lang.String r0 = "If-None-Match"
            r3.setRequestProperty(r0, r1)     // Catch:{ EOFException -> 0x0292, IOException -> 0x0274, IllegalArgumentException -> 0x0272 }
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ EOFException -> 0x0292, IOException -> 0x0274, IllegalArgumentException -> 0x0272 }
            r0 = 19
            if (r1 >= r0) goto L_0x0059
            java.lang.String r1 = "Accept-Encoding"
            java.lang.String r0 = ""
            r3.setRequestProperty(r1, r0)     // Catch:{ EOFException -> 0x0292, IOException -> 0x0274, IllegalArgumentException -> 0x0272 }
        L_0x0059:
            int r2 = r3.getResponseCode()     // Catch:{ EOFException -> 0x0292, IOException -> 0x0274, IllegalArgumentException -> 0x0272 }
            long r14 = r10.A00()     // Catch:{ EOFException -> 0x0292, IOException -> 0x0274, IllegalArgumentException -> 0x0272 }
            long r14 = r14 - r11
            java.net.URL r11 = r3.getURL()     // Catch:{ EOFException -> 0x0292, IOException -> 0x0274, IllegalArgumentException -> 0x0272 }
            long r0 = (long) r2     // Catch:{ EOFException -> 0x0292, IOException -> 0x0274, IllegalArgumentException -> 0x0272 }
            r10 = r6
            r12 = r0
            r10.A02(r11, r12, r14)     // Catch:{ EOFException -> 0x0292, IOException -> 0x0274, IllegalArgumentException -> 0x0272 }
            r0 = 200(0xc8, float:2.8E-43)
            if (r2 == r0) goto L_0x008a
            r0 = 304(0x130, float:4.26E-43)
            if (r2 == r0) goto L_0x029b
            r0 = 404(0x194, float:5.66E-43)
            if (r2 != r0) goto L_0x022f
            r10 = r21
            if (r21 == 0) goto L_0x022f
            X.0pt r2 = r6.A01     // Catch:{ EOFException -> 0x0292, IOException -> 0x0274, IllegalArgumentException -> 0x0272 }
            r1 = 11
            com.facebook.redex.RunnableRunnableShape15S0100000_I0_14 r0 = new com.facebook.redex.RunnableRunnableShape15S0100000_I0_14     // Catch:{ EOFException -> 0x0292, IOException -> 0x0274, IllegalArgumentException -> 0x0272 }
            r0.<init>(r10, r1)     // Catch:{ EOFException -> 0x0292, IOException -> 0x0274, IllegalArgumentException -> 0x0272 }
            r2.A0K(r0)     // Catch:{ EOFException -> 0x0292, IOException -> 0x0274, IllegalArgumentException -> 0x0272 }
            goto L_0x029b
        L_0x008a:
            java.lang.String r0 = "ETag"
            java.lang.String r19 = r3.getHeaderField(r0)     // Catch:{ EOFException -> 0x0292, IOException -> 0x0274, IllegalArgumentException -> 0x0272 }
            X.0ua r7 = r6.A03     // Catch:{ IOException -> 0x0226, JSONException -> 0x021d, EOFException -> 0x0292, IllegalArgumentException -> 0x0272 }
            r0 = 26
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)     // Catch:{ IOException -> 0x0226, JSONException -> 0x021d, EOFException -> 0x0292, IllegalArgumentException -> 0x0272 }
            java.io.InputStream r1 = r3.getInputStream()     // Catch:{ IOException -> 0x0226, JSONException -> 0x021d, EOFException -> 0x0292, IllegalArgumentException -> 0x0272 }
            X.1qW r18 = new X.1qW     // Catch:{ IOException -> 0x0226, JSONException -> 0x021d, EOFException -> 0x0292, IllegalArgumentException -> 0x0272 }
            r0 = r18
            r0.<init>(r7, r1, r4, r2)     // Catch:{ IOException -> 0x0226, JSONException -> 0x021d, EOFException -> 0x0292, IllegalArgumentException -> 0x0272 }
            java.lang.String r1 = X.C30311c8.A00(r18)     // Catch:{ all -> 0x0218 }
            X.AnonymousClass00B.A06(r1)     // Catch:{ all -> 0x0218 }
            org.json.JSONArray r17 = new org.json.JSONArray     // Catch:{ all -> 0x0218 }
            r0 = r17
            r0.<init>(r1)     // Catch:{ all -> 0x0218 }
            int r0 = r17.length()     // Catch:{ all -> 0x0218 }
            java.util.ArrayList r12 = new java.util.ArrayList     // Catch:{ all -> 0x0218 }
            r12.<init>(r0)     // Catch:{ all -> 0x0218 }
            r11 = 0
        L_0x00bb:
            int r0 = r17.length()     // Catch:{ all -> 0x0218 }
            if (r11 >= r0) goto L_0x0207
            X.1ph r10 = new X.1ph     // Catch:{ all -> 0x0218 }
            r10.<init>()     // Catch:{ all -> 0x0218 }
            r0 = r17
            java.lang.Object r13 = r0.get(r11)     // Catch:{ all -> 0x0218 }
            org.json.JSONObject r13 = (org.json.JSONObject) r13     // Catch:{ all -> 0x0218 }
            java.lang.String r0 = "sticker-pack-id"
            java.lang.Object r15 = r13.get(r0)     // Catch:{ all -> 0x0218 }
            java.lang.String r15 = (java.lang.String) r15     // Catch:{ all -> 0x0218 }
            java.lang.String r1 = "stickers"
            boolean r0 = r13.has(r1)     // Catch:{ all -> 0x0218 }
            if (r0 == 0) goto L_0x0187
            org.json.JSONArray r16 = r13.getJSONArray(r1)     // Catch:{ all -> 0x0218 }
            int r0 = r16.length()     // Catch:{ all -> 0x0218 }
            java.util.ArrayList r14 = new java.util.ArrayList     // Catch:{ all -> 0x0218 }
            r14.<init>(r0)     // Catch:{ all -> 0x0218 }
            r9 = 0
        L_0x00ee:
            int r0 = r16.length()     // Catch:{ all -> 0x0218 }
            if (r9 >= r0) goto L_0x0185
            X.1jm r8 = new X.1jm     // Catch:{ all -> 0x0218 }
            r8.<init>()     // Catch:{ all -> 0x0218 }
            r0 = r16
            org.json.JSONObject r1 = r0.getJSONObject(r9)     // Catch:{ all -> 0x0218 }
            java.lang.String r0 = "file-hash"
            java.lang.String r0 = r1.getString(r0)     // Catch:{ all -> 0x0218 }
            r8.A0D = r0     // Catch:{ all -> 0x0218 }
            java.lang.String r0 = "file-size"
            int r0 = r1.getInt(r0)     // Catch:{ all -> 0x0218 }
            r8.A00 = r0     // Catch:{ all -> 0x0218 }
            java.lang.String r0 = "url"
            java.lang.String r0 = r1.getString(r0)     // Catch:{ all -> 0x0218 }
            r8.A0G = r0     // Catch:{ all -> 0x0218 }
            java.lang.String r0 = "enc-file-hash"
            java.lang.String r0 = r1.getString(r0)     // Catch:{ all -> 0x0218 }
            r8.A08 = r0     // Catch:{ all -> 0x0218 }
            java.lang.String r0 = "media-key"
            java.lang.String r0 = r1.getString(r0)     // Catch:{ all -> 0x0218 }
            r8.A0B = r0     // Catch:{ all -> 0x0218 }
            java.lang.String r0 = "mimetype"
            java.lang.String r0 = r1.getString(r0)     // Catch:{ all -> 0x0218 }
            r8.A0C = r0     // Catch:{ all -> 0x0218 }
            java.lang.String r0 = "height"
            int r0 = r1.getInt(r0)     // Catch:{ all -> 0x0218 }
            r8.A02 = r0     // Catch:{ all -> 0x0218 }
            java.lang.String r0 = "width"
            int r0 = r1.getInt(r0)     // Catch:{ all -> 0x0218 }
            r8.A03 = r0     // Catch:{ all -> 0x0218 }
            java.lang.String r0 = "direct-path"
            java.lang.String r0 = r1.getString(r0)     // Catch:{ all -> 0x0218 }
            r8.A06 = r0     // Catch:{ all -> 0x0218 }
            java.lang.String r0 = "sticker-hash-without-meta"
            java.lang.String r0 = r1.optString(r0)     // Catch:{ all -> 0x0218 }
            r8.A0A = r0     // Catch:{ all -> 0x0218 }
            java.lang.String r0 = "emojis"
            org.json.JSONArray r7 = r1.optJSONArray(r0)     // Catch:{ all -> 0x0218 }
            if (r7 == 0) goto L_0x017c
            int r0 = r7.length()     // Catch:{ all -> 0x0218 }
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x0218 }
            r2.<init>(r0)     // Catch:{ all -> 0x0218 }
            r1 = 0
        L_0x0164:
            int r0 = r7.length()     // Catch:{ all -> 0x0218 }
            if (r1 >= r0) goto L_0x0174
            java.lang.String r0 = r7.getString(r1)     // Catch:{ all -> 0x0218 }
            r2.add(r0)     // Catch:{ all -> 0x0218 }
            int r1 = r1 + 1
            goto L_0x0164
        L_0x0174:
            java.lang.String r0 = " "
            java.lang.String r0 = android.text.TextUtils.join(r0, r2)     // Catch:{ all -> 0x0218 }
            r8.A07 = r0     // Catch:{ all -> 0x0218 }
        L_0x017c:
            r8.A0F = r15     // Catch:{ all -> 0x0218 }
            r14.add(r8)     // Catch:{ all -> 0x0218 }
            int r9 = r9 + 1
            goto L_0x00ee
        L_0x0185:
            r10.A0M = r14     // Catch:{ all -> 0x0218 }
        L_0x0187:
            r10.A0D = r15     // Catch:{ all -> 0x0218 }
            java.lang.String r0 = "name"
            java.lang.Object r0 = r13.get(r0)     // Catch:{ all -> 0x0218 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x0218 }
            r10.A0F = r0     // Catch:{ all -> 0x0218 }
            java.lang.String r0 = "publisher"
            java.lang.Object r0 = r13.get(r0)     // Catch:{ all -> 0x0218 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x0218 }
            r10.A0H = r0     // Catch:{ all -> 0x0218 }
            java.lang.String r0 = "description"
            java.lang.Object r0 = r13.get(r0)     // Catch:{ all -> 0x0218 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x0218 }
            r10.A02 = r0     // Catch:{ all -> 0x0218 }
            java.lang.String r0 = "tray-image-id"
            java.lang.Object r0 = r13.get(r0)     // Catch:{ all -> 0x0218 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x0218 }
            r10.A0J = r0     // Catch:{ all -> 0x0218 }
            java.lang.String r0 = "tray-image-preview"
            java.lang.Object r0 = r13.get(r0)     // Catch:{ all -> 0x0218 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x0218 }
            r10.A0K = r0     // Catch:{ all -> 0x0218 }
            java.lang.String r0 = "preview-image-ids"
            org.json.JSONArray r7 = r13.getJSONArray(r0)     // Catch:{ all -> 0x0218 }
            int r0 = r7.length()     // Catch:{ all -> 0x0218 }
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x0218 }
            r2.<init>(r0)     // Catch:{ all -> 0x0218 }
            r1 = 0
        L_0x01cd:
            int r0 = r7.length()     // Catch:{ all -> 0x0218 }
            if (r1 >= r0) goto L_0x01dd
            java.lang.Object r0 = r7.get(r1)     // Catch:{ all -> 0x0218 }
            r2.add(r0)     // Catch:{ all -> 0x0218 }
            int r1 = r1 + 1
            goto L_0x01cd
        L_0x01dd:
            r10.A0L = r2     // Catch:{ all -> 0x0218 }
            java.lang.String r0 = "file-size"
            long r0 = r13.getLong(r0)     // Catch:{ all -> 0x0218 }
            r10.A01 = r0     // Catch:{ all -> 0x0218 }
            java.lang.String r0 = "image-data-hash"
            java.lang.String r0 = r13.getString(r0)     // Catch:{ all -> 0x0218 }
            r10.A0E = r0     // Catch:{ all -> 0x0218 }
            java.lang.String r1 = "animated"
            r0 = 0
            int r1 = r13.optInt(r1, r0)     // Catch:{ all -> 0x0218 }
            r0 = 1
            if (r1 == r5) goto L_0x01fa
            r0 = 0
        L_0x01fa:
            r10.A0N = r0     // Catch:{ all -> 0x0218 }
            X.1pi r0 = r10.A00()     // Catch:{ all -> 0x0218 }
            r12.add(r0)     // Catch:{ all -> 0x0218 }
            int r11 = r11 + 1
            goto L_0x00bb
        L_0x0207:
            r18.close()     // Catch:{ IOException -> 0x0226, JSONException -> 0x021d, EOFException -> 0x0292, IllegalArgumentException -> 0x0272 }
            X.1qV r1 = new X.1qV     // Catch:{ EOFException -> 0x0292, IOException -> 0x0274, IllegalArgumentException -> 0x0272 }
            r0 = r19
            r1.<init>(r0, r12)     // Catch:{ EOFException -> 0x0292, IOException -> 0x0274, IllegalArgumentException -> 0x0272 }
            r3.disconnect()
            android.net.TrafficStats.clearThreadStatsTag()
            return r1
        L_0x0218:
            r0 = move-exception
            r18.close()     // Catch:{ all -> 0x021c }
        L_0x021c:
            throw r0     // Catch:{ IOException -> 0x0226, JSONException -> 0x021d, EOFException -> 0x0292, IllegalArgumentException -> 0x0272 }
        L_0x021d:
            r1 = move-exception
            java.lang.String r0 = "StickerPackNetworkProvider/getStickerPacks/JSONException/error parsing json data"
            X.1q1 r2 = new X.1q1     // Catch:{ EOFException -> 0x0292, IOException -> 0x0274, IllegalArgumentException -> 0x0272 }
            r2.<init>(r0, r1)     // Catch:{ EOFException -> 0x0292, IOException -> 0x0274, IllegalArgumentException -> 0x0272 }
            goto L_0x0271
        L_0x0226:
            r1 = move-exception
            java.lang.String r0 = "StickerPackNetworkProvider/getStickerPacks/IOException/error parsing sticker pack json"
            X.1q1 r2 = new X.1q1     // Catch:{ EOFException -> 0x0292, IOException -> 0x0274, IllegalArgumentException -> 0x0272 }
            r2.<init>(r0, r1)     // Catch:{ EOFException -> 0x0292, IOException -> 0x0274, IllegalArgumentException -> 0x0272 }
            goto L_0x0271
        L_0x022f:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ EOFException -> 0x0292, IOException -> 0x0274, IllegalArgumentException -> 0x0272 }
            r1.<init>()     // Catch:{ EOFException -> 0x0292, IOException -> 0x0274, IllegalArgumentException -> 0x0272 }
            r1.append(r7)     // Catch:{ EOFException -> 0x0292, IOException -> 0x0274, IllegalArgumentException -> 0x0272 }
            r1.append(r2)     // Catch:{ EOFException -> 0x0292, IOException -> 0x0274, IllegalArgumentException -> 0x0272 }
            r1.append(r8)     // Catch:{ EOFException -> 0x0292, IOException -> 0x0274, IllegalArgumentException -> 0x0272 }
            java.lang.String r0 = r3.getResponseMessage()     // Catch:{ EOFException -> 0x0292, IOException -> 0x0274, IllegalArgumentException -> 0x0272 }
            r1.append(r0)     // Catch:{ EOFException -> 0x0292, IOException -> 0x0274, IllegalArgumentException -> 0x0272 }
            java.lang.String r0 = ", url: "
            r1.append(r0)     // Catch:{ EOFException -> 0x0292, IOException -> 0x0274, IllegalArgumentException -> 0x0272 }
            r1.append(r9)     // Catch:{ EOFException -> 0x0292, IOException -> 0x0274, IllegalArgumentException -> 0x0272 }
            java.lang.String r0 = r1.toString()     // Catch:{ EOFException -> 0x0292, IOException -> 0x0274, IllegalArgumentException -> 0x0272 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ EOFException -> 0x0292, IOException -> 0x0274, IllegalArgumentException -> 0x0272 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ EOFException -> 0x0292, IOException -> 0x0274, IllegalArgumentException -> 0x0272 }
            r1.<init>()     // Catch:{ EOFException -> 0x0292, IOException -> 0x0274, IllegalArgumentException -> 0x0272 }
            r1.append(r7)     // Catch:{ EOFException -> 0x0292, IOException -> 0x0274, IllegalArgumentException -> 0x0272 }
            r1.append(r2)     // Catch:{ EOFException -> 0x0292, IOException -> 0x0274, IllegalArgumentException -> 0x0272 }
            r1.append(r8)     // Catch:{ EOFException -> 0x0292, IOException -> 0x0274, IllegalArgumentException -> 0x0272 }
            java.lang.String r0 = r3.getResponseMessage()     // Catch:{ EOFException -> 0x0292, IOException -> 0x0274, IllegalArgumentException -> 0x0272 }
            r1.append(r0)     // Catch:{ EOFException -> 0x0292, IOException -> 0x0274, IllegalArgumentException -> 0x0272 }
            java.lang.String r0 = r1.toString()     // Catch:{ EOFException -> 0x0292, IOException -> 0x0274, IllegalArgumentException -> 0x0272 }
            X.1q1 r2 = new X.1q1     // Catch:{ EOFException -> 0x0292, IOException -> 0x0274, IllegalArgumentException -> 0x0272 }
            r2.<init>(r0)     // Catch:{ EOFException -> 0x0292, IOException -> 0x0274, IllegalArgumentException -> 0x0272 }
        L_0x0271:
            throw r2     // Catch:{ EOFException -> 0x0292, IOException -> 0x0274, IllegalArgumentException -> 0x0272 }
        L_0x0272:
            r2 = move-exception
            goto L_0x0279
        L_0x0274:
            r2 = move-exception
            r4 = r3
            goto L_0x0289
        L_0x0277:
            r2 = move-exception
            r3 = r4
        L_0x0279:
            X.0so r1 = r6.A00     // Catch:{ all -> 0x02a2 }
            java.lang.String r0 = "StickerPackNetworkProvider/error fetching sticker pack json"
            r1.AcB(r0, r4, r5)     // Catch:{ all -> 0x02a2 }
            java.lang.String r1 = "StickerPackNetworkProvider/getStickerPacks/IllegalArgumentException/error fetching sticker pack json"
            X.1q1 r0 = new X.1q1     // Catch:{ all -> 0x02a2 }
            r0.<init>(r1, r2)     // Catch:{ all -> 0x02a2 }
            throw r0     // Catch:{ all -> 0x02a2 }
        L_0x0288:
            r2 = move-exception
        L_0x0289:
            java.lang.String r1 = "StickerPackNetworkProvider/getStickerPacks/IOException/error fetching sticker pack json"
            X.1q1 r0 = new X.1q1     // Catch:{ all -> 0x02a5 }
            r0.<init>(r1, r2)     // Catch:{ all -> 0x02a5 }
            throw r0     // Catch:{ all -> 0x02a5 }
        L_0x0291:
            r3 = r4
        L_0x0292:
            X.0so r1 = r6.A00     // Catch:{ all -> 0x02a2 }
            java.lang.String r0 = "StickerPackNetworkProvider/getStickerPacks/EOFException"
            r1.AcB(r0, r4, r5)     // Catch:{ all -> 0x02a2 }
            if (r3 == 0) goto L_0x029e
        L_0x029b:
            r3.disconnect()
        L_0x029e:
            android.net.TrafficStats.clearThreadStatsTag()
            return r4
        L_0x02a2:
            r0 = move-exception
            r4 = r3
            goto L_0x02a6
        L_0x02a5:
            r0 = move-exception
        L_0x02a6:
            if (r4 == 0) goto L_0x02ab
            r4.disconnect()
        L_0x02ab:
            android.net.TrafficStats.clearThreadStatsTag()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C214314b.A01(X.1qU, java.lang.String, java.lang.String):X.1qV");
    }

    public void A02(URL url, long j2, long j3) {
        int i2;
        Set<String> parameterSet = new UrlQuerySanitizer(url.toString()).getParameterSet();
        if (parameterSet.contains("cat")) {
            i2 = 0;
        } else if (parameterSet.contains("id")) {
            i2 = 2;
        } else {
            i2 = 1;
            if (!parameterSet.contains("img")) {
                StringBuilder sb = new StringBuilder("StickerPackNetworkProvider/log query type ");
                sb.append(-1);
                sb.append("is not supported: ");
                sb.append(url);
                Log.e(sb.toString());
                return;
            }
        }
        C38281qX r1 = new C38281qX();
        r1.A01 = Long.valueOf(j2);
        r1.A03 = url.getQuery();
        r1.A00 = Integer.valueOf(i2);
        r1.A02 = Long.valueOf(j3);
        this.A09.A06(r1);
    }
}
