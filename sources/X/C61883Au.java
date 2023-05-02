package X;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.net.Uri;

/* renamed from: X.3Au  reason: invalid class name and case insensitive filesystem */
public class C61883Au {
    public static Bitmap A00(Bitmap bitmap, int i2) {
        Bitmap bitmap2 = bitmap;
        if (i2 != 0) {
            Matrix A0H = AnonymousClass000.A0H();
            A0H.setRotate((float) i2, ((float) bitmap2.getWidth()) / 2.0f, ((float) bitmap2.getHeight()) / 2.0f);
            try {
                Bitmap createBitmap = Bitmap.createBitmap(bitmap2, 0, 0, bitmap2.getWidth(), bitmap2.getHeight(), A0H, true);
                if (bitmap2 != createBitmap) {
                    bitmap2.recycle();
                    return createBitmap;
                }
            } catch (OutOfMemoryError unused) {
            }
        }
        return bitmap2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002a, code lost:
        if (r14 == -1) goto L_0x002c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Bitmap A01(android.os.ParcelFileDescriptor r13, int r14, long r15) {
        /*
            r11 = r14
            r8 = 0
            if (r13 == 0) goto L_0x0068
            android.graphics.BitmapFactory$Options r2 = new android.graphics.BitmapFactory$Options     // Catch:{ OutOfMemoryError -> 0x005c }
            r2.<init>()     // Catch:{ OutOfMemoryError -> 0x005c }
            java.io.FileDescriptor r1 = r13.getFileDescriptor()     // Catch:{ OutOfMemoryError -> 0x005c }
            r0 = 1
            r2.inJustDecodeBounds = r0     // Catch:{ OutOfMemoryError -> 0x005c }
            X.4bc r0 = X.C89114bc.A00()     // Catch:{ OutOfMemoryError -> 0x005c }
            r0.A02(r2, r1)     // Catch:{ OutOfMemoryError -> 0x005c }
            boolean r0 = r2.mCancel     // Catch:{ OutOfMemoryError -> 0x005c }
            if (r0 != 0) goto L_0x0068
            int r6 = r2.outWidth     // Catch:{ OutOfMemoryError -> 0x005c }
            r0 = -1
            if (r6 == r0) goto L_0x0068
            int r5 = r2.outHeight     // Catch:{ OutOfMemoryError -> 0x005c }
            if (r5 == r0) goto L_0x0068
            r10 = 2147483647(0x7fffffff, float:NaN)
            if (r14 == r0) goto L_0x002c
            r10 = r14
            if (r14 != r0) goto L_0x002f
        L_0x002c:
            r11 = 2147483647(0x7fffffff, float:NaN)
        L_0x002f:
            r3 = -1
            int r0 = (r15 > r3 ? 1 : (r15 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x0037
            r9 = 0
            goto L_0x003b
        L_0x0037:
            java.lang.Long r9 = java.lang.Long.valueOf(r15)     // Catch:{ OutOfMemoryError -> 0x005c }
        L_0x003b:
            r12 = 1
            X.25c r7 = new X.25c     // Catch:{ OutOfMemoryError -> 0x005c }
            r7.<init>(r8, r9, r10, r11, r12)     // Catch:{ OutOfMemoryError -> 0x005c }
            int r0 = X.C37741pe.A01(r7, r6, r5)     // Catch:{ OutOfMemoryError -> 0x005c }
            r2.inSampleSize = r0     // Catch:{ OutOfMemoryError -> 0x005c }
            r0 = 0
            r2.inJustDecodeBounds = r0     // Catch:{ OutOfMemoryError -> 0x005c }
            r2.inDither = r0     // Catch:{ OutOfMemoryError -> 0x005c }
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ OutOfMemoryError -> 0x005c }
            r2.inPreferredConfig = r0     // Catch:{ OutOfMemoryError -> 0x005c }
            X.4bc r0 = X.C89114bc.A00()     // Catch:{ OutOfMemoryError -> 0x005c }
            android.graphics.Bitmap r0 = r0.A02(r2, r1)     // Catch:{ OutOfMemoryError -> 0x005c }
            r13.close()     // Catch:{ all -> 0x005b }
        L_0x005b:
            return r0
        L_0x005c:
            r1 = move-exception
            java.lang.String r0 = "GalleryPickerUtil/Got oom exception "
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x0063 }
            goto L_0x0068
        L_0x0063:
            r0 = move-exception
            r13.close()     // Catch:{ all -> 0x0067 }
        L_0x0067:
            throw r0
        L_0x0068:
            if (r13 == 0) goto L_0x006d
            r13.close()     // Catch:{ all -> 0x006d }
        L_0x006d:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61883Au.A01(android.os.ParcelFileDescriptor, int, long):android.graphics.Bitmap");
    }

    public static String A02(AnonymousClass2BF r1) {
        Uri A9L = r1.A9L();
        StringBuilder A0o = AnonymousClass000.A0o();
        A0o.append(A9L);
        return AnonymousClass000.A0h("-gallery_thumb", A0o);
    }
}
