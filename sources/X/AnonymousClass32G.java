package X;

import android.content.ContentResolver;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Build;
import android.provider.MediaStore;
import com.whatsapp.util.Log;

/* renamed from: X.32G  reason: invalid class name */
public class AnonymousClass32G extends C102064yL {
    public static final String[] A01 = {"_id", "width", "height"};
    public final int A00;

    public AnonymousClass32G(ContentResolver contentResolver, Uri uri, String str, String str2, int i2, long j2, long j3, long j4) {
        super(contentResolver, uri, str, str2, j2, j3, j4);
        this.A00 = i2;
    }

    public int A00() {
        return this.A00;
    }

    public Bitmap Agi(int i2) {
        boolean z2;
        Bitmap bitmap;
        boolean z3 = false;
        int i3 = i2;
        if (i3 < 144) {
            try {
                z2 = false;
                bitmap = C89114bc.A00().A01(this.A03, (BitmapFactory.Options) null, 3, this.A02);
            } catch (Throwable th) {
                Log.e("miniThumbBitmap got exception", th);
                return null;
            }
        } else {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inDither = false;
            options.inPreferredConfig = Bitmap.Config.ARGB_8888;
            boolean z4 = false;
            if (Build.VERSION.SDK_INT <= 18) {
                z4 = true;
            }
            if (z4) {
                options.inInputShareable = true;
                options.inPurgeable = true;
                z2 = true;
            } else {
                z2 = false;
            }
            ContentResolver contentResolver = this.A03;
            long j2 = this.A02;
            Cursor queryMiniThumbnail = MediaStore.Images.Thumbnails.queryMiniThumbnail(contentResolver, j2, 1, A01);
            if (queryMiniThumbnail != null) {
                try {
                    if (queryMiniThumbnail.moveToFirst()) {
                        long j3 = (long) i3;
                        long j4 = j3 * j3 * 2;
                        options.inSampleSize = C37741pe.A01(new C446825c((BitmapFactory.Options) null, j4 == -1 ? null : Long.valueOf(j4), i3, i3, true), C13690nt.A02(queryMiniThumbnail, "width"), C13690nt.A02(queryMiniThumbnail, "height"));
                    }
                } catch (Throwable unused) {
                }
            }
            if (queryMiniThumbnail != null) {
                queryMiniThumbnail.close();
            }
            bitmap = C89114bc.A00().A01(contentResolver, options, 1, j2);
        }
        if (bitmap == null) {
            long j5 = (long) i3;
            bitmap = A01(i3, j5 * j5 * 2);
        }
        int i4 = this.A00;
        if (Build.VERSION.SDK_INT >= 29 || bitmap == null || i4 == 0) {
            z3 = z2;
        } else {
            bitmap = C61883Au.A00(bitmap, i4);
        }
        return (bitmap == null || z3 || !C29601at.A01()) ? bitmap : C17970vw.A05(bitmap);
        throw th;
    }

    public int getType() {
        return 0;
    }
}
