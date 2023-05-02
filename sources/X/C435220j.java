package X;

/* renamed from: X.20j  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C435220j implements C434820e {
    public final /* synthetic */ AnonymousClass20Z A00;
    public final /* synthetic */ C17250um A01;

    public /* synthetic */ C435220j(AnonymousClass20Z r1, C17250um r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:60:0x00f0 */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x009b  */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:60:0x00f0=Splitter:B:60:0x00f0, B:53:0x00e7=Splitter:B:53:0x00e7} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.Bitmap AKD(android.content.res.Resources r10, int r11) {
        /*
            r9 = this;
            X.0um r0 = r9.A01
            X.20Z r5 = r9.A00
            X.1QR r3 = r0.A01
            monitor-enter(r3)
            r8 = 1
            r7 = 0
            r0 = 0
            if (r11 == 0) goto L_0x000d
            r0 = 1
        L_0x000d:
            X.AnonymousClass00B.A0G(r0)     // Catch:{ all -> 0x0126 }
            android.graphics.BitmapFactory$Options r6 = new android.graphics.BitmapFactory$Options     // Catch:{ all -> 0x0126 }
            r6.<init>()     // Catch:{ all -> 0x0126 }
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ all -> 0x0126 }
            r6.inPreferredConfig = r0     // Catch:{ all -> 0x0126 }
            int r1 = r11 / 100
            boolean r0 = r3.A0C(r1)     // Catch:{ all -> 0x0126 }
            r4 = 0
            if (r0 != 0) goto L_0x00ab
            java.lang.String r0 = "DoodleEmojiManager/getBitmap/Downloadable files are not ready and getBitmap is called"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0126 }
            int r6 = r3.A01(r1)     // Catch:{ all -> 0x0126 }
            r2 = 5
            if (r6 == 0) goto L_0x006c
            if (r6 == r8) goto L_0x005c
            r0 = 2
            if (r6 == r0) goto L_0x006c
            r0 = 3
            if (r6 == r0) goto L_0x005c
            r0 = 4
            if (r6 == r0) goto L_0x006c
            if (r6 == r2) goto L_0x0099
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0124 }
            r2.<init>()     // Catch:{ all -> 0x0124 }
            java.lang.String r0 = "DoodleEmojiManager/getFilesAsyncFromState/Unexpected state "
            r2.append(r0)     // Catch:{ all -> 0x0124 }
            java.util.HashMap r1 = X.C26061Me.A0J     // Catch:{ all -> 0x0124 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x0124 }
            java.lang.Object r0 = r1.get(r0)     // Catch:{ all -> 0x0124 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x0124 }
            r2.append(r0)     // Catch:{ all -> 0x0124 }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x0124 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0124 }
            goto L_0x008f
        L_0x005c:
            java.util.HashMap r2 = X.C26061Me.A0J     // Catch:{ all -> 0x0124 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x0124 }
            r2.get(r0)     // Catch:{ all -> 0x0124 }
            if (r5 == 0) goto L_0x0122
            r3.A09(r5, r1)     // Catch:{ all -> 0x0124 }
            goto L_0x0122
        L_0x006c:
            boolean r0 = r3.A0C(r1)     // Catch:{ all -> 0x0124 }
            if (r0 != 0) goto L_0x0096
            X.0rz r2 = r3.A0A     // Catch:{ all -> 0x0124 }
            X.0wP r0 = r3.A06     // Catch:{ all -> 0x0124 }
            int r0 = r0.A04(r8)     // Catch:{ all -> 0x0124 }
            int r0 = X.AnonymousClass20B.A00(r2, r0)     // Catch:{ all -> 0x0124 }
            r0 = r0 & 1
            if (r0 == 0) goto L_0x008f
            r3.A08(r8, r1)     // Catch:{ all -> 0x0124 }
            if (r5 == 0) goto L_0x008a
            r3.A09(r5, r1)     // Catch:{ all -> 0x0124 }
        L_0x008a:
            r3.A07(r7, r1)     // Catch:{ all -> 0x0124 }
            goto L_0x0122
        L_0x008f:
            if (r5 == 0) goto L_0x0122
            r5.AQQ()     // Catch:{ all -> 0x0124 }
            goto L_0x0122
        L_0x0096:
            r3.A08(r2, r1)     // Catch:{ all -> 0x0124 }
        L_0x0099:
            if (r5 == 0) goto L_0x0122
            boolean r0 = r3.A0C(r1)     // Catch:{ all -> 0x0124 }
            X.AnonymousClass00B.A0G(r0)     // Catch:{ all -> 0x0124 }
            r3.A0E(r1)     // Catch:{ all -> 0x0124 }
            android.util.SparseArray r0 = r3.A00     // Catch:{ all -> 0x0124 }
            r5.AVi(r0)     // Catch:{ all -> 0x0124 }
            goto L_0x0122
        L_0x00ab:
            android.util.SparseArray r0 = r3.A00     // Catch:{ all -> 0x0124 }
            java.lang.Object r5 = r0.get(r11)     // Catch:{ all -> 0x0124 }
            java.io.File r5 = (java.io.File) r5     // Catch:{ all -> 0x0124 }
            if (r5 == 0) goto L_0x010b
            boolean r0 = r5.exists()     // Catch:{ all -> 0x0126 }
            if (r0 == 0) goto L_0x010b
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ IOException -> 0x00f1 }
            r2.<init>(r5)     // Catch:{ IOException -> 0x00f1 }
            java.lang.String r0 = r5.getPath()     // Catch:{ all -> 0x00ec }
            java.lang.String r1 = X.AnonymousClass1XI.A08(r0)     // Catch:{ all -> 0x00ec }
            java.lang.String r0 = "obi"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x00ec }
            if (r0 == 0) goto L_0x00d9
            X.1QQ r0 = r3.A01     // Catch:{ all -> 0x00ec }
            boolean r0 = r0.A01(r11, r7)     // Catch:{ all -> 0x00ec }
            if (r0 == 0) goto L_0x00d9
            goto L_0x00da
        L_0x00d9:
            r8 = 0
        L_0x00da:
            if (r8 == 0) goto L_0x00e3
            X.1QQ r0 = r3.A01     // Catch:{ all -> 0x00ec }
            android.graphics.Bitmap r0 = r0.A00(r2, r7)     // Catch:{ all -> 0x00ec }
            goto L_0x00e7
        L_0x00e3:
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeStream(r2, r4, r6)     // Catch:{ all -> 0x00ec }
        L_0x00e7:
            r2.close()     // Catch:{ IOException -> 0x00f1 }
            monitor-exit(r3)
            return r0
        L_0x00ec:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x00f0 }
        L_0x00f0:
            throw r0     // Catch:{ IOException -> 0x00f1 }
        L_0x00f1:
            r2 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0126 }
            r1.<init>()     // Catch:{ all -> 0x0126 }
            java.lang.String r0 = "DoodleEmojiManager/getBitmap/Could not get bitmap from downloaded file for "
            r1.append(r0)     // Catch:{ all -> 0x0126 }
            java.lang.String r0 = r5.getName()     // Catch:{ all -> 0x0126 }
            r1.append(r0)     // Catch:{ all -> 0x0126 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0126 }
            com.whatsapp.util.Log.e(r0, r2)     // Catch:{ all -> 0x0126 }
            goto L_0x0122
        L_0x010b:
            r3.A08(r7, r1)     // Catch:{ all -> 0x0126 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0126 }
            r1.<init>()     // Catch:{ all -> 0x0126 }
            java.lang.String r0 = "DoodleEmojiManager/getBitmap/Error getting downloaded file to compute bitmap for emojiId="
            r1.append(r0)     // Catch:{ all -> 0x0126 }
            r1.append(r11)     // Catch:{ all -> 0x0126 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0126 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0126 }
        L_0x0122:
            monitor-exit(r3)
            return r4
        L_0x0124:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0126 }
        L_0x0126:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C435220j.AKD(android.content.res.Resources, int):android.graphics.Bitmap");
    }
}
