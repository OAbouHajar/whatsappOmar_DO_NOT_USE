package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.whatsapp.util.Log;

/* renamed from: X.25U  reason: invalid class name */
public class AnonymousClass25U {
    public static Bitmap A00(BitmapFactory.Options options, byte[] bArr, int i2) {
        boolean z2;
        BitmapFactory.Options options2 = new BitmapFactory.Options();
        options2.inJustDecodeBounds = true;
        try {
            BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options2);
            int i3 = options2.outWidth;
            z2 = (i3 <= i2 && options2.outHeight <= i2) || (i3 <= 300 && options2.outHeight <= 300);
        } catch (IllegalArgumentException unused) {
            Log.e("MessageThumbSafeDecoder/isValidThumbnailSize/failed to generate bitmap");
            z2 = false;
        }
        if (!z2) {
            return null;
        }
        try {
            return BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        } catch (IllegalArgumentException unused2) {
            Log.e("image-thumb/decodethumbnail/failed to generate bitmap");
            return null;
        }
    }
}
