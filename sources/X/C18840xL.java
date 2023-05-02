package X;

import android.graphics.Bitmap;
import com.facebook.animated.webp.WebPImage;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;

/* renamed from: X.0xL  reason: invalid class name and case insensitive filesystem */
public class C18840xL {
    public final C16980tz A00;
    public volatile C42001x2 A01;
    public volatile boolean A02;

    public C18840xL(C16980tz r2) {
        this.A00 = r2;
        try {
            C31131dW.A00(r2.A00);
        } catch (IOException unused) {
        }
    }

    public static WebPImage A00(byte[] bArr) {
        try {
            return WebPImage.createFromByteArray(bArr);
        } catch (UnsatisfiedLinkError e2) {
            Log.e("WebPImageLoader/createWebPImageFromBytes/unsatisfiedLinkError", e2);
            return null;
        } catch (IllegalArgumentException e3) {
            Log.e("WebPImageLoader/createWebPImageFromBytes/failed to create webp image object", e3);
            return null;
        }
    }

    public static final String A01(String str, int i2, int i3) {
        StringBuilder sb = new StringBuilder();
        sb.append(str.replace("/", "-"));
        sb.append("_");
        sb.append(i2);
        sb.append("_");
        sb.append(i3);
        return sb.toString();
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x006b A[Catch:{ IllegalStateException -> 0x006f }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.Bitmap A02(com.facebook.animated.webp.WebPImage r10, java.lang.String r11, int r12, int r13) {
        /*
            r9 = this;
            int r0 = r10.getFrameCount()     // Catch:{ IllegalStateException -> 0x006f }
            r2 = 0
            if (r0 <= 0) goto L_0x0068
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ OutOfMemoryError -> 0x0062 }
            android.graphics.Bitmap r4 = android.graphics.Bitmap.createBitmap(r12, r13, r0)     // Catch:{ OutOfMemoryError -> 0x0062 }
            r0 = 0
            com.facebook.animated.webp.WebPFrame r3 = r10.getFrame((int) r0)     // Catch:{ IllegalStateException -> 0x006f }
            int r8 = r3.getWidth()     // Catch:{ IllegalStateException -> 0x006f }
            int r7 = r3.getHeight()     // Catch:{ IllegalStateException -> 0x006f }
            int r1 = r10.getWidth()     // Catch:{ IllegalStateException -> 0x006f }
            int r0 = r10.getHeight()     // Catch:{ IllegalStateException -> 0x006f }
            if (r0 != r7) goto L_0x002a
            if (r1 != r8) goto L_0x002a
            r3.renderFrame(r12, r13, r4)     // Catch:{ IllegalStateException -> 0x006f }
            goto L_0x0069
        L_0x002a:
            float r5 = (float) r12     // Catch:{ IllegalStateException -> 0x006f }
            float r0 = (float) r1     // Catch:{ IllegalStateException -> 0x006f }
            float r5 = r5 / r0
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ OutOfMemoryError -> 0x005e }
            android.graphics.Bitmap r6 = android.graphics.Bitmap.createBitmap(r12, r13, r0)     // Catch:{ OutOfMemoryError -> 0x005e }
            float r0 = (float) r8     // Catch:{ IllegalStateException -> 0x006f }
            float r0 = r0 * r5
            double r0 = (double) r0     // Catch:{ IllegalStateException -> 0x006f }
            double r0 = java.lang.Math.ceil(r0)     // Catch:{ IllegalStateException -> 0x006f }
            int r8 = (int) r0     // Catch:{ IllegalStateException -> 0x006f }
            float r0 = (float) r7     // Catch:{ IllegalStateException -> 0x006f }
            float r0 = r0 * r5
            double r0 = (double) r0     // Catch:{ IllegalStateException -> 0x006f }
            double r0 = java.lang.Math.ceil(r0)     // Catch:{ IllegalStateException -> 0x006f }
            int r7 = (int) r0     // Catch:{ IllegalStateException -> 0x006f }
            r3.renderFrame(r8, r7, r6)     // Catch:{ IllegalStateException -> 0x006f }
            android.graphics.Canvas r7 = new android.graphics.Canvas     // Catch:{ IllegalStateException -> 0x006f }
            r7.<init>(r4)     // Catch:{ IllegalStateException -> 0x006f }
            int r0 = r3.getXOffset()     // Catch:{ IllegalStateException -> 0x006f }
            float r1 = (float) r0     // Catch:{ IllegalStateException -> 0x006f }
            float r1 = r1 * r5
            int r0 = r3.getYOffset()     // Catch:{ IllegalStateException -> 0x006f }
            float r0 = (float) r0     // Catch:{ IllegalStateException -> 0x006f }
            float r0 = r0 * r5
            r7.drawBitmap(r6, r1, r0, r2)     // Catch:{ IllegalStateException -> 0x006f }
            r6.recycle()     // Catch:{ IllegalStateException -> 0x006f }
            goto L_0x0069
        L_0x005e:
            r1 = move-exception
            java.lang.String r0 = "WebPImageLoader/createStaticImage creating framebitmap"
            goto L_0x0065
        L_0x0062:
            r1 = move-exception
            java.lang.String r0 = "WebPImageLoader/createStaticImage creating bitmap"
        L_0x0065:
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ IllegalStateException -> 0x006f }
        L_0x0068:
            r4 = r2
        L_0x0069:
            if (r4 == 0) goto L_0x006e
            r9.A07(r4, r11)     // Catch:{ IllegalStateException -> 0x006f }
        L_0x006e:
            return r4
        L_0x006f:
            r1 = move-exception
            java.lang.String r0 = "WebPImageLoader/createBitmapFromWebPImageAndCache/failed to create static image"
            com.whatsapp.util.Log.e(r0, r1)
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18840xL.A02(com.facebook.animated.webp.WebPImage, java.lang.String, int, int):android.graphics.Bitmap");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x005e */
    /* JADX WARNING: Missing exception handler attribute for start block: B:30:0x0063 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Bitmap A03(java.io.File r8, java.lang.String r9, int r10, int r11) {
        /*
            r7 = this;
            java.lang.String r3 = "loadStaticImageAsBitmapFromFile/getting sticker bitmap failed:"
            java.lang.String r6 = A01(r9, r10, r11)
            android.graphics.Bitmap r0 = r7.A04(r6)
            if (r0 != 0) goto L_0x003b
            android.graphics.BitmapFactory$Options r5 = new android.graphics.BitmapFactory$Options
            r5.<init>()
            r5.outHeight = r11
            r5.outWidth = r10
            java.lang.String r0 = r8.getAbsolutePath()
            com.whatsapp.stickers.WebpInfo r4 = com.whatsapp.stickers.WebpUtils.verifyWebpFileIntegrity(r0)
            if (r4 == 0) goto L_0x003c
            int r0 = r4.numFrames
            r2 = 1
            if (r0 != r2) goto L_0x003c
            int r1 = r4.width
            int r0 = r4.height
            int r0 = X.C37741pe.A00(r1, r0, r10, r11, r2)
            r5.inSampleSize = r0
            java.lang.String r0 = r8.getAbsolutePath()
            android.graphics.Bitmap r0 = com.facebook.webpsupport.WebpBitmapFactoryImpl.hookDecodeFile(r0, r5)
        L_0x0036:
            if (r0 == 0) goto L_0x003e
            r7.A07(r0, r6)
        L_0x003b:
            return r0
        L_0x003c:
            r0 = 0
            goto L_0x0036
        L_0x003e:
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ FileNotFoundException | IOException -> 0x0064 }
            r2.<init>(r8)     // Catch:{ FileNotFoundException | IOException -> 0x0064 }
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream     // Catch:{ all -> 0x005f }
            r1.<init>()     // Catch:{ all -> 0x005f }
            X.AnonymousClass1XI.A0H(r2, r1)     // Catch:{ all -> 0x005a }
            byte[] r0 = r1.toByteArray()     // Catch:{ all -> 0x005a }
            android.graphics.Bitmap r0 = r7.A05(r9, r0, r10, r11)     // Catch:{ all -> 0x005a }
            r1.close()     // Catch:{ all -> 0x005f }
            r2.close()     // Catch:{ FileNotFoundException | IOException -> 0x0064 }
            return r0
        L_0x005a:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x005e }
        L_0x005e:
            throw r0     // Catch:{ all -> 0x005f }
        L_0x005f:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x0063 }
        L_0x0063:
            throw r0     // Catch:{ FileNotFoundException | IOException -> 0x0064 }
        L_0x0064:
            r1 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r3)
            r0.append(r9)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.e(r0, r1)
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18840xL.A03(java.io.File, java.lang.String, int, int):android.graphics.Bitmap");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x002b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.Bitmap A04(java.lang.String r4) {
        /*
            r3 = this;
            X.1x2 r0 = r3.A06()
            r2 = 0
            if (r0 == 0) goto L_0x002c
            X.1x3 r0 = r0.A09(r4)     // Catch:{ IOException -> 0x000c }
            goto L_0x0013
        L_0x000c:
            r1 = move-exception
            java.lang.String r0 = "WebPImageLoader/error getting bitmap from cache"
            com.whatsapp.util.Log.e(r0, r1)
            r0 = r2
        L_0x0013:
            if (r0 != 0) goto L_0x0016
            return r2
        L_0x0016:
            r1 = 0
            java.io.InputStream[] r0 = r0.A00     // Catch:{ IOException -> 0x002c }
            r1 = r0[r1]     // Catch:{ IOException -> 0x002c }
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeStream(r1)     // Catch:{ all -> 0x0025 }
            if (r1 == 0) goto L_0x0024
            r1.close()     // Catch:{ IOException -> 0x002c }
        L_0x0024:
            return r0
        L_0x0025:
            r0 = move-exception
            if (r1 == 0) goto L_0x002b
            r1.close()     // Catch:{ all -> 0x002b }
        L_0x002b:
            throw r0     // Catch:{ IOException -> 0x002c }
        L_0x002c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18840xL.A04(java.lang.String):android.graphics.Bitmap");
    }

    public Bitmap A05(String str, byte[] bArr, int i2, int i3) {
        String A012 = A01(str, i2, i3);
        Bitmap A04 = A04(A012);
        if (A04 != null) {
            return A04;
        }
        WebPImage A002 = A00(bArr);
        if (A002 == null) {
            return null;
        }
        return A02(A002, A012, i2, i3);
    }

    public final C42001x2 A06() {
        if (!this.A02) {
            synchronized (this) {
                if (!this.A02) {
                    File file = new File(this.A00.A00.getCacheDir(), "webp_static_cache");
                    if (file.exists() || file.mkdirs()) {
                        try {
                            this.A01 = C42001x2.A00(file, 2097152);
                        } catch (IOException e2) {
                            Log.e("WebPImageLoader/getDiskLruCache error opening cache", e2);
                        }
                    } else {
                        Log.e("WebPImageLoader/getDiskLruCache could not init directory");
                    }
                    this.A02 = true;
                }
            }
        }
        return this.A01;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x0033 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0038 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A07(android.graphics.Bitmap r7, java.lang.String r8) {
        /*
            r6 = this;
            X.1x2 r0 = r6.A06()
            if (r0 == 0) goto L_0x003f
            X.1x6 r5 = r0.A08(r8)     // Catch:{ IOException -> 0x0039 }
            if (r5 == 0) goto L_0x003f
            r4 = 0
            java.io.OutputStream r3 = r5.A00()     // Catch:{ IOException -> 0x0039 }
            java.io.ByteArrayOutputStream r2 = new java.io.ByteArrayOutputStream     // Catch:{ all -> 0x0034 }
            r2.<init>()     // Catch:{ all -> 0x0034 }
            android.graphics.Bitmap$CompressFormat r1 = android.graphics.Bitmap.CompressFormat.PNG     // Catch:{ all -> 0x002f }
            r0 = 100
            r7.compress(r1, r0, r2)     // Catch:{ all -> 0x002f }
            byte[] r1 = r2.toByteArray()     // Catch:{ all -> 0x002f }
            int r0 = r1.length     // Catch:{ all -> 0x002f }
            r3.write(r1, r4, r0)     // Catch:{ all -> 0x002f }
            r5.A01()     // Catch:{ all -> 0x002f }
            r2.close()     // Catch:{ all -> 0x0034 }
            r3.close()     // Catch:{ IOException -> 0x0039 }
            return
        L_0x002f:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x0033 }
        L_0x0033:
            throw r0     // Catch:{ all -> 0x0034 }
        L_0x0034:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x0038 }
        L_0x0038:
            throw r0     // Catch:{ IOException -> 0x0039 }
        L_0x0039:
            r1 = move-exception
            java.lang.String r0 = "WebPImageLoader/saving bitmap to cache"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x003f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18840xL.A07(android.graphics.Bitmap, java.lang.String):void");
    }
}
