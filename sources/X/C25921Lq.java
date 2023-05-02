package X;

/* renamed from: X.1Lq  reason: invalid class name and case insensitive filesystem */
public class C25921Lq extends C25861Lk {
    public C25921Lq(C17130ua r1, C16440t3 r2, AnonymousClass013 r3, C24361Fp r4, C16490t9 r5, C25841Li r6, C18520wp r7, C17660vR r8, C16320sq r9) {
        super(r1, r2, r3, r4, r5, r6, r7, r8, r9);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.AnonymousClass01Q A00(android.util.JsonReader r9) {
        /*
            r7 = 2
            int[] r5 = new int[r7]
            r9.beginObject()
            r2 = 0
            r1 = r2
            r4 = r2
        L_0x0009:
            boolean r0 = r9.hasNext()
            r8 = 1
            r6 = 0
            if (r0 == 0) goto L_0x005f
            java.lang.String r3 = r9.nextName()
            int r0 = r3.hashCode()
            switch(r0) {
                case -318184504: goto L_0x0052;
                case 116079: goto L_0x0044;
                case 3083499: goto L_0x0020;
                default: goto L_0x001c;
            }
        L_0x001c:
            r9.skipValue()
            goto L_0x0009
        L_0x0020:
            java.lang.String r0 = "dims"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x001c
            r9.beginArray()
        L_0x002b:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x0040
            if (r6 >= r7) goto L_0x003c
            int r0 = r9.nextInt()
            r5[r6] = r0
            int r6 = r6 + 1
            goto L_0x002b
        L_0x003c:
            r9.skipValue()
            goto L_0x002b
        L_0x0040:
            r9.endArray()
            goto L_0x0009
        L_0x0044:
            java.lang.String r0 = "url"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x001c
            java.lang.String r1 = r9.nextString()
            goto L_0x0009
        L_0x0052:
            java.lang.String r0 = "preview"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x001c
            java.lang.String r4 = r9.nextString()
            goto L_0x0009
        L_0x005f:
            r9.endObject()
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x0082
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L_0x0082
            r3 = r5[r6]
            r0 = r5[r8]
            X.4jM r2 = new X.4jM
            r2.<init>(r3, r1, r0)
            X.4jM r1 = new X.4jM
            r1.<init>(r3, r4, r0)
            X.01Q r0 = new X.01Q
            r0.<init>(r2, r1)
            return r0
        L_0x0082:
            X.01Q r0 = new X.01Q
            r0.<init>(r2, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25921Lq.A00(android.util.JsonReader):X.01Q");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00cf, code lost:
        if (r2 == false) goto L_0x00d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00d1, code lost:
        r7 = 65535;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00d2, code lost:
        if (r7 == 0) goto L_0x01ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00d5, code lost:
        if (r7 == 1) goto L_0x01a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00d8, code lost:
        if (r7 == 2) goto L_0x01a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00db, code lost:
        if (r7 == 3) goto L_0x00f8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00de, code lost:
        if (r7 == 4) goto L_0x00f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00e0, code lost:
        r7 = new java.lang.StringBuilder();
        r7.append("gif/search/tenor/unexpected key - ");
        r7.append(r8);
        com.whatsapp.util.Log.w(r7.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00f4, code lost:
        r11.skipValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00f8, code lost:
        r6 = new java.util.ArrayList();
        r11.beginArray();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0104, code lost:
        if (r11.hasNext() == false) goto L_0x019d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0106, code lost:
        r11.beginObject();
        r22 = null;
        r12 = null;
        r8 = null;
        r7 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0113, code lost:
        if (r11.hasNext() == false) goto L_0x017e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0115, code lost:
        r13 = r11.nextName();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x011f, code lost:
        if (r13.equals("id") != false) goto L_0x0179;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0127, code lost:
        if (r13.equals("media") != false) goto L_0x012d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0129, code lost:
        r11.skipValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x012d, code lost:
        r11.beginArray();
        r11.beginObject();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0137, code lost:
        if (r11.hasNext() == false) goto L_0x0168;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0139, code lost:
        r13 = r11.nextName();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0144, code lost:
        if (r13.equals("tinymp4") != false) goto L_0x015f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x014c, code lost:
        if (r13.equals("previewgif") != false) goto L_0x0152;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x014e, code lost:
        r11.skipValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0152, code lost:
        r2 = A00(r11);
        r12 = (X.C93534jM) r2.A00;
        r8 = (X.C93534jM) r2.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x015f, code lost:
        r7 = (X.C93534jM) A00(r11).A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0168, code lost:
        r11.endObject();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x016f, code lost:
        if (r11.hasNext() == false) goto L_0x0175;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0171, code lost:
        r11.skipValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0175, code lost:
        r11.endArray();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0179, code lost:
        r22 = r11.nextString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x017e, code lost:
        r11.endObject();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0181, code lost:
        if (r22 == null) goto L_0x0100;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0183, code lost:
        if (r12 == null) goto L_0x0100;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0185, code lost:
        if (r8 == null) goto L_0x0100;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0187, code lost:
        if (r7 == null) goto L_0x0100;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0189, code lost:
        r6.add(new X.C93544jN(r12, r8, r7, r22, 2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x019d, code lost:
        r11.endArray();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x01a2, code lost:
        r9 = r11.nextString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01a8, code lost:
        r0 = r11.nextLong();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01ae, code lost:
        r10 = r11.nextString();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:88:0x023f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ X.AnonymousClass01Q A01(X.C75683sY r21, X.C25921Lq r22, java.lang.String r23) {
        /*
            r4 = r22
            X.0t3 r5 = r4.A03
            long r14 = r5.A00()
            r0 = 10
            r6 = 0
            r3 = r21
            android.net.TrafficStats.setThreadStatsTag(r0)     // Catch:{ SocketTimeoutException -> 0x024e, IOException | IllegalStateException -> 0x0240 }
            r0 = r23
            javax.net.ssl.HttpsURLConnection r9 = r4.A02(r0)     // Catch:{ SocketTimeoutException -> 0x024e, IOException | IllegalStateException -> 0x0240 }
            long r0 = r5.A00()     // Catch:{ SocketTimeoutException -> 0x024e, IOException | IllegalStateException -> 0x0240 }
            long r0 = r0 - r14
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ SocketTimeoutException -> 0x024e, IOException | IllegalStateException -> 0x0240 }
            r3.A03 = r0     // Catch:{ SocketTimeoutException -> 0x024e, IOException | IllegalStateException -> 0x0240 }
            long r7 = r5.A00()     // Catch:{ SocketTimeoutException -> 0x024e, IOException | IllegalStateException -> 0x0240 }
            int r2 = r9.getResponseCode()     // Catch:{ SocketTimeoutException -> 0x024e, IOException | IllegalStateException -> 0x0240 }
            long r0 = r5.A00()     // Catch:{ SocketTimeoutException -> 0x024e, IOException | IllegalStateException -> 0x0240 }
            long r0 = r0 - r7
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ SocketTimeoutException -> 0x024e, IOException | IllegalStateException -> 0x0240 }
            r3.A02 = r0     // Catch:{ SocketTimeoutException -> 0x024e, IOException | IllegalStateException -> 0x0240 }
            long r0 = (long) r2     // Catch:{ SocketTimeoutException -> 0x024e, IOException | IllegalStateException -> 0x0240 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ SocketTimeoutException -> 0x024e, IOException | IllegalStateException -> 0x0240 }
            r3.A04 = r0     // Catch:{ SocketTimeoutException -> 0x024e, IOException | IllegalStateException -> 0x0240 }
            r0 = 200(0xc8, float:2.8E-43)
            if (r2 == r0) goto L_0x006a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ SocketTimeoutException -> 0x024e, IOException | IllegalStateException -> 0x0240 }
            r1.<init>()     // Catch:{ SocketTimeoutException -> 0x024e, IOException | IllegalStateException -> 0x0240 }
            java.lang.String r0 = "gif/search/tenor/request failed "
            r1.append(r0)     // Catch:{ SocketTimeoutException -> 0x024e, IOException | IllegalStateException -> 0x0240 }
            r1.append(r2)     // Catch:{ SocketTimeoutException -> 0x024e, IOException | IllegalStateException -> 0x0240 }
            java.lang.String r0 = r1.toString()     // Catch:{ SocketTimeoutException -> 0x024e, IOException | IllegalStateException -> 0x0240 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ SocketTimeoutException -> 0x024e, IOException | IllegalStateException -> 0x0240 }
            r5.A00()
            long r0 = r5.A00()
            long r0 = r0 - r14
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r3.A05 = r0
            X.0t9 r0 = r4.A06
            r0.A06(r3)
            android.net.TrafficStats.clearThreadStatsTag()
            return r6
        L_0x006a:
            r5.A00()     // Catch:{ SocketTimeoutException -> 0x024e, IOException | IllegalStateException -> 0x0240 }
            long r16 = r5.A00()     // Catch:{ SocketTimeoutException -> 0x024e, IOException | IllegalStateException -> 0x0240 }
            X.0ua r7 = r4.A02     // Catch:{ SocketTimeoutException -> 0x024e, IOException | IllegalStateException -> 0x0240 }
            r0 = 0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)     // Catch:{ SocketTimeoutException -> 0x024e, IOException | IllegalStateException -> 0x0240 }
            java.io.InputStream r0 = r9.getInputStream()     // Catch:{ SocketTimeoutException -> 0x024e, IOException | IllegalStateException -> 0x0240 }
            X.1qW r1 = new X.1qW     // Catch:{ SocketTimeoutException -> 0x024e, IOException | IllegalStateException -> 0x0240 }
            r1.<init>(r7, r0, r6, r2)     // Catch:{ SocketTimeoutException -> 0x024e, IOException | IllegalStateException -> 0x0240 }
            java.io.InputStreamReader r0 = new java.io.InputStreamReader     // Catch:{ SocketTimeoutException -> 0x024e, IOException | IllegalStateException -> 0x0240 }
            r0.<init>(r1)     // Catch:{ SocketTimeoutException -> 0x024e, IOException | IllegalStateException -> 0x0240 }
            android.util.JsonReader r11 = new android.util.JsonReader     // Catch:{ SocketTimeoutException -> 0x024e, IOException | IllegalStateException -> 0x0240 }
            r11.<init>(r0)     // Catch:{ SocketTimeoutException -> 0x024e, IOException | IllegalStateException -> 0x0240 }
            r11.beginObject()     // Catch:{ all -> 0x023b }
            r10 = r6
            r9 = r6
            r0 = -1
        L_0x0092:
            boolean r2 = r11.hasNext()     // Catch:{ all -> 0x023b }
            if (r2 == 0) goto L_0x01b4
            if (r10 != 0) goto L_0x01b4
            java.lang.String r8 = r11.nextName()     // Catch:{ all -> 0x023b }
            int r2 = r8.hashCode()     // Catch:{ all -> 0x023b }
            switch(r2) {
                case -791787109: goto L_0x00a6;
                case 3059181: goto L_0x00af;
                case 3377907: goto L_0x00b7;
                case 96784904: goto L_0x00bf;
                case 1097546742: goto L_0x00c7;
                default: goto L_0x00a5;
            }     // Catch:{ all -> 0x023b }
        L_0x00a5:
            goto L_0x00d1
        L_0x00a6:
            java.lang.String r2 = "weburl"
            boolean r2 = r8.equals(r2)     // Catch:{ all -> 0x023b }
            r7 = 4
            goto L_0x00cf
        L_0x00af:
            java.lang.String r2 = "code"
            boolean r2 = r8.equals(r2)     // Catch:{ all -> 0x023b }
            r7 = 1
            goto L_0x00cf
        L_0x00b7:
            java.lang.String r2 = "next"
            boolean r2 = r8.equals(r2)     // Catch:{ all -> 0x023b }
            r7 = 2
            goto L_0x00cf
        L_0x00bf:
            java.lang.String r2 = "error"
            boolean r2 = r8.equals(r2)     // Catch:{ all -> 0x023b }
            r7 = 0
            goto L_0x00cf
        L_0x00c7:
            java.lang.String r2 = "results"
            boolean r2 = r8.equals(r2)     // Catch:{ all -> 0x023b }
            r7 = 3
        L_0x00cf:
            if (r2 != 0) goto L_0x00d2
        L_0x00d1:
            r7 = -1
        L_0x00d2:
            if (r7 == 0) goto L_0x01ae
            r2 = 1
            if (r7 == r2) goto L_0x01a8
            r2 = 2
            if (r7 == r2) goto L_0x01a2
            r2 = 3
            if (r7 == r2) goto L_0x00f8
            r2 = 4
            if (r7 == r2) goto L_0x00f4
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x023b }
            r7.<init>()     // Catch:{ all -> 0x023b }
            java.lang.String r2 = "gif/search/tenor/unexpected key - "
            r7.append(r2)     // Catch:{ all -> 0x023b }
            r7.append(r8)     // Catch:{ all -> 0x023b }
            java.lang.String r2 = r7.toString()     // Catch:{ all -> 0x023b }
            com.whatsapp.util.Log.w((java.lang.String) r2)     // Catch:{ all -> 0x023b }
        L_0x00f4:
            r11.skipValue()     // Catch:{ all -> 0x023b }
            goto L_0x0092
        L_0x00f8:
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ all -> 0x023b }
            r6.<init>()     // Catch:{ all -> 0x023b }
            r11.beginArray()     // Catch:{ all -> 0x023b }
        L_0x0100:
            boolean r2 = r11.hasNext()     // Catch:{ all -> 0x023b }
            if (r2 == 0) goto L_0x019d
            r11.beginObject()     // Catch:{ all -> 0x023b }
            r22 = 0
            r12 = r22
            r8 = r12
            r7 = r12
        L_0x010f:
            boolean r2 = r11.hasNext()     // Catch:{ all -> 0x023b }
            if (r2 == 0) goto L_0x017e
            java.lang.String r13 = r11.nextName()     // Catch:{ all -> 0x023b }
            java.lang.String r2 = "id"
            boolean r2 = r13.equals(r2)     // Catch:{ all -> 0x023b }
            if (r2 != 0) goto L_0x0179
            java.lang.String r2 = "media"
            boolean r2 = r13.equals(r2)     // Catch:{ all -> 0x023b }
            if (r2 != 0) goto L_0x012d
            r11.skipValue()     // Catch:{ all -> 0x023b }
            goto L_0x010f
        L_0x012d:
            r11.beginArray()     // Catch:{ all -> 0x023b }
            r11.beginObject()     // Catch:{ all -> 0x023b }
        L_0x0133:
            boolean r2 = r11.hasNext()     // Catch:{ all -> 0x023b }
            if (r2 == 0) goto L_0x0168
            java.lang.String r13 = r11.nextName()     // Catch:{ all -> 0x023b }
            java.lang.String r2 = "tinymp4"
            boolean r2 = r13.equals(r2)     // Catch:{ all -> 0x023b }
            if (r2 != 0) goto L_0x015f
            java.lang.String r2 = "previewgif"
            boolean r2 = r13.equals(r2)     // Catch:{ all -> 0x023b }
            if (r2 != 0) goto L_0x0152
            r11.skipValue()     // Catch:{ all -> 0x023b }
            goto L_0x0133
        L_0x0152:
            X.01Q r2 = A00(r11)     // Catch:{ all -> 0x023b }
            java.lang.Object r12 = r2.A00     // Catch:{ all -> 0x023b }
            X.4jM r12 = (X.C93534jM) r12     // Catch:{ all -> 0x023b }
            java.lang.Object r8 = r2.A01     // Catch:{ all -> 0x023b }
            X.4jM r8 = (X.C93534jM) r8     // Catch:{ all -> 0x023b }
            goto L_0x0133
        L_0x015f:
            X.01Q r2 = A00(r11)     // Catch:{ all -> 0x023b }
            java.lang.Object r7 = r2.A00     // Catch:{ all -> 0x023b }
            X.4jM r7 = (X.C93534jM) r7     // Catch:{ all -> 0x023b }
            goto L_0x0133
        L_0x0168:
            r11.endObject()     // Catch:{ all -> 0x023b }
        L_0x016b:
            boolean r2 = r11.hasNext()     // Catch:{ all -> 0x023b }
            if (r2 == 0) goto L_0x0175
            r11.skipValue()     // Catch:{ all -> 0x023b }
            goto L_0x016b
        L_0x0175:
            r11.endArray()     // Catch:{ all -> 0x023b }
            goto L_0x010f
        L_0x0179:
            java.lang.String r22 = r11.nextString()     // Catch:{ all -> 0x023b }
            goto L_0x010f
        L_0x017e:
            r11.endObject()     // Catch:{ all -> 0x023b }
            if (r22 == 0) goto L_0x0100
            if (r12 == 0) goto L_0x0100
            if (r8 == 0) goto L_0x0100
            if (r7 == 0) goto L_0x0100
            r23 = 2
            X.4jN r2 = new X.4jN     // Catch:{ all -> 0x023b }
            r20 = r8
            r21 = r7
            r18 = r2
            r19 = r12
            r18.<init>(r19, r20, r21, r22, r23)     // Catch:{ all -> 0x023b }
            r6.add(r2)     // Catch:{ all -> 0x023b }
            goto L_0x0100
        L_0x019d:
            r11.endArray()     // Catch:{ all -> 0x023b }
            goto L_0x0092
        L_0x01a2:
            java.lang.String r9 = r11.nextString()     // Catch:{ all -> 0x023b }
            goto L_0x0092
        L_0x01a8:
            long r0 = r11.nextLong()     // Catch:{ all -> 0x023b }
            goto L_0x0092
        L_0x01ae:
            java.lang.String r10 = r11.nextString()     // Catch:{ all -> 0x023b }
            goto L_0x0092
        L_0x01b4:
            r11.endObject()     // Catch:{ all -> 0x023b }
            r11.close()     // Catch:{ SocketTimeoutException -> 0x024e, IOException | IllegalStateException -> 0x0240 }
            long r7 = r5.A00()     // Catch:{ SocketTimeoutException -> 0x024e, IOException | IllegalStateException -> 0x0240 }
            long r7 = r7 - r16
            java.lang.Long r2 = java.lang.Long.valueOf(r7)     // Catch:{ SocketTimeoutException -> 0x024e, IOException | IllegalStateException -> 0x0240 }
            r3.A06 = r2     // Catch:{ SocketTimeoutException -> 0x024e, IOException | IllegalStateException -> 0x0240 }
            if (r10 == 0) goto L_0x01ff
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ SocketTimeoutException -> 0x024e, IOException | IllegalStateException -> 0x0240 }
            r2.<init>()     // Catch:{ SocketTimeoutException -> 0x024e, IOException | IllegalStateException -> 0x0240 }
            r2.append(r0)     // Catch:{ SocketTimeoutException -> 0x024e, IOException | IllegalStateException -> 0x0240 }
            java.lang.String r0 = "("
            r2.append(r0)     // Catch:{ SocketTimeoutException -> 0x024e, IOException | IllegalStateException -> 0x0240 }
            r2.append(r10)     // Catch:{ SocketTimeoutException -> 0x024e, IOException | IllegalStateException -> 0x0240 }
            java.lang.String r0 = ")"
            r2.append(r0)     // Catch:{ SocketTimeoutException -> 0x024e, IOException | IllegalStateException -> 0x0240 }
            java.lang.String r2 = r2.toString()     // Catch:{ SocketTimeoutException -> 0x024e, IOException | IllegalStateException -> 0x0240 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ SocketTimeoutException -> 0x024e, IOException | IllegalStateException -> 0x0240 }
            r1.<init>()     // Catch:{ SocketTimeoutException -> 0x024e, IOException | IllegalStateException -> 0x0240 }
            java.lang.String r0 = "gif/search/tenor/got error: "
            r1.append(r0)     // Catch:{ SocketTimeoutException -> 0x024e, IOException | IllegalStateException -> 0x0240 }
            r1.append(r2)     // Catch:{ SocketTimeoutException -> 0x024e, IOException | IllegalStateException -> 0x0240 }
            java.lang.String r0 = r1.toString()     // Catch:{ SocketTimeoutException -> 0x024e, IOException | IllegalStateException -> 0x0240 }
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ SocketTimeoutException -> 0x024e, IOException | IllegalStateException -> 0x0240 }
            r0 = 5
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ SocketTimeoutException -> 0x024e, IOException | IllegalStateException -> 0x0240 }
            r3.A01 = r0     // Catch:{ SocketTimeoutException -> 0x024e, IOException | IllegalStateException -> 0x0240 }
            r3.A07 = r2     // Catch:{ SocketTimeoutException -> 0x024e, IOException | IllegalStateException -> 0x0240 }
            goto L_0x025b
        L_0x01ff:
            java.lang.String r0 = "0"
            boolean r0 = r0.equals(r9)     // Catch:{ SocketTimeoutException -> 0x024e, IOException | IllegalStateException -> 0x0240 }
            if (r0 == 0) goto L_0x0208
            r9 = 0
        L_0x0208:
            if (r6 != 0) goto L_0x0218
            r0 = 0
            X.01Q r2 = new X.01Q     // Catch:{ SocketTimeoutException -> 0x024e, IOException | IllegalStateException -> 0x0240 }
            r2.<init>(r0, r0)     // Catch:{ SocketTimeoutException -> 0x024e, IOException | IllegalStateException -> 0x0240 }
            r0 = 2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ SocketTimeoutException -> 0x024e, IOException | IllegalStateException -> 0x0240 }
            r3.A01 = r0     // Catch:{ SocketTimeoutException -> 0x024e, IOException | IllegalStateException -> 0x0240 }
            goto L_0x0224
        L_0x0218:
            X.01Q r2 = new X.01Q     // Catch:{ SocketTimeoutException -> 0x024e, IOException | IllegalStateException -> 0x0240 }
            r2.<init>(r9, r6)     // Catch:{ SocketTimeoutException -> 0x024e, IOException | IllegalStateException -> 0x0240 }
            r0 = 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ SocketTimeoutException -> 0x024e, IOException | IllegalStateException -> 0x0240 }
            r3.A01 = r0     // Catch:{ SocketTimeoutException -> 0x024e, IOException | IllegalStateException -> 0x0240 }
        L_0x0224:
            r5.A00()
            long r0 = r5.A00()
            long r0 = r0 - r14
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r3.A05 = r0
            X.0t9 r0 = r4.A06
            r0.A06(r3)
            android.net.TrafficStats.clearThreadStatsTag()
            return r2
        L_0x023b:
            r0 = move-exception
            r11.close()     // Catch:{ all -> 0x023f }
        L_0x023f:
            throw r0     // Catch:{ SocketTimeoutException -> 0x024e, IOException | IllegalStateException -> 0x0240 }
        L_0x0240:
            r1 = move-exception
            java.lang.String r0 = "gif/search/tenor/unknown_error"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x0273 }
            r0 = 2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0273 }
            r3.A01 = r0     // Catch:{ all -> 0x0273 }
            goto L_0x025b
        L_0x024e:
            r1 = move-exception
            java.lang.String r0 = "gif/search/tenor/timeout"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x0273 }
            r0 = 3
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0273 }
            r3.A01 = r0     // Catch:{ all -> 0x0273 }
        L_0x025b:
            r5.A00()
            long r0 = r5.A00()
            long r0 = r0 - r14
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r3.A05 = r0
            X.0t9 r0 = r4.A06
            r0.A06(r3)
            android.net.TrafficStats.clearThreadStatsTag()
            r6 = 0
            return r6
        L_0x0273:
            r2 = move-exception
            r5.A00()
            long r0 = r5.A00()
            long r0 = r0 - r14
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r3.A05 = r0
            X.0t9 r0 = r4.A06
            r0.A06(r3)
            android.net.TrafficStats.clearThreadStatsTag()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25921Lq.A01(X.3sY, X.1Lq, java.lang.String):X.01Q");
    }
}
