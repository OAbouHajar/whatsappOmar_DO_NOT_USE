package X;

import android.content.Context;

/* renamed from: X.0Il  reason: invalid class name and case insensitive filesystem */
public class C03420Il extends C10670hV {
    public long A00;
    public final C008003r A01;

    public C03420Il(Context context) {
        C008003r r1 = null;
        if (C007803p.A03 == null) {
            try {
                C007903q.A00(context);
                r1 = C007903q.A00.A6l();
            } catch (C11100iC unused) {
                AnonymousClass0V3.A07.A02();
            }
        }
        this.A01 = r1;
    }

    public void A00() {
        C007803p.A0B.release();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:55:?, code lost:
        X.AnonymousClass0V3.A07.A02();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x01cc, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:?, code lost:
        android.util.Log.e("MapConfig", "Unable to download config", r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x01d4, code lost:
        if (r3 == null) goto L_0x01d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0239, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x023a, code lost:
        if (r3 != null) goto L_0x023c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x023f, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0240, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0241, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0033, code lost:
        if (r0.importance == 100) goto L_0x0035;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:54:0x01c6 */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x01c6 A[EDGE_INSN: B:54:0x01c6->B:55:? ?: BREAK  , PHI: r3 
      PHI: (r3v8 java.io.InputStream) = (r3v2 java.io.InputStream), (r3v2 java.io.InputStream), (r3v2 java.io.InputStream), (r3v9 java.io.InputStream), (r3v10 java.io.InputStream), (r3v10 java.io.InputStream) binds: [B:19:0x0076, B:20:?, B:21:0x008f, B:51:0x01c0, B:22:?, B:23:0x0095] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC, Splitter:B:54:0x01c6] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x01cc A[ExcHandler: IOException (r2v6 'e' java.io.IOException A[CUSTOM_DECLARE]), PHI: r3 
      PHI: (r3v7 java.io.InputStream) = (r3v2 java.io.InputStream), (r3v2 java.io.InputStream), (r3v9 java.io.InputStream), (r3v10 java.io.InputStream) binds: [B:19:0x0076, B:20:?, B:51:0x01c0, B:23:0x0095] A[DONT_GENERATE, DONT_INLINE], Splitter:B:19:0x0076] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0240 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:19:0x0076] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r30 = this;
            r6 = r30
            long r2 = r6.A00
            r0 = 1
            long r2 = r2 + r0
            r6.A00 = r2
            java.lang.String r1 = X.C007803p.A03
            java.lang.String r2 = ""
            if (r1 == 0) goto L_0x001d
            java.lang.String r0 = "&country="
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0r(r0)
            java.lang.String r2 = X.AnonymousClass000.A0h(r1, r0)
        L_0x0019:
            r0 = 512(0x200, float:7.175E-43)
            r3 = 0
            goto L_0x0076
        L_0x001d:
            X.03r r3 = r6.A01
            if (r3 == 0) goto L_0x0019
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 29
            if (r1 < r0) goto L_0x0035
            android.app.ActivityManager$RunningAppProcessInfo r0 = new android.app.ActivityManager$RunningAppProcessInfo
            r0.<init>()
            android.app.ActivityManager.getMyMemoryState(r0)
            int r1 = r0.importance
            r0 = 100
            if (r1 != r0) goto L_0x0019
        L_0x0035:
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 23
            if (r1 < r0) goto L_0x004f
            android.content.Context r1 = X.C007803p.A02
            java.lang.String r0 = "android.permission.ACCESS_COARSE_LOCATION"
            int r0 = r1.checkSelfPermission(r0)
            if (r0 != 0) goto L_0x0019
            android.content.Context r1 = X.C007803p.A02
            java.lang.String r0 = "android.permission.ACCESS_FINE_LOCATION"
            int r0 = r1.checkSelfPermission(r0)
            if (r0 != 0) goto L_0x0019
        L_0x004f:
            android.location.Location r3 = r3.ABN()
            if (r3 == 0) goto L_0x0019
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0q(r2)
            java.lang.String r0 = "&latitude="
            r2.append(r0)
            double r0 = r3.getLatitude()
            r2.append(r0)
            java.lang.String r0 = "&longitude="
            r2.append(r0)
            double r0 = r3.getLongitude()
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            goto L_0x0019
        L_0x0076:
            byte[] r5 = new byte[r0]     // Catch:{ IOException -> 0x01cc, Exception -> 0x01c6, all -> 0x0240 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0o()     // Catch:{ IOException -> 0x01cc, Exception -> 0x01c6, all -> 0x0240 }
            java.lang.String r0 = X.C007803p.A0E     // Catch:{ IOException -> 0x01cc, Exception -> 0x01c6, all -> 0x0240 }
            r1.append(r0)     // Catch:{ IOException -> 0x01cc, Exception -> 0x01c6, all -> 0x0240 }
            java.lang.String r0 = X.C007803p.A0D     // Catch:{ IOException -> 0x01cc, Exception -> 0x01c6, all -> 0x0240 }
            r1.append(r0)     // Catch:{ IOException -> 0x01cc, Exception -> 0x01c6, all -> 0x0240 }
            java.lang.String r1 = X.AnonymousClass000.A0h(r2, r1)     // Catch:{ IOException -> 0x01cc, Exception -> 0x01c6, all -> 0x0240 }
            java.net.URL r0 = new java.net.URL     // Catch:{ IOException -> 0x01cc, Exception -> 0x01c6, all -> 0x0240 }
            r0.<init>(r1)     // Catch:{ IOException -> 0x01cc, Exception -> 0x01c6, all -> 0x0240 }
            java.io.InputStream r3 = r0.openStream()     // Catch:{ IOException -> 0x01bd, Exception -> 0x01c6, all -> 0x0240 }
            r4 = 0
            r2 = 0
        L_0x0095:
            int r0 = r5.length     // Catch:{ IOException -> 0x01cc, Exception -> 0x01c6 }
            int r0 = r0 - r2
            int r1 = r3.read(r5, r2, r0)     // Catch:{ IOException -> 0x01cc, Exception -> 0x01c6 }
            r0 = -1
            if (r1 == r0) goto L_0x00ad
            int r2 = r2 + r1
            int r0 = r5.length     // Catch:{ IOException -> 0x01cc, Exception -> 0x01c6 }
            if (r2 < r0) goto L_0x0095
            int r0 = r5.length     // Catch:{ IOException -> 0x01cc, Exception -> 0x01c6 }
            int r0 = r0 << 1
            byte[] r1 = new byte[r0]     // Catch:{ IOException -> 0x01cc, Exception -> 0x01c6 }
            int r0 = r5.length     // Catch:{ IOException -> 0x01cc, Exception -> 0x01c6 }
            java.lang.System.arraycopy(r5, r4, r1, r4, r0)     // Catch:{ IOException -> 0x01cc, Exception -> 0x01c6 }
            r5 = r1
            goto L_0x0095
        L_0x00ad:
            java.lang.String r0 = new java.lang.String     // Catch:{ IOException -> 0x01cc, Exception -> 0x01c6 }
            r0.<init>(r5, r4, r2)     // Catch:{ IOException -> 0x01cc, Exception -> 0x01c6 }
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ IOException -> 0x01cc, Exception -> 0x01c6 }
            r1.<init>(r0)     // Catch:{ IOException -> 0x01cc, Exception -> 0x01c6 }
            java.lang.String r0 = "data"
            org.json.JSONArray r0 = r1.getJSONArray(r0)     // Catch:{ IOException -> 0x01cc, Exception -> 0x01c6 }
            org.json.JSONObject r9 = r0.getJSONObject(r4)     // Catch:{ IOException -> 0x01cc, Exception -> 0x01c6 }
            r3.close()     // Catch:{ IOException -> 0x00c4 }
        L_0x00c4:
            if (r9 == 0) goto L_0x01d9
            java.lang.String r23 = "south"
            java.lang.String r22 = "east"
            java.lang.String r21 = "north"
            java.lang.String r20 = "west"
            java.lang.String r15 = "rectangles"
            X.0P6 r0 = X.C007803p.A0C
            java.lang.String r0 = r0.A01
            java.lang.String r14 = "base_url"
            java.lang.String r24 = r9.optString(r14, r0)
            X.0P6 r0 = X.C007803p.A0C
            java.lang.String r1 = r0.A03
            java.lang.String r0 = "static_base_url"
            java.lang.String r25 = r9.optString(r0, r1)
            java.lang.String r0 = "osm_config"
            org.json.JSONObject r1 = r9.getJSONObject(r0)     // Catch:{ JSONException -> 0x0144 }
            java.lang.String r0 = "zoom_threshold"
            int r16 = r1.getInt(r0)     // Catch:{ JSONException -> 0x0144 }
            org.json.JSONArray r12 = r1.getJSONArray(r15)     // Catch:{ JSONException -> 0x0144 }
            int r8 = r12.length()     // Catch:{ JSONException -> 0x0144 }
            android.graphics.Rect[] r0 = new android.graphics.Rect[r8]     // Catch:{ JSONException -> 0x0144 }
            r19 = r0
            r7 = 1
            int r7 = r7 << r16
            r5 = 0
        L_0x0100:
            if (r5 >= r8) goto L_0x0150
            org.json.JSONObject r4 = r12.getJSONObject(r5)     // Catch:{ JSONException -> 0x0144 }
            double r2 = (double) r7     // Catch:{ JSONException -> 0x0144 }
            r0 = r20
            double r0 = r4.getDouble(r0)     // Catch:{ JSONException -> 0x0144 }
            double r10 = X.C06540Wn.A01(r0)     // Catch:{ JSONException -> 0x0144 }
            double r0 = r2 * r10
            int r10 = (int) r0     // Catch:{ JSONException -> 0x0144 }
            r0 = r21
            double r0 = r4.getDouble(r0)     // Catch:{ JSONException -> 0x0144 }
            double r17 = X.C06540Wn.A00(r0)     // Catch:{ JSONException -> 0x0144 }
            double r0 = r2 * r17
            int r11 = (int) r0     // Catch:{ JSONException -> 0x0144 }
            r0 = r22
            double r0 = r4.getDouble(r0)     // Catch:{ JSONException -> 0x0144 }
            double r17 = X.C06540Wn.A01(r0)     // Catch:{ JSONException -> 0x0144 }
            double r0 = r2 * r17
            int r13 = (int) r0     // Catch:{ JSONException -> 0x0144 }
            r0 = r23
            double r0 = r4.getDouble(r0)     // Catch:{ JSONException -> 0x0144 }
            double r0 = X.C06540Wn.A00(r0)     // Catch:{ JSONException -> 0x0144 }
            double r2 = r2 * r0
            int r0 = (int) r2     // Catch:{ JSONException -> 0x0144 }
            android.graphics.Rect r1 = new android.graphics.Rect     // Catch:{ JSONException -> 0x0144 }
            r1.<init>(r10, r11, r13, r0)     // Catch:{ JSONException -> 0x0144 }
            r19[r5] = r1     // Catch:{ JSONException -> 0x0144 }
            int r5 = r5 + 1
            goto L_0x0100
        L_0x0144:
            X.0P6 r0 = X.C007803p.A0C
            int r0 = r0.A00
            r16 = r0
            X.0P6 r0 = X.C007803p.A0C
            android.graphics.Rect[] r0 = r0.A04
            r19 = r0
        L_0x0150:
            java.lang.String r0 = "url_override_config"
            org.json.JSONArray r12 = r9.getJSONArray(r0)     // Catch:{ JSONException -> 0x0205 }
            int r7 = r12.length()     // Catch:{ JSONException -> 0x0205 }
            java.lang.String[] r10 = new java.lang.String[r7]     // Catch:{ JSONException -> 0x0205 }
            X.0Pm[][] r5 = new X.C05150Pm[r7][]     // Catch:{ JSONException -> 0x0205 }
            r4 = 0
        L_0x015f:
            if (r4 >= r7) goto L_0x020d
            org.json.JSONObject r1 = r12.getJSONObject(r4)     // Catch:{ JSONException -> 0x0205 }
            java.lang.String r0 = r1.getString(r14)     // Catch:{ JSONException -> 0x0205 }
            r10[r4] = r0     // Catch:{ JSONException -> 0x0205 }
            org.json.JSONArray r11 = r1.getJSONArray(r15)     // Catch:{ JSONException -> 0x0205 }
            int r8 = r11.length()     // Catch:{ JSONException -> 0x0205 }
            X.0Pm[] r0 = new X.C05150Pm[r8]     // Catch:{ JSONException -> 0x0205 }
            r5[r4] = r0     // Catch:{ JSONException -> 0x0205 }
            r3 = 0
        L_0x0178:
            if (r3 >= r8) goto L_0x01ba
            X.0Pm r2 = new X.0Pm     // Catch:{ JSONException -> 0x0205 }
            r2.<init>()     // Catch:{ JSONException -> 0x0205 }
            org.json.JSONObject r9 = r11.getJSONObject(r3)     // Catch:{ JSONException -> 0x0205 }
            r0 = r20
            double r0 = r9.getDouble(r0)     // Catch:{ JSONException -> 0x0205 }
            double r0 = X.C06540Wn.A01(r0)     // Catch:{ JSONException -> 0x0205 }
            r2.A01 = r0     // Catch:{ JSONException -> 0x0205 }
            r0 = r21
            double r0 = r9.getDouble(r0)     // Catch:{ JSONException -> 0x0205 }
            double r0 = X.C06540Wn.A00(r0)     // Catch:{ JSONException -> 0x0205 }
            r2.A03 = r0     // Catch:{ JSONException -> 0x0205 }
            r0 = r22
            double r0 = r9.getDouble(r0)     // Catch:{ JSONException -> 0x0205 }
            double r0 = X.C06540Wn.A01(r0)     // Catch:{ JSONException -> 0x0205 }
            r2.A02 = r0     // Catch:{ JSONException -> 0x0205 }
            r0 = r23
            double r0 = r9.getDouble(r0)     // Catch:{ JSONException -> 0x0205 }
            double r0 = X.C06540Wn.A00(r0)     // Catch:{ JSONException -> 0x0205 }
            r2.A00 = r0     // Catch:{ JSONException -> 0x0205 }
            r0 = r5[r4]     // Catch:{ JSONException -> 0x0205 }
            r0[r3] = r2     // Catch:{ JSONException -> 0x0205 }
            int r3 = r3 + 1
            goto L_0x0178
        L_0x01ba:
            int r4 = r4 + 1
            goto L_0x015f
        L_0x01bd:
            r2 = move-exception
            java.lang.String r1 = "Exception while loading map config"
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ IOException -> 0x01cc, Exception -> 0x01c6, all -> 0x0240 }
            r0.<init>(r1, r2)     // Catch:{ IOException -> 0x01cc, Exception -> 0x01c6, all -> 0x0240 }
            throw r0     // Catch:{ IOException -> 0x01cc, Exception -> 0x01c6, all -> 0x0240 }
        L_0x01c6:
            X.0V3 r0 = X.AnonymousClass0V3.A07     // Catch:{ all -> 0x0239 }
            r0.A02()     // Catch:{ all -> 0x0239 }
            goto L_0x01d4
        L_0x01cc:
            r2 = move-exception
            java.lang.String r1 = "MapConfig"
            java.lang.String r0 = "Unable to download config"
            android.util.Log.e(r1, r0, r2)     // Catch:{ all -> 0x0239 }
        L_0x01d4:
            if (r3 == 0) goto L_0x01d9
            r3.close()     // Catch:{ IOException -> 0x01d9 }
        L_0x01d9:
            long r3 = r6.A00
            r1 = 3
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x022c
            r0 = 1000(0x3e8, double:4.94E-321)
            long r3 = r3 * r0
            java.lang.String r5 = "MapConfigUpdateDispatchable"
            int r1 = X.AnonymousClass0X2.A00
            int r0 = r1 + -1
            X.AnonymousClass0X2.A00 = r0
            long r1 = (long) r1
            r0 = 32
            long r1 = r1 << r0
            r6.A00 = r1
            r6.A02 = r5
            long r0 = android.os.SystemClock.uptimeMillis()
            long r0 = r0 + r3
            r6.A01 = r0
            X.0OG r0 = X.AnonymousClass0X2.A00()
            java.util.concurrent.BlockingQueue r0 = r0.A00
            r0.add(r6)
            return
        L_0x0205:
            X.0P6 r0 = X.C007803p.A0C
            java.lang.String[] r10 = r0.A05
            X.0P6 r0 = X.C007803p.A0C
            X.0Pm[][] r5 = r0.A06
        L_0x020d:
            X.0P6 r23 = new X.0P6
            r26 = r19
            r27 = r10
            r28 = r5
            r29 = r16
            r23.<init>(r24, r25, r26, r27, r28, r29)
            X.C007803p.A0C = r23
            long r0 = android.os.SystemClock.uptimeMillis()
            X.C007803p.A00 = r0
            X.0Ic r1 = new X.0Ic
            r1.<init>()
            android.os.Handler r0 = X.AnonymousClass0X2.A02
            r0.post(r1)
        L_0x022c:
            r0 = 0
            r6.A00 = r0
            r0 = 0
            X.C007803p.A06 = r0
            java.util.concurrent.Semaphore r0 = X.C007803p.A0B
            r0.release()
            return
        L_0x0239:
            r0 = move-exception
            if (r3 == 0) goto L_0x0241
            r3.close()     // Catch:{ IOException -> 0x0241 }
            throw r0
        L_0x0240:
            r0 = move-exception
        L_0x0241:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03420Il.run():void");
    }
}
