package X;

/* renamed from: X.1Lj  reason: invalid class name and case insensitive filesystem */
public class C25851Lj extends C25861Lk {
    public C25851Lj(C17130ua r1, C16440t3 r2, AnonymousClass013 r3, C24361Fp r4, C16490t9 r5, C25841Li r6, C18520wp r7, C17660vR r8, C16320sq r9) {
        super(r1, r2, r3, r4, r5, r6, r7, r8, r9);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0237, code lost:
        if (r18 != null) goto L_0x0239;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0242, code lost:
        if (r19 != null) goto L_0x0244;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0244, code lost:
        r21 = r19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00ac, code lost:
        if (r0 == false) goto L_0x00ae;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:166:0x0385 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ X.AnonymousClass01Q A00(X.C75683sY r22, X.C25851Lj r23, java.lang.String r24) {
        /*
            r4 = r23
            X.0t3 r1 = r4.A03
            long r14 = r1.A00()
            r0 = 10
            r2 = 0
            r3 = r22
            android.net.TrafficStats.setThreadStatsTag(r0)     // Catch:{ SocketTimeoutException -> 0x0392, IOException | IllegalStateException -> 0x0386 }
            r0 = r24
            javax.net.ssl.HttpsURLConnection r8 = r4.A02(r0)     // Catch:{ SocketTimeoutException -> 0x0392, IOException | IllegalStateException -> 0x0386 }
            long r5 = r1.A00()     // Catch:{ SocketTimeoutException -> 0x0392, IOException | IllegalStateException -> 0x0386 }
            long r5 = r5 - r14
            java.lang.Long r0 = java.lang.Long.valueOf(r5)     // Catch:{ SocketTimeoutException -> 0x0392, IOException | IllegalStateException -> 0x0386 }
            r3.A03 = r0     // Catch:{ SocketTimeoutException -> 0x0392, IOException | IllegalStateException -> 0x0386 }
            long r16 = r1.A00()     // Catch:{ SocketTimeoutException -> 0x0392, IOException | IllegalStateException -> 0x0386 }
            int r7 = r8.getResponseCode()     // Catch:{ SocketTimeoutException -> 0x0392, IOException | IllegalStateException -> 0x0386 }
            long r5 = r1.A00()     // Catch:{ SocketTimeoutException -> 0x0392, IOException | IllegalStateException -> 0x0386 }
            long r5 = r5 - r16
            java.lang.Long r0 = java.lang.Long.valueOf(r5)     // Catch:{ SocketTimeoutException -> 0x0392, IOException | IllegalStateException -> 0x0386 }
            r3.A02 = r0     // Catch:{ SocketTimeoutException -> 0x0392, IOException | IllegalStateException -> 0x0386 }
            long r5 = (long) r7     // Catch:{ SocketTimeoutException -> 0x0392, IOException | IllegalStateException -> 0x0386 }
            java.lang.Long r0 = java.lang.Long.valueOf(r5)     // Catch:{ SocketTimeoutException -> 0x0392, IOException | IllegalStateException -> 0x0386 }
            r3.A04 = r0     // Catch:{ SocketTimeoutException -> 0x0392, IOException | IllegalStateException -> 0x0386 }
            r0 = 200(0xc8, float:2.8E-43)
            if (r7 == r0) goto L_0x0056
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ SocketTimeoutException -> 0x0392, IOException | IllegalStateException -> 0x0386 }
            r5.<init>()     // Catch:{ SocketTimeoutException -> 0x0392, IOException | IllegalStateException -> 0x0386 }
            java.lang.String r0 = "gif/search/giphy/request failed "
            r5.append(r0)     // Catch:{ SocketTimeoutException -> 0x0392, IOException | IllegalStateException -> 0x0386 }
            r5.append(r7)     // Catch:{ SocketTimeoutException -> 0x0392, IOException | IllegalStateException -> 0x0386 }
            java.lang.String r0 = r5.toString()     // Catch:{ SocketTimeoutException -> 0x0392, IOException | IllegalStateException -> 0x0386 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ SocketTimeoutException -> 0x0392, IOException | IllegalStateException -> 0x0386 }
            goto L_0x036a
        L_0x0056:
            r1.A00()     // Catch:{ SocketTimeoutException -> 0x0392, IOException | IllegalStateException -> 0x0386 }
            X.0ua r7 = r4.A02     // Catch:{ SocketTimeoutException -> 0x0392, IOException | IllegalStateException -> 0x0386 }
            r0 = 0
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)     // Catch:{ SocketTimeoutException -> 0x0392, IOException | IllegalStateException -> 0x0386 }
            java.io.InputStream r0 = r8.getInputStream()     // Catch:{ SocketTimeoutException -> 0x0392, IOException | IllegalStateException -> 0x0386 }
            X.1qW r5 = new X.1qW     // Catch:{ SocketTimeoutException -> 0x0392, IOException | IllegalStateException -> 0x0386 }
            r5.<init>(r7, r0, r2, r6)     // Catch:{ SocketTimeoutException -> 0x0392, IOException | IllegalStateException -> 0x0386 }
            java.io.InputStreamReader r0 = new java.io.InputStreamReader     // Catch:{ SocketTimeoutException -> 0x0392, IOException | IllegalStateException -> 0x0386 }
            r0.<init>(r5)     // Catch:{ SocketTimeoutException -> 0x0392, IOException | IllegalStateException -> 0x0386 }
            android.util.JsonReader r5 = new android.util.JsonReader     // Catch:{ SocketTimeoutException -> 0x0392, IOException | IllegalStateException -> 0x0386 }
            r5.<init>(r0)     // Catch:{ SocketTimeoutException -> 0x0392, IOException | IllegalStateException -> 0x0386 }
            r5.beginObject()     // Catch:{ all -> 0x0381 }
            r8 = r2
            r7 = r2
        L_0x0078:
            boolean r0 = r5.hasNext()     // Catch:{ all -> 0x0381 }
            if (r0 == 0) goto L_0x02f2
            java.lang.String r9 = r5.nextName()     // Catch:{ all -> 0x0381 }
            int r6 = r9.hashCode()     // Catch:{ all -> 0x0381 }
            r0 = 3076010(0x2eefaa, float:4.310408E-39)
            if (r6 == r0) goto L_0x00a5
            r0 = 3347973(0x331605, float:4.69151E-39)
            if (r6 == r0) goto L_0x009d
            r0 = 1297692570(0x4d59379a, float:2.27768736E8)
            if (r6 != r0) goto L_0x00ae
            java.lang.String r0 = "pagination"
            boolean r0 = r9.equals(r0)     // Catch:{ all -> 0x0381 }
            r6 = 1
            goto L_0x00ac
        L_0x009d:
            java.lang.String r0 = "meta"
            boolean r0 = r9.equals(r0)     // Catch:{ all -> 0x0381 }
            r6 = 0
            goto L_0x00ac
        L_0x00a5:
            java.lang.String r0 = "data"
            boolean r0 = r9.equals(r0)     // Catch:{ all -> 0x0381 }
            r6 = 2
        L_0x00ac:
            if (r0 != 0) goto L_0x00af
        L_0x00ae:
            r6 = -1
        L_0x00af:
            if (r6 == 0) goto L_0x02b6
            r0 = 1
            if (r6 == r0) goto L_0x0260
            r0 = 2
            if (r6 == r0) goto L_0x00cf
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0381 }
            r6.<init>()     // Catch:{ all -> 0x0381 }
            java.lang.String r0 = "gif/search/giphy/unexpected key - "
            r6.append(r0)     // Catch:{ all -> 0x0381 }
            r6.append(r9)     // Catch:{ all -> 0x0381 }
            java.lang.String r0 = r6.toString()     // Catch:{ all -> 0x0381 }
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x0381 }
            r5.skipValue()     // Catch:{ all -> 0x0381 }
            goto L_0x0078
        L_0x00cf:
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ all -> 0x0381 }
            r7.<init>()     // Catch:{ all -> 0x0381 }
            r5.beginArray()     // Catch:{ all -> 0x0381 }
        L_0x00d7:
            boolean r0 = r5.hasNext()     // Catch:{ all -> 0x0381 }
            if (r0 == 0) goto L_0x025b
            r5.beginObject()     // Catch:{ all -> 0x0381 }
            r10 = 0
            r23 = r10
            r21 = r10
            r20 = r10
            r19 = r10
            r18 = r10
            r9 = r10
        L_0x00ec:
            boolean r0 = r5.hasNext()     // Catch:{ all -> 0x0381 }
            if (r0 == 0) goto L_0x0223
            java.lang.String r6 = r5.nextName()     // Catch:{ all -> 0x0381 }
            java.lang.String r0 = "images"
            boolean r0 = r6.equals(r0)     // Catch:{ all -> 0x0381 }
            if (r0 != 0) goto L_0x010f
            java.lang.String r0 = "id"
            boolean r0 = r6.equals(r0)     // Catch:{ all -> 0x0381 }
            if (r0 != 0) goto L_0x010a
            r5.skipValue()     // Catch:{ all -> 0x0381 }
            goto L_0x00ec
        L_0x010a:
            java.lang.String r23 = r5.nextString()     // Catch:{ all -> 0x0381 }
            goto L_0x00ec
        L_0x010f:
            r5.beginObject()     // Catch:{ all -> 0x0381 }
        L_0x0112:
            boolean r0 = r5.hasNext()     // Catch:{ all -> 0x0381 }
            if (r0 == 0) goto L_0x021e
            java.lang.String r6 = r5.nextName()     // Catch:{ all -> 0x0381 }
            int r0 = r6.hashCode()     // Catch:{ all -> 0x0381 }
            switch(r0) {
                case -1762572285: goto L_0x0210;
                case -1290895667: goto L_0x01af;
                case -511616133: goto L_0x01a1;
                case 1107258473: goto L_0x0141;
                case 1723279212: goto L_0x0134;
                case 1968782756: goto L_0x0127;
                default: goto L_0x0123;
            }     // Catch:{ all -> 0x0381 }
        L_0x0123:
            r5.skipValue()     // Catch:{ all -> 0x0381 }
            goto L_0x0112
        L_0x0127:
            java.lang.String r0 = "fixed_width_still"
            boolean r0 = r6.equals(r0)     // Catch:{ all -> 0x0381 }
            if (r0 == 0) goto L_0x0123
            X.4jM r19 = A01(r5)     // Catch:{ all -> 0x0381 }
            goto L_0x0112
        L_0x0134:
            java.lang.String r0 = "fixed_width_small_still"
            boolean r0 = r6.equals(r0)     // Catch:{ all -> 0x0381 }
            if (r0 == 0) goto L_0x0123
            X.4jM r21 = A01(r5)     // Catch:{ all -> 0x0381 }
            goto L_0x0112
        L_0x0141:
            java.lang.String r0 = "downsized_small"
            boolean r0 = r6.equals(r0)     // Catch:{ all -> 0x0381 }
            if (r0 == 0) goto L_0x0123
            r5.beginObject()     // Catch:{ all -> 0x0381 }
            r9 = 0
            r13 = r9
            r12 = -1
            r11 = -1
        L_0x0150:
            boolean r0 = r5.hasNext()     // Catch:{ all -> 0x0381 }
            if (r0 == 0) goto L_0x0195
            java.lang.String r6 = r5.nextName()     // Catch:{ all -> 0x0381 }
            int r0 = r6.hashCode()     // Catch:{ all -> 0x0381 }
            switch(r0) {
                case -1221029593: goto L_0x0184;
                case 108273: goto L_0x0177;
                case 113126854: goto L_0x0165;
                default: goto L_0x0161;
            }     // Catch:{ all -> 0x0381 }
        L_0x0161:
            r5.skipValue()     // Catch:{ all -> 0x0381 }
            goto L_0x0150
        L_0x0165:
            java.lang.String r0 = "width"
            boolean r0 = r6.equals(r0)     // Catch:{ all -> 0x0381 }
            if (r0 == 0) goto L_0x0161
            java.lang.String r0 = r5.nextString()     // Catch:{ all -> 0x0381 }
            int r12 = java.lang.Integer.parseInt(r0)     // Catch:{ all -> 0x0381 }
            goto L_0x0150
        L_0x0177:
            java.lang.String r0 = "mp4"
            boolean r0 = r6.equals(r0)     // Catch:{ all -> 0x0381 }
            if (r0 == 0) goto L_0x0161
            java.lang.String r13 = r5.nextString()     // Catch:{ all -> 0x0381 }
            goto L_0x0150
        L_0x0184:
            java.lang.String r0 = "height"
            boolean r0 = r6.equals(r0)     // Catch:{ all -> 0x0381 }
            if (r0 == 0) goto L_0x0161
            java.lang.String r0 = r5.nextString()     // Catch:{ all -> 0x0381 }
            int r11 = java.lang.Integer.parseInt(r0)     // Catch:{ all -> 0x0381 }
            goto L_0x0150
        L_0x0195:
            r5.endObject()     // Catch:{ all -> 0x0381 }
            if (r13 == 0) goto L_0x0112
            X.4jM r9 = new X.4jM     // Catch:{ all -> 0x0381 }
            r9.<init>(r12, r13, r11)     // Catch:{ all -> 0x0381 }
            goto L_0x0112
        L_0x01a1:
            java.lang.String r0 = "fixed_height_still"
            boolean r0 = r6.equals(r0)     // Catch:{ all -> 0x0381 }
            if (r0 == 0) goto L_0x0123
            X.4jM r18 = A01(r5)     // Catch:{ all -> 0x0381 }
            goto L_0x0112
        L_0x01af:
            java.lang.String r0 = "preview_gif"
            boolean r0 = r6.equals(r0)     // Catch:{ all -> 0x0381 }
            if (r0 == 0) goto L_0x0123
            r5.beginObject()     // Catch:{ all -> 0x0381 }
            r10 = 0
            r13 = r10
            r12 = -1
            r11 = -1
        L_0x01be:
            boolean r0 = r5.hasNext()     // Catch:{ all -> 0x0381 }
            if (r0 == 0) goto L_0x0204
            java.lang.String r6 = r5.nextName()     // Catch:{ all -> 0x0381 }
            int r0 = r6.hashCode()     // Catch:{ all -> 0x0381 }
            switch(r0) {
                case -1221029593: goto L_0x01f3;
                case 116079: goto L_0x01e5;
                case 113126854: goto L_0x01d3;
                default: goto L_0x01cf;
            }     // Catch:{ all -> 0x0381 }
        L_0x01cf:
            r5.skipValue()     // Catch:{ all -> 0x0381 }
            goto L_0x01be
        L_0x01d3:
            java.lang.String r0 = "width"
            boolean r0 = r6.equals(r0)     // Catch:{ all -> 0x0381 }
            if (r0 == 0) goto L_0x01cf
            java.lang.String r0 = r5.nextString()     // Catch:{ all -> 0x0381 }
            int r12 = java.lang.Integer.parseInt(r0)     // Catch:{ all -> 0x0381 }
            goto L_0x01be
        L_0x01e5:
            java.lang.String r0 = "url"
            boolean r0 = r6.equals(r0)     // Catch:{ all -> 0x0381 }
            if (r0 == 0) goto L_0x01cf
            java.lang.String r13 = r5.nextString()     // Catch:{ all -> 0x0381 }
            goto L_0x01be
        L_0x01f3:
            java.lang.String r0 = "height"
            boolean r0 = r6.equals(r0)     // Catch:{ all -> 0x0381 }
            if (r0 == 0) goto L_0x01cf
            java.lang.String r0 = r5.nextString()     // Catch:{ all -> 0x0381 }
            int r11 = java.lang.Integer.parseInt(r0)     // Catch:{ all -> 0x0381 }
            goto L_0x01be
        L_0x0204:
            r5.endObject()     // Catch:{ all -> 0x0381 }
            if (r13 == 0) goto L_0x0112
            X.4jM r10 = new X.4jM     // Catch:{ all -> 0x0381 }
            r10.<init>(r12, r13, r11)     // Catch:{ all -> 0x0381 }
            goto L_0x0112
        L_0x0210:
            java.lang.String r0 = "fixed_height_small_still"
            boolean r0 = r6.equals(r0)     // Catch:{ all -> 0x0381 }
            if (r0 == 0) goto L_0x0123
            X.4jM r20 = A01(r5)     // Catch:{ all -> 0x0381 }
            goto L_0x0112
        L_0x021e:
            r5.endObject()     // Catch:{ all -> 0x0381 }
            goto L_0x00ec
        L_0x0223:
            r5.endObject()     // Catch:{ all -> 0x0381 }
            if (r23 == 0) goto L_0x00d7
            if (r10 == 0) goto L_0x00d7
            if (r9 == 0) goto L_0x00d7
            int r6 = r9.A01     // Catch:{ all -> 0x0381 }
            int r0 = r9.A00     // Catch:{ all -> 0x0381 }
            if (r6 <= r0) goto L_0x0233
            goto L_0x023e
        L_0x0233:
            if (r20 != 0) goto L_0x0247
            if (r21 != 0) goto L_0x0249
            if (r18 == 0) goto L_0x0244
        L_0x0239:
            r21 = r18
        L_0x023b:
            if (r21 == 0) goto L_0x00d7
            goto L_0x0249
        L_0x023e:
            if (r21 != 0) goto L_0x0249
            if (r20 != 0) goto L_0x0247
            if (r19 == 0) goto L_0x0239
        L_0x0244:
            r21 = r19
            goto L_0x023b
        L_0x0247:
            r21 = r20
        L_0x0249:
            r24 = 1
            X.4jN r0 = new X.4jN     // Catch:{ all -> 0x0381 }
            r19 = r0
            r20 = r10
            r22 = r9
            r19.<init>(r20, r21, r22, r23, r24)     // Catch:{ all -> 0x0381 }
            r7.add(r0)     // Catch:{ all -> 0x0381 }
            goto L_0x00d7
        L_0x025b:
            r5.endArray()     // Catch:{ all -> 0x0381 }
            goto L_0x0078
        L_0x0260:
            r5.beginObject()     // Catch:{ all -> 0x0381 }
            r9 = -1
            r10 = -1
            r6 = -1
        L_0x0266:
            boolean r0 = r5.hasNext()     // Catch:{ all -> 0x0381 }
            if (r0 == 0) goto L_0x02a3
            java.lang.String r8 = r5.nextName()     // Catch:{ all -> 0x0381 }
            int r0 = r8.hashCode()     // Catch:{ all -> 0x0381 }
            switch(r0) {
                case -1019779949: goto L_0x027b;
                case -407761836: goto L_0x0288;
                case 94851343: goto L_0x0296;
                default: goto L_0x0277;
            }     // Catch:{ all -> 0x0381 }
        L_0x0277:
            r5.skipValue()     // Catch:{ all -> 0x0381 }
            goto L_0x0266
        L_0x027b:
            java.lang.String r0 = "offset"
            boolean r0 = r8.equals(r0)     // Catch:{ all -> 0x0381 }
            if (r0 == 0) goto L_0x0277
            int r10 = r5.nextInt()     // Catch:{ all -> 0x0381 }
            goto L_0x0266
        L_0x0288:
            java.lang.String r0 = "total_count"
            boolean r0 = r8.equals(r0)     // Catch:{ all -> 0x0381 }
            if (r0 == 0) goto L_0x0277
            int r6 = r5.nextInt()     // Catch:{ all -> 0x0381 }
            goto L_0x0266
        L_0x0296:
            java.lang.String r0 = "count"
            boolean r0 = r8.equals(r0)     // Catch:{ all -> 0x0381 }
            if (r0 == 0) goto L_0x0277
            int r9 = r5.nextInt()     // Catch:{ all -> 0x0381 }
            goto L_0x0266
        L_0x02a3:
            r5.endObject()     // Catch:{ all -> 0x0381 }
            r8 = 0
            if (r9 <= 0) goto L_0x0078
            if (r10 < 0) goto L_0x0078
            if (r6 <= 0) goto L_0x0078
            int r9 = r9 + r10
            if (r6 <= r9) goto L_0x0078
            java.lang.String r8 = java.lang.Integer.toString(r9)     // Catch:{ all -> 0x0381 }
            goto L_0x0078
        L_0x02b6:
            r5.beginObject()     // Catch:{ all -> 0x0381 }
            r9 = 0
            r6 = 0
        L_0x02bb:
            boolean r0 = r5.hasNext()     // Catch:{ all -> 0x0381 }
            if (r0 == 0) goto L_0x02e4
            java.lang.String r2 = r5.nextName()     // Catch:{ all -> 0x0381 }
            java.lang.String r0 = "status"
            boolean r0 = r2.equals(r0)     // Catch:{ all -> 0x0381 }
            if (r0 != 0) goto L_0x02df
            java.lang.String r0 = "msg"
            boolean r0 = r2.equals(r0)     // Catch:{ all -> 0x0381 }
            if (r0 != 0) goto L_0x02da
            r5.skipValue()     // Catch:{ all -> 0x0381 }
            goto L_0x02bb
        L_0x02da:
            java.lang.String r6 = r5.nextString()     // Catch:{ all -> 0x0381 }
            goto L_0x02bb
        L_0x02df:
            int r9 = r5.nextInt()     // Catch:{ all -> 0x0381 }
            goto L_0x02bb
        L_0x02e4:
            r5.endObject()     // Catch:{ all -> 0x0381 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x0381 }
            X.01Q r2 = new X.01Q     // Catch:{ all -> 0x0381 }
            r2.<init>(r0, r6)     // Catch:{ all -> 0x0381 }
            goto L_0x0078
        L_0x02f2:
            r5.endObject()     // Catch:{ all -> 0x0381 }
            r5.close()     // Catch:{ SocketTimeoutException -> 0x0392, IOException | IllegalStateException -> 0x0386 }
            long r5 = r1.A00()     // Catch:{ SocketTimeoutException -> 0x0392, IOException | IllegalStateException -> 0x0386 }
            long r5 = r5 - r16
            java.lang.Long r0 = java.lang.Long.valueOf(r5)     // Catch:{ SocketTimeoutException -> 0x0392, IOException | IllegalStateException -> 0x0386 }
            r3.A06 = r0     // Catch:{ SocketTimeoutException -> 0x0392, IOException | IllegalStateException -> 0x0386 }
            if (r2 == 0) goto L_0x034e
            java.lang.Object r6 = r2.A00     // Catch:{ SocketTimeoutException -> 0x0392, IOException | IllegalStateException -> 0x0386 }
            r0 = r6
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ SocketTimeoutException -> 0x0392, IOException | IllegalStateException -> 0x0386 }
            int r5 = r0.intValue()     // Catch:{ SocketTimeoutException -> 0x0392, IOException | IllegalStateException -> 0x0386 }
            r0 = 200(0xc8, float:2.8E-43)
            if (r0 == r5) goto L_0x034e
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ SocketTimeoutException -> 0x0392, IOException | IllegalStateException -> 0x0386 }
            r5.<init>()     // Catch:{ SocketTimeoutException -> 0x0392, IOException | IllegalStateException -> 0x0386 }
            r5.append(r6)     // Catch:{ SocketTimeoutException -> 0x0392, IOException | IllegalStateException -> 0x0386 }
            java.lang.String r0 = "("
            r5.append(r0)     // Catch:{ SocketTimeoutException -> 0x0392, IOException | IllegalStateException -> 0x0386 }
            java.lang.Object r0 = r2.A01     // Catch:{ SocketTimeoutException -> 0x0392, IOException | IllegalStateException -> 0x0386 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ SocketTimeoutException -> 0x0392, IOException | IllegalStateException -> 0x0386 }
            r5.append(r0)     // Catch:{ SocketTimeoutException -> 0x0392, IOException | IllegalStateException -> 0x0386 }
            java.lang.String r0 = ")"
            r5.append(r0)     // Catch:{ SocketTimeoutException -> 0x0392, IOException | IllegalStateException -> 0x0386 }
            java.lang.String r5 = r5.toString()     // Catch:{ SocketTimeoutException -> 0x0392, IOException | IllegalStateException -> 0x0386 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ SocketTimeoutException -> 0x0392, IOException | IllegalStateException -> 0x0386 }
            r2.<init>()     // Catch:{ SocketTimeoutException -> 0x0392, IOException | IllegalStateException -> 0x0386 }
            java.lang.String r0 = "gif/search/giphy/got error: "
            r2.append(r0)     // Catch:{ SocketTimeoutException -> 0x0392, IOException | IllegalStateException -> 0x0386 }
            r2.append(r5)     // Catch:{ SocketTimeoutException -> 0x0392, IOException | IllegalStateException -> 0x0386 }
            java.lang.String r0 = r2.toString()     // Catch:{ SocketTimeoutException -> 0x0392, IOException | IllegalStateException -> 0x0386 }
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ SocketTimeoutException -> 0x0392, IOException | IllegalStateException -> 0x0386 }
            r0 = 5
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ SocketTimeoutException -> 0x0392, IOException | IllegalStateException -> 0x0386 }
            r3.A01 = r0     // Catch:{ SocketTimeoutException -> 0x0392, IOException | IllegalStateException -> 0x0386 }
            r3.A07 = r5     // Catch:{ SocketTimeoutException -> 0x0392, IOException | IllegalStateException -> 0x0386 }
            goto L_0x039d
        L_0x034e:
            if (r7 != 0) goto L_0x035e
            r0 = 0
            X.01Q r2 = new X.01Q     // Catch:{ SocketTimeoutException -> 0x0392, IOException | IllegalStateException -> 0x0386 }
            r2.<init>(r0, r0)     // Catch:{ SocketTimeoutException -> 0x0392, IOException | IllegalStateException -> 0x0386 }
            r0 = 2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ SocketTimeoutException -> 0x0392, IOException | IllegalStateException -> 0x0386 }
            r3.A01 = r0     // Catch:{ SocketTimeoutException -> 0x0392, IOException | IllegalStateException -> 0x0386 }
            goto L_0x036a
        L_0x035e:
            X.01Q r2 = new X.01Q     // Catch:{ SocketTimeoutException -> 0x0392, IOException | IllegalStateException -> 0x0386 }
            r2.<init>(r8, r7)     // Catch:{ SocketTimeoutException -> 0x0392, IOException | IllegalStateException -> 0x0386 }
            r0 = 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ SocketTimeoutException -> 0x0392, IOException | IllegalStateException -> 0x0386 }
            r3.A01 = r0     // Catch:{ SocketTimeoutException -> 0x0392, IOException | IllegalStateException -> 0x0386 }
        L_0x036a:
            r1.A00()
            long r0 = r1.A00()
            long r0 = r0 - r14
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r3.A05 = r0
            X.0t9 r0 = r4.A06
            r0.A06(r3)
            android.net.TrafficStats.clearThreadStatsTag()
            return r2
        L_0x0381:
            r0 = move-exception
            r5.close()     // Catch:{ all -> 0x0385 }
        L_0x0385:
            throw r0     // Catch:{ SocketTimeoutException -> 0x0392, IOException | IllegalStateException -> 0x0386 }
        L_0x0386:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)     // Catch:{ all -> 0x03b5 }
            r0 = 2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x03b5 }
            r3.A01 = r0     // Catch:{ all -> 0x03b5 }
            goto L_0x039d
        L_0x0392:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)     // Catch:{ all -> 0x03b5 }
            r0 = 3
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x03b5 }
            r3.A01 = r0     // Catch:{ all -> 0x03b5 }
        L_0x039d:
            r1.A00()
            long r0 = r1.A00()
            long r0 = r0 - r14
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r3.A05 = r0
            X.0t9 r0 = r4.A06
            r0.A06(r3)
            android.net.TrafficStats.clearThreadStatsTag()
            r2 = 0
            return r2
        L_0x03b5:
            r2 = move-exception
            r1.A00()
            long r0 = r1.A00()
            long r0 = r0 - r14
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r3.A05 = r0
            X.0t9 r0 = r4.A06
            r0.A06(r3)
            android.net.TrafficStats.clearThreadStatsTag()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25851Lj.A00(X.3sY, X.1Lj, java.lang.String):X.01Q");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C93534jM A01(android.util.JsonReader r6) {
        /*
            r6.beginObject()
            r5 = 0
            r4 = r5
            r3 = -1
            r2 = -1
        L_0x0007:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x004d
            java.lang.String r1 = r6.nextName()
            int r0 = r1.hashCode()
            switch(r0) {
                case -1221029593: goto L_0x003c;
                case 116079: goto L_0x002e;
                case 113126854: goto L_0x001c;
                default: goto L_0x0018;
            }
        L_0x0018:
            r6.skipValue()
            goto L_0x0007
        L_0x001c:
            java.lang.String r0 = "width"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0018
            java.lang.String r0 = r6.nextString()
            int r3 = java.lang.Integer.parseInt(r0)
            goto L_0x0007
        L_0x002e:
            java.lang.String r0 = "url"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0018
            java.lang.String r4 = r6.nextString()
            goto L_0x0007
        L_0x003c:
            java.lang.String r0 = "height"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0018
            java.lang.String r0 = r6.nextString()
            int r2 = java.lang.Integer.parseInt(r0)
            goto L_0x0007
        L_0x004d:
            r6.endObject()
            if (r4 == 0) goto L_0x0057
            X.4jM r5 = new X.4jM
            r5.<init>(r3, r4, r2)
        L_0x0057:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25851Lj.A01(android.util.JsonReader):X.4jM");
    }
}
