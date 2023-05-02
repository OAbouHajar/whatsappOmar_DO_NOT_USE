package X;

/* renamed from: X.20k  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C435320k implements C434820e {
    public final /* synthetic */ C17250um A00;

    public /* synthetic */ C435320k(C17250um r1) {
        this.A00 = r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0057, code lost:
        if (r2 != null) goto L_0x0059;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:28:0x0064 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:28:0x0064=Splitter:B:28:0x0064, B:20:0x0059=Splitter:B:20:0x0059} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.Bitmap AKD(android.content.res.Resources r11, int r12) {
        /*
            r10 = this;
            X.0um r0 = r10.A00
            X.1QQ r9 = r0.A05
            r8 = 1
            boolean r7 = r9.A01(r12, r8)
            if (r7 == 0) goto L_0x000f
            java.lang.String r6 = "compressed/emojis/e%04d.obi"
        L_0x000d:
            r3 = 0
            goto L_0x0012
        L_0x000f:
            java.lang.String r6 = "emoji/e%04d.png"
            goto L_0x000d
        L_0x0012:
            android.content.res.AssetManager r5 = r11.getAssets()     // Catch:{ IOException -> 0x0065 }
            java.util.Locale r4 = java.util.Locale.US     // Catch:{ IOException -> 0x0065 }
            java.lang.Object[] r2 = new java.lang.Object[r8]     // Catch:{ IOException -> 0x0065 }
            r1 = 0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r12)     // Catch:{ IOException -> 0x0065 }
            r2[r1] = r0     // Catch:{ IOException -> 0x0065 }
            java.lang.String r0 = com.obwhatsapp.emoji.cem.getEmNm(r4, r6, r2, r12)     // Catch:{ IOException -> 0x0065 }
            java.io.InputStream r2 = com.obwhatsapp.emoji.cem.open(r5, r0)     // Catch:{ IOException -> 0x0065 }
            boolean r0 = com.obwhatsapp.emoji.cem.isCustomEmoji()     // Catch:{ IOException -> 0x0065 }
            if (r0 != 0) goto L_0x0038
            if (r7 == 0) goto L_0x0038
            android.graphics.Bitmap r0 = r9.A00(r2, r8)     // Catch:{ all -> 0x005e }
            if (r2 == 0) goto L_0x005d
            goto L_0x0059
        L_0x0038:
            android.util.DisplayMetrics r0 = r11.getDisplayMetrics()     // Catch:{ all -> 0x005e }
            float r1 = r0.density     // Catch:{ all -> 0x005e }
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x0053
            android.graphics.BitmapFactory$Options r1 = new android.graphics.BitmapFactory$Options     // Catch:{ all -> 0x005e }
            r1.<init>()     // Catch:{ all -> 0x005e }
            r0 = 2
            r1.inSampleSize = r0     // Catch:{ all -> 0x005e }
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeStream(r2, r3, r1)     // Catch:{ all -> 0x005e }
            if (r2 == 0) goto L_0x005d
            goto L_0x0059
        L_0x0053:
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeStream(r2)     // Catch:{ all -> 0x005e }
            if (r2 == 0) goto L_0x005d
        L_0x0059:
            r2.close()     // Catch:{ IOException -> 0x0065 }
            return r0
        L_0x005d:
            return r0
        L_0x005e:
            r0 = move-exception
            if (r2 == 0) goto L_0x0064
            r2.close()     // Catch:{ all -> 0x0064 }
        L_0x0064:
            throw r0     // Catch:{ IOException -> 0x0065 }
        L_0x0065:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C435320k.AKD(android.content.res.Resources, int):android.graphics.Bitmap");
    }
}
