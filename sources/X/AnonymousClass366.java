package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.widget.ImageView;
import java.io.File;

/* renamed from: X.366  reason: invalid class name */
public class AnonymousClass366 extends C16690tT {
    public final Context A00;
    public final ImageView A01;
    public final File A02;

    public AnonymousClass366(Context context, ImageView imageView, File file) {
        this.A00 = context;
        this.A01 = imageView;
        this.A02 = file;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0022 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object A08(java.lang.Object[] r5) {
        /*
            r4 = this;
            android.content.Context r0 = r4.A00
            android.graphics.Point r1 = X.C16210se.A00(r0)
            java.io.File r0 = r4.A02     // Catch:{ IOException | OutOfMemoryError -> 0x0023 }
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch:{ IOException | OutOfMemoryError -> 0x0023 }
            r3.<init>(r0)     // Catch:{ IOException | OutOfMemoryError -> 0x0023 }
            r0 = 1
            X.25c r2 = X.C16210se.A01(r1, r0)     // Catch:{ all -> 0x001e }
            r1 = 0
            r0 = 0
            X.25d r0 = X.C37741pe.A04(r1, r2, r3, r0)     // Catch:{ all -> 0x001e }
            android.graphics.Bitmap r0 = r0.A02     // Catch:{ all -> 0x001e }
            r3.close()     // Catch:{ IOException | OutOfMemoryError -> 0x0023 }
            return r0
        L_0x001e:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x0022 }
        L_0x0022:
            throw r0     // Catch:{ IOException | OutOfMemoryError -> 0x0023 }
        L_0x0023:
            r1 = move-exception
            java.lang.String r0 = "LoadThumbnailWallpaperImageTask/error when loading wallpaper resource"
            com.whatsapp.util.Log.e(r0, r1)
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass366.A08(java.lang.Object[]):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ void A0A(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        if (bitmap == null) {
            return;
        }
        if (!C16690tT.A02(this)) {
            this.A01.setImageBitmap(bitmap);
        } else {
            bitmap.recycle();
        }
    }
}
