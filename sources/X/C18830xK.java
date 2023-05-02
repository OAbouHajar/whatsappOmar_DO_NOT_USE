package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import com.whatsapp.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;

/* renamed from: X.0xK  reason: invalid class name and case insensitive filesystem */
public class C18830xK {
    public final C221516v A00;

    public C18830xK(C221516v r1) {
        this.A00 = r1;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:38:0x0094 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:38:0x0094=Splitter:B:38:0x0094, B:32:0x008c=Splitter:B:32:0x008c} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Bitmap A00(X.C41891wp r11, int r12, boolean r13) {
        /*
            r8 = 0
            r2 = 0
            X.1wq r7 = new X.1wq     // Catch:{ RuntimeException -> 0x009c, IOException -> 0x0095 }
            r7.<init>()     // Catch:{ RuntimeException -> 0x009c, IOException -> 0x0095 }
            java.io.File r0 = r11.A00     // Catch:{ all -> 0x0090 }
            java.lang.String r0 = r0.getAbsolutePath()     // Catch:{ all -> 0x0090 }
            r7.setDataSource(r0)     // Catch:{ all -> 0x0090 }
            int r6 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0090 }
            r0 = 27
            r11 = r12
            if (r6 < r0) goto L_0x0020
            if (r12 <= 0) goto L_0x0020
            r10 = 0
            android.graphics.Bitmap r5 = r7.getScaledFrameAtTime(r8, r10, r11, r12)     // Catch:{ all -> 0x0090 }
            goto L_0x0021
        L_0x0020:
            r5 = r2
        L_0x0021:
            if (r5 != 0) goto L_0x0027
            android.graphics.Bitmap r5 = r7.getFrameAtTime(r8)     // Catch:{ all -> 0x0090 }
        L_0x0027:
            if (r5 != 0) goto L_0x002d
            android.graphics.Bitmap r5 = r7.getFrameAtTime()     // Catch:{ all -> 0x0090 }
        L_0x002d:
            r4 = 0
            if (r5 != 0) goto L_0x003d
            byte[] r3 = r7.getEmbeddedPicture()     // Catch:{ all -> 0x0090 }
            if (r3 == 0) goto L_0x003d
            int r1 = r3.length     // Catch:{ all -> 0x0090 }
            android.graphics.BitmapFactory$Options r0 = X.C17970vw.A02     // Catch:{ all -> 0x0090 }
            android.graphics.Bitmap r5 = android.graphics.BitmapFactory.decodeByteArray(r3, r4, r1, r0)     // Catch:{ all -> 0x0090 }
        L_0x003d:
            if (r5 == 0) goto L_0x004b
            if (r12 <= 0) goto L_0x004b
            android.graphics.Bitmap r0 = X.C17970vw.A07(r5, r2, r12, r12)     // Catch:{ all -> 0x0090 }
            if (r5 == r0) goto L_0x004b
            r5.recycle()     // Catch:{ all -> 0x0090 }
            r5 = r0
        L_0x004b:
            if (r5 == 0) goto L_0x0085
            r0 = 19
            if (r6 <= r0) goto L_0x005b
            if (r13 == 0) goto L_0x0085
            android.graphics.Bitmap$Config r1 = r5.getConfig()     // Catch:{ all -> 0x0090 }
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ all -> 0x0090 }
            if (r1 == r0) goto L_0x0085
        L_0x005b:
            java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream     // Catch:{ all -> 0x0090 }
            r3.<init>()     // Catch:{ all -> 0x0090 }
            android.graphics.Bitmap$CompressFormat r1 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ all -> 0x0090 }
            r0 = 80
            r5.compress(r1, r0, r3)     // Catch:{ all -> 0x0090 }
            r5.recycle()     // Catch:{ all -> 0x0090 }
            byte[] r3 = r3.toByteArray()     // Catch:{ all -> 0x0090 }
            android.graphics.BitmapFactory$Options r1 = new android.graphics.BitmapFactory$Options     // Catch:{ all -> 0x0090 }
            r1.<init>()     // Catch:{ all -> 0x0090 }
            r0 = 1
            r1.inDither = r0     // Catch:{ all -> 0x0090 }
            r1.inInputShareable = r0     // Catch:{ all -> 0x0090 }
            r1.inPurgeable = r0     // Catch:{ all -> 0x0090 }
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ all -> 0x0090 }
            r1.inPreferredConfig = r0     // Catch:{ all -> 0x0090 }
            int r1 = r3.length     // Catch:{ all -> 0x0090 }
            android.graphics.BitmapFactory$Options r0 = X.C17970vw.A02     // Catch:{ all -> 0x0090 }
            android.graphics.Bitmap r5 = android.graphics.BitmapFactory.decodeByteArray(r3, r4, r1, r0)     // Catch:{ all -> 0x0090 }
        L_0x0085:
            if (r5 != 0) goto L_0x008c
            java.lang.String r0 = "mediafileutils/createVideoThumbnail/no bitmap created"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x0090 }
        L_0x008c:
            r7.close()     // Catch:{ RuntimeException -> 0x009c, IOException -> 0x0095 }
            return r5
        L_0x0090:
            r0 = move-exception
            r7.close()     // Catch:{ all -> 0x0094 }
        L_0x0094:
            throw r0     // Catch:{ RuntimeException -> 0x009c, IOException -> 0x0095 }
        L_0x0095:
            r1 = move-exception
            java.lang.String r0 = "mediafileutils/createVideoThumbnail/unable to load video"
            com.whatsapp.util.Log.e(r0, r1)
            return r2
        L_0x009c:
            r1 = move-exception
            java.lang.String r0 = "mediafileutils/createVideoThumbnail/corrupt video file"
            com.whatsapp.util.Log.e(r0, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18830xK.A00(X.1wp, int, boolean):android.graphics.Bitmap");
    }

    public static Bitmap A01(File file) {
        boolean z2;
        String str;
        if (file == null) {
            Log.e("mediafileutils/createVideoThumbnail/file=null");
            return null;
        }
        try {
            C41911wr.A04(file);
            z2 = true;
        } catch (IOException unused) {
            z2 = false;
        }
        if (!z2) {
            return A00(new C41891wp(file), -1, false);
        }
        try {
            return C41911wr.A00(file);
        } catch (IOException | IllegalArgumentException e2) {
            e = e2;
            str = "mediafileutils/createGifThumbnail/gif file not read ";
            Log.e(str, e);
            return null;
        } catch (Exception e3) {
            e = e3;
            str = "mediafileutils/createGifThumbnail/unexpected gif exception ";
            Log.e(str, e);
            return null;
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x0024 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Bitmap A02(java.io.File r3, long r4) {
        /*
            r1 = 0
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x000b
            android.graphics.Bitmap r2 = A01(r3)
        L_0x000a:
            return r2
        L_0x000b:
            r2 = 0
            X.1wq r1 = new X.1wq     // Catch:{ Exception | NoSuchMethodError -> 0x000a }
            r1.<init>()     // Catch:{ Exception | NoSuchMethodError -> 0x000a }
            java.lang.String r0 = r3.getAbsolutePath()     // Catch:{ all -> 0x0020 }
            r1.setDataSource(r0)     // Catch:{ all -> 0x0020 }
            android.graphics.Bitmap r2 = r1.getFrameAtTime(r4)     // Catch:{ all -> 0x0020 }
            r1.close()     // Catch:{ Exception | NoSuchMethodError -> 0x000a }
            goto L_0x0025
        L_0x0020:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x0024 }
        L_0x0024:
            throw r0     // Catch:{ Exception | NoSuchMethodError -> 0x000a }
        L_0x0025:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18830xK.A02(java.io.File, long):android.graphics.Bitmap");
    }

    public static byte[] A03(Bitmap bitmap, int i2) {
        if (bitmap == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder("orig_thumbnail/width:");
        sb.append(bitmap.getWidth());
        sb.append("/height:");
        sb.append(bitmap.getHeight());
        sb.append("/maxDimension:");
        sb.append(i2);
        Log.i(sb.toString());
        if (bitmap.getWidth() > i2 || bitmap.getHeight() > i2) {
            float f2 = (float) i2;
            float max = Math.max(((float) bitmap.getWidth()) / f2, ((float) bitmap.getHeight()) / f2);
            Rect rect = new Rect(0, 0, (int) (((float) bitmap.getWidth()) / max), (int) (((float) bitmap.getHeight()) / max));
            rect.right = Math.max(rect.right, 1);
            rect.bottom = Math.max(rect.bottom, 1);
            Rect rect2 = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
            Bitmap.Config config = bitmap.getConfig();
            try {
                int width = rect.width();
                int height = rect.height();
                if (config == null) {
                    config = Bitmap.Config.ARGB_8888;
                }
                Bitmap createBitmap = Bitmap.createBitmap(width, height, config);
                Canvas canvas = new Canvas(createBitmap);
                Paint paint = new Paint();
                paint.setAntiAlias(true);
                paint.setFilterBitmap(true);
                paint.setDither(true);
                canvas.drawBitmap(bitmap, rect2, rect, paint);
                bitmap.recycle();
                StringBuilder sb2 = new StringBuilder("rescaled_thumbnail/width:");
                sb2.append(createBitmap.getWidth());
                sb2.append("/height:");
                sb2.append(createBitmap.getHeight());
                Log.i(sb2.toString());
                bitmap = createBitmap;
            } catch (OutOfMemoryError e2) {
                Log.e("video-thumbnail/scale/out-of-memory", e2);
                bitmap.recycle();
                throw e2;
            }
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, 80, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        bitmap.recycle();
        return byteArray;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0027 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public byte[] A04(android.net.Uri r12, int r13, int r14) {
        /*
            r11 = this;
            r4 = 0
            java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream     // Catch:{ 1pd -> 0x0038, IOException -> 0x0030, OutOfMemoryError -> 0x0028 }
            r3.<init>()     // Catch:{ 1pd -> 0x0038, IOException -> 0x0030, OutOfMemoryError -> 0x0028 }
            X.16v r5 = r11.A00     // Catch:{ all -> 0x0023 }
            r9 = 1
            r10 = 1
            r6 = r12
            r7 = r13
            r8 = r14
            android.graphics.Bitmap r2 = r5.A03(r6, r7, r8, r9, r10)     // Catch:{ all -> 0x0023 }
            android.graphics.Bitmap$CompressFormat r1 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ all -> 0x0023 }
            r0 = 80
            r2.compress(r1, r0, r3)     // Catch:{ all -> 0x0023 }
            byte[] r4 = r3.toByteArray()     // Catch:{ all -> 0x0023 }
            r2.recycle()     // Catch:{ all -> 0x0023 }
            r3.close()     // Catch:{ 1pd -> 0x0038, IOException -> 0x0030, OutOfMemoryError -> 0x0028 }
            return r4
        L_0x0023:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x0027 }
        L_0x0027:
            throw r0     // Catch:{ 1pd -> 0x0038, IOException -> 0x0030, OutOfMemoryError -> 0x0028 }
        L_0x0028:
            r1 = move-exception
            java.lang.String r0 = "thumbnailutils/getImageThumb/out of memory when generating the thumbnail"
            com.whatsapp.util.Log.e(r0, r1)
            return r4
        L_0x0030:
            r1 = move-exception
            java.lang.String r0 = "thumbnailutils/getImageThumb/unable to load image"
            com.whatsapp.util.Log.e(r0, r1)
            return r4
        L_0x0038:
            r1 = move-exception
            java.lang.String r0 = "thumbnailutils/getImageThumb/file is not an image"
            com.whatsapp.util.Log.e(r0, r1)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18830xK.A04(android.net.Uri, int, int):byte[]");
    }
}
