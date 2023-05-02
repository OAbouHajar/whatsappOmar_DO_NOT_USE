package X;

/* renamed from: X.3H1  reason: invalid class name */
public class AnonymousClass3H1 implements C30781cw {
    public AnonymousClass5S8[] A00;
    public final C16980tz A01;
    public final AnonymousClass1AP A02;

    public AnonymousClass3H1(C16980tz r4, AnonymousClass1AP r5) {
        this.A01 = r4;
        this.A02 = r5;
        this.A00 = new AnonymousClass5S8[]{new C63323Gz(r4), new AnonymousClass3H0(r4)};
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0086, code lost:
        if ((r3 instanceof X.C30581cc) != false) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x015d, code lost:
        if (r4 != 6) goto L_0x015f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x003c A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C30791cx AG3(android.content.Context r26, java.util.List r27) {
        /*
            r25 = this;
            X.AnonymousClass00B.A00()
            r3 = r27
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L_0x000d
            r5 = 0
        L_0x000c:
            return r5
        L_0x000d:
            X.1cx r5 = new X.1cx
            r5.<init>()
            r2 = 0
        L_0x0013:
            r11 = r25
            X.5S8[] r1 = r11.A00
            int r0 = r1.length
            if (r2 >= r0) goto L_0x000c
            r10 = r1[r2]
            boolean r0 = r10.AJs()
            if (r0 == 0) goto L_0x0140
            java.util.ArrayList r9 = X.AnonymousClass000.A0u()
            X.1AP r0 = r11.A02
            r1 = r26
            X.3AB r0 = X.AnonymousClass3AB.A00(r1, r0, r3)
            int r4 = r0.A00
            if (r4 == 0) goto L_0x000c
            java.util.Map r0 = r0.A01
            java.util.ArrayList r7 = X.AnonymousClass000.A0u()
            java.util.Iterator r16 = X.AnonymousClass000.A0y(r0)
        L_0x003c:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x0149
            java.util.Map$Entry r0 = X.AnonymousClass000.A0z(r16)
            java.lang.Object r3 = r0.getKey()
            X.0tZ r3 = (X.C16740tZ) r3
            java.lang.Object r12 = r0.getValue()
            X.4Is r12 = (X.C83964Is) r12
            java.io.File r8 = r12.A00
            X.0tz r0 = r11.A01     // Catch:{ IllegalArgumentException -> 0x0139 }
            android.content.Context r1 = r0.A00     // Catch:{ IllegalArgumentException -> 0x0139 }
            java.lang.String r0 = X.AnonymousClass01S.A05     // Catch:{ IllegalArgumentException -> 0x0139 }
            android.net.Uri r6 = androidx.core.content.FileProvider.A00(r1, r8, r0)     // Catch:{ IllegalArgumentException -> 0x0139 }
            java.lang.Integer r13 = X.C13680ns.A0X()
            android.util.Pair r1 = android.util.Pair.create(r13, r13)
            boolean r2 = r3 instanceof X.C38681rF
            java.lang.String r20 = ""
            if (r2 != 0) goto L_0x006d
            goto L_0x0080
        L_0x006d:
            X.0tY r3 = (X.C16730tY) r3
            java.lang.String r0 = r3.A13()
            if (r0 == 0) goto L_0x0077
            r20 = r0
        L_0x0077:
            if (r2 != 0) goto L_0x0088
            X.1wq r2 = new X.1wq
            r2.<init>()
            r3 = 0
            goto L_0x00a4
        L_0x0080:
            boolean r0 = r3 instanceof X.C38721rJ
            if (r0 != 0) goto L_0x006d
            boolean r0 = r3 instanceof X.C30581cc
            if (r0 == 0) goto L_0x00fc
        L_0x0088:
            android.graphics.BitmapFactory$Options r2 = new android.graphics.BitmapFactory$Options
            r2.<init>()
            r0 = 1
            r2.inJustDecodeBounds = r0
            java.lang.String r0 = r8.getAbsolutePath()
            android.graphics.BitmapFactory.decodeFile(r0, r2)
            int r0 = r2.outHeight
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            int r0 = r2.outWidth
            android.util.Pair r1 = X.C13680ns.A0F(r1, r0)
            goto L_0x00fc
        L_0x00a4:
            java.lang.String r0 = r8.getAbsolutePath()     // Catch:{ Exception -> 0x00f5 }
            r2.setDataSource(r0)     // Catch:{ Exception -> 0x00f5 }
            r0 = 18
            java.lang.String r14 = r2.extractMetadata(r0)     // Catch:{ all -> 0x0144 }
            r0 = 19
            java.lang.String r0 = r2.extractMetadata(r0)     // Catch:{ all -> 0x0144 }
            int r15 = java.lang.Integer.parseInt(r14)     // Catch:{ Exception -> 0x00c2 }
            int r3 = java.lang.Integer.parseInt(r0)     // Catch:{ Exception -> 0x00c0 }
            goto L_0x00e8
        L_0x00c0:
            r1 = move-exception
            goto L_0x00c4
        L_0x00c2:
            r1 = move-exception
            r15 = 0
        L_0x00c4:
            java.lang.StringBuilder r13 = X.AnonymousClass000.A0o()     // Catch:{ all -> 0x0144 }
            java.lang.String r0 = "getVideoHeightWidth/cannot parse width ("
            r13.append(r0)     // Catch:{ all -> 0x0144 }
            r13.append(r14)     // Catch:{ all -> 0x0144 }
            java.lang.String r0 = ") or height ("
            r13.append(r0)     // Catch:{ all -> 0x0144 }
            r13.append(r3)     // Catch:{ all -> 0x0144 }
            java.lang.String r0 = ") "
            r13.append(r0)     // Catch:{ all -> 0x0144 }
            java.lang.String r0 = r8.getAbsolutePath()     // Catch:{ all -> 0x0144 }
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r13)     // Catch:{ all -> 0x0144 }
            com.whatsapp.util.Log.w(r0, r1)     // Catch:{ all -> 0x0144 }
        L_0x00e8:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0144 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r15)     // Catch:{ all -> 0x0144 }
            android.util.Pair r1 = android.util.Pair.create(r1, r0)     // Catch:{ all -> 0x0144 }
            goto L_0x00f9
        L_0x00f5:
            android.util.Pair r1 = android.util.Pair.create(r13, r13)     // Catch:{ all -> 0x0144 }
        L_0x00f9:
            r2.close()
        L_0x00fc:
            if (r6 == 0) goto L_0x003c
            java.lang.Object r0 = r1.first
            X.AnonymousClass00B.A06(r0)
            int r0 = X.AnonymousClass000.A0D(r0)
            double r2 = (double) r0
            java.lang.Object r0 = r1.second
            X.AnonymousClass00B.A06(r0)
            int r0 = X.AnonymousClass000.A0D(r0)
            double r0 = (double) r0
            r14 = 0
            int r13 = (r2 > r14 ? 1 : (r2 == r14 ? 0 : -1))
            if (r13 != 0) goto L_0x0137
            r0 = 0
        L_0x011a:
            int r24 = X.C17970vw.A03(r8)
            java.lang.String r3 = r12.A01
            r7.add(r6)
            X.4Nu r2 = new X.4Nu
            r18 = r6
            r19 = r8
            r21 = r3
            r22 = r0
            r17 = r2
            r17.<init>(r18, r19, r20, r21, r22, r24)
            r9.add(r2)
            goto L_0x003c
        L_0x0137:
            double r0 = r0 / r2
            goto L_0x011a
        L_0x0139:
            java.lang.String r0 = "getSharingIntent: Attempting to share file failed"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            goto L_0x003c
        L_0x0140:
            int r2 = r2 + 1
            goto L_0x0013
        L_0x0144:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x0148 }
        L_0x0148:
            throw r0
        L_0x0149:
            android.content.Intent r6 = r10.AG2(r9, r4)
            r5.A01 = r6
            r5.A02 = r7
            if (r6 != 0) goto L_0x0163
            boolean r0 = r10 instanceof X.C63323Gz
            if (r0 == 0) goto L_0x015f
            r0 = 7
            r1 = 1
            if (r4 == r0) goto L_0x0160
            r0 = 6
            r1 = 2
            if (r4 == r0) goto L_0x0160
        L_0x015f:
            r1 = 0
        L_0x0160:
            r5.A00 = r1
            return r5
        L_0x0163:
            int r0 = r7.size()
            r1 = 0
            r4 = 1
            if (r0 <= 0) goto L_0x0193
            r0 = 0
            java.lang.Object r0 = r7.get(r0)
            android.net.Uri r0 = (android.net.Uri) r0
            android.content.ClipData r3 = android.content.ClipData.newRawUri(r1, r0)
            r2 = 1
        L_0x0177:
            int r0 = r7.size()
            if (r2 >= r0) goto L_0x018e
            java.lang.Object r1 = r7.get(r2)
            android.net.Uri r1 = (android.net.Uri) r1
            android.content.ClipData$Item r0 = new android.content.ClipData$Item
            r0.<init>(r1)
            r3.addItem(r0)
            int r2 = r2 + 1
            goto L_0x0177
        L_0x018e:
            if (r3 == 0) goto L_0x0193
            r6.setClipData(r3)
        L_0x0193:
            r6.addFlags(r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3H1.AG3(android.content.Context, java.util.List):X.1cx");
    }
}
