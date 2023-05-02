package X;

import android.util.Base64;

/* renamed from: X.3A8  reason: invalid class name */
public final class AnonymousClass3A8 {
    public static final byte[] A00 = Base64.decode("PkTwKSZqUfAUyR0rPQ8hYJ0wNsQQ3dW1+3SCnyTXIfEAxxS75FwkDf47wNv/c8pP3p0GXKR6OOQmhyERwx74fw1RYSU10I4r1gyBVDbRJ40pidjM41G1I1oN", 0);

    /* JADX WARNING: Can't wrap try/catch for region: R(3:50|51|52) */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00ef, code lost:
        throw new java.lang.AssertionError();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00f0, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00f4, code lost:
        throw r0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:50:0x00ea */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String A00(android.content.Context r7, java.lang.String r8) {
        /*
            java.lang.Class<X.3A8> r2 = X.AnonymousClass3A8.class
            java.io.ByteArrayOutputStream r6 = new java.io.ByteArrayOutputStream
            r6.<init>()
            java.lang.String r1 = r7.getPackageName()
            java.lang.String r0 = "com.obwhatsapp"
            if (r1 == 0) goto L_0x0102
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0102
            java.lang.String r5 = X.AnonymousClass01S.A08     // Catch:{ IOException -> 0x00fb }
            byte[] r0 = r1.getBytes(r5)     // Catch:{ IOException -> 0x00fb }
            r6.write(r0)     // Catch:{ IOException -> 0x00fb }
            java.lang.String r0 = "/res/drawable-hdpi/about_logo.png"
            java.io.InputStream r3 = r2.getResourceAsStream(r0)
            if (r3 != 0) goto L_0x002c
            java.lang.String r0 = "/res/drawable-hdpi-v4/about_logo.png"
            java.io.InputStream r3 = r2.getResourceAsStream(r0)
        L_0x002c:
            if (r3 != 0) goto L_0x0034
            java.lang.String r0 = "/res/drawable-xxhdpi-v4/about_logo.png"
            java.io.InputStream r3 = r2.getResourceAsStream(r0)
        L_0x0034:
            if (r3 != 0) goto L_0x0065
            android.content.res.Resources r4 = r7.getResources()
            android.util.DisplayMetrics r3 = new android.util.DisplayMetrics
            r3.<init>()
            r3.setToDefaults()
            r1 = 1069547520(0x3fc00000, float:1.5)
            r3.density = r1
            r0 = 240(0xf0, float:3.36E-43)
            r3.densityDpi = r0
            r3.scaledDensity = r1
            float r0 = (float) r0
            r3.xdpi = r0
            r3.ydpi = r0
            android.content.res.AssetManager r2 = r4.getAssets()
            android.content.res.Configuration r0 = r4.getConfiguration()
            android.content.res.Resources r1 = new android.content.res.Resources
            r1.<init>(r2, r3, r0)
            r0 = 2131230845(0x7f08007d, float:1.8077754E38)
            java.io.InputStream r3 = r1.openRawResource(r0)
        L_0x0065:
            if (r3 == 0) goto L_0x00f5
            r0 = 8192(0x2000, float:1.14794E-41)
            byte[] r2 = new byte[r0]
            int r1 = r3.read(r2)     // Catch:{ IOException -> 0x00ea }
        L_0x006f:
            r0 = -1
            r4 = 0
            if (r1 == r0) goto L_0x007b
            r6.write(r2, r4, r1)     // Catch:{ IOException -> 0x00ea }
            int r1 = r3.read(r2)     // Catch:{ IOException -> 0x00ea }
            goto L_0x006f
        L_0x007b:
            r3.close()     // Catch:{ IOException -> 0x007e }
        L_0x007e:
            byte[] r3 = r6.toByteArray()
            byte[] r2 = A00
            r1 = 128(0x80, float:1.794E-43)
            r0 = 512(0x200, float:7.175E-43)
            javax.crypto.SecretKey r1 = X.C004101u.A07(r3, r2, r1, r0)
            javax.crypto.SecretKey r1 = com.obwhatsapp.yo.yo.sec()
            r1.getEncoded()
            java.lang.String r0 = "HMACSHA1"
            javax.crypto.Mac r3 = javax.crypto.Mac.getInstance(r0)     // Catch:{ NoSuchAlgorithmException -> 0x00e3 }
            r3.init(r1)     // Catch:{ InvalidKeyException -> 0x00dc }
            android.content.pm.Signature[] r2 = com.obwhatsapp.yo.yo.getYoSig()
            if (r2 == 0) goto L_0x00d6
            int r1 = r2.length
            if (r1 == 0) goto L_0x00d6
        L_0x00a5:
            if (r4 >= r1) goto L_0x00b3
            r0 = r2[r4]
            byte[] r0 = r0.toByteArray()
            r3.update(r0)
            int r4 = r4 + 1
            goto L_0x00a5
        L_0x00b3:
            byte[] r0 = X.C004101u.A0F(r7)
            byte[] r0 = com.obwhatsapp.yo.yo.md()
            r3.update(r0)
            byte[] r0 = r8.getBytes(r5)     // Catch:{ UnsupportedEncodingException -> 0x00cf }
            r3.update(r0)
            byte[] r1 = r3.doFinal()
            r0 = 2
            java.lang.String r0 = android.util.Base64.encodeToString(r1, r0)
            return r0
        L_0x00cf:
            r1 = move-exception
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>(r1)
            throw r0
        L_0x00d6:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        L_0x00dc:
            r1 = move-exception
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>(r1)
            throw r0
        L_0x00e3:
            r1 = move-exception
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>(r1)
            throw r0
        L_0x00ea:
            java.lang.AssertionError r0 = new java.lang.AssertionError     // Catch:{ all -> 0x00f0 }
            r0.<init>()     // Catch:{ all -> 0x00f0 }
            throw r0     // Catch:{ all -> 0x00f0 }
        L_0x00f0:
            r0 = move-exception
            r3.close()     // Catch:{ IOException -> 0x00f4 }
        L_0x00f4:
            throw r0
        L_0x00f5:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        L_0x00fb:
            r1 = move-exception
            java.lang.Error r0 = new java.lang.Error
            r0.<init>(r1)
            throw r0
        L_0x0102:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3A8.A00(android.content.Context, java.lang.String):java.lang.String");
    }
}
