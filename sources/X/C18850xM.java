package X;

/* renamed from: X.0xM  reason: invalid class name and case insensitive filesystem */
public class C18850xM {
    public final C16300so A00;
    public final C18840xL A01;
    public final C18820xJ A02;
    public final C18830xK A03;

    public C18850xM(C16300so r1, C18840xL r2, C18820xJ r3, C18830xK r4) {
        this.A00 = r1;
        this.A02 = r3;
        this.A03 = r4;
        this.A01 = r2;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:85:0x014f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C42051x9 A00(X.C42031x7 r7) {
        /*
            r6 = this;
            X.1XK r1 = r7.A00
            boolean r0 = X.C31831f6.A02(r1)
            if (r0 == 0) goto L_0x0042
            boolean r0 = r7.A03
            r5 = 0
            if (r0 != 0) goto L_0x0022
            X.0xK r2 = r6.A03
            java.io.File r0 = r7.A01
            android.net.Uri r1 = android.net.Uri.fromFile(r0)
            r0 = 100
            byte[] r4 = r2.A04(r1, r0, r0)
        L_0x001b:
            java.io.File r3 = r7.A01
            android.util.Pair r2 = X.C17970vw.A0A(r3)
            goto L_0x0024
        L_0x0022:
            r4 = r5
            goto L_0x001b
        L_0x0024:
            java.lang.Object r0 = r2.second     // Catch:{ Exception | OutOfMemoryError -> 0x003b }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ Exception | OutOfMemoryError -> 0x003b }
            int r1 = r0.intValue()     // Catch:{ Exception | OutOfMemoryError -> 0x003b }
            java.lang.Object r0 = r2.first     // Catch:{ Exception | OutOfMemoryError -> 0x003b }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ Exception | OutOfMemoryError -> 0x003b }
            int r0 = r0.intValue()     // Catch:{ Exception | OutOfMemoryError -> 0x003b }
            if (r1 <= r0) goto L_0x003b
            android.util.Pair r0 = X.C42041x8.A00(r3)     // Catch:{ Exception | OutOfMemoryError -> 0x003b }
            goto L_0x003c
        L_0x003b:
            r0 = r5
        L_0x003c:
            X.1x9 r1 = new X.1x9
            r1.<init>(r2, r0, r4, r5)
            return r1
        L_0x0042:
            X.1XK r0 = X.AnonymousClass1XK.A09
            if (r1 == r0) goto L_0x011f
            X.1XK r0 = X.AnonymousClass1XK.A0C
            if (r1 == r0) goto L_0x011f
            X.1XK r0 = X.AnonymousClass1XK.A0Y
            if (r1 == r0) goto L_0x011f
            X.1XK r0 = X.AnonymousClass1XK.A0A
            if (r1 == r0) goto L_0x011f
            X.1XK r0 = X.AnonymousClass1XK.A0H
            if (r1 == r0) goto L_0x011f
            boolean r0 = X.C221516v.A01(r1)
            if (r0 == 0) goto L_0x0075
            boolean r0 = r7.A03
            r4 = 0
            if (r0 == 0) goto L_0x0068
            r0 = r4
        L_0x0062:
            X.1x9 r1 = new X.1x9
            r1.<init>(r4, r4, r0, r4)
            return r1
        L_0x0068:
            X.0xJ r3 = r6.A02
            java.lang.String r2 = r7.A02
            java.io.File r1 = r7.A01
            r0 = 1065353216(0x3f800000, float:1.0)
            byte[] r0 = r3.A0A(r1, r2, r0)
            goto L_0x0062
        L_0x0075:
            boolean r0 = X.C31831f6.A04(r1)
            if (r0 == 0) goto L_0x00c6
            r3 = 0
            java.io.File r0 = r7.A01     // Catch:{ 1xB -> 0x00a6 }
            X.1xA r2 = new X.1xA     // Catch:{ 1xB -> 0x00a6 }
            r2.<init>(r0)     // Catch:{ 1xB -> 0x00a6 }
            boolean r0 = r2.A02()     // Catch:{ 1xB -> 0x00a6 }
            if (r0 == 0) goto L_0x00a3
            int r1 = r2.A01     // Catch:{ 1xB -> 0x00a6 }
        L_0x008b:
            boolean r0 = r2.A02()     // Catch:{ 1xB -> 0x00a6 }
            if (r0 == 0) goto L_0x00a0
            int r0 = r2.A03     // Catch:{ 1xB -> 0x00a6 }
        L_0x0093:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ 1xB -> 0x00a6 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ 1xB -> 0x00a6 }
            android.util.Pair r2 = android.util.Pair.create(r1, r0)     // Catch:{ 1xB -> 0x00a6 }
            goto L_0x00ae
        L_0x00a0:
            int r0 = r2.A01     // Catch:{ 1xB -> 0x00a6 }
            goto L_0x0093
        L_0x00a3:
            int r1 = r2.A03     // Catch:{ 1xB -> 0x00a6 }
            goto L_0x008b
        L_0x00a6:
            r1 = move-exception
            java.lang.String r0 = "thumbnailgenerator/video/unable to get video meta"
            com.whatsapp.util.Log.w(r0, r1)
            r2 = r3
        L_0x00ae:
            boolean r0 = r7.A03
            if (r0 == 0) goto L_0x00b9
            r0 = r3
        L_0x00b3:
            X.1x9 r1 = new X.1x9
            r1.<init>(r2, r3, r0, r3)
            return r1
        L_0x00b9:
            java.io.File r0 = r7.A01
            android.graphics.Bitmap r1 = X.C18830xK.A01(r0)
            r0 = 100
            byte[] r0 = X.C18830xK.A03(r1, r0)
            goto L_0x00b3
        L_0x00c6:
            X.1XK r0 = X.AnonymousClass1XK.A0S
            if (r1 != r0) goto L_0x011d
            boolean r0 = r7.A03
            r5 = 0
            if (r0 == 0) goto L_0x00df
            java.io.File r0 = r7.A01
            java.lang.String r0 = r0.getAbsolutePath()
            byte[] r0 = com.whatsapp.stickers.WebpUtils.fetchWebpMetadata(r0)
            X.1x9 r1 = new X.1x9
            r1.<init>(r5, r5, r5, r0)
            return r1
        L_0x00df:
            X.0xL r2 = r6.A01     // Catch:{ OutOfMemoryError -> 0x0111 }
            java.io.File r1 = r7.A01     // Catch:{ OutOfMemoryError -> 0x0111 }
            java.lang.String r0 = r1.getName()     // Catch:{ OutOfMemoryError -> 0x0111 }
            r4 = 64
            android.graphics.Bitmap r3 = r2.A03(r1, r0, r4, r4)     // Catch:{ OutOfMemoryError -> 0x0111 }
            if (r3 == 0) goto L_0x0117
            java.io.ByteArrayOutputStream r2 = new java.io.ByteArrayOutputStream     // Catch:{ OutOfMemoryError -> 0x0111 }
            r2.<init>()     // Catch:{ OutOfMemoryError -> 0x0111 }
            r1 = 100
            android.graphics.Bitmap$CompressFormat r0 = android.graphics.Bitmap.CompressFormat.PNG     // Catch:{ OutOfMemoryError -> 0x0111 }
            r3.compress(r0, r1, r2)     // Catch:{ OutOfMemoryError -> 0x0111 }
            byte[] r2 = r2.toByteArray()     // Catch:{ OutOfMemoryError -> 0x0111 }
            r3.recycle()     // Catch:{ OutOfMemoryError -> 0x0111 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)     // Catch:{ OutOfMemoryError -> 0x0111 }
            android.util.Pair r0 = new android.util.Pair     // Catch:{ OutOfMemoryError -> 0x0111 }
            r0.<init>(r1, r1)     // Catch:{ OutOfMemoryError -> 0x0111 }
            X.1x9 r1 = new X.1x9     // Catch:{ OutOfMemoryError -> 0x0111 }
            r1.<init>(r0, r5, r2, r5)     // Catch:{ OutOfMemoryError -> 0x0111 }
            return r1
        L_0x0111:
            r1 = move-exception
            java.lang.String r0 = "ThumbnailGenerator/createThumbnailForSticker/failed"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x0117:
            X.1x9 r1 = new X.1x9
            r1.<init>(r5, r5, r5, r5)
            return r1
        L_0x011d:
            r1 = 0
            return r1
        L_0x011f:
            r5 = 0
            java.io.File r0 = r7.A01     // Catch:{ IOException -> 0x0150 }
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch:{ IOException -> 0x0150 }
            r4.<init>(r0)     // Catch:{ IOException -> 0x0150 }
            int r0 = r4.available()     // Catch:{ all -> 0x014b }
            X.03c r3 = new X.03c     // Catch:{ all -> 0x014b }
            r3.<init>(r0)     // Catch:{ all -> 0x014b }
            r0 = 4096(0x1000, float:5.74E-42)
            byte[] r2 = new byte[r0]     // Catch:{ all -> 0x014b }
        L_0x0134:
            int r1 = r4.read(r2)     // Catch:{ all -> 0x014b }
            r0 = -1
            if (r1 != r0) goto L_0x0140
            byte[] r2 = r3.toByteArray()     // Catch:{ all -> 0x014b }
            goto L_0x0145
        L_0x0140:
            r0 = 0
            r3.write(r2, r0, r1)     // Catch:{ all -> 0x014b }
            goto L_0x0134
        L_0x0145:
            r4.close()     // Catch:{ IOException -> 0x0149 }
            goto L_0x0157
        L_0x0149:
            r1 = move-exception
            goto L_0x0152
        L_0x014b:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x014f }
        L_0x014f:
            throw r0     // Catch:{ IOException -> 0x0150 }
        L_0x0150:
            r1 = move-exception
            r2 = r5
        L_0x0152:
            java.lang.String r0 = "ThumbnailGenerator/createThumbnailForThumbnailDownload/failed"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x0157:
            X.1x9 r1 = new X.1x9
            r1.<init>(r5, r5, r2, r5)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18850xM.A00(X.1x7):X.1x9");
    }
}
